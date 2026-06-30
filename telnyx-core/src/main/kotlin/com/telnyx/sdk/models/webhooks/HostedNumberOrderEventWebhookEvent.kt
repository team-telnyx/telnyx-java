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

class HostedNumberOrderEventWebhookEvent
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
         * [HostedNumberOrderEventWebhookEvent].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HostedNumberOrderEventWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hostedNumberOrderEventWebhookEvent: HostedNumberOrderEventWebhookEvent) =
            apply {
                data = hostedNumberOrderEventWebhookEvent.data
                additionalProperties =
                    hostedNumberOrderEventWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [HostedNumberOrderEventWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HostedNumberOrderEventWebhookEvent =
            HostedNumberOrderEventWebhookEvent(data, additionalProperties.toMutableMap())
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
    fun validate(): HostedNumberOrderEventWebhookEvent = apply {
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
         * Unique identifier for the event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The type of event being delivered. Internal transfer events are only emitted for orders
         * where the numbers are already active on another Telnyx account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

        /**
         * ISO 8601 formatted date indicating when the event was generated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun occurredAt(): Optional<OffsetDateTime> = occurredAt.getOptional("occurred_at")

        /**
         * Payload delivered with every messaging_hosted_numbers_orders.* event. `approval_deadline`
         * and `decision` are meaningful only for `internal_transfer_*` events.
         *
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

            /** Unique identifier for the event. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The type of event being delivered. Internal transfer events are only emitted for
             * orders where the numbers are already active on another Telnyx account.
             */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /** ISO 8601 formatted date indicating when the event was generated. */
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

            /**
             * Payload delivered with every messaging_hosted_numbers_orders.* event.
             * `approval_deadline` and `decision` are meaningful only for `internal_transfer_*`
             * events.
             */
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

        /**
         * The type of event being delivered. Internal transfer events are only emitted for orders
         * where the numbers are already active on another Telnyx account.
         */
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

                @JvmField
                val MESSAGING_HOSTED_NUMBERS_ORDERS_CREATED =
                    of("messaging_hosted_numbers_orders.created")

                @JvmField
                val MESSAGING_HOSTED_NUMBERS_ORDERS_UPDATED =
                    of("messaging_hosted_numbers_orders.updated")

                @JvmField
                val MESSAGING_HOSTED_NUMBERS_ORDERS_DELETED =
                    of("messaging_hosted_numbers_orders.deleted")

                @JvmField
                val MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_DETECTED =
                    of("messaging_hosted_numbers_orders.internal_transfer_detected")

                @JvmField
                val MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED =
                    of("messaging_hosted_numbers_orders.internal_transfer_approval_requested")

                @JvmField
                val MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVED =
                    of("messaging_hosted_numbers_orders.internal_transfer_approved")

                @JvmField
                val MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_REJECTED =
                    of("messaging_hosted_numbers_orders.internal_transfer_rejected")

                @JvmField
                val MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_AUTO_APPROVED =
                    of("messaging_hosted_numbers_orders.internal_transfer_auto_approved")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                MESSAGING_HOSTED_NUMBERS_ORDERS_CREATED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_UPDATED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_DELETED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_DETECTED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_REJECTED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_AUTO_APPROVED,
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
                MESSAGING_HOSTED_NUMBERS_ORDERS_CREATED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_UPDATED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_DELETED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_DETECTED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_REJECTED,
                MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_AUTO_APPROVED,
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
                    MESSAGING_HOSTED_NUMBERS_ORDERS_CREATED ->
                        Value.MESSAGING_HOSTED_NUMBERS_ORDERS_CREATED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_UPDATED ->
                        Value.MESSAGING_HOSTED_NUMBERS_ORDERS_UPDATED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_DELETED ->
                        Value.MESSAGING_HOSTED_NUMBERS_ORDERS_DELETED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_DETECTED ->
                        Value.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_DETECTED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED ->
                        Value.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVED ->
                        Value.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_REJECTED ->
                        Value.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_REJECTED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_AUTO_APPROVED ->
                        Value.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_AUTO_APPROVED
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
                    MESSAGING_HOSTED_NUMBERS_ORDERS_CREATED ->
                        Known.MESSAGING_HOSTED_NUMBERS_ORDERS_CREATED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_UPDATED ->
                        Known.MESSAGING_HOSTED_NUMBERS_ORDERS_UPDATED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_DELETED ->
                        Known.MESSAGING_HOSTED_NUMBERS_ORDERS_DELETED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_DETECTED ->
                        Known.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_DETECTED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED ->
                        Known.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVED ->
                        Known.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_REJECTED ->
                        Known.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_REJECTED
                    MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_AUTO_APPROVED ->
                        Known.MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_AUTO_APPROVED
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        /**
         * Payload delivered with every messaging_hosted_numbers_orders.* event. `approval_deadline`
         * and `decision` are meaningful only for `internal_transfer_*` events.
         */
        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val approvalDeadline: JsonField<Long>,
            private val decision: JsonField<Decision>,
            private val numbers: JsonField<List<Number>>,
            private val orderId: JsonField<String>,
            private val orderStatus: JsonField<OrderStatus>,
            private val profileId: JsonField<String>,
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("approval_deadline")
                @ExcludeMissing
                approvalDeadline: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("decision")
                @ExcludeMissing
                decision: JsonField<Decision> = JsonMissing.of(),
                @JsonProperty("numbers")
                @ExcludeMissing
                numbers: JsonField<List<Number>> = JsonMissing.of(),
                @JsonProperty("order_id")
                @ExcludeMissing
                orderId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("order_status")
                @ExcludeMissing
                orderStatus: JsonField<OrderStatus> = JsonMissing.of(),
                @JsonProperty("profile_id")
                @ExcludeMissing
                profileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
            ) : this(
                approvalDeadline,
                decision,
                numbers,
                orderId,
                orderStatus,
                profileId,
                userId,
                mutableMapOf(),
            )

            /**
             * Unix timestamp (seconds) by which the losing organization must respond before
             * auto-approval. Populated on internal-transfer events once an approval window has been
             * issued.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun approvalDeadline(): Optional<Long> =
                approvalDeadline.getOptional("approval_deadline")

            /**
             * Approval decision for the internal transfer. Defaults to `pending` for
             * non-internal-transfer events.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun decision(): Optional<Decision> = decision.getOptional("decision")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun numbers(): Optional<List<Number>> = numbers.getOptional("numbers")

            /**
             * The ID of the hosted number order.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orderId(): Optional<String> = orderId.getOptional("order_id")

            /**
             * Current status of the order.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orderStatus(): Optional<OrderStatus> = orderStatus.getOptional("order_status")

            /**
             * The messaging profile associated with the order.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun profileId(): Optional<String> = profileId.getOptional("profile_id")

            /**
             * The organization that owns the order.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): Optional<String> = userId.getOptional("user_id")

            /**
             * Returns the raw JSON value of [approvalDeadline].
             *
             * Unlike [approvalDeadline], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("approval_deadline")
            @ExcludeMissing
            fun _approvalDeadline(): JsonField<Long> = approvalDeadline

            /**
             * Returns the raw JSON value of [decision].
             *
             * Unlike [decision], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("decision")
            @ExcludeMissing
            fun _decision(): JsonField<Decision> = decision

            /**
             * Returns the raw JSON value of [numbers].
             *
             * Unlike [numbers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("numbers")
            @ExcludeMissing
            fun _numbers(): JsonField<List<Number>> = numbers

            /**
             * Returns the raw JSON value of [orderId].
             *
             * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order_id") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

            /**
             * Returns the raw JSON value of [orderStatus].
             *
             * Unlike [orderStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("order_status")
            @ExcludeMissing
            fun _orderStatus(): JsonField<OrderStatus> = orderStatus

            /**
             * Returns the raw JSON value of [profileId].
             *
             * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("profile_id")
            @ExcludeMissing
            fun _profileId(): JsonField<String> = profileId

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

                private var approvalDeadline: JsonField<Long> = JsonMissing.of()
                private var decision: JsonField<Decision> = JsonMissing.of()
                private var numbers: JsonField<MutableList<Number>>? = null
                private var orderId: JsonField<String> = JsonMissing.of()
                private var orderStatus: JsonField<OrderStatus> = JsonMissing.of()
                private var profileId: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    approvalDeadline = payload.approvalDeadline
                    decision = payload.decision
                    numbers = payload.numbers.map { it.toMutableList() }
                    orderId = payload.orderId
                    orderStatus = payload.orderStatus
                    profileId = payload.profileId
                    userId = payload.userId
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /**
                 * Unix timestamp (seconds) by which the losing organization must respond before
                 * auto-approval. Populated on internal-transfer events once an approval window has
                 * been issued.
                 */
                fun approvalDeadline(approvalDeadline: Long?) =
                    approvalDeadline(JsonField.ofNullable(approvalDeadline))

                /**
                 * Alias for [Builder.approvalDeadline].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun approvalDeadline(approvalDeadline: Long) =
                    approvalDeadline(approvalDeadline as Long?)

                /**
                 * Alias for calling [Builder.approvalDeadline] with
                 * `approvalDeadline.orElse(null)`.
                 */
                fun approvalDeadline(approvalDeadline: Optional<Long>) =
                    approvalDeadline(approvalDeadline.getOrNull())

                /**
                 * Sets [Builder.approvalDeadline] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approvalDeadline] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun approvalDeadline(approvalDeadline: JsonField<Long>) = apply {
                    this.approvalDeadline = approvalDeadline
                }

                /**
                 * Approval decision for the internal transfer. Defaults to `pending` for
                 * non-internal-transfer events.
                 */
                fun decision(decision: Decision) = decision(JsonField.of(decision))

                /**
                 * Sets [Builder.decision] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.decision] with a well-typed [Decision] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

                fun numbers(numbers: List<Number>) = numbers(JsonField.of(numbers))

                /**
                 * Sets [Builder.numbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numbers] with a well-typed `List<Number>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun numbers(numbers: JsonField<List<Number>>) = apply {
                    this.numbers = numbers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Number] to [numbers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addNumber(number: Number) = apply {
                    numbers =
                        (numbers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("numbers", it).add(number)
                        }
                }

                /** The ID of the hosted number order. */
                fun orderId(orderId: String) = orderId(JsonField.of(orderId))

                /**
                 * Sets [Builder.orderId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

                /** Current status of the order. */
                fun orderStatus(orderStatus: OrderStatus) = orderStatus(JsonField.of(orderStatus))

                /**
                 * Sets [Builder.orderStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderStatus] with a well-typed [OrderStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun orderStatus(orderStatus: JsonField<OrderStatus>) = apply {
                    this.orderStatus = orderStatus
                }

                /** The messaging profile associated with the order. */
                fun profileId(profileId: String) = profileId(JsonField.of(profileId))

                /**
                 * Sets [Builder.profileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profileId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

                /** The organization that owns the order. */
                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
                        approvalDeadline,
                        decision,
                        (numbers ?: JsonMissing.of()).map { it.toImmutable() },
                        orderId,
                        orderStatus,
                        profileId,
                        userId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                approvalDeadline()
                decision().ifPresent { it.validate() }
                numbers().ifPresent { it.forEach { it.validate() } }
                orderId()
                orderStatus().ifPresent { it.validate() }
                profileId()
                userId()
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
                (if (approvalDeadline.asKnown().isPresent) 1 else 0) +
                    (decision.asKnown().getOrNull()?.validity() ?: 0) +
                    (numbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (orderId.asKnown().isPresent) 1 else 0) +
                    (orderStatus.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (profileId.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0)

            /**
             * Approval decision for the internal transfer. Defaults to `pending` for
             * non-internal-transfer events.
             */
            class Decision @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val PENDING = of("pending")

                    @JvmField val APPROVED = of("approved")

                    @JvmField val REJECTED = of("rejected")

                    @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
                }

                /** An enum containing [Decision]'s known values. */
                enum class Known {
                    PENDING,
                    APPROVED,
                    REJECTED,
                }

                /**
                 * An enum containing [Decision]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Decision] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PENDING,
                    APPROVED,
                    REJECTED,
                    /**
                     * An enum member indicating that [Decision] was instantiated with an unknown
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
                        PENDING -> Value.PENDING
                        APPROVED -> Value.APPROVED
                        REJECTED -> Value.REJECTED
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
                        PENDING -> Known.PENDING
                        APPROVED -> Known.APPROVED
                        REJECTED -> Known.REJECTED
                        else -> throw TelnyxInvalidDataException("Unknown Decision: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Decision = apply {
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

                    return other is Decision && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Number
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val status: JsonField<Status>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<Status> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(status, value, mutableMapOf())

                /**
                 * Current status of this phone number within the order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun status(): Optional<Status> = status.getOptional("status")

                /**
                 * Phone number in +E.164 format.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                    /** Returns a mutable builder for constructing an instance of [Number]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Number]. */
                class Builder internal constructor() {

                    private var status: JsonField<Status> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(number: Number) = apply {
                        status = number.status
                        value = number.value
                        additionalProperties = number.additionalProperties.toMutableMap()
                    }

                    /** Current status of this phone number within the order. */
                    fun status(status: Status) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [Status] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    /** Phone number in +E.164 format. */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Number].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Number = Number(status, value, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Number = apply {
                    if (validated) {
                        return@apply
                    }

                    status().ifPresent { it.validate() }
                    value()
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
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                /** Current status of this phone number within the order. */
                class Status
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DELETED = of("deleted")

                        @JvmField val FAILED = of("failed")

                        @JvmField val FAILED_ACTIVATION = of("failed_activation")

                        @JvmField val FAILED_CARRIER_REJECTED = of("failed_carrier_rejected")

                        @JvmField val FAILED_INELIGIBLE_CARRIER = of("failed_ineligible_carrier")

                        @JvmField
                        val FAILED_NUMBER_ALREADY_HOSTED = of("failed_number_already_hosted")

                        @JvmField val FAILED_NUMBER_NOT_FOUND = of("failed_number_not_found")

                        @JvmField
                        val FAILED_OWNERSHIP_VERIFICATION = of("failed_ownership_verification")

                        @JvmField val FAILED_TIMEOUT = of("failed_timeout")

                        @JvmField val OWNERSHIP_SUCCESSFUL = of("ownership_successful")

                        @JvmField val PENDING = of("pending")

                        @JvmField val PROVISIONING = of("provisioning")

                        @JvmField val SUCCESSFUL = of("successful")

                        @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                    }

                    /** An enum containing [Status]'s known values. */
                    enum class Known {
                        DELETED,
                        FAILED,
                        FAILED_ACTIVATION,
                        FAILED_CARRIER_REJECTED,
                        FAILED_INELIGIBLE_CARRIER,
                        FAILED_NUMBER_ALREADY_HOSTED,
                        FAILED_NUMBER_NOT_FOUND,
                        FAILED_OWNERSHIP_VERIFICATION,
                        FAILED_TIMEOUT,
                        OWNERSHIP_SUCCESSFUL,
                        PENDING,
                        PROVISIONING,
                        SUCCESSFUL,
                    }

                    /**
                     * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Status] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DELETED,
                        FAILED,
                        FAILED_ACTIVATION,
                        FAILED_CARRIER_REJECTED,
                        FAILED_INELIGIBLE_CARRIER,
                        FAILED_NUMBER_ALREADY_HOSTED,
                        FAILED_NUMBER_NOT_FOUND,
                        FAILED_OWNERSHIP_VERIFICATION,
                        FAILED_TIMEOUT,
                        OWNERSHIP_SUCCESSFUL,
                        PENDING,
                        PROVISIONING,
                        SUCCESSFUL,
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
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DELETED -> Value.DELETED
                            FAILED -> Value.FAILED
                            FAILED_ACTIVATION -> Value.FAILED_ACTIVATION
                            FAILED_CARRIER_REJECTED -> Value.FAILED_CARRIER_REJECTED
                            FAILED_INELIGIBLE_CARRIER -> Value.FAILED_INELIGIBLE_CARRIER
                            FAILED_NUMBER_ALREADY_HOSTED -> Value.FAILED_NUMBER_ALREADY_HOSTED
                            FAILED_NUMBER_NOT_FOUND -> Value.FAILED_NUMBER_NOT_FOUND
                            FAILED_OWNERSHIP_VERIFICATION -> Value.FAILED_OWNERSHIP_VERIFICATION
                            FAILED_TIMEOUT -> Value.FAILED_TIMEOUT
                            OWNERSHIP_SUCCESSFUL -> Value.OWNERSHIP_SUCCESSFUL
                            PENDING -> Value.PENDING
                            PROVISIONING -> Value.PROVISIONING
                            SUCCESSFUL -> Value.SUCCESSFUL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DELETED -> Known.DELETED
                            FAILED -> Known.FAILED
                            FAILED_ACTIVATION -> Known.FAILED_ACTIVATION
                            FAILED_CARRIER_REJECTED -> Known.FAILED_CARRIER_REJECTED
                            FAILED_INELIGIBLE_CARRIER -> Known.FAILED_INELIGIBLE_CARRIER
                            FAILED_NUMBER_ALREADY_HOSTED -> Known.FAILED_NUMBER_ALREADY_HOSTED
                            FAILED_NUMBER_NOT_FOUND -> Known.FAILED_NUMBER_NOT_FOUND
                            FAILED_OWNERSHIP_VERIFICATION -> Known.FAILED_OWNERSHIP_VERIFICATION
                            FAILED_TIMEOUT -> Known.FAILED_TIMEOUT
                            OWNERSHIP_SUCCESSFUL -> Known.OWNERSHIP_SUCCESSFUL
                            PENDING -> Known.PENDING
                            PROVISIONING -> Known.PROVISIONING
                            SUCCESSFUL -> Known.SUCCESSFUL
                            else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is Number &&
                        status == other.status &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(status, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Number{status=$status, value=$value, additionalProperties=$additionalProperties}"
            }

            /** Current status of the order. */
            class OrderStatus
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

                    @JvmField val PENDING = of("pending")

                    @JvmField val PROVISIONING = of("provisioning")

                    @JvmField val SUCCESSFUL = of("successful")

                    @JvmField val FAILED = of("failed")

                    @JvmField val DELETED = of("deleted")

                    @JvmField val CARRIER_REJECTED = of("carrier_rejected")

                    @JvmField val COMPLIANCE_REVIEW_FAILED = of("compliance_review_failed")

                    @JvmField val INCOMPLETE_DOCUMENTATION = of("incomplete_documentation")

                    @JvmField
                    val INCORRECT_BILLING_INFORMATION = of("incorrect_billing_information")

                    @JvmField val INELIGIBLE_CARRIER = of("ineligible_carrier")

                    @JvmField val LOA_FILE_INVALID = of("loa_file_invalid")

                    @JvmField val LOA_FILE_SUCCESSFUL = of("loa_file_successful")

                    @JvmStatic fun of(value: String) = OrderStatus(JsonField.of(value))
                }

                /** An enum containing [OrderStatus]'s known values. */
                enum class Known {
                    PENDING,
                    PROVISIONING,
                    SUCCESSFUL,
                    FAILED,
                    DELETED,
                    CARRIER_REJECTED,
                    COMPLIANCE_REVIEW_FAILED,
                    INCOMPLETE_DOCUMENTATION,
                    INCORRECT_BILLING_INFORMATION,
                    INELIGIBLE_CARRIER,
                    LOA_FILE_INVALID,
                    LOA_FILE_SUCCESSFUL,
                }

                /**
                 * An enum containing [OrderStatus]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [OrderStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PENDING,
                    PROVISIONING,
                    SUCCESSFUL,
                    FAILED,
                    DELETED,
                    CARRIER_REJECTED,
                    COMPLIANCE_REVIEW_FAILED,
                    INCOMPLETE_DOCUMENTATION,
                    INCORRECT_BILLING_INFORMATION,
                    INELIGIBLE_CARRIER,
                    LOA_FILE_INVALID,
                    LOA_FILE_SUCCESSFUL,
                    /**
                     * An enum member indicating that [OrderStatus] was instantiated with an unknown
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
                        PENDING -> Value.PENDING
                        PROVISIONING -> Value.PROVISIONING
                        SUCCESSFUL -> Value.SUCCESSFUL
                        FAILED -> Value.FAILED
                        DELETED -> Value.DELETED
                        CARRIER_REJECTED -> Value.CARRIER_REJECTED
                        COMPLIANCE_REVIEW_FAILED -> Value.COMPLIANCE_REVIEW_FAILED
                        INCOMPLETE_DOCUMENTATION -> Value.INCOMPLETE_DOCUMENTATION
                        INCORRECT_BILLING_INFORMATION -> Value.INCORRECT_BILLING_INFORMATION
                        INELIGIBLE_CARRIER -> Value.INELIGIBLE_CARRIER
                        LOA_FILE_INVALID -> Value.LOA_FILE_INVALID
                        LOA_FILE_SUCCESSFUL -> Value.LOA_FILE_SUCCESSFUL
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
                        PENDING -> Known.PENDING
                        PROVISIONING -> Known.PROVISIONING
                        SUCCESSFUL -> Known.SUCCESSFUL
                        FAILED -> Known.FAILED
                        DELETED -> Known.DELETED
                        CARRIER_REJECTED -> Known.CARRIER_REJECTED
                        COMPLIANCE_REVIEW_FAILED -> Known.COMPLIANCE_REVIEW_FAILED
                        INCOMPLETE_DOCUMENTATION -> Known.INCOMPLETE_DOCUMENTATION
                        INCORRECT_BILLING_INFORMATION -> Known.INCORRECT_BILLING_INFORMATION
                        INELIGIBLE_CARRIER -> Known.INELIGIBLE_CARRIER
                        LOA_FILE_INVALID -> Known.LOA_FILE_INVALID
                        LOA_FILE_SUCCESSFUL -> Known.LOA_FILE_SUCCESSFUL
                        else -> throw TelnyxInvalidDataException("Unknown OrderStatus: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): OrderStatus = apply {
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

                    return other is OrderStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    approvalDeadline == other.approvalDeadline &&
                    decision == other.decision &&
                    numbers == other.numbers &&
                    orderId == other.orderId &&
                    orderStatus == other.orderStatus &&
                    profileId == other.profileId &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    approvalDeadline,
                    decision,
                    numbers,
                    orderId,
                    orderStatus,
                    profileId,
                    userId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{approvalDeadline=$approvalDeadline, decision=$decision, numbers=$numbers, orderId=$orderId, orderStatus=$orderStatus, profileId=$profileId, userId=$userId, additionalProperties=$additionalProperties}"
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        return other is HostedNumberOrderEventWebhookEvent &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HostedNumberOrderEventWebhookEvent{data=$data, additionalProperties=$additionalProperties}"
}
