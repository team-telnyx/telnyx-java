// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationProfileListPageResponseTest {

    @Test
    fun create() {
        val notificationProfileListPageResponse =
            NotificationProfileListPageResponse.builder()
                .addData(
                    NotificationProfile.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(notificationProfileListPageResponse.data().getOrNull())
            .containsExactly(
                NotificationProfile.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
        assertThat(notificationProfileListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationProfileListPageResponse =
            NotificationProfileListPageResponse.builder()
                .addData(
                    NotificationProfile.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedNotificationProfileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationProfileListPageResponse),
                jacksonTypeRef<NotificationProfileListPageResponse>(),
            )

        assertThat(roundtrippedNotificationProfileListPageResponse)
            .isEqualTo(notificationProfileListPageResponse)
    }
}
