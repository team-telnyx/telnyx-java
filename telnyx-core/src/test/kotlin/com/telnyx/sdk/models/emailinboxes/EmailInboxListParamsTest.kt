// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailInboxListParamsTest {

    @Test
    fun create() {
        EmailInboxListParams.builder().pageCursor("page_cursor").pageSize(1L).build()
    }

    @Test
    fun queryParams() {
        val params = EmailInboxListParams.builder().pageCursor("page_cursor").pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page_cursor", "page_cursor")
                    .put("page_size", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailInboxListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
