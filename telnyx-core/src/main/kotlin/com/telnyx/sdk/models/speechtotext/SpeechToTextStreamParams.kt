// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.models.speechtotext

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.JsonField
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Parameters for creating a Speech-to-Text WebSocket streaming connection. */
class SpeechToTextStreamParams
private constructor(
    private val transcriptionEngine: TranscriptionEngine,
    private val inputFormat: InputFormat?,
    private val language: String?,
    private val interimResults: Boolean?,
    private val model: String?,
    private val endpointing: Int?,
    private val keyterm: String?,
    private val keywords: String?,
    private val redact: String?,
) {

    /** The transcription engine to use for processing the audio stream. */
    fun transcriptionEngine(): TranscriptionEngine = transcriptionEngine

    /** The format of the input audio stream. */
    fun inputFormat(): Optional<InputFormat> = Optional.ofNullable(inputFormat)

    /** The language code for transcription (e.g., 'en-US', 'es-ES'). */
    fun language(): Optional<String> = Optional.ofNullable(language)

    /** Whether to return interim (partial) transcription results. */
    fun interimResults(): Optional<Boolean> = Optional.ofNullable(interimResults)

    /** The model to use for transcription (engine-specific). */
    fun model(): Optional<String> = Optional.ofNullable(model)

    /** Silence duration (in milliseconds) that triggers end-of-speech detection. */
    fun endpointing(): Optional<Int> = Optional.ofNullable(endpointing)

    /** A key term to boost in the transcription. */
    fun keyterm(): Optional<String> = Optional.ofNullable(keyterm)

    /** Comma-separated list of keywords to boost in the transcription. */
    fun keywords(): Optional<String> = Optional.ofNullable(keywords)

    /** Enable redaction of sensitive information from transcription results. */
    fun redact(): Optional<String> = Optional.ofNullable(redact)

    /** Returns query parameters for the WebSocket URL. */
    fun toQueryParams(): Map<String, String> {
        val params = mutableMapOf<String, String>()
        params["transcription_engine"] = transcriptionEngine.asString()
        inputFormat?.let { params["input_format"] = it.asString() }
        language?.let { params["language"] = it }
        interimResults?.let { params["interim_results"] = it.toString() }
        model?.let { params["model"] = it }
        endpointing?.let { params["endpointing"] = it.toString() }
        keyterm?.let { params["keyterm"] = it }
        keywords?.let { params["keywords"] = it }
        redact?.let { params["redact"] = it }
        return params
    }

    fun toBuilder() = Builder().from(this)

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var transcriptionEngine: TranscriptionEngine? = null
        private var inputFormat: InputFormat? = null
        private var language: String? = null
        private var interimResults: Boolean? = null
        private var model: String? = null
        private var endpointing: Int? = null
        private var keyterm: String? = null
        private var keywords: String? = null
        private var redact: String? = null

        @JvmSynthetic
        internal fun from(params: SpeechToTextStreamParams) = apply {
            transcriptionEngine = params.transcriptionEngine
            inputFormat = params.inputFormat
            language = params.language
            interimResults = params.interimResults
            model = params.model
            endpointing = params.endpointing
            keyterm = params.keyterm
            keywords = params.keywords
            redact = params.redact
        }

        fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) = apply {
            this.transcriptionEngine = transcriptionEngine
        }

        fun inputFormat(inputFormat: InputFormat?) = apply { this.inputFormat = inputFormat }

        fun inputFormat(inputFormat: Optional<InputFormat>) = inputFormat(inputFormat.getOrNull())

        fun language(language: String?) = apply { this.language = language }

        fun language(language: Optional<String>) = language(language.getOrNull())

        fun interimResults(interimResults: Boolean?) = apply {
            this.interimResults = interimResults
        }

        fun interimResults(interimResults: Optional<Boolean>) =
            interimResults(interimResults.getOrNull())

        fun model(model: String?) = apply { this.model = model }

        fun model(model: Optional<String>) = model(model.getOrNull())

        fun endpointing(endpointing: Int?) = apply { this.endpointing = endpointing }

        fun endpointing(endpointing: Optional<Int>) = endpointing(endpointing.getOrNull())

        fun keyterm(keyterm: String?) = apply { this.keyterm = keyterm }

        fun keyterm(keyterm: Optional<String>) = keyterm(keyterm.getOrNull())

        fun keywords(keywords: String?) = apply { this.keywords = keywords }

        fun keywords(keywords: Optional<String>) = keywords(keywords.getOrNull())

        fun redact(redact: String?) = apply { this.redact = redact }

        fun redact(redact: Optional<String>) = redact(redact.getOrNull())

        fun build(): SpeechToTextStreamParams =
            SpeechToTextStreamParams(
                transcriptionEngine
                    ?: throw IllegalStateException("transcriptionEngine is required"),
                inputFormat,
                language,
                interimResults,
                model,
                endpointing,
                keyterm,
                keywords,
                redact,
            )
    }

    /** The transcription engine to use. */
    class TranscriptionEngine
    @JsonCreator
    private constructor(private val value: JsonField<String>) {

        /** Returns this class instance's raw value. */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        /** Returns the string representation of the value. */
        fun asString(): String = value.asString().orElse("")

        companion object {
            @JvmField val AZURE = of("Azure")
            @JvmField val DEEPGRAM = of("Deepgram")
            @JvmField val GOOGLE = of("Google")
            @JvmField val TELNYX = of("Telnyx")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TranscriptionEngine && value == other.value
        }

        override fun hashCode(): Int = value.hashCode()

        override fun toString(): String = value.asString().orElse("")
    }

    /** The format of the input audio stream. */
    class InputFormat @JsonCreator private constructor(private val value: JsonField<String>) {

        /** Returns this class instance's raw value. */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        /** Returns the string representation of the value. */
        fun asString(): String = value.asString().orElse("")

        companion object {
            @JvmField val MP3 = of("mp3")
            @JvmField val WAV = of("wav")
            @JvmField val RAW = of("raw")

            @JvmStatic fun of(value: String) = InputFormat(JsonField.of(value))
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InputFormat && value == other.value
        }

        override fun hashCode(): Int = value.hashCode()

        override fun toString(): String = value.asString().orElse("")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpeechToTextStreamParams &&
            transcriptionEngine == other.transcriptionEngine &&
            inputFormat == other.inputFormat &&
            language == other.language &&
            interimResults == other.interimResults &&
            model == other.model &&
            endpointing == other.endpointing &&
            keyterm == other.keyterm &&
            keywords == other.keywords &&
            redact == other.redact
    }

    override fun hashCode(): Int =
        Objects.hash(
            transcriptionEngine,
            inputFormat,
            language,
            interimResults,
            model,
            endpointing,
            keyterm,
            keywords,
            redact,
        )

    override fun toString(): String =
        "SpeechToTextStreamParams{transcriptionEngine=$transcriptionEngine, inputFormat=$inputFormat, language=$language, interimResults=$interimResults, model=$model, endpointing=$endpointing, keyterm=$keyterm, keywords=$keywords, redact=$redact}"
}
