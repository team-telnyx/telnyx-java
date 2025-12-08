// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
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
                            TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram.Language.EN
                        )
                        .build()
                )
                .transcriptionTracks("both")
                .build()

        assertThat(transcriptionStartRequest.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(transcriptionStartRequest.commandId())
            .contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(transcriptionStartRequest.transcriptionEngine())
            .contains(TranscriptionStartRequest.TranscriptionEngine.DEEPGRAM)
        assertThat(transcriptionStartRequest.transcriptionEngineConfig())
            .contains(
                TranscriptionStartRequest.TranscriptionEngineConfig.ofDeepgram(
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
                            TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram.Language.EN
                        )
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
                            TranscriptionStartRequest.TranscriptionEngineConfig.Deepgram.Language.EN
                        )
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
