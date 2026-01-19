// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            MessagingProfileUpdateParams.builder()
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.alphaSender()).contains("sqF")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.dailySpendLimit()).contains("269125115713")
        assertThat(body.dailySpendLimitEnabled()).contains(true)
        assertThat(body.enabled()).contains(true)
        assertThat(body.mmsFallBackToSms()).contains(true)
        assertThat(body.mmsTranscoding()).contains(true)
        assertThat(body.mobileOnly()).contains(true)
        assertThat(body.name()).contains("Updated Profile for Messages")
        assertThat(body.numberPoolSettings())
            .contains(
                NumberPoolSettings.builder()
                    .longCodeWeight(2.0)
                    .skipUnhealthy(false)
                    .tollFreeWeight(10.0)
                    .geomatch(false)
                    .stickySender(true)
                    .build()
            )
        assertThat(body.recordType())
            .contains(MessagingProfileUpdateParams.RecordType.MESSAGING_PROFILE)
        assertThat(body.smartEncoding()).contains(true)
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.urlShortenerSettings())
            .contains(
                UrlShortenerSettings.builder()
                    .domain("example.ex")
                    .prefix("cmpny")
                    .replaceBlacklistOnly(true)
                    .sendWebhooks(false)
                    .build()
            )
        assertThat(body.v1Secret()).contains("rP1VamejkU2v0qIUxntqLW2c")
        assertThat(body.webhookApiVersion())
            .contains(MessagingProfileUpdateParams.WebhookApiVersion.V2)
        assertThat(body.webhookFailoverUrl()).contains("https://backup.example.com/hooks")
        assertThat(body.webhookUrl()).contains("https://www.example.com/hooks")
        assertThat(body.whitelistedDestinations().getOrNull()).containsExactly("US")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessagingProfileUpdateParams.builder()
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
