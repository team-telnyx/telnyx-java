// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InsightTemplate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val instructions: JsonField<String>,
    private val insightType: JsonField<InsightType>,
    private val jsonSchema: JsonField<JsonSchema>,
    private val name: JsonField<String>,
    private val webhook: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("insight_type")
        @ExcludeMissing
        insightType: JsonField<InsightType> = JsonMissing.of(),
        @JsonProperty("json_schema")
        @ExcludeMissing
        jsonSchema: JsonField<JsonSchema> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook") @ExcludeMissing webhook: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, instructions, insightType, jsonSchema, name, webhook, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructions(): String = instructions.getRequired("instructions")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun insightType(): Optional<InsightType> = insightType.getOptional("insight_type")

    /**
     * If specified, the output will follow the JSON schema.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jsonSchema(): Optional<JsonSchema> = jsonSchema.getOptional("json_schema")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhook(): Optional<String> = webhook.getOptional("webhook")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /**
     * Returns the raw JSON value of [insightType].
     *
     * Unlike [insightType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insight_type")
    @ExcludeMissing
    fun _insightType(): JsonField<InsightType> = insightType

    /**
     * Returns the raw JSON value of [jsonSchema].
     *
     * Unlike [jsonSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("json_schema")
    @ExcludeMissing
    fun _jsonSchema(): JsonField<JsonSchema> = jsonSchema

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [webhook].
     *
     * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<String> = webhook

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
         * Returns a mutable builder for constructing an instance of [InsightTemplate].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .instructions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsightTemplate]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var instructions: JsonField<String>? = null
        private var insightType: JsonField<InsightType> = JsonMissing.of()
        private var jsonSchema: JsonField<JsonSchema> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var webhook: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insightTemplate: InsightTemplate) = apply {
            id = insightTemplate.id
            createdAt = insightTemplate.createdAt
            instructions = insightTemplate.instructions
            insightType = insightTemplate.insightType
            jsonSchema = insightTemplate.jsonSchema
            name = insightTemplate.name
            webhook = insightTemplate.webhook
            additionalProperties = insightTemplate.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        fun insightType(insightType: InsightType) = insightType(JsonField.of(insightType))

        /**
         * Sets [Builder.insightType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insightType] with a well-typed [InsightType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun insightType(insightType: JsonField<InsightType>) = apply {
            this.insightType = insightType
        }

        /** If specified, the output will follow the JSON schema. */
        fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

        /**
         * Sets [Builder.jsonSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jsonSchema] with a well-typed [JsonSchema] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply { this.jsonSchema = jsonSchema }

        /** Alias for calling [jsonSchema] with `JsonSchema.ofString(string)`. */
        fun jsonSchema(string: String) = jsonSchema(JsonSchema.ofString(string))

        /**
         * Alias for calling [jsonSchema] with `JsonSchema.ofJsonSchemaObject(jsonSchemaObject)`.
         */
        fun jsonSchema(jsonSchemaObject: JsonSchema.JsonSchemaObject) =
            jsonSchema(JsonSchema.ofJsonSchemaObject(jsonSchemaObject))

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun webhook(webhook: String) = webhook(JsonField.of(webhook))

        /**
         * Sets [Builder.webhook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhook] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun webhook(webhook: JsonField<String>) = apply { this.webhook = webhook }

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
         * Returns an immutable instance of [InsightTemplate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .instructions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InsightTemplate =
            InsightTemplate(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("instructions", instructions),
                insightType,
                jsonSchema,
                name,
                webhook,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InsightTemplate = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        instructions()
        insightType().ifPresent { it.validate() }
        jsonSchema().ifPresent { it.validate() }
        name()
        webhook()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (insightType.asKnown().getOrNull()?.validity() ?: 0) +
            (jsonSchema.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (webhook.asKnown().isPresent) 1 else 0)

    class InsightType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CUSTOM = of("custom")

            @JvmField val DEFAULT = of("default")

            @JvmStatic fun of(value: String) = InsightType(JsonField.of(value))
        }

        /** An enum containing [InsightType]'s known values. */
        enum class Known {
            CUSTOM,
            DEFAULT,
        }

        /**
         * An enum containing [InsightType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InsightType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOM,
            DEFAULT,
            /**
             * An enum member indicating that [InsightType] was instantiated with an unknown value.
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
                CUSTOM -> Value.CUSTOM
                DEFAULT -> Value.DEFAULT
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
                CUSTOM -> Known.CUSTOM
                DEFAULT -> Known.DEFAULT
                else -> throw TelnyxInvalidDataException("Unknown InsightType: $value")
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

        fun validate(): InsightType = apply {
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

            return other is InsightType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If specified, the output will follow the JSON schema. */
    @JsonDeserialize(using = JsonSchema.Deserializer::class)
    @JsonSerialize(using = JsonSchema.Serializer::class)
    class JsonSchema
    private constructor(
        private val string: String? = null,
        private val jsonSchemaObject: JsonSchemaObject? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun jsonSchemaObject(): Optional<JsonSchemaObject> = Optional.ofNullable(jsonSchemaObject)

        fun isString(): Boolean = string != null

        fun isJsonSchemaObject(): Boolean = jsonSchemaObject != null

        fun asString(): String = string.getOrThrow("string")

        fun asJsonSchemaObject(): JsonSchemaObject = jsonSchemaObject.getOrThrow("jsonSchemaObject")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                jsonSchemaObject != null -> visitor.visitJsonSchemaObject(jsonSchemaObject)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): JsonSchema = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitJsonSchemaObject(jsonSchemaObject: JsonSchemaObject) {
                        jsonSchemaObject.validate()
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

                    override fun visitJsonSchemaObject(jsonSchemaObject: JsonSchemaObject) =
                        jsonSchemaObject.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is JsonSchema &&
                string == other.string &&
                jsonSchemaObject == other.jsonSchemaObject
        }

        override fun hashCode(): Int = Objects.hash(string, jsonSchemaObject)

        override fun toString(): String =
            when {
                string != null -> "JsonSchema{string=$string}"
                jsonSchemaObject != null -> "JsonSchema{jsonSchemaObject=$jsonSchemaObject}"
                _json != null -> "JsonSchema{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid JsonSchema")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = JsonSchema(string = string)

            @JvmStatic
            fun ofJsonSchemaObject(jsonSchemaObject: JsonSchemaObject) =
                JsonSchema(jsonSchemaObject = jsonSchemaObject)
        }

        /**
         * An interface that defines how to map each variant of [JsonSchema] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitJsonSchemaObject(jsonSchemaObject: JsonSchemaObject): T

            /**
             * Maps an unknown variant of [JsonSchema] to a value of type [T].
             *
             * An instance of [JsonSchema] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown JsonSchema: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<JsonSchema>(JsonSchema::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): JsonSchema {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<JsonSchemaObject>())?.let {
                                JsonSchema(jsonSchemaObject = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                JsonSchema(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> JsonSchema(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<JsonSchema>(JsonSchema::class) {

            override fun serialize(
                value: JsonSchema,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonSchemaObject != null -> generator.writeObject(value.jsonSchemaObject)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid JsonSchema")
                }
            }
        }

        class JsonSchemaObject
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

                /** Returns a mutable builder for constructing an instance of [JsonSchemaObject]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [JsonSchemaObject]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(jsonSchemaObject: JsonSchemaObject) = apply {
                    additionalProperties = jsonSchemaObject.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [JsonSchemaObject].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): JsonSchemaObject = JsonSchemaObject(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): JsonSchemaObject = apply {
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

                return other is JsonSchemaObject &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "JsonSchemaObject{additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightTemplate &&
            id == other.id &&
            createdAt == other.createdAt &&
            instructions == other.instructions &&
            insightType == other.insightType &&
            jsonSchema == other.jsonSchema &&
            name == other.name &&
            webhook == other.webhook &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            instructions,
            insightType,
            jsonSchema,
            name,
            webhook,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsightTemplate{id=$id, createdAt=$createdAt, instructions=$instructions, insightType=$insightType, jsonSchema=$jsonSchema, name=$name, webhook=$webhook, additionalProperties=$additionalProperties}"
}
