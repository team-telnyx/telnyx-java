// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.accessipaddress.AccessIpAddressCreateParams
import com.telnyx.api.models.accessipaddress.AccessIpAddressListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccessIpAddressServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpAddressService = client.accessIpAddress()

        val accessIpAddressResponse = accessIpAddressService.retrieve("access_ip_address_id")

        accessIpAddressResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpAddressService = client.accessIpAddress()

        val accessIpAddresses =
            accessIpAddressService.list(
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

        accessIpAddresses.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accessIpAddressService = client.accessIpAddress()

        val accessIpAddressResponse = accessIpAddressService.delete("access_ip_address_id")

        accessIpAddressResponse.validate()
    }
}
