// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.calls

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Initiate an outbound TeXML call using a TeXML application connection ID, not an account SID.
 * Request parameter names are case-sensitive. From and To are required; Texml supplies inline
 * instructions and Url overrides the application XML request URL. When neither is supplied, the
 * application configuration supplies the instructions. The response is a flat call object without a
 * data wrapper.
 */
class CallCreateParams
private constructor(
    private val connectionId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun connectionId(): Optional<String> = Optional.ofNullable(connectionId)

    /**
     * The E.164-formatted phone number or SIP URI to present as the caller.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = body.from()

    /**
     * The E.164-formatted phone number or SIP URI to call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * HTTP method used to retrieve TeXML instructions from Url.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun method(): Optional<Method> = body.method()

    /**
     * Inline TeXML instructions to execute when the call is answered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun texml(): Optional<String> = body.texml()

    /**
     * The URL from which to retrieve TeXML instructions. Overrides the TeXML application XML
     * request URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = body.url()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _method(): JsonField<Method> = body._method()

    /**
     * Returns the raw JSON value of [texml].
     *
     * Unlike [texml], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _texml(): JsonField<String> = body._texml()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallCreateParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallCreateParams]. */
    class Builder internal constructor() {

        private var connectionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callCreateParams: CallCreateParams) = apply {
            connectionId = callCreateParams.connectionId
            body = callCreateParams.body.toBuilder()
            additionalHeaders = callCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = callCreateParams.additionalQueryParams.toBuilder()
        }

        fun connectionId(connectionId: String?) = apply { this.connectionId = connectionId }

        /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
        fun connectionId(connectionId: Optional<String>) = connectionId(connectionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [from]
         * - [to]
         * - [method]
         * - [texml]
         * - [url]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The E.164-formatted phone number or SIP URI to present as the caller. */
        fun from(from: String) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { body.from(from) }

        /** The E.164-formatted phone number or SIP URI to call. */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        /** HTTP method used to retrieve TeXML instructions from Url. */
        fun method(method: Method) = apply { body.method(method) }

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Method] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<Method>) = apply { body.method(method) }

        /** Inline TeXML instructions to execute when the call is answered. */
        fun texml(texml: String) = apply { body.texml(texml) }

        /**
         * Sets [Builder.texml] to an arbitrary JSON value.
         *
         * You should usually call [Builder.texml] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun texml(texml: JsonField<String>) = apply { body.texml(texml) }

        /**
         * The URL from which to retrieve TeXML instructions. Overrides the TeXML application XML
         * request URL.
         */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [CallCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallCreateParams =
            CallCreateParams(
                connectionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> connectionId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val from: JsonField<String>,
        private val to: JsonField<String>,
        private val method: JsonField<Method>,
        private val texml: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("From") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("To") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("Method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
            @JsonProperty("Texml") @ExcludeMissing texml: JsonField<String> = JsonMissing.of(),
            @JsonProperty("Url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(from, to, method, texml, url, mutableMapOf())

        /**
         * The E.164-formatted phone number or SIP URI to present as the caller.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("From")

        /**
         * The E.164-formatted phone number or SIP URI to call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("To")

        /**
         * HTTP method used to retrieve TeXML instructions from Url.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun method(): Optional<Method> = method.getOptional("Method")

        /**
         * Inline TeXML instructions to execute when the call is answered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun texml(): Optional<String> = texml.getOptional("Texml")

        /**
         * The URL from which to retrieve TeXML instructions. Overrides the TeXML application XML
         * request URL.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("Url")

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("From") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("To") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Method") @ExcludeMissing fun _method(): JsonField<Method> = method

        /**
         * Returns the raw JSON value of [texml].
         *
         * Unlike [texml], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Texml") @ExcludeMissing fun _texml(): JsonField<String> = texml

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Url") @ExcludeMissing fun _url(): JsonField<String> = url

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
             * .from()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var from: JsonField<String>? = null
            private var to: JsonField<String>? = null
            private var method: JsonField<Method> = JsonMissing.of()
            private var texml: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                from = body.from
                to = body.to
                method = body.method
                texml = body.texml
                url = body.url
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The E.164-formatted phone number or SIP URI to present as the caller. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /** The E.164-formatted phone number or SIP URI to call. */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /** HTTP method used to retrieve TeXML instructions from Url. */
            fun method(method: Method) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [Method] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<Method>) = apply { this.method = method }

            /** Inline TeXML instructions to execute when the call is answered. */
            fun texml(texml: String) = texml(JsonField.of(texml))

            /**
             * Sets [Builder.texml] to an arbitrary JSON value.
             *
             * You should usually call [Builder.texml] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun texml(texml: JsonField<String>) = apply { this.texml = texml }

            /**
             * The URL from which to retrieve TeXML instructions. Overrides the TeXML application
             * XML request URL.
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
             * .from()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("from", from),
                    checkRequired("to", to),
                    method,
                    texml,
                    url,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            from()
            to()
            method().ifPresent { it.validate() }
            texml()
            url()
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
            (if (from.asKnown().isPresent) 1 else 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (method.asKnown().getOrNull()?.validity() ?: 0) +
                (if (texml.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                from == other.from &&
                to == other.to &&
                method == other.method &&
                texml == other.texml &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(from, to, method, texml, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{from=$from, to=$to, method=$method, texml=$texml, url=$url, additionalProperties=$additionalProperties}"
    }

    /** HTTP method used to retrieve TeXML instructions from Url. */
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

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        /** An enum containing [Method]'s known values. */
        enum class Known {
            GET,
            POST,
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallCreateParams &&
            connectionId == other.connectionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(connectionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallCreateParams{connectionId=$connectionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
