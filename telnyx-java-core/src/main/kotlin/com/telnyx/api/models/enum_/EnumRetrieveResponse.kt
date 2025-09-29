// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.enum_

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.BaseDeserializer
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.allMaxBy
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = EnumRetrieveResponse.Deserializer::class)
@JsonSerialize(using = EnumRetrieveResponse.Serializer::class)
class EnumRetrieveResponse
private constructor(
    private val list: List<UnnamedSchemaWithArrayParent0>? = null,
    private val enumObjectResponse: JsonValue? = null,
    private val paginated: JsonValue? = null,
    private val _json: JsonValue? = null,
) {

    fun list(): Optional<List<UnnamedSchemaWithArrayParent0>> = Optional.ofNullable(list)

    fun enumObjectResponse(): Optional<JsonValue> = Optional.ofNullable(enumObjectResponse)

    fun paginated(): Optional<JsonValue> = Optional.ofNullable(paginated)

    fun isList(): Boolean = list != null

    fun isEnumObjectResponse(): Boolean = enumObjectResponse != null

    fun isPaginated(): Boolean = paginated != null

    fun asList(): List<UnnamedSchemaWithArrayParent0> = list.getOrThrow("list")

    fun asEnumObjectResponse(): JsonValue = enumObjectResponse.getOrThrow("enumObjectResponse")

    fun asPaginated(): JsonValue = paginated.getOrThrow("paginated")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            list != null -> visitor.visitList(list)
            enumObjectResponse != null -> visitor.visitEnumObjectResponse(enumObjectResponse)
            paginated != null -> visitor.visitPaginated(paginated)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): EnumRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitList(list: List<UnnamedSchemaWithArrayParent0>) {
                    list.forEach { it.validate() }
                }

                override fun visitEnumObjectResponse(enumObjectResponse: JsonValue) {}

                override fun visitPaginated(paginated: JsonValue) {}
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
                override fun visitList(list: List<UnnamedSchemaWithArrayParent0>) =
                    list.sumOf { it.validity().toInt() }

                override fun visitEnumObjectResponse(enumObjectResponse: JsonValue) = 1

                override fun visitPaginated(paginated: JsonValue) = 1

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnumRetrieveResponse &&
            list == other.list &&
            enumObjectResponse == other.enumObjectResponse &&
            paginated == other.paginated
    }

    override fun hashCode(): Int = Objects.hash(list, enumObjectResponse, paginated)

    override fun toString(): String =
        when {
            list != null -> "EnumRetrieveResponse{list=$list}"
            enumObjectResponse != null ->
                "EnumRetrieveResponse{enumObjectResponse=$enumObjectResponse}"
            paginated != null -> "EnumRetrieveResponse{paginated=$paginated}"
            _json != null -> "EnumRetrieveResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EnumRetrieveResponse")
        }

    companion object {

        @JvmStatic
        fun ofList(list: List<UnnamedSchemaWithArrayParent0>) =
            EnumRetrieveResponse(list = list.toImmutable())

        @JvmStatic
        fun ofEnumObjectResponse(enumObjectResponse: JsonValue) =
            EnumRetrieveResponse(enumObjectResponse = enumObjectResponse)

        @JvmStatic
        fun ofPaginated(paginated: JsonValue) = EnumRetrieveResponse(paginated = paginated)
    }

    /**
     * An interface that defines how to map each variant of [EnumRetrieveResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitList(list: List<UnnamedSchemaWithArrayParent0>): T

        fun visitEnumObjectResponse(enumObjectResponse: JsonValue): T

        fun visitPaginated(paginated: JsonValue): T

        /**
         * Maps an unknown variant of [EnumRetrieveResponse] to a value of type [T].
         *
         * An instance of [EnumRetrieveResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown EnumRetrieveResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<EnumRetrieveResponse>(EnumRetrieveResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EnumRetrieveResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<List<UnnamedSchemaWithArrayParent0>>())
                            ?.let { EnumRetrieveResponse(list = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                            EnumRetrieveResponse(enumObjectResponse = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                            EnumRetrieveResponse(paginated = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants.
                0 -> EnumRetrieveResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<EnumRetrieveResponse>(EnumRetrieveResponse::class) {

        override fun serialize(
            value: EnumRetrieveResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.list != null -> generator.writeObject(value.list)
                value.enumObjectResponse != null -> generator.writeObject(value.enumObjectResponse)
                value.paginated != null -> generator.writeObject(value.paginated)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EnumRetrieveResponse")
            }
        }
    }

    @JsonDeserialize(using = UnnamedSchemaWithArrayParent0.Deserializer::class)
    @JsonSerialize(using = UnnamedSchemaWithArrayParent0.Serializer::class)
    class UnnamedSchemaWithArrayParent0
    private constructor(
        private val string: String? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun isString(): Boolean = string != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): UnnamedSchemaWithArrayParent0 = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitJsonValue(jsonValue: JsonValue) {}
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnnamedSchemaWithArrayParent0 &&
                string == other.string &&
                jsonValue == other.jsonValue
        }

        override fun hashCode(): Int = Objects.hash(string, jsonValue)

        override fun toString(): String =
            when {
                string != null -> "UnnamedSchemaWithArrayParent0{string=$string}"
                jsonValue != null -> "UnnamedSchemaWithArrayParent0{jsonValue=$jsonValue}"
                _json != null -> "UnnamedSchemaWithArrayParent0{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent0")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = UnnamedSchemaWithArrayParent0(string = string)

            @JvmStatic
            fun ofJsonValue(jsonValue: JsonValue) =
                UnnamedSchemaWithArrayParent0(jsonValue = jsonValue)
        }

        /**
         * An interface that defines how to map each variant of [UnnamedSchemaWithArrayParent0] to a
         * value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitJsonValue(jsonValue: JsonValue): T

            /**
             * Maps an unknown variant of [UnnamedSchemaWithArrayParent0] to a value of type [T].
             *
             * An instance of [UnnamedSchemaWithArrayParent0] can contain an unknown variant if it
             * was deserialized from data that doesn't match any known variant. For example, if the
             * SDK is on an older version than the API, then the API may respond with new variants
             * that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown UnnamedSchemaWithArrayParent0: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<UnnamedSchemaWithArrayParent0>(UnnamedSchemaWithArrayParent0::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): UnnamedSchemaWithArrayParent0 {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                UnnamedSchemaWithArrayParent0(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                UnnamedSchemaWithArrayParent0(jsonValue = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> UnnamedSchemaWithArrayParent0(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<UnnamedSchemaWithArrayParent0>(UnnamedSchemaWithArrayParent0::class) {

            override fun serialize(
                value: UnnamedSchemaWithArrayParent0,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent0")
                }
            }
        }
    }
}
