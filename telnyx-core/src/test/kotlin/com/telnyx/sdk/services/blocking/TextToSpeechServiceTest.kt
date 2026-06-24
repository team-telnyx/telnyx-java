// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechRetrieveSpeechParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TextToSpeechServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateSpeech() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val textToSpeechService = client.textToSpeech()

        val response =
            textToSpeechService.generateSpeech(
                TextToSpeechGenerateSpeechParams.builder()
                    .aws(
                        TextToSpeechGenerateSpeechParams.Aws.builder()
                            .languageCode("language_code")
                            .addLexiconName("string")
                            .outputFormat("output_format")
                            .sampleRate("sample_rate")
                            .textType(TextToSpeechGenerateSpeechParams.Aws.TextType.TEXT)
                            .build()
                    )
                    .azure(
                        TextToSpeechGenerateSpeechParams.Azure.builder()
                            .apiKey("api_key")
                            .deploymentId("deployment_id")
                            .effect("effect")
                            .gender("gender")
                            .languageCode("language_code")
                            .outputFormat("output_format")
                            .region("region")
                            .textType(TextToSpeechGenerateSpeechParams.Azure.TextType.TEXT)
                            .build()
                    )
                    .disableCache(true)
                    .elevenlabs(
                        TextToSpeechGenerateSpeechParams.Elevenlabs.builder()
                            .apiKey("api_key")
                            .languageCode("language_code")
                            .voiceSettings(
                                TextToSpeechGenerateSpeechParams.Elevenlabs.VoiceSettings.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .language("language")
                    .minimax(
                        TextToSpeechGenerateSpeechParams.Minimax.builder()
                            .languageBoost("language_boost")
                            .pitch(0L)
                            .responseFormat("response_format")
                            .speed(0.0f)
                            .vol(0.0f)
                            .build()
                    )
                    .outputType(TextToSpeechGenerateSpeechParams.OutputType.BINARY_OUTPUT)
                    .provider(TextToSpeechGenerateSpeechParams.Provider.AWS)
                    .resemble(
                        TextToSpeechGenerateSpeechParams.Resemble.builder()
                            .apiKey("api_key")
                            .format("format")
                            .precision("precision")
                            .sampleRate("sample_rate")
                            .build()
                    )
                    .rime(
                        TextToSpeechGenerateSpeechParams.Rime.builder()
                            .responseFormat("response_format")
                            .samplingRate(0L)
                            .voiceSpeed(0.0f)
                            .build()
                    )
                    .telnyx(
                        TextToSpeechGenerateSpeechParams.Telnyx.builder()
                            .emotion(TextToSpeechGenerateSpeechParams.Telnyx.Emotion.NEUTRAL)
                            .responseFormat("response_format")
                            .samplingRate(0L)
                            .temperature(0.0f)
                            .voiceSpeed(0.5f)
                            .volume(0.0f)
                            .build()
                    )
                    .text("text")
                    .textType(TextToSpeechGenerateSpeechParams.TextType.TEXT)
                    .voice("voice")
                    .voiceSettings(
                        TextToSpeechGenerateSpeechParams.VoiceSettings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .xai(
                        TextToSpeechGenerateSpeechParams.Xai.builder()
                            .voiceId(TextToSpeechGenerateSpeechParams.Xai.VoiceId.EVE)
                            .language("language")
                            .outputFormat(TextToSpeechGenerateSpeechParams.Xai.OutputFormat.MP3)
                            .sampleRate(TextToSpeechGenerateSpeechParams.Xai.SampleRate.RATE_8000)
                            .build()
                    )
                    .build()
            )

        response.validate()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSpeech() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val textToSpeechService = client.textToSpeech()

        textToSpeechService.retrieveSpeech(
            TextToSpeechRetrieveSpeechParams.builder()
                .audioFormat(TextToSpeechRetrieveSpeechParams.AudioFormat.PCM)
                .disableCache(true)
                .modelId("model_id")
                .provider(TextToSpeechRetrieveSpeechParams.Provider.AWS)
                .socketId("socket_id")
                .voice("voice")
                .voiceId("voice_id")
                .build()
        )
    }
}
