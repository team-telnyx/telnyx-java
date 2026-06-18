// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionTest {

    @Test
    fun create() {
        val externalConnection =
            ExternalConnection.builder()
                .id("1930241863466354012")
                .active(false)
                .createdAt("2022-06-29T19:23:59Z")
                .credentialActive(false)
                .externalSipConnection(ExternalConnection.ExternalSipConnection.ZOOM)
                .inbound(ExternalConnection.Inbound.builder().channelLimit(10L).build())
                .outbound(
                    ExternalConnection.Outbound.builder()
                        .channelLimit(10L)
                        .outboundVoiceProfileId("1911630617284445511")
                        .build()
                )
                .recordType("external_connection")
                .addTag("tag1")
                .addTag("tag2")
                .updatedAt("2022-06-29T19:39:47Z")
                .webhookApiVersion(ExternalConnection.WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        assertThat(externalConnection.id()).contains("1930241863466354012")
        assertThat(externalConnection.active()).contains(false)
        assertThat(externalConnection.createdAt()).contains("2022-06-29T19:23:59Z")
        assertThat(externalConnection.credentialActive()).contains(false)
        assertThat(externalConnection.externalSipConnection())
            .contains(ExternalConnection.ExternalSipConnection.ZOOM)
        assertThat(externalConnection.inbound())
            .contains(ExternalConnection.Inbound.builder().channelLimit(10L).build())
        assertThat(externalConnection.outbound())
            .contains(
                ExternalConnection.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1911630617284445511")
                    .build()
            )
        assertThat(externalConnection.recordType()).contains("external_connection")
        assertThat(externalConnection.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(externalConnection.updatedAt()).contains("2022-06-29T19:39:47Z")
        assertThat(externalConnection.webhookApiVersion())
            .contains(ExternalConnection.WebhookApiVersion.V1)
        assertThat(externalConnection.webhookEventFailoverUrl())
            .contains("https://failover.example.com")
        assertThat(externalConnection.webhookEventUrl()).contains("https://example.com")
        assertThat(externalConnection.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalConnection =
            ExternalConnection.builder()
                .id("1930241863466354012")
                .active(false)
                .createdAt("2022-06-29T19:23:59Z")
                .credentialActive(false)
                .externalSipConnection(ExternalConnection.ExternalSipConnection.ZOOM)
                .inbound(ExternalConnection.Inbound.builder().channelLimit(10L).build())
                .outbound(
                    ExternalConnection.Outbound.builder()
                        .channelLimit(10L)
                        .outboundVoiceProfileId("1911630617284445511")
                        .build()
                )
                .recordType("external_connection")
                .addTag("tag1")
                .addTag("tag2")
                .updatedAt("2022-06-29T19:39:47Z")
                .webhookApiVersion(ExternalConnection.WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val roundtrippedExternalConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalConnection),
                jacksonTypeRef<ExternalConnection>(),
            )

        assertThat(roundtrippedExternalConnection).isEqualTo(externalConnection)
    }
}
