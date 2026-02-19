// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccessIpAddressServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accessIpAddressServiceAsync = client.accessIpAddress()

        val accessIpAddressResponseFuture =
            accessIpAddressServiceAsync.create(
                AccessIpAddressCreateParams.builder()
                    .ipAddress("ip_address")
                    .description("description")
                    .build()
            )

        val accessIpAddressResponse = accessIpAddressResponseFuture.get()
        accessIpAddressResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accessIpAddressServiceAsync = client.accessIpAddress()

        val accessIpAddressResponseFuture =
            accessIpAddressServiceAsync.retrieve("access_ip_address_id")

        val accessIpAddressResponse = accessIpAddressResponseFuture.get()
        accessIpAddressResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accessIpAddressServiceAsync = client.accessIpAddress()

        val pageFuture = accessIpAddressServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accessIpAddressServiceAsync = client.accessIpAddress()

        val accessIpAddressResponseFuture =
            accessIpAddressServiceAsync.delete("access_ip_address_id")

        val accessIpAddressResponse = accessIpAddressResponseFuture.get()
        accessIpAddressResponse.validate()
    }
}
