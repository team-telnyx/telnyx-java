// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.useraddresses.UserAddressCreateParams
import com.telnyx.sdk.models.useraddresses.UserAddressListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserAddressServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userAddressServiceAsync = client.userAddresses()

        val userAddressFuture =
            userAddressServiceAsync.create(
                UserAddressCreateParams.builder()
                    .businessName("Toy-O'Kon")
                    .countryCode("US")
                    .firstName("Alfred")
                    .lastName("Foster")
                    .locality("Austin")
                    .streetAddress("600 Congress Avenue")
                    .administrativeArea("TX")
                    .borough("Guadalajara")
                    .customerReference("MY REF 001")
                    .extendedAddress("14th Floor")
                    .neighborhood("Ciudad de los deportes")
                    .phoneNumber("+12125559000")
                    .postalCode("78701")
                    .skipAddressVerification("skip_address_verification")
                    .build()
            )

        val userAddress = userAddressFuture.get()
        userAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userAddressServiceAsync = client.userAddresses()

        val userAddressFuture = userAddressServiceAsync.retrieve("id")

        val userAddress = userAddressFuture.get()
        userAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userAddressServiceAsync = client.userAddresses()

        val userAddressesFuture =
            userAddressServiceAsync.list(
                UserAddressListParams.builder()
                    .filter(
                        UserAddressListParams.Filter.builder()
                            .customerReference(
                                UserAddressListParams.Filter.CustomerReference.builder()
                                    .contains("contains")
                                    .eq("eq")
                                    .build()
                            )
                            .streetAddress(
                                UserAddressListParams.Filter.StreetAddress.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .build()
                    )
                    .page(UserAddressListParams.Page.builder().number(1L).size(1L).build())
                    .sort(UserAddressListParams.Sort.STREET_ADDRESS)
                    .build()
            )

        val userAddresses = userAddressesFuture.get()
        userAddresses.validate()
    }
}
