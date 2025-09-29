// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wireguardpeers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.globalipassignments.Record
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created. */
class WireguardPeerCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = body.createdAt()

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = body.recordType()

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = body.updatedAt()

    /**
     * The WireGuard `PublicKey`.<br /><br />If you do not provide a Public Key, a new Public and
     * Private key pair will be generated for you.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicKey(): Optional<String> = body.publicKey()

    /**
     * The id of the wireguard interface associated with the peer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun wireguardInterfaceId(): String = body.wireguardInterfaceId()

    /**
     * ISO 8601 formatted date-time indicating when peer sent traffic last time.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastSeen(): Optional<String> = body.lastSeen()

    /**
     * Your WireGuard `Interface.PrivateKey`.<br /><br />This attribute is only ever utlised if, on
     * POST, you do NOT provide your own `public_key`. In which case, a new Public and Private key
     * pair will be generated for you. When your `private_key` is returned, you must save this
     * immediately as we do not save it within Telnyx. If you lose your Private Key, it can not be
     * recovered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privateKey(): Optional<String> = body.privateKey()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAt(): JsonField<String> = body._createdAt()

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordType(): JsonField<String> = body._recordType()

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _updatedAt(): JsonField<String> = body._updatedAt()

    /**
     * Returns the raw JSON value of [publicKey].
     *
     * Unlike [publicKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _publicKey(): JsonField<String> = body._publicKey()

    /**
     * Returns the raw JSON value of [wireguardInterfaceId].
     *
     * Unlike [wireguardInterfaceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _wireguardInterfaceId(): JsonField<String> = body._wireguardInterfaceId()

    /**
     * Returns the raw JSON value of [lastSeen].
     *
     * Unlike [lastSeen], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastSeen(): JsonField<String> = body._lastSeen()

    /**
     * Returns the raw JSON value of [privateKey].
     *
     * Unlike [privateKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _privateKey(): JsonField<String> = body._privateKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireguardPeerCreateParams].
         *
         * The following fields are required:
         * ```java
         * .wireguardInterfaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireguardPeerCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(wireguardPeerCreateParams: WireguardPeerCreateParams) = apply {
            body = wireguardPeerCreateParams.body.toBuilder()
            additionalHeaders = wireguardPeerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = wireguardPeerCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [createdAt]
         * - [recordType]
         * - [updatedAt]
         * - [publicKey]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Identifies the resource. */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: String) = apply { body.createdAt(createdAt) }

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { body.createdAt(createdAt) }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = apply { body.recordType(recordType) }

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { body.recordType(recordType) }

        /** ISO 8601 formatted date-time indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = apply { body.updatedAt(updatedAt) }

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { body.updatedAt(updatedAt) }

        /**
         * The WireGuard `PublicKey`.<br /><br />If you do not provide a Public Key, a new Public
         * and Private key pair will be generated for you.
         */
        fun publicKey(publicKey: String) = apply { body.publicKey(publicKey) }

        /**
         * Sets [Builder.publicKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publicKey(publicKey: JsonField<String>) = apply { body.publicKey(publicKey) }

        /** The id of the wireguard interface associated with the peer. */
        fun wireguardInterfaceId(wireguardInterfaceId: String) = apply {
            body.wireguardInterfaceId(wireguardInterfaceId)
        }

        /**
         * Sets [Builder.wireguardInterfaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wireguardInterfaceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wireguardInterfaceId(wireguardInterfaceId: JsonField<String>) = apply {
            body.wireguardInterfaceId(wireguardInterfaceId)
        }

        /** ISO 8601 formatted date-time indicating when peer sent traffic last time. */
        fun lastSeen(lastSeen: String) = apply { body.lastSeen(lastSeen) }

        /**
         * Sets [Builder.lastSeen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastSeen] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastSeen(lastSeen: JsonField<String>) = apply { body.lastSeen(lastSeen) }

        /**
         * Your WireGuard `Interface.PrivateKey`.<br /><br />This attribute is only ever utlised if,
         * on POST, you do NOT provide your own `public_key`. In which case, a new Public and
         * Private key pair will be generated for you. When your `private_key` is returned, you must
         * save this immediately as we do not save it within Telnyx. If you lose your Private Key,
         * it can not be recovered.
         */
        fun privateKey(privateKey: String) = apply { body.privateKey(privateKey) }

        /**
         * Sets [Builder.privateKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privateKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun privateKey(privateKey: JsonField<String>) = apply { body.privateKey(privateKey) }

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
         * Returns an immutable instance of [WireguardPeerCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .wireguardInterfaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WireguardPeerCreateParams =
            WireguardPeerCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val recordType: JsonField<String>,
        private val updatedAt: JsonField<String>,
        private val publicKey: JsonField<String>,
        private val wireguardInterfaceId: JsonField<String>,
        private val lastSeen: JsonField<String>,
        private val privateKey: JsonField<String>,
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
            @JsonProperty("public_key")
            @ExcludeMissing
            publicKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wireguard_interface_id")
            @ExcludeMissing
            wireguardInterfaceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_seen")
            @ExcludeMissing
            lastSeen: JsonField<String> = JsonMissing.of(),
            @JsonProperty("private_key")
            @ExcludeMissing
            privateKey: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            recordType,
            updatedAt,
            publicKey,
            wireguardInterfaceId,
            lastSeen,
            privateKey,
            mutableMapOf(),
        )

        fun toRecord(): Record =
            Record.builder()
                .id(id)
                .createdAt(createdAt)
                .recordType(recordType)
                .updatedAt(updatedAt)
                .build()

        fun toWireguardPeerPatch(): WireguardPeerPatch =
            WireguardPeerPatch.builder().publicKey(publicKey).build()

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
         * The WireGuard `PublicKey`.<br /><br />If you do not provide a Public Key, a new Public
         * and Private key pair will be generated for you.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun publicKey(): Optional<String> = publicKey.getOptional("public_key")

        /**
         * The id of the wireguard interface associated with the peer.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun wireguardInterfaceId(): String =
            wireguardInterfaceId.getRequired("wireguard_interface_id")

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
         * Returns the raw JSON value of [publicKey].
         *
         * Unlike [publicKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("public_key") @ExcludeMissing fun _publicKey(): JsonField<String> = publicKey

        /**
         * Returns the raw JSON value of [wireguardInterfaceId].
         *
         * Unlike [wireguardInterfaceId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("wireguard_interface_id")
        @ExcludeMissing
        fun _wireguardInterfaceId(): JsonField<String> = wireguardInterfaceId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .wireguardInterfaceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var publicKey: JsonField<String> = JsonMissing.of()
            private var wireguardInterfaceId: JsonField<String>? = null
            private var lastSeen: JsonField<String> = JsonMissing.of()
            private var privateKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                createdAt = body.createdAt
                recordType = body.recordType
                updatedAt = body.updatedAt
                publicKey = body.publicKey
                wireguardInterfaceId = body.wireguardInterfaceId
                lastSeen = body.lastSeen
                privateKey = body.privateKey
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /**
             * The WireGuard `PublicKey`.<br /><br />If you do not provide a Public Key, a new
             * Public and Private key pair will be generated for you.
             */
            fun publicKey(publicKey: String) = publicKey(JsonField.of(publicKey))

            /**
             * Sets [Builder.publicKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publicKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun publicKey(publicKey: JsonField<String>) = apply { this.publicKey = publicKey }

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
             *
             * The following fields are required:
             * ```java
             * .wireguardInterfaceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    id,
                    createdAt,
                    recordType,
                    updatedAt,
                    publicKey,
                    checkRequired("wireguardInterfaceId", wireguardInterfaceId),
                    lastSeen,
                    privateKey,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            recordType()
            updatedAt()
            publicKey()
            wireguardInterfaceId()
            lastSeen()
            privateKey()
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
                (if (publicKey.asKnown().isPresent) 1 else 0) +
                (if (wireguardInterfaceId.asKnown().isPresent) 1 else 0) +
                (if (lastSeen.asKnown().isPresent) 1 else 0) +
                (if (privateKey.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                createdAt == other.createdAt &&
                recordType == other.recordType &&
                updatedAt == other.updatedAt &&
                publicKey == other.publicKey &&
                wireguardInterfaceId == other.wireguardInterfaceId &&
                lastSeen == other.lastSeen &&
                privateKey == other.privateKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                recordType,
                updatedAt,
                publicKey,
                wireguardInterfaceId,
                lastSeen,
                privateKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, createdAt=$createdAt, recordType=$recordType, updatedAt=$updatedAt, publicKey=$publicKey, wireguardInterfaceId=$wireguardInterfaceId, lastSeen=$lastSeen, privateKey=$privateKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireguardPeerCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WireguardPeerCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
