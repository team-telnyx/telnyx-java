// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.tunnels.TunnelCreateParams
import com.telnyx.sdk.models.tunnels.TunnelListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TunnelServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tunnelService = client.tunnels()

        val tunnel = tunnelService.create(TunnelCreateParams.builder().name("chicago-dc").build())

        tunnel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tunnelService = client.tunnels()

        val tunnel = tunnelService.retrieve("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")

        tunnel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tunnelService = client.tunnels()

        val tunnels =
            tunnelService.list(
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

        tunnels.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tunnelService = client.tunnels()

        tunnelService.delete("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
    }
}
