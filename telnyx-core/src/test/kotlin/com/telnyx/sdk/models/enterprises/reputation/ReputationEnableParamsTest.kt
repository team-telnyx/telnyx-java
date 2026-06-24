// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReputationEnableParamsTest {

    @Test
    fun create() {
        ReputationEnableParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
            .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReputationEnableParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ReputationEnableParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .checkFrequency(ReputationCheckFrequency.BUSINESS_DAILY)
                .build()

        val body = params._body()

        assertThat(body.loaDocumentId()).isEqualTo("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
        assertThat(body.checkFrequency()).contains(ReputationCheckFrequency.BUSINESS_DAILY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReputationEnableParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .loaDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                .build()

        val body = params._body()

        assertThat(body.loaDocumentId()).isEqualTo("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
    }
}
