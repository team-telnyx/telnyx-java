// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.speechtotext

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
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Union of all server-to-client WebSocket events for STT streaming. */
@JsonDeserialize(using = TranscribeServerEvent.Deserializer::class)
@JsonSerialize(using = TranscribeServerEvent.Serializer::class)
class TranscribeServerEvent
private constructor(
    private val transcript: Transcript? = null,
    private val error: Error? = null,
    private val _json: JsonValue? = null,
) {

    /** Server-to-client frame containing a transcription result. */
    fun transcript(): Optional<Transcript> = Optional.ofNullable(transcript)

    /**
     * Server-to-client frame indicating an error during transcription. The connection may be closed
     * shortly after.
     */
    fun error(): Optional<Error> = Optional.ofNullable(error)

    fun isTranscript(): Boolean = transcript != null

    fun isError(): Boolean = error != null

    /** Server-to-client frame containing a transcription result. */
    fun asTranscript(): Transcript = transcript.getOrThrow("transcript")

    /**
     * Server-to-client frame indicating an error during transcription. The connection may be closed
     * shortly after.
     */
    fun asError(): Error = error.getOrThrow("error")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.telnyx.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = transcribeServerEvent.accept(new TranscribeServerEvent.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitTranscript(Transcript transcript) {
     *         return Optional.of(transcript.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            transcript != null -> visitor.visitTranscript(transcript)
            error != null -> visitor.visitError(error)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TranscribeServerEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitTranscript(transcript: Transcript) {
                    transcript.validate()
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
                override fun visitTranscript(transcript: Transcript) = transcript.validity()

                override fun visitError(error: Error) = error.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscribeServerEvent &&
            transcript == other.transcript &&
            error == other.error
    }

    override fun hashCode(): Int = Objects.hash(transcript, error)

    override fun toString(): String =
        when {
            transcript != null -> "TranscribeServerEvent{transcript=$transcript}"
            error != null -> "TranscribeServerEvent{error=$error}"
            _json != null -> "TranscribeServerEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TranscribeServerEvent")
        }

    companion object {

        /** Server-to-client frame containing a transcription result. */
        @JvmStatic
        fun ofTranscript(transcript: Transcript) = TranscribeServerEvent(transcript = transcript)

        /**
         * Server-to-client frame indicating an error during transcription. The connection may be
         * closed shortly after.
         */
        @JvmStatic fun ofError(error: Error) = TranscribeServerEvent(error = error)
    }

    /**
     * An interface that defines how to map each variant of [TranscribeServerEvent] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** Server-to-client frame containing a transcription result. */
        fun visitTranscript(transcript: Transcript): T

        /**
         * Server-to-client frame indicating an error during transcription. The connection may be
         * closed shortly after.
         */
        fun visitError(error: Error): T

        /**
         * Maps an unknown variant of [TranscribeServerEvent] to a value of type [T].
         *
         * An instance of [TranscribeServerEvent] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown TranscribeServerEvent: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TranscribeServerEvent>(TranscribeServerEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TranscribeServerEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "transcript" -> {
                    return tryDeserialize(node, jacksonTypeRef<Transcript>())?.let {
                        TranscribeServerEvent(transcript = it, _json = json)
                    } ?: TranscribeServerEvent(_json = json)
                }
                "error" -> {
                    return tryDeserialize(node, jacksonTypeRef<Error>())?.let {
                        TranscribeServerEvent(error = it, _json = json)
                    } ?: TranscribeServerEvent(_json = json)
                }
            }

            return TranscribeServerEvent(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<TranscribeServerEvent>(TranscribeServerEvent::class) {

        override fun serialize(
            value: TranscribeServerEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.transcript != null -> generator.writeObject(value.transcript)
                value.error != null -> generator.writeObject(value.error)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TranscribeServerEvent")
            }
        }
    }

    /** Server-to-client frame containing a transcription result. */
    class Transcript
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transcript: JsonField<String>,
        private val type: JsonValue,
        private val confidence: JsonField<Double>,
        private val isFinal: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transcript")
            @ExcludeMissing
            transcript: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("is_final") @ExcludeMissing isFinal: JsonField<Boolean> = JsonMissing.of(),
        ) : this(transcript, type, confidence, isFinal, mutableMapOf())

        /**
         * The transcribed text from the audio.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transcript(): String = transcript.getRequired("transcript")

        /**
         * Frame type identifier.
         *
         * Expected to always return the following:
         * ```java
         * JsonValue.from("transcript")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Confidence score of the transcription, ranging from 0 to 1.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun confidence(): Optional<Double> = confidence.getOptional("confidence")

        /**
         * Whether this is a final transcription result. When `false`, this is an interim result
         * that may be refined.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isFinal(): Optional<Boolean> = isFinal.getOptional("is_final")

        /**
         * Returns the raw JSON value of [transcript].
         *
         * Unlike [transcript], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transcript")
        @ExcludeMissing
        fun _transcript(): JsonField<String> = transcript

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

        /**
         * Returns the raw JSON value of [isFinal].
         *
         * Unlike [isFinal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_final") @ExcludeMissing fun _isFinal(): JsonField<Boolean> = isFinal

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
             * Returns a mutable builder for constructing an instance of [Transcript].
             *
             * The following fields are required:
             * ```java
             * .transcript()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transcript]. */
        class Builder internal constructor() {

            private var transcript: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("transcript")
            private var confidence: JsonField<Double> = JsonMissing.of()
            private var isFinal: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transcript: Transcript) = apply {
                this.transcript = transcript.transcript
                type = transcript.type
                confidence = transcript.confidence
                isFinal = transcript.isFinal
                additionalProperties = transcript.additionalProperties.toMutableMap()
            }

            /** The transcribed text from the audio. */
            fun transcript(transcript: String) = transcript(JsonField.of(transcript))

            /**
             * Sets [Builder.transcript] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcript] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transcript(transcript: JsonField<String>) = apply { this.transcript = transcript }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("transcript")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            /** Confidence score of the transcription, ranging from 0 to 1. */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            /**
             * Whether this is a final transcription result. When `false`, this is an interim result
             * that may be refined.
             */
            fun isFinal(isFinal: Boolean) = isFinal(JsonField.of(isFinal))

            /**
             * Sets [Builder.isFinal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isFinal] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isFinal(isFinal: JsonField<Boolean>) = apply { this.isFinal = isFinal }

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
             * Returns an immutable instance of [Transcript].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .transcript()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Transcript =
                Transcript(
                    checkRequired("transcript", transcript),
                    type,
                    confidence,
                    isFinal,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Transcript = apply {
            if (validated) {
                return@apply
            }

            transcript()
            _type().let {
                if (it != JsonValue.from("transcript")) {
                    throw TelnyxInvalidDataException("'type' is invalid, received $it")
                }
            }
            confidence()
            isFinal()
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
            (if (transcript.asKnown().isPresent) 1 else 0) +
                type.let { if (it == JsonValue.from("transcript")) 1 else 0 } +
                (if (confidence.asKnown().isPresent) 1 else 0) +
                (if (isFinal.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transcript &&
                transcript == other.transcript &&
                type == other.type &&
                confidence == other.confidence &&
                isFinal == other.isFinal &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(transcript, type, confidence, isFinal, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transcript{transcript=$transcript, type=$type, confidence=$confidence, isFinal=$isFinal, additionalProperties=$additionalProperties}"
    }

    /**
     * Server-to-client frame indicating an error during transcription. The connection may be closed
     * shortly after.
     */
    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val error: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(error, type, mutableMapOf())

        /**
         * Error message describing what went wrong.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun error(): String = error.getRequired("error")

        /**
         * Frame type identifier.
         *
         * Expected to always return the following:
         * ```java
         * JsonValue.from("error")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```java
             * .error()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var error: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("error")
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

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("error")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

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
             *
             * The following fields are required:
             * ```java
             * .error()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(checkRequired("error", error), type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            error()
            _type().let {
                if (it != JsonValue.from("error")) {
                    throw TelnyxInvalidDataException("'type' is invalid, received $it")
                }
            }
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
                type.let { if (it == JsonValue.from("error")) 1 else 0 }

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
