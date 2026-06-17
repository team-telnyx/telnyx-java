// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * DIR lifecycle status.
 * - `draft` - newly created; editable; not yet submitted.
 * - `submitted` / `in_review` - Telnyx is reviewing.
 * - `verified` - approved; phone numbers may be attached.
 * - `rejected` - Telnyx rejected this submission; `rejection_reasons` is populated; customer can
 *   edit and resubmit.
 * - `unsuccessful` - system-side error during processing; customer can edit and resubmit.
 * - `suspended` - temporarily disabled (e.g. by an active infringement claim).
 * - `expired` - verification expired; customer must resubmit.
 * - `infringement_claimed` - a trademark/impersonation claim is open against this DIR.
 * - `permanently_rejected` - terminal; cannot be resubmitted.
 */
class DirStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val DRAFT = of("draft")

        @JvmField val SUBMITTED = of("submitted")

        @JvmField val IN_REVIEW = of("in_review")

        @JvmField val VERIFIED = of("verified")

        @JvmField val REJECTED = of("rejected")

        @JvmField val UNSUCCESSFUL = of("unsuccessful")

        @JvmField val SUSPENDED = of("suspended")

        @JvmField val EXPIRED = of("expired")

        @JvmField val INFRINGEMENT_CLAIMED = of("infringement_claimed")

        @JvmField val PERMANENTLY_REJECTED = of("permanently_rejected")

        @JvmStatic fun of(value: String) = DirStatus(JsonField.of(value))
    }

    /** An enum containing [DirStatus]'s known values. */
    enum class Known {
        DRAFT,
        SUBMITTED,
        IN_REVIEW,
        VERIFIED,
        REJECTED,
        UNSUCCESSFUL,
        SUSPENDED,
        EXPIRED,
        INFRINGEMENT_CLAIMED,
        PERMANENTLY_REJECTED,
    }

    /**
     * An enum containing [DirStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [DirStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DRAFT,
        SUBMITTED,
        IN_REVIEW,
        VERIFIED,
        REJECTED,
        UNSUCCESSFUL,
        SUSPENDED,
        EXPIRED,
        INFRINGEMENT_CLAIMED,
        PERMANENTLY_REJECTED,
        /** An enum member indicating that [DirStatus] was instantiated with an unknown value. */
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
            DRAFT -> Value.DRAFT
            SUBMITTED -> Value.SUBMITTED
            IN_REVIEW -> Value.IN_REVIEW
            VERIFIED -> Value.VERIFIED
            REJECTED -> Value.REJECTED
            UNSUCCESSFUL -> Value.UNSUCCESSFUL
            SUSPENDED -> Value.SUSPENDED
            EXPIRED -> Value.EXPIRED
            INFRINGEMENT_CLAIMED -> Value.INFRINGEMENT_CLAIMED
            PERMANENTLY_REJECTED -> Value.PERMANENTLY_REJECTED
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
            DRAFT -> Known.DRAFT
            SUBMITTED -> Known.SUBMITTED
            IN_REVIEW -> Known.IN_REVIEW
            VERIFIED -> Known.VERIFIED
            REJECTED -> Known.REJECTED
            UNSUCCESSFUL -> Known.UNSUCCESSFUL
            SUSPENDED -> Known.SUSPENDED
            EXPIRED -> Known.EXPIRED
            INFRINGEMENT_CLAIMED -> Known.INFRINGEMENT_CLAIMED
            PERMANENTLY_REJECTED -> Known.PERMANENTLY_REJECTED
            else -> throw TelnyxInvalidDataException("Unknown DirStatus: $value")
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
    fun validate(): DirStatus = apply {
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

        return other is DirStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
