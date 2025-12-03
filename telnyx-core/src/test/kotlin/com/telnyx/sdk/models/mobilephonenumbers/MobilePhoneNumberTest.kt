// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePhoneNumberTest {

    @Test
    fun create() {
        val mobilePhoneNumber =
            MobilePhoneNumber.builder()
                .id("id")
                .callForwarding(
                    MobilePhoneNumber.CallForwarding.builder()
                        .callForwardingEnabled(true)
                        .forwardingType(MobilePhoneNumber.CallForwarding.ForwardingType.ALWAYS)
                        .forwardsTo("forwards_to")
                        .build()
                )
                .callRecording(
                    MobilePhoneNumber.CallRecording.builder()
                        .inboundCallRecordingChannels(
                            MobilePhoneNumber.CallRecording.InboundCallRecordingChannels.SINGLE
                        )
                        .inboundCallRecordingEnabled(true)
                        .inboundCallRecordingFormat(
                            MobilePhoneNumber.CallRecording.InboundCallRecordingFormat.WAV
                        )
                        .build()
                )
                .callerIdNameEnabled(true)
                .cnamListing(
                    MobilePhoneNumber.CnamListing.builder()
                        .cnamListingDetails("cnam_listing_details")
                        .cnamListingEnabled(true)
                        .build()
                )
                .connectionId("connection_id")
                .connectionName("connection_name")
                .connectionType("connection_type")
                .countryIsoAlpha2("country_iso_alpha2")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerReference("customer_reference")
                .inbound(
                    MobilePhoneNumber.Inbound.builder()
                        .interceptionAppId("interception_app_id")
                        .interceptionAppName("interception_app_name")
                        .build()
                )
                .inboundCallScreening(MobilePhoneNumber.InboundCallScreening.DISABLED)
                .mobileVoiceEnabled(true)
                .noiseSuppression(MobilePhoneNumber.NoiseSuppression.INBOUND)
                .outbound(
                    MobilePhoneNumber.Outbound.builder()
                        .interceptionAppId("interception_app_id")
                        .interceptionAppName("interception_app_name")
                        .build()
                )
                .phoneNumber("phone_number")
                .recordType("mobile_phone_number")
                .simCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status("status")
                .addTag("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(mobilePhoneNumber.id()).contains("id")
        assertThat(mobilePhoneNumber.callForwarding())
            .contains(
                MobilePhoneNumber.CallForwarding.builder()
                    .callForwardingEnabled(true)
                    .forwardingType(MobilePhoneNumber.CallForwarding.ForwardingType.ALWAYS)
                    .forwardsTo("forwards_to")
                    .build()
            )
        assertThat(mobilePhoneNumber.callRecording())
            .contains(
                MobilePhoneNumber.CallRecording.builder()
                    .inboundCallRecordingChannels(
                        MobilePhoneNumber.CallRecording.InboundCallRecordingChannels.SINGLE
                    )
                    .inboundCallRecordingEnabled(true)
                    .inboundCallRecordingFormat(
                        MobilePhoneNumber.CallRecording.InboundCallRecordingFormat.WAV
                    )
                    .build()
            )
        assertThat(mobilePhoneNumber.callerIdNameEnabled()).contains(true)
        assertThat(mobilePhoneNumber.cnamListing())
            .contains(
                MobilePhoneNumber.CnamListing.builder()
                    .cnamListingDetails("cnam_listing_details")
                    .cnamListingEnabled(true)
                    .build()
            )
        assertThat(mobilePhoneNumber.connectionId()).contains("connection_id")
        assertThat(mobilePhoneNumber.connectionName()).contains("connection_name")
        assertThat(mobilePhoneNumber.connectionType()).contains("connection_type")
        assertThat(mobilePhoneNumber.countryIsoAlpha2()).contains("country_iso_alpha2")
        assertThat(mobilePhoneNumber.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mobilePhoneNumber.customerReference()).contains("customer_reference")
        assertThat(mobilePhoneNumber.inbound())
            .contains(
                MobilePhoneNumber.Inbound.builder()
                    .interceptionAppId("interception_app_id")
                    .interceptionAppName("interception_app_name")
                    .build()
            )
        assertThat(mobilePhoneNumber.inboundCallScreening())
            .contains(MobilePhoneNumber.InboundCallScreening.DISABLED)
        assertThat(mobilePhoneNumber.mobileVoiceEnabled()).contains(true)
        assertThat(mobilePhoneNumber.noiseSuppression())
            .contains(MobilePhoneNumber.NoiseSuppression.INBOUND)
        assertThat(mobilePhoneNumber.outbound())
            .contains(
                MobilePhoneNumber.Outbound.builder()
                    .interceptionAppId("interception_app_id")
                    .interceptionAppName("interception_app_name")
                    .build()
            )
        assertThat(mobilePhoneNumber.phoneNumber()).contains("phone_number")
        assertThat(mobilePhoneNumber.recordType()).contains("mobile_phone_number")
        assertThat(mobilePhoneNumber.simCardId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(mobilePhoneNumber.status()).contains("status")
        assertThat(mobilePhoneNumber.tags().getOrNull()).containsExactly("string")
        assertThat(mobilePhoneNumber.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobilePhoneNumber =
            MobilePhoneNumber.builder()
                .id("id")
                .callForwarding(
                    MobilePhoneNumber.CallForwarding.builder()
                        .callForwardingEnabled(true)
                        .forwardingType(MobilePhoneNumber.CallForwarding.ForwardingType.ALWAYS)
                        .forwardsTo("forwards_to")
                        .build()
                )
                .callRecording(
                    MobilePhoneNumber.CallRecording.builder()
                        .inboundCallRecordingChannels(
                            MobilePhoneNumber.CallRecording.InboundCallRecordingChannels.SINGLE
                        )
                        .inboundCallRecordingEnabled(true)
                        .inboundCallRecordingFormat(
                            MobilePhoneNumber.CallRecording.InboundCallRecordingFormat.WAV
                        )
                        .build()
                )
                .callerIdNameEnabled(true)
                .cnamListing(
                    MobilePhoneNumber.CnamListing.builder()
                        .cnamListingDetails("cnam_listing_details")
                        .cnamListingEnabled(true)
                        .build()
                )
                .connectionId("connection_id")
                .connectionName("connection_name")
                .connectionType("connection_type")
                .countryIsoAlpha2("country_iso_alpha2")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerReference("customer_reference")
                .inbound(
                    MobilePhoneNumber.Inbound.builder()
                        .interceptionAppId("interception_app_id")
                        .interceptionAppName("interception_app_name")
                        .build()
                )
                .inboundCallScreening(MobilePhoneNumber.InboundCallScreening.DISABLED)
                .mobileVoiceEnabled(true)
                .noiseSuppression(MobilePhoneNumber.NoiseSuppression.INBOUND)
                .outbound(
                    MobilePhoneNumber.Outbound.builder()
                        .interceptionAppId("interception_app_id")
                        .interceptionAppName("interception_app_name")
                        .build()
                )
                .phoneNumber("phone_number")
                .recordType("mobile_phone_number")
                .simCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status("status")
                .addTag("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMobilePhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobilePhoneNumber),
                jacksonTypeRef<MobilePhoneNumber>(),
            )

        assertThat(roundtrippedMobilePhoneNumber).isEqualTo(mobilePhoneNumber)
    }
}
