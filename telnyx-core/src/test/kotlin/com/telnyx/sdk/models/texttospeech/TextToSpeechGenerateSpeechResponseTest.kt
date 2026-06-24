// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechGenerateSpeechResponseTest {

    @Test
    fun create() {
        val textToSpeechGenerateSpeechResponse =
            TextToSpeechGenerateSpeechResponse.builder().base64Audio("base64_audio").build()

        assertThat(textToSpeechGenerateSpeechResponse.base64Audio()).contains("base64_audio")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val textToSpeechGenerateSpeechResponse =
            TextToSpeechGenerateSpeechResponse.builder().base64Audio("base64_audio").build()

        val roundtrippedTextToSpeechGenerateSpeechResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(textToSpeechGenerateSpeechResponse),
                jacksonTypeRef<TextToSpeechGenerateSpeechResponse>(),
            )

        assertThat(roundtrippedTextToSpeechGenerateSpeechResponse)
            .isEqualTo(textToSpeechGenerateSpeechResponse)
    }
}
