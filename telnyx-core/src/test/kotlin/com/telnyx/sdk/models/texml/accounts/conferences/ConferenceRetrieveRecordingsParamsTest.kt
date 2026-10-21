// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRetrieveRecordingsParamsTest {

    @Test
    fun create() {
        ConferenceRetrieveRecordingsParams.builder()
            .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
            .conferenceSid("conference_sid")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConferenceRetrieveRecordingsParams.builder()
                .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                .conferenceSid("conference_sid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
        assertThat(params._pathParam(1)).isEqualTo("conference_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
