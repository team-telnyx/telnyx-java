// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationCreateResponseTest {

    @Test
    fun create() {
        val remediationCreateResponse =
            RemediationCreateResponse.builder()
                .data(
                    RemediationCreateResponse.Data.builder()
                        .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                        .callPurpose("Appointment reminders for our dental clinic.")
                        .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                        .phoneNumbersCount(2L)
                        .phoneNumbersIneligible(0L)
                        .phoneNumbersSubmitted(2L)
                        .status(RemediationCreateResponse.Data.Status.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                        .contactEmail("ops@example.com")
                        .results(
                            RemediationCreateResponse.Data.Results.builder()
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

        assertThat(remediationCreateResponse.data())
            .isEqualTo(
                RemediationCreateResponse.Data.builder()
                    .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                    .callPurpose("Appointment reminders for our dental clinic.")
                    .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                    .phoneNumbersCount(2L)
                    .phoneNumbersIneligible(0L)
                    .phoneNumbersSubmitted(2L)
                    .status(RemediationCreateResponse.Data.Status.IN_PROGRESS)
                    .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                    .contactEmail("ops@example.com")
                    .results(
                        RemediationCreateResponse.Data.Results.builder()
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
        val remediationCreateResponse =
            RemediationCreateResponse.builder()
                .data(
                    RemediationCreateResponse.Data.builder()
                        .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                        .callPurpose("Appointment reminders for our dental clinic.")
                        .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                        .phoneNumbersCount(2L)
                        .phoneNumbersIneligible(0L)
                        .phoneNumbersSubmitted(2L)
                        .status(RemediationCreateResponse.Data.Status.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                        .contactEmail("ops@example.com")
                        .results(
                            RemediationCreateResponse.Data.Results.builder()
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

        val roundtrippedRemediationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(remediationCreateResponse),
                jacksonTypeRef<RemediationCreateResponse>(),
            )

        assertThat(roundtrippedRemediationCreateResponse).isEqualTo(remediationCreateResponse)
    }
}
