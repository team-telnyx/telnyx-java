// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks.defaultgateway

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefaultGatewayTest {

    @Test
    fun create() {
        val defaultGateway =
            DefaultGateway.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .networkId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                .status(InterfaceStatus.PROVISIONED)
                .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                .build()

        assertThat(defaultGateway.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(defaultGateway.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(defaultGateway.recordType()).contains("sample_record_type")
        assertThat(defaultGateway.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(defaultGateway.networkId()).contains("e66c496d-4a85-423b-8b2a-8e63fac20320")
        assertThat(defaultGateway.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(defaultGateway.wireguardPeerId())
            .contains("e66c496d-4a85-423b-8b2a-8e63fac20320")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val defaultGateway =
            DefaultGateway.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .networkId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                .status(InterfaceStatus.PROVISIONED)
                .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                .build()

        val roundtrippedDefaultGateway =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(defaultGateway),
                jacksonTypeRef<DefaultGateway>(),
            )

        assertThat(roundtrippedDefaultGateway).isEqualTo(defaultGateway)
    }
}
