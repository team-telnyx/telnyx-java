// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileTest {

    @Test
    fun create() {
        val messagingProfile =
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

        assertThat(messagingProfile.id()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(messagingProfile.alphaSender()).contains("sqF")
        assertThat(messagingProfile.createdAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(messagingProfile.dailySpendLimit()).contains("100.00")
        assertThat(messagingProfile.dailySpendLimitEnabled()).contains(false)
        assertThat(messagingProfile.enabled()).contains(true)
        assertThat(messagingProfile.mmsFallBackToSms()).contains(false)
        assertThat(messagingProfile.mmsTranscoding()).contains(false)
        assertThat(messagingProfile.name()).contains("Profile for Messages")
        assertThat(messagingProfile.numberPoolSettings())
            .contains(
                NumberPoolSettings.builder()
                    .longCodeWeight(2.0)
                    .skipUnhealthy(false)
                    .tollFreeWeight(10.0)
                    .geomatch(false)
                    .stickySender(true)
                    .build()
            )
        assertThat(messagingProfile.recordType())
            .contains(MessagingProfile.RecordType.MESSAGING_PROFILE)
        assertThat(messagingProfile.updatedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(messagingProfile.urlShortenerSettings())
            .contains(
                UrlShortenerSettings.builder()
                    .domain("example.ex")
                    .prefix("cmpny")
                    .replaceBlacklistOnly(true)
                    .sendWebhooks(false)
                    .build()
            )
        assertThat(messagingProfile.v1Secret()).contains("rP1VamejkU2v0qIUxntqLW2c")
        assertThat(messagingProfile.webhookApiVersion())
            .contains(MessagingProfile.WebhookApiVersion._2)
        assertThat(messagingProfile.webhookFailoverUrl())
            .contains("https://backup.example.com/hooks")
        assertThat(messagingProfile.webhookUrl()).contains("https://www.example.com/hooks")
        assertThat(messagingProfile.whitelistedDestinations().getOrNull()).containsExactly("US")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingProfile =
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

        val roundtrippedMessagingProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingProfile),
                jacksonTypeRef<MessagingProfile>(),
            )

        assertThat(roundtrippedMessagingProfile).isEqualTo(messagingProfile)
    }
}
