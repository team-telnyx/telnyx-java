// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionRetrieveResponseTest {

    @Test
    fun create() {
        val connectionRetrieveResponse =
            ConnectionRetrieveResponse.builder()
                .data(
                    ConnectionRetrieveResponse.Data.builder()
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
                        .webhookApiVersion(ConnectionRetrieveResponse.Data.WebhookApiVersion.V1)
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .build()
                )
                .build()

        assertThat(connectionRetrieveResponse.data())
            .contains(
                ConnectionRetrieveResponse.Data.builder()
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
                    .webhookApiVersion(ConnectionRetrieveResponse.Data.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionRetrieveResponse =
            ConnectionRetrieveResponse.builder()
                .data(
                    ConnectionRetrieveResponse.Data.builder()
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
                        .webhookApiVersion(ConnectionRetrieveResponse.Data.WebhookApiVersion.V1)
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedConnectionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionRetrieveResponse),
                jacksonTypeRef<ConnectionRetrieveResponse>(),
            )

        assertThat(roundtrippedConnectionRetrieveResponse).isEqualTo(connectionRetrieveResponse)
    }
}
