// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.authenticationproviders

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of your SSO authentication providers. */
class AuthenticationProviderListParams
private constructor(
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>name</code>: sorts the result by the <code>name</code> field in ascending order.
     *   </li>
     * <li> <code>-name</code>: sorts the result by the <code>name</code> field in descending order.
     *   </li> </ul><br/>If not given, results are sorted by <code>created_at</code> in descending
     *   order.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AuthenticationProviderListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthenticationProviderListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthenticationProviderListParams]. */
    class Builder internal constructor() {

        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authenticationProviderListParams: AuthenticationProviderListParams) =
            apply {
                pageNumber = authenticationProviderListParams.pageNumber
                pageSize = authenticationProviderListParams.pageSize
                sort = authenticationProviderListParams.sort
                additionalHeaders = authenticationProviderListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    authenticationProviderListParams.additionalQueryParams.toBuilder()
            }

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

        /**
         * Specifies the sort order for results. By default sorting direction is ascending. To have
         * the results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is:
         * <ul>
         * <li> <code>name</code>: sorts the result by the <code>name</code> field in ascending
         *   order. </li>
         * <li> <code>-name</code>: sorts the result by the <code>name</code> field in descending
         *   order. </li> </ul><br/>If not given, results are sorted by <code>created_at</code> in
         *   descending order.
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
         * Returns an immutable instance of [AuthenticationProviderListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthenticationProviderListParams =
            AuthenticationProviderListParams(
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
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>name</code>: sorts the result by the <code>name</code> field in ascending order.
     *   </li>
     * <li> <code>-name</code>: sorts the result by the <code>name</code> field in descending order.
     *   </li> </ul><br/>If not given, results are sorted by <code>created_at</code> in descending
     *   order.
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

            @JvmField val NAME = of("name")

            @JvmField val NAME_DESC = of("-name")

            @JvmField val SHORT_NAME = of("short_name")

            @JvmField val SHORT_NAME_DESC = of("-short_name")

            @JvmField val ACTIVE = of("active")

            @JvmField val ACTIVE_DESC = of("-active")

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val CREATED_AT_DESC = of("-created_at")

            @JvmField val UPDATED_AT = of("updated_at")

            @JvmField val UPDATED_AT_DESC = of("-updated_at")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            NAME,
            NAME_DESC,
            SHORT_NAME,
            SHORT_NAME_DESC,
            ACTIVE,
            ACTIVE_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            UPDATED_AT,
            UPDATED_AT_DESC,
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
            NAME,
            NAME_DESC,
            SHORT_NAME,
            SHORT_NAME_DESC,
            ACTIVE,
            ACTIVE_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            UPDATED_AT,
            UPDATED_AT_DESC,
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
                NAME -> Value.NAME
                NAME_DESC -> Value.NAME_DESC
                SHORT_NAME -> Value.SHORT_NAME
                SHORT_NAME_DESC -> Value.SHORT_NAME_DESC
                ACTIVE -> Value.ACTIVE
                ACTIVE_DESC -> Value.ACTIVE_DESC
                CREATED_AT -> Value.CREATED_AT
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
                UPDATED_AT -> Value.UPDATED_AT
                UPDATED_AT_DESC -> Value.UPDATED_AT_DESC
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
                NAME -> Known.NAME
                NAME_DESC -> Known.NAME_DESC
                SHORT_NAME -> Known.SHORT_NAME
                SHORT_NAME_DESC -> Known.SHORT_NAME_DESC
                ACTIVE -> Known.ACTIVE
                ACTIVE_DESC -> Known.ACTIVE_DESC
                CREATED_AT -> Known.CREATED_AT
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
                UPDATED_AT -> Known.UPDATED_AT
                UPDATED_AT_DESC -> Known.UPDATED_AT_DESC
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

        return other is AuthenticationProviderListParams &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pageNumber, pageSize, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuthenticationProviderListParams{pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
