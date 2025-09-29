// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddress
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DynamicEmergencyAddressServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyAddressService = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddress =
            dynamicEmergencyAddressService.create(
                DynamicEmergencyAddress.builder()
                    .administrativeArea("TX")
                    .countryCode(DynamicEmergencyAddress.CountryCode.US)
                    .houseNumber("house_number")
                    .locality("Austin")
                    .postalCode("78701")
                    .streetName("Congress")
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f1")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .extendedAddress("extended_address")
                    .houseSuffix("house_suffix")
                    .recordType("dynamic_emergency_address")
                    .sipGeolocationId("XYZ123")
                    .status(DynamicEmergencyAddress.Status.PENDING)
                    .streetPostDirectional("street_post_directional")
                    .streetPreDirectional("street_pre_directional")
                    .streetSuffix("St")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )

        dynamicEmergencyAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyAddressService = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddress =
            dynamicEmergencyAddressService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dynamicEmergencyAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyAddressService = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddresses =
            dynamicEmergencyAddressService.list(
                DynamicEmergencyAddressListParams.builder()
                    .filter(
                        DynamicEmergencyAddressListParams.Filter.builder()
                            .countryCode("country_code")
                            .status(DynamicEmergencyAddressListParams.Filter.Status.PENDING)
                            .build()
                    )
                    .page(
                        DynamicEmergencyAddressListParams.Page.builder().number(1L).size(1L).build()
                    )
                    .build()
            )

        dynamicEmergencyAddresses.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyAddressService = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddress =
            dynamicEmergencyAddressService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dynamicEmergencyAddress.validate()
    }
}
