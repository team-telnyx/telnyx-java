// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRetrieveRecordingsParamsTest {

    @Test
    fun create() {
        ConferenceRetrieveRecordingsParams.builder()
            .accountSid("account_sid")
            .conferenceSid("conference_sid")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConferenceRetrieveRecordingsParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("conference_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
