// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists the CloudFS filesystems for the authenticated user's organization. Results use cursor-based
 * pagination: fetch the next page by passing `meta.cursors.after` as `page[after]`, or follow the
 * `meta.next` URL.
 */
class CloudfListParams
private constructor(
    private val filterName: String?,
    private val filterRegion: String?,
    private val filterStatus: FilterStatus?,
    private val pageAfter: String?,
    private val pageBefore: String?,
    private val pageLimit: Long?,
    private val sort: Sort?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return only the filesystem whose name matches exactly. */
    fun filterName(): Optional<String> = Optional.ofNullable(filterName)

    /** Return only filesystems in this region. */
    fun filterRegion(): Optional<String> = Optional.ofNullable(filterRegion)

    /** Return only filesystems with this status. Unrecognized values are ignored. */
    fun filterStatus(): Optional<FilterStatus> = Optional.ofNullable(filterStatus)

    /**
     * Opaque cursor from a previous response's `meta.cursors.after`; returns the page after it.
     * Mutually exclusive with `page[before]`.
     */
    fun pageAfter(): Optional<String> = Optional.ofNullable(pageAfter)

    /**
     * Opaque cursor from a previous response's `meta.cursors.before`; returns the page before it.
     * Mutually exclusive with `page[after]`.
     */
    fun pageBefore(): Optional<String> = Optional.ofNullable(pageBefore)

    /** The number of filesystems to return per page. Values above 250 are treated as 250. */
    fun pageLimit(): Optional<Long> = Optional.ofNullable(pageLimit)

    /**
     * Sort order for the results: a field name for ascending, or the field name prefixed with `-`
     * for descending.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CloudfListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CloudfListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudfListParams]. */
    class Builder internal constructor() {

        private var filterName: String? = null
        private var filterRegion: String? = null
        private var filterStatus: FilterStatus? = null
        private var pageAfter: String? = null
        private var pageBefore: String? = null
        private var pageLimit: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cloudfListParams: CloudfListParams) = apply {
            filterName = cloudfListParams.filterName
            filterRegion = cloudfListParams.filterRegion
            filterStatus = cloudfListParams.filterStatus
            pageAfter = cloudfListParams.pageAfter
            pageBefore = cloudfListParams.pageBefore
            pageLimit = cloudfListParams.pageLimit
            sort = cloudfListParams.sort
            additionalHeaders = cloudfListParams.additionalHeaders.toBuilder()
            additionalQueryParams = cloudfListParams.additionalQueryParams.toBuilder()
        }

        /** Return only the filesystem whose name matches exactly. */
        fun filterName(filterName: String?) = apply { this.filterName = filterName }

        /** Alias for calling [Builder.filterName] with `filterName.orElse(null)`. */
        fun filterName(filterName: Optional<String>) = filterName(filterName.getOrNull())

        /** Return only filesystems in this region. */
        fun filterRegion(filterRegion: String?) = apply { this.filterRegion = filterRegion }

        /** Alias for calling [Builder.filterRegion] with `filterRegion.orElse(null)`. */
        fun filterRegion(filterRegion: Optional<String>) = filterRegion(filterRegion.getOrNull())

        /** Return only filesystems with this status. Unrecognized values are ignored. */
        fun filterStatus(filterStatus: FilterStatus?) = apply { this.filterStatus = filterStatus }

        /** Alias for calling [Builder.filterStatus] with `filterStatus.orElse(null)`. */
        fun filterStatus(filterStatus: Optional<FilterStatus>) =
            filterStatus(filterStatus.getOrNull())

        /**
         * Opaque cursor from a previous response's `meta.cursors.after`; returns the page after it.
         * Mutually exclusive with `page[before]`.
         */
        fun pageAfter(pageAfter: String?) = apply { this.pageAfter = pageAfter }

        /** Alias for calling [Builder.pageAfter] with `pageAfter.orElse(null)`. */
        fun pageAfter(pageAfter: Optional<String>) = pageAfter(pageAfter.getOrNull())

        /**
         * Opaque cursor from a previous response's `meta.cursors.before`; returns the page before
         * it. Mutually exclusive with `page[after]`.
         */
        fun pageBefore(pageBefore: String?) = apply { this.pageBefore = pageBefore }

        /** Alias for calling [Builder.pageBefore] with `pageBefore.orElse(null)`. */
        fun pageBefore(pageBefore: Optional<String>) = pageBefore(pageBefore.getOrNull())

        /** The number of filesystems to return per page. Values above 250 are treated as 250. */
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
         * Sort order for the results: a field name for ascending, or the field name prefixed with
         * `-` for descending.
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
         * Returns an immutable instance of [CloudfListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CloudfListParams =
            CloudfListParams(
                filterName,
                filterRegion,
                filterStatus,
                pageAfter,
                pageBefore,
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
                filterName?.let { put("filter[name]", it) }
                filterRegion?.let { put("filter[region]", it) }
                filterStatus?.let { put("filter[status]", it.toString()) }
                pageAfter?.let { put("page[after]", it) }
                pageBefore?.let { put("page[before]", it) }
                pageLimit?.let { put("page[limit]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Return only filesystems with this status. Unrecognized values are ignored. */
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

            @JvmField val PROVISIONING = of("provisioning")

            @JvmField val READY = of("ready")

            @JvmField val NEEDS_FORMAT = of("needs_format")

            @JvmField val DELETING = of("deleting")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = FilterStatus(JsonField.of(value))
        }

        /** An enum containing [FilterStatus]'s known values. */
        enum class Known {
            PROVISIONING,
            READY,
            NEEDS_FORMAT,
            DELETING,
            FAILED,
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
            PROVISIONING,
            READY,
            NEEDS_FORMAT,
            DELETING,
            FAILED,
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
                PROVISIONING -> Value.PROVISIONING
                READY -> Value.READY
                NEEDS_FORMAT -> Value.NEEDS_FORMAT
                DELETING -> Value.DELETING
                FAILED -> Value.FAILED
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
                PROVISIONING -> Known.PROVISIONING
                READY -> Known.READY
                NEEDS_FORMAT -> Known.NEEDS_FORMAT
                DELETING -> Known.DELETING
                FAILED -> Known.FAILED
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
     * Sort order for the results: a field name for ascending, or the field name prefixed with `-`
     * for descending.
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

            @JvmField val NAME = of("name")

            @JvmField val NAME_DESC = of("-name")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CREATED_AT,
            CREATED_AT_DESC,
            UPDATED_AT,
            UPDATED_AT_DESC,
            NAME,
            NAME_DESC,
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
            NAME,
            NAME_DESC,
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
                NAME -> Value.NAME
                NAME_DESC -> Value.NAME_DESC
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
                NAME -> Known.NAME
                NAME_DESC -> Known.NAME_DESC
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

        return other is CloudfListParams &&
            filterName == other.filterName &&
            filterRegion == other.filterRegion &&
            filterStatus == other.filterStatus &&
            pageAfter == other.pageAfter &&
            pageBefore == other.pageBefore &&
            pageLimit == other.pageLimit &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterName,
            filterRegion,
            filterStatus,
            pageAfter,
            pageBefore,
            pageLimit,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CloudfListParams{filterName=$filterName, filterRegion=$filterRegion, filterStatus=$filterStatus, pageAfter=$pageAfter, pageBefore=$pageBefore, pageLimit=$pageLimit, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
