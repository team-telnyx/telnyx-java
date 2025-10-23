// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class SubNumberOrderUpdateRequirementGroupResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [SubNumberOrderUpdateRequirementGroupResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubNumberOrderUpdateRequirementGroupResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            subNumberOrderUpdateRequirementGroupResponse:
                SubNumberOrderUpdateRequirementGroupResponse
        ) = apply {
            data = subNumberOrderUpdateRequirementGroupResponse.data
            additionalProperties =
                subNumberOrderUpdateRequirementGroupResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [SubNumberOrderUpdateRequirementGroupResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubNumberOrderUpdateRequirementGroupResponse =
            SubNumberOrderUpdateRequirementGroupResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SubNumberOrderUpdateRequirementGroupResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerReference: JsonField<String>,
        private val isBlockSubNumberOrder: JsonField<Boolean>,
        private val orderRequestId: JsonField<String>,
        private val phoneNumberType: JsonField<String>,
        private val phoneNumbers: JsonField<List<PhoneNumber>>,
        private val phoneNumbersCount: JsonField<Long>,
        private val recordType: JsonField<String>,
        private val regulatoryRequirements: JsonField<List<RegulatoryRequirement>>,
        private val requirementsMet: JsonField<Boolean>,
        private val status: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
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
            phoneNumberType: JsonField<String> = JsonMissing.of(),
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
            regulatoryRequirements: JsonField<List<RegulatoryRequirement>> = JsonMissing.of(),
            @JsonProperty("requirements_met")
            @ExcludeMissing
            requirementsMet: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
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
        fun phoneNumberType(): Optional<String> = phoneNumberType.getOptional("phone_number_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumbers(): Optional<List<PhoneNumber>> = phoneNumbers.getOptional("phone_numbers")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumbersCount(): Optional<Long> =
            phoneNumbersCount.getOptional("phone_numbers_count")

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
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

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
         * Unlike [isBlockSubNumberOrder], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("is_block_sub_number_order")
        @ExcludeMissing
        fun _isBlockSubNumberOrder(): JsonField<Boolean> = isBlockSubNumberOrder

        /**
         * Returns the raw JSON value of [orderRequestId].
         *
         * Unlike [orderRequestId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("order_request_id")
        @ExcludeMissing
        fun _orderRequestId(): JsonField<String> = orderRequestId

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
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

            private var id: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var isBlockSubNumberOrder: JsonField<Boolean> = JsonMissing.of()
            private var orderRequestId: JsonField<String> = JsonMissing.of()
            private var phoneNumberType: JsonField<String> = JsonMissing.of()
            private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
            private var phoneNumbersCount: JsonField<Long> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var regulatoryRequirements: JsonField<MutableList<RegulatoryRequirement>>? =
                null
            private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                countryCode = data.countryCode
                createdAt = data.createdAt
                customerReference = data.customerReference
                isBlockSubNumberOrder = data.isBlockSubNumberOrder
                orderRequestId = data.orderRequestId
                phoneNumberType = data.phoneNumberType
                phoneNumbers = data.phoneNumbers.map { it.toMutableList() }
                phoneNumbersCount = data.phoneNumbersCount
                recordType = data.recordType
                regulatoryRequirements = data.regulatoryRequirements.map { it.toMutableList() }
                requirementsMet = data.requirementsMet
                status = data.status
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

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

            fun isBlockSubNumberOrder(isBlockSubNumberOrder: Boolean) =
                isBlockSubNumberOrder(JsonField.of(isBlockSubNumberOrder))

            /**
             * Sets [Builder.isBlockSubNumberOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isBlockSubNumberOrder] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isBlockSubNumberOrder(isBlockSubNumberOrder: JsonField<Boolean>) = apply {
                this.isBlockSubNumberOrder = isBlockSubNumberOrder
            }

            fun orderRequestId(orderRequestId: String) =
                orderRequestId(JsonField.of(orderRequestId))

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

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                phoneNumbers(JsonField.of(phoneNumbers))

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            countryCode()
            createdAt()
            customerReference()
            isBlockSubNumberOrder()
            orderRequestId()
            phoneNumberType()
            phoneNumbers().ifPresent { it.forEach { it.validate() } }
            phoneNumbersCount()
            recordType()
            regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
            requirementsMet()
            status()
            updatedAt()
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
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (isBlockSubNumberOrder.asKnown().isPresent) 1 else 0) +
                (if (orderRequestId.asKnown().isPresent) 1 else 0) +
                (if (phoneNumberType.asKnown().isPresent) 1 else 0) +
                (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumbersCount.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (requirementsMet.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bundleId(): Optional<String> = bundleId.getOptional("bundle_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumberType(): Optional<String> =
                phoneNumberType.getOptional("phone_number_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
                regulatoryRequirements.getOptional("regulatory_requirements")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requirementsMet(): Optional<Boolean> =
                requirementsMet.getOptional("requirements_met")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requirementsStatus(): Optional<String> =
                requirementsStatus.getOptional("requirements_status")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [bundleId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bundle_id") @ExcludeMissing fun _bundleId(): JsonField<String> = bundleId

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("country_code")
            @ExcludeMissing
            fun _countryCode(): JsonField<String> = countryCode

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [phoneNumberType].
             *
             * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            fun _phoneNumberType(): JsonField<String> = phoneNumberType

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
             * Unlike [requirementsMet], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun bundleId(bundleId: String) = bundleId(JsonField.of(bundleId))

                /**
                 * Sets [Builder.bundleId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bundleId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bundleId(bundleId: JsonField<String>) = apply { this.bundleId = bundleId }

                fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

                /**
                 * Sets [Builder.countryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryCode(countryCode: JsonField<String>) = apply {
                    this.countryCode = countryCode
                }

                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun phoneNumberType(phoneNumberType: String) =
                    phoneNumberType(JsonField.of(phoneNumberType))

                /**
                 * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumberType] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun phoneNumberType(phoneNumberType: JsonField<String>) = apply {
                    this.phoneNumberType = phoneNumberType
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

                fun regulatoryRequirements(regulatoryRequirements: List<RegulatoryRequirement>) =
                    regulatoryRequirements(JsonField.of(regulatoryRequirements))

                /**
                 * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.regulatoryRequirements] with a well-typed
                 * `List<RegulatoryRequirement>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
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
                 * You should usually call [Builder.requirementsMet] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun requirementsMet(requirementsMet: JsonField<Boolean>) = apply {
                    this.requirementsMet = requirementsMet
                }

                fun requirementsStatus(requirementsStatus: String) =
                    requirementsStatus(JsonField.of(requirementsStatus))

                /**
                 * Sets [Builder.requirementsStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requirementsStatus] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun requirementsStatus(requirementsStatus: JsonField<String>) = apply {
                    this.requirementsStatus = requirementsStatus
                }

                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

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
                private val fieldType: JsonField<String>,
                private val fieldValue: JsonField<String>,
                private val requirementId: JsonField<String>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field_type")
                    @ExcludeMissing
                    fieldType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("field_value")
                    @ExcludeMissing
                    fieldValue: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("requirement_id")
                    @ExcludeMissing
                    requirementId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(fieldType, fieldValue, requirementId, status, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun fieldType(): Optional<String> = fieldType.getOptional("field_type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun fieldValue(): Optional<String> = fieldValue.getOptional("field_value")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun requirementId(): Optional<String> = requirementId.getOptional("requirement_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun status(): Optional<String> = status.getOptional("status")

                /**
                 * Returns the raw JSON value of [fieldType].
                 *
                 * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field_type")
                @ExcludeMissing
                fun _fieldType(): JsonField<String> = fieldType

                /**
                 * Returns the raw JSON value of [fieldValue].
                 *
                 * Unlike [fieldValue], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("field_value")
                @ExcludeMissing
                fun _fieldValue(): JsonField<String> = fieldValue

                /**
                 * Returns the raw JSON value of [requirementId].
                 *
                 * Unlike [requirementId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("requirement_id")
                @ExcludeMissing
                fun _requirementId(): JsonField<String> = requirementId

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [RegulatoryRequirement].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RegulatoryRequirement]. */
                class Builder internal constructor() {

                    private var fieldType: JsonField<String> = JsonMissing.of()
                    private var fieldValue: JsonField<String> = JsonMissing.of()
                    private var requirementId: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(regulatoryRequirement: RegulatoryRequirement) = apply {
                        fieldType = regulatoryRequirement.fieldType
                        fieldValue = regulatoryRequirement.fieldValue
                        requirementId = regulatoryRequirement.requirementId
                        status = regulatoryRequirement.status
                        additionalProperties =
                            regulatoryRequirement.additionalProperties.toMutableMap()
                    }

                    fun fieldType(fieldType: String) = fieldType(JsonField.of(fieldType))

                    /**
                     * Sets [Builder.fieldType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fieldType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fieldType(fieldType: JsonField<String>) = apply {
                        this.fieldType = fieldType
                    }

                    fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

                    /**
                     * Sets [Builder.fieldValue] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fieldValue] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fieldValue(fieldValue: JsonField<String>) = apply {
                        this.fieldValue = fieldValue
                    }

                    fun requirementId(requirementId: String) =
                        requirementId(JsonField.of(requirementId))

                    /**
                     * Sets [Builder.requirementId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.requirementId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun requirementId(requirementId: JsonField<String>) = apply {
                        this.requirementId = requirementId
                    }

                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

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
                            requirementId,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RegulatoryRequirement = apply {
                    if (validated) {
                        return@apply
                    }

                    fieldType()
                    fieldValue()
                    requirementId()
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
                    (if (fieldType.asKnown().isPresent) 1 else 0) +
                        (if (fieldValue.asKnown().isPresent) 1 else 0) +
                        (if (requirementId.asKnown().isPresent) 1 else 0) +
                        (if (status.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RegulatoryRequirement &&
                        fieldType == other.fieldType &&
                        fieldValue == other.fieldValue &&
                        requirementId == other.requirementId &&
                        status == other.status &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(fieldType, fieldValue, requirementId, status, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RegulatoryRequirement{fieldType=$fieldType, fieldValue=$fieldValue, requirementId=$requirementId, status=$status, additionalProperties=$additionalProperties}"
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

        class RegulatoryRequirement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val fieldType: JsonField<String>,
            private val recordType: JsonField<String>,
            private val requirementId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("field_type")
                @ExcludeMissing
                fieldType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("requirement_id")
                @ExcludeMissing
                requirementId: JsonField<String> = JsonMissing.of(),
            ) : this(fieldType, recordType, requirementId, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fieldType(): Optional<String> = fieldType.getOptional("field_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requirementId(): Optional<String> = requirementId.getOptional("requirement_id")

            /**
             * Returns the raw JSON value of [fieldType].
             *
             * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("field_type")
            @ExcludeMissing
            fun _fieldType(): JsonField<String> = fieldType

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

                private var fieldType: JsonField<String> = JsonMissing.of()
                private var recordType: JsonField<String> = JsonMissing.of()
                private var requirementId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(regulatoryRequirement: RegulatoryRequirement) = apply {
                    fieldType = regulatoryRequirement.fieldType
                    recordType = regulatoryRequirement.recordType
                    requirementId = regulatoryRequirement.requirementId
                    additionalProperties = regulatoryRequirement.additionalProperties.toMutableMap()
                }

                fun fieldType(fieldType: String) = fieldType(JsonField.of(fieldType))

                /**
                 * Sets [Builder.fieldType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fieldType(fieldType: JsonField<String>) = apply { this.fieldType = fieldType }

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
                        recordType,
                        requirementId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RegulatoryRequirement = apply {
                if (validated) {
                    return@apply
                }

                fieldType()
                recordType()
                requirementId()
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
                (if (fieldType.asKnown().isPresent) 1 else 0) +
                    (if (recordType.asKnown().isPresent) 1 else 0) +
                    (if (requirementId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RegulatoryRequirement &&
                    fieldType == other.fieldType &&
                    recordType == other.recordType &&
                    requirementId == other.requirementId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(fieldType, recordType, requirementId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RegulatoryRequirement{fieldType=$fieldType, recordType=$recordType, requirementId=$requirementId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, countryCode=$countryCode, createdAt=$createdAt, customerReference=$customerReference, isBlockSubNumberOrder=$isBlockSubNumberOrder, orderRequestId=$orderRequestId, phoneNumberType=$phoneNumberType, phoneNumbers=$phoneNumbers, phoneNumbersCount=$phoneNumbersCount, recordType=$recordType, regulatoryRequirements=$regulatoryRequirements, requirementsMet=$requirementsMet, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubNumberOrderUpdateRequirementGroupResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubNumberOrderUpdateRequirementGroupResponse{data=$data, additionalProperties=$additionalProperties}"
}
