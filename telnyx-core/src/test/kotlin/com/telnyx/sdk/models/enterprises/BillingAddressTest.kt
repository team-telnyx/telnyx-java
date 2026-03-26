// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingAddressTest {

    @Test
    fun create() {
        val billingAddress =
            BillingAddress.builder()
                .administrativeArea("Illinois")
                .city("Chicago")
                .country("United States")
                .postalCode("60601")
                .streetAddress("123 Main St")
                .extendedAddress("Suite 400")
                .build()

        assertThat(billingAddress.administrativeArea()).isEqualTo("Illinois")
        assertThat(billingAddress.city()).isEqualTo("Chicago")
        assertThat(billingAddress.country()).isEqualTo("United States")
        assertThat(billingAddress.postalCode()).isEqualTo("60601")
        assertThat(billingAddress.streetAddress()).isEqualTo("123 Main St")
        assertThat(billingAddress.extendedAddress()).contains("Suite 400")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingAddress =
            BillingAddress.builder()
                .administrativeArea("Illinois")
                .city("Chicago")
                .country("United States")
                .postalCode("60601")
                .streetAddress("123 Main St")
                .extendedAddress("Suite 400")
                .build()

        val roundtrippedBillingAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingAddress),
                jacksonTypeRef<BillingAddress>(),
            )

        assertThat(roundtrippedBillingAddress).isEqualTo(billingAddress)
    }
}
