// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionListResponseTest {

    @Test
    fun create() {
        val externalConnectionListResponse =
            ExternalConnectionListResponse.builder()
                .addData(
                    ExternalConnection.builder()
                        .id("id")
                        .active(false)
                        .createdAt("2022-06-29T19:23:59Z")
                        .credentialActive(false)
                        .externalSipConnection(ExternalConnection.ExternalSipConnection.ZOOM)
                        .inbound(ExternalConnection.Inbound.builder().channelLimit(10L).build())
                        .outbound(
                            ExternalConnection.Outbound.builder()
                                .channelLimit(10L)
                                .outboundVoiceProfileId("outbound_voice_profile_id")
                                .build()
                        )
                        .recordType("external_connection")
                        .addTag("tag1")
                        .addTag("tag2")
                        .updatedAt("2022-06-29T19:39:47Z")
                        .webhookApiVersion(ExternalConnection.WebhookApiVersion._1)
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(externalConnectionListResponse.data().getOrNull())
            .containsExactly(
                ExternalConnection.builder()
                    .id("id")
                    .active(false)
                    .createdAt("2022-06-29T19:23:59Z")
                    .credentialActive(false)
                    .externalSipConnection(ExternalConnection.ExternalSipConnection.ZOOM)
                    .inbound(ExternalConnection.Inbound.builder().channelLimit(10L).build())
                    .outbound(
                        ExternalConnection.Outbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .recordType("external_connection")
                    .addTag("tag1")
                    .addTag("tag2")
                    .updatedAt("2022-06-29T19:39:47Z")
                    .webhookApiVersion(ExternalConnection.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )
        assertThat(externalConnectionListResponse.meta())
            .contains(
                ExternalVoiceIntegrationsPaginationMeta.builder()
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
        val externalConnectionListResponse =
            ExternalConnectionListResponse.builder()
                .addData(
                    ExternalConnection.builder()
                        .id("id")
                        .active(false)
                        .createdAt("2022-06-29T19:23:59Z")
                        .credentialActive(false)
                        .externalSipConnection(ExternalConnection.ExternalSipConnection.ZOOM)
                        .inbound(ExternalConnection.Inbound.builder().channelLimit(10L).build())
                        .outbound(
                            ExternalConnection.Outbound.builder()
                                .channelLimit(10L)
                                .outboundVoiceProfileId("outbound_voice_profile_id")
                                .build()
                        )
                        .recordType("external_connection")
                        .addTag("tag1")
                        .addTag("tag2")
                        .updatedAt("2022-06-29T19:39:47Z")
                        .webhookApiVersion(ExternalConnection.WebhookApiVersion._1)
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedExternalConnectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalConnectionListResponse),
                jacksonTypeRef<ExternalConnectionListResponse>(),
            )

        assertThat(roundtrippedExternalConnectionListResponse)
            .isEqualTo(externalConnectionListResponse)
    }
}
