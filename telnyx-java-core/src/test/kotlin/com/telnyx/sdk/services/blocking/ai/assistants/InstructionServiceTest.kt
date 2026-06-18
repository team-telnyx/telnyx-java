// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.assistants.instructions.InstructionEnhanceParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstructionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun enhance() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val instructionService = client.ai().assistants().instructions()

        instructionService.enhance(
            InstructionEnhanceParams.builder()
                .assistantId("assistant_id")
                .enhancementPrompt("enhancement_prompt")
                .instructions("instructions")
                .build()
        )
    }
}
