// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.conferences.ConferenceCreateParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParticipantParams
import com.telnyx.sdk.models.conferences.ConferenceUpdateParticipantParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConferenceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.conferences()

        val conference =
            conferenceService.create(
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
                    .region(ConferenceCreateParams.Region.US)
                    .startConferenceOnCreate(false)
                    .build()
            )

        conference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.conferences()

        val conference =
            conferenceService.retrieve(
                ConferenceRetrieveParams.builder()
                    .id("id")
                    .region(ConferenceRetrieveParams.Region.AUSTRALIA)
                    .build()
            )

        conference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.conferences()

        val page = conferenceService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listParticipants() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.conferences()

        val page = conferenceService.listParticipants("conference_id")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveParticipant() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.conferences()

        val response =
            conferenceService.retrieveParticipant(
                ConferenceRetrieveParticipantParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .participantId("participant_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateParticipant() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.conferences()

        val response =
            conferenceService.updateParticipant(
                ConferenceUpdateParticipantParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .participantId("participant_id")
                    .beepEnabled(ConferenceUpdateParticipantParams.BeepEnabled.NEVER)
                    .endConferenceOnExit(true)
                    .softEndConferenceOnExit(false)
                    .build()
            )

        response.validate()
    }
}
