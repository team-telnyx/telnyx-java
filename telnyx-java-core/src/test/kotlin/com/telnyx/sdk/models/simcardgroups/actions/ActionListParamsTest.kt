// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups.actions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionListParamsTest {

    @Test
    fun create() {
        ActionListParams.builder()
            .filterSimCardGroupId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
            .filterStatus(ActionListParams.FilterStatus.IN_PROGRESS)
            .filterType(ActionListParams.FilterType.SET_PRIVATE_WIRELESS_GATEWAY)
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ActionListParams.builder()
                .filterSimCardGroupId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                .filterStatus(ActionListParams.FilterStatus.IN_PROGRESS)
                .filterType(ActionListParams.FilterType.SET_PRIVATE_WIRELESS_GATEWAY)
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[sim_card_group_id]", "47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .put("filter[status]", "in-progress")
                    .put("filter[type]", "set_private_wireless_gateway")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ActionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
