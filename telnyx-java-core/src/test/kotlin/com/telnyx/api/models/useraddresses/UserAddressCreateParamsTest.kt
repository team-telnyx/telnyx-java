// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.useraddresses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddressCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.businessName()).isEqualTo("Toy-O'Kon")
        assertThat(body.countryCode()).isEqualTo("US")
        assertThat(body.firstName()).isEqualTo("Alfred")
        assertThat(body.lastName()).isEqualTo("Foster")
        assertThat(body.locality()).isEqualTo("Austin")
        assertThat(body.streetAddress()).isEqualTo("600 Congress Avenue")
        assertThat(body.administrativeArea()).contains("TX")
        assertThat(body.borough()).contains("Guadalajara")
        assertThat(body.customerReference()).contains("MY REF 001")
        assertThat(body.extendedAddress()).contains("14th Floor")
        assertThat(body.neighborhood()).contains("Ciudad de los deportes")
        assertThat(body.phoneNumber()).contains("+12125559000")
        assertThat(body.postalCode()).contains("78701")
        assertThat(body.skipAddressVerification()).contains("skip_address_verification")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserAddressCreateParams.builder()
                .businessName("Toy-O'Kon")
                .countryCode("US")
                .firstName("Alfred")
                .lastName("Foster")
                .locality("Austin")
                .streetAddress("600 Congress Avenue")
                .build()

        val body = params._body()

        assertThat(body.businessName()).isEqualTo("Toy-O'Kon")
        assertThat(body.countryCode()).isEqualTo("US")
        assertThat(body.firstName()).isEqualTo("Alfred")
        assertThat(body.lastName()).isEqualTo("Foster")
        assertThat(body.locality()).isEqualTo("Austin")
        assertThat(body.streetAddress()).isEqualTo("600 Congress Avenue")
    }
}
