// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlInitiateAiCallResponseTest {

    @Test
    fun create() {
        val texmlInitiateAiCallResponse =
            TexmlInitiateAiCallResponse.builder()
                .callSid("v3:example-call-sid")
                .from("+13120001234")
                .status("queued")
                .to("+13121230000")
                .build()

        assertThat(texmlInitiateAiCallResponse.callSid()).contains("v3:example-call-sid")
        assertThat(texmlInitiateAiCallResponse.from()).contains("+13120001234")
        assertThat(texmlInitiateAiCallResponse.status()).contains("queued")
        assertThat(texmlInitiateAiCallResponse.to()).contains("+13121230000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlInitiateAiCallResponse =
            TexmlInitiateAiCallResponse.builder()
                .callSid("v3:example-call-sid")
                .from("+13120001234")
                .status("queued")
                .to("+13121230000")
                .build()

        val roundtrippedTexmlInitiateAiCallResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlInitiateAiCallResponse),
                jacksonTypeRef<TexmlInitiateAiCallResponse>(),
            )

        assertThat(roundtrippedTexmlInitiateAiCallResponse).isEqualTo(texmlInitiateAiCallResponse)
    }
}
