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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create an inexplicit number order to programmatically purchase phone numbers without specifying
 * exact numbers.
 */
class InexplicitNumberOrderCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Group(s) of numbers to order. You can have multiple ordering_groups objects added to a single
     * request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orderingGroups(): List<OrderingGroup> = body.orderingGroups()

    /**
     * Billing group id to apply to phone numbers that are purchased
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = body.billingGroupId()

    /**
     * Connection id to apply to phone numbers that are purchased
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = body.connectionId()

    /**
     * Reference label for the customer
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * Messaging profile id to apply to phone numbers that are purchased
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> = body.messagingProfileId()

    /**
     * Returns the raw JSON value of [orderingGroups].
     *
     * Unlike [orderingGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orderingGroups(): JsonField<List<OrderingGroup>> = body._orderingGroups()

    /**
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingGroupId(): JsonField<String> = body._billingGroupId()

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectionId(): JsonField<String> = body._connectionId()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = body._customerReference()

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messagingProfileId(): JsonField<String> = body._messagingProfileId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InexplicitNumberOrderCreateParams].
         *
         * The following fields are required:
         * ```java
         * .orderingGroups()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InexplicitNumberOrderCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inexplicitNumberOrderCreateParams: InexplicitNumberOrderCreateParams) =
            apply {
                body = inexplicitNumberOrderCreateParams.body.toBuilder()
                additionalHeaders = inexplicitNumberOrderCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inexplicitNumberOrderCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [orderingGroups]
         * - [billingGroupId]
         * - [connectionId]
         * - [customerReference]
         * - [messagingProfileId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Group(s) of numbers to order. You can have multiple ordering_groups objects added to a
         * single request.
         */
        fun orderingGroups(orderingGroups: List<OrderingGroup>) = apply {
            body.orderingGroups(orderingGroups)
        }

        /**
         * Sets [Builder.orderingGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderingGroups] with a well-typed `List<OrderingGroup>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun orderingGroups(orderingGroups: JsonField<List<OrderingGroup>>) = apply {
            body.orderingGroups(orderingGroups)
        }

        /**
         * Adds a single [OrderingGroup] to [orderingGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrderingGroup(orderingGroup: OrderingGroup) = apply {
            body.addOrderingGroup(orderingGroup)
        }

        /** Billing group id to apply to phone numbers that are purchased */
        fun billingGroupId(billingGroupId: String) = apply { body.billingGroupId(billingGroupId) }

        /**
         * Sets [Builder.billingGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingGroupId(billingGroupId: JsonField<String>) = apply {
            body.billingGroupId(billingGroupId)
        }

        /** Connection id to apply to phone numbers that are purchased */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            body.connectionId(connectionId)
        }

        /** Reference label for the customer */
        fun customerReference(customerReference: String) = apply {
            body.customerReference(customerReference)
        }

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            body.customerReference(customerReference)
        }

        /** Messaging profile id to apply to phone numbers that are purchased */
        fun messagingProfileId(messagingProfileId: String) = apply {
            body.messagingProfileId(messagingProfileId)
        }

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            body.messagingProfileId(messagingProfileId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [InexplicitNumberOrderCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orderingGroups()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InexplicitNumberOrderCreateParams =
            InexplicitNumberOrderCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val orderingGroups: JsonField<List<OrderingGroup>>,
        private val billingGroupId: JsonField<String>,
        private val connectionId: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val messagingProfileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ordering_groups")
            @ExcludeMissing
            orderingGroups: JsonField<List<OrderingGroup>> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("messaging_profile_id")
            @ExcludeMissing
            messagingProfileId: JsonField<String> = JsonMissing.of(),
        ) : this(
            orderingGroups,
            billingGroupId,
            connectionId,
            customerReference,
            messagingProfileId,
            mutableMapOf(),
        )

        /**
         * Group(s) of numbers to order. You can have multiple ordering_groups objects added to a
         * single request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun orderingGroups(): List<OrderingGroup> = orderingGroups.getRequired("ordering_groups")

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
         * Returns the raw JSON value of [orderingGroups].
         *
         * Unlike [orderingGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ordering_groups")
        @ExcludeMissing
        fun _orderingGroups(): JsonField<List<OrderingGroup>> = orderingGroups

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .orderingGroups()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var orderingGroups: JsonField<MutableList<OrderingGroup>>? = null
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var messagingProfileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                orderingGroups = body.orderingGroups.map { it.toMutableList() }
                billingGroupId = body.billingGroupId
                connectionId = body.connectionId
                customerReference = body.customerReference
                messagingProfileId = body.messagingProfileId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Group(s) of numbers to order. You can have multiple ordering_groups objects added to
             * a single request.
             */
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .orderingGroups()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("orderingGroups", orderingGroups).map { it.toImmutable() },
                    billingGroupId,
                    connectionId,
                    customerReference,
                    messagingProfileId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            orderingGroups().forEach { it.validate() }
            billingGroupId()
            connectionId()
            customerReference()
            messagingProfileId()
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
            (orderingGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (messagingProfileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                orderingGroups == other.orderingGroups &&
                billingGroupId == other.billingGroupId &&
                connectionId == other.connectionId &&
                customerReference == other.customerReference &&
                messagingProfileId == other.messagingProfileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                orderingGroups,
                billingGroupId,
                connectionId,
                customerReference,
                messagingProfileId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{orderingGroups=$orderingGroups, billingGroupId=$billingGroupId, connectionId=$connectionId, customerReference=$customerReference, messagingProfileId=$messagingProfileId, additionalProperties=$additionalProperties}"
    }

    class OrderingGroup
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val countRequested: JsonField<String>,
        private val countryIso: JsonField<CountryIso>,
        private val phoneNumberType: JsonField<String>,
        private val administrativeArea: JsonField<String>,
        private val features: JsonField<List<String>>,
        private val locality: JsonField<String>,
        private val nationalDestinationCode: JsonField<String>,
        private val phoneNumber: JsonField<PhoneNumber>,
        private val strategy: JsonField<Strategy>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("count_requested")
            @ExcludeMissing
            countRequested: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_iso")
            @ExcludeMissing
            countryIso: JsonField<CountryIso> = JsonMissing.of(),
            @JsonProperty("phone_number_type")
            @ExcludeMissing
            phoneNumberType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("administrative_area")
            @ExcludeMissing
            administrativeArea: JsonField<String> = JsonMissing.of(),
            @JsonProperty("features")
            @ExcludeMissing
            features: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("national_destination_code")
            @ExcludeMissing
            nationalDestinationCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<PhoneNumber> = JsonMissing.of(),
            @JsonProperty("strategy")
            @ExcludeMissing
            strategy: JsonField<Strategy> = JsonMissing.of(),
        ) : this(
            countRequested,
            countryIso,
            phoneNumberType,
            administrativeArea,
            features,
            locality,
            nationalDestinationCode,
            phoneNumber,
            strategy,
            mutableMapOf(),
        )

        /**
         * Quantity of phone numbers to order
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countRequested(): String = countRequested.getRequired("count_requested")

        /**
         * Country where you would like to purchase phone numbers. Allowable values: US, CA
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryIso(): CountryIso = countryIso.getRequired("country_iso")

        /**
         * Number type (local, toll-free, etc.)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumberType(): String = phoneNumberType.getRequired("phone_number_type")

        /**
         * Filter for phone numbers in a given state / province
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun administrativeArea(): Optional<String> =
            administrativeArea.getOptional("administrative_area")

        /**
         * Filter for phone numbers that have the features to satisfy your use case (e.g.,
         * ["voice"])
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun features(): Optional<List<String>> = features.getOptional("features")

        /**
         * Filter for phone numbers in a given city / region / rate center
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locality(): Optional<String> = locality.getOptional("locality")

        /**
         * Filter by area code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nationalDestinationCode(): Optional<String> =
            nationalDestinationCode.getOptional("national_destination_code")

        /**
         * Phone number search criteria
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<PhoneNumber> = phoneNumber.getOptional("phone_number")

        /**
         * Ordering strategy. Define what action should be taken if we don't have enough phone
         * numbers to fulfill your request. Allowable values are: always = proceed with ordering
         * phone numbers, regardless of current inventory levels; never = do not place any orders
         * unless there are enough phone numbers to satisfy the request. If not specified, the
         * always strategy will be enforced.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun strategy(): Optional<Strategy> = strategy.getOptional("strategy")

        /**
         * Returns the raw JSON value of [countRequested].
         *
         * Unlike [countRequested], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("count_requested")
        @ExcludeMissing
        fun _countRequested(): JsonField<String> = countRequested

        /**
         * Returns the raw JSON value of [countryIso].
         *
         * Unlike [countryIso], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_iso")
        @ExcludeMissing
        fun _countryIso(): JsonField<CountryIso> = countryIso

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
         * Returns the raw JSON value of [administrativeArea].
         *
         * Unlike [administrativeArea], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("administrative_area")
        @ExcludeMissing
        fun _administrativeArea(): JsonField<String> = administrativeArea

        /**
         * Returns the raw JSON value of [features].
         *
         * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("features")
        @ExcludeMissing
        fun _features(): JsonField<List<String>> = features

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

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
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<PhoneNumber> = phoneNumber

        /**
         * Returns the raw JSON value of [strategy].
         *
         * Unlike [strategy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("strategy") @ExcludeMissing fun _strategy(): JsonField<Strategy> = strategy

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
             * Returns a mutable builder for constructing an instance of [OrderingGroup].
             *
             * The following fields are required:
             * ```java
             * .countRequested()
             * .countryIso()
             * .phoneNumberType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OrderingGroup]. */
        class Builder internal constructor() {

            private var countRequested: JsonField<String>? = null
            private var countryIso: JsonField<CountryIso>? = null
            private var phoneNumberType: JsonField<String>? = null
            private var administrativeArea: JsonField<String> = JsonMissing.of()
            private var features: JsonField<MutableList<String>>? = null
            private var locality: JsonField<String> = JsonMissing.of()
            private var nationalDestinationCode: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<PhoneNumber> = JsonMissing.of()
            private var strategy: JsonField<Strategy> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(orderingGroup: OrderingGroup) = apply {
                countRequested = orderingGroup.countRequested
                countryIso = orderingGroup.countryIso
                phoneNumberType = orderingGroup.phoneNumberType
                administrativeArea = orderingGroup.administrativeArea
                features = orderingGroup.features.map { it.toMutableList() }
                locality = orderingGroup.locality
                nationalDestinationCode = orderingGroup.nationalDestinationCode
                phoneNumber = orderingGroup.phoneNumber
                strategy = orderingGroup.strategy
                additionalProperties = orderingGroup.additionalProperties.toMutableMap()
            }

            /** Quantity of phone numbers to order */
            fun countRequested(countRequested: String) =
                countRequested(JsonField.of(countRequested))

            /**
             * Sets [Builder.countRequested] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countRequested] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countRequested(countRequested: JsonField<String>) = apply {
                this.countRequested = countRequested
            }

            /** Country where you would like to purchase phone numbers. Allowable values: US, CA */
            fun countryIso(countryIso: CountryIso) = countryIso(JsonField.of(countryIso))

            /**
             * Sets [Builder.countryIso] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryIso] with a well-typed [CountryIso] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryIso(countryIso: JsonField<CountryIso>) = apply {
                this.countryIso = countryIso
            }

            /** Number type (local, toll-free, etc.) */
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

            /** Filter for phone numbers in a given state / province */
            fun administrativeArea(administrativeArea: String) =
                administrativeArea(JsonField.of(administrativeArea))

            /**
             * Sets [Builder.administrativeArea] to an arbitrary JSON value.
             *
             * You should usually call [Builder.administrativeArea] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun administrativeArea(administrativeArea: JsonField<String>) = apply {
                this.administrativeArea = administrativeArea
            }

            /**
             * Filter for phone numbers that have the features to satisfy your use case (e.g.,
             * ["voice"])
             */
            fun features(features: List<String>) = features(JsonField.of(features))

            /**
             * Sets [Builder.features] to an arbitrary JSON value.
             *
             * You should usually call [Builder.features] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun features(features: JsonField<List<String>>) = apply {
                this.features = features.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [features].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFeature(feature: String) = apply {
                features =
                    (features ?: JsonField.of(mutableListOf())).also {
                        checkKnown("features", it).add(feature)
                    }
            }

            /** Filter for phone numbers in a given city / region / rate center */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Filter by area code */
            fun nationalDestinationCode(nationalDestinationCode: String) =
                nationalDestinationCode(JsonField.of(nationalDestinationCode))

            /**
             * Sets [Builder.nationalDestinationCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nationalDestinationCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nationalDestinationCode(nationalDestinationCode: JsonField<String>) = apply {
                this.nationalDestinationCode = nationalDestinationCode
            }

            /** Phone number search criteria */
            fun phoneNumber(phoneNumber: PhoneNumber) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [PhoneNumber] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<PhoneNumber>) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * Ordering strategy. Define what action should be taken if we don't have enough phone
             * numbers to fulfill your request. Allowable values are: always = proceed with ordering
             * phone numbers, regardless of current inventory levels; never = do not place any
             * orders unless there are enough phone numbers to satisfy the request. If not
             * specified, the always strategy will be enforced.
             */
            fun strategy(strategy: Strategy) = strategy(JsonField.of(strategy))

            /**
             * Sets [Builder.strategy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.strategy] with a well-typed [Strategy] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun strategy(strategy: JsonField<Strategy>) = apply { this.strategy = strategy }

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
             * Returns an immutable instance of [OrderingGroup].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .countRequested()
             * .countryIso()
             * .phoneNumberType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OrderingGroup =
                OrderingGroup(
                    checkRequired("countRequested", countRequested),
                    checkRequired("countryIso", countryIso),
                    checkRequired("phoneNumberType", phoneNumberType),
                    administrativeArea,
                    (features ?: JsonMissing.of()).map { it.toImmutable() },
                    locality,
                    nationalDestinationCode,
                    phoneNumber,
                    strategy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OrderingGroup = apply {
            if (validated) {
                return@apply
            }

            countRequested()
            countryIso().validate()
            phoneNumberType()
            administrativeArea()
            features()
            locality()
            nationalDestinationCode()
            phoneNumber().ifPresent { it.validate() }
            strategy().ifPresent { it.validate() }
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
            (if (countRequested.asKnown().isPresent) 1 else 0) +
                (countryIso.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumberType.asKnown().isPresent) 1 else 0) +
                (if (administrativeArea.asKnown().isPresent) 1 else 0) +
                (features.asKnown().getOrNull()?.size ?: 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (nationalDestinationCode.asKnown().isPresent) 1 else 0) +
                (phoneNumber.asKnown().getOrNull()?.validity() ?: 0) +
                (strategy.asKnown().getOrNull()?.validity() ?: 0)

        /** Country where you would like to purchase phone numbers. Allowable values: US, CA */
        class CountryIso @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val US = of("US")

                @JvmField val CA = of("CA")

                @JvmStatic fun of(value: String) = CountryIso(JsonField.of(value))
            }

            /** An enum containing [CountryIso]'s known values. */
            enum class Known {
                US,
                CA,
            }

            /**
             * An enum containing [CountryIso]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CountryIso] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                US,
                CA,
                /**
                 * An enum member indicating that [CountryIso] was instantiated with an unknown
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
                    US -> Value.US
                    CA -> Value.CA
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
                    US -> Known.US
                    CA -> Known.CA
                    else -> throw TelnyxInvalidDataException("Unknown CountryIso: $value")
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

            fun validate(): CountryIso = apply {
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

                return other is CountryIso && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Phone number search criteria */
        class PhoneNumber
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val contains: JsonField<String>,
            private val endsWith: JsonField<String>,
            private val startsWith: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contains")
                @ExcludeMissing
                contains: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ends_with")
                @ExcludeMissing
                endsWith: JsonField<String> = JsonMissing.of(),
                @JsonProperty("starts_with")
                @ExcludeMissing
                startsWith: JsonField<String> = JsonMissing.of(),
            ) : this(contains, endsWith, startsWith, mutableMapOf())

            /**
             * Filter for phone numbers that contain the digits specified
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun contains(): Optional<String> = contains.getOptional("contains")

            /**
             * Filter by the ending digits of the phone number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endsWith(): Optional<String> = endsWith.getOptional("ends_with")

            /**
             * Filter by the starting digits of the phone number
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun startsWith(): Optional<String> = startsWith.getOptional("starts_with")

            /**
             * Returns the raw JSON value of [contains].
             *
             * Unlike [contains], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contains") @ExcludeMissing fun _contains(): JsonField<String> = contains

            /**
             * Returns the raw JSON value of [endsWith].
             *
             * Unlike [endsWith], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ends_with") @ExcludeMissing fun _endsWith(): JsonField<String> = endsWith

            /**
             * Returns the raw JSON value of [startsWith].
             *
             * Unlike [startsWith], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starts_with")
            @ExcludeMissing
            fun _startsWith(): JsonField<String> = startsWith

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

                private var contains: JsonField<String> = JsonMissing.of()
                private var endsWith: JsonField<String> = JsonMissing.of()
                private var startsWith: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(phoneNumber: PhoneNumber) = apply {
                    contains = phoneNumber.contains
                    endsWith = phoneNumber.endsWith
                    startsWith = phoneNumber.startsWith
                    additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                }

                /** Filter for phone numbers that contain the digits specified */
                fun contains(contains: String) = contains(JsonField.of(contains))

                /**
                 * Sets [Builder.contains] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contains] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contains(contains: JsonField<String>) = apply { this.contains = contains }

                /** Filter by the ending digits of the phone number */
                fun endsWith(endsWith: String) = endsWith(JsonField.of(endsWith))

                /**
                 * Sets [Builder.endsWith] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endsWith] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endsWith(endsWith: JsonField<String>) = apply { this.endsWith = endsWith }

                /** Filter by the starting digits of the phone number */
                fun startsWith(startsWith: String) = startsWith(JsonField.of(startsWith))

                /**
                 * Sets [Builder.startsWith] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startsWith] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun startsWith(startsWith: JsonField<String>) = apply {
                    this.startsWith = startsWith
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
                 * Returns an immutable instance of [PhoneNumber].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PhoneNumber =
                    PhoneNumber(contains, endsWith, startsWith, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): PhoneNumber = apply {
                if (validated) {
                    return@apply
                }

                contains()
                endsWith()
                startsWith()
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
                (if (contains.asKnown().isPresent) 1 else 0) +
                    (if (endsWith.asKnown().isPresent) 1 else 0) +
                    (if (startsWith.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PhoneNumber &&
                    contains == other.contains &&
                    endsWith == other.endsWith &&
                    startsWith == other.startsWith &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contains, endsWith, startsWith, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhoneNumber{contains=$contains, endsWith=$endsWith, startsWith=$startsWith, additionalProperties=$additionalProperties}"
        }

        /**
         * Ordering strategy. Define what action should be taken if we don't have enough phone
         * numbers to fulfill your request. Allowable values are: always = proceed with ordering
         * phone numbers, regardless of current inventory levels; never = do not place any orders
         * unless there are enough phone numbers to satisfy the request. If not specified, the
         * always strategy will be enforced.
         */
        class Strategy @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALWAYS,
                NEVER,
                /**
                 * An enum member indicating that [Strategy] was instantiated with an unknown value.
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
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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
                countRequested == other.countRequested &&
                countryIso == other.countryIso &&
                phoneNumberType == other.phoneNumberType &&
                administrativeArea == other.administrativeArea &&
                features == other.features &&
                locality == other.locality &&
                nationalDestinationCode == other.nationalDestinationCode &&
                phoneNumber == other.phoneNumber &&
                strategy == other.strategy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                countRequested,
                countryIso,
                phoneNumberType,
                administrativeArea,
                features,
                locality,
                nationalDestinationCode,
                phoneNumber,
                strategy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OrderingGroup{countRequested=$countRequested, countryIso=$countryIso, phoneNumberType=$phoneNumberType, administrativeArea=$administrativeArea, features=$features, locality=$locality, nationalDestinationCode=$nationalDestinationCode, phoneNumber=$phoneNumber, strategy=$strategy, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InexplicitNumberOrderCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InexplicitNumberOrderCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
