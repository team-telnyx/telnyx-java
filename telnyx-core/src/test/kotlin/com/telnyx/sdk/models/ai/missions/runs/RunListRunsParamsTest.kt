// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListRunsParamsTest {

    @Test
    fun create() {
        RunListRunsParams.builder().pageNumber(1L).pageSize(1L).status("status").build()
    }

    @Test
    fun queryParams() {
        val params =
            RunListRunsParams.builder().pageNumber(1L).pageSize(1L).status("status").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RunListRunsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
