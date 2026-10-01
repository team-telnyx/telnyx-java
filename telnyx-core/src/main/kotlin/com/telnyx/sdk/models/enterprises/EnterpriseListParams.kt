// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Return the enterprises you own, paginated. The default page size is 20; the maximum is 250. */
class EnterpriseListParams
private constructor(
    private val filterLegalNameContains: String?,
    private val filterRoleType: FilterRoleType?,
    private val legalName: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Case-insensitive partial match on legal name. */
    fun filterLegalNameContains(): Optional<String> = Optional.ofNullable(filterLegalNameContains)

    /**
     * Only return enterprises of this type: `bpo` for call-center (BPO) enterprises, `enterprise`
     * for normal enterprises. Omit to return both.
     */
    fun filterRoleType(): Optional<FilterRoleType> = Optional.ofNullable(filterRoleType)

    /** Filter by legal name (partial match). */
    fun legalName(): Optional<String> = Optional.ofNullable(legalName)

    /** 1-based page number. Out-of-range values return an empty page with correct meta. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Items per page. Default 10. Maximum 250; values above are clamped to 250. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EnterpriseListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EnterpriseListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnterpriseListParams]. */
    class Builder internal constructor() {

        private var filterLegalNameContains: String? = null
        private var filterRoleType: FilterRoleType? = null
        private var legalName: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(enterpriseListParams: EnterpriseListParams) = apply {
            filterLegalNameContains = enterpriseListParams.filterLegalNameContains
            filterRoleType = enterpriseListParams.filterRoleType
            legalName = enterpriseListParams.legalName
            pageNumber = enterpriseListParams.pageNumber
            pageSize = enterpriseListParams.pageSize
            additionalHeaders = enterpriseListParams.additionalHeaders.toBuilder()
            additionalQueryParams = enterpriseListParams.additionalQueryParams.toBuilder()
        }

        /** Case-insensitive partial match on legal name. */
        fun filterLegalNameContains(filterLegalNameContains: String?) = apply {
            this.filterLegalNameContains = filterLegalNameContains
        }

        /**
         * Alias for calling [Builder.filterLegalNameContains] with
         * `filterLegalNameContains.orElse(null)`.
         */
        fun filterLegalNameContains(filterLegalNameContains: Optional<String>) =
            filterLegalNameContains(filterLegalNameContains.getOrNull())

        /**
         * Only return enterprises of this type: `bpo` for call-center (BPO) enterprises,
         * `enterprise` for normal enterprises. Omit to return both.
         */
        fun filterRoleType(filterRoleType: FilterRoleType?) = apply {
            this.filterRoleType = filterRoleType
        }

        /** Alias for calling [Builder.filterRoleType] with `filterRoleType.orElse(null)`. */
        fun filterRoleType(filterRoleType: Optional<FilterRoleType>) =
            filterRoleType(filterRoleType.getOrNull())

        /** Filter by legal name (partial match). */
        fun legalName(legalName: String?) = apply { this.legalName = legalName }

        /** Alias for calling [Builder.legalName] with `legalName.orElse(null)`. */
        fun legalName(legalName: Optional<String>) = legalName(legalName.getOrNull())

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

        /** Items per page. Default 10. Maximum 250; values above are clamped to 250. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [EnterpriseListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EnterpriseListParams =
            EnterpriseListParams(
                filterLegalNameContains,
                filterRoleType,
                legalName,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterLegalNameContains?.let { put("filter[legal_name][contains]", it) }
                filterRoleType?.let { put("filter[role_type]", it.toString()) }
                legalName?.let { put("legal_name", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Only return enterprises of this type: `bpo` for call-center (BPO) enterprises, `enterprise`
     * for normal enterprises. Omit to return both.
     */
    class FilterRoleType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ENTERPRISE = of("enterprise")

            @JvmField val BPO = of("bpo")

            @JvmStatic fun of(value: String) = FilterRoleType(JsonField.of(value))
        }

        /** An enum containing [FilterRoleType]'s known values. */
        enum class Known {
            ENTERPRISE,
            BPO,
        }

        /**
         * An enum containing [FilterRoleType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterRoleType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENTERPRISE,
            BPO,
            /**
             * An enum member indicating that [FilterRoleType] was instantiated with an unknown
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
                ENTERPRISE -> Value.ENTERPRISE
                BPO -> Value.BPO
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
                ENTERPRISE -> Known.ENTERPRISE
                BPO -> Known.BPO
                else -> throw TelnyxInvalidDataException("Unknown FilterRoleType: $value")
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
        fun validate(): FilterRoleType = apply {
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

            return other is FilterRoleType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnterpriseListParams &&
            filterLegalNameContains == other.filterLegalNameContains &&
            filterRoleType == other.filterRoleType &&
            legalName == other.legalName &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterLegalNameContains,
            filterRoleType,
            legalName,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EnterpriseListParams{filterLegalNameContains=$filterLegalNameContains, filterRoleType=$filterRoleType, legalName=$legalName, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
