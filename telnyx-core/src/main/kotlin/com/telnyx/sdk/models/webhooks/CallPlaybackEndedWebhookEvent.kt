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
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallPlaybackEndedWebhookEvent
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
         * [CallPlaybackEndedWebhookEvent].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallPlaybackEndedWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callPlaybackEndedWebhookEvent: CallPlaybackEndedWebhookEvent) = apply {
            data = callPlaybackEndedWebhookEvent.data
            additionalProperties = callPlaybackEndedWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CallPlaybackEndedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallPlaybackEndedWebhookEvent =
            CallPlaybackEndedWebhookEvent(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CallPlaybackEndedWebhookEvent = apply {
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

                @JvmField val CALL_PLAYBACK_ENDED = of("call.playback.ended")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                CALL_PLAYBACK_ENDED
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
                CALL_PLAYBACK_ENDED,
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
                    CALL_PLAYBACK_ENDED -> Value.CALL_PLAYBACK_ENDED
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
                    CALL_PLAYBACK_ENDED -> Known.CALL_PLAYBACK_ENDED
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
            private val callControlId: JsonField<String>,
            private val callLegId: JsonField<String>,
            private val callSessionId: JsonField<String>,
            private val clientState: JsonField<String>,
            private val connectionId: JsonField<String>,
            private val mediaName: JsonField<String>,
            private val mediaUrl: JsonField<String>,
            private val overlay: JsonField<Boolean>,
            private val status: JsonField<Status>,
            private val statusDetail: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("call_control_id")
                @ExcludeMissing
                callControlId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("call_leg_id")
                @ExcludeMissing
                callLegId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("call_session_id")
                @ExcludeMissing
                callSessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("client_state")
                @ExcludeMissing
                clientState: JsonField<String> = JsonMissing.of(),
                @JsonProperty("connection_id")
                @ExcludeMissing
                connectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("media_name")
                @ExcludeMissing
                mediaName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("media_url")
                @ExcludeMissing
                mediaUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("overlay")
                @ExcludeMissing
                overlay: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("status_detail")
                @ExcludeMissing
                statusDetail: JsonField<String> = JsonMissing.of(),
            ) : this(
                callControlId,
                callLegId,
                callSessionId,
                clientState,
                connectionId,
                mediaName,
                mediaUrl,
                overlay,
                status,
                statusDetail,
                mutableMapOf(),
            )

            /**
             * Call ID used to issue commands via Call Control API.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callControlId(): Optional<String> = callControlId.getOptional("call_control_id")

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
             * The name of the audio media file being played back, if media_name has been used to
             * start.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

            /**
             * The audio URL being played back, if audio_url has been used to start.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mediaUrl(): Optional<String> = mediaUrl.getOptional("media_url")

            /**
             * Whether the stopped audio was in overlay mode or not.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun overlay(): Optional<Boolean> = overlay.getOptional("overlay")

            /**
             * Reflects how command ended.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * Provides details in case of failure.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusDetail(): Optional<String> = statusDetail.getOptional("status_detail")

            /**
             * Returns the raw JSON value of [callControlId].
             *
             * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("call_control_id")
            @ExcludeMissing
            fun _callControlId(): JsonField<String> = callControlId

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
             * Returns the raw JSON value of [mediaName].
             *
             * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("media_name")
            @ExcludeMissing
            fun _mediaName(): JsonField<String> = mediaName

            /**
             * Returns the raw JSON value of [mediaUrl].
             *
             * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("media_url") @ExcludeMissing fun _mediaUrl(): JsonField<String> = mediaUrl

            /**
             * Returns the raw JSON value of [overlay].
             *
             * Unlike [overlay], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("overlay") @ExcludeMissing fun _overlay(): JsonField<Boolean> = overlay

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [statusDetail].
             *
             * Unlike [statusDetail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("status_detail")
            @ExcludeMissing
            fun _statusDetail(): JsonField<String> = statusDetail

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

                private var callControlId: JsonField<String> = JsonMissing.of()
                private var callLegId: JsonField<String> = JsonMissing.of()
                private var callSessionId: JsonField<String> = JsonMissing.of()
                private var clientState: JsonField<String> = JsonMissing.of()
                private var connectionId: JsonField<String> = JsonMissing.of()
                private var mediaName: JsonField<String> = JsonMissing.of()
                private var mediaUrl: JsonField<String> = JsonMissing.of()
                private var overlay: JsonField<Boolean> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var statusDetail: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    callControlId = payload.callControlId
                    callLegId = payload.callLegId
                    callSessionId = payload.callSessionId
                    clientState = payload.clientState
                    connectionId = payload.connectionId
                    mediaName = payload.mediaName
                    mediaUrl = payload.mediaUrl
                    overlay = payload.overlay
                    status = payload.status
                    statusDetail = payload.statusDetail
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** Call ID used to issue commands via Call Control API. */
                fun callControlId(callControlId: String) =
                    callControlId(JsonField.of(callControlId))

                /**
                 * Sets [Builder.callControlId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callControlId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callControlId(callControlId: JsonField<String>) = apply {
                    this.callControlId = callControlId
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
                 * The name of the audio media file being played back, if media_name has been used
                 * to start.
                 */
                fun mediaName(mediaName: String) = mediaName(JsonField.of(mediaName))

                /**
                 * Sets [Builder.mediaName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mediaName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mediaName(mediaName: JsonField<String>) = apply { this.mediaName = mediaName }

                /** The audio URL being played back, if audio_url has been used to start. */
                fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

                /**
                 * Sets [Builder.mediaUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mediaUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

                /** Whether the stopped audio was in overlay mode or not. */
                fun overlay(overlay: Boolean) = overlay(JsonField.of(overlay))

                /**
                 * Sets [Builder.overlay] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overlay] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun overlay(overlay: JsonField<Boolean>) = apply { this.overlay = overlay }

                /** Reflects how command ended. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Provides details in case of failure. */
                fun statusDetail(statusDetail: String) = statusDetail(JsonField.of(statusDetail))

                /**
                 * Sets [Builder.statusDetail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusDetail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusDetail(statusDetail: JsonField<String>) = apply {
                    this.statusDetail = statusDetail
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
                        callControlId,
                        callLegId,
                        callSessionId,
                        clientState,
                        connectionId,
                        mediaName,
                        mediaUrl,
                        overlay,
                        status,
                        statusDetail,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                callControlId()
                callLegId()
                callSessionId()
                clientState()
                connectionId()
                mediaName()
                mediaUrl()
                overlay()
                status().ifPresent { it.validate() }
                statusDetail()
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
                (if (callControlId.asKnown().isPresent) 1 else 0) +
                    (if (callLegId.asKnown().isPresent) 1 else 0) +
                    (if (callSessionId.asKnown().isPresent) 1 else 0) +
                    (if (clientState.asKnown().isPresent) 1 else 0) +
                    (if (connectionId.asKnown().isPresent) 1 else 0) +
                    (if (mediaName.asKnown().isPresent) 1 else 0) +
                    (if (mediaUrl.asKnown().isPresent) 1 else 0) +
                    (if (overlay.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (statusDetail.asKnown().isPresent) 1 else 0)

            /** Reflects how command ended. */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val FILE_NOT_FOUND = of("file_not_found")

                    @JvmField val CALL_HANGUP = of("call_hangup")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmField val CANCELLED = of("cancelled")

                    @JvmField val CANCELLED_AMD = of("cancelled_amd")

                    @JvmField val COMPLETED = of("completed")

                    @JvmField val FAILED = of("failed")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    FILE_NOT_FOUND,
                    CALL_HANGUP,
                    UNKNOWN,
                    CANCELLED,
                    CANCELLED_AMD,
                    COMPLETED,
                    FAILED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FILE_NOT_FOUND,
                    CALL_HANGUP,
                    UNKNOWN,
                    CANCELLED,
                    CANCELLED_AMD,
                    COMPLETED,
                    FAILED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
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
                        FILE_NOT_FOUND -> Value.FILE_NOT_FOUND
                        CALL_HANGUP -> Value.CALL_HANGUP
                        UNKNOWN -> Value.UNKNOWN
                        CANCELLED -> Value.CANCELLED
                        CANCELLED_AMD -> Value.CANCELLED_AMD
                        COMPLETED -> Value.COMPLETED
                        FAILED -> Value.FAILED
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
                        FILE_NOT_FOUND -> Known.FILE_NOT_FOUND
                        CALL_HANGUP -> Known.CALL_HANGUP
                        UNKNOWN -> Known.UNKNOWN
                        CANCELLED -> Known.CANCELLED
                        CANCELLED_AMD -> Known.CANCELLED_AMD
                        COMPLETED -> Known.COMPLETED
                        FAILED -> Known.FAILED
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    callControlId == other.callControlId &&
                    callLegId == other.callLegId &&
                    callSessionId == other.callSessionId &&
                    clientState == other.clientState &&
                    connectionId == other.connectionId &&
                    mediaName == other.mediaName &&
                    mediaUrl == other.mediaUrl &&
                    overlay == other.overlay &&
                    status == other.status &&
                    statusDetail == other.statusDetail &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    callControlId,
                    callLegId,
                    callSessionId,
                    clientState,
                    connectionId,
                    mediaName,
                    mediaUrl,
                    overlay,
                    status,
                    statusDetail,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{callControlId=$callControlId, callLegId=$callLegId, callSessionId=$callSessionId, clientState=$clientState, connectionId=$connectionId, mediaName=$mediaName, mediaUrl=$mediaUrl, overlay=$overlay, status=$status, statusDetail=$statusDetail, additionalProperties=$additionalProperties}"
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

        return other is CallPlaybackEndedWebhookEvent &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallPlaybackEndedWebhookEvent{data=$data, additionalProperties=$additionalProperties}"
}
