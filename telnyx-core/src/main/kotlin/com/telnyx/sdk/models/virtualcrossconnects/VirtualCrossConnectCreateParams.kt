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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.globalipassignments.Record
import com.telnyx.sdk.models.networks.InterfaceStatus
import com.telnyx.sdk.models.publicinternetgateways.NetworkInterface
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new Virtual Cross Connect.<br /><br />For AWS and GCE, you have the option of creating
 * the primary connection first and the secondary connection later. You also have the option of
 * disabling the primary and/or secondary connections at any time and later re-enabling them. With
 * Azure, you do not have this option. Azure requires both the primary and secondary connections to
 * be created at the same time and they can not be independantly disabled.
 */
class VirtualCrossConnectCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = body.createdAt()

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = body.recordType()

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = body.updatedAt()

    /**
     * A user specified name for the interface.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * The id of the network associated with the interface.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkId(): Optional<String> = body.networkId()

    /**
     * The current status of the interface deployment.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<InterfaceStatus> = body.status()

    /**
     * The region the interface should be deployed to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun regionCode(): String = body.regionCode()

    /**
     * The desired throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.<br /><br
     * />The available bandwidths can be found using the /virtual_cross_connect_regions endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bandwidthMbps(): Optional<Double> = body.bandwidthMbps()

    /**
     * The Border Gateway Protocol (BGP) Autonomous System Number (ASN). If null, value will be
     * assigned by Telnyx.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bgpAsn(): Optional<Double> = body.bgpAsn()

    /**
     * The Virtual Private Cloud with which you would like to establish a cross connect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cloudProvider(): Optional<CloudProvider> = body.cloudProvider()

    /**
     * The region where your Virtual Private Cloud hosts are located.<br /><br />The available
     * regions can be found using the /virtual_cross_connect_regions endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cloudProviderRegion(): Optional<String> = body.cloudProviderRegion()

    /**
     * The authentication key for BGP peer configuration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryBgpKey(): Optional<String> = body.primaryBgpKey()

    /**
     * The identifier for your Virtual Private Cloud. The number will be different based upon your
     * Cloud provider.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryCloudAccountId(): Optional<String> = body.primaryCloudAccountId()

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
     * provided, one will be generated for you.<br /><br />This value should be null for GCE as
     * Google will only inform you of your assigned IP once the connection has been accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryCloudIp(): Optional<String> = body.primaryCloudIp()

    /**
     * Indicates whether the primary circuit is enabled. Setting this to `false` will disable the
     * circuit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryEnabled(): Optional<Boolean> = body.primaryEnabled()

    /**
     * The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br />If none
     * is provided, one will be generated for you.<br /><br />This value should be null for GCE as
     * Google will only inform you of your assigned IP once the connection has been accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryTelnyxIp(): Optional<String> = body.primaryTelnyxIp()

    /**
     * The authentication key for BGP peer configuration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryBgpKey(): Optional<String> = body.secondaryBgpKey()

    /**
     * The identifier for your Virtual Private Cloud. The number will be different based upon your
     * Cloud provider.<br /><br />This attribute is only necessary for GCE.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryCloudAccountId(): Optional<String> = body.secondaryCloudAccountId()

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
     * provided, one will be generated for you.<br /><br />This value should be null for GCE as
     * Google will only inform you of your assigned IP once the connection has been accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryCloudIp(): Optional<String> = body.secondaryCloudIp()

    /**
     * Indicates whether the secondary circuit is enabled. Setting this to `false` will disable the
     * circuit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryEnabled(): Optional<Boolean> = body.secondaryEnabled()

    /**
     * The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br />If none
     * is provided, one will be generated for you.<br /><br />This value should be null for GCE as
     * Google will only inform you of your assigned IP once the connection has been accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryTelnyxIp(): Optional<String> = body.secondaryTelnyxIp()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAt(): JsonField<String> = body._createdAt()

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordType(): JsonField<String> = body._recordType()

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _updatedAt(): JsonField<String> = body._updatedAt()

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<InterfaceStatus> = body._status()

    /**
     * Returns the raw JSON value of [regionCode].
     *
     * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _regionCode(): JsonField<String> = body._regionCode()

    /**
     * Returns the raw JSON value of [bandwidthMbps].
     *
     * Unlike [bandwidthMbps], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bandwidthMbps(): JsonField<Double> = body._bandwidthMbps()

    /**
     * Returns the raw JSON value of [bgpAsn].
     *
     * Unlike [bgpAsn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bgpAsn(): JsonField<Double> = body._bgpAsn()

    /**
     * Returns the raw JSON value of [cloudProvider].
     *
     * Unlike [cloudProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cloudProvider(): JsonField<CloudProvider> = body._cloudProvider()

    /**
     * Returns the raw JSON value of [cloudProviderRegion].
     *
     * Unlike [cloudProviderRegion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cloudProviderRegion(): JsonField<String> = body._cloudProviderRegion()

    /**
     * Returns the raw JSON value of [primaryBgpKey].
     *
     * Unlike [primaryBgpKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryBgpKey(): JsonField<String> = body._primaryBgpKey()

    /**
     * Returns the raw JSON value of [primaryCloudAccountId].
     *
     * Unlike [primaryCloudAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _primaryCloudAccountId(): JsonField<String> = body._primaryCloudAccountId()

    /**
     * Returns the raw JSON value of [primaryCloudIp].
     *
     * Unlike [primaryCloudIp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryCloudIp(): JsonField<String> = body._primaryCloudIp()

    /**
     * Returns the raw JSON value of [primaryEnabled].
     *
     * Unlike [primaryEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryEnabled(): JsonField<Boolean> = body._primaryEnabled()

    /**
     * Returns the raw JSON value of [primaryTelnyxIp].
     *
     * Unlike [primaryTelnyxIp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryTelnyxIp(): JsonField<String> = body._primaryTelnyxIp()

    /**
     * Returns the raw JSON value of [secondaryBgpKey].
     *
     * Unlike [secondaryBgpKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _secondaryBgpKey(): JsonField<String> = body._secondaryBgpKey()

    /**
     * Returns the raw JSON value of [secondaryCloudAccountId].
     *
     * Unlike [secondaryCloudAccountId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _secondaryCloudAccountId(): JsonField<String> = body._secondaryCloudAccountId()

    /**
     * Returns the raw JSON value of [secondaryCloudIp].
     *
     * Unlike [secondaryCloudIp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _secondaryCloudIp(): JsonField<String> = body._secondaryCloudIp()

    /**
     * Returns the raw JSON value of [secondaryEnabled].
     *
     * Unlike [secondaryEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _secondaryEnabled(): JsonField<Boolean> = body._secondaryEnabled()

    /**
     * Returns the raw JSON value of [secondaryTelnyxIp].
     *
     * Unlike [secondaryTelnyxIp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _secondaryTelnyxIp(): JsonField<String> = body._secondaryTelnyxIp()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualCrossConnectCreateParams].
         *
         * The following fields are required:
         * ```java
         * .regionCode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(virtualCrossConnectCreateParams: VirtualCrossConnectCreateParams) =
            apply {
                body = virtualCrossConnectCreateParams.body.toBuilder()
                additionalHeaders = virtualCrossConnectCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    virtualCrossConnectCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [createdAt]
         * - [recordType]
         * - [updatedAt]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Identifies the resource. */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: String) = apply { body.createdAt(createdAt) }

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { body.createdAt(createdAt) }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = apply { body.recordType(recordType) }

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { body.recordType(recordType) }

        /** ISO 8601 formatted date-time indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = apply { body.updatedAt(updatedAt) }

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { body.updatedAt(updatedAt) }

        /** A user specified name for the interface. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The id of the network associated with the interface. */
        fun networkId(networkId: String) = apply { body.networkId(networkId) }

        /**
         * Sets [Builder.networkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun networkId(networkId: JsonField<String>) = apply { body.networkId(networkId) }

        /** The current status of the interface deployment. */
        fun status(status: InterfaceStatus) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [InterfaceStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<InterfaceStatus>) = apply { body.status(status) }

        /** The region the interface should be deployed to. */
        fun regionCode(regionCode: String) = apply { body.regionCode(regionCode) }

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { body.regionCode(regionCode) }

        /**
         * The desired throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.<br
         * /><br />The available bandwidths can be found using the /virtual_cross_connect_regions
         * endpoint.
         */
        fun bandwidthMbps(bandwidthMbps: Double) = apply { body.bandwidthMbps(bandwidthMbps) }

        /**
         * Sets [Builder.bandwidthMbps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bandwidthMbps] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bandwidthMbps(bandwidthMbps: JsonField<Double>) = apply {
            body.bandwidthMbps(bandwidthMbps)
        }

        /**
         * The Border Gateway Protocol (BGP) Autonomous System Number (ASN). If null, value will be
         * assigned by Telnyx.
         */
        fun bgpAsn(bgpAsn: Double) = apply { body.bgpAsn(bgpAsn) }

        /**
         * Sets [Builder.bgpAsn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bgpAsn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bgpAsn(bgpAsn: JsonField<Double>) = apply { body.bgpAsn(bgpAsn) }

        /** The Virtual Private Cloud with which you would like to establish a cross connect. */
        fun cloudProvider(cloudProvider: CloudProvider) = apply {
            body.cloudProvider(cloudProvider)
        }

        /**
         * Sets [Builder.cloudProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloudProvider] with a well-typed [CloudProvider] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cloudProvider(cloudProvider: JsonField<CloudProvider>) = apply {
            body.cloudProvider(cloudProvider)
        }

        /**
         * The region where your Virtual Private Cloud hosts are located.<br /><br />The available
         * regions can be found using the /virtual_cross_connect_regions endpoint.
         */
        fun cloudProviderRegion(cloudProviderRegion: String) = apply {
            body.cloudProviderRegion(cloudProviderRegion)
        }

        /**
         * Sets [Builder.cloudProviderRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloudProviderRegion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cloudProviderRegion(cloudProviderRegion: JsonField<String>) = apply {
            body.cloudProviderRegion(cloudProviderRegion)
        }

        /** The authentication key for BGP peer configuration. */
        fun primaryBgpKey(primaryBgpKey: String) = apply { body.primaryBgpKey(primaryBgpKey) }

        /**
         * Sets [Builder.primaryBgpKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryBgpKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryBgpKey(primaryBgpKey: JsonField<String>) = apply {
            body.primaryBgpKey(primaryBgpKey)
        }

        /**
         * The identifier for your Virtual Private Cloud. The number will be different based upon
         * your Cloud provider.
         */
        fun primaryCloudAccountId(primaryCloudAccountId: String) = apply {
            body.primaryCloudAccountId(primaryCloudAccountId)
        }

        /**
         * Sets [Builder.primaryCloudAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCloudAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCloudAccountId(primaryCloudAccountId: JsonField<String>) = apply {
            body.primaryCloudAccountId(primaryCloudAccountId)
        }

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value should be null for GCE as
         * Google will only inform you of your assigned IP once the connection has been accepted.
         */
        fun primaryCloudIp(primaryCloudIp: String) = apply { body.primaryCloudIp(primaryCloudIp) }

        /**
         * Sets [Builder.primaryCloudIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCloudIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCloudIp(primaryCloudIp: JsonField<String>) = apply {
            body.primaryCloudIp(primaryCloudIp)
        }

        /**
         * Indicates whether the primary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         */
        fun primaryEnabled(primaryEnabled: Boolean) = apply { body.primaryEnabled(primaryEnabled) }

        /**
         * Sets [Builder.primaryEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryEnabled(primaryEnabled: JsonField<Boolean>) = apply {
            body.primaryEnabled(primaryEnabled)
        }

        /**
         * The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br />If
         * none is provided, one will be generated for you.<br /><br />This value should be null for
         * GCE as Google will only inform you of your assigned IP once the connection has been
         * accepted.
         */
        fun primaryTelnyxIp(primaryTelnyxIp: String) = apply {
            body.primaryTelnyxIp(primaryTelnyxIp)
        }

        /**
         * Sets [Builder.primaryTelnyxIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryTelnyxIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryTelnyxIp(primaryTelnyxIp: JsonField<String>) = apply {
            body.primaryTelnyxIp(primaryTelnyxIp)
        }

        /** The authentication key for BGP peer configuration. */
        fun secondaryBgpKey(secondaryBgpKey: String) = apply {
            body.secondaryBgpKey(secondaryBgpKey)
        }

        /**
         * Sets [Builder.secondaryBgpKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryBgpKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryBgpKey(secondaryBgpKey: JsonField<String>) = apply {
            body.secondaryBgpKey(secondaryBgpKey)
        }

        /**
         * The identifier for your Virtual Private Cloud. The number will be different based upon
         * your Cloud provider.<br /><br />This attribute is only necessary for GCE.
         */
        fun secondaryCloudAccountId(secondaryCloudAccountId: String) = apply {
            body.secondaryCloudAccountId(secondaryCloudAccountId)
        }

        /**
         * Sets [Builder.secondaryCloudAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryCloudAccountId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun secondaryCloudAccountId(secondaryCloudAccountId: JsonField<String>) = apply {
            body.secondaryCloudAccountId(secondaryCloudAccountId)
        }

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value should be null for GCE as
         * Google will only inform you of your assigned IP once the connection has been accepted.
         */
        fun secondaryCloudIp(secondaryCloudIp: String) = apply {
            body.secondaryCloudIp(secondaryCloudIp)
        }

        /**
         * Sets [Builder.secondaryCloudIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryCloudIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryCloudIp(secondaryCloudIp: JsonField<String>) = apply {
            body.secondaryCloudIp(secondaryCloudIp)
        }

        /**
         * Indicates whether the secondary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         */
        fun secondaryEnabled(secondaryEnabled: Boolean) = apply {
            body.secondaryEnabled(secondaryEnabled)
        }

        /**
         * Sets [Builder.secondaryEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryEnabled(secondaryEnabled: JsonField<Boolean>) = apply {
            body.secondaryEnabled(secondaryEnabled)
        }

        /**
         * The IP address assigned to the Telnyx side of the Virtual Cross Connect.<br /><br />If
         * none is provided, one will be generated for you.<br /><br />This value should be null for
         * GCE as Google will only inform you of your assigned IP once the connection has been
         * accepted.
         */
        fun secondaryTelnyxIp(secondaryTelnyxIp: String) = apply {
            body.secondaryTelnyxIp(secondaryTelnyxIp)
        }

        /**
         * Sets [Builder.secondaryTelnyxIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryTelnyxIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryTelnyxIp(secondaryTelnyxIp: JsonField<String>) = apply {
            body.secondaryTelnyxIp(secondaryTelnyxIp)
        }

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
         * Returns an immutable instance of [VirtualCrossConnectCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .regionCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VirtualCrossConnectCreateParams =
            VirtualCrossConnectCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
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
        private val bandwidthMbps: JsonField<Double>,
        private val bgpAsn: JsonField<Double>,
        private val cloudProvider: JsonField<CloudProvider>,
        private val cloudProviderRegion: JsonField<String>,
        private val primaryBgpKey: JsonField<String>,
        private val primaryCloudAccountId: JsonField<String>,
        private val primaryCloudIp: JsonField<String>,
        private val primaryEnabled: JsonField<Boolean>,
        private val primaryTelnyxIp: JsonField<String>,
        private val secondaryBgpKey: JsonField<String>,
        private val secondaryCloudAccountId: JsonField<String>,
        private val secondaryCloudIp: JsonField<String>,
        private val secondaryEnabled: JsonField<Boolean>,
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
            @JsonProperty("primary_telnyx_ip")
            @ExcludeMissing
            primaryTelnyxIp: JsonField<String> = JsonMissing.of(),
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
            bandwidthMbps,
            bgpAsn,
            cloudProvider,
            cloudProviderRegion,
            primaryBgpKey,
            primaryCloudAccountId,
            primaryCloudIp,
            primaryEnabled,
            primaryTelnyxIp,
            secondaryBgpKey,
            secondaryCloudAccountId,
            secondaryCloudIp,
            secondaryEnabled,
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

        fun toNetworkInterface(): NetworkInterface =
            NetworkInterface.builder().name(name).networkId(networkId).status(status).build()

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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun regionCode(): String = regionCode.getRequired("region_code")

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
         * The Border Gateway Protocol (BGP) Autonomous System Number (ASN). If null, value will be
         * assigned by Telnyx.
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
         * The region where your Virtual Private Cloud hosts are located.<br /><br />The available
         * regions can be found using the /virtual_cross_connect_regions endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cloudProviderRegion(): Optional<String> =
            cloudProviderRegion.getOptional("cloud_provider_region")

        /**
         * The authentication key for BGP peer configuration.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryBgpKey(): Optional<String> = primaryBgpKey.getOptional("primary_bgp_key")

        /**
         * The identifier for your Virtual Private Cloud. The number will be different based upon
         * your Cloud provider.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCloudAccountId(): Optional<String> =
            primaryCloudAccountId.getOptional("primary_cloud_account_id")

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value should be null for GCE as
         * Google will only inform you of your assigned IP once the connection has been accepted.
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
         * provided, one will be generated for you.<br /><br />This value should be null for GCE as
         * Google will only inform you of your assigned IP once the connection has been accepted.
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
         * Returns the raw JSON value of [bandwidthMbps].
         *
         * Unlike [bandwidthMbps], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [primaryBgpKey].
         *
         * Unlike [primaryBgpKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_bgp_key")
        @ExcludeMissing
        fun _primaryBgpKey(): JsonField<String> = primaryBgpKey

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
         * Returns the raw JSON value of [primaryTelnyxIp].
         *
         * Unlike [primaryTelnyxIp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_telnyx_ip")
        @ExcludeMissing
        fun _primaryTelnyxIp(): JsonField<String> = primaryTelnyxIp

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .regionCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var networkId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<InterfaceStatus> = JsonMissing.of()
            private var regionCode: JsonField<String>? = null
            private var bandwidthMbps: JsonField<Double> = JsonMissing.of()
            private var bgpAsn: JsonField<Double> = JsonMissing.of()
            private var cloudProvider: JsonField<CloudProvider> = JsonMissing.of()
            private var cloudProviderRegion: JsonField<String> = JsonMissing.of()
            private var primaryBgpKey: JsonField<String> = JsonMissing.of()
            private var primaryCloudAccountId: JsonField<String> = JsonMissing.of()
            private var primaryCloudIp: JsonField<String> = JsonMissing.of()
            private var primaryEnabled: JsonField<Boolean> = JsonMissing.of()
            private var primaryTelnyxIp: JsonField<String> = JsonMissing.of()
            private var secondaryBgpKey: JsonField<String> = JsonMissing.of()
            private var secondaryCloudAccountId: JsonField<String> = JsonMissing.of()
            private var secondaryCloudIp: JsonField<String> = JsonMissing.of()
            private var secondaryEnabled: JsonField<Boolean> = JsonMissing.of()
            private var secondaryTelnyxIp: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                createdAt = body.createdAt
                recordType = body.recordType
                updatedAt = body.updatedAt
                name = body.name
                networkId = body.networkId
                status = body.status
                regionCode = body.regionCode
                bandwidthMbps = body.bandwidthMbps
                bgpAsn = body.bgpAsn
                cloudProvider = body.cloudProvider
                cloudProviderRegion = body.cloudProviderRegion
                primaryBgpKey = body.primaryBgpKey
                primaryCloudAccountId = body.primaryCloudAccountId
                primaryCloudIp = body.primaryCloudIp
                primaryEnabled = body.primaryEnabled
                primaryTelnyxIp = body.primaryTelnyxIp
                secondaryBgpKey = body.secondaryBgpKey
                secondaryCloudAccountId = body.secondaryCloudAccountId
                secondaryCloudIp = body.secondaryCloudIp
                secondaryEnabled = body.secondaryEnabled
                secondaryTelnyxIp = body.secondaryTelnyxIp
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If
             * none is provided, one will be generated for you.<br /><br />This value should be null
             * for GCE as Google will only inform you of your assigned IP once the connection has
             * been accepted.
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
             * none is provided, one will be generated for you.<br /><br />This value should be null
             * for GCE as Google will only inform you of your assigned IP once the connection has
             * been accepted.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .regionCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    id,
                    createdAt,
                    recordType,
                    updatedAt,
                    name,
                    networkId,
                    status,
                    checkRequired("regionCode", regionCode),
                    bandwidthMbps,
                    bgpAsn,
                    cloudProvider,
                    cloudProviderRegion,
                    primaryBgpKey,
                    primaryCloudAccountId,
                    primaryCloudIp,
                    primaryEnabled,
                    primaryTelnyxIp,
                    secondaryBgpKey,
                    secondaryCloudAccountId,
                    secondaryCloudIp,
                    secondaryEnabled,
                    secondaryTelnyxIp,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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
            bandwidthMbps()
            bgpAsn()
            cloudProvider().ifPresent { it.validate() }
            cloudProviderRegion()
            primaryBgpKey()
            primaryCloudAccountId()
            primaryCloudIp()
            primaryEnabled()
            primaryTelnyxIp()
            secondaryBgpKey()
            secondaryCloudAccountId()
            secondaryCloudIp()
            secondaryEnabled()
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
                (if (bandwidthMbps.asKnown().isPresent) 1 else 0) +
                (if (bgpAsn.asKnown().isPresent) 1 else 0) +
                (cloudProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cloudProviderRegion.asKnown().isPresent) 1 else 0) +
                (if (primaryBgpKey.asKnown().isPresent) 1 else 0) +
                (if (primaryCloudAccountId.asKnown().isPresent) 1 else 0) +
                (if (primaryCloudIp.asKnown().isPresent) 1 else 0) +
                (if (primaryEnabled.asKnown().isPresent) 1 else 0) +
                (if (primaryTelnyxIp.asKnown().isPresent) 1 else 0) +
                (if (secondaryBgpKey.asKnown().isPresent) 1 else 0) +
                (if (secondaryCloudAccountId.asKnown().isPresent) 1 else 0) +
                (if (secondaryCloudIp.asKnown().isPresent) 1 else 0) +
                (if (secondaryEnabled.asKnown().isPresent) 1 else 0) +
                (if (secondaryTelnyxIp.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                createdAt == other.createdAt &&
                recordType == other.recordType &&
                updatedAt == other.updatedAt &&
                name == other.name &&
                networkId == other.networkId &&
                status == other.status &&
                regionCode == other.regionCode &&
                bandwidthMbps == other.bandwidthMbps &&
                bgpAsn == other.bgpAsn &&
                cloudProvider == other.cloudProvider &&
                cloudProviderRegion == other.cloudProviderRegion &&
                primaryBgpKey == other.primaryBgpKey &&
                primaryCloudAccountId == other.primaryCloudAccountId &&
                primaryCloudIp == other.primaryCloudIp &&
                primaryEnabled == other.primaryEnabled &&
                primaryTelnyxIp == other.primaryTelnyxIp &&
                secondaryBgpKey == other.secondaryBgpKey &&
                secondaryCloudAccountId == other.secondaryCloudAccountId &&
                secondaryCloudIp == other.secondaryCloudIp &&
                secondaryEnabled == other.secondaryEnabled &&
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
                bandwidthMbps,
                bgpAsn,
                cloudProvider,
                cloudProviderRegion,
                primaryBgpKey,
                primaryCloudAccountId,
                primaryCloudIp,
                primaryEnabled,
                primaryTelnyxIp,
                secondaryBgpKey,
                secondaryCloudAccountId,
                secondaryCloudIp,
                secondaryEnabled,
                secondaryTelnyxIp,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, createdAt=$createdAt, recordType=$recordType, updatedAt=$updatedAt, name=$name, networkId=$networkId, status=$status, regionCode=$regionCode, bandwidthMbps=$bandwidthMbps, bgpAsn=$bgpAsn, cloudProvider=$cloudProvider, cloudProviderRegion=$cloudProviderRegion, primaryBgpKey=$primaryBgpKey, primaryCloudAccountId=$primaryCloudAccountId, primaryCloudIp=$primaryCloudIp, primaryEnabled=$primaryEnabled, primaryTelnyxIp=$primaryTelnyxIp, secondaryBgpKey=$secondaryBgpKey, secondaryCloudAccountId=$secondaryCloudAccountId, secondaryCloudIp=$secondaryCloudIp, secondaryEnabled=$secondaryEnabled, secondaryTelnyxIp=$secondaryTelnyxIp, additionalProperties=$additionalProperties}"
    }

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

        return other is VirtualCrossConnectCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VirtualCrossConnectCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
