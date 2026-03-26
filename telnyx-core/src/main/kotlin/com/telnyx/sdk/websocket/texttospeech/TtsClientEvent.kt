package com.telnyx.sdk.websocket.texttospeech

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Client-to-server frame containing text to synthesize.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class TtsClientEvent(
    /**
     * Text to convert to speech. Send " " (single space) as an initial handshake
     * with optional voice_settings. Subsequent messages contain the actual text to synthesize.
     */
    @JsonProperty("text")
    val text: String,

    /**
     * When true, stops the current synthesis worker and starts a new one.
     * Used to interrupt speech mid-stream and begin synthesizing new text.
     */
    @JsonProperty("force")
    val force: Boolean? = null,

    /**
     * Provider-specific voice settings sent with the initial handshake.
     * Contents vary by provider — e.g. {"speed": 1.2} for Minimax, {"voice_speed": 1.5} for Telnyx.
     */
    @JsonProperty("voice_settings")
    val voiceSettings: Map<String, Any>? = null
) {
    companion object {
        /**
         * Create a handshake event with optional voice settings.
         */
        @JvmStatic
        fun handshake(voiceSettings: Map<String, Any>? = null): TtsClientEvent =
            TtsClientEvent(text = " ", voiceSettings = voiceSettings)

        /**
         * Create a text synthesis event.
         */
        @JvmStatic
        fun text(text: String, force: Boolean? = null): TtsClientEvent =
            TtsClientEvent(text = text, force = force)

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {
        private var text: String = ""
        private var force: Boolean? = null
        private var voiceSettings: Map<String, Any>? = null

        fun text(text: String) = apply { this.text = text }
        fun force(force: Boolean?) = apply { this.force = force }
        fun voiceSettings(voiceSettings: Map<String, Any>?) = apply { this.voiceSettings = voiceSettings }

        fun build(): TtsClientEvent = TtsClientEvent(
            text = text,
            force = force,
            voiceSettings = voiceSettings
        )
    }
}
