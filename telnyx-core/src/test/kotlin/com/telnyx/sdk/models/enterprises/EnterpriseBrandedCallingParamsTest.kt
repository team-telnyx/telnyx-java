// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnterpriseBrandedCallingParamsTest {

    @Test
    fun create() {
        EnterpriseBrandedCallingParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EnterpriseBrandedCallingParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
