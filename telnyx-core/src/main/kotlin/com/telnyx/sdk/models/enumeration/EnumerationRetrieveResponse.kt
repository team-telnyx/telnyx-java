// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enumeration

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = EnumerationRetrieveResponse.Deserializer::class)
@JsonSerialize(using = EnumerationRetrieveResponse.Serializer::class)
class EnumerationRetrieveResponse
private constructor(
    private val enumList: List<String>? = null,
    private val enumObject: JsonValue? = null,
    private val enumPaginated: JsonValue? = null,
    private val _json: JsonValue? = null,
) {

    fun enumList(): Optional<List<String>> = Optional.ofNullable(enumList)

    fun enumObject(): Optional<JsonValue> = Optional.ofNullable(enumObject)

    fun enumPaginated(): Optional<JsonValue> = Optional.ofNullable(enumPaginated)

    fun isEnumList(): Boolean = enumList != null

    fun isEnumObject(): Boolean = enumObject != null

    fun isEnumPaginated(): Boolean = enumPaginated != null

    fun asEnumList(): List<String> = enumList.getOrThrow("enumList")

    fun asEnumObject(): JsonValue = enumObject.getOrThrow("enumObject")

    fun asEnumPaginated(): JsonValue = enumPaginated.getOrThrow("enumPaginated")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            enumList != null -> visitor.visitEnumList(enumList)
            enumObject != null -> visitor.visitEnumObject(enumObject)
            enumPaginated != null -> visitor.visitEnumPaginated(enumPaginated)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): EnumerationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitEnumList(enumList: List<String>) {}

                override fun visitEnumObject(enumObject: JsonValue) {}

                override fun visitEnumPaginated(enumPaginated: JsonValue) {}
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
                override fun visitEnumList(enumList: List<String>) = enumList.size

                override fun visitEnumObject(enumObject: JsonValue) = 1

                override fun visitEnumPaginated(enumPaginated: JsonValue) = 1

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnumerationRetrieveResponse &&
            enumList == other.enumList &&
            enumObject == other.enumObject &&
            enumPaginated == other.enumPaginated
    }

    override fun hashCode(): Int = Objects.hash(enumList, enumObject, enumPaginated)

    override fun toString(): String =
        when {
            enumList != null -> "EnumerationRetrieveResponse{enumList=$enumList}"
            enumObject != null -> "EnumerationRetrieveResponse{enumObject=$enumObject}"
            enumPaginated != null -> "EnumerationRetrieveResponse{enumPaginated=$enumPaginated}"
            _json != null -> "EnumerationRetrieveResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EnumerationRetrieveResponse")
        }

    companion object {

        @JvmStatic
        fun ofEnumList(enumList: List<String>) =
            EnumerationRetrieveResponse(enumList = enumList.toImmutable())

        @JvmStatic
        fun ofEnumObject(enumObject: JsonValue) =
            EnumerationRetrieveResponse(enumObject = enumObject)

        @JvmStatic
        fun ofEnumPaginated(enumPaginated: JsonValue) =
            EnumerationRetrieveResponse(enumPaginated = enumPaginated)
    }

    /**
     * An interface that defines how to map each variant of [EnumerationRetrieveResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitEnumList(enumList: List<String>): T

        fun visitEnumObject(enumObject: JsonValue): T

        fun visitEnumPaginated(enumPaginated: JsonValue): T

        /**
         * Maps an unknown variant of [EnumerationRetrieveResponse] to a value of type [T].
         *
         * An instance of [EnumerationRetrieveResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown EnumerationRetrieveResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<EnumerationRetrieveResponse>(EnumerationRetrieveResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EnumerationRetrieveResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                            EnumerationRetrieveResponse(enumList = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                            EnumerationRetrieveResponse(enumObject = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                            EnumerationRetrieveResponse(enumPaginated = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants.
                0 -> EnumerationRetrieveResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<EnumerationRetrieveResponse>(EnumerationRetrieveResponse::class) {

        override fun serialize(
            value: EnumerationRetrieveResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.enumList != null -> generator.writeObject(value.enumList)
                value.enumObject != null -> generator.writeObject(value.enumObject)
                value.enumPaginated != null -> generator.writeObject(value.enumPaginated)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EnumerationRetrieveResponse")
            }
        }
    }
}
