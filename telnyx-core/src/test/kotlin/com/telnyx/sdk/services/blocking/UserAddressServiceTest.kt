// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.useraddresses.UserAddressCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserAddressServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userAddressService = client.userAddresses()

        val userAddress =
            userAddressService.create(
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

        userAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userAddressService = client.userAddresses()

        val userAddress = userAddressService.retrieve("id")

        userAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userAddressService = client.userAddresses()

        val page = userAddressService.list()

        page.response().validate()
    }
}
