// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.accessipaddress.AccessIpAddressCreateParams
import com.telnyx.api.models.accessipaddress.AccessIpAddressListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccessIpAddressServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpAddressServiceAsync = client.accessIpAddress()

        val accessIpAddressResponseFuture =
            accessIpAddressServiceAsync.retrieve("access_ip_address_id")

        val accessIpAddressResponse = accessIpAddressResponseFuture.get()
        accessIpAddressResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpAddressServiceAsync = client.accessIpAddress()

        val accessIpAddressesFuture =
            accessIpAddressServiceAsync.list(
                AccessIpAddressListParams.builder()
                    .filter(
                        AccessIpAddressListParams.Filter.builder()
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .ipAddress("ip_address")
                            .ipSource("ip_source")
                            .build()
                    )
                    .page(AccessIpAddressListParams.Page.builder().number(0L).size(250L).build())
                    .build()
            )

        val accessIpAddresses = accessIpAddressesFuture.get()
        accessIpAddresses.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpAddressServiceAsync = client.accessIpAddress()

        val accessIpAddressResponseFuture =
            accessIpAddressServiceAsync.delete("access_ip_address_id")

        val accessIpAddressResponse = accessIpAddressResponseFuture.get()
        accessIpAddressResponse.validate()
    }
}
