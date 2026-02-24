// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionCreateParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionUpdateParams
import com.telnyx.sdk.models.fqdnconnections.InboundFqdn
import com.telnyx.sdk.models.fqdnconnections.OutboundFqdn
import com.telnyx.sdk.models.fqdnconnections.TransportProtocol
import com.telnyx.sdk.models.fqdnconnections.WebhookApiVersion
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FqdnConnectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnection =
            fqdnConnectionService.create(
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
            )

        fqdnConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnection = fqdnConnectionService.retrieve("1293384261075731499")

        fqdnConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnection =
            fqdnConnectionService.update(
                FqdnConnectionUpdateParams.builder()
                    .id("1293384261075731499")
                    .active(true)
                    .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                    .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
                    .callCostInWebhooks(true)
                    .connectionName("string")
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
                    .noiseSuppression(FqdnConnectionUpdateParams.NoiseSuppression.BOTH)
                    .noiseSuppressionDetails(
                        ConnectionNoiseSuppressionDetails.builder()
                            .attenuationLimit(80L)
                            .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                            .build()
                    )
                    .onnetT38PassthroughEnabled(true)
                    .outbound(
                        OutboundFqdn.builder()
                            .aniOverride("ani_override")
                            .aniOverrideType(OutboundFqdn.AniOverrideType.NORMAL)
                            .callParkingEnabled(true)
                            .channelLimit(0L)
                            .encryptedMedia(EncryptedMedia.SRTP)
                            .generateRingbackTone(true)
                            .instantRingbackEnabled(true)
                            .ipAuthenticationMethod(
                                OutboundFqdn.IpAuthenticationMethod.CREDENTIAL_AUTHENTICATION
                            )
                            .ipAuthenticationToken("ip_authentication_token")
                            .localization("US")
                            .outboundVoiceProfileId("1293384261075731499")
                            .t38ReinviteSource(OutboundFqdn.T38ReinviteSource.TELNYX)
                            .techPrefix("tech_prefix")
                            .timeout1xxSecs(1L)
                            .timeout2xxSecs(1L)
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
            )

        fqdnConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnConnectionService = client.fqdnConnections()

        val page = fqdnConnectionService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnection = fqdnConnectionService.delete("1293384261075731499")

        fqdnConnection.validate()
    }
}
