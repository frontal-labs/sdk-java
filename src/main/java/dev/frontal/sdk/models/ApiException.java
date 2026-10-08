package dev.frontal.sdk;

import java.io.IOException;

/** An HTTP error response returned by the Frontal API. */
public final class ApiException extends IOException {
  private final int statusCode;
  private final String code;
  private final String requestId;
  private final String responseBody;

  public ApiException(int statusCode, String code, String message, String requestId, String responseBody) {
    super(message == null || message.isBlank() ? "Frontal API returned HTTP " + statusCode : message);
    this.statusCode = statusCode;
    this.code = code;
    this.requestId = requestId;
    this.responseBody = responseBody;
  }

  public int statusCode() {
    return statusCode;
  }

  public String code() {
    return code;
  }

  public String requestId() {
    return requestId;
  }

  public String responseBody() {
    return responseBody;
  }
}
