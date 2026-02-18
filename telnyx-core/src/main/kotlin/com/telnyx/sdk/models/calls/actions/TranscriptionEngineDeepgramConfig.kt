// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = TranscriptionEngineDeepgramConfig.Deserializer::class)
@JsonSerialize(using = TranscriptionEngineDeepgramConfig.Serializer::class)
class TranscriptionEngineDeepgramConfig
private constructor(
    private val deepgramNova2: DeepgramNova2Config? = null,
    private val deepgramNova3: DeepgramNova3Config? = null,
    private val _json: JsonValue? = null,
) {

    fun deepgramNova2(): Optional<DeepgramNova2Config> = Optional.ofNullable(deepgramNova2)

    fun deepgramNova3(): Optional<DeepgramNova3Config> = Optional.ofNullable(deepgramNova3)

    fun isDeepgramNova2(): Boolean = deepgramNova2 != null

    fun isDeepgramNova3(): Boolean = deepgramNova3 != null

    fun asDeepgramNova2(): DeepgramNova2Config = deepgramNova2.getOrThrow("deepgramNova2")

    fun asDeepgramNova3(): DeepgramNova3Config = deepgramNova3.getOrThrow("deepgramNova3")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            deepgramNova2 != null -> visitor.visitDeepgramNova2(deepgramNova2)
            deepgramNova3 != null -> visitor.visitDeepgramNova3(deepgramNova3)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TranscriptionEngineDeepgramConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config) {
                    deepgramNova2.validate()
                }

                override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config) {
                    deepgramNova3.validate()
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
                override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config) =
                    deepgramNova2.validity()

                override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config) =
                    deepgramNova3.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionEngineDeepgramConfig &&
            deepgramNova2 == other.deepgramNova2 &&
            deepgramNova3 == other.deepgramNova3
    }

    override fun hashCode(): Int = Objects.hash(deepgramNova2, deepgramNova3)

    override fun toString(): String =
        when {
            deepgramNova2 != null ->
                "TranscriptionEngineDeepgramConfig{deepgramNova2=$deepgramNova2}"
            deepgramNova3 != null ->
                "TranscriptionEngineDeepgramConfig{deepgramNova3=$deepgramNova3}"
            _json != null -> "TranscriptionEngineDeepgramConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TranscriptionEngineDeepgramConfig")
        }

    companion object {

        @JvmStatic
        fun ofDeepgramNova2(deepgramNova2: DeepgramNova2Config) =
            TranscriptionEngineDeepgramConfig(deepgramNova2 = deepgramNova2)

        @JvmStatic
        fun ofDeepgramNova3(deepgramNova3: DeepgramNova3Config) =
            TranscriptionEngineDeepgramConfig(deepgramNova3 = deepgramNova3)
    }

    /**
     * An interface that defines how to map each variant of [TranscriptionEngineDeepgramConfig] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config): T

        fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config): T

        /**
         * Maps an unknown variant of [TranscriptionEngineDeepgramConfig] to a value of type [T].
         *
         * An instance of [TranscriptionEngineDeepgramConfig] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown TranscriptionEngineDeepgramConfig: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TranscriptionEngineDeepgramConfig>(
            TranscriptionEngineDeepgramConfig::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): TranscriptionEngineDeepgramConfig {
            val json = JsonValue.fromJsonNode(node)
            val transcriptionModel =
                json.asObject().getOrNull()?.get("transcription_model")?.asString()?.getOrNull()

            when (transcriptionModel) {
                "deepgram/nova-2" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramNova2Config>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramNova2 = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
                "deepgram/nova-3" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramNova3Config>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramNova3 = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
            }

            return TranscriptionEngineDeepgramConfig(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<TranscriptionEngineDeepgramConfig>(
            TranscriptionEngineDeepgramConfig::class
        ) {

        override fun serialize(
            value: TranscriptionEngineDeepgramConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.deepgramNova2 != null -> generator.writeObject(value.deepgramNova2)
                value.deepgramNova3 != null -> generator.writeObject(value.deepgramNova3)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TranscriptionEngineDeepgramConfig")
            }
        }
    }
}
