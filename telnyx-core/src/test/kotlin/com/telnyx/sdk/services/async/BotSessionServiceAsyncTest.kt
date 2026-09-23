// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.botsessions.BotSessionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BotSessionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val botSessionServiceAsync = client.botSessions()

        val botSessionsFuture =
            botSessionServiceAsync.list(
                BotSessionListParams.builder()
                    .email("agent-owner@example.com")
                    .portalRedirectToken("01890a7e-e2f7-7c3d-8dbb-9a2c5f3d1e0b")
                    .build()
            )

        val botSessions = botSessionsFuture.get()
        botSessions.validate()
    }
}
