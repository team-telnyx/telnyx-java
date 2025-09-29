// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InterfaceTest {

    @Test
    fun create() {
        val interface_ =
            Interface.builder()
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .build()

        assertThat(interface_.name()).contains("test interface")
        assertThat(interface_.networkId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(interface_.status()).contains(InterfaceStatus.PROVISIONED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interface_ =
            Interface.builder()
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .build()

        val roundtrippedInterface =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interface_),
                jacksonTypeRef<Interface>(),
            )

        assertThat(roundtrippedInterface).isEqualTo(interface_)
    }
}
