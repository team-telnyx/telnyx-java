// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialDeleteResponseTest {

    @Test
    fun create() {
        val telephonyCredentialDeleteResponse =
            TelephonyCredentialDeleteResponse.builder()
                .data(
                    TelephonyCredential.builder()
                        .id("c215ade3-0d39-418e-94be-c5f780760199")
                        .createdAt("2020-06-18T21:32:38")
                        .expired(false)
                        .expiresAt("2042-06-18T21:32:38")
                        .name("2020-06-18 21:32:38.917732Z")
                        .recordType("credential")
                        .resourceId("connection:804252963366242252")
                        .sipPassword("a92dbcfb60184a8cb330b0acb2f7617b")
                        .sipUsername("gencrednCvHU5IYpSBPPsXI2iQsDX")
                        .updatedAt("2020-06-18T21:32:38.000Z")
                        .build()
                )
                .build()

        assertThat(telephonyCredentialDeleteResponse.data())
            .contains(
                TelephonyCredential.builder()
                    .id("c215ade3-0d39-418e-94be-c5f780760199")
                    .createdAt("2020-06-18T21:32:38")
                    .expired(false)
                    .expiresAt("2042-06-18T21:32:38")
                    .name("2020-06-18 21:32:38.917732Z")
                    .recordType("credential")
                    .resourceId("connection:804252963366242252")
                    .sipPassword("a92dbcfb60184a8cb330b0acb2f7617b")
                    .sipUsername("gencrednCvHU5IYpSBPPsXI2iQsDX")
                    .updatedAt("2020-06-18T21:32:38.000Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telephonyCredentialDeleteResponse =
            TelephonyCredentialDeleteResponse.builder()
                .data(
                    TelephonyCredential.builder()
                        .id("c215ade3-0d39-418e-94be-c5f780760199")
                        .createdAt("2020-06-18T21:32:38")
                        .expired(false)
                        .expiresAt("2042-06-18T21:32:38")
                        .name("2020-06-18 21:32:38.917732Z")
                        .recordType("credential")
                        .resourceId("connection:804252963366242252")
                        .sipPassword("a92dbcfb60184a8cb330b0acb2f7617b")
                        .sipUsername("gencrednCvHU5IYpSBPPsXI2iQsDX")
                        .updatedAt("2020-06-18T21:32:38.000Z")
                        .build()
                )
                .build()

        val roundtrippedTelephonyCredentialDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telephonyCredentialDeleteResponse),
                jacksonTypeRef<TelephonyCredentialDeleteResponse>(),
            )

        assertThat(roundtrippedTelephonyCredentialDeleteResponse)
            .isEqualTo(telephonyCredentialDeleteResponse)
    }
}
