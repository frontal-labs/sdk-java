package dev.frontal.sdk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Runtime supported by the Frontal Functions API. */
public enum FunctionRuntime {
    NODEJS20("nodejs20"),
    NODEJS22("nodejs22"),
    PYTHON311("python311");

    private final String wireValue;

    FunctionRuntime(String wireValue) {
        this.wireValue = wireValue;
    }

    @JsonValue
    public String wireValue() {
        return wireValue;
    }

    @JsonCreator
    public static FunctionRuntime fromWireValue(String value) {
        for (FunctionRuntime runtime : values()) {
            if (runtime.wireValue.equals(value)) {
                return runtime;
            }
        }
        throw new IllegalArgumentException("Unsupported Functions runtime: " + value);
    }
}
