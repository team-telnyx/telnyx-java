// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

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

class ExternalConnection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val createdAt: JsonField<String>,
    private val credentialActive: JsonField<Boolean>,
    private val externalSipConnection: JsonField<ExternalSipConnection>,
    private val inbound: JsonField<Inbound>,
    private val outbound: JsonField<Outbound>,
    private val recordType: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val updatedAt: JsonField<String>,
    private val webhookApiVersion: JsonField<WebhookApiVersion>,
    private val webhookEventFailoverUrl: JsonField<String>,
    private val webhookEventUrl: JsonField<String>,
    private val webhookTimeoutSecs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credential_active")
        @ExcludeMissing
        credentialActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("external_sip_connection")
        @ExcludeMissing
        externalSipConnection: JsonField<ExternalSipConnection> = JsonMissing.of(),
        @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Inbound> = JsonMissing.of(),
        @JsonProperty("outbound") @ExcludeMissing outbound: JsonField<Outbound> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_api_version")
        @ExcludeMissing
        webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of(),
        @JsonProperty("webhook_event_failover_url")
        @ExcludeMissing
        webhookEventFailoverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_event_url")
        @ExcludeMissing
        webhookEventUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_timeout_secs")
        @ExcludeMissing
        webhookTimeoutSecs: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        active,
        createdAt,
        credentialActive,
        externalSipConnection,
        inbound,
        outbound,
        recordType,
        tags,
        updatedAt,
        webhookApiVersion,
        webhookEventFailoverUrl,
        webhookEventUrl,
        webhookTimeoutSecs,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Specifies whether the connection can be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Optional<Boolean> = active.getOptional("active")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * If the credential associated with this service is active.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credentialActive(): Optional<Boolean> = credentialActive.getOptional("credential_active")

    /**
     * The service that will be consuming this connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalSipConnection(): Optional<ExternalSipConnection> =
        externalSipConnection.getOptional("external_sip_connection")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<Inbound> = inbound.getOptional("inbound")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outbound(): Optional<Outbound> = outbound.getOptional("outbound")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Tags associated with the connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Determines which webhook format will be used, Telnyx API v1 or v2.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookApiVersion(): Optional<WebhookApiVersion> =
        webhookApiVersion.getOptional("webhook_api_version")

    /**
     * The failover URL where webhooks related to this connection will be sent if sending to the
     * primary URL fails. Must include a scheme, such as 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventFailoverUrl(): Optional<String> =
        webhookEventFailoverUrl.getOptional("webhook_event_failover_url")

    /**
     * The URL where webhooks related to this connection will be sent. Must include a scheme, such
     * as 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventUrl(): Optional<String> = webhookEventUrl.getOptional("webhook_event_url")

    /**
     * Specifies how many seconds to wait before timing out a webhook.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookTimeoutSecs(): Optional<Long> =
        webhookTimeoutSecs.getOptional("webhook_timeout_secs")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [credentialActive].
     *
     * Unlike [credentialActive], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credential_active")
    @ExcludeMissing
    fun _credentialActive(): JsonField<Boolean> = credentialActive

    /**
     * Returns the raw JSON value of [externalSipConnection].
     *
     * Unlike [externalSipConnection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_sip_connection")
    @ExcludeMissing
    fun _externalSipConnection(): JsonField<ExternalSipConnection> = externalSipConnection

    /**
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<Inbound> = inbound

    /**
     * Returns the raw JSON value of [outbound].
     *
     * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outbound") @ExcludeMissing fun _outbound(): JsonField<Outbound> = outbound

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [webhookApiVersion].
     *
     * Unlike [webhookApiVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_api_version")
    @ExcludeMissing
    fun _webhookApiVersion(): JsonField<WebhookApiVersion> = webhookApiVersion

    /**
     * Returns the raw JSON value of [webhookEventFailoverUrl].
     *
     * Unlike [webhookEventFailoverUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("webhook_event_failover_url")
    @ExcludeMissing
    fun _webhookEventFailoverUrl(): JsonField<String> = webhookEventFailoverUrl

    /**
     * Returns the raw JSON value of [webhookEventUrl].
     *
     * Unlike [webhookEventUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_event_url")
    @ExcludeMissing
    fun _webhookEventUrl(): JsonField<String> = webhookEventUrl

    /**
     * Returns the raw JSON value of [webhookTimeoutSecs].
     *
     * Unlike [webhookTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_timeout_secs")
    @ExcludeMissing
    fun _webhookTimeoutSecs(): JsonField<Long> = webhookTimeoutSecs

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

        /** Returns a mutable builder for constructing an instance of [ExternalConnection]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalConnection]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var credentialActive: JsonField<Boolean> = JsonMissing.of()
        private var externalSipConnection: JsonField<ExternalSipConnection> = JsonMissing.of()
        private var inbound: JsonField<Inbound> = JsonMissing.of()
        private var outbound: JsonField<Outbound> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
        private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookEventUrl: JsonField<String> = JsonMissing.of()
        private var webhookTimeoutSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalConnection: ExternalConnection) = apply {
            id = externalConnection.id
            active = externalConnection.active
            createdAt = externalConnection.createdAt
            credentialActive = externalConnection.credentialActive
            externalSipConnection = externalConnection.externalSipConnection
            inbound = externalConnection.inbound
            outbound = externalConnection.outbound
            recordType = externalConnection.recordType
            tags = externalConnection.tags.map { it.toMutableList() }
            updatedAt = externalConnection.updatedAt
            webhookApiVersion = externalConnection.webhookApiVersion
            webhookEventFailoverUrl = externalConnection.webhookEventFailoverUrl
            webhookEventUrl = externalConnection.webhookEventUrl
            webhookTimeoutSecs = externalConnection.webhookTimeoutSecs
            additionalProperties = externalConnection.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Specifies whether the connection can be used. */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

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

        /** If the credential associated with this service is active. */
        fun credentialActive(credentialActive: Boolean) =
            credentialActive(JsonField.of(credentialActive))

        /**
         * Sets [Builder.credentialActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialActive] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentialActive(credentialActive: JsonField<Boolean>) = apply {
            this.credentialActive = credentialActive
        }

        /** The service that will be consuming this connection. */
        fun externalSipConnection(externalSipConnection: ExternalSipConnection) =
            externalSipConnection(JsonField.of(externalSipConnection))

        /**
         * Sets [Builder.externalSipConnection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalSipConnection] with a well-typed
         * [ExternalSipConnection] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun externalSipConnection(externalSipConnection: JsonField<ExternalSipConnection>) = apply {
            this.externalSipConnection = externalSipConnection
        }

        fun inbound(inbound: Inbound) = inbound(JsonField.of(inbound))

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [Inbound] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inbound(inbound: JsonField<Inbound>) = apply { this.inbound = inbound }

        fun outbound(outbound: Outbound) = outbound(JsonField.of(outbound))

        /**
         * Sets [Builder.outbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outbound] with a well-typed [Outbound] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outbound(outbound: JsonField<Outbound>) = apply { this.outbound = outbound }

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

        /** Tags associated with the connection. */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

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

        /** Determines which webhook format will be used, Telnyx API v1 or v2. */
        fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) =
            webhookApiVersion(JsonField.of(webhookApiVersion))

        /**
         * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookApiVersion] with a well-typed [WebhookApiVersion]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
            this.webhookApiVersion = webhookApiVersion
        }

        /**
         * The failover URL where webhooks related to this connection will be sent if sending to the
         * primary URL fails. Must include a scheme, such as 'https'.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: String?) =
            webhookEventFailoverUrl(JsonField.ofNullable(webhookEventFailoverUrl))

        /**
         * Alias for calling [Builder.webhookEventFailoverUrl] with
         * `webhookEventFailoverUrl.orElse(null)`.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: Optional<String>) =
            webhookEventFailoverUrl(webhookEventFailoverUrl.getOrNull())

        /**
         * Sets [Builder.webhookEventFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventFailoverUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: JsonField<String>) = apply {
            this.webhookEventFailoverUrl = webhookEventFailoverUrl
        }

        /**
         * The URL where webhooks related to this connection will be sent. Must include a scheme,
         * such as 'https'.
         */
        fun webhookEventUrl(webhookEventUrl: String) =
            webhookEventUrl(JsonField.of(webhookEventUrl))

        /**
         * Sets [Builder.webhookEventUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookEventUrl(webhookEventUrl: JsonField<String>) = apply {
            this.webhookEventUrl = webhookEventUrl
        }

        /** Specifies how many seconds to wait before timing out a webhook. */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Long?) =
            webhookTimeoutSecs(JsonField.ofNullable(webhookTimeoutSecs))

        /**
         * Alias for [Builder.webhookTimeoutSecs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Long) =
            webhookTimeoutSecs(webhookTimeoutSecs as Long?)

        /**
         * Alias for calling [Builder.webhookTimeoutSecs] with `webhookTimeoutSecs.orElse(null)`.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Optional<Long>) =
            webhookTimeoutSecs(webhookTimeoutSecs.getOrNull())

        /**
         * Sets [Builder.webhookTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookTimeoutSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: JsonField<Long>) = apply {
            this.webhookTimeoutSecs = webhookTimeoutSecs
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
         * Returns an immutable instance of [ExternalConnection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalConnection =
            ExternalConnection(
                id,
                active,
                createdAt,
                credentialActive,
                externalSipConnection,
                inbound,
                outbound,
                recordType,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                webhookApiVersion,
                webhookEventFailoverUrl,
                webhookEventUrl,
                webhookTimeoutSecs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalConnection = apply {
        if (validated) {
            return@apply
        }

        id()
        active()
        createdAt()
        credentialActive()
        externalSipConnection().ifPresent { it.validate() }
        inbound().ifPresent { it.validate() }
        outbound().ifPresent { it.validate() }
        recordType()
        tags()
        updatedAt()
        webhookApiVersion().ifPresent { it.validate() }
        webhookEventFailoverUrl()
        webhookEventUrl()
        webhookTimeoutSecs()
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
            (if (active.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (credentialActive.asKnown().isPresent) 1 else 0) +
            (externalSipConnection.asKnown().getOrNull()?.validity() ?: 0) +
            (inbound.asKnown().getOrNull()?.validity() ?: 0) +
            (outbound.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (webhookApiVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webhookEventFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookEventUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookTimeoutSecs.asKnown().isPresent) 1 else 0)

    /** The service that will be consuming this connection. */
    class ExternalSipConnection
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ZOOM = of("zoom")

            @JvmField val OPERATOR_CONNECT = of("operator_connect")

            @JvmStatic fun of(value: String) = ExternalSipConnection(JsonField.of(value))
        }

        /** An enum containing [ExternalSipConnection]'s known values. */
        enum class Known {
            ZOOM,
            OPERATOR_CONNECT,
        }

        /**
         * An enum containing [ExternalSipConnection]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExternalSipConnection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ZOOM,
            OPERATOR_CONNECT,
            /**
             * An enum member indicating that [ExternalSipConnection] was instantiated with an
             * unknown value.
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
                ZOOM -> Value.ZOOM
                OPERATOR_CONNECT -> Value.OPERATOR_CONNECT
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
                ZOOM -> Known.ZOOM
                OPERATOR_CONNECT -> Known.OPERATOR_CONNECT
                else -> throw TelnyxInvalidDataException("Unknown ExternalSipConnection: $value")
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

        fun validate(): ExternalSipConnection = apply {
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

            return other is ExternalSipConnection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Inbound
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channelLimit: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channel_limit")
            @ExcludeMissing
            channelLimit: JsonField<Long> = JsonMissing.of()
        ) : this(channelLimit, mutableMapOf())

        /**
         * When set, this will limit the number of concurrent inbound calls to phone numbers
         * associated with this connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

        /**
         * Returns the raw JSON value of [channelLimit].
         *
         * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("channel_limit")
        @ExcludeMissing
        fun _channelLimit(): JsonField<Long> = channelLimit

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

            /** Returns a mutable builder for constructing an instance of [Inbound]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inbound]. */
        class Builder internal constructor() {

            private var channelLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inbound: Inbound) = apply {
                channelLimit = inbound.channelLimit
                additionalProperties = inbound.additionalProperties.toMutableMap()
            }

            /**
             * When set, this will limit the number of concurrent inbound calls to phone numbers
             * associated with this connection.
             */
            fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

            /**
             * Sets [Builder.channelLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channelLimit(channelLimit: JsonField<Long>) = apply {
                this.channelLimit = channelLimit
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
             * Returns an immutable instance of [Inbound].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Inbound = Inbound(channelLimit, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Inbound = apply {
            if (validated) {
                return@apply
            }

            channelLimit()
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
        internal fun validity(): Int = (if (channelLimit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Inbound &&
                channelLimit == other.channelLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(channelLimit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inbound{channelLimit=$channelLimit, additionalProperties=$additionalProperties}"
    }

    class Outbound
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channelLimit: JsonField<Long>,
        private val outboundVoiceProfileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channel_limit")
            @ExcludeMissing
            channelLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("outbound_voice_profile_id")
            @ExcludeMissing
            outboundVoiceProfileId: JsonField<String> = JsonMissing.of(),
        ) : this(channelLimit, outboundVoiceProfileId, mutableMapOf())

        /**
         * When set, this will limit the number of concurrent outbound calls to phone numbers
         * associated with this connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

        /**
         * Identifies the associated outbound voice profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundVoiceProfileId(): Optional<String> =
            outboundVoiceProfileId.getOptional("outbound_voice_profile_id")

        /**
         * Returns the raw JSON value of [channelLimit].
         *
         * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("channel_limit")
        @ExcludeMissing
        fun _channelLimit(): JsonField<Long> = channelLimit

        /**
         * Returns the raw JSON value of [outboundVoiceProfileId].
         *
         * Unlike [outboundVoiceProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("outbound_voice_profile_id")
        @ExcludeMissing
        fun _outboundVoiceProfileId(): JsonField<String> = outboundVoiceProfileId

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

            /** Returns a mutable builder for constructing an instance of [Outbound]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Outbound]. */
        class Builder internal constructor() {

            private var channelLimit: JsonField<Long> = JsonMissing.of()
            private var outboundVoiceProfileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outbound: Outbound) = apply {
                channelLimit = outbound.channelLimit
                outboundVoiceProfileId = outbound.outboundVoiceProfileId
                additionalProperties = outbound.additionalProperties.toMutableMap()
            }

            /**
             * When set, this will limit the number of concurrent outbound calls to phone numbers
             * associated with this connection.
             */
            fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

            /**
             * Sets [Builder.channelLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channelLimit(channelLimit: JsonField<Long>) = apply {
                this.channelLimit = channelLimit
            }

            /** Identifies the associated outbound voice profile. */
            fun outboundVoiceProfileId(outboundVoiceProfileId: String) =
                outboundVoiceProfileId(JsonField.of(outboundVoiceProfileId))

            /**
             * Sets [Builder.outboundVoiceProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outboundVoiceProfileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outboundVoiceProfileId(outboundVoiceProfileId: JsonField<String>) = apply {
                this.outboundVoiceProfileId = outboundVoiceProfileId
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
             * Returns an immutable instance of [Outbound].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Outbound =
                Outbound(channelLimit, outboundVoiceProfileId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Outbound = apply {
            if (validated) {
                return@apply
            }

            channelLimit()
            outboundVoiceProfileId()
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
            (if (channelLimit.asKnown().isPresent) 1 else 0) +
                (if (outboundVoiceProfileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Outbound &&
                channelLimit == other.channelLimit &&
                outboundVoiceProfileId == other.outboundVoiceProfileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channelLimit, outboundVoiceProfileId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Outbound{channelLimit=$channelLimit, outboundVoiceProfileId=$outboundVoiceProfileId, additionalProperties=$additionalProperties}"
    }

    /** Determines which webhook format will be used, Telnyx API v1 or v2. */
    class WebhookApiVersion @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val V1 = of("1")

            @JvmField val V2 = of("2")

            @JvmStatic fun of(value: String) = WebhookApiVersion(JsonField.of(value))
        }

        /** An enum containing [WebhookApiVersion]'s known values. */
        enum class Known {
            V1,
            V2,
        }

        /**
         * An enum containing [WebhookApiVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookApiVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            V1,
            V2,
            /**
             * An enum member indicating that [WebhookApiVersion] was instantiated with an unknown
             * value.
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
                V1 -> Value.V1
                V2 -> Value.V2
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
                V1 -> Known.V1
                V2 -> Known.V2
                else -> throw TelnyxInvalidDataException("Unknown WebhookApiVersion: $value")
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

        fun validate(): WebhookApiVersion = apply {
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

            return other is WebhookApiVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalConnection &&
            id == other.id &&
            active == other.active &&
            createdAt == other.createdAt &&
            credentialActive == other.credentialActive &&
            externalSipConnection == other.externalSipConnection &&
            inbound == other.inbound &&
            outbound == other.outbound &&
            recordType == other.recordType &&
            tags == other.tags &&
            updatedAt == other.updatedAt &&
            webhookApiVersion == other.webhookApiVersion &&
            webhookEventFailoverUrl == other.webhookEventFailoverUrl &&
            webhookEventUrl == other.webhookEventUrl &&
            webhookTimeoutSecs == other.webhookTimeoutSecs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            active,
            createdAt,
            credentialActive,
            externalSipConnection,
            inbound,
            outbound,
            recordType,
            tags,
            updatedAt,
            webhookApiVersion,
            webhookEventFailoverUrl,
            webhookEventUrl,
            webhookTimeoutSecs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalConnection{id=$id, active=$active, createdAt=$createdAt, credentialActive=$credentialActive, externalSipConnection=$externalSipConnection, inbound=$inbound, outbound=$outbound, recordType=$recordType, tags=$tags, updatedAt=$updatedAt, webhookApiVersion=$webhookApiVersion, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, webhookTimeoutSecs=$webhookTimeoutSecs, additionalProperties=$additionalProperties}"
}
