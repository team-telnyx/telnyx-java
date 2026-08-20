// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationRequestTest {

    @Test
    fun create() {
        val remediationRequest =
            RemediationRequest.builder()
                .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                .callPurpose("Appointment reminders for our dental clinic.")
                .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                .phoneNumbersCount(2L)
                .phoneNumbersIneligible(0L)
                .phoneNumbersSubmitted(2L)
                .status(RemediationStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                .contactEmail("ops@example.com")
                .results(
                    RemediationPerNumberResults.builder()
                        .addIneligible("string")
                        .addNotFlagged("string")
                        .addRefused("string")
                        .addRemediated("+19493253498")
                        .addRequiresReview("string")
                        .build()
                )
                .tier1CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tier2CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookUrl("https://example.com/webhooks/remediation")
                .build()

        assertThat(remediationRequest.id()).isEqualTo("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
        assertThat(remediationRequest.callPurpose())
            .isEqualTo("Appointment reminders for our dental clinic.")
        assertThat(remediationRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
        assertThat(remediationRequest.phoneNumbersCount()).isEqualTo(2L)
        assertThat(remediationRequest.phoneNumbersIneligible()).isEqualTo(0L)
        assertThat(remediationRequest.phoneNumbersSubmitted()).isEqualTo(2L)
        assertThat(remediationRequest.status()).isEqualTo(RemediationStatus.IN_PROGRESS)
        assertThat(remediationRequest.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
        assertThat(remediationRequest.contactEmail()).contains("ops@example.com")
        assertThat(remediationRequest.results())
            .contains(
                RemediationPerNumberResults.builder()
                    .addIneligible("string")
                    .addNotFlagged("string")
                    .addRefused("string")
                    .addRemediated("+19493253498")
                    .addRequiresReview("string")
                    .build()
            )
        assertThat(remediationRequest.tier1CompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(remediationRequest.tier2CompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(remediationRequest.webhookUrl())
            .contains("https://example.com/webhooks/remediation")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val remediationRequest =
            RemediationRequest.builder()
                .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                .callPurpose("Appointment reminders for our dental clinic.")
                .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                .phoneNumbersCount(2L)
                .phoneNumbersIneligible(0L)
                .phoneNumbersSubmitted(2L)
                .status(RemediationStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                .contactEmail("ops@example.com")
                .results(
                    RemediationPerNumberResults.builder()
                        .addIneligible("string")
                        .addNotFlagged("string")
                        .addRefused("string")
                        .addRemediated("+19493253498")
                        .addRequiresReview("string")
                        .build()
                )
                .tier1CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tier2CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookUrl("https://example.com/webhooks/remediation")
                .build()

        val roundtrippedRemediationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(remediationRequest),
                jacksonTypeRef<RemediationRequest>(),
            )

        assertThat(roundtrippedRemediationRequest).isEqualTo(remediationRequest)
    }
}
