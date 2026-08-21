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
                            .languageCode("string")
                            .addLexiconName("string")
                            .outputFormat("string")
                            .sampleRate("string")
                            .textType(TextToSpeechGenerateSpeechParams.Aws.TextType.TEXT)
                            .build()
                    )
                    .azure(
                        TextToSpeechGenerateSpeechParams.Azure.builder()
                            .apiKey("string")
                            .deploymentId("string")
                            .effect("string")
                            .gender("string")
                            .languageCode("en-US")
                            .outputFormat("audio-24khz-160kbitrate-mono-mp3")
                            .region("string")
                            .textType(TextToSpeechGenerateSpeechParams.Azure.TextType.TEXT)
                            .build()
                    )
                    .disableCache(false)
                    .elevenlabs(
                        TextToSpeechGenerateSpeechParams.Elevenlabs.builder()
                            .apiKey("string")
                            .languageCode("string")
                            .voiceSettings(
                                TextToSpeechGenerateSpeechParams.Elevenlabs.VoiceSettings.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .humain(
                        TextToSpeechGenerateSpeechParams.Humain.builder()
                            .voiceId(TextToSpeechGenerateSpeechParams.Humain.VoiceId.SARA_EN)
                            .ttfbEagerness(0.0f)
                            .build()
                    )
                    .language("string")
                    .minimax(
                        TextToSpeechGenerateSpeechParams.Minimax.builder()
                            .languageBoost("string")
                            .pitch(0L)
                            .responseFormat("string")
                            .speed(0.0f)
                            .vol(0.0f)
                            .build()
                    )
                    .outputType(TextToSpeechGenerateSpeechParams.OutputType.BINARY_OUTPUT)
                    .provider(TextToSpeechGenerateSpeechParams.Provider.AWS)
                    .resemble(
                        TextToSpeechGenerateSpeechParams.Resemble.builder()
                            .apiKey("string")
                            .format("string")
                            .precision("string")
                            .sampleRate("string")
                            .build()
                    )
                    .telnyx(
                        TextToSpeechGenerateSpeechParams.Telnyx.builder()
                            .emotion(TextToSpeechGenerateSpeechParams.Telnyx.Emotion.NEUTRAL)
                            .responseFormat("mp3")
                            .samplingRate(24000L)
                            .voiceSpeed(1.0f)
                            .volume(1.0f)
                            .build()
                    )
                    .text("string")
                    .textType(TextToSpeechGenerateSpeechParams.TextType.TEXT)
                    .voice("string")
                    .voiceSettings(
                        TextToSpeechGenerateSpeechParams.VoiceSettings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .xai(
                        TextToSpeechGenerateSpeechParams.Xai.builder()
                            .voiceId(TextToSpeechGenerateSpeechParams.Xai.VoiceId.EVE)
                            .language("auto")
                            .outputFormat(TextToSpeechGenerateSpeechParams.Xai.OutputFormat.MP3)
                            .sampleRate(TextToSpeechGenerateSpeechParams.Xai.SampleRate.RATE_24000)
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
