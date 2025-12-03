// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationChannelListPageResponseTest {

    @Test
    fun create() {
        val notificationChannelListPageResponse =
            NotificationChannelListPageResponse.builder()
                .addData(
                    NotificationChannel.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .channelDestination("+13125550000")
                        .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
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

        assertThat(notificationChannelListPageResponse.data().getOrNull())
            .containsExactly(
                NotificationChannel.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .channelDestination("+13125550000")
                    .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
        assertThat(notificationChannelListPageResponse.meta())
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
        val notificationChannelListPageResponse =
            NotificationChannelListPageResponse.builder()
                .addData(
                    NotificationChannel.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .channelDestination("+13125550000")
                        .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
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

        val roundtrippedNotificationChannelListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationChannelListPageResponse),
                jacksonTypeRef<NotificationChannelListPageResponse>(),
            )

        assertThat(roundtrippedNotificationChannelListPageResponse)
            .isEqualTo(notificationChannelListPageResponse)
    }
}
