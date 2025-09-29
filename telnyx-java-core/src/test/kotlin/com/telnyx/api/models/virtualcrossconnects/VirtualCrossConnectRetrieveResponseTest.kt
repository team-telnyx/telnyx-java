// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.virtualcrossconnects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectRetrieveResponseTest {

    @Test
    fun create() {
        val virtualCrossConnectRetrieveResponse =
            VirtualCrossConnectRetrieveResponse.builder()
                .data(
                    VirtualCrossConnectRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("virtual_cross_connect")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .regionCode("ashburn-va")
                        .bgpAsn(1234.0)
                        .cloudProvider(VirtualCrossConnectRetrieveResponse.Data.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .primaryCloudAccountId("123456789012")
                        .bandwidthMbps(50.0)
                        .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(false)
                        .primaryTelnyxIp("169.254.0.1")
                        .region(
                            VirtualCrossConnectRetrieveResponse.Data.Region.builder()
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

        assertThat(virtualCrossConnectRetrieveResponse.data())
            .contains(
                VirtualCrossConnectRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("virtual_cross_connect")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .regionCode("ashburn-va")
                    .bgpAsn(1234.0)
                    .cloudProvider(VirtualCrossConnectRetrieveResponse.Data.CloudProvider.AWS)
                    .cloudProviderRegion("us-east-1")
                    .primaryCloudAccountId("123456789012")
                    .bandwidthMbps(50.0)
                    .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                    .primaryCloudIp("169.254.0.2")
                    .primaryEnabled(true)
                    .primaryRoutingAnnouncement(false)
                    .primaryTelnyxIp("169.254.0.1")
                    .region(
                        VirtualCrossConnectRetrieveResponse.Data.Region.builder()
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
        val virtualCrossConnectRetrieveResponse =
            VirtualCrossConnectRetrieveResponse.builder()
                .data(
                    VirtualCrossConnectRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("virtual_cross_connect")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .regionCode("ashburn-va")
                        .bgpAsn(1234.0)
                        .cloudProvider(VirtualCrossConnectRetrieveResponse.Data.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .primaryCloudAccountId("123456789012")
                        .bandwidthMbps(50.0)
                        .primaryBgpKey("yFV4wEPtPVPfDUGLWiyQzwga")
                        .primaryCloudIp("169.254.0.2")
                        .primaryEnabled(true)
                        .primaryRoutingAnnouncement(false)
                        .primaryTelnyxIp("169.254.0.1")
                        .region(
                            VirtualCrossConnectRetrieveResponse.Data.Region.builder()
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

        val roundtrippedVirtualCrossConnectRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectRetrieveResponse),
                jacksonTypeRef<VirtualCrossConnectRetrieveResponse>(),
            )

        assertThat(roundtrippedVirtualCrossConnectRetrieveResponse)
            .isEqualTo(virtualCrossConnectRetrieveResponse)
    }
}
