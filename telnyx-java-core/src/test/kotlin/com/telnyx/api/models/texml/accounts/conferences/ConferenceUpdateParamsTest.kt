// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceUpdateParamsTest {

    @Test
    fun create() {
        ConferenceUpdateParams.builder()
            .accountSid("account_sid")
            .conferenceSid("conference_sid")
            .announceMethod(ConferenceUpdateParams.AnnounceMethod.GET)
            .announceUrl("https://www.example.com/announce.xml")
            .status("completed")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConferenceUpdateParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("conference_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConferenceUpdateParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .announceMethod(ConferenceUpdateParams.AnnounceMethod.GET)
                .announceUrl("https://www.example.com/announce.xml")
                .status("completed")
                .build()

        val body = params._body()

        assertThat(body.announceMethod()).contains(ConferenceUpdateParams.AnnounceMethod.GET)
        assertThat(body.announceUrl()).contains("https://www.example.com/announce.xml")
        assertThat(body.status()).contains("completed")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConferenceUpdateParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .build()

        val body = params._body()
    }
}
