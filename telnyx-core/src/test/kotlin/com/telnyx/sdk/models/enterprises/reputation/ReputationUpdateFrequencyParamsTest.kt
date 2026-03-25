// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReputationUpdateFrequencyParamsTest {

    @Test
    fun create() {
        ReputationUpdateFrequencyParams.builder()
            .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .checkFrequency(ReputationUpdateFrequencyParams.CheckFrequency.BUSINESS_DAILY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReputationUpdateFrequencyParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .checkFrequency(ReputationUpdateFrequencyParams.CheckFrequency.BUSINESS_DAILY)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ReputationUpdateFrequencyParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .checkFrequency(ReputationUpdateFrequencyParams.CheckFrequency.BUSINESS_DAILY)
                .build()

        val body = params._body()

        assertThat(body.checkFrequency())
            .isEqualTo(ReputationUpdateFrequencyParams.CheckFrequency.BUSINESS_DAILY)
    }
}
