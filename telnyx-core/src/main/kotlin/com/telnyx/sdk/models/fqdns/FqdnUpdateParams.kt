// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update the details of a specific FQDN. */
class FqdnUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * ID of the FQDN connection to which this IP should be attached.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = body.connectionId()

    /**
     * The DNS record type for the FQDN. For cases where a port is not set, the DNS record type must
     * be 'srv'. For cases where a port is set, the DNS record type must be 'a'. If the DNS record
     * type is 'a' and a port is not specified, 5060 will be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dnsRecordType(): Optional<String> = body.dnsRecordType()

    /**
     * FQDN represented by this resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fqdn(): Optional<String> = body.fqdn()

    /**
     * Port to use when connecting to this FQDN.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun port(): Optional<Long> = body.port()

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectionId(): JsonField<String> = body._connectionId()

    /**
     * Returns the raw JSON value of [dnsRecordType].
     *
     * Unlike [dnsRecordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dnsRecordType(): JsonField<String> = body._dnsRecordType()

    /**
     * Returns the raw JSON value of [fqdn].
     *
     * Unlike [fqdn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fqdn(): JsonField<String> = body._fqdn()

    /**
     * Returns the raw JSON value of [port].
     *
     * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _port(): JsonField<Long> = body._port()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FqdnUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FqdnUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FqdnUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fqdnUpdateParams: FqdnUpdateParams) = apply {
            id = fqdnUpdateParams.id
            body = fqdnUpdateParams.body.toBuilder()
            additionalHeaders = fqdnUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = fqdnUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [connectionId]
         * - [dnsRecordType]
         * - [fqdn]
         * - [port]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the FQDN connection to which this IP should be attached. */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            body.connectionId(connectionId)
        }

        /**
         * The DNS record type for the FQDN. For cases where a port is not set, the DNS record type
         * must be 'srv'. For cases where a port is set, the DNS record type must be 'a'. If the DNS
         * record type is 'a' and a port is not specified, 5060 will be used.
         */
        fun dnsRecordType(dnsRecordType: String) = apply { body.dnsRecordType(dnsRecordType) }

        /**
         * Sets [Builder.dnsRecordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dnsRecordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dnsRecordType(dnsRecordType: JsonField<String>) = apply {
            body.dnsRecordType(dnsRecordType)
        }

        /** FQDN represented by this resource. */
        fun fqdn(fqdn: String) = apply { body.fqdn(fqdn) }

        /**
         * Sets [Builder.fqdn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fqdn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fqdn(fqdn: JsonField<String>) = apply { body.fqdn(fqdn) }

        /** Port to use when connecting to this FQDN. */
        fun port(port: Long?) = apply { body.port(port) }

        /**
         * Alias for [Builder.port].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun port(port: Long) = port(port as Long?)

        /** Alias for calling [Builder.port] with `port.orElse(null)`. */
        fun port(port: Optional<Long>) = port(port.getOrNull())

        /**
         * Sets [Builder.port] to an arbitrary JSON value.
         *
         * You should usually call [Builder.port] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun port(port: JsonField<Long>) = apply { body.port(port) }

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
         * Returns an immutable instance of [FqdnUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FqdnUpdateParams =
            FqdnUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connectionId: JsonField<String>,
        private val dnsRecordType: JsonField<String>,
        private val fqdn: JsonField<String>,
        private val port: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dns_record_type")
            @ExcludeMissing
            dnsRecordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fqdn") @ExcludeMissing fqdn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("port") @ExcludeMissing port: JsonField<Long> = JsonMissing.of(),
        ) : this(connectionId, dnsRecordType, fqdn, port, mutableMapOf())

        /**
         * ID of the FQDN connection to which this IP should be attached.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * The DNS record type for the FQDN. For cases where a port is not set, the DNS record type
         * must be 'srv'. For cases where a port is set, the DNS record type must be 'a'. If the DNS
         * record type is 'a' and a port is not specified, 5060 will be used.
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
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [dnsRecordType].
         *
         * Unlike [dnsRecordType], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var connectionId: JsonField<String> = JsonMissing.of()
            private var dnsRecordType: JsonField<String> = JsonMissing.of()
            private var fqdn: JsonField<String> = JsonMissing.of()
            private var port: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                connectionId = body.connectionId
                dnsRecordType = body.dnsRecordType
                fqdn = body.fqdn
                port = body.port
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the FQDN connection to which this IP should be attached. */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /**
             * The DNS record type for the FQDN. For cases where a port is not set, the DNS record
             * type must be 'srv'. For cases where a port is set, the DNS record type must be 'a'.
             * If the DNS record type is 'a' and a port is not specified, 5060 will be used.
             */
            fun dnsRecordType(dnsRecordType: String) = dnsRecordType(JsonField.of(dnsRecordType))

            /**
             * Sets [Builder.dnsRecordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dnsRecordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fqdn(fqdn: JsonField<String>) = apply { this.fqdn = fqdn }

            /** Port to use when connecting to this FQDN. */
            fun port(port: Long?) = port(JsonField.ofNullable(port))

            /**
             * Alias for [Builder.port].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun port(port: Long) = port(port as Long?)

            /** Alias for calling [Builder.port] with `port.orElse(null)`. */
            fun port(port: Optional<Long>) = port(port.getOrNull())

            /**
             * Sets [Builder.port] to an arbitrary JSON value.
             *
             * You should usually call [Builder.port] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun port(port: JsonField<Long>) = apply { this.port = port }

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
             */
            fun build(): Body =
                Body(connectionId, dnsRecordType, fqdn, port, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            connectionId()
            dnsRecordType()
            fqdn()
            port()
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
            (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (dnsRecordType.asKnown().isPresent) 1 else 0) +
                (if (fqdn.asKnown().isPresent) 1 else 0) +
                (if (port.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                connectionId == other.connectionId &&
                dnsRecordType == other.dnsRecordType &&
                fqdn == other.fqdn &&
                port == other.port &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(connectionId, dnsRecordType, fqdn, port, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{connectionId=$connectionId, dnsRecordType=$dnsRecordType, fqdn=$fqdn, port=$port, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FqdnUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FqdnUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
