// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirDeleteParamsTest {

    @Test
    fun create() {
        DirDeleteParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()
    }

    @Test
    fun pathParams() {
        val params = DirDeleteParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
