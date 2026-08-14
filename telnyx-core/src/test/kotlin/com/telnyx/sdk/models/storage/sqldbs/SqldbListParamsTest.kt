// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SqldbListParamsTest {

    @Test
    fun create() {
        SqldbListParams.builder()
            .filterName("filter[name]")
            .filterStatus(SqldbListParams.FilterStatus.PENDING)
            .pageNumber(1L)
            .pageSize(1L)
            .sort(SqldbListParams.Sort.NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SqldbListParams.builder()
                .filterName("filter[name]")
                .filterStatus(SqldbListParams.FilterStatus.PENDING)
                .pageNumber(1L)
                .pageSize(1L)
                .sort(SqldbListParams.Sort.NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "filter[name]")
                    .put("filter[status]", "pending")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SqldbListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
