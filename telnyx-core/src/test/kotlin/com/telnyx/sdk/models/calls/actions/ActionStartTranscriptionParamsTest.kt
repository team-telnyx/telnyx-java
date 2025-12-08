// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartTranscriptionParamsTest {

    @Test
    fun create() {
        ActionStartTranscriptionParams.builder()
            .callControlId("call_control_id")
            .transcriptionStartRequest(
                TranscriptionStartRequest.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.GOOGLE)
                    .transcriptionEngineConfig(
                        TranscriptionStartRequest.TranscriptionEngineConfig.Google.builder()
                            .enableSpeakerDiarization(true)
                            .addHint("string")
                            .interimResults(true)
                            .language(GoogleTranscriptionLanguage.EN)
                            .maxSpeakerCount(4)
                            .minSpeakerCount(4)
                            .model(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Google.Model
                                    .LATEST_LONG
                            )
                            .profanityFilter(true)
                            .addSpeechContext(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Google
                                    .SpeechContext
                                    .builder()
                                    .boost(1.0)
                                    .addPhrase("string")
                                    .build()
                            )
                            .transcriptionEngine(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Google
                                    .TranscriptionEngine
                                    .GOOGLE
                            )
                            .useEnhanced(true)
                            .build()
                    )
                    .transcriptionTracks("both")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionStartTranscriptionParams.builder()
                .callControlId("call_control_id")
                .transcriptionStartRequest(TranscriptionStartRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStartTranscriptionParams.builder()
                .callControlId("call_control_id")
                .transcriptionStartRequest(
                    TranscriptionStartRequest.builder()
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                        .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.GOOGLE)
                        .transcriptionEngineConfig(
                            TranscriptionStartRequest.TranscriptionEngineConfig.Google.builder()
                                .enableSpeakerDiarization(true)
                                .addHint("string")
                                .interimResults(true)
                                .language(GoogleTranscriptionLanguage.EN)
                                .maxSpeakerCount(4)
                                .minSpeakerCount(4)
                                .model(
                                    TranscriptionStartRequest.TranscriptionEngineConfig.Google.Model
                                        .LATEST_LONG
                                )
                                .profanityFilter(true)
                                .addSpeechContext(
                                    TranscriptionStartRequest.TranscriptionEngineConfig.Google
                                        .SpeechContext
                                        .builder()
                                        .boost(1.0)
                                        .addPhrase("string")
                                        .build()
                                )
                                .transcriptionEngine(
                                    TranscriptionStartRequest.TranscriptionEngineConfig.Google
                                        .TranscriptionEngine
                                        .GOOGLE
                                )
                                .useEnhanced(true)
                                .build()
                        )
                        .transcriptionTracks("both")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TranscriptionStartRequest.builder()
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                    .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.GOOGLE)
                    .transcriptionEngineConfig(
                        TranscriptionStartRequest.TranscriptionEngineConfig.Google.builder()
                            .enableSpeakerDiarization(true)
                            .addHint("string")
                            .interimResults(true)
                            .language(GoogleTranscriptionLanguage.EN)
                            .maxSpeakerCount(4)
                            .minSpeakerCount(4)
                            .model(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Google.Model
                                    .LATEST_LONG
                            )
                            .profanityFilter(true)
                            .addSpeechContext(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Google
                                    .SpeechContext
                                    .builder()
                                    .boost(1.0)
                                    .addPhrase("string")
                                    .build()
                            )
                            .transcriptionEngine(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Google
                                    .TranscriptionEngine
                                    .GOOGLE
                            )
                            .useEnhanced(true)
                            .build()
                    )
                    .transcriptionTracks("both")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionStartTranscriptionParams.builder()
                .callControlId("call_control_id")
                .transcriptionStartRequest(TranscriptionStartRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(TranscriptionStartRequest.builder().build())
    }
}
