// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundVoiceProfileUpdateParamsTest {

    @Test
    fun create() {
        OutboundVoiceProfileUpdateParams.builder()
            .id("1293384261075731499")
            .name("office")
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
                OutboundVoiceProfileUpdateParams.CallingWindow.builder()
                    .callsPerCld(5L)
                    .endTime("20:00:00.00Z")
                    .startTime("08:00:00.00Z")
                    .build()
            )
            .concurrentCallLimit(10L)
            .dailySpendLimit("100.00")
            .dailySpendLimitEnabled(true)
            .enabled(true)
            .maxDestinationRate(10.0)
            .servicePlan(ServicePlan.GLOBAL)
            .addTag("office-profile")
            .trafficType(TrafficType.CONVERSATIONAL)
            .usagePaymentMethod(UsagePaymentMethod.RATE_DECK)
            .whitelistedDestinations(listOf("US", "BR", "AU"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OutboundVoiceProfileUpdateParams.builder()
                .id("1293384261075731499")
                .name("office")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OutboundVoiceProfileUpdateParams.builder()
                .id("1293384261075731499")
                .name("office")
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
                    OutboundVoiceProfileUpdateParams.CallingWindow.builder()
                        .callsPerCld(5L)
                        .endTime("20:00:00.00Z")
                        .startTime("08:00:00.00Z")
                        .build()
                )
                .concurrentCallLimit(10L)
                .dailySpendLimit("100.00")
                .dailySpendLimitEnabled(true)
                .enabled(true)
                .maxDestinationRate(10.0)
                .servicePlan(ServicePlan.GLOBAL)
                .addTag("office-profile")
                .trafficType(TrafficType.CONVERSATIONAL)
                .usagePaymentMethod(UsagePaymentMethod.RATE_DECK)
                .whitelistedDestinations(listOf("US", "BR", "AU"))
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("office")
        assertThat(body.billingGroupId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.callRecording())
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
        assertThat(body.callingWindow())
            .contains(
                OutboundVoiceProfileUpdateParams.CallingWindow.builder()
                    .callsPerCld(5L)
                    .endTime("20:00:00.00Z")
                    .startTime("08:00:00.00Z")
                    .build()
            )
        assertThat(body.concurrentCallLimit()).contains(10L)
        assertThat(body.dailySpendLimit()).contains("100.00")
        assertThat(body.dailySpendLimitEnabled()).contains(true)
        assertThat(body.enabled()).contains(true)
        assertThat(body.maxDestinationRate()).contains(10.0)
        assertThat(body.servicePlan()).contains(ServicePlan.GLOBAL)
        assertThat(body.tags().getOrNull()).containsExactly("office-profile")
        assertThat(body.trafficType()).contains(TrafficType.CONVERSATIONAL)
        assertThat(body.usagePaymentMethod()).contains(UsagePaymentMethod.RATE_DECK)
        assertThat(body.whitelistedDestinations().getOrNull()).containsExactly("US", "BR", "AU")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OutboundVoiceProfileUpdateParams.builder()
                .id("1293384261075731499")
                .name("office")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("office")
    }
}
