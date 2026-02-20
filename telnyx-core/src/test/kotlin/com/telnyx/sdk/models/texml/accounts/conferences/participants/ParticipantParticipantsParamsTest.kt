// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences.participants

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantParticipantsParamsTest {

    @Test
    fun create() {
        ParticipantParticipantsParams.builder()
            .accountSid("account_sid")
            .conferenceSid("conference_sid")
            .amdStatusCallback("https://www.example.com/amd_result")
            .amdStatusCallbackMethod(ParticipantParticipantsParams.AmdStatusCallbackMethod.GET)
            .applicationSid("1846572522338780702")
            .beep(ParticipantParticipantsParams.Beep.ON_EXIT)
            .callerId("Info")
            .callSidToCoach("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
            .cancelPlaybackOnDetectMessageEnd(false)
            .cancelPlaybackOnMachineDetection(false)
            .coaching(false)
            .conferenceRecord(ParticipantParticipantsParams.ConferenceRecord.RECORD_FROM_START)
            .conferenceRecordingStatusCallback(
                "https://example.com/conference_recording_status_callback"
            )
            .conferenceRecordingStatusCallbackEvent("in-progress completed failed absent")
            .conferenceRecordingStatusCallbackMethod(
                ParticipantParticipantsParams.ConferenceRecordingStatusCallbackMethod.GET
            )
            .conferenceRecordingTimeout(5L)
            .conferenceStatusCallback("https://example.com/conference_status_callback")
            .conferenceStatusCallbackEvent("start end join leave")
            .conferenceStatusCallbackMethod(
                ParticipantParticipantsParams.ConferenceStatusCallbackMethod.GET
            )
            .conferenceTrim(ParticipantParticipantsParams.ConferenceTrim.TRIM_SILENCE)
            .addCustomHeader(
                ParticipantParticipantsParams.CustomHeader.builder()
                    .name("X-Custom-Header")
                    .value("custom-value")
                    .build()
            )
            .earlyMedia(true)
            .endConferenceOnExit(true)
            .from("+12065550200")
            .label("customer")
            .machineDetection(ParticipantParticipantsParams.MachineDetection.ENABLE)
            .machineDetectionSilenceTimeout(2000L)
            .machineDetectionSpeechEndThreshold(2000L)
            .machineDetectionSpeechThreshold(2000L)
            .machineDetectionTimeout(1000L)
            .maxParticipants(30L)
            .muted(true)
            .preferredCodecs("PCMA,PCMU")
            .record(false)
            .recordingChannels(ParticipantParticipantsParams.RecordingChannels.DUAL)
            .recordingStatusCallback("https://example.com/recording_status_callback")
            .recordingStatusCallbackEvent("in-progress completed absent")
            .recordingStatusCallbackMethod(
                ParticipantParticipantsParams.RecordingStatusCallbackMethod.GET
            )
            .recordingTrack(ParticipantParticipantsParams.RecordingTrack.INBOUND)
            .sipAuthPassword("1234")
            .sipAuthUsername("user")
            .startConferenceOnEnter(false)
            .statusCallback("https://www.example.com/callback")
            .statusCallbackEvent("answered completed")
            .statusCallbackMethod(ParticipantParticipantsParams.StatusCallbackMethod.GET)
            .timeLimit(30L)
            .timeout(30L)
            .to("+12065550100")
            .trim(ParticipantParticipantsParams.Trim.TRIM_SILENCE)
            .waitUrl("https://www.example.com/wait_music.mp3")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantParticipantsParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("conference_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ParticipantParticipantsParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .amdStatusCallback("https://www.example.com/amd_result")
                .amdStatusCallbackMethod(ParticipantParticipantsParams.AmdStatusCallbackMethod.GET)
                .applicationSid("1846572522338780702")
                .beep(ParticipantParticipantsParams.Beep.ON_EXIT)
                .callerId("Info")
                .callSidToCoach("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .cancelPlaybackOnDetectMessageEnd(false)
                .cancelPlaybackOnMachineDetection(false)
                .coaching(false)
                .conferenceRecord(ParticipantParticipantsParams.ConferenceRecord.RECORD_FROM_START)
                .conferenceRecordingStatusCallback(
                    "https://example.com/conference_recording_status_callback"
                )
                .conferenceRecordingStatusCallbackEvent("in-progress completed failed absent")
                .conferenceRecordingStatusCallbackMethod(
                    ParticipantParticipantsParams.ConferenceRecordingStatusCallbackMethod.GET
                )
                .conferenceRecordingTimeout(5L)
                .conferenceStatusCallback("https://example.com/conference_status_callback")
                .conferenceStatusCallbackEvent("start end join leave")
                .conferenceStatusCallbackMethod(
                    ParticipantParticipantsParams.ConferenceStatusCallbackMethod.GET
                )
                .conferenceTrim(ParticipantParticipantsParams.ConferenceTrim.TRIM_SILENCE)
                .addCustomHeader(
                    ParticipantParticipantsParams.CustomHeader.builder()
                        .name("X-Custom-Header")
                        .value("custom-value")
                        .build()
                )
                .earlyMedia(true)
                .endConferenceOnExit(true)
                .from("+12065550200")
                .label("customer")
                .machineDetection(ParticipantParticipantsParams.MachineDetection.ENABLE)
                .machineDetectionSilenceTimeout(2000L)
                .machineDetectionSpeechEndThreshold(2000L)
                .machineDetectionSpeechThreshold(2000L)
                .machineDetectionTimeout(1000L)
                .maxParticipants(30L)
                .muted(true)
                .preferredCodecs("PCMA,PCMU")
                .record(false)
                .recordingChannels(ParticipantParticipantsParams.RecordingChannels.DUAL)
                .recordingStatusCallback("https://example.com/recording_status_callback")
                .recordingStatusCallbackEvent("in-progress completed absent")
                .recordingStatusCallbackMethod(
                    ParticipantParticipantsParams.RecordingStatusCallbackMethod.GET
                )
                .recordingTrack(ParticipantParticipantsParams.RecordingTrack.INBOUND)
                .sipAuthPassword("1234")
                .sipAuthUsername("user")
                .startConferenceOnEnter(false)
                .statusCallback("https://www.example.com/callback")
                .statusCallbackEvent("answered completed")
                .statusCallbackMethod(ParticipantParticipantsParams.StatusCallbackMethod.GET)
                .timeLimit(30L)
                .timeout(30L)
                .to("+12065550100")
                .trim(ParticipantParticipantsParams.Trim.TRIM_SILENCE)
                .waitUrl("https://www.example.com/wait_music.mp3")
                .build()

        val body = params._body()

        assertThat(body.amdStatusCallback()).contains("https://www.example.com/amd_result")
        assertThat(body.amdStatusCallbackMethod())
            .contains(ParticipantParticipantsParams.AmdStatusCallbackMethod.GET)
        assertThat(body.applicationSid()).contains("1846572522338780702")
        assertThat(body.beep()).contains(ParticipantParticipantsParams.Beep.ON_EXIT)
        assertThat(body.callerId()).contains("Info")
        assertThat(body.callSidToCoach())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(body.cancelPlaybackOnDetectMessageEnd()).contains(false)
        assertThat(body.cancelPlaybackOnMachineDetection()).contains(false)
        assertThat(body.coaching()).contains(false)
        assertThat(body.conferenceRecord())
            .contains(ParticipantParticipantsParams.ConferenceRecord.RECORD_FROM_START)
        assertThat(body.conferenceRecordingStatusCallback())
            .contains("https://example.com/conference_recording_status_callback")
        assertThat(body.conferenceRecordingStatusCallbackEvent())
            .contains("in-progress completed failed absent")
        assertThat(body.conferenceRecordingStatusCallbackMethod())
            .contains(ParticipantParticipantsParams.ConferenceRecordingStatusCallbackMethod.GET)
        assertThat(body.conferenceRecordingTimeout()).contains(5L)
        assertThat(body.conferenceStatusCallback())
            .contains("https://example.com/conference_status_callback")
        assertThat(body.conferenceStatusCallbackEvent()).contains("start end join leave")
        assertThat(body.conferenceStatusCallbackMethod())
            .contains(ParticipantParticipantsParams.ConferenceStatusCallbackMethod.GET)
        assertThat(body.conferenceTrim())
            .contains(ParticipantParticipantsParams.ConferenceTrim.TRIM_SILENCE)
        assertThat(body.customHeaders().getOrNull())
            .containsExactly(
                ParticipantParticipantsParams.CustomHeader.builder()
                    .name("X-Custom-Header")
                    .value("custom-value")
                    .build()
            )
        assertThat(body.earlyMedia()).contains(true)
        assertThat(body.endConferenceOnExit()).contains(true)
        assertThat(body.from()).contains("+12065550200")
        assertThat(body.label()).contains("customer")
        assertThat(body.machineDetection())
            .contains(ParticipantParticipantsParams.MachineDetection.ENABLE)
        assertThat(body.machineDetectionSilenceTimeout()).contains(2000L)
        assertThat(body.machineDetectionSpeechEndThreshold()).contains(2000L)
        assertThat(body.machineDetectionSpeechThreshold()).contains(2000L)
        assertThat(body.machineDetectionTimeout()).contains(1000L)
        assertThat(body.maxParticipants()).contains(30L)
        assertThat(body.muted()).contains(true)
        assertThat(body.preferredCodecs()).contains("PCMA,PCMU")
        assertThat(body.record()).contains(false)
        assertThat(body.recordingChannels())
            .contains(ParticipantParticipantsParams.RecordingChannels.DUAL)
        assertThat(body.recordingStatusCallback())
            .contains("https://example.com/recording_status_callback")
        assertThat(body.recordingStatusCallbackEvent()).contains("in-progress completed absent")
        assertThat(body.recordingStatusCallbackMethod())
            .contains(ParticipantParticipantsParams.RecordingStatusCallbackMethod.GET)
        assertThat(body.recordingTrack())
            .contains(ParticipantParticipantsParams.RecordingTrack.INBOUND)
        assertThat(body.sipAuthPassword()).contains("1234")
        assertThat(body.sipAuthUsername()).contains("user")
        assertThat(body.startConferenceOnEnter()).contains(false)
        assertThat(body.statusCallback()).contains("https://www.example.com/callback")
        assertThat(body.statusCallbackEvent()).contains("answered completed")
        assertThat(body.statusCallbackMethod())
            .contains(ParticipantParticipantsParams.StatusCallbackMethod.GET)
        assertThat(body.timeLimit()).contains(30L)
        assertThat(body.timeout()).contains(30L)
        assertThat(body.to()).contains("+12065550100")
        assertThat(body.trim()).contains(ParticipantParticipantsParams.Trim.TRIM_SILENCE)
        assertThat(body.waitUrl()).contains("https://www.example.com/wait_music.mp3")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ParticipantParticipantsParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .build()

        val body = params._body()
    }
}
