// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardListParamsTest {

    @Test
    fun create() {
        SimCardListParams.builder()
            .filter(
                SimCardListParams.Filter.builder()
                    .iccid("89310410106543789301")
                    .msisdn("+13109976224")
                    .addStatus(SimCardListParams.Filter.Status.ENABLED)
                    .tags(listOf("personal", "customers", "active-customers"))
                    .build()
            )
            .filterSimCardGroupId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
            .includeSimCardGroup(true)
            .page(SimCardListParams.Page.builder().number(1L).size(1L).build())
            .sort(SimCardListParams.Sort.CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SimCardListParams.builder()
                .filter(
                    SimCardListParams.Filter.builder()
                        .iccid("89310410106543789301")
                        .msisdn("+13109976224")
                        .addStatus(SimCardListParams.Filter.Status.ENABLED)
                        .tags(listOf("personal", "customers", "active-customers"))
                        .build()
                )
                .filterSimCardGroupId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                .includeSimCardGroup(true)
                .page(SimCardListParams.Page.builder().number(1L).size(1L).build())
                .sort(SimCardListParams.Sort.CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[iccid]", "89310410106543789301")
                    .put("filter[msisdn]", "+13109976224")
                    .put("filter[status]", listOf("enabled").joinToString(","))
                    .put(
                        "filter[tags]",
                        listOf("personal", "customers", "active-customers").joinToString(","),
                    )
                    .put("filter[sim_card_group_id]", "47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .put("include_sim_card_group", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "current_billing_period_consumed_data.amount")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SimCardListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
