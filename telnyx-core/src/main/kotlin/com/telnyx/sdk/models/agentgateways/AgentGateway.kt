// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An Agent Gateway instance on a WireGuard Interface. */
class AgentGateway
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val engine: JsonValue,
    private val engineVersion: JsonField<String>,
    private val gatewayUrl: JsonField<String>,
    private val name: JsonField<String>,
    private val networkId: JsonField<String>,
    private val status: JsonField<Status>,
    private val wireguardInterfaceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("engine") @ExcludeMissing engine: JsonValue = JsonMissing.of(),
        @JsonProperty("engine_version")
        @ExcludeMissing
        engineVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gateway_url")
        @ExcludeMissing
        gatewayUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_id") @ExcludeMissing networkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("wireguard_interface_id")
        @ExcludeMissing
        wireguardInterfaceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        engine,
        engineVersion,
        gatewayUrl,
        name,
        networkId,
        status,
        wireguardInterfaceId,
        mutableMapOf(),
    )

    /**
     * Identifies the instance.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * When the instance was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The gateway engine.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("litellm")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("engine") @ExcludeMissing fun _engine(): JsonValue = engine

    /**
     * The engine version the instance runs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun engineVersion(): String = engineVersion.getRequired("engine_version")

    /**
     * The base URL of the instance's API, `http://<address>:4000`, where the address is the
     * instance's peer address on the WireGuard Interface. Reachable only from hosts on the
     * instance's *Network*, and every request to it carries a key from this API. `null` until the
     * instance is `ready`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gatewayUrl(): Optional<String> = gatewayUrl.getOptional("gateway_url")

    /**
     * A label for people; `null` when none was given.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The [*Network*](https://developers.telnyx.com/docs/network/overview) the WireGuard Interface
     * belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkId(): Optional<String> = networkId.getOptional("network_id")

    /**
     * Where the instance is in its lifecycle. `pending`: created and waiting to start.
     * `provisioning`: starting. `ready`: running, with its `gateway_url` set. `failed`: did not
     * start in time; delete it. `deleting`: being removed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The WireGuard Interface the instance joins as a peer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wireguardInterfaceId(): Optional<String> =
        wireguardInterfaceId.getOptional("wireguard_interface_id")

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
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [engineVersion].
     *
     * Unlike [engineVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engine_version")
    @ExcludeMissing
    fun _engineVersion(): JsonField<String> = engineVersion

    /**
     * Returns the raw JSON value of [gatewayUrl].
     *
     * Unlike [gatewayUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gateway_url") @ExcludeMissing fun _gatewayUrl(): JsonField<String> = gatewayUrl

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [wireguardInterfaceId].
     *
     * Unlike [wireguardInterfaceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("wireguard_interface_id")
    @ExcludeMissing
    fun _wireguardInterfaceId(): JsonField<String> = wireguardInterfaceId

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
         * Returns a mutable builder for constructing an instance of [AgentGateway].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .engineVersion()
         * .gatewayUrl()
         * .name()
         * .networkId()
         * .status()
         * .wireguardInterfaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGateway]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var engine: JsonValue = JsonValue.from("litellm")
        private var engineVersion: JsonField<String>? = null
        private var gatewayUrl: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var networkId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var wireguardInterfaceId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGateway: AgentGateway) = apply {
            id = agentGateway.id
            createdAt = agentGateway.createdAt
            engine = agentGateway.engine
            engineVersion = agentGateway.engineVersion
            gatewayUrl = agentGateway.gatewayUrl
            name = agentGateway.name
            networkId = agentGateway.networkId
            status = agentGateway.status
            wireguardInterfaceId = agentGateway.wireguardInterfaceId
            additionalProperties = agentGateway.additionalProperties.toMutableMap()
        }

        /** Identifies the instance. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** When the instance was created. */
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
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("litellm")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun engine(engine: JsonValue) = apply { this.engine = engine }

        /** The engine version the instance runs. */
        fun engineVersion(engineVersion: String) = engineVersion(JsonField.of(engineVersion))

        /**
         * Sets [Builder.engineVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engineVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun engineVersion(engineVersion: JsonField<String>) = apply {
            this.engineVersion = engineVersion
        }

        /**
         * The base URL of the instance's API, `http://<address>:4000`, where the address is the
         * instance's peer address on the WireGuard Interface. Reachable only from hosts on the
         * instance's *Network*, and every request to it carries a key from this API. `null` until
         * the instance is `ready`.
         */
        fun gatewayUrl(gatewayUrl: String?) = gatewayUrl(JsonField.ofNullable(gatewayUrl))

        /** Alias for calling [Builder.gatewayUrl] with `gatewayUrl.orElse(null)`. */
        fun gatewayUrl(gatewayUrl: Optional<String>) = gatewayUrl(gatewayUrl.getOrNull())

        /**
         * Sets [Builder.gatewayUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gatewayUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun gatewayUrl(gatewayUrl: JsonField<String>) = apply { this.gatewayUrl = gatewayUrl }

        /** A label for people; `null` when none was given. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The [*Network*](https://developers.telnyx.com/docs/network/overview) the WireGuard
         * Interface belongs to.
         */
        fun networkId(networkId: String?) = networkId(JsonField.ofNullable(networkId))

        /** Alias for calling [Builder.networkId] with `networkId.orElse(null)`. */
        fun networkId(networkId: Optional<String>) = networkId(networkId.getOrNull())

        /**
         * Sets [Builder.networkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun networkId(networkId: JsonField<String>) = apply { this.networkId = networkId }

        /**
         * Where the instance is in its lifecycle. `pending`: created and waiting to start.
         * `provisioning`: starting. `ready`: running, with its `gateway_url` set. `failed`: did not
         * start in time; delete it. `deleting`: being removed.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The WireGuard Interface the instance joins as a peer. */
        fun wireguardInterfaceId(wireguardInterfaceId: String?) =
            wireguardInterfaceId(JsonField.ofNullable(wireguardInterfaceId))

        /**
         * Alias for calling [Builder.wireguardInterfaceId] with
         * `wireguardInterfaceId.orElse(null)`.
         */
        fun wireguardInterfaceId(wireguardInterfaceId: Optional<String>) =
            wireguardInterfaceId(wireguardInterfaceId.getOrNull())

        /**
         * Sets [Builder.wireguardInterfaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wireguardInterfaceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wireguardInterfaceId(wireguardInterfaceId: JsonField<String>) = apply {
            this.wireguardInterfaceId = wireguardInterfaceId
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
         * Returns an immutable instance of [AgentGateway].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .engineVersion()
         * .gatewayUrl()
         * .name()
         * .networkId()
         * .status()
         * .wireguardInterfaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGateway =
            AgentGateway(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                engine,
                checkRequired("engineVersion", engineVersion),
                checkRequired("gatewayUrl", gatewayUrl),
                checkRequired("name", name),
                checkRequired("networkId", networkId),
                checkRequired("status", status),
                checkRequired("wireguardInterfaceId", wireguardInterfaceId),
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
    fun validate(): AgentGateway = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        _engine().let {
            if (it != JsonValue.from("litellm")) {
                throw TelnyxInvalidDataException("'engine' is invalid, received $it")
            }
        }
        engineVersion()
        gatewayUrl()
        name()
        networkId()
        status().validate()
        wireguardInterfaceId()
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
            engine.let { if (it == JsonValue.from("litellm")) 1 else 0 } +
            (if (engineVersion.asKnown().isPresent) 1 else 0) +
            (if (gatewayUrl.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (networkId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (wireguardInterfaceId.asKnown().isPresent) 1 else 0)

    /**
     * Where the instance is in its lifecycle. `pending`: created and waiting to start.
     * `provisioning`: starting. `ready`: running, with its `gateway_url` set. `failed`: did not
     * start in time; delete it. `deleting`: being removed.
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

            @JvmField val PENDING = of("pending")

            @JvmField val PROVISIONING = of("provisioning")

            @JvmField val READY = of("ready")

            @JvmField val FAILED = of("failed")

            @JvmField val DELETING = of("deleting")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            PROVISIONING,
            READY,
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
            PENDING,
            PROVISIONING,
            READY,
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
                PENDING -> Value.PENDING
                PROVISIONING -> Value.PROVISIONING
                READY -> Value.READY
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
                PENDING -> Known.PENDING
                PROVISIONING -> Known.PROVISIONING
                READY -> Known.READY
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

        return other is AgentGateway &&
            id == other.id &&
            createdAt == other.createdAt &&
            engine == other.engine &&
            engineVersion == other.engineVersion &&
            gatewayUrl == other.gatewayUrl &&
            name == other.name &&
            networkId == other.networkId &&
            status == other.status &&
            wireguardInterfaceId == other.wireguardInterfaceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            engine,
            engineVersion,
            gatewayUrl,
            name,
            networkId,
            status,
            wireguardInterfaceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGateway{id=$id, createdAt=$createdAt, engine=$engine, engineVersion=$engineVersion, gatewayUrl=$gatewayUrl, name=$name, networkId=$networkId, status=$status, wireguardInterfaceId=$wireguardInterfaceId, additionalProperties=$additionalProperties}"
}
