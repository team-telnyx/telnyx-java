package com.telnyx.sdk.websocket.texttospeech

/**
 * Parameters for establishing a text-to-speech WebSocket connection.
 */
data class TtsStreamParams(
    /**
     * Voice identifier in format provider.model_id.voice_id or provider.voice_id.
     */
    val voice: String? = null,

    /**
     * TTS provider. Defaults to telnyx if not specified.
     */
    val provider: Provider? = null,

    /**
     * Model identifier for the chosen provider.
     */
    val modelId: String? = null,

    /**
     * Voice identifier for the chosen provider.
     */
    val voiceId: String? = null,

    /**
     * Audio output format override. Supported for Telnyx Natural/NaturalHD models only.
     */
    val audioFormat: AudioFormat? = null,

    /**
     * When true, bypass the audio cache and generate fresh audio.
     */
    val disableCache: Boolean? = null,

    /**
     * Client-provided socket identifier for tracking.
     */
    val socketId: String? = null
) {
    enum class Provider(val value: String) {
        AWS("aws"),
        TELNYX("telnyx"),
        AZURE("azure"),
        ELEVENLABS("elevenlabs"),
        MINIMAX("minimax"),
        MURFAI("murfai"),
        RIME("rime"),
        RESEMBLE("resemble"),
        INWORLD("inworld");

        override fun toString(): String = value
    }

    enum class AudioFormat(val value: String) {
        PCM("pcm"),
        WAV("wav");

        override fun toString(): String = value
    }

    /**
     * Build query parameters for the WebSocket URL.
     */
    fun toQueryParams(): Map<String, String> {
        val params = mutableMapOf<String, String>()
        voice?.let { params["voice"] = it }
        provider?.let { params["provider"] = it.value }
        modelId?.let { params["model_id"] = it }
        voiceId?.let { params["voice_id"] = it }
        audioFormat?.let { params["audio_format"] = it.value }
        disableCache?.let { params["disable_cache"] = it.toString() }
        socketId?.let { params["socket_id"] = it }
        return params
    }

    companion object {
        @JvmStatic
        fun builder() = Builder()

        @JvmStatic
        fun none() = TtsStreamParams()
    }

    class Builder {
        private var voice: String? = null
        private var provider: Provider? = null
        private var modelId: String? = null
        private var voiceId: String? = null
        private var audioFormat: AudioFormat? = null
        private var disableCache: Boolean? = null
        private var socketId: String? = null

        fun voice(voice: String?) = apply { this.voice = voice }
        fun provider(provider: Provider?) = apply { this.provider = provider }
        fun modelId(modelId: String?) = apply { this.modelId = modelId }
        fun voiceId(voiceId: String?) = apply { this.voiceId = voiceId }
        fun audioFormat(audioFormat: AudioFormat?) = apply { this.audioFormat = audioFormat }
        fun disableCache(disableCache: Boolean?) = apply { this.disableCache = disableCache }
        fun socketId(socketId: String?) = apply { this.socketId = socketId }

        fun build(): TtsStreamParams = TtsStreamParams(
            voice = voice,
            provider = provider,
            modelId = modelId,
            voiceId = voiceId,
            audioFormat = audioFormat,
            disableCache = disableCache,
            socketId = socketId
        )
    }
}
