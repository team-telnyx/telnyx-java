// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionListParamsTest {

    @Test
    fun create() {
        ActionListParams.builder()
            .filter(
                ActionListParams.Filter.builder()
                    .actionType(ActionListParams.Filter.ActionType.DISABLE)
                    .bulkSimCardActionId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .simCardId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .status(ActionListParams.Filter.Status.IN_PROGRESS)
                    .build()
            )
            .page(ActionListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ActionListParams.builder()
                .filter(
                    ActionListParams.Filter.builder()
                        .actionType(ActionListParams.Filter.ActionType.DISABLE)
                        .bulkSimCardActionId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                        .simCardId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                        .status(ActionListParams.Filter.Status.IN_PROGRESS)
                        .build()
                )
                .page(ActionListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[action_type]", "disable")
                    .put("filter[bulk_sim_card_action_id]", "47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .put("filter[sim_card_id]", "47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .put("filter[status]", "in-progress")
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
