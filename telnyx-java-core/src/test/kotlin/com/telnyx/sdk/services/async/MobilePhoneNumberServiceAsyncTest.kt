// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MobilePhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mobilePhoneNumberServiceAsync = client.mobilePhoneNumbers()

        val mobilePhoneNumberFuture = mobilePhoneNumberServiceAsync.retrieve("id")

        val mobilePhoneNumber = mobilePhoneNumberFuture.get()
        mobilePhoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mobilePhoneNumberServiceAsync = client.mobilePhoneNumbers()

        val mobilePhoneNumberFuture =
            mobilePhoneNumberServiceAsync.update(
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
                                MobilePhoneNumberUpdateParams.CallRecording
                                    .InboundCallRecordingChannels
                                    .SINGLE
                            )
                            .inboundCallRecordingEnabled(true)
                            .inboundCallRecordingFormat(
                                MobilePhoneNumberUpdateParams.CallRecording
                                    .InboundCallRecordingFormat
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
                    .inboundCallScreening(
                        MobilePhoneNumberUpdateParams.InboundCallScreening.DISABLED
                    )
                    .noiseSuppression(true)
                    .outbound(
                        MobilePhoneNumberUpdateParams.Outbound.builder()
                            .interceptionAppId("interception_app_id")
                            .build()
                    )
                    .addTag("string")
                    .build()
            )

        val mobilePhoneNumber = mobilePhoneNumberFuture.get()
        mobilePhoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mobilePhoneNumberServiceAsync = client.mobilePhoneNumbers()

        val pageFuture = mobilePhoneNumberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
