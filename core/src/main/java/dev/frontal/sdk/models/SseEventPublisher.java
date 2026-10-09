package dev.frontal.sdk;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Flow;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

/** Reactive, backpressure-aware publisher of SSE {@code data:} event payloads. */
public final class SseEventPublisher implements Flow.Publisher<String> {
    private final Supplier<StreamSource> sourceFactory;

    public SseEventPublisher(Callable<SseEventIterator> source) {
        Objects.requireNonNull(source, "source");
        this.sourceFactory = () -> new StreamSource() {
            private @Nullable SseEventIterator iterator;

            @Override
            public SseEventIterator open() throws Exception {
                SseEventIterator opened = source.call();
                iterator = opened;
                return opened;
            }

            @Override
            public void cancel() {
                closeQuietly(iterator);
            }
        };
    }

    private SseEventPublisher(Supplier<StreamSource> sourceFactory) {
        this.sourceFactory = Objects.requireNonNull(sourceFactory, "sourceFactory");
    }

    static SseEventPublisher cancellable(Supplier<StreamSource> sourceFactory) {
        return new SseEventPublisher(sourceFactory);
    }

    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
        Objects.requireNonNull(subscriber, "subscriber");
        Subscription subscription = new Subscription(subscriber);
        subscriber.onSubscribe(subscription);
    }

    private final class Subscription implements Flow.Subscription {
        private final Flow.Subscriber<? super String> subscriber;
        private final AtomicBoolean started = new AtomicBoolean();
        private long demand;
        private boolean cancelled;
        private @Nullable StreamSource source;
        private @Nullable SseEventIterator iterator;

        private Subscription(Flow.Subscriber<? super String> subscriber) {
            this.subscriber = subscriber;
        }

        @Override
        public void request(long count) {
            if (count <= 0) {
                cancel();
                subscriber.onError(new IllegalArgumentException("Flow demand must be positive"));
                return;
            }
            synchronized (this) {
                if (cancelled) {
                    return;
                }
                demand = demand > Long.MAX_VALUE - count ? Long.MAX_VALUE : demand + count;
                notifyAll();
            }
            if (started.compareAndSet(false, true)) {
                ForkJoinPool.commonPool().execute(this::run);
            }
        }

        @Override
        public void cancel() {
            @Nullable StreamSource sourceToCancel;
            @Nullable SseEventIterator toClose;
            synchronized (this) {
                cancelled = true;
                sourceToCancel = source;
                toClose = iterator;
                notifyAll();
            }
            if (sourceToCancel != null) {
                sourceToCancel.cancel();
            }
            closeQuietly(toClose);
        }

        private void run() {
            @Nullable StreamSource activeSource = null;
            try {
                synchronized (this) {
                    if (cancelled) {
                        return;
                    }
                }
                activeSource = sourceFactory.get();
                synchronized (this) {
                    if (cancelled) {
                        activeSource.cancel();
                        return;
                    }
                    source = activeSource;
                }
                SseEventIterator activeIterator = activeSource.open();
                synchronized (this) {
                    if (cancelled) {
                        closeQuietly(activeIterator);
                        activeSource.cancel();
                        return;
                    }
                    iterator = activeIterator;
                }
                while (true) {
                    if (isCancelled()) {
                        return;
                    }
                    if (!awaitDemand()) {
                        return;
                    }
                    if (!activeIterator.hasNext()) {
                        complete();
                        return;
                    }
                    String event = activeIterator.next();
                    synchronized (this) {
                        if (cancelled) {
                            return;
                        }
                        if (demand != Long.MAX_VALUE) {
                            demand--;
                        }
                    }
                    subscriber.onNext(event);
                    if (isCancelled()) {
                        return;
                    }
                    if (activeIterator.isExhausted()) {
                        complete();
                        return;
                    }
                    // Look ahead once so a finite stream can complete when demand ends on its last event.
                    if (!activeIterator.hasNext()) {
                        complete();
                        return;
                    }
                }
            } catch (Throwable exception) {
                signalError(exception);
            } finally {
                closeQuietly(iterator);
                if (activeSource != null) {
                    activeSource.cancel();
                }
            }
        }

        private boolean awaitDemand() throws InterruptedException {
            synchronized (this) {
                while (demand == 0 && !cancelled) {
                    wait();
                }
                return !cancelled;
            }
        }

        private boolean isCancelled() {
            synchronized (this) {
                return cancelled;
            }
        }

        private void complete() {
            synchronized (this) {
                if (cancelled) {
                    return;
                }
                cancelled = true;
            }
            subscriber.onComplete();
        }

        private void signalError(Throwable exception) {
            synchronized (this) {
                if (cancelled) {
                    return;
                }
                cancelled = true;
            }
            subscriber.onError(exception);
        }
    }

    interface StreamSource {
        SseEventIterator open() throws Exception;

        void cancel();
    }

    private static void closeQuietly(@Nullable SseEventIterator value) {
        if (value != null) {
            try {
                value.close();
            } catch (Exception ignored) {
                // Cancellation should not mask a terminal signal.
            }
        }
    }
}
