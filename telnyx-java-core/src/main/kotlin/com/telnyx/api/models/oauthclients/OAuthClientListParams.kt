// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauthclients

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a paginated list of OAuth clients for the authenticated user */
class OAuthClientListParams
private constructor(
    private val filterAllowedGrantTypesContains: FilterAllowedGrantTypesContains?,
    private val filterClientId: String?,
    private val filterClientType: FilterClientType?,
    private val filterName: String?,
    private val filterNameContains: String?,
    private val filterVerified: Boolean?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by allowed grant type */
    fun filterAllowedGrantTypesContains(): Optional<FilterAllowedGrantTypesContains> =
        Optional.ofNullable(filterAllowedGrantTypesContains)

    /** Filter by client ID */
    fun filterClientId(): Optional<String> = Optional.ofNullable(filterClientId)

    /** Filter by client type */
    fun filterClientType(): Optional<FilterClientType> = Optional.ofNullable(filterClientType)

    /** Filter by exact client name */
    fun filterName(): Optional<String> = Optional.ofNullable(filterName)

    /** Filter by client name containing text */
    fun filterNameContains(): Optional<String> = Optional.ofNullable(filterNameContains)

    /** Filter by verification status */
    fun filterVerified(): Optional<Boolean> = Optional.ofNullable(filterVerified)

    /** Page number */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Number of results per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OAuthClientListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OAuthClientListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthClientListParams]. */
    class Builder internal constructor() {

        private var filterAllowedGrantTypesContains: FilterAllowedGrantTypesContains? = null
        private var filterClientId: String? = null
        private var filterClientType: FilterClientType? = null
        private var filterName: String? = null
        private var filterNameContains: String? = null
        private var filterVerified: Boolean? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(oauthClientListParams: OAuthClientListParams) = apply {
            filterAllowedGrantTypesContains = oauthClientListParams.filterAllowedGrantTypesContains
            filterClientId = oauthClientListParams.filterClientId
            filterClientType = oauthClientListParams.filterClientType
            filterName = oauthClientListParams.filterName
            filterNameContains = oauthClientListParams.filterNameContains
            filterVerified = oauthClientListParams.filterVerified
            pageNumber = oauthClientListParams.pageNumber
            pageSize = oauthClientListParams.pageSize
            additionalHeaders = oauthClientListParams.additionalHeaders.toBuilder()
            additionalQueryParams = oauthClientListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by allowed grant type */
        fun filterAllowedGrantTypesContains(
            filterAllowedGrantTypesContains: FilterAllowedGrantTypesContains?
        ) = apply { this.filterAllowedGrantTypesContains = filterAllowedGrantTypesContains }

        /**
         * Alias for calling [Builder.filterAllowedGrantTypesContains] with
         * `filterAllowedGrantTypesContains.orElse(null)`.
         */
        fun filterAllowedGrantTypesContains(
            filterAllowedGrantTypesContains: Optional<FilterAllowedGrantTypesContains>
        ) = filterAllowedGrantTypesContains(filterAllowedGrantTypesContains.getOrNull())

        /** Filter by client ID */
        fun filterClientId(filterClientId: String?) = apply { this.filterClientId = filterClientId }

        /** Alias for calling [Builder.filterClientId] with `filterClientId.orElse(null)`. */
        fun filterClientId(filterClientId: Optional<String>) =
            filterClientId(filterClientId.getOrNull())

        /** Filter by client type */
        fun filterClientType(filterClientType: FilterClientType?) = apply {
            this.filterClientType = filterClientType
        }

        /** Alias for calling [Builder.filterClientType] with `filterClientType.orElse(null)`. */
        fun filterClientType(filterClientType: Optional<FilterClientType>) =
            filterClientType(filterClientType.getOrNull())

        /** Filter by exact client name */
        fun filterName(filterName: String?) = apply { this.filterName = filterName }

        /** Alias for calling [Builder.filterName] with `filterName.orElse(null)`. */
        fun filterName(filterName: Optional<String>) = filterName(filterName.getOrNull())

        /** Filter by client name containing text */
        fun filterNameContains(filterNameContains: String?) = apply {
            this.filterNameContains = filterNameContains
        }

        /**
         * Alias for calling [Builder.filterNameContains] with `filterNameContains.orElse(null)`.
         */
        fun filterNameContains(filterNameContains: Optional<String>) =
            filterNameContains(filterNameContains.getOrNull())

        /** Filter by verification status */
        fun filterVerified(filterVerified: Boolean?) = apply {
            this.filterVerified = filterVerified
        }

        /**
         * Alias for [Builder.filterVerified].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun filterVerified(filterVerified: Boolean) = filterVerified(filterVerified as Boolean?)

        /** Alias for calling [Builder.filterVerified] with `filterVerified.orElse(null)`. */
        fun filterVerified(filterVerified: Optional<Boolean>) =
            filterVerified(filterVerified.getOrNull())

        /** Page number */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** Number of results per page */
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
         * Returns an immutable instance of [OAuthClientListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OAuthClientListParams =
            OAuthClientListParams(
                filterAllowedGrantTypesContains,
                filterClientId,
                filterClientType,
                filterName,
                filterNameContains,
                filterVerified,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterAllowedGrantTypesContains?.let {
                    put("filter[allowed_grant_types][contains]", it.toString())
                }
                filterClientId?.let { put("filter[client_id]", it) }
                filterClientType?.let { put("filter[client_type]", it.toString()) }
                filterName?.let { put("filter[name]", it) }
                filterNameContains?.let { put("filter[name][contains]", it) }
                filterVerified?.let { put("filter[verified]", it.toString()) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by allowed grant type */
    class FilterAllowedGrantTypesContains
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CLIENT_CREDENTIALS = of("client_credentials")

            @JvmField val AUTHORIZATION_CODE = of("authorization_code")

            @JvmField val REFRESH_TOKEN = of("refresh_token")

            @JvmStatic fun of(value: String) = FilterAllowedGrantTypesContains(JsonField.of(value))
        }

        /** An enum containing [FilterAllowedGrantTypesContains]'s known values. */
        enum class Known {
            CLIENT_CREDENTIALS,
            AUTHORIZATION_CODE,
            REFRESH_TOKEN,
        }

        /**
         * An enum containing [FilterAllowedGrantTypesContains]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [FilterAllowedGrantTypesContains] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLIENT_CREDENTIALS,
            AUTHORIZATION_CODE,
            REFRESH_TOKEN,
            /**
             * An enum member indicating that [FilterAllowedGrantTypesContains] was instantiated
             * with an unknown value.
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
                CLIENT_CREDENTIALS -> Value.CLIENT_CREDENTIALS
                AUTHORIZATION_CODE -> Value.AUTHORIZATION_CODE
                REFRESH_TOKEN -> Value.REFRESH_TOKEN
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
                CLIENT_CREDENTIALS -> Known.CLIENT_CREDENTIALS
                AUTHORIZATION_CODE -> Known.AUTHORIZATION_CODE
                REFRESH_TOKEN -> Known.REFRESH_TOKEN
                else ->
                    throw TelnyxInvalidDataException(
                        "Unknown FilterAllowedGrantTypesContains: $value"
                    )
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

        fun validate(): FilterAllowedGrantTypesContains = apply {
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

            return other is FilterAllowedGrantTypesContains && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by client type */
    class FilterClientType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CONFIDENTIAL = of("confidential")

            @JvmField val PUBLIC = of("public")

            @JvmStatic fun of(value: String) = FilterClientType(JsonField.of(value))
        }

        /** An enum containing [FilterClientType]'s known values. */
        enum class Known {
            CONFIDENTIAL,
            PUBLIC,
        }

        /**
         * An enum containing [FilterClientType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterClientType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONFIDENTIAL,
            PUBLIC,
            /**
             * An enum member indicating that [FilterClientType] was instantiated with an unknown
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
                CONFIDENTIAL -> Value.CONFIDENTIAL
                PUBLIC -> Value.PUBLIC
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
                CONFIDENTIAL -> Known.CONFIDENTIAL
                PUBLIC -> Known.PUBLIC
                else -> throw TelnyxInvalidDataException("Unknown FilterClientType: $value")
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

        fun validate(): FilterClientType = apply {
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

            return other is FilterClientType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthClientListParams &&
            filterAllowedGrantTypesContains == other.filterAllowedGrantTypesContains &&
            filterClientId == other.filterClientId &&
            filterClientType == other.filterClientType &&
            filterName == other.filterName &&
            filterNameContains == other.filterNameContains &&
            filterVerified == other.filterVerified &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterAllowedGrantTypesContains,
            filterClientId,
            filterClientType,
            filterName,
            filterNameContains,
            filterVerified,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OAuthClientListParams{filterAllowedGrantTypesContains=$filterAllowedGrantTypesContains, filterClientId=$filterClientId, filterClientType=$filterClientType, filterName=$filterName, filterNameContains=$filterNameContains, filterVerified=$filterVerified, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
