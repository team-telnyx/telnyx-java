package com.telnyx.sdk.websocket.speechtotext

/**
 * Parameters for establishing a speech-to-text WebSocket connection.
 */
data class SttStreamParams(
    /**
     * The transcription engine to use for processing the audio stream.
     * Supported engines: Azure, Deepgram, Google, Telnyx.
     */
    val transcriptionEngine: TranscriptionEngine,

    /**
     * The format of the input audio stream.
     */
    val inputFormat: InputFormat? = null,

    /**
     * The language code for transcription (e.g., 'en-US', 'es-ES').
     */
    val language: String? = null,

    /**
     * Whether to return interim (partial) transcription results.
     */
    val interimResults: Boolean? = null,

    /**
     * The model to use for transcription (engine-specific).
     */
    val model: String? = null
) {
    enum class TranscriptionEngine(val value: String) {
        AZURE("Azure"),
        DEEPGRAM("Deepgram"),
        GOOGLE("Google"),
        TELNYX("Telnyx");

        override fun toString(): String = value
    }

    enum class InputFormat(val value: String) {
        MP3("mp3"),
        WAV("wav"),
        RAW("raw");

        override fun toString(): String = value
    }

    /**
     * Build query parameters for the WebSocket URL.
     */
    fun toQueryParams(): Map<String, String> {
        val params = mutableMapOf<String, String>()
        params["transcription_engine"] = transcriptionEngine.value
        inputFormat?.let { params["input_format"] = it.value }
        language?.let { params["language"] = it }
        interimResults?.let { params["interim_results"] = it.toString() }
        model?.let { params["model"] = it }
        return params
    }

    companion object {
        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {
        private var transcriptionEngine: TranscriptionEngine? = null
        private var inputFormat: InputFormat? = null
        private var language: String? = null
        private var interimResults: Boolean? = null
        private var model: String? = null

        fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) = apply {
            this.transcriptionEngine = transcriptionEngine
        }

        fun inputFormat(inputFormat: InputFormat?) = apply {
            this.inputFormat = inputFormat
        }

        fun language(language: String?) = apply {
            this.language = language
        }

        fun interimResults(interimResults: Boolean?) = apply {
            this.interimResults = interimResults
        }

        fun model(model: String?) = apply {
            this.model = model
        }

        fun build(): SttStreamParams {
            requireNotNull(transcriptionEngine) { "transcriptionEngine is required" }
            return SttStreamParams(
                transcriptionEngine = transcriptionEngine!!,
                inputFormat = inputFormat,
                language = language,
                interimResults = interimResults,
                model = model
            )
        }
    }
}
