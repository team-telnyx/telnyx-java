// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationTest {

    @Test
    fun create() {
        val verification =
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

        assertThat(verification.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(verification.createdAt()).contains("2020-09-14T17:03:32.965812")
        assertThat(verification.customCode()).contains("43612")
        assertThat(verification.phoneNumber()).contains("+13035551234")
        assertThat(verification.recordType()).contains(Verification.RecordType.VERIFICATION)
        assertThat(verification.status()).contains(Verification.Status.ACCEPTED)
        assertThat(verification.timeoutSecs()).contains(300L)
        assertThat(verification.type()).contains(Verification.Type.SMS)
        assertThat(verification.updatedAt()).contains("2020-09-14T17:03:32.965812")
        assertThat(verification.verifyProfileId()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verification =
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

        val roundtrippedVerification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verification),
                jacksonTypeRef<Verification>(),
            )

        assertThat(roundtrippedVerification).isEqualTo(verification)
    }
}
