// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundVoiceProfileListPageResponseTest {

    @Test
    fun create() {
        val outboundVoiceProfileListPageResponse =
            OutboundVoiceProfileListPageResponse.builder()
                .addData(
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
                        .callingWindow(
                            OutboundVoiceProfile.CallingWindow.builder()
                                .callsPerCld(5L)
                                .endTime("20:00:00")
                                .startTime("08:00:00")
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(outboundVoiceProfileListPageResponse.data().getOrNull())
            .containsExactly(
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
                    .callingWindow(
                        OutboundVoiceProfile.CallingWindow.builder()
                            .callsPerCld(5L)
                            .endTime("20:00:00")
                            .startTime("08:00:00")
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
        assertThat(outboundVoiceProfileListPageResponse.meta())
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
        val outboundVoiceProfileListPageResponse =
            OutboundVoiceProfileListPageResponse.builder()
                .addData(
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
                        .callingWindow(
                            OutboundVoiceProfile.CallingWindow.builder()
                                .callsPerCld(5L)
                                .endTime("20:00:00")
                                .startTime("08:00:00")
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedOutboundVoiceProfileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outboundVoiceProfileListPageResponse),
                jacksonTypeRef<OutboundVoiceProfileListPageResponse>(),
            )

        assertThat(roundtrippedOutboundVoiceProfileListPageResponse)
            .isEqualTo(outboundVoiceProfileListPageResponse)
    }
}
