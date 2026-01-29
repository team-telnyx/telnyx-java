// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.actionrequirements

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRequirementListParamsTest {

    @Test
    fun create() {
        ActionRequirementListParams.builder()
            .portingOrderId("porting_order_id")
            .filter(
                ActionRequirementListParams.Filter.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .actionType(ActionRequirementListParams.Filter.ActionType.AU_ID_VERIFICATION)
                    .requirementTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(ActionRequirementListParams.Filter.Status.CREATED)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .sort(
                ActionRequirementListParams.Sort.builder()
                    .value(ActionRequirementListParams.Sort.SortValue.CREATED_AT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionRequirementListParams.builder().portingOrderId("porting_order_id").build()

        assertThat(params._pathParam(0)).isEqualTo("porting_order_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ActionRequirementListParams.builder()
                .portingOrderId("porting_order_id")
                .filter(
                    ActionRequirementListParams.Filter.builder()
                        .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .actionType(
                            ActionRequirementListParams.Filter.ActionType.AU_ID_VERIFICATION
                        )
                        .requirementTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(ActionRequirementListParams.Filter.Status.CREATED)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .sort(
                    ActionRequirementListParams.Sort.builder()
                        .value(ActionRequirementListParams.Sort.SortValue.CREATED_AT)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "filter[id]",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("filter[action_type]", "au_id_verification")
                    .put("filter[requirement_type_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[status]", "created")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort[value]", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ActionRequirementListParams.builder().portingOrderId("porting_order_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
