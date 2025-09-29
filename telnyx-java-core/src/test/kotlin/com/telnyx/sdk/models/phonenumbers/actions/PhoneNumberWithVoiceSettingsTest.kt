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

internal class PhoneNumberWithVoiceSettingsTest {

    @Test
    fun create() {
        val phoneNumberWithVoiceSettings =
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
                        .inboundCallRecordingFormat(CallRecording.InboundCallRecordingFormat.WAV)
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
                .inboundCallScreening(PhoneNumberWithVoiceSettings.InboundCallScreening.DISABLED)
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
                .usagePaymentMethod(PhoneNumberWithVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                .build()

        assertThat(phoneNumberWithVoiceSettings.id()).contains("1293384261075731499")
        assertThat(phoneNumberWithVoiceSettings.callForwarding())
            .contains(
                CallForwarding.builder()
                    .callForwardingEnabled(true)
                    .forwardingType(CallForwarding.ForwardingType.ALWAYS)
                    .forwardsTo("+13035559123")
                    .build()
            )
        assertThat(phoneNumberWithVoiceSettings.callRecording())
            .contains(
                CallRecording.builder()
                    .inboundCallRecordingChannels(CallRecording.InboundCallRecordingChannels.SINGLE)
                    .inboundCallRecordingEnabled(true)
                    .inboundCallRecordingFormat(CallRecording.InboundCallRecordingFormat.WAV)
                    .build()
            )
        assertThat(phoneNumberWithVoiceSettings.cnamListing())
            .contains(
                CnamListing.builder().cnamListingDetails("example").cnamListingEnabled(true).build()
            )
        assertThat(phoneNumberWithVoiceSettings.connectionId())
            .contains("1d0e6cb8-8668-462e-94c6-49ae0f0ed48b")
        assertThat(phoneNumberWithVoiceSettings.customerReference()).contains("customer-reference")
        assertThat(phoneNumberWithVoiceSettings.emergency())
            .contains(
                PhoneNumberWithVoiceSettings.Emergency.builder()
                    .emergencyAddressId("1315261609962112019")
                    .emergencyEnabled(true)
                    .emergencyStatus(PhoneNumberWithVoiceSettings.Emergency.EmergencyStatus.ACTIVE)
                    .build()
            )
        assertThat(phoneNumberWithVoiceSettings.inboundCallScreening())
            .contains(PhoneNumberWithVoiceSettings.InboundCallScreening.DISABLED)
        assertThat(phoneNumberWithVoiceSettings.mediaFeatures())
            .contains(
                MediaFeatures.builder()
                    .acceptAnyRtpPacketsEnabled(true)
                    .rtpAutoAdjustEnabled(true)
                    .t38FaxGatewayEnabled(true)
                    .build()
            )
        assertThat(phoneNumberWithVoiceSettings.phoneNumber()).contains("+13035551234")
        assertThat(phoneNumberWithVoiceSettings.recordType()).contains("voice_settings")
        assertThat(phoneNumberWithVoiceSettings.techPrefixEnabled()).contains(false)
        assertThat(phoneNumberWithVoiceSettings.translatedNumber()).contains("+13035559999")
        assertThat(phoneNumberWithVoiceSettings.usagePaymentMethod())
            .contains(PhoneNumberWithVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberWithVoiceSettings =
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
                        .inboundCallRecordingFormat(CallRecording.InboundCallRecordingFormat.WAV)
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
                .inboundCallScreening(PhoneNumberWithVoiceSettings.InboundCallScreening.DISABLED)
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
                .usagePaymentMethod(PhoneNumberWithVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                .build()

        val roundtrippedPhoneNumberWithVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberWithVoiceSettings),
                jacksonTypeRef<PhoneNumberWithVoiceSettings>(),
            )

        assertThat(roundtrippedPhoneNumberWithVoiceSettings).isEqualTo(phoneNumberWithVoiceSettings)
    }
}
