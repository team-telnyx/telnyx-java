// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddress
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DynamicEmergencyAddressServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyAddressServiceAsync = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddressFuture =
            dynamicEmergencyAddressServiceAsync.create(
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

        val dynamicEmergencyAddress = dynamicEmergencyAddressFuture.get()
        dynamicEmergencyAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyAddressServiceAsync = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddressFuture =
            dynamicEmergencyAddressServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dynamicEmergencyAddress = dynamicEmergencyAddressFuture.get()
        dynamicEmergencyAddress.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyAddressServiceAsync = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddressesFuture =
            dynamicEmergencyAddressServiceAsync.list(
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

        val dynamicEmergencyAddresses = dynamicEmergencyAddressesFuture.get()
        dynamicEmergencyAddresses.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dynamicEmergencyAddressServiceAsync = client.dynamicEmergencyAddresses()

        val dynamicEmergencyAddressFuture =
            dynamicEmergencyAddressServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dynamicEmergencyAddress = dynamicEmergencyAddressFuture.get()
        dynamicEmergencyAddress.validate()
    }
}
