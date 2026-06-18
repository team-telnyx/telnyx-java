// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListPageResponseTest {

    @Test
    fun create() {
        val connectionListPageResponse =
            ConnectionListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    ConnectionsPaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(connectionListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(connectionListPageResponse.meta())
            .contains(
                ConnectionsPaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionListPageResponse =
            ConnectionListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    ConnectionsPaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedConnectionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionListPageResponse),
                jacksonTypeRef<ConnectionListPageResponse>(),
            )

        assertThat(roundtrippedConnectionListPageResponse).isEqualTo(connectionListPageResponse)
    }
}
