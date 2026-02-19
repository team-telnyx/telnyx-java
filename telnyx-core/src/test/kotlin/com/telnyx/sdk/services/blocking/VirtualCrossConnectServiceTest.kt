// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.networks.InterfaceStatus
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectCreateParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val virtualCrossConnectService = client.virtualCrossConnects()

        val virtualCrossConnect =
            virtualCrossConnectService.create(
                VirtualCrossConnectCreateParams.builder()
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
            )

        virtualCrossConnect.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val virtualCrossConnectService = client.virtualCrossConnects()

        val virtualCrossConnect =
            virtualCrossConnectService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        virtualCrossConnect.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val virtualCrossConnectService = client.virtualCrossConnects()

        val virtualCrossConnect =
            virtualCrossConnectService.update(
                VirtualCrossConnectUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .primaryCloudIp("169.254.0.2")
                    .primaryEnabled(true)
                    .primaryRoutingAnnouncement(false)
                    .secondaryCloudIp("169.254.0.4")
                    .secondaryEnabled(true)
                    .secondaryRoutingAnnouncement(false)
                    .build()
            )

        virtualCrossConnect.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val virtualCrossConnectService = client.virtualCrossConnects()

        val page = virtualCrossConnectService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val virtualCrossConnectService = client.virtualCrossConnects()

        val virtualCrossConnect =
            virtualCrossConnectService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        virtualCrossConnect.validate()
    }
}
