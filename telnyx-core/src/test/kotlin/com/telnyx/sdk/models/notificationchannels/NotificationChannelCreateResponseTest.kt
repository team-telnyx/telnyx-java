// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationChannelCreateResponseTest {

    @Test
    fun create() {
        val notificationChannelCreateResponse =
            NotificationChannelCreateResponse.builder()
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

        assertThat(notificationChannelCreateResponse.data())
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
        val notificationChannelCreateResponse =
            NotificationChannelCreateResponse.builder()
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

        val roundtrippedNotificationChannelCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationChannelCreateResponse),
                jacksonTypeRef<NotificationChannelCreateResponse>(),
            )

        assertThat(roundtrippedNotificationChannelCreateResponse)
            .isEqualTo(notificationChannelCreateResponse)
    }
}
