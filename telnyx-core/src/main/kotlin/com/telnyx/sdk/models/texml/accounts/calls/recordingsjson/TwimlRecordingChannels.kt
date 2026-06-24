// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordingsjson

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import kotlin.jvm.optionals.getOrNull

class TwimlRecordingChannels @JsonCreator private constructor(private val value: JsonField<Long>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

    companion object {

        @JvmField val CHANNEL_1 = of(1L)

        @JvmField val CHANNEL_2 = of(2L)

        @JvmStatic fun of(value: Long) = TwimlRecordingChannels(JsonField.of(value))
    }

    /** An enum containing [TwimlRecordingChannels]'s known values. */
    enum class Known {
        CHANNEL_1,
        CHANNEL_2,
    }

    /**
     * An enum containing [TwimlRecordingChannels]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [TwimlRecordingChannels] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        CHANNEL_1,
        CHANNEL_2,
        /**
         * An enum member indicating that [TwimlRecordingChannels] was instantiated with an unknown
         * value.
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
            CHANNEL_1 -> Value.CHANNEL_1
            CHANNEL_2 -> Value.CHANNEL_2
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
            CHANNEL_1 -> Known.CHANNEL_1
            CHANNEL_2 -> Known.CHANNEL_2
            else -> throw TelnyxInvalidDataException("Unknown TwimlRecordingChannels: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * @throws TelnyxInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asLong(): Long =
        _value().asNumber().getOrNull()?.let { if (it.toDouble() % 1 == 0.0) it.toLong() else null }
            ?: throw TelnyxInvalidDataException("Value is not a Long")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TwimlRecordingChannels = apply {
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

        return other is TwimlRecordingChannels && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
