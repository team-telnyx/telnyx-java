// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectCreateParamsTest {

    @Test
    fun create() {
        VirtualCrossConnectCreateParams.builder()
            .virtualCrossConnectCreate(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VirtualCrossConnectCreateParams.builder()
                .virtualCrossConnectCreate(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VirtualCrossConnectCreateParams.builder()
                .virtualCrossConnectCreate(
                    VirtualCrossConnectCreate.builder().regionCode("ashburn-va").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(VirtualCrossConnectCreate.builder().regionCode("ashburn-va").build())
    }
}
