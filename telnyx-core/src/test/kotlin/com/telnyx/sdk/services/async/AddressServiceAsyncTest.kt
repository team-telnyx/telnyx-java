// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.addresses.AddressCreateParams
import com.telnyx.sdk.models.addresses.AddressListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AddressServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addressServiceAsync = client.addresses()

        val addressFuture =
            addressServiceAsync.create(
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

        val address = addressFuture.get()
        address.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addressServiceAsync = client.addresses()

        val addressFuture = addressServiceAsync.retrieve("id")

        val address = addressFuture.get()
        address.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addressServiceAsync = client.addresses()

        val addressesFuture =
            addressServiceAsync.list(
                AddressListParams.builder()
                    .filter(
                        AddressListParams.Filter.builder()
                            .addressBook(
                                AddressListParams.Filter.AddressBook.builder().eq("eq").build()
                            )
                            .customerReference("string")
                            .streetAddress(
                                AddressListParams.Filter.StreetAddress.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .usedAsEmergency("used_as_emergency")
                            .build()
                    )
                    .page(AddressListParams.Page.builder().number(1L).size(1L).build())
                    .sort(AddressListParams.Sort.STREET_ADDRESS)
                    .build()
            )

        val addresses = addressesFuture.get()
        addresses.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addressServiceAsync = client.addresses()

        val addressFuture = addressServiceAsync.delete("id")

        val address = addressFuture.get()
        address.validate()
    }
}
