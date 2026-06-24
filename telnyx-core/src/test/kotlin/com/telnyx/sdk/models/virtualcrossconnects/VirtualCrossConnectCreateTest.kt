// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectCreateTest {

    @Test
    fun create() {
        val virtualCrossConnectCreate =
            VirtualCrossConnectCreate.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .regionCode("ashburn-va")
                .bandwidthMbps(50.0)
                .bgpAsn(1234.0)
                .cloudProvider(VirtualCrossConnectCreate.CloudProvider.AWS)
                .cloudProviderRegion("us-east-1")
                .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                .primaryCloudAccountId("123456789012")
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryTelnyxIp("169.254.0.1")
                .secondaryBgpKey("ge1lONeK9RcA83uuWaw9DvZy")
                .secondaryCloudAccountId("")
                .secondaryCloudIp("169.254.0.4")
                .secondaryEnabled(true)
                .secondaryTelnyxIp("169.254.0.3")
                .build()

        assertThat(virtualCrossConnectCreate.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(virtualCrossConnectCreate.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(virtualCrossConnectCreate.recordType()).contains("sample_record_type")
        assertThat(virtualCrossConnectCreate.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(virtualCrossConnectCreate.name()).contains("test interface")
        assertThat(virtualCrossConnectCreate.networkId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(virtualCrossConnectCreate.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(virtualCrossConnectCreate.regionCode()).isEqualTo("ashburn-va")
        assertThat(virtualCrossConnectCreate.bandwidthMbps()).contains(50.0)
        assertThat(virtualCrossConnectCreate.bgpAsn()).contains(1234.0)
        assertThat(virtualCrossConnectCreate.cloudProvider())
            .contains(VirtualCrossConnectCreate.CloudProvider.AWS)
        assertThat(virtualCrossConnectCreate.cloudProviderRegion()).contains("us-east-1")
        assertThat(virtualCrossConnectCreate.primaryBgpKey()).contains("yFV4wEPtPVPfDUGLWiyQzwga")
        assertThat(virtualCrossConnectCreate.primaryCloudAccountId()).contains("123456789012")
        assertThat(virtualCrossConnectCreate.primaryCloudIp()).contains("169.254.0.2")
        assertThat(virtualCrossConnectCreate.primaryEnabled()).contains(true)
        assertThat(virtualCrossConnectCreate.primaryTelnyxIp()).contains("169.254.0.1")
        assertThat(virtualCrossConnectCreate.secondaryBgpKey()).contains("ge1lONeK9RcA83uuWaw9DvZy")
        assertThat(virtualCrossConnectCreate.secondaryCloudAccountId()).contains("")
        assertThat(virtualCrossConnectCreate.secondaryCloudIp()).contains("169.254.0.4")
        assertThat(virtualCrossConnectCreate.secondaryEnabled()).contains(true)
        assertThat(virtualCrossConnectCreate.secondaryTelnyxIp()).contains("169.254.0.3")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val virtualCrossConnectCreate =
            VirtualCrossConnectCreate.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .regionCode("ashburn-va")
                .bandwidthMbps(50.0)
                .bgpAsn(1234.0)
                .cloudProvider(VirtualCrossConnectCreate.CloudProvider.AWS)
                .cloudProviderRegion("us-east-1")
                .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                .primaryCloudAccountId("123456789012")
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryTelnyxIp("169.254.0.1")
                .secondaryBgpKey("ge1lONeK9RcA83uuWaw9DvZy")
                .secondaryCloudAccountId("")
                .secondaryCloudIp("169.254.0.4")
                .secondaryEnabled(true)
                .secondaryTelnyxIp("169.254.0.3")
                .build()

        val roundtrippedVirtualCrossConnectCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectCreate),
                jacksonTypeRef<VirtualCrossConnectCreate>(),
            )

        assertThat(roundtrippedVirtualCrossConnectCreate).isEqualTo(virtualCrossConnectCreate)
    }
}
