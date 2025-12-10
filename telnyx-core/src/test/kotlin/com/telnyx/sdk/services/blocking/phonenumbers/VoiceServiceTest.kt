// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.phonenumbers.voice.CallForwarding
import com.telnyx.sdk.models.phonenumbers.voice.CallRecording
import com.telnyx.sdk.models.phonenumbers.voice.CnamListing
import com.telnyx.sdk.models.phonenumbers.voice.MediaFeatures
import com.telnyx.sdk.models.phonenumbers.voice.UpdateVoiceSettings
import com.telnyx.sdk.models.phonenumbers.voice.VoiceListParams
import com.telnyx.sdk.models.phonenumbers.voice.VoiceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VoiceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceService = client.phoneNumbers().voice()

        val voice = voiceService.retrieve("1293384261075731499")

        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceService = client.phoneNumbers().voice()

        val voice =
            voiceService.update(
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

        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceService = client.phoneNumbers().voice()

        val voices =
            voiceService.list(
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

        voices.validate()
    }
}
