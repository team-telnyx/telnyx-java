// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomerServiceRecordVerifyPhoneNumberCoverageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * [CustomerServiceRecordVerifyPhoneNumberCoverageResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerServiceRecordVerifyPhoneNumberCoverageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerServiceRecordVerifyPhoneNumberCoverageResponse:
                CustomerServiceRecordVerifyPhoneNumberCoverageResponse
        ) = apply {
            data =
                customerServiceRecordVerifyPhoneNumberCoverageResponse.data.map {
                    it.toMutableList()
                }
            additionalProperties =
                customerServiceRecordVerifyPhoneNumberCoverageResponse.additionalProperties
                    .toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
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
         * Returns an immutable instance of
         * [CustomerServiceRecordVerifyPhoneNumberCoverageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerServiceRecordVerifyPhoneNumberCoverageResponse =
            CustomerServiceRecordVerifyPhoneNumberCoverageResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerServiceRecordVerifyPhoneNumberCoverageResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val additionalDataRequired: JsonField<List<AdditionalDataRequired>>,
        private val hasCsrCoverage: JsonField<Boolean>,
        private val phoneNumber: JsonField<String>,
        private val reason: JsonField<String>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("additional_data_required")
            @ExcludeMissing
            additionalDataRequired: JsonField<List<AdditionalDataRequired>> = JsonMissing.of(),
            @JsonProperty("has_csr_coverage")
            @ExcludeMissing
            hasCsrCoverage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(
            additionalDataRequired,
            hasCsrCoverage,
            phoneNumber,
            reason,
            recordType,
            mutableMapOf(),
        )

        /**
         * Additional data required to perform CSR for the phone number. Only returned if
         * `has_csr_coverage` is true.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun additionalDataRequired(): Optional<List<AdditionalDataRequired>> =
            additionalDataRequired.getOptional("additional_data_required")

        /**
         * Indicates whether the phone number is covered or not.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasCsrCoverage(): Optional<Boolean> = hasCsrCoverage.getOptional("has_csr_coverage")

        /**
         * The phone number that is being verified.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * The reason why the phone number is not covered. Only returned if `has_csr_coverage` is
         * false.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [additionalDataRequired].
         *
         * Unlike [additionalDataRequired], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("additional_data_required")
        @ExcludeMissing
        fun _additionalDataRequired(): JsonField<List<AdditionalDataRequired>> =
            additionalDataRequired

        /**
         * Returns the raw JSON value of [hasCsrCoverage].
         *
         * Unlike [hasCsrCoverage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("has_csr_coverage")
        @ExcludeMissing
        fun _hasCsrCoverage(): JsonField<Boolean> = hasCsrCoverage

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalDataRequired: JsonField<MutableList<AdditionalDataRequired>>? =
                null
            private var hasCsrCoverage: JsonField<Boolean> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                additionalDataRequired = data.additionalDataRequired.map { it.toMutableList() }
                hasCsrCoverage = data.hasCsrCoverage
                phoneNumber = data.phoneNumber
                reason = data.reason
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Additional data required to perform CSR for the phone number. Only returned if
             * `has_csr_coverage` is true.
             */
            fun additionalDataRequired(additionalDataRequired: List<AdditionalDataRequired>) =
                additionalDataRequired(JsonField.of(additionalDataRequired))

            /**
             * Sets [Builder.additionalDataRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalDataRequired] with a well-typed
             * `List<AdditionalDataRequired>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun additionalDataRequired(
                additionalDataRequired: JsonField<List<AdditionalDataRequired>>
            ) = apply {
                this.additionalDataRequired = additionalDataRequired.map { it.toMutableList() }
            }

            /**
             * Adds a single [AdditionalDataRequired] to [Builder.additionalDataRequired].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdditionalDataRequired(additionalDataRequired: AdditionalDataRequired) = apply {
                this.additionalDataRequired =
                    (this.additionalDataRequired ?: JsonField.of(mutableListOf())).also {
                        checkKnown("additionalDataRequired", it).add(additionalDataRequired)
                    }
            }

            /** Indicates whether the phone number is covered or not. */
            fun hasCsrCoverage(hasCsrCoverage: Boolean) =
                hasCsrCoverage(JsonField.of(hasCsrCoverage))

            /**
             * Sets [Builder.hasCsrCoverage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasCsrCoverage] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasCsrCoverage(hasCsrCoverage: JsonField<Boolean>) = apply {
                this.hasCsrCoverage = hasCsrCoverage
            }

            /** The phone number that is being verified. */
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

            /**
             * The reason why the phone number is not covered. Only returned if `has_csr_coverage`
             * is false.
             */
            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    (additionalDataRequired ?: JsonMissing.of()).map { it.toImmutable() },
                    hasCsrCoverage,
                    phoneNumber,
                    reason,
                    recordType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            additionalDataRequired().ifPresent { it.forEach { it.validate() } }
            hasCsrCoverage()
            phoneNumber()
            reason()
            recordType()
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
            (additionalDataRequired.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (hasCsrCoverage.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        class AdditionalDataRequired
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

                @JvmField val NAME = of("name")

                @JvmField val AUTHORIZED_PERSON_NAME = of("authorized_person_name")

                @JvmField val ACCOUNT_NUMBER = of("account_number")

                @JvmField val CUSTOMER_CODE = of("customer_code")

                @JvmField val PIN = of("pin")

                @JvmField val ADDRESS_LINE_1 = of("address_line_1")

                @JvmField val CITY = of("city")

                @JvmField val STATE = of("state")

                @JvmField val ZIP_CODE = of("zip_code")

                @JvmField val BILLING_PHONE_NUMBER = of("billing_phone_number")

                @JvmStatic fun of(value: String) = AdditionalDataRequired(JsonField.of(value))
            }

            /** An enum containing [AdditionalDataRequired]'s known values. */
            enum class Known {
                NAME,
                AUTHORIZED_PERSON_NAME,
                ACCOUNT_NUMBER,
                CUSTOMER_CODE,
                PIN,
                ADDRESS_LINE_1,
                CITY,
                STATE,
                ZIP_CODE,
                BILLING_PHONE_NUMBER,
            }

            /**
             * An enum containing [AdditionalDataRequired]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AdditionalDataRequired] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NAME,
                AUTHORIZED_PERSON_NAME,
                ACCOUNT_NUMBER,
                CUSTOMER_CODE,
                PIN,
                ADDRESS_LINE_1,
                CITY,
                STATE,
                ZIP_CODE,
                BILLING_PHONE_NUMBER,
                /**
                 * An enum member indicating that [AdditionalDataRequired] was instantiated with an
                 * unknown value.
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
                    NAME -> Value.NAME
                    AUTHORIZED_PERSON_NAME -> Value.AUTHORIZED_PERSON_NAME
                    ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                    CUSTOMER_CODE -> Value.CUSTOMER_CODE
                    PIN -> Value.PIN
                    ADDRESS_LINE_1 -> Value.ADDRESS_LINE_1
                    CITY -> Value.CITY
                    STATE -> Value.STATE
                    ZIP_CODE -> Value.ZIP_CODE
                    BILLING_PHONE_NUMBER -> Value.BILLING_PHONE_NUMBER
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
                    NAME -> Known.NAME
                    AUTHORIZED_PERSON_NAME -> Known.AUTHORIZED_PERSON_NAME
                    ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                    CUSTOMER_CODE -> Known.CUSTOMER_CODE
                    PIN -> Known.PIN
                    ADDRESS_LINE_1 -> Known.ADDRESS_LINE_1
                    CITY -> Known.CITY
                    STATE -> Known.STATE
                    ZIP_CODE -> Known.ZIP_CODE
                    BILLING_PHONE_NUMBER -> Known.BILLING_PHONE_NUMBER
                    else ->
                        throw TelnyxInvalidDataException("Unknown AdditionalDataRequired: $value")
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

            fun validate(): AdditionalDataRequired = apply {
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

                return other is AdditionalDataRequired && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                additionalDataRequired == other.additionalDataRequired &&
                hasCsrCoverage == other.hasCsrCoverage &&
                phoneNumber == other.phoneNumber &&
                reason == other.reason &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                additionalDataRequired,
                hasCsrCoverage,
                phoneNumber,
                reason,
                recordType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{additionalDataRequired=$additionalDataRequired, hasCsrCoverage=$hasCsrCoverage, phoneNumber=$phoneNumber, reason=$reason, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerServiceRecordVerifyPhoneNumberCoverageResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerServiceRecordVerifyPhoneNumberCoverageResponse{data=$data, additionalProperties=$additionalProperties}"
}
