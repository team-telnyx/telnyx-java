// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.outboundvoiceprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundVoiceProfileRetrieveResponseTest {

    @Test
    fun create() {
        val outboundVoiceProfileRetrieveResponse =
            OutboundVoiceProfileRetrieveResponse.builder()
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

        assertThat(outboundVoiceProfileRetrieveResponse.data())
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
        val outboundVoiceProfileRetrieveResponse =
            OutboundVoiceProfileRetrieveResponse.builder()
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

        val roundtrippedOutboundVoiceProfileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outboundVoiceProfileRetrieveResponse),
                jacksonTypeRef<OutboundVoiceProfileRetrieveResponse>(),
            )

        assertThat(roundtrippedOutboundVoiceProfileRetrieveResponse)
            .isEqualTo(outboundVoiceProfileRetrieveResponse)
    }
}
