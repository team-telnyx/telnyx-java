// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionStartRequestTest {

    @Test
    fun create() {
        val transcriptionStartRequest =
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

        assertThat(transcriptionStartRequest.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(transcriptionStartRequest.commandId())
            .contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(transcriptionStartRequest.transcriptionEngine())
            .contains(TranscriptionStartRequest.TranscriptionEngine.GOOGLE)
        assertThat(transcriptionStartRequest.transcriptionEngineConfig())
            .contains(
                TranscriptionStartRequest.TranscriptionEngineConfig.ofGoogle(
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
            )
        assertThat(transcriptionStartRequest.transcriptionTracks()).contains("both")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionStartRequest =
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

        val roundtrippedTranscriptionStartRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionStartRequest),
                jacksonTypeRef<TranscriptionStartRequest>(),
            )

        assertThat(roundtrippedTranscriptionStartRequest).isEqualTo(transcriptionStartRequest)
    }
}
