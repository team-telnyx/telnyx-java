// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationEventListResponseTest {

    @Test
    fun create() {
        val notificationEventListResponse =
            NotificationEventListResponse.builder()
                .addData(
                    NotificationEventListResponse.Data.builder()
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

        assertThat(notificationEventListResponse.data().getOrNull())
            .containsExactly(
                NotificationEventListResponse.Data.builder()
                    .id("d5c395cd-9864-4609-b5e2-3f9fd4ce201a")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .enabled(true)
                    .name("Emergency Number Dialed")
                    .notificationCategory("Calls")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
        assertThat(notificationEventListResponse.meta())
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
        val notificationEventListResponse =
            NotificationEventListResponse.builder()
                .addData(
                    NotificationEventListResponse.Data.builder()
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

        val roundtrippedNotificationEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationEventListResponse),
                jacksonTypeRef<NotificationEventListResponse>(),
            )

        assertThat(roundtrippedNotificationEventListResponse)
            .isEqualTo(notificationEventListResponse)
    }
}
