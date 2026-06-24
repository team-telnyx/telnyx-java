// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * Controls when caller input can interrupt assistant speech. `any` allows speech or DTMF
 * interruptions; `none` disables interruptions; `speech` allows speech only; `dtmf` allows DTMF
 * only.
 */
class ConversationRelayInterruptible
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

        @JvmField val NONE = of("none")

        @JvmField val ANY = of("any")

        @JvmField val SPEECH = of("speech")

        @JvmField val DTMF = of("dtmf")

        @JvmStatic fun of(value: String) = ConversationRelayInterruptible(JsonField.of(value))
    }

    /** An enum containing [ConversationRelayInterruptible]'s known values. */
    enum class Known {
        NONE,
        ANY,
        SPEECH,
        DTMF,
    }

    /**
     * An enum containing [ConversationRelayInterruptible]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [ConversationRelayInterruptible] can contain an unknown value in a couple of
     * cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        NONE,
        ANY,
        SPEECH,
        DTMF,
        /**
         * An enum member indicating that [ConversationRelayInterruptible] was instantiated with an
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
            NONE -> Value.NONE
            ANY -> Value.ANY
            SPEECH -> Value.SPEECH
            DTMF -> Value.DTMF
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
            NONE -> Known.NONE
            ANY -> Known.ANY
            SPEECH -> Known.SPEECH
            DTMF -> Known.DTMF
            else ->
                throw TelnyxInvalidDataException("Unknown ConversationRelayInterruptible: $value")
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
    fun validate(): ConversationRelayInterruptible = apply {
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

        return other is ConversationRelayInterruptible && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
