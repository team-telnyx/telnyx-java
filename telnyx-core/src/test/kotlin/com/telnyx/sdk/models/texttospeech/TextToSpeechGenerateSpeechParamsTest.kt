// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechGenerateSpeechParamsTest {

    @Test
    fun create() {
        TextToSpeechGenerateSpeechParams.builder()
            .audioFormat(TextToSpeechGenerateSpeechParams.AudioFormat.PCM)
            .disableCache(true)
            .modelId("model_id")
            .provider(TextToSpeechGenerateSpeechParams.Provider.AWS)
            .socketId("socket_id")
            .voice("voice")
            .voiceId("voice_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TextToSpeechGenerateSpeechParams.builder()
                .audioFormat(TextToSpeechGenerateSpeechParams.AudioFormat.PCM)
                .disableCache(true)
                .modelId("model_id")
                .provider(TextToSpeechGenerateSpeechParams.Provider.AWS)
                .socketId("socket_id")
                .voice("voice")
                .voiceId("voice_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("audio_format", "pcm")
                    .put("disable_cache", "true")
                    .put("model_id", "model_id")
                    .put("provider", "aws")
                    .put("socket_id", "socket_id")
                    .put("voice", "voice")
                    .put("voice_id", "voice_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TextToSpeechGenerateSpeechParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
