// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texttospeech

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechGenerateSpeechParamsTest {

    @Test
    fun create() {
        TextToSpeechGenerateSpeechParams.builder().text("text").voice("voice").build()
    }

    @Test
    fun body() {
        val params = TextToSpeechGenerateSpeechParams.builder().text("text").voice("voice").build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("text")
        assertThat(body.voice()).isEqualTo("voice")
    }
}
