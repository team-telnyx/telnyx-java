// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.texttospeech.TextToSpeechCreateSpeechParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TextToSpeechServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSpeech() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val textToSpeechService = client.textToSpeech()

        val response =
            textToSpeechService.createSpeech(
                TextToSpeechCreateSpeechParams.builder()
                    .aws(
                        TextToSpeechCreateSpeechParams.Aws.builder()
                            .languageCode("language_code")
                            .addLexiconName("string")
                            .outputFormat("output_format")
                            .sampleRate("sample_rate")
                            .textType(TextToSpeechCreateSpeechParams.Aws.TextType.TEXT)
                            .build()
                    )
                    .azure(
                        TextToSpeechCreateSpeechParams.Azure.builder()
                            .apiKey("api_key")
                            .deploymentId("deployment_id")
                            .effect("effect")
                            .gender("gender")
                            .languageCode("language_code")
                            .outputFormat("output_format")
                            .region("region")
                            .textType(TextToSpeechCreateSpeechParams.Azure.TextType.TEXT)
                            .build()
                    )
                    .disableCache(true)
                    .elevenlabs(
                        TextToSpeechCreateSpeechParams.Elevenlabs.builder()
                            .apiKey("api_key")
                            .languageCode("language_code")
                            .voiceSettings(
                                TextToSpeechCreateSpeechParams.Elevenlabs.VoiceSettings.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .language("language")
                    .minimax(
                        TextToSpeechCreateSpeechParams.Minimax.builder()
                            .languageBoost("language_boost")
                            .pitch(0L)
                            .responseFormat("response_format")
                            .speed(0.0f)
                            .vol(0.0f)
                            .build()
                    )
                    .outputType(TextToSpeechCreateSpeechParams.OutputType.BINARY_OUTPUT)
                    .provider(TextToSpeechCreateSpeechParams.Provider.AWS)
                    .resemble(
                        TextToSpeechCreateSpeechParams.Resemble.builder()
                            .apiKey("api_key")
                            .format("format")
                            .precision("precision")
                            .sampleRate("sample_rate")
                            .build()
                    )
                    .rime(
                        TextToSpeechCreateSpeechParams.Rime.builder()
                            .responseFormat("response_format")
                            .samplingRate(0L)
                            .voiceSpeed(0.0f)
                            .build()
                    )
                    .telnyx(
                        TextToSpeechCreateSpeechParams.Telnyx.builder()
                            .emotion(TextToSpeechCreateSpeechParams.Telnyx.Emotion.NEUTRAL)
                            .responseFormat("response_format")
                            .samplingRate(0L)
                            .temperature(0.0f)
                            .voiceSpeed(0.5f)
                            .volume(0.0f)
                            .build()
                    )
                    .text("text")
                    .textType(TextToSpeechCreateSpeechParams.TextType.TEXT)
                    .voice("voice")
                    .voiceSettings(
                        TextToSpeechCreateSpeechParams.VoiceSettings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .xai(
                        TextToSpeechCreateSpeechParams.Xai.builder()
                            .voiceId(TextToSpeechCreateSpeechParams.Xai.VoiceId.EVE)
                            .language("language")
                            .outputFormat(TextToSpeechCreateSpeechParams.Xai.OutputFormat.MP3)
                            .sampleRate(TextToSpeechCreateSpeechParams.Xai.SampleRate.RATE_8000)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateSpeech() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val textToSpeechService = client.textToSpeech()

        textToSpeechService.generateSpeech(
            TextToSpeechGenerateSpeechParams.builder()
                .audioFormat(TextToSpeechGenerateSpeechParams.AudioFormat.PCM)
                .disableCache(true)
                .modelId("model_id")
                .provider(TextToSpeechGenerateSpeechParams.Provider.AWS)
                .socketId("socket_id")
                .voice("voice")
                .voiceId("voice_id")
                .build()
        )
    }

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
}
