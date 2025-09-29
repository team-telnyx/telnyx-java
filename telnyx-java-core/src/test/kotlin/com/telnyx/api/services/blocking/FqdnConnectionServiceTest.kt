// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.credentialconnections.AnchorsiteOverride
import com.telnyx.api.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.api.models.credentialconnections.DtmfType
import com.telnyx.api.models.credentialconnections.EncryptedMedia
import com.telnyx.api.models.fqdnconnections.FqdnConnectionCreateParams
import com.telnyx.api.models.fqdnconnections.FqdnConnectionListParams
import com.telnyx.api.models.fqdnconnections.FqdnConnectionUpdateParams
import com.telnyx.api.models.fqdnconnections.InboundFqdn
import com.telnyx.api.models.fqdnconnections.OutboundFqdn
import com.telnyx.api.models.fqdnconnections.TransportProtocol
import com.telnyx.api.models.fqdnconnections.WebhookApiVersion
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FqdnConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnection =
            fqdnConnectionService.create(
                FqdnConnectionCreateParams.builder()
                    .connectionName("string")
                    .active(true)
                    .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                    .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
                    .defaultOnHoldComfortNoiseEnabled(true)
                    .dtmfType(DtmfType.RFC_2833)
                    .encodeContactHeaderEnabled(true)
                    .encryptedMedia(EncryptedMedia.SRTP)
                    .inbound(
                        InboundFqdn.builder()
                            .aniNumberFormat(InboundFqdn.AniNumberFormat.PLUS_E_164)
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultPrimaryFqdnId("default_primary_fqdn_id")
                            .defaultRoutingMethod(InboundFqdn.DefaultRoutingMethod.SEQUENTIAL)
                            .defaultSecondaryFqdnId("default_secondary_fqdn_id")
                            .defaultTertiaryFqdnId("default_tertiary_fqdn_id")
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
                    .microsoftTeamsSbc(true)
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
                            .outboundVoiceProfileId("outbound_voice_profile_id")
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
                    .webhookApiVersion(WebhookApiVersion._1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        fqdnConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnection = fqdnConnectionService.retrieve("id")

        fqdnConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnection =
            fqdnConnectionService.update(
                FqdnConnectionUpdateParams.builder()
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
                        InboundFqdn.builder()
                            .aniNumberFormat(InboundFqdn.AniNumberFormat.PLUS_E_164)
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultPrimaryFqdnId("default_primary_fqdn_id")
                            .defaultRoutingMethod(InboundFqdn.DefaultRoutingMethod.SEQUENTIAL)
                            .defaultSecondaryFqdnId("default_secondary_fqdn_id")
                            .defaultTertiaryFqdnId("default_tertiary_fqdn_id")
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
                            .outboundVoiceProfileId("outbound_voice_profile_id")
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
                    .webhookApiVersion(WebhookApiVersion._1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        fqdnConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnections =
            fqdnConnectionService.list(
                FqdnConnectionListParams.builder()
                    .filter(
                        FqdnConnectionListParams.Filter.builder()
                            .connectionName(
                                FqdnConnectionListParams.Filter.ConnectionName.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .fqdn("fqdn")
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .page(FqdnConnectionListParams.Page.builder().number(1L).size(1L).build())
                    .sort(FqdnConnectionListParams.Sort.CONNECTION_NAME)
                    .build()
            )

        fqdnConnections.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fqdnConnectionService = client.fqdnConnections()

        val fqdnConnection = fqdnConnectionService.delete("id")

        fqdnConnection.validate()
    }
}
