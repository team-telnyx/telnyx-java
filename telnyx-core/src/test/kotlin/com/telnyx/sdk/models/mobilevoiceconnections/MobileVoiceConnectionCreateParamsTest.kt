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
            .connectionName("Telnyx Mobile Voice IMS")
            .inbound(MobileVoiceConnectionCreateParams.Inbound.builder().channelLimit(0L).build())
            .outbound(
                MobileVoiceConnectionCreateParams.Outbound.builder()
                    .channelLimit(0L)
                    .outboundVoiceProfileId("string")
                    .build()
            )
            .addTag("string")
            .webhookApiVersion(MobileVoiceConnectionCreateParams.WebhookApiVersion.V2)
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
                .connectionName("Telnyx Mobile Voice IMS")
                .inbound(
                    MobileVoiceConnectionCreateParams.Inbound.builder().channelLimit(0L).build()
                )
                .outbound(
                    MobileVoiceConnectionCreateParams.Outbound.builder()
                        .channelLimit(0L)
                        .outboundVoiceProfileId("string")
                        .build()
                )
                .addTag("string")
                .webhookApiVersion(MobileVoiceConnectionCreateParams.WebhookApiVersion.V2)
                .webhookEventFailoverUrl("webhook_event_failover_url")
                .webhookEventUrl("webhook_event_url")
                .webhookTimeoutSecs(0L)
                .build()

        val body = params._body()

        assertThat(body.active()).contains(true)
        assertThat(body.connectionName()).contains("Telnyx Mobile Voice IMS")
        assertThat(body.inbound())
            .contains(MobileVoiceConnectionCreateParams.Inbound.builder().channelLimit(0L).build())
        assertThat(body.outbound())
            .contains(
                MobileVoiceConnectionCreateParams.Outbound.builder()
                    .channelLimit(0L)
                    .outboundVoiceProfileId("string")
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.webhookApiVersion())
            .contains(MobileVoiceConnectionCreateParams.WebhookApiVersion.V2)
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
