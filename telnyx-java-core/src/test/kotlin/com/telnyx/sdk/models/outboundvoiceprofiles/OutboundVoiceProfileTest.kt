// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundVoiceProfileTest {

    @Test
    fun create() {
        val outboundVoiceProfile =
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
                        .endTime("20:00")
                        .startTime("08:00")
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

        assertThat(outboundVoiceProfile.name()).isEqualTo("office")
        assertThat(outboundVoiceProfile.id()).contains("1293384261075731499")
        assertThat(outboundVoiceProfile.billingGroupId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(outboundVoiceProfile.callRecording())
            .contains(
                OutboundCallRecording.builder()
                    .addCallRecordingCallerPhoneNumber("+19705555098")
                    .callRecordingChannels(OutboundCallRecording.CallRecordingChannels.DUAL)
                    .callRecordingFormat(OutboundCallRecording.CallRecordingFormat.MP3)
                    .callRecordingType(
                        OutboundCallRecording.CallRecordingType.BY_CALLER_PHONE_NUMBER
                    )
                    .build()
            )
        assertThat(outboundVoiceProfile.callingWindow())
            .contains(
                OutboundVoiceProfile.CallingWindow.builder()
                    .callsPerCld(5L)
                    .endTime("20:00")
                    .startTime("08:00")
                    .build()
            )
        assertThat(outboundVoiceProfile.concurrentCallLimit()).contains(10L)
        assertThat(outboundVoiceProfile.connectionsCount()).contains(12L)
        assertThat(outboundVoiceProfile.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(outboundVoiceProfile.dailySpendLimit()).contains("100.00")
        assertThat(outboundVoiceProfile.dailySpendLimitEnabled()).contains(true)
        assertThat(outboundVoiceProfile.enabled()).contains(true)
        assertThat(outboundVoiceProfile.maxDestinationRate()).contains(10.0)
        assertThat(outboundVoiceProfile.recordType()).contains("outbound_voice_profile")
        assertThat(outboundVoiceProfile.servicePlan()).contains(ServicePlan.GLOBAL)
        assertThat(outboundVoiceProfile.tags().getOrNull()).containsExactly("office-profile")
        assertThat(outboundVoiceProfile.trafficType()).contains(TrafficType.CONVERSATIONAL)
        assertThat(outboundVoiceProfile.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(outboundVoiceProfile.usagePaymentMethod()).contains(UsagePaymentMethod.RATE_DECK)
        assertThat(outboundVoiceProfile.whitelistedDestinations().getOrNull())
            .containsExactly("US", "BR", "AU")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outboundVoiceProfile =
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
                        .endTime("20:00")
                        .startTime("08:00")
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

        val roundtrippedOutboundVoiceProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outboundVoiceProfile),
                jacksonTypeRef<OutboundVoiceProfile>(),
            )

        assertThat(roundtrippedOutboundVoiceProfile).isEqualTo(outboundVoiceProfile)
    }
}
