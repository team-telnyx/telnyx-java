// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MobilePhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mobilePhoneNumberService = client.mobilePhoneNumbers()

        val mobilePhoneNumber = mobilePhoneNumberService.retrieve("id")

        mobilePhoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mobilePhoneNumberService = client.mobilePhoneNumbers()

        val mobilePhoneNumber =
            mobilePhoneNumberService.update(
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

        mobilePhoneNumber.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mobilePhoneNumberService = client.mobilePhoneNumbers()

        val page = mobilePhoneNumberService.list()

        page.response().validate()
    }
}
