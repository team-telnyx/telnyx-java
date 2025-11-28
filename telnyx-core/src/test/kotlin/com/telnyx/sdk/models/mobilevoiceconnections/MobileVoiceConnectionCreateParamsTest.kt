// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileVoiceConnectionCreateParamsTest {

    @Test
    fun create() {
        MobileVoiceConnectionCreateParams.builder()
            .active(true)
            .connectionName("connection_name")
            .inbound(MobileVoiceConnectionCreateParams.Inbound.builder().channelLimit(0L).build())
            .outbound(
                MobileVoiceConnectionCreateParams.Outbound.builder()
                    .channelLimit(0L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
            .addTag("string")
            .webhookApiVersion(MobileVoiceConnectionCreateParams.WebhookApiVersion._1)
            .webhookEventFailoverUrl("webhook_event_failover_url")
            .webhookEventUrl("webhook_event_url")
            .webhookTimeoutSecs(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            MobileVoiceConnectionCreateParams.builder()
                .active(true)
                .connectionName("connection_name")
                .inbound(
                    MobileVoiceConnectionCreateParams.Inbound.builder().channelLimit(0L).build()
                )
                .outbound(
                    MobileVoiceConnectionCreateParams.Outbound.builder()
                        .channelLimit(0L)
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .build()
                )
                .addTag("string")
                .webhookApiVersion(MobileVoiceConnectionCreateParams.WebhookApiVersion._1)
                .webhookEventFailoverUrl("webhook_event_failover_url")
                .webhookEventUrl("webhook_event_url")
                .webhookTimeoutSecs(0L)
                .build()

        val body = params._body()

        assertThat(body.active()).contains(true)
        assertThat(body.connectionName()).contains("connection_name")
        assertThat(body.inbound())
            .contains(MobileVoiceConnectionCreateParams.Inbound.builder().channelLimit(0L).build())
        assertThat(body.outbound())
            .contains(
                MobileVoiceConnectionCreateParams.Outbound.builder()
                    .channelLimit(0L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.webhookApiVersion())
            .contains(MobileVoiceConnectionCreateParams.WebhookApiVersion._1)
        assertThat(body.webhookEventFailoverUrl()).contains("webhook_event_failover_url")
        assertThat(body.webhookEventUrl()).contains("webhook_event_url")
        assertThat(body.webhookTimeoutSecs()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MobileVoiceConnectionCreateParams.builder().build()

        val body = params._body()
    }
}
