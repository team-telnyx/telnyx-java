// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionListPageResponseTest {

    @Test
    fun create() {
        val externalConnectionListPageResponse =
            ExternalConnectionListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(externalConnectionListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(externalConnectionListPageResponse.meta())
            .contains(
                ExternalVoiceIntegrationsPaginationMeta.builder()
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
        val externalConnectionListPageResponse =
            ExternalConnectionListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedExternalConnectionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalConnectionListPageResponse),
                jacksonTypeRef<ExternalConnectionListPageResponse>(),
            )

        assertThat(roundtrippedExternalConnectionListPageResponse)
            .isEqualTo(externalConnectionListPageResponse)
    }
}
