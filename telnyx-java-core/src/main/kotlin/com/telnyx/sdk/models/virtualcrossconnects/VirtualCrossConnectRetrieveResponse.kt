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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.globalipassignments.Record
import com.telnyx.sdk.models.networks.InterfaceStatus
import com.telnyx.sdk.models.publicinternetgateways.Interface
import com.telnyx.sdk.models.publicinternetgateways.RegionIn
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VirtualCrossConnectRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of
         * [VirtualCrossConnectRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            virtualCrossConnectRetrieveResponse: VirtualCrossConnectRetrieveResponse
        ) = apply {
            data = virtualCrossConnectRetrieveResponse.data
            additionalProperties =
                virtualCrossConnectRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [VirtualCrossConnectRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VirtualCrossConnectRetrieveResponse =
            VirtualCrossConnectRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): VirtualCrossConnectRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val recordType: JsonField<String>,
        private val updatedAt: JsonField<String>,
        private val name: JsonField<String>,
        private val networkId: JsonField<String>,
        private val status: JsonField<InterfaceStatus>,
        private val regionCode: JsonField<String>,
        private val bgpAsn: JsonField<Double>,
        private val cloudProvider: JsonField<CloudProvider>,
        private val cloudProviderRegion: JsonField<String>,
        private val primaryCloudAccountId: JsonField<String>,
        private val bandwidthMbps: JsonField<Double>,
        private val primaryBgpKey: JsonField<String>,
        private val primaryCloudIp: JsonField<String>,
        private val primaryEnabled: JsonField<Boolean>,
        private val primaryRoutingAnnouncement: JsonField<Boolean>,
        private val primaryTelnyxIp: JsonField<String>,
        private val region: JsonField<Region>,
        private val secondaryBgpKey: JsonField<String>,
        private val secondaryCloudAccountId: JsonField<String>,
        private val secondaryCloudIp: JsonField<String>,
        private val secondaryEnabled: JsonField<Boolean>,
        private val secondaryRoutingAnnouncement: JsonField<Boolean>,
        private val secondaryTelnyxIp: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("network_id")
            @ExcludeMissing
            networkId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<InterfaceStatus> = JsonMissing.of(),
            @JsonProperty("region_code")
            @ExcludeMissing
            regionCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bgp_asn") @ExcludeMissing bgpAsn: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cloud_provider")
            @ExcludeMissing
            cloudProvider: JsonField<CloudProvider> = JsonMissing.of(),
            @JsonProperty("cloud_provider_region")
            @ExcludeMissing
            cloudProviderRegion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_cloud_account_id")
            @ExcludeMissing
            primaryCloudAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bandwidth_mbps")
            @ExcludeMissing
            bandwidthMbps: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("primary_bgp_key")
            @ExcludeMissing
            primaryBgpKey: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
            @JsonProperty("secondary_bgp_key")
            @ExcludeMissing
            secondaryBgpKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secondary_cloud_account_id")
            @ExcludeMissing
            secondaryCloudAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secondary_cloud_ip")
            @ExcludeMissing
            secondaryCloudIp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secondary_enabled")
            @ExcludeMissing
            secondaryEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("secondary_routing_announcement")
            @ExcludeMissing
            secondaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("secondary_telnyx_ip")
            @ExcludeMissing
            secondaryTelnyxIp: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            recordType,
            updatedAt,
            name,
            networkId,
            status,
            regionCode,
            bgpAsn,
            cloudProvider,
            cloudProviderRegion,
            primaryCloudAccountId,
            bandwidthMbps,
            primaryBgpKey,
            primaryCloudIp,
            primaryEnabled,
            primaryRoutingAnnouncement,
            primaryTelnyxIp,
            region,
            secondaryBgpKey,
            secondaryCloudAccountId,
            secondaryCloudIp,
            secondaryEnabled,
            secondaryRoutingAnnouncement,
            secondaryTelnyxIp,
            mutableMapOf(),
        )

        fun toRecord(): Record =
            Record.builder()
                .id(id)
                .createdAt(createdAt)
                .recordType(recordType)
                .updatedAt(updatedAt)
                .build()

        fun toInterface(): Interface =
            Interface.builder().name(name).networkId(networkId).status(status).build()

        fun toRegionIn(): RegionIn = RegionIn.builder().regionCode(regionCode).build()

        /**
         * Identifies the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * ISO 8601 formatted date-time indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * ISO 8601 formatted date-time indicating when the resource was updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

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
         * The current status of the interface deployment.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<InterfaceStatus> = status.getOptional("status")

        /**
         * The region the interface should be deployed to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regionCode(): Optional<String> = regionCode.getOptional("region_code")

        /**
         * The Border Gateway Protocol (BGP) Autonomous System Number (ASN). If null, value will be
         * assigned by Telnyx.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bgpAsn(): Double = bgpAsn.getRequired("bgp_asn")

        /**
         * The Virtual Private Cloud with which you would like to establish a cross connect.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cloudProvider(): CloudProvider = cloudProvider.getRequired("cloud_provider")

        /**
         * The region where your Virtual Private Cloud hosts are located.<br /><br />The available
         * regions can be found using the /virtual_cross_connect_regions endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cloudProviderRegion(): String = cloudProviderRegion.getRequired("cloud_provider_region")

        /**
         * The identifier for your Virtual Private Cloud. The number will be different based upon
         * your Cloud provider.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun primaryCloudAccountId(): String =
            primaryCloudAccountId.getRequired("primary_cloud_account_id")

        /**
         * The desired throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.<br
         * /><br />The available bandwidths can be found using the /virtual_cross_connect_regions
         * endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bandwidthMbps(): Optional<Double> = bandwidthMbps.getOptional("bandwidth_mbps")

        /**
         * The authentication key for BGP peer configuration.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryBgpKey(): Optional<String> = primaryBgpKey.getOptional("primary_bgp_key")

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value can not be patched once
         * the VXC has bene provisioned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCloudIp(): Optional<String> = primaryCloudIp.getOptional("primary_cloud_ip")

        /**
         * Indicates whether the primary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryEnabled(): Optional<Boolean> = primaryEnabled.getOptional("primary_enabled")

        /**
         * Whether the primary BGP route is being announced.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryRoutingAnnouncement(): Optional<Boolean> =
            primaryRoutingAnnouncement.getOptional("primary_routing_announcement")

        /**
         * The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br />If
         * none is provided, one will be generated for you.<br /><br />This value should be null for
         * GCE as Google will only inform you of your assigned IP once the connection has been
         * accepted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryTelnyxIp(): Optional<String> = primaryTelnyxIp.getOptional("primary_telnyx_ip")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<Region> = region.getOptional("region")

        /**
         * The authentication key for BGP peer configuration.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryBgpKey(): Optional<String> = secondaryBgpKey.getOptional("secondary_bgp_key")

        /**
         * The identifier for your Virtual Private Cloud. The number will be different based upon
         * your Cloud provider.<br /><br />This attribute is only necessary for GCE.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryCloudAccountId(): Optional<String> =
            secondaryCloudAccountId.getOptional("secondary_cloud_account_id")

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value can not be patched once
         * the VXC has bene provisioned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryCloudIp(): Optional<String> =
            secondaryCloudIp.getOptional("secondary_cloud_ip")

        /**
         * Indicates whether the secondary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryEnabled(): Optional<Boolean> =
            secondaryEnabled.getOptional("secondary_enabled")

        /**
         * Whether the secondary BGP route is being announced.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryRoutingAnnouncement(): Optional<Boolean> =
            secondaryRoutingAnnouncement.getOptional("secondary_routing_announcement")

        /**
         * The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br />If
         * none is provided, one will be generated for you.<br /><br />This value should be null for
         * GCE as Google will only inform you of your assigned IP once the connection has been
         * accepted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondaryTelnyxIp(): Optional<String> =
            secondaryTelnyxIp.getOptional("secondary_telnyx_ip")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<InterfaceStatus> = status

        /**
         * Returns the raw JSON value of [regionCode].
         *
         * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region_code")
        @ExcludeMissing
        fun _regionCode(): JsonField<String> = regionCode

        /**
         * Returns the raw JSON value of [bgpAsn].
         *
         * Unlike [bgpAsn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bgp_asn") @ExcludeMissing fun _bgpAsn(): JsonField<Double> = bgpAsn

        /**
         * Returns the raw JSON value of [cloudProvider].
         *
         * Unlike [cloudProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cloud_provider")
        @ExcludeMissing
        fun _cloudProvider(): JsonField<CloudProvider> = cloudProvider

        /**
         * Returns the raw JSON value of [cloudProviderRegion].
         *
         * Unlike [cloudProviderRegion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cloud_provider_region")
        @ExcludeMissing
        fun _cloudProviderRegion(): JsonField<String> = cloudProviderRegion

        /**
         * Returns the raw JSON value of [primaryCloudAccountId].
         *
         * Unlike [primaryCloudAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_cloud_account_id")
        @ExcludeMissing
        fun _primaryCloudAccountId(): JsonField<String> = primaryCloudAccountId

        /**
         * Returns the raw JSON value of [bandwidthMbps].
         *
         * Unlike [bandwidthMbps], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bandwidth_mbps")
        @ExcludeMissing
        fun _bandwidthMbps(): JsonField<Double> = bandwidthMbps

        /**
         * Returns the raw JSON value of [primaryBgpKey].
         *
         * Unlike [primaryBgpKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_bgp_key")
        @ExcludeMissing
        fun _primaryBgpKey(): JsonField<String> = primaryBgpKey

        /**
         * Returns the raw JSON value of [primaryCloudIp].
         *
         * Unlike [primaryCloudIp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_cloud_ip")
        @ExcludeMissing
        fun _primaryCloudIp(): JsonField<String> = primaryCloudIp

        /**
         * Returns the raw JSON value of [primaryEnabled].
         *
         * Unlike [primaryEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [primaryTelnyxIp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_telnyx_ip")
        @ExcludeMissing
        fun _primaryTelnyxIp(): JsonField<String> = primaryTelnyxIp

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

        /**
         * Returns the raw JSON value of [secondaryBgpKey].
         *
         * Unlike [secondaryBgpKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondary_bgp_key")
        @ExcludeMissing
        fun _secondaryBgpKey(): JsonField<String> = secondaryBgpKey

        /**
         * Returns the raw JSON value of [secondaryCloudAccountId].
         *
         * Unlike [secondaryCloudAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("secondary_cloud_account_id")
        @ExcludeMissing
        fun _secondaryCloudAccountId(): JsonField<String> = secondaryCloudAccountId

        /**
         * Returns the raw JSON value of [secondaryCloudIp].
         *
         * Unlike [secondaryCloudIp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondary_cloud_ip")
        @ExcludeMissing
        fun _secondaryCloudIp(): JsonField<String> = secondaryCloudIp

        /**
         * Returns the raw JSON value of [secondaryEnabled].
         *
         * Unlike [secondaryEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondary_enabled")
        @ExcludeMissing
        fun _secondaryEnabled(): JsonField<Boolean> = secondaryEnabled

        /**
         * Returns the raw JSON value of [secondaryRoutingAnnouncement].
         *
         * Unlike [secondaryRoutingAnnouncement], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("secondary_routing_announcement")
        @ExcludeMissing
        fun _secondaryRoutingAnnouncement(): JsonField<Boolean> = secondaryRoutingAnnouncement

        /**
         * Returns the raw JSON value of [secondaryTelnyxIp].
         *
         * Unlike [secondaryTelnyxIp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondary_telnyx_ip")
        @ExcludeMissing
        fun _secondaryTelnyxIp(): JsonField<String> = secondaryTelnyxIp

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .bgpAsn()
             * .cloudProvider()
             * .cloudProviderRegion()
             * .primaryCloudAccountId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var networkId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<InterfaceStatus> = JsonMissing.of()
            private var regionCode: JsonField<String> = JsonMissing.of()
            private var bgpAsn: JsonField<Double>? = null
            private var cloudProvider: JsonField<CloudProvider>? = null
            private var cloudProviderRegion: JsonField<String>? = null
            private var primaryCloudAccountId: JsonField<String>? = null
            private var bandwidthMbps: JsonField<Double> = JsonMissing.of()
            private var primaryBgpKey: JsonField<String> = JsonMissing.of()
            private var primaryCloudIp: JsonField<String> = JsonMissing.of()
            private var primaryEnabled: JsonField<Boolean> = JsonMissing.of()
            private var primaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of()
            private var primaryTelnyxIp: JsonField<String> = JsonMissing.of()
            private var region: JsonField<Region> = JsonMissing.of()
            private var secondaryBgpKey: JsonField<String> = JsonMissing.of()
            private var secondaryCloudAccountId: JsonField<String> = JsonMissing.of()
            private var secondaryCloudIp: JsonField<String> = JsonMissing.of()
            private var secondaryEnabled: JsonField<Boolean> = JsonMissing.of()
            private var secondaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of()
            private var secondaryTelnyxIp: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                recordType = data.recordType
                updatedAt = data.updatedAt
                name = data.name
                networkId = data.networkId
                status = data.status
                regionCode = data.regionCode
                bgpAsn = data.bgpAsn
                cloudProvider = data.cloudProvider
                cloudProviderRegion = data.cloudProviderRegion
                primaryCloudAccountId = data.primaryCloudAccountId
                bandwidthMbps = data.bandwidthMbps
                primaryBgpKey = data.primaryBgpKey
                primaryCloudIp = data.primaryCloudIp
                primaryEnabled = data.primaryEnabled
                primaryRoutingAnnouncement = data.primaryRoutingAnnouncement
                primaryTelnyxIp = data.primaryTelnyxIp
                region = data.region
                secondaryBgpKey = data.secondaryBgpKey
                secondaryCloudAccountId = data.secondaryCloudAccountId
                secondaryCloudIp = data.secondaryCloudIp
                secondaryEnabled = data.secondaryEnabled
                secondaryRoutingAnnouncement = data.secondaryRoutingAnnouncement
                secondaryTelnyxIp = data.secondaryTelnyxIp
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ISO 8601 formatted date-time indicating when the resource was created. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

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

            /** ISO 8601 formatted date-time indicating when the resource was updated. */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            /** A user specified name for the interface. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The id of the network associated with the interface. */
            fun networkId(networkId: String) = networkId(JsonField.of(networkId))

            /**
             * Sets [Builder.networkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun networkId(networkId: JsonField<String>) = apply { this.networkId = networkId }

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

            /** The region the interface should be deployed to. */
            fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

            /**
             * Sets [Builder.regionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

            /**
             * The Border Gateway Protocol (BGP) Autonomous System Number (ASN). If null, value will
             * be assigned by Telnyx.
             */
            fun bgpAsn(bgpAsn: Double) = bgpAsn(JsonField.of(bgpAsn))

            /**
             * Sets [Builder.bgpAsn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bgpAsn] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bgpAsn(bgpAsn: JsonField<Double>) = apply { this.bgpAsn = bgpAsn }

            /** The Virtual Private Cloud with which you would like to establish a cross connect. */
            fun cloudProvider(cloudProvider: CloudProvider) =
                cloudProvider(JsonField.of(cloudProvider))

            /**
             * Sets [Builder.cloudProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cloudProvider] with a well-typed [CloudProvider]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cloudProvider(cloudProvider: JsonField<CloudProvider>) = apply {
                this.cloudProvider = cloudProvider
            }

            /**
             * The region where your Virtual Private Cloud hosts are located.<br /><br />The
             * available regions can be found using the /virtual_cross_connect_regions endpoint.
             */
            fun cloudProviderRegion(cloudProviderRegion: String) =
                cloudProviderRegion(JsonField.of(cloudProviderRegion))

            /**
             * Sets [Builder.cloudProviderRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cloudProviderRegion] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cloudProviderRegion(cloudProviderRegion: JsonField<String>) = apply {
                this.cloudProviderRegion = cloudProviderRegion
            }

            /**
             * The identifier for your Virtual Private Cloud. The number will be different based
             * upon your Cloud provider.
             */
            fun primaryCloudAccountId(primaryCloudAccountId: String) =
                primaryCloudAccountId(JsonField.of(primaryCloudAccountId))

            /**
             * Sets [Builder.primaryCloudAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCloudAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun primaryCloudAccountId(primaryCloudAccountId: JsonField<String>) = apply {
                this.primaryCloudAccountId = primaryCloudAccountId
            }

            /**
             * The desired throughput in Megabits per Second (Mbps) for your Virtual Cross
             * Connect.<br /><br />The available bandwidths can be found using the
             * /virtual_cross_connect_regions endpoint.
             */
            fun bandwidthMbps(bandwidthMbps: Double) = bandwidthMbps(JsonField.of(bandwidthMbps))

            /**
             * Sets [Builder.bandwidthMbps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bandwidthMbps] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bandwidthMbps(bandwidthMbps: JsonField<Double>) = apply {
                this.bandwidthMbps = bandwidthMbps
            }

            /** The authentication key for BGP peer configuration. */
            fun primaryBgpKey(primaryBgpKey: String) = primaryBgpKey(JsonField.of(primaryBgpKey))

            /**
             * Sets [Builder.primaryBgpKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryBgpKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryBgpKey(primaryBgpKey: JsonField<String>) = apply {
                this.primaryBgpKey = primaryBgpKey
            }

            /**
             * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If
             * none is provided, one will be generated for you.<br /><br />This value can not be
             * patched once the VXC has bene provisioned.
             */
            fun primaryCloudIp(primaryCloudIp: String) =
                primaryCloudIp(JsonField.of(primaryCloudIp))

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

            /**
             * Indicates whether the primary circuit is enabled. Setting this to `false` will
             * disable the circuit.
             */
            fun primaryEnabled(primaryEnabled: Boolean) =
                primaryEnabled(JsonField.of(primaryEnabled))

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

            /** Whether the primary BGP route is being announced. */
            fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: Boolean) =
                primaryRoutingAnnouncement(JsonField.of(primaryRoutingAnnouncement))

            /**
             * Sets [Builder.primaryRoutingAnnouncement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryRoutingAnnouncement] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: JsonField<Boolean>) = apply {
                this.primaryRoutingAnnouncement = primaryRoutingAnnouncement
            }

            /**
             * The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br
             * />If none is provided, one will be generated for you.<br /><br />This value should be
             * null for GCE as Google will only inform you of your assigned IP once the connection
             * has been accepted.
             */
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

            fun region(region: Region) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [Region] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<Region>) = apply { this.region = region }

            /** The authentication key for BGP peer configuration. */
            fun secondaryBgpKey(secondaryBgpKey: String) =
                secondaryBgpKey(JsonField.of(secondaryBgpKey))

            /**
             * Sets [Builder.secondaryBgpKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryBgpKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondaryBgpKey(secondaryBgpKey: JsonField<String>) = apply {
                this.secondaryBgpKey = secondaryBgpKey
            }

            /**
             * The identifier for your Virtual Private Cloud. The number will be different based
             * upon your Cloud provider.<br /><br />This attribute is only necessary for GCE.
             */
            fun secondaryCloudAccountId(secondaryCloudAccountId: String) =
                secondaryCloudAccountId(JsonField.of(secondaryCloudAccountId))

            /**
             * Sets [Builder.secondaryCloudAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryCloudAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun secondaryCloudAccountId(secondaryCloudAccountId: JsonField<String>) = apply {
                this.secondaryCloudAccountId = secondaryCloudAccountId
            }

            /**
             * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If
             * none is provided, one will be generated for you.<br /><br />This value can not be
             * patched once the VXC has bene provisioned.
             */
            fun secondaryCloudIp(secondaryCloudIp: String) =
                secondaryCloudIp(JsonField.of(secondaryCloudIp))

            /**
             * Sets [Builder.secondaryCloudIp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryCloudIp] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondaryCloudIp(secondaryCloudIp: JsonField<String>) = apply {
                this.secondaryCloudIp = secondaryCloudIp
            }

            /**
             * Indicates whether the secondary circuit is enabled. Setting this to `false` will
             * disable the circuit.
             */
            fun secondaryEnabled(secondaryEnabled: Boolean) =
                secondaryEnabled(JsonField.of(secondaryEnabled))

            /**
             * Sets [Builder.secondaryEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondaryEnabled(secondaryEnabled: JsonField<Boolean>) = apply {
                this.secondaryEnabled = secondaryEnabled
            }

            /** Whether the secondary BGP route is being announced. */
            fun secondaryRoutingAnnouncement(secondaryRoutingAnnouncement: Boolean) =
                secondaryRoutingAnnouncement(JsonField.of(secondaryRoutingAnnouncement))

            /**
             * Sets [Builder.secondaryRoutingAnnouncement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryRoutingAnnouncement] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun secondaryRoutingAnnouncement(secondaryRoutingAnnouncement: JsonField<Boolean>) =
                apply {
                    this.secondaryRoutingAnnouncement = secondaryRoutingAnnouncement
                }

            /**
             * The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br
             * />If none is provided, one will be generated for you.<br /><br />This value should be
             * null for GCE as Google will only inform you of your assigned IP once the connection
             * has been accepted.
             */
            fun secondaryTelnyxIp(secondaryTelnyxIp: String) =
                secondaryTelnyxIp(JsonField.of(secondaryTelnyxIp))

            /**
             * Sets [Builder.secondaryTelnyxIp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryTelnyxIp] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondaryTelnyxIp(secondaryTelnyxIp: JsonField<String>) = apply {
                this.secondaryTelnyxIp = secondaryTelnyxIp
            }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .bgpAsn()
             * .cloudProvider()
             * .cloudProviderRegion()
             * .primaryCloudAccountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    id,
                    createdAt,
                    recordType,
                    updatedAt,
                    name,
                    networkId,
                    status,
                    regionCode,
                    checkRequired("bgpAsn", bgpAsn),
                    checkRequired("cloudProvider", cloudProvider),
                    checkRequired("cloudProviderRegion", cloudProviderRegion),
                    checkRequired("primaryCloudAccountId", primaryCloudAccountId),
                    bandwidthMbps,
                    primaryBgpKey,
                    primaryCloudIp,
                    primaryEnabled,
                    primaryRoutingAnnouncement,
                    primaryTelnyxIp,
                    region,
                    secondaryBgpKey,
                    secondaryCloudAccountId,
                    secondaryCloudIp,
                    secondaryEnabled,
                    secondaryRoutingAnnouncement,
                    secondaryTelnyxIp,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            recordType()
            updatedAt()
            name()
            networkId()
            status().ifPresent { it.validate() }
            regionCode()
            bgpAsn()
            cloudProvider().validate()
            cloudProviderRegion()
            primaryCloudAccountId()
            bandwidthMbps()
            primaryBgpKey()
            primaryCloudIp()
            primaryEnabled()
            primaryRoutingAnnouncement()
            primaryTelnyxIp()
            region().ifPresent { it.validate() }
            secondaryBgpKey()
            secondaryCloudAccountId()
            secondaryCloudIp()
            secondaryEnabled()
            secondaryRoutingAnnouncement()
            secondaryTelnyxIp()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (networkId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (regionCode.asKnown().isPresent) 1 else 0) +
                (if (bgpAsn.asKnown().isPresent) 1 else 0) +
                (cloudProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cloudProviderRegion.asKnown().isPresent) 1 else 0) +
                (if (primaryCloudAccountId.asKnown().isPresent) 1 else 0) +
                (if (bandwidthMbps.asKnown().isPresent) 1 else 0) +
                (if (primaryBgpKey.asKnown().isPresent) 1 else 0) +
                (if (primaryCloudIp.asKnown().isPresent) 1 else 0) +
                (if (primaryEnabled.asKnown().isPresent) 1 else 0) +
                (if (primaryRoutingAnnouncement.asKnown().isPresent) 1 else 0) +
                (if (primaryTelnyxIp.asKnown().isPresent) 1 else 0) +
                (region.asKnown().getOrNull()?.validity() ?: 0) +
                (if (secondaryBgpKey.asKnown().isPresent) 1 else 0) +
                (if (secondaryCloudAccountId.asKnown().isPresent) 1 else 0) +
                (if (secondaryCloudIp.asKnown().isPresent) 1 else 0) +
                (if (secondaryEnabled.asKnown().isPresent) 1 else 0) +
                (if (secondaryRoutingAnnouncement.asKnown().isPresent) 1 else 0) +
                (if (secondaryTelnyxIp.asKnown().isPresent) 1 else 0)

        /** The Virtual Private Cloud with which you would like to establish a cross connect. */
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun code(): Optional<String> = code.getOptional("code")

            /**
             * Region name of the interface.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Identifies the type of the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** Region name of the interface. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Identifies the type of the resource. */
                fun recordType(recordType: String) = recordType(JsonField.of(recordType))

                /**
                 * Sets [Builder.recordType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                recordType == other.recordType &&
                updatedAt == other.updatedAt &&
                name == other.name &&
                networkId == other.networkId &&
                status == other.status &&
                regionCode == other.regionCode &&
                bgpAsn == other.bgpAsn &&
                cloudProvider == other.cloudProvider &&
                cloudProviderRegion == other.cloudProviderRegion &&
                primaryCloudAccountId == other.primaryCloudAccountId &&
                bandwidthMbps == other.bandwidthMbps &&
                primaryBgpKey == other.primaryBgpKey &&
                primaryCloudIp == other.primaryCloudIp &&
                primaryEnabled == other.primaryEnabled &&
                primaryRoutingAnnouncement == other.primaryRoutingAnnouncement &&
                primaryTelnyxIp == other.primaryTelnyxIp &&
                region == other.region &&
                secondaryBgpKey == other.secondaryBgpKey &&
                secondaryCloudAccountId == other.secondaryCloudAccountId &&
                secondaryCloudIp == other.secondaryCloudIp &&
                secondaryEnabled == other.secondaryEnabled &&
                secondaryRoutingAnnouncement == other.secondaryRoutingAnnouncement &&
                secondaryTelnyxIp == other.secondaryTelnyxIp &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                recordType,
                updatedAt,
                name,
                networkId,
                status,
                regionCode,
                bgpAsn,
                cloudProvider,
                cloudProviderRegion,
                primaryCloudAccountId,
                bandwidthMbps,
                primaryBgpKey,
                primaryCloudIp,
                primaryEnabled,
                primaryRoutingAnnouncement,
                primaryTelnyxIp,
                region,
                secondaryBgpKey,
                secondaryCloudAccountId,
                secondaryCloudIp,
                secondaryEnabled,
                secondaryRoutingAnnouncement,
                secondaryTelnyxIp,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, recordType=$recordType, updatedAt=$updatedAt, name=$name, networkId=$networkId, status=$status, regionCode=$regionCode, bgpAsn=$bgpAsn, cloudProvider=$cloudProvider, cloudProviderRegion=$cloudProviderRegion, primaryCloudAccountId=$primaryCloudAccountId, bandwidthMbps=$bandwidthMbps, primaryBgpKey=$primaryBgpKey, primaryCloudIp=$primaryCloudIp, primaryEnabled=$primaryEnabled, primaryRoutingAnnouncement=$primaryRoutingAnnouncement, primaryTelnyxIp=$primaryTelnyxIp, region=$region, secondaryBgpKey=$secondaryBgpKey, secondaryCloudAccountId=$secondaryCloudAccountId, secondaryCloudIp=$secondaryCloudIp, secondaryEnabled=$secondaryEnabled, secondaryRoutingAnnouncement=$secondaryRoutingAnnouncement, secondaryTelnyxIp=$secondaryTelnyxIp, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VirtualCrossConnectRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
