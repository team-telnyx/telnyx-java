// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationEventListPageResponseTest {

    @Test
    fun create() {
        val notificationEventListPageResponse =
            NotificationEventListPageResponse.builder()
                .addData(
                    NotificationEventListResponse.builder()
                        .id("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .enabled(true)
                        .name("Emergency Number Dialed")
                        .notificationCategory("Calls")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(notificationEventListPageResponse.data().getOrNull())
            .containsExactly(
                NotificationEventListResponse.builder()
                    .id("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .enabled(true)
                    .name("Emergency Number Dialed")
                    .notificationCategory("Calls")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
        assertThat(notificationEventListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationEventListPageResponse =
            NotificationEventListPageResponse.builder()
                .addData(
                    NotificationEventListResponse.builder()
                        .id("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .enabled(true)
                        .name("Emergency Number Dialed")
                        .notificationCategory("Calls")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedNotificationEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationEventListPageResponse),
                jacksonTypeRef<NotificationEventListPageResponse>(),
            )

        assertThat(roundtrippedNotificationEventListPageResponse)
            .isEqualTo(notificationEventListPageResponse)
    }
}
