// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WirelessPrivateWirelessGateway
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val addressMode: JsonField<AddressMode>,
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
        @JsonProperty("address_mode")
        @ExcludeMissing
        addressMode: JsonField<AddressMode> = JsonMissing.of(),
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
        addressMode,
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
     * The address mode of the private wireless gateway. With static, each SIM card gets a fixed IP
     * address from the gateway's IP range that is preserved across sessions. With dynamic, IP
     * addresses are assigned by the network at attach time and may change between sessions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressMode(): Optional<AddressMode> = addressMode.getOptional("address_mode")

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
     * Returns the raw JSON value of [addressMode].
     *
     * Unlike [addressMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address_mode")
    @ExcludeMissing
    fun _addressMode(): JsonField<AddressMode> = addressMode

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [WirelessPrivateWirelessGateway].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WirelessPrivateWirelessGateway]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var addressMode: JsonField<AddressMode> = JsonMissing.of()
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
        internal fun from(wirelessPrivateWirelessGateway: WirelessPrivateWirelessGateway) = apply {
            id = wirelessPrivateWirelessGateway.id
            addressMode = wirelessPrivateWirelessGateway.addressMode
            assignedResources =
                wirelessPrivateWirelessGateway.assignedResources.map { it.toMutableList() }
            createdAt = wirelessPrivateWirelessGateway.createdAt
            ipRange = wirelessPrivateWirelessGateway.ipRange
            name = wirelessPrivateWirelessGateway.name
            networkId = wirelessPrivateWirelessGateway.networkId
            recordType = wirelessPrivateWirelessGateway.recordType
            regionCode = wirelessPrivateWirelessGateway.regionCode
            status = wirelessPrivateWirelessGateway.status
            updatedAt = wirelessPrivateWirelessGateway.updatedAt
            additionalProperties =
                wirelessPrivateWirelessGateway.additionalProperties.toMutableMap()
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
         * The address mode of the private wireless gateway. With static, each SIM card gets a fixed
         * IP address from the gateway's IP range that is preserved across sessions. With dynamic,
         * IP addresses are assigned by the network at attach time and may change between sessions.
         */
        fun addressMode(addressMode: AddressMode) = addressMode(JsonField.of(addressMode))

        /**
         * Sets [Builder.addressMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressMode] with a well-typed [AddressMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addressMode(addressMode: JsonField<AddressMode>) = apply {
            this.addressMode = addressMode
        }

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
         * Returns an immutable instance of [WirelessPrivateWirelessGateway].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WirelessPrivateWirelessGateway =
            WirelessPrivateWirelessGateway(
                id,
                addressMode,
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): WirelessPrivateWirelessGateway = apply {
        if (validated) {
            return@apply
        }

        id()
        addressMode().ifPresent { it.validate() }
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
            (addressMode.asKnown().getOrNull()?.validity() ?: 0) +
            (assignedResources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (ipRange.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (networkId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (regionCode.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * The address mode of the private wireless gateway. With static, each SIM card gets a fixed IP
     * address from the gateway's IP range that is preserved across sessions. With dynamic, IP
     * addresses are assigned by the network at attach time and may change between sessions.
     */
    class AddressMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val STATIC = of("static")

            @JvmField val DYNAMIC = of("dynamic")

            @JvmStatic fun of(value: String) = AddressMode(JsonField.of(value))
        }

        /** An enum containing [AddressMode]'s known values. */
        enum class Known {
            STATIC,
            DYNAMIC,
        }

        /**
         * An enum containing [AddressMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AddressMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STATIC,
            DYNAMIC,
            /**
             * An enum member indicating that [AddressMode] was instantiated with an unknown value.
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
                STATIC -> Value.STATIC
                DYNAMIC -> Value.DYNAMIC
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
                STATIC -> Known.STATIC
                DYNAMIC -> Known.DYNAMIC
                else -> throw TelnyxInvalidDataException("Unknown AddressMode: $value")
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
        fun validate(): AddressMode = apply {
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

            return other is AddressMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WirelessPrivateWirelessGateway &&
            id == other.id &&
            addressMode == other.addressMode &&
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
            addressMode,
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
        "WirelessPrivateWirelessGateway{id=$id, addressMode=$addressMode, assignedResources=$assignedResources, createdAt=$createdAt, ipRange=$ipRange, name=$name, networkId=$networkId, recordType=$recordType, regionCode=$regionCode, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
