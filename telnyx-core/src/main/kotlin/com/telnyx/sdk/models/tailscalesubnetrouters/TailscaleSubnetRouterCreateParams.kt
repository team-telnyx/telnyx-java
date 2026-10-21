// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tailscalesubnetrouters

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a Tailscale Subnet Router on a Network and enrolls it in the user's tailnet with the auth
 * key. The response returns the router with `status` `provisioning`. Poll `GET
 * /tailscale_subnet_routers/{id}` until it is `provisioned`. Then approve its routes in the
 * tailnet, unless an auto-approver covers them.
 */
class TailscaleSubnetRouterCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * IPv4 subnets of the Network that the router advertises to the tailnet. Each entry is a
     * canonical CIDR that the Network routes. Default, loopback, link-local, multicast, and
     * Tailscale (`100.64.0.0/10`) ranges are rejected. So are ranges that overlap the router's own,
     * `172.27.254.0/24` and `198.18.0.0/20`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun advertisedRoutes(): List<String> = body.advertisedRoutes()

    /**
     * A Tailscale auth key that enrolls the router in the user's tailnet: reusable, pre-approved,
     * tagged, and not ephemeral. Telnyx stores it encrypted until enrollment succeeds, then
     * discards it. It is never returned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authKey(): String = body.authKey()

    /**
     * A user specified name for the router.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The id of the Network to attach the router to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun networkId(): String = body.networkId()

    /**
     * The code of the region to create the router in. `GET /network_coverage` lists the regions
     * whose `available_services` include `tailscale_subnet_router`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun regionCode(): String = body.regionCode()

    /**
     * Returns the raw JSON value of [advertisedRoutes].
     *
     * Unlike [advertisedRoutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _advertisedRoutes(): JsonField<List<String>> = body._advertisedRoutes()

    /**
     * Returns the raw JSON value of [authKey].
     *
     * Unlike [authKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _authKey(): JsonField<String> = body._authKey()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [networkId].
     *
     * Unlike [networkId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _networkId(): JsonField<String> = body._networkId()

    /**
     * Returns the raw JSON value of [regionCode].
     *
     * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _regionCode(): JsonField<String> = body._regionCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TailscaleSubnetRouterCreateParams].
         *
         * The following fields are required:
         * ```java
         * .advertisedRoutes()
         * .authKey()
         * .name()
         * .networkId()
         * .regionCode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TailscaleSubnetRouterCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tailscaleSubnetRouterCreateParams: TailscaleSubnetRouterCreateParams) =
            apply {
                body = tailscaleSubnetRouterCreateParams.body.toBuilder()
                additionalHeaders = tailscaleSubnetRouterCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    tailscaleSubnetRouterCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [advertisedRoutes]
         * - [authKey]
         * - [name]
         * - [networkId]
         * - [regionCode]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * IPv4 subnets of the Network that the router advertises to the tailnet. Each entry is a
         * canonical CIDR that the Network routes. Default, loopback, link-local, multicast, and
         * Tailscale (`100.64.0.0/10`) ranges are rejected. So are ranges that overlap the router's
         * own, `172.27.254.0/24` and `198.18.0.0/20`.
         */
        fun advertisedRoutes(advertisedRoutes: List<String>) = apply {
            body.advertisedRoutes(advertisedRoutes)
        }

        /**
         * Sets [Builder.advertisedRoutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.advertisedRoutes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun advertisedRoutes(advertisedRoutes: JsonField<List<String>>) = apply {
            body.advertisedRoutes(advertisedRoutes)
        }

        /**
         * Adds a single [String] to [advertisedRoutes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdvertisedRoute(advertisedRoute: String) = apply {
            body.addAdvertisedRoute(advertisedRoute)
        }

        /**
         * A Tailscale auth key that enrolls the router in the user's tailnet: reusable,
         * pre-approved, tagged, and not ephemeral. Telnyx stores it encrypted until enrollment
         * succeeds, then discards it. It is never returned.
         */
        fun authKey(authKey: String) = apply { body.authKey(authKey) }

        /**
         * Sets [Builder.authKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun authKey(authKey: JsonField<String>) = apply { body.authKey(authKey) }

        /** A user specified name for the router. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The id of the Network to attach the router to. */
        fun networkId(networkId: String) = apply { body.networkId(networkId) }

        /**
         * Sets [Builder.networkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun networkId(networkId: JsonField<String>) = apply { body.networkId(networkId) }

        /**
         * The code of the region to create the router in. `GET /network_coverage` lists the regions
         * whose `available_services` include `tailscale_subnet_router`.
         */
        fun regionCode(regionCode: String) = apply { body.regionCode(regionCode) }

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { body.regionCode(regionCode) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [TailscaleSubnetRouterCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .advertisedRoutes()
         * .authKey()
         * .name()
         * .networkId()
         * .regionCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TailscaleSubnetRouterCreateParams =
            TailscaleSubnetRouterCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val advertisedRoutes: JsonField<List<String>>,
        private val authKey: JsonField<String>,
        private val name: JsonField<String>,
        private val networkId: JsonField<String>,
        private val regionCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("advertised_routes")
            @ExcludeMissing
            advertisedRoutes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("auth_key") @ExcludeMissing authKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("network_id")
            @ExcludeMissing
            networkId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region_code")
            @ExcludeMissing
            regionCode: JsonField<String> = JsonMissing.of(),
        ) : this(advertisedRoutes, authKey, name, networkId, regionCode, mutableMapOf())

        /**
         * IPv4 subnets of the Network that the router advertises to the tailnet. Each entry is a
         * canonical CIDR that the Network routes. Default, loopback, link-local, multicast, and
         * Tailscale (`100.64.0.0/10`) ranges are rejected. So are ranges that overlap the router's
         * own, `172.27.254.0/24` and `198.18.0.0/20`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun advertisedRoutes(): List<String> = advertisedRoutes.getRequired("advertised_routes")

        /**
         * A Tailscale auth key that enrolls the router in the user's tailnet: reusable,
         * pre-approved, tagged, and not ephemeral. Telnyx stores it encrypted until enrollment
         * succeeds, then discards it. It is never returned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authKey(): String = authKey.getRequired("auth_key")

        /**
         * A user specified name for the router.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The id of the Network to attach the router to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun networkId(): String = networkId.getRequired("network_id")

        /**
         * The code of the region to create the router in. `GET /network_coverage` lists the regions
         * whose `available_services` include `tailscale_subnet_router`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun regionCode(): String = regionCode.getRequired("region_code")

        /**
         * Returns the raw JSON value of [advertisedRoutes].
         *
         * Unlike [advertisedRoutes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("advertised_routes")
        @ExcludeMissing
        fun _advertisedRoutes(): JsonField<List<String>> = advertisedRoutes

        /**
         * Returns the raw JSON value of [authKey].
         *
         * Unlike [authKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth_key") @ExcludeMissing fun _authKey(): JsonField<String> = authKey

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [networkId].
         *
         * Unlike [networkId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("network_id") @ExcludeMissing fun _networkId(): JsonField<String> = networkId

        /**
         * Returns the raw JSON value of [regionCode].
         *
         * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region_code")
        @ExcludeMissing
        fun _regionCode(): JsonField<String> = regionCode

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .advertisedRoutes()
             * .authKey()
             * .name()
             * .networkId()
             * .regionCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var advertisedRoutes: JsonField<MutableList<String>>? = null
            private var authKey: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var networkId: JsonField<String>? = null
            private var regionCode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                advertisedRoutes = body.advertisedRoutes.map { it.toMutableList() }
                authKey = body.authKey
                name = body.name
                networkId = body.networkId
                regionCode = body.regionCode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * IPv4 subnets of the Network that the router advertises to the tailnet. Each entry is
             * a canonical CIDR that the Network routes. Default, loopback, link-local, multicast,
             * and Tailscale (`100.64.0.0/10`) ranges are rejected. So are ranges that overlap the
             * router's own, `172.27.254.0/24` and `198.18.0.0/20`.
             */
            fun advertisedRoutes(advertisedRoutes: List<String>) =
                advertisedRoutes(JsonField.of(advertisedRoutes))

            /**
             * Sets [Builder.advertisedRoutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.advertisedRoutes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun advertisedRoutes(advertisedRoutes: JsonField<List<String>>) = apply {
                this.advertisedRoutes = advertisedRoutes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [advertisedRoutes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdvertisedRoute(advertisedRoute: String) = apply {
                advertisedRoutes =
                    (advertisedRoutes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("advertisedRoutes", it).add(advertisedRoute)
                    }
            }

            /**
             * A Tailscale auth key that enrolls the router in the user's tailnet: reusable,
             * pre-approved, tagged, and not ephemeral. Telnyx stores it encrypted until enrollment
             * succeeds, then discards it. It is never returned.
             */
            fun authKey(authKey: String) = authKey(JsonField.of(authKey))

            /**
             * Sets [Builder.authKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authKey(authKey: JsonField<String>) = apply { this.authKey = authKey }

            /** A user specified name for the router. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The id of the Network to attach the router to. */
            fun networkId(networkId: String) = networkId(JsonField.of(networkId))

            /**
             * Sets [Builder.networkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun networkId(networkId: JsonField<String>) = apply { this.networkId = networkId }

            /**
             * The code of the region to create the router in. `GET /network_coverage` lists the
             * regions whose `available_services` include `tailscale_subnet_router`.
             */
            fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

            /**
             * Sets [Builder.regionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .advertisedRoutes()
             * .authKey()
             * .name()
             * .networkId()
             * .regionCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("advertisedRoutes", advertisedRoutes).map { it.toImmutable() },
                    checkRequired("authKey", authKey),
                    checkRequired("name", name),
                    checkRequired("networkId", networkId),
                    checkRequired("regionCode", regionCode),
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            advertisedRoutes()
            authKey()
            name()
            networkId()
            regionCode()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (advertisedRoutes.asKnown().getOrNull()?.size ?: 0) +
                (if (authKey.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (networkId.asKnown().isPresent) 1 else 0) +
                (if (regionCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                advertisedRoutes == other.advertisedRoutes &&
                authKey == other.authKey &&
                name == other.name &&
                networkId == other.networkId &&
                regionCode == other.regionCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                advertisedRoutes,
                authKey,
                name,
                networkId,
                regionCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{advertisedRoutes=$advertisedRoutes, authKey=$authKey, name=$name, networkId=$networkId, regionCode=$regionCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TailscaleSubnetRouterCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TailscaleSubnetRouterCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
