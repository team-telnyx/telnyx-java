// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherUsingSpeakParamsTest {

    @Test
    fun create() {
        ActionGatherUsingSpeakParams.builder()
            .callControlId("call_control_id")
            .payload("say this on call")
            .voice("male")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .interDigitTimeoutMillis(10000)
            .invalidPayload("say this on call")
            .language(ActionGatherUsingSpeakParams.Language.ARB)
            .maximumDigits(10)
            .maximumTries(3)
            .minimumDigits(1)
            .payloadType(ActionGatherUsingSpeakParams.PayloadType.TEXT)
            .serviceLevel(ActionGatherUsingSpeakParams.ServiceLevel.PREMIUM)
            .terminatingDigit("#")
            .timeoutMillis(60000)
            .validDigits("123")
            .voiceSettings(
                ElevenLabsVoiceSettings.builder()
                    .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                    .apiKeyRef("my_elevenlabs_api_key")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionGatherUsingSpeakParams.builder()
                .callControlId("call_control_id")
                .payload("say this on call")
                .voice("male")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionGatherUsingSpeakParams.builder()
                .callControlId("call_control_id")
                .payload("say this on call")
                .voice("male")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .interDigitTimeoutMillis(10000)
                .invalidPayload("say this on call")
                .language(ActionGatherUsingSpeakParams.Language.ARB)
                .maximumDigits(10)
                .maximumTries(3)
                .minimumDigits(1)
                .payloadType(ActionGatherUsingSpeakParams.PayloadType.TEXT)
                .serviceLevel(ActionGatherUsingSpeakParams.ServiceLevel.PREMIUM)
                .terminatingDigit("#")
                .timeoutMillis(60000)
                .validDigits("123")
                .voiceSettings(
                    ElevenLabsVoiceSettings.builder()
                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                        .apiKeyRef("my_elevenlabs_api_key")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.payload()).isEqualTo("say this on call")
        assertThat(body.voice()).isEqualTo("male")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.interDigitTimeoutMillis()).contains(10000)
        assertThat(body.invalidPayload()).contains("say this on call")
        assertThat(body.language()).contains(ActionGatherUsingSpeakParams.Language.ARB)
        assertThat(body.maximumDigits()).contains(10)
        assertThat(body.maximumTries()).contains(3)
        assertThat(body.minimumDigits()).contains(1)
        assertThat(body.payloadType()).contains(ActionGatherUsingSpeakParams.PayloadType.TEXT)
        assertThat(body.serviceLevel()).contains(ActionGatherUsingSpeakParams.ServiceLevel.PREMIUM)
        assertThat(body.terminatingDigit()).contains("#")
        assertThat(body.timeoutMillis()).contains(60000)
        assertThat(body.validDigits()).contains("123")
        assertThat(body.voiceSettings())
            .contains(
                ActionGatherUsingSpeakParams.VoiceSettings.ofElevenlabs(
                    ElevenLabsVoiceSettings.builder()
                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                        .apiKeyRef("my_elevenlabs_api_key")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionGatherUsingSpeakParams.builder()
                .callControlId("call_control_id")
                .payload("say this on call")
                .voice("male")
                .build()

        val body = params._body()

        assertThat(body.payload()).isEqualTo("say this on call")
        assertThat(body.voice()).isEqualTo("male")
    }
}
