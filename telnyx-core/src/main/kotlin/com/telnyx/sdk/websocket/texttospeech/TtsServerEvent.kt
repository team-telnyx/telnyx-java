package com.telnyx.sdk.websocket.texttospeech

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Union of all server-to-client WebSocket events for TTS streaming.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = TtsServerEvent.Unknown::class
)
@JsonSubTypes(
    JsonSubTypes.Type(value = TtsServerEvent.AudioChunkFrame::class, name = "audio_chunk"),
    JsonSubTypes.Type(value = TtsServerEvent.FinalFrame::class, name = "final"),
    JsonSubTypes.Type(value = TtsServerEvent.ErrorFrame::class, name = "error")
)
sealed class TtsServerEvent {

    /**
     * Server-to-client frame containing a base64-encoded audio chunk.
     */
    data class AudioChunkFrame(
        /**
         * Base64-encoded audio data. May be null for providers that use
         * drop_concatenated_audio mode (Telnyx Natural/NaturalHD, Rime, Minimax, MurfAI, Resemble)
         * — in that case only streamed chunks carry audio.
         */
        @JsonProperty("audio")
        val audio: String? = null,

        /**
         * Whether this audio was served from cache.
         */
        @JsonProperty("cached")
        val cached: Boolean? = null,

        /**
         * Always false for audio chunk frames.
         */
        @JsonProperty("isFinal")
        val isFinal: Boolean? = null,

        /**
         * The text segment that this audio chunk corresponds to.
         */
        @JsonProperty("text")
        val text: String? = null,

        /**
         * Milliseconds from the start-of-speech request to the first audio frame.
         * Only present on the first audio chunk of a synthesis request.
         */
        @JsonProperty("timeToFirstAudioFrameMs")
        val timeToFirstAudioFrameMs: Long? = null
    ) : TtsServerEvent() {
        override fun type(): String = "audio_chunk"
    }

    /**
     * Server-to-client frame indicating synthesis is complete for the current text.
     */
    data class FinalFrame(
        /**
         * Always null for the final frame.
         */
        @JsonProperty("audio")
        val audio: String? = null,

        /**
         * Always true.
         */
        @JsonProperty("isFinal")
        val isFinal: Boolean? = true,

        /**
         * Empty string.
         */
        @JsonProperty("text")
        val text: String? = null,

        /**
         * Present if this was the first response frame.
         */
        @JsonProperty("timeToFirstAudioFrameMs")
        val timeToFirstAudioFrameMs: Long? = null
    ) : TtsServerEvent() {
        override fun type(): String = "final"
    }

    /**
     * Server-to-client frame indicating an error during synthesis.
     * The connection is closed shortly after.
     */
    data class ErrorFrame(
        /**
         * Error message describing what went wrong.
         */
        @JsonProperty("error")
        val error: String? = null
    ) : TtsServerEvent() {
        override fun type(): String = "error"
    }

    /**
     * Unknown event type - used for forward compatibility.
     */
    data class Unknown(
        @JsonProperty("type")
        private val eventType: String? = null,
        val rawData: Map<String, Any?>? = null
    ) : TtsServerEvent() {
        override fun type(): String = eventType ?: "unknown"
    }

    /**
     * Returns the event type identifier.
     */
    abstract fun type(): String
}
