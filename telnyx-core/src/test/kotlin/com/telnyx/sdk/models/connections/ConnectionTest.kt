// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionTest {

    @Test
    fun create() {
        val connection =
            Connection.builder()
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
                .webhookApiVersion(Connection.WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .build()

        assertThat(connection.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(connection.active()).contains(true)
        assertThat(connection.anchorsiteOverride()).contains(AnchorsiteOverride.LATENCY)
        assertThat(connection.connectionName()).contains("string")
        assertThat(connection.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(connection.outboundVoiceProfileId()).contains("1293384261075731499")
        assertThat(connection.recordType()).contains("ip_connection")
        assertThat(connection.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(connection.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(connection.webhookApiVersion()).contains(Connection.WebhookApiVersion.V1)
        assertThat(connection.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(connection.webhookEventUrl()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connection =
            Connection.builder()
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
                .webhookApiVersion(Connection.WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .build()

        val roundtrippedConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connection),
                jacksonTypeRef<Connection>(),
            )

        assertThat(roundtrippedConnection).isEqualTo(connection)
    }
}
