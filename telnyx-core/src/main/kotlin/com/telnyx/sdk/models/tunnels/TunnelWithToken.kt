// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TunnelWithToken
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val connectionCount: JsonField<Long>,
    private val connections: JsonField<List<Tunnel.Connection>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val recordType: JsonField<String>,
    private val status: JsonField<Tunnel.Status>,
    private val tunnelToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_count")
        @ExcludeMissing
        connectionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("connections")
        @ExcludeMissing
        connections: JsonField<List<Tunnel.Connection>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Tunnel.Status> = JsonMissing.of(),
        @JsonProperty("tunnel_token")
        @ExcludeMissing
        tunnelToken: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        connectionCount,
        connections,
        createdAt,
        name,
        recordType,
        status,
        tunnelToken,
        mutableMapOf(),
    )

    fun toTunnel(): Tunnel =
        Tunnel.builder()
            .id(id)
            .connectionCount(connectionCount)
            .connections(connections)
            .createdAt(createdAt)
            .name(name)
            .recordType(recordType)
            .status(status)
            .build()

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The number of tunnel processes connected with the tunnel's token.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionCount(): Optional<Long> = connectionCount.getOptional("connection_count")

    /**
     * The tunnel processes connected with the tunnel's token.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connections(): Optional<List<Tunnel.Connection>> = connections.getOptional("connections")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * A user specified name for the tunnel.
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
     * `inactive` when no tunnel process is connected, and `healthy` when one or more are.
     * `degraded` (Preview, not reported yet) when a process is connected but fails to reach its
     * destinations.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Tunnel.Status> = status.getOptional("status")

    /**
     * The credential that a tunnel process presents with `telnyx-edge tunnel run --token`. Returned
     * only by create and rotate_token. Telnyx stores only a hash of it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tunnelToken(): Optional<String> = tunnelToken.getOptional("tunnel_token")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [connectionCount].
     *
     * Unlike [connectionCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_count")
    @ExcludeMissing
    fun _connectionCount(): JsonField<Long> = connectionCount

    /**
     * Returns the raw JSON value of [connections].
     *
     * Unlike [connections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connections")
    @ExcludeMissing
    fun _connections(): JsonField<List<Tunnel.Connection>> = connections

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Tunnel.Status> = status

    /**
     * Returns the raw JSON value of [tunnelToken].
     *
     * Unlike [tunnelToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tunnel_token")
    @ExcludeMissing
    fun _tunnelToken(): JsonField<String> = tunnelToken

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

        /** Returns a mutable builder for constructing an instance of [TunnelWithToken]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TunnelWithToken]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var connectionCount: JsonField<Long> = JsonMissing.of()
        private var connections: JsonField<MutableList<Tunnel.Connection>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Tunnel.Status> = JsonMissing.of()
        private var tunnelToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tunnelWithToken: TunnelWithToken) = apply {
            id = tunnelWithToken.id
            connectionCount = tunnelWithToken.connectionCount
            connections = tunnelWithToken.connections.map { it.toMutableList() }
            createdAt = tunnelWithToken.createdAt
            name = tunnelWithToken.name
            recordType = tunnelWithToken.recordType
            status = tunnelWithToken.status
            tunnelToken = tunnelWithToken.tunnelToken
            additionalProperties = tunnelWithToken.additionalProperties.toMutableMap()
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

        /** The number of tunnel processes connected with the tunnel's token. */
        fun connectionCount(connectionCount: Long) = connectionCount(JsonField.of(connectionCount))

        /**
         * Sets [Builder.connectionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionCount(connectionCount: JsonField<Long>) = apply {
            this.connectionCount = connectionCount
        }

        /** The tunnel processes connected with the tunnel's token. */
        fun connections(connections: List<Tunnel.Connection>) =
            connections(JsonField.of(connections))

        /**
         * Sets [Builder.connections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connections] with a well-typed `List<Tunnel.Connection>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun connections(connections: JsonField<List<Tunnel.Connection>>) = apply {
            this.connections = connections.map { it.toMutableList() }
        }

        /**
         * Adds a single [Tunnel.Connection] to [connections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConnection(connection: Tunnel.Connection) = apply {
            connections =
                (connections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("connections", it).add(connection)
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

        /** A user specified name for the tunnel. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * `inactive` when no tunnel process is connected, and `healthy` when one or more are.
         * `degraded` (Preview, not reported yet) when a process is connected but fails to reach its
         * destinations.
         */
        fun status(status: Tunnel.Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Tunnel.Status] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<Tunnel.Status>) = apply { this.status = status }

        /**
         * The credential that a tunnel process presents with `telnyx-edge tunnel run --token`.
         * Returned only by create and rotate_token. Telnyx stores only a hash of it.
         */
        fun tunnelToken(tunnelToken: String) = tunnelToken(JsonField.of(tunnelToken))

        /**
         * Sets [Builder.tunnelToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tunnelToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tunnelToken(tunnelToken: JsonField<String>) = apply { this.tunnelToken = tunnelToken }

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
         * Returns an immutable instance of [TunnelWithToken].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TunnelWithToken =
            TunnelWithToken(
                id,
                connectionCount,
                (connections ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                name,
                recordType,
                status,
                tunnelToken,
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
    fun validate(): TunnelWithToken = apply {
        if (validated) {
            return@apply
        }

        id()
        connectionCount()
        connections().ifPresent { it.forEach { it.validate() } }
        createdAt()
        name()
        recordType()
        status().ifPresent { it.validate() }
        tunnelToken()
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
            (if (connectionCount.asKnown().isPresent) 1 else 0) +
            (connections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tunnelToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TunnelWithToken &&
            id == other.id &&
            connectionCount == other.connectionCount &&
            connections == other.connections &&
            createdAt == other.createdAt &&
            name == other.name &&
            recordType == other.recordType &&
            status == other.status &&
            tunnelToken == other.tunnelToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            connectionCount,
            connections,
            createdAt,
            name,
            recordType,
            status,
            tunnelToken,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TunnelWithToken{id=$id, connectionCount=$connectionCount, connections=$connections, createdAt=$createdAt, name=$name, recordType=$recordType, status=$status, tunnelToken=$tunnelToken, additionalProperties=$additionalProperties}"
}
