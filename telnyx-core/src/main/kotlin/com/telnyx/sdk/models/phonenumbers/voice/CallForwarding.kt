// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

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

/** The call forwarding settings for a phone number. */
class CallForwarding
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callForwardingEnabled: JsonField<Boolean>,
    private val forwardingType: JsonField<ForwardingType>,
    private val forwardsTo: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("call_forwarding_enabled")
        @ExcludeMissing
        callForwardingEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("forwarding_type")
        @ExcludeMissing
        forwardingType: JsonField<ForwardingType> = JsonMissing.of(),
        @JsonProperty("forwards_to")
        @ExcludeMissing
        forwardsTo: JsonField<String> = JsonMissing.of(),
    ) : this(callForwardingEnabled, forwardingType, forwardsTo, mutableMapOf())

    /**
     * Indicates if call forwarding will be enabled for this number if forwards_to and
     * forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of
     * numbers endpoints.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callForwardingEnabled(): Optional<Boolean> =
        callForwardingEnabled.getOptional("call_forwarding_enabled")

    /**
     * Call forwarding type. 'forwards_to' must be set for this to have an effect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forwardingType(): Optional<ForwardingType> = forwardingType.getOptional("forwarding_type")

    /**
     * The phone number to which inbound calls to this number are forwarded. Inbound calls will not
     * be forwarded if this field is left blank. If set, must be a +E.164-formatted phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forwardsTo(): Optional<String> = forwardsTo.getOptional("forwards_to")

    /**
     * Returns the raw JSON value of [callForwardingEnabled].
     *
     * Unlike [callForwardingEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("call_forwarding_enabled")
    @ExcludeMissing
    fun _callForwardingEnabled(): JsonField<Boolean> = callForwardingEnabled

    /**
     * Returns the raw JSON value of [forwardingType].
     *
     * Unlike [forwardingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("forwarding_type")
    @ExcludeMissing
    fun _forwardingType(): JsonField<ForwardingType> = forwardingType

    /**
     * Returns the raw JSON value of [forwardsTo].
     *
     * Unlike [forwardsTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("forwards_to") @ExcludeMissing fun _forwardsTo(): JsonField<String> = forwardsTo

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

        /** Returns a mutable builder for constructing an instance of [CallForwarding]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallForwarding]. */
    class Builder internal constructor() {

        private var callForwardingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var forwardingType: JsonField<ForwardingType> = JsonMissing.of()
        private var forwardsTo: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callForwarding: CallForwarding) = apply {
            callForwardingEnabled = callForwarding.callForwardingEnabled
            forwardingType = callForwarding.forwardingType
            forwardsTo = callForwarding.forwardsTo
            additionalProperties = callForwarding.additionalProperties.toMutableMap()
        }

        /**
         * Indicates if call forwarding will be enabled for this number if forwards_to and
         * forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1
         * use of numbers endpoints.
         */
        fun callForwardingEnabled(callForwardingEnabled: Boolean) =
            callForwardingEnabled(JsonField.of(callForwardingEnabled))

        /**
         * Sets [Builder.callForwardingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callForwardingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callForwardingEnabled(callForwardingEnabled: JsonField<Boolean>) = apply {
            this.callForwardingEnabled = callForwardingEnabled
        }

        /** Call forwarding type. 'forwards_to' must be set for this to have an effect. */
        fun forwardingType(forwardingType: ForwardingType) =
            forwardingType(JsonField.of(forwardingType))

        /**
         * Sets [Builder.forwardingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forwardingType] with a well-typed [ForwardingType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun forwardingType(forwardingType: JsonField<ForwardingType>) = apply {
            this.forwardingType = forwardingType
        }

        /**
         * The phone number to which inbound calls to this number are forwarded. Inbound calls will
         * not be forwarded if this field is left blank. If set, must be a +E.164-formatted phone
         * number.
         */
        fun forwardsTo(forwardsTo: String) = forwardsTo(JsonField.of(forwardsTo))

        /**
         * Sets [Builder.forwardsTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forwardsTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun forwardsTo(forwardsTo: JsonField<String>) = apply { this.forwardsTo = forwardsTo }

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
         * Returns an immutable instance of [CallForwarding].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallForwarding =
            CallForwarding(
                callForwardingEnabled,
                forwardingType,
                forwardsTo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CallForwarding = apply {
        if (validated) {
            return@apply
        }

        callForwardingEnabled()
        forwardingType().ifPresent { it.validate() }
        forwardsTo()
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
        (if (callForwardingEnabled.asKnown().isPresent) 1 else 0) +
            (forwardingType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (forwardsTo.asKnown().isPresent) 1 else 0)

    /** Call forwarding type. 'forwards_to' must be set for this to have an effect. */
    class ForwardingType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALWAYS = of("always")

            @JvmField val ON_FAILURE = of("on-failure")

            @JvmStatic fun of(value: String) = ForwardingType(JsonField.of(value))
        }

        /** An enum containing [ForwardingType]'s known values. */
        enum class Known {
            ALWAYS,
            ON_FAILURE,
        }

        /**
         * An enum containing [ForwardingType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ForwardingType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALWAYS,
            ON_FAILURE,
            /**
             * An enum member indicating that [ForwardingType] was instantiated with an unknown
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
                ALWAYS -> Value.ALWAYS
                ON_FAILURE -> Value.ON_FAILURE
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
                ALWAYS -> Known.ALWAYS
                ON_FAILURE -> Known.ON_FAILURE
                else -> throw TelnyxInvalidDataException("Unknown ForwardingType: $value")
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

        fun validate(): ForwardingType = apply {
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

            return other is ForwardingType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallForwarding &&
            callForwardingEnabled == other.callForwardingEnabled &&
            forwardingType == other.forwardingType &&
            forwardsTo == other.forwardsTo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(callForwardingEnabled, forwardingType, forwardsTo, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallForwarding{callForwardingEnabled=$callForwardingEnabled, forwardingType=$forwardingType, forwardsTo=$forwardsTo, additionalProperties=$additionalProperties}"
}
