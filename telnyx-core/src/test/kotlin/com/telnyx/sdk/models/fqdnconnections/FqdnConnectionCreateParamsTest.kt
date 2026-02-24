// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections

import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnConnectionCreateParamsTest {

    @Test
    fun create() {
        FqdnConnectionCreateParams.builder()
            .connectionName("string")
            .active(true)
            .anchorsiteOverride(AnchorsiteOverride.LATENCY)
            .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
            .callCostInWebhooks(false)
            .defaultOnHoldComfortNoiseEnabled(true)
            .dtmfType(DtmfType.RFC_2833)
            .encodeContactHeaderEnabled(true)
            .encryptedMedia(EncryptedMedia.SRTP)
            .inbound(
                InboundFqdn.builder()
                    .aniNumberFormat(InboundFqdn.AniNumberFormat.PLUS_E_164)
                    .channelLimit(10L)
                    .addCodec("G722")
                    .defaultPrimaryFqdnId("1293384261075731497")
                    .defaultRoutingMethod(InboundFqdn.DefaultRoutingMethod.SEQUENTIAL)
                    .defaultSecondaryFqdnId("1293384261075731498")
                    .defaultTertiaryFqdnId("1293384261075731499")
                    .dnisNumberFormat(InboundFqdn.DnisNumberFormat.PLUS_E164)
                    .generateRingbackTone(true)
                    .isupHeadersEnabled(true)
                    .prackEnabled(true)
                    .shakenStirEnabled(true)
                    .sipCompactHeadersEnabled(true)
                    .sipRegion(InboundFqdn.SipRegion.US)
                    .sipSubdomain("string")
                    .sipSubdomainReceiveSettings(
                        InboundFqdn.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                    )
                    .timeout1xxSecs(10L)
                    .timeout2xxSecs(10L)
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
            .microsoftTeamsSbc(true)
            .noiseSuppression(FqdnConnectionCreateParams.NoiseSuppression.BOTH)
            .noiseSuppressionDetails(
                ConnectionNoiseSuppressionDetails.builder()
                    .attenuationLimit(80L)
                    .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                    .build()
            )
            .onnetT38PassthroughEnabled(true)
            .outbound(
                OutboundFqdn.builder()
                    .aniOverride("+1234567890")
                    .aniOverrideType(OutboundFqdn.AniOverrideType.ALWAYS)
                    .callParkingEnabled(true)
                    .channelLimit(10L)
                    .encryptedMedia(EncryptedMedia.SRTP)
                    .generateRingbackTone(true)
                    .instantRingbackEnabled(true)
                    .ipAuthenticationMethod(
                        OutboundFqdn.IpAuthenticationMethod.CREDENTIAL_AUTHENTICATION
                    )
                    .ipAuthenticationToken("aBcD1234")
                    .localization("string")
                    .outboundVoiceProfileId("1293384261075731499")
                    .t38ReinviteSource(OutboundFqdn.T38ReinviteSource.CUSTOMER)
                    .techPrefix("0123")
                    .timeout1xxSecs(10L)
                    .timeout2xxSecs(10L)
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
            .transportProtocol(TransportProtocol.UDP)
            .webhookApiVersion(WebhookApiVersion.V1)
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun body() {
        val params =
            FqdnConnectionCreateParams.builder()
                .connectionName("string")
                .active(true)
                .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
                .callCostInWebhooks(false)
                .defaultOnHoldComfortNoiseEnabled(true)
                .dtmfType(DtmfType.RFC_2833)
                .encodeContactHeaderEnabled(true)
                .encryptedMedia(EncryptedMedia.SRTP)
                .inbound(
                    InboundFqdn.builder()
                        .aniNumberFormat(InboundFqdn.AniNumberFormat.PLUS_E_164)
                        .channelLimit(10L)
                        .addCodec("G722")
                        .defaultPrimaryFqdnId("1293384261075731497")
                        .defaultRoutingMethod(InboundFqdn.DefaultRoutingMethod.SEQUENTIAL)
                        .defaultSecondaryFqdnId("1293384261075731498")
                        .defaultTertiaryFqdnId("1293384261075731499")
                        .dnisNumberFormat(InboundFqdn.DnisNumberFormat.PLUS_E164)
                        .generateRingbackTone(true)
                        .isupHeadersEnabled(true)
                        .prackEnabled(true)
                        .shakenStirEnabled(true)
                        .sipCompactHeadersEnabled(true)
                        .sipRegion(InboundFqdn.SipRegion.US)
                        .sipSubdomain("string")
                        .sipSubdomainReceiveSettings(
                            InboundFqdn.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                        )
                        .timeout1xxSecs(10L)
                        .timeout2xxSecs(10L)
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
                .microsoftTeamsSbc(true)
                .noiseSuppression(FqdnConnectionCreateParams.NoiseSuppression.BOTH)
                .noiseSuppressionDetails(
                    ConnectionNoiseSuppressionDetails.builder()
                        .attenuationLimit(80L)
                        .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                        .build()
                )
                .onnetT38PassthroughEnabled(true)
                .outbound(
                    OutboundFqdn.builder()
                        .aniOverride("+1234567890")
                        .aniOverrideType(OutboundFqdn.AniOverrideType.ALWAYS)
                        .callParkingEnabled(true)
                        .channelLimit(10L)
                        .encryptedMedia(EncryptedMedia.SRTP)
                        .generateRingbackTone(true)
                        .instantRingbackEnabled(true)
                        .ipAuthenticationMethod(
                            OutboundFqdn.IpAuthenticationMethod.CREDENTIAL_AUTHENTICATION
                        )
                        .ipAuthenticationToken("aBcD1234")
                        .localization("string")
                        .outboundVoiceProfileId("1293384261075731499")
                        .t38ReinviteSource(OutboundFqdn.T38ReinviteSource.CUSTOMER)
                        .techPrefix("0123")
                        .timeout1xxSecs(10L)
                        .timeout2xxSecs(10L)
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
                .transportProtocol(TransportProtocol.UDP)
                .webhookApiVersion(WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.connectionName()).isEqualTo("string")
        assertThat(body.active()).contains(true)
        assertThat(body.anchorsiteOverride()).contains(AnchorsiteOverride.LATENCY)
        assertThat(body.androidPushCredentialId()).contains("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
        assertThat(body.callCostInWebhooks()).contains(false)
        assertThat(body.defaultOnHoldComfortNoiseEnabled()).contains(true)
        assertThat(body.dtmfType()).contains(DtmfType.RFC_2833)
        assertThat(body.encodeContactHeaderEnabled()).contains(true)
        assertThat(body.encryptedMedia()).contains(EncryptedMedia.SRTP)
        assertThat(body.inbound())
            .contains(
                InboundFqdn.builder()
                    .aniNumberFormat(InboundFqdn.AniNumberFormat.PLUS_E_164)
                    .channelLimit(10L)
                    .addCodec("G722")
                    .defaultPrimaryFqdnId("1293384261075731497")
                    .defaultRoutingMethod(InboundFqdn.DefaultRoutingMethod.SEQUENTIAL)
                    .defaultSecondaryFqdnId("1293384261075731498")
                    .defaultTertiaryFqdnId("1293384261075731499")
                    .dnisNumberFormat(InboundFqdn.DnisNumberFormat.PLUS_E164)
                    .generateRingbackTone(true)
                    .isupHeadersEnabled(true)
                    .prackEnabled(true)
                    .shakenStirEnabled(true)
                    .sipCompactHeadersEnabled(true)
                    .sipRegion(InboundFqdn.SipRegion.US)
                    .sipSubdomain("string")
                    .sipSubdomainReceiveSettings(
                        InboundFqdn.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                    )
                    .timeout1xxSecs(10L)
                    .timeout2xxSecs(10L)
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
        assertThat(body.microsoftTeamsSbc()).contains(true)
        assertThat(body.noiseSuppression())
            .contains(FqdnConnectionCreateParams.NoiseSuppression.BOTH)
        assertThat(body.noiseSuppressionDetails())
            .contains(
                ConnectionNoiseSuppressionDetails.builder()
                    .attenuationLimit(80L)
                    .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                    .build()
            )
        assertThat(body.onnetT38PassthroughEnabled()).contains(true)
        assertThat(body.outbound())
            .contains(
                OutboundFqdn.builder()
                    .aniOverride("+1234567890")
                    .aniOverrideType(OutboundFqdn.AniOverrideType.ALWAYS)
                    .callParkingEnabled(true)
                    .channelLimit(10L)
                    .encryptedMedia(EncryptedMedia.SRTP)
                    .generateRingbackTone(true)
                    .instantRingbackEnabled(true)
                    .ipAuthenticationMethod(
                        OutboundFqdn.IpAuthenticationMethod.CREDENTIAL_AUTHENTICATION
                    )
                    .ipAuthenticationToken("aBcD1234")
                    .localization("string")
                    .outboundVoiceProfileId("1293384261075731499")
                    .t38ReinviteSource(OutboundFqdn.T38ReinviteSource.CUSTOMER)
                    .techPrefix("0123")
                    .timeout1xxSecs(10L)
                    .timeout2xxSecs(10L)
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
        assertThat(body.transportProtocol()).contains(TransportProtocol.UDP)
        assertThat(body.webhookApiVersion()).contains(WebhookApiVersion.V1)
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookEventUrl()).contains("https://example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FqdnConnectionCreateParams.builder().connectionName("string").build()

        val body = params._body()

        assertThat(body.connectionName()).isEqualTo("string")
    }
}
