// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressListParams
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CivicAddressServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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
