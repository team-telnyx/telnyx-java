// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.assistants.instructions.InstructionEnhanceParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstructionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun enhance() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instructionServiceAsync = client.ai().assistants().instructions()

        val responseFuture =
            instructionServiceAsync.enhance(
                InstructionEnhanceParams.builder()
                    .assistantId("assistant_id")
                    .enhancementPrompt("enhancement_prompt")
                    .instructions("instructions")
                    .build()
            )

        val response = responseFuture.get()
    }
}
