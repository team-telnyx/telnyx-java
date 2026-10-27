// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.browsersessions.BrowserSessionCreateParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionListParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveArtifactParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrowserSessionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val browserSessionServiceAsync = client.browserSessions()

        val browserSessionFuture =
            browserSessionServiceAsync.create(
                BrowserSessionCreateParams.builder()
                    .policy(
                        BrowserSessionCreateParams.Policy.builder()
                            .addAllowedDomain("example.com")
                            .build()
                    )
                    .idempotencyKey("x")
                    .limits(
                        BrowserSessionCreateParams.Limits.builder()
                            .idleTimeoutS(30L)
                            .lifetimeS(60L)
                            .build()
                    )
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val browserSession = browserSessionFuture.get()
        browserSession.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val browserSessionServiceAsync = client.browserSessions()

        val browserSessionFuture = browserSessionServiceAsync.retrieve("id")

        val browserSession = browserSessionFuture.get()
        browserSession.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val browserSessionServiceAsync = client.browserSessions()

        val browserSessionsFuture =
            browserSessionServiceAsync.list(
                BrowserSessionListParams.builder()
                    .status(BrowserSessionListParams.Status.PROVISIONING)
                    .build()
            )

        val browserSessions = browserSessionsFuture.get()
        browserSessions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val browserSessionServiceAsync = client.browserSessions()

        val browserSessionFuture = browserSessionServiceAsync.delete("id")

        val browserSession = browserSessionFuture.get()
        browserSession.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveArtifact() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val browserSessionServiceAsync = client.browserSessions()

        val responseFuture =
            browserSessionServiceAsync.retrieveArtifact(
                BrowserSessionRetrieveArtifactParams.builder()
                    .id("id")
                    .artifactId("artifactId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
