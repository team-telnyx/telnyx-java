// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.notificationsettings.NotificationSetting
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

        val pageFuture = notificationSettingServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
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
