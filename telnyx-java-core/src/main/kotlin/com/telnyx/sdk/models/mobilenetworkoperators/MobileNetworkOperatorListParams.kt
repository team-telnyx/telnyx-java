// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilenetworkoperators

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Telnyx has a set of GSM mobile operators partners that are available through our mobile network
 * roaming. This resource is entirely managed by Telnyx and may change over time. That means that
 * this resource won't allow any write operations for it. Still, it's available so it can be used as
 * a support resource that can be related to other resources or become a configuration option.
 */
class MobileNetworkOperatorListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter for mobile network operators (deepObject style). Originally:
     * filter[name][starts_with], filter[name][contains], filter[name][ends_with],
     * filter[country_code], filter[mcc], filter[mnc], filter[tadig],
     * filter[network_preferences_enabled]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /**
     * Consolidated pagination parameter (deepObject style). Originally: page[number], page[size]
     */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MobileNetworkOperatorListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobileNetworkOperatorListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MobileNetworkOperatorListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mobileNetworkOperatorListParams: MobileNetworkOperatorListParams) =
            apply {
                filter = mobileNetworkOperatorListParams.filter
                page = mobileNetworkOperatorListParams.page
                additionalHeaders = mobileNetworkOperatorListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    mobileNetworkOperatorListParams.additionalQueryParams.toBuilder()
            }

        /**
         * Consolidated filter parameter for mobile network operators (deepObject style).
         * Originally: filter[name][starts_with], filter[name][contains], filter[name][ends_with],
         * filter[country_code], filter[mcc], filter[mnc], filter[tadig],
         * filter[network_preferences_enabled]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Consolidated pagination parameter (deepObject style). Originally: page[number],
         * page[size]
         */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

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
         * Returns an immutable instance of [MobileNetworkOperatorListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MobileNetworkOperatorListParams =
            MobileNetworkOperatorListParams(
                filter,
                page,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.countryCode().ifPresent { put("filter[country_code]", it) }
                    it.mcc().ifPresent { put("filter[mcc]", it) }
                    it.mnc().ifPresent { put("filter[mnc]", it) }
                    it.name().ifPresent {
                        it.contains().ifPresent { put("filter[name][contains]", it) }
                        it.endsWith().ifPresent { put("filter[name][ends_with]", it) }
                        it.startsWith().ifPresent { put("filter[name][starts_with]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[name][$key]", value)
                            }
                        }
                    }
                    it.networkPreferencesEnabled().ifPresent {
                        put("filter[network_preferences_enabled]", it.toString())
                    }
                    it.tadig().ifPresent { put("filter[tadig]", it) }
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
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter for mobile network operators (deepObject style). Originally:
     * filter[name][starts_with], filter[name][contains], filter[name][ends_with],
     * filter[country_code], filter[mcc], filter[mnc], filter[tadig],
     * filter[network_preferences_enabled]
     */
    class Filter
    private constructor(
        private val countryCode: String?,
        private val mcc: String?,
        private val mnc: String?,
        private val name: Name?,
        private val networkPreferencesEnabled: Boolean?,
        private val tadig: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by exact country_code. */
        fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

        /** Filter by exact MCC. */
        fun mcc(): Optional<String> = Optional.ofNullable(mcc)

        /** Filter by exact MNC. */
        fun mnc(): Optional<String> = Optional.ofNullable(mnc)

        /** Advanced name filtering operations */
        fun name(): Optional<Name> = Optional.ofNullable(name)

        /** Filter by network_preferences_enabled. */
        fun networkPreferencesEnabled(): Optional<Boolean> =
            Optional.ofNullable(networkPreferencesEnabled)

        /** Filter by exact TADIG. */
        fun tadig(): Optional<String> = Optional.ofNullable(tadig)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var countryCode: String? = null
            private var mcc: String? = null
            private var mnc: String? = null
            private var name: Name? = null
            private var networkPreferencesEnabled: Boolean? = null
            private var tadig: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                countryCode = filter.countryCode
                mcc = filter.mcc
                mnc = filter.mnc
                name = filter.name
                networkPreferencesEnabled = filter.networkPreferencesEnabled
                tadig = filter.tadig
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by exact country_code. */
            fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

            /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
            fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

            /** Filter by exact MCC. */
            fun mcc(mcc: String?) = apply { this.mcc = mcc }

            /** Alias for calling [Builder.mcc] with `mcc.orElse(null)`. */
            fun mcc(mcc: Optional<String>) = mcc(mcc.getOrNull())

            /** Filter by exact MNC. */
            fun mnc(mnc: String?) = apply { this.mnc = mnc }

            /** Alias for calling [Builder.mnc] with `mnc.orElse(null)`. */
            fun mnc(mnc: Optional<String>) = mnc(mnc.getOrNull())

            /** Advanced name filtering operations */
            fun name(name: Name?) = apply { this.name = name }

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<Name>) = name(name.getOrNull())

            /** Filter by network_preferences_enabled. */
            fun networkPreferencesEnabled(networkPreferencesEnabled: Boolean?) = apply {
                this.networkPreferencesEnabled = networkPreferencesEnabled
            }

            /**
             * Alias for [Builder.networkPreferencesEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun networkPreferencesEnabled(networkPreferencesEnabled: Boolean) =
                networkPreferencesEnabled(networkPreferencesEnabled as Boolean?)

            /**
             * Alias for calling [Builder.networkPreferencesEnabled] with
             * `networkPreferencesEnabled.orElse(null)`.
             */
            fun networkPreferencesEnabled(networkPreferencesEnabled: Optional<Boolean>) =
                networkPreferencesEnabled(networkPreferencesEnabled.getOrNull())

            /** Filter by exact TADIG. */
            fun tadig(tadig: String?) = apply { this.tadig = tadig }

            /** Alias for calling [Builder.tadig] with `tadig.orElse(null)`. */
            fun tadig(tadig: Optional<String>) = tadig(tadig.getOrNull())

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
                    countryCode,
                    mcc,
                    mnc,
                    name,
                    networkPreferencesEnabled,
                    tadig,
                    additionalProperties.build(),
                )
        }

        /** Advanced name filtering operations */
        class Name
        private constructor(
            private val contains: String?,
            private val endsWith: String?,
            private val startsWith: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter by name containing match. */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Filter by name ending with. */
            fun endsWith(): Optional<String> = Optional.ofNullable(endsWith)

            /** Filter by name starting with. */
            fun startsWith(): Optional<String> = Optional.ofNullable(startsWith)

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
                private var endsWith: String? = null
                private var startsWith: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(name: Name) = apply {
                    contains = name.contains
                    endsWith = name.endsWith
                    startsWith = name.startsWith
                    additionalProperties = name.additionalProperties.toBuilder()
                }

                /** Filter by name containing match. */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /** Filter by name ending with. */
                fun endsWith(endsWith: String?) = apply { this.endsWith = endsWith }

                /** Alias for calling [Builder.endsWith] with `endsWith.orElse(null)`. */
                fun endsWith(endsWith: Optional<String>) = endsWith(endsWith.getOrNull())

                /** Filter by name starting with. */
                fun startsWith(startsWith: String?) = apply { this.startsWith = startsWith }

                /** Alias for calling [Builder.startsWith] with `startsWith.orElse(null)`. */
                fun startsWith(startsWith: Optional<String>) = startsWith(startsWith.getOrNull())

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
                fun build(): Name =
                    Name(contains, endsWith, startsWith, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Name &&
                    contains == other.contains &&
                    endsWith == other.endsWith &&
                    startsWith == other.startsWith &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contains, endsWith, startsWith, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Name{contains=$contains, endsWith=$endsWith, startsWith=$startsWith, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                countryCode == other.countryCode &&
                mcc == other.mcc &&
                mnc == other.mnc &&
                name == other.name &&
                networkPreferencesEnabled == other.networkPreferencesEnabled &&
                tadig == other.tadig &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                countryCode,
                mcc,
                mnc,
                name,
                networkPreferencesEnabled,
                tadig,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{countryCode=$countryCode, mcc=$mcc, mnc=$mnc, name=$name, networkPreferencesEnabled=$networkPreferencesEnabled, tadig=$tadig, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobileNetworkOperatorListParams &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MobileNetworkOperatorListParams{filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
