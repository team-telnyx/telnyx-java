// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs.export

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportDeleteAllParamsTest {

    @Test
    fun create() {
        ExportDeleteAllParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ExportDeleteAllParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
