// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.phonenumbers

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.phonenumbers.voice.CallForwarding
import com.telnyx.api.models.phonenumbers.voice.CallRecording
import com.telnyx.api.models.phonenumbers.voice.CnamListing
import com.telnyx.api.models.phonenumbers.voice.MediaFeatures
import com.telnyx.api.models.phonenumbers.voice.UpdateVoiceSettings
import com.telnyx.api.models.phonenumbers.voice.VoiceListParams
import com.telnyx.api.models.phonenumbers.voice.VoiceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VoiceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceServiceAsync = client.phoneNumbers().voice()

        val voiceFuture = voiceServiceAsync.retrieve("1293384261075731499")

        val voice = voiceFuture.get()
        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceServiceAsync = client.phoneNumbers().voice()

        val voiceFuture =
            voiceServiceAsync.update(
                VoiceUpdateParams.builder()
                    .id("1293384261075731499")
                    .updateVoiceSettings(
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

        val voice = voiceFuture.get()
        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceServiceAsync = client.phoneNumbers().voice()

        val voicesFuture =
            voiceServiceAsync.list(
                VoiceListParams.builder()
                    .filter(
                        VoiceListParams.Filter.builder()
                            .connectionName(
                                VoiceListParams.Filter.ConnectionName.builder()
                                    .contains("test")
                                    .build()
                            )
                            .customerReference("customer_reference")
                            .phoneNumber("phone_number")
                            .voiceUsagePaymentMethod(
                                VoiceListParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                            )
                            .build()
                    )
                    .page(VoiceListParams.Page.builder().number(1L).size(1L).build())
                    .sort(VoiceListParams.Sort.CONNECTION_NAME)
                    .build()
            )

        val voices = voicesFuture.get()
        voices.validate()
    }
}
