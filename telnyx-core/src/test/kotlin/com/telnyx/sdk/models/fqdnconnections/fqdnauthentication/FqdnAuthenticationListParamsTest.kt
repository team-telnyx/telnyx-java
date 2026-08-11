// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections.fqdnauthentication

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnAuthenticationListParamsTest {

    @Test
    fun create() {
        FqdnAuthenticationListParams.builder().fqdnConnectionId("fqdn_connection_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            FqdnAuthenticationListParams.builder().fqdnConnectionId("fqdn_connection_id").build()

        assertThat(params._pathParam(0)).isEqualTo("fqdn_connection_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
