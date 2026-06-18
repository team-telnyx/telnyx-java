// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileVoiceConnectionListParamsTest {

    @Test
    fun create() {
        MobileVoiceConnectionListParams.builder()
            .filterConnectionNameContains("filter[connection_name][contains]")
            .pageNumber(0L)
            .pageSize(0L)
            .sort("sort")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MobileVoiceConnectionListParams.builder()
                .filterConnectionNameContains("filter[connection_name][contains]")
                .pageNumber(0L)
                .pageSize(0L)
                .sort("sort")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[connection_name][contains]", "filter[connection_name][contains]")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort", "sort")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MobileVoiceConnectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
