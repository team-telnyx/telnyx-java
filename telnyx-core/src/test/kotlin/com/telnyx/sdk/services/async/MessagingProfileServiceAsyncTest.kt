// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveMetricsParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileUpdateParams
import com.telnyx.sdk.models.messagingprofiles.NumberPoolSettings
import com.telnyx.sdk.models.messagingprofiles.UrlShortenerSettings
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingProfileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val messagingProfileFuture =
            messagingProfileServiceAsync.create(
                MessagingProfileCreateParams.builder()
                    .name("My name")
                    .addWhitelistedDestination("US")
                    .aiAssistantId("ai_assistant_id")
                    .alphaSender("sqF")
                    .dailySpendLimit("269125115713")
                    .dailySpendLimitEnabled(true)
                    .enabled(true)
                    .healthWebhookUrl("health_webhook_url")
                    .mmsFallBackToSms(true)
                    .mmsTranscoding(true)
                    .mobileOnly(true)
                    .numberPoolSettings(
                        NumberPoolSettings.builder()
                            .longCodeWeight(1.0)
                            .skipUnhealthy(true)
                            .tollFreeWeight(10.0)
                            .geomatch(false)
                            .stickySender(false)
                            .build()
                    )
                    .resourceGroupId("resource_group_id")
                    .smartEncoding(true)
                    .urlShortenerSettings(
                        UrlShortenerSettings.builder()
                            .domain("example.ex")
                            .prefix("")
                            .replaceBlacklistOnly(true)
                            .sendWebhooks(false)
                            .build()
                    )
                    .webhookApiVersion(MessagingProfileCreateParams.WebhookApiVersion.V2)
                    .webhookFailoverUrl("https://backup.example.com/hooks")
                    .webhookUrl("https://www.example.com/hooks")
                    .build()
            )

        val messagingProfile = messagingProfileFuture.get()
        messagingProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val messagingProfileFuture =
            messagingProfileServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val messagingProfile = messagingProfileFuture.get()
        messagingProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val messagingProfileFuture =
            messagingProfileServiceAsync.update(
                MessagingProfileUpdateParams.builder()
                    .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .alphaSender("sqF")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dailySpendLimit("269125115713")
                    .dailySpendLimitEnabled(true)
                    .enabled(true)
                    .mmsFallBackToSms(true)
                    .mmsTranscoding(true)
                    .mobileOnly(true)
                    .name("Updated Profile for Messages")
                    .numberPoolSettings(
                        NumberPoolSettings.builder()
                            .longCodeWeight(2.0)
                            .skipUnhealthy(false)
                            .tollFreeWeight(10.0)
                            .geomatch(false)
                            .stickySender(true)
                            .build()
                    )
                    .recordType(MessagingProfileUpdateParams.RecordType.MESSAGING_PROFILE)
                    .smartEncoding(true)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .urlShortenerSettings(
                        UrlShortenerSettings.builder()
                            .domain("example.ex")
                            .prefix("cmpny")
                            .replaceBlacklistOnly(true)
                            .sendWebhooks(false)
                            .build()
                    )
                    .v1Secret("rP1VamejkU2v0qIUxntqLW2c")
                    .webhookApiVersion(MessagingProfileUpdateParams.WebhookApiVersion.V2)
                    .webhookFailoverUrl("https://backup.example.com/hooks")
                    .webhookUrl("https://www.example.com/hooks")
                    .addWhitelistedDestination("US")
                    .build()
            )

        val messagingProfile = messagingProfileFuture.get()
        messagingProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val pageFuture = messagingProfileServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val messagingProfileFuture =
            messagingProfileServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val messagingProfile = messagingProfileFuture.get()
        messagingProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAlphanumericSenderIds() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val pageFuture =
            messagingProfileServiceAsync.listAlphanumericSenderIds(
                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPhoneNumbers() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val pageFuture =
            messagingProfileServiceAsync.listPhoneNumbers("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listShortCodes() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val pageFuture =
            messagingProfileServiceAsync.listShortCodes("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveMetrics() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingProfileServiceAsync = client.messagingProfiles()

        val responseFuture =
            messagingProfileServiceAsync.retrieveMetrics(
                MessagingProfileRetrieveMetricsParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .timeFrame(MessagingProfileRetrieveMetricsParams.TimeFrame._1H)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
