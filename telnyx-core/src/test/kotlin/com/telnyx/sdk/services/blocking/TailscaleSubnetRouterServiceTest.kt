// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterCreateParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TailscaleSubnetRouterServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterService = client.tailscaleSubnetRouters()

        val tailscaleSubnetRouter =
            tailscaleSubnetRouterService.create(
                TailscaleSubnetRouterCreateParams.builder()
                    .addAdvertisedRoute("172.27.0.0/24")
                    .authKey("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
                    .name("tailnet-ashburn")
                    .networkId("0de011ae-ee53-4df4-ba96-754728eb5aad")
                    .regionCode("ashburn-va")
                    .build()
            )

        tailscaleSubnetRouter.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterService = client.tailscaleSubnetRouters()

        val tailscaleSubnetRouter =
            tailscaleSubnetRouterService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        tailscaleSubnetRouter.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterService = client.tailscaleSubnetRouters()

        val tailscaleSubnetRouter =
            tailscaleSubnetRouterService.update(
                TailscaleSubnetRouterUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .addAdvertisedRoute("172.27.0.0/24")
                    .addAdvertisedRoute("172.27.1.0/24")
                    .authKey("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
                    .name("tailnet-ashburn")
                    .build()
            )

        tailscaleSubnetRouter.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterService = client.tailscaleSubnetRouters()

        val page = tailscaleSubnetRouterService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterService = client.tailscaleSubnetRouters()

        val tailscaleSubnetRouter =
            tailscaleSubnetRouterService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        tailscaleSubnetRouter.validate()
    }
}
