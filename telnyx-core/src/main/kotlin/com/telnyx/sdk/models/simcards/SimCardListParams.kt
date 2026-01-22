// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all SIM cards belonging to the user that match the given filters. */
class SimCardListParams
private constructor(
    private val filter: Filter?,
    private val filterSimCardGroupId: String?,
    private val includeSimCardGroup: Boolean?,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter for SIM cards (deepObject style). Originally: filter[iccid],
     * filter[msisdn], filter[status], filter[tags]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** A valid SIM card group ID. */
    fun filterSimCardGroupId(): Optional<String> = Optional.ofNullable(filterSimCardGroupId)

    /** It includes the associated SIM card group object in the response when present. */
    fun includeSimCardGroup(): Optional<Boolean> = Optional.ofNullable(includeSimCardGroup)

    /**
     * Consolidated pagination parameter (deepObject style). Originally: page[number], page[size]
     */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /**
     * Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed with
     * a minus sign.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SimCardListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SimCardListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var filterSimCardGroupId: String? = null
        private var includeSimCardGroup: Boolean? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(simCardListParams: SimCardListParams) = apply {
            filter = simCardListParams.filter
            filterSimCardGroupId = simCardListParams.filterSimCardGroupId
            includeSimCardGroup = simCardListParams.includeSimCardGroup
            page = simCardListParams.page
            sort = simCardListParams.sort
            additionalHeaders = simCardListParams.additionalHeaders.toBuilder()
            additionalQueryParams = simCardListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter for SIM cards (deepObject style). Originally:
         * filter[iccid], filter[msisdn], filter[status], filter[tags]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** A valid SIM card group ID. */
        fun filterSimCardGroupId(filterSimCardGroupId: String?) = apply {
            this.filterSimCardGroupId = filterSimCardGroupId
        }

        /**
         * Alias for calling [Builder.filterSimCardGroupId] with
         * `filterSimCardGroupId.orElse(null)`.
         */
        fun filterSimCardGroupId(filterSimCardGroupId: Optional<String>) =
            filterSimCardGroupId(filterSimCardGroupId.getOrNull())

        /** It includes the associated SIM card group object in the response when present. */
        fun includeSimCardGroup(includeSimCardGroup: Boolean?) = apply {
            this.includeSimCardGroup = includeSimCardGroup
        }

        /**
         * Alias for [Builder.includeSimCardGroup].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeSimCardGroup(includeSimCardGroup: Boolean) =
            includeSimCardGroup(includeSimCardGroup as Boolean?)

        /**
         * Alias for calling [Builder.includeSimCardGroup] with `includeSimCardGroup.orElse(null)`.
         */
        fun includeSimCardGroup(includeSimCardGroup: Optional<Boolean>) =
            includeSimCardGroup(includeSimCardGroup.getOrNull())

        /**
         * Consolidated pagination parameter (deepObject style). Originally: page[number],
         * page[size]
         */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /**
         * Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed
         * with a minus sign.
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
         * Returns an immutable instance of [SimCardListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardListParams =
            SimCardListParams(
                filter,
                filterSimCardGroupId,
                includeSimCardGroup,
                page,
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
                    it.iccid().ifPresent { put("filter[iccid]", it) }
                    it.msisdn().ifPresent { put("filter[msisdn]", it) }
                    it.status().ifPresent {
                        put("filter[status]", it.joinToString(",") { it.toString() })
                    }
                    it.tags().ifPresent { put("filter[tags]", it.joinToString(",")) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                filterSimCardGroupId?.let { put("filter[sim_card_group_id]", it) }
                includeSimCardGroup?.let { put("include_sim_card_group", it.toString()) }
                page?.let {
                    it.number().ifPresent { put("page[number]", it.toString()) }
                    it.size().ifPresent { put("page[size]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("page[$key]", value)
                        }
                    }
                }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter for SIM cards (deepObject style). Originally: filter[iccid],
     * filter[msisdn], filter[status], filter[tags]
     */
    class Filter
    private constructor(
        private val iccid: String?,
        private val msisdn: String?,
        private val status: List<Status>?,
        private val tags: List<String>?,
        private val additionalProperties: QueryParams,
    ) {

        /** A search string to partially match for the SIM card's ICCID. */
        fun iccid(): Optional<String> = Optional.ofNullable(iccid)

        /** A search string to match for the SIM card's MSISDN. */
        fun msisdn(): Optional<String> = Optional.ofNullable(msisdn)

        /** Filter by a SIM card's status. */
        fun status(): Optional<List<Status>> = Optional.ofNullable(status)

        /**
         * A list of SIM card tags to filter on.<br/><br/> If the SIM card contains
         * <b><i>all</i></b> of the given <code>tags</code> they will be found.<br/><br/> For
         * example, if the SIM cards have the following tags: <ul>
         * <li><code>['customers', 'staff', 'test']</code>
         * <li><code>['test']</code></li>
         * <li><code>['customers']</code></li> </ul> Searching for <code>['customers',
         *   'test']</code> returns only the first because it's the only one with both tags.<br/>
         *   Searching for <code>test</code> returns the first two SIMs, because both of them have
         *   such tag.<br/> Searching for <code>customers</code> returns the first and last
         *   SIMs.<br/>
         */
        fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var iccid: String? = null
            private var msisdn: String? = null
            private var status: MutableList<Status>? = null
            private var tags: MutableList<String>? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                iccid = filter.iccid
                msisdn = filter.msisdn
                status = filter.status?.toMutableList()
                tags = filter.tags?.toMutableList()
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** A search string to partially match for the SIM card's ICCID. */
            fun iccid(iccid: String?) = apply { this.iccid = iccid }

            /** Alias for calling [Builder.iccid] with `iccid.orElse(null)`. */
            fun iccid(iccid: Optional<String>) = iccid(iccid.getOrNull())

            /** A search string to match for the SIM card's MSISDN. */
            fun msisdn(msisdn: String?) = apply { this.msisdn = msisdn }

            /** Alias for calling [Builder.msisdn] with `msisdn.orElse(null)`. */
            fun msisdn(msisdn: Optional<String>) = msisdn(msisdn.getOrNull())

            /** Filter by a SIM card's status. */
            fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<List<Status>>) = status(status.getOrNull())

            /**
             * Adds a single [Status] to [Builder.status].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatus(status: Status) = apply {
                this.status = (this.status ?: mutableListOf()).apply { add(status) }
            }

            /**
             * A list of SIM card tags to filter on.<br/><br/> If the SIM card contains
             * <b><i>all</i></b> of the given <code>tags</code> they will be found.<br/><br/> For
             * example, if the SIM cards have the following tags: <ul>
             * <li><code>['customers', 'staff', 'test']</code>
             * <li><code>['test']</code></li>
             * <li><code>['customers']</code></li> </ul> Searching for <code>['customers',
             *   'test']</code> returns only the first because it's the only one with both
             *   tags.<br/> Searching for <code>test</code> returns the first two SIMs, because both
             *   of them have such tag.<br/> Searching for <code>customers</code> returns the first
             *   and last SIMs.<br/>
             */
            fun tags(tags: List<String>?) = apply { this.tags = tags?.toMutableList() }

            /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
            fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply { tags = (tags ?: mutableListOf()).apply { add(tag) } }

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
                    iccid,
                    msisdn,
                    status?.toImmutable(),
                    tags?.toImmutable(),
                    additionalProperties.build(),
                )
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ENABLED = of("enabled")

                @JvmField val DISABLED = of("disabled")

                @JvmField val STANDBY = of("standby")

                @JvmField val DATA_LIMIT_EXCEEDED = of("data_limit_exceeded")

                @JvmField val UNAUTHORIZED_IMEI = of("unauthorized_imei")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ENABLED,
                DISABLED,
                STANDBY,
                DATA_LIMIT_EXCEEDED,
                UNAUTHORIZED_IMEI,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ENABLED,
                DISABLED,
                STANDBY,
                DATA_LIMIT_EXCEEDED,
                UNAUTHORIZED_IMEI,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ENABLED -> Value.ENABLED
                    DISABLED -> Value.DISABLED
                    STANDBY -> Value.STANDBY
                    DATA_LIMIT_EXCEEDED -> Value.DATA_LIMIT_EXCEEDED
                    UNAUTHORIZED_IMEI -> Value.UNAUTHORIZED_IMEI
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ENABLED -> Known.ENABLED
                    DISABLED -> Known.DISABLED
                    STANDBY -> Known.STANDBY
                    DATA_LIMIT_EXCEEDED -> Known.DATA_LIMIT_EXCEEDED
                    UNAUTHORIZED_IMEI -> Known.UNAUTHORIZED_IMEI
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                iccid == other.iccid &&
                msisdn == other.msisdn &&
                status == other.status &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(iccid, msisdn, status, tags, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{iccid=$iccid, msisdn=$msisdn, status=$status, tags=$tags, additionalProperties=$additionalProperties}"
    }

    /**
     * Consolidated pagination parameter (deepObject style). Originally: page[number], page[size]
     */
    class Page
    private constructor(
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** The page number to load. */
        fun number(): Optional<Long> = Optional.ofNullable(number)

        /** The size of the page. */
        fun size(): Optional<Long> = Optional.ofNullable(size)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var number: Long? = null
            private var size: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                number = page.number
                size = page.size
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** The page number to load. */
            fun number(number: Long?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Long) = number(number as Long?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Long>) = number(number.getOrNull())

            /** The size of the page. */
            fun size(size: Long?) = apply { this.size = size }

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Long) = size(size as Long?)

            /** Alias for calling [Builder.size] with `size.orElse(null)`. */
            fun size(size: Optional<Long>) = size(size.getOrNull())

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
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Page = Page(number, size, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                number == other.number &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(number, size, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{number=$number, size=$size, additionalProperties=$additionalProperties}"
    }

    /**
     * Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed with
     * a minus sign.
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

            @JvmField
            val CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT =
                of("current_billing_period_consumed_data.amount")

            @JvmField
            val minus_CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT =
                of("-current_billing_period_consumed_data.amount")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT,
            minus_CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT,
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
            CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT,
            minus_CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT,
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
                CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT ->
                    Value.CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT
                minus_CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT ->
                    Value.minus_CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT
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
                CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT ->
                    Known.CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT
                minus_CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT ->
                    Known.minus_CURRENT_BILLING_PERIOD_CONSUMED_DATA_AMOUNT
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

        return other is SimCardListParams &&
            filter == other.filter &&
            filterSimCardGroupId == other.filterSimCardGroupId &&
            includeSimCardGroup == other.includeSimCardGroup &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filter,
            filterSimCardGroupId,
            includeSimCardGroup,
            page,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SimCardListParams{filter=$filter, filterSimCardGroupId=$filterSimCardGroupId, includeSimCardGroup=$includeSimCardGroup, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
