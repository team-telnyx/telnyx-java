// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderEndUserTest {

    @Test
    fun create() {
        val portingOrderEndUser =
            PortingOrderEndUser.builder()
                .admin(
                    PortingOrderEndUserAdmin.builder()
                        .accountNumber("123abc")
                        .authPersonName("Porter McPortersen II")
                        .billingPhoneNumber("13035551234")
                        .businessIdentifier("abc123")
                        .entityName("Porter McPortersen")
                        .pinPasscode("1234")
                        .taxIdentifier("1234abcd")
                        .build()
                )
                .location(
                    PortingOrderEndUserLocation.builder()
                        .administrativeArea("TX")
                        .countryCode("US")
                        .extendedAddress("14th Floor")
                        .locality("Austin")
                        .postalCode("78701")
                        .streetAddress("600 Congress Avenue")
                        .build()
                )
                .build()

        assertThat(portingOrderEndUser.admin())
            .contains(
                PortingOrderEndUserAdmin.builder()
                    .accountNumber("123abc")
                    .authPersonName("Porter McPortersen II")
                    .billingPhoneNumber("13035551234")
                    .businessIdentifier("abc123")
                    .entityName("Porter McPortersen")
                    .pinPasscode("1234")
                    .taxIdentifier("1234abcd")
                    .build()
            )
        assertThat(portingOrderEndUser.location())
            .contains(
                PortingOrderEndUserLocation.builder()
                    .administrativeArea("TX")
                    .countryCode("US")
                    .extendedAddress("14th Floor")
                    .locality("Austin")
                    .postalCode("78701")
                    .streetAddress("600 Congress Avenue")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderEndUser =
            PortingOrderEndUser.builder()
                .admin(
                    PortingOrderEndUserAdmin.builder()
                        .accountNumber("123abc")
                        .authPersonName("Porter McPortersen II")
                        .billingPhoneNumber("13035551234")
                        .businessIdentifier("abc123")
                        .entityName("Porter McPortersen")
                        .pinPasscode("1234")
                        .taxIdentifier("1234abcd")
                        .build()
                )
                .location(
                    PortingOrderEndUserLocation.builder()
                        .administrativeArea("TX")
                        .countryCode("US")
                        .extendedAddress("14th Floor")
                        .locality("Austin")
                        .postalCode("78701")
                        .streetAddress("600 Congress Avenue")
                        .build()
                )
                .build()

        val roundtrippedPortingOrderEndUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderEndUser),
                jacksonTypeRef<PortingOrderEndUser>(),
            )

        assertThat(roundtrippedPortingOrderEndUser).isEqualTo(portingOrderEndUser)
    }
}
