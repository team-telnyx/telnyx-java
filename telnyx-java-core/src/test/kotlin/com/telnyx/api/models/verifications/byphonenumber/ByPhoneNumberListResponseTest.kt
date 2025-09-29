// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifications.byphonenumber

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.verifications.Verification
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ByPhoneNumberListResponseTest {

    @Test
    fun create() {
        val byPhoneNumberListResponse =
            ByPhoneNumberListResponse.builder()
                .addData(
                    Verification.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .createdAt("2020-09-14T17:03:32.965812")
                        .customCode("43612")
                        .phoneNumber("+13035551234")
                        .recordType(Verification.RecordType.VERIFICATION)
                        .status(Verification.Status.ACCEPTED)
                        .timeoutSecs(300L)
                        .type(Verification.Type.SMS)
                        .updatedAt("2020-09-14T17:03:32.965812")
                        .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .build()
                )
                .meta(
                    ByPhoneNumberListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(byPhoneNumberListResponse.data())
            .containsExactly(
                Verification.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .createdAt("2020-09-14T17:03:32.965812")
                    .customCode("43612")
                    .phoneNumber("+13035551234")
                    .recordType(Verification.RecordType.VERIFICATION)
                    .status(Verification.Status.ACCEPTED)
                    .timeoutSecs(300L)
                    .type(Verification.Type.SMS)
                    .updatedAt("2020-09-14T17:03:32.965812")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .build()
            )
        assertThat(byPhoneNumberListResponse.meta())
            .isEqualTo(
                ByPhoneNumberListResponse.Meta.builder()
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
        val byPhoneNumberListResponse =
            ByPhoneNumberListResponse.builder()
                .addData(
                    Verification.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .createdAt("2020-09-14T17:03:32.965812")
                        .customCode("43612")
                        .phoneNumber("+13035551234")
                        .recordType(Verification.RecordType.VERIFICATION)
                        .status(Verification.Status.ACCEPTED)
                        .timeoutSecs(300L)
                        .type(Verification.Type.SMS)
                        .updatedAt("2020-09-14T17:03:32.965812")
                        .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .build()
                )
                .meta(
                    ByPhoneNumberListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedByPhoneNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(byPhoneNumberListResponse),
                jacksonTypeRef<ByPhoneNumberListResponse>(),
            )

        assertThat(roundtrippedByPhoneNumberListResponse).isEqualTo(byPhoneNumberListResponse)
    }
}
