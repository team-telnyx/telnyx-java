// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileVoiceConnectionTest {

    @Test
    fun create() {
        val mobileVoiceConnection =
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

        assertThat(mobileVoiceConnection.id()).contains("id")
        assertThat(mobileVoiceConnection.active()).contains(true)
        assertThat(mobileVoiceConnection.connectionName()).contains("connection_name")
        assertThat(mobileVoiceConnection.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mobileVoiceConnection.inbound())
            .contains(MobileVoiceConnection.Inbound.builder().channelLimit(0L).build())
        assertThat(mobileVoiceConnection.outbound())
            .contains(
                MobileVoiceConnection.Outbound.builder()
                    .channelLimit(0L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
        assertThat(mobileVoiceConnection.recordType())
            .contains(MobileVoiceConnection.RecordType.MOBILE_VOICE_CONNECTION)
        assertThat(mobileVoiceConnection.tags().getOrNull()).containsExactly("string")
        assertThat(mobileVoiceConnection.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mobileVoiceConnection.webhookApiVersion())
            .contains(MobileVoiceConnection.WebhookApiVersion.V1)
        assertThat(mobileVoiceConnection.webhookEventFailoverUrl())
            .contains("webhook_event_failover_url")
        assertThat(mobileVoiceConnection.webhookEventUrl()).contains("webhook_event_url")
        assertThat(mobileVoiceConnection.webhookTimeoutSecs()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobileVoiceConnection =
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

        val roundtrippedMobileVoiceConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobileVoiceConnection),
                jacksonTypeRef<MobileVoiceConnection>(),
            )

        assertThat(roundtrippedMobileVoiceConnection).isEqualTo(mobileVoiceConnection)
    }
}
