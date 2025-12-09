// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.conferences.ConferenceCreateParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConferenceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceServiceAsync = client.conferences()

        val conferenceFuture =
            conferenceServiceAsync.create(
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

        val conference = conferenceFuture.get()
        conference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceServiceAsync = client.conferences()

        val conferenceFuture =
            conferenceServiceAsync.retrieve(
                ConferenceRetrieveParams.builder()
                    .id("id")
                    .region(ConferenceRetrieveParams.Region.AUSTRALIA)
                    .build()
            )

        val conference = conferenceFuture.get()
        conference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceServiceAsync = client.conferences()

        val pageFuture = conferenceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listParticipants() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceServiceAsync = client.conferences()

        val pageFuture = conferenceServiceAsync.listParticipants("conference_id")

        val page = pageFuture.get()
        page.response().validate()
    }
}
