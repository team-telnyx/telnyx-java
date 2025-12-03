// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePhoneNumberRetrieveResponseTest {

    @Test
    fun create() {
        val mobilePhoneNumberRetrieveResponse =
            MobilePhoneNumberRetrieveResponse.builder()
                .data(
                    MobilePhoneNumber.builder()
                        .id("id")
                        .callForwarding(
                            MobilePhoneNumber.CallForwarding.builder()
                                .callForwardingEnabled(true)
                                .forwardingType(
                                    MobilePhoneNumber.CallForwarding.ForwardingType.ALWAYS
                                )
                                .forwardsTo("forwards_to")
                                .build()
                        )
                        .callRecording(
                            MobilePhoneNumber.CallRecording.builder()
                                .inboundCallRecordingChannels(
                                    MobilePhoneNumber.CallRecording.InboundCallRecordingChannels
                                        .SINGLE
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
                )
                .build()

        assertThat(mobilePhoneNumberRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobilePhoneNumberRetrieveResponse =
            MobilePhoneNumberRetrieveResponse.builder()
                .data(
                    MobilePhoneNumber.builder()
                        .id("id")
                        .callForwarding(
                            MobilePhoneNumber.CallForwarding.builder()
                                .callForwardingEnabled(true)
                                .forwardingType(
                                    MobilePhoneNumber.CallForwarding.ForwardingType.ALWAYS
                                )
                                .forwardsTo("forwards_to")
                                .build()
                        )
                        .callRecording(
                            MobilePhoneNumber.CallRecording.builder()
                                .inboundCallRecordingChannels(
                                    MobilePhoneNumber.CallRecording.InboundCallRecordingChannels
                                        .SINGLE
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
                )
                .build()

        val roundtrippedMobilePhoneNumberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobilePhoneNumberRetrieveResponse),
                jacksonTypeRef<MobilePhoneNumberRetrieveResponse>(),
            )

        assertThat(roundtrippedMobilePhoneNumberRetrieveResponse)
            .isEqualTo(mobilePhoneNumberRetrieveResponse)
    }
}
