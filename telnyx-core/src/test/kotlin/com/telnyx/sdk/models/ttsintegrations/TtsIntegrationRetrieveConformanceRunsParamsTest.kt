// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtsIntegrationRetrieveConformanceRunsParamsTest {

    @Test
    fun create() {
        TtsIntegrationRetrieveConformanceRunsParams.builder()
            .id("id")
            .page(
                TtsIntegrationRetrieveConformanceRunsParams.Page.builder()
                    .number(1L)
                    .size(20L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = TtsIntegrationRetrieveConformanceRunsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TtsIntegrationRetrieveConformanceRunsParams.builder()
                .id("id")
                .page(
                    TtsIntegrationRetrieveConformanceRunsParams.Page.builder()
                        .number(1L)
                        .size(20L)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "20").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TtsIntegrationRetrieveConformanceRunsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
