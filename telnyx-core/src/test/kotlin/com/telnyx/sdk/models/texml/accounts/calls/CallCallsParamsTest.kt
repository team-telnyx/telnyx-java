// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallCallsParamsTest {

    @Test
    fun create() {
        CallCallsParams.builder()
            .accountSid("account_sid")
            .params(
                CallCallsParams.Params.WithUrl.builder()
                    .url("https://www.example.com/texml.xml")
                    .applicationSid("example-app-sid")
                    .asyncAmd(true)
                    .asyncAmdStatusCallback("https://www.example.com/callback")
                    .asyncAmdStatusCallbackMethod(
                        CallCallsParams.Params.WithUrl.AsyncAmdStatusCallbackMethod.GET
                    )
                    .callerId("Info")
                    .cancelPlaybackOnDetectMessageEnd(false)
                    .cancelPlaybackOnMachineDetection(false)
                    .addCustomHeader(
                        CallCallsParams.Params.WithUrl.CustomHeader.builder()
                            .name("X-Custom-Header")
                            .value("custom-value")
                            .build()
                    )
                    .detectionMode(CallCallsParams.Params.WithUrl.DetectionMode.PREMIUM)
                    .fallbackUrl("https://www.example.com/instructions-fallback.xml")
                    .from("+13120001234")
                    .machineDetection(CallCallsParams.Params.WithUrl.MachineDetection.ENABLE)
                    .machineDetectionSilenceTimeout(2000L)
                    .machineDetectionSpeechEndThreshold(2000L)
                    .machineDetectionSpeechThreshold(2000L)
                    .machineDetectionTimeout(5000L)
                    .mediaEncryption(CallCallsParams.Params.WithUrl.MediaEncryption.DISABLED)
                    .preferredCodecs("PCMA,PCMU")
                    .record(false)
                    .recordingChannels(CallCallsParams.Params.WithUrl.RecordingChannels.DUAL)
                    .recordingStatusCallback("https://example.com/recording_status_callback")
                    .recordingStatusCallbackEvent("in-progress completed absent")
                    .recordingStatusCallbackMethod(
                        CallCallsParams.Params.WithUrl.RecordingStatusCallbackMethod.GET
                    )
                    .recordingTimeout(5L)
                    .recordingTrack(CallCallsParams.Params.WithUrl.RecordingTrack.INBOUND)
                    .sendRecordingUrl(false)
                    .sipAuthPassword("1234")
                    .sipAuthUsername("user")
                    .sipRegion(CallCallsParams.Params.WithUrl.SipRegion.CANADA)
                    .statusCallback("https://www.example.com/statuscallback-listener")
                    .statusCallbackEvent(
                        CallCallsParams.Params.WithUrl.StatusCallbackEvent.INITIATED
                    )
                    .statusCallbackMethod(CallCallsParams.Params.WithUrl.StatusCallbackMethod.GET)
                    .superviseCallSid("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .supervisingRole(CallCallsParams.Params.WithUrl.SupervisingRole.MONITOR)
                    .texml("Texml")
                    .timeLimit(3600L)
                    .timeout(60L)
                    .to("+13121230000")
                    .trim(CallCallsParams.Params.WithUrl.Trim.TRIM_SILENCE)
                    .urlMethod(CallCallsParams.Params.WithUrl.UrlMethod.GET)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallCallsParams.builder()
                .accountSid("account_sid")
                .params(
                    CallCallsParams.Params.WithUrl.builder()
                        .url("https://www.example.com/texml.xml")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallCallsParams.builder()
                .accountSid("account_sid")
                .params(
                    CallCallsParams.Params.WithUrl.builder()
                        .url("https://www.example.com/texml.xml")
                        .applicationSid("example-app-sid")
                        .asyncAmd(true)
                        .asyncAmdStatusCallback("https://www.example.com/callback")
                        .asyncAmdStatusCallbackMethod(
                            CallCallsParams.Params.WithUrl.AsyncAmdStatusCallbackMethod.GET
                        )
                        .callerId("Info")
                        .cancelPlaybackOnDetectMessageEnd(false)
                        .cancelPlaybackOnMachineDetection(false)
                        .addCustomHeader(
                            CallCallsParams.Params.WithUrl.CustomHeader.builder()
                                .name("X-Custom-Header")
                                .value("custom-value")
                                .build()
                        )
                        .detectionMode(CallCallsParams.Params.WithUrl.DetectionMode.PREMIUM)
                        .fallbackUrl("https://www.example.com/instructions-fallback.xml")
                        .from("+13120001234")
                        .machineDetection(CallCallsParams.Params.WithUrl.MachineDetection.ENABLE)
                        .machineDetectionSilenceTimeout(2000L)
                        .machineDetectionSpeechEndThreshold(2000L)
                        .machineDetectionSpeechThreshold(2000L)
                        .machineDetectionTimeout(5000L)
                        .mediaEncryption(CallCallsParams.Params.WithUrl.MediaEncryption.DISABLED)
                        .preferredCodecs("PCMA,PCMU")
                        .record(false)
                        .recordingChannels(CallCallsParams.Params.WithUrl.RecordingChannels.DUAL)
                        .recordingStatusCallback("https://example.com/recording_status_callback")
                        .recordingStatusCallbackEvent("in-progress completed absent")
                        .recordingStatusCallbackMethod(
                            CallCallsParams.Params.WithUrl.RecordingStatusCallbackMethod.GET
                        )
                        .recordingTimeout(5L)
                        .recordingTrack(CallCallsParams.Params.WithUrl.RecordingTrack.INBOUND)
                        .sendRecordingUrl(false)
                        .sipAuthPassword("1234")
                        .sipAuthUsername("user")
                        .sipRegion(CallCallsParams.Params.WithUrl.SipRegion.CANADA)
                        .statusCallback("https://www.example.com/statuscallback-listener")
                        .statusCallbackEvent(
                            CallCallsParams.Params.WithUrl.StatusCallbackEvent.INITIATED
                        )
                        .statusCallbackMethod(
                            CallCallsParams.Params.WithUrl.StatusCallbackMethod.GET
                        )
                        .superviseCallSid(
                            "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                        )
                        .supervisingRole(CallCallsParams.Params.WithUrl.SupervisingRole.MONITOR)
                        .texml("Texml")
                        .timeLimit(3600L)
                        .timeout(60L)
                        .to("+13121230000")
                        .trim(CallCallsParams.Params.WithUrl.Trim.TRIM_SILENCE)
                        .urlMethod(CallCallsParams.Params.WithUrl.UrlMethod.GET)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CallCallsParams.Params.ofWithUrl(
                    CallCallsParams.Params.WithUrl.builder()
                        .url("https://www.example.com/texml.xml")
                        .applicationSid("example-app-sid")
                        .asyncAmd(true)
                        .asyncAmdStatusCallback("https://www.example.com/callback")
                        .asyncAmdStatusCallbackMethod(
                            CallCallsParams.Params.WithUrl.AsyncAmdStatusCallbackMethod.GET
                        )
                        .callerId("Info")
                        .cancelPlaybackOnDetectMessageEnd(false)
                        .cancelPlaybackOnMachineDetection(false)
                        .addCustomHeader(
                            CallCallsParams.Params.WithUrl.CustomHeader.builder()
                                .name("X-Custom-Header")
                                .value("custom-value")
                                .build()
                        )
                        .detectionMode(CallCallsParams.Params.WithUrl.DetectionMode.PREMIUM)
                        .fallbackUrl("https://www.example.com/instructions-fallback.xml")
                        .from("+13120001234")
                        .machineDetection(CallCallsParams.Params.WithUrl.MachineDetection.ENABLE)
                        .machineDetectionSilenceTimeout(2000L)
                        .machineDetectionSpeechEndThreshold(2000L)
                        .machineDetectionSpeechThreshold(2000L)
                        .machineDetectionTimeout(5000L)
                        .mediaEncryption(CallCallsParams.Params.WithUrl.MediaEncryption.DISABLED)
                        .preferredCodecs("PCMA,PCMU")
                        .record(false)
                        .recordingChannels(CallCallsParams.Params.WithUrl.RecordingChannels.DUAL)
                        .recordingStatusCallback("https://example.com/recording_status_callback")
                        .recordingStatusCallbackEvent("in-progress completed absent")
                        .recordingStatusCallbackMethod(
                            CallCallsParams.Params.WithUrl.RecordingStatusCallbackMethod.GET
                        )
                        .recordingTimeout(5L)
                        .recordingTrack(CallCallsParams.Params.WithUrl.RecordingTrack.INBOUND)
                        .sendRecordingUrl(false)
                        .sipAuthPassword("1234")
                        .sipAuthUsername("user")
                        .sipRegion(CallCallsParams.Params.WithUrl.SipRegion.CANADA)
                        .statusCallback("https://www.example.com/statuscallback-listener")
                        .statusCallbackEvent(
                            CallCallsParams.Params.WithUrl.StatusCallbackEvent.INITIATED
                        )
                        .statusCallbackMethod(
                            CallCallsParams.Params.WithUrl.StatusCallbackMethod.GET
                        )
                        .superviseCallSid(
                            "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                        )
                        .supervisingRole(CallCallsParams.Params.WithUrl.SupervisingRole.MONITOR)
                        .texml("Texml")
                        .timeLimit(3600L)
                        .timeout(60L)
                        .to("+13121230000")
                        .trim(CallCallsParams.Params.WithUrl.Trim.TRIM_SILENCE)
                        .urlMethod(CallCallsParams.Params.WithUrl.UrlMethod.GET)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallCallsParams.builder()
                .accountSid("account_sid")
                .params(
                    CallCallsParams.Params.WithUrl.builder()
                        .url("https://www.example.com/texml.xml")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CallCallsParams.Params.ofWithUrl(
                    CallCallsParams.Params.WithUrl.builder()
                        .url("https://www.example.com/texml.xml")
                        .build()
                )
            )
    }
}
