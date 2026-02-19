// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionCreateParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionUpdateParams
import com.telnyx.sdk.models.credentialconnections.CredentialInbound
import com.telnyx.sdk.models.credentialconnections.CredentialOutbound
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CredentialConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val credentialConnectionService = client.credentialConnections()

        val credentialConnection =
            credentialConnectionService.create(
                CredentialConnectionCreateParams.builder()
                    .connectionName("my name")
                    .password("my123secure456password789")
                    .userName("myusername123")
                    .active(true)
                    .anchorsiteOverride(AnchorsiteOverride.LATENCY)
                    .androidPushCredentialId("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
                    .callCostInWebhooks(false)
                    .defaultOnHoldComfortNoiseEnabled(false)
                    .dtmfType(DtmfType.RFC_2833)
                    .encodeContactHeaderEnabled(true)
                    .encryptedMedia(EncryptedMedia.SRTP)
                    .inbound(
                        CredentialInbound.builder()
                            .aniNumberFormat(CredentialInbound.AniNumberFormat.PLUS_E_164)
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultRoutingMethod(CredentialInbound.DefaultRoutingMethod.SEQUENTIAL)
                            .dnisNumberFormat(CredentialInbound.DnisNumberFormat.PLUS_E164)
                            .generateRingbackTone(true)
                            .isupHeadersEnabled(true)
                            .prackEnabled(true)
                            .shakenStirEnabled(true)
                            .simultaneousRinging(CredentialInbound.SimultaneousRinging.DISABLED)
                            .sipCompactHeadersEnabled(true)
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
                    .noiseSuppression(CredentialConnectionCreateParams.NoiseSuppression.BOTH)
                    .noiseSuppressionDetails(
                        ConnectionNoiseSuppressionDetails.builder()
                            .attenuationLimit(80L)
                            .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                            .build()
                    )
                    .onnetT38PassthroughEnabled(true)
                    .outbound(
                        CredentialOutbound.builder()
                            .aniOverride("always")
                            .aniOverrideType(CredentialOutbound.AniOverrideType.ALWAYS)
                            .callParkingEnabled(true)
                            .channelLimit(10L)
                            .generateRingbackTone(true)
                            .instantRingbackEnabled(true)
                            .localization("US")
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .t38ReinviteSource(CredentialOutbound.T38ReinviteSource.CUSTOMER)
                            .build()
                    )
                    .rtcpSettings(
                        ConnectionRtcpSettings.builder()
                            .captureEnabled(true)
                            .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                            .reportFrequencySecs(10L)
                            .build()
                    )
                    .sipUriCallingPreference(
                        CredentialConnectionCreateParams.SipUriCallingPreference.DISABLED
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .webhookApiVersion(CredentialConnectionCreateParams.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        credentialConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val credentialConnectionService = client.credentialConnections()

        val credentialConnection = credentialConnectionService.retrieve("id")

        credentialConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val credentialConnectionService = client.credentialConnections()

        val credentialConnection =
            credentialConnectionService.update(
                CredentialConnectionUpdateParams.builder()
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
                    .inbound(
                        CredentialInbound.builder()
                            .aniNumberFormat(CredentialInbound.AniNumberFormat.PLUS_E_164)
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultRoutingMethod(CredentialInbound.DefaultRoutingMethod.SEQUENTIAL)
                            .dnisNumberFormat(CredentialInbound.DnisNumberFormat.PLUS_E164)
                            .generateRingbackTone(true)
                            .isupHeadersEnabled(true)
                            .prackEnabled(true)
                            .shakenStirEnabled(true)
                            .simultaneousRinging(CredentialInbound.SimultaneousRinging.DISABLED)
                            .sipCompactHeadersEnabled(true)
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
                    .noiseSuppression(CredentialConnectionUpdateParams.NoiseSuppression.BOTH)
                    .noiseSuppressionDetails(
                        ConnectionNoiseSuppressionDetails.builder()
                            .attenuationLimit(80L)
                            .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                            .build()
                    )
                    .onnetT38PassthroughEnabled(true)
                    .outbound(
                        CredentialOutbound.builder()
                            .aniOverride("always")
                            .aniOverrideType(CredentialOutbound.AniOverrideType.ALWAYS)
                            .callParkingEnabled(true)
                            .channelLimit(10L)
                            .generateRingbackTone(true)
                            .instantRingbackEnabled(true)
                            .localization("US")
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .t38ReinviteSource(CredentialOutbound.T38ReinviteSource.CUSTOMER)
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
                        CredentialConnectionUpdateParams.SipUriCallingPreference.DISABLED
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .userName("myusername123")
                    .webhookApiVersion(CredentialConnectionUpdateParams.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        credentialConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val credentialConnectionService = client.credentialConnections()

        val page = credentialConnectionService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val credentialConnectionService = client.credentialConnections()

        val credentialConnection = credentialConnectionService.delete("id")

        credentialConnection.validate()
    }
}
