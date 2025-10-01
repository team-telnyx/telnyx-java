// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.recordings.json

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JsonRetrieveRecordingSidJsonParamsTest {

    @Test
    fun create() {
        JsonRetrieveRecordingSidJsonParams.builder()
            .accountSid("account_sid")
            .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            JsonRetrieveRecordingSidJsonParams.builder()
                .accountSid("account_sid")
                .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
