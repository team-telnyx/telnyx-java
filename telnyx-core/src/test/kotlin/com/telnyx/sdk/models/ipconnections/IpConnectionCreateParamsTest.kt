// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ipconnections

import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpConnectionCreateParamsTest {

    @Test
    fun create() {
        IpConnectionCreateParams.builder()
            .active(true)
            .anchorsiteOverride(AnchorsiteOverride.LATENCY)
            .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
            .callCostInWebhooks(false)
            .connectionName("string")
            .defaultOnHoldComfortNoiseEnabled(true)
            .dtmfType(DtmfType.RFC_2833)
            .encodeContactHeaderEnabled(true)
            .encryptedMedia(EncryptedMedia.SRTP)
            .inbound(
                IpConnectionCreateParams.Inbound.builder()
                    .aniNumberFormat(IpConnectionCreateParams.Inbound.AniNumberFormat.PLUS_E_164)
                    .channelLimit(10L)
                    .addCodec("G722")
                    .defaultRoutingMethod(
                        IpConnectionCreateParams.Inbound.DefaultRoutingMethod.SEQUENTIAL
                    )
                    .dnisNumberFormat(IpConnectionCreateParams.Inbound.DnisNumberFormat.PLUS_E164)
                    .generateRingbackTone(true)
                    .isupHeadersEnabled(true)
                    .prackEnabled(true)
                    .shakenStirEnabled(true)
                    .sipCompactHeadersEnabled(true)
                    .sipRegion(IpConnectionCreateParams.Inbound.SipRegion.US)
                    .sipSubdomain("test")
                    .sipSubdomainReceiveSettings(
                        IpConnectionCreateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .timeout1xxSecs(10L)
                    .timeout2xxSecs(20L)
                    .build()
            )
            .iosPushCredentialId("ec0c8e5d-439e-4620-a0c1-9d9c8d02a836")
            .jitterBuffer(
                ConnectionJitterBuffer.builder()
                    .enableJitterBuffer(true)
                    .jitterbufferMsecMax(200L)
                    .jitterbufferMsecMin(60L)
                    .build()
            )
            .noiseSuppression(IpConnectionCreateParams.NoiseSuppression.BOTH)
            .noiseSuppressionDetails(
                ConnectionNoiseSuppressionDetails.builder()
                    .attenuationLimit(80L)
                    .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                    .build()
            )
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
                    .outboundVoiceProfileId("1293384261075731499")
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
            .transportProtocol(IpConnectionCreateParams.TransportProtocol.UDP)
            .webhookApiVersion(IpConnectionCreateParams.WebhookApiVersion.V1)
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun body() {
        val params =
            IpConnectionCreateParams.builder()
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
                .callCostInWebhooks(false)
                .connectionName("string")
                .defaultOnHoldComfortNoiseEnabled(true)
                .dtmfType(DtmfType.RFC_2833)
                .encodeContactHeaderEnabled(true)
                .encryptedMedia(EncryptedMedia.SRTP)
                .inbound(
                    IpConnectionCreateParams.Inbound.builder()
                        .aniNumberFormat(
                            IpConnectionCreateParams.Inbound.AniNumberFormat.PLUS_E_164
                        )
                        .channelLimit(10L)
                        .addCodec("G722")
                        .defaultRoutingMethod(
                            IpConnectionCreateParams.Inbound.DefaultRoutingMethod.SEQUENTIAL
                        )
                        .dnisNumberFormat(
                            IpConnectionCreateParams.Inbound.DnisNumberFormat.PLUS_E164
                        )
                        .generateRingbackTone(true)
                        .isupHeadersEnabled(true)
                        .prackEnabled(true)
                        .shakenStirEnabled(true)
                        .sipCompactHeadersEnabled(true)
                        .sipRegion(IpConnectionCreateParams.Inbound.SipRegion.US)
                        .sipSubdomain("test")
                        .sipSubdomainReceiveSettings(
                            IpConnectionCreateParams.Inbound.SipSubdomainReceiveSettings
                                .ONLY_MY_CONNECTIONS
                        )
                        .timeout1xxSecs(10L)
                        .timeout2xxSecs(20L)
                        .build()
                )
                .iosPushCredentialId("ec0c8e5d-439e-4620-a0c1-9d9c8d02a836")
                .jitterBuffer(
                    ConnectionJitterBuffer.builder()
                        .enableJitterBuffer(true)
                        .jitterbufferMsecMax(200L)
                        .jitterbufferMsecMin(60L)
                        .build()
                )
                .noiseSuppression(IpConnectionCreateParams.NoiseSuppression.BOTH)
                .noiseSuppressionDetails(
                    ConnectionNoiseSuppressionDetails.builder()
                        .attenuationLimit(80L)
                        .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                        .build()
                )
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
                        .outboundVoiceProfileId("1293384261075731499")
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
                .transportProtocol(IpConnectionCreateParams.TransportProtocol.UDP)
                .webhookApiVersion(IpConnectionCreateParams.WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.active()).contains(true)
        assertThat(body.anchorsiteOverride()).contains(AnchorsiteOverride.LATENCY)
        assertThat(body.androidPushCredentialId()).contains("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
        assertThat(body.callCostInWebhooks()).contains(false)
        assertThat(body.connectionName()).contains("string")
        assertThat(body.defaultOnHoldComfortNoiseEnabled()).contains(true)
        assertThat(body.dtmfType()).contains(DtmfType.RFC_2833)
        assertThat(body.encodeContactHeaderEnabled()).contains(true)
        assertThat(body.encryptedMedia()).contains(EncryptedMedia.SRTP)
        assertThat(body.inbound())
            .contains(
                IpConnectionCreateParams.Inbound.builder()
                    .aniNumberFormat(IpConnectionCreateParams.Inbound.AniNumberFormat.PLUS_E_164)
                    .channelLimit(10L)
                    .addCodec("G722")
                    .defaultRoutingMethod(
                        IpConnectionCreateParams.Inbound.DefaultRoutingMethod.SEQUENTIAL
                    )
                    .dnisNumberFormat(IpConnectionCreateParams.Inbound.DnisNumberFormat.PLUS_E164)
                    .generateRingbackTone(true)
                    .isupHeadersEnabled(true)
                    .prackEnabled(true)
                    .shakenStirEnabled(true)
                    .sipCompactHeadersEnabled(true)
                    .sipRegion(IpConnectionCreateParams.Inbound.SipRegion.US)
                    .sipSubdomain("test")
                    .sipSubdomainReceiveSettings(
                        IpConnectionCreateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .timeout1xxSecs(10L)
                    .timeout2xxSecs(20L)
                    .build()
            )
        assertThat(body.iosPushCredentialId()).contains("ec0c8e5d-439e-4620-a0c1-9d9c8d02a836")
        assertThat(body.jitterBuffer())
            .contains(
                ConnectionJitterBuffer.builder()
                    .enableJitterBuffer(true)
                    .jitterbufferMsecMax(200L)
                    .jitterbufferMsecMin(60L)
                    .build()
            )
        assertThat(body.noiseSuppression()).contains(IpConnectionCreateParams.NoiseSuppression.BOTH)
        assertThat(body.noiseSuppressionDetails())
            .contains(
                ConnectionNoiseSuppressionDetails.builder()
                    .attenuationLimit(80L)
                    .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                    .build()
            )
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
                    .outboundVoiceProfileId("1293384261075731499")
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
            .contains(IpConnectionCreateParams.TransportProtocol.UDP)
        assertThat(body.webhookApiVersion()).contains(IpConnectionCreateParams.WebhookApiVersion.V1)
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookEventUrl()).contains("https://example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IpConnectionCreateParams.builder().build()

        val body = params._body()
    }
}
