// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.networks.InterfaceStatus
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GlobalIpAssignment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val recordType: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val globalIpId: JsonField<String>,
    private val isAnnounced: JsonField<Boolean>,
    private val isConnected: JsonField<Boolean>,
    private val isInMaintenance: JsonField<Boolean>,
    private val status: JsonField<InterfaceStatus>,
    private val wireguardPeerId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("global_ip_id")
        @ExcludeMissing
        globalIpId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_announced")
        @ExcludeMissing
        isAnnounced: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_connected")
        @ExcludeMissing
        isConnected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_in_maintenance")
        @ExcludeMissing
        isInMaintenance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<InterfaceStatus> = JsonMissing.of(),
        @JsonProperty("wireguard_peer_id")
        @ExcludeMissing
        wireguardPeerId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        recordType,
        updatedAt,
        globalIpId,
        isAnnounced,
        isConnected,
        isInMaintenance,
        status,
        wireguardPeerId,
        mutableMapOf(),
    )

    fun toRecord(): Record =
        Record.builder()
            .id(id)
            .createdAt(createdAt)
            .recordType(recordType)
            .updatedAt(updatedAt)
            .build()

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
     * Global IP ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun globalIpId(): Optional<String> = globalIpId.getOptional("global_ip_id")

    /**
     * Status of BGP announcement.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isAnnounced(): Optional<Boolean> = isAnnounced.getOptional("is_announced")

    /**
     * Wireguard peer is connected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isConnected(): Optional<Boolean> = isConnected.getOptional("is_connected")

    /**
     * Enable/disable BGP announcement.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isInMaintenance(): Optional<Boolean> = isInMaintenance.getOptional("is_in_maintenance")

    /**
     * The current status of the interface deployment.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<InterfaceStatus> = status.getOptional("status")

    /**
     * Wireguard peer ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wireguardPeerId(): Optional<String> = wireguardPeerId.getOptional("wireguard_peer_id")

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
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [globalIpId].
     *
     * Unlike [globalIpId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("global_ip_id") @ExcludeMissing fun _globalIpId(): JsonField<String> = globalIpId

    /**
     * Returns the raw JSON value of [isAnnounced].
     *
     * Unlike [isAnnounced], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_announced")
    @ExcludeMissing
    fun _isAnnounced(): JsonField<Boolean> = isAnnounced

    /**
     * Returns the raw JSON value of [isConnected].
     *
     * Unlike [isConnected], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_connected")
    @ExcludeMissing
    fun _isConnected(): JsonField<Boolean> = isConnected

    /**
     * Returns the raw JSON value of [isInMaintenance].
     *
     * Unlike [isInMaintenance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_in_maintenance")
    @ExcludeMissing
    fun _isInMaintenance(): JsonField<Boolean> = isInMaintenance

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<InterfaceStatus> = status

    /**
     * Returns the raw JSON value of [wireguardPeerId].
     *
     * Unlike [wireguardPeerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wireguard_peer_id")
    @ExcludeMissing
    fun _wireguardPeerId(): JsonField<String> = wireguardPeerId

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

        /** Returns a mutable builder for constructing an instance of [GlobalIpAssignment]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GlobalIpAssignment]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var globalIpId: JsonField<String> = JsonMissing.of()
        private var isAnnounced: JsonField<Boolean> = JsonMissing.of()
        private var isConnected: JsonField<Boolean> = JsonMissing.of()
        private var isInMaintenance: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<InterfaceStatus> = JsonMissing.of()
        private var wireguardPeerId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(globalIpAssignment: GlobalIpAssignment) = apply {
            id = globalIpAssignment.id
            createdAt = globalIpAssignment.createdAt
            recordType = globalIpAssignment.recordType
            updatedAt = globalIpAssignment.updatedAt
            globalIpId = globalIpAssignment.globalIpId
            isAnnounced = globalIpAssignment.isAnnounced
            isConnected = globalIpAssignment.isConnected
            isInMaintenance = globalIpAssignment.isInMaintenance
            status = globalIpAssignment.status
            wireguardPeerId = globalIpAssignment.wireguardPeerId
            additionalProperties = globalIpAssignment.additionalProperties.toMutableMap()
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

        /** Global IP ID. */
        fun globalIpId(globalIpId: String) = globalIpId(JsonField.of(globalIpId))

        /**
         * Sets [Builder.globalIpId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.globalIpId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun globalIpId(globalIpId: JsonField<String>) = apply { this.globalIpId = globalIpId }

        /** Status of BGP announcement. */
        fun isAnnounced(isAnnounced: Boolean) = isAnnounced(JsonField.of(isAnnounced))

        /**
         * Sets [Builder.isAnnounced] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isAnnounced] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isAnnounced(isAnnounced: JsonField<Boolean>) = apply { this.isAnnounced = isAnnounced }

        /** Wireguard peer is connected. */
        fun isConnected(isConnected: Boolean) = isConnected(JsonField.of(isConnected))

        /**
         * Sets [Builder.isConnected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isConnected] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isConnected(isConnected: JsonField<Boolean>) = apply { this.isConnected = isConnected }

        /** Enable/disable BGP announcement. */
        fun isInMaintenance(isInMaintenance: Boolean) =
            isInMaintenance(JsonField.of(isInMaintenance))

        /**
         * Sets [Builder.isInMaintenance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isInMaintenance] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isInMaintenance(isInMaintenance: JsonField<Boolean>) = apply {
            this.isInMaintenance = isInMaintenance
        }

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

        /** Wireguard peer ID. */
        fun wireguardPeerId(wireguardPeerId: String) =
            wireguardPeerId(JsonField.of(wireguardPeerId))

        /**
         * Sets [Builder.wireguardPeerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wireguardPeerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wireguardPeerId(wireguardPeerId: JsonField<String>) = apply {
            this.wireguardPeerId = wireguardPeerId
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
         * Returns an immutable instance of [GlobalIpAssignment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GlobalIpAssignment =
            GlobalIpAssignment(
                id,
                createdAt,
                recordType,
                updatedAt,
                globalIpId,
                isAnnounced,
                isConnected,
                isInMaintenance,
                status,
                wireguardPeerId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GlobalIpAssignment = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        recordType()
        updatedAt()
        globalIpId()
        isAnnounced()
        isConnected()
        isInMaintenance()
        status().ifPresent { it.validate() }
        wireguardPeerId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (globalIpId.asKnown().isPresent) 1 else 0) +
            (if (isAnnounced.asKnown().isPresent) 1 else 0) +
            (if (isConnected.asKnown().isPresent) 1 else 0) +
            (if (isInMaintenance.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (wireguardPeerId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalIpAssignment &&
            id == other.id &&
            createdAt == other.createdAt &&
            recordType == other.recordType &&
            updatedAt == other.updatedAt &&
            globalIpId == other.globalIpId &&
            isAnnounced == other.isAnnounced &&
            isConnected == other.isConnected &&
            isInMaintenance == other.isInMaintenance &&
            status == other.status &&
            wireguardPeerId == other.wireguardPeerId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            recordType,
            updatedAt,
            globalIpId,
            isAnnounced,
            isConnected,
            isInMaintenance,
            status,
            wireguardPeerId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GlobalIpAssignment{id=$id, createdAt=$createdAt, recordType=$recordType, updatedAt=$updatedAt, globalIpId=$globalIpId, isAnnounced=$isAnnounced, isConnected=$isConnected, isInMaintenance=$isInMaintenance, status=$status, wireguardPeerId=$wireguardPeerId, additionalProperties=$additionalProperties}"
}
