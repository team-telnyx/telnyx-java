// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ips.IpCreateParams
import com.telnyx.sdk.models.ips.IpUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipServiceAsync = client.ips()

        val ipFuture =
            ipServiceAsync.create(
                IpCreateParams.builder()
                    .ipAddress("192.168.0.0")
                    .connectionId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .port(5060L)
                    .build()
            )

        val ip = ipFuture.get()
        ip.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipServiceAsync = client.ips()

        val ipFuture = ipServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val ip = ipFuture.get()
        ip.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipServiceAsync = client.ips()

        val ipFuture =
            ipServiceAsync.update(
                IpUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .ipAddress("192.168.0.0")
                    .connectionId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .port(5060L)
                    .build()
            )

        val ip = ipFuture.get()
        ip.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipServiceAsync = client.ips()

        val pageFuture = ipServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ipServiceAsync = client.ips()

        val ipFuture = ipServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val ip = ipFuture.get()
        ip.validate()
    }
}
