// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.brand

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

/** This endpoint is used to list all brands associated with your organization. */
class BrandListParams
private constructor(
    private val brandId: String?,
    private val country: String?,
    private val displayName: String?,
    private val entityType: String?,
    private val page: Long?,
    private val recordsPerPage: Long?,
    private val sort: Sort?,
    private val state: String?,
    private val tcrBrandId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter results by the Telnyx Brand id */
    fun brandId(): Optional<String> = Optional.ofNullable(brandId)

    fun country(): Optional<String> = Optional.ofNullable(country)

    fun displayName(): Optional<String> = Optional.ofNullable(displayName)

    fun entityType(): Optional<String> = Optional.ofNullable(entityType)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** number of records per page. maximum of 500 */
    fun recordsPerPage(): Optional<Long> = Optional.ofNullable(recordsPerPage)

    /**
     * Specifies the sort order for results. If not given, results are sorted by createdAt in
     * descending order.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    fun state(): Optional<String> = Optional.ofNullable(state)

    /** Filter results by the TCR Brand id */
    fun tcrBrandId(): Optional<String> = Optional.ofNullable(tcrBrandId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BrandListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BrandListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandListParams]. */
    class Builder internal constructor() {

        private var brandId: String? = null
        private var country: String? = null
        private var displayName: String? = null
        private var entityType: String? = null
        private var page: Long? = null
        private var recordsPerPage: Long? = null
        private var sort: Sort? = null
        private var state: String? = null
        private var tcrBrandId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(brandListParams: BrandListParams) = apply {
            brandId = brandListParams.brandId
            country = brandListParams.country
            displayName = brandListParams.displayName
            entityType = brandListParams.entityType
            page = brandListParams.page
            recordsPerPage = brandListParams.recordsPerPage
            sort = brandListParams.sort
            state = brandListParams.state
            tcrBrandId = brandListParams.tcrBrandId
            additionalHeaders = brandListParams.additionalHeaders.toBuilder()
            additionalQueryParams = brandListParams.additionalQueryParams.toBuilder()
        }

        /** Filter results by the Telnyx Brand id */
        fun brandId(brandId: String?) = apply { this.brandId = brandId }

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        fun country(country: String?) = apply { this.country = country }

        /** Alias for calling [Builder.country] with `country.orElse(null)`. */
        fun country(country: Optional<String>) = country(country.getOrNull())

        fun displayName(displayName: String?) = apply { this.displayName = displayName }

        /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
        fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

        fun entityType(entityType: String?) = apply { this.entityType = entityType }

        /** Alias for calling [Builder.entityType] with `entityType.orElse(null)`. */
        fun entityType(entityType: Optional<String>) = entityType(entityType.getOrNull())

        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /** number of records per page. maximum of 500 */
        fun recordsPerPage(recordsPerPage: Long?) = apply { this.recordsPerPage = recordsPerPage }

        /**
         * Alias for [Builder.recordsPerPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun recordsPerPage(recordsPerPage: Long) = recordsPerPage(recordsPerPage as Long?)

        /** Alias for calling [Builder.recordsPerPage] with `recordsPerPage.orElse(null)`. */
        fun recordsPerPage(recordsPerPage: Optional<Long>) =
            recordsPerPage(recordsPerPage.getOrNull())

        /**
         * Specifies the sort order for results. If not given, results are sorted by createdAt in
         * descending order.
         */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        fun state(state: String?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

        /** Filter results by the TCR Brand id */
        fun tcrBrandId(tcrBrandId: String?) = apply { this.tcrBrandId = tcrBrandId }

        /** Alias for calling [Builder.tcrBrandId] with `tcrBrandId.orElse(null)`. */
        fun tcrBrandId(tcrBrandId: Optional<String>) = tcrBrandId(tcrBrandId.getOrNull())

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
         * Returns an immutable instance of [BrandListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandListParams =
            BrandListParams(
                brandId,
                country,
                displayName,
                entityType,
                page,
                recordsPerPage,
                sort,
                state,
                tcrBrandId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                brandId?.let { put("brandId", it) }
                country?.let { put("country", it) }
                displayName?.let { put("displayName", it) }
                entityType?.let { put("entityType", it) }
                page?.let { put("page", it.toString()) }
                recordsPerPage?.let { put("recordsPerPage", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                state?.let { put("state", it) }
                tcrBrandId?.let { put("tcrBrandId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Specifies the sort order for results. If not given, results are sorted by createdAt in
     * descending order.
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

            @JvmField val ASSIGNED_CAMPAIGNS_COUNT = of("assignedCampaignsCount")

            @JvmField val ASSIGNED_CAMPAIGNS_COUNT_DESC = of("-assignedCampaignsCount")

            @JvmField val BRAND_ID = of("brandId")

            @JvmField val BRAND_ID_DESC = of("-brandId")

            @JvmField val CREATED_AT = of("createdAt")

            @JvmField val CREATED_AT_DESC = of("-createdAt")

            @JvmField val DISPLAY_NAME = of("displayName")

            @JvmField val DISPLAY_NAME_DESC = of("-displayName")

            @JvmField val IDENTITY_STATUS = of("identityStatus")

            @JvmField val IDENTITY_STATUS_DESC = of("-identityStatus")

            @JvmField val STATUS = of("status")

            @JvmField val STATUS_DESC = of("-status")

            @JvmField val TCR_BRAND_ID = of("tcrBrandId")

            @JvmField val TCR_BRAND_ID_DESC = of("-tcrBrandId")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            ASSIGNED_CAMPAIGNS_COUNT,
            ASSIGNED_CAMPAIGNS_COUNT_DESC,
            BRAND_ID,
            BRAND_ID_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            DISPLAY_NAME,
            DISPLAY_NAME_DESC,
            IDENTITY_STATUS,
            IDENTITY_STATUS_DESC,
            STATUS,
            STATUS_DESC,
            TCR_BRAND_ID,
            TCR_BRAND_ID_DESC,
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
            ASSIGNED_CAMPAIGNS_COUNT,
            ASSIGNED_CAMPAIGNS_COUNT_DESC,
            BRAND_ID,
            BRAND_ID_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            DISPLAY_NAME,
            DISPLAY_NAME_DESC,
            IDENTITY_STATUS,
            IDENTITY_STATUS_DESC,
            STATUS,
            STATUS_DESC,
            TCR_BRAND_ID,
            TCR_BRAND_ID_DESC,
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
                ASSIGNED_CAMPAIGNS_COUNT -> Value.ASSIGNED_CAMPAIGNS_COUNT
                ASSIGNED_CAMPAIGNS_COUNT_DESC -> Value.ASSIGNED_CAMPAIGNS_COUNT_DESC
                BRAND_ID -> Value.BRAND_ID
                BRAND_ID_DESC -> Value.BRAND_ID_DESC
                CREATED_AT -> Value.CREATED_AT
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
                DISPLAY_NAME -> Value.DISPLAY_NAME
                DISPLAY_NAME_DESC -> Value.DISPLAY_NAME_DESC
                IDENTITY_STATUS -> Value.IDENTITY_STATUS
                IDENTITY_STATUS_DESC -> Value.IDENTITY_STATUS_DESC
                STATUS -> Value.STATUS
                STATUS_DESC -> Value.STATUS_DESC
                TCR_BRAND_ID -> Value.TCR_BRAND_ID
                TCR_BRAND_ID_DESC -> Value.TCR_BRAND_ID_DESC
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
                ASSIGNED_CAMPAIGNS_COUNT -> Known.ASSIGNED_CAMPAIGNS_COUNT
                ASSIGNED_CAMPAIGNS_COUNT_DESC -> Known.ASSIGNED_CAMPAIGNS_COUNT_DESC
                BRAND_ID -> Known.BRAND_ID
                BRAND_ID_DESC -> Known.BRAND_ID_DESC
                CREATED_AT -> Known.CREATED_AT
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
                DISPLAY_NAME -> Known.DISPLAY_NAME
                DISPLAY_NAME_DESC -> Known.DISPLAY_NAME_DESC
                IDENTITY_STATUS -> Known.IDENTITY_STATUS
                IDENTITY_STATUS_DESC -> Known.IDENTITY_STATUS_DESC
                STATUS -> Known.STATUS
                STATUS_DESC -> Known.STATUS_DESC
                TCR_BRAND_ID -> Known.TCR_BRAND_ID
                TCR_BRAND_ID_DESC -> Known.TCR_BRAND_ID_DESC
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

        return other is BrandListParams &&
            brandId == other.brandId &&
            country == other.country &&
            displayName == other.displayName &&
            entityType == other.entityType &&
            page == other.page &&
            recordsPerPage == other.recordsPerPage &&
            sort == other.sort &&
            state == other.state &&
            tcrBrandId == other.tcrBrandId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            brandId,
            country,
            displayName,
            entityType,
            page,
            recordsPerPage,
            sort,
            state,
            tcrBrandId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BrandListParams{brandId=$brandId, country=$country, displayName=$displayName, entityType=$entityType, page=$page, recordsPerPage=$recordsPerPage, sort=$sort, state=$state, tcrBrandId=$tcrBrandId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
