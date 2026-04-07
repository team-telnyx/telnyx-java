// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.audio

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response fields vary by model. `distil-whisper/distil-large-v2` returns `text`, `duration`, and
 * `segments` in `verbose_json` mode. `openai/whisper-large-v3-turbo` returns `text` only.
 * `deepgram/nova-3` returns `text` and, depending on `model_config`, may include `words` with
 * per-word timestamps and speaker labels.
 */
class AudioTranscribeResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val text: JsonField<String>,
    private val duration: JsonField<Double>,
    private val segments: JsonField<List<Segment>>,
    private val words: JsonField<List<Word>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("segments")
        @ExcludeMissing
        segments: JsonField<List<Segment>> = JsonMissing.of(),
        @JsonProperty("words") @ExcludeMissing words: JsonField<List<Word>> = JsonMissing.of(),
    ) : this(text, duration, segments, words, mutableMapOf())

    /**
     * The transcribed text for the audio file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * The duration of the audio file in seconds. Returned by `distil-whisper/distil-large-v2` and
     * `deepgram/nova-3` when `response_format` is `verbose_json`. Not returned by
     * `openai/whisper-large-v3-turbo`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<Double> = duration.getOptional("duration")

    /**
     * Segments of the transcribed text and their corresponding details. Returned by
     * `distil-whisper/distil-large-v2` when `response_format` is `verbose_json`. Not returned by
     * `openai/whisper-large-v3-turbo`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segments(): Optional<List<Segment>> = segments.getOptional("segments")

    /**
     * Word-level timestamps and optional speaker labels. Only returned by `deepgram/nova-3` when
     * word-level output is enabled via `model_config`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun words(): Optional<List<Word>> = words.getOptional("words")

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

    /**
     * Returns the raw JSON value of [segments].
     *
     * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segments") @ExcludeMissing fun _segments(): JsonField<List<Segment>> = segments

    /**
     * Returns the raw JSON value of [words].
     *
     * Unlike [words], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("words") @ExcludeMissing fun _words(): JsonField<List<Word>> = words

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AudioTranscribeResponse].
         *
         * The following fields are required:
         * ```java
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AudioTranscribeResponse]. */
    class Builder internal constructor() {

        private var text: JsonField<String>? = null
        private var duration: JsonField<Double> = JsonMissing.of()
        private var segments: JsonField<MutableList<Segment>>? = null
        private var words: JsonField<MutableList<Word>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(audioTranscribeResponse: AudioTranscribeResponse) = apply {
            text = audioTranscribeResponse.text
            duration = audioTranscribeResponse.duration
            segments = audioTranscribeResponse.segments.map { it.toMutableList() }
            words = audioTranscribeResponse.words.map { it.toMutableList() }
            additionalProperties = audioTranscribeResponse.additionalProperties.toMutableMap()
        }

        /** The transcribed text for the audio file. */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /**
         * The duration of the audio file in seconds. Returned by `distil-whisper/distil-large-v2`
         * and `deepgram/nova-3` when `response_format` is `verbose_json`. Not returned by
         * `openai/whisper-large-v3-turbo`.
         */
        fun duration(duration: Double) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

        /**
         * Segments of the transcribed text and their corresponding details. Returned by
         * `distil-whisper/distil-large-v2` when `response_format` is `verbose_json`. Not returned
         * by `openai/whisper-large-v3-turbo`.
         */
        fun segments(segments: List<Segment>) = segments(JsonField.of(segments))

        /**
         * Sets [Builder.segments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segments] with a well-typed `List<Segment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segments(segments: JsonField<List<Segment>>) = apply {
            this.segments = segments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Segment] to [segments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSegment(segment: Segment) = apply {
            segments =
                (segments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("segments", it).add(segment)
                }
        }

        /**
         * Word-level timestamps and optional speaker labels. Only returned by `deepgram/nova-3`
         * when word-level output is enabled via `model_config`.
         */
        fun words(words: List<Word>) = words(JsonField.of(words))

        /**
         * Sets [Builder.words] to an arbitrary JSON value.
         *
         * You should usually call [Builder.words] with a well-typed `List<Word>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun words(words: JsonField<List<Word>>) = apply {
            this.words = words.map { it.toMutableList() }
        }

        /**
         * Adds a single [Word] to [words].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWord(word: Word) = apply {
            words =
                (words ?: JsonField.of(mutableListOf())).also { checkKnown("words", it).add(word) }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AudioTranscribeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AudioTranscribeResponse =
            AudioTranscribeResponse(
                checkRequired("text", text),
                duration,
                (segments ?: JsonMissing.of()).map { it.toImmutable() },
                (words ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AudioTranscribeResponse = apply {
        if (validated) {
            return@apply
        }

        text()
        duration()
        segments().ifPresent { it.forEach { it.validate() } }
        words().ifPresent { it.forEach { it.validate() } }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (text.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (segments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (words.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Segment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Double>,
        private val end: JsonField<Double>,
        private val start: JsonField<Double>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("end") @ExcludeMissing end: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start") @ExcludeMissing start: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(id, end, start, text, mutableMapOf())

        /**
         * Unique identifier of the segment.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): Double = id.getRequired("id")

        /**
         * End time of the segment in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun end(): Double = end.getRequired("end")

        /**
         * Start time of the segment in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun start(): Double = start.getRequired("start")

        /**
         * Text content of the segment.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Double> = id

        /**
         * Returns the raw JSON value of [end].
         *
         * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Double> = end

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Segment].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .end()
             * .start()
             * .text()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Segment]. */
        class Builder internal constructor() {

            private var id: JsonField<Double>? = null
            private var end: JsonField<Double>? = null
            private var start: JsonField<Double>? = null
            private var text: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(segment: Segment) = apply {
                id = segment.id
                end = segment.end
                start = segment.start
                text = segment.text
                additionalProperties = segment.additionalProperties.toMutableMap()
            }

            /** Unique identifier of the segment. */
            fun id(id: Double) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Double>) = apply { this.id = id }

            /** End time of the segment in seconds. */
            fun end(end: Double) = end(JsonField.of(end))

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun end(end: JsonField<Double>) = apply { this.end = end }

            /** Start time of the segment in seconds. */
            fun start(start: Double) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<Double>) = apply { this.start = start }

            /** Text content of the segment. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Segment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .end()
             * .start()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Segment =
                Segment(
                    checkRequired("id", id),
                    checkRequired("end", end),
                    checkRequired("start", start),
                    checkRequired("text", text),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Segment = apply {
            if (validated) {
                return@apply
            }

            id()
            end()
            start()
            text()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (end.asKnown().isPresent) 1 else 0) +
                (if (start.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Segment &&
                id == other.id &&
                end == other.end &&
                start == other.start &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, end, start, text, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Segment{id=$id, end=$end, start=$start, text=$text, additionalProperties=$additionalProperties}"
    }

    /**
     * Word-level timing detail. Only present when using `deepgram/nova-3` with `model_config`
     * options that enable word timestamps.
     */
    class Word
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val end: JsonField<Double>,
        private val start: JsonField<Double>,
        private val word: JsonField<String>,
        private val confidence: JsonField<Double>,
        private val speaker: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end") @ExcludeMissing end: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start") @ExcludeMissing start: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("word") @ExcludeMissing word: JsonField<String> = JsonMissing.of(),
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("speaker") @ExcludeMissing speaker: JsonField<Long> = JsonMissing.of(),
        ) : this(end, start, word, confidence, speaker, mutableMapOf())

        /**
         * End time of the word in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun end(): Double = end.getRequired("end")

        /**
         * Start time of the word in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun start(): Double = start.getRequired("start")

        /**
         * The transcribed word.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun word(): String = word.getRequired("word")

        /**
         * Confidence score for the word (0.0 to 1.0).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun confidence(): Optional<Double> = confidence.getOptional("confidence")

        /**
         * Speaker index. Only present when diarization is enabled via `model_config`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speaker(): Optional<Long> = speaker.getOptional("speaker")

        /**
         * Returns the raw JSON value of [end].
         *
         * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Double> = end

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

        /**
         * Returns the raw JSON value of [word].
         *
         * Unlike [word], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("word") @ExcludeMissing fun _word(): JsonField<String> = word

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

        /**
         * Returns the raw JSON value of [speaker].
         *
         * Unlike [speaker], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("speaker") @ExcludeMissing fun _speaker(): JsonField<Long> = speaker

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Word].
             *
             * The following fields are required:
             * ```java
             * .end()
             * .start()
             * .word()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Word]. */
        class Builder internal constructor() {

            private var end: JsonField<Double>? = null
            private var start: JsonField<Double>? = null
            private var word: JsonField<String>? = null
            private var confidence: JsonField<Double> = JsonMissing.of()
            private var speaker: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(word: Word) = apply {
                end = word.end
                start = word.start
                this.word = word.word
                confidence = word.confidence
                speaker = word.speaker
                additionalProperties = word.additionalProperties.toMutableMap()
            }

            /** End time of the word in seconds. */
            fun end(end: Double) = end(JsonField.of(end))

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun end(end: JsonField<Double>) = apply { this.end = end }

            /** Start time of the word in seconds. */
            fun start(start: Double) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<Double>) = apply { this.start = start }

            /** The transcribed word. */
            fun word(word: String) = word(JsonField.of(word))

            /**
             * Sets [Builder.word] to an arbitrary JSON value.
             *
             * You should usually call [Builder.word] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun word(word: JsonField<String>) = apply { this.word = word }

            /** Confidence score for the word (0.0 to 1.0). */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            /** Speaker index. Only present when diarization is enabled via `model_config`. */
            fun speaker(speaker: Long) = speaker(JsonField.of(speaker))

            /**
             * Sets [Builder.speaker] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speaker] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun speaker(speaker: JsonField<Long>) = apply { this.speaker = speaker }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Word].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .end()
             * .start()
             * .word()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Word =
                Word(
                    checkRequired("end", end),
                    checkRequired("start", start),
                    checkRequired("word", word),
                    confidence,
                    speaker,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Word = apply {
            if (validated) {
                return@apply
            }

            end()
            start()
            word()
            confidence()
            speaker()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (end.asKnown().isPresent) 1 else 0) +
                (if (start.asKnown().isPresent) 1 else 0) +
                (if (word.asKnown().isPresent) 1 else 0) +
                (if (confidence.asKnown().isPresent) 1 else 0) +
                (if (speaker.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Word &&
                end == other.end &&
                start == other.start &&
                word == other.word &&
                confidence == other.confidence &&
                speaker == other.speaker &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(end, start, word, confidence, speaker, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Word{end=$end, start=$start, word=$word, confidence=$confidence, speaker=$speaker, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudioTranscribeResponse &&
            text == other.text &&
            duration == other.duration &&
            segments == other.segments &&
            words == other.words &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(text, duration, segments, words, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AudioTranscribeResponse{text=$text, duration=$duration, segments=$segments, words=$words, additionalProperties=$additionalProperties}"
}
