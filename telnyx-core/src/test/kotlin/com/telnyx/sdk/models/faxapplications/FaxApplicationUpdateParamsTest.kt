// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxapplications

import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxApplicationUpdateParamsTest {

    @Test
    fun create() {
        FaxApplicationUpdateParams.builder()
            .id("1293384261075731499")
            .applicationName("fax-router")
            .webhookEventUrl("https://example.com")
            .active(false)
            .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
            .faxEmailRecipient("user@example.com")
            .inbound(
                FaxApplicationUpdateParams.Inbound.builder()
                    .channelLimit(10L)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        FaxApplicationUpdateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
            .outbound(
                FaxApplicationUpdateParams.Outbound.builder()
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
    fun pathParams() {
        val params =
            FaxApplicationUpdateParams.builder()
                .id("1293384261075731499")
                .applicationName("fax-router")
                .webhookEventUrl("https://example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FaxApplicationUpdateParams.builder()
                .id("1293384261075731499")
                .applicationName("fax-router")
                .webhookEventUrl("https://example.com")
                .active(false)
                .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                .faxEmailRecipient("user@example.com")
                .inbound(
                    FaxApplicationUpdateParams.Inbound.builder()
                        .channelLimit(10L)
                        .sipSubdomain("example")
                        .sipSubdomainReceiveSettings(
                            FaxApplicationUpdateParams.Inbound.SipSubdomainReceiveSettings
                                .ONLY_MY_CONNECTIONS
                        )
                        .build()
                )
                .outbound(
                    FaxApplicationUpdateParams.Outbound.builder()
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
        assertThat(body.faxEmailRecipient()).contains("user@example.com")
        assertThat(body.inbound())
            .contains(
                FaxApplicationUpdateParams.Inbound.builder()
                    .channelLimit(10L)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        FaxApplicationUpdateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
        assertThat(body.outbound())
            .contains(
                FaxApplicationUpdateParams.Outbound.builder()
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
            FaxApplicationUpdateParams.builder()
                .id("1293384261075731499")
                .applicationName("fax-router")
                .webhookEventUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.applicationName()).isEqualTo("fax-router")
        assertThat(body.webhookEventUrl()).isEqualTo("https://example.com")
    }
}
