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
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new insight */
class InsightCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructions(): String = body.instructions()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * If specified, the output will follow the JSON schema.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jsonSchema(): Optional<JsonSchema> = body.jsonSchema()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhook(): Optional<String> = body.webhook()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [jsonSchema].
     *
     * Unlike [jsonSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jsonSchema(): JsonField<JsonSchema> = body._jsonSchema()

    /**
     * Returns the raw JSON value of [webhook].
     *
     * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhook(): JsonField<String> = body._webhook()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InsightCreateParams].
         *
         * The following fields are required:
         * ```java
         * .instructions()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsightCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(insightCreateParams: InsightCreateParams) = apply {
            body = insightCreateParams.body.toBuilder()
            additionalHeaders = insightCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = insightCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [instructions]
         * - [name]
         * - [jsonSchema]
         * - [webhook]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun instructions(instructions: String) = apply { body.instructions(instructions) }

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            body.instructions(instructions)
        }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** If specified, the output will follow the JSON schema. */
        fun jsonSchema(jsonSchema: JsonSchema) = apply { body.jsonSchema(jsonSchema) }

        /**
         * Sets [Builder.jsonSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jsonSchema] with a well-typed [JsonSchema] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply { body.jsonSchema(jsonSchema) }

        /** Alias for calling [jsonSchema] with `JsonSchema.ofString(string)`. */
        fun jsonSchema(string: String) = apply { body.jsonSchema(string) }

        /**
         * Alias for calling [jsonSchema] with `JsonSchema.ofJsonSchemaObject(jsonSchemaObject)`.
         */
        fun jsonSchema(jsonSchemaObject: JsonValue) = apply { body.jsonSchema(jsonSchemaObject) }

        fun webhook(webhook: String) = apply { body.webhook(webhook) }

        /**
         * Sets [Builder.webhook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhook] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun webhook(webhook: JsonField<String>) = apply { body.webhook(webhook) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [InsightCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instructions()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InsightCreateParams =
            InsightCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val instructions: JsonField<String>,
        private val name: JsonField<String>,
        private val jsonSchema: JsonField<JsonSchema>,
        private val webhook: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("json_schema")
            @ExcludeMissing
            jsonSchema: JsonField<JsonSchema> = JsonMissing.of(),
            @JsonProperty("webhook") @ExcludeMissing webhook: JsonField<String> = JsonMissing.of(),
        ) : this(instructions, name, jsonSchema, webhook, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instructions(): String = instructions.getRequired("instructions")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

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
        fun webhook(): Optional<String> = webhook.getOptional("webhook")

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [jsonSchema].
         *
         * Unlike [jsonSchema], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("json_schema")
        @ExcludeMissing
        fun _jsonSchema(): JsonField<JsonSchema> = jsonSchema

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .instructions()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var instructions: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var jsonSchema: JsonField<JsonSchema> = JsonMissing.of()
            private var webhook: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                instructions = body.instructions
                name = body.name
                jsonSchema = body.jsonSchema
                webhook = body.webhook
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun instructions(instructions: String) = instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** If specified, the output will follow the JSON schema. */
            fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

            /**
             * Sets [Builder.jsonSchema] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jsonSchema] with a well-typed [JsonSchema] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                this.jsonSchema = jsonSchema
            }

            /** Alias for calling [jsonSchema] with `JsonSchema.ofString(string)`. */
            fun jsonSchema(string: String) = jsonSchema(JsonSchema.ofString(string))

            /**
             * Alias for calling [jsonSchema] with
             * `JsonSchema.ofJsonSchemaObject(jsonSchemaObject)`.
             */
            fun jsonSchema(jsonSchemaObject: JsonValue) =
                jsonSchema(JsonSchema.ofJsonSchemaObject(jsonSchemaObject))

            fun webhook(webhook: String) = webhook(JsonField.of(webhook))

            /**
             * Sets [Builder.webhook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhook] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .instructions()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("instructions", instructions),
                    checkRequired("name", name),
                    jsonSchema,
                    webhook,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            instructions()
            name()
            jsonSchema().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (instructions.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (jsonSchema.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhook.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                instructions == other.instructions &&
                name == other.name &&
                jsonSchema == other.jsonSchema &&
                webhook == other.webhook &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(instructions, name, jsonSchema, webhook, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{instructions=$instructions, name=$name, jsonSchema=$jsonSchema, webhook=$webhook, additionalProperties=$additionalProperties}"
    }

    /** If specified, the output will follow the JSON schema. */
    @JsonDeserialize(using = JsonSchema.Deserializer::class)
    @JsonSerialize(using = JsonSchema.Serializer::class)
    class JsonSchema
    private constructor(
        private val string: String? = null,
        private val jsonSchemaObject: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun jsonSchemaObject(): Optional<JsonValue> = Optional.ofNullable(jsonSchemaObject)

        fun isString(): Boolean = string != null

        fun isJsonSchemaObject(): Boolean = jsonSchemaObject != null

        fun asString(): String = string.getOrThrow("string")

        fun asJsonSchemaObject(): JsonValue = jsonSchemaObject.getOrThrow("jsonSchemaObject")

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

                    override fun visitJsonSchemaObject(jsonSchemaObject: JsonValue) {}
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

                    override fun visitJsonSchemaObject(jsonSchemaObject: JsonValue) = 1

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
            fun ofJsonSchemaObject(jsonSchemaObject: JsonValue) =
                JsonSchema(jsonSchemaObject = jsonSchemaObject)
        }

        /**
         * An interface that defines how to map each variant of [JsonSchema] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitJsonSchemaObject(jsonSchemaObject: JsonValue): T

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
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                JsonSchema(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                JsonSchema(jsonSchemaObject = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InsightCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
