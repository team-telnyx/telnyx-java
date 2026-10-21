// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tailscalesubnetrouters

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TailscaleSubnetRouter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val advertisedRoutes: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerAddress: JsonField<String>,
    private val deviceId: JsonField<String>,
    private val name: JsonField<String>,
    private val networkId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val regionCode: JsonField<String>,
    private val status: JsonField<Status>,
    private val tailnetName: JsonField<String>,
    private val tailscaleIps: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("advertised_routes")
        @ExcludeMissing
        advertisedRoutes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_address")
        @ExcludeMissing
        customerAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_id") @ExcludeMissing deviceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_id") @ExcludeMissing networkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region_code")
        @ExcludeMissing
        regionCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tailnet_name")
        @ExcludeMissing
        tailnetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tailscale_ips")
        @ExcludeMissing
        tailscaleIps: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        advertisedRoutes,
        createdAt,
        customerAddress,
        deviceId,
        name,
        networkId,
        recordType,
        regionCode,
        status,
        tailnetName,
        tailscaleIps,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * IPv4 subnets of the Network that the router advertises to the tailnet. Each entry is a
     * canonical CIDR that the Network routes. Default, loopback, link-local, multicast, and
     * Tailscale (`100.64.0.0/10`) ranges are rejected. So are ranges that overlap the router's own,
     * `172.27.254.0/24` and `198.18.0.0/20`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun advertisedRoutes(): Optional<List<String>> =
        advertisedRoutes.getOptional("advertised_routes")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The router's address on the Network, from `172.27.254.0/24`. Tailnet traffic enters the
     * Network from this address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerAddress(): Optional<String> = customerAddress.getOptional("customer_address")

    /**
     * The router's node id on the tailnet. Set once the router has enrolled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deviceId(): Optional<String> = deviceId.getOptional("device_id")

    /**
     * A user specified name for the router.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The id of the Network the router is attached to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkId(): Optional<String> = networkId.getOptional("network_id")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * The code of the region the router is created in. `GET /network_coverage` lists the regions
     * whose `available_services` include `tailscale_subnet_router`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionCode(): Optional<String> = regionCode.getOptional("region_code")

    /**
     * `provisioning`: Telnyx is creating the router or applying a change. `provisioned`: the router
     * is on the tailnet and advertises its routes; the tailnet still approves them. `failed`:
     * enrollment did not complete, and `PATCH` retries it. `deleting`: the router is being removed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * The name of the tailnet the router is enrolled in. Set once the router has enrolled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tailnetName(): Optional<String> = tailnetName.getOptional("tailnet_name")

    /**
     * The router's addresses on the tailnet. Empty until the router has enrolled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tailscaleIps(): Optional<List<String>> = tailscaleIps.getOptional("tailscale_ips")

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerAddress].
     *
     * Unlike [customerAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_address")
    @ExcludeMissing
    fun _customerAddress(): JsonField<String> = customerAddress

    /**
     * Returns the raw JSON value of [deviceId].
     *
     * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

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
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [regionCode].
     *
     * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region_code") @ExcludeMissing fun _regionCode(): JsonField<String> = regionCode

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tailnetName].
     *
     * Unlike [tailnetName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tailnet_name")
    @ExcludeMissing
    fun _tailnetName(): JsonField<String> = tailnetName

    /**
     * Returns the raw JSON value of [tailscaleIps].
     *
     * Unlike [tailscaleIps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tailscale_ips")
    @ExcludeMissing
    fun _tailscaleIps(): JsonField<List<String>> = tailscaleIps

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [TailscaleSubnetRouter]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TailscaleSubnetRouter]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var advertisedRoutes: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerAddress: JsonField<String> = JsonMissing.of()
        private var deviceId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var networkId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var regionCode: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var tailnetName: JsonField<String> = JsonMissing.of()
        private var tailscaleIps: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tailscaleSubnetRouter: TailscaleSubnetRouter) = apply {
            id = tailscaleSubnetRouter.id
            advertisedRoutes = tailscaleSubnetRouter.advertisedRoutes.map { it.toMutableList() }
            createdAt = tailscaleSubnetRouter.createdAt
            customerAddress = tailscaleSubnetRouter.customerAddress
            deviceId = tailscaleSubnetRouter.deviceId
            name = tailscaleSubnetRouter.name
            networkId = tailscaleSubnetRouter.networkId
            recordType = tailscaleSubnetRouter.recordType
            regionCode = tailscaleSubnetRouter.regionCode
            status = tailscaleSubnetRouter.status
            tailnetName = tailscaleSubnetRouter.tailnetName
            tailscaleIps = tailscaleSubnetRouter.tailscaleIps.map { it.toMutableList() }
            updatedAt = tailscaleSubnetRouter.updatedAt
            additionalProperties = tailscaleSubnetRouter.additionalProperties.toMutableMap()
        }

        /** Identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * IPv4 subnets of the Network that the router advertises to the tailnet. Each entry is a
         * canonical CIDR that the Network routes. Default, loopback, link-local, multicast, and
         * Tailscale (`100.64.0.0/10`) ranges are rejected. So are ranges that overlap the router's
         * own, `172.27.254.0/24` and `198.18.0.0/20`.
         */
        fun advertisedRoutes(advertisedRoutes: List<String>) =
            advertisedRoutes(JsonField.of(advertisedRoutes))

        /**
         * Sets [Builder.advertisedRoutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.advertisedRoutes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The router's address on the Network, from `172.27.254.0/24`. Tailnet traffic enters the
         * Network from this address.
         */
        fun customerAddress(customerAddress: String) =
            customerAddress(JsonField.of(customerAddress))

        /**
         * Sets [Builder.customerAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerAddress(customerAddress: JsonField<String>) = apply {
            this.customerAddress = customerAddress
        }

        /** The router's node id on the tailnet. Set once the router has enrolled. */
        fun deviceId(deviceId: String?) = deviceId(JsonField.ofNullable(deviceId))

        /** Alias for calling [Builder.deviceId] with `deviceId.orElse(null)`. */
        fun deviceId(deviceId: Optional<String>) = deviceId(deviceId.getOrNull())

        /**
         * Sets [Builder.deviceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

        /** A user specified name for the router. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The id of the Network the router is attached to. */
        fun networkId(networkId: String) = networkId(JsonField.of(networkId))

        /**
         * Sets [Builder.networkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun networkId(networkId: JsonField<String>) = apply { this.networkId = networkId }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /**
         * The code of the region the router is created in. `GET /network_coverage` lists the
         * regions whose `available_services` include `tailscale_subnet_router`.
         */
        fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

        /**
         * `provisioning`: Telnyx is creating the router or applying a change. `provisioned`: the
         * router is on the tailnet and advertises its routes; the tailnet still approves them.
         * `failed`: enrollment did not complete, and `PATCH` retries it. `deleting`: the router is
         * being removed.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The name of the tailnet the router is enrolled in. Set once the router has enrolled. */
        fun tailnetName(tailnetName: String?) = tailnetName(JsonField.ofNullable(tailnetName))

        /** Alias for calling [Builder.tailnetName] with `tailnetName.orElse(null)`. */
        fun tailnetName(tailnetName: Optional<String>) = tailnetName(tailnetName.getOrNull())

        /**
         * Sets [Builder.tailnetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tailnetName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tailnetName(tailnetName: JsonField<String>) = apply { this.tailnetName = tailnetName }

        /** The router's addresses on the tailnet. Empty until the router has enrolled. */
        fun tailscaleIps(tailscaleIps: List<String>) = tailscaleIps(JsonField.of(tailscaleIps))

        /**
         * Sets [Builder.tailscaleIps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tailscaleIps] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tailscaleIps(tailscaleIps: JsonField<List<String>>) = apply {
            this.tailscaleIps = tailscaleIps.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tailscaleIps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTailscaleIp(tailscaleIp: String) = apply {
            tailscaleIps =
                (tailscaleIps ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tailscaleIps", it).add(tailscaleIp)
                }
        }

        /** ISO 8601 formatted date-time indicating when the resource was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [TailscaleSubnetRouter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TailscaleSubnetRouter =
            TailscaleSubnetRouter(
                id,
                (advertisedRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                customerAddress,
                deviceId,
                name,
                networkId,
                recordType,
                regionCode,
                status,
                tailnetName,
                (tailscaleIps ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TailscaleSubnetRouter = apply {
        if (validated) {
            return@apply
        }

        id()
        advertisedRoutes()
        createdAt()
        customerAddress()
        deviceId()
        name()
        networkId()
        recordType()
        regionCode()
        status().ifPresent { it.validate() }
        tailnetName()
        tailscaleIps()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (advertisedRoutes.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customerAddress.asKnown().isPresent) 1 else 0) +
            (if (deviceId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (networkId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (regionCode.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tailnetName.asKnown().isPresent) 1 else 0) +
            (tailscaleIps.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * `provisioning`: Telnyx is creating the router or applying a change. `provisioned`: the router
     * is on the tailnet and advertises its routes; the tailnet still approves them. `failed`:
     * enrollment did not complete, and `PATCH` retries it. `deleting`: the router is being removed.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROVISIONING = of("provisioning")

            @JvmField val PROVISIONED = of("provisioned")

            @JvmField val FAILED = of("failed")

            @JvmField val DELETING = of("deleting")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PROVISIONING,
            PROVISIONED,
            FAILED,
            DELETING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROVISIONING,
            PROVISIONED,
            FAILED,
            DELETING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PROVISIONING -> Value.PROVISIONING
                PROVISIONED -> Value.PROVISIONED
                FAILED -> Value.FAILED
                DELETING -> Value.DELETING
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
                PROVISIONING -> Known.PROVISIONING
                PROVISIONED -> Known.PROVISIONED
                FAILED -> Known.FAILED
                DELETING -> Known.DELETING
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        return other is TailscaleSubnetRouter &&
            id == other.id &&
            advertisedRoutes == other.advertisedRoutes &&
            createdAt == other.createdAt &&
            customerAddress == other.customerAddress &&
            deviceId == other.deviceId &&
            name == other.name &&
            networkId == other.networkId &&
            recordType == other.recordType &&
            regionCode == other.regionCode &&
            status == other.status &&
            tailnetName == other.tailnetName &&
            tailscaleIps == other.tailscaleIps &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            advertisedRoutes,
            createdAt,
            customerAddress,
            deviceId,
            name,
            networkId,
            recordType,
            regionCode,
            status,
            tailnetName,
            tailscaleIps,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TailscaleSubnetRouter{id=$id, advertisedRoutes=$advertisedRoutes, createdAt=$createdAt, customerAddress=$customerAddress, deviceId=$deviceId, name=$name, networkId=$networkId, recordType=$recordType, regionCode=$regionCode, status=$status, tailnetName=$tailnetName, tailscaleIps=$tailscaleIps, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
