// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterCreateParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TailscaleSubnetRouterServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterServiceAsync = client.tailscaleSubnetRouters()

        val tailscaleSubnetRouterFuture =
            tailscaleSubnetRouterServiceAsync.create(
                TailscaleSubnetRouterCreateParams.builder()
                    .addAdvertisedRoute("172.27.0.0/24")
                    .authKey("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
                    .name("tailnet-ashburn")
                    .networkId("0de011ae-ee53-4df4-ba96-754728eb5aad")
                    .regionCode("ashburn-va")
                    .build()
            )

        val tailscaleSubnetRouter = tailscaleSubnetRouterFuture.get()
        tailscaleSubnetRouter.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterServiceAsync = client.tailscaleSubnetRouters()

        val tailscaleSubnetRouterFuture =
            tailscaleSubnetRouterServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val tailscaleSubnetRouter = tailscaleSubnetRouterFuture.get()
        tailscaleSubnetRouter.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterServiceAsync = client.tailscaleSubnetRouters()

        val tailscaleSubnetRouterFuture =
            tailscaleSubnetRouterServiceAsync.update(
                TailscaleSubnetRouterUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .addAdvertisedRoute("172.27.0.0/24")
                    .addAdvertisedRoute("172.27.1.0/24")
                    .authKey("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
                    .name("tailnet-ashburn")
                    .build()
            )

        val tailscaleSubnetRouter = tailscaleSubnetRouterFuture.get()
        tailscaleSubnetRouter.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterServiceAsync = client.tailscaleSubnetRouters()

        val pageFuture = tailscaleSubnetRouterServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tailscaleSubnetRouterServiceAsync = client.tailscaleSubnetRouters()

        val tailscaleSubnetRouterFuture =
            tailscaleSubnetRouterServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val tailscaleSubnetRouter = tailscaleSubnetRouterFuture.get()
        tailscaleSubnetRouter.validate()
    }
}
