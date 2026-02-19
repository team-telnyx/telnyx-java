// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.accounts.calls.CallCallsParams
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveCallsParams
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveParams
import com.telnyx.sdk.models.texml.accounts.calls.CallSiprecJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.CallStreamsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.CallUpdateParams
import com.telnyx.sdk.models.texml.accounts.calls.UpdateCall
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.texml().accounts().calls()

        val callFuture =
            callServiceAsync.retrieve(
                CallRetrieveParams.builder().accountSid("account_sid").callSid("call_sid").build()
            )

        val call = callFuture.get()
        call.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.texml().accounts().calls()

        val callFuture =
            callServiceAsync.update(
                CallUpdateParams.builder()
                    .accountSid("account_sid")
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
    fun calls() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.texml().accounts().calls()

        val responseFuture =
            callServiceAsync.calls(
                CallCallsParams.builder()
                    .accountSid("account_sid")
                    .applicationSid("example-app-sid")
                    .from("+13120001234")
                    .to("+13121230000")
                    .asyncAmd(true)
                    .asyncAmdStatusCallback("https://www.example.com/callback")
                    .asyncAmdStatusCallbackMethod(CallCallsParams.AsyncAmdStatusCallbackMethod.GET)
                    .callerId("Info")
                    .cancelPlaybackOnDetectMessageEnd(false)
                    .cancelPlaybackOnMachineDetection(false)
                    .addCustomHeader(
                        CallCallsParams.CustomHeader.builder()
                            .name("X-Custom-Header")
                            .value("custom-value")
                            .build()
                    )
                    .detectionMode(CallCallsParams.DetectionMode.PREMIUM)
                    .fallbackUrl("https://www.example.com/instructions-fallback.xml")
                    .machineDetection(CallCallsParams.MachineDetection.ENABLE)
                    .machineDetectionSilenceTimeout(2000L)
                    .machineDetectionSpeechEndThreshold(2000L)
                    .machineDetectionSpeechThreshold(2000L)
                    .machineDetectionTimeout(5000L)
                    .preferredCodecs("PCMA,PCMU")
                    .record(false)
                    .recordingChannels(CallCallsParams.RecordingChannels.DUAL)
                    .recordingStatusCallback("https://example.com/recording_status_callback")
                    .recordingStatusCallbackEvent("in-progress completed absent")
                    .recordingStatusCallbackMethod(
                        CallCallsParams.RecordingStatusCallbackMethod.GET
                    )
                    .recordingTimeout(5L)
                    .recordingTrack(CallCallsParams.RecordingTrack.INBOUND)
                    .sendRecordingUrl(false)
                    .sipAuthPassword("1234")
                    .sipAuthUsername("user")
                    .sipRegion(CallCallsParams.SipRegion.CANADA)
                    .statusCallback("https://www.example.com/statuscallback-listener")
                    .statusCallbackEvent(CallCallsParams.StatusCallbackEvent.INITIATED)
                    .statusCallbackMethod(CallCallsParams.StatusCallbackMethod.GET)
                    .superviseCallSid("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .supervisingRole(CallCallsParams.SupervisingRole.MONITOR)
                    .texml(
                        "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Say>Hello</Say></Response>"
                    )
                    .timeLimit(3600L)
                    .timeout(60L)
                    .trim(CallCallsParams.Trim.TRIM_SILENCE)
                    .url("https://www.example.com/texml.xml")
                    .urlMethod(CallCallsParams.UrlMethod.GET)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCalls() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.texml().accounts().calls()

        val responseFuture =
            callServiceAsync.retrieveCalls(
                CallRetrieveCallsParams.builder()
                    .accountSid("account_sid")
                    .endTime("EndTime")
                    .endTimeGt("EndTime_gt")
                    .endTimeLt("EndTime_lt")
                    .from("From")
                    .page(0L)
                    .pageSize(0L)
                    .pageToken("PageToken")
                    .startTime("StartTime")
                    .startTimeGt("StartTime_gt")
                    .startTimeLt("StartTime_lt")
                    .status(CallRetrieveCallsParams.Status.CANCELED)
                    .to("To")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun siprecJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.texml().accounts().calls()

        val responseFuture =
            callServiceAsync.siprecJson(
                CallSiprecJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .connectorName("my_connector")
                    .includeMetadataCustomHeaders(
                        CallSiprecJsonParams.IncludeMetadataCustomHeaders.TRUE
                    )
                    .name("my_siprec_session")
                    .secure(CallSiprecJsonParams.Secure.TRUE)
                    .sessionTimeoutSecs(900L)
                    .sipTransport(CallSiprecJsonParams.SipTransport.TCP)
                    .statusCallback("https://www.example.com/callback")
                    .statusCallbackMethod(CallSiprecJsonParams.StatusCallbackMethod.GET)
                    .track(CallSiprecJsonParams.Track.BOTH_TRACKS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun streamsJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.texml().accounts().calls()

        val responseFuture =
            callServiceAsync.streamsJson(
                CallStreamsJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .bidirectionalCodec(CallStreamsJsonParams.BidirectionalCodec.G722)
                    .bidirectionalMode(CallStreamsJsonParams.BidirectionalMode.RTP)
                    .name("My stream")
                    .statusCallback("http://webhook.com/callback")
                    .statusCallbackMethod(CallStreamsJsonParams.StatusCallbackMethod.GET)
                    .track(CallStreamsJsonParams.Track.BOTH_TRACKS)
                    .url("wss://www.example.com/websocket")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
