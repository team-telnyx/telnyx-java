// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileUpdateResponseTest {

    @Test
    fun create() {
        val messagingProfileUpdateResponse =
            MessagingProfileUpdateResponse.builder()
                .data(
                    MessagingProfile.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .alphaSender("sqF")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .dailySpendLimit("100.00")
                        .dailySpendLimitEnabled(false)
                        .enabled(true)
                        .mmsFallBackToSms(false)
                        .mmsTranscoding(false)
                        .name("Profile for Messages")
                        .numberPoolSettings(
                            NumberPoolSettings.builder()
                                .longCodeWeight(2.0)
                                .skipUnhealthy(false)
                                .tollFreeWeight(10.0)
                                .geomatch(false)
                                .stickySender(true)
                                .build()
                        )
                        .recordType(MessagingProfile.RecordType.MESSAGING_PROFILE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .urlShortenerSettings(
                            UrlShortenerSettings.builder()
                                .domain("example.ex")
                                .prefix("cmpny")
                                .replaceBlacklistOnly(true)
                                .sendWebhooks(false)
                                .build()
                        )
                        .v1Secret("rP1VamejkU2v0qIUxntqLW2c")
                        .webhookApiVersion(MessagingProfile.WebhookApiVersion._2)
                        .webhookFailoverUrl("https://backup.example.com/hooks")
                        .webhookUrl("https://www.example.com/hooks")
                        .addWhitelistedDestination("US")
                        .build()
                )
                .build()

        assertThat(messagingProfileUpdateResponse.data())
            .contains(
                MessagingProfile.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .alphaSender("sqF")
                    .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .dailySpendLimit("100.00")
                    .dailySpendLimitEnabled(false)
                    .enabled(true)
                    .mmsFallBackToSms(false)
                    .mmsTranscoding(false)
                    .name("Profile for Messages")
                    .numberPoolSettings(
                        NumberPoolSettings.builder()
                            .longCodeWeight(2.0)
                            .skipUnhealthy(false)
                            .tollFreeWeight(10.0)
                            .geomatch(false)
                            .stickySender(true)
                            .build()
                    )
                    .recordType(MessagingProfile.RecordType.MESSAGING_PROFILE)
                    .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .urlShortenerSettings(
                        UrlShortenerSettings.builder()
                            .domain("example.ex")
                            .prefix("cmpny")
                            .replaceBlacklistOnly(true)
                            .sendWebhooks(false)
                            .build()
                    )
                    .v1Secret("rP1VamejkU2v0qIUxntqLW2c")
                    .webhookApiVersion(MessagingProfile.WebhookApiVersion._2)
                    .webhookFailoverUrl("https://backup.example.com/hooks")
                    .webhookUrl("https://www.example.com/hooks")
                    .addWhitelistedDestination("US")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingProfileUpdateResponse =
            MessagingProfileUpdateResponse.builder()
                .data(
                    MessagingProfile.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .alphaSender("sqF")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .dailySpendLimit("100.00")
                        .dailySpendLimitEnabled(false)
                        .enabled(true)
                        .mmsFallBackToSms(false)
                        .mmsTranscoding(false)
                        .name("Profile for Messages")
                        .numberPoolSettings(
                            NumberPoolSettings.builder()
                                .longCodeWeight(2.0)
                                .skipUnhealthy(false)
                                .tollFreeWeight(10.0)
                                .geomatch(false)
                                .stickySender(true)
                                .build()
                        )
                        .recordType(MessagingProfile.RecordType.MESSAGING_PROFILE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .urlShortenerSettings(
                            UrlShortenerSettings.builder()
                                .domain("example.ex")
                                .prefix("cmpny")
                                .replaceBlacklistOnly(true)
                                .sendWebhooks(false)
                                .build()
                        )
                        .v1Secret("rP1VamejkU2v0qIUxntqLW2c")
                        .webhookApiVersion(MessagingProfile.WebhookApiVersion._2)
                        .webhookFailoverUrl("https://backup.example.com/hooks")
                        .webhookUrl("https://www.example.com/hooks")
                        .addWhitelistedDestination("US")
                        .build()
                )
                .build()

        val roundtrippedMessagingProfileUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingProfileUpdateResponse),
                jacksonTypeRef<MessagingProfileUpdateResponse>(),
            )

        assertThat(roundtrippedMessagingProfileUpdateResponse)
            .isEqualTo(messagingProfileUpdateResponse)
    }
}
