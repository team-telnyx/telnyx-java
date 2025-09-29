// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallRecordingSavedWebhookEvent
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
         * Returns a mutable builder for constructing an instance of
         * [CallRecordingSavedWebhookEvent].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallRecordingSavedWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callRecordingSavedWebhookEvent: CallRecordingSavedWebhookEvent) = apply {
            data = callRecordingSavedWebhookEvent.data
            additionalProperties =
                callRecordingSavedWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CallRecordingSavedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallRecordingSavedWebhookEvent =
            CallRecordingSavedWebhookEvent(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CallRecordingSavedWebhookEvent = apply {
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
        private val eventType: JsonField<EventType>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val payload: JsonField<Payload>,
        private val recordType: JsonField<RecordType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<EventType> = JsonMissing.of(),
            @JsonProperty("occurred_at")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
        ) : this(id, eventType, occurredAt, payload, recordType, mutableMapOf())

        /**
         * Identifies the type of resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The type of event being delivered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

        /**
         * ISO 8601 datetime of when the event occurred.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun occurredAt(): Optional<OffsetDateTime> = occurredAt.getOptional("occurred_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payload(): Optional<Payload> = payload.getOptional("payload")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        /**
         * Returns the raw JSON value of [occurredAt].
         *
         * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occurred_at")
        @ExcludeMissing
        fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

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
            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var occurredAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var payload: JsonField<Payload> = JsonMissing.of()
            private var recordType: JsonField<RecordType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                eventType = data.eventType
                occurredAt = data.occurredAt
                payload = data.payload
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the type of resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The type of event being delivered. */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /** ISO 8601 datetime of when the event occurred. */
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

            fun payload(payload: Payload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

            /** Identifies the type of the resource. */
            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
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
                    eventType,
                    occurredAt,
                    payload,
                    recordType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            eventType().ifPresent { it.validate() }
            occurredAt()
            payload().ifPresent { it.validate() }
            recordType().ifPresent { it.validate() }
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
                (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (occurredAt.asKnown().isPresent) 1 else 0) +
                (payload.asKnown().getOrNull()?.validity() ?: 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of event being delivered. */
        class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val CALL_RECORDING_SAVED = of("call.recording.saved")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                CALL_RECORDING_SAVED
            }

            /**
             * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EventType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CALL_RECORDING_SAVED,
                /**
                 * An enum member indicating that [EventType] was instantiated with an unknown
                 * value.
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
                    CALL_RECORDING_SAVED -> Value.CALL_RECORDING_SAVED
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
                    CALL_RECORDING_SAVED -> Known.CALL_RECORDING_SAVED
                    else -> throw TelnyxInvalidDataException("Unknown EventType: $value")
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

            fun validate(): EventType = apply {
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

                return other is EventType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val callLegId: JsonField<String>,
            private val callSessionId: JsonField<String>,
            private val channels: JsonField<Channels>,
            private val clientState: JsonField<String>,
            private val connectionId: JsonField<String>,
            private val publicRecordingUrls: JsonField<PublicRecordingUrls>,
            private val recordingEndedAt: JsonField<OffsetDateTime>,
            private val recordingStartedAt: JsonField<OffsetDateTime>,
            private val recordingUrls: JsonField<RecordingUrls>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("call_leg_id")
                @ExcludeMissing
                callLegId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("call_session_id")
                @ExcludeMissing
                callSessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("channels")
                @ExcludeMissing
                channels: JsonField<Channels> = JsonMissing.of(),
                @JsonProperty("client_state")
                @ExcludeMissing
                clientState: JsonField<String> = JsonMissing.of(),
                @JsonProperty("connection_id")
                @ExcludeMissing
                connectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("public_recording_urls")
                @ExcludeMissing
                publicRecordingUrls: JsonField<PublicRecordingUrls> = JsonMissing.of(),
                @JsonProperty("recording_ended_at")
                @ExcludeMissing
                recordingEndedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("recording_started_at")
                @ExcludeMissing
                recordingStartedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("recording_urls")
                @ExcludeMissing
                recordingUrls: JsonField<RecordingUrls> = JsonMissing.of(),
            ) : this(
                callLegId,
                callSessionId,
                channels,
                clientState,
                connectionId,
                publicRecordingUrls,
                recordingEndedAt,
                recordingStartedAt,
                recordingUrls,
                mutableMapOf(),
            )

            /**
             * ID that is unique to the call and can be used to correlate webhook events.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callLegId(): Optional<String> = callLegId.getOptional("call_leg_id")

            /**
             * ID that is unique to the call session and can be used to correlate webhook events.
             * Call session is a group of related call legs that logically belong to the same phone
             * call, e.g. an inbound and outbound leg of a transferred call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callSessionId(): Optional<String> = callSessionId.getOptional("call_session_id")

            /**
             * Whether recording was recorded in `single` or `dual` channel.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun channels(): Optional<Channels> = channels.getOptional("channels")

            /**
             * State received from a command.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clientState(): Optional<String> = clientState.getOptional("client_state")

            /**
             * Call Control App ID (formerly Telnyx connection ID) used in the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

            /**
             * Recording URLs in requested format. The URL is valid for as long as the file exists.
             * For security purposes, this feature is activated on a per request basis. Please
             * contact customer support with your Account ID to request activation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun publicRecordingUrls(): Optional<PublicRecordingUrls> =
                publicRecordingUrls.getOptional("public_recording_urls")

            /**
             * ISO 8601 datetime of when recording ended.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingEndedAt(): Optional<OffsetDateTime> =
                recordingEndedAt.getOptional("recording_ended_at")

            /**
             * ISO 8601 datetime of when recording started.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStartedAt(): Optional<OffsetDateTime> =
                recordingStartedAt.getOptional("recording_started_at")

            /**
             * Recording URLs in requested format. These URLs are valid for 10 minutes. After 10
             * minutes, you may retrieve recordings via API using Reports -> Call Recordings
             * documentation, or via Mission Control under Reporting -> Recordings.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingUrls(): Optional<RecordingUrls> =
                recordingUrls.getOptional("recording_urls")

            /**
             * Returns the raw JSON value of [callLegId].
             *
             * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("call_leg_id")
            @ExcludeMissing
            fun _callLegId(): JsonField<String> = callLegId

            /**
             * Returns the raw JSON value of [callSessionId].
             *
             * Unlike [callSessionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("call_session_id")
            @ExcludeMissing
            fun _callSessionId(): JsonField<String> = callSessionId

            /**
             * Returns the raw JSON value of [channels].
             *
             * Unlike [channels], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("channels")
            @ExcludeMissing
            fun _channels(): JsonField<Channels> = channels

            /**
             * Returns the raw JSON value of [clientState].
             *
             * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("client_state")
            @ExcludeMissing
            fun _clientState(): JsonField<String> = clientState

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
             * Returns the raw JSON value of [publicRecordingUrls].
             *
             * Unlike [publicRecordingUrls], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("public_recording_urls")
            @ExcludeMissing
            fun _publicRecordingUrls(): JsonField<PublicRecordingUrls> = publicRecordingUrls

            /**
             * Returns the raw JSON value of [recordingEndedAt].
             *
             * Unlike [recordingEndedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recording_ended_at")
            @ExcludeMissing
            fun _recordingEndedAt(): JsonField<OffsetDateTime> = recordingEndedAt

            /**
             * Returns the raw JSON value of [recordingStartedAt].
             *
             * Unlike [recordingStartedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recording_started_at")
            @ExcludeMissing
            fun _recordingStartedAt(): JsonField<OffsetDateTime> = recordingStartedAt

            /**
             * Returns the raw JSON value of [recordingUrls].
             *
             * Unlike [recordingUrls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recording_urls")
            @ExcludeMissing
            fun _recordingUrls(): JsonField<RecordingUrls> = recordingUrls

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

                /** Returns a mutable builder for constructing an instance of [Payload]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Payload]. */
            class Builder internal constructor() {

                private var callLegId: JsonField<String> = JsonMissing.of()
                private var callSessionId: JsonField<String> = JsonMissing.of()
                private var channels: JsonField<Channels> = JsonMissing.of()
                private var clientState: JsonField<String> = JsonMissing.of()
                private var connectionId: JsonField<String> = JsonMissing.of()
                private var publicRecordingUrls: JsonField<PublicRecordingUrls> = JsonMissing.of()
                private var recordingEndedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var recordingStartedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var recordingUrls: JsonField<RecordingUrls> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    callLegId = payload.callLegId
                    callSessionId = payload.callSessionId
                    channels = payload.channels
                    clientState = payload.clientState
                    connectionId = payload.connectionId
                    publicRecordingUrls = payload.publicRecordingUrls
                    recordingEndedAt = payload.recordingEndedAt
                    recordingStartedAt = payload.recordingStartedAt
                    recordingUrls = payload.recordingUrls
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** ID that is unique to the call and can be used to correlate webhook events. */
                fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

                /**
                 * Sets [Builder.callLegId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callLegId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

                /**
                 * ID that is unique to the call session and can be used to correlate webhook
                 * events. Call session is a group of related call legs that logically belong to the
                 * same phone call, e.g. an inbound and outbound leg of a transferred call.
                 */
                fun callSessionId(callSessionId: String) =
                    callSessionId(JsonField.of(callSessionId))

                /**
                 * Sets [Builder.callSessionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callSessionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callSessionId(callSessionId: JsonField<String>) = apply {
                    this.callSessionId = callSessionId
                }

                /** Whether recording was recorded in `single` or `dual` channel. */
                fun channels(channels: Channels) = channels(JsonField.of(channels))

                /**
                 * Sets [Builder.channels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.channels] with a well-typed [Channels] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun channels(channels: JsonField<Channels>) = apply { this.channels = channels }

                /** State received from a command. */
                fun clientState(clientState: String) = clientState(JsonField.of(clientState))

                /**
                 * Sets [Builder.clientState] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientState] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clientState(clientState: JsonField<String>) = apply {
                    this.clientState = clientState
                }

                /** Call Control App ID (formerly Telnyx connection ID) used in the call. */
                fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

                /**
                 * Sets [Builder.connectionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connectionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun connectionId(connectionId: JsonField<String>) = apply {
                    this.connectionId = connectionId
                }

                /**
                 * Recording URLs in requested format. The URL is valid for as long as the file
                 * exists. For security purposes, this feature is activated on a per request basis.
                 * Please contact customer support with your Account ID to request activation.
                 */
                fun publicRecordingUrls(publicRecordingUrls: PublicRecordingUrls) =
                    publicRecordingUrls(JsonField.of(publicRecordingUrls))

                /**
                 * Sets [Builder.publicRecordingUrls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.publicRecordingUrls] with a well-typed
                 * [PublicRecordingUrls] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun publicRecordingUrls(publicRecordingUrls: JsonField<PublicRecordingUrls>) =
                    apply {
                        this.publicRecordingUrls = publicRecordingUrls
                    }

                /** ISO 8601 datetime of when recording ended. */
                fun recordingEndedAt(recordingEndedAt: OffsetDateTime) =
                    recordingEndedAt(JsonField.of(recordingEndedAt))

                /**
                 * Sets [Builder.recordingEndedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingEndedAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun recordingEndedAt(recordingEndedAt: JsonField<OffsetDateTime>) = apply {
                    this.recordingEndedAt = recordingEndedAt
                }

                /** ISO 8601 datetime of when recording started. */
                fun recordingStartedAt(recordingStartedAt: OffsetDateTime) =
                    recordingStartedAt(JsonField.of(recordingStartedAt))

                /**
                 * Sets [Builder.recordingStartedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStartedAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun recordingStartedAt(recordingStartedAt: JsonField<OffsetDateTime>) = apply {
                    this.recordingStartedAt = recordingStartedAt
                }

                /**
                 * Recording URLs in requested format. These URLs are valid for 10 minutes. After 10
                 * minutes, you may retrieve recordings via API using Reports -> Call Recordings
                 * documentation, or via Mission Control under Reporting -> Recordings.
                 */
                fun recordingUrls(recordingUrls: RecordingUrls) =
                    recordingUrls(JsonField.of(recordingUrls))

                /**
                 * Sets [Builder.recordingUrls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingUrls] with a well-typed [RecordingUrls]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun recordingUrls(recordingUrls: JsonField<RecordingUrls>) = apply {
                    this.recordingUrls = recordingUrls
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Payload].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Payload =
                    Payload(
                        callLegId,
                        callSessionId,
                        channels,
                        clientState,
                        connectionId,
                        publicRecordingUrls,
                        recordingEndedAt,
                        recordingStartedAt,
                        recordingUrls,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                callLegId()
                callSessionId()
                channels().ifPresent { it.validate() }
                clientState()
                connectionId()
                publicRecordingUrls().ifPresent { it.validate() }
                recordingEndedAt()
                recordingStartedAt()
                recordingUrls().ifPresent { it.validate() }
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
                (if (callLegId.asKnown().isPresent) 1 else 0) +
                    (if (callSessionId.asKnown().isPresent) 1 else 0) +
                    (channels.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (clientState.asKnown().isPresent) 1 else 0) +
                    (if (connectionId.asKnown().isPresent) 1 else 0) +
                    (publicRecordingUrls.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (recordingEndedAt.asKnown().isPresent) 1 else 0) +
                    (if (recordingStartedAt.asKnown().isPresent) 1 else 0) +
                    (recordingUrls.asKnown().getOrNull()?.validity() ?: 0)

            /** Whether recording was recorded in `single` or `dual` channel. */
            class Channels @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SINGLE = of("single")

                    @JvmField val DUAL = of("dual")

                    @JvmStatic fun of(value: String) = Channels(JsonField.of(value))
                }

                /** An enum containing [Channels]'s known values. */
                enum class Known {
                    SINGLE,
                    DUAL,
                }

                /**
                 * An enum containing [Channels]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Channels] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SINGLE,
                    DUAL,
                    /**
                     * An enum member indicating that [Channels] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SINGLE -> Value.SINGLE
                        DUAL -> Value.DUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SINGLE -> Known.SINGLE
                        DUAL -> Known.DUAL
                        else -> throw TelnyxInvalidDataException("Unknown Channels: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Channels = apply {
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

                    return other is Channels && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Recording URLs in requested format. The URL is valid for as long as the file exists.
             * For security purposes, this feature is activated on a per request basis. Please
             * contact customer support with your Account ID to request activation.
             */
            class PublicRecordingUrls
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val mp3: JsonField<String>,
                private val wav: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("mp3") @ExcludeMissing mp3: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("wav") @ExcludeMissing wav: JsonField<String> = JsonMissing.of(),
                ) : this(mp3, wav, mutableMapOf())

                /**
                 * Recording URL in requested `mp3` format.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mp3(): Optional<String> = mp3.getOptional("mp3")

                /**
                 * Recording URL in requested `wav` format.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun wav(): Optional<String> = wav.getOptional("wav")

                /**
                 * Returns the raw JSON value of [mp3].
                 *
                 * Unlike [mp3], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("mp3") @ExcludeMissing fun _mp3(): JsonField<String> = mp3

                /**
                 * Returns the raw JSON value of [wav].
                 *
                 * Unlike [wav], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("wav") @ExcludeMissing fun _wav(): JsonField<String> = wav

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
                     * [PublicRecordingUrls].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PublicRecordingUrls]. */
                class Builder internal constructor() {

                    private var mp3: JsonField<String> = JsonMissing.of()
                    private var wav: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(publicRecordingUrls: PublicRecordingUrls) = apply {
                        mp3 = publicRecordingUrls.mp3
                        wav = publicRecordingUrls.wav
                        additionalProperties =
                            publicRecordingUrls.additionalProperties.toMutableMap()
                    }

                    /** Recording URL in requested `mp3` format. */
                    fun mp3(mp3: String?) = mp3(JsonField.ofNullable(mp3))

                    /** Alias for calling [Builder.mp3] with `mp3.orElse(null)`. */
                    fun mp3(mp3: Optional<String>) = mp3(mp3.getOrNull())

                    /**
                     * Sets [Builder.mp3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mp3] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun mp3(mp3: JsonField<String>) = apply { this.mp3 = mp3 }

                    /** Recording URL in requested `wav` format. */
                    fun wav(wav: String?) = wav(JsonField.ofNullable(wav))

                    /** Alias for calling [Builder.wav] with `wav.orElse(null)`. */
                    fun wav(wav: Optional<String>) = wav(wav.getOrNull())

                    /**
                     * Sets [Builder.wav] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.wav] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun wav(wav: JsonField<String>) = apply { this.wav = wav }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PublicRecordingUrls].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PublicRecordingUrls =
                        PublicRecordingUrls(mp3, wav, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): PublicRecordingUrls = apply {
                    if (validated) {
                        return@apply
                    }

                    mp3()
                    wav()
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
                    (if (mp3.asKnown().isPresent) 1 else 0) +
                        (if (wav.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PublicRecordingUrls &&
                        mp3 == other.mp3 &&
                        wav == other.wav &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(mp3, wav, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PublicRecordingUrls{mp3=$mp3, wav=$wav, additionalProperties=$additionalProperties}"
            }

            /**
             * Recording URLs in requested format. These URLs are valid for 10 minutes. After 10
             * minutes, you may retrieve recordings via API using Reports -> Call Recordings
             * documentation, or via Mission Control under Reporting -> Recordings.
             */
            class RecordingUrls
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val mp3: JsonField<String>,
                private val wav: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("mp3") @ExcludeMissing mp3: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("wav") @ExcludeMissing wav: JsonField<String> = JsonMissing.of(),
                ) : this(mp3, wav, mutableMapOf())

                /**
                 * Recording URL in requested `mp3` format.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mp3(): Optional<String> = mp3.getOptional("mp3")

                /**
                 * Recording URL in requested `wav` format.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun wav(): Optional<String> = wav.getOptional("wav")

                /**
                 * Returns the raw JSON value of [mp3].
                 *
                 * Unlike [mp3], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("mp3") @ExcludeMissing fun _mp3(): JsonField<String> = mp3

                /**
                 * Returns the raw JSON value of [wav].
                 *
                 * Unlike [wav], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("wav") @ExcludeMissing fun _wav(): JsonField<String> = wav

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
                     * Returns a mutable builder for constructing an instance of [RecordingUrls].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecordingUrls]. */
                class Builder internal constructor() {

                    private var mp3: JsonField<String> = JsonMissing.of()
                    private var wav: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recordingUrls: RecordingUrls) = apply {
                        mp3 = recordingUrls.mp3
                        wav = recordingUrls.wav
                        additionalProperties = recordingUrls.additionalProperties.toMutableMap()
                    }

                    /** Recording URL in requested `mp3` format. */
                    fun mp3(mp3: String?) = mp3(JsonField.ofNullable(mp3))

                    /** Alias for calling [Builder.mp3] with `mp3.orElse(null)`. */
                    fun mp3(mp3: Optional<String>) = mp3(mp3.getOrNull())

                    /**
                     * Sets [Builder.mp3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mp3] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun mp3(mp3: JsonField<String>) = apply { this.mp3 = mp3 }

                    /** Recording URL in requested `wav` format. */
                    fun wav(wav: String?) = wav(JsonField.ofNullable(wav))

                    /** Alias for calling [Builder.wav] with `wav.orElse(null)`. */
                    fun wav(wav: Optional<String>) = wav(wav.getOrNull())

                    /**
                     * Sets [Builder.wav] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.wav] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun wav(wav: JsonField<String>) = apply { this.wav = wav }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [RecordingUrls].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RecordingUrls =
                        RecordingUrls(mp3, wav, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): RecordingUrls = apply {
                    if (validated) {
                        return@apply
                    }

                    mp3()
                    wav()
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
                    (if (mp3.asKnown().isPresent) 1 else 0) +
                        (if (wav.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingUrls &&
                        mp3 == other.mp3 &&
                        wav == other.wav &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(mp3, wav, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecordingUrls{mp3=$mp3, wav=$wav, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    callLegId == other.callLegId &&
                    callSessionId == other.callSessionId &&
                    channels == other.channels &&
                    clientState == other.clientState &&
                    connectionId == other.connectionId &&
                    publicRecordingUrls == other.publicRecordingUrls &&
                    recordingEndedAt == other.recordingEndedAt &&
                    recordingStartedAt == other.recordingStartedAt &&
                    recordingUrls == other.recordingUrls &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    callLegId,
                    callSessionId,
                    channels,
                    clientState,
                    connectionId,
                    publicRecordingUrls,
                    recordingEndedAt,
                    recordingStartedAt,
                    recordingUrls,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{callLegId=$callLegId, callSessionId=$callSessionId, channels=$channels, clientState=$clientState, connectionId=$connectionId, publicRecordingUrls=$publicRecordingUrls, recordingEndedAt=$recordingEndedAt, recordingStartedAt=$recordingStartedAt, recordingUrls=$recordingUrls, additionalProperties=$additionalProperties}"
        }

        /** Identifies the type of the resource. */
        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val EVENT = of("event")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                EVENT
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EVENT,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
                 * value.
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
                    EVENT -> Value.EVENT
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
                    EVENT -> Known.EVENT
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            fun validate(): RecordType = apply {
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

                return other is RecordType && value == other.value
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
                eventType == other.eventType &&
                occurredAt == other.occurredAt &&
                payload == other.payload &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, eventType, occurredAt, payload, recordType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, eventType=$eventType, occurredAt=$occurredAt, payload=$payload, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallRecordingSavedWebhookEvent &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallRecordingSavedWebhookEvent{data=$data, additionalProperties=$additionalProperties}"
}
