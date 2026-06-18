// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ips.IpCreateParams
import com.telnyx.sdk.models.ips.IpUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipService = client.ips()

        val ip =
            ipService.create(
                IpCreateParams.builder()
                    .ipAddress("192.168.0.0")
                    .connectionId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .port(5060L)
                    .build()
            )

        ip.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipService = client.ips()

        val ip = ipService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        ip.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipService = client.ips()

        val ip =
            ipService.update(
                IpUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .ipAddress("192.168.0.0")
                    .connectionId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .port(5060L)
                    .build()
            )

        ip.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipService = client.ips()

        val page = ipService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ipService = client.ips()

        val ip = ipService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        ip.validate()
    }
}
