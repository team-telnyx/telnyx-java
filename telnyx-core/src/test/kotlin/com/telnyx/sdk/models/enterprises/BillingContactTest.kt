// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingContactTest {

    @Test
    fun create() {
        val billingContact =
            BillingContact.builder()
                .email("billing@acme.com")
                .firstName("John")
                .lastName("Doe")
                .phoneNumber("15551234568")
                .build()

        assertThat(billingContact.email()).isEqualTo("billing@acme.com")
        assertThat(billingContact.firstName()).isEqualTo("John")
        assertThat(billingContact.lastName()).isEqualTo("Doe")
        assertThat(billingContact.phoneNumber()).isEqualTo("15551234568")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingContact =
            BillingContact.builder()
                .email("billing@acme.com")
                .firstName("John")
                .lastName("Doe")
                .phoneNumber("15551234568")
                .build()

        val roundtrippedBillingContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingContact),
                jacksonTypeRef<BillingContact>(),
            )

        assertThat(roundtrippedBillingContact).isEqualTo(billingContact)
    }
}
