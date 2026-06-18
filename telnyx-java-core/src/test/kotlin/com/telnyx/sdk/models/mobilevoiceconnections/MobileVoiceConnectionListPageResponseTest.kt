// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileVoiceConnectionListPageResponseTest {

    @Test
    fun create() {
        val mobileVoiceConnectionListPageResponse =
            MobileVoiceConnectionListPageResponse.builder()
                .addData(
                    MobileVoiceConnection.builder()
                        .id("id")
                        .active(true)
                        .connectionName("connection_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inbound(MobileVoiceConnection.Inbound.builder().channelLimit(0L).build())
                        .outbound(
                            MobileVoiceConnection.Outbound.builder()
                                .channelLimit(0L)
                                .outboundVoiceProfileId("outbound_voice_profile_id")
                                .build()
                        )
                        .recordType(MobileVoiceConnection.RecordType.MOBILE_VOICE_CONNECTION)
                        .addTag("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookApiVersion(MobileVoiceConnection.WebhookApiVersion.V1)
                        .webhookEventFailoverUrl("webhook_event_failover_url")
                        .webhookEventUrl("webhook_event_url")
                        .webhookTimeoutSecs(0L)
                        .build()
                )
                .meta(
                    MobileVoiceConnectionListPageResponse.Meta.builder()
                        .pageNumber(0L)
                        .totalPages(0L)
                        .pageSize(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(mobileVoiceConnectionListPageResponse.data().getOrNull())
            .containsExactly(
                MobileVoiceConnection.builder()
                    .id("id")
                    .active(true)
                    .connectionName("connection_name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inbound(MobileVoiceConnection.Inbound.builder().channelLimit(0L).build())
                    .outbound(
                        MobileVoiceConnection.Outbound.builder()
                            .channelLimit(0L)
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .recordType(MobileVoiceConnection.RecordType.MOBILE_VOICE_CONNECTION)
                    .addTag("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .webhookApiVersion(MobileVoiceConnection.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("webhook_event_failover_url")
                    .webhookEventUrl("webhook_event_url")
                    .webhookTimeoutSecs(0L)
                    .build()
            )
        assertThat(mobileVoiceConnectionListPageResponse.meta())
            .contains(
                MobileVoiceConnectionListPageResponse.Meta.builder()
                    .pageNumber(0L)
                    .totalPages(0L)
                    .pageSize(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobileVoiceConnectionListPageResponse =
            MobileVoiceConnectionListPageResponse.builder()
                .addData(
                    MobileVoiceConnection.builder()
                        .id("id")
                        .active(true)
                        .connectionName("connection_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inbound(MobileVoiceConnection.Inbound.builder().channelLimit(0L).build())
                        .outbound(
                            MobileVoiceConnection.Outbound.builder()
                                .channelLimit(0L)
                                .outboundVoiceProfileId("outbound_voice_profile_id")
                                .build()
                        )
                        .recordType(MobileVoiceConnection.RecordType.MOBILE_VOICE_CONNECTION)
                        .addTag("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookApiVersion(MobileVoiceConnection.WebhookApiVersion.V1)
                        .webhookEventFailoverUrl("webhook_event_failover_url")
                        .webhookEventUrl("webhook_event_url")
                        .webhookTimeoutSecs(0L)
                        .build()
                )
                .meta(
                    MobileVoiceConnectionListPageResponse.Meta.builder()
                        .pageNumber(0L)
                        .totalPages(0L)
                        .pageSize(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedMobileVoiceConnectionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobileVoiceConnectionListPageResponse),
                jacksonTypeRef<MobileVoiceConnectionListPageResponse>(),
            )

        assertThat(roundtrippedMobileVoiceConnectionListPageResponse)
            .isEqualTo(mobileVoiceConnectionListPageResponse)
    }
}
