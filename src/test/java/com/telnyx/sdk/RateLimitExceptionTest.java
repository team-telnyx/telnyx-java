package com.telnyx.sdk;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RateLimitExceptionTest {

  @Test
  public void testRateLimitExceptionParsesHeaders() {
    // Arrange
    Map<String, List<String>> headers = new HashMap<>();

    List<String> limitValues = new ArrayList<>();
    limitValues.add("5, 5;w=1");
    headers.put("x-ratelimit-limit", limitValues);

    List<String> remainingValues = new ArrayList<>();
    remainingValues.add("0");
    headers.put("x-ratelimit-remaining", remainingValues);

    List<String> resetValues = new ArrayList<>();
    resetValues.add("30");
    headers.put("x-ratelimit-reset", resetValues);

    // Act
    RateLimitException exception = new RateLimitException(
        429, "Too Many Requests", headers, "Rate limit exceeded");

    // Assert
    assertEquals("5, 5;w=1", exception.getRateLimit());
    assertEquals(0, exception.getRateLimitRemaining());
    assertEquals(30, exception.getRateLimitReset());
  }

  @Test
  public void testRateLimitExceptionHandlesNullHeaders() {
    // Act
    RateLimitException exception = new RateLimitException(
        429, "Too Many Requests", null, "Rate limit exceeded");

    // Assert
    assertNull(exception.getRateLimit());
    assertEquals(0, exception.getRateLimitRemaining());
    assertEquals(0, exception.getRateLimitReset());
  }

  @Test
  public void testRateLimitExceptionHandlesInvalidHeaderValues() {
    // Arrange
    Map<String, List<String>> headers = new HashMap<>();

    List<String> remainingValues = new ArrayList<>();
    remainingValues.add("not-a-number");
    headers.put("x-ratelimit-remaining", remainingValues);

    List<String> resetValues = new ArrayList<>();
    resetValues.add("invalid");
    headers.put("x-ratelimit-reset", resetValues);

    // Act
    RateLimitException exception = new RateLimitException(
        429, "Too Many Requests", headers, "Rate limit exceeded");

    // Assert
    assertEquals(0, exception.getRateLimitRemaining());
    assertEquals(0, exception.getRateLimitReset());
  }
}