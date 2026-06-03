// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechGenerateResponseTest {

    @Test
    fun create() {
        val textToSpeechGenerateResponse =
            TextToSpeechGenerateResponse.builder().base64Audio("base64_audio").build()

        assertThat(textToSpeechGenerateResponse.base64Audio()).contains("base64_audio")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val textToSpeechGenerateResponse =
            TextToSpeechGenerateResponse.builder().base64Audio("base64_audio").build()

        val roundtrippedTextToSpeechGenerateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(textToSpeechGenerateResponse),
                jacksonTypeRef<TextToSpeechGenerateResponse>(),
            )

        assertThat(roundtrippedTextToSpeechGenerateResponse).isEqualTo(textToSpeechGenerateResponse)
    }
}
