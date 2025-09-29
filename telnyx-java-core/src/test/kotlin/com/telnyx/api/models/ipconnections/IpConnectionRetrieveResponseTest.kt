// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ipconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.credentialconnections.AnchorsiteOverride
import com.telnyx.api.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.api.models.credentialconnections.DtmfType
import com.telnyx.api.models.credentialconnections.EncryptedMedia
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpConnectionRetrieveResponseTest {

    @Test
    fun create() {
        val ipConnectionRetrieveResponse =
            IpConnectionRetrieveResponse.builder()
                .data(
                    IpConnection.builder()
                        .id("id")
                        .active(true)
                        .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                        .connectionName("string")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .defaultOnHoldComfortNoiseEnabled(true)
                        .dtmfType(DtmfType.RFC_2833)
                        .encodeContactHeaderEnabled(true)
                        .encryptedMedia(EncryptedMedia.SRTP)
                        .inbound(
                            InboundIp.builder()
                                .aniNumberFormat(InboundIp.AniNumberFormat.PLUS_E_164)
                                .channelLimit(10L)
                                .addCodec("G722")
                                .defaultPrimaryIpId("192.0.2.1")
                                .defaultRoutingMethod(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
                                .defaultSecondaryIpId("198.51.100.1")
                                .defaultTertiaryIpId("203.0.113.1")
                                .dnisNumberFormat(InboundIp.DnisNumberFormat.PLUS_E164)
                                .generateRingbackTone(true)
                                .isupHeadersEnabled(true)
                                .prackEnabled(true)
                                .shakenStirEnabled(true)
                                .sipCompactHeadersEnabled(true)
                                .sipRegion(InboundIp.SipRegion.US)
                                .sipSubdomain("string")
                                .sipSubdomainReceiveSettings(
                                    InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                                )
                                .timeout1xxSecs(10L)
                                .timeout2xxSecs(10L)
                                .build()
                        )
                        .onnetT38PassthroughEnabled(true)
                        .outbound(
                            OutboundIp.builder()
                                .aniOverride("string")
                                .aniOverrideType(OutboundIp.AniOverrideType.ALWAYS)
                                .callParkingEnabled(true)
                                .channelLimit(10L)
                                .generateRingbackTone(true)
                                .instantRingbackEnabled(true)
                                .ipAuthenticationMethod(OutboundIp.IpAuthenticationMethod.TOKEN)
                                .ipAuthenticationToken("string")
                                .localization("string")
                                .outboundVoiceProfileId("outbound_voice_profile_id")
                                .t38ReinviteSource(OutboundIp.T38ReinviteSource.CUSTOMER)
                                .techPrefix("string")
                                .build()
                        )
                        .recordType("ip_connection")
                        .rtcpSettings(
                            ConnectionRtcpSettings.builder()
                                .captureEnabled(true)
                                .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                                .reportFrequencySecs(10L)
                                .build()
                        )
                        .addTag("tag1")
                        .addTag("tag2")
                        .transportProtocol(IpConnection.TransportProtocol.UDP)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .webhookApiVersion(IpConnection.WebhookApiVersion._1)
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .build()

        assertThat(ipConnectionRetrieveResponse.data())
            .contains(
                IpConnection.builder()
                    .id("id")
                    .active(true)
                    .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                    .connectionName("string")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .defaultOnHoldComfortNoiseEnabled(true)
                    .dtmfType(DtmfType.RFC_2833)
                    .encodeContactHeaderEnabled(true)
                    .encryptedMedia(EncryptedMedia.SRTP)
                    .inbound(
                        InboundIp.builder()
                            .aniNumberFormat(InboundIp.AniNumberFormat.PLUS_E_164)
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultPrimaryIpId("192.0.2.1")
                            .defaultRoutingMethod(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
                            .defaultSecondaryIpId("198.51.100.1")
                            .defaultTertiaryIpId("203.0.113.1")
                            .dnisNumberFormat(InboundIp.DnisNumberFormat.PLUS_E164)
                            .generateRingbackTone(true)
                            .isupHeadersEnabled(true)
                            .prackEnabled(true)
                            .shakenStirEnabled(true)
                            .sipCompactHeadersEnabled(true)
                            .sipRegion(InboundIp.SipRegion.US)
                            .sipSubdomain("string")
                            .sipSubdomainReceiveSettings(
                                InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                            )
                            .timeout1xxSecs(10L)
                            .timeout2xxSecs(10L)
                            .build()
                    )
                    .onnetT38PassthroughEnabled(true)
                    .outbound(
                        OutboundIp.builder()
                            .aniOverride("string")
                            .aniOverrideType(OutboundIp.AniOverrideType.ALWAYS)
                            .callParkingEnabled(true)
                            .channelLimit(10L)
                            .generateRingbackTone(true)
                            .instantRingbackEnabled(true)
                            .ipAuthenticationMethod(OutboundIp.IpAuthenticationMethod.TOKEN)
                            .ipAuthenticationToken("string")
                            .localization("string")
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .t38ReinviteSource(OutboundIp.T38ReinviteSource.CUSTOMER)
                            .techPrefix("string")
                            .build()
                    )
                    .recordType("ip_connection")
                    .rtcpSettings(
                        ConnectionRtcpSettings.builder()
                            .captureEnabled(true)
                            .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                            .reportFrequencySecs(10L)
                            .build()
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .transportProtocol(IpConnection.TransportProtocol.UDP)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .webhookApiVersion(IpConnection.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ipConnectionRetrieveResponse =
            IpConnectionRetrieveResponse.builder()
                .data(
                    IpConnection.builder()
                        .id("id")
                        .active(true)
                        .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                        .connectionName("string")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .defaultOnHoldComfortNoiseEnabled(true)
                        .dtmfType(DtmfType.RFC_2833)
                        .encodeContactHeaderEnabled(true)
                        .encryptedMedia(EncryptedMedia.SRTP)
                        .inbound(
                            InboundIp.builder()
                                .aniNumberFormat(InboundIp.AniNumberFormat.PLUS_E_164)
                                .channelLimit(10L)
                                .addCodec("G722")
                                .defaultPrimaryIpId("192.0.2.1")
                                .defaultRoutingMethod(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
                                .defaultSecondaryIpId("198.51.100.1")
                                .defaultTertiaryIpId("203.0.113.1")
                                .dnisNumberFormat(InboundIp.DnisNumberFormat.PLUS_E164)
                                .generateRingbackTone(true)
                                .isupHeadersEnabled(true)
                                .prackEnabled(true)
                                .shakenStirEnabled(true)
                                .sipCompactHeadersEnabled(true)
                                .sipRegion(InboundIp.SipRegion.US)
                                .sipSubdomain("string")
                                .sipSubdomainReceiveSettings(
                                    InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                                )
                                .timeout1xxSecs(10L)
                                .timeout2xxSecs(10L)
                                .build()
                        )
                        .onnetT38PassthroughEnabled(true)
                        .outbound(
                            OutboundIp.builder()
                                .aniOverride("string")
                                .aniOverrideType(OutboundIp.AniOverrideType.ALWAYS)
                                .callParkingEnabled(true)
                                .channelLimit(10L)
                                .generateRingbackTone(true)
                                .instantRingbackEnabled(true)
                                .ipAuthenticationMethod(OutboundIp.IpAuthenticationMethod.TOKEN)
                                .ipAuthenticationToken("string")
                                .localization("string")
                                .outboundVoiceProfileId("outbound_voice_profile_id")
                                .t38ReinviteSource(OutboundIp.T38ReinviteSource.CUSTOMER)
                                .techPrefix("string")
                                .build()
                        )
                        .recordType("ip_connection")
                        .rtcpSettings(
                            ConnectionRtcpSettings.builder()
                                .captureEnabled(true)
                                .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                                .reportFrequencySecs(10L)
                                .build()
                        )
                        .addTag("tag1")
                        .addTag("tag2")
                        .transportProtocol(IpConnection.TransportProtocol.UDP)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .webhookApiVersion(IpConnection.WebhookApiVersion._1)
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://example.com")
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .build()

        val roundtrippedIpConnectionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ipConnectionRetrieveResponse),
                jacksonTypeRef<IpConnectionRetrieveResponse>(),
            )

        assertThat(roundtrippedIpConnectionRetrieveResponse).isEqualTo(ipConnectionRetrieveResponse)
    }
}
