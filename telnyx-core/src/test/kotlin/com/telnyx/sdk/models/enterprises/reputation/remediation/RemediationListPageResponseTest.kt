// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationListPageResponseTest {

    @Test
    fun create() {
        val remediationListPageResponse =
            RemediationListPageResponse.builder()
                .addData(
                    RemediationListResponse.builder()
                        .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                        .callPurpose("Appointment reminders for our dental clinic.")
                        .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                        .phoneNumbersCount(2L)
                        .status(RemediationListResponse.Status.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                        .tier1CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tier2CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    RemediationListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(remediationListPageResponse.data())
            .containsExactly(
                RemediationListResponse.builder()
                    .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                    .callPurpose("Appointment reminders for our dental clinic.")
                    .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                    .phoneNumbersCount(2L)
                    .status(RemediationListResponse.Status.IN_PROGRESS)
                    .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                    .tier1CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tier2CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(remediationListPageResponse.meta())
            .isEqualTo(
                RemediationListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val remediationListPageResponse =
            RemediationListPageResponse.builder()
                .addData(
                    RemediationListResponse.builder()
                        .id("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                        .callPurpose("Appointment reminders for our dental clinic.")
                        .createdAt(OffsetDateTime.parse("2026-06-01T12:00:00Z"))
                        .phoneNumbersCount(2L)
                        .status(RemediationListResponse.Status.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2026-06-01T12:05:00Z"))
                        .tier1CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tier2CompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    RemediationListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedRemediationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(remediationListPageResponse),
                jacksonTypeRef<RemediationListPageResponse>(),
            )

        assertThat(roundtrippedRemediationListPageResponse).isEqualTo(remediationListPageResponse)
    }
}
