// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumbercampaigns

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

/** Retrieve All Phone Number Campaigns */
class PhoneNumberCampaignListParams
private constructor(
    private val filter: Filter?,
    private val page: Long?,
    private val recordsPerPage: Long?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[telnyx_campaign_id],
     * filter[telnyx_brand_id], filter[tcr_campaign_id], filter[tcr_brand_id]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    fun page(): Optional<Long> = Optional.ofNullable(page)

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

        @JvmStatic fun none(): PhoneNumberCampaignListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberCampaignListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberCampaignListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Long? = null
        private var recordsPerPage: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberCampaignListParams: PhoneNumberCampaignListParams) = apply {
            filter = phoneNumberCampaignListParams.filter
            page = phoneNumberCampaignListParams.page
            recordsPerPage = phoneNumberCampaignListParams.recordsPerPage
            sort = phoneNumberCampaignListParams.sort
            additionalHeaders = phoneNumberCampaignListParams.additionalHeaders.toBuilder()
            additionalQueryParams = phoneNumberCampaignListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[telnyx_campaign_id],
         * filter[telnyx_brand_id], filter[tcr_campaign_id], filter[tcr_brand_id]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

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
         * Returns an immutable instance of [PhoneNumberCampaignListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberCampaignListParams =
            PhoneNumberCampaignListParams(
                filter,
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
                filter?.let {
                    it.tcrBrandId().ifPresent { put("filter[tcr_brand_id]", it) }
                    it.tcrCampaignId().ifPresent { put("filter[tcr_campaign_id]", it) }
                    it.telnyxBrandId().ifPresent { put("filter[telnyx_brand_id]", it) }
                    it.telnyxCampaignId().ifPresent { put("filter[telnyx_campaign_id]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                page?.let { put("page", it.toString()) }
                recordsPerPage?.let { put("recordsPerPage", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[telnyx_campaign_id],
     * filter[telnyx_brand_id], filter[tcr_campaign_id], filter[tcr_brand_id]
     */
    class Filter
    private constructor(
        private val tcrBrandId: String?,
        private val tcrCampaignId: String?,
        private val telnyxBrandId: String?,
        private val telnyxCampaignId: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter results by the TCR Brand id */
        fun tcrBrandId(): Optional<String> = Optional.ofNullable(tcrBrandId)

        /** Filter results by the TCR Campaign id */
        fun tcrCampaignId(): Optional<String> = Optional.ofNullable(tcrCampaignId)

        /** Filter results by the Telnyx Brand id */
        fun telnyxBrandId(): Optional<String> = Optional.ofNullable(telnyxBrandId)

        /** Filter results by the Telnyx Campaign id */
        fun telnyxCampaignId(): Optional<String> = Optional.ofNullable(telnyxCampaignId)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var tcrBrandId: String? = null
            private var tcrCampaignId: String? = null
            private var telnyxBrandId: String? = null
            private var telnyxCampaignId: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                tcrBrandId = filter.tcrBrandId
                tcrCampaignId = filter.tcrCampaignId
                telnyxBrandId = filter.telnyxBrandId
                telnyxCampaignId = filter.telnyxCampaignId
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter results by the TCR Brand id */
            fun tcrBrandId(tcrBrandId: String?) = apply { this.tcrBrandId = tcrBrandId }

            /** Alias for calling [Builder.tcrBrandId] with `tcrBrandId.orElse(null)`. */
            fun tcrBrandId(tcrBrandId: Optional<String>) = tcrBrandId(tcrBrandId.getOrNull())

            /** Filter results by the TCR Campaign id */
            fun tcrCampaignId(tcrCampaignId: String?) = apply { this.tcrCampaignId = tcrCampaignId }

            /** Alias for calling [Builder.tcrCampaignId] with `tcrCampaignId.orElse(null)`. */
            fun tcrCampaignId(tcrCampaignId: Optional<String>) =
                tcrCampaignId(tcrCampaignId.getOrNull())

            /** Filter results by the Telnyx Brand id */
            fun telnyxBrandId(telnyxBrandId: String?) = apply { this.telnyxBrandId = telnyxBrandId }

            /** Alias for calling [Builder.telnyxBrandId] with `telnyxBrandId.orElse(null)`. */
            fun telnyxBrandId(telnyxBrandId: Optional<String>) =
                telnyxBrandId(telnyxBrandId.getOrNull())

            /** Filter results by the Telnyx Campaign id */
            fun telnyxCampaignId(telnyxCampaignId: String?) = apply {
                this.telnyxCampaignId = telnyxCampaignId
            }

            /**
             * Alias for calling [Builder.telnyxCampaignId] with `telnyxCampaignId.orElse(null)`.
             */
            fun telnyxCampaignId(telnyxCampaignId: Optional<String>) =
                telnyxCampaignId(telnyxCampaignId.getOrNull())

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
            fun build(): Filter =
                Filter(
                    tcrBrandId,
                    tcrCampaignId,
                    telnyxBrandId,
                    telnyxCampaignId,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                tcrBrandId == other.tcrBrandId &&
                tcrCampaignId == other.tcrCampaignId &&
                telnyxBrandId == other.telnyxBrandId &&
                telnyxCampaignId == other.telnyxCampaignId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                tcrBrandId,
                tcrCampaignId,
                telnyxBrandId,
                telnyxCampaignId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{tcrBrandId=$tcrBrandId, tcrCampaignId=$tcrCampaignId, telnyxBrandId=$telnyxBrandId, telnyxCampaignId=$telnyxCampaignId, additionalProperties=$additionalProperties}"
    }

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

            @JvmField val ASSIGNMENT_STATUS = of("assignmentStatus")

            @JvmField val ASSIGNMENT_STATUS_DESC = of("-assignmentStatus")

            @JvmField val CREATED_AT = of("createdAt")

            @JvmField val CREATED_AT_DESC = of("-createdAt")

            @JvmField val PHONE_NUMBER = of("phoneNumber")

            @JvmField val PHONE_NUMBER_DESC = of("-phoneNumber")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            ASSIGNMENT_STATUS,
            ASSIGNMENT_STATUS_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            PHONE_NUMBER,
            PHONE_NUMBER_DESC,
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
            ASSIGNMENT_STATUS,
            ASSIGNMENT_STATUS_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            PHONE_NUMBER,
            PHONE_NUMBER_DESC,
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
                ASSIGNMENT_STATUS -> Value.ASSIGNMENT_STATUS
                ASSIGNMENT_STATUS_DESC -> Value.ASSIGNMENT_STATUS_DESC
                CREATED_AT -> Value.CREATED_AT
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
                PHONE_NUMBER -> Value.PHONE_NUMBER
                PHONE_NUMBER_DESC -> Value.PHONE_NUMBER_DESC
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
                ASSIGNMENT_STATUS -> Known.ASSIGNMENT_STATUS
                ASSIGNMENT_STATUS_DESC -> Known.ASSIGNMENT_STATUS_DESC
                CREATED_AT -> Known.CREATED_AT
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
                PHONE_NUMBER -> Known.PHONE_NUMBER
                PHONE_NUMBER_DESC -> Known.PHONE_NUMBER_DESC
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

        return other is PhoneNumberCampaignListParams &&
            filter == other.filter &&
            page == other.page &&
            recordsPerPage == other.recordsPerPage &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, recordsPerPage, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberCampaignListParams{filter=$filter, page=$page, recordsPerPage=$recordsPerPage, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
