package com.telnyx.demo;

import com.telnyx.sdk.ApiException;
import java.util.List;
import java.util.Map;

public class RateLimitException extends ApiException {

  private String rateLimit = null;
  private int rateLimitRemaining = 0;
  private int rateLimitReset = 0;

  public RateLimitException(
      int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
    super(code, message, responseHeaders, responseBody);

    if (responseHeaders != null) {
      if (responseHeaders.containsKey("x-ratelimit-limit")) {
        responseHeaders.get("x-ratelimit-limit").stream().findFirst().ifPresent(h -> this.rateLimit = h);
      }

      if (responseHeaders.containsKey("x-ratelimit-remaining")) {
        responseHeaders.get("x-ratelimit-remaining").stream().findFirst()
            .ifPresent(h -> {
              try {
                this.rateLimitRemaining = Integer.parseInt(h);
              } catch (NumberFormatException e) {
                this.rateLimitRemaining = 0;
              }
            });
      }

      if (responseHeaders.containsKey("x-ratelimit-reset")) {
        responseHeaders.get("x-ratelimit-reset").stream().findFirst()
            .ifPresent(h -> {
              try {
                this.rateLimitReset = Integer.parseInt(h);
              } catch (NumberFormatException e) {
                this.rateLimitReset = 0;
              }
            });
      }
    }
  }

  public String getRateLimit() {
    return this.rateLimit;
  }

  public int getRateLimitRemaining() {
    return this.rateLimitRemaining;
  }

  public int getRateLimitReset() {
    return this.rateLimitReset;
  }
}