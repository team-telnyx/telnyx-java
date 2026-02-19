// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.notificationchannels.NotificationChannel
import com.telnyx.sdk.models.notificationchannels.NotificationChannelUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NotificationChannelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val notificationChannelFuture =
            notificationChannelServiceAsync.create(
                NotificationChannel.builder()
                    .id("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .channelDestination("+13125550000")
                    .channelTypeId(NotificationChannel.ChannelTypeId.SMS)
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )

        val notificationChannel = notificationChannelFuture.get()
        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val notificationChannelFuture =
            notificationChannelServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val notificationChannel = notificationChannelFuture.get()
        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val notificationChannelFuture =
            notificationChannelServiceAsync.update(
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

        val notificationChannel = notificationChannelFuture.get()
        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val pageFuture = notificationChannelServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val notificationChannelFuture =
            notificationChannelServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val notificationChannel = notificationChannelFuture.get()
        notificationChannel.validate()
    }
}
