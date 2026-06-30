// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListResponseTest {

    @Test
    fun create() {
        val connectionListResponse =
            ConnectionListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                .connectionName("string")
                .createdAt("2018-02-02T22:25:27.521Z")
                .outboundVoiceProfileId("1293384261075731499")
                .recordType("ip_connection")
                .addTag("tag1")
                .addTag("tag2")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .webhookApiVersion(ConnectionListResponse.WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .build()

        assertThat(connectionListResponse.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(connectionListResponse.active()).contains(true)
        assertThat(connectionListResponse.anchorsiteOverride()).contains(AnchorsiteOverride.LATENCY)
        assertThat(connectionListResponse.connectionName()).contains("string")
        assertThat(connectionListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(connectionListResponse.outboundVoiceProfileId()).contains("1293384261075731499")
        assertThat(connectionListResponse.recordType()).contains("ip_connection")
        assertThat(connectionListResponse.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(connectionListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(connectionListResponse.webhookApiVersion())
            .contains(ConnectionListResponse.WebhookApiVersion.V1)
        assertThat(connectionListResponse.webhookEventFailoverUrl())
            .contains("https://failover.example.com")
        assertThat(connectionListResponse.webhookEventUrl()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionListResponse =
            ConnectionListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                .connectionName("string")
                .createdAt("2018-02-02T22:25:27.521Z")
                .outboundVoiceProfileId("1293384261075731499")
                .recordType("ip_connection")
                .addTag("tag1")
                .addTag("tag2")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .webhookApiVersion(ConnectionListResponse.WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .build()

        val roundtrippedConnectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionListResponse),
                jacksonTypeRef<ConnectionListResponse>(),
            )

        assertThat(roundtrippedConnectionListResponse).isEqualTo(connectionListResponse)
    }
}
