// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePhoneNumberUpdateParamsTest {

    @Test
    fun create() {
        MobilePhoneNumberUpdateParams.builder()
            .id("id")
            .callForwarding(
                MobilePhoneNumberUpdateParams.CallForwarding.builder()
                    .callForwardingEnabled(true)
                    .forwardingType(
                        MobilePhoneNumberUpdateParams.CallForwarding.ForwardingType.ALWAYS
                    )
                    .forwardsTo("forwards_to")
                    .build()
            )
            .callRecording(
                MobilePhoneNumberUpdateParams.CallRecording.builder()
                    .inboundCallRecordingChannels(
                        MobilePhoneNumberUpdateParams.CallRecording.InboundCallRecordingChannels
                            .SINGLE
                    )
                    .inboundCallRecordingEnabled(true)
                    .inboundCallRecordingFormat(
                        MobilePhoneNumberUpdateParams.CallRecording.InboundCallRecordingFormat.WAV
                    )
                    .build()
            )
            .callerIdNameEnabled(true)
            .cnamListing(
                MobilePhoneNumberUpdateParams.CnamListing.builder()
                    .cnamListingDetails("cnam_listing_details")
                    .cnamListingEnabled(true)
                    .build()
            )
            .connectionId("connection_id")
            .customerReference("customer_reference")
            .inbound(
                MobilePhoneNumberUpdateParams.Inbound.builder()
                    .interceptionAppId("interception_app_id")
                    .build()
            )
            .inboundCallScreening(MobilePhoneNumberUpdateParams.InboundCallScreening.DISABLED)
            .noiseSuppression(true)
            .outbound(
                MobilePhoneNumberUpdateParams.Outbound.builder()
                    .interceptionAppId("interception_app_id")
                    .build()
            )
            .addTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MobilePhoneNumberUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MobilePhoneNumberUpdateParams.builder()
                .id("id")
                .callForwarding(
                    MobilePhoneNumberUpdateParams.CallForwarding.builder()
                        .callForwardingEnabled(true)
                        .forwardingType(
                            MobilePhoneNumberUpdateParams.CallForwarding.ForwardingType.ALWAYS
                        )
                        .forwardsTo("forwards_to")
                        .build()
                )
                .callRecording(
                    MobilePhoneNumberUpdateParams.CallRecording.builder()
                        .inboundCallRecordingChannels(
                            MobilePhoneNumberUpdateParams.CallRecording.InboundCallRecordingChannels
                                .SINGLE
                        )
                        .inboundCallRecordingEnabled(true)
                        .inboundCallRecordingFormat(
                            MobilePhoneNumberUpdateParams.CallRecording.InboundCallRecordingFormat
                                .WAV
                        )
                        .build()
                )
                .callerIdNameEnabled(true)
                .cnamListing(
                    MobilePhoneNumberUpdateParams.CnamListing.builder()
                        .cnamListingDetails("cnam_listing_details")
                        .cnamListingEnabled(true)
                        .build()
                )
                .connectionId("connection_id")
                .customerReference("customer_reference")
                .inbound(
                    MobilePhoneNumberUpdateParams.Inbound.builder()
                        .interceptionAppId("interception_app_id")
                        .build()
                )
                .inboundCallScreening(MobilePhoneNumberUpdateParams.InboundCallScreening.DISABLED)
                .noiseSuppression(true)
                .outbound(
                    MobilePhoneNumberUpdateParams.Outbound.builder()
                        .interceptionAppId("interception_app_id")
                        .build()
                )
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.callForwarding())
            .contains(
                MobilePhoneNumberUpdateParams.CallForwarding.builder()
                    .callForwardingEnabled(true)
                    .forwardingType(
                        MobilePhoneNumberUpdateParams.CallForwarding.ForwardingType.ALWAYS
                    )
                    .forwardsTo("forwards_to")
                    .build()
            )
        assertThat(body.callRecording())
            .contains(
                MobilePhoneNumberUpdateParams.CallRecording.builder()
                    .inboundCallRecordingChannels(
                        MobilePhoneNumberUpdateParams.CallRecording.InboundCallRecordingChannels
                            .SINGLE
                    )
                    .inboundCallRecordingEnabled(true)
                    .inboundCallRecordingFormat(
                        MobilePhoneNumberUpdateParams.CallRecording.InboundCallRecordingFormat.WAV
                    )
                    .build()
            )
        assertThat(body.callerIdNameEnabled()).contains(true)
        assertThat(body.cnamListing())
            .contains(
                MobilePhoneNumberUpdateParams.CnamListing.builder()
                    .cnamListingDetails("cnam_listing_details")
                    .cnamListingEnabled(true)
                    .build()
            )
        assertThat(body.connectionId()).contains("connection_id")
        assertThat(body.customerReference()).contains("customer_reference")
        assertThat(body.inbound())
            .contains(
                MobilePhoneNumberUpdateParams.Inbound.builder()
                    .interceptionAppId("interception_app_id")
                    .build()
            )
        assertThat(body.inboundCallScreening())
            .contains(MobilePhoneNumberUpdateParams.InboundCallScreening.DISABLED)
        assertThat(body.noiseSuppression()).contains(true)
        assertThat(body.outbound())
            .contains(
                MobilePhoneNumberUpdateParams.Outbound.builder()
                    .interceptionAppId("interception_app_id")
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MobilePhoneNumberUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
