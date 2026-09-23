// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.botsessions.BotSessionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BotSessionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val botSessionService = client.botSessions()

        val botSessions =
            botSessionService.list(
                BotSessionListParams.builder()
                    .email("agent-owner@example.com")
                    .portalRedirectToken("01890a7e-e2f7-7c3d-8dbb-9a2c5f3d1e0b")
                    .build()
            )

        botSessions.validate()
    }
}
