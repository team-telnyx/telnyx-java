// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.reports.mdrusagereports

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate and fetch messaging usage report synchronously. This endpoint will both generate and
 * fetch the messaging report over a specified time period. No polling is necessary but the response
 * may take up to a couple of minutes.
 */
class MdrUsageReportFetchSyncParams
private constructor(
    private val aggregationType: AggregationType,
    private val endDate: OffsetDateTime?,
    private val profiles: List<String>?,
    private val startDate: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun aggregationType(): AggregationType = aggregationType

    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate)

    fun profiles(): Optional<List<String>> = Optional.ofNullable(profiles)

    fun startDate(): Optional<OffsetDateTime> = Optional.ofNullable(startDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MdrUsageReportFetchSyncParams].
         *
         * The following fields are required:
         * ```java
         * .aggregationType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MdrUsageReportFetchSyncParams]. */
    class Builder internal constructor() {

        private var aggregationType: AggregationType? = null
        private var endDate: OffsetDateTime? = null
        private var profiles: MutableList<String>? = null
        private var startDate: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mdrUsageReportFetchSyncParams: MdrUsageReportFetchSyncParams) = apply {
            aggregationType = mdrUsageReportFetchSyncParams.aggregationType
            endDate = mdrUsageReportFetchSyncParams.endDate
            profiles = mdrUsageReportFetchSyncParams.profiles?.toMutableList()
            startDate = mdrUsageReportFetchSyncParams.startDate
            additionalHeaders = mdrUsageReportFetchSyncParams.additionalHeaders.toBuilder()
            additionalQueryParams = mdrUsageReportFetchSyncParams.additionalQueryParams.toBuilder()
        }

        fun aggregationType(aggregationType: AggregationType) = apply {
            this.aggregationType = aggregationType
        }

        fun endDate(endDate: OffsetDateTime?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

        fun profiles(profiles: List<String>?) = apply { this.profiles = profiles?.toMutableList() }

        /** Alias for calling [Builder.profiles] with `profiles.orElse(null)`. */
        fun profiles(profiles: Optional<List<String>>) = profiles(profiles.getOrNull())

        /**
         * Adds a single [String] to [profiles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProfile(profile: String) = apply {
            profiles = (profiles ?: mutableListOf()).apply { add(profile) }
        }

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
         * Returns an immutable instance of [MdrUsageReportFetchSyncParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aggregationType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MdrUsageReportFetchSyncParams =
            MdrUsageReportFetchSyncParams(
                checkRequired("aggregationType", aggregationType),
                endDate,
                profiles?.toImmutable(),
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
                endDate?.let { put("end_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                profiles?.let { put("profiles", it.joinToString(",")) }
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

            @JvmField val PROFILE = of("PROFILE")

            @JvmField val TAGS = of("TAGS")

            @JvmStatic fun of(value: String) = AggregationType(JsonField.of(value))
        }

        /** An enum containing [AggregationType]'s known values. */
        enum class Known {
            NO_AGGREGATION,
            PROFILE,
            TAGS,
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
            PROFILE,
            TAGS,
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
                PROFILE -> Value.PROFILE
                TAGS -> Value.TAGS
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
                PROFILE -> Known.PROFILE
                TAGS -> Known.TAGS
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MdrUsageReportFetchSyncParams &&
            aggregationType == other.aggregationType &&
            endDate == other.endDate &&
            profiles == other.profiles &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            aggregationType,
            endDate,
            profiles,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MdrUsageReportFetchSyncParams{aggregationType=$aggregationType, endDate=$endDate, profiles=$profiles, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
