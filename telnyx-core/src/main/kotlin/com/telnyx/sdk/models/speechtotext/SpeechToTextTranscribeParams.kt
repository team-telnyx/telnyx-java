// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.speechtotext

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Transcribe audio streams to text over WebSocket. */
class SpeechToTextTranscribeParams
private constructor(
    private val inputFormat: InputFormat,
    private val transcriptionEngine: TranscriptionEngine,
    private val interimResults: Boolean?,
    private val language: String?,
    private val model: Model?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The format of input audio stream. */
    fun inputFormat(): InputFormat = inputFormat

    /** The transcription engine to use for processing the audio stream. */
    fun transcriptionEngine(): TranscriptionEngine = transcriptionEngine

    /** Whether to receive interim transcription results. */
    fun interimResults(): Optional<Boolean> = Optional.ofNullable(interimResults)

    /** The language spoken in the audio stream. */
    fun language(): Optional<String> = Optional.ofNullable(language)

    /** The specific model to use within the selected transcription engine. */
    fun model(): Optional<Model> = Optional.ofNullable(model)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpeechToTextTranscribeParams].
         *
         * The following fields are required:
         * ```java
         * .inputFormat()
         * .transcriptionEngine()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpeechToTextTranscribeParams]. */
    class Builder internal constructor() {

        private var inputFormat: InputFormat? = null
        private var transcriptionEngine: TranscriptionEngine? = null
        private var interimResults: Boolean? = null
        private var language: String? = null
        private var model: Model? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(speechToTextTranscribeParams: SpeechToTextTranscribeParams) = apply {
            inputFormat = speechToTextTranscribeParams.inputFormat
            transcriptionEngine = speechToTextTranscribeParams.transcriptionEngine
            interimResults = speechToTextTranscribeParams.interimResults
            language = speechToTextTranscribeParams.language
            model = speechToTextTranscribeParams.model
            additionalHeaders = speechToTextTranscribeParams.additionalHeaders.toBuilder()
            additionalQueryParams = speechToTextTranscribeParams.additionalQueryParams.toBuilder()
        }

        /** The format of input audio stream. */
        fun inputFormat(inputFormat: InputFormat) = apply { this.inputFormat = inputFormat }

        /** The transcription engine to use for processing the audio stream. */
        fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) = apply {
            this.transcriptionEngine = transcriptionEngine
        }

        /** Whether to receive interim transcription results. */
        fun interimResults(interimResults: Boolean?) = apply {
            this.interimResults = interimResults
        }

        /**
         * Alias for [Builder.interimResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun interimResults(interimResults: Boolean) = interimResults(interimResults as Boolean?)

        /** Alias for calling [Builder.interimResults] with `interimResults.orElse(null)`. */
        fun interimResults(interimResults: Optional<Boolean>) =
            interimResults(interimResults.getOrNull())

        /** The language spoken in the audio stream. */
        fun language(language: String?) = apply { this.language = language }

        /** Alias for calling [Builder.language] with `language.orElse(null)`. */
        fun language(language: Optional<String>) = language(language.getOrNull())

        /** The specific model to use within the selected transcription engine. */
        fun model(model: Model?) = apply { this.model = model }

        /** Alias for calling [Builder.model] with `model.orElse(null)`. */
        fun model(model: Optional<Model>) = model(model.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SpeechToTextTranscribeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputFormat()
         * .transcriptionEngine()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpeechToTextTranscribeParams =
            SpeechToTextTranscribeParams(
                checkRequired("inputFormat", inputFormat),
                checkRequired("transcriptionEngine", transcriptionEngine),
                interimResults,
                language,
                model,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("input_format", inputFormat.toString())
                put("transcription_engine", transcriptionEngine.toString())
                interimResults?.let { put("interim_results", it.toString()) }
                language?.let { put("language", it) }
                model?.let { put("model", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** The format of input audio stream. */
    class InputFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MP3 = of("mp3")

            @JvmField val WAV = of("wav")

            @JvmStatic fun of(value: String) = InputFormat(JsonField.of(value))
        }

        /** An enum containing [InputFormat]'s known values. */
        enum class Known {
            MP3,
            WAV,
        }

        /**
         * An enum containing [InputFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InputFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MP3,
            WAV,
            /**
             * An enum member indicating that [InputFormat] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                MP3 -> Value.MP3
                WAV -> Value.WAV
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                MP3 -> Known.MP3
                WAV -> Known.WAV
                else -> throw TelnyxInvalidDataException("Unknown InputFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): InputFormat = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InputFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The transcription engine to use for processing the audio stream. */
    class TranscriptionEngine
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AZURE = of("Azure")

            @JvmField val DEEPGRAM = of("Deepgram")

            @JvmField val GOOGLE = of("Google")

            @JvmField val TELNYX = of("Telnyx")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            AZURE,
            DEEPGRAM,
            GOOGLE,
            TELNYX,
        }

        /**
         * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TranscriptionEngine] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AZURE,
            DEEPGRAM,
            GOOGLE,
            TELNYX,
            /**
             * An enum member indicating that [TranscriptionEngine] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AZURE -> Value.AZURE
                DEEPGRAM -> Value.DEEPGRAM
                GOOGLE -> Value.GOOGLE
                TELNYX -> Value.TELNYX
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AZURE -> Known.AZURE
                DEEPGRAM -> Known.DEEPGRAM
                GOOGLE -> Known.GOOGLE
                TELNYX -> Known.TELNYX
                else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): TranscriptionEngine = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TranscriptionEngine && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The specific model to use within the selected transcription engine. */
    class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FAST = of("fast")

            @JvmField val DEEPGRAM_NOVA_2 = of("deepgram/nova-2")

            @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

            @JvmField val LATEST_LONG = of("latest_long")

            @JvmField val LATEST_SHORT = of("latest_short")

            @JvmField val COMMAND_AND_SEARCH = of("command_and_search")

            @JvmField val PHONE_CALL = of("phone_call")

            @JvmField val VIDEO = of("video")

            @JvmField val DEFAULT = of("default")

            @JvmField val MEDICAL_CONVERSATION = of("medical_conversation")

            @JvmField val MEDICAL_DICTATION = of("medical_dictation")

            @JvmField val OPENAI_WHISPER_TINY = of("openai/whisper-tiny")

            @JvmField val OPENAI_WHISPER_LARGE_V3_TURBO = of("openai/whisper-large-v3-turbo")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            FAST,
            DEEPGRAM_NOVA_2,
            DEEPGRAM_NOVA_3,
            LATEST_LONG,
            LATEST_SHORT,
            COMMAND_AND_SEARCH,
            PHONE_CALL,
            VIDEO,
            DEFAULT,
            MEDICAL_CONVERSATION,
            MEDICAL_DICTATION,
            OPENAI_WHISPER_TINY,
            OPENAI_WHISPER_LARGE_V3_TURBO,
        }

        /**
         * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Model] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAST,
            DEEPGRAM_NOVA_2,
            DEEPGRAM_NOVA_3,
            LATEST_LONG,
            LATEST_SHORT,
            COMMAND_AND_SEARCH,
            PHONE_CALL,
            VIDEO,
            DEFAULT,
            MEDICAL_CONVERSATION,
            MEDICAL_DICTATION,
            OPENAI_WHISPER_TINY,
            OPENAI_WHISPER_LARGE_V3_TURBO,
            /** An enum member indicating that [Model] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FAST -> Value.FAST
                DEEPGRAM_NOVA_2 -> Value.DEEPGRAM_NOVA_2
                DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
                LATEST_LONG -> Value.LATEST_LONG
                LATEST_SHORT -> Value.LATEST_SHORT
                COMMAND_AND_SEARCH -> Value.COMMAND_AND_SEARCH
                PHONE_CALL -> Value.PHONE_CALL
                VIDEO -> Value.VIDEO
                DEFAULT -> Value.DEFAULT
                MEDICAL_CONVERSATION -> Value.MEDICAL_CONVERSATION
                MEDICAL_DICTATION -> Value.MEDICAL_DICTATION
                OPENAI_WHISPER_TINY -> Value.OPENAI_WHISPER_TINY
                OPENAI_WHISPER_LARGE_V3_TURBO -> Value.OPENAI_WHISPER_LARGE_V3_TURBO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FAST -> Known.FAST
                DEEPGRAM_NOVA_2 -> Known.DEEPGRAM_NOVA_2
                DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                LATEST_LONG -> Known.LATEST_LONG
                LATEST_SHORT -> Known.LATEST_SHORT
                COMMAND_AND_SEARCH -> Known.COMMAND_AND_SEARCH
                PHONE_CALL -> Known.PHONE_CALL
                VIDEO -> Known.VIDEO
                DEFAULT -> Known.DEFAULT
                MEDICAL_CONVERSATION -> Known.MEDICAL_CONVERSATION
                MEDICAL_DICTATION -> Known.MEDICAL_DICTATION
                OPENAI_WHISPER_TINY -> Known.OPENAI_WHISPER_TINY
                OPENAI_WHISPER_LARGE_V3_TURBO -> Known.OPENAI_WHISPER_LARGE_V3_TURBO
                else -> throw TelnyxInvalidDataException("Unknown Model: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Model = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Model && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpeechToTextTranscribeParams &&
            inputFormat == other.inputFormat &&
            transcriptionEngine == other.transcriptionEngine &&
            interimResults == other.interimResults &&
            language == other.language &&
            model == other.model &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            inputFormat,
            transcriptionEngine,
            interimResults,
            language,
            model,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SpeechToTextTranscribeParams{inputFormat=$inputFormat, transcriptionEngine=$transcriptionEngine, interimResults=$interimResults, language=$language, model=$model, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
