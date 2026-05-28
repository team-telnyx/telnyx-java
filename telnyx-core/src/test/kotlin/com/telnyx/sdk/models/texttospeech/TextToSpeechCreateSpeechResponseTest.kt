// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechCreateSpeechResponseTest {

    @Test
    fun create() {
        val textToSpeechCreateSpeechResponse =
            TextToSpeechCreateSpeechResponse.builder().base64Audio("base64_audio").build()

        assertThat(textToSpeechCreateSpeechResponse.base64Audio()).contains("base64_audio")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val textToSpeechCreateSpeechResponse =
            TextToSpeechCreateSpeechResponse.builder().base64Audio("base64_audio").build()

        val roundtrippedTextToSpeechCreateSpeechResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(textToSpeechCreateSpeechResponse),
                jacksonTypeRef<TextToSpeechCreateSpeechResponse>(),
            )

        assertThat(roundtrippedTextToSpeechCreateSpeechResponse)
            .isEqualTo(textToSpeechCreateSpeechResponse)
    }
}
