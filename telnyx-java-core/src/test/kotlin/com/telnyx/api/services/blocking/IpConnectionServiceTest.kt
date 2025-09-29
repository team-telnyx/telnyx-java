// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.credentialconnections.AnchorsiteOverride
import com.telnyx.api.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.api.models.credentialconnections.DtmfType
import com.telnyx.api.models.credentialconnections.EncryptedMedia
import com.telnyx.api.models.ipconnections.InboundIp
import com.telnyx.api.models.ipconnections.IpConnectionCreateParams
import com.telnyx.api.models.ipconnections.IpConnectionListParams
import com.telnyx.api.models.ipconnections.IpConnectionUpdateParams
import com.telnyx.api.models.ipconnections.OutboundIp
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IpConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ipConnectionService = client.ipConnections()

        val ipConnection =
            ipConnectionService.create(
                IpConnectionCreateParams.builder()
                    .active(true)
                    .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                    .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
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
                            .addCodec("string")
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
                    .transportProtocol(IpConnectionCreateParams.TransportProtocol.UDP)
                    .webhookApiVersion(IpConnectionCreateParams.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        ipConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ipConnectionService = client.ipConnections()

        val ipConnection = ipConnectionService.retrieve("id")

        ipConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ipConnectionService = client.ipConnections()

        val ipConnection =
            ipConnectionService.update(
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
            )

        ipConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ipConnectionService = client.ipConnections()

        val ipConnections =
            ipConnectionService.list(
                IpConnectionListParams.builder()
                    .filter(
                        IpConnectionListParams.Filter.builder()
                            .connectionName(
                                IpConnectionListParams.Filter.ConnectionName.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .fqdn("fqdn")
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .page(IpConnectionListParams.Page.builder().number(1L).size(1L).build())
                    .sort(IpConnectionListParams.Sort.CONNECTION_NAME)
                    .build()
            )

        ipConnections.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ipConnectionService = client.ipConnections()

        val ipConnection = ipConnectionService.delete("id")

        ipConnection.validate()
    }
}
