// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileUpdateParams
import com.telnyx.sdk.models.messagingprofiles.NumberPoolSettings
import com.telnyx.sdk.models.messagingprofiles.UrlShortenerSettings
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessagingProfileServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingProfileService = client.messagingProfiles()

        val messagingProfile =
            messagingProfileService.create(
                MessagingProfileCreateParams.builder()
                    .name("My name")
                    .addWhitelistedDestination("US")
                    .alphaSender("sqF")
                    .dailySpendLimit("269125115713")
                    .dailySpendLimitEnabled(true)
                    .enabled(true)
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

        messagingProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingProfileService = client.messagingProfiles()

        val messagingProfile =
            messagingProfileService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        messagingProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingProfileService = client.messagingProfiles()

        val messagingProfile =
            messagingProfileService.update(
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

        messagingProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingProfileService = client.messagingProfiles()

        val page = messagingProfileService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingProfileService = client.messagingProfiles()

        val messagingProfile =
            messagingProfileService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        messagingProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPhoneNumbers() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingProfileService = client.messagingProfiles()

        val page = messagingProfileService.listPhoneNumbers("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listShortCodes() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingProfileService = client.messagingProfiles()

        val page = messagingProfileService.listShortCodes("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }
}
