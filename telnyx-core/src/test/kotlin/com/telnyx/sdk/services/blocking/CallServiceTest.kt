// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.calls.CallDialParams
import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.DialogflowConfig
import com.telnyx.sdk.models.calls.SipHeader
import com.telnyx.sdk.models.calls.SoundModifications
import com.telnyx.sdk.models.calls.StreamBidirectionalCodec
import com.telnyx.sdk.models.calls.StreamBidirectionalMode
import com.telnyx.sdk.models.calls.StreamBidirectionalSamplingRate
import com.telnyx.sdk.models.calls.StreamBidirectionalTargetLegs
import com.telnyx.sdk.models.calls.StreamCodec
import com.telnyx.sdk.models.calls.actions.GoogleTranscriptionLanguage
import com.telnyx.sdk.models.calls.actions.TranscriptionEngineGoogleConfig
import com.telnyx.sdk.models.calls.actions.TranscriptionStartRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun dial() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callService = client.calls()

        val response =
            callService.dial(
                CallDialParams.builder()
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .from("+18005550101")
                    .to("+18005550100 or sip:username@sip.telnyx.com")
                    .answeringMachineDetection(CallDialParams.AnsweringMachineDetection.DETECT)
                    .answeringMachineDetectionConfig(
                        CallDialParams.AnsweringMachineDetectionConfig.builder()
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
                    .billingGroupId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .bridgeIntent(true)
                    .bridgeOnAnswer(true)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .conferenceConfig(
                        CallDialParams.ConferenceConfig.builder()
                            .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .beepEnabled(CallDialParams.ConferenceConfig.BeepEnabled.ON_EXIT)
                            .conferenceName("telnyx-conference")
                            .earlyMedia(false)
                            .endConferenceOnExit(true)
                            .hold(true)
                            .holdAudioUrl("http://example.com/message.wav")
                            .holdMediaName("my_media_uploaded_to_media_storage_api")
                            .mute(true)
                            .softEndConferenceOnExit(true)
                            .startConferenceOnCreate(false)
                            .startConferenceOnEnter(true)
                            .supervisorRole(CallDialParams.ConferenceConfig.SupervisorRole.WHISPER)
                            .addWhisperCallControlId(
                                "v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ"
                            )
                            .addWhisperCallControlId(
                                "v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw"
                            )
                            .build()
                    )
                    .addCustomHeader(
                        CustomSipHeader.builder().name("head_1").value("val_1").build()
                    )
                    .addCustomHeader(
                        CustomSipHeader.builder().name("head_2").value("val_2").build()
                    )
                    .dialogflowConfig(
                        DialogflowConfig.builder()
                            .analyzeSentiment(false)
                            .partialAutomatedAgentReply(false)
                            .build()
                    )
                    .enableDialogflow(false)
                    .fromDisplayName("Company Name")
                    .linkTo("ilditnZK_eVysupV21KzmzN_sM29ygfauQojpm4BgFtfX5hXAcjotg==")
                    .mediaEncryption(CallDialParams.MediaEncryption.SRTP)
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .parkAfterUnbridge("self")
                    .preferredCodecs("G722,PCMU,PCMA,G729,OPUS,VP8,H264")
                    .record(CallDialParams.Record.RECORD_FROM_ANSWER)
                    .recordChannels(CallDialParams.RecordChannels.SINGLE)
                    .recordCustomFileName("my_recording_file_name")
                    .recordFormat(CallDialParams.RecordFormat.WAV)
                    .recordMaxLength(1000)
                    .recordTimeoutSecs(100)
                    .recordTrack(CallDialParams.RecordTrack.OUTBOUND)
                    .recordTrim(CallDialParams.RecordTrim.TRIM_SILENCE)
                    .sendSilenceWhenIdle(true)
                    .sipAuthPassword("password")
                    .sipAuthUsername("username")
                    .addSipHeader(
                        SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("12345").build()
                    )
                    .sipRegion(CallDialParams.SipRegion.CANADA)
                    .sipTransportProtocol(CallDialParams.SipTransportProtocol.TLS)
                    .soundModifications(
                        SoundModifications.builder()
                            .octaves(0.1)
                            .pitch(0.8)
                            .semitone(-2.0)
                            .track("both")
                            .build()
                    )
                    .streamBidirectionalCodec(StreamBidirectionalCodec.G722)
                    .streamBidirectionalMode(StreamBidirectionalMode.RTP)
                    .streamBidirectionalSamplingRate(StreamBidirectionalSamplingRate.RATE_16000)
                    .streamBidirectionalTargetLegs(StreamBidirectionalTargetLegs.BOTH)
                    .streamCodec(StreamCodec.PCMA)
                    .streamEstablishBeforeCallOriginate(true)
                    .streamTrack(CallDialParams.StreamTrack.BOTH_TRACKS)
                    .streamUrl("wss://www.example.com/websocket")
                    .superviseCallControlId(
                        "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                    )
                    .supervisorRole(CallDialParams.SupervisorRole.BARGE)
                    .timeLimitSecs(60)
                    .timeoutSecs(60)
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
                    .webhookUrlMethod(CallDialParams.WebhookUrlMethod.POST)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callService = client.calls()

        val response = callService.retrieveStatus("call_control_id")

        response.validate()
    }
}
