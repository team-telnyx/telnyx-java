// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaging.rcs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcListBulkCapabilitiesParamsTest {

    @Test
    fun create() {
        RcListBulkCapabilitiesParams.builder()
            .agentId("TestAgent")
            .addPhoneNumber("+13125551234")
            .build()
    }

    @Test
    fun body() {
        val params =
            RcListBulkCapabilitiesParams.builder()
                .agentId("TestAgent")
                .addPhoneNumber("+13125551234")
                .build()

        val body = params._body()

        assertThat(body.agentId()).isEqualTo("TestAgent")
        assertThat(body.phoneNumbers()).containsExactly("+13125551234")
    }
}
