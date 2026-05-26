// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectListResponseTest {

    @Test
    fun create() {
        val virtualCrossConnectListResponse =
            VirtualCrossConnectListResponse.builder()
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
                .cloudProvider(VirtualCrossConnectListResponse.CloudProvider.AWS)
                .cloudProviderRegion("us-east-1")
                .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                .primaryCloudAccountId("123456789012")
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryRoutingAnnouncement(false)
                .primaryTelnyxIp("169.254.0.1")
                .region(
                    VirtualCrossConnectListResponse.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .secondaryBgpKey("ge1lONeK9RcA83uuWaw9DvZy")
                .secondaryCloudAccountId("")
                .secondaryCloudIp("169.254.0.4")
                .secondaryEnabled(true)
                .secondaryRoutingAnnouncement(false)
                .secondaryTelnyxIp("169.254.0.3")
                .build()

        assertThat(virtualCrossConnectListResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(virtualCrossConnectListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(virtualCrossConnectListResponse.recordType()).contains("sample_record_type")
        assertThat(virtualCrossConnectListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(virtualCrossConnectListResponse.name()).contains("test interface")
        assertThat(virtualCrossConnectListResponse.networkId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(virtualCrossConnectListResponse.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(virtualCrossConnectListResponse.regionCode()).isEqualTo("ashburn-va")
        assertThat(virtualCrossConnectListResponse.bandwidthMbps()).contains(50.0)
        assertThat(virtualCrossConnectListResponse.bgpAsn()).contains(1234.0)
        assertThat(virtualCrossConnectListResponse.cloudProvider())
            .contains(VirtualCrossConnectListResponse.CloudProvider.AWS)
        assertThat(virtualCrossConnectListResponse.cloudProviderRegion()).contains("us-east-1")
        assertThat(virtualCrossConnectListResponse.primaryBgpKey())
            .contains("yFV4wEPtPVPfDUGLWiyQzwga")
        assertThat(virtualCrossConnectListResponse.primaryCloudAccountId()).contains("123456789012")
        assertThat(virtualCrossConnectListResponse.primaryCloudIp()).contains("169.254.0.2")
        assertThat(virtualCrossConnectListResponse.primaryEnabled()).contains(true)
        assertThat(virtualCrossConnectListResponse.primaryRoutingAnnouncement()).contains(false)
        assertThat(virtualCrossConnectListResponse.primaryTelnyxIp()).contains("169.254.0.1")
        assertThat(virtualCrossConnectListResponse.region())
            .contains(
                VirtualCrossConnectListResponse.Region.builder()
                    .code("ashburn-va")
                    .name("Ashburn")
                    .recordType("region")
                    .build()
            )
        assertThat(virtualCrossConnectListResponse.secondaryBgpKey())
            .contains("ge1lONeK9RcA83uuWaw9DvZy")
        assertThat(virtualCrossConnectListResponse.secondaryCloudAccountId()).contains("")
        assertThat(virtualCrossConnectListResponse.secondaryCloudIp()).contains("169.254.0.4")
        assertThat(virtualCrossConnectListResponse.secondaryEnabled()).contains(true)
        assertThat(virtualCrossConnectListResponse.secondaryRoutingAnnouncement()).contains(false)
        assertThat(virtualCrossConnectListResponse.secondaryTelnyxIp()).contains("169.254.0.3")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val virtualCrossConnectListResponse =
            VirtualCrossConnectListResponse.builder()
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
                .cloudProvider(VirtualCrossConnectListResponse.CloudProvider.AWS)
                .cloudProviderRegion("us-east-1")
                .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                .primaryCloudAccountId("123456789012")
                .primaryCloudIp("169.254.0.2")
                .primaryEnabled(true)
                .primaryRoutingAnnouncement(false)
                .primaryTelnyxIp("169.254.0.1")
                .region(
                    VirtualCrossConnectListResponse.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .secondaryBgpKey("ge1lONeK9RcA83uuWaw9DvZy")
                .secondaryCloudAccountId("")
                .secondaryCloudIp("169.254.0.4")
                .secondaryEnabled(true)
                .secondaryRoutingAnnouncement(false)
                .secondaryTelnyxIp("169.254.0.3")
                .build()

        val roundtrippedVirtualCrossConnectListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectListResponse),
                jacksonTypeRef<VirtualCrossConnectListResponse>(),
            )

        assertThat(roundtrippedVirtualCrossConnectListResponse)
            .isEqualTo(virtualCrossConnectListResponse)
    }
}
