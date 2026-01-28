// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.auditevents

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
 * Retrieve a list of audit log entries. Audit logs are a best-effort, eventually consistent record
 * of significant account-related changes.
 */
class AuditEventListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[created_before],
     * filter[created_after]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Set the order of the results by the creation date. */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AuditEventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AuditEventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditEventListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(auditEventListParams: AuditEventListParams) = apply {
            filter = auditEventListParams.filter
            pageNumber = auditEventListParams.pageNumber
            pageSize = auditEventListParams.pageSize
            sort = auditEventListParams.sort
            additionalHeaders = auditEventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = auditEventListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[created_before],
         * filter[created_after]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

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

        /** Set the order of the results by the creation date. */
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
         * Returns an immutable instance of [AuditEventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuditEventListParams =
            AuditEventListParams(
                filter,
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
                filter?.let {
                    it.createdAfter().ifPresent {
                        put(
                            "filter[created_after]",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it.createdBefore().ifPresent {
                        put(
                            "filter[created_before]",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[created_before],
     * filter[created_after]
     */
    class Filter
    private constructor(
        private val createdAfter: OffsetDateTime?,
        private val createdBefore: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter for audit events created after a specific date. */
        fun createdAfter(): Optional<OffsetDateTime> = Optional.ofNullable(createdAfter)

        /** Filter for audit events created before a specific date. */
        fun createdBefore(): Optional<OffsetDateTime> = Optional.ofNullable(createdBefore)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var createdAfter: OffsetDateTime? = null
            private var createdBefore: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                createdAfter = filter.createdAfter
                createdBefore = filter.createdBefore
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter for audit events created after a specific date. */
            fun createdAfter(createdAfter: OffsetDateTime?) = apply {
                this.createdAfter = createdAfter
            }

            /** Alias for calling [Builder.createdAfter] with `createdAfter.orElse(null)`. */
            fun createdAfter(createdAfter: Optional<OffsetDateTime>) =
                createdAfter(createdAfter.getOrNull())

            /** Filter for audit events created before a specific date. */
            fun createdBefore(createdBefore: OffsetDateTime?) = apply {
                this.createdBefore = createdBefore
            }

            /** Alias for calling [Builder.createdBefore] with `createdBefore.orElse(null)`. */
            fun createdBefore(createdBefore: Optional<OffsetDateTime>) =
                createdBefore(createdBefore.getOrNull())

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
             */
            fun build(): Filter = Filter(createdAfter, createdBefore, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                createdAfter == other.createdAfter &&
                createdBefore == other.createdBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAfter, createdBefore, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{createdAfter=$createdAfter, createdBefore=$createdBefore, additionalProperties=$additionalProperties}"
    }

    /** Set the order of the results by the creation date. */
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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            ASC,
            DESC,
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
            ASC,
            DESC,
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
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

        return other is AuditEventListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuditEventListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
