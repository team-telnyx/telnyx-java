// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ConnectionsPaginationMeta
import com.telnyx.api.models.credentialconnections.AnchorsiteOverride
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListResponseTest {

    @Test
    fun create() {
        val connectionListResponse =
            ConnectionListResponse.builder()
                .addData(
                    ConnectionListResponse.Data.builder()
                        .id("id")
                        .active(true)
                        .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                        .connectionName("string")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .recordType("ip_connection")
                        .addTag("tag1")
                        .addTag("tag2")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .webhookApiVersion(ConnectionListResponse.Data.WebhookApiVersion._1)
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .build()
                )
                .meta(
                    ConnectionsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(connectionListResponse.data().getOrNull())
            .containsExactly(
                ConnectionListResponse.Data.builder()
                    .id("id")
                    .active(true)
                    .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                    .connectionName("string")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .recordType("ip_connection")
                    .addTag("tag1")
                    .addTag("tag2")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .webhookApiVersion(ConnectionListResponse.Data.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .build()
            )
        assertThat(connectionListResponse.meta())
            .contains(
                ConnectionsPaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionListResponse =
            ConnectionListResponse.builder()
                .addData(
                    ConnectionListResponse.Data.builder()
                        .id("id")
                        .active(true)
                        .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                        .connectionName("string")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .outboundVoiceProfileId("outbound_voice_profile_id")
                        .recordType("ip_connection")
                        .addTag("tag1")
                        .addTag("tag2")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .webhookApiVersion(ConnectionListResponse.Data.WebhookApiVersion._1)
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .build()
                )
                .meta(
                    ConnectionsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedConnectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionListResponse),
                jacksonTypeRef<ConnectionListResponse>(),
            )

        assertThat(roundtrippedConnectionListResponse).isEqualTo(connectionListResponse)
    }
}
