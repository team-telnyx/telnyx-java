// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberordersreport

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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a CSV report for sub number orders. The report will be generated asynchronously and can be
 * downloaded once complete.
 */
class SubNumberOrdersReportCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filter by country code
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = body.countryCode()

    /**
     * Filter for orders created after this date
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAtGt(): Optional<OffsetDateTime> = body.createdAtGt()

    /**
     * Filter for orders created before this date
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAtLt(): Optional<OffsetDateTime> = body.createdAtLt()

    /**
     * Filter by customer reference
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * Filter by specific order request ID
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderRequestId(): Optional<String> = body.orderRequestId()

    /**
     * Filter by order status
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = body.status()

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _countryCode(): JsonField<String> = body._countryCode()

    /**
     * Returns the raw JSON value of [createdAtGt].
     *
     * Unlike [createdAtGt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAtGt(): JsonField<OffsetDateTime> = body._createdAtGt()

    /**
     * Returns the raw JSON value of [createdAtLt].
     *
     * Unlike [createdAtLt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAtLt(): JsonField<OffsetDateTime> = body._createdAtLt()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = body._customerReference()

    /**
     * Returns the raw JSON value of [orderRequestId].
     *
     * Unlike [orderRequestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orderRequestId(): JsonField<String> = body._orderRequestId()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubNumberOrdersReportCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubNumberOrdersReportCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubNumberOrdersReportCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subNumberOrdersReportCreateParams: SubNumberOrdersReportCreateParams) =
            apply {
                body = subNumberOrdersReportCreateParams.body.toBuilder()
                additionalHeaders = subNumberOrdersReportCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    subNumberOrdersReportCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [countryCode]
         * - [createdAtGt]
         * - [createdAtLt]
         * - [customerReference]
         * - [orderRequestId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Filter by country code */
        fun countryCode(countryCode: String) = apply { body.countryCode(countryCode) }

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { body.countryCode(countryCode) }

        /** Filter for orders created after this date */
        fun createdAtGt(createdAtGt: OffsetDateTime) = apply { body.createdAtGt(createdAtGt) }

        /**
         * Sets [Builder.createdAtGt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAtGt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAtGt(createdAtGt: JsonField<OffsetDateTime>) = apply {
            body.createdAtGt(createdAtGt)
        }

        /** Filter for orders created before this date */
        fun createdAtLt(createdAtLt: OffsetDateTime) = apply { body.createdAtLt(createdAtLt) }

        /**
         * Sets [Builder.createdAtLt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAtLt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAtLt(createdAtLt: JsonField<OffsetDateTime>) = apply {
            body.createdAtLt(createdAtLt)
        }

        /** Filter by customer reference */
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

        /** Filter by specific order request ID */
        fun orderRequestId(orderRequestId: String) = apply { body.orderRequestId(orderRequestId) }

        /**
         * Sets [Builder.orderRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun orderRequestId(orderRequestId: JsonField<String>) = apply {
            body.orderRequestId(orderRequestId)
        }

        /** Filter by order status */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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
         * Returns an immutable instance of [SubNumberOrdersReportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubNumberOrdersReportCreateParams =
            SubNumberOrdersReportCreateParams(
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
        private val countryCode: JsonField<String>,
        private val createdAtGt: JsonField<OffsetDateTime>,
        private val createdAtLt: JsonField<OffsetDateTime>,
        private val customerReference: JsonField<String>,
        private val orderRequestId: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at_gt")
            @ExcludeMissing
            createdAtGt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_at_lt")
            @ExcludeMissing
            createdAtLt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order_request_id")
            @ExcludeMissing
            orderRequestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(
            countryCode,
            createdAtGt,
            createdAtLt,
            customerReference,
            orderRequestId,
            status,
            mutableMapOf(),
        )

        /**
         * Filter by country code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

        /**
         * Filter for orders created after this date
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAtGt(): Optional<OffsetDateTime> = createdAtGt.getOptional("created_at_gt")

        /**
         * Filter for orders created before this date
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAtLt(): Optional<OffsetDateTime> = createdAtLt.getOptional("created_at_lt")

        /**
         * Filter by customer reference
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * Filter by specific order request ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun orderRequestId(): Optional<String> = orderRequestId.getOptional("order_request_id")

        /**
         * Filter by order status
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [createdAtGt].
         *
         * Unlike [createdAtGt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at_gt")
        @ExcludeMissing
        fun _createdAtGt(): JsonField<OffsetDateTime> = createdAtGt

        /**
         * Returns the raw JSON value of [createdAtLt].
         *
         * Unlike [createdAtLt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at_lt")
        @ExcludeMissing
        fun _createdAtLt(): JsonField<OffsetDateTime> = createdAtLt

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
         * Returns the raw JSON value of [orderRequestId].
         *
         * Unlike [orderRequestId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("order_request_id")
        @ExcludeMissing
        fun _orderRequestId(): JsonField<String> = orderRequestId

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var countryCode: JsonField<String> = JsonMissing.of()
            private var createdAtGt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAtLt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var orderRequestId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                countryCode = body.countryCode
                createdAtGt = body.createdAtGt
                createdAtLt = body.createdAtLt
                customerReference = body.customerReference
                orderRequestId = body.orderRequestId
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Filter by country code */
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

            /** Filter for orders created after this date */
            fun createdAtGt(createdAtGt: OffsetDateTime) = createdAtGt(JsonField.of(createdAtGt))

            /**
             * Sets [Builder.createdAtGt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAtGt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createdAtGt(createdAtGt: JsonField<OffsetDateTime>) = apply {
                this.createdAtGt = createdAtGt
            }

            /** Filter for orders created before this date */
            fun createdAtLt(createdAtLt: OffsetDateTime) = createdAtLt(JsonField.of(createdAtLt))

            /**
             * Sets [Builder.createdAtLt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAtLt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createdAtLt(createdAtLt: JsonField<OffsetDateTime>) = apply {
                this.createdAtLt = createdAtLt
            }

            /** Filter by customer reference */
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

            /** Filter by specific order request ID */
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

            /** Filter by order status */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             */
            fun build(): Body =
                Body(
                    countryCode,
                    createdAtGt,
                    createdAtLt,
                    customerReference,
                    orderRequestId,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            countryCode()
            createdAtGt()
            createdAtLt()
            customerReference()
            orderRequestId()
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
            (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (createdAtGt.asKnown().isPresent) 1 else 0) +
                (if (createdAtLt.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (orderRequestId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                countryCode == other.countryCode &&
                createdAtGt == other.createdAtGt &&
                createdAtLt == other.createdAtLt &&
                customerReference == other.customerReference &&
                orderRequestId == other.orderRequestId &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                countryCode,
                createdAtGt,
                createdAtLt,
                customerReference,
                orderRequestId,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{countryCode=$countryCode, createdAtGt=$createdAtGt, createdAtLt=$createdAtLt, customerReference=$customerReference, orderRequestId=$orderRequestId, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Filter by order status */
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

        return other is SubNumberOrdersReportCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubNumberOrdersReportCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
