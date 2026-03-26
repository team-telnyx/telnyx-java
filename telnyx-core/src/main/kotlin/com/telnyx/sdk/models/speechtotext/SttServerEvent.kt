// Custom code for WebSocket streaming support - persists across codegen runs.

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
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Union of all server-to-client WebSocket events for STT streaming. */
@JsonDeserialize(using = SttServerEvent.Deserializer::class)
@JsonSerialize(using = SttServerEvent.Serializer::class)
class SttServerEvent
private constructor(
    private val transcript: TranscriptFrame? = null,
    private val error: ErrorFrame? = null,
    private val _json: JsonValue? = null,
) {

    /** Server-to-client frame containing a transcription result. */
    fun transcript(): Optional<TranscriptFrame> = Optional.ofNullable(transcript)

    /** Server-to-client frame indicating an error during transcription. */
    fun error(): Optional<ErrorFrame> = Optional.ofNullable(error)

    fun isTranscript(): Boolean = transcript != null

    fun isError(): Boolean = error != null

    fun asTranscript(): TranscriptFrame = transcript.getOrThrow("transcript")

    fun asError(): ErrorFrame = error.getOrThrow("error")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            transcript != null -> visitor.visitTranscript(transcript)
            error != null -> visitor.visitError(error)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): SttServerEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitTranscript(transcript: TranscriptFrame) {
                    transcript.validate()
                }

                override fun visitError(error: ErrorFrame) {
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

    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitTranscript(transcript: TranscriptFrame) = transcript.validity()

                override fun visitError(error: ErrorFrame) = error.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SttServerEvent &&
            transcript == other.transcript &&
            error == other.error
    }

    override fun hashCode(): Int = Objects.hash(transcript, error)

    override fun toString(): String =
        when {
            transcript != null -> "SttServerEvent{transcript=$transcript}"
            error != null -> "SttServerEvent{error=$error}"
            _json != null -> "SttServerEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid SttServerEvent")
        }

    companion object {

        @JvmStatic
        fun ofTranscript(transcript: TranscriptFrame) = SttServerEvent(transcript = transcript)

        @JvmStatic
        fun ofError(error: ErrorFrame) = SttServerEvent(error = error)
    }

    interface Visitor<out T> {

        fun visitTranscript(transcript: TranscriptFrame): T

        fun visitError(error: ErrorFrame): T

        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown SttServerEvent: $json")
        }
    }

    /** Server-to-client frame containing a transcription result. */
    class TranscriptFrame
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transcript") @ExcludeMissing private val transcript: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_final") @ExcludeMissing private val isFinal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("confidence") @ExcludeMissing private val confidence: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("speech_final") @ExcludeMissing private val speechFinal: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
    ) {

        fun type(): Optional<String> = type.getOptional("type")

        fun transcript(): String = transcript.getRequired("transcript")

        fun isFinal(): Boolean = isFinal.getRequired("is_final")

        fun confidence(): Optional<Double> = confidence.getOptional("confidence")

        fun speechFinal(): Optional<Boolean> = speechFinal.getOptional("speech_final")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        @JsonProperty("transcript") @ExcludeMissing fun _transcript(): JsonField<String> = transcript

        @JsonProperty("is_final") @ExcludeMissing fun _isFinal(): JsonField<Boolean> = isFinal

        @JsonProperty("confidence") @ExcludeMissing fun _confidence(): JsonField<Double> = confidence

        @JsonProperty("speech_final") @ExcludeMissing fun _speechFinal(): JsonField<Boolean> = speechFinal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var type: JsonField<String> = JsonMissing.of()
            private var transcript: JsonField<String>? = null
            private var isFinal: JsonField<Boolean>? = null
            private var confidence: JsonField<Double> = JsonMissing.of()
            private var speechFinal: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transcriptFrame: TranscriptFrame) = apply {
                type = transcriptFrame.type
                transcript = transcriptFrame.transcript
                isFinal = transcriptFrame.isFinal
                confidence = transcriptFrame.confidence
                speechFinal = transcriptFrame.speechFinal
                additionalProperties = transcriptFrame.additionalProperties.toMutableMap()
            }

            fun type(type: String) = type(JsonField.of(type))

            fun type(type: JsonField<String>) = apply { this.type = type }

            fun transcript(transcript: String) = transcript(JsonField.of(transcript))

            fun transcript(transcript: JsonField<String>) = apply { this.transcript = transcript }

            fun isFinal(isFinal: Boolean) = isFinal(JsonField.of(isFinal))

            fun isFinal(isFinal: JsonField<Boolean>) = apply { this.isFinal = isFinal }

            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

            fun speechFinal(speechFinal: Boolean) = speechFinal(JsonField.of(speechFinal))

            fun speechFinal(speechFinal: JsonField<Boolean>) = apply { this.speechFinal = speechFinal }

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

            fun build(): TranscriptFrame =
                TranscriptFrame(
                    type,
                    transcript ?: throw IllegalStateException("transcript is required"),
                    isFinal ?: throw IllegalStateException("isFinal is required"),
                    confidence,
                    speechFinal,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TranscriptFrame = apply {
            if (validated) {
                return@apply
            }

            type()
            transcript()
            isFinal()
            confidence()
            speechFinal()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        @JvmSynthetic
        internal fun validity(): Int =
            (if (type.asKnown().isPresent) 1 else 0) +
                (if (transcript.asKnown().isPresent) 1 else 0) +
                (if (isFinal.asKnown().isPresent) 1 else 0) +
                (if (confidence.asKnown().isPresent) 1 else 0) +
                (if (speechFinal.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TranscriptFrame &&
                type == other.type &&
                transcript == other.transcript &&
                isFinal == other.isFinal &&
                confidence == other.confidence &&
                speechFinal == other.speechFinal &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(type, transcript, isFinal, confidence, speechFinal, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TranscriptFrame{type=$type, transcript=$transcript, isFinal=$isFinal, confidence=$confidence, speechFinal=$speechFinal, additionalProperties=$additionalProperties}"
    }

    /** Server-to-client frame indicating an error during transcription. */
    class ErrorFrame
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing private val error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: MutableMap<String, JsonValue> = mutableMapOf(),
    ) {

        fun type(): Optional<String> = type.getOptional("type")

        fun error(): String = error.getRequired("error")

        fun code(): Optional<String> = code.getOptional("code")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {
            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var type: JsonField<String> = JsonMissing.of()
            private var error: JsonField<String>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(errorFrame: ErrorFrame) = apply {
                type = errorFrame.type
                error = errorFrame.error
                code = errorFrame.code
                additionalProperties = errorFrame.additionalProperties.toMutableMap()
            }

            fun type(type: String) = type(JsonField.of(type))

            fun type(type: JsonField<String>) = apply { this.type = type }

            fun error(error: String) = error(JsonField.of(error))

            fun error(error: JsonField<String>) = apply { this.error = error }

            fun code(code: String) = code(JsonField.of(code))

            fun code(code: JsonField<String>) = apply { this.code = code }

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

            fun build(): ErrorFrame =
                ErrorFrame(
                    type,
                    error ?: throw IllegalStateException("error is required"),
                    code,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ErrorFrame = apply {
            if (validated) {
                return@apply
            }

            type()
            error()
            code()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        @JvmSynthetic
        internal fun validity(): Int =
            (if (type.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ErrorFrame &&
                type == other.type &&
                error == other.error &&
                code == other.code &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(type, error, code, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ErrorFrame{type=$type, error=$error, code=$code, additionalProperties=$additionalProperties}"
    }

    internal class Deserializer : BaseDeserializer<SttServerEvent>(SttServerEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): SttServerEvent {
            val json = JsonValue.fromJsonNode(node)

            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "transcript" -> {
                    return tryDeserialize(node, jacksonTypeRef<TranscriptFrame>())?.let {
                        SttServerEvent(transcript = it, _json = json)
                    } ?: SttServerEvent(_json = json)
                }
                "error" -> {
                    return tryDeserialize(node, jacksonTypeRef<ErrorFrame>())?.let {
                        SttServerEvent(error = it, _json = json)
                    } ?: SttServerEvent(_json = json)
                }
            }

            // Try to deserialize based on content if type field is missing
            // (some engines don't include 'type' field)
            return tryDeserialize(node, jacksonTypeRef<TranscriptFrame>())?.let {
                SttServerEvent(transcript = it, _json = json)
            } ?: tryDeserialize(node, jacksonTypeRef<ErrorFrame>())?.let {
                SttServerEvent(error = it, _json = json)
            } ?: SttServerEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<SttServerEvent>(SttServerEvent::class) {

        override fun serialize(
            value: SttServerEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.transcript != null -> generator.writeObject(value.transcript)
                value.error != null -> generator.writeObject(value.error)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid SttServerEvent")
            }
        }
    }
}
