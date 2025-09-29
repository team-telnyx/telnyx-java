// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.notificationsettings.NotificationSetting
import com.telnyx.api.models.notificationsettings.NotificationSettingListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationSettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationSettingServiceAsync = client.notificationSettings()

        val notificationSettingFuture =
            notificationSettingServiceAsync.create(
                NotificationSetting.builder()
                    .id("8eb5b5f9-5893-423c-9f15-b487713d44d4")
                    .associatedRecordType("phone_number")
                    .associatedRecordTypeValue("+13125550000")
                    .createdAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .notificationChannelId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .notificationEventConditionId("70c7c5cb-dce2-4124-accb-870d39dbe852")
                    .notificationProfileId("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                    .addParameter(
                        NotificationSetting.Parameter.builder()
                            .name("phone_number")
                            .value("+13125550000")
                            .build()
                    )
                    .status(NotificationSetting.Status.ENABLE_RECEIVED)
                    .updatedAt(OffsetDateTime.parse("2019-10-15T10:07:15.527Z"))
                    .build()
            )

        val notificationSetting = notificationSettingFuture.get()
        notificationSetting.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationSettingServiceAsync = client.notificationSettings()

        val notificationSettingFuture =
            notificationSettingServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val notificationSetting = notificationSettingFuture.get()
        notificationSetting.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationSettingServiceAsync = client.notificationSettings()

        val notificationSettingsFuture =
            notificationSettingServiceAsync.list(
                NotificationSettingListParams.builder()
                    .filter(
                        NotificationSettingListParams.Filter.builder()
                            .associatedRecordType(
                                NotificationSettingListParams.Filter.AssociatedRecordType.builder()
                                    .eq(
                                        NotificationSettingListParams.Filter.AssociatedRecordType.Eq
                                            .PHONE_NUMBER
                                    )
                                    .build()
                            )
                            .channelTypeId(
                                NotificationSettingListParams.Filter.ChannelTypeId.builder()
                                    .eq(
                                        NotificationSettingListParams.Filter.ChannelTypeId.Eq
                                            .WEBHOOK
                                    )
                                    .build()
                            )
                            .notificationChannel(
                                NotificationSettingListParams.Filter.NotificationChannel.builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .notificationEventConditionId(
                                NotificationSettingListParams.Filter.NotificationEventConditionId
                                    .builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .notificationProfileId(
                                NotificationSettingListParams.Filter.NotificationProfileId.builder()
                                    .eq("12455643-3cf1-4683-ad23-1cd32f7d5e0a")
                                    .build()
                            )
                            .status(
                                NotificationSettingListParams.Filter.Status.builder()
                                    .eq(
                                        NotificationSettingListParams.Filter.Status.Eq
                                            .ENABLE_RECEIVED
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .page(NotificationSettingListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val notificationSettings = notificationSettingsFuture.get()
        notificationSettings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationSettingServiceAsync = client.notificationSettings()

        val notificationSettingFuture =
            notificationSettingServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val notificationSetting = notificationSettingFuture.get()
        notificationSetting.validate()
    }
}
