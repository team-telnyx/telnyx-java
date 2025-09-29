// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.virtualcrossconnects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectUpdateResponseTest {

    @Test
    fun create() {
        val virtualCrossConnectUpdateResponse =
            VirtualCrossConnectUpdateResponse.builder()
                .data(
                    VirtualCrossConnectUpdateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("virtual_cross_connect")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .regionCode("ashburn-va")
                        .bgpAsn(1234.0)
                        .cloudProvider(VirtualCrossConnectUpdateResponse.Data.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .primaryCloudAccountId("123456789012")
                        .bandwidthMbps(50.0)
                        .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(false)
                        .primaryTelnyxIp("169.254.0.1")
                        .region(
                            VirtualCrossConnectUpdateResponse.Data.Region.builder()
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
                )
                .build()

        assertThat(virtualCrossConnectUpdateResponse.data())
            .contains(
                VirtualCrossConnectUpdateResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("virtual_cross_connect")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .regionCode("ashburn-va")
                    .bgpAsn(1234.0)
                    .cloudProvider(VirtualCrossConnectUpdateResponse.Data.CloudProvider.AWS)
                    .cloudProviderRegion("us-east-1")
                    .primaryCloudAccountId("123456789012")
                    .bandwidthMbps(50.0)
                    .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                    .primaryCloudIp("169.254.0.2")
                    .primaryEnabled(true)
                    .primaryRoutingAnnouncement(false)
                    .primaryTelnyxIp("169.254.0.1")
                    .region(
                        VirtualCrossConnectUpdateResponse.Data.Region.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val virtualCrossConnectUpdateResponse =
            VirtualCrossConnectUpdateResponse.builder()
                .data(
                    VirtualCrossConnectUpdateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("virtual_cross_connect")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .regionCode("ashburn-va")
                        .bgpAsn(1234.0)
                        .cloudProvider(VirtualCrossConnectUpdateResponse.Data.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .primaryCloudAccountId("123456789012")
                        .bandwidthMbps(50.0)
                        .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(false)
                        .primaryTelnyxIp("169.254.0.1")
                        .region(
                            VirtualCrossConnectUpdateResponse.Data.Region.builder()
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
                )
                .build()

        val roundtrippedVirtualCrossConnectUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectUpdateResponse),
                jacksonTypeRef<VirtualCrossConnectUpdateResponse>(),
            )

        assertThat(roundtrippedVirtualCrossConnectUpdateResponse)
            .isEqualTo(virtualCrossConnectUpdateResponse)
    }
}
