// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxapplications

import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxApplicationCreateParamsTest {

    @Test
    fun create() {
        FaxApplicationCreateParams.builder()
            .applicationName("fax-router")
            .webhookEventUrl("https://example.com")
            .active(false)
            .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
            .inbound(
                FaxApplicationCreateParams.Inbound.builder()
                    .channelLimit(10L)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        FaxApplicationCreateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
            .outbound(
                FaxApplicationCreateParams.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
            .addTag("tag1")
            .addTag("tag2")
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun body() {
        val params =
            FaxApplicationCreateParams.builder()
                .applicationName("fax-router")
                .webhookEventUrl("https://example.com")
                .active(false)
                .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                .inbound(
                    FaxApplicationCreateParams.Inbound.builder()
                        .channelLimit(10L)
                        .sipSubdomain("example")
                        .sipSubdomainReceiveSettings(
                            FaxApplicationCreateParams.Inbound.SipSubdomainReceiveSettings
                                .ONLY_MY_CONNECTIONS
                        )
                        .build()
                )
                .outbound(
                    FaxApplicationCreateParams.Outbound.builder()
                        .channelLimit(10L)
                        .outboundVoiceProfileId("1293384261075731499")
                        .build()
                )
                .addTag("tag1")
                .addTag("tag2")
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.applicationName()).isEqualTo("fax-router")
        assertThat(body.webhookEventUrl()).isEqualTo("https://example.com")
        assertThat(body.active()).contains(false)
        assertThat(body.anchorsiteOverride()).contains(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
        assertThat(body.inbound())
            .contains(
                FaxApplicationCreateParams.Inbound.builder()
                    .channelLimit(10L)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        FaxApplicationCreateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
        assertThat(body.outbound())
            .contains(
                FaxApplicationCreateParams.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FaxApplicationCreateParams.builder()
                .applicationName("fax-router")
                .webhookEventUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.applicationName()).isEqualTo("fax-router")
        assertThat(body.webhookEventUrl()).isEqualTo("https://example.com")
    }
}
