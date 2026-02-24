// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundCallRecording
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileCreateParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateParams
import com.telnyx.sdk.models.outboundvoiceprofiles.ServicePlan
import com.telnyx.sdk.models.outboundvoiceprofiles.TrafficType
import com.telnyx.sdk.models.outboundvoiceprofiles.UsagePaymentMethod
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OutboundVoiceProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val outboundVoiceProfileService = client.outboundVoiceProfiles()

        val outboundVoiceProfile =
            outboundVoiceProfileService.create(
                OutboundVoiceProfileCreateParams.builder()
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
                        OutboundVoiceProfileCreateParams.CallingWindow.builder()
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
            )

        outboundVoiceProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val outboundVoiceProfileService = client.outboundVoiceProfiles()

        val outboundVoiceProfile = outboundVoiceProfileService.retrieve("1293384261075731499")

        outboundVoiceProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val outboundVoiceProfileService = client.outboundVoiceProfiles()

        val outboundVoiceProfile =
            outboundVoiceProfileService.update(
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
            )

        outboundVoiceProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val outboundVoiceProfileService = client.outboundVoiceProfiles()

        val page = outboundVoiceProfileService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val outboundVoiceProfileService = client.outboundVoiceProfiles()

        val outboundVoiceProfile = outboundVoiceProfileService.delete("1293384261075731499")

        outboundVoiceProfile.validate()
    }
}
