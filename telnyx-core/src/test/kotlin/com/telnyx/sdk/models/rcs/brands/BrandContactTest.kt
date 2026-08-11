// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandContactTest {

    @Test
    fun create() {
        val brandContact =
            BrandContact.builder()
                .contactType(BrandContact.ContactType.BRAND)
                .email("dev@stainless.com")
                .firstName("x")
                .lastName("x")
                .phoneNumber("+49605132")
                .title("x")
                .build()

        assertThat(brandContact.contactType()).isEqualTo(BrandContact.ContactType.BRAND)
        assertThat(brandContact.email()).isEqualTo("dev@stainless.com")
        assertThat(brandContact.firstName()).isEqualTo("x")
        assertThat(brandContact.lastName()).isEqualTo("x")
        assertThat(brandContact.phoneNumber()).isEqualTo("+49605132")
        assertThat(brandContact.title()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandContact =
            BrandContact.builder()
                .contactType(BrandContact.ContactType.BRAND)
                .email("dev@stainless.com")
                .firstName("x")
                .lastName("x")
                .phoneNumber("+49605132")
                .title("x")
                .build()

        val roundtrippedBrandContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandContact),
                jacksonTypeRef<BrandContact>(),
            )

        assertThat(roundtrippedBrandContact).isEqualTo(brandContact)
    }
}
