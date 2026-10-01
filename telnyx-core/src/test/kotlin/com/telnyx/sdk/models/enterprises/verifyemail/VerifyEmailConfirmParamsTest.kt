// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.verifyemail

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyEmailConfirmParamsTest {

    @Test
    fun create() {
        VerifyEmailConfirmParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .code("482915")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerifyEmailConfirmParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .code("482915")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VerifyEmailConfirmParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .code("482915")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("482915")
    }
}
