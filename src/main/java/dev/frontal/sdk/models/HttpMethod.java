package dev.frontal.sdk;

/** Supported API operation kinds, including non-JSON transport operations. */
public enum HttpMethod {
  GET("GET"),
  POST("POST"),
  PUT("PUT"),
  PATCH("PATCH"),
  DELETE("DELETE"),
  HEAD("HEAD"),
  OPTIONS("OPTIONS"),
  STREAM("GET"),
  GETRAW("GET"),
  POSTRAW("POST"),
  POSTFORMDATA("POST");

  private final String wireMethod;

  HttpMethod(String wireMethod) {
    this.wireMethod = wireMethod;
  }

  public String wireMethod() {
    return wireMethod;
  }
}
