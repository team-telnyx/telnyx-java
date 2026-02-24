// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.partnercampaigns

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

/**
 * Retrieve all partner campaigns you have shared to Telnyx in a paginated fashion.
 *
 * This endpoint is currently limited to only returning shared campaigns that Telnyx has accepted.
 * In other words, shared but pending campaigns are currently omitted from the response from this
 * endpoint.
 */
class PartnerCampaignListParams
private constructor(
    private val page: Long?,
    private val recordsPerPage: Long?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The 1-indexed page number to get. The default value is `1`. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /**
     * The amount of records per page, limited to between 1 and 500 inclusive. The default value is
     * `10`.
     */
    fun recordsPerPage(): Optional<Long> = Optional.ofNullable(recordsPerPage)

    /**
     * Specifies the sort order for results. If not given, results are sorted by createdAt in
     * descending order.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PartnerCampaignListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [PartnerCampaignListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PartnerCampaignListParams]. */
    class Builder internal constructor() {

        private var page: Long? = null
        private var recordsPerPage: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(partnerCampaignListParams: PartnerCampaignListParams) = apply {
            page = partnerCampaignListParams.page
            recordsPerPage = partnerCampaignListParams.recordsPerPage
            sort = partnerCampaignListParams.sort
            additionalHeaders = partnerCampaignListParams.additionalHeaders.toBuilder()
            additionalQueryParams = partnerCampaignListParams.additionalQueryParams.toBuilder()
        }

        /** The 1-indexed page number to get. The default value is `1`. */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /**
         * The amount of records per page, limited to between 1 and 500 inclusive. The default value
         * is `10`.
         */
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
         * Returns an immutable instance of [PartnerCampaignListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PartnerCampaignListParams =
            PartnerCampaignListParams(
                page,
                recordsPerPage,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                page?.let { put("page", it.toString()) }
                recordsPerPage?.let { put("recordsPerPage", it.toString()) }
                sort?.let { put("sort", it.toString()) }
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

            @JvmField val ASSIGNED_PHONE_NUMBERS_COUNT = of("assignedPhoneNumbersCount")

            @JvmField val ASSIGNED_PHONE_NUMBERS_COUNT_DESC = of("-assignedPhoneNumbersCount")

            @JvmField val BRAND_DISPLAY_NAME = of("brandDisplayName")

            @JvmField val BRAND_DISPLAY_NAME_DESC = of("-brandDisplayName")

            @JvmField val TCR_BRAND_ID = of("tcrBrandId")

            @JvmField val TCR_BRAND_ID_DESC = of("-tcrBrandId")

            @JvmField val TCR_CAMPAIGN_ID = of("tcrCampaignId")

            @JvmField val TCR_CAMPAIGN_ID_DESC = of("-tcrCampaignId")

            @JvmField val CREATED_AT = of("createdAt")

            @JvmField val CREATED_AT_DESC = of("-createdAt")

            @JvmField val CAMPAIGN_STATUS = of("campaignStatus")

            @JvmField val CAMPAIGN_STATUS_DESC = of("-campaignStatus")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            ASSIGNED_PHONE_NUMBERS_COUNT,
            ASSIGNED_PHONE_NUMBERS_COUNT_DESC,
            BRAND_DISPLAY_NAME,
            BRAND_DISPLAY_NAME_DESC,
            TCR_BRAND_ID,
            TCR_BRAND_ID_DESC,
            TCR_CAMPAIGN_ID,
            TCR_CAMPAIGN_ID_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            CAMPAIGN_STATUS,
            CAMPAIGN_STATUS_DESC,
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
            ASSIGNED_PHONE_NUMBERS_COUNT,
            ASSIGNED_PHONE_NUMBERS_COUNT_DESC,
            BRAND_DISPLAY_NAME,
            BRAND_DISPLAY_NAME_DESC,
            TCR_BRAND_ID,
            TCR_BRAND_ID_DESC,
            TCR_CAMPAIGN_ID,
            TCR_CAMPAIGN_ID_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            CAMPAIGN_STATUS,
            CAMPAIGN_STATUS_DESC,
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
                ASSIGNED_PHONE_NUMBERS_COUNT -> Value.ASSIGNED_PHONE_NUMBERS_COUNT
                ASSIGNED_PHONE_NUMBERS_COUNT_DESC -> Value.ASSIGNED_PHONE_NUMBERS_COUNT_DESC
                BRAND_DISPLAY_NAME -> Value.BRAND_DISPLAY_NAME
                BRAND_DISPLAY_NAME_DESC -> Value.BRAND_DISPLAY_NAME_DESC
                TCR_BRAND_ID -> Value.TCR_BRAND_ID
                TCR_BRAND_ID_DESC -> Value.TCR_BRAND_ID_DESC
                TCR_CAMPAIGN_ID -> Value.TCR_CAMPAIGN_ID
                TCR_CAMPAIGN_ID_DESC -> Value.TCR_CAMPAIGN_ID_DESC
                CREATED_AT -> Value.CREATED_AT
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
                CAMPAIGN_STATUS -> Value.CAMPAIGN_STATUS
                CAMPAIGN_STATUS_DESC -> Value.CAMPAIGN_STATUS_DESC
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
                ASSIGNED_PHONE_NUMBERS_COUNT -> Known.ASSIGNED_PHONE_NUMBERS_COUNT
                ASSIGNED_PHONE_NUMBERS_COUNT_DESC -> Known.ASSIGNED_PHONE_NUMBERS_COUNT_DESC
                BRAND_DISPLAY_NAME -> Known.BRAND_DISPLAY_NAME
                BRAND_DISPLAY_NAME_DESC -> Known.BRAND_DISPLAY_NAME_DESC
                TCR_BRAND_ID -> Known.TCR_BRAND_ID
                TCR_BRAND_ID_DESC -> Known.TCR_BRAND_ID_DESC
                TCR_CAMPAIGN_ID -> Known.TCR_CAMPAIGN_ID
                TCR_CAMPAIGN_ID_DESC -> Known.TCR_CAMPAIGN_ID_DESC
                CREATED_AT -> Known.CREATED_AT
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
                CAMPAIGN_STATUS -> Known.CAMPAIGN_STATUS
                CAMPAIGN_STATUS_DESC -> Known.CAMPAIGN_STATUS_DESC
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

        return other is PartnerCampaignListParams &&
            page == other.page &&
            recordsPerPage == other.recordsPerPage &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(page, recordsPerPage, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PartnerCampaignListParams{page=$page, recordsPerPage=$recordsPerPage, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
