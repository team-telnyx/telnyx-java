// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechStreamParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TextToSpeechServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVoices() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val textToSpeechServiceAsync = client.textToSpeech()

        val responseFuture =
            textToSpeechServiceAsync.listVoices(
                TextToSpeechListVoicesParams.builder()
                    .apiKey("api_key")
                    .provider(TextToSpeechListVoicesParams.Provider.AWS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stream() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val textToSpeechServiceAsync = client.textToSpeech()

        val future =
            textToSpeechServiceAsync.stream(
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

        val response = future.get()
    }
}
