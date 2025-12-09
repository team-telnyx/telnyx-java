// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorderphonenumbers

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
import com.telnyx.sdk.models.SubNumberOrderRegulatoryRequirementWithValue
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumberOrderPhoneNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val bundleId: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val deadline: JsonField<OffsetDateTime>,
    private val isBlockNumber: JsonField<Boolean>,
    private val locality: JsonField<String>,
    private val orderRequestId: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val phoneNumberType: JsonField<PhoneNumberType>,
    private val recordType: JsonField<String>,
    private val regulatoryRequirements:
        JsonField<List<SubNumberOrderRegulatoryRequirementWithValue>>,
    private val requirementsMet: JsonField<Boolean>,
    private val requirementsStatus: JsonField<RequirementsStatus>,
    private val status: JsonField<Status>,
    private val subNumberOrderId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bundle_id") @ExcludeMissing bundleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deadline")
        @ExcludeMissing
        deadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_block_number")
        @ExcludeMissing
        isBlockNumber: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("locality") @ExcludeMissing locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order_request_id")
        @ExcludeMissing
        orderRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regulatory_requirements")
        @ExcludeMissing
        regulatoryRequirements: JsonField<List<SubNumberOrderRegulatoryRequirementWithValue>> =
            JsonMissing.of(),
        @JsonProperty("requirements_met")
        @ExcludeMissing
        requirementsMet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("requirements_status")
        @ExcludeMissing
        requirementsStatus: JsonField<RequirementsStatus> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("sub_number_order_id")
        @ExcludeMissing
        subNumberOrderId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        bundleId,
        countryCode,
        deadline,
        isBlockNumber,
        locality,
        orderRequestId,
        phoneNumber,
        phoneNumberType,
        recordType,
        regulatoryRequirements,
        requirementsMet,
        requirementsStatus,
        status,
        subNumberOrderId,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bundleId(): Optional<String> = bundleId.getOptional("bundle_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deadline(): Optional<OffsetDateTime> = deadline.getOptional("deadline")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isBlockNumber(): Optional<Boolean> = isBlockNumber.getOptional("is_block_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locality(): Optional<String> = locality.getOptional("locality")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderRequestId(): Optional<String> = orderRequestId.getOptional("order_request_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberType(): Optional<PhoneNumberType> =
        phoneNumberType.getOptional("phone_number_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regulatoryRequirements(): Optional<List<SubNumberOrderRegulatoryRequirementWithValue>> =
        regulatoryRequirements.getOptional("regulatory_requirements")

    /**
     * True if all requirements are met for a phone number, false otherwise.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementsMet(): Optional<Boolean> = requirementsMet.getOptional("requirements_met")

    /**
     * Status of requirements (if applicable)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementsStatus(): Optional<RequirementsStatus> =
        requirementsStatus.getOptional("requirements_status")

    /**
     * The status of the phone number in the order.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subNumberOrderId(): Optional<String> = subNumberOrderId.getOptional("sub_number_order_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bundleId].
     *
     * Unlike [bundleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bundle_id") @ExcludeMissing fun _bundleId(): JsonField<String> = bundleId

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [deadline].
     *
     * Unlike [deadline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deadline") @ExcludeMissing fun _deadline(): JsonField<OffsetDateTime> = deadline

    /**
     * Returns the raw JSON value of [isBlockNumber].
     *
     * Unlike [isBlockNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_block_number")
    @ExcludeMissing
    fun _isBlockNumber(): JsonField<Boolean> = isBlockNumber

    /**
     * Returns the raw JSON value of [locality].
     *
     * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

    /**
     * Returns the raw JSON value of [orderRequestId].
     *
     * Unlike [orderRequestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order_request_id")
    @ExcludeMissing
    fun _orderRequestId(): JsonField<String> = orderRequestId

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [phoneNumberType].
     *
     * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number_type")
    @ExcludeMissing
    fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [regulatoryRequirements].
     *
     * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("regulatory_requirements")
    @ExcludeMissing
    fun _regulatoryRequirements(): JsonField<List<SubNumberOrderRegulatoryRequirementWithValue>> =
        regulatoryRequirements

    /**
     * Returns the raw JSON value of [requirementsMet].
     *
     * Unlike [requirementsMet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requirements_met")
    @ExcludeMissing
    fun _requirementsMet(): JsonField<Boolean> = requirementsMet

    /**
     * Returns the raw JSON value of [requirementsStatus].
     *
     * Unlike [requirementsStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requirements_status")
    @ExcludeMissing
    fun _requirementsStatus(): JsonField<RequirementsStatus> = requirementsStatus

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subNumberOrderId].
     *
     * Unlike [subNumberOrderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sub_number_order_id")
    @ExcludeMissing
    fun _subNumberOrderId(): JsonField<String> = subNumberOrderId

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

        /** Returns a mutable builder for constructing an instance of [NumberOrderPhoneNumber]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberOrderPhoneNumber]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var bundleId: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var deadline: JsonField<OffsetDateTime> = JsonMissing.of()
        private var isBlockNumber: JsonField<Boolean> = JsonMissing.of()
        private var locality: JsonField<String> = JsonMissing.of()
        private var orderRequestId: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var regulatoryRequirements:
            JsonField<MutableList<SubNumberOrderRegulatoryRequirementWithValue>>? =
            null
        private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
        private var requirementsStatus: JsonField<RequirementsStatus> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var subNumberOrderId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberOrderPhoneNumber: NumberOrderPhoneNumber) = apply {
            id = numberOrderPhoneNumber.id
            bundleId = numberOrderPhoneNumber.bundleId
            countryCode = numberOrderPhoneNumber.countryCode
            deadline = numberOrderPhoneNumber.deadline
            isBlockNumber = numberOrderPhoneNumber.isBlockNumber
            locality = numberOrderPhoneNumber.locality
            orderRequestId = numberOrderPhoneNumber.orderRequestId
            phoneNumber = numberOrderPhoneNumber.phoneNumber
            phoneNumberType = numberOrderPhoneNumber.phoneNumberType
            recordType = numberOrderPhoneNumber.recordType
            regulatoryRequirements =
                numberOrderPhoneNumber.regulatoryRequirements.map { it.toMutableList() }
            requirementsMet = numberOrderPhoneNumber.requirementsMet
            requirementsStatus = numberOrderPhoneNumber.requirementsStatus
            status = numberOrderPhoneNumber.status
            subNumberOrderId = numberOrderPhoneNumber.subNumberOrderId
            additionalProperties = numberOrderPhoneNumber.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun bundleId(bundleId: String?) = bundleId(JsonField.ofNullable(bundleId))

        /** Alias for calling [Builder.bundleId] with `bundleId.orElse(null)`. */
        fun bundleId(bundleId: Optional<String>) = bundleId(bundleId.getOrNull())

        /**
         * Sets [Builder.bundleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bundleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bundleId(bundleId: JsonField<String>) = apply { this.bundleId = bundleId }

        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        fun deadline(deadline: OffsetDateTime) = deadline(JsonField.of(deadline))

        /**
         * Sets [Builder.deadline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deadline] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deadline(deadline: JsonField<OffsetDateTime>) = apply { this.deadline = deadline }

        fun isBlockNumber(isBlockNumber: Boolean) = isBlockNumber(JsonField.of(isBlockNumber))

        /**
         * Sets [Builder.isBlockNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isBlockNumber] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isBlockNumber(isBlockNumber: JsonField<Boolean>) = apply {
            this.isBlockNumber = isBlockNumber
        }

        fun locality(locality: String) = locality(JsonField.of(locality))

        /**
         * Sets [Builder.locality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locality(locality: JsonField<String>) = apply { this.locality = locality }

        fun orderRequestId(orderRequestId: String) = orderRequestId(JsonField.of(orderRequestId))

        /**
         * Sets [Builder.orderRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun orderRequestId(orderRequestId: JsonField<String>) = apply {
            this.orderRequestId = orderRequestId
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

        fun phoneNumberType(phoneNumberType: PhoneNumberType) =
            phoneNumberType(JsonField.of(phoneNumberType))

        /**
         * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
            this.phoneNumberType = phoneNumberType
        }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun regulatoryRequirements(
            regulatoryRequirements: List<SubNumberOrderRegulatoryRequirementWithValue>
        ) = regulatoryRequirements(JsonField.of(regulatoryRequirements))

        /**
         * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regulatoryRequirements] with a well-typed
         * `List<SubNumberOrderRegulatoryRequirementWithValue>` value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun regulatoryRequirements(
            regulatoryRequirements: JsonField<List<SubNumberOrderRegulatoryRequirementWithValue>>
        ) = apply {
            this.regulatoryRequirements = regulatoryRequirements.map { it.toMutableList() }
        }

        /**
         * Adds a single [SubNumberOrderRegulatoryRequirementWithValue] to [regulatoryRequirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegulatoryRequirement(
            regulatoryRequirement: SubNumberOrderRegulatoryRequirementWithValue
        ) = apply {
            regulatoryRequirements =
                (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("regulatoryRequirements", it).add(regulatoryRequirement)
                }
        }

        /** True if all requirements are met for a phone number, false otherwise. */
        fun requirementsMet(requirementsMet: Boolean) =
            requirementsMet(JsonField.of(requirementsMet))

        /**
         * Sets [Builder.requirementsMet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementsMet] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requirementsMet(requirementsMet: JsonField<Boolean>) = apply {
            this.requirementsMet = requirementsMet
        }

        /** Status of requirements (if applicable) */
        fun requirementsStatus(requirementsStatus: RequirementsStatus) =
            requirementsStatus(JsonField.of(requirementsStatus))

        /**
         * Sets [Builder.requirementsStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementsStatus] with a well-typed
         * [RequirementsStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun requirementsStatus(requirementsStatus: JsonField<RequirementsStatus>) = apply {
            this.requirementsStatus = requirementsStatus
        }

        /** The status of the phone number in the order. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subNumberOrderId(subNumberOrderId: String) =
            subNumberOrderId(JsonField.of(subNumberOrderId))

        /**
         * Sets [Builder.subNumberOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subNumberOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subNumberOrderId(subNumberOrderId: JsonField<String>) = apply {
            this.subNumberOrderId = subNumberOrderId
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
         * Returns an immutable instance of [NumberOrderPhoneNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberOrderPhoneNumber =
            NumberOrderPhoneNumber(
                id,
                bundleId,
                countryCode,
                deadline,
                isBlockNumber,
                locality,
                orderRequestId,
                phoneNumber,
                phoneNumberType,
                recordType,
                (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                requirementsMet,
                requirementsStatus,
                status,
                subNumberOrderId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NumberOrderPhoneNumber = apply {
        if (validated) {
            return@apply
        }

        id()
        bundleId()
        countryCode()
        deadline()
        isBlockNumber()
        locality()
        orderRequestId()
        phoneNumber()
        phoneNumberType().ifPresent { it.validate() }
        recordType()
        regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
        requirementsMet()
        requirementsStatus().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        subNumberOrderId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (bundleId.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (deadline.asKnown().isPresent) 1 else 0) +
            (if (isBlockNumber.asKnown().isPresent) 1 else 0) +
            (if (locality.asKnown().isPresent) 1 else 0) +
            (if (orderRequestId.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (requirementsMet.asKnown().isPresent) 1 else 0) +
            (requirementsStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subNumberOrderId.asKnown().isPresent) 1 else 0)

    class PhoneNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val LOCAL = of("local")

            @JvmField val TOLL_FREE = of("toll_free")

            @JvmField val MOBILE = of("mobile")

            @JvmField val NATIONAL = of("national")

            @JvmField val SHARED_COST = of("shared_cost")

            @JvmField val LANDLINE = of("landline")

            @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
        }

        /** An enum containing [PhoneNumberType]'s known values. */
        enum class Known {
            LOCAL,
            TOLL_FREE,
            MOBILE,
            NATIONAL,
            SHARED_COST,
            LANDLINE,
        }

        /**
         * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOCAL,
            TOLL_FREE,
            MOBILE,
            NATIONAL,
            SHARED_COST,
            LANDLINE,
            /**
             * An enum member indicating that [PhoneNumberType] was instantiated with an unknown
             * value.
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
                LOCAL -> Value.LOCAL
                TOLL_FREE -> Value.TOLL_FREE
                MOBILE -> Value.MOBILE
                NATIONAL -> Value.NATIONAL
                SHARED_COST -> Value.SHARED_COST
                LANDLINE -> Value.LANDLINE
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
                LOCAL -> Known.LOCAL
                TOLL_FREE -> Known.TOLL_FREE
                MOBILE -> Known.MOBILE
                NATIONAL -> Known.NATIONAL
                SHARED_COST -> Known.SHARED_COST
                LANDLINE -> Known.LANDLINE
                else -> throw TelnyxInvalidDataException("Unknown PhoneNumberType: $value")
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

        fun validate(): PhoneNumberType = apply {
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

            return other is PhoneNumberType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Status of requirements (if applicable) */
    class RequirementsStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val APPROVED = of("approved")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val DELETED = of("deleted")

            @JvmField val REQUIREMENT_INFO_EXCEPTION = of("requirement-info-exception")

            @JvmField val REQUIREMENT_INFO_PENDING = of("requirement-info-pending")

            @JvmField val REQUIREMENT_INFO_UNDER_REVIEW = of("requirement-info-under-review")

            @JvmStatic fun of(value: String) = RequirementsStatus(JsonField.of(value))
        }

        /** An enum containing [RequirementsStatus]'s known values. */
        enum class Known {
            PENDING,
            APPROVED,
            CANCELLED,
            DELETED,
            REQUIREMENT_INFO_EXCEPTION,
            REQUIREMENT_INFO_PENDING,
            REQUIREMENT_INFO_UNDER_REVIEW,
        }

        /**
         * An enum containing [RequirementsStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RequirementsStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            APPROVED,
            CANCELLED,
            DELETED,
            REQUIREMENT_INFO_EXCEPTION,
            REQUIREMENT_INFO_PENDING,
            REQUIREMENT_INFO_UNDER_REVIEW,
            /**
             * An enum member indicating that [RequirementsStatus] was instantiated with an unknown
             * value.
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
                APPROVED -> Value.APPROVED
                CANCELLED -> Value.CANCELLED
                DELETED -> Value.DELETED
                REQUIREMENT_INFO_EXCEPTION -> Value.REQUIREMENT_INFO_EXCEPTION
                REQUIREMENT_INFO_PENDING -> Value.REQUIREMENT_INFO_PENDING
                REQUIREMENT_INFO_UNDER_REVIEW -> Value.REQUIREMENT_INFO_UNDER_REVIEW
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
                APPROVED -> Known.APPROVED
                CANCELLED -> Known.CANCELLED
                DELETED -> Known.DELETED
                REQUIREMENT_INFO_EXCEPTION -> Known.REQUIREMENT_INFO_EXCEPTION
                REQUIREMENT_INFO_PENDING -> Known.REQUIREMENT_INFO_PENDING
                REQUIREMENT_INFO_UNDER_REVIEW -> Known.REQUIREMENT_INFO_UNDER_REVIEW
                else -> throw TelnyxInvalidDataException("Unknown RequirementsStatus: $value")
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

        fun validate(): RequirementsStatus = apply {
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

            return other is RequirementsStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the phone number in the order. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val SUCCESS = of("success")

            @JvmField val FAILURE = of("failure")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            SUCCESS,
            FAILURE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            SUCCESS,
            FAILURE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                SUCCESS -> Value.SUCCESS
                FAILURE -> Value.FAILURE
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
                SUCCESS -> Known.SUCCESS
                FAILURE -> Known.FAILURE
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberOrderPhoneNumber &&
            id == other.id &&
            bundleId == other.bundleId &&
            countryCode == other.countryCode &&
            deadline == other.deadline &&
            isBlockNumber == other.isBlockNumber &&
            locality == other.locality &&
            orderRequestId == other.orderRequestId &&
            phoneNumber == other.phoneNumber &&
            phoneNumberType == other.phoneNumberType &&
            recordType == other.recordType &&
            regulatoryRequirements == other.regulatoryRequirements &&
            requirementsMet == other.requirementsMet &&
            requirementsStatus == other.requirementsStatus &&
            status == other.status &&
            subNumberOrderId == other.subNumberOrderId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            bundleId,
            countryCode,
            deadline,
            isBlockNumber,
            locality,
            orderRequestId,
            phoneNumber,
            phoneNumberType,
            recordType,
            regulatoryRequirements,
            requirementsMet,
            requirementsStatus,
            status,
            subNumberOrderId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberOrderPhoneNumber{id=$id, bundleId=$bundleId, countryCode=$countryCode, deadline=$deadline, isBlockNumber=$isBlockNumber, locality=$locality, orderRequestId=$orderRequestId, phoneNumber=$phoneNumber, phoneNumberType=$phoneNumberType, recordType=$recordType, regulatoryRequirements=$regulatoryRequirements, requirementsMet=$requirementsMet, requirementsStatus=$requirementsStatus, status=$status, subNumberOrderId=$subNumberOrderId, additionalProperties=$additionalProperties}"
}
