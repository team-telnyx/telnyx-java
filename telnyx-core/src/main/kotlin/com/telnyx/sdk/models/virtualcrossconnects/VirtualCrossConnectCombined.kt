// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.networks.InterfaceStatus
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VirtualCrossConnectCombined
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val bandwidthMbps: JsonField<Double>,
    private val bgpAsn: JsonField<Double>,
    private val cloudProvider: JsonField<CloudProvider>,
    private val cloudProviderRegion: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val name: JsonField<String>,
    private val networkId: JsonField<String>,
    private val primaryBgpKey: JsonField<String>,
    private val primaryCloudAccountId: JsonField<String>,
    private val primaryCloudIp: JsonField<String>,
    private val primaryEnabled: JsonField<Boolean>,
    private val primaryRoutingAnnouncement: JsonField<Boolean>,
    private val primaryTelnyxIp: JsonField<String>,
    private val recordType: JsonField<String>,
    private val region: JsonField<Region>,
    private val regionCode: JsonField<String>,
    private val status: JsonField<InterfaceStatus>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bandwidth_mbps")
        @ExcludeMissing
        bandwidthMbps: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bgp_asn") @ExcludeMissing bgpAsn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cloud_provider")
        @ExcludeMissing
        cloudProvider: JsonField<CloudProvider> = JsonMissing.of(),
        @JsonProperty("cloud_provider_region")
        @ExcludeMissing
        cloudProviderRegion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_id") @ExcludeMissing networkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_bgp_key")
        @ExcludeMissing
        primaryBgpKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_cloud_account_id")
        @ExcludeMissing
        primaryCloudAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_cloud_ip")
        @ExcludeMissing
        primaryCloudIp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_enabled")
        @ExcludeMissing
        primaryEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primary_routing_announcement")
        @ExcludeMissing
        primaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primary_telnyx_ip")
        @ExcludeMissing
        primaryTelnyxIp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
        @JsonProperty("region_code")
        @ExcludeMissing
        regionCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<InterfaceStatus> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        bandwidthMbps,
        bgpAsn,
        cloudProvider,
        cloudProviderRegion,
        createdAt,
        name,
        networkId,
        primaryBgpKey,
        primaryCloudAccountId,
        primaryCloudIp,
        primaryEnabled,
        primaryRoutingAnnouncement,
        primaryTelnyxIp,
        recordType,
        region,
        regionCode,
        status,
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
     * The desired throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bandwidthMbps(): Optional<Double> = bandwidthMbps.getOptional("bandwidth_mbps")

    /**
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bgpAsn(): Optional<Double> = bgpAsn.getOptional("bgp_asn")

    /**
     * The Virtual Private Cloud with which you would like to establish a cross connect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cloudProvider(): Optional<CloudProvider> = cloudProvider.getOptional("cloud_provider")

    /**
     * The region where your Virtual Private Cloud hosts are located.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cloudProviderRegion(): Optional<String> =
        cloudProviderRegion.getOptional("cloud_provider_region")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * A user specified name for the interface.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The id of the network associated with the interface.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkId(): Optional<String> = networkId.getOptional("network_id")

    /**
     * The authentication key for BGP peer configuration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryBgpKey(): Optional<String> = primaryBgpKey.getOptional("primary_bgp_key")

    /**
     * The identifier for your Virtual Private Cloud.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryCloudAccountId(): Optional<String> =
        primaryCloudAccountId.getOptional("primary_cloud_account_id")

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryCloudIp(): Optional<String> = primaryCloudIp.getOptional("primary_cloud_ip")

    /**
     * Indicates whether the primary circuit is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryEnabled(): Optional<Boolean> = primaryEnabled.getOptional("primary_enabled")

    /**
     * Whether
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryRoutingAnnouncement(): Optional<Boolean> =
        primaryRoutingAnnouncement.getOptional("primary_routing_announcement")

    /**
     * The IP address assigned to the Telnyx side of the Virtual Cross Connect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryTelnyxIp(): Optional<String> = primaryTelnyxIp.getOptional("primary_telnyx_ip")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<Region> = region.getOptional("region")

    /**
     * The region interface is deployed to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionCode(): Optional<String> = regionCode.getOptional("region_code")

    /**
     * The current status of the interface deployment.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<InterfaceStatus> = status.getOptional("status")

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bandwidthMbps].
     *
     * Unlike [bandwidthMbps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bandwidth_mbps")
    @ExcludeMissing
    fun _bandwidthMbps(): JsonField<Double> = bandwidthMbps

    /**
     * Returns the raw JSON value of [bgpAsn].
     *
     * Unlike [bgpAsn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bgp_asn") @ExcludeMissing fun _bgpAsn(): JsonField<Double> = bgpAsn

    /**
     * Returns the raw JSON value of [cloudProvider].
     *
     * Unlike [cloudProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cloud_provider")
    @ExcludeMissing
    fun _cloudProvider(): JsonField<CloudProvider> = cloudProvider

    /**
     * Returns the raw JSON value of [cloudProviderRegion].
     *
     * Unlike [cloudProviderRegion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cloud_provider_region")
    @ExcludeMissing
    fun _cloudProviderRegion(): JsonField<String> = cloudProviderRegion

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

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
     * Returns the raw JSON value of [primaryBgpKey].
     *
     * Unlike [primaryBgpKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_bgp_key")
    @ExcludeMissing
    fun _primaryBgpKey(): JsonField<String> = primaryBgpKey

    /**
     * Returns the raw JSON value of [primaryCloudAccountId].
     *
     * Unlike [primaryCloudAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primary_cloud_account_id")
    @ExcludeMissing
    fun _primaryCloudAccountId(): JsonField<String> = primaryCloudAccountId

    /**
     * Returns the raw JSON value of [primaryCloudIp].
     *
     * Unlike [primaryCloudIp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_cloud_ip")
    @ExcludeMissing
    fun _primaryCloudIp(): JsonField<String> = primaryCloudIp

    /**
     * Returns the raw JSON value of [primaryEnabled].
     *
     * Unlike [primaryEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_enabled")
    @ExcludeMissing
    fun _primaryEnabled(): JsonField<Boolean> = primaryEnabled

    /**
     * Returns the raw JSON value of [primaryRoutingAnnouncement].
     *
     * Unlike [primaryRoutingAnnouncement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("primary_routing_announcement")
    @ExcludeMissing
    fun _primaryRoutingAnnouncement(): JsonField<Boolean> = primaryRoutingAnnouncement

    /**
     * Returns the raw JSON value of [primaryTelnyxIp].
     *
     * Unlike [primaryTelnyxIp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_telnyx_ip")
    @ExcludeMissing
    fun _primaryTelnyxIp(): JsonField<String> = primaryTelnyxIp

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<InterfaceStatus> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [VirtualCrossConnectCombined].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectCombined]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var bandwidthMbps: JsonField<Double> = JsonMissing.of()
        private var bgpAsn: JsonField<Double> = JsonMissing.of()
        private var cloudProvider: JsonField<CloudProvider> = JsonMissing.of()
        private var cloudProviderRegion: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var networkId: JsonField<String> = JsonMissing.of()
        private var primaryBgpKey: JsonField<String> = JsonMissing.of()
        private var primaryCloudAccountId: JsonField<String> = JsonMissing.of()
        private var primaryCloudIp: JsonField<String> = JsonMissing.of()
        private var primaryEnabled: JsonField<Boolean> = JsonMissing.of()
        private var primaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of()
        private var primaryTelnyxIp: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var region: JsonField<Region> = JsonMissing.of()
        private var regionCode: JsonField<String> = JsonMissing.of()
        private var status: JsonField<InterfaceStatus> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(virtualCrossConnectCombined: VirtualCrossConnectCombined) = apply {
            id = virtualCrossConnectCombined.id
            bandwidthMbps = virtualCrossConnectCombined.bandwidthMbps
            bgpAsn = virtualCrossConnectCombined.bgpAsn
            cloudProvider = virtualCrossConnectCombined.cloudProvider
            cloudProviderRegion = virtualCrossConnectCombined.cloudProviderRegion
            createdAt = virtualCrossConnectCombined.createdAt
            name = virtualCrossConnectCombined.name
            networkId = virtualCrossConnectCombined.networkId
            primaryBgpKey = virtualCrossConnectCombined.primaryBgpKey
            primaryCloudAccountId = virtualCrossConnectCombined.primaryCloudAccountId
            primaryCloudIp = virtualCrossConnectCombined.primaryCloudIp
            primaryEnabled = virtualCrossConnectCombined.primaryEnabled
            primaryRoutingAnnouncement = virtualCrossConnectCombined.primaryRoutingAnnouncement
            primaryTelnyxIp = virtualCrossConnectCombined.primaryTelnyxIp
            recordType = virtualCrossConnectCombined.recordType
            region = virtualCrossConnectCombined.region
            regionCode = virtualCrossConnectCombined.regionCode
            status = virtualCrossConnectCombined.status
            updatedAt = virtualCrossConnectCombined.updatedAt
            additionalProperties = virtualCrossConnectCombined.additionalProperties.toMutableMap()
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

        /** The desired throughput in Megabits per Second (Mbps) for your Virtual Cross Connect. */
        fun bandwidthMbps(bandwidthMbps: Double) = bandwidthMbps(JsonField.of(bandwidthMbps))

        /**
         * Sets [Builder.bandwidthMbps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bandwidthMbps] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bandwidthMbps(bandwidthMbps: JsonField<Double>) = apply {
            this.bandwidthMbps = bandwidthMbps
        }

        /** The Border Gateway Protocol (BGP) Autonomous System Number (ASN). */
        fun bgpAsn(bgpAsn: Double) = bgpAsn(JsonField.of(bgpAsn))

        /**
         * Sets [Builder.bgpAsn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bgpAsn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bgpAsn(bgpAsn: JsonField<Double>) = apply { this.bgpAsn = bgpAsn }

        /** The Virtual Private Cloud with which you would like to establish a cross connect. */
        fun cloudProvider(cloudProvider: CloudProvider) = cloudProvider(JsonField.of(cloudProvider))

        /**
         * Sets [Builder.cloudProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloudProvider] with a well-typed [CloudProvider] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cloudProvider(cloudProvider: JsonField<CloudProvider>) = apply {
            this.cloudProvider = cloudProvider
        }

        /** The region where your Virtual Private Cloud hosts are located. */
        fun cloudProviderRegion(cloudProviderRegion: String) =
            cloudProviderRegion(JsonField.of(cloudProviderRegion))

        /**
         * Sets [Builder.cloudProviderRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloudProviderRegion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cloudProviderRegion(cloudProviderRegion: JsonField<String>) = apply {
            this.cloudProviderRegion = cloudProviderRegion
        }

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** A user specified name for the interface. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The id of the network associated with the interface. */
        fun networkId(networkId: String) = networkId(JsonField.of(networkId))

        /**
         * Sets [Builder.networkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun networkId(networkId: JsonField<String>) = apply { this.networkId = networkId }

        /** The authentication key for BGP peer configuration. */
        fun primaryBgpKey(primaryBgpKey: String) = primaryBgpKey(JsonField.of(primaryBgpKey))

        /**
         * Sets [Builder.primaryBgpKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryBgpKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryBgpKey(primaryBgpKey: JsonField<String>) = apply {
            this.primaryBgpKey = primaryBgpKey
        }

        /** The identifier for your Virtual Private Cloud. */
        fun primaryCloudAccountId(primaryCloudAccountId: String) =
            primaryCloudAccountId(JsonField.of(primaryCloudAccountId))

        /**
         * Sets [Builder.primaryCloudAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCloudAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCloudAccountId(primaryCloudAccountId: JsonField<String>) = apply {
            this.primaryCloudAccountId = primaryCloudAccountId
        }

        /** The IP address assigned for your side of the Virtual Cross Connect. */
        fun primaryCloudIp(primaryCloudIp: String) = primaryCloudIp(JsonField.of(primaryCloudIp))

        /**
         * Sets [Builder.primaryCloudIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCloudIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCloudIp(primaryCloudIp: JsonField<String>) = apply {
            this.primaryCloudIp = primaryCloudIp
        }

        /** Indicates whether the primary circuit is enabled. */
        fun primaryEnabled(primaryEnabled: Boolean) = primaryEnabled(JsonField.of(primaryEnabled))

        /**
         * Sets [Builder.primaryEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryEnabled(primaryEnabled: JsonField<Boolean>) = apply {
            this.primaryEnabled = primaryEnabled
        }

        /** Whether */
        fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: Boolean) =
            primaryRoutingAnnouncement(JsonField.of(primaryRoutingAnnouncement))

        /**
         * Sets [Builder.primaryRoutingAnnouncement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryRoutingAnnouncement] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: JsonField<Boolean>) = apply {
            this.primaryRoutingAnnouncement = primaryRoutingAnnouncement
        }

        /** The IP address assigned to the Telnyx side of the Virtual Cross Connect. */
        fun primaryTelnyxIp(primaryTelnyxIp: String) =
            primaryTelnyxIp(JsonField.of(primaryTelnyxIp))

        /**
         * Sets [Builder.primaryTelnyxIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryTelnyxIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryTelnyxIp(primaryTelnyxIp: JsonField<String>) = apply {
            this.primaryTelnyxIp = primaryTelnyxIp
        }

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

        fun region(region: Region) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [Region] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<Region>) = apply { this.region = region }

        /** The region interface is deployed to. */
        fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

        /** The current status of the interface deployment. */
        fun status(status: InterfaceStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [InterfaceStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<InterfaceStatus>) = apply { this.status = status }

        /** ISO 8601 formatted date-time indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [VirtualCrossConnectCombined].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VirtualCrossConnectCombined =
            VirtualCrossConnectCombined(
                id,
                bandwidthMbps,
                bgpAsn,
                cloudProvider,
                cloudProviderRegion,
                createdAt,
                name,
                networkId,
                primaryBgpKey,
                primaryCloudAccountId,
                primaryCloudIp,
                primaryEnabled,
                primaryRoutingAnnouncement,
                primaryTelnyxIp,
                recordType,
                region,
                regionCode,
                status,
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
    fun validate(): VirtualCrossConnectCombined = apply {
        if (validated) {
            return@apply
        }

        id()
        bandwidthMbps()
        bgpAsn()
        cloudProvider().ifPresent { it.validate() }
        cloudProviderRegion()
        createdAt()
        name()
        networkId()
        primaryBgpKey()
        primaryCloudAccountId()
        primaryCloudIp()
        primaryEnabled()
        primaryRoutingAnnouncement()
        primaryTelnyxIp()
        recordType()
        region().ifPresent { it.validate() }
        regionCode()
        status().ifPresent { it.validate() }
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
            (if (bandwidthMbps.asKnown().isPresent) 1 else 0) +
            (if (bgpAsn.asKnown().isPresent) 1 else 0) +
            (cloudProvider.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cloudProviderRegion.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (networkId.asKnown().isPresent) 1 else 0) +
            (if (primaryBgpKey.asKnown().isPresent) 1 else 0) +
            (if (primaryCloudAccountId.asKnown().isPresent) 1 else 0) +
            (if (primaryCloudIp.asKnown().isPresent) 1 else 0) +
            (if (primaryEnabled.asKnown().isPresent) 1 else 0) +
            (if (primaryRoutingAnnouncement.asKnown().isPresent) 1 else 0) +
            (if (primaryTelnyxIp.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (region.asKnown().getOrNull()?.validity() ?: 0) +
            (if (regionCode.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The Virtual Private Cloud with which you would like to establish a cross connect. */
    class CloudProvider @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

    class Region
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val name: JsonField<String>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(code, name, recordType, mutableMapOf())

        /**
         * Region code of the interface.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * Region name of the interface.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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

            /** Returns a mutable builder for constructing an instance of [Region]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Region]. */
        class Builder internal constructor() {

            private var code: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(region: Region) = apply {
                code = region.code
                name = region.name
                recordType = region.recordType
                additionalProperties = region.additionalProperties.toMutableMap()
            }

            /** Region code of the interface. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Region name of the interface. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
             * Returns an immutable instance of [Region].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Region =
                Region(code, name, recordType, additionalProperties.toMutableMap())
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
        fun validate(): Region = apply {
            if (validated) {
                return@apply
            }

            code()
            name()
            recordType()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Region &&
                code == other.code &&
                name == other.name &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(code, name, recordType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Region{code=$code, name=$name, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectCombined &&
            id == other.id &&
            bandwidthMbps == other.bandwidthMbps &&
            bgpAsn == other.bgpAsn &&
            cloudProvider == other.cloudProvider &&
            cloudProviderRegion == other.cloudProviderRegion &&
            createdAt == other.createdAt &&
            name == other.name &&
            networkId == other.networkId &&
            primaryBgpKey == other.primaryBgpKey &&
            primaryCloudAccountId == other.primaryCloudAccountId &&
            primaryCloudIp == other.primaryCloudIp &&
            primaryEnabled == other.primaryEnabled &&
            primaryRoutingAnnouncement == other.primaryRoutingAnnouncement &&
            primaryTelnyxIp == other.primaryTelnyxIp &&
            recordType == other.recordType &&
            region == other.region &&
            regionCode == other.regionCode &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            bandwidthMbps,
            bgpAsn,
            cloudProvider,
            cloudProviderRegion,
            createdAt,
            name,
            networkId,
            primaryBgpKey,
            primaryCloudAccountId,
            primaryCloudIp,
            primaryEnabled,
            primaryRoutingAnnouncement,
            primaryTelnyxIp,
            recordType,
            region,
            regionCode,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VirtualCrossConnectCombined{id=$id, bandwidthMbps=$bandwidthMbps, bgpAsn=$bgpAsn, cloudProvider=$cloudProvider, cloudProviderRegion=$cloudProviderRegion, createdAt=$createdAt, name=$name, networkId=$networkId, primaryBgpKey=$primaryBgpKey, primaryCloudAccountId=$primaryCloudAccountId, primaryCloudIp=$primaryCloudIp, primaryEnabled=$primaryEnabled, primaryRoutingAnnouncement=$primaryRoutingAnnouncement, primaryTelnyxIp=$primaryTelnyxIp, recordType=$recordType, region=$region, regionCode=$regionCode, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
