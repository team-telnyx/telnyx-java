// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.dir

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
 * Return the DIRs (Display Identity Records) belonging to a single enterprise. Pagination is
 * JSON:API style (`page[number]`, `page[size]`, max 250). Supports `filter[]` query params:
 * `filter[status]`, `filter[display_name][contains]`, `filter[call_reason][contains]`, plus the
 * renewal-window filters `filter[expiring_at][gte]` / `filter[expiring_at][lte]` and the
 * convenience `filter[expiring_within_days]` (mutually exclusive with the explicit gte/lte form).
 * Sortable by `created_at`, `updated_at`, `display_name`, `status`, `submitted_at`, `verified_at`,
 * `expiring_at` (prefix `-` for descending; default `-created_at`).
 */
class DirListParams
private constructor(
    private val enterpriseId: String?,
    private val filterCallReasonContains: String?,
    private val filterDisplayNameContains: String?,
    private val filterExpiringAtGte: OffsetDateTime?,
    private val filterExpiringAtLte: OffsetDateTime?,
    private val filterExpiringWithinDays: Long?,
    private val filterStatus: FilterStatus?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): Optional<String> = Optional.ofNullable(enterpriseId)

    /** Case-insensitive partial match on call reason. */
    fun filterCallReasonContains(): Optional<String> = Optional.ofNullable(filterCallReasonContains)

    /** Case-insensitive partial match on display name. */
    fun filterDisplayNameContains(): Optional<String> =
        Optional.ofNullable(filterDisplayNameContains)

    /** Return only DIRs whose `expiring_at` is at or after this ISO-8601 timestamp. */
    fun filterExpiringAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(filterExpiringAtGte)

    /** Return only DIRs whose `expiring_at` is at or before this ISO-8601 timestamp. */
    fun filterExpiringAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(filterExpiringAtLte)

    /**
     * Convenience: returns DIRs whose `expiring_at` falls within the next N days (1–365).
     * Equivalent to setting `filter[expiring_at][gte]=<now>` + `filter[expiring_at][lte]=<now+N>`.
     * Mutually exclusive with the explicit `[gte]`/`[lte]` filters — combining returns 400.
     */
    fun filterExpiringWithinDays(): Optional<Long> = Optional.ofNullable(filterExpiringWithinDays)

    /** Filter by DIR status. */
    fun filterStatus(): Optional<FilterStatus> = Optional.ofNullable(filterStatus)

    /** 1-based page number. Out-of-range values return an empty page with correct meta. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Items per page. Maximum 250; values above are clamped to 250. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Sort field. Allowed: `created_at`, `updated_at`, `display_name`, `status`, `submitted_at`,
     * `verified_at`, `expiring_at`. Prefix with `-` for descending. Default `-created_at`.
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

        private var enterpriseId: String? = null
        private var filterCallReasonContains: String? = null
        private var filterDisplayNameContains: String? = null
        private var filterExpiringAtGte: OffsetDateTime? = null
        private var filterExpiringAtLte: OffsetDateTime? = null
        private var filterExpiringWithinDays: Long? = null
        private var filterStatus: FilterStatus? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dirListParams: DirListParams) = apply {
            enterpriseId = dirListParams.enterpriseId
            filterCallReasonContains = dirListParams.filterCallReasonContains
            filterDisplayNameContains = dirListParams.filterDisplayNameContains
            filterExpiringAtGte = dirListParams.filterExpiringAtGte
            filterExpiringAtLte = dirListParams.filterExpiringAtLte
            filterExpiringWithinDays = dirListParams.filterExpiringWithinDays
            filterStatus = dirListParams.filterStatus
            pageNumber = dirListParams.pageNumber
            pageSize = dirListParams.pageSize
            sort = dirListParams.sort
            additionalHeaders = dirListParams.additionalHeaders.toBuilder()
            additionalQueryParams = dirListParams.additionalQueryParams.toBuilder()
        }

        fun enterpriseId(enterpriseId: String?) = apply { this.enterpriseId = enterpriseId }

        /** Alias for calling [Builder.enterpriseId] with `enterpriseId.orElse(null)`. */
        fun enterpriseId(enterpriseId: Optional<String>) = enterpriseId(enterpriseId.getOrNull())

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

        /** Return only DIRs whose `expiring_at` is at or after this ISO-8601 timestamp. */
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

        /**
         * Convenience: returns DIRs whose `expiring_at` falls within the next N days (1–365).
         * Equivalent to setting `filter[expiring_at][gte]=<now>` +
         * `filter[expiring_at][lte]=<now+N>`. Mutually exclusive with the explicit `[gte]`/`[lte]`
         * filters — combining returns 400.
         */
        fun filterExpiringWithinDays(filterExpiringWithinDays: Long?) = apply {
            this.filterExpiringWithinDays = filterExpiringWithinDays
        }

        /**
         * Alias for [Builder.filterExpiringWithinDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun filterExpiringWithinDays(filterExpiringWithinDays: Long) =
            filterExpiringWithinDays(filterExpiringWithinDays as Long?)

        /**
         * Alias for calling [Builder.filterExpiringWithinDays] with
         * `filterExpiringWithinDays.orElse(null)`.
         */
        fun filterExpiringWithinDays(filterExpiringWithinDays: Optional<Long>) =
            filterExpiringWithinDays(filterExpiringWithinDays.getOrNull())

        /** Filter by DIR status. */
        fun filterStatus(filterStatus: FilterStatus?) = apply { this.filterStatus = filterStatus }

        /** Alias for calling [Builder.filterStatus] with `filterStatus.orElse(null)`. */
        fun filterStatus(filterStatus: Optional<FilterStatus>) =
            filterStatus(filterStatus.getOrNull())

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
         * Sort field. Allowed: `created_at`, `updated_at`, `display_name`, `status`,
         * `submitted_at`, `verified_at`, `expiring_at`. Prefix with `-` for descending. Default
         * `-created_at`.
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
                enterpriseId,
                filterCallReasonContains,
                filterDisplayNameContains,
                filterExpiringAtGte,
                filterExpiringAtLte,
                filterExpiringWithinDays,
                filterStatus,
                pageNumber,
                pageSize,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> enterpriseId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterCallReasonContains?.let { put("filter[call_reason][contains]", it) }
                filterDisplayNameContains?.let { put("filter[display_name][contains]", it) }
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
                filterExpiringWithinDays?.let { put("filter[expiring_within_days]", it.toString()) }
                filterStatus?.let { put("filter[status]", it.toString()) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by DIR status. */
    class FilterStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val DRAFT = of("draft")

            @JvmField val SUBMITTED = of("submitted")

            @JvmField val IN_REVIEW = of("in_review")

            @JvmField val VERIFIED = of("verified")

            @JvmField val REJECTED = of("rejected")

            @JvmField val UNSUCCESSFUL = of("unsuccessful")

            @JvmField val SUSPENDED = of("suspended")

            @JvmField val EXPIRED = of("expired")

            @JvmField val INFRINGEMENT_CLAIMED = of("infringement_claimed")

            @JvmField val PERMANENTLY_REJECTED = of("permanently_rejected")

            @JvmStatic fun of(value: String) = FilterStatus(JsonField.of(value))
        }

        /** An enum containing [FilterStatus]'s known values. */
        enum class Known {
            DRAFT,
            SUBMITTED,
            IN_REVIEW,
            VERIFIED,
            REJECTED,
            UNSUCCESSFUL,
            SUSPENDED,
            EXPIRED,
            INFRINGEMENT_CLAIMED,
            PERMANENTLY_REJECTED,
        }

        /**
         * An enum containing [FilterStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            SUBMITTED,
            IN_REVIEW,
            VERIFIED,
            REJECTED,
            UNSUCCESSFUL,
            SUSPENDED,
            EXPIRED,
            INFRINGEMENT_CLAIMED,
            PERMANENTLY_REJECTED,
            /**
             * An enum member indicating that [FilterStatus] was instantiated with an unknown value.
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
                DRAFT -> Value.DRAFT
                SUBMITTED -> Value.SUBMITTED
                IN_REVIEW -> Value.IN_REVIEW
                VERIFIED -> Value.VERIFIED
                REJECTED -> Value.REJECTED
                UNSUCCESSFUL -> Value.UNSUCCESSFUL
                SUSPENDED -> Value.SUSPENDED
                EXPIRED -> Value.EXPIRED
                INFRINGEMENT_CLAIMED -> Value.INFRINGEMENT_CLAIMED
                PERMANENTLY_REJECTED -> Value.PERMANENTLY_REJECTED
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
                DRAFT -> Known.DRAFT
                SUBMITTED -> Known.SUBMITTED
                IN_REVIEW -> Known.IN_REVIEW
                VERIFIED -> Known.VERIFIED
                REJECTED -> Known.REJECTED
                UNSUCCESSFUL -> Known.UNSUCCESSFUL
                SUSPENDED -> Known.SUSPENDED
                EXPIRED -> Known.EXPIRED
                INFRINGEMENT_CLAIMED -> Known.INFRINGEMENT_CLAIMED
                PERMANENTLY_REJECTED -> Known.PERMANENTLY_REJECTED
                else -> throw TelnyxInvalidDataException("Unknown FilterStatus: $value")
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
        fun validate(): FilterStatus = apply {
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

            return other is FilterStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sort field. Allowed: `created_at`, `updated_at`, `display_name`, `status`, `submitted_at`,
     * `verified_at`, `expiring_at`. Prefix with `-` for descending. Default `-created_at`.
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

            @JvmField val SUBMITTED_AT = of("submitted_at")

            @JvmField val minus_SUBMITTED_AT = of("-submitted_at")

            @JvmField val VERIFIED_AT = of("verified_at")

            @JvmField val minus_VERIFIED_AT = of("-verified_at")

            @JvmField val EXPIRING_AT = of("expiring_at")

            @JvmField val minus_EXPIRING_AT = of("-expiring_at")

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
            SUBMITTED_AT,
            minus_SUBMITTED_AT,
            VERIFIED_AT,
            minus_VERIFIED_AT,
            EXPIRING_AT,
            minus_EXPIRING_AT,
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
            SUBMITTED_AT,
            minus_SUBMITTED_AT,
            VERIFIED_AT,
            minus_VERIFIED_AT,
            EXPIRING_AT,
            minus_EXPIRING_AT,
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
                SUBMITTED_AT -> Value.SUBMITTED_AT
                minus_SUBMITTED_AT -> Value.minus_SUBMITTED_AT
                VERIFIED_AT -> Value.VERIFIED_AT
                minus_VERIFIED_AT -> Value.minus_VERIFIED_AT
                EXPIRING_AT -> Value.EXPIRING_AT
                minus_EXPIRING_AT -> Value.minus_EXPIRING_AT
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
                SUBMITTED_AT -> Known.SUBMITTED_AT
                minus_SUBMITTED_AT -> Known.minus_SUBMITTED_AT
                VERIFIED_AT -> Known.VERIFIED_AT
                minus_VERIFIED_AT -> Known.minus_VERIFIED_AT
                EXPIRING_AT -> Known.EXPIRING_AT
                minus_EXPIRING_AT -> Known.minus_EXPIRING_AT
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
            enterpriseId == other.enterpriseId &&
            filterCallReasonContains == other.filterCallReasonContains &&
            filterDisplayNameContains == other.filterDisplayNameContains &&
            filterExpiringAtGte == other.filterExpiringAtGte &&
            filterExpiringAtLte == other.filterExpiringAtLte &&
            filterExpiringWithinDays == other.filterExpiringWithinDays &&
            filterStatus == other.filterStatus &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            enterpriseId,
            filterCallReasonContains,
            filterDisplayNameContains,
            filterExpiringAtGte,
            filterExpiringAtLte,
            filterExpiringWithinDays,
            filterStatus,
            pageNumber,
            pageSize,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DirListParams{enterpriseId=$enterpriseId, filterCallReasonContains=$filterCallReasonContains, filterDisplayNameContains=$filterDisplayNameContains, filterExpiringAtGte=$filterExpiringAtGte, filterExpiringAtLte=$filterExpiringAtLte, filterExpiringWithinDays=$filterExpiringWithinDays, filterStatus=$filterStatus, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
