// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateVerificationResponseTest {

    @Test
    fun create() {
        val createVerificationResponse =
            CreateVerificationResponse.builder()
                .data(
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
                .build()

        assertThat(createVerificationResponse.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createVerificationResponse =
            CreateVerificationResponse.builder()
                .data(
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
                .build()

        val roundtrippedCreateVerificationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createVerificationResponse),
                jacksonTypeRef<CreateVerificationResponse>(),
            )

        assertThat(roundtrippedCreateVerificationResponse).isEqualTo(createVerificationResponse)
    }
}
