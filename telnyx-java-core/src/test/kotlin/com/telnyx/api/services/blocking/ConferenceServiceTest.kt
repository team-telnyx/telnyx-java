// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.conferences.ConferenceCreateParams
import com.telnyx.api.models.conferences.ConferenceListParams
import com.telnyx.api.models.conferences.ConferenceListParticipantsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConferenceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                    .startConferenceOnCreate(false)
                    .build()
            )

        conference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceService = client.conferences()

        val conference = conferenceService.retrieve("id")

        conference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceService = client.conferences()

        val conferences =
            conferenceService.list(
                ConferenceListParams.builder()
                    .filter(
                        ConferenceListParams.Filter.builder()
                            .applicationName(
                                ConferenceListParams.Filter.ApplicationName.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .applicationSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .connectionId("connection_id")
                            .failed(false)
                            .from("+12025550142")
                            .legId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .occurredAt(
                                ConferenceListParams.Filter.OccurredAt.builder()
                                    .eq("2019-03-29T11:10:00Z")
                                    .gt("2019-03-29T11:10:00Z")
                                    .gte("2019-03-29T11:10:00Z")
                                    .lt("2019-03-29T11:10:00Z")
                                    .lte("2019-03-29T11:10:00Z")
                                    .build()
                            )
                            .outboundOutboundVoiceProfileId("outbound.outbound_voice_profile_id")
                            .product(ConferenceListParams.Filter.Product.TEXML)
                            .status(ConferenceListParams.Filter.Status.INIT)
                            .to("+12025550142")
                            .type(ConferenceListParams.Filter.Type.WEBHOOK)
                            .build()
                    )
                    .page(
                        ConferenceListParams.Page.builder()
                            .after("after")
                            .before("before")
                            .limit(1L)
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        conferences.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listParticipants() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceService = client.conferences()

        val response =
            conferenceService.listParticipants(
                ConferenceListParticipantsParams.builder()
                    .conferenceId("conference_id")
                    .filter(
                        ConferenceListParticipantsParams.Filter.builder()
                            .muted(true)
                            .onHold(true)
                            .whispering(true)
                            .build()
                    )
                    .page(
                        ConferenceListParticipantsParams.Page.builder()
                            .after("after")
                            .before("before")
                            .limit(1L)
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
