// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ipconnections

import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpConnectionUpdateParamsTest {

    @Test
    fun create() {
        IpConnectionUpdateParams.builder()
            .id("id")
            .active(true)
            .anchorsiteOverride(AnchorsiteOverride.LATENCY)
            .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
            .connectionName("string")
            .defaultOnHoldComfortNoiseEnabled(true)
            .dtmfType(DtmfType.RFC_2833)
            .encodeContactHeaderEnabled(true)
            .encryptedMedia(EncryptedMedia.SRTP)
            .inbound(
                InboundIp.builder()
                    .aniNumberFormat(InboundIp.AniNumberFormat.PLUS_E_164)
                    .channelLimit(10L)
                    .addCodec("string")
                    .defaultPrimaryIpId("192.168.0.0")
                    .defaultRoutingMethod(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
                    .defaultSecondaryIpId("192.168.0.0")
                    .defaultTertiaryIpId("192.168.0.0")
                    .dnisNumberFormat(InboundIp.DnisNumberFormat.PLUS_E164)
                    .generateRingbackTone(true)
                    .isupHeadersEnabled(true)
                    .prackEnabled(true)
                    .shakenStirEnabled(true)
                    .sipCompactHeadersEnabled(true)
                    .sipRegion(InboundIp.SipRegion.US)
                    .sipSubdomain("test")
                    .sipSubdomainReceiveSettings(
                        InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                    )
                    .timeout1xxSecs(10L)
                    .timeout2xxSecs(20L)
                    .build()
            )
            .iosPushCredentialId("ec0c8e5d-439e-4620-a0c1-9d9c8d02a836")
            .onnetT38PassthroughEnabled(false)
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
            .rtcpSettings(
                ConnectionRtcpSettings.builder()
                    .captureEnabled(true)
                    .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                    .reportFrequencySecs(10L)
                    .build()
            )
            .addTag("tag1")
            .addTag("tag2")
            .transportProtocol(IpConnectionUpdateParams.TransportProtocol.UDP)
            .webhookApiVersion(IpConnectionUpdateParams.WebhookApiVersion._1)
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = IpConnectionUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IpConnectionUpdateParams.builder()
                .id("id")
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
                .connectionName("string")
                .defaultOnHoldComfortNoiseEnabled(true)
                .dtmfType(DtmfType.RFC_2833)
                .encodeContactHeaderEnabled(true)
                .encryptedMedia(EncryptedMedia.SRTP)
                .inbound(
                    InboundIp.builder()
                        .aniNumberFormat(InboundIp.AniNumberFormat.PLUS_E_164)
                        .channelLimit(10L)
                        .addCodec("string")
                        .defaultPrimaryIpId("192.168.0.0")
                        .defaultRoutingMethod(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
                        .defaultSecondaryIpId("192.168.0.0")
                        .defaultTertiaryIpId("192.168.0.0")
                        .dnisNumberFormat(InboundIp.DnisNumberFormat.PLUS_E164)
                        .generateRingbackTone(true)
                        .isupHeadersEnabled(true)
                        .prackEnabled(true)
                        .shakenStirEnabled(true)
                        .sipCompactHeadersEnabled(true)
                        .sipRegion(InboundIp.SipRegion.US)
                        .sipSubdomain("test")
                        .sipSubdomainReceiveSettings(
                            InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                        )
                        .timeout1xxSecs(10L)
                        .timeout2xxSecs(20L)
                        .build()
                )
                .iosPushCredentialId("ec0c8e5d-439e-4620-a0c1-9d9c8d02a836")
                .onnetT38PassthroughEnabled(false)
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
                .rtcpSettings(
                    ConnectionRtcpSettings.builder()
                        .captureEnabled(true)
                        .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                        .reportFrequencySecs(10L)
                        .build()
                )
                .addTag("tag1")
                .addTag("tag2")
                .transportProtocol(IpConnectionUpdateParams.TransportProtocol.UDP)
                .webhookApiVersion(IpConnectionUpdateParams.WebhookApiVersion._1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.active()).contains(true)
        assertThat(body.anchorsiteOverride()).contains(AnchorsiteOverride.LATENCY)
        assertThat(body.androidPushCredentialId()).contains("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
        assertThat(body.connectionName()).contains("string")
        assertThat(body.defaultOnHoldComfortNoiseEnabled()).contains(true)
        assertThat(body.dtmfType()).contains(DtmfType.RFC_2833)
        assertThat(body.encodeContactHeaderEnabled()).contains(true)
        assertThat(body.encryptedMedia()).contains(EncryptedMedia.SRTP)
        assertThat(body.inbound())
            .contains(
                InboundIp.builder()
                    .aniNumberFormat(InboundIp.AniNumberFormat.PLUS_E_164)
                    .channelLimit(10L)
                    .addCodec("string")
                    .defaultPrimaryIpId("192.168.0.0")
                    .defaultRoutingMethod(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
                    .defaultSecondaryIpId("192.168.0.0")
                    .defaultTertiaryIpId("192.168.0.0")
                    .dnisNumberFormat(InboundIp.DnisNumberFormat.PLUS_E164)
                    .generateRingbackTone(true)
                    .isupHeadersEnabled(true)
                    .prackEnabled(true)
                    .shakenStirEnabled(true)
                    .sipCompactHeadersEnabled(true)
                    .sipRegion(InboundIp.SipRegion.US)
                    .sipSubdomain("test")
                    .sipSubdomainReceiveSettings(
                        InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                    )
                    .timeout1xxSecs(10L)
                    .timeout2xxSecs(20L)
                    .build()
            )
        assertThat(body.iosPushCredentialId()).contains("ec0c8e5d-439e-4620-a0c1-9d9c8d02a836")
        assertThat(body.onnetT38PassthroughEnabled()).contains(false)
        assertThat(body.outbound())
            .contains(
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
        assertThat(body.rtcpSettings())
            .contains(
                ConnectionRtcpSettings.builder()
                    .captureEnabled(true)
                    .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                    .reportFrequencySecs(10L)
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(body.transportProtocol())
            .contains(IpConnectionUpdateParams.TransportProtocol.UDP)
        assertThat(body.webhookApiVersion()).contains(IpConnectionUpdateParams.WebhookApiVersion._1)
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookEventUrl()).contains("https://example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IpConnectionUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
