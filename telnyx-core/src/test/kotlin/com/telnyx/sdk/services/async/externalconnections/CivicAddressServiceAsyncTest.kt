// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressListParams
import com.telnyx.sdk.models.externalconnections.civicaddresses.CivicAddressRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CivicAddressServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val civicAddressServiceAsync = client.externalConnections().civicAddresses()

        val civicAddressFuture =
            civicAddressServiceAsync.retrieve(
                CivicAddressRetrieveParams.builder()
                    .id("id")
                    .addressId("318fb664-d341-44d2-8405-e6bfb9ced6d9")
                    .build()
            )

        val civicAddress = civicAddressFuture.get()
        civicAddress.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val civicAddressServiceAsync = client.externalConnections().civicAddresses()

        val civicAddressesFuture =
            civicAddressServiceAsync.list(
                CivicAddressListParams.builder()
                    .id("id")
                    .filter(
                        CivicAddressListParams.Filter.builder()
                            .country(listOf("US", "CA", "MX", "BR"))
                            .build()
                    )
                    .build()
            )

        val civicAddresses = civicAddressesFuture.get()
        civicAddresses.validate()
    }
}
