package dev.frontal.sdk;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;

/** Blocking polling helper for long-running agents, runs, and workflows. */
public final class Poller {
    private Poller() {}

    public static <T> T pollUntil(
            PollOperation<T> operation, Predicate<T> finished, Duration interval, Duration timeout)
            throws IOException, InterruptedException, TimeoutException {
        Objects.requireNonNull(operation, "operation");
        Objects.requireNonNull(finished, "finished");
        requirePositive(interval, "interval");
        requirePositive(timeout, "timeout");
        long deadline = System.nanoTime() + timeout.toNanos();
        while (true) {
            T result = operation.poll();
            if (finished.test(result)) {
                return result;
            }
            long remaining = deadline - System.nanoTime();
            if (remaining <= 0) {
                throw new TimeoutException("Polling timed out after " + timeout);
            }
            long sleepNanos = Math.min(interval.toNanos(), remaining);
            long millis = sleepNanos / 1_000_000L;
            int nanos = (int) (sleepNanos % 1_000_000L);
            Thread.sleep(millis, nanos);
        }
    }

    @FunctionalInterface
    public interface PollOperation<T> {
        T poll() throws IOException, InterruptedException;
    }

    private static void requirePositive(Duration duration, String name) {
        Objects.requireNonNull(duration, name);
        if (duration.isZero() || duration.isNegative()) {
            throw new IllegalArgumentException(name + " must be positive");
        }
    }
}
