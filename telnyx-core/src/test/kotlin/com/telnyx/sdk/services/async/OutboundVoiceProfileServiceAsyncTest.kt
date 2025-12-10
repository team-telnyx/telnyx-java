// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundCallRecording
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileCreateParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateParams
import com.telnyx.sdk.models.outboundvoiceprofiles.ServicePlan
import com.telnyx.sdk.models.outboundvoiceprofiles.TrafficType
import com.telnyx.sdk.models.outboundvoiceprofiles.UsagePaymentMethod
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OutboundVoiceProfileServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboundVoiceProfileServiceAsync = client.outboundVoiceProfiles()

        val outboundVoiceProfileFuture =
            outboundVoiceProfileServiceAsync.create(
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
                            .endTime("18:11:19.117Z")
                            .startTime("18:11:19.117Z")
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

        val outboundVoiceProfile = outboundVoiceProfileFuture.get()
        outboundVoiceProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboundVoiceProfileServiceAsync = client.outboundVoiceProfiles()

        val outboundVoiceProfileFuture =
            outboundVoiceProfileServiceAsync.retrieve("1293384261075731499")

        val outboundVoiceProfile = outboundVoiceProfileFuture.get()
        outboundVoiceProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboundVoiceProfileServiceAsync = client.outboundVoiceProfiles()

        val outboundVoiceProfileFuture =
            outboundVoiceProfileServiceAsync.update(
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
                            .endTime("18:11:19.117Z")
                            .startTime("18:11:19.117Z")
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

        val outboundVoiceProfile = outboundVoiceProfileFuture.get()
        outboundVoiceProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboundVoiceProfileServiceAsync = client.outboundVoiceProfiles()

        val pageFuture = outboundVoiceProfileServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboundVoiceProfileServiceAsync = client.outboundVoiceProfiles()

        val outboundVoiceProfileFuture =
            outboundVoiceProfileServiceAsync.delete("1293384261075731499")

        val outboundVoiceProfile = outboundVoiceProfileFuture.get()
        outboundVoiceProfile.validate()
    }
}
