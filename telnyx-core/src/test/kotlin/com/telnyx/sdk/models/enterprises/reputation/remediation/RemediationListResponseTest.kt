// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationListResponseTest {

    @Test
    fun create() {
        val remediationListResponse =
            RemediationListResponse.builder()
                .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                .callPurpose("Appointment reminders for our dental clinic.")
                .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                .phoneNumbersCount(2L)
                .status(RemediationStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                .tier1CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tier2CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(remediationListResponse.id()).isEqualTo("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
        assertThat(remediationListResponse.callPurpose())
            .isEqualTo("Appointment reminders for our dental clinic.")
        assertThat(remediationListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
        assertThat(remediationListResponse.phoneNumbersCount()).isEqualTo(2L)
        assertThat(remediationListResponse.status()).isEqualTo(RemediationStatus.IN_PROGRESS)
        assertThat(remediationListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
        assertThat(remediationListResponse.tier1CompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(remediationListResponse.tier2CompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val remediationListResponse =
            RemediationListResponse.builder()
                .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                .callPurpose("Appointment reminders for our dental clinic.")
                .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                .phoneNumbersCount(2L)
                .status(RemediationStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                .tier1CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tier2CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRemediationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(remediationListResponse),
                jacksonTypeRef<RemediationListResponse>(),
            )

        assertThat(roundtrippedRemediationListResponse).isEqualTo(remediationListResponse)
    }
}
