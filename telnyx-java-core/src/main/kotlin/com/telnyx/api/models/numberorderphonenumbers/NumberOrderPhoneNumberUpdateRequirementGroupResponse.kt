// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numberorderphonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumberOrderPhoneNumberUpdateRequirementGroupResponse
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
         * [NumberOrderPhoneNumberUpdateRequirementGroupResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberOrderPhoneNumberUpdateRequirementGroupResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            numberOrderPhoneNumberUpdateRequirementGroupResponse:
                NumberOrderPhoneNumberUpdateRequirementGroupResponse
        ) = apply {
            data = numberOrderPhoneNumberUpdateRequirementGroupResponse.data
            additionalProperties =
                numberOrderPhoneNumberUpdateRequirementGroupResponse.additionalProperties
                    .toMutableMap()
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
         * Returns an immutable instance of [NumberOrderPhoneNumberUpdateRequirementGroupResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberOrderPhoneNumberUpdateRequirementGroupResponse =
            NumberOrderPhoneNumberUpdateRequirementGroupResponse(
                data,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NumberOrderPhoneNumberUpdateRequirementGroupResponse = apply {
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
        private val bundleId: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val deadline: JsonField<OffsetDateTime>,
        private val isBlockNumber: JsonField<Boolean>,
        private val locality: JsonField<String>,
        private val orderRequestId: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val phoneNumberType: JsonField<String>,
        private val recordType: JsonField<String>,
        private val regulatoryRequirements: JsonField<List<RegulatoryRequirement>>,
        private val requirementsMet: JsonField<Boolean>,
        private val requirementsStatus: JsonField<String>,
        private val status: JsonField<String>,
        private val subNumberOrderId: JsonField<String>,
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
            @JsonProperty("deadline")
            @ExcludeMissing
            deadline: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("is_block_number")
            @ExcludeMissing
            isBlockNumber: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order_request_id")
            @ExcludeMissing
            orderRequestId: JsonField<String> = JsonMissing.of(),
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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subNumberOrderId(): Optional<String> =
            subNumberOrderId.getOptional("sub_number_order_id")

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
        @JsonProperty("deadline")
        @ExcludeMissing
        fun _deadline(): JsonField<OffsetDateTime> = deadline

        /**
         * Returns the raw JSON value of [isBlockNumber].
         *
         * Unlike [isBlockNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [orderRequestId], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var bundleId: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var deadline: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isBlockNumber: JsonField<Boolean> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var orderRequestId: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var phoneNumberType: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var regulatoryRequirements: JsonField<MutableList<RegulatoryRequirement>>? =
                null
            private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
            private var requirementsStatus: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var subNumberOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                bundleId = data.bundleId
                countryCode = data.countryCode
                deadline = data.deadline
                isBlockNumber = data.isBlockNumber
                locality = data.locality
                orderRequestId = data.orderRequestId
                phoneNumber = data.phoneNumber
                phoneNumberType = data.phoneNumberType
                recordType = data.recordType
                regulatoryRequirements = data.regulatoryRequirements.map { it.toMutableList() }
                requirementsMet = data.requirementsMet
                requirementsStatus = data.requirementsStatus
                status = data.status
                subNumberOrderId = data.subNumberOrderId
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
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
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

        fun validate(): Data = apply {
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
            phoneNumberType()
            recordType()
            regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
            requirementsMet()
            requirementsStatus()
            status()
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
                (if (deadline.asKnown().isPresent) 1 else 0) +
                (if (isBlockNumber.asKnown().isPresent) 1 else 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (orderRequestId.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (phoneNumberType.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (requirementsMet.asKnown().isPresent) 1 else 0) +
                (if (requirementsStatus.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (subNumberOrderId.asKnown().isPresent) 1 else 0)

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
                @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            ) : this(fieldType, fieldValue, requirementId, status, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fieldType(): Optional<String> = fieldType.getOptional("field_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fieldValue(): Optional<String> = fieldValue.getOptional("field_value")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requirementId(): Optional<String> = requirementId.getOptional("requirement_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [fieldValue], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("field_value")
            @ExcludeMissing
            fun _fieldValue(): JsonField<String> = fieldValue

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

            return other is Data &&
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
            "Data{id=$id, bundleId=$bundleId, countryCode=$countryCode, deadline=$deadline, isBlockNumber=$isBlockNumber, locality=$locality, orderRequestId=$orderRequestId, phoneNumber=$phoneNumber, phoneNumberType=$phoneNumberType, recordType=$recordType, regulatoryRequirements=$regulatoryRequirements, requirementsMet=$requirementsMet, requirementsStatus=$requirementsStatus, status=$status, subNumberOrderId=$subNumberOrderId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberOrderPhoneNumberUpdateRequirementGroupResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberOrderPhoneNumberUpdateRequirementGroupResponse{data=$data, additionalProperties=$additionalProperties}"
}
