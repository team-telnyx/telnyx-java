// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

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
 * Paginated list of remediation requests for this enterprise. List items omit per-number results
 * and webhook URLs to keep the response small; call GET by id for full detail. Supports JSON:API
 * pagination and optional filters on status and created-at range.
 */
class RemediationListParams
private constructor(
    private val enterpriseId: String?,
    private val filterCreatedAtGte: OffsetDateTime?,
    private val filterCreatedAtLte: OffsetDateTime?,
    private val filterStatus: FilterStatus?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): Optional<String> = Optional.ofNullable(enterpriseId)

    /** Only requests created on or after this timestamp (ISO 8601). */
    fun filterCreatedAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(filterCreatedAtGte)

    /** Only requests created on or before this timestamp (ISO 8601). */
    fun filterCreatedAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(filterCreatedAtLte)

    /** Filter by customer-facing status. */
    fun filterStatus(): Optional<FilterStatus> = Optional.ofNullable(filterStatus)

    /** 1-based page number. Out-of-range values return an empty page with correct meta. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Items per page. Maximum 250; values above are clamped to 250. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RemediationListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RemediationListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RemediationListParams]. */
    class Builder internal constructor() {

        private var enterpriseId: String? = null
        private var filterCreatedAtGte: OffsetDateTime? = null
        private var filterCreatedAtLte: OffsetDateTime? = null
        private var filterStatus: FilterStatus? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(remediationListParams: RemediationListParams) = apply {
            enterpriseId = remediationListParams.enterpriseId
            filterCreatedAtGte = remediationListParams.filterCreatedAtGte
            filterCreatedAtLte = remediationListParams.filterCreatedAtLte
            filterStatus = remediationListParams.filterStatus
            pageNumber = remediationListParams.pageNumber
            pageSize = remediationListParams.pageSize
            additionalHeaders = remediationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = remediationListParams.additionalQueryParams.toBuilder()
        }

        fun enterpriseId(enterpriseId: String?) = apply { this.enterpriseId = enterpriseId }

        /** Alias for calling [Builder.enterpriseId] with `enterpriseId.orElse(null)`. */
        fun enterpriseId(enterpriseId: Optional<String>) = enterpriseId(enterpriseId.getOrNull())

        /** Only requests created on or after this timestamp (ISO 8601). */
        fun filterCreatedAtGte(filterCreatedAtGte: OffsetDateTime?) = apply {
            this.filterCreatedAtGte = filterCreatedAtGte
        }

        /**
         * Alias for calling [Builder.filterCreatedAtGte] with `filterCreatedAtGte.orElse(null)`.
         */
        fun filterCreatedAtGte(filterCreatedAtGte: Optional<OffsetDateTime>) =
            filterCreatedAtGte(filterCreatedAtGte.getOrNull())

        /** Only requests created on or before this timestamp (ISO 8601). */
        fun filterCreatedAtLte(filterCreatedAtLte: OffsetDateTime?) = apply {
            this.filterCreatedAtLte = filterCreatedAtLte
        }

        /**
         * Alias for calling [Builder.filterCreatedAtLte] with `filterCreatedAtLte.orElse(null)`.
         */
        fun filterCreatedAtLte(filterCreatedAtLte: Optional<OffsetDateTime>) =
            filterCreatedAtLte(filterCreatedAtLte.getOrNull())

        /** Filter by customer-facing status. */
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
         * Returns an immutable instance of [RemediationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RemediationListParams =
            RemediationListParams(
                enterpriseId,
                filterCreatedAtGte,
                filterCreatedAtLte,
                filterStatus,
                pageNumber,
                pageSize,
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
                filterCreatedAtGte?.let {
                    put(
                        "filter[created_at][gte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterCreatedAtLte?.let {
                    put(
                        "filter[created_at][lte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterStatus?.let { put("filter[status]", it.toString()) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by customer-facing status. */
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

            @JvmField val PENDING = of("pending")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmStatic fun of(value: String) = FilterStatus(JsonField.of(value))
        }

        /** An enum containing [FilterStatus]'s known values. */
        enum class Known {
            PENDING,
            IN_PROGRESS,
            COMPLETED,
            FAILED,
            CANCELLED,
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
            PENDING,
            IN_PROGRESS,
            COMPLETED,
            FAILED,
            CANCELLED,
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
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
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
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RemediationListParams &&
            enterpriseId == other.enterpriseId &&
            filterCreatedAtGte == other.filterCreatedAtGte &&
            filterCreatedAtLte == other.filterCreatedAtLte &&
            filterStatus == other.filterStatus &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            enterpriseId,
            filterCreatedAtGte,
            filterCreatedAtLte,
            filterStatus,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RemediationListParams{enterpriseId=$enterpriseId, filterCreatedAtGte=$filterCreatedAtGte, filterCreatedAtLte=$filterCreatedAtLte, filterStatus=$filterStatus, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
