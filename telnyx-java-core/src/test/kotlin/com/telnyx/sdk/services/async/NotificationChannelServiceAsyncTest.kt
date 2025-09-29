// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.notificationchannels.NotificationChannel
import com.telnyx.sdk.models.notificationchannels.NotificationChannelListParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationChannelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val notificationChannelFuture =
            notificationChannelServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val notificationChannel = notificationChannelFuture.get()
        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val notificationChannelFuture =
            notificationChannelServiceAsync.update(
                NotificationChannelUpdateParams.builder()
                    .pathId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val notificationChannelsFuture =
            notificationChannelServiceAsync.list(
                NotificationChannelListParams.builder()
                    .filter(
                        NotificationChannelListParams.Filter.builder()
                            .associatedRecordType(
                                NotificationChannelListParams.Filter.AssociatedRecordType.builder()
                                    .eq(
                                        NotificationChannelListParams.Filter.AssociatedRecordType.Eq
                                            .PHONE_NUMBER
                                    )
                                    .build()
                            )
                            .channelTypeId(
                                NotificationChannelListParams.Filter.ChannelTypeId.builder()
                                    .eq(
                                        NotificationChannelListParams.Filter.ChannelTypeId.Eq
                                            .WEBHOOK
                                    )
                                    .build()
                            )
                            .notificationChannel(
                                NotificationChannelListParams.Filter.NotificationChannel.builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .notificationEventConditionId(
                                NotificationChannelListParams.Filter.NotificationEventConditionId
                                    .builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .notificationProfileId(
                                NotificationChannelListParams.Filter.NotificationProfileId.builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .status(
                                NotificationChannelListParams.Filter.Status.builder()
                                    .eq(
                                        NotificationChannelListParams.Filter.Status.Eq
                                            .ENABLE_RECEIVED
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .page(NotificationChannelListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val notificationChannels = notificationChannelsFuture.get()
        notificationChannels.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationChannelServiceAsync = client.notificationChannels()

        val notificationChannelFuture =
            notificationChannelServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val notificationChannel = notificationChannelFuture.get()
        notificationChannel.validate()
    }
}
