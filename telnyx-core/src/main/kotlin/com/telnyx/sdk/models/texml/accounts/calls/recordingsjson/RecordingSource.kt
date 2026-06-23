// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordingsjson

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/** Defines how the recording was created. */
class RecordingSource @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val START_CALL_RECORDING_API = of("StartCallRecordingAPI")

        @JvmField val START_CONFERENCE_RECORDING_API = of("StartConferenceRecordingAPI")

        @JvmField val OUTBOUND_API = of("OutboundAPI")

        @JvmField val DIAL_VERB = of("DialVerb")

        @JvmField val CONFERENCE = of("Conference")

        @JvmField val RECORD_VERB = of("RecordVerb")

        @JvmField val TRUNKING = of("Trunking")

        @JvmStatic fun of(value: String) = RecordingSource(JsonField.of(value))
    }

    /** An enum containing [RecordingSource]'s known values. */
    enum class Known {
        START_CALL_RECORDING_API,
        START_CONFERENCE_RECORDING_API,
        OUTBOUND_API,
        DIAL_VERB,
        CONFERENCE,
        RECORD_VERB,
        TRUNKING,
    }

    /**
     * An enum containing [RecordingSource]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [RecordingSource] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        START_CALL_RECORDING_API,
        START_CONFERENCE_RECORDING_API,
        OUTBOUND_API,
        DIAL_VERB,
        CONFERENCE,
        RECORD_VERB,
        TRUNKING,
        /**
         * An enum member indicating that [RecordingSource] was instantiated with an unknown value.
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
            START_CALL_RECORDING_API -> Value.START_CALL_RECORDING_API
            START_CONFERENCE_RECORDING_API -> Value.START_CONFERENCE_RECORDING_API
            OUTBOUND_API -> Value.OUTBOUND_API
            DIAL_VERB -> Value.DIAL_VERB
            CONFERENCE -> Value.CONFERENCE
            RECORD_VERB -> Value.RECORD_VERB
            TRUNKING -> Value.TRUNKING
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
            START_CALL_RECORDING_API -> Known.START_CALL_RECORDING_API
            START_CONFERENCE_RECORDING_API -> Known.START_CONFERENCE_RECORDING_API
            OUTBOUND_API -> Known.OUTBOUND_API
            DIAL_VERB -> Known.DIAL_VERB
            CONFERENCE -> Known.CONFERENCE
            RECORD_VERB -> Known.RECORD_VERB
            TRUNKING -> Known.TRUNKING
            else -> throw TelnyxInvalidDataException("Unknown RecordingSource: $value")
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
    fun validate(): RecordingSource = apply {
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

        return other is RecordingSource && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
