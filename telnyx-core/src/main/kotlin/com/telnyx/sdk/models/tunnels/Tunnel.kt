// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

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

class Tunnel
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val connectionCount: JsonField<Long>,
    private val connections: JsonField<List<Connection>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val recordType: JsonField<String>,
    private val status: JsonField<Status>,
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
        connections: JsonField<List<Connection>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(id, connectionCount, connections, createdAt, name, recordType, status, mutableMapOf())

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
    fun connections(): Optional<List<Connection>> = connections.getOptional("connections")

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
    fun status(): Optional<Status> = status.getOptional("status")

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
    fun _connections(): JsonField<List<Connection>> = connections

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [Tunnel]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Tunnel]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var connectionCount: JsonField<Long> = JsonMissing.of()
        private var connections: JsonField<MutableList<Connection>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tunnel: Tunnel) = apply {
            id = tunnel.id
            connectionCount = tunnel.connectionCount
            connections = tunnel.connections.map { it.toMutableList() }
            createdAt = tunnel.createdAt
            name = tunnel.name
            recordType = tunnel.recordType
            status = tunnel.status
            additionalProperties = tunnel.additionalProperties.toMutableMap()
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
        fun connections(connections: List<Connection>) = connections(JsonField.of(connections))

        /**
         * Sets [Builder.connections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connections] with a well-typed `List<Connection>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connections(connections: JsonField<List<Connection>>) = apply {
            this.connections = connections.map { it.toMutableList() }
        }

        /**
         * Adds a single [Connection] to [connections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConnection(connection: Connection) = apply {
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
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [Tunnel].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Tunnel =
            Tunnel(
                id,
                connectionCount,
                (connections ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                name,
                recordType,
                status,
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
    fun validate(): Tunnel = apply {
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
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /** A tunnel process connected to the tunnel. */
    class Connection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connectedAt: JsonField<OffsetDateTime>,
        private val hostname: JsonField<String>,
        private val regionCode: JsonField<String>,
        private val version: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connected_at")
            @ExcludeMissing
            connectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("hostname")
            @ExcludeMissing
            hostname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region_code")
            @ExcludeMissing
            regionCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        ) : this(connectedAt, hostname, regionCode, version, mutableMapOf())

        /**
         * When the process connected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectedAt(): Optional<OffsetDateTime> = connectedAt.getOptional("connected_at")

        /**
         * The name the host reports for itself. Preview: empty until the CLI reports it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hostname(): Optional<String> = hostname.getOptional("hostname")

        /**
         * The Telnyx region the process is connected to. Preview: empty until the CLI reports it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regionCode(): Optional<String> = regionCode.getOptional("region_code")

        /**
         * The `telnyx-edge` CLI version of the process. Preview: empty until the CLI reports it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<String> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [connectedAt].
         *
         * Unlike [connectedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("connected_at")
        @ExcludeMissing
        fun _connectedAt(): JsonField<OffsetDateTime> = connectedAt

        /**
         * Returns the raw JSON value of [hostname].
         *
         * Unlike [hostname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hostname") @ExcludeMissing fun _hostname(): JsonField<String> = hostname

        /**
         * Returns the raw JSON value of [regionCode].
         *
         * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region_code")
        @ExcludeMissing
        fun _regionCode(): JsonField<String> = regionCode

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

            /** Returns a mutable builder for constructing an instance of [Connection]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Connection]. */
        class Builder internal constructor() {

            private var connectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var hostname: JsonField<String> = JsonMissing.of()
            private var regionCode: JsonField<String> = JsonMissing.of()
            private var version: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connection: Connection) = apply {
                connectedAt = connection.connectedAt
                hostname = connection.hostname
                regionCode = connection.regionCode
                version = connection.version
                additionalProperties = connection.additionalProperties.toMutableMap()
            }

            /** When the process connected. */
            fun connectedAt(connectedAt: OffsetDateTime) = connectedAt(JsonField.of(connectedAt))

            /**
             * Sets [Builder.connectedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun connectedAt(connectedAt: JsonField<OffsetDateTime>) = apply {
                this.connectedAt = connectedAt
            }

            /** The name the host reports for itself. Preview: empty until the CLI reports it. */
            fun hostname(hostname: String) = hostname(JsonField.of(hostname))

            /**
             * Sets [Builder.hostname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hostname(hostname: JsonField<String>) = apply { this.hostname = hostname }

            /**
             * The Telnyx region the process is connected to. Preview: empty until the CLI reports
             * it.
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

            /**
             * The `telnyx-edge` CLI version of the process. Preview: empty until the CLI reports
             * it.
             */
            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
             * Returns an immutable instance of [Connection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Connection =
                Connection(
                    connectedAt,
                    hostname,
                    regionCode,
                    version,
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
        fun validate(): Connection = apply {
            if (validated) {
                return@apply
            }

            connectedAt()
            hostname()
            regionCode()
            version()
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
            (if (connectedAt.asKnown().isPresent) 1 else 0) +
                (if (hostname.asKnown().isPresent) 1 else 0) +
                (if (regionCode.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Connection &&
                connectedAt == other.connectedAt &&
                hostname == other.hostname &&
                regionCode == other.regionCode &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(connectedAt, hostname, regionCode, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Connection{connectedAt=$connectedAt, hostname=$hostname, regionCode=$regionCode, version=$version, additionalProperties=$additionalProperties}"
    }

    /**
     * `inactive` when no tunnel process is connected, and `healthy` when one or more are.
     * `degraded` (Preview, not reported yet) when a process is connected but fails to reach its
     * destinations.
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

            @JvmField val INACTIVE = of("inactive")

            @JvmField val HEALTHY = of("healthy")

            @JvmField val DEGRADED = of("degraded")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            INACTIVE,
            HEALTHY,
            DEGRADED,
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
            INACTIVE,
            HEALTHY,
            DEGRADED,
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
                INACTIVE -> Value.INACTIVE
                HEALTHY -> Value.HEALTHY
                DEGRADED -> Value.DEGRADED
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
                INACTIVE -> Known.INACTIVE
                HEALTHY -> Known.HEALTHY
                DEGRADED -> Known.DEGRADED
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

        return other is Tunnel &&
            id == other.id &&
            connectionCount == other.connectionCount &&
            connections == other.connections &&
            createdAt == other.createdAt &&
            name == other.name &&
            recordType == other.recordType &&
            status == other.status &&
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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Tunnel{id=$id, connectionCount=$connectionCount, connections=$connections, createdAt=$createdAt, name=$name, recordType=$recordType, status=$status, additionalProperties=$additionalProperties}"
}
