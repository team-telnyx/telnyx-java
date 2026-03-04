// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Union of all server-to-client WebSocket events for TTS streaming. */
@JsonDeserialize(using = StreamServerEvent.Deserializer::class)
@JsonSerialize(using = StreamServerEvent.Serializer::class)
class StreamServerEvent
private constructor(
    private val audioChunk: AudioChunk? = null,
    private val final_: Final? = null,
    private val error: Error? = null,
    private val _json: JsonValue? = null,
) {

    /** Server-to-client frame containing a base64-encoded audio chunk. */
    fun audioChunk(): Optional<AudioChunk> = Optional.ofNullable(audioChunk)

    /** Server-to-client frame indicating synthesis is complete for the current text. */
    fun final_(): Optional<Final> = Optional.ofNullable(final_)

    /**
     * Server-to-client frame indicating an error during synthesis. The connection is closed shortly
     * after.
     */
    fun error(): Optional<Error> = Optional.ofNullable(error)

    fun isAudioChunk(): Boolean = audioChunk != null

    fun isFinal(): Boolean = final_ != null

    fun isError(): Boolean = error != null

    /** Server-to-client frame containing a base64-encoded audio chunk. */
    fun asAudioChunk(): AudioChunk = audioChunk.getOrThrow("audioChunk")

    /** Server-to-client frame indicating synthesis is complete for the current text. */
    fun asFinal(): Final = final_.getOrThrow("final_")

    /**
     * Server-to-client frame indicating an error during synthesis. The connection is closed shortly
     * after.
     */
    fun asError(): Error = error.getOrThrow("error")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            audioChunk != null -> visitor.visitAudioChunk(audioChunk)
            final_ != null -> visitor.visitFinal(final_)
            error != null -> visitor.visitError(error)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): StreamServerEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAudioChunk(audioChunk: AudioChunk) {
                    audioChunk.validate()
                }

                override fun visitFinal(final_: Final) {
                    final_.validate()
                }

                override fun visitError(error: Error) {
                    error.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitAudioChunk(audioChunk: AudioChunk) = audioChunk.validity()

                override fun visitFinal(final_: Final) = final_.validity()

                override fun visitError(error: Error) = error.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StreamServerEvent &&
            audioChunk == other.audioChunk &&
            final_ == other.final_ &&
            error == other.error
    }

    override fun hashCode(): Int = Objects.hash(audioChunk, final_, error)

    override fun toString(): String =
        when {
            audioChunk != null -> "StreamServerEvent{audioChunk=$audioChunk}"
            final_ != null -> "StreamServerEvent{final_=$final_}"
            error != null -> "StreamServerEvent{error=$error}"
            _json != null -> "StreamServerEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid StreamServerEvent")
        }

    companion object {

        /** Server-to-client frame containing a base64-encoded audio chunk. */
        @JvmStatic
        fun ofAudioChunk(audioChunk: AudioChunk) = StreamServerEvent(audioChunk = audioChunk)

        /** Server-to-client frame indicating synthesis is complete for the current text. */
        @JvmStatic fun ofFinal(final_: Final) = StreamServerEvent(final_ = final_)

        /**
         * Server-to-client frame indicating an error during synthesis. The connection is closed
         * shortly after.
         */
        @JvmStatic fun ofError(error: Error) = StreamServerEvent(error = error)
    }

    /**
     * An interface that defines how to map each variant of [StreamServerEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Server-to-client frame containing a base64-encoded audio chunk. */
        fun visitAudioChunk(audioChunk: AudioChunk): T

        /** Server-to-client frame indicating synthesis is complete for the current text. */
        fun visitFinal(final_: Final): T

        /**
         * Server-to-client frame indicating an error during synthesis. The connection is closed
         * shortly after.
         */
        fun visitError(error: Error): T

        /**
         * Maps an unknown variant of [StreamServerEvent] to a value of type [T].
         *
         * An instance of [StreamServerEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown StreamServerEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<StreamServerEvent>(StreamServerEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): StreamServerEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "audio_chunk" -> {
                    return tryDeserialize(node, jacksonTypeRef<AudioChunk>())?.let {
                        StreamServerEvent(audioChunk = it, _json = json)
                    } ?: StreamServerEvent(_json = json)
                }
                "final" -> {
                    return tryDeserialize(node, jacksonTypeRef<Final>())?.let {
                        StreamServerEvent(final_ = it, _json = json)
                    } ?: StreamServerEvent(_json = json)
                }
                "error" -> {
                    return tryDeserialize(node, jacksonTypeRef<Error>())?.let {
                        StreamServerEvent(error = it, _json = json)
                    } ?: StreamServerEvent(_json = json)
                }
            }

            return StreamServerEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<StreamServerEvent>(StreamServerEvent::class) {

        override fun serialize(
            value: StreamServerEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.audioChunk != null -> generator.writeObject(value.audioChunk)
                value.final_ != null -> generator.writeObject(value.final_)
                value.error != null -> generator.writeObject(value.error)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid StreamServerEvent")
            }
        }
    }

    /** Server-to-client frame containing a base64-encoded audio chunk. */
    class AudioChunk
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audio: JsonField<String>,
        private val cached: JsonField<Boolean>,
        private val isFinal: JsonField<Boolean>,
        private val text: JsonField<String>,
        private val timeToFirstAudioFrameMs: JsonField<Long>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio") @ExcludeMissing audio: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cached") @ExcludeMissing cached: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isFinal") @ExcludeMissing isFinal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeToFirstAudioFrameMs")
            @ExcludeMissing
            timeToFirstAudioFrameMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(audio, cached, isFinal, text, timeToFirstAudioFrameMs, type, mutableMapOf())

        /**
         * Base64-encoded audio data. May be `null` for providers that use `drop_concatenated_audio`
         * mode (Telnyx Natural/NaturalHD, Rime, Minimax, MurfAI, Resemble) — in that case only
         * streamed chunks carry audio.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audio(): Optional<String> = audio.getOptional("audio")

        /**
         * Whether this audio was served from cache.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cached(): Optional<Boolean> = cached.getOptional("cached")

        /**
         * Always `false` for audio chunk frames.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isFinal(): Optional<Boolean> = isFinal.getOptional("isFinal")

        /**
         * The text segment that this audio chunk corresponds to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Milliseconds from the start-of-speech request to the first audio frame. Only present on
         * the first audio chunk of a synthesis request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeToFirstAudioFrameMs(): Optional<Long> =
            timeToFirstAudioFrameMs.getOptional("timeToFirstAudioFrameMs")

        /**
         * Frame type identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [audio].
         *
         * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<String> = audio

        /**
         * Returns the raw JSON value of [cached].
         *
         * Unlike [cached], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cached") @ExcludeMissing fun _cached(): JsonField<Boolean> = cached

        /**
         * Returns the raw JSON value of [isFinal].
         *
         * Unlike [isFinal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isFinal") @ExcludeMissing fun _isFinal(): JsonField<Boolean> = isFinal

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [timeToFirstAudioFrameMs].
         *
         * Unlike [timeToFirstAudioFrameMs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("timeToFirstAudioFrameMs")
        @ExcludeMissing
        fun _timeToFirstAudioFrameMs(): JsonField<Long> = timeToFirstAudioFrameMs

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [AudioChunk]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AudioChunk]. */
        class Builder internal constructor() {

            private var audio: JsonField<String> = JsonMissing.of()
            private var cached: JsonField<Boolean> = JsonMissing.of()
            private var isFinal: JsonField<Boolean> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var timeToFirstAudioFrameMs: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(audioChunk: AudioChunk) = apply {
                audio = audioChunk.audio
                cached = audioChunk.cached
                isFinal = audioChunk.isFinal
                text = audioChunk.text
                timeToFirstAudioFrameMs = audioChunk.timeToFirstAudioFrameMs
                type = audioChunk.type
                additionalProperties = audioChunk.additionalProperties.toMutableMap()
            }

            /**
             * Base64-encoded audio data. May be `null` for providers that use
             * `drop_concatenated_audio` mode (Telnyx Natural/NaturalHD, Rime, Minimax, MurfAI,
             * Resemble) — in that case only streamed chunks carry audio.
             */
            fun audio(audio: String?) = audio(JsonField.ofNullable(audio))

            /** Alias for calling [Builder.audio] with `audio.orElse(null)`. */
            fun audio(audio: Optional<String>) = audio(audio.getOrNull())

            /**
             * Sets [Builder.audio] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audio] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audio(audio: JsonField<String>) = apply { this.audio = audio }

            /** Whether this audio was served from cache. */
            fun cached(cached: Boolean) = cached(JsonField.of(cached))

            /**
             * Sets [Builder.cached] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cached] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cached(cached: JsonField<Boolean>) = apply { this.cached = cached }

            /** Always `false` for audio chunk frames. */
            fun isFinal(isFinal: Boolean) = isFinal(JsonField.of(isFinal))

            /**
             * Sets [Builder.isFinal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isFinal] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isFinal(isFinal: JsonField<Boolean>) = apply { this.isFinal = isFinal }

            /** The text segment that this audio chunk corresponds to. */
            fun text(text: String?) = text(JsonField.ofNullable(text))

            /** Alias for calling [Builder.text] with `text.orElse(null)`. */
            fun text(text: Optional<String>) = text(text.getOrNull())

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * Milliseconds from the start-of-speech request to the first audio frame. Only present
             * on the first audio chunk of a synthesis request.
             */
            fun timeToFirstAudioFrameMs(timeToFirstAudioFrameMs: Long) =
                timeToFirstAudioFrameMs(JsonField.of(timeToFirstAudioFrameMs))

            /**
             * Sets [Builder.timeToFirstAudioFrameMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeToFirstAudioFrameMs] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeToFirstAudioFrameMs(timeToFirstAudioFrameMs: JsonField<Long>) = apply {
                this.timeToFirstAudioFrameMs = timeToFirstAudioFrameMs
            }

            /** Frame type identifier. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [AudioChunk].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AudioChunk =
                AudioChunk(
                    audio,
                    cached,
                    isFinal,
                    text,
                    timeToFirstAudioFrameMs,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AudioChunk = apply {
            if (validated) {
                return@apply
            }

            audio()
            cached()
            isFinal()
            text()
            timeToFirstAudioFrameMs()
            type().ifPresent { it.validate() }
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
            (if (audio.asKnown().isPresent) 1 else 0) +
                (if (cached.asKnown().isPresent) 1 else 0) +
                (if (isFinal.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (timeToFirstAudioFrameMs.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** Frame type identifier. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AUDIO_CHUNK = of("audio_chunk")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                AUDIO_CHUNK
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUDIO_CHUNK,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AUDIO_CHUNK -> Value.AUDIO_CHUNK
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AUDIO_CHUNK -> Known.AUDIO_CHUNK
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AudioChunk &&
                audio == other.audio &&
                cached == other.cached &&
                isFinal == other.isFinal &&
                text == other.text &&
                timeToFirstAudioFrameMs == other.timeToFirstAudioFrameMs &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                audio,
                cached,
                isFinal,
                text,
                timeToFirstAudioFrameMs,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AudioChunk{audio=$audio, cached=$cached, isFinal=$isFinal, text=$text, timeToFirstAudioFrameMs=$timeToFirstAudioFrameMs, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Server-to-client frame indicating synthesis is complete for the current text. */
    class Final
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audio: JsonField<Void>,
        private val isFinal: JsonField<IsFinal>,
        private val text: JsonField<String>,
        private val timeToFirstAudioFrameMs: JsonField<Long>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio") @ExcludeMissing audio: JsonField<Void> = JsonMissing.of(),
            @JsonProperty("isFinal") @ExcludeMissing isFinal: JsonField<IsFinal> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeToFirstAudioFrameMs")
            @ExcludeMissing
            timeToFirstAudioFrameMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(audio, isFinal, text, timeToFirstAudioFrameMs, type, mutableMapOf())

        /**
         * Always `null` for the final frame.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audio(): Optional<Void> = audio.getOptional("audio")

        /**
         * Always `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isFinal(): Optional<IsFinal> = isFinal.getOptional("isFinal")

        /**
         * Empty string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Present if this was the first response frame.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeToFirstAudioFrameMs(): Optional<Long> =
            timeToFirstAudioFrameMs.getOptional("timeToFirstAudioFrameMs")

        /**
         * Frame type identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [audio].
         *
         * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<Void> = audio

        /**
         * Returns the raw JSON value of [isFinal].
         *
         * Unlike [isFinal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isFinal") @ExcludeMissing fun _isFinal(): JsonField<IsFinal> = isFinal

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [timeToFirstAudioFrameMs].
         *
         * Unlike [timeToFirstAudioFrameMs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("timeToFirstAudioFrameMs")
        @ExcludeMissing
        fun _timeToFirstAudioFrameMs(): JsonField<Long> = timeToFirstAudioFrameMs

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Final]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Final]. */
        class Builder internal constructor() {

            private var audio: JsonField<Void> = JsonMissing.of()
            private var isFinal: JsonField<IsFinal> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var timeToFirstAudioFrameMs: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(final_: Final) = apply {
                audio = final_.audio
                isFinal = final_.isFinal
                text = final_.text
                timeToFirstAudioFrameMs = final_.timeToFirstAudioFrameMs
                type = final_.type
                additionalProperties = final_.additionalProperties.toMutableMap()
            }

            /** Always `null` for the final frame. */
            fun audio(audio: Void?) = audio(JsonField.ofNullable(audio))

            /** Alias for calling [Builder.audio] with `audio.orElse(null)`. */
            fun audio(audio: Optional<Void>) = audio(audio.getOrNull())

            /**
             * Sets [Builder.audio] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audio] with a well-typed [Void] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun audio(audio: JsonField<Void>) = apply { this.audio = audio }

            /** Always `true`. */
            fun isFinal(isFinal: IsFinal) = isFinal(JsonField.of(isFinal))

            /**
             * Sets [Builder.isFinal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isFinal] with a well-typed [IsFinal] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isFinal(isFinal: JsonField<IsFinal>) = apply { this.isFinal = isFinal }

            /** Empty string. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Present if this was the first response frame. */
            fun timeToFirstAudioFrameMs(timeToFirstAudioFrameMs: Long) =
                timeToFirstAudioFrameMs(JsonField.of(timeToFirstAudioFrameMs))

            /**
             * Sets [Builder.timeToFirstAudioFrameMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeToFirstAudioFrameMs] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeToFirstAudioFrameMs(timeToFirstAudioFrameMs: JsonField<Long>) = apply {
                this.timeToFirstAudioFrameMs = timeToFirstAudioFrameMs
            }

            /** Frame type identifier. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Final].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Final =
                Final(
                    audio,
                    isFinal,
                    text,
                    timeToFirstAudioFrameMs,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Final = apply {
            if (validated) {
                return@apply
            }

            audio()
            isFinal().ifPresent { it.validate() }
            text()
            timeToFirstAudioFrameMs()
            type().ifPresent { it.validate() }
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
            (if (audio.asKnown().isPresent) 1 else 0) +
                (isFinal.asKnown().getOrNull()?.validity() ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (timeToFirstAudioFrameMs.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** Always `true`. */
        class IsFinal @JsonCreator private constructor(private val value: JsonField<Boolean>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

            companion object {

                @JvmField val TRUE = of(true)

                @JvmStatic fun of(value: Boolean) = IsFinal(JsonField.of(value))
            }

            /** An enum containing [IsFinal]'s known values. */
            enum class Known {
                TRUE
            }

            /**
             * An enum containing [IsFinal]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IsFinal] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRUE,
                /**
                 * An enum member indicating that [IsFinal] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TRUE -> Value.TRUE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TRUE -> Known.TRUE
                    else -> throw TelnyxInvalidDataException("Unknown IsFinal: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asBoolean(): Boolean =
                _value().asBoolean().orElseThrow {
                    TelnyxInvalidDataException("Value is not a Boolean")
                }

            private var validated: Boolean = false

            fun validate(): IsFinal = apply {
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

                return other is IsFinal && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Frame type identifier. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FINAL = of("final")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                FINAL
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FINAL,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FINAL -> Value.FINAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    FINAL -> Known.FINAL
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Final &&
                audio == other.audio &&
                isFinal == other.isFinal &&
                text == other.text &&
                timeToFirstAudioFrameMs == other.timeToFirstAudioFrameMs &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(audio, isFinal, text, timeToFirstAudioFrameMs, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Final{audio=$audio, isFinal=$isFinal, text=$text, timeToFirstAudioFrameMs=$timeToFirstAudioFrameMs, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Server-to-client frame indicating an error during synthesis. The connection is closed shortly
     * after.
     */
    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val error: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(error, type, mutableMapOf())

        /**
         * Error message describing what went wrong.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * Frame type identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Error]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var error: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(error: Error) = apply {
                this.error = error.error
                type = error.type
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            /** Error message describing what went wrong. */
            fun error(error: String) = error(JsonField.of(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /** Frame type identifier. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Error = Error(error, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            error()
            type().ifPresent { it.validate() }
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
            (if (error.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** Frame type identifier. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ERROR = of("error")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ERROR
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ERROR,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ERROR -> Value.ERROR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ERROR -> Known.ERROR
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                error == other.error &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(error, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{error=$error, type=$type, additionalProperties=$additionalProperties}"
    }
}
