// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationChannelTest {

    @Test
    fun create() {
        val notificationChannel =
            NotificationChannel.builder()
                .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .channelDestination("+13125550000")
                .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        assertThat(notificationChannel.id()).contains("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
        assertThat(notificationChannel.channelDestination()).contains("+13125550000")
        assertThat(notificationChannel.channelTypeId())
            .contains(NotificationChannel.ChannelTypeId.SMS)
        assertThat(notificationChannel.createdAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
        assertThat(notificationChannel.notificationProfileId())
            .contains("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
        assertThat(notificationChannel.updatedAt())
            .contains(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationChannel =
            NotificationChannel.builder()
                .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .channelDestination("+13125550000")
                .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                .build()

        val roundtrippedNotificationChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationChannel),
                jacksonTypeRef<NotificationChannel>(),
            )

        assertThat(roundtrippedNotificationChannel).isEqualTo(notificationChannel)
    }
}
