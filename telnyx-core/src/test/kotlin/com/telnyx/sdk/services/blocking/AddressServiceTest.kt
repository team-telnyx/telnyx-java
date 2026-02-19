// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.addresses.AddressCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddressServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val addressService = client.addresses()

        val address =
            addressService.create(
                AddressCreateParams.builder()
                    .businessName("Toy-O'Kon")
                    .countryCode("US")
                    .firstName("Alfred")
                    .lastName("Foster")
                    .locality("Austin")
                    .streetAddress("600 Congress Avenue")
                    .addressBook(false)
                    .administrativeArea("TX")
                    .borough("Guadalajara")
                    .customerReference("MY REF 001")
                    .extendedAddress("14th Floor")
                    .neighborhood("Ciudad de los deportes")
                    .phoneNumber("+12125559000")
                    .postalCode("78701")
                    .validateAddress(true)
                    .build()
            )

        address.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val addressService = client.addresses()

        val address = addressService.retrieve("id")

        address.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val addressService = client.addresses()

        val page = addressService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val addressService = client.addresses()

        val address = addressService.delete("id")

        address.validate()
    }
}
