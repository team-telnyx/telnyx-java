// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.phonenumbers

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.phonenumbers.jobs.JobDeleteBatchParams
import com.telnyx.api.models.phonenumbers.jobs.JobListParams
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateBatchParams
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateEmergencySettingsBatchParams
import com.telnyx.api.models.phonenumbers.voice.CallForwarding
import com.telnyx.api.models.phonenumbers.voice.CallRecording
import com.telnyx.api.models.phonenumbers.voice.CnamListing
import com.telnyx.api.models.phonenumbers.voice.MediaFeatures
import com.telnyx.api.models.phonenumbers.voice.UpdateVoiceSettings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.phoneNumbers().jobs()

        val jobFuture = jobServiceAsync.retrieve("id")

        val job = jobFuture.get()
        job.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.phoneNumbers().jobs()

        val jobsFuture =
            jobServiceAsync.list(
                JobListParams.builder()
                    .filter(
                        JobListParams.Filter.builder()
                            .type(JobListParams.Filter.Type.UPDATE_EMERGENCY_SETTINGS)
                            .build()
                    )
                    .page(JobListParams.Page.builder().number(1L).size(1L).build())
                    .sort(JobListParams.Sort.CREATED_AT)
                    .build()
            )

        val jobs = jobsFuture.get()
        jobs.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteBatch() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.phoneNumbers().jobs()

        val responseFuture =
            jobServiceAsync.deleteBatch(
                JobDeleteBatchParams.builder()
                    .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBatch() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.phoneNumbers().jobs()

        val responseFuture =
            jobServiceAsync.updateBatch(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateEmergencySettingsBatch() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.phoneNumbers().jobs()

        val responseFuture =
            jobServiceAsync.updateEmergencySettingsBatch(
                JobUpdateEmergencySettingsBatchParams.builder()
                    .emergencyEnabled(true)
                    .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
                    .emergencyAddressId("53829456729313")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
