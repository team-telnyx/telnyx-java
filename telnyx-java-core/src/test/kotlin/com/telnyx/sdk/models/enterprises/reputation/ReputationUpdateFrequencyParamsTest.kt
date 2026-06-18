// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReputationUpdateFrequencyParamsTest {

    @Test
    fun create() {
        ReputationUpdateFrequencyParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .checkFrequency(ReputationUpdateFrequencyParams.CheckFrequency.WEEKLY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReputationUpdateFrequencyParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .checkFrequency(ReputationUpdateFrequencyParams.CheckFrequency.WEEKLY)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ReputationUpdateFrequencyParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .checkFrequency(ReputationUpdateFrequencyParams.CheckFrequency.WEEKLY)
                .build()

        val body = params._body()

        assertThat(body.checkFrequency())
            .isEqualTo(ReputationUpdateFrequencyParams.CheckFrequency.WEEKLY)
    }
}
