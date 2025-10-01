// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordingsjson

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingsJsonRetrieveRecordingsJsonParamsTest {

    @Test
    fun create() {
        RecordingsJsonRetrieveRecordingsJsonParams.builder()
            .accountSid("account_sid")
            .callSid("call_sid")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RecordingsJsonRetrieveRecordingsJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("call_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
