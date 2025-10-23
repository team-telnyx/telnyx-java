// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

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

/** Get all outbound voice profiles belonging to the user that match the given filters. */
class OutboundVoiceProfileListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Consolidated filter parameter (deepObject style). Originally: filter[name][contains] */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /**
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>name</code>: sorts the result by the <code>name</code> field in ascending order.
     *   </li>
     * <li> <code>-name</code>: sorts the result by the <code>name</code> field in descending order.
     *   </li> </ul> <br/>
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OutboundVoiceProfileListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [OutboundVoiceProfileListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OutboundVoiceProfileListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(outboundVoiceProfileListParams: OutboundVoiceProfileListParams) = apply {
            filter = outboundVoiceProfileListParams.filter
            page = outboundVoiceProfileListParams.page
            sort = outboundVoiceProfileListParams.sort
            additionalHeaders = outboundVoiceProfileListParams.additionalHeaders.toBuilder()
            additionalQueryParams = outboundVoiceProfileListParams.additionalQueryParams.toBuilder()
        }

        /** Consolidated filter parameter (deepObject style). Originally: filter[name][contains] */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /**
         * Specifies the sort order for results. By default sorting direction is ascending. To have
         * the results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is:
         * <ul>
         * <li> <code>name</code>: sorts the result by the <code>name</code> field in ascending
         *   order. </li>
         * <li> <code>-name</code>: sorts the result by the <code>name</code> field in descending
         *   order. </li> </ul> <br/>
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
         * Returns an immutable instance of [OutboundVoiceProfileListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OutboundVoiceProfileListParams =
            OutboundVoiceProfileListParams(
                filter,
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
                    it.name().ifPresent {
                        it.contains().ifPresent { put("filter[name][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[name][$key]", value)
                            }
                        }
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
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

    /** Consolidated filter parameter (deepObject style). Originally: filter[name][contains] */
    class Filter
    private constructor(private val name: Name?, private val additionalProperties: QueryParams) {

        /** Name filtering operations */
        fun name(): Optional<Name> = Optional.ofNullable(name)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var name: Name? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                name = filter.name
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Name filtering operations */
            fun name(name: Name?) = apply { this.name = name }

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<Name>) = name(name.getOrNull())

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
            fun build(): Filter = Filter(name, additionalProperties.build())
        }

        /** Name filtering operations */
        class Name
        private constructor(
            private val contains: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Optional filter on outbound voice profile name. */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Name]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Name]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(name: Name) = apply {
                    contains = name.contains
                    additionalProperties = name.additionalProperties.toBuilder()
                }

                /** Optional filter on outbound voice profile name. */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [Name].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Name = Name(contains, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Name &&
                    contains == other.contains &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contains, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Name{contains=$contains, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filter{name=$name, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
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
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>name</code>: sorts the result by the <code>name</code> field in ascending order.
     *   </li>
     * <li> <code>-name</code>: sorts the result by the <code>name</code> field in descending order.
     *   </li> </ul> <br/>
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

            @JvmField val ENABLED = of("enabled")

            @JvmField val ENABLED_DESC = of("-enabled")

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val CREATED_AT_DESC = of("-created_at")

            @JvmField val NAME = of("name")

            @JvmField val NAME_DESC = of("-name")

            @JvmField val SERVICE_PLAN = of("service_plan")

            @JvmField val SERVICE_PLAN_DESC = of("-service_plan")

            @JvmField val TRAFFIC_TYPE = of("traffic_type")

            @JvmField val TRAFFIC_TYPE_DESC = of("-traffic_type")

            @JvmField val USAGE_PAYMENT_METHOD = of("usage_payment_method")

            @JvmField val USAGE_PAYMENT_METHOD_DESC = of("-usage_payment_method")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            ENABLED,
            ENABLED_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            NAME,
            NAME_DESC,
            SERVICE_PLAN,
            SERVICE_PLAN_DESC,
            TRAFFIC_TYPE,
            TRAFFIC_TYPE_DESC,
            USAGE_PAYMENT_METHOD,
            USAGE_PAYMENT_METHOD_DESC,
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
            ENABLED,
            ENABLED_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
            NAME,
            NAME_DESC,
            SERVICE_PLAN,
            SERVICE_PLAN_DESC,
            TRAFFIC_TYPE,
            TRAFFIC_TYPE_DESC,
            USAGE_PAYMENT_METHOD,
            USAGE_PAYMENT_METHOD_DESC,
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
                ENABLED -> Value.ENABLED
                ENABLED_DESC -> Value.ENABLED_DESC
                CREATED_AT -> Value.CREATED_AT
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
                NAME -> Value.NAME
                NAME_DESC -> Value.NAME_DESC
                SERVICE_PLAN -> Value.SERVICE_PLAN
                SERVICE_PLAN_DESC -> Value.SERVICE_PLAN_DESC
                TRAFFIC_TYPE -> Value.TRAFFIC_TYPE
                TRAFFIC_TYPE_DESC -> Value.TRAFFIC_TYPE_DESC
                USAGE_PAYMENT_METHOD -> Value.USAGE_PAYMENT_METHOD
                USAGE_PAYMENT_METHOD_DESC -> Value.USAGE_PAYMENT_METHOD_DESC
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
                ENABLED -> Known.ENABLED
                ENABLED_DESC -> Known.ENABLED_DESC
                CREATED_AT -> Known.CREATED_AT
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
                NAME -> Known.NAME
                NAME_DESC -> Known.NAME_DESC
                SERVICE_PLAN -> Known.SERVICE_PLAN
                SERVICE_PLAN_DESC -> Known.SERVICE_PLAN_DESC
                TRAFFIC_TYPE -> Known.TRAFFIC_TYPE
                TRAFFIC_TYPE_DESC -> Known.TRAFFIC_TYPE_DESC
                USAGE_PAYMENT_METHOD -> Known.USAGE_PAYMENT_METHOD
                USAGE_PAYMENT_METHOD_DESC -> Known.USAGE_PAYMENT_METHOD_DESC
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

        return other is OutboundVoiceProfileListParams &&
            filter == other.filter &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OutboundVoiceProfileListParams{filter=$filter, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
