// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.events

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val STATUS_CHANGE = of("status_change")

        @JvmField val STEP_STARTED = of("step_started")

        @JvmField val STEP_COMPLETED = of("step_completed")

        @JvmField val STEP_FAILED = of("step_failed")

        @JvmField val TOOL_CALL = of("tool_call")

        @JvmField val TOOL_RESULT = of("tool_result")

        @JvmField val MESSAGE = of("message")

        @JvmField val ERROR = of("error")

        @JvmField val CUSTOM = of("custom")

        @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
    }

    /** An enum containing [EventType]'s known values. */
    enum class Known {
        STATUS_CHANGE,
        STEP_STARTED,
        STEP_COMPLETED,
        STEP_FAILED,
        TOOL_CALL,
        TOOL_RESULT,
        MESSAGE,
        ERROR,
        CUSTOM,
    }

    /**
     * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [EventType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        STATUS_CHANGE,
        STEP_STARTED,
        STEP_COMPLETED,
        STEP_FAILED,
        TOOL_CALL,
        TOOL_RESULT,
        MESSAGE,
        ERROR,
        CUSTOM,
        /** An enum member indicating that [EventType] was instantiated with an unknown value. */
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
            STATUS_CHANGE -> Value.STATUS_CHANGE
            STEP_STARTED -> Value.STEP_STARTED
            STEP_COMPLETED -> Value.STEP_COMPLETED
            STEP_FAILED -> Value.STEP_FAILED
            TOOL_CALL -> Value.TOOL_CALL
            TOOL_RESULT -> Value.TOOL_RESULT
            MESSAGE -> Value.MESSAGE
            ERROR -> Value.ERROR
            CUSTOM -> Value.CUSTOM
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
            STATUS_CHANGE -> Known.STATUS_CHANGE
            STEP_STARTED -> Known.STEP_STARTED
            STEP_COMPLETED -> Known.STEP_COMPLETED
            STEP_FAILED -> Known.STEP_FAILED
            TOOL_CALL -> Known.TOOL_CALL
            TOOL_RESULT -> Known.TOOL_RESULT
            MESSAGE -> Known.MESSAGE
            ERROR -> Known.ERROR
            CUSTOM -> Known.CUSTOM
            else -> throw TelnyxInvalidDataException("Unknown EventType: $value")
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
    fun validate(): EventType = apply {
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

        return other is EventType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
