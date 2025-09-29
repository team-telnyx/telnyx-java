// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaginghostednumberorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessagingHostedNumberOrderCheckEligibilityResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val phoneNumbers: JsonField<List<PhoneNumber>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of()
    ) : this(phoneNumbers, mutableMapOf())

    /**
     * List of phone numbers with their eligibility status.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<PhoneNumber>> = phoneNumbers.getOptional("phone_numbers")

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

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
         * Returns a mutable builder for constructing an instance of
         * [MessagingHostedNumberOrderCheckEligibilityResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingHostedNumberOrderCheckEligibilityResponse]. */
    class Builder internal constructor() {

        private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            messagingHostedNumberOrderCheckEligibilityResponse:
                MessagingHostedNumberOrderCheckEligibilityResponse
        ) = apply {
            phoneNumbers =
                messagingHostedNumberOrderCheckEligibilityResponse.phoneNumbers.map {
                    it.toMutableList()
                }
            additionalProperties =
                messagingHostedNumberOrderCheckEligibilityResponse.additionalProperties
                    .toMutableMap()
        }

        /** List of phone numbers with their eligibility status. */
        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [PhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
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
         * Returns an immutable instance of [MessagingHostedNumberOrderCheckEligibilityResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingHostedNumberOrderCheckEligibilityResponse =
            MessagingHostedNumberOrderCheckEligibilityResponse(
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessagingHostedNumberOrderCheckEligibilityResponse = apply {
        if (validated) {
            return@apply
        }

        phoneNumbers().ifPresent { it.forEach { it.validate() } }
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
        (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class PhoneNumber
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val detail: JsonField<String>,
        private val eligible: JsonField<Boolean>,
        private val eligibleStatus: JsonField<EligibleStatus>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("detail") @ExcludeMissing detail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("eligible")
            @ExcludeMissing
            eligible: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("eligible_status")
            @ExcludeMissing
            eligibleStatus: JsonField<EligibleStatus> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(detail, eligible, eligibleStatus, phoneNumber, mutableMapOf())

        /**
         * Detailed information about the eligibility status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun detail(): Optional<String> = detail.getOptional("detail")

        /**
         * Whether the phone number is eligible for hosted messaging.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eligible(): Optional<Boolean> = eligible.getOptional("eligible")

        /**
         * The eligibility status of the phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eligibleStatus(): Optional<EligibleStatus> =
            eligibleStatus.getOptional("eligible_status")

        /**
         * The phone number in e164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Returns the raw JSON value of [detail].
         *
         * Unlike [detail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detail") @ExcludeMissing fun _detail(): JsonField<String> = detail

        /**
         * Returns the raw JSON value of [eligible].
         *
         * Unlike [eligible], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eligible") @ExcludeMissing fun _eligible(): JsonField<Boolean> = eligible

        /**
         * Returns the raw JSON value of [eligibleStatus].
         *
         * Unlike [eligibleStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("eligible_status")
        @ExcludeMissing
        fun _eligibleStatus(): JsonField<EligibleStatus> = eligibleStatus

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PhoneNumber]. */
        class Builder internal constructor() {

            private var detail: JsonField<String> = JsonMissing.of()
            private var eligible: JsonField<Boolean> = JsonMissing.of()
            private var eligibleStatus: JsonField<EligibleStatus> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phoneNumber: PhoneNumber) = apply {
                detail = phoneNumber.detail
                eligible = phoneNumber.eligible
                eligibleStatus = phoneNumber.eligibleStatus
                this.phoneNumber = phoneNumber.phoneNumber
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
            }

            /** Detailed information about the eligibility status. */
            fun detail(detail: String) = detail(JsonField.of(detail))

            /**
             * Sets [Builder.detail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detail(detail: JsonField<String>) = apply { this.detail = detail }

            /** Whether the phone number is eligible for hosted messaging. */
            fun eligible(eligible: Boolean) = eligible(JsonField.of(eligible))

            /**
             * Sets [Builder.eligible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eligible] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eligible(eligible: JsonField<Boolean>) = apply { this.eligible = eligible }

            /** The eligibility status of the phone number. */
            fun eligibleStatus(eligibleStatus: EligibleStatus) =
                eligibleStatus(JsonField.of(eligibleStatus))

            /**
             * Sets [Builder.eligibleStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eligibleStatus] with a well-typed [EligibleStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun eligibleStatus(eligibleStatus: JsonField<EligibleStatus>) = apply {
                this.eligibleStatus = eligibleStatus
            }

            /** The phone number in e164 format. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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
             * Returns an immutable instance of [PhoneNumber].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PhoneNumber =
                PhoneNumber(
                    detail,
                    eligible,
                    eligibleStatus,
                    phoneNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PhoneNumber = apply {
            if (validated) {
                return@apply
            }

            detail()
            eligible()
            eligibleStatus().ifPresent { it.validate() }
            phoneNumber()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (detail.asKnown().isPresent) 1 else 0) +
                (if (eligible.asKnown().isPresent) 1 else 0) +
                (eligibleStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        /** The eligibility status of the phone number. */
        class EligibleStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NUMBER_CAN_NOT_BE_REPEATED = of("NUMBER_CAN_NOT_BE_REPEATED")

                @JvmField val NUMBER_CAN_NOT_BE_VALIDATED = of("NUMBER_CAN_NOT_BE_VALIDATED")

                @JvmField val NUMBER_CAN_NOT_BE_WIRELESS = of("NUMBER_CAN_NOT_BE_WIRELESS")

                @JvmField
                val NUMBER_CAN_NOT_BE_ACTIVE_IN_YOUR_ACCOUNT =
                    of("NUMBER_CAN_NOT_BE_ACTIVE_IN_YOUR_ACCOUNT")

                @JvmField
                val NUMBER_CAN_NOT_HOSTED_WITH_A_TELNYX_SUBSCRIBER =
                    of("NUMBER_CAN_NOT_HOSTED_WITH_A_TELNYX_SUBSCRIBER")

                @JvmField val NUMBER_CAN_NOT_BE_IN_TELNYX = of("NUMBER_CAN_NOT_BE_IN_TELNYX")

                @JvmField val NUMBER_IS_NOT_A_US_NUMBER = of("NUMBER_IS_NOT_A_US_NUMBER")

                @JvmField
                val NUMBER_IS_NOT_A_VALID_ROUTING_NUMBER =
                    of("NUMBER_IS_NOT_A_VALID_ROUTING_NUMBER")

                @JvmField val NUMBER_IS_NOT_IN_E164_FORMAT = of("NUMBER_IS_NOT_IN_E164_FORMAT")

                @JvmField val BILLING_ACCOUNT_CHECK_FAILED = of("BILLING_ACCOUNT_CHECK_FAILED")

                @JvmField val BILLING_ACCOUNT_IS_ABOLISHED = of("BILLING_ACCOUNT_IS_ABOLISHED")

                @JvmField val ELIGIBLE = of("ELIGIBLE")

                @JvmStatic fun of(value: String) = EligibleStatus(JsonField.of(value))
            }

            /** An enum containing [EligibleStatus]'s known values. */
            enum class Known {
                NUMBER_CAN_NOT_BE_REPEATED,
                NUMBER_CAN_NOT_BE_VALIDATED,
                NUMBER_CAN_NOT_BE_WIRELESS,
                NUMBER_CAN_NOT_BE_ACTIVE_IN_YOUR_ACCOUNT,
                NUMBER_CAN_NOT_HOSTED_WITH_A_TELNYX_SUBSCRIBER,
                NUMBER_CAN_NOT_BE_IN_TELNYX,
                NUMBER_IS_NOT_A_US_NUMBER,
                NUMBER_IS_NOT_A_VALID_ROUTING_NUMBER,
                NUMBER_IS_NOT_IN_E164_FORMAT,
                BILLING_ACCOUNT_CHECK_FAILED,
                BILLING_ACCOUNT_IS_ABOLISHED,
                ELIGIBLE,
            }

            /**
             * An enum containing [EligibleStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EligibleStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NUMBER_CAN_NOT_BE_REPEATED,
                NUMBER_CAN_NOT_BE_VALIDATED,
                NUMBER_CAN_NOT_BE_WIRELESS,
                NUMBER_CAN_NOT_BE_ACTIVE_IN_YOUR_ACCOUNT,
                NUMBER_CAN_NOT_HOSTED_WITH_A_TELNYX_SUBSCRIBER,
                NUMBER_CAN_NOT_BE_IN_TELNYX,
                NUMBER_IS_NOT_A_US_NUMBER,
                NUMBER_IS_NOT_A_VALID_ROUTING_NUMBER,
                NUMBER_IS_NOT_IN_E164_FORMAT,
                BILLING_ACCOUNT_CHECK_FAILED,
                BILLING_ACCOUNT_IS_ABOLISHED,
                ELIGIBLE,
                /**
                 * An enum member indicating that [EligibleStatus] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NUMBER_CAN_NOT_BE_REPEATED -> Value.NUMBER_CAN_NOT_BE_REPEATED
                    NUMBER_CAN_NOT_BE_VALIDATED -> Value.NUMBER_CAN_NOT_BE_VALIDATED
                    NUMBER_CAN_NOT_BE_WIRELESS -> Value.NUMBER_CAN_NOT_BE_WIRELESS
                    NUMBER_CAN_NOT_BE_ACTIVE_IN_YOUR_ACCOUNT ->
                        Value.NUMBER_CAN_NOT_BE_ACTIVE_IN_YOUR_ACCOUNT
                    NUMBER_CAN_NOT_HOSTED_WITH_A_TELNYX_SUBSCRIBER ->
                        Value.NUMBER_CAN_NOT_HOSTED_WITH_A_TELNYX_SUBSCRIBER
                    NUMBER_CAN_NOT_BE_IN_TELNYX -> Value.NUMBER_CAN_NOT_BE_IN_TELNYX
                    NUMBER_IS_NOT_A_US_NUMBER -> Value.NUMBER_IS_NOT_A_US_NUMBER
                    NUMBER_IS_NOT_A_VALID_ROUTING_NUMBER ->
                        Value.NUMBER_IS_NOT_A_VALID_ROUTING_NUMBER
                    NUMBER_IS_NOT_IN_E164_FORMAT -> Value.NUMBER_IS_NOT_IN_E164_FORMAT
                    BILLING_ACCOUNT_CHECK_FAILED -> Value.BILLING_ACCOUNT_CHECK_FAILED
                    BILLING_ACCOUNT_IS_ABOLISHED -> Value.BILLING_ACCOUNT_IS_ABOLISHED
                    ELIGIBLE -> Value.ELIGIBLE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NUMBER_CAN_NOT_BE_REPEATED -> Known.NUMBER_CAN_NOT_BE_REPEATED
                    NUMBER_CAN_NOT_BE_VALIDATED -> Known.NUMBER_CAN_NOT_BE_VALIDATED
                    NUMBER_CAN_NOT_BE_WIRELESS -> Known.NUMBER_CAN_NOT_BE_WIRELESS
                    NUMBER_CAN_NOT_BE_ACTIVE_IN_YOUR_ACCOUNT ->
                        Known.NUMBER_CAN_NOT_BE_ACTIVE_IN_YOUR_ACCOUNT
                    NUMBER_CAN_NOT_HOSTED_WITH_A_TELNYX_SUBSCRIBER ->
                        Known.NUMBER_CAN_NOT_HOSTED_WITH_A_TELNYX_SUBSCRIBER
                    NUMBER_CAN_NOT_BE_IN_TELNYX -> Known.NUMBER_CAN_NOT_BE_IN_TELNYX
                    NUMBER_IS_NOT_A_US_NUMBER -> Known.NUMBER_IS_NOT_A_US_NUMBER
                    NUMBER_IS_NOT_A_VALID_ROUTING_NUMBER ->
                        Known.NUMBER_IS_NOT_A_VALID_ROUTING_NUMBER
                    NUMBER_IS_NOT_IN_E164_FORMAT -> Known.NUMBER_IS_NOT_IN_E164_FORMAT
                    BILLING_ACCOUNT_CHECK_FAILED -> Known.BILLING_ACCOUNT_CHECK_FAILED
                    BILLING_ACCOUNT_IS_ABOLISHED -> Known.BILLING_ACCOUNT_IS_ABOLISHED
                    ELIGIBLE -> Known.ELIGIBLE
                    else -> throw TelnyxInvalidDataException("Unknown EligibleStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): EligibleStatus = apply {
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

                return other is EligibleStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumber &&
                detail == other.detail &&
                eligible == other.eligible &&
                eligibleStatus == other.eligibleStatus &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(detail, eligible, eligibleStatus, phoneNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumber{detail=$detail, eligible=$eligible, eligibleStatus=$eligibleStatus, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingHostedNumberOrderCheckEligibilityResponse &&
            phoneNumbers == other.phoneNumbers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(phoneNumbers, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingHostedNumberOrderCheckEligibilityResponse{phoneNumbers=$phoneNumbers, additionalProperties=$additionalProperties}"
}
