// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallInitiateParamsTest {

    @Test
    fun create() {
        CallInitiateParams.builder()
            .applicationId("application_id")
            .from("+13120001234")
            .to("+13121230000")
            .asyncAmd(true)
            .asyncAmdStatusCallback("https://www.example.com/callback")
            .asyncAmdStatusCallbackMethod(CallInitiateParams.AsyncAmdStatusCallbackMethod.GET)
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
            .recordingStatusCallbackMethod(CallInitiateParams.RecordingStatusCallbackMethod.GET)
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
    }

    @Test
    fun pathParams() {
        val params =
            CallInitiateParams.builder()
                .applicationId("application_id")
                .from("+13120001234")
                .to("+13121230000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("application_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallInitiateParams.builder()
                .applicationId("application_id")
                .from("+13120001234")
                .to("+13121230000")
                .asyncAmd(true)
                .asyncAmdStatusCallback("https://www.example.com/callback")
                .asyncAmdStatusCallbackMethod(CallInitiateParams.AsyncAmdStatusCallbackMethod.GET)
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
                .recordingStatusCallbackMethod(CallInitiateParams.RecordingStatusCallbackMethod.GET)
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

        val body = params._body()

        assertThat(body.from()).isEqualTo("+13120001234")
        assertThat(body.to()).isEqualTo("+13121230000")
        assertThat(body.asyncAmd()).contains(true)
        assertThat(body.asyncAmdStatusCallback()).contains("https://www.example.com/callback")
        assertThat(body.asyncAmdStatusCallbackMethod())
            .contains(CallInitiateParams.AsyncAmdStatusCallbackMethod.GET)
        assertThat(body.callerId()).contains("Info")
        assertThat(body.cancelPlaybackOnDetectMessageEnd()).contains(false)
        assertThat(body.cancelPlaybackOnMachineDetection()).contains(false)
        assertThat(body.detectionMode()).contains(CallInitiateParams.DetectionMode.PREMIUM)
        assertThat(body.fallbackUrl()).contains("https://www.example.com/instructions-fallback.xml")
        assertThat(body.machineDetection()).contains(CallInitiateParams.MachineDetection.ENABLE)
        assertThat(body.machineDetectionSilenceTimeout()).contains(2000L)
        assertThat(body.machineDetectionSpeechEndThreshold()).contains(2000L)
        assertThat(body.machineDetectionSpeechThreshold()).contains(2000L)
        assertThat(body.machineDetectionTimeout()).contains(5000L)
        assertThat(body.preferredCodecs()).contains("PCMA,PCMU")
        assertThat(body.record()).contains(false)
        assertThat(body.recordingChannels()).contains(CallInitiateParams.RecordingChannels.DUAL)
        assertThat(body.recordingStatusCallback())
            .contains("https://example.com/recording_status_callback")
        assertThat(body.recordingStatusCallbackEvent()).contains("in-progress completed absent")
        assertThat(body.recordingStatusCallbackMethod())
            .contains(CallInitiateParams.RecordingStatusCallbackMethod.GET)
        assertThat(body.recordingTimeout()).contains(5L)
        assertThat(body.recordingTrack()).contains(CallInitiateParams.RecordingTrack.INBOUND)
        assertThat(body.sipAuthPassword()).contains("1234")
        assertThat(body.sipAuthUsername()).contains("user")
        assertThat(body.statusCallback())
            .contains("https://www.example.com/statuscallback-listener")
        assertThat(body.statusCallbackEvent())
            .contains(CallInitiateParams.StatusCallbackEvent.INITIATED)
        assertThat(body.statusCallbackMethod())
            .contains(CallInitiateParams.StatusCallbackMethod.GET)
        assertThat(body.trim()).contains(CallInitiateParams.Trim.TRIM_SILENCE)
        assertThat(body.url()).contains("https://www.example.com/texml.xml")
        assertThat(body.urlMethod()).contains(CallInitiateParams.UrlMethod.GET)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallInitiateParams.builder()
                .applicationId("application_id")
                .from("+13120001234")
                .to("+13121230000")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("+13120001234")
        assertThat(body.to()).isEqualTo("+13121230000")
    }
}
