// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/** Activation status */
class PortingOrderActivationStatus
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

        @JvmField val NEW = of("New")

        @JvmField val PENDING = of("Pending")

        @JvmField val CONFLICT = of("Conflict")

        @JvmField val CANCEL_PENDING = of("Cancel Pending")

        @JvmField val FAILED = of("Failed")

        @JvmField val CONCURRED = of("Concurred")

        @JvmField val ACTIVATE_RDY = of("Activate RDY")

        @JvmField val DISCONNECT_PENDING = of("Disconnect Pending")

        @JvmField val CONCURRENCE_SENT = of("Concurrence Sent")

        @JvmField val OLD = of("Old")

        @JvmField val SENDING = of("Sending")

        @JvmField val ACTIVE = of("Active")

        @JvmField val CANCELLED = of("Cancelled")

        @JvmStatic fun of(value: String) = PortingOrderActivationStatus(JsonField.of(value))
    }

    /** An enum containing [PortingOrderActivationStatus]'s known values. */
    enum class Known {
        NEW,
        PENDING,
        CONFLICT,
        CANCEL_PENDING,
        FAILED,
        CONCURRED,
        ACTIVATE_RDY,
        DISCONNECT_PENDING,
        CONCURRENCE_SENT,
        OLD,
        SENDING,
        ACTIVE,
        CANCELLED,
    }

    /**
     * An enum containing [PortingOrderActivationStatus]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [PortingOrderActivationStatus] can contain an unknown value in a couple of
     * cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        NEW,
        PENDING,
        CONFLICT,
        CANCEL_PENDING,
        FAILED,
        CONCURRED,
        ACTIVATE_RDY,
        DISCONNECT_PENDING,
        CONCURRENCE_SENT,
        OLD,
        SENDING,
        ACTIVE,
        CANCELLED,
        /**
         * An enum member indicating that [PortingOrderActivationStatus] was instantiated with an
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
            NEW -> Value.NEW
            PENDING -> Value.PENDING
            CONFLICT -> Value.CONFLICT
            CANCEL_PENDING -> Value.CANCEL_PENDING
            FAILED -> Value.FAILED
            CONCURRED -> Value.CONCURRED
            ACTIVATE_RDY -> Value.ACTIVATE_RDY
            DISCONNECT_PENDING -> Value.DISCONNECT_PENDING
            CONCURRENCE_SENT -> Value.CONCURRENCE_SENT
            OLD -> Value.OLD
            SENDING -> Value.SENDING
            ACTIVE -> Value.ACTIVE
            CANCELLED -> Value.CANCELLED
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
            NEW -> Known.NEW
            PENDING -> Known.PENDING
            CONFLICT -> Known.CONFLICT
            CANCEL_PENDING -> Known.CANCEL_PENDING
            FAILED -> Known.FAILED
            CONCURRED -> Known.CONCURRED
            ACTIVATE_RDY -> Known.ACTIVATE_RDY
            DISCONNECT_PENDING -> Known.DISCONNECT_PENDING
            CONCURRENCE_SENT -> Known.CONCURRENCE_SENT
            OLD -> Known.OLD
            SENDING -> Known.SENDING
            ACTIVE -> Known.ACTIVE
            CANCELLED -> Known.CANCELLED
            else -> throw TelnyxInvalidDataException("Unknown PortingOrderActivationStatus: $value")
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
    fun validate(): PortingOrderActivationStatus = apply {
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

        return other is PortingOrderActivationStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
