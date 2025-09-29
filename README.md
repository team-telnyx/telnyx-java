# Telnyx Java API Library

[![Maven Central](https://img.shields.io/maven-central/v/com.telnyx.api/telnyx-java)](https://central.sonatype.com/artifact/com.telnyx.api/telnyx-java/0.0.1)
[![javadoc](https://javadoc.io/badge2/com.telnyx.api/telnyx-java/0.0.1/javadoc.svg)](https://javadoc.io/doc/com.telnyx.api/telnyx-java/0.0.1)

The Telnyx Java SDK provides convenient access to the Telnyx REST API from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.telnyx.api/telnyx-java/0.0.1).

## Installation

### Gradle

```kotlin
implementation("com.telnyx.api:telnyx-java:0.0.1")
```

### Maven

```xml
<dependency>
  <groupId>com.telnyx.api</groupId>
  <artifactId>telnyx-java</artifactId>
  <version>0.0.1</version>
</dependency>
```

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;
import com.telnyx.api.models.calls.CallDialParams;
import com.telnyx.api.models.calls.CallDialResponse;

// Configures using the `telnyx.apiKey` and `telnyx.baseUrl` system properties
// Or configures using the `TELNYX_API_KEY` and `TELNYX_BASE_URL` environment variables
TelnyxClient client = TelnyxOkHttpClient.fromEnv();

CallDialParams params = CallDialParams.builder()
    .connectionId("conn12345")
    .from("+15557654321")
    .to("+15551234567")
    .webhookUrl("https://your-webhook.url/events")
    .build();
CallDialResponse response = client.calls().dial(params);
```

## Client configuration

Configure the client using system properties or environment variables:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;

// Configures using the `telnyx.apiKey` and `telnyx.baseUrl` system properties
// Or configures using the `TELNYX_API_KEY` and `TELNYX_BASE_URL` environment variables
TelnyxClient client = TelnyxOkHttpClient.fromEnv();
```

Or manually:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;

TelnyxClient client = TelnyxOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Or using a combination of the two approaches:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;

TelnyxClient client = TelnyxOkHttpClient.builder()
    // Configures using the `telnyx.apiKey` and `telnyx.baseUrl` system properties
    // Or configures using the `TELNYX_API_KEY` and `TELNYX_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter    | System property  | Environment variable | Required | Default value                 |
| --------- | ---------------- | -------------------- | -------- | ----------------------------- |
| `apiKey`  | `telnyx.apiKey`  | `TELNYX_API_KEY`     | true     | -                             |
| `baseUrl` | `telnyx.baseUrl` | `TELNYX_BASE_URL`    | true     | `"https://api.telnyx.com/v2"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import com.telnyx.api.client.TelnyxClient;

TelnyxClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Telnyx API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.calls().dial(...)` should be called with an instance of `CallDialParams`, and it will return an instance of `CallDialResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;
import com.telnyx.api.models.calls.CallDialParams;
import com.telnyx.api.models.calls.CallDialResponse;
import java.util.concurrent.CompletableFuture;

// Configures using the `telnyx.apiKey` and `telnyx.baseUrl` system properties
// Or configures using the `TELNYX_API_KEY` and `TELNYX_BASE_URL` environment variables
TelnyxClient client = TelnyxOkHttpClient.fromEnv();

CallDialParams params = CallDialParams.builder()
    .connectionId("conn12345")
    .from("+15557654321")
    .to("+15551234567")
    .webhookUrl("https://your-webhook.url/events")
    .build();
CompletableFuture<CallDialResponse> response = client.async().calls().dial(params);
```

Or create an asynchronous client from the beginning:

```java
import com.telnyx.api.client.TelnyxClientAsync;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync;
import com.telnyx.api.models.calls.CallDialParams;
import com.telnyx.api.models.calls.CallDialResponse;
import java.util.concurrent.CompletableFuture;

// Configures using the `telnyx.apiKey` and `telnyx.baseUrl` system properties
// Or configures using the `TELNYX_API_KEY` and `TELNYX_BASE_URL` environment variables
TelnyxClientAsync client = TelnyxOkHttpClientAsync.fromEnv();

CallDialParams params = CallDialParams.builder()
    .connectionId("conn12345")
    .from("+15557654321")
    .to("+15551234567")
    .webhookUrl("https://your-webhook.url/events")
    .build();
CompletableFuture<CallDialResponse> response = client.calls().dial(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## File uploads

The SDK defines methods that accept files.

To upload a file, pass a [`Path`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html):

```java
import com.telnyx.api.models.ai.audio.AudioTranscribeParams;
import com.telnyx.api.models.ai.audio.AudioTranscribeResponse;
import java.nio.file.Paths;

AudioTranscribeParams params = AudioTranscribeParams.builder()
    .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
    .file(Paths.get("/path/to/file"))
    .build();
AudioTranscribeResponse response = client.ai().audio().transcribe(params);
```

Or an arbitrary [`InputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html):

```java
import com.telnyx.api.models.ai.audio.AudioTranscribeParams;
import com.telnyx.api.models.ai.audio.AudioTranscribeResponse;
import java.net.URL;

AudioTranscribeParams params = AudioTranscribeParams.builder()
    .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
    .file(new URL("https://example.com//path/to/file").openStream())
    .build();
AudioTranscribeResponse response = client.ai().audio().transcribe(params);
```

Or a `byte[]` array:

```java
import com.telnyx.api.models.ai.audio.AudioTranscribeParams;
import com.telnyx.api.models.ai.audio.AudioTranscribeResponse;

AudioTranscribeParams params = AudioTranscribeParams.builder()
    .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
    .file("content".getBytes())
    .build();
AudioTranscribeResponse response = client.ai().audio().transcribe(params);
```

Note that when passing a non-`Path` its filename is unknown so it will not be included in the request. To manually set a filename, pass a [`MultipartField`](telnyx-java-core/src/main/kotlin/com/telnyx/api/core/Values.kt):

```java
import com.telnyx.api.core.MultipartField;
import com.telnyx.api.models.ai.audio.AudioTranscribeParams;
import com.telnyx.api.models.ai.audio.AudioTranscribeResponse;
import java.io.InputStream;
import java.net.URL;

AudioTranscribeParams params = AudioTranscribeParams.builder()
    .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
    .file(MultipartField.<InputStream>builder()
        .value(new URL("https://example.com//path/to/file").openStream())
        .filename("/path/to/file")
        .build())
    .build();
AudioTranscribeResponse response = client.ai().audio().transcribe(params);
```

## Binary responses

The SDK defines methods that return binary responses, which are used for API responses that shouldn't necessarily be parsed, like non-JSON data.

These methods return [`HttpResponse`](telnyx-java-core/src/main/kotlin/com/telnyx/api/core/http/HttpResponse.kt):

```java
import com.telnyx.api.core.http.HttpResponse;
import com.telnyx.api.models.documents.DocumentDownloadParams;

HttpResponse response = client.documents().download("6a09cdc3-8948-47f0-aa62-74ac943d6c58");
```

To save the response content to a file, use the [`Files.copy(...)`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#copy-java.io.InputStream-java.nio.file.Path-java.nio.file.CopyOption...-) method:

```java
import com.telnyx.api.core.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

try (HttpResponse response = client.documents().download(params)) {
    Files.copy(
        response.body(),
        Paths.get(path),
        StandardCopyOption.REPLACE_EXISTING
    );
} catch (Exception e) {
    System.out.println("Something went wrong!");
    throw new RuntimeException(e);
}
```

Or transfer the response content to any [`OutputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html):

```java
import com.telnyx.api.core.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

try (HttpResponse response = client.documents().download(params)) {
    response.body().transferTo(Files.newOutputStream(Paths.get(path)));
} catch (Exception e) {
    System.out.println("Something went wrong!");
    throw new RuntimeException(e);
}
```

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.telnyx.api.core.http.Headers;
import com.telnyx.api.core.http.HttpResponseFor;
import com.telnyx.api.models.numberorders.NumberOrderCreateParams;
import com.telnyx.api.models.numberorders.NumberOrderCreateResponse;

NumberOrderCreateParams params = NumberOrderCreateParams.builder()
    .addPhoneNumber(NumberOrderCreateParams.PhoneNumber.builder()
        .phoneNumber("+15558675309")
        .build())
    .build();
HttpResponseFor<NumberOrderCreateResponse> numberOrder = client.numberOrders().withRawResponse().create(params);

int statusCode = numberOrder.statusCode();
Headers headers = numberOrder.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.telnyx.api.models.numberorders.NumberOrderCreateResponse;

NumberOrderCreateResponse parsedNumberOrder = numberOrder.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`TelnyxServiceException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/TelnyxServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                  |
  | ------ | -------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/UnexpectedStatusCodeException.kt) |

- [`TelnyxIoException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/TelnyxIoException.kt): I/O networking errors.

- [`TelnyxRetryableException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/TelnyxRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`TelnyxInvalidDataException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/TelnyxInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`TelnyxException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/TelnyxException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `TELNYX_LOG` environment variable to `info`:

```sh
$ export TELNYX_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export TELNYX_LOG=debug
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `telnyx-java-core` is published with a [configuration file](telnyx-java-core/src/main/resources/META-INF/proguard/telnyx-java-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`TelnyxOkHttpClient`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/TelnyxOkHttpClient.kt) or [`TelnyxOkHttpClientAsync`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/TelnyxOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;

TelnyxClient client = TelnyxOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.telnyx.api.models.calls.CallDialResponse;

CallDialResponse response = client.calls().dial(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;
import java.time.Duration;

TelnyxClient client = TelnyxOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

TelnyxClient client = TelnyxOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;

TelnyxClient client = TelnyxOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `telnyx-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`TelnyxClient`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClient.kt), [`TelnyxClientAsync`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientAsync.kt), [`TelnyxClientImpl`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientImpl.kt), and [`TelnyxClientAsyncImpl`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientAsyncImpl.kt), all of which can work with any HTTP client
- `telnyx-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`TelnyxOkHttpClient`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/TelnyxOkHttpClient.kt) and [`TelnyxOkHttpClientAsync`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/TelnyxOkHttpClientAsync.kt), which provide a way to construct [`TelnyxClientImpl`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientImpl.kt) and [`TelnyxClientAsyncImpl`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientAsyncImpl.kt), respectively, using OkHttp
- `telnyx-java`
  - Depends on and exposes the APIs of both `telnyx-java-core` and `telnyx-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`telnyx-java` dependency](#installation) with `telnyx-java-core`
2. Copy `telnyx-java-client-okhttp`'s [`OkHttpClient`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`TelnyxClientImpl`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientImpl.kt) or [`TelnyxClientAsyncImpl`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientAsyncImpl.kt), similarly to [`TelnyxOkHttpClient`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/TelnyxOkHttpClient.kt) or [`TelnyxOkHttpClientAsync`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/TelnyxOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`telnyx-java` dependency](#installation) with `telnyx-java-core`
2. Write a class that implements the [`HttpClient`](telnyx-java-core/src/main/kotlin/com/telnyx/api/core/http/HttpClient.kt) interface
3. Construct [`TelnyxClientImpl`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientImpl.kt) or [`TelnyxClientAsyncImpl`](telnyx-java-core/src/main/kotlin/com/telnyx/api/client/TelnyxClientAsyncImpl.kt), similarly to [`TelnyxOkHttpClient`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/TelnyxOkHttpClient.kt) or [`TelnyxOkHttpClientAsync`](telnyx-java-client-okhttp/src/main/kotlin/com/telnyx/api/client/okhttp/TelnyxOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.telnyx.api.core.JsonValue;
import com.telnyx.api.models.calls.CallDialParams;

CallDialParams params = CallDialParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import com.telnyx.api.core.JsonValue;
import com.telnyx.api.models.calls.CallDialParams;

CallDialParams params = CallDialParams.builder()
    .answeringMachineDetectionConfig(CallDialParams.AnsweringMachineDetectionConfig.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](telnyx-java-core/src/main/kotlin/com/telnyx/api/core/Values.kt) object to its setter:

```java
import com.telnyx.api.core.JsonValue;
import com.telnyx.api.models.calls.CallDialParams;

CallDialParams params = CallDialParams.builder()
    .connectionId(JsonValue.from(42))
    .from("+15557654321")
    .to("+15551234567")
    .webhookUrl("https://your-webhook.url/events")
    .build();
```

The most straightforward way to create a [`JsonValue`](telnyx-java-core/src/main/kotlin/com/telnyx/api/core/Values.kt) is using its `from(...)` method:

```java
import com.telnyx.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](telnyx-java-core/src/main/kotlin/com/telnyx/api/core/Values.kt):

```java
import com.telnyx.api.core.JsonMissing;
import com.telnyx.api.models.calls.CallDialParams;

CallDialParams params = CallDialParams.builder()
    .from("+18005550101")
    .to("+18005550100 or sip:username@sip.telnyx.com")
    .connectionId(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.telnyx.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.calls().dial(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.telnyx.api.core.JsonField;
import java.util.Optional;

JsonField<String> connectionId = client.calls().dial(params)._connectionId();

if (connectionId.isMissing()) {
  // The property is absent from the JSON response
} else if (connectionId.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = connectionId.asString();

  // Try to deserialize into a custom type
  MyClass myObject = connectionId.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`TelnyxInvalidDataException`](telnyx-java-core/src/main/kotlin/com/telnyx/api/errors/TelnyxInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.telnyx.api.models.calls.CallDialResponse;

CallDialResponse response = client.calls().dial(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.telnyx.api.models.calls.CallDialResponse;

CallDialResponse response = client.calls().dial(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.telnyx.api.client.TelnyxClient;
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient;

TelnyxClient client = TelnyxOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/stainless-sdks/telnyx-java/issues) with questions, bugs, or suggestions.
