// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionUpdateResponseTest {

    @Test
    fun create() {
        val externalConnectionUpdateResponse =
            ExternalConnectionUpdateResponse.builder()
                .data(
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
                .build()

        assertThat(externalConnectionUpdateResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalConnectionUpdateResponse =
            ExternalConnectionUpdateResponse.builder()
                .data(
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
                .build()

        val roundtrippedExternalConnectionUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalConnectionUpdateResponse),
                jacksonTypeRef<ExternalConnectionUpdateResponse>(),
            )

        assertThat(roundtrippedExternalConnectionUpdateResponse)
            .isEqualTo(externalConnectionUpdateResponse)
    }
}
