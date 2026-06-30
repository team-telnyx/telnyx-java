// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class StreamServerEventTest {

    @Test
    fun ofAudioChunk() {
        val audioChunk =
            StreamServerEvent.AudioChunk.builder()
                .audio("audio")
                .cached(true)
                .isFinal(true)
                .text("text")
                .timeToFirstAudioFrameMs(0L)
                .type(StreamServerEvent.AudioChunk.Type.AUDIO_CHUNK)
                .build()

        val streamServerEvent = StreamServerEvent.ofAudioChunk(audioChunk)

        assertThat(streamServerEvent.audioChunk()).contains(audioChunk)
        assertThat(streamServerEvent.finalFrameEvent()).isEmpty
        assertThat(streamServerEvent.error()).isEmpty
    }

    @Test
    fun ofAudioChunkRoundtrip() {
        val jsonMapper = jsonMapper()
        val streamServerEvent =
            StreamServerEvent.ofAudioChunk(
                StreamServerEvent.AudioChunk.builder()
                    .audio("audio")
                    .cached(true)
                    .isFinal(true)
                    .text("text")
                    .timeToFirstAudioFrameMs(0L)
                    .type(StreamServerEvent.AudioChunk.Type.AUDIO_CHUNK)
                    .build()
            )

        val roundtrippedStreamServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamServerEvent),
                jacksonTypeRef<StreamServerEvent>(),
            )

        assertThat(roundtrippedStreamServerEvent).isEqualTo(streamServerEvent)
    }

    @Test
    fun ofFinalFrameEvent() {
        val finalFrameEvent =
            StreamServerEvent.FinalFrameEvent.builder()
                .audio(null)
                .isFinal(StreamServerEvent.FinalFrameEvent.IsFinal.TRUE)
                .text("text")
                .timeToFirstAudioFrameMs(0L)
                .type(StreamServerEvent.FinalFrameEvent.Type.FINAL)
                .build()

        val streamServerEvent = StreamServerEvent.ofFinalFrameEvent(finalFrameEvent)

        assertThat(streamServerEvent.audioChunk()).isEmpty
        assertThat(streamServerEvent.finalFrameEvent()).contains(finalFrameEvent)
        assertThat(streamServerEvent.error()).isEmpty
    }

    @Test
    fun ofFinalFrameEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val streamServerEvent =
            StreamServerEvent.ofFinalFrameEvent(
                StreamServerEvent.FinalFrameEvent.builder()
                    .audio(null)
                    .isFinal(StreamServerEvent.FinalFrameEvent.IsFinal.TRUE)
                    .text("text")
                    .timeToFirstAudioFrameMs(0L)
                    .type(StreamServerEvent.FinalFrameEvent.Type.FINAL)
                    .build()
            )

        val roundtrippedStreamServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamServerEvent),
                jacksonTypeRef<StreamServerEvent>(),
            )

        assertThat(roundtrippedStreamServerEvent).isEqualTo(streamServerEvent)
    }

    @Test
    fun ofError() {
        val error =
            StreamServerEvent.Error.builder()
                .error("error")
                .type(StreamServerEvent.Error.Type.ERROR)
                .build()

        val streamServerEvent = StreamServerEvent.ofError(error)

        assertThat(streamServerEvent.audioChunk()).isEmpty
        assertThat(streamServerEvent.finalFrameEvent()).isEmpty
        assertThat(streamServerEvent.error()).contains(error)
    }

    @Test
    fun ofErrorRoundtrip() {
        val jsonMapper = jsonMapper()
        val streamServerEvent =
            StreamServerEvent.ofError(
                StreamServerEvent.Error.builder()
                    .error("error")
                    .type(StreamServerEvent.Error.Type.ERROR)
                    .build()
            )

        val roundtrippedStreamServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamServerEvent),
                jacksonTypeRef<StreamServerEvent>(),
            )

        assertThat(roundtrippedStreamServerEvent).isEqualTo(streamServerEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val streamServerEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<StreamServerEvent>())

        val e = assertThrows<TelnyxInvalidDataException> { streamServerEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
