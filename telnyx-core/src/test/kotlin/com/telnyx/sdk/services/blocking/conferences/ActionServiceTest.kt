// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.conferences

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.calls.actions.ElevenLabsVoiceSettings
import com.telnyx.sdk.models.conferences.actions.ActionEndConferenceParams
import com.telnyx.sdk.models.conferences.actions.ActionGatherDtmfAudioParams
import com.telnyx.sdk.models.conferences.actions.ActionHoldParams
import com.telnyx.sdk.models.conferences.actions.ActionJoinParams
import com.telnyx.sdk.models.conferences.actions.ActionLeaveParams
import com.telnyx.sdk.models.conferences.actions.ActionMuteParams
import com.telnyx.sdk.models.conferences.actions.ActionPlayParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordPauseParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordResumeParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordStartParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordStopParams
import com.telnyx.sdk.models.conferences.actions.ActionSendDtmfParams
import com.telnyx.sdk.models.conferences.actions.ActionSpeakParams
import com.telnyx.sdk.models.conferences.actions.ActionStopParams
import com.telnyx.sdk.models.conferences.actions.ActionUnholdParams
import com.telnyx.sdk.models.conferences.actions.ActionUnmuteParams
import com.telnyx.sdk.models.conferences.actions.ActionUpdateParams
import com.telnyx.sdk.models.conferences.actions.UpdateConference
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val action =
            actionService.update(
                ActionUpdateParams.builder()
                    .id("id")
                    .updateConference(
                        UpdateConference.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .supervisorRole(UpdateConference.SupervisorRole.WHISPER)
                            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                            .region(UpdateConference.Region.US)
                            .addWhisperCallControlId(
                                "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                            )
                            .addWhisperCallControlId(
                                "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                            )
                            .build()
                    )
                    .build()
            )

        action.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun endConference() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.endConference(
                ActionEndConferenceParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun gatherDtmfAudio() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.gatherDtmfAudio(
                ActionGatherDtmfAudioParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .audioUrl("http://example.com/gather_prompt.wav")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .gatherId("gather_id")
                    .initialTimeoutMillis(10000L)
                    .interDigitTimeoutMillis(3000L)
                    .invalidAudioUrl("invalid_audio_url")
                    .invalidMediaName("invalid_media_name")
                    .maximumDigits(4L)
                    .maximumTries(3L)
                    .mediaName("media_name")
                    .minimumDigits(1L)
                    .stopPlaybackOnDtmf(true)
                    .terminatingDigit("#")
                    .timeoutMillis(30000L)
                    .validDigits("0123456789")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun hold() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.hold(
                ActionHoldParams.builder()
                    .id("id")
                    .audioUrl("http://example.com/message.wav")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .region(ActionHoldParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun join() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.join(
                ActionJoinParams.builder()
                    .id("id")
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .beepEnabled(ActionJoinParams.BeepEnabled.ALWAYS)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .endConferenceOnExit(true)
                    .hold(true)
                    .holdAudioUrl("http://www.example.com/audio.wav")
                    .holdMediaName("my_media_uploaded_to_media_storage_api")
                    .mute(true)
                    .region(ActionJoinParams.Region.US)
                    .softEndConferenceOnExit(true)
                    .startConferenceOnEnter(true)
                    .supervisorRole(ActionJoinParams.SupervisorRole.WHISPER)
                    .addWhisperCallControlId(
                        "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                    )
                    .addWhisperCallControlId(
                        "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun leave() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.leave(
                ActionLeaveParams.builder()
                    .id("id")
                    .callControlId("c46e06d7-b78f-4b13-96b6-c576af9640ff")
                    .beepEnabled(ActionLeaveParams.BeepEnabled.NEVER)
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .region(ActionLeaveParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun mute() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.mute(
                ActionMuteParams.builder()
                    .id("id")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .region(ActionMuteParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun play() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.play(
                ActionPlayParams.builder()
                    .id("id")
                    .audioUrl("http://www.example.com/sounds/greeting.wav")
                    .addCallControlId("string")
                    .loop("infinity")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .region(ActionPlayParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recordPause() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.recordPause(
                ActionRecordPauseParams.builder()
                    .id("id")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .region(ActionRecordPauseParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recordResume() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.recordResume(
                ActionRecordResumeParams.builder()
                    .id("id")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .region(ActionRecordResumeParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recordStart() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.recordStart(
                ActionRecordStartParams.builder()
                    .id("id")
                    .format(ActionRecordStartParams.Format.WAV)
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .customFileName("my_recording_file_name")
                    .playBeep(true)
                    .region(ActionRecordStartParams.Region.US)
                    .trim(ActionRecordStartParams.Trim.TRIM_SILENCE)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recordStop() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.recordStop(
                ActionRecordStopParams.builder()
                    .id("id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                    .region(ActionRecordStopParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendDtmf() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.sendDtmf(
                ActionSendDtmfParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digits("1234#")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .durationMillis(250L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun speak() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.speak(
                ActionSpeakParams.builder()
                    .id("id")
                    .payload("Say this to participants")
                    .voice("female")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .language(ActionSpeakParams.Language.EN_US)
                    .payloadType(ActionSpeakParams.PayloadType.TEXT)
                    .region(ActionSpeakParams.Region.US)
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder()
                            .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                            .apiKeyRef("my_elevenlabs_api_key")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stop() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.stop(
                ActionStopParams.builder()
                    .id("id")
                    .addCallControlId("string")
                    .region(ActionStopParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unhold() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.unhold(
                ActionUnholdParams.builder()
                    .id("id")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .region(ActionUnholdParams.Region.US)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unmute() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.conferences().actions()

        val response =
            actionService.unmute(
                ActionUnmuteParams.builder()
                    .id("id")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .region(ActionUnmuteParams.Region.US)
                    .build()
            )

        response.validate()
    }
}
