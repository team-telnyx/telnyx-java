// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.botchallenge.BotChallengeCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BotChallengeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val botChallengeServiceAsync = client.botChallenge()

        val botChallengeFuture =
            botChallengeServiceAsync.create(
                BotChallengeCreateParams.builder()
                    .llmModelName("claude-opus-4")
                    .llmParameterCount("175B")
                    .llmQuantization("int8")
                    .build()
            )

        val botChallenge = botChallengeFuture.get()
        botChallenge.validate()
    }
}
