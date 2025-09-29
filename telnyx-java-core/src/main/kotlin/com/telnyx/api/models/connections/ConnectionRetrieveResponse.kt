// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.connections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.credentialconnections.AnchorsiteOverride
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConnectionRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [ConnectionRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionRetrieveResponse: ConnectionRetrieveResponse) = apply {
            data = connectionRetrieveResponse.data
            additionalProperties = connectionRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ConnectionRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConnectionRetrieveResponse =
            ConnectionRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ConnectionRetrieveResponse = apply {
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
        private val active: JsonField<Boolean>,
        private val anchorsiteOverride: JsonField<AnchorsiteOverride>,
        private val connectionName: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val outboundVoiceProfileId: JsonField<String>,
        private val recordType: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val updatedAt: JsonField<String>,
        private val webhookApiVersion: JsonField<WebhookApiVersion>,
        private val webhookEventFailoverUrl: JsonField<String>,
        private val webhookEventUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("anchorsite_override")
            @ExcludeMissing
            anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of(),
            @JsonProperty("connection_name")
            @ExcludeMissing
            connectionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outbound_voice_profile_id")
            @ExcludeMissing
            outboundVoiceProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_api_version")
            @ExcludeMissing
            webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of(),
            @JsonProperty("webhook_event_failover_url")
            @ExcludeMissing
            webhookEventFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_event_url")
            @ExcludeMissing
            webhookEventUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            active,
            anchorsiteOverride,
            connectionName,
            createdAt,
            outboundVoiceProfileId,
            recordType,
            tags,
            updatedAt,
            webhookApiVersion,
            webhookEventFailoverUrl,
            webhookEventUrl,
            mutableMapOf(),
        )

        /**
         * Identifies the specific resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Defaults to true
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Optional<Boolean> = active.getOptional("active")

        /**
         * `Latency` directs Telnyx to route media through the site with the lowest round-trip time
         * to the user's connection. Telnyx calculates this time using ICMP ping messages. This can
         * be disabled by specifying a site to handle all media.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun anchorsiteOverride(): Optional<AnchorsiteOverride> =
            anchorsiteOverride.getOptional("anchorsite_override")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionName(): Optional<String> = connectionName.getOptional("connection_name")

        /**
         * ISO 8601 formatted date indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * Identifies the associated outbound voice profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundVoiceProfileId(): Optional<String> =
            outboundVoiceProfileId.getOptional("outbound_voice_profile_id")

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
         * primary URL fails.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookEventFailoverUrl(): Optional<String> =
            webhookEventFailoverUrl.getOptional("webhook_event_failover_url")

        /**
         * The URL where webhooks related to this connection will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookEventUrl(): Optional<String> = webhookEventUrl.getOptional("webhook_event_url")

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
         * Returns the raw JSON value of [anchorsiteOverride].
         *
         * Unlike [anchorsiteOverride], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("anchorsite_override")
        @ExcludeMissing
        fun _anchorsiteOverride(): JsonField<AnchorsiteOverride> = anchorsiteOverride

        /**
         * Returns the raw JSON value of [connectionName].
         *
         * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_name")
        @ExcludeMissing
        fun _connectionName(): JsonField<String> = connectionName

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [outboundVoiceProfileId].
         *
         * Unlike [outboundVoiceProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("outbound_voice_profile_id")
        @ExcludeMissing
        fun _outboundVoiceProfileId(): JsonField<String> = outboundVoiceProfileId

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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
         * Unlike [webhookEventUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_event_url")
        @ExcludeMissing
        fun _webhookEventUrl(): JsonField<String> = webhookEventUrl

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
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of()
            private var connectionName: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var outboundVoiceProfileId: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
            private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookEventUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                active = data.active
                anchorsiteOverride = data.anchorsiteOverride
                connectionName = data.connectionName
                createdAt = data.createdAt
                outboundVoiceProfileId = data.outboundVoiceProfileId
                recordType = data.recordType
                tags = data.tags.map { it.toMutableList() }
                updatedAt = data.updatedAt
                webhookApiVersion = data.webhookApiVersion
                webhookEventFailoverUrl = data.webhookEventFailoverUrl
                webhookEventUrl = data.webhookEventUrl
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the specific resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Defaults to true */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /**
             * `Latency` directs Telnyx to route media through the site with the lowest round-trip
             * time to the user's connection. Telnyx calculates this time using ICMP ping messages.
             * This can be disabled by specifying a site to handle all media.
             */
            fun anchorsiteOverride(anchorsiteOverride: AnchorsiteOverride) =
                anchorsiteOverride(JsonField.of(anchorsiteOverride))

            /**
             * Sets [Builder.anchorsiteOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.anchorsiteOverride] with a well-typed
             * [AnchorsiteOverride] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun anchorsiteOverride(anchorsiteOverride: JsonField<AnchorsiteOverride>) = apply {
                this.anchorsiteOverride = anchorsiteOverride
            }

            fun connectionName(connectionName: String) =
                connectionName(JsonField.of(connectionName))

            /**
             * Sets [Builder.connectionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionName(connectionName: JsonField<String>) = apply {
                this.connectionName = connectionName
            }

            /** ISO 8601 formatted date indicating when the resource was created. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

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

            /** Tags associated with the connection. */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** ISO 8601 formatted date indicating when the resource was updated. */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            /** Determines which webhook format will be used, Telnyx API v1 or v2. */
            fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) =
                webhookApiVersion(JsonField.of(webhookApiVersion))

            /**
             * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookApiVersion] with a well-typed
             * [WebhookApiVersion] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
                this.webhookApiVersion = webhookApiVersion
            }

            /**
             * The failover URL where webhooks related to this connection will be sent if sending to
             * the primary URL fails.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookEventFailoverUrl(webhookEventFailoverUrl: JsonField<String>) = apply {
                this.webhookEventFailoverUrl = webhookEventFailoverUrl
            }

            /** The URL where webhooks related to this connection will be sent. */
            fun webhookEventUrl(webhookEventUrl: String?) =
                webhookEventUrl(JsonField.ofNullable(webhookEventUrl))

            /** Alias for calling [Builder.webhookEventUrl] with `webhookEventUrl.orElse(null)`. */
            fun webhookEventUrl(webhookEventUrl: Optional<String>) =
                webhookEventUrl(webhookEventUrl.getOrNull())

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
                    active,
                    anchorsiteOverride,
                    connectionName,
                    createdAt,
                    outboundVoiceProfileId,
                    recordType,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    updatedAt,
                    webhookApiVersion,
                    webhookEventFailoverUrl,
                    webhookEventUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            active()
            anchorsiteOverride().ifPresent { it.validate() }
            connectionName()
            createdAt()
            outboundVoiceProfileId()
            recordType()
            tags()
            updatedAt()
            webhookApiVersion().ifPresent { it.validate() }
            webhookEventFailoverUrl()
            webhookEventUrl()
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
                (if (active.asKnown().isPresent) 1 else 0) +
                (anchorsiteOverride.asKnown().getOrNull()?.validity() ?: 0) +
                (if (connectionName.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (outboundVoiceProfileId.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (webhookApiVersion.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookEventFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookEventUrl.asKnown().isPresent) 1 else 0)

        /** Determines which webhook format will be used, Telnyx API v1 or v2. */
        class WebhookApiVersion
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val _1 = of("1")

                @JvmField val _2 = of("2")

                @JvmStatic fun of(value: String) = WebhookApiVersion(JsonField.of(value))
            }

            /** An enum containing [WebhookApiVersion]'s known values. */
            enum class Known {
                _1,
                _2,
            }

            /**
             * An enum containing [WebhookApiVersion]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [WebhookApiVersion] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _1,
                _2,
                /**
                 * An enum member indicating that [WebhookApiVersion] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    _1 -> Value._1
                    _2 -> Value._2
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    _1 -> Known._1
                    _2 -> Known._2
                    else -> throw TelnyxInvalidDataException("Unknown WebhookApiVersion: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

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

            return other is Data &&
                id == other.id &&
                active == other.active &&
                anchorsiteOverride == other.anchorsiteOverride &&
                connectionName == other.connectionName &&
                createdAt == other.createdAt &&
                outboundVoiceProfileId == other.outboundVoiceProfileId &&
                recordType == other.recordType &&
                tags == other.tags &&
                updatedAt == other.updatedAt &&
                webhookApiVersion == other.webhookApiVersion &&
                webhookEventFailoverUrl == other.webhookEventFailoverUrl &&
                webhookEventUrl == other.webhookEventUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                active,
                anchorsiteOverride,
                connectionName,
                createdAt,
                outboundVoiceProfileId,
                recordType,
                tags,
                updatedAt,
                webhookApiVersion,
                webhookEventFailoverUrl,
                webhookEventUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, active=$active, anchorsiteOverride=$anchorsiteOverride, connectionName=$connectionName, createdAt=$createdAt, outboundVoiceProfileId=$outboundVoiceProfileId, recordType=$recordType, tags=$tags, updatedAt=$updatedAt, webhookApiVersion=$webhookApiVersion, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
