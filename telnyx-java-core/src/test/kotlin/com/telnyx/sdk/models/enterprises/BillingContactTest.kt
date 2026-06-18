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
                .email("billing@acmeplumbing.example.com")
                .firstName("Alex")
                .lastName("Bill")
                .phoneNumber("+13125550001")
                .build()

        assertThat(billingContact.email()).isEqualTo("billing@acmeplumbing.example.com")
        assertThat(billingContact.firstName()).isEqualTo("Alex")
        assertThat(billingContact.lastName()).isEqualTo("Bill")
        assertThat(billingContact.phoneNumber()).isEqualTo("+13125550001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingContact =
            BillingContact.builder()
                .email("billing@acmeplumbing.example.com")
                .firstName("Alex")
                .lastName("Bill")
                .phoneNumber("+13125550001")
                .build()

        val roundtrippedBillingContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingContact),
                jacksonTypeRef<BillingContact>(),
            )

        assertThat(roundtrippedBillingContact).isEqualTo(billingContact)
    }
}
