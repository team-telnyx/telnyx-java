// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

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
import com.telnyx.sdk.models.PhoneNumbersJobPhoneNumber
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumberOrderListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val billingGroupId: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerReference: JsonField<String>,
    private val messagingProfileId: JsonField<String>,
    private val phoneNumbers: JsonField<List<PhoneNumbersJobPhoneNumber>>,
    private val phoneNumbersCount: JsonField<Long>,
    private val recordType: JsonField<String>,
    private val requirementsMet: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val subNumberOrdersIds: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        billingGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_reference")
        @ExcludeMissing
        customerReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<PhoneNumbersJobPhoneNumber>> = JsonMissing.of(),
        @JsonProperty("phone_numbers_count")
        @ExcludeMissing
        phoneNumbersCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requirements_met")
        @ExcludeMissing
        requirementsMet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("sub_number_orders_ids")
        @ExcludeMissing
        subNumberOrdersIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        billingGroupId,
        connectionId,
        createdAt,
        customerReference,
        messagingProfileId,
        phoneNumbers,
        phoneNumbersCount,
        recordType,
        requirementsMet,
        status,
        subNumberOrdersIds,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Identifies the messaging profile associated with the phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

    /**
     * Identifies the connection associated with this phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

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
     * Identifies the messaging profile associated with the phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> =
        messagingProfileId.getOptional("messaging_profile_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumbers(): Optional<List<PhoneNumbersJobPhoneNumber>> =
        phoneNumbers.getOptional("phone_numbers")

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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subNumberOrdersIds(): Optional<List<String>> =
        subNumberOrdersIds.getOptional("sub_number_orders_ids")

    /**
     * An ISO 8901 datetime string for when the number order was updated.
     *
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
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_group_id")
    @ExcludeMissing
    fun _billingGroupId(): JsonField<String> = billingGroupId

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

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
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_profile_id")
    @ExcludeMissing
    fun _messagingProfileId(): JsonField<String> = messagingProfileId

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<PhoneNumbersJobPhoneNumber>> = phoneNumbers

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
     * Returns the raw JSON value of [subNumberOrdersIds].
     *
     * Unlike [subNumberOrdersIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sub_number_orders_ids")
    @ExcludeMissing
    fun _subNumberOrdersIds(): JsonField<List<String>> = subNumberOrdersIds

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

        /** Returns a mutable builder for constructing an instance of [NumberOrderListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberOrderListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var billingGroupId: JsonField<String> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerReference: JsonField<String> = JsonMissing.of()
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var phoneNumbers: JsonField<MutableList<PhoneNumbersJobPhoneNumber>>? = null
        private var phoneNumbersCount: JsonField<Long> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var subNumberOrdersIds: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberOrderListResponse: NumberOrderListResponse) = apply {
            id = numberOrderListResponse.id
            billingGroupId = numberOrderListResponse.billingGroupId
            connectionId = numberOrderListResponse.connectionId
            createdAt = numberOrderListResponse.createdAt
            customerReference = numberOrderListResponse.customerReference
            messagingProfileId = numberOrderListResponse.messagingProfileId
            phoneNumbers = numberOrderListResponse.phoneNumbers.map { it.toMutableList() }
            phoneNumbersCount = numberOrderListResponse.phoneNumbersCount
            recordType = numberOrderListResponse.recordType
            requirementsMet = numberOrderListResponse.requirementsMet
            status = numberOrderListResponse.status
            subNumberOrdersIds =
                numberOrderListResponse.subNumberOrdersIds.map { it.toMutableList() }
            updatedAt = numberOrderListResponse.updatedAt
            additionalProperties = numberOrderListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Identifies the messaging profile associated with the phone number. */
        fun billingGroupId(billingGroupId: String) = billingGroupId(JsonField.of(billingGroupId))

        /**
         * Sets [Builder.billingGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingGroupId(billingGroupId: JsonField<String>) = apply {
            this.billingGroupId = billingGroupId
        }

        /** Identifies the connection associated with this phone number. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

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

        /** Identifies the messaging profile associated with the phone number. */
        fun messagingProfileId(messagingProfileId: String) =
            messagingProfileId(JsonField.of(messagingProfileId))

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            this.messagingProfileId = messagingProfileId
        }

        fun phoneNumbers(phoneNumbers: List<PhoneNumbersJobPhoneNumber>) =
            phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed
         * `List<PhoneNumbersJobPhoneNumber>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumbersJobPhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [PhoneNumbersJobPhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: PhoneNumbersJobPhoneNumber) = apply {
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

        fun subNumberOrdersIds(subNumberOrdersIds: List<String>) =
            subNumberOrdersIds(JsonField.of(subNumberOrdersIds))

        /**
         * Sets [Builder.subNumberOrdersIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subNumberOrdersIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subNumberOrdersIds(subNumberOrdersIds: JsonField<List<String>>) = apply {
            this.subNumberOrdersIds = subNumberOrdersIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [subNumberOrdersIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubNumberOrdersId(subNumberOrdersId: String) = apply {
            subNumberOrdersIds =
                (subNumberOrdersIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subNumberOrdersIds", it).add(subNumberOrdersId)
                }
        }

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
         * Returns an immutable instance of [NumberOrderListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberOrderListResponse =
            NumberOrderListResponse(
                id,
                billingGroupId,
                connectionId,
                createdAt,
                customerReference,
                messagingProfileId,
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                phoneNumbersCount,
                recordType,
                requirementsMet,
                status,
                (subNumberOrdersIds ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NumberOrderListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        billingGroupId()
        connectionId()
        createdAt()
        customerReference()
        messagingProfileId()
        phoneNumbers().ifPresent { it.forEach { it.validate() } }
        phoneNumbersCount()
        recordType()
        requirementsMet()
        status().ifPresent { it.validate() }
        subNumberOrdersIds()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (billingGroupId.asKnown().isPresent) 1 else 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customerReference.asKnown().isPresent) 1 else 0) +
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (phoneNumbersCount.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (requirementsMet.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (subNumberOrdersIds.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

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

        return other is NumberOrderListResponse &&
            id == other.id &&
            billingGroupId == other.billingGroupId &&
            connectionId == other.connectionId &&
            createdAt == other.createdAt &&
            customerReference == other.customerReference &&
            messagingProfileId == other.messagingProfileId &&
            phoneNumbers == other.phoneNumbers &&
            phoneNumbersCount == other.phoneNumbersCount &&
            recordType == other.recordType &&
            requirementsMet == other.requirementsMet &&
            status == other.status &&
            subNumberOrdersIds == other.subNumberOrdersIds &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            billingGroupId,
            connectionId,
            createdAt,
            customerReference,
            messagingProfileId,
            phoneNumbers,
            phoneNumbersCount,
            recordType,
            requirementsMet,
            status,
            subNumberOrdersIds,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberOrderListResponse{id=$id, billingGroupId=$billingGroupId, connectionId=$connectionId, createdAt=$createdAt, customerReference=$customerReference, messagingProfileId=$messagingProfileId, phoneNumbers=$phoneNumbers, phoneNumbersCount=$phoneNumbersCount, recordType=$recordType, requirementsMet=$requirementsMet, status=$status, subNumberOrdersIds=$subNumberOrdersIds, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
