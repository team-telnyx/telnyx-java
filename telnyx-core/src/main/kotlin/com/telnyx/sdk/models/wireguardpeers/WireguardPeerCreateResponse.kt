// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.globalipassignments.Record
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WireguardPeerCreateResponse
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
         * Returns a mutable builder for constructing an instance of [WireguardPeerCreateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireguardPeerCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireguardPeerCreateResponse: WireguardPeerCreateResponse) = apply {
            data = wireguardPeerCreateResponse.data
            additionalProperties = wireguardPeerCreateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [WireguardPeerCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WireguardPeerCreateResponse =
            WireguardPeerCreateResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): WireguardPeerCreateResponse = apply {
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
        private val lastSeen: JsonField<String>,
        private val privateKey: JsonField<String>,
        private val wireguardInterfaceId: JsonField<String>,
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
            @JsonProperty("last_seen")
            @ExcludeMissing
            lastSeen: JsonField<String> = JsonMissing.of(),
            @JsonProperty("private_key")
            @ExcludeMissing
            privateKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wireguard_interface_id")
            @ExcludeMissing
            wireguardInterfaceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            recordType,
            updatedAt,
            lastSeen,
            privateKey,
            wireguardInterfaceId,
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
         * ISO 8601 formatted date-time indicating when peer sent traffic last time.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastSeen(): Optional<String> = lastSeen.getOptional("last_seen")

        /**
         * Your WireGuard `Interface.PrivateKey`.<br /><br />This attribute is only ever utlised if,
         * on POST, you do NOT provide your own `public_key`. In which case, a new Public and
         * Private key pair will be generated for you. When your `private_key` is returned, you must
         * save this immediately as we do not save it within Telnyx. If you lose your Private Key,
         * it can not be recovered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun privateKey(): Optional<String> = privateKey.getOptional("private_key")

        /**
         * The id of the wireguard interface associated with the peer.
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
         * Returns the raw JSON value of [lastSeen].
         *
         * Unlike [lastSeen], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_seen") @ExcludeMissing fun _lastSeen(): JsonField<String> = lastSeen

        /**
         * Returns the raw JSON value of [privateKey].
         *
         * Unlike [privateKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("private_key")
        @ExcludeMissing
        fun _privateKey(): JsonField<String> = privateKey

        /**
         * Returns the raw JSON value of [wireguardInterfaceId].
         *
         * Unlike [wireguardInterfaceId], this method doesn't throw if the JSON field has an
         * unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var lastSeen: JsonField<String> = JsonMissing.of()
            private var privateKey: JsonField<String> = JsonMissing.of()
            private var wireguardInterfaceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                recordType = data.recordType
                updatedAt = data.updatedAt
                lastSeen = data.lastSeen
                privateKey = data.privateKey
                wireguardInterfaceId = data.wireguardInterfaceId
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

            /** ISO 8601 formatted date-time indicating when peer sent traffic last time. */
            fun lastSeen(lastSeen: String) = lastSeen(JsonField.of(lastSeen))

            /**
             * Sets [Builder.lastSeen] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastSeen] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastSeen(lastSeen: JsonField<String>) = apply { this.lastSeen = lastSeen }

            /**
             * Your WireGuard `Interface.PrivateKey`.<br /><br />This attribute is only ever utlised
             * if, on POST, you do NOT provide your own `public_key`. In which case, a new Public
             * and Private key pair will be generated for you. When your `private_key` is returned,
             * you must save this immediately as we do not save it within Telnyx. If you lose your
             * Private Key, it can not be recovered.
             */
            fun privateKey(privateKey: String) = privateKey(JsonField.of(privateKey))

            /**
             * Sets [Builder.privateKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.privateKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun privateKey(privateKey: JsonField<String>) = apply { this.privateKey = privateKey }

            /** The id of the wireguard interface associated with the peer. */
            fun wireguardInterfaceId(wireguardInterfaceId: String) =
                wireguardInterfaceId(JsonField.of(wireguardInterfaceId))

            /**
             * Sets [Builder.wireguardInterfaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wireguardInterfaceId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    createdAt,
                    recordType,
                    updatedAt,
                    lastSeen,
                    privateKey,
                    wireguardInterfaceId,
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
            lastSeen()
            privateKey()
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
                (if (lastSeen.asKnown().isPresent) 1 else 0) +
                (if (privateKey.asKnown().isPresent) 1 else 0) +
                (if (wireguardInterfaceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                recordType == other.recordType &&
                updatedAt == other.updatedAt &&
                lastSeen == other.lastSeen &&
                privateKey == other.privateKey &&
                wireguardInterfaceId == other.wireguardInterfaceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                recordType,
                updatedAt,
                lastSeen,
                privateKey,
                wireguardInterfaceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, recordType=$recordType, updatedAt=$updatedAt, lastSeen=$lastSeen, privateKey=$privateKey, wireguardInterfaceId=$wireguardInterfaceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireguardPeerCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WireguardPeerCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
