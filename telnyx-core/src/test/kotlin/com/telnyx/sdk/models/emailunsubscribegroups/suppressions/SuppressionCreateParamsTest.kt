// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups.suppressions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SuppressionCreateParamsTest {

    @Test
    fun create() {
        SuppressionCreateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .to("user@example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SuppressionCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .to("user@example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SuppressionCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .to("user@example.com")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("user@example.com")
    }
}
