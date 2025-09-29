// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.outboundvoiceprofiles.OutboundCallRecording
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileCreateParams
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileListParams
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateParams
import com.telnyx.api.models.outboundvoiceprofiles.ServicePlan
import com.telnyx.api.models.outboundvoiceprofiles.TrafficType
import com.telnyx.api.models.outboundvoiceprofiles.UsagePaymentMethod
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OutboundVoiceProfileServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboundVoiceProfileService = client.outboundVoiceProfiles()

        val outboundVoiceProfile = outboundVoiceProfileService.retrieve("1293384261075731499")

        outboundVoiceProfile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboundVoiceProfileService = client.outboundVoiceProfiles()

        val outboundVoiceProfiles =
            outboundVoiceProfileService.list(
                OutboundVoiceProfileListParams.builder()
                    .filter(
                        OutboundVoiceProfileListParams.Filter.builder()
                            .name(
                                OutboundVoiceProfileListParams.Filter.Name.builder()
                                    .contains("office-profile")
                                    .build()
                            )
                            .build()
                    )
                    .page(OutboundVoiceProfileListParams.Page.builder().number(1L).size(1L).build())
                    .sort(OutboundVoiceProfileListParams.Sort.NAME)
                    .build()
            )

        outboundVoiceProfiles.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboundVoiceProfileService = client.outboundVoiceProfiles()

        val outboundVoiceProfile = outboundVoiceProfileService.delete("1293384261075731499")

        outboundVoiceProfile.validate()
    }
}
