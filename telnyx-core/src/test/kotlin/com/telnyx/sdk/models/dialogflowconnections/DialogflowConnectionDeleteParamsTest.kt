// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialogflowconnections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialogflowConnectionDeleteParamsTest {

    @Test
    fun create() {
        DialogflowConnectionDeleteParams.builder().connectionId("connection_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            DialogflowConnectionDeleteParams.builder().connectionId("connection_id").build()

        assertThat(params._pathParam(0)).isEqualTo("connection_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
