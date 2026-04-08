// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReputationEnableParamsTest {

    @Test
    fun create() {
        ReputationEnableParams.builder()
            .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .loaDocumentId("doc_01HXYZ1234ABCDEF")
            .checkFrequency(ReputationEnableParams.CheckFrequency.BUSINESS_DAILY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReputationEnableParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .loaDocumentId("doc_01HXYZ1234ABCDEF")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ReputationEnableParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .loaDocumentId("doc_01HXYZ1234ABCDEF")
                .checkFrequency(ReputationEnableParams.CheckFrequency.BUSINESS_DAILY)
                .build()

        val body = params._body()

        assertThat(body.loaDocumentId()).isEqualTo("doc_01HXYZ1234ABCDEF")
        assertThat(body.checkFrequency())
            .contains(ReputationEnableParams.CheckFrequency.BUSINESS_DAILY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReputationEnableParams.builder()
                .enterpriseId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .loaDocumentId("doc_01HXYZ1234ABCDEF")
                .build()

        val body = params._body()

        assertThat(body.loaDocumentId()).isEqualTo("doc_01HXYZ1234ABCDEF")
    }
}
