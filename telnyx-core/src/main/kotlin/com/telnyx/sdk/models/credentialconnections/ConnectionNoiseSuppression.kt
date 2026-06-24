// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.credentialconnections

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * Controls when noise suppression is applied to calls. When set to 'inbound', noise suppression is
 * applied to incoming audio. When set to 'outbound', it's applied to outgoing audio. When set to
 * 'both', it's applied in both directions. When set to 'disabled', noise suppression is turned off.
 */
class ConnectionNoiseSuppression
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val INBOUND = of("inbound")

        @JvmField val OUTBOUND = of("outbound")

        @JvmField val BOTH = of("both")

        @JvmField val DISABLED = of("disabled")

        @JvmStatic fun of(value: String) = ConnectionNoiseSuppression(JsonField.of(value))
    }

    /** An enum containing [ConnectionNoiseSuppression]'s known values. */
    enum class Known {
        INBOUND,
        OUTBOUND,
        BOTH,
        DISABLED,
    }

    /**
     * An enum containing [ConnectionNoiseSuppression]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [ConnectionNoiseSuppression] can contain an unknown value in a couple of
     * cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        INBOUND,
        OUTBOUND,
        BOTH,
        DISABLED,
        /**
         * An enum member indicating that [ConnectionNoiseSuppression] was instantiated with an
         * unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            INBOUND -> Value.INBOUND
            OUTBOUND -> Value.OUTBOUND
            BOTH -> Value.BOTH
            DISABLED -> Value.DISABLED
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws TelnyxInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            INBOUND -> Known.INBOUND
            OUTBOUND -> Known.OUTBOUND
            BOTH -> Known.BOTH
            DISABLED -> Known.DISABLED
            else -> throw TelnyxInvalidDataException("Unknown ConnectionNoiseSuppression: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws TelnyxInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ConnectionNoiseSuppression = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionNoiseSuppression && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
