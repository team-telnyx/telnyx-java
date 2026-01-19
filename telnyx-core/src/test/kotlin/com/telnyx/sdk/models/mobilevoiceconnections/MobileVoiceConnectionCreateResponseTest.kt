// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileVoiceConnectionCreateResponseTest {

    @Test
    fun create() {
        val mobileVoiceConnectionCreateResponse =
            MobileVoiceConnectionCreateResponse.builder()
                .data(
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
                .build()

        assertThat(mobileVoiceConnectionCreateResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobileVoiceConnectionCreateResponse =
            MobileVoiceConnectionCreateResponse.builder()
                .data(
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
                .build()

        val roundtrippedMobileVoiceConnectionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobileVoiceConnectionCreateResponse),
                jacksonTypeRef<MobileVoiceConnectionCreateResponse>(),
            )

        assertThat(roundtrippedMobileVoiceConnectionCreateResponse)
            .isEqualTo(mobileVoiceConnectionCreateResponse)
    }
}
