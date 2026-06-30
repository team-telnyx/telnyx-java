// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallReasonListParamsTest {

    @Test
    fun create() {
        CallReasonListParams.builder().pageNumber(1L).pageSize(100L).build()
    }

    @Test
    fun queryParams() {
        val params = CallReasonListParams.builder().pageNumber(1L).pageSize(100L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "100").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CallReasonListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
