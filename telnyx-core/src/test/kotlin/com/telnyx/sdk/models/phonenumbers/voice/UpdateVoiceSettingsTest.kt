// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateVoiceSettingsTest {

    @Test
    fun create() {
        val updateVoiceSettings =
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
                        .inboundCallRecordingFormat(CallRecording.InboundCallRecordingFormat.WAV)
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

        assertThat(updateVoiceSettings.callForwarding())
            .contains(
                CallForwarding.builder()
                    .callForwardingEnabled(true)
                    .forwardingType(CallForwarding.ForwardingType.ALWAYS)
                    .forwardsTo("+13035559123")
                    .build()
            )
        assertThat(updateVoiceSettings.callRecording())
            .contains(
                CallRecording.builder()
                    .inboundCallRecordingChannels(CallRecording.InboundCallRecordingChannels.SINGLE)
                    .inboundCallRecordingEnabled(true)
                    .inboundCallRecordingFormat(CallRecording.InboundCallRecordingFormat.WAV)
                    .build()
            )
        assertThat(updateVoiceSettings.callerIdNameEnabled()).contains(true)
        assertThat(updateVoiceSettings.cnamListing())
            .contains(
                CnamListing.builder().cnamListingDetails("example").cnamListingEnabled(true).build()
            )
        assertThat(updateVoiceSettings.inboundCallScreening())
            .contains(UpdateVoiceSettings.InboundCallScreening.DISABLED)
        assertThat(updateVoiceSettings.mediaFeatures())
            .contains(
                MediaFeatures.builder()
                    .acceptAnyRtpPacketsEnabled(true)
                    .rtpAutoAdjustEnabled(true)
                    .t38FaxGatewayEnabled(true)
                    .build()
            )
        assertThat(updateVoiceSettings.techPrefixEnabled()).contains(true)
        assertThat(updateVoiceSettings.translatedNumber()).contains("+13035559999")
        assertThat(updateVoiceSettings.usagePaymentMethod())
            .contains(UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateVoiceSettings =
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
                        .inboundCallRecordingFormat(CallRecording.InboundCallRecordingFormat.WAV)
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

        val roundtrippedUpdateVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateVoiceSettings),
                jacksonTypeRef<UpdateVoiceSettings>(),
            )

        assertThat(roundtrippedUpdateVoiceSettings).isEqualTo(updateVoiceSettings)
    }
}
