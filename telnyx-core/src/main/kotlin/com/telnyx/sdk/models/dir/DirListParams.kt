// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns every DIR (Display Identity Record) you own, across all of your enterprises, as a single
 * list. Pagination is JSON:API style (`page[number]`, `page[size]`, max 250). Supports `filter[]`
 * query params: `filter[enterprise_id]`, `filter[status]`, `filter[display_name][contains]`,
 * `filter[call_reason][contains]`, plus the renewal-window filters `filter[expiring_at][gte]` /
 * `filter[expiring_at][lte]`. Sortable by `created_at`, `updated_at`, `display_name`, `status`
 * (prefix `-` for descending; default `-created_at`).
 */
class DirListParams
private constructor(
    private val filterCallReasonContains: String?,
    private val filterDisplayNameContains: String?,
    private val filterEnterpriseId: String?,
    private val filterExpiringAtGte: OffsetDateTime?,
    private val filterExpiringAtLte: OffsetDateTime?,
    private val filterStatus: DirStatus?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Case-insensitive partial match on call reason. */
    fun filterCallReasonContains(): Optional<String> = Optional.ofNullable(filterCallReasonContains)

    /** Case-insensitive partial match on display name. */
    fun filterDisplayNameContains(): Optional<String> =
        Optional.ofNullable(filterDisplayNameContains)

    /** Filter by enterprise ID. */
    fun filterEnterpriseId(): Optional<String> = Optional.ofNullable(filterEnterpriseId)

    /**
     * Return only DIRs whose `expiring_at` is at or after this ISO-8601 timestamp. Pairs with the
     * `[lte]` variant to build renewal-window dashboards.
     */
    fun filterExpiringAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(filterExpiringAtGte)

    /** Return only DIRs whose `expiring_at` is at or before this ISO-8601 timestamp. */
    fun filterExpiringAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(filterExpiringAtLte)

    /** Filter by DIR status. */
    fun filterStatus(): Optional<DirStatus> = Optional.ofNullable(filterStatus)

    /** 1-based page number. Out-of-range values return an empty page with correct meta. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Items per page. Maximum 250; values above are clamped to 250. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Sort field. Allowed values: `created_at`, `updated_at`, `display_name`, `status`. Prefix with
     * `-` for descending. Default `-created_at`.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DirListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DirListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirListParams]. */
    class Builder internal constructor() {

        private var filterCallReasonContains: String? = null
        private var filterDisplayNameContains: String? = null
        private var filterEnterpriseId: String? = null
        private var filterExpiringAtGte: OffsetDateTime? = null
        private var filterExpiringAtLte: OffsetDateTime? = null
        private var filterStatus: DirStatus? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dirListParams: DirListParams) = apply {
            filterCallReasonContains = dirListParams.filterCallReasonContains
            filterDisplayNameContains = dirListParams.filterDisplayNameContains
            filterEnterpriseId = dirListParams.filterEnterpriseId
            filterExpiringAtGte = dirListParams.filterExpiringAtGte
            filterExpiringAtLte = dirListParams.filterExpiringAtLte
            filterStatus = dirListParams.filterStatus
            pageNumber = dirListParams.pageNumber
            pageSize = dirListParams.pageSize
            sort = dirListParams.sort
            additionalHeaders = dirListParams.additionalHeaders.toBuilder()
            additionalQueryParams = dirListParams.additionalQueryParams.toBuilder()
        }

        /** Case-insensitive partial match on call reason. */
        fun filterCallReasonContains(filterCallReasonContains: String?) = apply {
            this.filterCallReasonContains = filterCallReasonContains
        }

        /**
         * Alias for calling [Builder.filterCallReasonContains] with
         * `filterCallReasonContains.orElse(null)`.
         */
        fun filterCallReasonContains(filterCallReasonContains: Optional<String>) =
            filterCallReasonContains(filterCallReasonContains.getOrNull())

        /** Case-insensitive partial match on display name. */
        fun filterDisplayNameContains(filterDisplayNameContains: String?) = apply {
            this.filterDisplayNameContains = filterDisplayNameContains
        }

        /**
         * Alias for calling [Builder.filterDisplayNameContains] with
         * `filterDisplayNameContains.orElse(null)`.
         */
        fun filterDisplayNameContains(filterDisplayNameContains: Optional<String>) =
            filterDisplayNameContains(filterDisplayNameContains.getOrNull())

        /** Filter by enterprise ID. */
        fun filterEnterpriseId(filterEnterpriseId: String?) = apply {
            this.filterEnterpriseId = filterEnterpriseId
        }

        /**
         * Alias for calling [Builder.filterEnterpriseId] with `filterEnterpriseId.orElse(null)`.
         */
        fun filterEnterpriseId(filterEnterpriseId: Optional<String>) =
            filterEnterpriseId(filterEnterpriseId.getOrNull())

        /**
         * Return only DIRs whose `expiring_at` is at or after this ISO-8601 timestamp. Pairs with
         * the `[lte]` variant to build renewal-window dashboards.
         */
        fun filterExpiringAtGte(filterExpiringAtGte: OffsetDateTime?) = apply {
            this.filterExpiringAtGte = filterExpiringAtGte
        }

        /**
         * Alias for calling [Builder.filterExpiringAtGte] with `filterExpiringAtGte.orElse(null)`.
         */
        fun filterExpiringAtGte(filterExpiringAtGte: Optional<OffsetDateTime>) =
            filterExpiringAtGte(filterExpiringAtGte.getOrNull())

        /** Return only DIRs whose `expiring_at` is at or before this ISO-8601 timestamp. */
        fun filterExpiringAtLte(filterExpiringAtLte: OffsetDateTime?) = apply {
            this.filterExpiringAtLte = filterExpiringAtLte
        }

        /**
         * Alias for calling [Builder.filterExpiringAtLte] with `filterExpiringAtLte.orElse(null)`.
         */
        fun filterExpiringAtLte(filterExpiringAtLte: Optional<OffsetDateTime>) =
            filterExpiringAtLte(filterExpiringAtLte.getOrNull())

        /** Filter by DIR status. */
        fun filterStatus(filterStatus: DirStatus?) = apply { this.filterStatus = filterStatus }

        /** Alias for calling [Builder.filterStatus] with `filterStatus.orElse(null)`. */
        fun filterStatus(filterStatus: Optional<DirStatus>) = filterStatus(filterStatus.getOrNull())

        /** 1-based page number. Out-of-range values return an empty page with correct meta. */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** Items per page. Maximum 250; values above are clamped to 250. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Sort field. Allowed values: `created_at`, `updated_at`, `display_name`, `status`. Prefix
         * with `-` for descending. Default `-created_at`.
         */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

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
         * Returns an immutable instance of [DirListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DirListParams =
            DirListParams(
                filterCallReasonContains,
                filterDisplayNameContains,
                filterEnterpriseId,
                filterExpiringAtGte,
                filterExpiringAtLte,
                filterStatus,
                pageNumber,
                pageSize,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterCallReasonContains?.let { put("filter[call_reason][contains]", it) }
                filterDisplayNameContains?.let { put("filter[display_name][contains]", it) }
                filterEnterpriseId?.let { put("filter[enterprise_id]", it) }
                filterExpiringAtGte?.let {
                    put(
                        "filter[expiring_at][gte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterExpiringAtLte?.let {
                    put(
                        "filter[expiring_at][lte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterStatus?.let { put("filter[status]", it.toString()) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Sort field. Allowed values: `created_at`, `updated_at`, `display_name`, `status`. Prefix with
     * `-` for descending. Default `-created_at`.
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

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val CREATED_AT_DESC = of("-created_at")

            @JvmField val UPDATED_AT = of("updated_at")

            @JvmField val UPDATED_AT_DESC = of("-updated_at")

            @JvmField val DISPLAY_NAME = of("display_name")

            @JvmField val minus_DISPLAY_NAME = of("-display_name")

            @JvmField val STATUS = of("status")

            @JvmField val STATUS_DESC = of("-status")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CREATED_AT,
            CREATED_AT_DESC,
            UPDATED_AT,
            UPDATED_AT_DESC,
            DISPLAY_NAME,
            minus_DISPLAY_NAME,
            STATUS,
            STATUS_DESC,
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
            CREATED_AT,
            CREATED_AT_DESC,
            UPDATED_AT,
            UPDATED_AT_DESC,
            DISPLAY_NAME,
            minus_DISPLAY_NAME,
            STATUS,
            STATUS_DESC,
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
                CREATED_AT -> Value.CREATED_AT
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
                UPDATED_AT -> Value.UPDATED_AT
                UPDATED_AT_DESC -> Value.UPDATED_AT_DESC
                DISPLAY_NAME -> Value.DISPLAY_NAME
                minus_DISPLAY_NAME -> Value.minus_DISPLAY_NAME
                STATUS -> Value.STATUS
                STATUS_DESC -> Value.STATUS_DESC
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
                CREATED_AT -> Known.CREATED_AT
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
                UPDATED_AT -> Known.UPDATED_AT
                UPDATED_AT_DESC -> Known.UPDATED_AT_DESC
                DISPLAY_NAME -> Known.DISPLAY_NAME
                minus_DISPLAY_NAME -> Known.minus_DISPLAY_NAME
                STATUS -> Known.STATUS
                STATUS_DESC -> Known.STATUS_DESC
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

        return other is DirListParams &&
            filterCallReasonContains == other.filterCallReasonContains &&
            filterDisplayNameContains == other.filterDisplayNameContains &&
            filterEnterpriseId == other.filterEnterpriseId &&
            filterExpiringAtGte == other.filterExpiringAtGte &&
            filterExpiringAtLte == other.filterExpiringAtLte &&
            filterStatus == other.filterStatus &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterCallReasonContains,
            filterDisplayNameContains,
            filterEnterpriseId,
            filterExpiringAtGte,
            filterExpiringAtLte,
            filterStatus,
            pageNumber,
            pageSize,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DirListParams{filterCallReasonContains=$filterCallReasonContains, filterDisplayNameContains=$filterDisplayNameContains, filterEnterpriseId=$filterEnterpriseId, filterExpiringAtGte=$filterExpiringAtGte, filterExpiringAtLte=$filterExpiringAtLte, filterStatus=$filterStatus, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
