// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionCreateParamsTest {

    @Test
    fun create() {
        ExternalConnectionCreateParams.builder()
            .externalSipConnection(ExternalConnectionCreateParams.ExternalSipConnection.ZOOM)
            .outbound(
                ExternalConnectionCreateParams.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
            .active(false)
            .inbound(ExternalConnectionCreateParams.Inbound.builder().channelLimit(10L).build())
            .addTag("tag1")
            .addTag("tag2")
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalConnectionCreateParams.builder()
                .externalSipConnection(ExternalConnectionCreateParams.ExternalSipConnection.ZOOM)
                .outbound(
                    ExternalConnectionCreateParams.Outbound.builder()
                        .channelLimit(10L)
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .build()
                )
                .active(false)
                .inbound(ExternalConnectionCreateParams.Inbound.builder().channelLimit(10L).build())
                .addTag("tag1")
                .addTag("tag2")
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.externalSipConnection())
            .isEqualTo(ExternalConnectionCreateParams.ExternalSipConnection.ZOOM)
        assertThat(body.outbound())
            .isEqualTo(
                ExternalConnectionCreateParams.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
        assertThat(body.active()).contains(false)
        assertThat(body.inbound())
            .contains(ExternalConnectionCreateParams.Inbound.builder().channelLimit(10L).build())
        assertThat(body.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookEventUrl()).contains("https://example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalConnectionCreateParams.builder()
                .externalSipConnection(ExternalConnectionCreateParams.ExternalSipConnection.ZOOM)
                .outbound(ExternalConnectionCreateParams.Outbound.builder().build())
                .build()

        val body = params._body()

        assertThat(body.externalSipConnection())
            .isEqualTo(ExternalConnectionCreateParams.ExternalSipConnection.ZOOM)
        assertThat(body.outbound())
            .isEqualTo(ExternalConnectionCreateParams.Outbound.builder().build())
    }
}
