// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

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
 * Shared (`type: shared`) Telnyx-managed domains are included/readable for every account, in
 * addition to the account's own custom domains.
 */
class EmailDomainListParams
private constructor(
    private val filterDomain: String?,
    private val filterProfileId: String?,
    private val filterStatus: EmailDomainStatus?,
    private val filterType: EmailDomainType?,
    private val filterUsableForInbound: Boolean?,
    private val filterUsableForSending: Boolean?,
    private val pageAfter: String?,
    private val pageBefore: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: Sort?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Partial match on domain name (case-insensitive) */
    fun filterDomain(): Optional<String> = Optional.ofNullable(filterDomain)

    /** Filter by profile UUID */
    fun filterProfileId(): Optional<String> = Optional.ofNullable(filterProfileId)

    fun filterStatus(): Optional<EmailDomainStatus> = Optional.ofNullable(filterStatus)

    fun filterType(): Optional<EmailDomainType> = Optional.ofNullable(filterType)

    fun filterUsableForInbound(): Optional<Boolean> = Optional.ofNullable(filterUsableForInbound)

    fun filterUsableForSending(): Optional<Boolean> = Optional.ofNullable(filterUsableForSending)

    /** Cursor for records after the provided value (cursor pagination) */
    fun pageAfter(): Optional<String> = Optional.ofNullable(pageAfter)

    /** Cursor for records before the provided value (cursor pagination) */
    fun pageBefore(): Optional<String> = Optional.ofNullable(pageBefore)

    /** Page number to return (offset pagination) */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Number of records per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Field to sort by. Prefix with `-` for descending order. */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailDomainListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailDomainListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailDomainListParams]. */
    class Builder internal constructor() {

        private var filterDomain: String? = null
        private var filterProfileId: String? = null
        private var filterStatus: EmailDomainStatus? = null
        private var filterType: EmailDomainType? = null
        private var filterUsableForInbound: Boolean? = null
        private var filterUsableForSending: Boolean? = null
        private var pageAfter: String? = null
        private var pageBefore: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailDomainListParams: EmailDomainListParams) = apply {
            filterDomain = emailDomainListParams.filterDomain
            filterProfileId = emailDomainListParams.filterProfileId
            filterStatus = emailDomainListParams.filterStatus
            filterType = emailDomainListParams.filterType
            filterUsableForInbound = emailDomainListParams.filterUsableForInbound
            filterUsableForSending = emailDomainListParams.filterUsableForSending
            pageAfter = emailDomainListParams.pageAfter
            pageBefore = emailDomainListParams.pageBefore
            pageNumber = emailDomainListParams.pageNumber
            pageSize = emailDomainListParams.pageSize
            sort = emailDomainListParams.sort
            additionalHeaders = emailDomainListParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailDomainListParams.additionalQueryParams.toBuilder()
        }

        /** Partial match on domain name (case-insensitive) */
        fun filterDomain(filterDomain: String?) = apply { this.filterDomain = filterDomain }

        /** Alias for calling [Builder.filterDomain] with `filterDomain.orElse(null)`. */
        fun filterDomain(filterDomain: Optional<String>) = filterDomain(filterDomain.getOrNull())

        /** Filter by profile UUID */
        fun filterProfileId(filterProfileId: String?) = apply {
            this.filterProfileId = filterProfileId
        }

        /** Alias for calling [Builder.filterProfileId] with `filterProfileId.orElse(null)`. */
        fun filterProfileId(filterProfileId: Optional<String>) =
            filterProfileId(filterProfileId.getOrNull())

        fun filterStatus(filterStatus: EmailDomainStatus?) = apply {
            this.filterStatus = filterStatus
        }

        /** Alias for calling [Builder.filterStatus] with `filterStatus.orElse(null)`. */
        fun filterStatus(filterStatus: Optional<EmailDomainStatus>) =
            filterStatus(filterStatus.getOrNull())

        fun filterType(filterType: EmailDomainType?) = apply { this.filterType = filterType }

        /** Alias for calling [Builder.filterType] with `filterType.orElse(null)`. */
        fun filterType(filterType: Optional<EmailDomainType>) = filterType(filterType.getOrNull())

        fun filterUsableForInbound(filterUsableForInbound: Boolean?) = apply {
            this.filterUsableForInbound = filterUsableForInbound
        }

        /**
         * Alias for [Builder.filterUsableForInbound].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun filterUsableForInbound(filterUsableForInbound: Boolean) =
            filterUsableForInbound(filterUsableForInbound as Boolean?)

        /**
         * Alias for calling [Builder.filterUsableForInbound] with
         * `filterUsableForInbound.orElse(null)`.
         */
        fun filterUsableForInbound(filterUsableForInbound: Optional<Boolean>) =
            filterUsableForInbound(filterUsableForInbound.getOrNull())

        fun filterUsableForSending(filterUsableForSending: Boolean?) = apply {
            this.filterUsableForSending = filterUsableForSending
        }

        /**
         * Alias for [Builder.filterUsableForSending].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun filterUsableForSending(filterUsableForSending: Boolean) =
            filterUsableForSending(filterUsableForSending as Boolean?)

        /**
         * Alias for calling [Builder.filterUsableForSending] with
         * `filterUsableForSending.orElse(null)`.
         */
        fun filterUsableForSending(filterUsableForSending: Optional<Boolean>) =
            filterUsableForSending(filterUsableForSending.getOrNull())

        /** Cursor for records after the provided value (cursor pagination) */
        fun pageAfter(pageAfter: String?) = apply { this.pageAfter = pageAfter }

        /** Alias for calling [Builder.pageAfter] with `pageAfter.orElse(null)`. */
        fun pageAfter(pageAfter: Optional<String>) = pageAfter(pageAfter.getOrNull())

        /** Cursor for records before the provided value (cursor pagination) */
        fun pageBefore(pageBefore: String?) = apply { this.pageBefore = pageBefore }

        /** Alias for calling [Builder.pageBefore] with `pageBefore.orElse(null)`. */
        fun pageBefore(pageBefore: Optional<String>) = pageBefore(pageBefore.getOrNull())

        /** Page number to return (offset pagination) */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** Number of records per page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Field to sort by. Prefix with `-` for descending order. */
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
         * Returns an immutable instance of [EmailDomainListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailDomainListParams =
            EmailDomainListParams(
                filterDomain,
                filterProfileId,
                filterStatus,
                filterType,
                filterUsableForInbound,
                filterUsableForSending,
                pageAfter,
                pageBefore,
                pageNumber,
                pageSize,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterDomain?.let { put("filter[domain]", it) }
                filterProfileId?.let { put("filter[profile_id]", it) }
                filterStatus?.let { put("filter[status]", it.toString()) }
                filterType?.let { put("filter[type]", it.toString()) }
                filterUsableForInbound?.let { put("filter[usable_for_inbound]", it.toString()) }
                filterUsableForSending?.let { put("filter[usable_for_sending]", it.toString()) }
                pageAfter?.let { put("page[after]", it) }
                pageBefore?.let { put("page[before]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Field to sort by. Prefix with `-` for descending order. */
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

            @JvmField val DOMAIN = of("domain")

            @JvmField val minus_DOMAIN = of("-domain")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CREATED_AT,
            CREATED_AT_DESC,
            DOMAIN,
            minus_DOMAIN,
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
            DOMAIN,
            minus_DOMAIN,
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
                DOMAIN -> Value.DOMAIN
                minus_DOMAIN -> Value.minus_DOMAIN
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
                DOMAIN -> Known.DOMAIN
                minus_DOMAIN -> Known.minus_DOMAIN
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

        return other is EmailDomainListParams &&
            filterDomain == other.filterDomain &&
            filterProfileId == other.filterProfileId &&
            filterStatus == other.filterStatus &&
            filterType == other.filterType &&
            filterUsableForInbound == other.filterUsableForInbound &&
            filterUsableForSending == other.filterUsableForSending &&
            pageAfter == other.pageAfter &&
            pageBefore == other.pageBefore &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterDomain,
            filterProfileId,
            filterStatus,
            filterType,
            filterUsableForInbound,
            filterUsableForSending,
            pageAfter,
            pageBefore,
            pageNumber,
            pageSize,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailDomainListParams{filterDomain=$filterDomain, filterProfileId=$filterProfileId, filterStatus=$filterStatus, filterType=$filterType, filterUsableForInbound=$filterUsableForInbound, filterUsableForSending=$filterUsableForSending, pageAfter=$pageAfter, pageBefore=$pageBefore, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
