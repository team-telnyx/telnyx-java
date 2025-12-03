// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get Telnyx usage data by product, broken out by the specified dimensions */
class UsageReportListParams
private constructor(
    private val dimensions: List<String>,
    private val metrics: List<String>,
    private val product: String,
    private val dateRange: String?,
    private val endDate: String?,
    private val filter: String?,
    private val format: Format?,
    private val managedAccounts: Boolean?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: List<String>?,
    private val startDate: String?,
    private val authorizationBearer: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Breakout by specified product dimensions */
    fun dimensions(): List<String> = dimensions

    /** Specified product usage values */
    fun metrics(): List<String> = metrics

    /** Telnyx product */
    fun product(): String = product

    /**
     * A more user-friendly way to specify the timespan you want to filter by. More options can be
     * found in the Telnyx API Reference docs.
     */
    fun dateRange(): Optional<String> = Optional.ofNullable(dateRange)

    /**
     * The end date for the time range you are interested in. The maximum time range is 31 days.
     * Format: YYYY-MM-DDTHH:mm:ssZ
     */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /** Filter records on dimensions */
    fun filter(): Optional<String> = Optional.ofNullable(filter)

    /**
     * Specify the response format (csv or json). JSON is returned by default, even if not
     * specified.
     */
    fun format(): Optional<Format> = Optional.ofNullable(format)

    /** Return the aggregations for all Managed Accounts under the user making the request. */
    fun managedAccounts(): Optional<Boolean> = Optional.ofNullable(managedAccounts)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Specifies the sort order for results */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /**
     * The start date for the time range you are interested in. The maximum time range is 31 days.
     * Format: YYYY-MM-DDTHH:mm:ssZ
     */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Authenticates the request with your Telnyx API V2 KEY */
    fun authorizationBearer(): Optional<String> = Optional.ofNullable(authorizationBearer)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageReportListParams].
         *
         * The following fields are required:
         * ```java
         * .dimensions()
         * .metrics()
         * .product()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageReportListParams]. */
    class Builder internal constructor() {

        private var dimensions: MutableList<String>? = null
        private var metrics: MutableList<String>? = null
        private var product: String? = null
        private var dateRange: String? = null
        private var endDate: String? = null
        private var filter: String? = null
        private var format: Format? = null
        private var managedAccounts: Boolean? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: MutableList<String>? = null
        private var startDate: String? = null
        private var authorizationBearer: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageReportListParams: UsageReportListParams) = apply {
            dimensions = usageReportListParams.dimensions.toMutableList()
            metrics = usageReportListParams.metrics.toMutableList()
            product = usageReportListParams.product
            dateRange = usageReportListParams.dateRange
            endDate = usageReportListParams.endDate
            filter = usageReportListParams.filter
            format = usageReportListParams.format
            managedAccounts = usageReportListParams.managedAccounts
            pageNumber = usageReportListParams.pageNumber
            pageSize = usageReportListParams.pageSize
            sort = usageReportListParams.sort?.toMutableList()
            startDate = usageReportListParams.startDate
            authorizationBearer = usageReportListParams.authorizationBearer
            additionalHeaders = usageReportListParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageReportListParams.additionalQueryParams.toBuilder()
        }

        /** Breakout by specified product dimensions */
        fun dimensions(dimensions: List<String>) = apply {
            this.dimensions = dimensions.toMutableList()
        }

        /**
         * Adds a single [String] to [dimensions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDimension(dimension: String) = apply {
            dimensions = (dimensions ?: mutableListOf()).apply { add(dimension) }
        }

        /** Specified product usage values */
        fun metrics(metrics: List<String>) = apply { this.metrics = metrics.toMutableList() }

        /**
         * Adds a single [String] to [metrics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetric(metric: String) = apply {
            metrics = (metrics ?: mutableListOf()).apply { add(metric) }
        }

        /** Telnyx product */
        fun product(product: String) = apply { this.product = product }

        /**
         * A more user-friendly way to specify the timespan you want to filter by. More options can
         * be found in the Telnyx API Reference docs.
         */
        fun dateRange(dateRange: String?) = apply { this.dateRange = dateRange }

        /** Alias for calling [Builder.dateRange] with `dateRange.orElse(null)`. */
        fun dateRange(dateRange: Optional<String>) = dateRange(dateRange.getOrNull())

        /**
         * The end date for the time range you are interested in. The maximum time range is 31 days.
         * Format: YYYY-MM-DDTHH:mm:ssZ
         */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /** Filter records on dimensions */
        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * Specify the response format (csv or json). JSON is returned by default, even if not
         * specified.
         */
        fun format(format: Format?) = apply { this.format = format }

        /** Alias for calling [Builder.format] with `format.orElse(null)`. */
        fun format(format: Optional<Format>) = format(format.getOrNull())

        /** Return the aggregations for all Managed Accounts under the user making the request. */
        fun managedAccounts(managedAccounts: Boolean?) = apply {
            this.managedAccounts = managedAccounts
        }

        /**
         * Alias for [Builder.managedAccounts].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun managedAccounts(managedAccounts: Boolean) = managedAccounts(managedAccounts as Boolean?)

        /** Alias for calling [Builder.managedAccounts] with `managedAccounts.orElse(null)`. */
        fun managedAccounts(managedAccounts: Optional<Boolean>) =
            managedAccounts(managedAccounts.getOrNull())

        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Specifies the sort order for results */
        fun sort(sort: List<String>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<String>>) = sort(sort.getOrNull())

        /**
         * Adds a single [String] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
        }

        /**
         * The start date for the time range you are interested in. The maximum time range is 31
         * days. Format: YYYY-MM-DDTHH:mm:ssZ
         */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /** Authenticates the request with your Telnyx API V2 KEY */
        fun authorizationBearer(authorizationBearer: String?) = apply {
            this.authorizationBearer = authorizationBearer
        }

        /**
         * Alias for calling [Builder.authorizationBearer] with `authorizationBearer.orElse(null)`.
         */
        fun authorizationBearer(authorizationBearer: Optional<String>) =
            authorizationBearer(authorizationBearer.getOrNull())

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
         * Returns an immutable instance of [UsageReportListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dimensions()
         * .metrics()
         * .product()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageReportListParams =
            UsageReportListParams(
                checkRequired("dimensions", dimensions).toImmutable(),
                checkRequired("metrics", metrics).toImmutable(),
                checkRequired("product", product),
                dateRange,
                endDate,
                filter,
                format,
                managedAccounts,
                pageNumber,
                pageSize,
                sort?.toImmutable(),
                startDate,
                authorizationBearer,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                authorizationBearer?.let { put("authorization_bearer", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("dimensions", dimensions.joinToString(","))
                put("metrics", metrics.joinToString(","))
                put("product", product)
                dateRange?.let { put("date_range", it) }
                endDate?.let { put("end_date", it) }
                filter?.let { put("filter", it) }
                format?.let { put("format", it.toString()) }
                managedAccounts?.let { put("managed_accounts", it.toString()) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.joinToString(",")) }
                startDate?.let { put("start_date", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Specify the response format (csv or json). JSON is returned by default, even if not
     * specified.
     */
    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CSV = of("csv")

            @JvmField val JSON = of("json")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            CSV,
            JSON,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CSV,
            JSON,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
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
                CSV -> Value.CSV
                JSON -> Value.JSON
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
                CSV -> Known.CSV
                JSON -> Known.JSON
                else -> throw TelnyxInvalidDataException("Unknown Format: $value")
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

        fun validate(): Format = apply {
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

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageReportListParams &&
            dimensions == other.dimensions &&
            metrics == other.metrics &&
            product == other.product &&
            dateRange == other.dateRange &&
            endDate == other.endDate &&
            filter == other.filter &&
            format == other.format &&
            managedAccounts == other.managedAccounts &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            startDate == other.startDate &&
            authorizationBearer == other.authorizationBearer &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            dimensions,
            metrics,
            product,
            dateRange,
            endDate,
            filter,
            format,
            managedAccounts,
            pageNumber,
            pageSize,
            sort,
            startDate,
            authorizationBearer,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "UsageReportListParams{dimensions=$dimensions, metrics=$metrics, product=$product, dateRange=$dateRange, endDate=$endDate, filter=$filter, format=$format, managedAccounts=$managedAccounts, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, startDate=$startDate, authorizationBearer=$authorizationBearer, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
