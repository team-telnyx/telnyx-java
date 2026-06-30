// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxApplicationTest {

    @Test
    fun create() {
        val faxApplication =
            FaxApplication.builder()
                .id("1293384261075731499")
                .active(false)
                .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                .applicationName("fax-router")
                .createdAt("2018-02-02T22:25:27.521Z")
                .inbound(
                    FaxApplication.Inbound.builder()
                        .channelLimit(10L)
                        .sipSubdomain("example")
                        .sipSubdomainReceiveSettings(
                            FaxApplication.Inbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                        )
                        .build()
                )
                .outbound(
                    FaxApplication.Outbound.builder()
                        .channelLimit(10L)
                        .outboundVoiceProfileId("1293384261075731499")
                        .build()
                )
                .recordType("fax_application")
                .addTag("tag1")
                .addTag("tag2")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        assertThat(faxApplication.id()).contains("1293384261075731499")
        assertThat(faxApplication.active()).contains(false)
        assertThat(faxApplication.anchorsiteOverride())
            .contains(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
        assertThat(faxApplication.applicationName()).contains("fax-router")
        assertThat(faxApplication.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(faxApplication.inbound())
            .contains(
                FaxApplication.Inbound.builder()
                    .channelLimit(10L)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        FaxApplication.Inbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
        assertThat(faxApplication.outbound())
            .contains(
                FaxApplication.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
        assertThat(faxApplication.recordType()).contains("fax_application")
        assertThat(faxApplication.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(faxApplication.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(faxApplication.webhookEventFailoverUrl())
            .contains("https://failover.example.com")
        assertThat(faxApplication.webhookEventUrl()).contains("https://example.com")
        assertThat(faxApplication.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxApplication =
            FaxApplication.builder()
                .id("1293384261075731499")
                .active(false)
                .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                .applicationName("fax-router")
                .createdAt("2018-02-02T22:25:27.521Z")
                .inbound(
                    FaxApplication.Inbound.builder()
                        .channelLimit(10L)
                        .sipSubdomain("example")
                        .sipSubdomainReceiveSettings(
                            FaxApplication.Inbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                        )
                        .build()
                )
                .outbound(
                    FaxApplication.Outbound.builder()
                        .channelLimit(10L)
                        .outboundVoiceProfileId("1293384261075731499")
                        .build()
                )
                .recordType("fax_application")
                .addTag("tag1")
                .addTag("tag2")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val roundtrippedFaxApplication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxApplication),
                jacksonTypeRef<FaxApplication>(),
            )

        assertThat(roundtrippedFaxApplication).isEqualTo(faxApplication)
    }
}
