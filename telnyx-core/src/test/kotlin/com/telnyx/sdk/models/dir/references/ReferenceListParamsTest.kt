// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReferenceListParamsTest {

    @Test
    fun create() {
        ReferenceListParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()
    }

    @Test
    fun pathParams() {
        val params =
            ReferenceListParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
