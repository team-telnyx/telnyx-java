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
    fun ofAudioChunkFrame() {
        val audioChunkFrame =
            StreamServerEvent.AudioChunkFrame.builder()
                .audio("audio")
                .cached(true)
                .isFinal(true)
                .text("text")
                .timeToFirstAudioFrameMs(0L)
                .build()

        val streamServerEvent = StreamServerEvent.ofAudioChunkFrame(audioChunkFrame)

        assertThat(streamServerEvent.audioChunkFrame()).contains(audioChunkFrame)
        assertThat(streamServerEvent.finalFrame()).isEmpty
        assertThat(streamServerEvent.errorFrame()).isEmpty
    }

    @Test
    fun ofAudioChunkFrameRoundtrip() {
        val jsonMapper = jsonMapper()
        val streamServerEvent =
            StreamServerEvent.ofAudioChunkFrame(
                StreamServerEvent.AudioChunkFrame.builder()
                    .audio("audio")
                    .cached(true)
                    .isFinal(true)
                    .text("text")
                    .timeToFirstAudioFrameMs(0L)
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
    fun ofFinalFrame() {
        val finalFrame =
            StreamServerEvent.FinalFrame.builder()
                .audio(null)
                .isFinal(StreamServerEvent.FinalFrame.IsFinal.TRUE)
                .text("text")
                .timeToFirstAudioFrameMs(0L)
                .build()

        val streamServerEvent = StreamServerEvent.ofFinalFrame(finalFrame)

        assertThat(streamServerEvent.audioChunkFrame()).isEmpty
        assertThat(streamServerEvent.finalFrame()).contains(finalFrame)
        assertThat(streamServerEvent.errorFrame()).isEmpty
    }

    @Test
    fun ofFinalFrameRoundtrip() {
        val jsonMapper = jsonMapper()
        val streamServerEvent =
            StreamServerEvent.ofFinalFrame(
                StreamServerEvent.FinalFrame.builder()
                    .audio(null)
                    .isFinal(StreamServerEvent.FinalFrame.IsFinal.TRUE)
                    .text("text")
                    .timeToFirstAudioFrameMs(0L)
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
    fun ofErrorFrame() {
        val errorFrame = StreamServerEvent.ErrorFrame.builder().error("error").build()

        val streamServerEvent = StreamServerEvent.ofErrorFrame(errorFrame)

        assertThat(streamServerEvent.audioChunkFrame()).isEmpty
        assertThat(streamServerEvent.finalFrame()).isEmpty
        assertThat(streamServerEvent.errorFrame()).contains(errorFrame)
    }

    @Test
    fun ofErrorFrameRoundtrip() {
        val jsonMapper = jsonMapper()
        val streamServerEvent =
            StreamServerEvent.ofErrorFrame(
                StreamServerEvent.ErrorFrame.builder().error("error").build()
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
