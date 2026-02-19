// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.calls

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.Assistant
import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.DialogflowConfig
import com.telnyx.sdk.models.calls.SipHeader
import com.telnyx.sdk.models.calls.SoundModifications
import com.telnyx.sdk.models.calls.StreamBidirectionalCodec
import com.telnyx.sdk.models.calls.StreamBidirectionalMode
import com.telnyx.sdk.models.calls.StreamBidirectionalSamplingRate
import com.telnyx.sdk.models.calls.StreamBidirectionalTargetLegs
import com.telnyx.sdk.models.calls.StreamCodec
import com.telnyx.sdk.models.calls.actions.ActionAddAiAssistantMessagesParams
import com.telnyx.sdk.models.calls.actions.ActionAnswerParams
import com.telnyx.sdk.models.calls.actions.ActionBridgeParams
import com.telnyx.sdk.models.calls.actions.ActionEnqueueParams
import com.telnyx.sdk.models.calls.actions.ActionGatherParams
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingAiParams
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingAudioParams
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingSpeakParams
import com.telnyx.sdk.models.calls.actions.ActionHangupParams
import com.telnyx.sdk.models.calls.actions.ActionLeaveQueueParams
import com.telnyx.sdk.models.calls.actions.ActionPauseRecordingParams
import com.telnyx.sdk.models.calls.actions.ActionReferParams
import com.telnyx.sdk.models.calls.actions.ActionRejectParams
import com.telnyx.sdk.models.calls.actions.ActionResumeRecordingParams
import com.telnyx.sdk.models.calls.actions.ActionSendDtmfParams
import com.telnyx.sdk.models.calls.actions.ActionSendSipInfoParams
import com.telnyx.sdk.models.calls.actions.ActionSpeakParams
import com.telnyx.sdk.models.calls.actions.ActionStartAiAssistantParams
import com.telnyx.sdk.models.calls.actions.ActionStartForkingParams
import com.telnyx.sdk.models.calls.actions.ActionStartNoiseSuppressionParams
import com.telnyx.sdk.models.calls.actions.ActionStartPlaybackParams
import com.telnyx.sdk.models.calls.actions.ActionStartRecordingParams
import com.telnyx.sdk.models.calls.actions.ActionStartSiprecParams
import com.telnyx.sdk.models.calls.actions.ActionStartStreamingParams
import com.telnyx.sdk.models.calls.actions.ActionStartTranscriptionParams
import com.telnyx.sdk.models.calls.actions.ActionStopAiAssistantParams
import com.telnyx.sdk.models.calls.actions.ActionStopForkingParams
import com.telnyx.sdk.models.calls.actions.ActionStopGatherParams
import com.telnyx.sdk.models.calls.actions.ActionStopNoiseSuppressionParams
import com.telnyx.sdk.models.calls.actions.ActionStopPlaybackParams
import com.telnyx.sdk.models.calls.actions.ActionStopRecordingParams
import com.telnyx.sdk.models.calls.actions.ActionStopSiprecParams
import com.telnyx.sdk.models.calls.actions.ActionStopStreamingParams
import com.telnyx.sdk.models.calls.actions.ActionStopTranscriptionParams
import com.telnyx.sdk.models.calls.actions.ActionSwitchSupervisorRoleParams
import com.telnyx.sdk.models.calls.actions.ActionTransferParams
import com.telnyx.sdk.models.calls.actions.ActionUpdateClientStateParams
import com.telnyx.sdk.models.calls.actions.ElevenLabsVoiceSettings
import com.telnyx.sdk.models.calls.actions.GoogleTranscriptionLanguage
import com.telnyx.sdk.models.calls.actions.InterruptionSettings
import com.telnyx.sdk.models.calls.actions.StopRecordingRequest
import com.telnyx.sdk.models.calls.actions.TranscriptionConfig
import com.telnyx.sdk.models.calls.actions.TranscriptionEngineGoogleConfig
import com.telnyx.sdk.models.calls.actions.TranscriptionStartRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun addAiAssistantMessages() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.addAiAssistantMessages(
                ActionAddAiAssistantMessagesParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .addMessage(
                        ActionAddAiAssistantMessagesParams.Message.System.builder()
                            .content("Get the user's favorite color")
                            .metadata(
                                ActionAddAiAssistantMessagesParams.Message.System.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun answer() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.answer(
                ActionAnswerParams.builder()
                    .callControlId("call_control_id")
                    .billingGroupId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .addCustomHeader(
                        CustomSipHeader.builder().name("head_1").value("val_1").build()
                    )
                    .addCustomHeader(
                        CustomSipHeader.builder().name("head_2").value("val_2").build()
                    )
                    .preferredCodecs(
                        ActionAnswerParams.PreferredCodecs.G722_PCMU_PCMA_G729_OPUS_VP8_H264
                    )
                    .record(ActionAnswerParams.Record.RECORD_FROM_ANSWER)
                    .recordChannels(ActionAnswerParams.RecordChannels.SINGLE)
                    .recordCustomFileName("my_recording_file_name")
                    .recordFormat(ActionAnswerParams.RecordFormat.WAV)
                    .recordMaxLength(1000)
                    .recordTimeoutSecs(100)
                    .recordTrack(ActionAnswerParams.RecordTrack.OUTBOUND)
                    .recordTrim(ActionAnswerParams.RecordTrim.TRIM_SILENCE)
                    .sendSilenceWhenIdle(true)
                    .addSipHeader(
                        SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
                    )
                    .soundModifications(
                        SoundModifications.builder()
                            .octaves(0.1f)
                            .pitch(0.8f)
                            .semitone(-2.0f)
                            .track("both")
                            .build()
                    )
                    .streamBidirectionalCodec(StreamBidirectionalCodec.G722)
                    .streamBidirectionalMode(StreamBidirectionalMode.RTP)
                    .streamBidirectionalTargetLegs(StreamBidirectionalTargetLegs.BOTH)
                    .streamCodec(StreamCodec.PCMA)
                    .streamTrack(ActionAnswerParams.StreamTrack.BOTH_TRACKS)
                    .streamUrl("wss://www.example.com/websocket")
                    .transcription(true)
                    .transcriptionConfig(
                        TranscriptionStartRequest.builder()
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                            .transcriptionEngine(
                                TranscriptionStartRequest.TranscriptionEngine.GOOGLE
                            )
                            .transcriptionEngineConfig(
                                TranscriptionEngineGoogleConfig.builder()
                                    .enableSpeakerDiarization(true)
                                    .addHint("string")
                                    .interimResults(true)
                                    .language(GoogleTranscriptionLanguage.EN)
                                    .maxSpeakerCount(4)
                                    .minSpeakerCount(4)
                                    .model(TranscriptionEngineGoogleConfig.Model.LATEST_LONG)
                                    .profanityFilter(true)
                                    .addSpeechContext(
                                        TranscriptionEngineGoogleConfig.SpeechContext.builder()
                                            .boost(1.0)
                                            .addPhrase("string")
                                            .build()
                                    )
                                    .transcriptionEngine(
                                        TranscriptionEngineGoogleConfig.TranscriptionEngine.GOOGLE
                                    )
                                    .useEnhanced(true)
                                    .build()
                            )
                            .transcriptionTracks("both")
                            .build()
                    )
                    .webhookUrl("https://www.example.com/server-b/")
                    .webhookUrlMethod(ActionAnswerParams.WebhookUrlMethod.POST)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bridge() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.bridge(
                ActionBridgeParams.builder()
                    .callControlIdToBridge("call_control_id")
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .muteDtmf(ActionBridgeParams.MuteDtmf.OPPOSITE)
                    .parkAfterUnbridge("self")
                    .playRingtone(true)
                    .queue("support")
                    .record(ActionBridgeParams.Record.RECORD_FROM_ANSWER)
                    .recordChannels(ActionBridgeParams.RecordChannels.SINGLE)
                    .recordCustomFileName("my_recording_file_name")
                    .recordFormat(ActionBridgeParams.RecordFormat.WAV)
                    .recordMaxLength(1000)
                    .recordTimeoutSecs(100)
                    .recordTrack(ActionBridgeParams.RecordTrack.OUTBOUND)
                    .recordTrim(ActionBridgeParams.RecordTrim.TRIM_SILENCE)
                    .ringtone(ActionBridgeParams.Ringtone.PL)
                    .videoRoomContext("Alice")
                    .videoRoomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun enqueue() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.enqueue(
                ActionEnqueueParams.builder()
                    .callControlId("call_control_id")
                    .queueName("support")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .keepAfterHangup(true)
                    .maxSize(20L)
                    .maxWaitTimeSecs(600L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun gather() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.gather(
                ActionGatherParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .gatherId("my_gather_id")
                    .initialTimeoutMillis(10000)
                    .interDigitTimeoutMillis(10000)
                    .maximumDigits(10)
                    .minimumDigits(1)
                    .terminatingDigit("#")
                    .timeoutMillis(60000)
                    .validDigits("123")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun gatherUsingAi() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.gatherUsingAi(
                ActionGatherUsingAiParams.builder()
                    .callControlId("call_control_id")
                    .parameters(
                        ActionGatherUsingAiParams.Parameters.builder()
                            .putAdditionalProperty("properties", JsonValue.from("bar"))
                            .putAdditionalProperty("required", JsonValue.from("bar"))
                            .putAdditionalProperty("type", JsonValue.from("bar"))
                            .build()
                    )
                    .assistant(
                        Assistant.builder()
                            .instructions("You are a friendly voice assistant.")
                            .model("Qwen/Qwen3-235B-A22B")
                            .openaiApiKeyRef("my_openai_api_key")
                            .addBookAppointmentTool(
                                Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                                    .apiKeyRef("my_calcom_api_key")
                                    .eventTypeId(0L)
                                    .attendeeName("attendee_name")
                                    .attendeeTimezone("attendee_timezone")
                                    .build()
                            )
                            .build()
                    )
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .gatherEndedSpeech("Thank you for providing the information.")
                    .greeting("Hello, can you tell me your age and where you live?")
                    .interruptionSettings(InterruptionSettings.builder().enable(true).build())
                    .language(GoogleTranscriptionLanguage.EN)
                    .addMessageHistory(
                        ActionGatherUsingAiParams.MessageHistory.builder()
                            .content("Hello, what's your name?")
                            .role(ActionGatherUsingAiParams.MessageHistory.Role.ASSISTANT)
                            .build()
                    )
                    .addMessageHistory(
                        ActionGatherUsingAiParams.MessageHistory.builder()
                            .content("Hello, I'm John.")
                            .role(ActionGatherUsingAiParams.MessageHistory.Role.USER)
                            .build()
                    )
                    .sendMessageHistoryUpdates(true)
                    .sendPartialResults(true)
                    .transcription(
                        TranscriptionConfig.builder()
                            .model("distil-whisper/distil-large-v2")
                            .build()
                    )
                    .userResponseTimeoutMs(5000L)
                    .voice("Telnyx.KokoroTTS.af")
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder()
                            .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                            .apiKeyRef("my_elevenlabs_api_key")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun gatherUsingAudio() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.gatherUsingAudio(
                ActionGatherUsingAudioParams.builder()
                    .callControlId("call_control_id")
                    .audioUrl("http://example.com/message.wav")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .interDigitTimeoutMillis(10000)
                    .invalidAudioUrl("http://example.com/message.wav")
                    .invalidMediaName("my_media_uploaded_to_media_storage_api")
                    .maximumDigits(10)
                    .maximumTries(3)
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .minimumDigits(1)
                    .terminatingDigit("#")
                    .timeoutMillis(10000)
                    .validDigits("123")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun gatherUsingSpeak() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.gatherUsingSpeak(
                ActionGatherUsingSpeakParams.builder()
                    .callControlId("call_control_id")
                    .payload("say this on call")
                    .voice("male")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .interDigitTimeoutMillis(10000)
                    .invalidPayload("say this on call")
                    .language(ActionGatherUsingSpeakParams.Language.ARB)
                    .maximumDigits(10)
                    .maximumTries(3)
                    .minimumDigits(1)
                    .payloadType(ActionGatherUsingSpeakParams.PayloadType.TEXT)
                    .serviceLevel(ActionGatherUsingSpeakParams.ServiceLevel.PREMIUM)
                    .terminatingDigit("#")
                    .timeoutMillis(60000)
                    .validDigits("123")
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder()
                            .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                            .apiKeyRef("my_elevenlabs_api_key")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun hangup() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.hangup(
                ActionHangupParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun leaveQueue() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.leaveQueue(
                ActionLeaveQueueParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun pauseRecording() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.pauseRecording(
                ActionPauseRecordingParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun refer() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.refer(
                ActionReferParams.builder()
                    .callControlId("call_control_id")
                    .sipAddress("sip:username@sip.non-telnyx-address.com")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .addCustomHeader(
                        CustomSipHeader.builder().name("head_1").value("val_1").build()
                    )
                    .addCustomHeader(
                        CustomSipHeader.builder().name("head_2").value("val_2").build()
                    )
                    .sipAuthPassword("sip_auth_password")
                    .sipAuthUsername("sip_auth_username")
                    .addSipHeader(
                        SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun reject() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.reject(
                ActionRejectParams.builder()
                    .callControlId("call_control_id")
                    .cause(ActionRejectParams.Cause.USER_BUSY)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resumeRecording() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.resumeRecording(
                ActionResumeRecordingParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendDtmf() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.sendDtmf(
                ActionSendDtmfParams.builder()
                    .callControlId("call_control_id")
                    .digits("1www2WABCDw9")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .durationMillis(500)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendSipInfo() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.sendSipInfo(
                ActionSendSipInfoParams.builder()
                    .callControlId("call_control_id")
                    .sipInfoBody("{\"key\": \"value\", \"numValue\": 100}")
                    .contentType("application/json")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun speak() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.speak(
                ActionSpeakParams.builder()
                    .callControlId("call_control_id")
                    .payload("Say this on the call")
                    .voice("female")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .language(ActionSpeakParams.Language.ARB)
                    .loop("string")
                    .payloadType(ActionSpeakParams.PayloadType.TEXT)
                    .serviceLevel(ActionSpeakParams.ServiceLevel.BASIC)
                    .stop("current")
                    .targetLegs(ActionSpeakParams.TargetLegs.BOTH)
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder()
                            .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                            .apiKeyRef("my_elevenlabs_api_key")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startAiAssistant() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.startAiAssistant(
                ActionStartAiAssistantParams.builder()
                    .callControlId("call_control_id")
                    .assistant(
                        ActionStartAiAssistantParams.Assistant.builder()
                            .id("id")
                            .instructions("You are a friendly voice assistant.")
                            .openaiApiKeyRef("openai_api_key_ref")
                            .build()
                    )
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .greeting("Hello, can you tell me your age and where you live?")
                    .interruptionSettings(InterruptionSettings.builder().enable(true).build())
                    .transcription(
                        TranscriptionConfig.builder()
                            .model("distil-whisper/distil-large-v2")
                            .build()
                    )
                    .voice("Telnyx.KokoroTTS.af")
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder()
                            .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                            .apiKeyRef("my_elevenlabs_api_key")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startForking() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.startForking(
                ActionStartForkingParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .rx("udp:192.0.2.1:9000")
                    .streamType(ActionStartForkingParams.StreamType.DECRYPTED)
                    .tx("udp:192.0.2.1:9001")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startNoiseSuppression() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.startNoiseSuppression(
                ActionStartNoiseSuppressionParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .direction(ActionStartNoiseSuppressionParams.Direction.BOTH)
                    .noiseSuppressionEngine(
                        ActionStartNoiseSuppressionParams.NoiseSuppressionEngine.DEEP_FILTER_NET
                    )
                    .noiseSuppressionEngineConfig(
                        ActionStartNoiseSuppressionParams.NoiseSuppressionEngineConfig.builder()
                            .attenuationLimit(100L)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startPlayback() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.startPlayback(
                ActionStartPlaybackParams.builder()
                    .callControlId("call_control_id")
                    .audioType(ActionStartPlaybackParams.AudioType.WAV)
                    .audioUrl("http://www.example.com/sounds/greeting.wav")
                    .cacheAudio(true)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .loop("infinity")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .overlay(true)
                    .playbackContent("SUQzAwAAAAADf1...")
                    .stop("current")
                    .targetLegs("self")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startRecording() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.startRecording(
                ActionStartRecordingParams.builder()
                    .callControlId("call_control_id")
                    .channels(ActionStartRecordingParams.Channels.SINGLE)
                    .format(ActionStartRecordingParams.Format.WAV)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .customFileName("my_recording_file_name")
                    .maxLength(0)
                    .playBeep(true)
                    .recordingTrack(ActionStartRecordingParams.RecordingTrack.OUTBOUND)
                    .timeoutSecs(0)
                    .transcription(true)
                    .transcriptionEngine(ActionStartRecordingParams.TranscriptionEngine.B)
                    .transcriptionLanguage(ActionStartRecordingParams.TranscriptionLanguage.EN)
                    .transcriptionMaxSpeakerCount(4)
                    .transcriptionMinSpeakerCount(4)
                    .transcriptionProfanityFilter(true)
                    .transcriptionSpeakerDiarization(true)
                    .trim(ActionStartRecordingParams.Trim.TRIM_SILENCE)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startSiprec() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.startSiprec(
                ActionStartSiprecParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectorName("my-siprec-connector")
                    .includeMetadataCustomHeaders(
                        ActionStartSiprecParams.IncludeMetadataCustomHeaders.TRUE
                    )
                    .secure(ActionStartSiprecParams.Secure.TRUE)
                    .sessionTimeoutSecs(900L)
                    .sipTransport(ActionStartSiprecParams.SipTransport.TCP)
                    .siprecTrack(ActionStartSiprecParams.SiprecTrack.BOTH_TRACKS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startStreaming() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.startStreaming(
                ActionStartStreamingParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .addCustomParameter(
                        ActionStartStreamingParams.CustomParameter.builder()
                            .name("param1")
                            .value("value1")
                            .build()
                    )
                    .addCustomParameter(
                        ActionStartStreamingParams.CustomParameter.builder()
                            .name("param2")
                            .value("value2")
                            .build()
                    )
                    .dialogflowConfig(
                        DialogflowConfig.builder()
                            .analyzeSentiment(false)
                            .partialAutomatedAgentReply(false)
                            .build()
                    )
                    .enableDialogflow(false)
                    .streamAuthToken("your-auth-token")
                    .streamBidirectionalCodec(StreamBidirectionalCodec.G722)
                    .streamBidirectionalMode(StreamBidirectionalMode.RTP)
                    .streamBidirectionalSamplingRate(StreamBidirectionalSamplingRate.RATE_16000)
                    .streamBidirectionalTargetLegs(StreamBidirectionalTargetLegs.BOTH)
                    .streamCodec(StreamCodec.PCMA)
                    .streamTrack(ActionStartStreamingParams.StreamTrack.BOTH_TRACKS)
                    .streamUrl("wss://www.example.com/websocket")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startTranscription() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.startTranscription(
                ActionStartTranscriptionParams.builder()
                    .callControlId("call_control_id")
                    .transcriptionStartRequest(
                        TranscriptionStartRequest.builder()
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                            .transcriptionEngine(
                                TranscriptionStartRequest.TranscriptionEngine.GOOGLE
                            )
                            .transcriptionEngineConfig(
                                TranscriptionEngineGoogleConfig.builder()
                                    .enableSpeakerDiarization(true)
                                    .addHint("string")
                                    .interimResults(true)
                                    .language(GoogleTranscriptionLanguage.EN)
                                    .maxSpeakerCount(4)
                                    .minSpeakerCount(4)
                                    .model(TranscriptionEngineGoogleConfig.Model.LATEST_LONG)
                                    .profanityFilter(true)
                                    .addSpeechContext(
                                        TranscriptionEngineGoogleConfig.SpeechContext.builder()
                                            .boost(1.0)
                                            .addPhrase("string")
                                            .build()
                                    )
                                    .transcriptionEngine(
                                        TranscriptionEngineGoogleConfig.TranscriptionEngine.GOOGLE
                                    )
                                    .useEnhanced(true)
                                    .build()
                            )
                            .transcriptionTracks("both")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stopAiAssistant() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopAiAssistant(
                ActionStopAiAssistantParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stopForking() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopForking(
                ActionStopForkingParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .streamType(ActionStopForkingParams.StreamType.DECRYPTED)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stopGather() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopGather(
                ActionStopGatherParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stopNoiseSuppression() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopNoiseSuppression(
                ActionStopNoiseSuppressionParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stopPlayback() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopPlayback(
                ActionStopPlaybackParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .overlay(false)
                    .stop("all")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stopRecording() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopRecording(
                ActionStopRecordingParams.builder()
                    .callControlId("call_control_id")
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
    fun stopSiprec() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopSiprec(
                ActionStopSiprecParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stopStreaming() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopStreaming(
                ActionStopStreamingParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stopTranscription() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.stopTranscription(
                ActionStopTranscriptionParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun switchSupervisorRole() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.switchSupervisorRole(
                ActionSwitchSupervisorRoleParams.builder()
                    .callControlId("call_control_id")
                    .role(ActionSwitchSupervisorRoleParams.Role.BARGE)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun transfer() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.transfer(
                ActionTransferParams.builder()
                    .callControlId("call_control_id")
                    .to("+18005550100 or sip:username@sip.telnyx.com")
                    .answeringMachineDetection(
                        ActionTransferParams.AnsweringMachineDetection.DETECT
                    )
                    .answeringMachineDetectionConfig(
                        ActionTransferParams.AnsweringMachineDetectionConfig.builder()
                            .afterGreetingSilenceMillis(1000)
                            .betweenWordsSilenceMillis(1000)
                            .greetingDurationMillis(1000)
                            .greetingSilenceDurationMillis(2000)
                            .greetingTotalAnalysisTimeMillis(50000)
                            .initialSilenceMillis(1000)
                            .maximumNumberOfWords(1000)
                            .maximumWordLengthMillis(2000)
                            .silenceThreshold(512)
                            .totalAnalysisTimeMillis(5000)
                            .build()
                    )
                    .audioUrl("http://www.example.com/sounds/greeting.wav")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .addCustomHeader(
                        CustomSipHeader.builder().name("head_1").value("val_1").build()
                    )
                    .addCustomHeader(
                        CustomSipHeader.builder().name("head_2").value("val_2").build()
                    )
                    .earlyMedia(true)
                    .from("+18005550101")
                    .fromDisplayName("Company Name")
                    .mediaEncryption(ActionTransferParams.MediaEncryption.SRTP)
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .muteDtmf(ActionTransferParams.MuteDtmf.OPPOSITE)
                    .parkAfterUnbridge("self")
                    .preferredCodecs("G722,PCMU,PCMA,G729,OPUS,VP8,H264")
                    .record(ActionTransferParams.Record.RECORD_FROM_ANSWER)
                    .recordChannels(ActionTransferParams.RecordChannels.SINGLE)
                    .recordCustomFileName("my_recording_file_name")
                    .recordFormat(ActionTransferParams.RecordFormat.WAV)
                    .recordMaxLength(1000)
                    .recordTimeoutSecs(100)
                    .recordTrack(ActionTransferParams.RecordTrack.OUTBOUND)
                    .recordTrim(ActionTransferParams.RecordTrim.TRIM_SILENCE)
                    .sipAuthPassword("password")
                    .sipAuthUsername("username")
                    .addSipHeader(
                        SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
                    )
                    .sipRegion(ActionTransferParams.SipRegion.CANADA)
                    .sipTransportProtocol(ActionTransferParams.SipTransportProtocol.TLS)
                    .soundModifications(
                        SoundModifications.builder()
                            .octaves(0.1f)
                            .pitch(0.8f)
                            .semitone(-2.0f)
                            .track("both")
                            .build()
                    )
                    .targetLegClientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .timeLimitSecs(60)
                    .timeoutSecs(60)
                    .webhookRetriesPolicies(
                        ActionTransferParams.WebhookRetriesPolicies.builder()
                            .putAdditionalProperty(
                                "call.answered",
                                JsonValue.from(mapOf("retries_ms" to listOf(1000, 2000, 5000))),
                            )
                            .build()
                    )
                    .webhookUrl("https://www.example.com/server-b/")
                    .webhookUrlMethod(ActionTransferParams.WebhookUrlMethod.POST)
                    .webhookUrls(
                        ActionTransferParams.WebhookUrls.builder()
                            .putAdditionalProperty(
                                "call.answered",
                                JsonValue.from("https://www.example.com/webhooks/answered"),
                            )
                            .putAdditionalProperty(
                                "call.hangup",
                                JsonValue.from("https://www.example.com/webhooks/hangup"),
                            )
                            .build()
                    )
                    .webhookUrlsMethod(ActionTransferParams.WebhookUrlsMethod.POST)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateClientState() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.calls().actions()

        val responseFuture =
            actionServiceAsync.updateClientState(
                ActionUpdateClientStateParams.builder()
                    .callControlId("call_control_id")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
