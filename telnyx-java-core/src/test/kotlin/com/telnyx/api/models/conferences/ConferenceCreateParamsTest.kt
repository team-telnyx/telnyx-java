// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceCreateParamsTest {

    @Test
    fun create() {
        ConferenceCreateParams.builder()
            .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .name("Business")
            .beepEnabled(ConferenceCreateParams.BeepEnabled.ALWAYS)
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .comfortNoise(false)
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .durationMinutes(5L)
            .holdAudioUrl("http://www.example.com/audio.wav")
            .holdMediaName("my_media_uploaded_to_media_storage_api")
            .maxParticipants(250L)
            .startConferenceOnCreate(false)
            .build()
    }

    @Test
    fun body() {
        val params =
            ConferenceCreateParams.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .name("Business")
                .beepEnabled(ConferenceCreateParams.BeepEnabled.ALWAYS)
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .comfortNoise(false)
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .durationMinutes(5L)
                .holdAudioUrl("http://www.example.com/audio.wav")
                .holdMediaName("my_media_uploaded_to_media_storage_api")
                .maxParticipants(250L)
                .startConferenceOnCreate(false)
                .build()

        val body = params._body()

        assertThat(body.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.name()).isEqualTo("Business")
        assertThat(body.beepEnabled()).contains(ConferenceCreateParams.BeepEnabled.ALWAYS)
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.comfortNoise()).contains(false)
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.durationMinutes()).contains(5L)
        assertThat(body.holdAudioUrl()).contains("http://www.example.com/audio.wav")
        assertThat(body.holdMediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(body.maxParticipants()).contains(250L)
        assertThat(body.startConferenceOnCreate()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConferenceCreateParams.builder()
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .name("Business")
                .build()

        val body = params._body()

        assertThat(body.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.name()).isEqualTo("Business")
    }
}
