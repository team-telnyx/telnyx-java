// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectCombinedTest {

    @Test
    fun create() {
        val virtualCrossConnectCombined =
            VirtualCrossConnectCombined.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bandwidthMbps(50.0)
                .bgpAsn(1234.0)
                .cloudProvider(VirtualCrossConnectCombined.CloudProvider.AWS)
                .cloudProviderRegion("us-east-1")
                .createdAt("created_at")
                .name("name")
                .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                .primaryCloudAccountId("123456789012")
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryRoutingAnnouncement(true)
                .primaryTelnyxIp("169.254.0.1")
                .recordType("virtual_cross_connect")
                .region(
                    VirtualCrossConnectCombined.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("region_code")
                .status(InterfaceStatus.PROVISIONED)
                .updatedAt("updated_at")
                .build()

        assertThat(virtualCrossConnectCombined.id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(virtualCrossConnectCombined.bandwidthMbps()).contains(50.0)
        assertThat(virtualCrossConnectCombined.bgpAsn()).contains(1234.0)
        assertThat(virtualCrossConnectCombined.cloudProvider())
            .contains(VirtualCrossConnectCombined.CloudProvider.AWS)
        assertThat(virtualCrossConnectCombined.cloudProviderRegion()).contains("us-east-1")
        assertThat(virtualCrossConnectCombined.createdAt()).contains("created_at")
        assertThat(virtualCrossConnectCombined.name()).contains("name")
        assertThat(virtualCrossConnectCombined.networkId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(virtualCrossConnectCombined.primaryBgpKey()).contains("yFV4wEPtPVPfDUGLWiyQzwga")
        assertThat(virtualCrossConnectCombined.primaryCloudAccountId()).contains("123456789012")
        assertThat(virtualCrossConnectCombined.primaryCloudIp()).contains("169.254.0.2")
        assertThat(virtualCrossConnectCombined.primaryEnabled()).contains(true)
        assertThat(virtualCrossConnectCombined.primaryRoutingAnnouncement()).contains(true)
        assertThat(virtualCrossConnectCombined.primaryTelnyxIp()).contains("169.254.0.1")
        assertThat(virtualCrossConnectCombined.recordType()).contains("virtual_cross_connect")
        assertThat(virtualCrossConnectCombined.region())
            .contains(
                VirtualCrossConnectCombined.Region.builder()
                    .code("ashburn-va")
                    .name("Ashburn")
                    .recordType("region")
                    .build()
            )
        assertThat(virtualCrossConnectCombined.regionCode()).contains("region_code")
        assertThat(virtualCrossConnectCombined.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(virtualCrossConnectCombined.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val virtualCrossConnectCombined =
            VirtualCrossConnectCombined.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bandwidthMbps(50.0)
                .bgpAsn(1234.0)
                .cloudProvider(VirtualCrossConnectCombined.CloudProvider.AWS)
                .cloudProviderRegion("us-east-1")
                .createdAt("created_at")
                .name("name")
                .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                .primaryCloudAccountId("123456789012")
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryRoutingAnnouncement(true)
                .primaryTelnyxIp("169.254.0.1")
                .recordType("virtual_cross_connect")
                .region(
                    VirtualCrossConnectCombined.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("region_code")
                .status(InterfaceStatus.PROVISIONED)
                .updatedAt("updated_at")
                .build()

        val roundtrippedVirtualCrossConnectCombined =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectCombined),
                jacksonTypeRef<VirtualCrossConnectCombined>(),
            )

        assertThat(roundtrippedVirtualCrossConnectCombined).isEqualTo(virtualCrossConnectCombined)
    }
}
