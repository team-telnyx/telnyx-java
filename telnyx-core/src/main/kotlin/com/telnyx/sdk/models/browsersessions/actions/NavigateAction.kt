// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Navigate to a URL. */
class NavigateAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonValue,
    private val url: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val includeObservation: JsonField<Boolean>,
    private val waitUntil: JsonField<WaitUntil>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("include_observation")
        @ExcludeMissing
        includeObservation: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("wait_until")
        @ExcludeMissing
        waitUntil: JsonField<WaitUntil> = JsonMissing.of(),
    ) : this(type, url, idempotencyKey, includeObservation, waitUntil, mutableMapOf())

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("navigate")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeObservation(): Optional<Boolean> =
        includeObservation.getOptional("include_observation")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun waitUntil(): Optional<WaitUntil> = waitUntil.getOptional("wait_until")

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [includeObservation].
     *
     * Unlike [includeObservation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("include_observation")
    @ExcludeMissing
    fun _includeObservation(): JsonField<Boolean> = includeObservation

    /**
     * Returns the raw JSON value of [waitUntil].
     *
     * Unlike [waitUntil], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wait_until") @ExcludeMissing fun _waitUntil(): JsonField<WaitUntil> = waitUntil

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
         * Returns a mutable builder for constructing an instance of [NavigateAction].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NavigateAction]. */
    class Builder internal constructor() {

        private var type: JsonValue = JsonValue.from("navigate")
        private var url: JsonField<String>? = null
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var includeObservation: JsonField<Boolean> = JsonMissing.of()
        private var waitUntil: JsonField<WaitUntil> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(navigateAction: NavigateAction) = apply {
            type = navigateAction.type
            url = navigateAction.url
            idempotencyKey = navigateAction.idempotencyKey
            includeObservation = navigateAction.includeObservation
            waitUntil = navigateAction.waitUntil
            additionalProperties = navigateAction.additionalProperties.toMutableMap()
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("navigate")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        fun includeObservation(includeObservation: Boolean) =
            includeObservation(JsonField.of(includeObservation))

        /**
         * Sets [Builder.includeObservation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeObservation] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeObservation(includeObservation: JsonField<Boolean>) = apply {
            this.includeObservation = includeObservation
        }

        fun waitUntil(waitUntil: WaitUntil) = waitUntil(JsonField.of(waitUntil))

        /**
         * Sets [Builder.waitUntil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waitUntil] with a well-typed [WaitUntil] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun waitUntil(waitUntil: JsonField<WaitUntil>) = apply { this.waitUntil = waitUntil }

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
         * Returns an immutable instance of [NavigateAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NavigateAction =
            NavigateAction(
                type,
                checkRequired("url", url),
                idempotencyKey,
                includeObservation,
                waitUntil,
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
    fun validate(): NavigateAction = apply {
        if (validated) {
            return@apply
        }

        _type().let {
            if (it != JsonValue.from("navigate")) {
                throw TelnyxInvalidDataException("'type' is invalid, received $it")
            }
        }
        url()
        idempotencyKey()
        includeObservation()
        waitUntil().ifPresent { it.validate() }
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
        type.let { if (it == JsonValue.from("navigate")) 1 else 0 } +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (includeObservation.asKnown().isPresent) 1 else 0) +
            (waitUntil.asKnown().getOrNull()?.validity() ?: 0)

    class WaitUntil @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LOAD = of("load")

            @JvmField val DOM_STABLE = of("dom_stable")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = WaitUntil(JsonField.of(value))
        }

        /** An enum containing [WaitUntil]'s known values. */
        enum class Known {
            LOAD,
            DOM_STABLE,
            NONE,
        }

        /**
         * An enum containing [WaitUntil]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WaitUntil] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOAD,
            DOM_STABLE,
            NONE,
            /**
             * An enum member indicating that [WaitUntil] was instantiated with an unknown value.
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
                LOAD -> Value.LOAD
                DOM_STABLE -> Value.DOM_STABLE
                NONE -> Value.NONE
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
                LOAD -> Known.LOAD
                DOM_STABLE -> Known.DOM_STABLE
                NONE -> Known.NONE
                else -> throw TelnyxInvalidDataException("Unknown WaitUntil: $value")
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
        fun validate(): WaitUntil = apply {
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

            return other is WaitUntil && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NavigateAction &&
            type == other.type &&
            url == other.url &&
            idempotencyKey == other.idempotencyKey &&
            includeObservation == other.includeObservation &&
            waitUntil == other.waitUntil &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(type, url, idempotencyKey, includeObservation, waitUntil, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NavigateAction{type=$type, url=$url, idempotencyKey=$idempotencyKey, includeObservation=$includeObservation, waitUntil=$waitUntil, additionalProperties=$additionalProperties}"
}
