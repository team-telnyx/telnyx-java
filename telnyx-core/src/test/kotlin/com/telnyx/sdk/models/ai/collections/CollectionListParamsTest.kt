// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionListParamsTest {

    @Test
    fun create() {
        CollectionListParams.builder().pageNumber(1L).pageSize(20L).build()
    }

    @Test
    fun queryParams() {
        val params = CollectionListParams.builder().pageNumber(1L).pageSize(20L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "20").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CollectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
