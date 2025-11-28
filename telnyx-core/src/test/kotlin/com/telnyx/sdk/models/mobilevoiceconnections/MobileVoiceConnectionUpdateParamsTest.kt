// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileVoiceConnectionUpdateParamsTest {

    @Test
    fun create() {
        MobileVoiceConnectionUpdateParams.builder()
            .id("id")
            .active(true)
            .connectionName("connection_name")
            .inbound(MobileVoiceConnectionUpdateParams.Inbound.builder().channelLimit(0L).build())
            .outbound(
                MobileVoiceConnectionUpdateParams.Outbound.builder()
                    .channelLimit(0L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
            .addTag("string")
            .webhookApiVersion(MobileVoiceConnectionUpdateParams.WebhookApiVersion._1)
            .webhookEventFailoverUrl("webhook_event_failover_url")
            .webhookEventUrl("webhook_event_url")
            .webhookTimeoutSecs(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = MobileVoiceConnectionUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MobileVoiceConnectionUpdateParams.builder()
                .id("id")
                .active(true)
                .connectionName("connection_name")
                .inbound(
                    MobileVoiceConnectionUpdateParams.Inbound.builder().channelLimit(0L).build()
                )
                .outbound(
                    MobileVoiceConnectionUpdateParams.Outbound.builder()
                        .channelLimit(0L)
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .build()
                )
                .addTag("string")
                .webhookApiVersion(MobileVoiceConnectionUpdateParams.WebhookApiVersion._1)
                .webhookEventFailoverUrl("webhook_event_failover_url")
                .webhookEventUrl("webhook_event_url")
                .webhookTimeoutSecs(0L)
                .build()

        val body = params._body()

        assertThat(body.active()).contains(true)
        assertThat(body.connectionName()).contains("connection_name")
        assertThat(body.inbound())
            .contains(MobileVoiceConnectionUpdateParams.Inbound.builder().channelLimit(0L).build())
        assertThat(body.outbound())
            .contains(
                MobileVoiceConnectionUpdateParams.Outbound.builder()
                    .channelLimit(0L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.webhookApiVersion())
            .contains(MobileVoiceConnectionUpdateParams.WebhookApiVersion._1)
        assertThat(body.webhookEventFailoverUrl()).contains("webhook_event_failover_url")
        assertThat(body.webhookEventUrl()).contains("webhook_event_url")
        assertThat(body.webhookTimeoutSecs()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MobileVoiceConnectionUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
