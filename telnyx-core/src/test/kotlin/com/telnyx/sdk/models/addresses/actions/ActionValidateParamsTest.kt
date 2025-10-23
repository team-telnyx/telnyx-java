// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionValidateParamsTest {

    @Test
    fun create() {
        ActionValidateParams.builder()
            .countryCode("US")
            .postalCode("78701")
            .streetAddress("600 Congress Avenue")
            .administrativeArea("TX")
            .extendedAddress("14th Floor")
            .locality("Austin")
            .build()
    }

    @Test
    fun body() {
        val params =
            ActionValidateParams.builder()
                .countryCode("US")
                .postalCode("78701")
                .streetAddress("600 Congress Avenue")
                .administrativeArea("TX")
                .extendedAddress("14th Floor")
                .locality("Austin")
                .build()

        val body = params._body()

        assertThat(body.countryCode()).isEqualTo("US")
        assertThat(body.postalCode()).isEqualTo("78701")
        assertThat(body.streetAddress()).isEqualTo("600 Congress Avenue")
        assertThat(body.administrativeArea()).contains("TX")
        assertThat(body.extendedAddress()).contains("14th Floor")
        assertThat(body.locality()).contains("Austin")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionValidateParams.builder()
                .countryCode("US")
                .postalCode("78701")
                .streetAddress("600 Congress Avenue")
                .build()

        val body = params._body()

        assertThat(body.countryCode()).isEqualTo("US")
        assertThat(body.postalCode()).isEqualTo("78701")
        assertThat(body.streetAddress()).isEqualTo("600 Congress Avenue")
    }
}
