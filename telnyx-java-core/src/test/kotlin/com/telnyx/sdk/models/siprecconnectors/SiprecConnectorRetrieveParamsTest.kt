// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.siprecconnectors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiprecConnectorRetrieveParamsTest {

    @Test
    fun create() {
        SiprecConnectorRetrieveParams.builder().connectorName("connector_name").build()
    }

    @Test
    fun pathParams() {
        val params = SiprecConnectorRetrieveParams.builder().connectorName("connector_name").build()

        assertThat(params._pathParam(0)).isEqualTo("connector_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
