// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.notificationchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationChannelListResponseTest {

    @Test
    fun create() {
        val notificationChannelListResponse =
            NotificationChannelListResponse.builder()
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

        assertThat(notificationChannelListResponse.data().getOrNull())
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
        assertThat(notificationChannelListResponse.meta())
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
        val notificationChannelListResponse =
            NotificationChannelListResponse.builder()
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

        val roundtrippedNotificationChannelListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationChannelListResponse),
                jacksonTypeRef<NotificationChannelListResponse>(),
            )

        assertThat(roundtrippedNotificationChannelListResponse)
            .isEqualTo(notificationChannelListResponse)
    }
}
