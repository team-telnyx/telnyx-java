// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccessIpAddressServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val accessIpAddressService = client.accessIpAddress()

        val accessIpAddressResponse =
            accessIpAddressService.create(
                AccessIpAddressCreateParams.builder()
                    .ipAddress("ip_address")
                    .description("description")
                    .build()
            )

        accessIpAddressResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val accessIpAddressService = client.accessIpAddress()

        val accessIpAddressResponse = accessIpAddressService.retrieve("access_ip_address_id")

        accessIpAddressResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val accessIpAddressService = client.accessIpAddress()

        val page = accessIpAddressService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val accessIpAddressService = client.accessIpAddress()

        val accessIpAddressResponse = accessIpAddressService.delete("access_ip_address_id")

        accessIpAddressResponse.validate()
    }
}
