// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechListVoicesResponseTest {

    @Test
    fun create() {
        val textToSpeechListVoicesResponse =
            TextToSpeechListVoicesResponse.builder()
                .addVoice(
                    TextToSpeechListVoicesResponse.Voice.builder()
                        .gender("gender")
                        .language("language")
                        .name("name")
                        .provider("provider")
                        .voiceId("voice_id")
                        .build()
                )
                .build()

        assertThat(textToSpeechListVoicesResponse.voices().getOrNull())
            .containsExactly(
                TextToSpeechListVoicesResponse.Voice.builder()
                    .gender("gender")
                    .language("language")
                    .name("name")
                    .provider("provider")
                    .voiceId("voice_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val textToSpeechListVoicesResponse =
            TextToSpeechListVoicesResponse.builder()
                .addVoice(
                    TextToSpeechListVoicesResponse.Voice.builder()
                        .gender("gender")
                        .language("language")
                        .name("name")
                        .provider("provider")
                        .voiceId("voice_id")
                        .build()
                )
                .build()

        val roundtrippedTextToSpeechListVoicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(textToSpeechListVoicesResponse),
                jacksonTypeRef<TextToSpeechListVoicesResponse>(),
            )

        assertThat(roundtrippedTextToSpeechListVoicesResponse)
            .isEqualTo(textToSpeechListVoicesResponse)
    }
}
