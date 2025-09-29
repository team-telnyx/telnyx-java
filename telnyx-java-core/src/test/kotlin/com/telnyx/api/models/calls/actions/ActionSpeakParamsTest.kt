// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSpeakParamsTest {

    @Test
    fun create() {
        ActionSpeakParams.builder()
            .callControlId("call_control_id")
            .payload("Say this on the call")
            .voice("female")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .language(ActionSpeakParams.Language.ARB)
            .payloadType(ActionSpeakParams.PayloadType.TEXT)
            .serviceLevel(ActionSpeakParams.ServiceLevel.BASIC)
            .stop("current")
            .voiceSettings(
                ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSpeakParams.builder()
                .callControlId("call_control_id")
                .payload("Say this on the call")
                .voice("female")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSpeakParams.builder()
                .callControlId("call_control_id")
                .payload("Say this on the call")
                .voice("female")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .language(ActionSpeakParams.Language.ARB)
                .payloadType(ActionSpeakParams.PayloadType.TEXT)
                .serviceLevel(ActionSpeakParams.ServiceLevel.BASIC)
                .stop("current")
                .voiceSettings(
                    ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
                )
                .build()

        val body = params._body()

        assertThat(body.payload()).isEqualTo("Say this on the call")
        assertThat(body.voice()).isEqualTo("female")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.language()).contains(ActionSpeakParams.Language.ARB)
        assertThat(body.payloadType()).contains(ActionSpeakParams.PayloadType.TEXT)
        assertThat(body.serviceLevel()).contains(ActionSpeakParams.ServiceLevel.BASIC)
        assertThat(body.stop()).contains("current")
        assertThat(body.voiceSettings())
            .contains(
                ActionSpeakParams.VoiceSettings.ofElevenLabs(
                    ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionSpeakParams.builder()
                .callControlId("call_control_id")
                .payload("Say this on the call")
                .voice("female")
                .build()

        val body = params._body()

        assertThat(body.payload()).isEqualTo("Say this on the call")
        assertThat(body.voice()).isEqualTo("female")
    }
}
