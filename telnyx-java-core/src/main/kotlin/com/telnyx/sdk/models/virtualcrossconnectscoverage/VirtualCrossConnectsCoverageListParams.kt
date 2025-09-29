// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnectscoverage

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List Virtual Cross Connects Cloud Coverage.<br /><br />This endpoint shows which cloud regions
 * are available for the `location_code` your Virtual Cross Connect will be provisioned in.
 */
class VirtualCrossConnectsCoverageListParams
private constructor(
    private val filter: Filter?,
    private val filters: Filters?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[cloud_provider],
     * filter[cloud_provider_region], filter[location.region], filter[location.site],
     * filter[location.pop], filter[location.code]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /**
     * Consolidated filters parameter (deepObject style). Originally:
     * filters[available_bandwidth][contains]
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

        @JvmStatic fun none(): VirtualCrossConnectsCoverageListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualCrossConnectsCoverageListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectsCoverageListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var filters: Filters? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            virtualCrossConnectsCoverageListParams: VirtualCrossConnectsCoverageListParams
        ) = apply {
            filter = virtualCrossConnectsCoverageListParams.filter
            filters = virtualCrossConnectsCoverageListParams.filters
            page = virtualCrossConnectsCoverageListParams.page
            additionalHeaders = virtualCrossConnectsCoverageListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                virtualCrossConnectsCoverageListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[cloud_provider],
         * filter[cloud_provider_region], filter[location.region], filter[location.site],
         * filter[location.pop], filter[location.code]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Consolidated filters parameter (deepObject style). Originally:
         * filters[available_bandwidth][contains]
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
         * Returns an immutable instance of [VirtualCrossConnectsCoverageListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams(
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
                    it.cloudProvider().ifPresent { put("filter[cloud_provider]", it.toString()) }
                    it.cloudProviderRegion().ifPresent { put("filter[cloud_provider_region]", it) }
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
                    it.availableBandwidth().ifPresent {
                        it.accept(
                            object : Filters.AvailableBandwidth.Visitor<Unit> {
                                override fun visitInteger(integer: Long) {
                                    put("filters[available_bandwidth]", integer.toString())
                                }

                                override fun visitContains(
                                    contains: Filters.AvailableBandwidth.Contains
                                ) {
                                    contains.contains().ifPresent {
                                        put("filters[available_bandwidth][contains]", it.toString())
                                    }
                                    contains._additionalProperties().keys().forEach { key ->
                                        contains._additionalProperties().values(key).forEach { value
                                            ->
                                            put("filters[available_bandwidth][$key]", value)
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
     * Consolidated filter parameter (deepObject style). Originally: filter[cloud_provider],
     * filter[cloud_provider_region], filter[location.region], filter[location.site],
     * filter[location.pop], filter[location.code]
     */
    class Filter
    private constructor(
        private val cloudProvider: CloudProvider?,
        private val cloudProviderRegion: String?,
        private val locationCode: String?,
        private val locationPop: String?,
        private val locationRegion: String?,
        private val locationSite: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** The Virtual Private Cloud provider. */
        fun cloudProvider(): Optional<CloudProvider> = Optional.ofNullable(cloudProvider)

        /** The region of specific cloud provider. */
        fun cloudProviderRegion(): Optional<String> = Optional.ofNullable(cloudProviderRegion)

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

            private var cloudProvider: CloudProvider? = null
            private var cloudProviderRegion: String? = null
            private var locationCode: String? = null
            private var locationPop: String? = null
            private var locationRegion: String? = null
            private var locationSite: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                cloudProvider = filter.cloudProvider
                cloudProviderRegion = filter.cloudProviderRegion
                locationCode = filter.locationCode
                locationPop = filter.locationPop
                locationRegion = filter.locationRegion
                locationSite = filter.locationSite
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** The Virtual Private Cloud provider. */
            fun cloudProvider(cloudProvider: CloudProvider?) = apply {
                this.cloudProvider = cloudProvider
            }

            /** Alias for calling [Builder.cloudProvider] with `cloudProvider.orElse(null)`. */
            fun cloudProvider(cloudProvider: Optional<CloudProvider>) =
                cloudProvider(cloudProvider.getOrNull())

            /** The region of specific cloud provider. */
            fun cloudProviderRegion(cloudProviderRegion: String?) = apply {
                this.cloudProviderRegion = cloudProviderRegion
            }

            /**
             * Alias for calling [Builder.cloudProviderRegion] with
             * `cloudProviderRegion.orElse(null)`.
             */
            fun cloudProviderRegion(cloudProviderRegion: Optional<String>) =
                cloudProviderRegion(cloudProviderRegion.getOrNull())

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
                    cloudProvider,
                    cloudProviderRegion,
                    locationCode,
                    locationPop,
                    locationRegion,
                    locationSite,
                    additionalProperties.build(),
                )
        }

        /** The Virtual Private Cloud provider. */
        class CloudProvider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val AWS = of("aws")

                @JvmField val AZURE = of("azure")

                @JvmField val GCE = of("gce")

                @JvmStatic fun of(value: String) = CloudProvider(JsonField.of(value))
            }

            /** An enum containing [CloudProvider]'s known values. */
            enum class Known {
                AWS,
                AZURE,
                GCE,
            }

            /**
             * An enum containing [CloudProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CloudProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS,
                AZURE,
                GCE,
                /**
                 * An enum member indicating that [CloudProvider] was instantiated with an unknown
                 * value.
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
                    AWS -> Value.AWS
                    AZURE -> Value.AZURE
                    GCE -> Value.GCE
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
                    AWS -> Known.AWS
                    AZURE -> Known.AZURE
                    GCE -> Known.GCE
                    else -> throw TelnyxInvalidDataException("Unknown CloudProvider: $value")
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

            fun validate(): CloudProvider = apply {
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

                return other is CloudProvider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                cloudProvider == other.cloudProvider &&
                cloudProviderRegion == other.cloudProviderRegion &&
                locationCode == other.locationCode &&
                locationPop == other.locationPop &&
                locationRegion == other.locationRegion &&
                locationSite == other.locationSite &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cloudProvider,
                cloudProviderRegion,
                locationCode,
                locationPop,
                locationRegion,
                locationSite,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{cloudProvider=$cloudProvider, cloudProviderRegion=$cloudProviderRegion, locationCode=$locationCode, locationPop=$locationPop, locationRegion=$locationRegion, locationSite=$locationSite, additionalProperties=$additionalProperties}"
    }

    /**
     * Consolidated filters parameter (deepObject style). Originally:
     * filters[available_bandwidth][contains]
     */
    class Filters
    private constructor(
        private val availableBandwidth: AvailableBandwidth?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by exact available bandwidth match */
        fun availableBandwidth(): Optional<AvailableBandwidth> =
            Optional.ofNullable(availableBandwidth)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filters]. */
        class Builder internal constructor() {

            private var availableBandwidth: AvailableBandwidth? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                availableBandwidth = filters.availableBandwidth
                additionalProperties = filters.additionalProperties.toBuilder()
            }

            /** Filter by exact available bandwidth match */
            fun availableBandwidth(availableBandwidth: AvailableBandwidth?) = apply {
                this.availableBandwidth = availableBandwidth
            }

            /**
             * Alias for calling [Builder.availableBandwidth] with
             * `availableBandwidth.orElse(null)`.
             */
            fun availableBandwidth(availableBandwidth: Optional<AvailableBandwidth>) =
                availableBandwidth(availableBandwidth.getOrNull())

            /**
             * Alias for calling [availableBandwidth] with `AvailableBandwidth.ofInteger(integer)`.
             */
            fun availableBandwidth(integer: Long) =
                availableBandwidth(AvailableBandwidth.ofInteger(integer))

            /**
             * Alias for calling [availableBandwidth] with
             * `AvailableBandwidth.ofContains(contains)`.
             */
            fun availableBandwidth(contains: AvailableBandwidth.Contains) =
                availableBandwidth(AvailableBandwidth.ofContains(contains))

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
            fun build(): Filters = Filters(availableBandwidth, additionalProperties.build())
        }

        /** Filter by exact available bandwidth match */
        class AvailableBandwidth
        private constructor(
            private val integer: Long? = null,
            private val contains: Contains? = null,
        ) {

            /** Filter by exact available bandwidth match */
            fun integer(): Optional<Long> = Optional.ofNullable(integer)

            /** Available bandwidth filtering operations */
            fun contains(): Optional<Contains> = Optional.ofNullable(contains)

            fun isInteger(): Boolean = integer != null

            fun isContains(): Boolean = contains != null

            /** Filter by exact available bandwidth match */
            fun asInteger(): Long = integer.getOrThrow("integer")

            /** Available bandwidth filtering operations */
            fun asContains(): Contains = contains.getOrThrow("contains")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    integer != null -> visitor.visitInteger(integer)
                    contains != null -> visitor.visitContains(contains)
                    else -> throw IllegalStateException("Invalid AvailableBandwidth")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AvailableBandwidth &&
                    integer == other.integer &&
                    contains == other.contains
            }

            override fun hashCode(): Int = Objects.hash(integer, contains)

            override fun toString(): String =
                when {
                    integer != null -> "AvailableBandwidth{integer=$integer}"
                    contains != null -> "AvailableBandwidth{contains=$contains}"
                    else -> throw IllegalStateException("Invalid AvailableBandwidth")
                }

            companion object {

                /** Filter by exact available bandwidth match */
                @JvmStatic fun ofInteger(integer: Long) = AvailableBandwidth(integer = integer)

                /** Available bandwidth filtering operations */
                @JvmStatic
                fun ofContains(contains: Contains) = AvailableBandwidth(contains = contains)
            }

            /**
             * An interface that defines how to map each variant of [AvailableBandwidth] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                /** Filter by exact available bandwidth match */
                fun visitInteger(integer: Long): T

                /** Available bandwidth filtering operations */
                fun visitContains(contains: Contains): T
            }

            /** Available bandwidth filtering operations */
            class Contains private constructor(private val contains: Long?) {

                /** Filter by available bandwidth containing the specified value */
                fun contains(): Optional<Long> = Optional.ofNullable(contains)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Contains]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contains]. */
                class Builder internal constructor() {

                    private var contains: Long? = null

                    @JvmSynthetic
                    internal fun from(contains: Contains) = apply {
                        this.contains = contains.contains
                    }

                    /** Filter by available bandwidth containing the specified value */
                    fun contains(contains: Long?) = apply { this.contains = contains }

                    /**
                     * Alias for [Builder.contains].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun contains(contains: Long) = contains(contains as Long?)

                    /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                    fun contains(contains: Optional<Long>) = contains(contains.getOrNull())

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
                availableBandwidth == other.availableBandwidth &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(availableBandwidth, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filters{availableBandwidth=$availableBandwidth, additionalProperties=$additionalProperties}"
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

        return other is VirtualCrossConnectsCoverageListParams &&
            filter == other.filter &&
            filters == other.filters &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, filters, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VirtualCrossConnectsCoverageListParams{filter=$filter, filters=$filters, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
