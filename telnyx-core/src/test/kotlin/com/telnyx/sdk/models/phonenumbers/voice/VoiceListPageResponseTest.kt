// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.phonenumbers.actions.PhoneNumberWithVoiceSettings
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceListPageResponseTest {

    @Test
    fun create() {
        val voiceListPageResponse =
            VoiceListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(voiceListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(voiceListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceListPageResponse =
            VoiceListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedVoiceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceListPageResponse),
                jacksonTypeRef<VoiceListPageResponse>(),
            )

        assertThat(roundtrippedVoiceListPageResponse).isEqualTo(voiceListPageResponse)
    }
}
