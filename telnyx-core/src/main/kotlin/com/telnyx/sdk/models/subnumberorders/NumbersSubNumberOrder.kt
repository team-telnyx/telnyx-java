// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberorders

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumbersSubNumberOrder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerReference: JsonField<String>,
    private val isBlockSubNumberOrder: JsonField<Boolean>,
    private val orderRequestId: JsonField<String>,
    private val phoneNumberType: JsonField<PhoneNumberType>,
    private val phoneNumbers: JsonField<List<PhoneNumber>>,
    private val phoneNumbersCount: JsonField<Long>,
    private val recordType: JsonField<String>,
    private val regulatoryRequirements: JsonField<List<SubNumberOrderRegulatoryRequirement>>,
    private val requirementsMet: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_reference")
        @ExcludeMissing
        customerReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_block_sub_number_order")
        @ExcludeMissing
        isBlockSubNumberOrder: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("order_request_id")
        @ExcludeMissing
        orderRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
        @JsonProperty("phone_numbers_count")
        @ExcludeMissing
        phoneNumbersCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regulatory_requirements")
        @ExcludeMissing
        regulatoryRequirements: JsonField<List<SubNumberOrderRegulatoryRequirement>> =
            JsonMissing.of(),
        @JsonProperty("requirements_met")
        @ExcludeMissing
        requirementsMet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        countryCode,
        createdAt,
        customerReference,
        isBlockSubNumberOrder,
        orderRequestId,
        phoneNumberType,
        phoneNumbers,
        phoneNumbersCount,
        recordType,
        regulatoryRequirements,
        requirementsMet,
        status,
        updatedAt,
        userId,
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
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * An ISO 8901 datetime string denoting when the number order was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * A customer reference string for customer look ups.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = customerReference.getOptional("customer_reference")

    /**
     * True if the sub number order is a block sub number order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isBlockSubNumberOrder(): Optional<Boolean> =
        isBlockSubNumberOrder.getOptional("is_block_sub_number_order")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderRequestId(): Optional<String> = orderRequestId.getOptional("order_request_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberType(): Optional<PhoneNumberType> =
        phoneNumberType.getOptional("phone_number_type")

    /**
     * The first 50 phone numbers in the sub number order, including their per-number regulatory
     * requirement statuses. Only present when filter[include_phone_numbers]=true is used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<PhoneNumber>> = phoneNumbers.getOptional("phone_numbers")

    /**
     * The count of phone numbers in the number order.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbersCount(): Optional<Long> = phoneNumbersCount.getOptional("phone_numbers_count")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regulatoryRequirements(): Optional<List<SubNumberOrderRegulatoryRequirement>> =
        regulatoryRequirements.getOptional("regulatory_requirements")

    /**
     * True if all requirements are met for every phone number, false otherwise.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementsMet(): Optional<Boolean> = requirementsMet.getOptional("requirements_met")

    /**
     * The status of the order.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * An ISO 8901 datetime string for when the number order was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customer_reference")
    @ExcludeMissing
    fun _customerReference(): JsonField<String> = customerReference

    /**
     * Returns the raw JSON value of [isBlockSubNumberOrder].
     *
     * Unlike [isBlockSubNumberOrder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_block_sub_number_order")
    @ExcludeMissing
    fun _isBlockSubNumberOrder(): JsonField<Boolean> = isBlockSubNumberOrder

    /**
     * Returns the raw JSON value of [orderRequestId].
     *
     * Unlike [orderRequestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order_request_id")
    @ExcludeMissing
    fun _orderRequestId(): JsonField<String> = orderRequestId

    /**
     * Returns the raw JSON value of [phoneNumberType].
     *
     * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number_type")
    @ExcludeMissing
    fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

    /**
     * Returns the raw JSON value of [phoneNumbersCount].
     *
     * Unlike [phoneNumbersCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("phone_numbers_count")
    @ExcludeMissing
    fun _phoneNumbersCount(): JsonField<Long> = phoneNumbersCount

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
    fun _regulatoryRequirements(): JsonField<List<SubNumberOrderRegulatoryRequirement>> =
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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

        /** Returns a mutable builder for constructing an instance of [NumbersSubNumberOrder]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumbersSubNumberOrder]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerReference: JsonField<String> = JsonMissing.of()
        private var isBlockSubNumberOrder: JsonField<Boolean> = JsonMissing.of()
        private var orderRequestId: JsonField<String> = JsonMissing.of()
        private var phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of()
        private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
        private var phoneNumbersCount: JsonField<Long> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var regulatoryRequirements:
            JsonField<MutableList<SubNumberOrderRegulatoryRequirement>>? =
            null
        private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numbersSubNumberOrder: NumbersSubNumberOrder) = apply {
            id = numbersSubNumberOrder.id
            countryCode = numbersSubNumberOrder.countryCode
            createdAt = numbersSubNumberOrder.createdAt
            customerReference = numbersSubNumberOrder.customerReference
            isBlockSubNumberOrder = numbersSubNumberOrder.isBlockSubNumberOrder
            orderRequestId = numbersSubNumberOrder.orderRequestId
            phoneNumberType = numbersSubNumberOrder.phoneNumberType
            phoneNumbers = numbersSubNumberOrder.phoneNumbers.map { it.toMutableList() }
            phoneNumbersCount = numbersSubNumberOrder.phoneNumbersCount
            recordType = numbersSubNumberOrder.recordType
            regulatoryRequirements =
                numbersSubNumberOrder.regulatoryRequirements.map { it.toMutableList() }
            requirementsMet = numbersSubNumberOrder.requirementsMet
            status = numbersSubNumberOrder.status
            updatedAt = numbersSubNumberOrder.updatedAt
            userId = numbersSubNumberOrder.userId
            additionalProperties = numbersSubNumberOrder.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** An ISO 8901 datetime string denoting when the number order was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A customer reference string for customer look ups. */
        fun customerReference(customerReference: String) =
            customerReference(JsonField.of(customerReference))

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            this.customerReference = customerReference
        }

        /** True if the sub number order is a block sub number order */
        fun isBlockSubNumberOrder(isBlockSubNumberOrder: Boolean) =
            isBlockSubNumberOrder(JsonField.of(isBlockSubNumberOrder))

        /**
         * Sets [Builder.isBlockSubNumberOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isBlockSubNumberOrder] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isBlockSubNumberOrder(isBlockSubNumberOrder: JsonField<Boolean>) = apply {
            this.isBlockSubNumberOrder = isBlockSubNumberOrder
        }

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

        /**
         * The first 50 phone numbers in the sub number order, including their per-number regulatory
         * requirement statuses. Only present when filter[include_phone_numbers]=true is used.
         */
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

        /** The count of phone numbers in the number order. */
        fun phoneNumbersCount(phoneNumbersCount: Long) =
            phoneNumbersCount(JsonField.of(phoneNumbersCount))

        /**
         * Sets [Builder.phoneNumbersCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbersCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbersCount(phoneNumbersCount: JsonField<Long>) = apply {
            this.phoneNumbersCount = phoneNumbersCount
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
            regulatoryRequirements: List<SubNumberOrderRegulatoryRequirement>
        ) = regulatoryRequirements(JsonField.of(regulatoryRequirements))

        /**
         * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regulatoryRequirements] with a well-typed
         * `List<SubNumberOrderRegulatoryRequirement>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun regulatoryRequirements(
            regulatoryRequirements: JsonField<List<SubNumberOrderRegulatoryRequirement>>
        ) = apply {
            this.regulatoryRequirements = regulatoryRequirements.map { it.toMutableList() }
        }

        /**
         * Adds a single [SubNumberOrderRegulatoryRequirement] to [regulatoryRequirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegulatoryRequirement(regulatoryRequirement: SubNumberOrderRegulatoryRequirement) =
            apply {
                regulatoryRequirements =
                    (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regulatoryRequirements", it).add(regulatoryRequirement)
                    }
            }

        /** True if all requirements are met for every phone number, false otherwise. */
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

        /** The status of the order. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** An ISO 8901 datetime string for when the number order was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [NumbersSubNumberOrder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumbersSubNumberOrder =
            NumbersSubNumberOrder(
                id,
                countryCode,
                createdAt,
                customerReference,
                isBlockSubNumberOrder,
                orderRequestId,
                phoneNumberType,
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                phoneNumbersCount,
                recordType,
                (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                requirementsMet,
                status,
                updatedAt,
                userId,
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
    fun validate(): NumbersSubNumberOrder = apply {
        if (validated) {
            return@apply
        }

        id()
        countryCode()
        createdAt()
        customerReference()
        isBlockSubNumberOrder()
        orderRequestId()
        phoneNumberType().ifPresent { it.validate() }
        phoneNumbers().ifPresent { it.forEach { it.validate() } }
        phoneNumbersCount()
        recordType()
        regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
        requirementsMet()
        status().ifPresent { it.validate() }
        updatedAt()
        userId()
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
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customerReference.asKnown().isPresent) 1 else 0) +
            (if (isBlockSubNumberOrder.asKnown().isPresent) 1 else 0) +
            (if (orderRequestId.asKnown().isPresent) 1 else 0) +
            (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
            (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (phoneNumbersCount.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (requirementsMet.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class PhoneNumber
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val bundleId: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val phoneNumberType: JsonField<String>,
        private val recordType: JsonField<String>,
        private val regulatoryRequirements: JsonField<List<RegulatoryRequirement>>,
        private val requirementsMet: JsonField<Boolean>,
        private val requirementsStatus: JsonField<String>,
        private val status: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bundle_id")
            @ExcludeMissing
            bundleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            phoneNumberType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("regulatory_requirements")
            @ExcludeMissing
            regulatoryRequirements: JsonField<List<RegulatoryRequirement>> = JsonMissing.of(),
            @JsonProperty("requirements_met")
            @ExcludeMissing
            requirementsMet: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("requirements_status")
            @ExcludeMissing
            requirementsStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            bundleId,
            countryCode,
            phoneNumber,
            phoneNumberType,
            recordType,
            regulatoryRequirements,
            requirementsMet,
            requirementsStatus,
            status,
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
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberType(): Optional<String> = phoneNumberType.getOptional("phone_number_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
            regulatoryRequirements.getOptional("regulatory_requirements")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementsMet(): Optional<Boolean> = requirementsMet.getOptional("requirements_met")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementsStatus(): Optional<String> =
            requirementsStatus.getOptional("requirements_status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

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
         * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        fun _phoneNumberType(): JsonField<String> = phoneNumberType

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [regulatoryRequirements].
         *
         * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("regulatory_requirements")
        @ExcludeMissing
        fun _regulatoryRequirements(): JsonField<List<RegulatoryRequirement>> =
            regulatoryRequirements

        /**
         * Returns the raw JSON value of [requirementsMet].
         *
         * Unlike [requirementsMet], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirements_met")
        @ExcludeMissing
        fun _requirementsMet(): JsonField<Boolean> = requirementsMet

        /**
         * Returns the raw JSON value of [requirementsStatus].
         *
         * Unlike [requirementsStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("requirements_status")
        @ExcludeMissing
        fun _requirementsStatus(): JsonField<String> = requirementsStatus

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

            private var id: JsonField<String> = JsonMissing.of()
            private var bundleId: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var phoneNumberType: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var regulatoryRequirements: JsonField<MutableList<RegulatoryRequirement>>? =
                null
            private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
            private var requirementsStatus: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phoneNumber: PhoneNumber) = apply {
                id = phoneNumber.id
                bundleId = phoneNumber.bundleId
                countryCode = phoneNumber.countryCode
                this.phoneNumber = phoneNumber.phoneNumber
                phoneNumberType = phoneNumber.phoneNumberType
                recordType = phoneNumber.recordType
                regulatoryRequirements =
                    phoneNumber.regulatoryRequirements.map { it.toMutableList() }
                requirementsMet = phoneNumber.requirementsMet
                requirementsStatus = phoneNumber.requirementsStatus
                status = phoneNumber.status
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun bundleId(bundleId: String?) = bundleId(JsonField.ofNullable(bundleId))

            /** Alias for calling [Builder.bundleId] with `bundleId.orElse(null)`. */
            fun bundleId(bundleId: Optional<String>) = bundleId(bundleId.getOrNull())

            /**
             * Sets [Builder.bundleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bundleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bundleId(bundleId: JsonField<String>) = apply { this.bundleId = bundleId }

            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

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

            fun phoneNumberType(phoneNumberType: String) =
                phoneNumberType(JsonField.of(phoneNumberType))

            /**
             * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberType(phoneNumberType: JsonField<String>) = apply {
                this.phoneNumberType = phoneNumberType
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            fun regulatoryRequirements(regulatoryRequirements: List<RegulatoryRequirement>) =
                regulatoryRequirements(JsonField.of(regulatoryRequirements))

            /**
             * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulatoryRequirements] with a well-typed
             * `List<RegulatoryRequirement>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun regulatoryRequirements(
                regulatoryRequirements: JsonField<List<RegulatoryRequirement>>
            ) = apply {
                this.regulatoryRequirements = regulatoryRequirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [RegulatoryRequirement] to [regulatoryRequirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegulatoryRequirement(regulatoryRequirement: RegulatoryRequirement) = apply {
                regulatoryRequirements =
                    (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regulatoryRequirements", it).add(regulatoryRequirement)
                    }
            }

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

            fun requirementsStatus(requirementsStatus: String) =
                requirementsStatus(JsonField.of(requirementsStatus))

            /**
             * Sets [Builder.requirementsStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementsStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requirementsStatus(requirementsStatus: JsonField<String>) = apply {
                this.requirementsStatus = requirementsStatus
            }

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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
                    id,
                    bundleId,
                    countryCode,
                    phoneNumber,
                    phoneNumberType,
                    recordType,
                    (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                    requirementsMet,
                    requirementsStatus,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): PhoneNumber = apply {
            if (validated) {
                return@apply
            }

            id()
            bundleId()
            countryCode()
            phoneNumber()
            phoneNumberType()
            recordType()
            regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
            requirementsMet()
            requirementsStatus()
            status()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (bundleId.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (phoneNumberType.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (requirementsMet.asKnown().isPresent) 1 else 0) +
                (if (requirementsStatus.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0)

        class RegulatoryRequirement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val fieldType: JsonField<FieldType>,
            private val fieldValue: JsonField<String>,
            private val recordType: JsonField<String>,
            private val requirementId: JsonField<String>,
            private val status: JsonField<Status>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("field_type")
                @ExcludeMissing
                fieldType: JsonField<FieldType> = JsonMissing.of(),
                @JsonProperty("field_value")
                @ExcludeMissing
                fieldValue: JsonField<String> = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("requirement_id")
                @ExcludeMissing
                requirementId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            ) : this(fieldType, fieldValue, recordType, requirementId, status, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fieldType(): Optional<FieldType> = fieldType.getOptional("field_type")

            /**
             * The value of the requirement, this could be an id to a resource or a string value.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fieldValue(): Optional<String> = fieldValue.getOptional("field_value")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * Unique id for a requirement.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requirementId(): Optional<String> = requirementId.getOptional("requirement_id")

            /**
             * The status of the regulatory requirement for this phone number.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * Returns the raw JSON value of [fieldType].
             *
             * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("field_type")
            @ExcludeMissing
            fun _fieldType(): JsonField<FieldType> = fieldType

            /**
             * Returns the raw JSON value of [fieldValue].
             *
             * Unlike [fieldValue], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("field_value")
            @ExcludeMissing
            fun _fieldValue(): JsonField<String> = fieldValue

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<String> = recordType

            /**
             * Returns the raw JSON value of [requirementId].
             *
             * Unlike [requirementId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requirement_id")
            @ExcludeMissing
            fun _requirementId(): JsonField<String> = requirementId

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
                 * [RegulatoryRequirement].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RegulatoryRequirement]. */
            class Builder internal constructor() {

                private var fieldType: JsonField<FieldType> = JsonMissing.of()
                private var fieldValue: JsonField<String> = JsonMissing.of()
                private var recordType: JsonField<String> = JsonMissing.of()
                private var requirementId: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(regulatoryRequirement: RegulatoryRequirement) = apply {
                    fieldType = regulatoryRequirement.fieldType
                    fieldValue = regulatoryRequirement.fieldValue
                    recordType = regulatoryRequirement.recordType
                    requirementId = regulatoryRequirement.requirementId
                    status = regulatoryRequirement.status
                    additionalProperties = regulatoryRequirement.additionalProperties.toMutableMap()
                }

                fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

                /**
                 * Sets [Builder.fieldType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldType] with a well-typed [FieldType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fieldType(fieldType: JsonField<FieldType>) = apply {
                    this.fieldType = fieldType
                }

                /**
                 * The value of the requirement, this could be an id to a resource or a string
                 * value.
                 */
                fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

                /**
                 * Sets [Builder.fieldValue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldValue] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fieldValue(fieldValue: JsonField<String>) = apply {
                    this.fieldValue = fieldValue
                }

                fun recordType(recordType: String) = recordType(JsonField.of(recordType))

                /**
                 * Sets [Builder.recordType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
                }

                /** Unique id for a requirement. */
                fun requirementId(requirementId: String) =
                    requirementId(JsonField.of(requirementId))

                /**
                 * Sets [Builder.requirementId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requirementId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requirementId(requirementId: JsonField<String>) = apply {
                    this.requirementId = requirementId
                }

                /** The status of the regulatory requirement for this phone number. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RegulatoryRequirement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RegulatoryRequirement =
                    RegulatoryRequirement(
                        fieldType,
                        fieldValue,
                        recordType,
                        requirementId,
                        status,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): RegulatoryRequirement = apply {
                if (validated) {
                    return@apply
                }

                fieldType().ifPresent { it.validate() }
                fieldValue()
                recordType()
                requirementId()
                status().ifPresent { it.validate() }
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
                (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (fieldValue.asKnown().isPresent) 1 else 0) +
                    (if (recordType.asKnown().isPresent) 1 else 0) +
                    (if (requirementId.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0)

            class FieldType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TEXTUAL = of("textual")

                    @JvmField val DATETIME = of("datetime")

                    @JvmField val ADDRESS = of("address")

                    @JvmField val DOCUMENT = of("document")

                    @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
                }

                /** An enum containing [FieldType]'s known values. */
                enum class Known {
                    TEXTUAL,
                    DATETIME,
                    ADDRESS,
                    DOCUMENT,
                }

                /**
                 * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [FieldType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TEXTUAL,
                    DATETIME,
                    ADDRESS,
                    DOCUMENT,
                    /**
                     * An enum member indicating that [FieldType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TEXTUAL -> Value.TEXTUAL
                        DATETIME -> Value.DATETIME
                        ADDRESS -> Value.ADDRESS
                        DOCUMENT -> Value.DOCUMENT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TEXTUAL -> Known.TEXTUAL
                        DATETIME -> Known.DATETIME
                        ADDRESS -> Known.ADDRESS
                        DOCUMENT -> Known.DOCUMENT
                        else -> throw TelnyxInvalidDataException("Unknown FieldType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): FieldType = apply {
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

                    return other is FieldType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The status of the regulatory requirement for this phone number. */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val APPROVED = of("approved")

                    @JvmField val DECLINED = of("declined")

                    @JvmField val AWAITING_VALUE = of("awaiting-value")

                    @JvmField val PENDING_APPROVAL = of("pending-approval")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    APPROVED,
                    DECLINED,
                    AWAITING_VALUE,
                    PENDING_APPROVAL,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPROVED,
                    DECLINED,
                    AWAITING_VALUE,
                    PENDING_APPROVAL,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        APPROVED -> Value.APPROVED
                        DECLINED -> Value.DECLINED
                        AWAITING_VALUE -> Value.AWAITING_VALUE
                        PENDING_APPROVAL -> Value.PENDING_APPROVAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        APPROVED -> Known.APPROVED
                        DECLINED -> Known.DECLINED
                        AWAITING_VALUE -> Known.AWAITING_VALUE
                        PENDING_APPROVAL -> Known.PENDING_APPROVAL
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

                return other is RegulatoryRequirement &&
                    fieldType == other.fieldType &&
                    fieldValue == other.fieldValue &&
                    recordType == other.recordType &&
                    requirementId == other.requirementId &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    fieldType,
                    fieldValue,
                    recordType,
                    requirementId,
                    status,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RegulatoryRequirement{fieldType=$fieldType, fieldValue=$fieldValue, recordType=$recordType, requirementId=$requirementId, status=$status, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumber &&
                id == other.id &&
                bundleId == other.bundleId &&
                countryCode == other.countryCode &&
                phoneNumber == other.phoneNumber &&
                phoneNumberType == other.phoneNumberType &&
                recordType == other.recordType &&
                regulatoryRequirements == other.regulatoryRequirements &&
                requirementsMet == other.requirementsMet &&
                requirementsStatus == other.requirementsStatus &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                bundleId,
                countryCode,
                phoneNumber,
                phoneNumberType,
                recordType,
                regulatoryRequirements,
                requirementsMet,
                requirementsStatus,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumber{id=$id, bundleId=$bundleId, countryCode=$countryCode, phoneNumber=$phoneNumber, phoneNumberType=$phoneNumberType, recordType=$recordType, regulatoryRequirements=$regulatoryRequirements, requirementsMet=$requirementsMet, requirementsStatus=$requirementsStatus, status=$status, additionalProperties=$additionalProperties}"
    }

    /** The status of the order. */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is NumbersSubNumberOrder &&
            id == other.id &&
            countryCode == other.countryCode &&
            createdAt == other.createdAt &&
            customerReference == other.customerReference &&
            isBlockSubNumberOrder == other.isBlockSubNumberOrder &&
            orderRequestId == other.orderRequestId &&
            phoneNumberType == other.phoneNumberType &&
            phoneNumbers == other.phoneNumbers &&
            phoneNumbersCount == other.phoneNumbersCount &&
            recordType == other.recordType &&
            regulatoryRequirements == other.regulatoryRequirements &&
            requirementsMet == other.requirementsMet &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            countryCode,
            createdAt,
            customerReference,
            isBlockSubNumberOrder,
            orderRequestId,
            phoneNumberType,
            phoneNumbers,
            phoneNumbersCount,
            recordType,
            regulatoryRequirements,
            requirementsMet,
            status,
            updatedAt,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumbersSubNumberOrder{id=$id, countryCode=$countryCode, createdAt=$createdAt, customerReference=$customerReference, isBlockSubNumberOrder=$isBlockSubNumberOrder, orderRequestId=$orderRequestId, phoneNumberType=$phoneNumberType, phoneNumbers=$phoneNumbers, phoneNumbersCount=$phoneNumbersCount, recordType=$recordType, regulatoryRequirements=$regulatoryRequirements, requirementsMet=$requirementsMet, status=$status, updatedAt=$updatedAt, userId=$userId, additionalProperties=$additionalProperties}"
}
