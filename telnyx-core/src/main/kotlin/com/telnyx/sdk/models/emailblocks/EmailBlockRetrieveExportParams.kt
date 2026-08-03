// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Streams the account's suppressions as a chunked CSV (server-side cursor; never materialized).
 * Content-type `text/csv`, header `Content-Disposition: attachment;
 * filename="email_blocks_export.csv"`.
 *
 * Filters (`filter[reason]`, `filter[domain_id]`, `filter[created_after]`,
 * `filter[created_before]`) are the only params that affect output. `sort` and `page[*]` are
 * **parsed** (bad values still produce `400`) but **ignored** — rows stream `ORDER BY created_at
 * ASC, id ASC` with no pagination.
 *
 * CSV columns: `id,to,from,reason,source,scope,status,domain_id,
 * created_at,updated_at,expires_at,group_id`. The CSV carries the `group_id` column so group-scoped
 * suppressions' group link survives the export (empty for account-scope rows).
 */
class EmailBlockRetrieveExportParams
private constructor(
    private val filterCreatedAfter: OffsetDateTime?,
    private val filterCreatedBefore: OffsetDateTime?,
    private val filterDomainId: String?,
    private val filterReason: FilterReason?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: Sort?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** `created_at > value` (ISO 8601). */
    fun filterCreatedAfter(): Optional<OffsetDateTime> = Optional.ofNullable(filterCreatedAfter)

    /** `created_at < value` (ISO 8601). */
    fun filterCreatedBefore(): Optional<OffsetDateTime> = Optional.ofNullable(filterCreatedBefore)

    /** Exact-match filter on domain_id (UUID). */
    fun filterDomainId(): Optional<String> = Optional.ofNullable(filterDomainId)

    /** Exact-match filter on reason. */
    fun filterReason(): Optional<FilterReason> = Optional.ofNullable(filterReason)

    /** Offset page number (≥1, default 1). */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Page size (1–100, default 25). */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Sort field. Leading `-` = desc; only `created_at` is sortable. Default `-created_at`. `--` is
     * an error.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailBlockRetrieveExportParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [EmailBlockRetrieveExportParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailBlockRetrieveExportParams]. */
    class Builder internal constructor() {

        private var filterCreatedAfter: OffsetDateTime? = null
        private var filterCreatedBefore: OffsetDateTime? = null
        private var filterDomainId: String? = null
        private var filterReason: FilterReason? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailBlockRetrieveExportParams: EmailBlockRetrieveExportParams) = apply {
            filterCreatedAfter = emailBlockRetrieveExportParams.filterCreatedAfter
            filterCreatedBefore = emailBlockRetrieveExportParams.filterCreatedBefore
            filterDomainId = emailBlockRetrieveExportParams.filterDomainId
            filterReason = emailBlockRetrieveExportParams.filterReason
            pageNumber = emailBlockRetrieveExportParams.pageNumber
            pageSize = emailBlockRetrieveExportParams.pageSize
            sort = emailBlockRetrieveExportParams.sort
            additionalHeaders = emailBlockRetrieveExportParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailBlockRetrieveExportParams.additionalQueryParams.toBuilder()
        }

        /** `created_at > value` (ISO 8601). */
        fun filterCreatedAfter(filterCreatedAfter: OffsetDateTime?) = apply {
            this.filterCreatedAfter = filterCreatedAfter
        }

        /**
         * Alias for calling [Builder.filterCreatedAfter] with `filterCreatedAfter.orElse(null)`.
         */
        fun filterCreatedAfter(filterCreatedAfter: Optional<OffsetDateTime>) =
            filterCreatedAfter(filterCreatedAfter.getOrNull())

        /** `created_at < value` (ISO 8601). */
        fun filterCreatedBefore(filterCreatedBefore: OffsetDateTime?) = apply {
            this.filterCreatedBefore = filterCreatedBefore
        }

        /**
         * Alias for calling [Builder.filterCreatedBefore] with `filterCreatedBefore.orElse(null)`.
         */
        fun filterCreatedBefore(filterCreatedBefore: Optional<OffsetDateTime>) =
            filterCreatedBefore(filterCreatedBefore.getOrNull())

        /** Exact-match filter on domain_id (UUID). */
        fun filterDomainId(filterDomainId: String?) = apply { this.filterDomainId = filterDomainId }

        /** Alias for calling [Builder.filterDomainId] with `filterDomainId.orElse(null)`. */
        fun filterDomainId(filterDomainId: Optional<String>) =
            filterDomainId(filterDomainId.getOrNull())

        /** Exact-match filter on reason. */
        fun filterReason(filterReason: FilterReason?) = apply { this.filterReason = filterReason }

        /** Alias for calling [Builder.filterReason] with `filterReason.orElse(null)`. */
        fun filterReason(filterReason: Optional<FilterReason>) =
            filterReason(filterReason.getOrNull())

        /** Offset page number (≥1, default 1). */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** Page size (1–100, default 25). */
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
         * Sort field. Leading `-` = desc; only `created_at` is sortable. Default `-created_at`.
         * `--` is an error.
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
         * Returns an immutable instance of [EmailBlockRetrieveExportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailBlockRetrieveExportParams =
            EmailBlockRetrieveExportParams(
                filterCreatedAfter,
                filterCreatedBefore,
                filterDomainId,
                filterReason,
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
                filterCreatedAfter?.let {
                    put("filter[created_after]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                filterCreatedBefore?.let {
                    put("filter[created_before]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                filterDomainId?.let { put("filter[domain_id]", it) }
                filterReason?.let { put("filter[reason]", it.toString()) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Exact-match filter on reason. */
    class FilterReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val HARD_BOUNCE = of("hard_bounce")

            @JvmField val SPAM_COMPLAINT = of("spam_complaint")

            @JvmField val UNSUBSCRIBE = of("unsubscribe")

            @JvmField val INVALID = of("invalid")

            @JvmField val MANUAL_BLOCK = of("manual_block")

            @JvmStatic fun of(value: String) = FilterReason(JsonField.of(value))
        }

        /** An enum containing [FilterReason]'s known values. */
        enum class Known {
            HARD_BOUNCE,
            SPAM_COMPLAINT,
            UNSUBSCRIBE,
            INVALID,
            MANUAL_BLOCK,
        }

        /**
         * An enum containing [FilterReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HARD_BOUNCE,
            SPAM_COMPLAINT,
            UNSUBSCRIBE,
            INVALID,
            MANUAL_BLOCK,
            /**
             * An enum member indicating that [FilterReason] was instantiated with an unknown value.
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
                HARD_BOUNCE -> Value.HARD_BOUNCE
                SPAM_COMPLAINT -> Value.SPAM_COMPLAINT
                UNSUBSCRIBE -> Value.UNSUBSCRIBE
                INVALID -> Value.INVALID
                MANUAL_BLOCK -> Value.MANUAL_BLOCK
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
                HARD_BOUNCE -> Known.HARD_BOUNCE
                SPAM_COMPLAINT -> Known.SPAM_COMPLAINT
                UNSUBSCRIBE -> Known.UNSUBSCRIBE
                INVALID -> Known.INVALID
                MANUAL_BLOCK -> Known.MANUAL_BLOCK
                else -> throw TelnyxInvalidDataException("Unknown FilterReason: $value")
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
        fun validate(): FilterReason = apply {
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

            return other is FilterReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sort field. Leading `-` = desc; only `created_at` is sortable. Default `-created_at`. `--` is
     * an error.
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

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CREATED_AT,
            CREATED_AT_DESC,
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

        return other is EmailBlockRetrieveExportParams &&
            filterCreatedAfter == other.filterCreatedAfter &&
            filterCreatedBefore == other.filterCreatedBefore &&
            filterDomainId == other.filterDomainId &&
            filterReason == other.filterReason &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterCreatedAfter,
            filterCreatedBefore,
            filterDomainId,
            filterReason,
            pageNumber,
            pageSize,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailBlockRetrieveExportParams{filterCreatedAfter=$filterCreatedAfter, filterCreatedBefore=$filterCreatedBefore, filterDomainId=$filterDomainId, filterReason=$filterReason, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
