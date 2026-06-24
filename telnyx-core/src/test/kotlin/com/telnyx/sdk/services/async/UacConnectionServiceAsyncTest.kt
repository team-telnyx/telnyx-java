// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionNoiseSuppression
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateParams
import com.telnyx.sdk.models.uacconnections.UacExternalSettings
import com.telnyx.sdk.models.uacconnections.UacInboundRequest
import com.telnyx.sdk.models.uacconnections.UacInternalSettings
import com.telnyx.sdk.models.uacconnections.UacOutbound
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UacConnectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uacConnectionServiceAsync = client.uacConnections()

        val uacConnectionFuture =
            uacConnectionServiceAsync.create(
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
                        UacExternalSettings.builder()
                            .authUsername("auth8492")
                            .expirationSec(600L)
                            .fromUser("8492")
                            .outboundProxy("outbound.sip-pbx.acme.example:5061")
                            .password("testtesttest")
                            .proxy("sip-pbx.acme.example")
                            .transport(UacExternalSettings.Transport.TLS)
                            .username("ext8492")
                            .build()
                    )
                    .inbound(
                        UacInboundRequest.builder()
                            .aniNumberFormat(UacInboundRequest.AniNumberFormat.PLUS_E_164)
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultRoutingMethod(UacInboundRequest.DefaultRoutingMethod.SEQUENTIAL)
                            .dnisNumberFormat(UacInboundRequest.DnisNumberFormat.PLUS_E164)
                            .generateRingbackTone(true)
                            .isupHeadersEnabled(true)
                            .prackEnabled(true)
                            .shakenStirEnabled(true)
                            .simultaneousRinging(UacInboundRequest.SimultaneousRinging.DISABLED)
                            .sipCompactHeadersEnabled(true)
                            .timeout1xxSecs(10L)
                            .timeout2xxSecs(20L)
                            .build()
                    )
                    .internalUacSettings(
                        UacInternalSettings.builder()
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
                    .noiseSuppression(ConnectionNoiseSuppression.BOTH)
                    .noiseSuppressionDetails(
                        ConnectionNoiseSuppressionDetails.builder()
                            .attenuationLimit(80L)
                            .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                            .build()
                    )
                    .onnetT38PassthroughEnabled(true)
                    .outbound(
                        UacOutbound.builder()
                            .aniOverride("always")
                            .aniOverrideType(UacOutbound.AniOverrideType.ALWAYS)
                            .callParkingEnabled(true)
                            .channelLimit(10L)
                            .generateRingbackTone(true)
                            .instantRingbackEnabled(true)
                            .localization("US")
                            .outboundVoiceProfileId("1293384261075731499")
                            .t38ReinviteSource(UacOutbound.T38ReinviteSource.CUSTOMER)
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

        val uacConnection = uacConnectionFuture.get()
        uacConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uacConnectionServiceAsync = client.uacConnections()

        val uacConnectionFuture = uacConnectionServiceAsync.retrieve("id")

        val uacConnection = uacConnectionFuture.get()
        uacConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uacConnectionServiceAsync = client.uacConnections()

        val uacConnectionFuture =
            uacConnectionServiceAsync.update(
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
                        UacExternalSettings.builder()
                            .authUsername("auth8492")
                            .expirationSec(600L)
                            .fromUser("8492")
                            .outboundProxy("outbound.sip-pbx.acme.example:5061")
                            .password("testtesttest")
                            .proxy("sip-pbx.acme.example")
                            .transport(UacExternalSettings.Transport.TLS)
                            .username("ext8492")
                            .build()
                    )
                    .inbound(
                        UacInboundRequest.builder()
                            .aniNumberFormat(UacInboundRequest.AniNumberFormat.PLUS_E_164)
                            .channelLimit(10L)
                            .addCodec("G722")
                            .defaultRoutingMethod(UacInboundRequest.DefaultRoutingMethod.SEQUENTIAL)
                            .dnisNumberFormat(UacInboundRequest.DnisNumberFormat.PLUS_E164)
                            .generateRingbackTone(true)
                            .isupHeadersEnabled(true)
                            .prackEnabled(true)
                            .shakenStirEnabled(true)
                            .simultaneousRinging(UacInboundRequest.SimultaneousRinging.DISABLED)
                            .sipCompactHeadersEnabled(true)
                            .timeout1xxSecs(10L)
                            .timeout2xxSecs(20L)
                            .build()
                    )
                    .internalUacSettings(
                        UacInternalSettings.builder()
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
                    .noiseSuppression(ConnectionNoiseSuppression.BOTH)
                    .noiseSuppressionDetails(
                        ConnectionNoiseSuppressionDetails.builder()
                            .attenuationLimit(80L)
                            .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                            .build()
                    )
                    .onnetT38PassthroughEnabled(true)
                    .outbound(
                        UacOutbound.builder()
                            .aniOverride("always")
                            .aniOverrideType(UacOutbound.AniOverrideType.ALWAYS)
                            .callParkingEnabled(true)
                            .channelLimit(10L)
                            .generateRingbackTone(true)
                            .instantRingbackEnabled(true)
                            .localization("US")
                            .outboundVoiceProfileId("1293384261075731499")
                            .t38ReinviteSource(UacOutbound.T38ReinviteSource.CUSTOMER)
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

        val uacConnection = uacConnectionFuture.get()
        uacConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uacConnectionServiceAsync = client.uacConnections()

        val pageFuture = uacConnectionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uacConnectionServiceAsync = client.uacConnections()

        val uacConnectionFuture = uacConnectionServiceAsync.delete("id")

        val uacConnection = uacConnectionFuture.get()
        uacConnection.validate()
    }
}
