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
import kotlin.jvm.optionals.getOrNull

class RecordingExportedWebhookEvent
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
         * [RecordingExportedWebhookEvent].
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

    /** A builder for [RecordingExportedWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var event: JsonField<Event>? = null
        private var occurredAt: JsonField<OffsetDateTime>? = null
        private var version: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recordingExportedWebhookEvent: RecordingExportedWebhookEvent) = apply {
            id = recordingExportedWebhookEvent.id
            data = recordingExportedWebhookEvent.data
            event = recordingExportedWebhookEvent.event
            occurredAt = recordingExportedWebhookEvent.occurredAt
            version = recordingExportedWebhookEvent.version
            additionalProperties = recordingExportedWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [RecordingExportedWebhookEvent].
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
        fun build(): RecordingExportedWebhookEvent =
            RecordingExportedWebhookEvent(
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
    fun validate(): RecordingExportedWebhookEvent = apply {
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bucket: JsonField<String>,
        private val bytes: JsonField<Long>,
        private val key: JsonField<String>,
        private val region: JsonField<String>,
        private val sessionId: JsonField<String>,
        private val sha256: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bucket") @ExcludeMissing bucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bytes") @ExcludeMissing bytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sha256") @ExcludeMissing sha256: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(bucket, bytes, key, region, sessionId, sha256, type, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bucket(): String = bucket.getRequired("bucket")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bytes(): Long = bytes.getRequired("bytes")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sessionId(): String = sessionId.getRequired("session_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sha256(): String = sha256.getRequired("sha256")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("video")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [bucket].
         *
         * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

        /**
         * Returns the raw JSON value of [bytes].
         *
         * Unlike [bytes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bytes") @ExcludeMissing fun _bytes(): JsonField<Long> = bytes

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

        /**
         * Returns the raw JSON value of [sha256].
         *
         * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

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
             * .bucket()
             * .bytes()
             * .key()
             * .region()
             * .sessionId()
             * .sha256()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var bucket: JsonField<String>? = null
            private var bytes: JsonField<Long>? = null
            private var key: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var sessionId: JsonField<String>? = null
            private var sha256: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("video")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                bucket = data.bucket
                bytes = data.bytes
                key = data.key
                region = data.region
                sessionId = data.sessionId
                sha256 = data.sha256
                type = data.type
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun bucket(bucket: String) = bucket(JsonField.of(bucket))

            /**
             * Sets [Builder.bucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucket] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

            fun bytes(bytes: Long) = bytes(JsonField.of(bytes))

            /**
             * Sets [Builder.bytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bytes] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bytes(bytes: JsonField<Long>) = apply { this.bytes = bytes }

            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun sha256(sha256: String) = sha256(JsonField.of(sha256))

            /**
             * Sets [Builder.sha256] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sha256] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("video")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

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
             * .bucket()
             * .bytes()
             * .key()
             * .region()
             * .sessionId()
             * .sha256()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("bucket", bucket),
                    checkRequired("bytes", bytes),
                    checkRequired("key", key),
                    checkRequired("region", region),
                    checkRequired("sessionId", sessionId),
                    checkRequired("sha256", sha256),
                    type,
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

            bucket()
            bytes()
            key()
            region()
            sessionId()
            sha256()
            _type().let {
                if (it != JsonValue.from("video")) {
                    throw TelnyxInvalidDataException("'type' is invalid, received $it")
                }
            }
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
            (if (bucket.asKnown().isPresent) 1 else 0) +
                (if (bytes.asKnown().isPresent) 1 else 0) +
                (if (key.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (if (sha256.asKnown().isPresent) 1 else 0) +
                type.let { if (it == JsonValue.from("video")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                bucket == other.bucket &&
                bytes == other.bytes &&
                key == other.key &&
                region == other.region &&
                sessionId == other.sessionId &&
                sha256 == other.sha256 &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bucket, bytes, key, region, sessionId, sha256, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{bucket=$bucket, bytes=$bytes, key=$key, region=$region, sessionId=$sessionId, sha256=$sha256, type=$type, additionalProperties=$additionalProperties}"
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

            @JvmField val RECORDING_EXPORTED = of("recording.exported")

            @JvmStatic fun of(value: String) = Event(JsonField.of(value))
        }

        /** An enum containing [Event]'s known values. */
        enum class Known {
            RECORDING_EXPORTED
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
            RECORDING_EXPORTED,
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
                RECORDING_EXPORTED -> Value.RECORDING_EXPORTED
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
                RECORDING_EXPORTED -> Known.RECORDING_EXPORTED
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

        return other is RecordingExportedWebhookEvent &&
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
        "RecordingExportedWebhookEvent{id=$id, data=$data, event=$event, occurredAt=$occurredAt, version=$version, additionalProperties=$additionalProperties}"
}
