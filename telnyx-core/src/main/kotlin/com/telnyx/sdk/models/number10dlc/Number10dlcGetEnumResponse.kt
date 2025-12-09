// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc

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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = Number10dlcGetEnumResponse.Deserializer::class)
@JsonSerialize(using = Number10dlcGetEnumResponse.Serializer::class)
class Number10dlcGetEnumResponse
private constructor(
    private val enumStringList: List<String>? = null,
    private val enumObjectList: List<UnnamedSchemaWithArrayParent0>? = null,
    private val enumObjectToString: EnumObjectToStringResponse? = null,
    private val enumObjecToObjectt: EnumObjecToObjecttResponse? = null,
    private val enumPaginated: EnumPaginatedResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun enumStringList(): Optional<List<String>> = Optional.ofNullable(enumStringList)

    fun enumObjectList(): Optional<List<UnnamedSchemaWithArrayParent0>> =
        Optional.ofNullable(enumObjectList)

    fun enumObjectToString(): Optional<EnumObjectToStringResponse> =
        Optional.ofNullable(enumObjectToString)

    fun enumObjecToObjectt(): Optional<EnumObjecToObjecttResponse> =
        Optional.ofNullable(enumObjecToObjectt)

    fun enumPaginated(): Optional<EnumPaginatedResponse> = Optional.ofNullable(enumPaginated)

    fun isEnumStringList(): Boolean = enumStringList != null

    fun isEnumObjectList(): Boolean = enumObjectList != null

    fun isEnumObjectToString(): Boolean = enumObjectToString != null

    fun isEnumObjecToObjectt(): Boolean = enumObjecToObjectt != null

    fun isEnumPaginated(): Boolean = enumPaginated != null

    fun asEnumStringList(): List<String> = enumStringList.getOrThrow("enumStringList")

    fun asEnumObjectList(): List<UnnamedSchemaWithArrayParent0> =
        enumObjectList.getOrThrow("enumObjectList")

    fun asEnumObjectToString(): EnumObjectToStringResponse =
        enumObjectToString.getOrThrow("enumObjectToString")

    fun asEnumObjecToObjectt(): EnumObjecToObjecttResponse =
        enumObjecToObjectt.getOrThrow("enumObjecToObjectt")

    fun asEnumPaginated(): EnumPaginatedResponse = enumPaginated.getOrThrow("enumPaginated")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            enumStringList != null -> visitor.visitEnumStringList(enumStringList)
            enumObjectList != null -> visitor.visitEnumObjectList(enumObjectList)
            enumObjectToString != null -> visitor.visitEnumObjectToString(enumObjectToString)
            enumObjecToObjectt != null -> visitor.visitEnumObjecToObjectt(enumObjecToObjectt)
            enumPaginated != null -> visitor.visitEnumPaginated(enumPaginated)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Number10dlcGetEnumResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitEnumStringList(enumStringList: List<String>) {}

                override fun visitEnumObjectList(
                    enumObjectList: List<UnnamedSchemaWithArrayParent0>
                ) {
                    enumObjectList.forEach { it.validate() }
                }

                override fun visitEnumObjectToString(
                    enumObjectToString: EnumObjectToStringResponse
                ) {
                    enumObjectToString.validate()
                }

                override fun visitEnumObjecToObjectt(
                    enumObjecToObjectt: EnumObjecToObjecttResponse
                ) {
                    enumObjecToObjectt.validate()
                }

                override fun visitEnumPaginated(enumPaginated: EnumPaginatedResponse) {
                    enumPaginated.validate()
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
                override fun visitEnumStringList(enumStringList: List<String>) = enumStringList.size

                override fun visitEnumObjectList(
                    enumObjectList: List<UnnamedSchemaWithArrayParent0>
                ) = enumObjectList.sumOf { it.validity().toInt() }

                override fun visitEnumObjectToString(
                    enumObjectToString: EnumObjectToStringResponse
                ) = enumObjectToString.validity()

                override fun visitEnumObjecToObjectt(
                    enumObjecToObjectt: EnumObjecToObjecttResponse
                ) = enumObjecToObjectt.validity()

                override fun visitEnumPaginated(enumPaginated: EnumPaginatedResponse) =
                    enumPaginated.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Number10dlcGetEnumResponse &&
            enumStringList == other.enumStringList &&
            enumObjectList == other.enumObjectList &&
            enumObjectToString == other.enumObjectToString &&
            enumObjecToObjectt == other.enumObjecToObjectt &&
            enumPaginated == other.enumPaginated
    }

    override fun hashCode(): Int =
        Objects.hash(
            enumStringList,
            enumObjectList,
            enumObjectToString,
            enumObjecToObjectt,
            enumPaginated,
        )

    override fun toString(): String =
        when {
            enumStringList != null -> "Number10dlcGetEnumResponse{enumStringList=$enumStringList}"
            enumObjectList != null -> "Number10dlcGetEnumResponse{enumObjectList=$enumObjectList}"
            enumObjectToString != null ->
                "Number10dlcGetEnumResponse{enumObjectToString=$enumObjectToString}"
            enumObjecToObjectt != null ->
                "Number10dlcGetEnumResponse{enumObjecToObjectt=$enumObjecToObjectt}"
            enumPaginated != null -> "Number10dlcGetEnumResponse{enumPaginated=$enumPaginated}"
            _json != null -> "Number10dlcGetEnumResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Number10dlcGetEnumResponse")
        }

    companion object {

        @JvmStatic
        fun ofEnumStringList(enumStringList: List<String>) =
            Number10dlcGetEnumResponse(enumStringList = enumStringList.toImmutable())

        @JvmStatic
        fun ofEnumObjectList(enumObjectList: List<UnnamedSchemaWithArrayParent0>) =
            Number10dlcGetEnumResponse(enumObjectList = enumObjectList.toImmutable())

        @JvmStatic
        fun ofEnumObjectToString(enumObjectToString: EnumObjectToStringResponse) =
            Number10dlcGetEnumResponse(enumObjectToString = enumObjectToString)

        @JvmStatic
        fun ofEnumObjecToObjectt(enumObjecToObjectt: EnumObjecToObjecttResponse) =
            Number10dlcGetEnumResponse(enumObjecToObjectt = enumObjecToObjectt)

        @JvmStatic
        fun ofEnumPaginated(enumPaginated: EnumPaginatedResponse) =
            Number10dlcGetEnumResponse(enumPaginated = enumPaginated)
    }

    /**
     * An interface that defines how to map each variant of [Number10dlcGetEnumResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitEnumStringList(enumStringList: List<String>): T

        fun visitEnumObjectList(enumObjectList: List<UnnamedSchemaWithArrayParent0>): T

        fun visitEnumObjectToString(enumObjectToString: EnumObjectToStringResponse): T

        fun visitEnumObjecToObjectt(enumObjecToObjectt: EnumObjecToObjecttResponse): T

        fun visitEnumPaginated(enumPaginated: EnumPaginatedResponse): T

        /**
         * Maps an unknown variant of [Number10dlcGetEnumResponse] to a value of type [T].
         *
         * An instance of [Number10dlcGetEnumResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown Number10dlcGetEnumResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<Number10dlcGetEnumResponse>(Number10dlcGetEnumResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Number10dlcGetEnumResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<EnumObjectToStringResponse>())?.let {
                            Number10dlcGetEnumResponse(enumObjectToString = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<EnumObjecToObjecttResponse>())?.let {
                            Number10dlcGetEnumResponse(enumObjecToObjectt = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<EnumPaginatedResponse>())?.let {
                            Number10dlcGetEnumResponse(enumPaginated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                            Number10dlcGetEnumResponse(enumStringList = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<UnnamedSchemaWithArrayParent0>>())
                            ?.let { Number10dlcGetEnumResponse(enumObjectList = it, _json = json) },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Number10dlcGetEnumResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<Number10dlcGetEnumResponse>(Number10dlcGetEnumResponse::class) {

        override fun serialize(
            value: Number10dlcGetEnumResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.enumStringList != null -> generator.writeObject(value.enumStringList)
                value.enumObjectList != null -> generator.writeObject(value.enumObjectList)
                value.enumObjectToString != null -> generator.writeObject(value.enumObjectToString)
                value.enumObjecToObjectt != null -> generator.writeObject(value.enumObjecToObjectt)
                value.enumPaginated != null -> generator.writeObject(value.enumPaginated)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Number10dlcGetEnumResponse")
            }
        }
    }

    class UnnamedSchemaWithArrayParent0
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [UnnamedSchemaWithArrayParent0].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnnamedSchemaWithArrayParent0]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unnamedSchemaWithArrayParent0: UnnamedSchemaWithArrayParent0) =
                apply {
                    additionalProperties =
                        unnamedSchemaWithArrayParent0.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [UnnamedSchemaWithArrayParent0].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnnamedSchemaWithArrayParent0 =
                UnnamedSchemaWithArrayParent0(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): UnnamedSchemaWithArrayParent0 = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnnamedSchemaWithArrayParent0 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnnamedSchemaWithArrayParent0{additionalProperties=$additionalProperties}"
    }

    class EnumObjectToStringResponse
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [EnumObjectToStringResponse].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EnumObjectToStringResponse]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(enumObjectToStringResponse: EnumObjectToStringResponse) = apply {
                additionalProperties =
                    enumObjectToStringResponse.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [EnumObjectToStringResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EnumObjectToStringResponse =
                EnumObjectToStringResponse(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): EnumObjectToStringResponse = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EnumObjectToStringResponse &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EnumObjectToStringResponse{additionalProperties=$additionalProperties}"
    }

    class EnumObjecToObjecttResponse
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [EnumObjecToObjecttResponse].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EnumObjecToObjecttResponse]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(enumObjecToObjecttResponse: EnumObjecToObjecttResponse) = apply {
                additionalProperties =
                    enumObjecToObjecttResponse.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [EnumObjecToObjecttResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EnumObjecToObjecttResponse =
                EnumObjecToObjecttResponse(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): EnumObjecToObjecttResponse = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EnumObjecToObjecttResponse &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EnumObjecToObjecttResponse{additionalProperties=$additionalProperties}"
    }

    class EnumPaginatedResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val page: JsonField<Long>,
        private val records: JsonField<List<Record>>,
        private val totalRecords: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("records")
            @ExcludeMissing
            records: JsonField<List<Record>> = JsonMissing.of(),
            @JsonProperty("totalRecords")
            @ExcludeMissing
            totalRecords: JsonField<Long> = JsonMissing.of(),
        ) : this(page, records, totalRecords, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun page(): Long = page.getRequired("page")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun records(): List<Record> = records.getRequired("records")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalRecords(): Long = totalRecords.getRequired("totalRecords")

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [records].
         *
         * Unlike [records], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("records") @ExcludeMissing fun _records(): JsonField<List<Record>> = records

        /**
         * Returns the raw JSON value of [totalRecords].
         *
         * Unlike [totalRecords], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalRecords")
        @ExcludeMissing
        fun _totalRecords(): JsonField<Long> = totalRecords

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
             * Returns a mutable builder for constructing an instance of [EnumPaginatedResponse].
             *
             * The following fields are required:
             * ```java
             * .page()
             * .records()
             * .totalRecords()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EnumPaginatedResponse]. */
        class Builder internal constructor() {

            private var page: JsonField<Long>? = null
            private var records: JsonField<MutableList<Record>>? = null
            private var totalRecords: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(enumPaginatedResponse: EnumPaginatedResponse) = apply {
                page = enumPaginatedResponse.page
                records = enumPaginatedResponse.records.map { it.toMutableList() }
                totalRecords = enumPaginatedResponse.totalRecords
                additionalProperties = enumPaginatedResponse.additionalProperties.toMutableMap()
            }

            fun page(page: Long) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            fun records(records: List<Record>) = records(JsonField.of(records))

            /**
             * Sets [Builder.records] to an arbitrary JSON value.
             *
             * You should usually call [Builder.records] with a well-typed `List<Record>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun records(records: JsonField<List<Record>>) = apply {
                this.records = records.map { it.toMutableList() }
            }

            /**
             * Adds a single [Record] to [records].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRecord(record: Record) = apply {
                records =
                    (records ?: JsonField.of(mutableListOf())).also {
                        checkKnown("records", it).add(record)
                    }
            }

            fun totalRecords(totalRecords: Long) = totalRecords(JsonField.of(totalRecords))

            /**
             * Sets [Builder.totalRecords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRecords] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRecords(totalRecords: JsonField<Long>) = apply {
                this.totalRecords = totalRecords
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
             * Returns an immutable instance of [EnumPaginatedResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .page()
             * .records()
             * .totalRecords()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EnumPaginatedResponse =
                EnumPaginatedResponse(
                    checkRequired("page", page),
                    checkRequired("records", records).map { it.toImmutable() },
                    checkRequired("totalRecords", totalRecords),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EnumPaginatedResponse = apply {
            if (validated) {
                return@apply
            }

            page()
            records().forEach { it.validate() }
            totalRecords()
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
            (if (page.asKnown().isPresent) 1 else 0) +
                (records.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (totalRecords.asKnown().isPresent) 1 else 0)

        class Record
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Record]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Record]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(record: Record) = apply {
                    additionalProperties = record.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Record].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Record = Record(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Record = apply {
                if (validated) {
                    return@apply
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Record && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Record{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EnumPaginatedResponse &&
                page == other.page &&
                records == other.records &&
                totalRecords == other.totalRecords &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(page, records, totalRecords, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EnumPaginatedResponse{page=$page, records=$records, totalRecords=$totalRecords, additionalProperties=$additionalProperties}"
    }
}
