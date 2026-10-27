// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkroutes

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists the routes of the account's Networks. A Network's list is its effective route table: the
 * routes added with `POST /network_routes` (`origin` `static`) and the routes that its attachments
 * install (`origin` `attachment`). Lookup is longest prefix within the Network.
 */
class NetworkRouteListParams
private constructor(
    private val filter: Filter,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[network_id],
     * filter[origin], filter[next_hop.type], filter[cidr], filter[status]
     */
    fun filter(): Filter = filter

    /** Consolidated page parameter (deepObject style). Originally: page[after], page[limit] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /**
     * Sorts the results by a field, ascending, or descending with a leading `-`. The default is
     * `-created_at`.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkRouteListParams].
         *
         * The following fields are required:
         * ```java
         * .filter()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetworkRouteListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(networkRouteListParams: NetworkRouteListParams) = apply {
            filter = networkRouteListParams.filter
            page = networkRouteListParams.page
            sort = networkRouteListParams.sort
            additionalHeaders = networkRouteListParams.additionalHeaders.toBuilder()
            additionalQueryParams = networkRouteListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[network_id],
         * filter[origin], filter[next_hop.type], filter[cidr], filter[status]
         */
        fun filter(filter: Filter) = apply { this.filter = filter }

        /** Consolidated page parameter (deepObject style). Originally: page[after], page[limit] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /**
         * Sorts the results by a field, ascending, or descending with a leading `-`. The default is
         * `-created_at`.
         */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [NetworkRouteListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filter()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NetworkRouteListParams =
            NetworkRouteListParams(
                checkRequired("filter", filter),
                page,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("filter[network_id]", filter.networkId())
                filter.cidr().ifPresent { put("filter[cidr]", it) }
                filter.nextHopType().ifPresent { put("filter[next_hop.type]", it.toString()) }
                filter.origin().ifPresent { put("filter[origin]", it.toString()) }
                filter.status().ifPresent { put("filter[status]", it.toString()) }
                filter._additionalProperties().keys().forEach { key ->
                    filter._additionalProperties().values(key).forEach { value ->
                        put("filter[$key]", value)
                    }
                }
                page?.let {
                    it.after().ifPresent { put("page[after]", it) }
                    it.limit().ifPresent { put("page[limit]", it.toString()) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[network_id],
     * filter[origin], filter[next_hop.type], filter[cidr], filter[status]
     */
    class Filter
    private constructor(
        private val networkId: String,
        private val cidr: String?,
        private val nextHopType: NextHopType?,
        private val origin: Origin?,
        private val status: Status?,
        private val additionalProperties: QueryParams,
    ) {

        /** The id of the Network whose route table is returned. Required. */
        fun networkId(): String = networkId

        /** Only routes with this CIDR. */
        fun cidr(): Optional<String> = Optional.ofNullable(cidr)

        /** Only routes whose next hop has this type. */
        fun nextHopType(): Optional<NextHopType> = Optional.ofNullable(nextHopType)

        /** Only routes of this origin. */
        fun origin(): Optional<Origin> = Optional.ofNullable(origin)

        /** Only routes with this status. */
        fun status(): Optional<Status> = Optional.ofNullable(status)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Filter].
             *
             * The following fields are required:
             * ```java
             * .networkId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var networkId: String? = null
            private var cidr: String? = null
            private var nextHopType: NextHopType? = null
            private var origin: Origin? = null
            private var status: Status? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                networkId = filter.networkId
                cidr = filter.cidr
                nextHopType = filter.nextHopType
                origin = filter.origin
                status = filter.status
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** The id of the Network whose route table is returned. Required. */
            fun networkId(networkId: String) = apply { this.networkId = networkId }

            /** Only routes with this CIDR. */
            fun cidr(cidr: String?) = apply { this.cidr = cidr }

            /** Alias for calling [Builder.cidr] with `cidr.orElse(null)`. */
            fun cidr(cidr: Optional<String>) = cidr(cidr.getOrNull())

            /** Only routes whose next hop has this type. */
            fun nextHopType(nextHopType: NextHopType?) = apply { this.nextHopType = nextHopType }

            /** Alias for calling [Builder.nextHopType] with `nextHopType.orElse(null)`. */
            fun nextHopType(nextHopType: Optional<NextHopType>) =
                nextHopType(nextHopType.getOrNull())

            /** Only routes of this origin. */
            fun origin(origin: Origin?) = apply { this.origin = origin }

            /** Alias for calling [Builder.origin] with `origin.orElse(null)`. */
            fun origin(origin: Optional<Origin>) = origin(origin.getOrNull())

            /** Only routes with this status. */
            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

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
             *
             * The following fields are required:
             * ```java
             * .networkId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Filter =
                Filter(
                    checkRequired("networkId", networkId),
                    cidr,
                    nextHopType,
                    origin,
                    status,
                    additionalProperties.build(),
                )
        }

        /** Only routes whose next hop has this type. */
        class NextHopType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val TUNNEL = of("tunnel")

                @JvmField val WIREGUARD_PEER = of("wireguard_peer")

                @JvmField val WIREGUARD_INTERFACE = of("wireguard_interface")

                @JvmField val PRIVATE_WIRELESS_GATEWAY = of("private_wireless_gateway")

                @JvmField val VIRTUAL_CROSS_CONNECT = of("virtual_cross_connect")

                @JvmField val IPSEC_TUNNEL = of("ipsec_tunnel")

                @JvmField val PUBLIC_INTERNET_GATEWAY = of("public_internet_gateway")

                @JvmStatic fun of(value: String) = NextHopType(JsonField.of(value))
            }

            /** An enum containing [NextHopType]'s known values. */
            enum class Known {
                TUNNEL,
                WIREGUARD_PEER,
                WIREGUARD_INTERFACE,
                PRIVATE_WIRELESS_GATEWAY,
                VIRTUAL_CROSS_CONNECT,
                IPSEC_TUNNEL,
                PUBLIC_INTERNET_GATEWAY,
            }

            /**
             * An enum containing [NextHopType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [NextHopType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TUNNEL,
                WIREGUARD_PEER,
                WIREGUARD_INTERFACE,
                PRIVATE_WIRELESS_GATEWAY,
                VIRTUAL_CROSS_CONNECT,
                IPSEC_TUNNEL,
                PUBLIC_INTERNET_GATEWAY,
                /**
                 * An enum member indicating that [NextHopType] was instantiated with an unknown
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
                    TUNNEL -> Value.TUNNEL
                    WIREGUARD_PEER -> Value.WIREGUARD_PEER
                    WIREGUARD_INTERFACE -> Value.WIREGUARD_INTERFACE
                    PRIVATE_WIRELESS_GATEWAY -> Value.PRIVATE_WIRELESS_GATEWAY
                    VIRTUAL_CROSS_CONNECT -> Value.VIRTUAL_CROSS_CONNECT
                    IPSEC_TUNNEL -> Value.IPSEC_TUNNEL
                    PUBLIC_INTERNET_GATEWAY -> Value.PUBLIC_INTERNET_GATEWAY
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
                    TUNNEL -> Known.TUNNEL
                    WIREGUARD_PEER -> Known.WIREGUARD_PEER
                    WIREGUARD_INTERFACE -> Known.WIREGUARD_INTERFACE
                    PRIVATE_WIRELESS_GATEWAY -> Known.PRIVATE_WIRELESS_GATEWAY
                    VIRTUAL_CROSS_CONNECT -> Known.VIRTUAL_CROSS_CONNECT
                    IPSEC_TUNNEL -> Known.IPSEC_TUNNEL
                    PUBLIC_INTERNET_GATEWAY -> Known.PUBLIC_INTERNET_GATEWAY
                    else -> throw TelnyxInvalidDataException("Unknown NextHopType: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): NextHopType = apply {
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

                return other is NextHopType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Only routes of this origin. */
        class Origin @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val STATIC = of("static")

                @JvmField val ATTACHMENT = of("attachment")

                @JvmStatic fun of(value: String) = Origin(JsonField.of(value))
            }

            /** An enum containing [Origin]'s known values. */
            enum class Known {
                STATIC,
                ATTACHMENT,
            }

            /**
             * An enum containing [Origin]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Origin] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STATIC,
                ATTACHMENT,
                /**
                 * An enum member indicating that [Origin] was instantiated with an unknown value.
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
                    STATIC -> Value.STATIC
                    ATTACHMENT -> Value.ATTACHMENT
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
                    STATIC -> Known.STATIC
                    ATTACHMENT -> Known.ATTACHMENT
                    else -> throw TelnyxInvalidDataException("Unknown Origin: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Origin = apply {
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

                return other is Origin && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Only routes with this status. */
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

                @JvmField val PENDING = of("pending")

                @JvmField val ACTIVE = of("active")

                @JvmField val INACTIVE = of("inactive")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                ACTIVE,
                INACTIVE,
                FAILED,
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
                PENDING,
                ACTIVE,
                INACTIVE,
                FAILED,
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
                    PENDING -> Value.PENDING
                    ACTIVE -> Value.ACTIVE
                    INACTIVE -> Value.INACTIVE
                    FAILED -> Value.FAILED
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
                    PENDING -> Known.PENDING
                    ACTIVE -> Known.ACTIVE
                    INACTIVE -> Known.INACTIVE
                    FAILED -> Known.FAILED
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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
                networkId == other.networkId &&
                cidr == other.cidr &&
                nextHopType == other.nextHopType &&
                origin == other.origin &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(networkId, cidr, nextHopType, origin, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{networkId=$networkId, cidr=$cidr, nextHopType=$nextHopType, origin=$origin, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[after], page[limit] */
    class Page
    private constructor(
        private val after: String?,
        private val limit: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** The cursor from `meta.cursors.after` of the previous page. */
        fun after(): Optional<String> = Optional.ofNullable(after)

        /** The number of results per page. */
        fun limit(): Optional<Long> = Optional.ofNullable(limit)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var after: String? = null
            private var limit: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                after = page.after
                limit = page.limit
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** The cursor from `meta.cursors.after` of the previous page. */
            fun after(after: String?) = apply { this.after = after }

            /** Alias for calling [Builder.after] with `after.orElse(null)`. */
            fun after(after: Optional<String>) = after(after.getOrNull())

            /** The number of results per page. */
            fun limit(limit: Long?) = apply { this.limit = limit }

            /**
             * Alias for [Builder.limit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun limit(limit: Long) = limit(limit as Long?)

            /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
            fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

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
            fun build(): Page = Page(after, limit, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                after == other.after &&
                limit == other.limit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(after, limit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{after=$after, limit=$limit, additionalProperties=$additionalProperties}"
    }

    /**
     * Sorts the results by a field, ascending, or descending with a leading `-`. The default is
     * `-created_at`.
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

            @JvmField val CIDR = of("cidr")

            @JvmField val minus_CIDR = of("-cidr")

            @JvmField val STATUS = of("status")

            @JvmField val STATUS_DESC = of("-status")

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val CREATED_AT_DESC = of("-created_at")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CIDR,
            minus_CIDR,
            STATUS,
            STATUS_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
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
            CIDR,
            minus_CIDR,
            STATUS,
            STATUS_DESC,
            CREATED_AT,
            CREATED_AT_DESC,
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
                CIDR -> Value.CIDR
                minus_CIDR -> Value.minus_CIDR
                STATUS -> Value.STATUS
                STATUS_DESC -> Value.STATUS_DESC
                CREATED_AT -> Value.CREATED_AT
                CREATED_AT_DESC -> Value.CREATED_AT_DESC
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
                CIDR -> Known.CIDR
                minus_CIDR -> Known.minus_CIDR
                STATUS -> Known.STATUS
                STATUS_DESC -> Known.STATUS_DESC
                CREATED_AT -> Known.CREATED_AT
                CREATED_AT_DESC -> Known.CREATED_AT_DESC
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is NetworkRouteListParams &&
            filter == other.filter &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NetworkRouteListParams{filter=$filter, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
