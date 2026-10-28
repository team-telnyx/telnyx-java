// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.tunnels.TunnelCreateParams
import com.telnyx.sdk.models.tunnels.TunnelListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TunnelServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tunnelServiceAsync = client.tunnels()

        val tunnelFuture =
            tunnelServiceAsync.create(TunnelCreateParams.builder().name("chicago-dc").build())

        val tunnel = tunnelFuture.get()
        tunnel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tunnelServiceAsync = client.tunnels()

        val tunnelFuture = tunnelServiceAsync.retrieve("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")

        val tunnel = tunnelFuture.get()
        tunnel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tunnelServiceAsync = client.tunnels()

        val tunnelsFuture =
            tunnelServiceAsync.list(
                TunnelListParams.builder()
                    .filter(
                        TunnelListParams.Filter.builder()
                            .name("chicago-dc")
                            .status(TunnelListParams.Filter.Status.HEALTHY)
                            .build()
                    )
                    .page(TunnelListParams.Page.builder().after("after").limit(1L).build())
                    .sort(TunnelListParams.Sort.CREATED_AT_DESC)
                    .build()
            )

        val tunnels = tunnelsFuture.get()
        tunnels.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tunnelServiceAsync = client.tunnels()

        val future = tunnelServiceAsync.delete("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")

        val response = future.get()
    }
}
