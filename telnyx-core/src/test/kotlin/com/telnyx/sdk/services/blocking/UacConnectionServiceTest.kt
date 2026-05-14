// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UacConnectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uacConnectionService = client.uacConnections()

        val uacConnection =
            uacConnectionService.create(
                UacConnectionCreateParams.builder()
                    .connectionName("my name")
                    .active(true)
                    .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                    .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
                    .callCostInWebhooks(false)
                    .defaultOnHoldComfortNoiseEnabled(false)
                    .dtmfType(DtmfType.RFC_2833)
                    .encodeContactHeaderEnabled(true)
                    .encryptedMedia(EncryptedMedia.SRTP)
                    .externalUacSettings(
                        UacConnectionCreateParams.ExternalUacSettings.builder()
                            .authUsername("auth8492")
                            .expirationSec(600L)
                            .fromUser("8492")
                            .outboundProxy("outbound.sip-pbx.acme.example:5061")
                            .password("testtesttest")
                            .proxy("sip-pbx.acme.example")
                            .transport(UacConnectionCreateParams.ExternalUacSettings.Transport.TLS)
                            .username("ext8492")
                            .build()
                    )
                    .inbound(
                        UacConnectionCreateParams.Inbound.builder()
                            .aniNumberFormat(
                                UacConnectionCreateParams.Inbound.AniNumberFormat.PLUS_E_164
                            )
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultRoutingMethod(
                                UacConnectionCreateParams.Inbound.DefaultRoutingMethod.SEQUENTIAL
                            )
                            .dnisNumberFormat(
                                UacConnectionCreateParams.Inbound.DnisNumberFormat.PLUS_E164
                            )
                            .generateRingbackTone(true)
                            .isupHeadersEnabled(true)
                            .prackEnabled(true)
                            .shakenStirEnabled(true)
                            .simultaneousRinging(
                                UacConnectionCreateParams.Inbound.SimultaneousRinging.DISABLED
                            )
                            .sipCompactHeadersEnabled(true)
                            .timeout1xxSecs(10L)
                            .timeout2xxSecs(20L)
                            .build()
                    )
                    .internalUacSettings(
                        UacConnectionCreateParams.InternalUacSettings.builder()
                            .destinationUri("14155550123@acme.sip.telnyx.com")
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
                    .noiseSuppression(UacConnectionCreateParams.NoiseSuppression.BOTH)
                    .noiseSuppressionDetails(
                        ConnectionNoiseSuppressionDetails.builder()
                            .attenuationLimit(80L)
                            .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                            .build()
                    )
                    .onnetT38PassthroughEnabled(true)
                    .outbound(
                        UacConnectionCreateParams.Outbound.builder()
                            .aniOverride("always")
                            .aniOverrideType(
                                UacConnectionCreateParams.Outbound.AniOverrideType.ALWAYS
                            )
                            .callParkingEnabled(true)
                            .channelLimit(10L)
                            .generateRingbackTone(true)
                            .instantRingbackEnabled(true)
                            .localization("US")
                            .outboundVoiceProfileId("1293384261075731499")
                            .t38ReinviteSource(
                                UacConnectionCreateParams.Outbound.T38ReinviteSource.CUSTOMER
                            )
                            .build()
                    )
                    .password("my123secure456password789")
                    .rtcpSettings(
                        ConnectionRtcpSettings.builder()
                            .captureEnabled(true)
                            .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                            .reportFrequencySecs(10L)
                            .build()
                    )
                    .sipUriCallingPreference(
                        UacConnectionCreateParams.SipUriCallingPreference.DISABLED
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .userName("myusername123")
                    .webhookApiVersion(UacConnectionCreateParams.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        uacConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uacConnectionService = client.uacConnections()

        val uacConnection = uacConnectionService.retrieve("id")

        uacConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uacConnectionService = client.uacConnections()

        val uacConnection =
            uacConnectionService.update(
                UacConnectionUpdateParams.builder()
                    .id("id")
                    .active(true)
                    .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                    .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
                    .callCostInWebhooks(false)
                    .connectionName("my name")
                    .defaultOnHoldComfortNoiseEnabled(false)
                    .dtmfType(DtmfType.RFC_2833)
                    .encodeContactHeaderEnabled(true)
                    .encryptedMedia(EncryptedMedia.SRTP)
                    .externalUacSettings(
                        UacConnectionUpdateParams.ExternalUacSettings.builder()
                            .authUsername("auth8492")
                            .expirationSec(600L)
                            .fromUser("8492")
                            .outboundProxy("outbound.sip-pbx.acme.example:5061")
                            .password("testtesttest")
                            .proxy("sip-pbx.acme.example")
                            .transport(UacConnectionUpdateParams.ExternalUacSettings.Transport.TLS)
                            .username("ext8492")
                            .build()
                    )
                    .inbound(
                        UacConnectionUpdateParams.Inbound.builder()
                            .aniNumberFormat(
                                UacConnectionUpdateParams.Inbound.AniNumberFormat.PLUS_E_164
                            )
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultRoutingMethod(
                                UacConnectionUpdateParams.Inbound.DefaultRoutingMethod.SEQUENTIAL
                            )
                            .dnisNumberFormat(
                                UacConnectionUpdateParams.Inbound.DnisNumberFormat.PLUS_E164
                            )
                            .generateRingbackTone(true)
                            .isupHeadersEnabled(true)
                            .prackEnabled(true)
                            .shakenStirEnabled(true)
                            .simultaneousRinging(
                                UacConnectionUpdateParams.Inbound.SimultaneousRinging.DISABLED
                            )
                            .sipCompactHeadersEnabled(true)
                            .timeout1xxSecs(10L)
                            .timeout2xxSecs(20L)
                            .build()
                    )
                    .internalUacSettings(
                        UacConnectionUpdateParams.InternalUacSettings.builder()
                            .destinationUri("14155550123@acme.sip.telnyx.com")
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
                    .noiseSuppression(UacConnectionUpdateParams.NoiseSuppression.BOTH)
                    .noiseSuppressionDetails(
                        ConnectionNoiseSuppressionDetails.builder()
                            .attenuationLimit(80L)
                            .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                            .build()
                    )
                    .onnetT38PassthroughEnabled(true)
                    .outbound(
                        UacConnectionUpdateParams.Outbound.builder()
                            .aniOverride("always")
                            .aniOverrideType(
                                UacConnectionUpdateParams.Outbound.AniOverrideType.ALWAYS
                            )
                            .callParkingEnabled(true)
                            .channelLimit(10L)
                            .generateRingbackTone(true)
                            .instantRingbackEnabled(true)
                            .localization("US")
                            .outboundVoiceProfileId("1293384261075731499")
                            .t38ReinviteSource(
                                UacConnectionUpdateParams.Outbound.T38ReinviteSource.CUSTOMER
                            )
                            .build()
                    )
                    .password("my123secure456password789")
                    .rtcpSettings(
                        ConnectionRtcpSettings.builder()
                            .captureEnabled(true)
                            .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                            .reportFrequencySecs(10L)
                            .build()
                    )
                    .sipUriCallingPreference(
                        UacConnectionUpdateParams.SipUriCallingPreference.DISABLED
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .userName("myusername123")
                    .webhookApiVersion(UacConnectionUpdateParams.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        uacConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uacConnectionService = client.uacConnections()

        val page = uacConnectionService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uacConnectionService = client.uacConnections()

        val uacConnection = uacConnectionService.delete("id")

        uacConnection.validate()
    }
}
