// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.fqdns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class Fqdn
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val dnsRecordType: JsonField<String>,
    private val fqdn: JsonField<String>,
    private val port: JsonField<Long>,
    private val recordType: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dns_record_type")
        @ExcludeMissing
        dnsRecordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fqdn") @ExcludeMissing fqdn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("port") @ExcludeMissing port: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        connectionId,
        createdAt,
        dnsRecordType,
        fqdn,
        port,
        recordType,
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
     * ID of the FQDN connection to which this FQDN is attached.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * The DNS record type for the FQDN. For cases where a port is not set, the DNS record type must
     * be 'srv'. For cases where a port is set, the DNS record type must be 'a'. If the DNS record
     * type is 'a' and a port is not specified, 5060 will be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dnsRecordType(): Optional<String> = dnsRecordType.getOptional("dns_record_type")

    /**
     * FQDN represented by this resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fqdn(): Optional<String> = fqdn.getOptional("fqdn")

    /**
     * Port to use when connecting to this FQDN.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun port(): Optional<Long> = port.getOptional("port")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
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
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [dnsRecordType].
     *
     * Unlike [dnsRecordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dns_record_type")
    @ExcludeMissing
    fun _dnsRecordType(): JsonField<String> = dnsRecordType

    /**
     * Returns the raw JSON value of [fqdn].
     *
     * Unlike [fqdn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fqdn") @ExcludeMissing fun _fqdn(): JsonField<String> = fqdn

    /**
     * Returns the raw JSON value of [port].
     *
     * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("port") @ExcludeMissing fun _port(): JsonField<Long> = port

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

        /** Returns a mutable builder for constructing an instance of [Fqdn]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Fqdn]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var dnsRecordType: JsonField<String> = JsonMissing.of()
        private var fqdn: JsonField<String> = JsonMissing.of()
        private var port: JsonField<Long> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fqdn: Fqdn) = apply {
            id = fqdn.id
            connectionId = fqdn.connectionId
            createdAt = fqdn.createdAt
            dnsRecordType = fqdn.dnsRecordType
            this.fqdn = fqdn.fqdn
            port = fqdn.port
            recordType = fqdn.recordType
            updatedAt = fqdn.updatedAt
            additionalProperties = fqdn.additionalProperties.toMutableMap()
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

        /** ID of the FQDN connection to which this FQDN is attached. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /**
         * The DNS record type for the FQDN. For cases where a port is not set, the DNS record type
         * must be 'srv'. For cases where a port is set, the DNS record type must be 'a'. If the DNS
         * record type is 'a' and a port is not specified, 5060 will be used.
         */
        fun dnsRecordType(dnsRecordType: String) = dnsRecordType(JsonField.of(dnsRecordType))

        /**
         * Sets [Builder.dnsRecordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dnsRecordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dnsRecordType(dnsRecordType: JsonField<String>) = apply {
            this.dnsRecordType = dnsRecordType
        }

        /** FQDN represented by this resource. */
        fun fqdn(fqdn: String) = fqdn(JsonField.of(fqdn))

        /**
         * Sets [Builder.fqdn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fqdn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fqdn(fqdn: JsonField<String>) = apply { this.fqdn = fqdn }

        /** Port to use when connecting to this FQDN. */
        fun port(port: Long) = port(JsonField.of(port))

        /**
         * Sets [Builder.port] to an arbitrary JSON value.
         *
         * You should usually call [Builder.port] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun port(port: JsonField<Long>) = apply { this.port = port }

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

        /** ISO 8601 formatted date indicating when the resource was updated. */
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
         * Returns an immutable instance of [Fqdn].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Fqdn =
            Fqdn(
                id,
                connectionId,
                createdAt,
                dnsRecordType,
                fqdn,
                port,
                recordType,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Fqdn = apply {
        if (validated) {
            return@apply
        }

        id()
        connectionId()
        createdAt()
        dnsRecordType()
        fqdn()
        port()
        recordType()
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
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (dnsRecordType.asKnown().isPresent) 1 else 0) +
            (if (fqdn.asKnown().isPresent) 1 else 0) +
            (if (port.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Fqdn &&
            id == other.id &&
            connectionId == other.connectionId &&
            createdAt == other.createdAt &&
            dnsRecordType == other.dnsRecordType &&
            fqdn == other.fqdn &&
            port == other.port &&
            recordType == other.recordType &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            connectionId,
            createdAt,
            dnsRecordType,
            fqdn,
            port,
            recordType,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Fqdn{id=$id, connectionId=$connectionId, createdAt=$createdAt, dnsRecordType=$dnsRecordType, fqdn=$fqdn, port=$port, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
