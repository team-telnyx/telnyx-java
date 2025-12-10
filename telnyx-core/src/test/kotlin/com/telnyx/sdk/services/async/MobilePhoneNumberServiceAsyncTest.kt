// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MobilePhoneNumberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePhoneNumberServiceAsync = client.mobilePhoneNumbers()

        val mobilePhoneNumberFuture = mobilePhoneNumberServiceAsync.retrieve("id")

        val mobilePhoneNumber = mobilePhoneNumberFuture.get()
        mobilePhoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePhoneNumberServiceAsync = client.mobilePhoneNumbers()

        val pageFuture = mobilePhoneNumberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
