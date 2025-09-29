// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts.conferences

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantDeleteParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantParticipantsParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantRetrieveParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantRetrieveParticipantsParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ParticipantServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val participantService = client.texml().accounts().conferences().participants()

        val participant =
            participantService.retrieve(
                ParticipantRetrieveParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .callSidOrParticipantLabel("call_sid_or_participant_label")
                    .build()
            )

        participant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val participantService = client.texml().accounts().conferences().participants()

        val participant =
            participantService.update(
                ParticipantUpdateParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .callSidOrParticipantLabel("call_sid_or_participant_label")
                    .announceMethod(ParticipantUpdateParams.AnnounceMethod.GET)
                    .announceUrl("https://www.example.com/announce.xml")
                    .beepOnExit(false)
                    .callSidToCoach("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                    .coaching(false)
                    .endConferenceOnExit(false)
                    .hold(true)
                    .holdMethod(ParticipantUpdateParams.HoldMethod.POST)
                    .holdUrl("HoldUrl")
                    .muted(true)
                    .waitUrl("https://www.example.com/wait_music.mp3")
                    .build()
            )

        participant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val participantService = client.texml().accounts().conferences().participants()

        participantService.delete(
            ParticipantDeleteParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .callSidOrParticipantLabel("call_sid_or_participant_label")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun participants() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val participantService = client.texml().accounts().conferences().participants()

        val response =
            participantService.participants(
                ParticipantParticipantsParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .amdStatusCallback("https://www.example.com/amd_result")
                    .amdStatusCallbackMethod(
                        ParticipantParticipantsParams.AmdStatusCallbackMethod.GET
                    )
                    .beep(ParticipantParticipantsParams.Beep.ON_EXIT)
                    .callerId("Info")
                    .callSidToCoach("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                    .cancelPlaybackOnDetectMessageEnd(false)
                    .cancelPlaybackOnMachineDetection(false)
                    .coaching(false)
                    .conferenceRecord(
                        ParticipantParticipantsParams.ConferenceRecord.RECORD_FROM_START
                    )
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
                    .earlyMedia(true)
                    .endConferenceOnExit(true)
                    .from("+12065550200")
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
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveParticipants() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val participantService = client.texml().accounts().conferences().participants()

        val response =
            participantService.retrieveParticipants(
                ParticipantRetrieveParticipantsParams.builder()
                    .accountSid("account_sid")
                    .conferenceSid("conference_sid")
                    .build()
            )

        response.validate()
    }
}
