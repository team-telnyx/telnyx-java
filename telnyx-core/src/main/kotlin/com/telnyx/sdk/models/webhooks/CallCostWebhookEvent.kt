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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallCostWebhookEvent
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

        /** Returns a mutable builder for constructing an instance of [CallCostWebhookEvent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallCostWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callCostWebhookEvent: CallCostWebhookEvent) = apply {
            data = callCostWebhookEvent.data
            additionalProperties = callCostWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CallCostWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallCostWebhookEvent =
            CallCostWebhookEvent(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CallCostWebhookEvent = apply {
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
         * Unique identifier of the event.
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

            /** Unique identifier of the event. */
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

                @JvmField val CALL_COST = of("call.cost")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                CALL_COST
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
                CALL_COST,
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
                    CALL_COST -> Value.CALL_COST
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
                    CALL_COST -> Known.CALL_COST
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
            private val billedDurationSecs: JsonField<Long>,
            private val billingGroupId: JsonField<String>,
            private val callControlId: JsonField<String>,
            private val callLegId: JsonField<String>,
            private val callSessionId: JsonField<String>,
            private val clientState: JsonField<String>,
            private val connectionId: JsonField<String>,
            private val costParts: JsonField<List<CostPart>>,
            private val occurredAt: JsonField<OffsetDateTime>,
            private val status: JsonField<Status>,
            private val totalCost: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billed_duration_secs")
                @ExcludeMissing
                billedDurationSecs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("billing_group_id")
                @ExcludeMissing
                billingGroupId: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("cost_parts")
                @ExcludeMissing
                costParts: JsonField<List<CostPart>> = JsonMissing.of(),
                @JsonProperty("occurred_at")
                @ExcludeMissing
                occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("total_cost")
                @ExcludeMissing
                totalCost: JsonField<String> = JsonMissing.of(),
            ) : this(
                billedDurationSecs,
                billingGroupId,
                callControlId,
                callLegId,
                callSessionId,
                clientState,
                connectionId,
                costParts,
                occurredAt,
                status,
                totalCost,
                mutableMapOf(),
            )

            /**
             * The longest billed duration across all cost parts, in seconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billedDurationSecs(): Optional<Long> =
                billedDurationSecs.getOptional("billed_duration_secs")

            /**
             * Identifies the billing group associated with the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

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
             * State received from a command. Base64-encoded.
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
             * Breakdown of costs by call part.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun costParts(): Optional<List<CostPart>> = costParts.getOptional("cost_parts")

            /**
             * ISO 8601 datetime of when the event occurred.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun occurredAt(): Optional<OffsetDateTime> = occurredAt.getOptional("occurred_at")

            /**
             * The status of the cost calculation (`success` or `error`).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * The total cost of the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun totalCost(): Optional<String> = totalCost.getOptional("total_cost")

            /**
             * Returns the raw JSON value of [billedDurationSecs].
             *
             * Unlike [billedDurationSecs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_duration_secs")
            @ExcludeMissing
            fun _billedDurationSecs(): JsonField<Long> = billedDurationSecs

            /**
             * Returns the raw JSON value of [billingGroupId].
             *
             * Unlike [billingGroupId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            fun _billingGroupId(): JsonField<String> = billingGroupId

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
             * Returns the raw JSON value of [costParts].
             *
             * Unlike [costParts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cost_parts")
            @ExcludeMissing
            fun _costParts(): JsonField<List<CostPart>> = costParts

            /**
             * Returns the raw JSON value of [occurredAt].
             *
             * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("occurred_at")
            @ExcludeMissing
            fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [totalCost].
             *
             * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("total_cost")
            @ExcludeMissing
            fun _totalCost(): JsonField<String> = totalCost

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

                private var billedDurationSecs: JsonField<Long> = JsonMissing.of()
                private var billingGroupId: JsonField<String> = JsonMissing.of()
                private var callControlId: JsonField<String> = JsonMissing.of()
                private var callLegId: JsonField<String> = JsonMissing.of()
                private var callSessionId: JsonField<String> = JsonMissing.of()
                private var clientState: JsonField<String> = JsonMissing.of()
                private var connectionId: JsonField<String> = JsonMissing.of()
                private var costParts: JsonField<MutableList<CostPart>>? = null
                private var occurredAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var totalCost: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    billedDurationSecs = payload.billedDurationSecs
                    billingGroupId = payload.billingGroupId
                    callControlId = payload.callControlId
                    callLegId = payload.callLegId
                    callSessionId = payload.callSessionId
                    clientState = payload.clientState
                    connectionId = payload.connectionId
                    costParts = payload.costParts.map { it.toMutableList() }
                    occurredAt = payload.occurredAt
                    status = payload.status
                    totalCost = payload.totalCost
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** The longest billed duration across all cost parts, in seconds. */
                fun billedDurationSecs(billedDurationSecs: Long?) =
                    billedDurationSecs(JsonField.ofNullable(billedDurationSecs))

                /**
                 * Alias for [Builder.billedDurationSecs].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedDurationSecs(billedDurationSecs: Long) =
                    billedDurationSecs(billedDurationSecs as Long?)

                /**
                 * Alias for calling [Builder.billedDurationSecs] with
                 * `billedDurationSecs.orElse(null)`.
                 */
                fun billedDurationSecs(billedDurationSecs: Optional<Long>) =
                    billedDurationSecs(billedDurationSecs.getOrNull())

                /**
                 * Sets [Builder.billedDurationSecs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedDurationSecs] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedDurationSecs(billedDurationSecs: JsonField<Long>) = apply {
                    this.billedDurationSecs = billedDurationSecs
                }

                /** Identifies the billing group associated with the call. */
                fun billingGroupId(billingGroupId: String?) =
                    billingGroupId(JsonField.ofNullable(billingGroupId))

                /**
                 * Alias for calling [Builder.billingGroupId] with `billingGroupId.orElse(null)`.
                 */
                fun billingGroupId(billingGroupId: Optional<String>) =
                    billingGroupId(billingGroupId.getOrNull())

                /**
                 * Sets [Builder.billingGroupId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingGroupId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billingGroupId(billingGroupId: JsonField<String>) = apply {
                    this.billingGroupId = billingGroupId
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

                /** State received from a command. Base64-encoded. */
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

                /** Breakdown of costs by call part. */
                fun costParts(costParts: List<CostPart>) = costParts(JsonField.of(costParts))

                /**
                 * Sets [Builder.costParts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.costParts] with a well-typed `List<CostPart>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun costParts(costParts: JsonField<List<CostPart>>) = apply {
                    this.costParts = costParts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CostPart] to [costParts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCostPart(costPart: CostPart) = apply {
                    costParts =
                        (costParts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("costParts", it).add(costPart)
                        }
                }

                /** ISO 8601 datetime of when the event occurred. */
                fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

                /**
                 * Sets [Builder.occurredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                    this.occurredAt = occurredAt
                }

                /** The status of the cost calculation (`success` or `error`). */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** The total cost of the call. */
                fun totalCost(totalCost: String?) = totalCost(JsonField.ofNullable(totalCost))

                /** Alias for calling [Builder.totalCost] with `totalCost.orElse(null)`. */
                fun totalCost(totalCost: Optional<String>) = totalCost(totalCost.getOrNull())

                /**
                 * Sets [Builder.totalCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalCost] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

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
                        billedDurationSecs,
                        billingGroupId,
                        callControlId,
                        callLegId,
                        callSessionId,
                        clientState,
                        connectionId,
                        (costParts ?: JsonMissing.of()).map { it.toImmutable() },
                        occurredAt,
                        status,
                        totalCost,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                billedDurationSecs()
                billingGroupId()
                callControlId()
                callLegId()
                callSessionId()
                clientState()
                connectionId()
                costParts().ifPresent { it.forEach { it.validate() } }
                occurredAt()
                status().ifPresent { it.validate() }
                totalCost()
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
                (if (billedDurationSecs.asKnown().isPresent) 1 else 0) +
                    (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                    (if (callControlId.asKnown().isPresent) 1 else 0) +
                    (if (callLegId.asKnown().isPresent) 1 else 0) +
                    (if (callSessionId.asKnown().isPresent) 1 else 0) +
                    (if (clientState.asKnown().isPresent) 1 else 0) +
                    (if (connectionId.asKnown().isPresent) 1 else 0) +
                    (costParts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (occurredAt.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (totalCost.asKnown().isPresent) 1 else 0)

            class CostPart
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val billedDurationSecs: JsonField<Long>,
                private val callPart: JsonField<String>,
                private val cost: JsonField<String>,
                private val currency: JsonField<String>,
                private val rate: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("billed_duration_secs")
                    @ExcludeMissing
                    billedDurationSecs: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("call_part")
                    @ExcludeMissing
                    callPart: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("cost")
                    @ExcludeMissing
                    cost: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
                ) : this(billedDurationSecs, callPart, cost, currency, rate, mutableMapOf())

                /**
                 * The billed duration in seconds for this part of the call.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun billedDurationSecs(): Optional<Long> =
                    billedDurationSecs.getOptional("billed_duration_secs")

                /**
                 * The product component this cost applies to. Values are determined by the billing
                 * system (e.g. sip-trunking, call-control, call-recording). Not a fixed set — new
                 * values may appear as products evolve.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun callPart(): Optional<String> = callPart.getOptional("call_part")

                /**
                 * The cost for this part of the call.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cost(): Optional<String> = cost.getOptional("cost")

                /**
                 * The currency of the cost.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<String> = currency.getOptional("currency")

                /**
                 * The per-minute rate applied.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun rate(): Optional<String> = rate.getOptional("rate")

                /**
                 * Returns the raw JSON value of [billedDurationSecs].
                 *
                 * Unlike [billedDurationSecs], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_duration_secs")
                @ExcludeMissing
                fun _billedDurationSecs(): JsonField<Long> = billedDurationSecs

                /**
                 * Returns the raw JSON value of [callPart].
                 *
                 * Unlike [callPart], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("call_part")
                @ExcludeMissing
                fun _callPart(): JsonField<String> = callPart

                /**
                 * Returns the raw JSON value of [cost].
                 *
                 * Unlike [cost], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [rate].
                 *
                 * Unlike [rate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

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

                    /** Returns a mutable builder for constructing an instance of [CostPart]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CostPart]. */
                class Builder internal constructor() {

                    private var billedDurationSecs: JsonField<Long> = JsonMissing.of()
                    private var callPart: JsonField<String> = JsonMissing.of()
                    private var cost: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var rate: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(costPart: CostPart) = apply {
                        billedDurationSecs = costPart.billedDurationSecs
                        callPart = costPart.callPart
                        cost = costPart.cost
                        currency = costPart.currency
                        rate = costPart.rate
                        additionalProperties = costPart.additionalProperties.toMutableMap()
                    }

                    /** The billed duration in seconds for this part of the call. */
                    fun billedDurationSecs(billedDurationSecs: Long) =
                        billedDurationSecs(JsonField.of(billedDurationSecs))

                    /**
                     * Sets [Builder.billedDurationSecs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedDurationSecs] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedDurationSecs(billedDurationSecs: JsonField<Long>) = apply {
                        this.billedDurationSecs = billedDurationSecs
                    }

                    /**
                     * The product component this cost applies to. Values are determined by the
                     * billing system (e.g. sip-trunking, call-control, call-recording). Not a fixed
                     * set — new values may appear as products evolve.
                     */
                    fun callPart(callPart: String) = callPart(JsonField.of(callPart))

                    /**
                     * Sets [Builder.callPart] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callPart] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun callPart(callPart: JsonField<String>) = apply { this.callPart = callPart }

                    /** The cost for this part of the call. */
                    fun cost(cost: String) = cost(JsonField.of(cost))

                    /**
                     * Sets [Builder.cost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cost] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cost(cost: JsonField<String>) = apply { this.cost = cost }

                    /** The currency of the cost. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The per-minute rate applied. */
                    fun rate(rate: String) = rate(JsonField.of(rate))

                    /**
                     * Sets [Builder.rate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rate(rate: JsonField<String>) = apply { this.rate = rate }

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
                     * Returns an immutable instance of [CostPart].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CostPart =
                        CostPart(
                            billedDurationSecs,
                            callPart,
                            cost,
                            currency,
                            rate,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CostPart = apply {
                    if (validated) {
                        return@apply
                    }

                    billedDurationSecs()
                    callPart()
                    cost()
                    currency()
                    rate()
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
                    (if (billedDurationSecs.asKnown().isPresent) 1 else 0) +
                        (if (callPart.asKnown().isPresent) 1 else 0) +
                        (if (cost.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (rate.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CostPart &&
                        billedDurationSecs == other.billedDurationSecs &&
                        callPart == other.callPart &&
                        cost == other.cost &&
                        currency == other.currency &&
                        rate == other.rate &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        billedDurationSecs,
                        callPart,
                        cost,
                        currency,
                        rate,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CostPart{billedDurationSecs=$billedDurationSecs, callPart=$callPart, cost=$cost, currency=$currency, rate=$rate, additionalProperties=$additionalProperties}"
            }

            /** The status of the cost calculation (`success` or `error`). */
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

                    @JvmField val SUCCESS = of("success")

                    @JvmField val ERROR = of("error")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    SUCCESS,
                    ERROR,
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
                    SUCCESS,
                    ERROR,
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
                        SUCCESS -> Value.SUCCESS
                        ERROR -> Value.ERROR
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
                        SUCCESS -> Known.SUCCESS
                        ERROR -> Known.ERROR
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
                    billedDurationSecs == other.billedDurationSecs &&
                    billingGroupId == other.billingGroupId &&
                    callControlId == other.callControlId &&
                    callLegId == other.callLegId &&
                    callSessionId == other.callSessionId &&
                    clientState == other.clientState &&
                    connectionId == other.connectionId &&
                    costParts == other.costParts &&
                    occurredAt == other.occurredAt &&
                    status == other.status &&
                    totalCost == other.totalCost &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billedDurationSecs,
                    billingGroupId,
                    callControlId,
                    callLegId,
                    callSessionId,
                    clientState,
                    connectionId,
                    costParts,
                    occurredAt,
                    status,
                    totalCost,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{billedDurationSecs=$billedDurationSecs, billingGroupId=$billingGroupId, callControlId=$callControlId, callLegId=$callLegId, callSessionId=$callSessionId, clientState=$clientState, connectionId=$connectionId, costParts=$costParts, occurredAt=$occurredAt, status=$status, totalCost=$totalCost, additionalProperties=$additionalProperties}"
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

        return other is CallCostWebhookEvent &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallCostWebhookEvent{data=$data, additionalProperties=$additionalProperties}"
}
