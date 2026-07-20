// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/**
 * Lifecycle status of the filesystem. `ready` means it is fully provisioned and usable.
 * `needs_format` means the storage bucket and metadata database were provisioned but the filesystem
 * has not yet been formatted — run `juicefs format` with the filesystem's `meta_url` before
 * mounting. `failed` means the last lifecycle action failed — see the filesystem's `error` message.
 * `deleted` appears only in the delete response: deleted filesystems are excluded from list results
 * and return a `404` on retrieval.
 */
class CloudfsFilesystemStatus
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

        @JvmField val PROVISIONING = of("provisioning")

        @JvmField val READY = of("ready")

        @JvmField val NEEDS_FORMAT = of("needs_format")

        @JvmField val DELETING = of("deleting")

        @JvmField val FAILED = of("failed")

        @JvmField val DELETED = of("deleted")

        @JvmStatic fun of(value: String) = CloudfsFilesystemStatus(JsonField.of(value))
    }

    /** An enum containing [CloudfsFilesystemStatus]'s known values. */
    enum class Known {
        PROVISIONING,
        READY,
        NEEDS_FORMAT,
        DELETING,
        FAILED,
        DELETED,
    }

    /**
     * An enum containing [CloudfsFilesystemStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CloudfsFilesystemStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PROVISIONING,
        READY,
        NEEDS_FORMAT,
        DELETING,
        FAILED,
        DELETED,
        /**
         * An enum member indicating that [CloudfsFilesystemStatus] was instantiated with an unknown
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
            PROVISIONING -> Value.PROVISIONING
            READY -> Value.READY
            NEEDS_FORMAT -> Value.NEEDS_FORMAT
            DELETING -> Value.DELETING
            FAILED -> Value.FAILED
            DELETED -> Value.DELETED
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
            PROVISIONING -> Known.PROVISIONING
            READY -> Known.READY
            NEEDS_FORMAT -> Known.NEEDS_FORMAT
            DELETING -> Known.DELETING
            FAILED -> Known.FAILED
            DELETED -> Known.DELETED
            else -> throw TelnyxInvalidDataException("Unknown CloudfsFilesystemStatus: $value")
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
    fun validate(): CloudfsFilesystemStatus = apply {
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

        return other is CloudfsFilesystemStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
