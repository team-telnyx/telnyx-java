// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveConferencesParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConferenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conferenceServiceAsync = client.texml().accounts().conferences()

        val conferenceFuture =
            conferenceServiceAsync.retrieve(
                ConferenceRetrieveParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .build()
            )

        val conference = conferenceFuture.get()
        conference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conferenceServiceAsync = client.texml().accounts().conferences()

        val conferenceFuture =
            conferenceServiceAsync.update(
                ConferenceUpdateParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .announceMethod(ConferenceUpdateParams.AnnounceMethod.GET)
                    .announceUrl("https://www.example.com/announce.xml")
                    .status("completed")
                    .build()
            )

        val conference = conferenceFuture.get()
        conference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveConferences() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conferenceServiceAsync = client.texml().accounts().conferences()

        val responseFuture =
            conferenceServiceAsync.retrieveConferences(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordings() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conferenceServiceAsync = client.texml().accounts().conferences()

        val responseFuture =
            conferenceServiceAsync.retrieveRecordings(
                ConferenceRetrieveRecordingsParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordingsJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conferenceServiceAsync = client.texml().accounts().conferences()

        val responseFuture =
            conferenceServiceAsync.retrieveRecordingsJson(
                ConferenceRetrieveRecordingsJsonParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
