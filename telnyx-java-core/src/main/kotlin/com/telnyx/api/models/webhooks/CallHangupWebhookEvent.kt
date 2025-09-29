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
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.calls.CustomSipHeader
import com.telnyx.api.models.calls.SipHeader
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallHangupWebhookEvent
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

        /** Returns a mutable builder for constructing an instance of [CallHangupWebhookEvent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallHangupWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callHangupWebhookEvent: CallHangupWebhookEvent) = apply {
            data = callHangupWebhookEvent.data
            additionalProperties = callHangupWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CallHangupWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallHangupWebhookEvent =
            CallHangupWebhookEvent(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CallHangupWebhookEvent = apply {
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

                @JvmField val CALL_HANGUP = of("call.hangup")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                CALL_HANGUP
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
                CALL_HANGUP,
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
                    CALL_HANGUP -> Value.CALL_HANGUP
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
                    CALL_HANGUP -> Known.CALL_HANGUP
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
            private val callQualityStats: JsonField<CallQualityStats>,
            private val callSessionId: JsonField<String>,
            private val clientState: JsonField<String>,
            private val connectionId: JsonField<String>,
            private val customHeaders: JsonField<List<CustomSipHeader>>,
            private val from: JsonField<String>,
            private val hangupCause: JsonField<HangupCause>,
            private val hangupSource: JsonField<HangupSource>,
            private val sipHangupCause: JsonField<String>,
            private val sipHeaders: JsonField<List<SipHeader>>,
            private val startTime: JsonField<OffsetDateTime>,
            private val state: JsonField<State>,
            private val tags: JsonField<List<String>>,
            private val to: JsonField<String>,
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
                @JsonProperty("call_quality_stats")
                @ExcludeMissing
                callQualityStats: JsonField<CallQualityStats> = JsonMissing.of(),
                @JsonProperty("call_session_id")
                @ExcludeMissing
                callSessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("client_state")
                @ExcludeMissing
                clientState: JsonField<String> = JsonMissing.of(),
                @JsonProperty("connection_id")
                @ExcludeMissing
                connectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("custom_headers")
                @ExcludeMissing
                customHeaders: JsonField<List<CustomSipHeader>> = JsonMissing.of(),
                @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hangup_cause")
                @ExcludeMissing
                hangupCause: JsonField<HangupCause> = JsonMissing.of(),
                @JsonProperty("hangup_source")
                @ExcludeMissing
                hangupSource: JsonField<HangupSource> = JsonMissing.of(),
                @JsonProperty("sip_hangup_cause")
                @ExcludeMissing
                sipHangupCause: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sip_headers")
                @ExcludeMissing
                sipHeaders: JsonField<List<SipHeader>> = JsonMissing.of(),
                @JsonProperty("start_time")
                @ExcludeMissing
                startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            ) : this(
                callControlId,
                callLegId,
                callQualityStats,
                callSessionId,
                clientState,
                connectionId,
                customHeaders,
                from,
                hangupCause,
                hangupSource,
                sipHangupCause,
                sipHeaders,
                startTime,
                state,
                tags,
                to,
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
             * Call quality statistics aggregated from the CHANNEL_HANGUP_COMPLETE event. Only
             * includes metrics that are available (filters out nil values). Returns nil if no
             * metrics are available.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callQualityStats(): Optional<CallQualityStats> =
                callQualityStats.getOptional("call_quality_stats")

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
             * Custom headers set on answer command
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customHeaders(): Optional<List<CustomSipHeader>> =
                customHeaders.getOptional("custom_headers")

            /**
             * Number or SIP URI placing the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun from(): Optional<String> = from.getOptional("from")

            /**
             * The reason the call was ended (`call_rejected`, `normal_clearing`,
             * `originator_cancel`, `timeout`, `time_limit`, `user_busy`, `not_found` or
             * `unspecified`).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hangupCause(): Optional<HangupCause> = hangupCause.getOptional("hangup_cause")

            /**
             * The party who ended the call (`callee`, `caller`, `unknown`).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hangupSource(): Optional<HangupSource> = hangupSource.getOptional("hangup_source")

            /**
             * The reason the call was ended (SIP response code). If the SIP response is unavailable
             * (in inbound calls for example) this is set to `unspecified`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipHangupCause(): Optional<String> = sipHangupCause.getOptional("sip_hangup_cause")

            /**
             * User-to-User and Diversion headers from sip invite.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipHeaders(): Optional<List<SipHeader>> = sipHeaders.getOptional("sip_headers")

            /**
             * ISO 8601 datetime of when the call started.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

            /**
             * State received from a command.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun state(): Optional<State> = state.getOptional("state")

            /**
             * Array of tags associated to number.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tags(): Optional<List<String>> = tags.getOptional("tags")

            /**
             * Destination number or SIP URI of the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun to(): Optional<String> = to.getOptional("to")

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
             * Returns the raw JSON value of [callQualityStats].
             *
             * Unlike [callQualityStats], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("call_quality_stats")
            @ExcludeMissing
            fun _callQualityStats(): JsonField<CallQualityStats> = callQualityStats

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
             * Returns the raw JSON value of [customHeaders].
             *
             * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("custom_headers")
            @ExcludeMissing
            fun _customHeaders(): JsonField<List<CustomSipHeader>> = customHeaders

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

            /**
             * Returns the raw JSON value of [hangupCause].
             *
             * Unlike [hangupCause], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hangup_cause")
            @ExcludeMissing
            fun _hangupCause(): JsonField<HangupCause> = hangupCause

            /**
             * Returns the raw JSON value of [hangupSource].
             *
             * Unlike [hangupSource], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hangup_source")
            @ExcludeMissing
            fun _hangupSource(): JsonField<HangupSource> = hangupSource

            /**
             * Returns the raw JSON value of [sipHangupCause].
             *
             * Unlike [sipHangupCause], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sip_hangup_cause")
            @ExcludeMissing
            fun _sipHangupCause(): JsonField<String> = sipHangupCause

            /**
             * Returns the raw JSON value of [sipHeaders].
             *
             * Unlike [sipHeaders], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sip_headers")
            @ExcludeMissing
            fun _sipHeaders(): JsonField<List<SipHeader>> = sipHeaders

            /**
             * Returns the raw JSON value of [startTime].
             *
             * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_time")
            @ExcludeMissing
            fun _startTime(): JsonField<OffsetDateTime> = startTime

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

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
                private var callQualityStats: JsonField<CallQualityStats> = JsonMissing.of()
                private var callSessionId: JsonField<String> = JsonMissing.of()
                private var clientState: JsonField<String> = JsonMissing.of()
                private var connectionId: JsonField<String> = JsonMissing.of()
                private var customHeaders: JsonField<MutableList<CustomSipHeader>>? = null
                private var from: JsonField<String> = JsonMissing.of()
                private var hangupCause: JsonField<HangupCause> = JsonMissing.of()
                private var hangupSource: JsonField<HangupSource> = JsonMissing.of()
                private var sipHangupCause: JsonField<String> = JsonMissing.of()
                private var sipHeaders: JsonField<MutableList<SipHeader>>? = null
                private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var state: JsonField<State> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var to: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    callControlId = payload.callControlId
                    callLegId = payload.callLegId
                    callQualityStats = payload.callQualityStats
                    callSessionId = payload.callSessionId
                    clientState = payload.clientState
                    connectionId = payload.connectionId
                    customHeaders = payload.customHeaders.map { it.toMutableList() }
                    from = payload.from
                    hangupCause = payload.hangupCause
                    hangupSource = payload.hangupSource
                    sipHangupCause = payload.sipHangupCause
                    sipHeaders = payload.sipHeaders.map { it.toMutableList() }
                    startTime = payload.startTime
                    state = payload.state
                    tags = payload.tags.map { it.toMutableList() }
                    to = payload.to
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
                 * Call quality statistics aggregated from the CHANNEL_HANGUP_COMPLETE event. Only
                 * includes metrics that are available (filters out nil values). Returns nil if no
                 * metrics are available.
                 */
                fun callQualityStats(callQualityStats: CallQualityStats?) =
                    callQualityStats(JsonField.ofNullable(callQualityStats))

                /**
                 * Alias for calling [Builder.callQualityStats] with
                 * `callQualityStats.orElse(null)`.
                 */
                fun callQualityStats(callQualityStats: Optional<CallQualityStats>) =
                    callQualityStats(callQualityStats.getOrNull())

                /**
                 * Sets [Builder.callQualityStats] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callQualityStats] with a well-typed
                 * [CallQualityStats] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun callQualityStats(callQualityStats: JsonField<CallQualityStats>) = apply {
                    this.callQualityStats = callQualityStats
                }

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

                /** Custom headers set on answer command */
                fun customHeaders(customHeaders: List<CustomSipHeader>) =
                    customHeaders(JsonField.of(customHeaders))

                /**
                 * Sets [Builder.customHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customHeaders] with a well-typed
                 * `List<CustomSipHeader>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customHeaders(customHeaders: JsonField<List<CustomSipHeader>>) = apply {
                    this.customHeaders = customHeaders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CustomSipHeader] to [customHeaders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCustomHeader(customHeader: CustomSipHeader) = apply {
                    customHeaders =
                        (customHeaders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("customHeaders", it).add(customHeader)
                        }
                }

                /** Number or SIP URI placing the call. */
                fun from(from: String) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<String>) = apply { this.from = from }

                /**
                 * The reason the call was ended (`call_rejected`, `normal_clearing`,
                 * `originator_cancel`, `timeout`, `time_limit`, `user_busy`, `not_found` or
                 * `unspecified`).
                 */
                fun hangupCause(hangupCause: HangupCause) = hangupCause(JsonField.of(hangupCause))

                /**
                 * Sets [Builder.hangupCause] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hangupCause] with a well-typed [HangupCause]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun hangupCause(hangupCause: JsonField<HangupCause>) = apply {
                    this.hangupCause = hangupCause
                }

                /** The party who ended the call (`callee`, `caller`, `unknown`). */
                fun hangupSource(hangupSource: HangupSource) =
                    hangupSource(JsonField.of(hangupSource))

                /**
                 * Sets [Builder.hangupSource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hangupSource] with a well-typed [HangupSource]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun hangupSource(hangupSource: JsonField<HangupSource>) = apply {
                    this.hangupSource = hangupSource
                }

                /**
                 * The reason the call was ended (SIP response code). If the SIP response is
                 * unavailable (in inbound calls for example) this is set to `unspecified`.
                 */
                fun sipHangupCause(sipHangupCause: String) =
                    sipHangupCause(JsonField.of(sipHangupCause))

                /**
                 * Sets [Builder.sipHangupCause] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipHangupCause] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sipHangupCause(sipHangupCause: JsonField<String>) = apply {
                    this.sipHangupCause = sipHangupCause
                }

                /** User-to-User and Diversion headers from sip invite. */
                fun sipHeaders(sipHeaders: List<SipHeader>) = sipHeaders(JsonField.of(sipHeaders))

                /**
                 * Sets [Builder.sipHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipHeaders] with a well-typed `List<SipHeader>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sipHeaders(sipHeaders: JsonField<List<SipHeader>>) = apply {
                    this.sipHeaders = sipHeaders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SipHeader] to [sipHeaders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSipHeader(sipHeader: SipHeader) = apply {
                    sipHeaders =
                        (sipHeaders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sipHeaders", it).add(sipHeader)
                        }
                }

                /** ISO 8601 datetime of when the call started. */
                fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

                /**
                 * Sets [Builder.startTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                    this.startTime = startTime
                }

                /** State received from a command. */
                fun state(state: State) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [State] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<State>) = apply { this.state = state }

                /** Array of tags associated to number. */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                /** Destination number or SIP URI of the call. */
                fun to(to: String) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun to(to: JsonField<String>) = apply { this.to = to }

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
                        callQualityStats,
                        callSessionId,
                        clientState,
                        connectionId,
                        (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        from,
                        hangupCause,
                        hangupSource,
                        sipHangupCause,
                        (sipHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        startTime,
                        state,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        to,
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
                callQualityStats().ifPresent { it.validate() }
                callSessionId()
                clientState()
                connectionId()
                customHeaders().ifPresent { it.forEach { it.validate() } }
                from()
                hangupCause().ifPresent { it.validate() }
                hangupSource().ifPresent { it.validate() }
                sipHangupCause()
                sipHeaders().ifPresent { it.forEach { it.validate() } }
                startTime()
                state().ifPresent { it.validate() }
                tags()
                to()
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
                    (callQualityStats.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (callSessionId.asKnown().isPresent) 1 else 0) +
                    (if (clientState.asKnown().isPresent) 1 else 0) +
                    (if (connectionId.asKnown().isPresent) 1 else 0) +
                    (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (from.asKnown().isPresent) 1 else 0) +
                    (hangupCause.asKnown().getOrNull()?.validity() ?: 0) +
                    (hangupSource.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (sipHangupCause.asKnown().isPresent) 1 else 0) +
                    (sipHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (startTime.asKnown().isPresent) 1 else 0) +
                    (state.asKnown().getOrNull()?.validity() ?: 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (to.asKnown().isPresent) 1 else 0)

            /**
             * Call quality statistics aggregated from the CHANNEL_HANGUP_COMPLETE event. Only
             * includes metrics that are available (filters out nil values). Returns nil if no
             * metrics are available.
             */
            class CallQualityStats
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val inbound: JsonField<Inbound>,
                private val outbound: JsonField<Outbound>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("inbound")
                    @ExcludeMissing
                    inbound: JsonField<Inbound> = JsonMissing.of(),
                    @JsonProperty("outbound")
                    @ExcludeMissing
                    outbound: JsonField<Outbound> = JsonMissing.of(),
                ) : this(inbound, outbound, mutableMapOf())

                /**
                 * Inbound call quality statistics.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun inbound(): Optional<Inbound> = inbound.getOptional("inbound")

                /**
                 * Outbound call quality statistics.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun outbound(): Optional<Outbound> = outbound.getOptional("outbound")

                /**
                 * Returns the raw JSON value of [inbound].
                 *
                 * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("inbound")
                @ExcludeMissing
                fun _inbound(): JsonField<Inbound> = inbound

                /**
                 * Returns the raw JSON value of [outbound].
                 *
                 * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("outbound")
                @ExcludeMissing
                fun _outbound(): JsonField<Outbound> = outbound

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
                     * Returns a mutable builder for constructing an instance of [CallQualityStats].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CallQualityStats]. */
                class Builder internal constructor() {

                    private var inbound: JsonField<Inbound> = JsonMissing.of()
                    private var outbound: JsonField<Outbound> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(callQualityStats: CallQualityStats) = apply {
                        inbound = callQualityStats.inbound
                        outbound = callQualityStats.outbound
                        additionalProperties = callQualityStats.additionalProperties.toMutableMap()
                    }

                    /** Inbound call quality statistics. */
                    fun inbound(inbound: Inbound) = inbound(JsonField.of(inbound))

                    /**
                     * Sets [Builder.inbound] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inbound] with a well-typed [Inbound] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun inbound(inbound: JsonField<Inbound>) = apply { this.inbound = inbound }

                    /** Outbound call quality statistics. */
                    fun outbound(outbound: Outbound) = outbound(JsonField.of(outbound))

                    /**
                     * Sets [Builder.outbound] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outbound] with a well-typed [Outbound] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun outbound(outbound: JsonField<Outbound>) = apply { this.outbound = outbound }

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
                     * Returns an immutable instance of [CallQualityStats].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CallQualityStats =
                        CallQualityStats(inbound, outbound, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): CallQualityStats = apply {
                    if (validated) {
                        return@apply
                    }

                    inbound().ifPresent { it.validate() }
                    outbound().ifPresent { it.validate() }
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
                    (inbound.asKnown().getOrNull()?.validity() ?: 0) +
                        (outbound.asKnown().getOrNull()?.validity() ?: 0)

                /** Inbound call quality statistics. */
                class Inbound
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val jitterMaxVariance: JsonField<String>,
                    private val jitterPacketCount: JsonField<String>,
                    private val mos: JsonField<String>,
                    private val packetCount: JsonField<String>,
                    private val skipPacketCount: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("jitter_max_variance")
                        @ExcludeMissing
                        jitterMaxVariance: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("jitter_packet_count")
                        @ExcludeMissing
                        jitterPacketCount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("mos")
                        @ExcludeMissing
                        mos: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("packet_count")
                        @ExcludeMissing
                        packetCount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("skip_packet_count")
                        @ExcludeMissing
                        skipPacketCount: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        jitterMaxVariance,
                        jitterPacketCount,
                        mos,
                        packetCount,
                        skipPacketCount,
                        mutableMapOf(),
                    )

                    /**
                     * Maximum jitter variance for inbound audio.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun jitterMaxVariance(): Optional<String> =
                        jitterMaxVariance.getOptional("jitter_max_variance")

                    /**
                     * Number of packets used for jitter calculation on inbound audio.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun jitterPacketCount(): Optional<String> =
                        jitterPacketCount.getOptional("jitter_packet_count")

                    /**
                     * Mean Opinion Score (MOS) for inbound audio quality.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun mos(): Optional<String> = mos.getOptional("mos")

                    /**
                     * Total number of inbound audio packets.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun packetCount(): Optional<String> = packetCount.getOptional("packet_count")

                    /**
                     * Number of skipped inbound packets (packet loss).
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun skipPacketCount(): Optional<String> =
                        skipPacketCount.getOptional("skip_packet_count")

                    /**
                     * Returns the raw JSON value of [jitterMaxVariance].
                     *
                     * Unlike [jitterMaxVariance], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("jitter_max_variance")
                    @ExcludeMissing
                    fun _jitterMaxVariance(): JsonField<String> = jitterMaxVariance

                    /**
                     * Returns the raw JSON value of [jitterPacketCount].
                     *
                     * Unlike [jitterPacketCount], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("jitter_packet_count")
                    @ExcludeMissing
                    fun _jitterPacketCount(): JsonField<String> = jitterPacketCount

                    /**
                     * Returns the raw JSON value of [mos].
                     *
                     * Unlike [mos], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("mos") @ExcludeMissing fun _mos(): JsonField<String> = mos

                    /**
                     * Returns the raw JSON value of [packetCount].
                     *
                     * Unlike [packetCount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("packet_count")
                    @ExcludeMissing
                    fun _packetCount(): JsonField<String> = packetCount

                    /**
                     * Returns the raw JSON value of [skipPacketCount].
                     *
                     * Unlike [skipPacketCount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("skip_packet_count")
                    @ExcludeMissing
                    fun _skipPacketCount(): JsonField<String> = skipPacketCount

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

                        private var jitterMaxVariance: JsonField<String> = JsonMissing.of()
                        private var jitterPacketCount: JsonField<String> = JsonMissing.of()
                        private var mos: JsonField<String> = JsonMissing.of()
                        private var packetCount: JsonField<String> = JsonMissing.of()
                        private var skipPacketCount: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(inbound: Inbound) = apply {
                            jitterMaxVariance = inbound.jitterMaxVariance
                            jitterPacketCount = inbound.jitterPacketCount
                            mos = inbound.mos
                            packetCount = inbound.packetCount
                            skipPacketCount = inbound.skipPacketCount
                            additionalProperties = inbound.additionalProperties.toMutableMap()
                        }

                        /** Maximum jitter variance for inbound audio. */
                        fun jitterMaxVariance(jitterMaxVariance: String) =
                            jitterMaxVariance(JsonField.of(jitterMaxVariance))

                        /**
                         * Sets [Builder.jitterMaxVariance] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.jitterMaxVariance] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun jitterMaxVariance(jitterMaxVariance: JsonField<String>) = apply {
                            this.jitterMaxVariance = jitterMaxVariance
                        }

                        /** Number of packets used for jitter calculation on inbound audio. */
                        fun jitterPacketCount(jitterPacketCount: String) =
                            jitterPacketCount(JsonField.of(jitterPacketCount))

                        /**
                         * Sets [Builder.jitterPacketCount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.jitterPacketCount] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun jitterPacketCount(jitterPacketCount: JsonField<String>) = apply {
                            this.jitterPacketCount = jitterPacketCount
                        }

                        /** Mean Opinion Score (MOS) for inbound audio quality. */
                        fun mos(mos: String) = mos(JsonField.of(mos))

                        /**
                         * Sets [Builder.mos] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.mos] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun mos(mos: JsonField<String>) = apply { this.mos = mos }

                        /** Total number of inbound audio packets. */
                        fun packetCount(packetCount: String) =
                            packetCount(JsonField.of(packetCount))

                        /**
                         * Sets [Builder.packetCount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.packetCount] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun packetCount(packetCount: JsonField<String>) = apply {
                            this.packetCount = packetCount
                        }

                        /** Number of skipped inbound packets (packet loss). */
                        fun skipPacketCount(skipPacketCount: String) =
                            skipPacketCount(JsonField.of(skipPacketCount))

                        /**
                         * Sets [Builder.skipPacketCount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.skipPacketCount] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun skipPacketCount(skipPacketCount: JsonField<String>) = apply {
                            this.skipPacketCount = skipPacketCount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Inbound].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Inbound =
                            Inbound(
                                jitterMaxVariance,
                                jitterPacketCount,
                                mos,
                                packetCount,
                                skipPacketCount,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Inbound = apply {
                        if (validated) {
                            return@apply
                        }

                        jitterMaxVariance()
                        jitterPacketCount()
                        mos()
                        packetCount()
                        skipPacketCount()
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
                        (if (jitterMaxVariance.asKnown().isPresent) 1 else 0) +
                            (if (jitterPacketCount.asKnown().isPresent) 1 else 0) +
                            (if (mos.asKnown().isPresent) 1 else 0) +
                            (if (packetCount.asKnown().isPresent) 1 else 0) +
                            (if (skipPacketCount.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Inbound &&
                            jitterMaxVariance == other.jitterMaxVariance &&
                            jitterPacketCount == other.jitterPacketCount &&
                            mos == other.mos &&
                            packetCount == other.packetCount &&
                            skipPacketCount == other.skipPacketCount &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            jitterMaxVariance,
                            jitterPacketCount,
                            mos,
                            packetCount,
                            skipPacketCount,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Inbound{jitterMaxVariance=$jitterMaxVariance, jitterPacketCount=$jitterPacketCount, mos=$mos, packetCount=$packetCount, skipPacketCount=$skipPacketCount, additionalProperties=$additionalProperties}"
                }

                /** Outbound call quality statistics. */
                class Outbound
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val packetCount: JsonField<String>,
                    private val skipPacketCount: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("packet_count")
                        @ExcludeMissing
                        packetCount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("skip_packet_count")
                        @ExcludeMissing
                        skipPacketCount: JsonField<String> = JsonMissing.of(),
                    ) : this(packetCount, skipPacketCount, mutableMapOf())

                    /**
                     * Total number of outbound audio packets.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun packetCount(): Optional<String> = packetCount.getOptional("packet_count")

                    /**
                     * Number of skipped outbound packets (packet loss).
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun skipPacketCount(): Optional<String> =
                        skipPacketCount.getOptional("skip_packet_count")

                    /**
                     * Returns the raw JSON value of [packetCount].
                     *
                     * Unlike [packetCount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("packet_count")
                    @ExcludeMissing
                    fun _packetCount(): JsonField<String> = packetCount

                    /**
                     * Returns the raw JSON value of [skipPacketCount].
                     *
                     * Unlike [skipPacketCount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("skip_packet_count")
                    @ExcludeMissing
                    fun _skipPacketCount(): JsonField<String> = skipPacketCount

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

                        private var packetCount: JsonField<String> = JsonMissing.of()
                        private var skipPacketCount: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(outbound: Outbound) = apply {
                            packetCount = outbound.packetCount
                            skipPacketCount = outbound.skipPacketCount
                            additionalProperties = outbound.additionalProperties.toMutableMap()
                        }

                        /** Total number of outbound audio packets. */
                        fun packetCount(packetCount: String) =
                            packetCount(JsonField.of(packetCount))

                        /**
                         * Sets [Builder.packetCount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.packetCount] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun packetCount(packetCount: JsonField<String>) = apply {
                            this.packetCount = packetCount
                        }

                        /** Number of skipped outbound packets (packet loss). */
                        fun skipPacketCount(skipPacketCount: String) =
                            skipPacketCount(JsonField.of(skipPacketCount))

                        /**
                         * Sets [Builder.skipPacketCount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.skipPacketCount] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun skipPacketCount(skipPacketCount: JsonField<String>) = apply {
                            this.skipPacketCount = skipPacketCount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Outbound].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Outbound =
                            Outbound(
                                packetCount,
                                skipPacketCount,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Outbound = apply {
                        if (validated) {
                            return@apply
                        }

                        packetCount()
                        skipPacketCount()
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
                        (if (packetCount.asKnown().isPresent) 1 else 0) +
                            (if (skipPacketCount.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Outbound &&
                            packetCount == other.packetCount &&
                            skipPacketCount == other.skipPacketCount &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(packetCount, skipPacketCount, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Outbound{packetCount=$packetCount, skipPacketCount=$skipPacketCount, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CallQualityStats &&
                        inbound == other.inbound &&
                        outbound == other.outbound &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(inbound, outbound, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CallQualityStats{inbound=$inbound, outbound=$outbound, additionalProperties=$additionalProperties}"
            }

            /**
             * The reason the call was ended (`call_rejected`, `normal_clearing`,
             * `originator_cancel`, `timeout`, `time_limit`, `user_busy`, `not_found` or
             * `unspecified`).
             */
            class HangupCause
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val CALL_REJECTED = of("call_rejected")

                    @JvmField val NORMAL_CLEARING = of("normal_clearing")

                    @JvmField val ORIGINATOR_CANCEL = of("originator_cancel")

                    @JvmField val TIMEOUT = of("timeout")

                    @JvmField val TIME_LIMIT = of("time_limit")

                    @JvmField val USER_BUSY = of("user_busy")

                    @JvmField val NOT_FOUND = of("not_found")

                    @JvmField val UNSPECIFIED = of("unspecified")

                    @JvmStatic fun of(value: String) = HangupCause(JsonField.of(value))
                }

                /** An enum containing [HangupCause]'s known values. */
                enum class Known {
                    CALL_REJECTED,
                    NORMAL_CLEARING,
                    ORIGINATOR_CANCEL,
                    TIMEOUT,
                    TIME_LIMIT,
                    USER_BUSY,
                    NOT_FOUND,
                    UNSPECIFIED,
                }

                /**
                 * An enum containing [HangupCause]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [HangupCause] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CALL_REJECTED,
                    NORMAL_CLEARING,
                    ORIGINATOR_CANCEL,
                    TIMEOUT,
                    TIME_LIMIT,
                    USER_BUSY,
                    NOT_FOUND,
                    UNSPECIFIED,
                    /**
                     * An enum member indicating that [HangupCause] was instantiated with an unknown
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
                        CALL_REJECTED -> Value.CALL_REJECTED
                        NORMAL_CLEARING -> Value.NORMAL_CLEARING
                        ORIGINATOR_CANCEL -> Value.ORIGINATOR_CANCEL
                        TIMEOUT -> Value.TIMEOUT
                        TIME_LIMIT -> Value.TIME_LIMIT
                        USER_BUSY -> Value.USER_BUSY
                        NOT_FOUND -> Value.NOT_FOUND
                        UNSPECIFIED -> Value.UNSPECIFIED
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
                        CALL_REJECTED -> Known.CALL_REJECTED
                        NORMAL_CLEARING -> Known.NORMAL_CLEARING
                        ORIGINATOR_CANCEL -> Known.ORIGINATOR_CANCEL
                        TIMEOUT -> Known.TIMEOUT
                        TIME_LIMIT -> Known.TIME_LIMIT
                        USER_BUSY -> Known.USER_BUSY
                        NOT_FOUND -> Known.NOT_FOUND
                        UNSPECIFIED -> Known.UNSPECIFIED
                        else -> throw TelnyxInvalidDataException("Unknown HangupCause: $value")
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

                fun validate(): HangupCause = apply {
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

                    return other is HangupCause && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The party who ended the call (`callee`, `caller`, `unknown`). */
            class HangupSource
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val CALLER = of("caller")

                    @JvmField val CALLEE = of("callee")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmStatic fun of(value: String) = HangupSource(JsonField.of(value))
                }

                /** An enum containing [HangupSource]'s known values. */
                enum class Known {
                    CALLER,
                    CALLEE,
                    UNKNOWN,
                }

                /**
                 * An enum containing [HangupSource]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [HangupSource] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CALLER,
                    CALLEE,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [HangupSource] was instantiated with an
                     * unknown value.
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
                        CALLER -> Value.CALLER
                        CALLEE -> Value.CALLEE
                        UNKNOWN -> Value.UNKNOWN
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
                        CALLER -> Known.CALLER
                        CALLEE -> Known.CALLEE
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw TelnyxInvalidDataException("Unknown HangupSource: $value")
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

                fun validate(): HangupSource = apply {
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

                    return other is HangupSource && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** State received from a command. */
            class State @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val HANGUP = of("hangup")

                    @JvmStatic fun of(value: String) = State(JsonField.of(value))
                }

                /** An enum containing [State]'s known values. */
                enum class Known {
                    HANGUP
                }

                /**
                 * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [State] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    HANGUP,
                    /**
                     * An enum member indicating that [State] was instantiated with an unknown
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
                        HANGUP -> Value.HANGUP
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
                        HANGUP -> Known.HANGUP
                        else -> throw TelnyxInvalidDataException("Unknown State: $value")
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

                fun validate(): State = apply {
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

                    return other is State && value == other.value
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
                    callQualityStats == other.callQualityStats &&
                    callSessionId == other.callSessionId &&
                    clientState == other.clientState &&
                    connectionId == other.connectionId &&
                    customHeaders == other.customHeaders &&
                    from == other.from &&
                    hangupCause == other.hangupCause &&
                    hangupSource == other.hangupSource &&
                    sipHangupCause == other.sipHangupCause &&
                    sipHeaders == other.sipHeaders &&
                    startTime == other.startTime &&
                    state == other.state &&
                    tags == other.tags &&
                    to == other.to &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    callControlId,
                    callLegId,
                    callQualityStats,
                    callSessionId,
                    clientState,
                    connectionId,
                    customHeaders,
                    from,
                    hangupCause,
                    hangupSource,
                    sipHangupCause,
                    sipHeaders,
                    startTime,
                    state,
                    tags,
                    to,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{callControlId=$callControlId, callLegId=$callLegId, callQualityStats=$callQualityStats, callSessionId=$callSessionId, clientState=$clientState, connectionId=$connectionId, customHeaders=$customHeaders, from=$from, hangupCause=$hangupCause, hangupSource=$hangupSource, sipHangupCause=$sipHangupCause, sipHeaders=$sipHeaders, startTime=$startTime, state=$state, tags=$tags, to=$to, additionalProperties=$additionalProperties}"
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

        return other is CallHangupWebhookEvent &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallHangupWebhookEvent{data=$data, additionalProperties=$additionalProperties}"
}
