// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupUpdateParamsTest {

    @Test
    fun create() {
        SimCardGroupUpdateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .dataLimit(
                SimCardGroupUpdateParams.DataLimit.builder().amount("2048.1").unit("MB").build()
            )
            .name("My Test Group")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SimCardGroupUpdateParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SimCardGroupUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .dataLimit(
                    SimCardGroupUpdateParams.DataLimit.builder().amount("2048.1").unit("MB").build()
                )
                .name("My Test Group")
                .build()

        val body = params._body()

        assertThat(body.dataLimit())
            .contains(
                SimCardGroupUpdateParams.DataLimit.builder().amount("2048.1").unit("MB").build()
            )
        assertThat(body.name()).contains("My Test Group")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimCardGroupUpdateParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        val body = params._body()
    }
}
