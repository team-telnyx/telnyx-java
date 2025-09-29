// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms

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
import com.telnyx.api.models.RoomParticipant
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RoomSession
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val endedAt: JsonField<OffsetDateTime>,
    private val participants: JsonField<List<RoomParticipant>>,
    private val recordType: JsonField<String>,
    private val roomId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ended_at")
        @ExcludeMissing
        endedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("participants")
        @ExcludeMissing
        participants: JsonField<List<RoomParticipant>> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("room_id") @ExcludeMissing roomId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        active,
        createdAt,
        endedAt,
        participants,
        recordType,
        roomId,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * A unique identifier for the room session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Shows if the room session is active or not.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Optional<Boolean> = active.getOptional("active")

    /**
     * ISO 8601 timestamp when the room session was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * ISO 8601 timestamp when the room session has ended.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endedAt(): Optional<OffsetDateTime> = endedAt.getOptional("ended_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<List<RoomParticipant>> = participants.getOptional("participants")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Identify the room hosting that room session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roomId(): Optional<String> = roomId.getOptional("room_id")

    /**
     * ISO 8601 timestamp when the room session was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

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
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [endedAt].
     *
     * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ended_at") @ExcludeMissing fun _endedAt(): JsonField<OffsetDateTime> = endedAt

    /**
     * Returns the raw JSON value of [participants].
     *
     * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participants")
    @ExcludeMissing
    fun _participants(): JsonField<List<RoomParticipant>> = participants

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [roomId].
     *
     * Unlike [roomId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("room_id") @ExcludeMissing fun _roomId(): JsonField<String> = roomId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [RoomSession]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoomSession]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var participants: JsonField<MutableList<RoomParticipant>>? = null
        private var recordType: JsonField<String> = JsonMissing.of()
        private var roomId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(roomSession: RoomSession) = apply {
            id = roomSession.id
            active = roomSession.active
            createdAt = roomSession.createdAt
            endedAt = roomSession.endedAt
            participants = roomSession.participants.map { it.toMutableList() }
            recordType = roomSession.recordType
            roomId = roomSession.roomId
            updatedAt = roomSession.updatedAt
            additionalProperties = roomSession.additionalProperties.toMutableMap()
        }

        /** A unique identifier for the room session. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Shows if the room session is active or not. */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /** ISO 8601 timestamp when the room session was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** ISO 8601 timestamp when the room session has ended. */
        fun endedAt(endedAt: OffsetDateTime) = endedAt(JsonField.of(endedAt))

        /**
         * Sets [Builder.endedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endedAt(endedAt: JsonField<OffsetDateTime>) = apply { this.endedAt = endedAt }

        fun participants(participants: List<RoomParticipant>) =
            participants(JsonField.of(participants))

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed `List<RoomParticipant>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun participants(participants: JsonField<List<RoomParticipant>>) = apply {
            this.participants = participants.map { it.toMutableList() }
        }

        /**
         * Adds a single [RoomParticipant] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: RoomParticipant) = apply {
            participants =
                (participants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("participants", it).add(participant)
                }
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

        /** Identify the room hosting that room session. */
        fun roomId(roomId: String) = roomId(JsonField.of(roomId))

        /**
         * Sets [Builder.roomId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roomId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roomId(roomId: JsonField<String>) = apply { this.roomId = roomId }

        /** ISO 8601 timestamp when the room session was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [RoomSession].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoomSession =
            RoomSession(
                id,
                active,
                createdAt,
                endedAt,
                (participants ?: JsonMissing.of()).map { it.toImmutable() },
                recordType,
                roomId,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RoomSession = apply {
        if (validated) {
            return@apply
        }

        id()
        active()
        createdAt()
        endedAt()
        participants().ifPresent { it.forEach { it.validate() } }
        recordType()
        roomId()
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
            (if (active.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (endedAt.asKnown().isPresent) 1 else 0) +
            (participants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (roomId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoomSession &&
            id == other.id &&
            active == other.active &&
            createdAt == other.createdAt &&
            endedAt == other.endedAt &&
            participants == other.participants &&
            recordType == other.recordType &&
            roomId == other.roomId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            active,
            createdAt,
            endedAt,
            participants,
            recordType,
            roomId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoomSession{id=$id, active=$active, createdAt=$createdAt, endedAt=$endedAt, participants=$participants, recordType=$recordType, roomId=$roomId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
