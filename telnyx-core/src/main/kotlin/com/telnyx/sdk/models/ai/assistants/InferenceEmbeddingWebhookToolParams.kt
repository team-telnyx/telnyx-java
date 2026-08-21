// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InferenceEmbeddingWebhookToolParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonField<Type>,
    private val webhook: JsonField<Webhook>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("webhook") @ExcludeMissing webhook: JsonField<Webhook> = JsonMissing.of(),
    ) : this(type, webhook, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhook(): Webhook = webhook.getRequired("webhook")

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [webhook].
     *
     * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<Webhook> = webhook

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
         * .type()
         * .webhook()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferenceEmbeddingWebhookToolParams]. */
    class Builder internal constructor() {

        private var type: JsonField<Type>? = null
        private var webhook: JsonField<Webhook>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferenceEmbeddingWebhookToolParams: InferenceEmbeddingWebhookToolParams
        ) = apply {
            type = inferenceEmbeddingWebhookToolParams.type
            webhook = inferenceEmbeddingWebhookToolParams.webhook
            additionalProperties =
                inferenceEmbeddingWebhookToolParams.additionalProperties.toMutableMap()
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun webhook(webhook: Webhook) = webhook(JsonField.of(webhook))

        /**
         * Sets [Builder.webhook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhook] with a well-typed [Webhook] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun webhook(webhook: JsonField<Webhook>) = apply { this.webhook = webhook }

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
         * .type()
         * .webhook()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InferenceEmbeddingWebhookToolParams =
            InferenceEmbeddingWebhookToolParams(
                checkRequired("type", type),
                checkRequired("webhook", webhook),
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): InferenceEmbeddingWebhookToolParams = apply {
        if (validated) {
            return@apply
        }

        type().validate()
        webhook().validate()
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
        (type.asKnown().getOrNull()?.validity() ?: 0) +
            (webhook.asKnown().getOrNull()?.validity() ?: 0)

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WEBHOOK = of("webhook")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WEBHOOK
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WEBHOOK,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                WEBHOOK -> Value.WEBHOOK
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
                WEBHOOK -> Known.WEBHOOK
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class Webhook
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val url: JsonField<String>,
        private val async: JsonField<Boolean>,
        private val asyncTimeoutMs: JsonField<Long>,
        private val bodyParameters: JsonField<BodyParameters>,
        private val headers: JsonField<List<Header>>,
        private val messages: JsonField<List<Message>>,
        private val method: JsonField<Method>,
        private val pathParameters: JsonField<PathParameters>,
        private val queryParameters: JsonField<QueryParameters>,
        private val storeFieldsAsVariables: JsonField<List<StoreFieldsAsVariable>>,
        private val timeoutMs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("async") @ExcludeMissing async: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("async_timeout_ms")
            @ExcludeMissing
            asyncTimeoutMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("body_parameters")
            @ExcludeMissing
            bodyParameters: JsonField<BodyParameters> = JsonMissing.of(),
            @JsonProperty("headers")
            @ExcludeMissing
            headers: JsonField<List<Header>> = JsonMissing.of(),
            @JsonProperty("messages")
            @ExcludeMissing
            messages: JsonField<List<Message>> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
            @JsonProperty("path_parameters")
            @ExcludeMissing
            pathParameters: JsonField<PathParameters> = JsonMissing.of(),
            @JsonProperty("query_parameters")
            @ExcludeMissing
            queryParameters: JsonField<QueryParameters> = JsonMissing.of(),
            @JsonProperty("store_fields_as_variables")
            @ExcludeMissing
            storeFieldsAsVariables: JsonField<List<StoreFieldsAsVariable>> = JsonMissing.of(),
            @JsonProperty("timeout_ms")
            @ExcludeMissing
            timeoutMs: JsonField<Long> = JsonMissing.of(),
        ) : this(
            description,
            name,
            url,
            async,
            asyncTimeoutMs,
            bodyParameters,
            headers,
            messages,
            method,
            pathParameters,
            queryParameters,
            storeFieldsAsVariables,
            timeoutMs,
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
         * The URL of the external tool to be called. This URL is going to be used by the assistant.
         * The URL can be templated like: `https://example.com/api/v1/{id}`, where `{id}` is a
         * placeholder for a value that will be provided by the assistant if `path_parameters` are
         * provided with the `id` attribute.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * If async, the assistant will move forward without waiting for your server to respond.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun async(): Optional<Boolean> = async.getOptional("async")

        /**
         * Maximum time in milliseconds that the conversation worker waits for an async webhook
         * response before returning "Submitted" to the LLM. If unset, the platform default
         * (currently 300ms) is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun asyncTimeoutMs(): Optional<Long> = asyncTimeoutMs.getOptional("async_timeout_ms")

        /**
         * The body parameters the webhook tool accepts, described as a JSON Schema object. These
         * parameters will be passed to the webhook as the body of the request. See the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyParameters(): Optional<BodyParameters> =
            bodyParameters.getOptional("body_parameters")

        /**
         * The headers to be sent to the external tool.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun headers(): Optional<List<Header>> = headers.getOptional("headers")

        /**
         * Filler messages spoken while a synchronous webhook request is in progress.
         * `request_start` messages are spoken immediately when the request begins.
         * `request_response_delayed` messages are spoken after `timing_ms` has elapsed only if the
         * webhook response is still pending. Filler messages are not used for asynchronous
         * webhooks.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messages(): Optional<List<Message>> = messages.getOptional("messages")

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
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pathParameters(): Optional<PathParameters> =
            pathParameters.getOptional("path_parameters")

        /**
         * The query parameters the webhook tool accepts, described as a JSON Schema object. These
         * parameters will be passed to the webhook as the query of the request. See the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun queryParameters(): Optional<QueryParameters> =
            queryParameters.getOptional("query_parameters")

        /**
         * A list of mappings that extract values from the webhook response and store them as
         * dynamic variables. Each mapping specifies a dynamic variable name and a dot-notation path
         * to the value in the response body.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun storeFieldsAsVariables(): Optional<List<StoreFieldsAsVariable>> =
            storeFieldsAsVariables.getOptional("store_fields_as_variables")

        /**
         * The maximum number of milliseconds to wait for the webhook to respond. Only applicable
         * when async is false.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeout_ms")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [async].
         *
         * Unlike [async], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("async") @ExcludeMissing fun _async(): JsonField<Boolean> = async

        /**
         * Returns the raw JSON value of [asyncTimeoutMs].
         *
         * Unlike [asyncTimeoutMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("async_timeout_ms")
        @ExcludeMissing
        fun _asyncTimeoutMs(): JsonField<Long> = asyncTimeoutMs

        /**
         * Returns the raw JSON value of [bodyParameters].
         *
         * Unlike [bodyParameters], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

        /**
         * Returns the raw JSON value of [pathParameters].
         *
         * Unlike [pathParameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("path_parameters")
        @ExcludeMissing
        fun _pathParameters(): JsonField<PathParameters> = pathParameters

        /**
         * Returns the raw JSON value of [queryParameters].
         *
         * Unlike [queryParameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("query_parameters")
        @ExcludeMissing
        fun _queryParameters(): JsonField<QueryParameters> = queryParameters

        /**
         * Returns the raw JSON value of [storeFieldsAsVariables].
         *
         * Unlike [storeFieldsAsVariables], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("store_fields_as_variables")
        @ExcludeMissing
        fun _storeFieldsAsVariables(): JsonField<List<StoreFieldsAsVariable>> =
            storeFieldsAsVariables

        /**
         * Returns the raw JSON value of [timeoutMs].
         *
         * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout_ms") @ExcludeMissing fun _timeoutMs(): JsonField<Long> = timeoutMs

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
             * Returns a mutable builder for constructing an instance of [Webhook].
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

        /** A builder for [Webhook]. */
        class Builder internal constructor() {

            private var description: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var url: JsonField<String>? = null
            private var async: JsonField<Boolean> = JsonMissing.of()
            private var asyncTimeoutMs: JsonField<Long> = JsonMissing.of()
            private var bodyParameters: JsonField<BodyParameters> = JsonMissing.of()
            private var headers: JsonField<MutableList<Header>>? = null
            private var messages: JsonField<MutableList<Message>>? = null
            private var method: JsonField<Method> = JsonMissing.of()
            private var pathParameters: JsonField<PathParameters> = JsonMissing.of()
            private var queryParameters: JsonField<QueryParameters> = JsonMissing.of()
            private var storeFieldsAsVariables: JsonField<MutableList<StoreFieldsAsVariable>>? =
                null
            private var timeoutMs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhook: Webhook) = apply {
                description = webhook.description
                name = webhook.name
                url = webhook.url
                async = webhook.async
                asyncTimeoutMs = webhook.asyncTimeoutMs
                bodyParameters = webhook.bodyParameters
                headers = webhook.headers.map { it.toMutableList() }
                messages = webhook.messages.map { it.toMutableList() }
                method = webhook.method
                pathParameters = webhook.pathParameters
                queryParameters = webhook.queryParameters
                storeFieldsAsVariables = webhook.storeFieldsAsVariables.map { it.toMutableList() }
                timeoutMs = webhook.timeoutMs
                additionalProperties = webhook.additionalProperties.toMutableMap()
            }

            /** The description of the tool. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The name of the tool. */
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
             * The URL of the external tool to be called. This URL is going to be used by the
             * assistant. The URL can be templated like: `https://example.com/api/v1/{id}`, where
             * `{id}` is a placeholder for a value that will be provided by the assistant if
             * `path_parameters` are provided with the `id` attribute.
             */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /**
             * If async, the assistant will move forward without waiting for your server to respond.
             */
            fun async(async: Boolean) = async(JsonField.of(async))

            /**
             * Sets [Builder.async] to an arbitrary JSON value.
             *
             * You should usually call [Builder.async] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun async(async: JsonField<Boolean>) = apply { this.async = async }

            /**
             * Maximum time in milliseconds that the conversation worker waits for an async webhook
             * response before returning "Submitted" to the LLM. If unset, the platform default
             * (currently 300ms) is used.
             */
            fun asyncTimeoutMs(asyncTimeoutMs: Long) = asyncTimeoutMs(JsonField.of(asyncTimeoutMs))

            /**
             * Sets [Builder.asyncTimeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asyncTimeoutMs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun asyncTimeoutMs(asyncTimeoutMs: JsonField<Long>) = apply {
                this.asyncTimeoutMs = asyncTimeoutMs
            }

            /**
             * The body parameters the webhook tool accepts, described as a JSON Schema object.
             * These parameters will be passed to the webhook as the body of the request. See the
             * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
             * documentation about the format
             */
            fun bodyParameters(bodyParameters: BodyParameters) =
                bodyParameters(JsonField.of(bodyParameters))

            /**
             * Sets [Builder.bodyParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyParameters] with a well-typed [BodyParameters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun bodyParameters(bodyParameters: JsonField<BodyParameters>) = apply {
                this.bodyParameters = bodyParameters
            }

            /** The headers to be sent to the external tool. */
            fun headers(headers: List<Header>) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed `List<Header>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Filler messages spoken while a synchronous webhook request is in progress.
             * `request_start` messages are spoken immediately when the request begins.
             * `request_response_delayed` messages are spoken after `timing_ms` has elapsed only if
             * the webhook response is still pending. Filler messages are not used for asynchronous
             * webhooks.
             */
            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            /**
             * Sets [Builder.messages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messages] with a well-typed `List<Message>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Message] to [messages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("messages", it).add(message)
                    }
            }

            /**
             * Alias for calling [addMessage] with
             * `Message.ofWebhookToolRequestStart(webhookToolRequestStart)`.
             */
            fun addMessage(webhookToolRequestStart: Message.WebhookToolRequestStartMessage) =
                addMessage(Message.ofWebhookToolRequestStart(webhookToolRequestStart))

            /**
             * Alias for calling [addMessage] with
             * `Message.ofWebhookToolRequestResponseDelayed(webhookToolRequestResponseDelayed)`.
             */
            fun addMessage(
                webhookToolRequestResponseDelayed: Message.WebhookToolRequestResponseDelayedMessage
            ) =
                addMessage(
                    Message.ofWebhookToolRequestResponseDelayed(webhookToolRequestResponseDelayed)
                )

            /** The HTTP method to be used when calling the external tool. */
            fun method(method: Method) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [Method] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<Method>) = apply { this.method = method }

            /**
             * The path parameters the webhook tool accepts, described as a JSON Schema object.
             * These parameters will be passed to the webhook as the path of the request if the URL
             * contains a placeholder for a value. See the
             * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
             * documentation about the format
             */
            fun pathParameters(pathParameters: PathParameters) =
                pathParameters(JsonField.of(pathParameters))

            /**
             * Sets [Builder.pathParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pathParameters] with a well-typed [PathParameters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pathParameters(pathParameters: JsonField<PathParameters>) = apply {
                this.pathParameters = pathParameters
            }

            /**
             * The query parameters the webhook tool accepts, described as a JSON Schema object.
             * These parameters will be passed to the webhook as the query of the request. See the
             * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
             * documentation about the format
             */
            fun queryParameters(queryParameters: QueryParameters) =
                queryParameters(JsonField.of(queryParameters))

            /**
             * Sets [Builder.queryParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queryParameters] with a well-typed [QueryParameters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun queryParameters(queryParameters: JsonField<QueryParameters>) = apply {
                this.queryParameters = queryParameters
            }

            /**
             * A list of mappings that extract values from the webhook response and store them as
             * dynamic variables. Each mapping specifies a dynamic variable name and a dot-notation
             * path to the value in the response body.
             */
            fun storeFieldsAsVariables(storeFieldsAsVariables: List<StoreFieldsAsVariable>) =
                storeFieldsAsVariables(JsonField.of(storeFieldsAsVariables))

            /**
             * Sets [Builder.storeFieldsAsVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storeFieldsAsVariables] with a well-typed
             * `List<StoreFieldsAsVariable>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun storeFieldsAsVariables(
                storeFieldsAsVariables: JsonField<List<StoreFieldsAsVariable>>
            ) = apply {
                this.storeFieldsAsVariables = storeFieldsAsVariables.map { it.toMutableList() }
            }

            /**
             * Adds a single [StoreFieldsAsVariable] to [storeFieldsAsVariables].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStoreFieldsAsVariable(storeFieldsAsVariable: StoreFieldsAsVariable) = apply {
                storeFieldsAsVariables =
                    (storeFieldsAsVariables ?: JsonField.of(mutableListOf())).also {
                        checkKnown("storeFieldsAsVariables", it).add(storeFieldsAsVariable)
                    }
            }

            /**
             * The maximum number of milliseconds to wait for the webhook to respond. Only
             * applicable when async is false.
             */
            fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

            /**
             * Sets [Builder.timeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

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
             * Returns an immutable instance of [Webhook].
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
            fun build(): Webhook =
                Webhook(
                    checkRequired("description", description),
                    checkRequired("name", name),
                    checkRequired("url", url),
                    async,
                    asyncTimeoutMs,
                    bodyParameters,
                    (headers ?: JsonMissing.of()).map { it.toImmutable() },
                    (messages ?: JsonMissing.of()).map { it.toImmutable() },
                    method,
                    pathParameters,
                    queryParameters,
                    (storeFieldsAsVariables ?: JsonMissing.of()).map { it.toImmutable() },
                    timeoutMs,
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
        fun validate(): Webhook = apply {
            if (validated) {
                return@apply
            }

            description()
            name()
            url()
            async()
            asyncTimeoutMs()
            bodyParameters().ifPresent { it.validate() }
            headers().ifPresent { it.forEach { it.validate() } }
            messages().ifPresent { it.forEach { it.validate() } }
            method().ifPresent { it.validate() }
            pathParameters().ifPresent { it.validate() }
            queryParameters().ifPresent { it.validate() }
            storeFieldsAsVariables().ifPresent { it.forEach { it.validate() } }
            timeoutMs()
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
            (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (if (async.asKnown().isPresent) 1 else 0) +
                (if (asyncTimeoutMs.asKnown().isPresent) 1 else 0) +
                (bodyParameters.asKnown().getOrNull()?.validity() ?: 0) +
                (headers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (method.asKnown().getOrNull()?.validity() ?: 0) +
                (pathParameters.asKnown().getOrNull()?.validity() ?: 0) +
                (queryParameters.asKnown().getOrNull()?.validity() ?: 0) +
                (storeFieldsAsVariables.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (timeoutMs.asKnown().isPresent) 1 else 0)

        /**
         * The body parameters the webhook tool accepts, described as a JSON Schema object. These
         * parameters will be passed to the webhook as the body of the request. See the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun properties(): Optional<Properties> = properties.getOptional("properties")

            /**
             * The required properties of the body parameters.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun required(): Optional<List<String>> = required.getOptional("required")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<Properties> = properties

            /**
             * Returns the raw JSON value of [required].
             *
             * Unlike [required], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OBJECT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The value of the header. Note that we support mustache templating for the value. For
             * example you can use `Bearer
             * {{#integration_secret}}test-secret{{/integration_secret}}` to pass the value of the
             * integration secret as the bearer token.
             * [Telnyx signature headers](https://developers.telnyx.com/docs/voice/programmable-voice/voice-api-webhooks)
             * will be automatically added to the request.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The value of the header. Note that we support mustache templating for the value.
                 * For example you can use `Bearer
                 * {{#integration_secret}}test-secret{{/integration_secret}}` to pass the value of
                 * the integration secret as the bearer token.
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
                 * Returns an immutable instance of [Header].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Header = Header(name, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        @JsonDeserialize(using = Message.Deserializer::class)
        @JsonSerialize(using = Message.Serializer::class)
        class Message
        private constructor(
            private val webhookToolRequestStart: WebhookToolRequestStartMessage? = null,
            private val webhookToolRequestResponseDelayed:
                WebhookToolRequestResponseDelayedMessage? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun webhookToolRequestStart(): Optional<WebhookToolRequestStartMessage> =
                Optional.ofNullable(webhookToolRequestStart)

            fun webhookToolRequestResponseDelayed():
                Optional<WebhookToolRequestResponseDelayedMessage> =
                Optional.ofNullable(webhookToolRequestResponseDelayed)

            fun isWebhookToolRequestStart(): Boolean = webhookToolRequestStart != null

            fun isWebhookToolRequestResponseDelayed(): Boolean =
                webhookToolRequestResponseDelayed != null

            fun asWebhookToolRequestStart(): WebhookToolRequestStartMessage =
                webhookToolRequestStart.getOrThrow("webhookToolRequestStart")

            fun asWebhookToolRequestResponseDelayed(): WebhookToolRequestResponseDelayedMessage =
                webhookToolRequestResponseDelayed.getOrThrow("webhookToolRequestResponseDelayed")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = message.accept(new Message.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitWebhookToolRequestStart(WebhookToolRequestStartMessage webhookToolRequestStart) {
             *         return Optional.of(webhookToolRequestStart.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    webhookToolRequestStart != null ->
                        visitor.visitWebhookToolRequestStart(webhookToolRequestStart)
                    webhookToolRequestResponseDelayed != null ->
                        visitor.visitWebhookToolRequestResponseDelayed(
                            webhookToolRequestResponseDelayed
                        )
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Message = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitWebhookToolRequestStart(
                            webhookToolRequestStart: WebhookToolRequestStartMessage
                        ) {
                            webhookToolRequestStart.validate()
                        }

                        override fun visitWebhookToolRequestResponseDelayed(
                            webhookToolRequestResponseDelayed:
                                WebhookToolRequestResponseDelayedMessage
                        ) {
                            webhookToolRequestResponseDelayed.validate()
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
                        override fun visitWebhookToolRequestStart(
                            webhookToolRequestStart: WebhookToolRequestStartMessage
                        ) = webhookToolRequestStart.validity()

                        override fun visitWebhookToolRequestResponseDelayed(
                            webhookToolRequestResponseDelayed:
                                WebhookToolRequestResponseDelayedMessage
                        ) = webhookToolRequestResponseDelayed.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Message &&
                    webhookToolRequestStart == other.webhookToolRequestStart &&
                    webhookToolRequestResponseDelayed == other.webhookToolRequestResponseDelayed
            }

            override fun hashCode(): Int =
                Objects.hash(webhookToolRequestStart, webhookToolRequestResponseDelayed)

            override fun toString(): String =
                when {
                    webhookToolRequestStart != null ->
                        "Message{webhookToolRequestStart=$webhookToolRequestStart}"
                    webhookToolRequestResponseDelayed != null ->
                        "Message{webhookToolRequestResponseDelayed=$webhookToolRequestResponseDelayed}"
                    _json != null -> "Message{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Message")
                }

            companion object {

                @JvmStatic
                fun ofWebhookToolRequestStart(
                    webhookToolRequestStart: WebhookToolRequestStartMessage
                ) = Message(webhookToolRequestStart = webhookToolRequestStart)

                @JvmStatic
                fun ofWebhookToolRequestResponseDelayed(
                    webhookToolRequestResponseDelayed: WebhookToolRequestResponseDelayedMessage
                ) = Message(webhookToolRequestResponseDelayed = webhookToolRequestResponseDelayed)
            }

            /**
             * An interface that defines how to map each variant of [Message] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitWebhookToolRequestStart(
                    webhookToolRequestStart: WebhookToolRequestStartMessage
                ): T

                fun visitWebhookToolRequestResponseDelayed(
                    webhookToolRequestResponseDelayed: WebhookToolRequestResponseDelayedMessage
                ): T

                /**
                 * Maps an unknown variant of [Message] to a value of type [T].
                 *
                 * An instance of [Message] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Message: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Message>(Message::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Message {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<WebhookToolRequestStartMessage>(),
                                    )
                                    ?.let { Message(webhookToolRequestStart = it, _json = json) },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<WebhookToolRequestResponseDelayedMessage>(),
                                    )
                                    ?.let {
                                        Message(
                                            webhookToolRequestResponseDelayed = it,
                                            _json = json,
                                        )
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Message(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Message>(Message::class) {

                override fun serialize(
                    value: Message,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.webhookToolRequestStart != null ->
                            generator.writeObject(value.webhookToolRequestStart)
                        value.webhookToolRequestResponseDelayed != null ->
                            generator.writeObject(value.webhookToolRequestResponseDelayed)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Message")
                    }
                }
            }

            class WebhookToolRequestStartMessage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val content: JsonField<String>,
                private val type: JsonValue,
                private val timingMs: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("timing_ms")
                    @ExcludeMissing
                    timingMs: JsonField<Long> = JsonMissing.of(),
                ) : this(content, type, timingMs, mutableMapOf())

                /**
                 * The text the assistant speaks.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun content(): String = content.getRequired("content")

                /**
                 * Speak the filler message immediately when the webhook request begins.
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("request_start")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * An optional delay value. This value is ignored for `request_start` messages.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun timingMs(): Optional<Long> = timingMs.getOptional("timing_ms")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [timingMs].
                 *
                 * Unlike [timingMs], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timing_ms")
                @ExcludeMissing
                fun _timingMs(): JsonField<Long> = timingMs

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
                     * [WebhookToolRequestStartMessage].
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebhookToolRequestStartMessage]. */
                class Builder internal constructor() {

                    private var content: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("request_start")
                    private var timingMs: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        webhookToolRequestStartMessage: WebhookToolRequestStartMessage
                    ) = apply {
                        content = webhookToolRequestStartMessage.content
                        type = webhookToolRequestStartMessage.type
                        timingMs = webhookToolRequestStartMessage.timingMs
                        additionalProperties =
                            webhookToolRequestStartMessage.additionalProperties.toMutableMap()
                    }

                    /** The text the assistant speaks. */
                    fun content(content: String) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("request_start")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    /**
                     * An optional delay value. This value is ignored for `request_start` messages.
                     */
                    fun timingMs(timingMs: Long) = timingMs(JsonField.of(timingMs))

                    /**
                     * Sets [Builder.timingMs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timingMs] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timingMs(timingMs: JsonField<Long>) = apply { this.timingMs = timingMs }

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
                     * Returns an immutable instance of [WebhookToolRequestStartMessage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): WebhookToolRequestStartMessage =
                        WebhookToolRequestStartMessage(
                            checkRequired("content", content),
                            type,
                            timingMs,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): WebhookToolRequestStartMessage = apply {
                    if (validated) {
                        return@apply
                    }

                    content()
                    _type().let {
                        if (it != JsonValue.from("request_start")) {
                            throw TelnyxInvalidDataException("'type' is invalid, received $it")
                        }
                    }
                    timingMs()
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
                    (if (content.asKnown().isPresent) 1 else 0) +
                        type.let { if (it == JsonValue.from("request_start")) 1 else 0 } +
                        (if (timingMs.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WebhookToolRequestStartMessage &&
                        content == other.content &&
                        type == other.type &&
                        timingMs == other.timingMs &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(content, type, timingMs, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebhookToolRequestStartMessage{content=$content, type=$type, timingMs=$timingMs, additionalProperties=$additionalProperties}"
            }

            class WebhookToolRequestResponseDelayedMessage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val content: JsonField<String>,
                private val timingMs: JsonField<Long>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timing_ms")
                    @ExcludeMissing
                    timingMs: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(content, timingMs, type, mutableMapOf())

                /**
                 * The text the assistant speaks.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun content(): String = content.getRequired("content")

                /**
                 * The delay in milliseconds from the start of the webhook request.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timingMs(): Long = timingMs.getRequired("timing_ms")

                /**
                 * Speak the filler message after the configured delay if the webhook response is
                 * still pending.
                 *
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("request_response_delayed")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [timingMs].
                 *
                 * Unlike [timingMs], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timing_ms")
                @ExcludeMissing
                fun _timingMs(): JsonField<Long> = timingMs

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
                     * [WebhookToolRequestResponseDelayedMessage].
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * .timingMs()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebhookToolRequestResponseDelayedMessage]. */
                class Builder internal constructor() {

                    private var content: JsonField<String>? = null
                    private var timingMs: JsonField<Long>? = null
                    private var type: JsonValue = JsonValue.from("request_response_delayed")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        webhookToolRequestResponseDelayedMessage:
                            WebhookToolRequestResponseDelayedMessage
                    ) = apply {
                        content = webhookToolRequestResponseDelayedMessage.content
                        timingMs = webhookToolRequestResponseDelayedMessage.timingMs
                        type = webhookToolRequestResponseDelayedMessage.type
                        additionalProperties =
                            webhookToolRequestResponseDelayedMessage.additionalProperties
                                .toMutableMap()
                    }

                    /** The text the assistant speaks. */
                    fun content(content: String) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    /** The delay in milliseconds from the start of the webhook request. */
                    fun timingMs(timingMs: Long) = timingMs(JsonField.of(timingMs))

                    /**
                     * Sets [Builder.timingMs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timingMs] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timingMs(timingMs: JsonField<Long>) = apply { this.timingMs = timingMs }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("request_response_delayed")
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
                     * Returns an immutable instance of [WebhookToolRequestResponseDelayedMessage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * .timingMs()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): WebhookToolRequestResponseDelayedMessage =
                        WebhookToolRequestResponseDelayedMessage(
                            checkRequired("content", content),
                            checkRequired("timingMs", timingMs),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): WebhookToolRequestResponseDelayedMessage = apply {
                    if (validated) {
                        return@apply
                    }

                    content()
                    timingMs()
                    _type().let {
                        if (it != JsonValue.from("request_response_delayed")) {
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
                    (if (content.asKnown().isPresent) 1 else 0) +
                        (if (timingMs.asKnown().isPresent) 1 else 0) +
                        type.let { if (it == JsonValue.from("request_response_delayed")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WebhookToolRequestResponseDelayedMessage &&
                        content == other.content &&
                        timingMs == other.timingMs &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(content, timingMs, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebhookToolRequestResponseDelayedMessage{content=$content, timingMs=$timingMs, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        /** The HTTP method to be used when calling the external tool. */
        class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GET,
                POST,
                PUT,
                DELETE,
                PATCH,
                /**
                 * An enum member indicating that [Method] was instantiated with an unknown value.
                 */
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun properties(): Optional<Properties> = properties.getOptional("properties")

            /**
             * The required properties of the path parameters.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun required(): Optional<List<String>> = required.getOptional("required")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<Properties> = properties

            /**
             * Returns the raw JSON value of [required].
             *
             * Unlike [required], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OBJECT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema) for
         * documentation about the format
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun properties(): Optional<Properties> = properties.getOptional("properties")

            /**
             * The required properties of the query parameters.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun required(): Optional<List<String>> = required.getOptional("required")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<Properties> = properties

            /**
             * Returns the raw JSON value of [required].
             *
             * Unlike [required], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OBJECT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

        class StoreFieldsAsVariable
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val valuePath: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value_path")
                @ExcludeMissing
                valuePath: JsonField<String> = JsonMissing.of(),
            ) : this(name, valuePath, mutableMapOf())

            /**
             * The name of the dynamic variable to store the extracted value in.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * A dot-notation path to the value in the webhook response body (e.g. 'customer.name'
             * or 'id').
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun valuePath(): String = valuePath.getRequired("value_path")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [valuePath].
             *
             * Unlike [valuePath], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("value_path")
            @ExcludeMissing
            fun _valuePath(): JsonField<String> = valuePath

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
                 * [StoreFieldsAsVariable].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .valuePath()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StoreFieldsAsVariable]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var valuePath: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(storeFieldsAsVariable: StoreFieldsAsVariable) = apply {
                    name = storeFieldsAsVariable.name
                    valuePath = storeFieldsAsVariable.valuePath
                    additionalProperties = storeFieldsAsVariable.additionalProperties.toMutableMap()
                }

                /** The name of the dynamic variable to store the extracted value in. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * A dot-notation path to the value in the webhook response body (e.g.
                 * 'customer.name' or 'id').
                 */
                fun valuePath(valuePath: String) = valuePath(JsonField.of(valuePath))

                /**
                 * Sets [Builder.valuePath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.valuePath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun valuePath(valuePath: JsonField<String>) = apply { this.valuePath = valuePath }

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
                 * Returns an immutable instance of [StoreFieldsAsVariable].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .valuePath()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): StoreFieldsAsVariable =
                    StoreFieldsAsVariable(
                        checkRequired("name", name),
                        checkRequired("valuePath", valuePath),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): StoreFieldsAsVariable = apply {
                if (validated) {
                    return@apply
                }

                name()
                valuePath()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (if (valuePath.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StoreFieldsAsVariable &&
                    name == other.name &&
                    valuePath == other.valuePath &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(name, valuePath, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StoreFieldsAsVariable{name=$name, valuePath=$valuePath, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Webhook &&
                description == other.description &&
                name == other.name &&
                url == other.url &&
                async == other.async &&
                asyncTimeoutMs == other.asyncTimeoutMs &&
                bodyParameters == other.bodyParameters &&
                headers == other.headers &&
                messages == other.messages &&
                method == other.method &&
                pathParameters == other.pathParameters &&
                queryParameters == other.queryParameters &&
                storeFieldsAsVariables == other.storeFieldsAsVariables &&
                timeoutMs == other.timeoutMs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                name,
                url,
                async,
                asyncTimeoutMs,
                bodyParameters,
                headers,
                messages,
                method,
                pathParameters,
                queryParameters,
                storeFieldsAsVariables,
                timeoutMs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Webhook{description=$description, name=$name, url=$url, async=$async, asyncTimeoutMs=$asyncTimeoutMs, bodyParameters=$bodyParameters, headers=$headers, messages=$messages, method=$method, pathParameters=$pathParameters, queryParameters=$queryParameters, storeFieldsAsVariables=$storeFieldsAsVariables, timeoutMs=$timeoutMs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferenceEmbeddingWebhookToolParams &&
            type == other.type &&
            webhook == other.webhook &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(type, webhook, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceEmbeddingWebhookToolParams{type=$type, webhook=$webhook, additionalProperties=$additionalProperties}"
}
