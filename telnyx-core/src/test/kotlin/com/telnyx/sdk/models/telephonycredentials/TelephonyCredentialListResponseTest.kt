// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialListResponseTest {

    @Test
    fun create() {
        val telephonyCredentialListResponse =
            TelephonyCredentialListResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(telephonyCredentialListResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(telephonyCredentialListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telephonyCredentialListResponse =
            TelephonyCredentialListResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedTelephonyCredentialListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telephonyCredentialListResponse),
                jacksonTypeRef<TelephonyCredentialListResponse>(),
            )

        assertThat(roundtrippedTelephonyCredentialListResponse)
            .isEqualTo(telephonyCredentialListResponse)
    }
}
