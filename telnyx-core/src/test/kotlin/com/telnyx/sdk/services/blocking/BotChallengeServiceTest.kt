// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.botchallenge.BotChallengeCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BotChallengeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val botChallengeService = client.botChallenge()

        val botChallenge =
            botChallengeService.create(
                BotChallengeCreateParams.builder()
                    .llmModelName("claude-opus-4")
                    .llmParameterCount("175B")
                    .llmQuantization("int8")
                    .build()
            )

        botChallenge.validate()
    }
}
