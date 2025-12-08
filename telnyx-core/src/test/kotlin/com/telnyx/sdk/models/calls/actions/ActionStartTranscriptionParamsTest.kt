// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.core.JsonValue
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
                    .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.DEEPGRAM)
                    .transcriptionEngineConfig(
                        TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram.builder()
                            .transcriptionModel(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                    .TranscriptionModel
                                    .DEEPGRAM_NOVA_2
                            )
                            .keywordsBoosting(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                    .KeywordsBoosting
                                    .builder()
                                    .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                                    .putAdditionalProperty("systrom", JsonValue.from(2))
                                    .putAdditionalProperty("krieger", JsonValue.from(1))
                                    .build()
                            )
                            .language(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                    .Language
                                    .EN
                            )
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
                        .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.DEEPGRAM)
                        .transcriptionEngineConfig(
                            TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram.builder()
                                .transcriptionModel(
                                    TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                        .TranscriptionModel
                                        .DEEPGRAM_NOVA_2
                                )
                                .keywordsBoosting(
                                    TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                        .KeywordsBoosting
                                        .builder()
                                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                                        .putAdditionalProperty("systrom", JsonValue.from(2))
                                        .putAdditionalProperty("krieger", JsonValue.from(1))
                                        .build()
                                )
                                .language(
                                    TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                        .Language
                                        .EN
                                )
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
                    .transcriptionEngine(TranscriptionStartRequest.TranscriptionEngine.DEEPGRAM)
                    .transcriptionEngineConfig(
                        TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram.builder()
                            .transcriptionModel(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                    .TranscriptionModel
                                    .DEEPGRAM_NOVA_2
                            )
                            .keywordsBoosting(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                    .KeywordsBoosting
                                    .builder()
                                    .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                                    .putAdditionalProperty("systrom", JsonValue.from(2))
                                    .putAdditionalProperty("krieger", JsonValue.from(1))
                                    .build()
                            )
                            .language(
                                TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram
                                    .Language
                                    .EN
                            )
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
