// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationchannels

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationChannelUpdateParamsTest {

    @Test
    fun create() {
        NotificationChannelUpdateParams.builder()
            .notificationChannelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .notificationChannel(
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
    }

    @Test
    fun pathParams() {
        val params =
            NotificationChannelUpdateParams.builder()
                .notificationChannelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .notificationChannel(NotificationChannel.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NotificationChannelUpdateParams.builder()
                .notificationChannelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .notificationChannel(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationChannelUpdateParams.builder()
                .notificationChannelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .notificationChannel(NotificationChannel.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(NotificationChannel.builder().build())
    }
}
