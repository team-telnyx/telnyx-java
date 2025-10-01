// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PrivateWirelessGateway
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val assignedResources: JsonField<List<PwgAssignedResourcesSummary>>,
    private val createdAt: JsonField<String>,
    private val ipRange: JsonField<String>,
    private val name: JsonField<String>,
    private val networkId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val regionCode: JsonField<String>,
    private val status: JsonField<PrivateWirelessGatewayStatus>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assigned_resources")
        @ExcludeMissing
        assignedResources: JsonField<List<PwgAssignedResourcesSummary>> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ip_range") @ExcludeMissing ipRange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_id") @ExcludeMissing networkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region_code")
        @ExcludeMissing
        regionCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PrivateWirelessGatewayStatus> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        assignedResources,
        createdAt,
        ipRange,
        name,
        networkId,
        recordType,
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
     * A list of the resources that have been assigned to the Private Wireless Gateway.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignedResources(): Optional<List<PwgAssignedResourcesSummary>> =
        assignedResources.getOptional("assigned_resources")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * IP block used to assign IPs to the SIM cards in the Private Wireless Gateway.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipRange(): Optional<String> = ipRange.getOptional("ip_range")

    /**
     * The private wireless gateway name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The identification of the related network resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkId(): Optional<String> = networkId.getOptional("network_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * The name of the region where the Private Wireless Gateway is deployed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionCode(): Optional<String> = regionCode.getOptional("region_code")

    /**
     * The current status or failure details of the Private Wireless Gateway.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<PrivateWirelessGatewayStatus> = status.getOptional("status")

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
     * Returns the raw JSON value of [assignedResources].
     *
     * Unlike [assignedResources], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("assigned_resources")
    @ExcludeMissing
    fun _assignedResources(): JsonField<List<PwgAssignedResourcesSummary>> = assignedResources

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [ipRange].
     *
     * Unlike [ipRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ip_range") @ExcludeMissing fun _ipRange(): JsonField<String> = ipRange

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
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<PrivateWirelessGatewayStatus> = status

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

        /** Returns a mutable builder for constructing an instance of [PrivateWirelessGateway]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrivateWirelessGateway]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var assignedResources: JsonField<MutableList<PwgAssignedResourcesSummary>>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var ipRange: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var networkId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var regionCode: JsonField<String> = JsonMissing.of()
        private var status: JsonField<PrivateWirelessGatewayStatus> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(privateWirelessGateway: PrivateWirelessGateway) = apply {
            id = privateWirelessGateway.id
            assignedResources = privateWirelessGateway.assignedResources.map { it.toMutableList() }
            createdAt = privateWirelessGateway.createdAt
            ipRange = privateWirelessGateway.ipRange
            name = privateWirelessGateway.name
            networkId = privateWirelessGateway.networkId
            recordType = privateWirelessGateway.recordType
            regionCode = privateWirelessGateway.regionCode
            status = privateWirelessGateway.status
            updatedAt = privateWirelessGateway.updatedAt
            additionalProperties = privateWirelessGateway.additionalProperties.toMutableMap()
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

        /** A list of the resources that have been assigned to the Private Wireless Gateway. */
        fun assignedResources(assignedResources: List<PwgAssignedResourcesSummary>) =
            assignedResources(JsonField.of(assignedResources))

        /**
         * Sets [Builder.assignedResources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedResources] with a well-typed
         * `List<PwgAssignedResourcesSummary>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun assignedResources(assignedResources: JsonField<List<PwgAssignedResourcesSummary>>) =
            apply {
                this.assignedResources = assignedResources.map { it.toMutableList() }
            }

        /**
         * Adds a single [PwgAssignedResourcesSummary] to [assignedResources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssignedResource(assignedResource: PwgAssignedResourcesSummary) = apply {
            assignedResources =
                (assignedResources ?: JsonField.of(mutableListOf())).also {
                    checkKnown("assignedResources", it).add(assignedResource)
                }
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

        /** IP block used to assign IPs to the SIM cards in the Private Wireless Gateway. */
        fun ipRange(ipRange: String) = ipRange(JsonField.of(ipRange))

        /**
         * Sets [Builder.ipRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipRange] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ipRange(ipRange: JsonField<String>) = apply { this.ipRange = ipRange }

        /** The private wireless gateway name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The identification of the related network resource. */
        fun networkId(networkId: String) = networkId(JsonField.of(networkId))

        /**
         * Sets [Builder.networkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun networkId(networkId: JsonField<String>) = apply { this.networkId = networkId }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** The name of the region where the Private Wireless Gateway is deployed. */
        fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

        /** The current status or failure details of the Private Wireless Gateway. */
        fun status(status: PrivateWirelessGatewayStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PrivateWirelessGatewayStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<PrivateWirelessGatewayStatus>) = apply { this.status = status }

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
         * Returns an immutable instance of [PrivateWirelessGateway].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PrivateWirelessGateway =
            PrivateWirelessGateway(
                id,
                (assignedResources ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                ipRange,
                name,
                networkId,
                recordType,
                regionCode,
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PrivateWirelessGateway = apply {
        if (validated) {
            return@apply
        }

        id()
        assignedResources().ifPresent { it.forEach { it.validate() } }
        createdAt()
        ipRange()
        name()
        networkId()
        recordType()
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
            (assignedResources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (ipRange.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (networkId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (regionCode.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrivateWirelessGateway &&
            id == other.id &&
            assignedResources == other.assignedResources &&
            createdAt == other.createdAt &&
            ipRange == other.ipRange &&
            name == other.name &&
            networkId == other.networkId &&
            recordType == other.recordType &&
            regionCode == other.regionCode &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            assignedResources,
            createdAt,
            ipRange,
            name,
            networkId,
            recordType,
            regionCode,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrivateWirelessGateway{id=$id, assignedResources=$assignedResources, createdAt=$createdAt, ipRange=$ipRange, name=$name, networkId=$networkId, recordType=$recordType, regionCode=$regionCode, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
