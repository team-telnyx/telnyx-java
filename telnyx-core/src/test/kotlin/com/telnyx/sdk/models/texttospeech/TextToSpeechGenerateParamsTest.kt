// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechGenerateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.aws())
            .contains(
                TextToSpeechGenerateParams.Aws.builder()
                    .languageCode("language_code")
                    .addLexiconName("string")
                    .outputFormat("output_format")
                    .sampleRate("sample_rate")
                    .textType(TextToSpeechGenerateParams.Aws.TextType.TEXT)
                    .build()
            )
        assertThat(body.azure())
            .contains(
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
        assertThat(body.disableCache()).contains(true)
        assertThat(body.elevenlabs())
            .contains(
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
        assertThat(body.language()).contains("language")
        assertThat(body.minimax())
            .contains(
                TextToSpeechGenerateParams.Minimax.builder()
                    .languageBoost("language_boost")
                    .pitch(0L)
                    .responseFormat("response_format")
                    .speed(0.0f)
                    .vol(0.0f)
                    .build()
            )
        assertThat(body.outputType()).contains(TextToSpeechGenerateParams.OutputType.BINARY_OUTPUT)
        assertThat(body.provider()).contains(TextToSpeechGenerateParams.Provider.AWS)
        assertThat(body.resemble())
            .contains(
                TextToSpeechGenerateParams.Resemble.builder()
                    .apiKey("api_key")
                    .format("format")
                    .precision("precision")
                    .sampleRate("sample_rate")
                    .build()
            )
        assertThat(body.rime())
            .contains(
                TextToSpeechGenerateParams.Rime.builder()
                    .responseFormat("response_format")
                    .samplingRate(0L)
                    .voiceSpeed(0.0f)
                    .build()
            )
        assertThat(body.telnyx())
            .contains(
                TextToSpeechGenerateParams.Telnyx.builder()
                    .responseFormat("response_format")
                    .samplingRate(0L)
                    .temperature(0.0f)
                    .voiceSpeed(0.0f)
                    .build()
            )
        assertThat(body.text()).contains("text")
        assertThat(body.textType()).contains(TextToSpeechGenerateParams.TextType.TEXT)
        assertThat(body.voice()).contains("voice")
        assertThat(body.voiceSettings())
            .contains(
                TextToSpeechGenerateParams.VoiceSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TextToSpeechGenerateParams.builder().build()

        val body = params._body()
    }
}
