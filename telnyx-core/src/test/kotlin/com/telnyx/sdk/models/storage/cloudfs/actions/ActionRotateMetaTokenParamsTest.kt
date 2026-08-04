// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRotateMetaTokenParamsTest {

    @Test
    fun create() {
        ActionRotateMetaTokenParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .idempotencyKey("Idempotency-Key")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionRotateMetaTokenParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ActionRotateMetaTokenParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "Idempotency-Key")
                    .build()
            )
    }
}
