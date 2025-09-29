// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.networkcoverage

import com.telnyx.api.core.Params
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all locations and the interfaces that region supports */
class NetworkCoverageListParams
private constructor(
    private val filter: Filter?,
    private val filters: Filters?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[location.region],
     * filter[location.site], filter[location.pop], filter[location.code]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /**
     * Consolidated filters parameter (deepObject style). Originally:
     * filters[available_services][contains]
     */
    fun filters(): Optional<Filters> = Optional.ofNullable(filters)

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): NetworkCoverageListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [NetworkCoverageListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetworkCoverageListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var filters: Filters? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(networkCoverageListParams: NetworkCoverageListParams) = apply {
            filter = networkCoverageListParams.filter
            filters = networkCoverageListParams.filters
            page = networkCoverageListParams.page
            additionalHeaders = networkCoverageListParams.additionalHeaders.toBuilder()
            additionalQueryParams = networkCoverageListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[location.region],
         * filter[location.site], filter[location.pop], filter[location.code]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Consolidated filters parameter (deepObject style). Originally:
         * filters[available_services][contains]
         */
        fun filters(filters: Filters?) = apply { this.filters = filters }

        /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
        fun filters(filters: Optional<Filters>) = filters(filters.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
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
         * Returns an immutable instance of [NetworkCoverageListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NetworkCoverageListParams =
            NetworkCoverageListParams(
                filter,
                filters,
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
                    it.locationCode().ifPresent { put("filter[location.code]", it) }
                    it.locationPop().ifPresent { put("filter[location.pop]", it) }
                    it.locationRegion().ifPresent { put("filter[location.region]", it) }
                    it.locationSite().ifPresent { put("filter[location.site]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                filters?.let {
                    it.availableServices().ifPresent {
                        it.accept(
                            object : Filters.AvailableServices.Visitor<Unit> {
                                override fun visitService(service: AvailableService) {
                                    put("filters[available_services]", service.toString())
                                }

                                override fun visitContains(
                                    contains: Filters.AvailableServices.Contains
                                ) {
                                    contains.contains().ifPresent {
                                        put("filters[available_services][contains]", it.toString())
                                    }
                                    contains._additionalProperties().keys().forEach { key ->
                                        contains._additionalProperties().values(key).forEach { value
                                            ->
                                            put("filters[available_services][$key]", value)
                                        }
                                    }
                                }
                            }
                        )
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filters[$key]", value)
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
     * Consolidated filter parameter (deepObject style). Originally: filter[location.region],
     * filter[location.site], filter[location.pop], filter[location.code]
     */
    class Filter
    private constructor(
        private val locationCode: String?,
        private val locationPop: String?,
        private val locationRegion: String?,
        private val locationSite: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** The code of associated location to filter on. */
        fun locationCode(): Optional<String> = Optional.ofNullable(locationCode)

        /** The POP of associated location to filter on. */
        fun locationPop(): Optional<String> = Optional.ofNullable(locationPop)

        /** The region of associated location to filter on. */
        fun locationRegion(): Optional<String> = Optional.ofNullable(locationRegion)

        /** The site of associated location to filter on. */
        fun locationSite(): Optional<String> = Optional.ofNullable(locationSite)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var locationCode: String? = null
            private var locationPop: String? = null
            private var locationRegion: String? = null
            private var locationSite: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                locationCode = filter.locationCode
                locationPop = filter.locationPop
                locationRegion = filter.locationRegion
                locationSite = filter.locationSite
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** The code of associated location to filter on. */
            fun locationCode(locationCode: String?) = apply { this.locationCode = locationCode }

            /** Alias for calling [Builder.locationCode] with `locationCode.orElse(null)`. */
            fun locationCode(locationCode: Optional<String>) =
                locationCode(locationCode.getOrNull())

            /** The POP of associated location to filter on. */
            fun locationPop(locationPop: String?) = apply { this.locationPop = locationPop }

            /** Alias for calling [Builder.locationPop] with `locationPop.orElse(null)`. */
            fun locationPop(locationPop: Optional<String>) = locationPop(locationPop.getOrNull())

            /** The region of associated location to filter on. */
            fun locationRegion(locationRegion: String?) = apply {
                this.locationRegion = locationRegion
            }

            /** Alias for calling [Builder.locationRegion] with `locationRegion.orElse(null)`. */
            fun locationRegion(locationRegion: Optional<String>) =
                locationRegion(locationRegion.getOrNull())

            /** The site of associated location to filter on. */
            fun locationSite(locationSite: String?) = apply { this.locationSite = locationSite }

            /** Alias for calling [Builder.locationSite] with `locationSite.orElse(null)`. */
            fun locationSite(locationSite: Optional<String>) =
                locationSite(locationSite.getOrNull())

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
                    locationCode,
                    locationPop,
                    locationRegion,
                    locationSite,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                locationCode == other.locationCode &&
                locationPop == other.locationPop &&
                locationRegion == other.locationRegion &&
                locationSite == other.locationSite &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                locationCode,
                locationPop,
                locationRegion,
                locationSite,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{locationCode=$locationCode, locationPop=$locationPop, locationRegion=$locationRegion, locationSite=$locationSite, additionalProperties=$additionalProperties}"
    }

    /**
     * Consolidated filters parameter (deepObject style). Originally:
     * filters[available_services][contains]
     */
    class Filters
    private constructor(
        private val availableServices: AvailableServices?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by exact available service match */
        fun availableServices(): Optional<AvailableServices> =
            Optional.ofNullable(availableServices)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filters]. */
        class Builder internal constructor() {

            private var availableServices: AvailableServices? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                availableServices = filters.availableServices
                additionalProperties = filters.additionalProperties.toBuilder()
            }

            /** Filter by exact available service match */
            fun availableServices(availableServices: AvailableServices?) = apply {
                this.availableServices = availableServices
            }

            /**
             * Alias for calling [Builder.availableServices] with `availableServices.orElse(null)`.
             */
            fun availableServices(availableServices: Optional<AvailableServices>) =
                availableServices(availableServices.getOrNull())

            /**
             * Alias for calling [availableServices] with `AvailableServices.ofService(service)`.
             */
            fun availableServices(service: AvailableService) =
                availableServices(AvailableServices.ofService(service))

            /**
             * Alias for calling [availableServices] with `AvailableServices.ofContains(contains)`.
             */
            fun availableServices(contains: AvailableServices.Contains) =
                availableServices(AvailableServices.ofContains(contains))

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
             * Returns an immutable instance of [Filters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filters = Filters(availableServices, additionalProperties.build())
        }

        /** Filter by exact available service match */
        class AvailableServices
        private constructor(
            private val service: AvailableService? = null,
            private val contains: Contains? = null,
        ) {

            /** Filter by exact available service match */
            fun service(): Optional<AvailableService> = Optional.ofNullable(service)

            /** Available service filtering operations */
            fun contains(): Optional<Contains> = Optional.ofNullable(contains)

            fun isService(): Boolean = service != null

            fun isContains(): Boolean = contains != null

            /** Filter by exact available service match */
            fun asService(): AvailableService = service.getOrThrow("service")

            /** Available service filtering operations */
            fun asContains(): Contains = contains.getOrThrow("contains")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    service != null -> visitor.visitService(service)
                    contains != null -> visitor.visitContains(contains)
                    else -> throw IllegalStateException("Invalid AvailableServices")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AvailableServices &&
                    service == other.service &&
                    contains == other.contains
            }

            override fun hashCode(): Int = Objects.hash(service, contains)

            override fun toString(): String =
                when {
                    service != null -> "AvailableServices{service=$service}"
                    contains != null -> "AvailableServices{contains=$contains}"
                    else -> throw IllegalStateException("Invalid AvailableServices")
                }

            companion object {

                /** Filter by exact available service match */
                @JvmStatic
                fun ofService(service: AvailableService) = AvailableServices(service = service)

                /** Available service filtering operations */
                @JvmStatic
                fun ofContains(contains: Contains) = AvailableServices(contains = contains)
            }

            /**
             * An interface that defines how to map each variant of [AvailableServices] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                /** Filter by exact available service match */
                fun visitService(service: AvailableService): T

                /** Available service filtering operations */
                fun visitContains(contains: Contains): T
            }

            /** Available service filtering operations */
            class Contains private constructor(private val contains: AvailableService?) {

                /** Filter by available services containing the specified service */
                fun contains(): Optional<AvailableService> = Optional.ofNullable(contains)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Contains]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contains]. */
                class Builder internal constructor() {

                    private var contains: AvailableService? = null

                    @JvmSynthetic
                    internal fun from(contains: Contains) = apply {
                        this.contains = contains.contains
                    }

                    /** Filter by available services containing the specified service */
                    fun contains(contains: AvailableService?) = apply { this.contains = contains }

                    /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                    fun contains(contains: Optional<AvailableService>) =
                        contains(contains.getOrNull())

                    /**
                     * Returns an immutable instance of [Contains].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Contains = Contains(contains)
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Contains && contains == other.contains
                }

                private val hashCode: Int by lazy { Objects.hash(contains) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Contains{contains=$contains}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filters &&
                availableServices == other.availableServices &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(availableServices, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filters{availableServices=$availableServices, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    class Page
    private constructor(
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** The page number to load */
        fun number(): Optional<Long> = Optional.ofNullable(number)

        /** The size of the page */
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

            /** The page number to load */
            fun number(number: Long?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Long) = number(number as Long?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Long>) = number(number.getOrNull())

            /** The size of the page */
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

        return other is NetworkCoverageListParams &&
            filter == other.filter &&
            filters == other.filters &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, filters, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NetworkCoverageListParams{filter=$filter, filters=$filters, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
