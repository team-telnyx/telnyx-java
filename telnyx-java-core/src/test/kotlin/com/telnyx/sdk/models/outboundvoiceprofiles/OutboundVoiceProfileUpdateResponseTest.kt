// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundVoiceProfileUpdateResponseTest {

    @Test
    fun create() {
        val outboundVoiceProfileUpdateResponse =
            OutboundVoiceProfileUpdateResponse.builder()
                .data(
                    OutboundVoiceProfile.builder()
                        .name("office")
                        .id("1293384261075731499")
                        .billingGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .callRecording(
                            OutboundCallRecording.builder()
                                .addCallRecordingCallerPhoneNumber("+19705555098")
                                .callRecordingChannels(
                                    OutboundCallRecording.CallRecordingChannels.DUAL
                                )
                                .callRecordingFormat(OutboundCallRecording.CallRecordingFormat.MP3)
                                .callRecordingType(
                                    OutboundCallRecording.CallRecordingType.BY_CALLER_PHONE_NUMBER
                                )
                                .build()
                        )
                        .concurrentCallLimit(10L)
                        .connectionsCount(12L)
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dailySpendLimit("100.00")
                        .dailySpendLimitEnabled(true)
                        .enabled(true)
                        .maxDestinationRate(10.0)
                        .recordType("outbound_voice_profile")
                        .servicePlan(ServicePlan.GLOBAL)
                        .addTag("office-profile")
                        .trafficType(TrafficType.CONVERSATIONAL)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .usagePaymentMethod(UsagePaymentMethod.RATE_DECK)
                        .whitelistedDestinations(listOf("US", "BR", "AU"))
                        .build()
                )
                .build()

        assertThat(outboundVoiceProfileUpdateResponse.data())
            .contains(
                OutboundVoiceProfile.builder()
                    .name("office")
                    .id("1293384261075731499")
                    .billingGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .callRecording(
                        OutboundCallRecording.builder()
                            .addCallRecordingCallerPhoneNumber("+19705555098")
                            .callRecordingChannels(OutboundCallRecording.CallRecordingChannels.DUAL)
                            .callRecordingFormat(OutboundCallRecording.CallRecordingFormat.MP3)
                            .callRecordingType(
                                OutboundCallRecording.CallRecordingType.BY_CALLER_PHONE_NUMBER
                            )
                            .build()
                    )
                    .concurrentCallLimit(10L)
                    .connectionsCount(12L)
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .dailySpendLimit("100.00")
                    .dailySpendLimitEnabled(true)
                    .enabled(true)
                    .maxDestinationRate(10.0)
                    .recordType("outbound_voice_profile")
                    .servicePlan(ServicePlan.GLOBAL)
                    .addTag("office-profile")
                    .trafficType(TrafficType.CONVERSATIONAL)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .usagePaymentMethod(UsagePaymentMethod.RATE_DECK)
                    .whitelistedDestinations(listOf("US", "BR", "AU"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outboundVoiceProfileUpdateResponse =
            OutboundVoiceProfileUpdateResponse.builder()
                .data(
                    OutboundVoiceProfile.builder()
                        .name("office")
                        .id("1293384261075731499")
                        .billingGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .callRecording(
                            OutboundCallRecording.builder()
                                .addCallRecordingCallerPhoneNumber("+19705555098")
                                .callRecordingChannels(
                                    OutboundCallRecording.CallRecordingChannels.DUAL
                                )
                                .callRecordingFormat(OutboundCallRecording.CallRecordingFormat.MP3)
                                .callRecordingType(
                                    OutboundCallRecording.CallRecordingType.BY_CALLER_PHONE_NUMBER
                                )
                                .build()
                        )
                        .concurrentCallLimit(10L)
                        .connectionsCount(12L)
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dailySpendLimit("100.00")
                        .dailySpendLimitEnabled(true)
                        .enabled(true)
                        .maxDestinationRate(10.0)
                        .recordType("outbound_voice_profile")
                        .servicePlan(ServicePlan.GLOBAL)
                        .addTag("office-profile")
                        .trafficType(TrafficType.CONVERSATIONAL)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .usagePaymentMethod(UsagePaymentMethod.RATE_DECK)
                        .whitelistedDestinations(listOf("US", "BR", "AU"))
                        .build()
                )
                .build()

        val roundtrippedOutboundVoiceProfileUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outboundVoiceProfileUpdateResponse),
                jacksonTypeRef<OutboundVoiceProfileUpdateResponse>(),
            )

        assertThat(roundtrippedOutboundVoiceProfileUpdateResponse)
            .isEqualTo(outboundVoiceProfileUpdateResponse)
    }
}
