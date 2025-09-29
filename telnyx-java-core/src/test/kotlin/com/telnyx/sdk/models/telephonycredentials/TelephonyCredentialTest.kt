// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialTest {

    @Test
    fun create() {
        val telephonyCredential =
            TelephonyCredential.builder()
                .id("c215ade3-0d39-418e-94be-c5f780760199")
                .createdAt("2020-06-18T21:32:38")
                .expired(true)
                .expiresAt("2042-06-18T21:32:38")
                .name("2020-06-18 21:32:38.917732Z")
                .recordType("credential")
                .resourceId("connection:804252963366242252")
                .sipPassword("a92dbcfb60184a8cb330b0acb2f7617b")
                .sipUsername("gencrednCvHU5IYpSBPPsXI2iQsDX")
                .updatedAt("2020-06-18T21:32:38.000Z")
                .build()

        assertThat(telephonyCredential.id()).contains("c215ade3-0d39-418e-94be-c5f780760199")
        assertThat(telephonyCredential.createdAt()).contains("2020-06-18T21:32:38")
        assertThat(telephonyCredential.expired()).contains(true)
        assertThat(telephonyCredential.expiresAt()).contains("2042-06-18T21:32:38")
        assertThat(telephonyCredential.name()).contains("2020-06-18 21:32:38.917732Z")
        assertThat(telephonyCredential.recordType()).contains("credential")
        assertThat(telephonyCredential.resourceId()).contains("connection:804252963366242252")
        assertThat(telephonyCredential.sipPassword()).contains("a92dbcfb60184a8cb330b0acb2f7617b")
        assertThat(telephonyCredential.sipUsername()).contains("gencrednCvHU5IYpSBPPsXI2iQsDX")
        assertThat(telephonyCredential.updatedAt()).contains("2020-06-18T21:32:38.000Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telephonyCredential =
            TelephonyCredential.builder()
                .id("c215ade3-0d39-418e-94be-c5f780760199")
                .createdAt("2020-06-18T21:32:38")
                .expired(true)
                .expiresAt("2042-06-18T21:32:38")
                .name("2020-06-18 21:32:38.917732Z")
                .recordType("credential")
                .resourceId("connection:804252963366242252")
                .sipPassword("a92dbcfb60184a8cb330b0acb2f7617b")
                .sipUsername("gencrednCvHU5IYpSBPPsXI2iQsDX")
                .updatedAt("2020-06-18T21:32:38.000Z")
                .build()

        val roundtrippedTelephonyCredential =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telephonyCredential),
                jacksonTypeRef<TelephonyCredential>(),
            )

        assertThat(roundtrippedTelephonyCredential).isEqualTo(telephonyCredential)
    }
}
