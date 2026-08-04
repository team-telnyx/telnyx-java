// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups.suppressions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailblocks.EmailBlock
import com.telnyx.sdk.models.emailunsubscribegroups.GroupListMeta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SuppressionListPageResponseTest {

    @Test
    fun create() {
        val suppressionListPageResponse =
            SuppressionListPageResponse.builder()
                .addData(
                    EmailBlock.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason(EmailBlock.Reason.HARD_BOUNCE)
                        .recordType(EmailBlock.RecordType.EMAIL_BLOCK)
                        .scope(EmailBlock.Scope.ACCOUNT)
                        .source(EmailBlock.Source.FEEDBACK)
                        .status(EmailBlock.Status.ACTIVE)
                        .to("to")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .from("from")
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .meta(
                    GroupListMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(suppressionListPageResponse.data())
            .containsExactly(
                EmailBlock.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .reason(EmailBlock.Reason.HARD_BOUNCE)
                    .recordType(EmailBlock.RecordType.EMAIL_BLOCK)
                    .scope(EmailBlock.Scope.ACCOUNT)
                    .source(EmailBlock.Source.FEEDBACK)
                    .status(EmailBlock.Status.ACTIVE)
                    .to("to")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .from("from")
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(suppressionListPageResponse.meta())
            .isEqualTo(
                GroupListMeta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val suppressionListPageResponse =
            SuppressionListPageResponse.builder()
                .addData(
                    EmailBlock.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason(EmailBlock.Reason.HARD_BOUNCE)
                        .recordType(EmailBlock.RecordType.EMAIL_BLOCK)
                        .scope(EmailBlock.Scope.ACCOUNT)
                        .source(EmailBlock.Source.FEEDBACK)
                        .status(EmailBlock.Status.ACTIVE)
                        .to("to")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .from("from")
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .meta(
                    GroupListMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedSuppressionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(suppressionListPageResponse),
                jacksonTypeRef<SuppressionListPageResponse>(),
            )

        assertThat(roundtrippedSuppressionListPageResponse).isEqualTo(suppressionListPageResponse)
    }
}
