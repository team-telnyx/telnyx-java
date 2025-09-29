// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bulksimcardactions

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkSimCardActionListParamsTest {

    @Test
    fun create() {
        BulkSimCardActionListParams.builder()
            .filterActionType(BulkSimCardActionListParams.FilterActionType.BULK_SET_PUBLIC_IPS)
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BulkSimCardActionListParams.builder()
                .filterActionType(BulkSimCardActionListParams.FilterActionType.BULK_SET_PUBLIC_IPS)
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[action_type]", "bulk_set_public_ips")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BulkSimCardActionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
