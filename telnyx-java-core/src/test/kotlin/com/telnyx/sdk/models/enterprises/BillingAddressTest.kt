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
                .administrativeArea("IL")
                .city("Chicago")
                .country("US")
                .postalCode("60601")
                .streetAddress("100 Main St")
                .extendedAddress("Suite 504")
                .build()

        assertThat(billingAddress.administrativeArea()).isEqualTo("IL")
        assertThat(billingAddress.city()).isEqualTo("Chicago")
        assertThat(billingAddress.country()).isEqualTo("US")
        assertThat(billingAddress.postalCode()).isEqualTo("60601")
        assertThat(billingAddress.streetAddress()).isEqualTo("100 Main St")
        assertThat(billingAddress.extendedAddress()).contains("Suite 504")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingAddress =
            BillingAddress.builder()
                .administrativeArea("IL")
                .city("Chicago")
                .country("US")
                .postalCode("60601")
                .streetAddress("100 Main St")
                .extendedAddress("Suite 504")
                .build()

        val roundtrippedBillingAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingAddress),
                jacksonTypeRef<BillingAddress>(),
            )

        assertThat(roundtrippedBillingAddress).isEqualTo(billingAddress)
    }
}
