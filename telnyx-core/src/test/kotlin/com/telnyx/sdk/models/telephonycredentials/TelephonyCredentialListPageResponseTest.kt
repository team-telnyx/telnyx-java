// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialListPageResponseTest {

    @Test
    fun create() {
        val telephonyCredentialListPageResponse =
            TelephonyCredentialListPageResponse.builder()
                .addData(
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
                        .userId("user-id")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(telephonyCredentialListPageResponse.data().getOrNull())
            .containsExactly(
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
                    .userId("user-id")
                    .build()
            )
        assertThat(telephonyCredentialListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telephonyCredentialListPageResponse =
            TelephonyCredentialListPageResponse.builder()
                .addData(
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
                        .userId("user-id")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedTelephonyCredentialListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telephonyCredentialListPageResponse),
                jacksonTypeRef<TelephonyCredentialListPageResponse>(),
            )

        assertThat(roundtrippedTelephonyCredentialListPageResponse)
            .isEqualTo(telephonyCredentialListPageResponse)
    }
}
