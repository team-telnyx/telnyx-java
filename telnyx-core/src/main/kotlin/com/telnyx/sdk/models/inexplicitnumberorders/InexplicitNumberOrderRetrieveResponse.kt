// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.inexplicitnumberorders

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InexplicitNumberOrderRetrieveResponse
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
         * [InexplicitNumberOrderRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InexplicitNumberOrderRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inexplicitNumberOrderRetrieveResponse: InexplicitNumberOrderRetrieveResponse
        ) = apply {
            data = inexplicitNumberOrderRetrieveResponse.data
            additionalProperties =
                inexplicitNumberOrderRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [InexplicitNumberOrderRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InexplicitNumberOrderRetrieveResponse =
            InexplicitNumberOrderRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): InexplicitNumberOrderRetrieveResponse = apply {
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
        private val billingGroupId: JsonField<String>,
        private val connectionId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerReference: JsonField<String>,
        private val messagingProfileId: JsonField<String>,
        private val orderingGroups: JsonField<List<OrderingGroup>>,
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
            @JsonProperty("ordering_groups")
            @ExcludeMissing
            orderingGroups: JsonField<List<OrderingGroup>> = JsonMissing.of(),
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
            orderingGroups,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the inexplicit number order
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Billing group id to apply to phone numbers that are purchased
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

        /**
         * Connection id to apply to phone numbers that are purchased
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * ISO 8601 formatted date indicating when the resource was created
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Reference label for the customer
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * Messaging profile id to apply to phone numbers that are purchased
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
        fun orderingGroups(): Optional<List<OrderingGroup>> =
            orderingGroups.getOptional("ordering_groups")

        /**
         * ISO 8601 formatted date indicating when the resource was updated
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
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        fun _messagingProfileId(): JsonField<String> = messagingProfileId

        /**
         * Returns the raw JSON value of [orderingGroups].
         *
         * Unlike [orderingGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ordering_groups")
        @ExcludeMissing
        fun _orderingGroups(): JsonField<List<OrderingGroup>> = orderingGroups

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
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var messagingProfileId: JsonField<String> = JsonMissing.of()
            private var orderingGroups: JsonField<MutableList<OrderingGroup>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                billingGroupId = data.billingGroupId
                connectionId = data.connectionId
                createdAt = data.createdAt
                customerReference = data.customerReference
                messagingProfileId = data.messagingProfileId
                orderingGroups = data.orderingGroups.map { it.toMutableList() }
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the inexplicit number order */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Billing group id to apply to phone numbers that are purchased */
            fun billingGroupId(billingGroupId: String) =
                billingGroupId(JsonField.of(billingGroupId))

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

            /** Connection id to apply to phone numbers that are purchased */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** ISO 8601 formatted date indicating when the resource was created */
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

            /** Reference label for the customer */
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

            /** Messaging profile id to apply to phone numbers that are purchased */
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

            fun orderingGroups(orderingGroups: List<OrderingGroup>) =
                orderingGroups(JsonField.of(orderingGroups))

            /**
             * Sets [Builder.orderingGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderingGroups] with a well-typed
             * `List<OrderingGroup>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun orderingGroups(orderingGroups: JsonField<List<OrderingGroup>>) = apply {
                this.orderingGroups = orderingGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [OrderingGroup] to [orderingGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrderingGroup(orderingGroup: OrderingGroup) = apply {
                orderingGroups =
                    (orderingGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("orderingGroups", it).add(orderingGroup)
                    }
            }

            /** ISO 8601 formatted date indicating when the resource was updated */
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
                    billingGroupId,
                    connectionId,
                    createdAt,
                    customerReference,
                    messagingProfileId,
                    (orderingGroups ?: JsonMissing.of()).map { it.toImmutable() },
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
            billingGroupId()
            connectionId()
            createdAt()
            customerReference()
            messagingProfileId()
            orderingGroups().ifPresent { it.forEach { it.validate() } }
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
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                (orderingGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        class OrderingGroup
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val administrativeArea: JsonField<String>,
            private val countAllocated: JsonField<Long>,
            private val countRequested: JsonField<Long>,
            private val countryIso: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val errorReason: JsonField<String>,
            private val nationalDestinationCode: JsonField<String>,
            private val orders: JsonField<List<Order>>,
            private val phoneNumberType: JsonField<String>,
            private val phoneNumberContains: JsonField<String>,
            private val phoneNumberEndsWith: JsonField<String>,
            private val phoneNumberStartsWith: JsonField<String>,
            private val status: JsonField<Status>,
            private val strategy: JsonField<Strategy>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("administrative_area")
                @ExcludeMissing
                administrativeArea: JsonField<String> = JsonMissing.of(),
                @JsonProperty("count_allocated")
                @ExcludeMissing
                countAllocated: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("count_requested")
                @ExcludeMissing
                countRequested: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("country_iso")
                @ExcludeMissing
                countryIso: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("error_reason")
                @ExcludeMissing
                errorReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("national_destination_code")
                @ExcludeMissing
                nationalDestinationCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("orders")
                @ExcludeMissing
                orders: JsonField<List<Order>> = JsonMissing.of(),
                @JsonProperty("phone_number_type")
                @ExcludeMissing
                phoneNumberType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number[contains]")
                @ExcludeMissing
                phoneNumberContains: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number[ends_with]")
                @ExcludeMissing
                phoneNumberEndsWith: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number[starts_with]")
                @ExcludeMissing
                phoneNumberStartsWith: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("strategy")
                @ExcludeMissing
                strategy: JsonField<Strategy> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                administrativeArea,
                countAllocated,
                countRequested,
                countryIso,
                createdAt,
                errorReason,
                nationalDestinationCode,
                orders,
                phoneNumberType,
                phoneNumberContains,
                phoneNumberEndsWith,
                phoneNumberStartsWith,
                status,
                strategy,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * Filter for phone numbers in a given state / province
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun administrativeArea(): Optional<String> =
                administrativeArea.getOptional("administrative_area")

            /**
             * Quantity of phone numbers allocated
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun countAllocated(): Optional<Long> = countAllocated.getOptional("count_allocated")

            /**
             * Quantity of phone numbers requested
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun countRequested(): Optional<Long> = countRequested.getOptional("count_requested")

            /**
             * Country where you would like to purchase phone numbers
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun countryIso(): Optional<String> = countryIso.getOptional("country_iso")

            /**
             * ISO 8601 formatted date indicating when the ordering group was created
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * Error reason if applicable
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorReason(): Optional<String> = errorReason.getOptional("error_reason")

            /**
             * Filter by area code
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun nationalDestinationCode(): Optional<String> =
                nationalDestinationCode.getOptional("national_destination_code")

            /**
             * Array of orders created to fulfill the inexplicit order
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orders(): Optional<List<Order>> = orders.getOptional("orders")

            /**
             * Number type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumberType(): Optional<String> =
                phoneNumberType.getOptional("phone_number_type")

            /**
             * Filter for phone numbers that contain the digits specified
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumberContains(): Optional<String> =
                phoneNumberContains.getOptional("phone_number[contains]")

            /**
             * Filter by the ending digits of the phone number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumberEndsWith(): Optional<String> =
                phoneNumberEndsWith.getOptional("phone_number[ends_with]")

            /**
             * Filter by the starting digits of the phone number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumberStartsWith(): Optional<String> =
                phoneNumberStartsWith.getOptional("phone_number[starts_with]")

            /**
             * Status of the ordering group
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * Ordering strategy used
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun strategy(): Optional<Strategy> = strategy.getOptional("strategy")

            /**
             * ISO 8601 formatted date indicating when the ordering group was updated
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

            /**
             * Returns the raw JSON value of [administrativeArea].
             *
             * Unlike [administrativeArea], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("administrative_area")
            @ExcludeMissing
            fun _administrativeArea(): JsonField<String> = administrativeArea

            /**
             * Returns the raw JSON value of [countAllocated].
             *
             * Unlike [countAllocated], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("count_allocated")
            @ExcludeMissing
            fun _countAllocated(): JsonField<Long> = countAllocated

            /**
             * Returns the raw JSON value of [countRequested].
             *
             * Unlike [countRequested], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("count_requested")
            @ExcludeMissing
            fun _countRequested(): JsonField<Long> = countRequested

            /**
             * Returns the raw JSON value of [countryIso].
             *
             * Unlike [countryIso], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("country_iso")
            @ExcludeMissing
            fun _countryIso(): JsonField<String> = countryIso

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [errorReason].
             *
             * Unlike [errorReason], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_reason")
            @ExcludeMissing
            fun _errorReason(): JsonField<String> = errorReason

            /**
             * Returns the raw JSON value of [nationalDestinationCode].
             *
             * Unlike [nationalDestinationCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("national_destination_code")
            @ExcludeMissing
            fun _nationalDestinationCode(): JsonField<String> = nationalDestinationCode

            /**
             * Returns the raw JSON value of [orders].
             *
             * Unlike [orders], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("orders") @ExcludeMissing fun _orders(): JsonField<List<Order>> = orders

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
             * Returns the raw JSON value of [phoneNumberContains].
             *
             * Unlike [phoneNumberContains], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("phone_number[contains]")
            @ExcludeMissing
            fun _phoneNumberContains(): JsonField<String> = phoneNumberContains

            /**
             * Returns the raw JSON value of [phoneNumberEndsWith].
             *
             * Unlike [phoneNumberEndsWith], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("phone_number[ends_with]")
            @ExcludeMissing
            fun _phoneNumberEndsWith(): JsonField<String> = phoneNumberEndsWith

            /**
             * Returns the raw JSON value of [phoneNumberStartsWith].
             *
             * Unlike [phoneNumberStartsWith], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("phone_number[starts_with]")
            @ExcludeMissing
            fun _phoneNumberStartsWith(): JsonField<String> = phoneNumberStartsWith

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [strategy].
             *
             * Unlike [strategy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("strategy")
            @ExcludeMissing
            fun _strategy(): JsonField<Strategy> = strategy

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /** Returns a mutable builder for constructing an instance of [OrderingGroup]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OrderingGroup]. */
            class Builder internal constructor() {

                private var administrativeArea: JsonField<String> = JsonMissing.of()
                private var countAllocated: JsonField<Long> = JsonMissing.of()
                private var countRequested: JsonField<Long> = JsonMissing.of()
                private var countryIso: JsonField<String> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var errorReason: JsonField<String> = JsonMissing.of()
                private var nationalDestinationCode: JsonField<String> = JsonMissing.of()
                private var orders: JsonField<MutableList<Order>>? = null
                private var phoneNumberType: JsonField<String> = JsonMissing.of()
                private var phoneNumberContains: JsonField<String> = JsonMissing.of()
                private var phoneNumberEndsWith: JsonField<String> = JsonMissing.of()
                private var phoneNumberStartsWith: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var strategy: JsonField<Strategy> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(orderingGroup: OrderingGroup) = apply {
                    administrativeArea = orderingGroup.administrativeArea
                    countAllocated = orderingGroup.countAllocated
                    countRequested = orderingGroup.countRequested
                    countryIso = orderingGroup.countryIso
                    createdAt = orderingGroup.createdAt
                    errorReason = orderingGroup.errorReason
                    nationalDestinationCode = orderingGroup.nationalDestinationCode
                    orders = orderingGroup.orders.map { it.toMutableList() }
                    phoneNumberType = orderingGroup.phoneNumberType
                    phoneNumberContains = orderingGroup.phoneNumberContains
                    phoneNumberEndsWith = orderingGroup.phoneNumberEndsWith
                    phoneNumberStartsWith = orderingGroup.phoneNumberStartsWith
                    status = orderingGroup.status
                    strategy = orderingGroup.strategy
                    updatedAt = orderingGroup.updatedAt
                    additionalProperties = orderingGroup.additionalProperties.toMutableMap()
                }

                /** Filter for phone numbers in a given state / province */
                fun administrativeArea(administrativeArea: String) =
                    administrativeArea(JsonField.of(administrativeArea))

                /**
                 * Sets [Builder.administrativeArea] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.administrativeArea] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun administrativeArea(administrativeArea: JsonField<String>) = apply {
                    this.administrativeArea = administrativeArea
                }

                /** Quantity of phone numbers allocated */
                fun countAllocated(countAllocated: Long) =
                    countAllocated(JsonField.of(countAllocated))

                /**
                 * Sets [Builder.countAllocated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countAllocated] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countAllocated(countAllocated: JsonField<Long>) = apply {
                    this.countAllocated = countAllocated
                }

                /** Quantity of phone numbers requested */
                fun countRequested(countRequested: Long) =
                    countRequested(JsonField.of(countRequested))

                /**
                 * Sets [Builder.countRequested] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countRequested] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countRequested(countRequested: JsonField<Long>) = apply {
                    this.countRequested = countRequested
                }

                /** Country where you would like to purchase phone numbers */
                fun countryIso(countryIso: String) = countryIso(JsonField.of(countryIso))

                /**
                 * Sets [Builder.countryIso] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryIso] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryIso(countryIso: JsonField<String>) = apply {
                    this.countryIso = countryIso
                }

                /** ISO 8601 formatted date indicating when the ordering group was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Error reason if applicable */
                fun errorReason(errorReason: String) = errorReason(JsonField.of(errorReason))

                /**
                 * Sets [Builder.errorReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorReason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorReason(errorReason: JsonField<String>) = apply {
                    this.errorReason = errorReason
                }

                /** Filter by area code */
                fun nationalDestinationCode(nationalDestinationCode: String) =
                    nationalDestinationCode(JsonField.of(nationalDestinationCode))

                /**
                 * Sets [Builder.nationalDestinationCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nationalDestinationCode] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun nationalDestinationCode(nationalDestinationCode: JsonField<String>) = apply {
                    this.nationalDestinationCode = nationalDestinationCode
                }

                /** Array of orders created to fulfill the inexplicit order */
                fun orders(orders: List<Order>) = orders(JsonField.of(orders))

                /**
                 * Sets [Builder.orders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orders] with a well-typed `List<Order>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun orders(orders: JsonField<List<Order>>) = apply {
                    this.orders = orders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Order] to [orders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addOrder(order: Order) = apply {
                    orders =
                        (orders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("orders", it).add(order)
                        }
                }

                /** Number type */
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

                /** Filter for phone numbers that contain the digits specified */
                fun phoneNumberContains(phoneNumberContains: String) =
                    phoneNumberContains(JsonField.of(phoneNumberContains))

                /**
                 * Sets [Builder.phoneNumberContains] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumberContains] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun phoneNumberContains(phoneNumberContains: JsonField<String>) = apply {
                    this.phoneNumberContains = phoneNumberContains
                }

                /** Filter by the ending digits of the phone number */
                fun phoneNumberEndsWith(phoneNumberEndsWith: String) =
                    phoneNumberEndsWith(JsonField.of(phoneNumberEndsWith))

                /**
                 * Sets [Builder.phoneNumberEndsWith] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumberEndsWith] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun phoneNumberEndsWith(phoneNumberEndsWith: JsonField<String>) = apply {
                    this.phoneNumberEndsWith = phoneNumberEndsWith
                }

                /** Filter by the starting digits of the phone number */
                fun phoneNumberStartsWith(phoneNumberStartsWith: String) =
                    phoneNumberStartsWith(JsonField.of(phoneNumberStartsWith))

                /**
                 * Sets [Builder.phoneNumberStartsWith] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumberStartsWith] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun phoneNumberStartsWith(phoneNumberStartsWith: JsonField<String>) = apply {
                    this.phoneNumberStartsWith = phoneNumberStartsWith
                }

                /** Status of the ordering group */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Ordering strategy used */
                fun strategy(strategy: Strategy) = strategy(JsonField.of(strategy))

                /**
                 * Sets [Builder.strategy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.strategy] with a well-typed [Strategy] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun strategy(strategy: JsonField<Strategy>) = apply { this.strategy = strategy }

                /** ISO 8601 formatted date indicating when the ordering group was updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [OrderingGroup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OrderingGroup =
                    OrderingGroup(
                        administrativeArea,
                        countAllocated,
                        countRequested,
                        countryIso,
                        createdAt,
                        errorReason,
                        nationalDestinationCode,
                        (orders ?: JsonMissing.of()).map { it.toImmutable() },
                        phoneNumberType,
                        phoneNumberContains,
                        phoneNumberEndsWith,
                        phoneNumberStartsWith,
                        status,
                        strategy,
                        updatedAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OrderingGroup = apply {
                if (validated) {
                    return@apply
                }

                administrativeArea()
                countAllocated()
                countRequested()
                countryIso()
                createdAt()
                errorReason()
                nationalDestinationCode()
                orders().ifPresent { it.forEach { it.validate() } }
                phoneNumberType()
                phoneNumberContains()
                phoneNumberEndsWith()
                phoneNumberStartsWith()
                status().ifPresent { it.validate() }
                strategy().ifPresent { it.validate() }
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
                (if (administrativeArea.asKnown().isPresent) 1 else 0) +
                    (if (countAllocated.asKnown().isPresent) 1 else 0) +
                    (if (countRequested.asKnown().isPresent) 1 else 0) +
                    (if (countryIso.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (errorReason.asKnown().isPresent) 1 else 0) +
                    (if (nationalDestinationCode.asKnown().isPresent) 1 else 0) +
                    (orders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumberType.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumberContains.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumberEndsWith.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumberStartsWith.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (strategy.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            class Order
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val numberOrderId: JsonField<String>,
                private val subNumberOrderIds: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("number_order_id")
                    @ExcludeMissing
                    numberOrderId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sub_number_order_ids")
                    @ExcludeMissing
                    subNumberOrderIds: JsonField<List<String>> = JsonMissing.of(),
                ) : this(numberOrderId, subNumberOrderIds, mutableMapOf())

                /**
                 * ID of the main number order
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun numberOrderId(): String = numberOrderId.getRequired("number_order_id")

                /**
                 * Array of sub number order IDs
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun subNumberOrderIds(): List<String> =
                    subNumberOrderIds.getRequired("sub_number_order_ids")

                /**
                 * Returns the raw JSON value of [numberOrderId].
                 *
                 * Unlike [numberOrderId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("number_order_id")
                @ExcludeMissing
                fun _numberOrderId(): JsonField<String> = numberOrderId

                /**
                 * Returns the raw JSON value of [subNumberOrderIds].
                 *
                 * Unlike [subNumberOrderIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sub_number_order_ids")
                @ExcludeMissing
                fun _subNumberOrderIds(): JsonField<List<String>> = subNumberOrderIds

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
                     * Returns a mutable builder for constructing an instance of [Order].
                     *
                     * The following fields are required:
                     * ```java
                     * .numberOrderId()
                     * .subNumberOrderIds()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Order]. */
                class Builder internal constructor() {

                    private var numberOrderId: JsonField<String>? = null
                    private var subNumberOrderIds: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(order: Order) = apply {
                        numberOrderId = order.numberOrderId
                        subNumberOrderIds = order.subNumberOrderIds.map { it.toMutableList() }
                        additionalProperties = order.additionalProperties.toMutableMap()
                    }

                    /** ID of the main number order */
                    fun numberOrderId(numberOrderId: String) =
                        numberOrderId(JsonField.of(numberOrderId))

                    /**
                     * Sets [Builder.numberOrderId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.numberOrderId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun numberOrderId(numberOrderId: JsonField<String>) = apply {
                        this.numberOrderId = numberOrderId
                    }

                    /** Array of sub number order IDs */
                    fun subNumberOrderIds(subNumberOrderIds: List<String>) =
                        subNumberOrderIds(JsonField.of(subNumberOrderIds))

                    /**
                     * Sets [Builder.subNumberOrderIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subNumberOrderIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun subNumberOrderIds(subNumberOrderIds: JsonField<List<String>>) = apply {
                        this.subNumberOrderIds = subNumberOrderIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [subNumberOrderIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSubNumberOrderId(subNumberOrderId: String) = apply {
                        subNumberOrderIds =
                            (subNumberOrderIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("subNumberOrderIds", it).add(subNumberOrderId)
                            }
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
                     * Returns an immutable instance of [Order].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .numberOrderId()
                     * .subNumberOrderIds()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Order =
                        Order(
                            checkRequired("numberOrderId", numberOrderId),
                            checkRequired("subNumberOrderIds", subNumberOrderIds).map {
                                it.toImmutable()
                            },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Order = apply {
                    if (validated) {
                        return@apply
                    }

                    numberOrderId()
                    subNumberOrderIds()
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
                    (if (numberOrderId.asKnown().isPresent) 1 else 0) +
                        (subNumberOrderIds.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Order &&
                        numberOrderId == other.numberOrderId &&
                        subNumberOrderIds == other.subNumberOrderIds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(numberOrderId, subNumberOrderIds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Order{numberOrderId=$numberOrderId, subNumberOrderIds=$subNumberOrderIds, additionalProperties=$additionalProperties}"
            }

            /** Status of the ordering group */
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

                    @JvmField val PENDING = of("pending")

                    @JvmField val PROCESSING = of("processing")

                    @JvmField val FAILED = of("failed")

                    @JvmField val SUCCESS = of("success")

                    @JvmField val PARTIAL_SUCCESS = of("partial_success")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    PENDING,
                    PROCESSING,
                    FAILED,
                    SUCCESS,
                    PARTIAL_SUCCESS,
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
                    PENDING,
                    PROCESSING,
                    FAILED,
                    SUCCESS,
                    PARTIAL_SUCCESS,
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
                        PENDING -> Value.PENDING
                        PROCESSING -> Value.PROCESSING
                        FAILED -> Value.FAILED
                        SUCCESS -> Value.SUCCESS
                        PARTIAL_SUCCESS -> Value.PARTIAL_SUCCESS
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
                        PENDING -> Known.PENDING
                        PROCESSING -> Known.PROCESSING
                        FAILED -> Known.FAILED
                        SUCCESS -> Known.SUCCESS
                        PARTIAL_SUCCESS -> Known.PARTIAL_SUCCESS
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

            /** Ordering strategy used */
            class Strategy @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val ALWAYS = of("always")

                    @JvmField val NEVER = of("never")

                    @JvmStatic fun of(value: String) = Strategy(JsonField.of(value))
                }

                /** An enum containing [Strategy]'s known values. */
                enum class Known {
                    ALWAYS,
                    NEVER,
                }

                /**
                 * An enum containing [Strategy]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Strategy] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ALWAYS,
                    NEVER,
                    /**
                     * An enum member indicating that [Strategy] was instantiated with an unknown
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
                        ALWAYS -> Value.ALWAYS
                        NEVER -> Value.NEVER
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
                        ALWAYS -> Known.ALWAYS
                        NEVER -> Known.NEVER
                        else -> throw TelnyxInvalidDataException("Unknown Strategy: $value")
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

                fun validate(): Strategy = apply {
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

                    return other is Strategy && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OrderingGroup &&
                    administrativeArea == other.administrativeArea &&
                    countAllocated == other.countAllocated &&
                    countRequested == other.countRequested &&
                    countryIso == other.countryIso &&
                    createdAt == other.createdAt &&
                    errorReason == other.errorReason &&
                    nationalDestinationCode == other.nationalDestinationCode &&
                    orders == other.orders &&
                    phoneNumberType == other.phoneNumberType &&
                    phoneNumberContains == other.phoneNumberContains &&
                    phoneNumberEndsWith == other.phoneNumberEndsWith &&
                    phoneNumberStartsWith == other.phoneNumberStartsWith &&
                    status == other.status &&
                    strategy == other.strategy &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    administrativeArea,
                    countAllocated,
                    countRequested,
                    countryIso,
                    createdAt,
                    errorReason,
                    nationalDestinationCode,
                    orders,
                    phoneNumberType,
                    phoneNumberContains,
                    phoneNumberEndsWith,
                    phoneNumberStartsWith,
                    status,
                    strategy,
                    updatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OrderingGroup{administrativeArea=$administrativeArea, countAllocated=$countAllocated, countRequested=$countRequested, countryIso=$countryIso, createdAt=$createdAt, errorReason=$errorReason, nationalDestinationCode=$nationalDestinationCode, orders=$orders, phoneNumberType=$phoneNumberType, phoneNumberContains=$phoneNumberContains, phoneNumberEndsWith=$phoneNumberEndsWith, phoneNumberStartsWith=$phoneNumberStartsWith, status=$status, strategy=$strategy, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                billingGroupId == other.billingGroupId &&
                connectionId == other.connectionId &&
                createdAt == other.createdAt &&
                customerReference == other.customerReference &&
                messagingProfileId == other.messagingProfileId &&
                orderingGroups == other.orderingGroups &&
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
                orderingGroups,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, billingGroupId=$billingGroupId, connectionId=$connectionId, createdAt=$createdAt, customerReference=$customerReference, messagingProfileId=$messagingProfileId, orderingGroups=$orderingGroups, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InexplicitNumberOrderRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InexplicitNumberOrderRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
