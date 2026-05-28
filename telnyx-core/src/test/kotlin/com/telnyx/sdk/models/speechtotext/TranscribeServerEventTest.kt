// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.speechtotext

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TranscribeServerEventTest {

    @Test
    fun ofTranscript() {
        val transcript =
            TranscribeServerEvent.Transcript.builder()
                .transcript("transcript")
                .confidence(0.0)
                .isFinal(true)
                .build()

        val transcribeServerEvent = TranscribeServerEvent.ofTranscript(transcript)

        assertThat(transcribeServerEvent.transcript()).contains(transcript)
        assertThat(transcribeServerEvent.error()).isEmpty
    }

    @Test
    fun ofTranscriptRoundtrip() {
        val jsonMapper = jsonMapper()
        val transcribeServerEvent =
            TranscribeServerEvent.ofTranscript(
                TranscribeServerEvent.Transcript.builder()
                    .transcript("transcript")
                    .confidence(0.0)
                    .isFinal(true)
                    .build()
            )

        val roundtrippedTranscribeServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcribeServerEvent),
                jacksonTypeRef<TranscribeServerEvent>(),
            )

        assertThat(roundtrippedTranscribeServerEvent).isEqualTo(transcribeServerEvent)
    }

    @Test
    fun ofError() {
        val error = TranscribeServerEvent.Error.builder().error("error").build()

        val transcribeServerEvent = TranscribeServerEvent.ofError(error)

        assertThat(transcribeServerEvent.transcript()).isEmpty
        assertThat(transcribeServerEvent.error()).contains(error)
    }

    @Test
    fun ofErrorRoundtrip() {
        val jsonMapper = jsonMapper()
        val transcribeServerEvent =
            TranscribeServerEvent.ofError(
                TranscribeServerEvent.Error.builder().error("error").build()
            )

        val roundtrippedTranscribeServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcribeServerEvent),
                jacksonTypeRef<TranscribeServerEvent>(),
            )

        assertThat(roundtrippedTranscribeServerEvent).isEqualTo(transcribeServerEvent)
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
        val transcribeServerEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TranscribeServerEvent>())

        val e = assertThrows<TelnyxInvalidDataException> { transcribeServerEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
