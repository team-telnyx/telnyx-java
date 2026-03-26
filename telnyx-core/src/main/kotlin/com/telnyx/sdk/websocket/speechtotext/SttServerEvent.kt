package com.telnyx.sdk.websocket.speechtotext

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Union of all server-to-client WebSocket events for STT streaming.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = SttServerEvent.Unknown::class
)
@JsonSubTypes(
    JsonSubTypes.Type(value = SttServerEvent.TranscriptFrame::class, name = "transcript"),
    JsonSubTypes.Type(value = SttServerEvent.ErrorFrame::class, name = "error")
)
sealed class SttServerEvent {

    /**
     * Server-to-client frame containing a transcription result.
     */
    data class TranscriptFrame(
        /**
         * The transcribed text from the audio.
         */
        @JsonProperty("transcript")
        val transcript: String,

        /**
         * Whether this is a final transcription result.
         * When false, this is an interim result that may be refined.
         */
        @JsonProperty("is_final")
        val isFinal: Boolean? = null,

        /**
         * Confidence score of the transcription, ranging from 0 to 1.
         */
        @JsonProperty("confidence")
        val confidence: Double? = null
    ) : SttServerEvent() {
        override fun type(): String = "transcript"
    }

    /**
     * Server-to-client frame indicating an error during transcription.
     */
    data class ErrorFrame(
        /**
         * Error message describing what went wrong.
         */
        @JsonProperty("error")
        val error: String
    ) : SttServerEvent() {
        override fun type(): String = "error"
    }

    /**
     * Unknown event type - used for forward compatibility.
     */
    data class Unknown(
        @JsonProperty("type")
        private val eventType: String? = null,
        val rawData: Map<String, Any?>? = null
    ) : SttServerEvent() {
        override fun type(): String = eventType ?: "unknown"
    }

    /**
     * Returns the event type identifier.
     */
    abstract fun type(): String
}
