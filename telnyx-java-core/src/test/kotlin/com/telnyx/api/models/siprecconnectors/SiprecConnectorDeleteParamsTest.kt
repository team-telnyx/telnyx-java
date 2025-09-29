// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.siprecconnectors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiprecConnectorDeleteParamsTest {

    @Test
    fun create() {
        SiprecConnectorDeleteParams.builder().connectorName("connector_name").build()
    }

    @Test
    fun pathParams() {
        val params = SiprecConnectorDeleteParams.builder().connectorName("connector_name").build()

        assertThat(params._pathParam(0)).isEqualTo("connector_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
