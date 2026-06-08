// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationRetrieveResponseTest {

    @Test
    fun create() {
        val remediationRetrieveResponse =
            RemediationRetrieveResponse.builder()
                .data(
                    RemediationRetrieveResponse.Data.builder()
                        .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                        .callPurpose("Appointment reminders for our dental clinic.")
                        .contactEmail("ops@example.com")
                        .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                        .phoneNumbersCount(2L)
                        .phoneNumbersIneligible(0L)
                        .phoneNumbersSubmitted(2L)
                        .status(RemediationRetrieveResponse.Data.Status.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                        .results(
                            RemediationRetrieveResponse.Data.Results.builder()
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

        assertThat(remediationRetrieveResponse.data())
            .isEqualTo(
                RemediationRetrieveResponse.Data.builder()
                    .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                    .callPurpose("Appointment reminders for our dental clinic.")
                    .contactEmail("ops@example.com")
                    .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                    .phoneNumbersCount(2L)
                    .phoneNumbersIneligible(0L)
                    .phoneNumbersSubmitted(2L)
                    .status(RemediationRetrieveResponse.Data.Status.IN_PROGRESS)
                    .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                    .results(
                        RemediationRetrieveResponse.Data.Results.builder()
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
        val remediationRetrieveResponse =
            RemediationRetrieveResponse.builder()
                .data(
                    RemediationRetrieveResponse.Data.builder()
                        .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                        .callPurpose("Appointment reminders for our dental clinic.")
                        .contactEmail("ops@example.com")
                        .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                        .phoneNumbersCount(2L)
                        .phoneNumbersIneligible(0L)
                        .phoneNumbersSubmitted(2L)
                        .status(RemediationRetrieveResponse.Data.Status.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                        .results(
                            RemediationRetrieveResponse.Data.Results.builder()
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

        val roundtrippedRemediationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(remediationRetrieveResponse),
                jacksonTypeRef<RemediationRetrieveResponse>(),
            )

        assertThat(roundtrippedRemediationRetrieveResponse).isEqualTo(remediationRetrieveResponse)
    }
}
