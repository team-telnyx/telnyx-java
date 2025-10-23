// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.phonenumbers.voice.CallForwarding
import com.telnyx.sdk.models.phonenumbers.voice.CallRecording
import com.telnyx.sdk.models.phonenumbers.voice.CnamListing
import com.telnyx.sdk.models.phonenumbers.voice.MediaFeatures
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEnableEmergencyResponseTest {

    @Test
    fun create() {
        val actionEnableEmergencyResponse =
            ActionEnableEmergencyResponse.builder()
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

        assertThat(actionEnableEmergencyResponse.data())
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
        val actionEnableEmergencyResponse =
            ActionEnableEmergencyResponse.builder()
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

        val roundtrippedActionEnableEmergencyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionEnableEmergencyResponse),
                jacksonTypeRef<ActionEnableEmergencyResponse>(),
            )

        assertThat(roundtrippedActionEnableEmergencyResponse)
            .isEqualTo(actionEnableEmergencyResponse)
    }
}
