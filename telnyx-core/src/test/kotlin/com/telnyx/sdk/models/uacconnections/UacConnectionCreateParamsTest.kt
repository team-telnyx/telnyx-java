// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.telnyx.sdk.models.ConnectionJitterBuffer
import com.telnyx.sdk.models.ConnectionNoiseSuppressionDetails
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.ConnectionRtcpSettings
import com.telnyx.sdk.models.credentialconnections.DtmfType
import com.telnyx.sdk.models.credentialconnections.EncryptedMedia
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UacConnectionCreateParamsTest {

    @Test
    fun create() {
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
                UacConnectionCreateParams.Inbound.builder()
                    .aniNumberFormat(UacConnectionCreateParams.Inbound.AniNumberFormat.PLUS_E_164)
                    .channelLimit(10L)
                    .addCodec("G722")
                    .defaultRoutingMethod(
                        UacConnectionCreateParams.Inbound.DefaultRoutingMethod.SEQUENTIAL
                    )
                    .dnisNumberFormat(UacConnectionCreateParams.Inbound.DnisNumberFormat.PLUS_E164)
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
            .noiseSuppression(UacConnectionCreateParams.NoiseSuppression.BOTH)
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
            .sipUriCallingPreference(UacConnectionCreateParams.SipUriCallingPreference.DISABLED)
            .addTag("tag1")
            .addTag("tag2")
            .userName("myusername123")
            .webhookApiVersion(UacConnectionCreateParams.WebhookApiVersion.V1)
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun body() {
        val params =
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
                .noiseSuppression(UacConnectionCreateParams.NoiseSuppression.BOTH)
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
                .sipUriCallingPreference(UacConnectionCreateParams.SipUriCallingPreference.DISABLED)
                .addTag("tag1")
                .addTag("tag2")
                .userName("myusername123")
                .webhookApiVersion(UacConnectionCreateParams.WebhookApiVersion.V1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.connectionName()).isEqualTo("my name")
        assertThat(body.active()).contains(true)
        assertThat(body.anchorsiteOverride()).contains(AnchorsiteOverride.LATENCY)
        assertThat(body.androidPushCredentialId()).contains("06b09dfd-7154-4980-8b75-cebf7a9d4f8e")
        assertThat(body.callCostInWebhooks()).contains(false)
        assertThat(body.defaultOnHoldComfortNoiseEnabled()).contains(false)
        assertThat(body.dtmfType()).contains(DtmfType.RFC_2833)
        assertThat(body.encodeContactHeaderEnabled()).contains(true)
        assertThat(body.encryptedMedia()).contains(EncryptedMedia.SRTP)
        assertThat(body.externalUacSettings())
            .contains(
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
        assertThat(body.inbound())
            .contains(
                UacConnectionCreateParams.Inbound.builder()
                    .aniNumberFormat(UacConnectionCreateParams.Inbound.AniNumberFormat.PLUS_E_164)
                    .channelLimit(10L)
                    .addCodec("G722")
                    .defaultRoutingMethod(
                        UacConnectionCreateParams.Inbound.DefaultRoutingMethod.SEQUENTIAL
                    )
                    .dnisNumberFormat(UacConnectionCreateParams.Inbound.DnisNumberFormat.PLUS_E164)
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
        assertThat(body.internalUacSettings())
            .contains(
                UacInternalSettings.builder()
                    .destinationUri("14155550123@acme.sip.telnyx.com")
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
        assertThat(body.noiseSuppression())
            .contains(UacConnectionCreateParams.NoiseSuppression.BOTH)
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
        assertThat(body.password()).contains("my123secure456password789")
        assertThat(body.rtcpSettings())
            .contains(
                ConnectionRtcpSettings.builder()
                    .captureEnabled(true)
                    .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                    .reportFrequencySecs(10L)
                    .build()
            )
        assertThat(body.sipUriCallingPreference())
            .contains(UacConnectionCreateParams.SipUriCallingPreference.DISABLED)
        assertThat(body.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(body.userName()).contains("myusername123")
        assertThat(body.webhookApiVersion())
            .contains(UacConnectionCreateParams.WebhookApiVersion.V1)
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookEventUrl()).contains("https://example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UacConnectionCreateParams.builder().connectionName("my name").build()

        val body = params._body()

        assertThat(body.connectionName()).isEqualTo("my name")
    }
}
