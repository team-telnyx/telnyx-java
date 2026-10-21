// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveConferencesParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConferenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.texml().accounts().conferences()

        val conferenceResource =
            conferenceService.retrieve(
                ConferenceRetrieveParams.builder()
                    .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                    .conferenceSid("conference_sid")
                    .build()
            )

        conferenceResource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.texml().accounts().conferences()

        val conferenceResource =
            conferenceService.update(
                ConferenceUpdateParams.builder()
                    .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                    .conferenceSid("conference_sid")
                    .announceMethod(ConferenceUpdateParams.AnnounceMethod.GET)
                    .announceUrl("https://www.example.com/announce.xml")
                    .status("completed")
                    .build()
            )

        conferenceResource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveConferences() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.texml().accounts().conferences()

        val response =
            conferenceService.retrieveConferences(
                ConferenceRetrieveConferencesParams.builder()
                    .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordings() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.texml().accounts().conferences()

        val response =
            conferenceService.retrieveRecordings(
                ConferenceRetrieveRecordingsParams.builder()
                    .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                    .conferenceSid("conference_sid")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordingsJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conferenceService = client.texml().accounts().conferences()

        val texmlGetCallRecordingsResponseBody =
            conferenceService.retrieveRecordingsJson(
                ConferenceRetrieveRecordingsJsonParams.builder()
                    .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                    .conferenceSid("conference_sid")
                    .build()
            )

        texmlGetCallRecordingsResponseBody.validate()
    }
}
