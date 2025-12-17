// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

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

class Room
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val activeSessionId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val enableRecording: JsonField<Boolean>,
    private val maxParticipants: JsonField<Long>,
    private val recordType: JsonField<String>,
    private val sessions: JsonField<List<RoomSession>>,
    private val uniqueName: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val webhookEventFailoverUrl: JsonField<String>,
    private val webhookEventUrl: JsonField<String>,
    private val webhookTimeoutSecs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active_session_id")
        @ExcludeMissing
        activeSessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("enable_recording")
        @ExcludeMissing
        enableRecording: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_participants")
        @ExcludeMissing
        maxParticipants: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sessions")
        @ExcludeMissing
        sessions: JsonField<List<RoomSession>> = JsonMissing.of(),
        @JsonProperty("unique_name")
        @ExcludeMissing
        uniqueName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        activeSessionId,
        createdAt,
        enableRecording,
        maxParticipants,
        recordType,
        sessions,
        uniqueName,
        updatedAt,
        webhookEventFailoverUrl,
        webhookEventUrl,
        webhookTimeoutSecs,
        mutableMapOf(),
    )

    /**
     * A unique identifier for the room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The identifier of the active room session if any.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activeSessionId(): Optional<String> = activeSessionId.getOptional("active_session_id")

    /**
     * ISO 8601 timestamp when the room was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Enable or disable recording for that room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableRecording(): Optional<Boolean> = enableRecording.getOptional("enable_recording")

    /**
     * Maximum participants allowed in the room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParticipants(): Optional<Long> = maxParticipants.getOptional("max_participants")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessions(): Optional<List<RoomSession>> = sessions.getOptional("sessions")

    /**
     * The unique (within the Telnyx account scope) name of the room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniqueName(): Optional<String> = uniqueName.getOptional("unique_name")

    /**
     * ISO 8601 timestamp when the room was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * The failover URL where webhooks related to this room will be sent if sending to the primary
     * URL fails. Must include a scheme, such as 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventFailoverUrl(): Optional<String> =
        webhookEventFailoverUrl.getOptional("webhook_event_failover_url")

    /**
     * The URL where webhooks related to this room will be sent. Must include a scheme, such as
     * 'https'.
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
     * Returns the raw JSON value of [activeSessionId].
     *
     * Unlike [activeSessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active_session_id")
    @ExcludeMissing
    fun _activeSessionId(): JsonField<String> = activeSessionId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [enableRecording].
     *
     * Unlike [enableRecording], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enable_recording")
    @ExcludeMissing
    fun _enableRecording(): JsonField<Boolean> = enableRecording

    /**
     * Returns the raw JSON value of [maxParticipants].
     *
     * Unlike [maxParticipants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_participants")
    @ExcludeMissing
    fun _maxParticipants(): JsonField<Long> = maxParticipants

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [sessions].
     *
     * Unlike [sessions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sessions")
    @ExcludeMissing
    fun _sessions(): JsonField<List<RoomSession>> = sessions

    /**
     * Returns the raw JSON value of [uniqueName].
     *
     * Unlike [uniqueName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unique_name") @ExcludeMissing fun _uniqueName(): JsonField<String> = uniqueName

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [Room]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Room]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var activeSessionId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var enableRecording: JsonField<Boolean> = JsonMissing.of()
        private var maxParticipants: JsonField<Long> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var sessions: JsonField<MutableList<RoomSession>>? = null
        private var uniqueName: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookEventUrl: JsonField<String> = JsonMissing.of()
        private var webhookTimeoutSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(room: Room) = apply {
            id = room.id
            activeSessionId = room.activeSessionId
            createdAt = room.createdAt
            enableRecording = room.enableRecording
            maxParticipants = room.maxParticipants
            recordType = room.recordType
            sessions = room.sessions.map { it.toMutableList() }
            uniqueName = room.uniqueName
            updatedAt = room.updatedAt
            webhookEventFailoverUrl = room.webhookEventFailoverUrl
            webhookEventUrl = room.webhookEventUrl
            webhookTimeoutSecs = room.webhookTimeoutSecs
            additionalProperties = room.additionalProperties.toMutableMap()
        }

        /** A unique identifier for the room. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the active room session if any. */
        fun activeSessionId(activeSessionId: String) =
            activeSessionId(JsonField.of(activeSessionId))

        /**
         * Sets [Builder.activeSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeSessionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activeSessionId(activeSessionId: JsonField<String>) = apply {
            this.activeSessionId = activeSessionId
        }

        /** ISO 8601 timestamp when the room was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Enable or disable recording for that room. */
        fun enableRecording(enableRecording: Boolean) =
            enableRecording(JsonField.of(enableRecording))

        /**
         * Sets [Builder.enableRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableRecording] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableRecording(enableRecording: JsonField<Boolean>) = apply {
            this.enableRecording = enableRecording
        }

        /** Maximum participants allowed in the room. */
        fun maxParticipants(maxParticipants: Long) = maxParticipants(JsonField.of(maxParticipants))

        /**
         * Sets [Builder.maxParticipants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxParticipants] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxParticipants(maxParticipants: JsonField<Long>) = apply {
            this.maxParticipants = maxParticipants
        }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        fun sessions(sessions: List<RoomSession>) = sessions(JsonField.of(sessions))

        /**
         * Sets [Builder.sessions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessions] with a well-typed `List<RoomSession>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sessions(sessions: JsonField<List<RoomSession>>) = apply {
            this.sessions = sessions.map { it.toMutableList() }
        }

        /**
         * Adds a single [RoomSession] to [sessions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSession(session: RoomSession) = apply {
            sessions =
                (sessions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sessions", it).add(session)
                }
        }

        /** The unique (within the Telnyx account scope) name of the room. */
        fun uniqueName(uniqueName: String) = uniqueName(JsonField.of(uniqueName))

        /**
         * Sets [Builder.uniqueName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniqueName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uniqueName(uniqueName: JsonField<String>) = apply { this.uniqueName = uniqueName }

        /** ISO 8601 timestamp when the room was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * The failover URL where webhooks related to this room will be sent if sending to the
         * primary URL fails. Must include a scheme, such as 'https'.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: String) =
            webhookEventFailoverUrl(JsonField.of(webhookEventFailoverUrl))

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
         * The URL where webhooks related to this room will be sent. Must include a scheme, such as
         * 'https'.
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
        fun webhookTimeoutSecs(webhookTimeoutSecs: Long) =
            webhookTimeoutSecs(JsonField.of(webhookTimeoutSecs))

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
         * Returns an immutable instance of [Room].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Room =
            Room(
                id,
                activeSessionId,
                createdAt,
                enableRecording,
                maxParticipants,
                recordType,
                (sessions ?: JsonMissing.of()).map { it.toImmutable() },
                uniqueName,
                updatedAt,
                webhookEventFailoverUrl,
                webhookEventUrl,
                webhookTimeoutSecs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Room = apply {
        if (validated) {
            return@apply
        }

        id()
        activeSessionId()
        createdAt()
        enableRecording()
        maxParticipants()
        recordType()
        sessions().ifPresent { it.forEach { it.validate() } }
        uniqueName()
        updatedAt()
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
            (if (activeSessionId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (enableRecording.asKnown().isPresent) 1 else 0) +
            (if (maxParticipants.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (sessions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (uniqueName.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (webhookEventFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookEventUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookTimeoutSecs.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Room &&
            id == other.id &&
            activeSessionId == other.activeSessionId &&
            createdAt == other.createdAt &&
            enableRecording == other.enableRecording &&
            maxParticipants == other.maxParticipants &&
            recordType == other.recordType &&
            sessions == other.sessions &&
            uniqueName == other.uniqueName &&
            updatedAt == other.updatedAt &&
            webhookEventFailoverUrl == other.webhookEventFailoverUrl &&
            webhookEventUrl == other.webhookEventUrl &&
            webhookTimeoutSecs == other.webhookTimeoutSecs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            activeSessionId,
            createdAt,
            enableRecording,
            maxParticipants,
            recordType,
            sessions,
            uniqueName,
            updatedAt,
            webhookEventFailoverUrl,
            webhookEventUrl,
            webhookTimeoutSecs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Room{id=$id, activeSessionId=$activeSessionId, createdAt=$createdAt, enableRecording=$enableRecording, maxParticipants=$maxParticipants, recordType=$recordType, sessions=$sessions, uniqueName=$uniqueName, updatedAt=$updatedAt, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, webhookTimeoutSecs=$webhookTimeoutSecs, additionalProperties=$additionalProperties}"
}
