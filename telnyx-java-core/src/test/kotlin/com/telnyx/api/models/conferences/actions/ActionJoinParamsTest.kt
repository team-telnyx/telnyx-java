// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionJoinParamsTest {

    @Test
    fun create() {
        ActionJoinParams.builder()
            .id("id")
            .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .beepEnabled(ActionJoinParams.BeepEnabled.ALWAYS)
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .endConferenceOnExit(true)
            .hold(true)
            .holdAudioUrl("http://www.example.com/audio.wav")
            .holdMediaName("my_media_uploaded_to_media_storage_api")
            .mute(true)
            .softEndConferenceOnExit(true)
            .startConferenceOnEnter(true)
            .supervisorRole(ActionJoinParams.SupervisorRole.WHISPER)
            .addWhisperCallControlId("v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ")
            .addWhisperCallControlId("v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionJoinParams.builder()
                .id("id")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionJoinParams.builder()
                .id("id")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .beepEnabled(ActionJoinParams.BeepEnabled.ALWAYS)
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .endConferenceOnExit(true)
                .hold(true)
                .holdAudioUrl("http://www.example.com/audio.wav")
                .holdMediaName("my_media_uploaded_to_media_storage_api")
                .mute(true)
                .softEndConferenceOnExit(true)
                .startConferenceOnEnter(true)
                .supervisorRole(ActionJoinParams.SupervisorRole.WHISPER)
                .addWhisperCallControlId(
                    "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                )
                .addWhisperCallControlId(
                    "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                )
                .build()

        val body = params._body()

        assertThat(body.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.beepEnabled()).contains(ActionJoinParams.BeepEnabled.ALWAYS)
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.endConferenceOnExit()).contains(true)
        assertThat(body.hold()).contains(true)
        assertThat(body.holdAudioUrl()).contains("http://www.example.com/audio.wav")
        assertThat(body.holdMediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(body.mute()).contains(true)
        assertThat(body.softEndConferenceOnExit()).contains(true)
        assertThat(body.startConferenceOnEnter()).contains(true)
        assertThat(body.supervisorRole()).contains(ActionJoinParams.SupervisorRole.WHISPER)
        assertThat(body.whisperCallControlIds().getOrNull())
            .containsExactly(
                "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ",
                "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw",
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionJoinParams.builder()
                .id("id")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .build()

        val body = params._body()

        assertThat(body.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
    }
}
