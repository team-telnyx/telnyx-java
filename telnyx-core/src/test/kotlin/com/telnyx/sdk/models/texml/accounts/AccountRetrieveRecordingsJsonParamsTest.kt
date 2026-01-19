// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountRetrieveRecordingsJsonParamsTest {

    @Test
    fun create() {
        AccountRetrieveRecordingsJsonParams.builder()
            .accountSid("account_sid")
            .dateCreated(OffsetDateTime.parse("2023-05-22T00:00:00Z"))
            .page(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AccountRetrieveRecordingsJsonParams.builder().accountSid("account_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AccountRetrieveRecordingsJsonParams.builder()
                .accountSid("account_sid")
                .dateCreated(OffsetDateTime.parse("2023-05-22T00:00:00Z"))
                .page(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("DateCreated", "2023-05-22T00:00:00Z")
                    .put("Page", "0")
                    .put("PageSize", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountRetrieveRecordingsJsonParams.builder().accountSid("account_sid").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
