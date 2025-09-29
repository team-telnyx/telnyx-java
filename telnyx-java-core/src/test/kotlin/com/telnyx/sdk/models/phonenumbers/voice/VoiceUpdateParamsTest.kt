// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceUpdateParamsTest {

    @Test
    fun create() {
        VoiceUpdateParams.builder()
            .id("1293384261075731499")
            .updateVoiceSettings(
                UpdateVoiceSettings.builder()
                    .callForwarding(
                        CallForwarding.builder()
                            .callForwardingEnabled(true)
                            .forwardingType(CallForwarding.ForwardingType.ALWAYS)
                            .forwardsTo("+13035559123")
                            .build()
                    )
                    .callRecording(
                        CallRecording.builder()
                            .inboundCallRecordingChannels(
                                CallRecording.InboundCallRecordingChannels.SINGLE
                            )
                            .inboundCallRecordingEnabled(true)
                            .inboundCallRecordingFormat(
                                CallRecording.InboundCallRecordingFormat.WAV
                            )
                            .build()
                    )
                    .callerIdNameEnabled(true)
                    .cnamListing(
                        CnamListing.builder()
                            .cnamListingDetails("example")
                            .cnamListingEnabled(true)
                            .build()
                    )
                    .inboundCallScreening(UpdateVoiceSettings.InboundCallScreening.DISABLED)
                    .mediaFeatures(
                        MediaFeatures.builder()
                            .acceptAnyRtpPacketsEnabled(true)
                            .rtpAutoAdjustEnabled(true)
                            .t38FaxGatewayEnabled(true)
                            .build()
                    )
                    .techPrefixEnabled(true)
                    .translatedNumber("+13035559999")
                    .usagePaymentMethod(UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VoiceUpdateParams.builder()
                .id("1293384261075731499")
                .updateVoiceSettings(UpdateVoiceSettings.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VoiceUpdateParams.builder()
                .id("1293384261075731499")
                .updateVoiceSettings(
                    UpdateVoiceSettings.builder()
                        .callForwarding(
                            CallForwarding.builder()
                                .callForwardingEnabled(true)
                                .forwardingType(CallForwarding.ForwardingType.ALWAYS)
                                .forwardsTo("+13035559123")
                                .build()
                        )
                        .callRecording(
                            CallRecording.builder()
                                .inboundCallRecordingChannels(
                                    CallRecording.InboundCallRecordingChannels.SINGLE
                                )
                                .inboundCallRecordingEnabled(true)
                                .inboundCallRecordingFormat(
                                    CallRecording.InboundCallRecordingFormat.WAV
                                )
                                .build()
                        )
                        .callerIdNameEnabled(true)
                        .cnamListing(
                            CnamListing.builder()
                                .cnamListingDetails("example")
                                .cnamListingEnabled(true)
                                .build()
                        )
                        .inboundCallScreening(UpdateVoiceSettings.InboundCallScreening.DISABLED)
                        .mediaFeatures(
                            MediaFeatures.builder()
                                .acceptAnyRtpPacketsEnabled(true)
                                .rtpAutoAdjustEnabled(true)
                                .t38FaxGatewayEnabled(true)
                                .build()
                        )
                        .techPrefixEnabled(true)
                        .translatedNumber("+13035559999")
                        .usagePaymentMethod(UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateVoiceSettings.builder()
                    .callForwarding(
                        CallForwarding.builder()
                            .callForwardingEnabled(true)
                            .forwardingType(CallForwarding.ForwardingType.ALWAYS)
                            .forwardsTo("+13035559123")
                            .build()
                    )
                    .callRecording(
                        CallRecording.builder()
                            .inboundCallRecordingChannels(
                                CallRecording.InboundCallRecordingChannels.SINGLE
                            )
                            .inboundCallRecordingEnabled(true)
                            .inboundCallRecordingFormat(
                                CallRecording.InboundCallRecordingFormat.WAV
                            )
                            .build()
                    )
                    .callerIdNameEnabled(true)
                    .cnamListing(
                        CnamListing.builder()
                            .cnamListingDetails("example")
                            .cnamListingEnabled(true)
                            .build()
                    )
                    .inboundCallScreening(UpdateVoiceSettings.InboundCallScreening.DISABLED)
                    .mediaFeatures(
                        MediaFeatures.builder()
                            .acceptAnyRtpPacketsEnabled(true)
                            .rtpAutoAdjustEnabled(true)
                            .t38FaxGatewayEnabled(true)
                            .build()
                    )
                    .techPrefixEnabled(true)
                    .translatedNumber("+13035559999")
                    .usagePaymentMethod(UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VoiceUpdateParams.builder()
                .id("1293384261075731499")
                .updateVoiceSettings(UpdateVoiceSettings.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdateVoiceSettings.builder().build())
    }
}
