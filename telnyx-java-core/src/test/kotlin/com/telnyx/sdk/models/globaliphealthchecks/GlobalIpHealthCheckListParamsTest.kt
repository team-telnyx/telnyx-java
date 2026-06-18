// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globaliphealthchecks

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpHealthCheckListParamsTest {

    @Test
    fun create() {
        GlobalIpHealthCheckListParams.builder().pageNumber(0L).pageSize(0L).build()
    }

    @Test
    fun queryParams() {
        val params = GlobalIpHealthCheckListParams.builder().pageNumber(0L).pageSize(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "0").put("page[size]", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GlobalIpHealthCheckListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
