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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = Loopcount.Deserializer::class)
@JsonSerialize(using = Loopcount.Serializer::class)
class Loopcount
private constructor(
    private val string: String? = null,
    private val integer: Long? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): Optional<String> = Optional.ofNullable(string)

    fun integer(): Optional<Long> = Optional.ofNullable(integer)

    fun isString(): Boolean = string != null

    fun isInteger(): Boolean = integer != null

    fun asString(): String = string.getOrThrow("string")

    fun asInteger(): Long = integer.getOrThrow("integer")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            string != null -> visitor.visitString(string)
            integer != null -> visitor.visitInteger(integer)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Loopcount = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitInteger(integer: Long) {}
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
                override fun visitString(string: String) = 1

                override fun visitInteger(integer: Long) = 1

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Loopcount && string == other.string && integer == other.integer
    }

    override fun hashCode(): Int = Objects.hash(string, integer)

    override fun toString(): String =
        when {
            string != null -> "Loopcount{string=$string}"
            integer != null -> "Loopcount{integer=$integer}"
            _json != null -> "Loopcount{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Loopcount")
        }

    companion object {

        @JvmStatic fun ofString(string: String) = Loopcount(string = string)

        @JvmStatic fun ofInteger(integer: Long) = Loopcount(integer = integer)
    }

    /** An interface that defines how to map each variant of [Loopcount] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitInteger(integer: Long): T

        /**
         * Maps an unknown variant of [Loopcount] to a value of type [T].
         *
         * An instance of [Loopcount] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown Loopcount: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Loopcount>(Loopcount::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Loopcount {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            Loopcount(string = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                            Loopcount(integer = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from object).
                0 -> Loopcount(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Loopcount>(Loopcount::class) {

        override fun serialize(
            value: Loopcount,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.integer != null -> generator.writeObject(value.integer)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Loopcount")
            }
        }
    }
}
