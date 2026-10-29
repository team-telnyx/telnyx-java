// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.browsersessions.BrowserSessionCreateParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionListParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveArtifactParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrowserSessionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val browserSessionService = client.browserSessions()

        val browserSession =
            browserSessionService.create(
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
                    .metadata(
                        BrowserSessionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        browserSession.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val browserSessionService = client.browserSessions()

        val browserSession = browserSessionService.retrieve("id")

        browserSession.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val browserSessionService = client.browserSessions()

        val browserSessions =
            browserSessionService.list(
                BrowserSessionListParams.builder()
                    .status(BrowserSessionListParams.Status.PROVISIONING)
                    .build()
            )

        browserSessions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val browserSessionService = client.browserSessions()

        val browserSession = browserSessionService.delete("id")

        browserSession.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveArtifact() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val browserSessionService = client.browserSessions()

        val response =
            browserSessionService.retrieveArtifact(
                BrowserSessionRetrieveArtifactParams.builder()
                    .id("id")
                    .artifactId("artifactId")
                    .build()
            )

        response.validate()
    }
}
