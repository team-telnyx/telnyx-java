// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * Result of ongoing ownership checks. `verified`: the number is with the carrier on record.
 * `pending_confirmation`: the number's carrier changed, or a periodic ownership re-verification is
 * due; confirm you still own it before `confirm_by`. `flagged`: a periodic re-verification went
 * unanswered; the number stays monitored and is not removed, but confirm ownership (`POST
 * .../ownership_confirm`) to return it to `verified`. `removed`: the number is no longer monitored;
 * returned by `POST .../ownership_confirm` with `still_own: false`, and when listing numbers with
 * `filter[ownership_status]=removed`.
 */
class ReputationOwnershipStatus
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

        @JvmField val VERIFIED = of("verified")

        @JvmField val FLAGGED = of("flagged")

        @JvmField val PENDING_CONFIRMATION = of("pending_confirmation")

        @JvmField val REMOVED = of("removed")

        @JvmStatic fun of(value: String) = ReputationOwnershipStatus(JsonField.of(value))
    }

    /** An enum containing [ReputationOwnershipStatus]'s known values. */
    enum class Known {
        VERIFIED,
        FLAGGED,
        PENDING_CONFIRMATION,
        REMOVED,
    }

    /**
     * An enum containing [ReputationOwnershipStatus]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [ReputationOwnershipStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        VERIFIED,
        FLAGGED,
        PENDING_CONFIRMATION,
        REMOVED,
        /**
         * An enum member indicating that [ReputationOwnershipStatus] was instantiated with an
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
            VERIFIED -> Value.VERIFIED
            FLAGGED -> Value.FLAGGED
            PENDING_CONFIRMATION -> Value.PENDING_CONFIRMATION
            REMOVED -> Value.REMOVED
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
            VERIFIED -> Known.VERIFIED
            FLAGGED -> Known.FLAGGED
            PENDING_CONFIRMATION -> Known.PENDING_CONFIRMATION
            REMOVED -> Known.REMOVED
            else -> throw TelnyxInvalidDataException("Unknown ReputationOwnershipStatus: $value")
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
    fun validate(): ReputationOwnershipStatus = apply {
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

        return other is ReputationOwnershipStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
