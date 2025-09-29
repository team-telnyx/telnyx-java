// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.texml.accounts.calls.UpdateCall
import com.telnyx.api.models.texml.calls.CallInitiateParams
import com.telnyx.api.models.texml.calls.CallUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callServiceAsync = client.texml().calls()

        val callFuture =
            callServiceAsync.update(
                CallUpdateParams.builder()
                    .callSid("call_sid")
                    .updateCall(
                        UpdateCall.builder()
                            .fallbackMethod(UpdateCall.FallbackMethod.GET)
                            .fallbackUrl("https://www.example.com/intruction-c.xml")
                            .method(UpdateCall.Method.GET)
                            .status("completed")
                            .statusCallback("https://www.example.com/callback")
                            .statusCallbackMethod(UpdateCall.StatusCallbackMethod.GET)
                            .texml(
                                "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Say>Hello</Say></Response>"
                            )
                            .url("https://www.example.com/intruction-b.xml")
                            .build()
                    )
                    .build()
            )

        val call = callFuture.get()
        call.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun initiate() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callServiceAsync = client.texml().calls()

        val responseFuture =
            callServiceAsync.initiate(
                CallInitiateParams.builder()
                    .applicationId("application_id")
                    .from("+13120001234")
                    .to("+13121230000")
                    .asyncAmd(true)
                    .asyncAmdStatusCallback("https://www.example.com/callback")
                    .asyncAmdStatusCallbackMethod(
                        CallInitiateParams.AsyncAmdStatusCallbackMethod.GET
                    )
                    .callerId("Info")
                    .cancelPlaybackOnDetectMessageEnd(false)
                    .cancelPlaybackOnMachineDetection(false)
                    .detectionMode(CallInitiateParams.DetectionMode.PREMIUM)
                    .fallbackUrl("https://www.example.com/instructions-fallback.xml")
                    .machineDetection(CallInitiateParams.MachineDetection.ENABLE)
                    .machineDetectionSilenceTimeout(2000L)
                    .machineDetectionSpeechEndThreshold(2000L)
                    .machineDetectionSpeechThreshold(2000L)
                    .machineDetectionTimeout(5000L)
                    .preferredCodecs("PCMA,PCMU")
                    .record(false)
                    .recordingChannels(CallInitiateParams.RecordingChannels.DUAL)
                    .recordingStatusCallback("https://example.com/recording_status_callback")
                    .recordingStatusCallbackEvent("in-progress completed absent")
                    .recordingStatusCallbackMethod(
                        CallInitiateParams.RecordingStatusCallbackMethod.GET
                    )
                    .recordingTimeout(5L)
                    .recordingTrack(CallInitiateParams.RecordingTrack.INBOUND)
                    .sipAuthPassword("1234")
                    .sipAuthUsername("user")
                    .statusCallback("https://www.example.com/statuscallback-listener")
                    .statusCallbackEvent(CallInitiateParams.StatusCallbackEvent.INITIATED)
                    .statusCallbackMethod(CallInitiateParams.StatusCallbackMethod.GET)
                    .trim(CallInitiateParams.Trim.TRIM_SILENCE)
                    .url("https://www.example.com/texml.xml")
                    .urlMethod(CallInitiateParams.UrlMethod.GET)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
