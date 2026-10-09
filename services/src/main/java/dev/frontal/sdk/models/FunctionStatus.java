package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Status values used by function and execution resources. */
public enum FunctionStatus {
    DRAFT("draft"),
    ACTIVE("active"),
    DEPRECATED("deprecated"),
    FAILED("failed");

    private final String wireValue;

    FunctionStatus(String wireValue) {
        this.wireValue = wireValue;
    }

    @JsonValue
    public String wireValue() {
        return wireValue;
    }

    @JsonCreator
    public static FunctionStatus fromWireValue(String value) {
        for (FunctionStatus status : values()) {
            if (status.wireValue.equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unsupported Functions status: " + value);
    }
}
