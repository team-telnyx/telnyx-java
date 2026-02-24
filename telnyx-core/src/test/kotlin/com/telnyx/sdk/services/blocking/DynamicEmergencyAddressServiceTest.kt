// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DynamicEmergencyAddressServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dynamicEmergencyAddressService = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddress =
            dynamicEmergencyAddressService.create(
                DynamicEmergencyAddress.builder()
                    .administrativeArea("TX")
                    .countryCode(DynamicEmergencyAddress.CountryCode.US)
                    .houseNumber("600")
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dynamicEmergencyAddressService = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddress =
            dynamicEmergencyAddressService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dynamicEmergencyAddress.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dynamicEmergencyAddressService = client.dynamicEmergencyAddresses()

        val page = dynamicEmergencyAddressService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dynamicEmergencyAddressService = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddress =
            dynamicEmergencyAddressService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dynamicEmergencyAddress.validate()
    }
}
