// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenGroupDeleteParamsTest {

    @Test
    fun create() {
        TokenGroupDeleteParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .idempotencyKey("Idempotency-Key")
            .ifMatch("If-Match")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenGroupDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            TokenGroupDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "Idempotency-Key")
                    .put("If-Match", "If-Match")
                    .build()
            )
    }
}
