// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailUnsubscribeGroupListPageResponseTest {

    @Test
    fun create() {
        val emailUnsubscribeGroupListPageResponse =
            EmailUnsubscribeGroupListPageResponse.builder()
                .addData(
                    UnsubscribeGroup.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("x")
                        .recordType(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        assertThat(emailUnsubscribeGroupListPageResponse.data())
            .containsExactly(
                UnsubscribeGroup.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .name("x")
                    .recordType(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(emailUnsubscribeGroupListPageResponse.meta())
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
        val emailUnsubscribeGroupListPageResponse =
            EmailUnsubscribeGroupListPageResponse.builder()
                .addData(
                    UnsubscribeGroup.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("x")
                        .recordType(UnsubscribeGroup.RecordType.EMAIL_UNSUBSCRIBE_GROUP)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        val roundtrippedEmailUnsubscribeGroupListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailUnsubscribeGroupListPageResponse),
                jacksonTypeRef<EmailUnsubscribeGroupListPageResponse>(),
            )

        assertThat(roundtrippedEmailUnsubscribeGroupListPageResponse)
            .isEqualTo(emailUnsubscribeGroupListPageResponse)
    }
}
