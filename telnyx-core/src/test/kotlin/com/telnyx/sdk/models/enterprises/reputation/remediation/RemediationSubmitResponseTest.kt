// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationSubmitResponseTest {

    @Test
    fun create() {
        val remediationSubmitResponse =
            RemediationSubmitResponse.builder()
                .data(
                    RemediationSubmitResponse.Data.builder()
                        .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                        .callPurpose("Appointment reminders for our dental clinic.")
                        .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                        .phoneNumbersCount(2L)
                        .phoneNumbersIneligible(0L)
                        .phoneNumbersSubmitted(2L)
                        .status(RemediationSubmitResponse.Data.Status.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                        .contactEmail("ops@example.com")
                        .results(
                            RemediationSubmitResponse.Data.Results.builder()
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
                )
                .build()

        assertThat(remediationSubmitResponse.data())
            .isEqualTo(
                RemediationSubmitResponse.Data.builder()
                    .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                    .callPurpose("Appointment reminders for our dental clinic.")
                    .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                    .phoneNumbersCount(2L)
                    .phoneNumbersIneligible(0L)
                    .phoneNumbersSubmitted(2L)
                    .status(RemediationSubmitResponse.Data.Status.IN_PROGRESS)
                    .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                    .contactEmail("ops@example.com")
                    .results(
                        RemediationSubmitResponse.Data.Results.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val remediationSubmitResponse =
            RemediationSubmitResponse.builder()
                .data(
                    RemediationSubmitResponse.Data.builder()
                        .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                        .callPurpose("Appointment reminders for our dental clinic.")
                        .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                        .phoneNumbersCount(2L)
                        .phoneNumbersIneligible(0L)
                        .phoneNumbersSubmitted(2L)
                        .status(RemediationSubmitResponse.Data.Status.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                        .contactEmail("ops@example.com")
                        .results(
                            RemediationSubmitResponse.Data.Results.builder()
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
                )
                .build()

        val roundtrippedRemediationSubmitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(remediationSubmitResponse),
                jacksonTypeRef<RemediationSubmitResponse>(),
            )

        assertThat(roundtrippedRemediationSubmitResponse).isEqualTo(remediationSubmitResponse)
    }
}
