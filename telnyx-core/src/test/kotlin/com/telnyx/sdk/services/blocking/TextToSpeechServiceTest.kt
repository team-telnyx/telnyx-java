// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechStreamParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TextToSpeechServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVoices() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val textToSpeechService = client.textToSpeech()

        val response =
            textToSpeechService.listVoices(
                TextToSpeechListVoicesParams.builder()
                    .apiKey("api_key")
                    .provider(TextToSpeechListVoicesParams.Provider.AWS)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stream() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val textToSpeechService = client.textToSpeech()

        textToSpeechService.stream(
            TextToSpeechStreamParams.builder()
                .audioFormat(TextToSpeechStreamParams.AudioFormat.PCM)
                .disableCache(true)
                .modelId("model_id")
                .provider(TextToSpeechStreamParams.Provider.AWS)
                .socketId("socket_id")
                .voice("voice")
                .voiceId("voice_id")
                .build()
        )
    }
}
