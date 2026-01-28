// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.otaupdates

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OtaUpdateListParamsTest {

    @Test
    fun create() {
        OtaUpdateListParams.builder()
            .filter(
                OtaUpdateListParams.Filter.builder()
                    .simCardId("sim_card_id")
                    .status(OtaUpdateListParams.Filter.Status.IN_PROGRESS)
                    .type(OtaUpdateListParams.Filter.Type.SIM_CARD_NETWORK_PREFERENCES)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OtaUpdateListParams.builder()
                .filter(
                    OtaUpdateListParams.Filter.builder()
                        .simCardId("sim_card_id")
                        .status(OtaUpdateListParams.Filter.Status.IN_PROGRESS)
                        .type(OtaUpdateListParams.Filter.Type.SIM_CARD_NETWORK_PREFERENCES)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[sim_card_id]", "sim_card_id")
                    .put("filter[status]", "in-progress")
                    .put("filter[type]", "sim_card_network_preferences")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OtaUpdateListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
