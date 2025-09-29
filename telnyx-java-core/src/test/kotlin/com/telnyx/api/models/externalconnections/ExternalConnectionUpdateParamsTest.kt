// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionUpdateParamsTest {

    @Test
    fun create() {
        ExternalConnectionUpdateParams.builder()
            .id("id")
            .outbound(
                ExternalConnectionUpdateParams.Outbound.builder()
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .channelLimit(10L)
                    .build()
            )
            .active(false)
            .inbound(ExternalConnectionUpdateParams.Inbound.builder().channelLimit(10L).build())
            .addTag("tag1")
            .addTag("tag2")
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalConnectionUpdateParams.builder()
                .id("id")
                .outbound(
                    ExternalConnectionUpdateParams.Outbound.builder()
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalConnectionUpdateParams.builder()
                .id("id")
                .outbound(
                    ExternalConnectionUpdateParams.Outbound.builder()
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .channelLimit(10L)
                        .build()
                )
                .active(false)
                .inbound(ExternalConnectionUpdateParams.Inbound.builder().channelLimit(10L).build())
                .addTag("tag1")
                .addTag("tag2")
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.outbound())
            .isEqualTo(
                ExternalConnectionUpdateParams.Outbound.builder()
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .channelLimit(10L)
                    .build()
            )
        assertThat(body.active()).contains(false)
        assertThat(body.inbound())
            .contains(ExternalConnectionUpdateParams.Inbound.builder().channelLimit(10L).build())
        assertThat(body.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookEventUrl()).contains("https://example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalConnectionUpdateParams.builder()
                .id("id")
                .outbound(
                    ExternalConnectionUpdateParams.Outbound.builder()
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.outbound())
            .isEqualTo(
                ExternalConnectionUpdateParams.Outbound.builder()
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
    }
}
