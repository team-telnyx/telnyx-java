// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateCall
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fallbackMethod: JsonField<FallbackMethod>,
    private val fallbackUrl: JsonField<String>,
    private val method: JsonField<Method>,
    private val status: JsonField<String>,
    private val statusCallback: JsonField<String>,
    private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
    private val texml: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("FallbackMethod")
        @ExcludeMissing
        fallbackMethod: JsonField<FallbackMethod> = JsonMissing.of(),
        @JsonProperty("FallbackUrl")
        @ExcludeMissing
        fallbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("Method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
        @JsonProperty("Status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("StatusCallback")
        @ExcludeMissing
        statusCallback: JsonField<String> = JsonMissing.of(),
        @JsonProperty("StatusCallbackMethod")
        @ExcludeMissing
        statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
        @JsonProperty("Texml") @ExcludeMissing texml: JsonField<String> = JsonMissing.of(),
        @JsonProperty("Url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        fallbackMethod,
        fallbackUrl,
        method,
        status,
        statusCallback,
        statusCallbackMethod,
        texml,
        url,
        mutableMapOf(),
    )

    /**
     * HTTP request type used for `FallbackUrl`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbackMethod(): Optional<FallbackMethod> = fallbackMethod.getOptional("FallbackMethod")

    /**
     * A failover URL for which Telnyx will retrieve the TeXML call instructions if the Url is not
     * responding.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbackUrl(): Optional<String> = fallbackUrl.getOptional("FallbackUrl")

    /**
     * HTTP request type used for `Url`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun method(): Optional<Method> = method.getOptional("Method")

    /**
     * The value to set the call status to. Setting the status to completed ends the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("Status")

    /**
     * URL destination for Telnyx to send status callback events to for the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallback(): Optional<String> = statusCallback.getOptional("StatusCallback")

    /**
     * HTTP request type used for `StatusCallback`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
        statusCallbackMethod.getOptional("StatusCallbackMethod")

    /**
     * TeXML to replace the current one with.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun texml(): Optional<String> = texml.getOptional("Texml")

    /**
     * The URL where TeXML will make a request to retrieve a new set of TeXML instructions to
     * continue the call flow.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("Url")

    /**
     * Returns the raw JSON value of [fallbackMethod].
     *
     * Unlike [fallbackMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("FallbackMethod")
    @ExcludeMissing
    fun _fallbackMethod(): JsonField<FallbackMethod> = fallbackMethod

    /**
     * Returns the raw JSON value of [fallbackUrl].
     *
     * Unlike [fallbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("FallbackUrl") @ExcludeMissing fun _fallbackUrl(): JsonField<String> = fallbackUrl

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("Method") @ExcludeMissing fun _method(): JsonField<Method> = method

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("Status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [statusCallback].
     *
     * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("StatusCallback")
    @ExcludeMissing
    fun _statusCallback(): JsonField<String> = statusCallback

    /**
     * Returns the raw JSON value of [statusCallbackMethod].
     *
     * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("StatusCallbackMethod")
    @ExcludeMissing
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

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

        /** Returns a mutable builder for constructing an instance of [UpdateCall]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateCall]. */
    class Builder internal constructor() {

        private var fallbackMethod: JsonField<FallbackMethod> = JsonMissing.of()
        private var fallbackUrl: JsonField<String> = JsonMissing.of()
        private var method: JsonField<Method> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var statusCallback: JsonField<String> = JsonMissing.of()
        private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
        private var texml: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateCall: UpdateCall) = apply {
            fallbackMethod = updateCall.fallbackMethod
            fallbackUrl = updateCall.fallbackUrl
            method = updateCall.method
            status = updateCall.status
            statusCallback = updateCall.statusCallback
            statusCallbackMethod = updateCall.statusCallbackMethod
            texml = updateCall.texml
            url = updateCall.url
            additionalProperties = updateCall.additionalProperties.toMutableMap()
        }

        /** HTTP request type used for `FallbackUrl`. */
        fun fallbackMethod(fallbackMethod: FallbackMethod) =
            fallbackMethod(JsonField.of(fallbackMethod))

        /**
         * Sets [Builder.fallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackMethod] with a well-typed [FallbackMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbackMethod(fallbackMethod: JsonField<FallbackMethod>) = apply {
            this.fallbackMethod = fallbackMethod
        }

        /**
         * A failover URL for which Telnyx will retrieve the TeXML call instructions if the Url is
         * not responding.
         */
        fun fallbackUrl(fallbackUrl: String) = fallbackUrl(JsonField.of(fallbackUrl))

        /**
         * Sets [Builder.fallbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fallbackUrl(fallbackUrl: JsonField<String>) = apply { this.fallbackUrl = fallbackUrl }

        /** HTTP request type used for `Url`. */
        fun method(method: Method) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Method] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<Method>) = apply { this.method = method }

        /** The value to set the call status to. Setting the status to completed ends the call. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** URL destination for Telnyx to send status callback events to for the call. */
        fun statusCallback(statusCallback: String) = statusCallback(JsonField.of(statusCallback))

        /**
         * Sets [Builder.statusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCallback(statusCallback: JsonField<String>) = apply {
            this.statusCallback = statusCallback
        }

        /** HTTP request type used for `StatusCallback`. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
            statusCallbackMethod(JsonField.of(statusCallbackMethod))

        /**
         * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackMethod] with a well-typed
         * [StatusCallbackMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) = apply {
            this.statusCallbackMethod = statusCallbackMethod
        }

        /** TeXML to replace the current one with. */
        fun texml(texml: String) = texml(JsonField.of(texml))

        /**
         * Sets [Builder.texml] to an arbitrary JSON value.
         *
         * You should usually call [Builder.texml] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun texml(texml: JsonField<String>) = apply { this.texml = texml }

        /**
         * The URL where TeXML will make a request to retrieve a new set of TeXML instructions to
         * continue the call flow.
         */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [UpdateCall].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateCall =
            UpdateCall(
                fallbackMethod,
                fallbackUrl,
                method,
                status,
                statusCallback,
                statusCallbackMethod,
                texml,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpdateCall = apply {
        if (validated) {
            return@apply
        }

        fallbackMethod().ifPresent { it.validate() }
        fallbackUrl()
        method().ifPresent { it.validate() }
        status()
        statusCallback()
        statusCallbackMethod().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (fallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fallbackUrl.asKnown().isPresent) 1 else 0) +
            (method.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (statusCallback.asKnown().isPresent) 1 else 0) +
            (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (texml.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    /** HTTP request type used for `FallbackUrl`. */
    class FallbackMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = FallbackMethod(JsonField.of(value))
        }

        /** An enum containing [FallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [FallbackMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [FallbackMethod] was instantiated with an unknown
             * value.
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
                else -> throw TelnyxInvalidDataException("Unknown FallbackMethod: $value")
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

        fun validate(): FallbackMethod = apply {
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

            return other is FallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP request type used for `Url`. */
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

    /** HTTP request type used for `StatusCallback`. */
    class StatusCallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [StatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [StatusCallbackMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [StatusCallbackMethod] was instantiated with an
             * unknown value.
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
                else -> throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
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

        fun validate(): StatusCallbackMethod = apply {
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

            return other is StatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateCall &&
            fallbackMethod == other.fallbackMethod &&
            fallbackUrl == other.fallbackUrl &&
            method == other.method &&
            status == other.status &&
            statusCallback == other.statusCallback &&
            statusCallbackMethod == other.statusCallbackMethod &&
            texml == other.texml &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            fallbackMethod,
            fallbackUrl,
            method,
            status,
            statusCallback,
            statusCallbackMethod,
            texml,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateCall{fallbackMethod=$fallbackMethod, fallbackUrl=$fallbackUrl, method=$method, status=$status, statusCallback=$statusCallback, statusCallbackMethod=$statusCallbackMethod, texml=$texml, url=$url, additionalProperties=$additionalProperties}"
}
