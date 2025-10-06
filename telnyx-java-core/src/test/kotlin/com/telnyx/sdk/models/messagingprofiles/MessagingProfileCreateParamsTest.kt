// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileCreateParamsTest {

    @Test
    fun create() {
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
            .webhookApiVersion(MessagingProfileCreateParams.WebhookApiVersion._2)
            .webhookFailoverUrl("https://backup.example.com/hooks")
            .webhookUrl("https://www.example.com/hooks")
            .build()
    }

    @Test
    fun body() {
        val params =
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
                .webhookApiVersion(MessagingProfileCreateParams.WebhookApiVersion._2)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My name")
        assertThat(body.whitelistedDestinations()).containsExactly("US")
        assertThat(body.alphaSender()).contains("sqF")
        assertThat(body.dailySpendLimit()).contains("269125115713")
        assertThat(body.dailySpendLimitEnabled()).contains(true)
        assertThat(body.enabled()).contains(true)
        assertThat(body.mmsFallBackToSms()).contains(true)
        assertThat(body.mmsTranscoding()).contains(true)
        assertThat(body.mobileOnly()).contains(true)
        assertThat(body.numberPoolSettings())
            .contains(
                NumberPoolSettings.builder()
                    .longCodeWeight(1.0)
                    .skipUnhealthy(true)
                    .tollFreeWeight(10.0)
                    .geomatch(false)
                    .stickySender(false)
                    .build()
            )
        assertThat(body.urlShortenerSettings())
            .contains(
                UrlShortenerSettings.builder()
                    .domain("example.ex")
                    .prefix("")
                    .replaceBlacklistOnly(true)
                    .sendWebhooks(false)
                    .build()
            )
        assertThat(body.webhookApiVersion())
            .contains(MessagingProfileCreateParams.WebhookApiVersion._2)
        assertThat(body.webhookFailoverUrl()).contains("https://backup.example.com/hooks")
        assertThat(body.webhookUrl()).contains("https://www.example.com/hooks")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessagingProfileCreateParams.builder()
                .name("My name")
                .addWhitelistedDestination("US")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My name")
        assertThat(body.whitelistedDestinations()).containsExactly("US")
    }
}
