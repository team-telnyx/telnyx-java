// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignmenthealth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GlobalIpAssignmentHealthRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * [GlobalIpAssignmentHealthRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GlobalIpAssignmentHealthRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            globalIpAssignmentHealthRetrieveResponse: GlobalIpAssignmentHealthRetrieveResponse
        ) = apply {
            data = globalIpAssignmentHealthRetrieveResponse.data.map { it.toMutableList() }
            additionalProperties =
                globalIpAssignmentHealthRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
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
         * Returns an immutable instance of [GlobalIpAssignmentHealthRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GlobalIpAssignmentHealthRetrieveResponse =
            GlobalIpAssignmentHealthRetrieveResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GlobalIpAssignmentHealthRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val globalIp: JsonField<GlobalIp>,
        private val globalIpAssignment: JsonField<GlobalIpAssignment>,
        private val health: JsonField<Health>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("global_ip")
            @ExcludeMissing
            globalIp: JsonField<GlobalIp> = JsonMissing.of(),
            @JsonProperty("global_ip_assignment")
            @ExcludeMissing
            globalIpAssignment: JsonField<GlobalIpAssignment> = JsonMissing.of(),
            @JsonProperty("health") @ExcludeMissing health: JsonField<Health> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(globalIp, globalIpAssignment, health, timestamp, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun globalIp(): Optional<GlobalIp> = globalIp.getOptional("global_ip")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun globalIpAssignment(): Optional<GlobalIpAssignment> =
            globalIpAssignment.getOptional("global_ip_assignment")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun health(): Optional<Health> = health.getOptional("health")

        /**
         * The timestamp of the metric.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

        /**
         * Returns the raw JSON value of [globalIp].
         *
         * Unlike [globalIp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("global_ip") @ExcludeMissing fun _globalIp(): JsonField<GlobalIp> = globalIp

        /**
         * Returns the raw JSON value of [globalIpAssignment].
         *
         * Unlike [globalIpAssignment], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("global_ip_assignment")
        @ExcludeMissing
        fun _globalIpAssignment(): JsonField<GlobalIpAssignment> = globalIpAssignment

        /**
         * Returns the raw JSON value of [health].
         *
         * Unlike [health], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("health") @ExcludeMissing fun _health(): JsonField<Health> = health

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var globalIp: JsonField<GlobalIp> = JsonMissing.of()
            private var globalIpAssignment: JsonField<GlobalIpAssignment> = JsonMissing.of()
            private var health: JsonField<Health> = JsonMissing.of()
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                globalIp = data.globalIp
                globalIpAssignment = data.globalIpAssignment
                health = data.health
                timestamp = data.timestamp
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun globalIp(globalIp: GlobalIp) = globalIp(JsonField.of(globalIp))

            /**
             * Sets [Builder.globalIp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.globalIp] with a well-typed [GlobalIp] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun globalIp(globalIp: JsonField<GlobalIp>) = apply { this.globalIp = globalIp }

            fun globalIpAssignment(globalIpAssignment: GlobalIpAssignment) =
                globalIpAssignment(JsonField.of(globalIpAssignment))

            /**
             * Sets [Builder.globalIpAssignment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.globalIpAssignment] with a well-typed
             * [GlobalIpAssignment] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun globalIpAssignment(globalIpAssignment: JsonField<GlobalIpAssignment>) = apply {
                this.globalIpAssignment = globalIpAssignment
            }

            fun health(health: Health) = health(JsonField.of(health))

            /**
             * Sets [Builder.health] to an arbitrary JSON value.
             *
             * You should usually call [Builder.health] with a well-typed [Health] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun health(health: JsonField<Health>) = apply { this.health = health }

            /** The timestamp of the metric. */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
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
             */
            fun build(): Data =
                Data(
                    globalIp,
                    globalIpAssignment,
                    health,
                    timestamp,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            globalIp().ifPresent { it.validate() }
            globalIpAssignment().ifPresent { it.validate() }
            health().ifPresent { it.validate() }
            timestamp()
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
            (globalIp.asKnown().getOrNull()?.validity() ?: 0) +
                (globalIpAssignment.asKnown().getOrNull()?.validity() ?: 0) +
                (health.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0)

        class GlobalIp
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val ipAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ip_address")
                @ExcludeMissing
                ipAddress: JsonField<String> = JsonMissing.of(),
            ) : this(id, ipAddress, mutableMapOf())

            /**
             * Global IP ID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The Global IP address.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [ipAddress].
             *
             * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ip_address")
            @ExcludeMissing
            fun _ipAddress(): JsonField<String> = ipAddress

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

                /** Returns a mutable builder for constructing an instance of [GlobalIp]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GlobalIp]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var ipAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(globalIp: GlobalIp) = apply {
                    id = globalIp.id
                    ipAddress = globalIp.ipAddress
                    additionalProperties = globalIp.additionalProperties.toMutableMap()
                }

                /** Global IP ID. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The Global IP address. */
                fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

                /**
                 * Sets [Builder.ipAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ipAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

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
                 * Returns an immutable instance of [GlobalIp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GlobalIp = GlobalIp(id, ipAddress, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): GlobalIp = apply {
                if (validated) {
                    return@apply
                }

                id()
                ipAddress()
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
                    (if (ipAddress.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GlobalIp &&
                    id == other.id &&
                    ipAddress == other.ipAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, ipAddress, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GlobalIp{id=$id, ipAddress=$ipAddress, additionalProperties=$additionalProperties}"
        }

        class GlobalIpAssignment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val wireguardPeer: JsonField<WireguardPeer>,
            private val wireguardPeerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("wireguard_peer")
                @ExcludeMissing
                wireguardPeer: JsonField<WireguardPeer> = JsonMissing.of(),
                @JsonProperty("wireguard_peer_id")
                @ExcludeMissing
                wireguardPeerId: JsonField<String> = JsonMissing.of(),
            ) : this(id, wireguardPeer, wireguardPeerId, mutableMapOf())

            /**
             * Global IP assignment ID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun wireguardPeer(): Optional<WireguardPeer> =
                wireguardPeer.getOptional("wireguard_peer")

            /**
             * Wireguard peer ID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun wireguardPeerId(): Optional<String> =
                wireguardPeerId.getOptional("wireguard_peer_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [wireguardPeer].
             *
             * Unlike [wireguardPeer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("wireguard_peer")
            @ExcludeMissing
            fun _wireguardPeer(): JsonField<WireguardPeer> = wireguardPeer

            /**
             * Returns the raw JSON value of [wireguardPeerId].
             *
             * Unlike [wireguardPeerId], this method doesn't throw if the JSON field has an
             * unexpected type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [GlobalIpAssignment].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GlobalIpAssignment]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var wireguardPeer: JsonField<WireguardPeer> = JsonMissing.of()
                private var wireguardPeerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(globalIpAssignment: GlobalIpAssignment) = apply {
                    id = globalIpAssignment.id
                    wireguardPeer = globalIpAssignment.wireguardPeer
                    wireguardPeerId = globalIpAssignment.wireguardPeerId
                    additionalProperties = globalIpAssignment.additionalProperties.toMutableMap()
                }

                /** Global IP assignment ID. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun wireguardPeer(wireguardPeer: WireguardPeer) =
                    wireguardPeer(JsonField.of(wireguardPeer))

                /**
                 * Sets [Builder.wireguardPeer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wireguardPeer] with a well-typed [WireguardPeer]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun wireguardPeer(wireguardPeer: JsonField<WireguardPeer>) = apply {
                    this.wireguardPeer = wireguardPeer
                }

                /** Wireguard peer ID. */
                fun wireguardPeerId(wireguardPeerId: String) =
                    wireguardPeerId(JsonField.of(wireguardPeerId))

                /**
                 * Sets [Builder.wireguardPeerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wireguardPeerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [GlobalIpAssignment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GlobalIpAssignment =
                    GlobalIpAssignment(
                        id,
                        wireguardPeer,
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
                wireguardPeer().ifPresent { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (wireguardPeer.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (wireguardPeerId.asKnown().isPresent) 1 else 0)

            class WireguardPeer
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val ipAddress: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("ip_address")
                    @ExcludeMissing
                    ipAddress: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(ipAddress, name, mutableMapOf())

                /**
                 * The IP address of the interface.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

                /**
                 * A user specified name for the interface.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Returns the raw JSON value of [ipAddress].
                 *
                 * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("ip_address")
                @ExcludeMissing
                fun _ipAddress(): JsonField<String> = ipAddress

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                     * Returns a mutable builder for constructing an instance of [WireguardPeer].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WireguardPeer]. */
                class Builder internal constructor() {

                    private var ipAddress: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(wireguardPeer: WireguardPeer) = apply {
                        ipAddress = wireguardPeer.ipAddress
                        name = wireguardPeer.name
                        additionalProperties = wireguardPeer.additionalProperties.toMutableMap()
                    }

                    /** The IP address of the interface. */
                    fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

                    /**
                     * Sets [Builder.ipAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ipAddress] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ipAddress(ipAddress: JsonField<String>) = apply {
                        this.ipAddress = ipAddress
                    }

                    /** A user specified name for the interface. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                     * Returns an immutable instance of [WireguardPeer].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): WireguardPeer =
                        WireguardPeer(ipAddress, name, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): WireguardPeer = apply {
                    if (validated) {
                        return@apply
                    }

                    ipAddress()
                    name()
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
                    (if (ipAddress.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WireguardPeer &&
                        ipAddress == other.ipAddress &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(ipAddress, name, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WireguardPeer{ipAddress=$ipAddress, name=$name, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GlobalIpAssignment &&
                    id == other.id &&
                    wireguardPeer == other.wireguardPeer &&
                    wireguardPeerId == other.wireguardPeerId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, wireguardPeer, wireguardPeerId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GlobalIpAssignment{id=$id, wireguardPeer=$wireguardPeer, wireguardPeerId=$wireguardPeerId, additionalProperties=$additionalProperties}"
        }

        class Health
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val fail: JsonField<Double>,
            private val pass: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("fail") @ExcludeMissing fail: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("pass") @ExcludeMissing pass: JsonField<Double> = JsonMissing.of(),
            ) : this(fail, pass, mutableMapOf())

            /**
             * The number of failed health checks.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fail(): Optional<Double> = fail.getOptional("fail")

            /**
             * The number of successful health checks.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pass(): Optional<Double> = pass.getOptional("pass")

            /**
             * Returns the raw JSON value of [fail].
             *
             * Unlike [fail], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fail") @ExcludeMissing fun _fail(): JsonField<Double> = fail

            /**
             * Returns the raw JSON value of [pass].
             *
             * Unlike [pass], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pass") @ExcludeMissing fun _pass(): JsonField<Double> = pass

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

                /** Returns a mutable builder for constructing an instance of [Health]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Health]. */
            class Builder internal constructor() {

                private var fail: JsonField<Double> = JsonMissing.of()
                private var pass: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(health: Health) = apply {
                    fail = health.fail
                    pass = health.pass
                    additionalProperties = health.additionalProperties.toMutableMap()
                }

                /** The number of failed health checks. */
                fun fail(fail: Double) = fail(JsonField.of(fail))

                /**
                 * Sets [Builder.fail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fail] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fail(fail: JsonField<Double>) = apply { this.fail = fail }

                /** The number of successful health checks. */
                fun pass(pass: Double) = pass(JsonField.of(pass))

                /**
                 * Sets [Builder.pass] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pass] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun pass(pass: JsonField<Double>) = apply { this.pass = pass }

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
                 * Returns an immutable instance of [Health].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Health = Health(fail, pass, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Health = apply {
                if (validated) {
                    return@apply
                }

                fail()
                pass()
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
                (if (fail.asKnown().isPresent) 1 else 0) + (if (pass.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Health &&
                    fail == other.fail &&
                    pass == other.pass &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(fail, pass, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Health{fail=$fail, pass=$pass, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                globalIp == other.globalIp &&
                globalIpAssignment == other.globalIpAssignment &&
                health == other.health &&
                timestamp == other.timestamp &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(globalIp, globalIpAssignment, health, timestamp, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{globalIp=$globalIp, globalIpAssignment=$globalIpAssignment, health=$health, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalIpAssignmentHealthRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GlobalIpAssignmentHealthRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
