// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.notificationchannels.NotificationChannel
import com.telnyx.api.models.notificationchannels.NotificationChannelListParams
import com.telnyx.api.models.notificationchannels.NotificationChannelUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationChannelServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationChannelService = client.notificationChannels()

        val notificationChannel =
            notificationChannelService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationChannelService = client.notificationChannels()

        val notificationChannel =
            notificationChannelService.update(
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

        notificationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationChannelService = client.notificationChannels()

        val notificationChannels =
            notificationChannelService.list(
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

        notificationChannels.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationChannelService = client.notificationChannels()

        val notificationChannel =
            notificationChannelService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        notificationChannel.validate()
    }
}
