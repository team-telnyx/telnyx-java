// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.websocket

import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.speechtotext.SttServerEvent
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SttServerEventTest {

    private val jsonMapper = jsonMapper()

    @Test
    fun `deserializes transcript event`() {
        val json = """
            {
                "type": "transcript",
                "transcript": "Hello world",
                "is_final": true,
                "confidence": 0.95,
                "speech_final": true
            }
        """.trimIndent()

        val event = jsonMapper.readValue(json, SttServerEvent::class.java)

        assertThat(event.isTranscript()).isTrue()
        assertThat(event.isError()).isFalse()

        val transcript = event.asTranscript()
        assertThat(transcript.transcript()).isEqualTo("Hello world")
        assertThat(transcript.isFinal()).isTrue()
        assertThat(transcript.confidence()).hasValue(0.95)
        assertThat(transcript.speechFinal()).hasValue(true)
    }

    @Test
    fun `deserializes interim transcript event`() {
        val json = """
            {
                "transcript": "Hello",
                "is_final": false
            }
        """.trimIndent()

        val event = jsonMapper.readValue(json, SttServerEvent::class.java)

        assertThat(event.isTranscript()).isTrue()
        val transcript = event.asTranscript()
        assertThat(transcript.transcript()).isEqualTo("Hello")
        assertThat(transcript.isFinal()).isFalse()
    }

    @Test
    fun `deserializes error event`() {
        val json = """
            {
                "type": "error",
                "error": "Invalid audio format",
                "code": "INVALID_FORMAT"
            }
        """.trimIndent()

        val event = jsonMapper.readValue(json, SttServerEvent::class.java)

        assertThat(event.isError()).isTrue()
        assertThat(event.isTranscript()).isFalse()

        val error = event.asError()
        assertThat(error.error()).isEqualTo("Invalid audio format")
        assertThat(error.code()).hasValue("INVALID_FORMAT")
    }

    @Test
    fun `serializes transcript event`() {
        val transcript = SttServerEvent.TranscriptFrame.builder()
            .transcript("Hello world")
            .isFinal(true)
            .confidence(0.95)
            .build()

        val event = SttServerEvent.ofTranscript(transcript)
        val json = jsonMapper.writeValueAsString(event)

        assertThat(json).contains("Hello world")
        assertThat(json).contains("\"is_final\":true")
        assertThat(json).contains("\"confidence\":0.95")
    }

    @Test
    fun `visitor pattern works`() {
        val json = """
            {
                "type": "transcript",
                "transcript": "Test",
                "is_final": true
            }
        """.trimIndent()

        val event = jsonMapper.readValue(json, SttServerEvent::class.java)

        val result = event.accept(object : SttServerEvent.Visitor<String> {
            override fun visitTranscript(transcript: SttServerEvent.TranscriptFrame) =
                "transcript: ${transcript.transcript()}"

            override fun visitError(error: SttServerEvent.ErrorFrame) =
                "error: ${error.error()}"
        })

        assertThat(result).isEqualTo("transcript: Test")
    }
}
