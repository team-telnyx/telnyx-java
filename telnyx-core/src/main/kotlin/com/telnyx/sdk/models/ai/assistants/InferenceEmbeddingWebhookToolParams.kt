// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InferenceEmbeddingWebhookToolParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val url: JsonField<String>,
    private val bodyParameters: JsonField<BodyParameters>,
    private val headers: JsonField<List<Header>>,
    private val method: JsonField<Method>,
    private val pathParameters: JsonField<PathParameters>,
    private val queryParameters: JsonField<QueryParameters>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("body_parameters")
        @ExcludeMissing
        bodyParameters: JsonField<BodyParameters> = JsonMissing.of(),
        @JsonProperty("headers")
        @ExcludeMissing
        headers: JsonField<List<Header>> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
        @JsonProperty("path_parameters")
        @ExcludeMissing
        pathParameters: JsonField<PathParameters> = JsonMissing.of(),
        @JsonProperty("query_parameters")
        @ExcludeMissing
        queryParameters: JsonField<QueryParameters> = JsonMissing.of(),
    ) : this(
        description,
        name,
        url,
        bodyParameters,
        headers,
        method,
        pathParameters,
        queryParameters,
        mutableMapOf(),
    )

    /**
     * The description of the tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The name of the tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The URL of the external tool to be called. This URL is going to be used by the assistant. The
     * URL can be templated like: `https://example.com/api/v1/{id}`, where `{id}` is a placeholder
     * for a value that will be provided by the assistant if `path_parameters` are provided with the
     * `id` attribute.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * The body parameters the webhook tool accepts, described as a JSON Schema object. These
     * parameters will be passed to the webhook as the body of the request. See the
     * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation
     * about the format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyParameters(): Optional<BodyParameters> = bodyParameters.getOptional("body_parameters")

    /**
     * The headers to be sent to the external tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<List<Header>> = headers.getOptional("headers")

    /**
     * The HTTP method to be used when calling the external tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun method(): Optional<Method> = method.getOptional("method")

    /**
     * The path parameters the webhook tool accepts, described as a JSON Schema object. These
     * parameters will be passed to the webhook as the path of the request if the URL contains a
     * placeholder for a value. See the
     * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation
     * about the format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pathParameters(): Optional<PathParameters> = pathParameters.getOptional("path_parameters")

    /**
     * The query parameters the webhook tool accepts, described as a JSON Schema object. These
     * parameters will be passed to the webhook as the query of the request. See the
     * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation
     * about the format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun queryParameters(): Optional<QueryParameters> =
        queryParameters.getOptional("query_parameters")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [bodyParameters].
     *
     * Unlike [bodyParameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("body_parameters")
    @ExcludeMissing
    fun _bodyParameters(): JsonField<BodyParameters> = bodyParameters

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<List<Header>> = headers

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

    /**
     * Returns the raw JSON value of [pathParameters].
     *
     * Unlike [pathParameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path_parameters")
    @ExcludeMissing
    fun _pathParameters(): JsonField<PathParameters> = pathParameters

    /**
     * Returns the raw JSON value of [queryParameters].
     *
     * Unlike [queryParameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query_parameters")
    @ExcludeMissing
    fun _queryParameters(): JsonField<QueryParameters> = queryParameters

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
         * Returns a mutable builder for constructing an instance of
         * [InferenceEmbeddingWebhookToolParams].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .name()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferenceEmbeddingWebhookToolParams]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var bodyParameters: JsonField<BodyParameters> = JsonMissing.of()
        private var headers: JsonField<MutableList<Header>>? = null
        private var method: JsonField<Method> = JsonMissing.of()
        private var pathParameters: JsonField<PathParameters> = JsonMissing.of()
        private var queryParameters: JsonField<QueryParameters> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferenceEmbeddingWebhookToolParams: InferenceEmbeddingWebhookToolParams
        ) = apply {
            description = inferenceEmbeddingWebhookToolParams.description
            name = inferenceEmbeddingWebhookToolParams.name
            url = inferenceEmbeddingWebhookToolParams.url
            bodyParameters = inferenceEmbeddingWebhookToolParams.bodyParameters
            headers = inferenceEmbeddingWebhookToolParams.headers.map { it.toMutableList() }
            method = inferenceEmbeddingWebhookToolParams.method
            pathParameters = inferenceEmbeddingWebhookToolParams.pathParameters
            queryParameters = inferenceEmbeddingWebhookToolParams.queryParameters
            additionalProperties =
                inferenceEmbeddingWebhookToolParams.additionalProperties.toMutableMap()
        }

        /** The description of the tool. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The name of the tool. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The URL of the external tool to be called. This URL is going to be used by the assistant.
         * The URL can be templated like: `https://example.com/api/v1/{id}`, where `{id}` is a
         * placeholder for a value that will be provided by the assistant if `path_parameters` are
         * provided with the `id` attribute.
         */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /**
         * The body parameters the webhook tool accepts, described as a JSON Schema object. These
         * parameters will be passed to the webhook as the body of the request. See the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
         */
        fun bodyParameters(bodyParameters: BodyParameters) =
            bodyParameters(JsonField.of(bodyParameters))

        /**
         * Sets [Builder.bodyParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyParameters] with a well-typed [BodyParameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyParameters(bodyParameters: JsonField<BodyParameters>) = apply {
            this.bodyParameters = bodyParameters
        }

        /** The headers to be sent to the external tool. */
        fun headers(headers: List<Header>) = headers(JsonField.of(headers))

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed `List<Header>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headers(headers: JsonField<List<Header>>) = apply {
            this.headers = headers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Header] to [headers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHeader(header: Header) = apply {
            headers =
                (headers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("headers", it).add(header)
                }
        }

        /** The HTTP method to be used when calling the external tool. */
        fun method(method: Method) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Method] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<Method>) = apply { this.method = method }

        /**
         * The path parameters the webhook tool accepts, described as a JSON Schema object. These
         * parameters will be passed to the webhook as the path of the request if the URL contains a
         * placeholder for a value. See the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
         */
        fun pathParameters(pathParameters: PathParameters) =
            pathParameters(JsonField.of(pathParameters))

        /**
         * Sets [Builder.pathParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pathParameters] with a well-typed [PathParameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pathParameters(pathParameters: JsonField<PathParameters>) = apply {
            this.pathParameters = pathParameters
        }

        /**
         * The query parameters the webhook tool accepts, described as a JSON Schema object. These
         * parameters will be passed to the webhook as the query of the request. See the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
         */
        fun queryParameters(queryParameters: QueryParameters) =
            queryParameters(JsonField.of(queryParameters))

        /**
         * Sets [Builder.queryParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queryParameters] with a well-typed [QueryParameters]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun queryParameters(queryParameters: JsonField<QueryParameters>) = apply {
            this.queryParameters = queryParameters
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
         * Returns an immutable instance of [InferenceEmbeddingWebhookToolParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .name()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InferenceEmbeddingWebhookToolParams =
            InferenceEmbeddingWebhookToolParams(
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("url", url),
                bodyParameters,
                (headers ?: JsonMissing.of()).map { it.toImmutable() },
                method,
                pathParameters,
                queryParameters,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InferenceEmbeddingWebhookToolParams = apply {
        if (validated) {
            return@apply
        }

        description()
        name()
        url()
        bodyParameters().ifPresent { it.validate() }
        headers().ifPresent { it.forEach { it.validate() } }
        method().ifPresent { it.validate() }
        pathParameters().ifPresent { it.validate() }
        queryParameters().ifPresent { it.validate() }
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (bodyParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (headers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (method.asKnown().getOrNull()?.validity() ?: 0) +
            (pathParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (queryParameters.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The body parameters the webhook tool accepts, described as a JSON Schema object. These
     * parameters will be passed to the webhook as the body of the request. See the
     * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation
     * about the format
     */
    class BodyParameters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val properties: JsonField<Properties>,
        private val required: JsonField<List<String>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("required")
            @ExcludeMissing
            required: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(properties, required, type, mutableMapOf())

        /**
         * The properties of the body parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * The required properties of the body parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun required(): Optional<List<String>> = required.getOptional("required")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /**
         * Returns the raw JSON value of [required].
         *
         * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("required")
        @ExcludeMissing
        fun _required(): JsonField<List<String>> = required

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

            /** Returns a mutable builder for constructing an instance of [BodyParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BodyParameters]. */
        class Builder internal constructor() {

            private var properties: JsonField<Properties> = JsonMissing.of()
            private var required: JsonField<MutableList<String>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bodyParameters: BodyParameters) = apply {
                properties = bodyParameters.properties
                required = bodyParameters.required.map { it.toMutableList() }
                type = bodyParameters.type
                additionalProperties = bodyParameters.additionalProperties.toMutableMap()
            }

            /** The properties of the body parameters. */
            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /** The required properties of the body parameters. */
            fun required(required: List<String>) = required(JsonField.of(required))

            /**
             * Sets [Builder.required] to an arbitrary JSON value.
             *
             * You should usually call [Builder.required] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun required(required: JsonField<List<String>>) = apply {
                this.required = required.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.required].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequired(required: String) = apply {
                this.required =
                    (this.required ?: JsonField.of(mutableListOf())).also {
                        checkKnown("required", it).add(required)
                    }
            }

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
             * Returns an immutable instance of [BodyParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BodyParameters =
                BodyParameters(
                    properties,
                    (required ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BodyParameters = apply {
            if (validated) {
                return@apply
            }

            properties().ifPresent { it.validate() }
            required()
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
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (required.asKnown().getOrNull()?.size ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** The properties of the body parameters. */
        class Properties
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

                /** Returns a mutable builder for constructing an instance of [Properties]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    additionalProperties = properties.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties = Properties(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
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

                return other is Properties && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Properties{additionalProperties=$additionalProperties}"
        }

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

                @JvmField val OBJECT = of("object")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OBJECT
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
                OBJECT,
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
                    OBJECT -> Value.OBJECT
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
                    OBJECT -> Known.OBJECT
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

            return other is BodyParameters &&
                properties == other.properties &&
                required == other.required &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(properties, required, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BodyParameters{properties=$properties, required=$required, type=$type, additionalProperties=$additionalProperties}"
    }

    class Header
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(name, value, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The value of the header. Note that we support mustache templating for the value. For
         * example you can use `Bearer {{#integration_secret}}test-secret{{/integration_secret}}` to
         * pass the value of the integration secret as the bearer token.
         * [Telnyx signature headers](https://developers.telnyx.com/docs/voice/programmable-voice/voice-api-webhooks)
         * will be automatically added to the request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /** Returns a mutable builder for constructing an instance of [Header]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Header]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(header: Header) = apply {
                name = header.name
                value = header.value
                additionalProperties = header.additionalProperties.toMutableMap()
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

            /**
             * The value of the header. Note that we support mustache templating for the value. For
             * example you can use `Bearer
             * {{#integration_secret}}test-secret{{/integration_secret}}` to pass the value of the
             * integration secret as the bearer token.
             * [Telnyx signature headers](https://developers.telnyx.com/docs/voice/programmable-voice/voice-api-webhooks)
             * will be automatically added to the request.
             */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Header].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Header = Header(name, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Header = apply {
            if (validated) {
                return@apply
            }

            name()
            value()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Header &&
                name == other.name &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Header{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    /** The HTTP method to be used when calling the external tool. */
    class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmField val PUT = of("PUT")

            @JvmField val DELETE = of("DELETE")

            @JvmField val PATCH = of("PATCH")

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        /** An enum containing [Method]'s known values. */
        enum class Known {
            GET,
            POST,
            PUT,
            DELETE,
            PATCH,
        }

        /**
         * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Method] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            PUT,
            DELETE,
            PATCH,
            /** An enum member indicating that [Method] was instantiated with an unknown value. */
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
                GET -> Value.GET
                POST -> Value.POST
                PUT -> Value.PUT
                DELETE -> Value.DELETE
                PATCH -> Value.PATCH
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
                GET -> Known.GET
                POST -> Known.POST
                PUT -> Known.PUT
                DELETE -> Known.DELETE
                PATCH -> Known.PATCH
                else -> throw TelnyxInvalidDataException("Unknown Method: $value")
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

        fun validate(): Method = apply {
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

            return other is Method && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The path parameters the webhook tool accepts, described as a JSON Schema object. These
     * parameters will be passed to the webhook as the path of the request if the URL contains a
     * placeholder for a value. See the
     * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation
     * about the format
     */
    class PathParameters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val properties: JsonField<Properties>,
        private val required: JsonField<List<String>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("required")
            @ExcludeMissing
            required: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(properties, required, type, mutableMapOf())

        /**
         * The properties of the path parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * The required properties of the path parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun required(): Optional<List<String>> = required.getOptional("required")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /**
         * Returns the raw JSON value of [required].
         *
         * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("required")
        @ExcludeMissing
        fun _required(): JsonField<List<String>> = required

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

            /** Returns a mutable builder for constructing an instance of [PathParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PathParameters]. */
        class Builder internal constructor() {

            private var properties: JsonField<Properties> = JsonMissing.of()
            private var required: JsonField<MutableList<String>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pathParameters: PathParameters) = apply {
                properties = pathParameters.properties
                required = pathParameters.required.map { it.toMutableList() }
                type = pathParameters.type
                additionalProperties = pathParameters.additionalProperties.toMutableMap()
            }

            /** The properties of the path parameters. */
            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /** The required properties of the path parameters. */
            fun required(required: List<String>) = required(JsonField.of(required))

            /**
             * Sets [Builder.required] to an arbitrary JSON value.
             *
             * You should usually call [Builder.required] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun required(required: JsonField<List<String>>) = apply {
                this.required = required.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.required].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequired(required: String) = apply {
                this.required =
                    (this.required ?: JsonField.of(mutableListOf())).also {
                        checkKnown("required", it).add(required)
                    }
            }

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
             * Returns an immutable instance of [PathParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PathParameters =
                PathParameters(
                    properties,
                    (required ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PathParameters = apply {
            if (validated) {
                return@apply
            }

            properties().ifPresent { it.validate() }
            required()
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
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (required.asKnown().getOrNull()?.size ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** The properties of the path parameters. */
        class Properties
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

                /** Returns a mutable builder for constructing an instance of [Properties]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    additionalProperties = properties.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties = Properties(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
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

                return other is Properties && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Properties{additionalProperties=$additionalProperties}"
        }

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

                @JvmField val OBJECT = of("object")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OBJECT
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
                OBJECT,
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
                    OBJECT -> Value.OBJECT
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
                    OBJECT -> Known.OBJECT
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

            return other is PathParameters &&
                properties == other.properties &&
                required == other.required &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(properties, required, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PathParameters{properties=$properties, required=$required, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * The query parameters the webhook tool accepts, described as a JSON Schema object. These
     * parameters will be passed to the webhook as the query of the request. See the
     * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation
     * about the format
     */
    class QueryParameters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val properties: JsonField<Properties>,
        private val required: JsonField<List<String>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("required")
            @ExcludeMissing
            required: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(properties, required, type, mutableMapOf())

        /**
         * The properties of the query parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * The required properties of the query parameters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun required(): Optional<List<String>> = required.getOptional("required")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /**
         * Returns the raw JSON value of [required].
         *
         * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("required")
        @ExcludeMissing
        fun _required(): JsonField<List<String>> = required

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

            /** Returns a mutable builder for constructing an instance of [QueryParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [QueryParameters]. */
        class Builder internal constructor() {

            private var properties: JsonField<Properties> = JsonMissing.of()
            private var required: JsonField<MutableList<String>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(queryParameters: QueryParameters) = apply {
                properties = queryParameters.properties
                required = queryParameters.required.map { it.toMutableList() }
                type = queryParameters.type
                additionalProperties = queryParameters.additionalProperties.toMutableMap()
            }

            /** The properties of the query parameters. */
            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /** The required properties of the query parameters. */
            fun required(required: List<String>) = required(JsonField.of(required))

            /**
             * Sets [Builder.required] to an arbitrary JSON value.
             *
             * You should usually call [Builder.required] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun required(required: JsonField<List<String>>) = apply {
                this.required = required.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.required].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequired(required: String) = apply {
                this.required =
                    (this.required ?: JsonField.of(mutableListOf())).also {
                        checkKnown("required", it).add(required)
                    }
            }

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
             * Returns an immutable instance of [QueryParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): QueryParameters =
                QueryParameters(
                    properties,
                    (required ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): QueryParameters = apply {
            if (validated) {
                return@apply
            }

            properties().ifPresent { it.validate() }
            required()
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
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (required.asKnown().getOrNull()?.size ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** The properties of the query parameters. */
        class Properties
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

                /** Returns a mutable builder for constructing an instance of [Properties]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    additionalProperties = properties.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties = Properties(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
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

                return other is Properties && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Properties{additionalProperties=$additionalProperties}"
        }

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

                @JvmField val OBJECT = of("object")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OBJECT
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
                OBJECT,
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
                    OBJECT -> Value.OBJECT
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
                    OBJECT -> Known.OBJECT
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

            return other is QueryParameters &&
                properties == other.properties &&
                required == other.required &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(properties, required, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "QueryParameters{properties=$properties, required=$required, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferenceEmbeddingWebhookToolParams &&
            description == other.description &&
            name == other.name &&
            url == other.url &&
            bodyParameters == other.bodyParameters &&
            headers == other.headers &&
            method == other.method &&
            pathParameters == other.pathParameters &&
            queryParameters == other.queryParameters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            name,
            url,
            bodyParameters,
            headers,
            method,
            pathParameters,
            queryParameters,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceEmbeddingWebhookToolParams{description=$description, name=$name, url=$url, bodyParameters=$bodyParameters, headers=$headers, method=$method, pathParameters=$pathParameters, queryParameters=$queryParameters, additionalProperties=$additionalProperties}"
}
