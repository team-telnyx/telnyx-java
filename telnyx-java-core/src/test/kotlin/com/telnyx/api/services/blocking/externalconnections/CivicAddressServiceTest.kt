// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.externalconnections

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.externalconnections.civicaddresses.CivicAddressListParams
import com.telnyx.api.models.externalconnections.civicaddresses.CivicAddressRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CivicAddressServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val civicAddressService = client.externalConnections().civicAddresses()

        val civicAddress =
            civicAddressService.retrieve(
                CivicAddressRetrieveParams.builder()
                    .id("id")
                    .addressId("318fb664-d341-44d2-8405-e6bfb9ced6d9")
                    .build()
            )

        civicAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val civicAddressService = client.externalConnections().civicAddresses()

        val civicAddresses =
            civicAddressService.list(
                CivicAddressListParams.builder()
                    .id("id")
                    .filter(
                        CivicAddressListParams.Filter.builder()
                            .country(listOf("US", "CA", "MX", "BR"))
                            .build()
                    )
                    .build()
            )

        civicAddresses.validate()
    }
}
