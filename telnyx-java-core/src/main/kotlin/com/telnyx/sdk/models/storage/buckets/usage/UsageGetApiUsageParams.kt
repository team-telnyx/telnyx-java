// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.usage

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns the detail on API usage on a bucket of a particular time period, group by method
 * category.
 */
class UsageGetApiUsageParams
private constructor(
    private val bucketName: String?,
    private val filter: Filter,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun bucketName(): Optional<String> = Optional.ofNullable(bucketName)

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[start_time],
     * filter[end_time]
     */
    fun filter(): Filter = filter

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageGetApiUsageParams].
         *
         * The following fields are required:
         * ```java
         * .filter()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageGetApiUsageParams]. */
    class Builder internal constructor() {

        private var bucketName: String? = null
        private var filter: Filter? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageGetApiUsageParams: UsageGetApiUsageParams) = apply {
            bucketName = usageGetApiUsageParams.bucketName
            filter = usageGetApiUsageParams.filter
            additionalHeaders = usageGetApiUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageGetApiUsageParams.additionalQueryParams.toBuilder()
        }

        fun bucketName(bucketName: String?) = apply { this.bucketName = bucketName }

        /** Alias for calling [Builder.bucketName] with `bucketName.orElse(null)`. */
        fun bucketName(bucketName: Optional<String>) = bucketName(bucketName.getOrNull())

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[start_time],
         * filter[end_time]
         */
        fun filter(filter: Filter) = apply { this.filter = filter }

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
         * Returns an immutable instance of [UsageGetApiUsageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filter()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageGetApiUsageParams =
            UsageGetApiUsageParams(
                bucketName,
                checkRequired("filter", filter),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> bucketName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put(
                    "filter[end_time]",
                    DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(filter.endTime()),
                )
                put(
                    "filter[start_time]",
                    DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(filter.startTime()),
                )
                filter._additionalProperties().keys().forEach { key ->
                    filter._additionalProperties().values(key).forEach { value ->
                        put("filter[$key]", value)
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[start_time],
     * filter[end_time]
     */
    class Filter
    private constructor(
        private val endTime: OffsetDateTime,
        private val startTime: OffsetDateTime,
        private val additionalProperties: QueryParams,
    ) {

        /** The end time of the period to filter the usage (ISO microsecond format) */
        fun endTime(): OffsetDateTime = endTime

        /** The start time of the period to filter the usage (ISO microsecond format) */
        fun startTime(): OffsetDateTime = startTime

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Filter].
             *
             * The following fields are required:
             * ```java
             * .endTime()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var endTime: OffsetDateTime? = null
            private var startTime: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                endTime = filter.endTime
                startTime = filter.startTime
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** The end time of the period to filter the usage (ISO microsecond format) */
            fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

            /** The start time of the period to filter the usage (ISO microsecond format) */
            fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endTime()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Filter =
                Filter(
                    checkRequired("endTime", endTime),
                    checkRequired("startTime", startTime),
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                endTime == other.endTime &&
                startTime == other.startTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(endTime, startTime, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{endTime=$endTime, startTime=$startTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageGetApiUsageParams &&
            bucketName == other.bucketName &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(bucketName, filter, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UsageGetApiUsageParams{bucketName=$bucketName, filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
