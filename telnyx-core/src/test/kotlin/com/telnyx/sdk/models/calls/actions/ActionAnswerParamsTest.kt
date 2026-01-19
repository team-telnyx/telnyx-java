// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.models.calls.CustomSipHeader
import com.telnyx.sdk.models.calls.SipHeader
import com.telnyx.sdk.models.calls.SoundModifications
import com.telnyx.sdk.models.calls.StreamBidirectionalCodec
import com.telnyx.sdk.models.calls.StreamBidirectionalMode
import com.telnyx.sdk.models.calls.StreamBidirectionalTargetLegs
import com.telnyx.sdk.models.calls.StreamCodec
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionAnswerParamsTest {

    @Test
    fun create() {
        ActionAnswerParams.builder()
            .callControlId("call_control_id")
            .billingGroupId("f5586561-8ff0-4291-a0ac-84fe544797bd")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .addCustomHeader(CustomSipHeader.builder().name("head_1").value("val_1").build())
            .addCustomHeader(CustomSipHeader.builder().name("head_2").value("val_2").build())
            .preferredCodecs(ActionAnswerParams.PreferredCodecs.G722_PCMU_PCMA_G729_OPUS_VP8_H264)
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
                    .octaves(0.1)
                    .pitch(0.8)
                    .semitone(-2.0)
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
                    .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.GOOGLE)
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
    }

    @Test
    fun pathParams() {
        val params = ActionAnswerParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionAnswerParams.builder()
                .callControlId("call_control_id")
                .billingGroupId("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .addCustomHeader(CustomSipHeader.builder().name("head_1").value("val_1").build())
                .addCustomHeader(CustomSipHeader.builder().name("head_2").value("val_2").build())
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
                        .octaves(0.1)
                        .pitch(0.8)
                        .semitone(-2.0)
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
                        .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.GOOGLE)
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

        val body = params._body()

        assertThat(body.billingGroupId()).contains("f5586561-8ff0-4291-a0ac-84fe544797bd")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.customHeaders().getOrNull())
            .containsExactly(
                CustomSipHeader.builder().name("head_1").value("val_1").build(),
                CustomSipHeader.builder().name("head_2").value("val_2").build(),
            )
        assertThat(body.preferredCodecs())
            .contains(ActionAnswerParams.PreferredCodecs.G722_PCMU_PCMA_G729_OPUS_VP8_H264)
        assertThat(body.record()).contains(ActionAnswerParams.Record.RECORD_FROM_ANSWER)
        assertThat(body.recordChannels()).contains(ActionAnswerParams.RecordChannels.SINGLE)
        assertThat(body.recordCustomFileName()).contains("my_recording_file_name")
        assertThat(body.recordFormat()).contains(ActionAnswerParams.RecordFormat.WAV)
        assertThat(body.recordMaxLength()).contains(1000)
        assertThat(body.recordTimeoutSecs()).contains(100)
        assertThat(body.recordTrack()).contains(ActionAnswerParams.RecordTrack.OUTBOUND)
        assertThat(body.recordTrim()).contains(ActionAnswerParams.RecordTrim.TRIM_SILENCE)
        assertThat(body.sendSilenceWhenIdle()).contains(true)
        assertThat(body.sipHeaders().getOrNull())
            .containsExactly(
                SipHeader.builder().name(SipHeader.Name.USER_TO_USER).value("value").build()
            )
        assertThat(body.soundModifications())
            .contains(
                SoundModifications.builder()
                    .octaves(0.1)
                    .pitch(0.8)
                    .semitone(-2.0)
                    .track("both")
                    .build()
            )
        assertThat(body.streamBidirectionalCodec()).contains(StreamBidirectionalCodec.G722)
        assertThat(body.streamBidirectionalMode()).contains(StreamBidirectionalMode.RTP)
        assertThat(body.streamBidirectionalTargetLegs())
            .contains(StreamBidirectionalTargetLegs.BOTH)
        assertThat(body.streamCodec()).contains(StreamCodec.PCMA)
        assertThat(body.streamTrack()).contains(ActionAnswerParams.StreamTrack.BOTH_TRACKS)
        assertThat(body.streamUrl()).contains("wss://www.example.com/websocket")
        assertThat(body.transcription()).contains(true)
        assertThat(body.transcriptionConfig())
            .contains(
                TranscriptionStartRequest.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.GOOGLE)
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
        assertThat(body.webhookUrl()).contains("https://www.example.com/server-b/")
        assertThat(body.webhookUrlMethod()).contains(ActionAnswerParams.WebhookUrlMethod.POST)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionAnswerParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
