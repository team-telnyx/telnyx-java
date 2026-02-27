// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectCreateParamsTest {

    @Test
    fun create() {
        VirtualCrossConnectCreateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .createdAt("2018-02-02T22:25:27.521Z")
            .recordType("sample_record_type")
            .updatedAt("2018-02-02T22:25:27.521Z")
            .name("test interface")
            .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .status(InterfaceStatus.PROVISIONED)
            .bandwidthMbps(50.0)
            .bgpAsn(1234.0)
            .cloudProvider(VirtualCrossConnectCreateParams.CloudProvider.AWS)
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
    }

    @Test
    fun body() {
        val params =
            VirtualCrossConnectCreateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .bandwidthMbps(50.0)
                .bgpAsn(1234.0)
                .cloudProvider(VirtualCrossConnectCreateParams.CloudProvider.AWS)
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

        val body = params._body()

        assertThat(body.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.recordType()).contains("sample_record_type")
        assertThat(body.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.name()).contains("test interface")
        assertThat(body.networkId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(body.bandwidthMbps()).contains(50.0)
        assertThat(body.bgpAsn()).contains(1234.0)
        assertThat(body.cloudProvider()).contains(VirtualCrossConnectCreateParams.CloudProvider.AWS)
        assertThat(body.cloudProviderRegion()).contains("us-east-1")
        assertThat(body.primaryBgpKey()).contains("yFV4wEPtPVPfDUGLWiyQzwga")
        assertThat(body.primaryCloudAccountId()).contains("123456789012")
        assertThat(body.primaryCloudIp()).contains("169.254.0.2")
        assertThat(body.primaryEnabled()).contains(true)
        assertThat(body.primaryTelnyxIp()).contains("169.254.0.1")
        assertThat(body.secondaryBgpKey()).contains("ge1lONeK9RcA83uuWaw9DvZy")
        assertThat(body.secondaryCloudAccountId()).contains("")
        assertThat(body.secondaryCloudIp()).contains("169.254.0.4")
        assertThat(body.secondaryEnabled()).contains(true)
        assertThat(body.secondaryTelnyxIp()).contains("169.254.0.3")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VirtualCrossConnectCreateParams.builder().build()

        val body = params._body()
    }
}
