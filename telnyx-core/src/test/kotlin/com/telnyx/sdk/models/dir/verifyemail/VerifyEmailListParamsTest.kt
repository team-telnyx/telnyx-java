// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.verifyemail

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyEmailListParamsTest {

    @Test
    fun create() {
        VerifyEmailListParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()
    }

    @Test
    fun pathParams() {
        val params =
            VerifyEmailListParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
