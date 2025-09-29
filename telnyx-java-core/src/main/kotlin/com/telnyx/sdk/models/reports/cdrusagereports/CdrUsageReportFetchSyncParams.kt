// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports.cdrusagereports

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate and fetch voice usage report synchronously. This endpoint will both generate and fetch
 * the voice report over a specified time period. No polling is necessary but the response may take
 * up to a couple of minutes.
 */
class CdrUsageReportFetchSyncParams
private constructor(
    private val aggregationType: AggregationType,
    private val productBreakdown: ProductBreakdown,
    private val connections: List<Double>?,
    private val endDate: OffsetDateTime?,
    private val startDate: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun aggregationType(): AggregationType = aggregationType

    fun productBreakdown(): ProductBreakdown = productBreakdown

    fun connections(): Optional<List<Double>> = Optional.ofNullable(connections)

    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate)

    fun startDate(): Optional<OffsetDateTime> = Optional.ofNullable(startDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CdrUsageReportFetchSyncParams].
         *
         * The following fields are required:
         * ```java
         * .aggregationType()
         * .productBreakdown()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CdrUsageReportFetchSyncParams]. */
    class Builder internal constructor() {

        private var aggregationType: AggregationType? = null
        private var productBreakdown: ProductBreakdown? = null
        private var connections: MutableList<Double>? = null
        private var endDate: OffsetDateTime? = null
        private var startDate: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cdrUsageReportFetchSyncParams: CdrUsageReportFetchSyncParams) = apply {
            aggregationType = cdrUsageReportFetchSyncParams.aggregationType
            productBreakdown = cdrUsageReportFetchSyncParams.productBreakdown
            connections = cdrUsageReportFetchSyncParams.connections?.toMutableList()
            endDate = cdrUsageReportFetchSyncParams.endDate
            startDate = cdrUsageReportFetchSyncParams.startDate
            additionalHeaders = cdrUsageReportFetchSyncParams.additionalHeaders.toBuilder()
            additionalQueryParams = cdrUsageReportFetchSyncParams.additionalQueryParams.toBuilder()
        }

        fun aggregationType(aggregationType: AggregationType) = apply {
            this.aggregationType = aggregationType
        }

        fun productBreakdown(productBreakdown: ProductBreakdown) = apply {
            this.productBreakdown = productBreakdown
        }

        fun connections(connections: List<Double>?) = apply {
            this.connections = connections?.toMutableList()
        }

        /** Alias for calling [Builder.connections] with `connections.orElse(null)`. */
        fun connections(connections: Optional<List<Double>>) = connections(connections.getOrNull())

        /**
         * Adds a single [Double] to [connections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConnection(connection: Double) = apply {
            connections = (connections ?: mutableListOf()).apply { add(connection) }
        }

        fun endDate(endDate: OffsetDateTime?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

        fun startDate(startDate: OffsetDateTime?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<OffsetDateTime>) = startDate(startDate.getOrNull())

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
         * Returns an immutable instance of [CdrUsageReportFetchSyncParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aggregationType()
         * .productBreakdown()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CdrUsageReportFetchSyncParams =
            CdrUsageReportFetchSyncParams(
                checkRequired("aggregationType", aggregationType),
                checkRequired("productBreakdown", productBreakdown),
                connections?.toImmutable(),
                endDate,
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("aggregation_type", aggregationType.toString())
                put("product_breakdown", productBreakdown.toString())
                connections?.let { put("connections", it.joinToString(",") { it.toString() }) }
                endDate?.let { put("end_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                startDate?.let {
                    put("start_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    class AggregationType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NO_AGGREGATION = of("NO_AGGREGATION")

            @JvmField val CONNECTION = of("CONNECTION")

            @JvmField val TAG = of("TAG")

            @JvmField val BILLING_GROUP = of("BILLING_GROUP")

            @JvmStatic fun of(value: String) = AggregationType(JsonField.of(value))
        }

        /** An enum containing [AggregationType]'s known values. */
        enum class Known {
            NO_AGGREGATION,
            CONNECTION,
            TAG,
            BILLING_GROUP,
        }

        /**
         * An enum containing [AggregationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AggregationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NO_AGGREGATION,
            CONNECTION,
            TAG,
            BILLING_GROUP,
            /**
             * An enum member indicating that [AggregationType] was instantiated with an unknown
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
                NO_AGGREGATION -> Value.NO_AGGREGATION
                CONNECTION -> Value.CONNECTION
                TAG -> Value.TAG
                BILLING_GROUP -> Value.BILLING_GROUP
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
                NO_AGGREGATION -> Known.NO_AGGREGATION
                CONNECTION -> Known.CONNECTION
                TAG -> Known.TAG
                BILLING_GROUP -> Known.BILLING_GROUP
                else -> throw TelnyxInvalidDataException("Unknown AggregationType: $value")
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

        fun validate(): AggregationType = apply {
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

            return other is AggregationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ProductBreakdown @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NO_BREAKDOWN = of("NO_BREAKDOWN")

            @JvmField val DID_VS_TOLL_FREE = of("DID_VS_TOLL_FREE")

            @JvmField val COUNTRY = of("COUNTRY")

            @JvmField val DID_VS_TOLL_FREE_PER_COUNTRY = of("DID_VS_TOLL_FREE_PER_COUNTRY")

            @JvmStatic fun of(value: String) = ProductBreakdown(JsonField.of(value))
        }

        /** An enum containing [ProductBreakdown]'s known values. */
        enum class Known {
            NO_BREAKDOWN,
            DID_VS_TOLL_FREE,
            COUNTRY,
            DID_VS_TOLL_FREE_PER_COUNTRY,
        }

        /**
         * An enum containing [ProductBreakdown]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ProductBreakdown] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NO_BREAKDOWN,
            DID_VS_TOLL_FREE,
            COUNTRY,
            DID_VS_TOLL_FREE_PER_COUNTRY,
            /**
             * An enum member indicating that [ProductBreakdown] was instantiated with an unknown
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
                NO_BREAKDOWN -> Value.NO_BREAKDOWN
                DID_VS_TOLL_FREE -> Value.DID_VS_TOLL_FREE
                COUNTRY -> Value.COUNTRY
                DID_VS_TOLL_FREE_PER_COUNTRY -> Value.DID_VS_TOLL_FREE_PER_COUNTRY
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
                NO_BREAKDOWN -> Known.NO_BREAKDOWN
                DID_VS_TOLL_FREE -> Known.DID_VS_TOLL_FREE
                COUNTRY -> Known.COUNTRY
                DID_VS_TOLL_FREE_PER_COUNTRY -> Known.DID_VS_TOLL_FREE_PER_COUNTRY
                else -> throw TelnyxInvalidDataException("Unknown ProductBreakdown: $value")
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

        fun validate(): ProductBreakdown = apply {
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

            return other is ProductBreakdown && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CdrUsageReportFetchSyncParams &&
            aggregationType == other.aggregationType &&
            productBreakdown == other.productBreakdown &&
            connections == other.connections &&
            endDate == other.endDate &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            aggregationType,
            productBreakdown,
            connections,
            endDate,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CdrUsageReportFetchSyncParams{aggregationType=$aggregationType, productBreakdown=$productBreakdown, connections=$connections, endDate=$endDate, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
