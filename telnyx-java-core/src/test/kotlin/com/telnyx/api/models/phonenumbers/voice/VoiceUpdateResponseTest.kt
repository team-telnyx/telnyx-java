// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.phonenumbers.actions.PhoneNumberWithVoiceSettings
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceUpdateResponseTest {

    @Test
    fun create() {
        val voiceUpdateResponse =
            VoiceUpdateResponse.builder()
                .data(
                    PhoneNumberWithVoiceSettings.builder()
                        .id("1293384261075731499")
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
                        .cnamListing(
                            CnamListing.builder()
                                .cnamListingDetails("example")
                                .cnamListingEnabled(true)
                                .build()
                        )
                        .connectionId("1d0e6cb8-8668-462e-94c6-49ae0f0ed48b")
                        .customerReference("customer-reference")
                        .emergency(
                            PhoneNumberWithVoiceSettings.Emergency.builder()
                                .emergencyAddressId("1315261609962112019")
                                .emergencyEnabled(true)
                                .emergencyStatus(
                                    PhoneNumberWithVoiceSettings.Emergency.EmergencyStatus.ACTIVE
                                )
                                .build()
                        )
                        .inboundCallScreening(
                            PhoneNumberWithVoiceSettings.InboundCallScreening.DISABLED
                        )
                        .mediaFeatures(
                            MediaFeatures.builder()
                                .acceptAnyRtpPacketsEnabled(true)
                                .rtpAutoAdjustEnabled(true)
                                .t38FaxGatewayEnabled(true)
                                .build()
                        )
                        .phoneNumber("+13035551234")
                        .recordType("voice_settings")
                        .techPrefixEnabled(false)
                        .translatedNumber("+13035559999")
                        .usagePaymentMethod(
                            PhoneNumberWithVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE
                        )
                        .build()
                )
                .build()

        assertThat(voiceUpdateResponse.data())
            .contains(
                PhoneNumberWithVoiceSettings.builder()
                    .id("1293384261075731499")
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
                    .cnamListing(
                        CnamListing.builder()
                            .cnamListingDetails("example")
                            .cnamListingEnabled(true)
                            .build()
                    )
                    .connectionId("1d0e6cb8-8668-462e-94c6-49ae0f0ed48b")
                    .customerReference("customer-reference")
                    .emergency(
                        PhoneNumberWithVoiceSettings.Emergency.builder()
                            .emergencyAddressId("1315261609962112019")
                            .emergencyEnabled(true)
                            .emergencyStatus(
                                PhoneNumberWithVoiceSettings.Emergency.EmergencyStatus.ACTIVE
                            )
                            .build()
                    )
                    .inboundCallScreening(
                        PhoneNumberWithVoiceSettings.InboundCallScreening.DISABLED
                    )
                    .mediaFeatures(
                        MediaFeatures.builder()
                            .acceptAnyRtpPacketsEnabled(true)
                            .rtpAutoAdjustEnabled(true)
                            .t38FaxGatewayEnabled(true)
                            .build()
                    )
                    .phoneNumber("+13035551234")
                    .recordType("voice_settings")
                    .techPrefixEnabled(false)
                    .translatedNumber("+13035559999")
                    .usagePaymentMethod(
                        PhoneNumberWithVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceUpdateResponse =
            VoiceUpdateResponse.builder()
                .data(
                    PhoneNumberWithVoiceSettings.builder()
                        .id("1293384261075731499")
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
                        .cnamListing(
                            CnamListing.builder()
                                .cnamListingDetails("example")
                                .cnamListingEnabled(true)
                                .build()
                        )
                        .connectionId("1d0e6cb8-8668-462e-94c6-49ae0f0ed48b")
                        .customerReference("customer-reference")
                        .emergency(
                            PhoneNumberWithVoiceSettings.Emergency.builder()
                                .emergencyAddressId("1315261609962112019")
                                .emergencyEnabled(true)
                                .emergencyStatus(
                                    PhoneNumberWithVoiceSettings.Emergency.EmergencyStatus.ACTIVE
                                )
                                .build()
                        )
                        .inboundCallScreening(
                            PhoneNumberWithVoiceSettings.InboundCallScreening.DISABLED
                        )
                        .mediaFeatures(
                            MediaFeatures.builder()
                                .acceptAnyRtpPacketsEnabled(true)
                                .rtpAutoAdjustEnabled(true)
                                .t38FaxGatewayEnabled(true)
                                .build()
                        )
                        .phoneNumber("+13035551234")
                        .recordType("voice_settings")
                        .techPrefixEnabled(false)
                        .translatedNumber("+13035559999")
                        .usagePaymentMethod(
                            PhoneNumberWithVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE
                        )
                        .build()
                )
                .build()

        val roundtrippedVoiceUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceUpdateResponse),
                jacksonTypeRef<VoiceUpdateResponse>(),
            )

        assertThat(roundtrippedVoiceUpdateResponse).isEqualTo(voiceUpdateResponse)
    }
}
