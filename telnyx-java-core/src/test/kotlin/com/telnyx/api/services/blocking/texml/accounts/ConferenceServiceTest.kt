// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveConferencesParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConferenceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceService = client.texml().accounts().conferences()

        val conference =
            conferenceService.retrieve(
                ConferenceRetrieveParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .build()
            )

        conference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceService = client.texml().accounts().conferences()

        val conference =
            conferenceService.update(
                ConferenceUpdateParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .announceMethod(ConferenceUpdateParams.AnnounceMethod.GET)
                    .announceUrl("https://www.example.com/announce.xml")
                    .status("completed")
                    .build()
            )

        conference.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveConferences() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceService = client.texml().accounts().conferences()

        val response =
            conferenceService.retrieveConferences(
                ConferenceRetrieveConferencesParams.builder()
                    .accountSid("account_sid")
                    .dateCreated("DateCreated")
                    .dateUpdated("DateUpdated")
                    .friendlyName("FriendlyName")
                    .page(0L)
                    .pageSize(0L)
                    .pageToken("PageToken")
                    .status(ConferenceRetrieveConferencesParams.Status.INIT)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordings() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceService = client.texml().accounts().conferences()

        val response =
            conferenceService.retrieveRecordings(
                ConferenceRetrieveRecordingsParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingsJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val conferenceService = client.texml().accounts().conferences()

        val response =
            conferenceService.retrieveRecordingsJson(
                ConferenceRetrieveRecordingsJsonParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .build()
            )

        response.validate()
    }
}
