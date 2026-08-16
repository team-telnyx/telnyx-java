// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptCompletedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val data: JsonField<Data>,
    private val event: JsonField<Event>,
    private val occurredAt: JsonField<OffsetDateTime>,
    private val version: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("event") @ExcludeMissing event: JsonField<Event> = JsonMissing.of(),
        @JsonProperty("occurred_at")
        @ExcludeMissing
        occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
    ) : this(id, data, event, occurredAt, version, mutableMapOf())

    /**
     * Unique event id; deduplicate deliveries on it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Finalized transcript details.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Event type.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun event(): Event = event.getRequired("event")

    /**
     * When the event occurred.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurred_at")

    /**
     * Envelope version.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): String = version.getRequired("version")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<Event> = event

    /**
     * Returns the raw JSON value of [occurredAt].
     *
     * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occurred_at")
    @ExcludeMissing
    fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
         * [TranscriptCompletedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .data()
         * .event()
         * .occurredAt()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptCompletedWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var event: JsonField<Event>? = null
        private var occurredAt: JsonField<OffsetDateTime>? = null
        private var version: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptCompletedWebhookEvent: TranscriptCompletedWebhookEvent) =
            apply {
                id = transcriptCompletedWebhookEvent.id
                data = transcriptCompletedWebhookEvent.data
                event = transcriptCompletedWebhookEvent.event
                occurredAt = transcriptCompletedWebhookEvent.occurredAt
                version = transcriptCompletedWebhookEvent.version
                additionalProperties =
                    transcriptCompletedWebhookEvent.additionalProperties.toMutableMap()
            }

        /** Unique event id; deduplicate deliveries on it. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Finalized transcript details. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Event type. */
        fun event(event: Event) = event(JsonField.of(event))

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [Event] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun event(event: JsonField<Event>) = apply { this.event = event }

        /** When the event occurred. */
        fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

        /**
         * Sets [Builder.occurredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
            this.occurredAt = occurredAt
        }

        /** Envelope version. */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

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
         * Returns an immutable instance of [TranscriptCompletedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .data()
         * .event()
         * .occurredAt()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptCompletedWebhookEvent =
            TranscriptCompletedWebhookEvent(
                checkRequired("id", id),
                checkRequired("data", data),
                checkRequired("event", event),
                checkRequired("occurredAt", occurredAt),
                checkRequired("version", version),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TranscriptCompletedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        data().validate()
        event().validate()
        occurredAt()
        version()
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
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (event.asKnown().getOrNull()?.validity() ?: 0) +
            (if (occurredAt.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /** Finalized transcript details. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endedAt: JsonField<OffsetDateTime>,
        private val lastSeq: JsonField<Long>,
        private val segmentCount: JsonField<Long>,
        private val sessionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ended_at")
            @ExcludeMissing
            endedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("last_seq") @ExcludeMissing lastSeq: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("segment_count")
            @ExcludeMissing
            segmentCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
        ) : this(endedAt, lastSeq, segmentCount, sessionId, mutableMapOf())

        /**
         * Session end time, or null when unavailable.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endedAt(): Optional<OffsetDateTime> = endedAt.getOptional("ended_at")

        /**
         * Last transcript segment sequence number, or null for an empty transcript.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastSeq(): Optional<Long> = lastSeq.getOptional("last_seq")

        /**
         * Number of transcript segments observed during finalization.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun segmentCount(): Long = segmentCount.getRequired("segment_count")

        /**
         * The meeting session this event belongs to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sessionId(): String = sessionId.getRequired("session_id")

        /**
         * Returns the raw JSON value of [endedAt].
         *
         * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ended_at")
        @ExcludeMissing
        fun _endedAt(): JsonField<OffsetDateTime> = endedAt

        /**
         * Returns the raw JSON value of [lastSeq].
         *
         * Unlike [lastSeq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_seq") @ExcludeMissing fun _lastSeq(): JsonField<Long> = lastSeq

        /**
         * Returns the raw JSON value of [segmentCount].
         *
         * Unlike [segmentCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("segment_count")
        @ExcludeMissing
        fun _segmentCount(): JsonField<Long> = segmentCount

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .endedAt()
             * .lastSeq()
             * .segmentCount()
             * .sessionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var endedAt: JsonField<OffsetDateTime>? = null
            private var lastSeq: JsonField<Long>? = null
            private var segmentCount: JsonField<Long>? = null
            private var sessionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                endedAt = data.endedAt
                lastSeq = data.lastSeq
                segmentCount = data.segmentCount
                sessionId = data.sessionId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Session end time, or null when unavailable. */
            fun endedAt(endedAt: OffsetDateTime?) = endedAt(JsonField.ofNullable(endedAt))

            /** Alias for calling [Builder.endedAt] with `endedAt.orElse(null)`. */
            fun endedAt(endedAt: Optional<OffsetDateTime>) = endedAt(endedAt.getOrNull())

            /**
             * Sets [Builder.endedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endedAt(endedAt: JsonField<OffsetDateTime>) = apply { this.endedAt = endedAt }

            /** Last transcript segment sequence number, or null for an empty transcript. */
            fun lastSeq(lastSeq: Long?) = lastSeq(JsonField.ofNullable(lastSeq))

            /**
             * Alias for [Builder.lastSeq].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lastSeq(lastSeq: Long) = lastSeq(lastSeq as Long?)

            /** Alias for calling [Builder.lastSeq] with `lastSeq.orElse(null)`. */
            fun lastSeq(lastSeq: Optional<Long>) = lastSeq(lastSeq.getOrNull())

            /**
             * Sets [Builder.lastSeq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastSeq] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastSeq(lastSeq: JsonField<Long>) = apply { this.lastSeq = lastSeq }

            /** Number of transcript segments observed during finalization. */
            fun segmentCount(segmentCount: Long) = segmentCount(JsonField.of(segmentCount))

            /**
             * Sets [Builder.segmentCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segmentCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segmentCount(segmentCount: JsonField<Long>) = apply {
                this.segmentCount = segmentCount
            }

            /** The meeting session this event belongs to. */
            fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

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
             *
             * The following fields are required:
             * ```java
             * .endedAt()
             * .lastSeq()
             * .segmentCount()
             * .sessionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("endedAt", endedAt),
                    checkRequired("lastSeq", lastSeq),
                    checkRequired("segmentCount", segmentCount),
                    checkRequired("sessionId", sessionId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            endedAt()
            lastSeq()
            segmentCount()
            sessionId()
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
            (if (endedAt.asKnown().isPresent) 1 else 0) +
                (if (lastSeq.asKnown().isPresent) 1 else 0) +
                (if (segmentCount.asKnown().isPresent) 1 else 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                endedAt == other.endedAt &&
                lastSeq == other.lastSeq &&
                segmentCount == other.segmentCount &&
                sessionId == other.sessionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endedAt, lastSeq, segmentCount, sessionId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{endedAt=$endedAt, lastSeq=$lastSeq, segmentCount=$segmentCount, sessionId=$sessionId, additionalProperties=$additionalProperties}"
    }

    /** Event type. */
    class Event @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TRANSCRIPT_COMPLETED = of("transcript.completed")

            @JvmStatic fun of(value: String) = Event(JsonField.of(value))
        }

        /** An enum containing [Event]'s known values. */
        enum class Known {
            TRANSCRIPT_COMPLETED
        }

        /**
         * An enum containing [Event]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Event] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRANSCRIPT_COMPLETED,
            /** An enum member indicating that [Event] was instantiated with an unknown value. */
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
                TRANSCRIPT_COMPLETED -> Value.TRANSCRIPT_COMPLETED
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
                TRANSCRIPT_COMPLETED -> Known.TRANSCRIPT_COMPLETED
                else -> throw TelnyxInvalidDataException("Unknown Event: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Event = apply {
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

            return other is Event && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptCompletedWebhookEvent &&
            id == other.id &&
            data == other.data &&
            event == other.event &&
            occurredAt == other.occurredAt &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, data, event, occurredAt, version, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptCompletedWebhookEvent{id=$id, data=$data, event=$event, occurredAt=$occurredAt, version=$version, additionalProperties=$additionalProperties}"
}
