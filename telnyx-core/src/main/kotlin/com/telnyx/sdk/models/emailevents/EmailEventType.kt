// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

class EmailEventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val QUEUED = of("queued")

        @JvmField val DEFERRED = of("deferred")

        @JvmField val SCHEDULED = of("scheduled")

        @JvmField val CANCELLED = of("cancelled")

        @JvmField val SANDBOX = of("sandbox")

        @JvmField val SENDING = of("sending")

        @JvmField val SENT = of("sent")

        @JvmField val FAILED = of("failed")

        @JvmField val DELIVERED = of("delivered")

        @JvmField val BOUNCED = of("bounced")

        @JvmField val COMPLAINED = of("complained")

        @JvmField val REJECTED = of("rejected")

        @JvmField val OPENED = of("opened")

        @JvmField val CLICKED = of("clicked")

        @JvmField val UNSUBSCRIBED = of("unsubscribed")

        @JvmField val DAILY_LIMIT_EXCEEDED = of("daily_limit_exceeded")

        @JvmStatic fun of(value: String) = EmailEventType(JsonField.of(value))
    }

    /** An enum containing [EmailEventType]'s known values. */
    enum class Known {
        QUEUED,
        DEFERRED,
        SCHEDULED,
        CANCELLED,
        SANDBOX,
        SENDING,
        SENT,
        FAILED,
        DELIVERED,
        BOUNCED,
        COMPLAINED,
        REJECTED,
        OPENED,
        CLICKED,
        UNSUBSCRIBED,
        DAILY_LIMIT_EXCEEDED,
    }

    /**
     * An enum containing [EmailEventType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [EmailEventType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        QUEUED,
        DEFERRED,
        SCHEDULED,
        CANCELLED,
        SANDBOX,
        SENDING,
        SENT,
        FAILED,
        DELIVERED,
        BOUNCED,
        COMPLAINED,
        REJECTED,
        OPENED,
        CLICKED,
        UNSUBSCRIBED,
        DAILY_LIMIT_EXCEEDED,
        /**
         * An enum member indicating that [EmailEventType] was instantiated with an unknown value.
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
            QUEUED -> Value.QUEUED
            DEFERRED -> Value.DEFERRED
            SCHEDULED -> Value.SCHEDULED
            CANCELLED -> Value.CANCELLED
            SANDBOX -> Value.SANDBOX
            SENDING -> Value.SENDING
            SENT -> Value.SENT
            FAILED -> Value.FAILED
            DELIVERED -> Value.DELIVERED
            BOUNCED -> Value.BOUNCED
            COMPLAINED -> Value.COMPLAINED
            REJECTED -> Value.REJECTED
            OPENED -> Value.OPENED
            CLICKED -> Value.CLICKED
            UNSUBSCRIBED -> Value.UNSUBSCRIBED
            DAILY_LIMIT_EXCEEDED -> Value.DAILY_LIMIT_EXCEEDED
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
            QUEUED -> Known.QUEUED
            DEFERRED -> Known.DEFERRED
            SCHEDULED -> Known.SCHEDULED
            CANCELLED -> Known.CANCELLED
            SANDBOX -> Known.SANDBOX
            SENDING -> Known.SENDING
            SENT -> Known.SENT
            FAILED -> Known.FAILED
            DELIVERED -> Known.DELIVERED
            BOUNCED -> Known.BOUNCED
            COMPLAINED -> Known.COMPLAINED
            REJECTED -> Known.REJECTED
            OPENED -> Known.OPENED
            CLICKED -> Known.CLICKED
            UNSUBSCRIBED -> Known.UNSUBSCRIBED
            DAILY_LIMIT_EXCEEDED -> Known.DAILY_LIMIT_EXCEEDED
            else -> throw TelnyxInvalidDataException("Unknown EmailEventType: $value")
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
    fun validate(): EmailEventType = apply {
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

        return other is EmailEventType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
