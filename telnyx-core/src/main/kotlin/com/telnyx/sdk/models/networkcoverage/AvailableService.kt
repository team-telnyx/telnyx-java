// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkcoverage

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

class AvailableService @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val CLOUD_VPN = of("cloud_vpn")

        @JvmField val PRIVATE_WIRELESS_GATEWAY = of("private_wireless_gateway")

        @JvmField val VIRTUAL_CROSS_CONNECT = of("virtual_cross_connect")

        @JvmStatic fun of(value: String) = AvailableService(JsonField.of(value))
    }

    /** An enum containing [AvailableService]'s known values. */
    enum class Known {
        CLOUD_VPN,
        PRIVATE_WIRELESS_GATEWAY,
        VIRTUAL_CROSS_CONNECT,
    }

    /**
     * An enum containing [AvailableService]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [AvailableService] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        CLOUD_VPN,
        PRIVATE_WIRELESS_GATEWAY,
        VIRTUAL_CROSS_CONNECT,
        /**
         * An enum member indicating that [AvailableService] was instantiated with an unknown value.
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
            CLOUD_VPN -> Value.CLOUD_VPN
            PRIVATE_WIRELESS_GATEWAY -> Value.PRIVATE_WIRELESS_GATEWAY
            VIRTUAL_CROSS_CONNECT -> Value.VIRTUAL_CROSS_CONNECT
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
            CLOUD_VPN -> Known.CLOUD_VPN
            PRIVATE_WIRELESS_GATEWAY -> Known.PRIVATE_WIRELESS_GATEWAY
            VIRTUAL_CROSS_CONNECT -> Known.VIRTUAL_CROSS_CONNECT
            else -> throw TelnyxInvalidDataException("Unknown AvailableService: $value")
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

    fun validate(): AvailableService = apply {
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

        return other is AvailableService && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
