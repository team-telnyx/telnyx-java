// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationChannelUpdateResponseTest {

    @Test
    fun create() {
        val notificationChannelUpdateResponse =
            NotificationChannelUpdateResponse.builder()
                .data(
                    NotificationChannel.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .channelDestination("+13125550000")
                        .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        assertThat(notificationChannelUpdateResponse.data())
            .contains(
                NotificationChannel.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .channelDestination("+13125550000")
                    .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationChannelUpdateResponse =
            NotificationChannelUpdateResponse.builder()
                .data(
                    NotificationChannel.builder()
                        .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .channelDestination("+13125550000")
                        .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                        .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                        .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                        .build()
                )
                .build()

        val roundtrippedNotificationChannelUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationChannelUpdateResponse),
                jacksonTypeRef<NotificationChannelUpdateResponse>(),
            )

        assertThat(roundtrippedNotificationChannelUpdateResponse)
            .isEqualTo(notificationChannelUpdateResponse)
    }
}
