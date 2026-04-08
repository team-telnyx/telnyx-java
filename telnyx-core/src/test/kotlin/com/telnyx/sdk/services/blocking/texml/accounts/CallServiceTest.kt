// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.texml.accounts.calls.CallCallsParams
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveCallsParams
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveParams
import com.telnyx.sdk.models.texml.accounts.calls.CallSiprecJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.CallStreamsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.CallUpdateParams
import com.telnyx.sdk.models.texml.accounts.calls.UpdateCall
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.texml().accounts().calls()

        val call =
            callService.retrieve(
                CallRetrieveParams.builder().accountSid("account_sid").callSid("call_sid").build()
            )

        call.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.texml().accounts().calls()

        val call =
            callService.update(
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

        call.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun calls() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.texml().accounts().calls()

        val response =
            callService.calls(
                CallCallsParams.builder()
                    .accountSid("account_sid")
                    .body(
                        CallCallsParams.Body.WithUrl.builder()
                            .url("https://www.example.com/texml.xml")
                            .applicationSid("example-app-sid")
                            .asyncAmd(true)
                            .asyncAmdStatusCallback("https://www.example.com/callback")
                            .asyncAmdStatusCallbackMethod(
                                CallCallsParams.Body.WithUrl.AsyncAmdStatusCallbackMethod.GET
                            )
                            .callerId("Info")
                            .cancelPlaybackOnDetectMessageEnd(false)
                            .cancelPlaybackOnMachineDetection(false)
                            .addCustomHeader(
                                CallCallsParams.Body.WithUrl.CustomHeader.builder()
                                    .name("X-Custom-Header")
                                    .value("custom-value")
                                    .build()
                            )
                            .detectionMode(CallCallsParams.Body.WithUrl.DetectionMode.PREMIUM)
                            .fallbackUrl("https://www.example.com/instructions-fallback.xml")
                            .from("+13120001234")
                            .machineDetection(CallCallsParams.Body.WithUrl.MachineDetection.ENABLE)
                            .machineDetectionSilenceTimeout(2000L)
                            .machineDetectionSpeechEndThreshold(2000L)
                            .machineDetectionSpeechThreshold(2000L)
                            .machineDetectionTimeout(5000L)
                            .mediaEncryption(CallCallsParams.Body.WithUrl.MediaEncryption.DISABLED)
                            .preferredCodecs("PCMA,PCMU")
                            .record(false)
                            .recordingChannels(CallCallsParams.Body.WithUrl.RecordingChannels.DUAL)
                            .recordingStatusCallback(
                                "https://example.com/recording_status_callback"
                            )
                            .recordingStatusCallbackEvent("in-progress completed absent")
                            .recordingStatusCallbackMethod(
                                CallCallsParams.Body.WithUrl.RecordingStatusCallbackMethod.GET
                            )
                            .recordingTimeout(5L)
                            .recordingTrack(CallCallsParams.Body.WithUrl.RecordingTrack.INBOUND)
                            .sendRecordingUrl(false)
                            .sipAuthPassword("1234")
                            .sipAuthUsername("user")
                            .sipRegion(CallCallsParams.Body.WithUrl.SipRegion.CANADA)
                            .statusCallback("https://www.example.com/statuscallback-listener")
                            .statusCallbackEvent(
                                CallCallsParams.Body.WithUrl.StatusCallbackEvent.INITIATED
                            )
                            .statusCallbackMethod(
                                CallCallsParams.Body.WithUrl.StatusCallbackMethod.GET
                            )
                            .superviseCallSid(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .supervisingRole(CallCallsParams.Body.WithUrl.SupervisingRole.MONITOR)
                            .texml(JsonValue.from(mapOf<String, Any>()))
                            .timeLimit(3600L)
                            .timeout(60L)
                            .to("+13121230000")
                            .trim(CallCallsParams.Body.WithUrl.Trim.TRIM_SILENCE)
                            .urlMethod(CallCallsParams.Body.WithUrl.UrlMethod.GET)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCalls() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.texml().accounts().calls()

        val response =
            callService.retrieveCalls(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun siprecJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.texml().accounts().calls()

        val response =
            callService.siprecJson(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun streamsJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.texml().accounts().calls()

        val response =
            callService.streamsJson(
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

        response.validate()
    }
}
