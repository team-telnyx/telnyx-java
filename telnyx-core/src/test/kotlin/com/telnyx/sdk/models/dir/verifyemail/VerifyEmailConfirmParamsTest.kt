// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyEmailConfirmParamsTest {

    @Test
    fun create() {
        VerifyEmailConfirmParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .code("482915")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerifyEmailConfirmParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .code("482915")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VerifyEmailConfirmParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .code("482915")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("482915")
    }
}
