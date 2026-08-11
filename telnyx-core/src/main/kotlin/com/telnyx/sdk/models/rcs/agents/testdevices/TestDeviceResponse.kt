// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents.testdevices

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class TestDeviceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inviteStatus: JsonField<InviteStatus>,
    private val phoneNumber: JsonField<String>,
    private val testDeviceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("invite_status")
        @ExcludeMissing
        inviteStatus: JsonField<InviteStatus> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("test_device_id")
        @ExcludeMissing
        testDeviceId: JsonField<String> = JsonMissing.of(),
    ) : this(inviteStatus, phoneNumber, testDeviceId, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inviteStatus(): InviteStatus = inviteStatus.getRequired("invite_status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun testDeviceId(): String = testDeviceId.getRequired("test_device_id")

    /**
     * Returns the raw JSON value of [inviteStatus].
     *
     * Unlike [inviteStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invite_status")
    @ExcludeMissing
    fun _inviteStatus(): JsonField<InviteStatus> = inviteStatus

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [testDeviceId].
     *
     * Unlike [testDeviceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_device_id")
    @ExcludeMissing
    fun _testDeviceId(): JsonField<String> = testDeviceId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TestDeviceResponse].
         *
         * The following fields are required:
         * ```java
         * .inviteStatus()
         * .phoneNumber()
         * .testDeviceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestDeviceResponse]. */
    class Builder internal constructor() {

        private var inviteStatus: JsonField<InviteStatus>? = null
        private var phoneNumber: JsonField<String>? = null
        private var testDeviceId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(testDeviceResponse: TestDeviceResponse) = apply {
            inviteStatus = testDeviceResponse.inviteStatus
            phoneNumber = testDeviceResponse.phoneNumber
            testDeviceId = testDeviceResponse.testDeviceId
            additionalProperties = testDeviceResponse.additionalProperties.toMutableMap()
        }

        fun inviteStatus(inviteStatus: InviteStatus) = inviteStatus(JsonField.of(inviteStatus))

        /**
         * Sets [Builder.inviteStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inviteStatus] with a well-typed [InviteStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inviteStatus(inviteStatus: JsonField<InviteStatus>) = apply {
            this.inviteStatus = inviteStatus
        }

        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun testDeviceId(testDeviceId: String) = testDeviceId(JsonField.of(testDeviceId))

        /**
         * Sets [Builder.testDeviceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testDeviceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun testDeviceId(testDeviceId: JsonField<String>) = apply {
            this.testDeviceId = testDeviceId
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [TestDeviceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inviteStatus()
         * .phoneNumber()
         * .testDeviceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestDeviceResponse =
            TestDeviceResponse(
                checkRequired("inviteStatus", inviteStatus),
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("testDeviceId", testDeviceId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TestDeviceResponse = apply {
        if (validated) {
            return@apply
        }

        inviteStatus().validate()
        phoneNumber()
        testDeviceId()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (inviteStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (testDeviceId.asKnown().isPresent) 1 else 0)

    class InviteStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("PENDING")

            @JvmField val ACCEPTED = of("ACCEPTED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmStatic fun of(value: String) = InviteStatus(JsonField.of(value))
        }

        /** An enum containing [InviteStatus]'s known values. */
        enum class Known {
            PENDING,
            ACCEPTED,
            DECLINED,
        }

        /**
         * An enum containing [InviteStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InviteStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ACCEPTED,
            DECLINED,
            /**
             * An enum member indicating that [InviteStatus] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                ACCEPTED -> Value.ACCEPTED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                ACCEPTED -> Known.ACCEPTED
                DECLINED -> Known.DECLINED
                else -> throw TelnyxInvalidDataException("Unknown InviteStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InviteStatus = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InviteStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestDeviceResponse &&
            inviteStatus == other.inviteStatus &&
            phoneNumber == other.phoneNumber &&
            testDeviceId == other.testDeviceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(inviteStatus, phoneNumber, testDeviceId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TestDeviceResponse{inviteStatus=$inviteStatus, phoneNumber=$phoneNumber, testDeviceId=$testDeviceId, additionalProperties=$additionalProperties}"
}
