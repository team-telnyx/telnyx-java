// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtsIntegrationRetrieveDiscoverableParamsTest {

    @Test
    fun create() {
        TtsIntegrationRetrieveDiscoverableParams.builder()
            .page(
                TtsIntegrationRetrieveDiscoverableParams.Page.builder().number(1L).size(20L).build()
            )
            .status(CommunityTtsEngineStatus.DRAFT)
            .visibility(CommunityTtsEngineVisibility.PRIVATE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TtsIntegrationRetrieveDiscoverableParams.builder()
                .page(
                    TtsIntegrationRetrieveDiscoverableParams.Page.builder()
                        .number(1L)
                        .size(20L)
                        .build()
                )
                .status(CommunityTtsEngineStatus.DRAFT)
                .visibility(CommunityTtsEngineVisibility.PRIVATE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .put("status", "draft")
                    .put("visibility", "private")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TtsIntegrationRetrieveDiscoverableParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
