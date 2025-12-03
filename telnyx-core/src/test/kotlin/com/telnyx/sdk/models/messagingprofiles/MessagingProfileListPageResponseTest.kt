// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileListPageResponseTest {

    @Test
    fun create() {
        val messagingProfileListPageResponse =
            MessagingProfileListPageResponse.builder()
                .addData(
                    MessagingProfile.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .alphaSender("sqF")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .dailySpendLimit("100.00")
                        .dailySpendLimitEnabled(false)
                        .enabled(true)
                        .mmsFallBackToSms(false)
                        .mmsTranscoding(false)
                        .mobileOnly(false)
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
                        .webhookApiVersion(MessagingProfile.WebhookApiVersion.V2)
                        .webhookFailoverUrl("https://backup.example.com/hooks")
                        .webhookUrl("https://www.example.com/hooks")
                        .addWhitelistedDestination("US")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingProfileListPageResponse.data().getOrNull())
            .containsExactly(
                MessagingProfile.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .alphaSender("sqF")
                    .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .dailySpendLimit("100.00")
                    .dailySpendLimitEnabled(false)
                    .enabled(true)
                    .mmsFallBackToSms(false)
                    .mmsTranscoding(false)
                    .mobileOnly(false)
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
                    .webhookApiVersion(MessagingProfile.WebhookApiVersion.V2)
                    .webhookFailoverUrl("https://backup.example.com/hooks")
                    .webhookUrl("https://www.example.com/hooks")
                    .addWhitelistedDestination("US")
                    .build()
            )
        assertThat(messagingProfileListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingProfileListPageResponse =
            MessagingProfileListPageResponse.builder()
                .addData(
                    MessagingProfile.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .alphaSender("sqF")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .dailySpendLimit("100.00")
                        .dailySpendLimitEnabled(false)
                        .enabled(true)
                        .mmsFallBackToSms(false)
                        .mmsTranscoding(false)
                        .mobileOnly(false)
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
                        .webhookApiVersion(MessagingProfile.WebhookApiVersion.V2)
                        .webhookFailoverUrl("https://backup.example.com/hooks")
                        .webhookUrl("https://www.example.com/hooks")
                        .addWhitelistedDestination("US")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingProfileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingProfileListPageResponse),
                jacksonTypeRef<MessagingProfileListPageResponse>(),
            )

        assertThat(roundtrippedMessagingProfileListPageResponse)
            .isEqualTo(messagingProfileListPageResponse)
    }
}
