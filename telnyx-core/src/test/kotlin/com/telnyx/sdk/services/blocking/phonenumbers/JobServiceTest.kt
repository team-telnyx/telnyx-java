// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.phonenumbers.jobs.JobDeleteBatchParams
import com.telnyx.sdk.models.phonenumbers.jobs.JobUpdateBatchParams
import com.telnyx.sdk.models.phonenumbers.jobs.JobUpdateEmergencySettingsBatchParams
import com.telnyx.sdk.models.phonenumbers.voice.CallForwarding
import com.telnyx.sdk.models.phonenumbers.voice.CallRecording
import com.telnyx.sdk.models.phonenumbers.voice.CnamListing
import com.telnyx.sdk.models.phonenumbers.voice.MediaFeatures
import com.telnyx.sdk.models.phonenumbers.voice.UpdateVoiceSettings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.phoneNumbers().jobs()

        val job = jobService.retrieve("id")

        job.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.phoneNumbers().jobs()

        val page = jobService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteBatch() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.phoneNumbers().jobs()

        val response =
            jobService.deleteBatch(
                JobDeleteBatchParams.builder()
                    .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateBatch() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.phoneNumbers().jobs()

        val response =
            jobService.updateBatch(
                JobUpdateBatchParams.builder()
                    .filter(
                        JobUpdateBatchParams.Filter.builder()
                            .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                            .connectionId("1521916448077776306")
                            .customerReference("customer_reference")
                            .emergencyAddressId("9102160989215728032")
                            .hasBundle("has_bundle")
                            .phoneNumber("phone_number")
                            .status(JobUpdateBatchParams.Filter.Status.ACTIVE)
                            .tag("tag")
                            .voiceConnectionName(
                                JobUpdateBatchParams.Filter.VoiceConnectionName.builder()
                                    .contains("test")
                                    .endsWith("test")
                                    .eq("test")
                                    .startsWith("test")
                                    .build()
                            )
                            .voiceUsagePaymentMethod(
                                JobUpdateBatchParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                            )
                            .build()
                    )
                    .addPhoneNumber("1583466971586889004")
                    .addPhoneNumber("+13127367254")
                    .billingGroupId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .connectionId("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .customerReference("customer-reference")
                    .deletionLockEnabled(true)
                    .externalPin("123456")
                    .hdVoiceEnabled(true)
                    .addTag("tag")
                    .voice(
                        UpdateVoiceSettings.builder()
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
                            .callerIdNameEnabled(true)
                            .cnamListing(
                                CnamListing.builder()
                                    .cnamListingDetails("example")
                                    .cnamListingEnabled(true)
                                    .build()
                            )
                            .inboundCallScreening(UpdateVoiceSettings.InboundCallScreening.DISABLED)
                            .mediaFeatures(
                                MediaFeatures.builder()
                                    .acceptAnyRtpPacketsEnabled(true)
                                    .rtpAutoAdjustEnabled(true)
                                    .t38FaxGatewayEnabled(true)
                                    .build()
                            )
                            .techPrefixEnabled(true)
                            .translatedNumber("+13035559999")
                            .usagePaymentMethod(
                                UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateEmergencySettingsBatch() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.phoneNumbers().jobs()

        val response =
            jobService.updateEmergencySettingsBatch(
                JobUpdateEmergencySettingsBatchParams.builder()
                    .emergencyEnabled(true)
                    .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
                    .emergencyAddressId("53829456729313")
                    .build()
            )

        response.validate()
    }
}
