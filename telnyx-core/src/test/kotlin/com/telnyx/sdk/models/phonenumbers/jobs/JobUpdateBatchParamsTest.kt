// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.models.phonenumbers.voice.CallForwarding
import com.telnyx.sdk.models.phonenumbers.voice.CallRecording
import com.telnyx.sdk.models.phonenumbers.voice.CnamListing
import com.telnyx.sdk.models.phonenumbers.voice.MediaFeatures
import com.telnyx.sdk.models.phonenumbers.voice.UpdateVoiceSettings
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobUpdateBatchParamsTest {

    @Test
    fun create() {
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
                    .usagePaymentMethod(UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
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
                        .usagePaymentMethod(UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[billing_group_id]", "62e4bf2e-c278-4282-b524-488d9c9c43b2")
                    .put("filter[connection_id]", "1521916448077776306")
                    .put("filter[customer_reference]", "customer_reference")
                    .put("filter[emergency_address_id]", "9102160989215728032")
                    .put("filter[has_bundle]", "has_bundle")
                    .put("filter[phone_number]", "phone_number")
                    .put("filter[status]", "active")
                    .put("filter[tag]", "tag")
                    .put("filter[voice.connection_name][contains]", "test")
                    .put("filter[voice.connection_name][ends_with]", "test")
                    .put("filter[voice.connection_name][eq]", "test")
                    .put("filter[voice.connection_name][starts_with]", "test")
                    .put("filter[voice.usage_payment_method]", "channel")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            JobUpdateBatchParams.builder()
                .addPhoneNumber("1583466971586889004")
                .addPhoneNumber("+13127367254")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
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
                        .usagePaymentMethod(UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("1583466971586889004", "+13127367254")
        assertThat(body.billingGroupId()).contains("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
        assertThat(body.connectionId()).contains("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
        assertThat(body.customerReference()).contains("customer-reference")
        assertThat(body.deletionLockEnabled()).contains(true)
        assertThat(body.externalPin()).contains("123456")
        assertThat(body.hdVoiceEnabled()).contains(true)
        assertThat(body.tags().getOrNull()).containsExactly("tag")
        assertThat(body.voice())
            .contains(
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
                    .usagePaymentMethod(UpdateVoiceSettings.UsagePaymentMethod.PAY_PER_MINUTE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JobUpdateBatchParams.builder()
                .addPhoneNumber("1583466971586889004")
                .addPhoneNumber("+13127367254")
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("1583466971586889004", "+13127367254")
    }
}
