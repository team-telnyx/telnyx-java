// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardRetrieveParamsTest {

    @Test
    fun create() {
        SimCardRetrieveParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .includePinPukCodes(true)
            .includeSimCardGroup(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SimCardRetrieveParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SimCardRetrieveParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .includePinPukCodes(true)
                .includeSimCardGroup(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_pin_puk_codes", "true")
                    .put("include_sim_card_group", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SimCardRetrieveParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
