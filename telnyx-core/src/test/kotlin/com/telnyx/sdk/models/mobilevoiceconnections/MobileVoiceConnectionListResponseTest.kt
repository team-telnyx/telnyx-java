// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileVoiceConnectionListResponseTest {

    @Test
    fun create() {
        val mobileVoiceConnectionListResponse =
            MobileVoiceConnectionListResponse.builder()
                .addData(
                    MobileVoiceConnectionListResponse.Data.builder()
                        .id("id")
                        .active(true)
                        .connectionName("connection_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inbound(
                            MobileVoiceConnectionListResponse.Data.Inbound.builder()
                                .channelLimit(0L)
                                .build()
                        )
                        .outbound(
                            MobileVoiceConnectionListResponse.Data.Outbound.builder()
                                .channelLimit(0L)
                                .outboundVoiceProfileId("outbound_voice_profile_id")
                                .build()
                        )
                        .recordType(
                            MobileVoiceConnectionListResponse.Data.RecordType
                                .MOBILE_VOICE_CONNECTION
                        )
                        .addTag("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookApiVersion(
                            MobileVoiceConnectionListResponse.Data.WebhookApiVersion._1
                        )
                        .webhookEventFailoverUrl("webhook_event_failover_url")
                        .webhookEventUrl("webhook_event_url")
                        .webhookTimeoutSecs(0L)
                        .build()
                )
                .meta(
                    MobileVoiceConnectionListResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(mobileVoiceConnectionListResponse.data().getOrNull())
            .containsExactly(
                MobileVoiceConnectionListResponse.Data.builder()
                    .id("id")
                    .active(true)
                    .connectionName("connection_name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inbound(
                        MobileVoiceConnectionListResponse.Data.Inbound.builder()
                            .channelLimit(0L)
                            .build()
                    )
                    .outbound(
                        MobileVoiceConnectionListResponse.Data.Outbound.builder()
                            .channelLimit(0L)
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .recordType(
                        MobileVoiceConnectionListResponse.Data.RecordType.MOBILE_VOICE_CONNECTION
                    )
                    .addTag("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .webhookApiVersion(MobileVoiceConnectionListResponse.Data.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("webhook_event_failover_url")
                    .webhookEventUrl("webhook_event_url")
                    .webhookTimeoutSecs(0L)
                    .build()
            )
        assertThat(mobileVoiceConnectionListResponse.meta())
            .contains(
                MobileVoiceConnectionListResponse.Meta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobileVoiceConnectionListResponse =
            MobileVoiceConnectionListResponse.builder()
                .addData(
                    MobileVoiceConnectionListResponse.Data.builder()
                        .id("id")
                        .active(true)
                        .connectionName("connection_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inbound(
                            MobileVoiceConnectionListResponse.Data.Inbound.builder()
                                .channelLimit(0L)
                                .build()
                        )
                        .outbound(
                            MobileVoiceConnectionListResponse.Data.Outbound.builder()
                                .channelLimit(0L)
                                .outboundVoiceProfileId("outbound_voice_profile_id")
                                .build()
                        )
                        .recordType(
                            MobileVoiceConnectionListResponse.Data.RecordType
                                .MOBILE_VOICE_CONNECTION
                        )
                        .addTag("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookApiVersion(
                            MobileVoiceConnectionListResponse.Data.WebhookApiVersion._1
                        )
                        .webhookEventFailoverUrl("webhook_event_failover_url")
                        .webhookEventUrl("webhook_event_url")
                        .webhookTimeoutSecs(0L)
                        .build()
                )
                .meta(
                    MobileVoiceConnectionListResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedMobileVoiceConnectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobileVoiceConnectionListResponse),
                jacksonTypeRef<MobileVoiceConnectionListResponse>(),
            )

        assertThat(roundtrippedMobileVoiceConnectionListResponse)
            .isEqualTo(mobileVoiceConnectionListResponse)
    }
}
