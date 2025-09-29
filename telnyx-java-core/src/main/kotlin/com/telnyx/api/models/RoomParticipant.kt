// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class RoomParticipant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val context: JsonField<String>,
    private val joinedAt: JsonField<OffsetDateTime>,
    private val leftAt: JsonField<OffsetDateTime>,
    private val recordType: JsonField<String>,
    private val sessionId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("context") @ExcludeMissing context: JsonField<String> = JsonMissing.of(),
        @JsonProperty("joined_at")
        @ExcludeMissing
        joinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("left_at")
        @ExcludeMissing
        leftAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, context, joinedAt, leftAt, recordType, sessionId, updatedAt, mutableMapOf())

    /**
     * A unique identifier for the room participant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Context provided to the given participant through the client SDK
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<String> = context.getOptional("context")

    /**
     * ISO 8601 timestamp when the participant joined the session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun joinedAt(): Optional<OffsetDateTime> = joinedAt.getOptional("joined_at")

    /**
     * ISO 8601 timestamp when the participant left the session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun leftAt(): Optional<OffsetDateTime> = leftAt.getOptional("left_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Identify the room session that participant is part of.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * ISO 8601 timestamp when the participant was updated.
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
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<String> = context

    /**
     * Returns the raw JSON value of [joinedAt].
     *
     * Unlike [joinedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("joined_at") @ExcludeMissing fun _joinedAt(): JsonField<OffsetDateTime> = joinedAt

    /**
     * Returns the raw JSON value of [leftAt].
     *
     * Unlike [leftAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("left_at") @ExcludeMissing fun _leftAt(): JsonField<OffsetDateTime> = leftAt

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

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

        /** Returns a mutable builder for constructing an instance of [RoomParticipant]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoomParticipant]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var context: JsonField<String> = JsonMissing.of()
        private var joinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var leftAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(roomParticipant: RoomParticipant) = apply {
            id = roomParticipant.id
            context = roomParticipant.context
            joinedAt = roomParticipant.joinedAt
            leftAt = roomParticipant.leftAt
            recordType = roomParticipant.recordType
            sessionId = roomParticipant.sessionId
            updatedAt = roomParticipant.updatedAt
            additionalProperties = roomParticipant.additionalProperties.toMutableMap()
        }

        /** A unique identifier for the room participant. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Context provided to the given participant through the client SDK */
        fun context(context: String) = context(JsonField.of(context))

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun context(context: JsonField<String>) = apply { this.context = context }

        /** ISO 8601 timestamp when the participant joined the session. */
        fun joinedAt(joinedAt: OffsetDateTime) = joinedAt(JsonField.of(joinedAt))

        /**
         * Sets [Builder.joinedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.joinedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun joinedAt(joinedAt: JsonField<OffsetDateTime>) = apply { this.joinedAt = joinedAt }

        /** ISO 8601 timestamp when the participant left the session. */
        fun leftAt(leftAt: OffsetDateTime) = leftAt(JsonField.of(leftAt))

        /**
         * Sets [Builder.leftAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leftAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun leftAt(leftAt: JsonField<OffsetDateTime>) = apply { this.leftAt = leftAt }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Identify the room session that participant is part of. */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** ISO 8601 timestamp when the participant was updated. */
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
         * Returns an immutable instance of [RoomParticipant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoomParticipant =
            RoomParticipant(
                id,
                context,
                joinedAt,
                leftAt,
                recordType,
                sessionId,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RoomParticipant = apply {
        if (validated) {
            return@apply
        }

        id()
        context()
        joinedAt()
        leftAt()
        recordType()
        sessionId()
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
            (if (context.asKnown().isPresent) 1 else 0) +
            (if (joinedAt.asKnown().isPresent) 1 else 0) +
            (if (leftAt.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoomParticipant &&
            id == other.id &&
            context == other.context &&
            joinedAt == other.joinedAt &&
            leftAt == other.leftAt &&
            recordType == other.recordType &&
            sessionId == other.sessionId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            context,
            joinedAt,
            leftAt,
            recordType,
            sessionId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoomParticipant{id=$id, context=$context, joinedAt=$joinedAt, leftAt=$leftAt, recordType=$recordType, sessionId=$sessionId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
