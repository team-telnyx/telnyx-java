// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingMessagingProfileTest {

    @Test
    fun create() {
        val messagingMessagingProfile =
            MessagingMessagingProfile.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .aiAssistantId("ai_assistant-a80a9d4a-728c-4593-852c-2e93ad890000")
                .alphaSender("sqF")
                .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .dailySpendLimit("100.00")
                .dailySpendLimitEnabled(false)
                .enabled(true)
                .healthWebhookUrl(null)
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
                .organizationId("organization_id")
                .recordType(MessagingMessagingProfile.RecordType.MESSAGING_PROFILE)
                .redactionEnabled(false)
                .redactionLevel(2L)
                .resourceGroupId("resource_group_id")
                .smartEncoding(true)
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
                .webhookApiVersion(MessagingMessagingProfile.WebhookApiVersion.V2)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .addWhitelistedDestination("US")
                .build()

        assertThat(messagingMessagingProfile.id()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(messagingMessagingProfile.aiAssistantId())
            .contains("ai_assistant-a80a9d4a-728c-4593-852c-2e93ad890000")
        assertThat(messagingMessagingProfile.alphaSender()).contains("sqF")
        assertThat(messagingMessagingProfile.createdAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(messagingMessagingProfile.dailySpendLimit()).contains("100.00")
        assertThat(messagingMessagingProfile.dailySpendLimitEnabled()).contains(false)
        assertThat(messagingMessagingProfile.enabled()).contains(true)
        assertThat(messagingMessagingProfile.healthWebhookUrl()).isEmpty
        assertThat(messagingMessagingProfile.mmsFallBackToSms()).contains(false)
        assertThat(messagingMessagingProfile.mmsTranscoding()).contains(false)
        assertThat(messagingMessagingProfile.mobileOnly()).contains(false)
        assertThat(messagingMessagingProfile.name()).contains("Profile for Messages")
        assertThat(messagingMessagingProfile.numberPoolSettings())
            .contains(
                NumberPoolSettings.builder()
                    .longCodeWeight(2.0)
                    .skipUnhealthy(false)
                    .tollFreeWeight(10.0)
                    .geomatch(false)
                    .stickySender(true)
                    .build()
            )
        assertThat(messagingMessagingProfile.organizationId()).contains("organization_id")
        assertThat(messagingMessagingProfile.recordType())
            .contains(MessagingMessagingProfile.RecordType.MESSAGING_PROFILE)
        assertThat(messagingMessagingProfile.redactionEnabled()).contains(false)
        assertThat(messagingMessagingProfile.redactionLevel()).contains(2L)
        assertThat(messagingMessagingProfile.resourceGroupId()).contains("resource_group_id")
        assertThat(messagingMessagingProfile.smartEncoding()).contains(true)
        assertThat(messagingMessagingProfile.updatedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(messagingMessagingProfile.urlShortenerSettings())
            .contains(
                UrlShortenerSettings.builder()
                    .domain("example.ex")
                    .prefix("cmpny")
                    .replaceBlacklistOnly(true)
                    .sendWebhooks(false)
                    .build()
            )
        assertThat(messagingMessagingProfile.v1Secret()).contains("rP1VamejkU2v0qIUxntqLW2c")
        assertThat(messagingMessagingProfile.webhookApiVersion())
            .contains(MessagingMessagingProfile.WebhookApiVersion.V2)
        assertThat(messagingMessagingProfile.webhookFailoverUrl())
            .contains("https://backup.example.com/hooks")
        assertThat(messagingMessagingProfile.webhookUrl()).contains("https://www.example.com/hooks")
        assertThat(messagingMessagingProfile.whitelistedDestinations().getOrNull())
            .containsExactly("US")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingMessagingProfile =
            MessagingMessagingProfile.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .aiAssistantId("ai_assistant-a80a9d4a-728c-4593-852c-2e93ad890000")
                .alphaSender("sqF")
                .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .dailySpendLimit("100.00")
                .dailySpendLimitEnabled(false)
                .enabled(true)
                .healthWebhookUrl(null)
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
                .organizationId("organization_id")
                .recordType(MessagingMessagingProfile.RecordType.MESSAGING_PROFILE)
                .redactionEnabled(false)
                .redactionLevel(2L)
                .resourceGroupId("resource_group_id")
                .smartEncoding(true)
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
                .webhookApiVersion(MessagingMessagingProfile.WebhookApiVersion.V2)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .addWhitelistedDestination("US")
                .build()

        val roundtrippedMessagingMessagingProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingMessagingProfile),
                jacksonTypeRef<MessagingMessagingProfile>(),
            )

        assertThat(roundtrippedMessagingMessagingProfile).isEqualTo(messagingMessagingProfile)
    }
}
