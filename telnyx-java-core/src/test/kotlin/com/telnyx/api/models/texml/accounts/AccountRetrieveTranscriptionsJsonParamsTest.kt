// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountRetrieveTranscriptionsJsonParamsTest {

    @Test
    fun create() {
        AccountRetrieveTranscriptionsJsonParams.builder()
            .accountSid("account_sid")
            .pageSize(0L)
            .pageToken("PageToken")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountRetrieveTranscriptionsJsonParams.builder().accountSid("account_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AccountRetrieveTranscriptionsJsonParams.builder()
                .accountSid("account_sid")
                .pageSize(0L)
                .pageToken("PageToken")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("PageSize", "0").put("PageToken", "PageToken").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AccountRetrieveTranscriptionsJsonParams.builder().accountSid("account_sid").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
