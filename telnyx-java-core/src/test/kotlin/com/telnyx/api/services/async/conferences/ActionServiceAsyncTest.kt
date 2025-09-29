// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.conferences

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.calls.actions.ElevenLabsVoiceSettings
import com.telnyx.api.models.calls.actions.StopRecordingRequest
import com.telnyx.api.models.conferences.actions.ActionHoldParams
import com.telnyx.api.models.conferences.actions.ActionJoinParams
import com.telnyx.api.models.conferences.actions.ActionLeaveParams
import com.telnyx.api.models.conferences.actions.ActionMuteParams
import com.telnyx.api.models.conferences.actions.ActionPlayParams
import com.telnyx.api.models.conferences.actions.ActionRecordPauseParams
import com.telnyx.api.models.conferences.actions.ActionRecordResumeParams
import com.telnyx.api.models.conferences.actions.ActionRecordStartParams
import com.telnyx.api.models.conferences.actions.ActionRecordStopParams
import com.telnyx.api.models.conferences.actions.ActionSpeakParams
import com.telnyx.api.models.conferences.actions.ActionStopParams
import com.telnyx.api.models.conferences.actions.ActionUnholdParams
import com.telnyx.api.models.conferences.actions.ActionUnmuteParams
import com.telnyx.api.models.conferences.actions.ActionUpdateParams
import com.telnyx.api.models.conferences.actions.UpdateConference
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val actionFuture =
            actionServiceAsync.update(
                ActionUpdateParams.builder()
                    .id("id")
                    .updateConference(
                        UpdateConference.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .supervisorRole(UpdateConference.SupervisorRole.WHISPER)
                            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
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

        val action = actionFuture.get()
        action.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun hold() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.hold(
                ActionHoldParams.builder()
                    .id("id")
                    .audioUrl("http://example.com/message.wav")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun join() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.join(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun leave() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.leave(
                ActionLeaveParams.builder()
                    .id("id")
                    .callControlId("c46e06d7-b78f-4b13-96b6-c576af9640ff")
                    .beepEnabled(ActionLeaveParams.BeepEnabled.NEVER)
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun mute() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.mute(
                ActionMuteParams.builder()
                    .id("id")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun play() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.play(
                ActionPlayParams.builder()
                    .id("id")
                    .audioUrl("http://www.example.com/sounds/greeting.wav")
                    .addCallControlId("string")
                    .loop("infinity")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recordPause() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.recordPause(
                ActionRecordPauseParams.builder()
                    .id("id")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recordResume() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.recordResume(
                ActionRecordResumeParams.builder()
                    .id("id")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recordStart() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.recordStart(
                ActionRecordStartParams.builder()
                    .id("id")
                    .format(ActionRecordStartParams.Format.WAV)
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .customFileName("my_recording_file_name")
                    .playBeep(true)
                    .trim(ActionRecordStartParams.Trim.TRIM_SILENCE)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recordStop() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.recordStop(
                ActionRecordStopParams.builder()
                    .id("id")
                    .stopRecordingRequest(
                        StopRecordingRequest.builder()
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                            .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun speak() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.speak(
                ActionSpeakParams.builder()
                    .id("id")
                    .payload("Say this to participants")
                    .voice("female")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .language(ActionSpeakParams.Language.EN_US)
                    .payloadType(ActionSpeakParams.PayloadType.TEXT)
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stop() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.stop(
                ActionStopParams.builder().id("id").addCallControlId("string").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unhold() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.unhold(
                ActionUnholdParams.builder()
                    .id("id")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unmute() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.conferences().actions()

        val responseFuture =
            actionServiceAsync.unmute(
                ActionUnmuteParams.builder()
                    .id("id")
                    .addCallControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
