// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaging.rcs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcRetrieveCapabilitiesParamsTest {

    @Test
    fun create() {
        RcRetrieveCapabilitiesParams.builder()
            .agentId("agent_id")
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RcRetrieveCapabilitiesParams.builder()
                .agentId("agent_id")
                .phoneNumber("phone_number")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        assertThat(params._pathParam(1)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
