package dev.frontal.sdk;

import org.jspecify.annotations.Nullable;

/** Cursor metadata returned with a paginated API response. */
public record Pagination(
        String cursor, boolean hasMore, @Nullable Long total) {
    public Pagination {
        cursor = cursor == null ? "" : cursor;
    }

    public Pagination(String cursor, boolean hasMore) {
        this(cursor, hasMore, null);
    }
}
