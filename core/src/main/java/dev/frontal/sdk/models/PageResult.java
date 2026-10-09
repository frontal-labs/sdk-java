package dev.frontal.sdk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.jspecify.annotations.Nullable;

/** A page of data with a lazy cursor-based next-page loader. */
public final class PageResult<T> implements Iterable<T> {
    private final List<T> data;
    private final Pagination pagination;
    private final @Nullable PageLoader<T> nextPageLoader;

    public PageResult(List<T> data, Pagination pagination, @Nullable PageLoader<T> nextPageLoader) {
        this.data = List.copyOf(Objects.requireNonNull(data, "data"));
        this.pagination = Objects.requireNonNull(pagination, "pagination");
        this.nextPageLoader = nextPageLoader;
    }

    public List<T> data() {
        return data;
    }

    public Pagination pagination() {
        return pagination;
    }

    public @Nullable PageResult<T> nextPage() throws IOException, InterruptedException {
        if (!pagination.hasMore() || nextPageLoader == null) {
            return null;
        }
        PageResult<T> next = nextPageLoader.load(pagination.cursor());
        if (next != null && next.pagination.hasMore() && pagination.cursor().equals(next.pagination.cursor())) {
            throw new IOException("Pagination cursor did not advance: " + pagination.cursor());
        }
        return next;
    }

    public List<T> all() throws IOException, InterruptedException {
        List<T> items = new ArrayList<>(data);
        PageResult<T> page = this;
        Set<String> requestedCursors = new HashSet<>();
        while (page.pagination.hasMore()) {
            if (!requestedCursors.add(page.pagination.cursor())) {
                throw new IOException("Pagination cursor repeated: " + page.pagination.cursor());
            }
            page = page.nextPage();
            if (page == null) {
                break;
            }
            items.addAll(page.data);
        }
        return List.copyOf(items);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private @Nullable PageResult<T> current = PageResult.this;
            private int offset;
            private final Set<String> requestedCursors = new HashSet<>();

            @Override
            public boolean hasNext() {
                while (current != null && offset >= current.data.size()) {
                    if (!current.pagination.hasMore()) {
                        current = null;
                        return false;
                    }
                    if (!requestedCursors.add(current.pagination.cursor())) {
                        throw new IllegalStateException("Pagination cursor repeated: " + current.pagination.cursor());
                    }
                    try {
                        current = current.nextPage();
                    } catch (IOException exception) {
                        throw new java.io.UncheckedIOException(exception);
                    } catch (InterruptedException exception) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException("Interrupted while loading the next page", exception);
                    }
                    offset = 0;
                }
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return Objects.requireNonNull(current).data.get(offset++);
            }
        };
    }

    @FunctionalInterface
    public interface PageLoader<T> {
        PageResult<T> load(String cursor) throws IOException, InterruptedException;
    }
}
