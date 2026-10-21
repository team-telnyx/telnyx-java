// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialmetrics

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns dials-per-second (DPS) metrics for your account's outbound dials made with the Call
 * Control `Dial` command and TeXML, as time buckets with dial counts, accepted and rejected dials,
 * average and peak DPS, and the DPS limit in force.
 *
 * The result has one record per region per bucket, ordered by `start_time` and then `region`,
 * newest first unless `sort=start_time`. Regions are never summed: the DPS limit is enforced per
 * region, so a cross-region total cannot be compared with it.
 *
 * Only buckets that saw dials are returned. Treat a missing bucket as zero dials.
 *
 * Only complete 5-second windows are counted, and a window is counted about 15 seconds after it
 * closes. The newest `granularity=second` record is therefore your live DPS, about 20 seconds old.
 * Request the last minute or two with `sort=-start_time`; the first record of each `region` is that
 * region's live rate (`page[limit]=1` would hide every region but one). If no recent record exists,
 * the live rate is zero.
 *
 * Results are cursor paginated. Follow `meta.next`, or pass `meta.cursors.after` as `page[after]`,
 * until `meta.next` is absent. No total count is returned.
 *
 * This endpoint is in development and can change before general availability.
 */
class DialMetricListParams
private constructor(
    private val endTime: OffsetDateTime,
    private val granularity: Granularity,
    private val startTime: OffsetDateTime,
    private val pageAfter: String?,
    private val pageLimit: Long?,
    private val sort: Sort?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Exclusive end of the range, ISO 8601. Must be after `start_time`. Buckets that start before
     * this time are returned.
     */
    fun endTime(): OffsetDateTime = endTime

    /**
     * Bucket size. `second` returns 5-second buckets (the finest resolution) and is kept for the
     * last 48 hours. `minute` and `hour` are kept for the last 30 days.
     */
    fun granularity(): Granularity = granularity

    /**
     * Inclusive start of the range, ISO 8601 (for example `2026-09-29T12:00:00.000Z`). Buckets that
     * start at or after this time are returned. Must not be older than the retention window of the
     * chosen `granularity`.
     */
    fun startTime(): OffsetDateTime = startTime

    /**
     * Opaque cursor from `meta.cursors.after` of the previous page. Do not parse or construct it. A
     * cursor that matches no records returns an empty page whose `meta.cursors.after` and
     * `meta.cursors.before` both echo the given cursor.
     */
    fun pageAfter(): Optional<String> = Optional.ofNullable(pageAfter)

    /** Maximum number of buckets per page. Values outside the range are clamped to 1-10,000. */
    fun pageLimit(): Optional<Long> = Optional.ofNullable(pageLimit)

    /**
     * Sort order of the buckets by `start_time`. `-start_time` (default) returns the newest first,
     * `start_time` the oldest first. `region` follows the same direction for buckets with the same
     * `start_time`. To read the live rate, use `granularity=second` and `sort=-start_time`, then
     * take the first record of each `region`.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DialMetricListParams].
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .granularity()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DialMetricListParams]. */
    class Builder internal constructor() {

        private var endTime: OffsetDateTime? = null
        private var granularity: Granularity? = null
        private var startTime: OffsetDateTime? = null
        private var pageAfter: String? = null
        private var pageLimit: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dialMetricListParams: DialMetricListParams) = apply {
            endTime = dialMetricListParams.endTime
            granularity = dialMetricListParams.granularity
            startTime = dialMetricListParams.startTime
            pageAfter = dialMetricListParams.pageAfter
            pageLimit = dialMetricListParams.pageLimit
            sort = dialMetricListParams.sort
            additionalHeaders = dialMetricListParams.additionalHeaders.toBuilder()
            additionalQueryParams = dialMetricListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Exclusive end of the range, ISO 8601. Must be after `start_time`. Buckets that start
         * before this time are returned.
         */
        fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

        /**
         * Bucket size. `second` returns 5-second buckets (the finest resolution) and is kept for
         * the last 48 hours. `minute` and `hour` are kept for the last 30 days.
         */
        fun granularity(granularity: Granularity) = apply { this.granularity = granularity }

        /**
         * Inclusive start of the range, ISO 8601 (for example `2026-09-29T12:00:00.000Z`). Buckets
         * that start at or after this time are returned. Must not be older than the retention
         * window of the chosen `granularity`.
         */
        fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

        /**
         * Opaque cursor from `meta.cursors.after` of the previous page. Do not parse or construct
         * it. A cursor that matches no records returns an empty page whose `meta.cursors.after` and
         * `meta.cursors.before` both echo the given cursor.
         */
        fun pageAfter(pageAfter: String?) = apply { this.pageAfter = pageAfter }

        /** Alias for calling [Builder.pageAfter] with `pageAfter.orElse(null)`. */
        fun pageAfter(pageAfter: Optional<String>) = pageAfter(pageAfter.getOrNull())

        /** Maximum number of buckets per page. Values outside the range are clamped to 1-10,000. */
        fun pageLimit(pageLimit: Long?) = apply { this.pageLimit = pageLimit }

        /**
         * Alias for [Builder.pageLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageLimit(pageLimit: Long) = pageLimit(pageLimit as Long?)

        /** Alias for calling [Builder.pageLimit] with `pageLimit.orElse(null)`. */
        fun pageLimit(pageLimit: Optional<Long>) = pageLimit(pageLimit.getOrNull())

        /**
         * Sort order of the buckets by `start_time`. `-start_time` (default) returns the newest
         * first, `start_time` the oldest first. `region` follows the same direction for buckets
         * with the same `start_time`. To read the live rate, use `granularity=second` and
         * `sort=-start_time`, then take the first record of each `region`.
         */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [DialMetricListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .granularity()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DialMetricListParams =
            DialMetricListParams(
                checkRequired("endTime", endTime),
                checkRequired("granularity", granularity),
                checkRequired("startTime", startTime),
                pageAfter,
                pageLimit,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("end_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(endTime))
                put("granularity", granularity.toString())
                put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startTime))
                pageAfter?.let { put("page[after]", it) }
                pageLimit?.let { put("page[limit]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Bucket size. `second` returns 5-second buckets (the finest resolution) and is kept for the
     * last 48 hours. `minute` and `hour` are kept for the last 30 days.
     */
    class Granularity @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SECOND = of("second")

            @JvmField val MINUTE = of("minute")

            @JvmField val HOUR = of("hour")

            @JvmStatic fun of(value: String) = Granularity(JsonField.of(value))
        }

        /** An enum containing [Granularity]'s known values. */
        enum class Known {
            SECOND,
            MINUTE,
            HOUR,
        }

        /**
         * An enum containing [Granularity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Granularity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SECOND,
            MINUTE,
            HOUR,
            /**
             * An enum member indicating that [Granularity] was instantiated with an unknown value.
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
                SECOND -> Value.SECOND
                MINUTE -> Value.MINUTE
                HOUR -> Value.HOUR
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
                SECOND -> Known.SECOND
                MINUTE -> Known.MINUTE
                HOUR -> Known.HOUR
                else -> throw TelnyxInvalidDataException("Unknown Granularity: $value")
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
        fun validate(): Granularity = apply {
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

            return other is Granularity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sort order of the buckets by `start_time`. `-start_time` (default) returns the newest first,
     * `start_time` the oldest first. `region` follows the same direction for buckets with the same
     * `start_time`. To read the live rate, use `granularity=second` and `sort=-start_time`, then
     * take the first record of each `region`.
     */
    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val minus_START_TIME = of("-start_time")

            @JvmField val START_TIME = of("start_time")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            minus_START_TIME,
            START_TIME,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            minus_START_TIME,
            START_TIME,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
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
                minus_START_TIME -> Value.minus_START_TIME
                START_TIME -> Value.START_TIME
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
                minus_START_TIME -> Known.minus_START_TIME
                START_TIME -> Known.START_TIME
                else -> throw TelnyxInvalidDataException("Unknown Sort: $value")
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
        fun validate(): Sort = apply {
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

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DialMetricListParams &&
            endTime == other.endTime &&
            granularity == other.granularity &&
            startTime == other.startTime &&
            pageAfter == other.pageAfter &&
            pageLimit == other.pageLimit &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endTime,
            granularity,
            startTime,
            pageAfter,
            pageLimit,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DialMetricListParams{endTime=$endTime, granularity=$granularity, startTime=$startTime, pageAfter=$pageAfter, pageLimit=$pageLimit, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
