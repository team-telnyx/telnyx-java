// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.notificationchannels.NotificationChannel
import com.telnyx.sdk.models.notificationchannels.NotificationChannelUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NotificationChannelServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val notificationChannelService = client.notificationChannels()

        val notificationChannel =
            notificationChannelService.create(
                NotificationChannel.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .channelDestination("+13125550000")
                    .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )

        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val notificationChannelService = client.notificationChannels()

        val notificationChannel =
            notificationChannelService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val notificationChannelService = client.notificationChannels()

        val notificationChannel =
            notificationChannelService.update(
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
            )

        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val notificationChannelService = client.notificationChannels()

        val page = notificationChannelService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val notificationChannelService = client.notificationChannels()

        val notificationChannel =
            notificationChannelService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        notificationChannel.validate()
    }
}
