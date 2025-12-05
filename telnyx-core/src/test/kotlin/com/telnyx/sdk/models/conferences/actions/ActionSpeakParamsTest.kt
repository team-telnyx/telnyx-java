// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.telnyx.sdk.models.calls.actions.ElevenLabsVoiceSettings
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSpeakParamsTest {

    @Test
    fun create() {
        ActionSpeakParams.builder()
            .id("id")
            .payload("Say this to participants")
            .voice("female")
            .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .language(ActionSpeakParams.Language.EN_US)
            .payloadType(ActionSpeakParams.PayloadType.TEXT)
            .region(ActionSpeakParams.Region.US)
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
            ActionSpeakParams.builder()
                .id("id")
                .payload("Say this to participants")
                .voice("female")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSpeakParams.builder()
                .id("id")
                .payload("Say this to participants")
                .voice("female")
                .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .language(ActionSpeakParams.Language.EN_US)
                .payloadType(ActionSpeakParams.PayloadType.TEXT)
                .region(ActionSpeakParams.Region.US)
                .voiceSettings(
                    ElevenLabsVoiceSettings.builder()
                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                        .apiKeyRef("my_elevenlabs_api_key")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.payload()).isEqualTo("Say this to participants")
        assertThat(body.voice()).isEqualTo("female")
        assertThat(body.callControlIds().getOrNull())
            .containsExactly("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.language()).contains(ActionSpeakParams.Language.EN_US)
        assertThat(body.payloadType()).contains(ActionSpeakParams.PayloadType.TEXT)
        assertThat(body.region()).contains(ActionSpeakParams.Region.US)
        assertThat(body.voiceSettings())
            .contains(
                ActionSpeakParams.VoiceSettings.ofElevenlabs(
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
            ActionSpeakParams.builder()
                .id("id")
                .payload("Say this to participants")
                .voice("female")
                .build()

        val body = params._body()

        assertThat(body.payload()).isEqualTo("Say this to participants")
        assertThat(body.voice()).isEqualTo("female")
    }
}
