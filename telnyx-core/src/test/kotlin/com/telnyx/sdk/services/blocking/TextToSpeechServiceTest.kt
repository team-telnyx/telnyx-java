// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.texttospeech.TextToSpeechGenerateParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechStreamParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TextToSpeechServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun generate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val textToSpeechService = client.textToSpeech()

        val response =
            textToSpeechService.generate(
                TextToSpeechGenerateParams.builder()
                    .aws(
                        TextToSpeechGenerateParams.Aws.builder()
                            .languageCode("language_code")
                            .addLexiconName("string")
                            .outputFormat("output_format")
                            .sampleRate("sample_rate")
                            .textType(TextToSpeechGenerateParams.Aws.TextType.TEXT)
                            .build()
                    )
                    .azure(
                        TextToSpeechGenerateParams.Azure.builder()
                            .apiKey("api_key")
                            .deploymentId("deployment_id")
                            .effect("effect")
                            .gender("gender")
                            .languageCode("language_code")
                            .outputFormat("output_format")
                            .region("region")
                            .textType(TextToSpeechGenerateParams.Azure.TextType.TEXT)
                            .build()
                    )
                    .disableCache(true)
                    .elevenlabs(
                        TextToSpeechGenerateParams.Elevenlabs.builder()
                            .apiKey("api_key")
                            .languageCode("language_code")
                            .voiceSettings(
                                TextToSpeechGenerateParams.Elevenlabs.VoiceSettings.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .inworld(
                        TextToSpeechGenerateParams.Inworld.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .language("language")
                    .minimax(
                        TextToSpeechGenerateParams.Minimax.builder()
                            .languageBoost("language_boost")
                            .pitch(0L)
                            .responseFormat("response_format")
                            .speed(0.0f)
                            .vol(0.0f)
                            .build()
                    )
                    .outputType(TextToSpeechGenerateParams.OutputType.BINARY_OUTPUT)
                    .provider(TextToSpeechGenerateParams.Provider.AWS)
                    .resemble(
                        TextToSpeechGenerateParams.Resemble.builder()
                            .apiKey("api_key")
                            .format("format")
                            .precision("precision")
                            .sampleRate("sample_rate")
                            .build()
                    )
                    .rime(
                        TextToSpeechGenerateParams.Rime.builder()
                            .responseFormat("response_format")
                            .samplingRate(0L)
                            .voiceSpeed(0.0f)
                            .build()
                    )
                    .telnyx(
                        TextToSpeechGenerateParams.Telnyx.builder()
                            .responseFormat("response_format")
                            .samplingRate(0L)
                            .temperature(0.0f)
                            .voiceSpeed(0.0f)
                            .build()
                    )
                    .text("text")
                    .textType(TextToSpeechGenerateParams.TextType.TEXT)
                    .voice("voice")
                    .voiceSettings(
                        TextToSpeechGenerateParams.VoiceSettings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
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
