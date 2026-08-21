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

class CallPaymentProgressWebhookEvent
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
         * [CallPaymentProgressWebhookEvent].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallPaymentProgressWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callPaymentProgressWebhookEvent: CallPaymentProgressWebhookEvent) =
            apply {
                data = callPaymentProgressWebhookEvent.data
                additionalProperties =
                    callPaymentProgressWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CallPaymentProgressWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallPaymentProgressWebhookEvent =
            CallPaymentProgressWebhookEvent(data, additionalProperties.toMutableMap())
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
    fun validate(): CallPaymentProgressWebhookEvent = apply {
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
         * The type of event being delivered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

        /**
         * ISO 8601 datetime when the event occurred.
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

            /** ISO 8601 datetime when the event occurred. */
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

                @JvmField val CALL_PAYMENT_PROGRESS = of("call.payment.progress")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                CALL_PAYMENT_PROGRESS
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
                CALL_PAYMENT_PROGRESS,
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
                    CALL_PAYMENT_PROGRESS -> Value.CALL_PAYMENT_PROGRESS
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
                    CALL_PAYMENT_PROGRESS -> Known.CALL_PAYMENT_PROGRESS
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

        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val attempt: JsonField<Int>,
            private val bankAccountNumber: JsonField<String>,
            private val bankAccountType: JsonField<String>,
            private val bankRoutingNumber: JsonField<String>,
            private val callControlId: JsonField<String>,
            private val callLegId: JsonField<String>,
            private val callSessionId: JsonField<String>,
            private val clientState: JsonField<String>,
            private val connectionId: JsonField<String>,
            private val errorType: JsonField<ErrorType>,
            private val expirationDate: JsonField<String>,
            private val from: JsonField<String>,
            private val paymentCardNumber: JsonField<String>,
            private val paymentCardPostalCode: JsonField<String>,
            private val paymentCardType: JsonField<PaymentCardType>,
            private val paymentConnector: JsonField<String>,
            private val paymentMethod: JsonField<PaymentMethod>,
            private val paymentStatus: JsonField<PaymentStatus>,
            private val paymentStep: JsonField<PaymentStep>,
            private val securityCode: JsonField<String>,
            private val to: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("attempt") @ExcludeMissing attempt: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("bank_account_number")
                @ExcludeMissing
                bankAccountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bank_account_type")
                @ExcludeMissing
                bankAccountType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bank_routing_number")
                @ExcludeMissing
                bankRoutingNumber: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("error_type")
                @ExcludeMissing
                errorType: JsonField<ErrorType> = JsonMissing.of(),
                @JsonProperty("expiration_date")
                @ExcludeMissing
                expirationDate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_card_number")
                @ExcludeMissing
                paymentCardNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_card_postal_code")
                @ExcludeMissing
                paymentCardPostalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_card_type")
                @ExcludeMissing
                paymentCardType: JsonField<PaymentCardType> = JsonMissing.of(),
                @JsonProperty("payment_connector")
                @ExcludeMissing
                paymentConnector: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_method")
                @ExcludeMissing
                paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
                @JsonProperty("payment_status")
                @ExcludeMissing
                paymentStatus: JsonField<PaymentStatus> = JsonMissing.of(),
                @JsonProperty("payment_step")
                @ExcludeMissing
                paymentStep: JsonField<PaymentStep> = JsonMissing.of(),
                @JsonProperty("security_code")
                @ExcludeMissing
                securityCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            ) : this(
                attempt,
                bankAccountNumber,
                bankAccountType,
                bankRoutingNumber,
                callControlId,
                callLegId,
                callSessionId,
                clientState,
                connectionId,
                errorType,
                expirationDate,
                from,
                paymentCardNumber,
                paymentCardPostalCode,
                paymentCardType,
                paymentConnector,
                paymentMethod,
                paymentStatus,
                paymentStep,
                securityCode,
                to,
                mutableMapOf(),
            )

            /**
             * Current 1-based attempt number for the step.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attempt(): Optional<Int> = attempt.getOptional("attempt")

            /**
             * Masked bank account number with only the last two digits visible.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bankAccountNumber(): Optional<String> =
                bankAccountNumber.getOptional("bank_account_number")

            /**
             * Bank account type, when available.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bankAccountType(): Optional<String> =
                bankAccountType.getOptional("bank_account_type")

            /**
             * Bank routing number collected from the caller.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bankRoutingNumber(): Optional<String> =
                bankRoutingNumber.getOptional("bank_routing_number")

            /**
             * Call ID used to issue commands via Call Control API.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callControlId(): Optional<String> = callControlId.getOptional("call_control_id")

            /**
             * ID unique to the call leg.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callLegId(): Optional<String> = callLegId.getOptional("call_leg_id")

            /**
             * ID shared by related call legs in the same call session.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callSessionId(): Optional<String> = callSessionId.getOptional("call_session_id")

            /**
             * Base64-encoded state received from the command.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clientState(): Optional<String> = clientState.getOptional("client_state")

            /**
             * Call Control App ID used in the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

            /**
             * Step-level error when payment collection fails.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errorType(): Optional<ErrorType> = errorType.getOptional("error_type")

            /**
             * Card expiration date in MMYY format.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expirationDate(): Optional<String> = expirationDate.getOptional("expiration_date")

            /**
             * Number or SIP URI placing the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun from(): Optional<String> = from.getOptional("from")

            /**
             * Masked card number with only the last four digits visible.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentCardNumber(): Optional<String> =
                paymentCardNumber.getOptional("payment_card_number")

            /**
             * Billing postal code collected from the caller.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentCardPostalCode(): Optional<String> =
                paymentCardPostalCode.getOptional("payment_card_postal_code")

            /**
             * Detected card type. Present only for the recognized card brands listed below.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentCardType(): Optional<PaymentCardType> =
                paymentCardType.getOptional("payment_card_type")

            /**
             * Name of the Pay connector used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentConnector(): Optional<String> =
                paymentConnector.getOptional("payment_connector")

            /**
             * Payment method being collected.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentMethod(): Optional<PaymentMethod> =
                paymentMethod.getOptional("payment_method")

            /**
             * Status of the current payment step.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentStatus(): Optional<PaymentStatus> =
                paymentStatus.getOptional("payment_status")

            /**
             * Current payment collection or processing step.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentStep(): Optional<PaymentStep> = paymentStep.getOptional("payment_step")

            /**
             * Fully masked card security code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun securityCode(): Optional<String> = securityCode.getOptional("security_code")

            /**
             * Destination number or SIP URI of the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun to(): Optional<String> = to.getOptional("to")

            /**
             * Returns the raw JSON value of [attempt].
             *
             * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<Int> = attempt

            /**
             * Returns the raw JSON value of [bankAccountNumber].
             *
             * Unlike [bankAccountNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bank_account_number")
            @ExcludeMissing
            fun _bankAccountNumber(): JsonField<String> = bankAccountNumber

            /**
             * Returns the raw JSON value of [bankAccountType].
             *
             * Unlike [bankAccountType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bank_account_type")
            @ExcludeMissing
            fun _bankAccountType(): JsonField<String> = bankAccountType

            /**
             * Returns the raw JSON value of [bankRoutingNumber].
             *
             * Unlike [bankRoutingNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bank_routing_number")
            @ExcludeMissing
            fun _bankRoutingNumber(): JsonField<String> = bankRoutingNumber

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
             * Returns the raw JSON value of [errorType].
             *
             * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_type")
            @ExcludeMissing
            fun _errorType(): JsonField<ErrorType> = errorType

            /**
             * Returns the raw JSON value of [expirationDate].
             *
             * Unlike [expirationDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("expiration_date")
            @ExcludeMissing
            fun _expirationDate(): JsonField<String> = expirationDate

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

            /**
             * Returns the raw JSON value of [paymentCardNumber].
             *
             * Unlike [paymentCardNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_card_number")
            @ExcludeMissing
            fun _paymentCardNumber(): JsonField<String> = paymentCardNumber

            /**
             * Returns the raw JSON value of [paymentCardPostalCode].
             *
             * Unlike [paymentCardPostalCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_card_postal_code")
            @ExcludeMissing
            fun _paymentCardPostalCode(): JsonField<String> = paymentCardPostalCode

            /**
             * Returns the raw JSON value of [paymentCardType].
             *
             * Unlike [paymentCardType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_card_type")
            @ExcludeMissing
            fun _paymentCardType(): JsonField<PaymentCardType> = paymentCardType

            /**
             * Returns the raw JSON value of [paymentConnector].
             *
             * Unlike [paymentConnector], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_connector")
            @ExcludeMissing
            fun _paymentConnector(): JsonField<String> = paymentConnector

            /**
             * Returns the raw JSON value of [paymentMethod].
             *
             * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_method")
            @ExcludeMissing
            fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

            /**
             * Returns the raw JSON value of [paymentStatus].
             *
             * Unlike [paymentStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_status")
            @ExcludeMissing
            fun _paymentStatus(): JsonField<PaymentStatus> = paymentStatus

            /**
             * Returns the raw JSON value of [paymentStep].
             *
             * Unlike [paymentStep], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_step")
            @ExcludeMissing
            fun _paymentStep(): JsonField<PaymentStep> = paymentStep

            /**
             * Returns the raw JSON value of [securityCode].
             *
             * Unlike [securityCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("security_code")
            @ExcludeMissing
            fun _securityCode(): JsonField<String> = securityCode

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

                private var attempt: JsonField<Int> = JsonMissing.of()
                private var bankAccountNumber: JsonField<String> = JsonMissing.of()
                private var bankAccountType: JsonField<String> = JsonMissing.of()
                private var bankRoutingNumber: JsonField<String> = JsonMissing.of()
                private var callControlId: JsonField<String> = JsonMissing.of()
                private var callLegId: JsonField<String> = JsonMissing.of()
                private var callSessionId: JsonField<String> = JsonMissing.of()
                private var clientState: JsonField<String> = JsonMissing.of()
                private var connectionId: JsonField<String> = JsonMissing.of()
                private var errorType: JsonField<ErrorType> = JsonMissing.of()
                private var expirationDate: JsonField<String> = JsonMissing.of()
                private var from: JsonField<String> = JsonMissing.of()
                private var paymentCardNumber: JsonField<String> = JsonMissing.of()
                private var paymentCardPostalCode: JsonField<String> = JsonMissing.of()
                private var paymentCardType: JsonField<PaymentCardType> = JsonMissing.of()
                private var paymentConnector: JsonField<String> = JsonMissing.of()
                private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
                private var paymentStatus: JsonField<PaymentStatus> = JsonMissing.of()
                private var paymentStep: JsonField<PaymentStep> = JsonMissing.of()
                private var securityCode: JsonField<String> = JsonMissing.of()
                private var to: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    attempt = payload.attempt
                    bankAccountNumber = payload.bankAccountNumber
                    bankAccountType = payload.bankAccountType
                    bankRoutingNumber = payload.bankRoutingNumber
                    callControlId = payload.callControlId
                    callLegId = payload.callLegId
                    callSessionId = payload.callSessionId
                    clientState = payload.clientState
                    connectionId = payload.connectionId
                    errorType = payload.errorType
                    expirationDate = payload.expirationDate
                    from = payload.from
                    paymentCardNumber = payload.paymentCardNumber
                    paymentCardPostalCode = payload.paymentCardPostalCode
                    paymentCardType = payload.paymentCardType
                    paymentConnector = payload.paymentConnector
                    paymentMethod = payload.paymentMethod
                    paymentStatus = payload.paymentStatus
                    paymentStep = payload.paymentStep
                    securityCode = payload.securityCode
                    to = payload.to
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** Current 1-based attempt number for the step. */
                fun attempt(attempt: Int) = attempt(JsonField.of(attempt))

                /**
                 * Sets [Builder.attempt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attempt] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun attempt(attempt: JsonField<Int>) = apply { this.attempt = attempt }

                /** Masked bank account number with only the last two digits visible. */
                fun bankAccountNumber(bankAccountNumber: String) =
                    bankAccountNumber(JsonField.of(bankAccountNumber))

                /**
                 * Sets [Builder.bankAccountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankAccountNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun bankAccountNumber(bankAccountNumber: JsonField<String>) = apply {
                    this.bankAccountNumber = bankAccountNumber
                }

                /** Bank account type, when available. */
                fun bankAccountType(bankAccountType: String) =
                    bankAccountType(JsonField.of(bankAccountType))

                /**
                 * Sets [Builder.bankAccountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankAccountType] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun bankAccountType(bankAccountType: JsonField<String>) = apply {
                    this.bankAccountType = bankAccountType
                }

                /** Bank routing number collected from the caller. */
                fun bankRoutingNumber(bankRoutingNumber: String) =
                    bankRoutingNumber(JsonField.of(bankRoutingNumber))

                /**
                 * Sets [Builder.bankRoutingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankRoutingNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun bankRoutingNumber(bankRoutingNumber: JsonField<String>) = apply {
                    this.bankRoutingNumber = bankRoutingNumber
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

                /** ID unique to the call leg. */
                fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

                /**
                 * Sets [Builder.callLegId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callLegId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

                /** ID shared by related call legs in the same call session. */
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

                /** Base64-encoded state received from the command. */
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

                /** Call Control App ID used in the call. */
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

                /** Step-level error when payment collection fails. */
                fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

                /**
                 * Sets [Builder.errorType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorType] with a well-typed [ErrorType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorType(errorType: JsonField<ErrorType>) = apply {
                    this.errorType = errorType
                }

                /** Card expiration date in MMYY format. */
                fun expirationDate(expirationDate: String) =
                    expirationDate(JsonField.of(expirationDate))

                /**
                 * Sets [Builder.expirationDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expirationDate] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expirationDate(expirationDate: JsonField<String>) = apply {
                    this.expirationDate = expirationDate
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

                /** Masked card number with only the last four digits visible. */
                fun paymentCardNumber(paymentCardNumber: String) =
                    paymentCardNumber(JsonField.of(paymentCardNumber))

                /**
                 * Sets [Builder.paymentCardNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentCardNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentCardNumber(paymentCardNumber: JsonField<String>) = apply {
                    this.paymentCardNumber = paymentCardNumber
                }

                /** Billing postal code collected from the caller. */
                fun paymentCardPostalCode(paymentCardPostalCode: String) =
                    paymentCardPostalCode(JsonField.of(paymentCardPostalCode))

                /**
                 * Sets [Builder.paymentCardPostalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentCardPostalCode] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun paymentCardPostalCode(paymentCardPostalCode: JsonField<String>) = apply {
                    this.paymentCardPostalCode = paymentCardPostalCode
                }

                /** Detected card type. Present only for the recognized card brands listed below. */
                fun paymentCardType(paymentCardType: PaymentCardType) =
                    paymentCardType(JsonField.of(paymentCardType))

                /**
                 * Sets [Builder.paymentCardType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentCardType] with a well-typed
                 * [PaymentCardType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun paymentCardType(paymentCardType: JsonField<PaymentCardType>) = apply {
                    this.paymentCardType = paymentCardType
                }

                /** Name of the Pay connector used. */
                fun paymentConnector(paymentConnector: String) =
                    paymentConnector(JsonField.of(paymentConnector))

                /**
                 * Sets [Builder.paymentConnector] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentConnector] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentConnector(paymentConnector: JsonField<String>) = apply {
                    this.paymentConnector = paymentConnector
                }

                /** Payment method being collected. */
                fun paymentMethod(paymentMethod: PaymentMethod) =
                    paymentMethod(JsonField.of(paymentMethod))

                /**
                 * Sets [Builder.paymentMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
                    this.paymentMethod = paymentMethod
                }

                /** Status of the current payment step. */
                fun paymentStatus(paymentStatus: PaymentStatus) =
                    paymentStatus(JsonField.of(paymentStatus))

                /**
                 * Sets [Builder.paymentStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentStatus] with a well-typed [PaymentStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentStatus(paymentStatus: JsonField<PaymentStatus>) = apply {
                    this.paymentStatus = paymentStatus
                }

                /** Current payment collection or processing step. */
                fun paymentStep(paymentStep: PaymentStep) = paymentStep(JsonField.of(paymentStep))

                /**
                 * Sets [Builder.paymentStep] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentStep] with a well-typed [PaymentStep]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentStep(paymentStep: JsonField<PaymentStep>) = apply {
                    this.paymentStep = paymentStep
                }

                /** Fully masked card security code. */
                fun securityCode(securityCode: String) = securityCode(JsonField.of(securityCode))

                /**
                 * Sets [Builder.securityCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.securityCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun securityCode(securityCode: JsonField<String>) = apply {
                    this.securityCode = securityCode
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
                        attempt,
                        bankAccountNumber,
                        bankAccountType,
                        bankRoutingNumber,
                        callControlId,
                        callLegId,
                        callSessionId,
                        clientState,
                        connectionId,
                        errorType,
                        expirationDate,
                        from,
                        paymentCardNumber,
                        paymentCardPostalCode,
                        paymentCardType,
                        paymentConnector,
                        paymentMethod,
                        paymentStatus,
                        paymentStep,
                        securityCode,
                        to,
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

                attempt()
                bankAccountNumber()
                bankAccountType()
                bankRoutingNumber()
                callControlId()
                callLegId()
                callSessionId()
                clientState()
                connectionId()
                errorType().ifPresent { it.validate() }
                expirationDate()
                from()
                paymentCardNumber()
                paymentCardPostalCode()
                paymentCardType().ifPresent { it.validate() }
                paymentConnector()
                paymentMethod().ifPresent { it.validate() }
                paymentStatus().ifPresent { it.validate() }
                paymentStep().ifPresent { it.validate() }
                securityCode()
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
                (if (attempt.asKnown().isPresent) 1 else 0) +
                    (if (bankAccountNumber.asKnown().isPresent) 1 else 0) +
                    (if (bankAccountType.asKnown().isPresent) 1 else 0) +
                    (if (bankRoutingNumber.asKnown().isPresent) 1 else 0) +
                    (if (callControlId.asKnown().isPresent) 1 else 0) +
                    (if (callLegId.asKnown().isPresent) 1 else 0) +
                    (if (callSessionId.asKnown().isPresent) 1 else 0) +
                    (if (clientState.asKnown().isPresent) 1 else 0) +
                    (if (connectionId.asKnown().isPresent) 1 else 0) +
                    (errorType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (expirationDate.asKnown().isPresent) 1 else 0) +
                    (if (from.asKnown().isPresent) 1 else 0) +
                    (if (paymentCardNumber.asKnown().isPresent) 1 else 0) +
                    (if (paymentCardPostalCode.asKnown().isPresent) 1 else 0) +
                    (paymentCardType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (paymentConnector.asKnown().isPresent) 1 else 0) +
                    (paymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (paymentStatus.asKnown().getOrNull()?.validity() ?: 0) +
                    (paymentStep.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (securityCode.asKnown().isPresent) 1 else 0) +
                    (if (to.asKnown().isPresent) 1 else 0)

            /** Step-level error when payment collection fails. */
            class ErrorType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TIMEOUT = of("timeout")

                    @JvmField val INVALID_CARD_NUMBER = of("invalid-card-number")

                    @JvmField val INVALID_CARD_TYPE = of("invalid-card-type")

                    @JvmField val INVALID_DATE = of("invalid-date")

                    @JvmField val INVALID_SECURITY_CODE = of("invalid-security-code")

                    @JvmField val INVALID_POSTAL_CODE = of("invalid-postal-code")

                    @JvmField val INVALID_BANK_ROUTING_NUMBER = of("invalid-bank-routing-number")

                    @JvmField val INVALID_BANK_ACCOUNT_NUMBER = of("invalid-bank-account-number")

                    @JvmField val INPUT_MATCHING_FAILED = of("input-matching-failed")

                    @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
                }

                /** An enum containing [ErrorType]'s known values. */
                enum class Known {
                    TIMEOUT,
                    INVALID_CARD_NUMBER,
                    INVALID_CARD_TYPE,
                    INVALID_DATE,
                    INVALID_SECURITY_CODE,
                    INVALID_POSTAL_CODE,
                    INVALID_BANK_ROUTING_NUMBER,
                    INVALID_BANK_ACCOUNT_NUMBER,
                    INPUT_MATCHING_FAILED,
                }

                /**
                 * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ErrorType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TIMEOUT,
                    INVALID_CARD_NUMBER,
                    INVALID_CARD_TYPE,
                    INVALID_DATE,
                    INVALID_SECURITY_CODE,
                    INVALID_POSTAL_CODE,
                    INVALID_BANK_ROUTING_NUMBER,
                    INVALID_BANK_ACCOUNT_NUMBER,
                    INPUT_MATCHING_FAILED,
                    /**
                     * An enum member indicating that [ErrorType] was instantiated with an unknown
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
                        TIMEOUT -> Value.TIMEOUT
                        INVALID_CARD_NUMBER -> Value.INVALID_CARD_NUMBER
                        INVALID_CARD_TYPE -> Value.INVALID_CARD_TYPE
                        INVALID_DATE -> Value.INVALID_DATE
                        INVALID_SECURITY_CODE -> Value.INVALID_SECURITY_CODE
                        INVALID_POSTAL_CODE -> Value.INVALID_POSTAL_CODE
                        INVALID_BANK_ROUTING_NUMBER -> Value.INVALID_BANK_ROUTING_NUMBER
                        INVALID_BANK_ACCOUNT_NUMBER -> Value.INVALID_BANK_ACCOUNT_NUMBER
                        INPUT_MATCHING_FAILED -> Value.INPUT_MATCHING_FAILED
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
                        TIMEOUT -> Known.TIMEOUT
                        INVALID_CARD_NUMBER -> Known.INVALID_CARD_NUMBER
                        INVALID_CARD_TYPE -> Known.INVALID_CARD_TYPE
                        INVALID_DATE -> Known.INVALID_DATE
                        INVALID_SECURITY_CODE -> Known.INVALID_SECURITY_CODE
                        INVALID_POSTAL_CODE -> Known.INVALID_POSTAL_CODE
                        INVALID_BANK_ROUTING_NUMBER -> Known.INVALID_BANK_ROUTING_NUMBER
                        INVALID_BANK_ACCOUNT_NUMBER -> Known.INVALID_BANK_ACCOUNT_NUMBER
                        INPUT_MATCHING_FAILED -> Known.INPUT_MATCHING_FAILED
                        else -> throw TelnyxInvalidDataException("Unknown ErrorType: $value")
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
                fun validate(): ErrorType = apply {
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

                    return other is ErrorType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Detected card type. Present only for the recognized card brands listed below. */
            class PaymentCardType
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

                    @JvmField val VISA = of("visa")

                    @JvmField val MASTERCARD = of("mastercard")

                    @JvmField val AMEX = of("amex")

                    @JvmField val OPTIMA = of("optima")

                    @JvmField val DISCOVER = of("discover")

                    @JvmField val DINERS_CLUB = of("diners-club")

                    @JvmField val JCB = of("jcb")

                    @JvmField val MAESTRO = of("maestro")

                    @JvmField val ENROUTE = of("enroute")

                    @JvmStatic fun of(value: String) = PaymentCardType(JsonField.of(value))
                }

                /** An enum containing [PaymentCardType]'s known values. */
                enum class Known {
                    VISA,
                    MASTERCARD,
                    AMEX,
                    OPTIMA,
                    DISCOVER,
                    DINERS_CLUB,
                    JCB,
                    MAESTRO,
                    ENROUTE,
                }

                /**
                 * An enum containing [PaymentCardType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PaymentCardType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    VISA,
                    MASTERCARD,
                    AMEX,
                    OPTIMA,
                    DISCOVER,
                    DINERS_CLUB,
                    JCB,
                    MAESTRO,
                    ENROUTE,
                    /**
                     * An enum member indicating that [PaymentCardType] was instantiated with an
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
                        VISA -> Value.VISA
                        MASTERCARD -> Value.MASTERCARD
                        AMEX -> Value.AMEX
                        OPTIMA -> Value.OPTIMA
                        DISCOVER -> Value.DISCOVER
                        DINERS_CLUB -> Value.DINERS_CLUB
                        JCB -> Value.JCB
                        MAESTRO -> Value.MAESTRO
                        ENROUTE -> Value.ENROUTE
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
                        VISA -> Known.VISA
                        MASTERCARD -> Known.MASTERCARD
                        AMEX -> Known.AMEX
                        OPTIMA -> Known.OPTIMA
                        DISCOVER -> Known.DISCOVER
                        DINERS_CLUB -> Known.DINERS_CLUB
                        JCB -> Known.JCB
                        MAESTRO -> Known.MAESTRO
                        ENROUTE -> Known.ENROUTE
                        else -> throw TelnyxInvalidDataException("Unknown PaymentCardType: $value")
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
                fun validate(): PaymentCardType = apply {
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

                    return other is PaymentCardType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Payment method being collected. */
            class PaymentMethod
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

                    @JvmField val CREDIT_CARD = of("credit-card")

                    @JvmField val ACH_DEBIT = of("ach-debit")

                    @JvmStatic fun of(value: String) = PaymentMethod(JsonField.of(value))
                }

                /** An enum containing [PaymentMethod]'s known values. */
                enum class Known {
                    CREDIT_CARD,
                    ACH_DEBIT,
                }

                /**
                 * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREDIT_CARD,
                    ACH_DEBIT,
                    /**
                     * An enum member indicating that [PaymentMethod] was instantiated with an
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
                        CREDIT_CARD -> Value.CREDIT_CARD
                        ACH_DEBIT -> Value.ACH_DEBIT
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
                        CREDIT_CARD -> Known.CREDIT_CARD
                        ACH_DEBIT -> Known.ACH_DEBIT
                        else -> throw TelnyxInvalidDataException("Unknown PaymentMethod: $value")
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
                fun validate(): PaymentMethod = apply {
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

                    return other is PaymentMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Status of the current payment step. */
            class PaymentStatus
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

                    @JvmField val COMPLETED = of("completed")

                    @JvmField val FAILED = of("failed")

                    @JvmField val PROCESSING = of("processing")

                    @JvmStatic fun of(value: String) = PaymentStatus(JsonField.of(value))
                }

                /** An enum containing [PaymentStatus]'s known values. */
                enum class Known {
                    COMPLETED,
                    FAILED,
                    PROCESSING,
                }

                /**
                 * An enum containing [PaymentStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PaymentStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMPLETED,
                    FAILED,
                    PROCESSING,
                    /**
                     * An enum member indicating that [PaymentStatus] was instantiated with an
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
                        COMPLETED -> Value.COMPLETED
                        FAILED -> Value.FAILED
                        PROCESSING -> Value.PROCESSING
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
                        COMPLETED -> Known.COMPLETED
                        FAILED -> Known.FAILED
                        PROCESSING -> Known.PROCESSING
                        else -> throw TelnyxInvalidDataException("Unknown PaymentStatus: $value")
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
                fun validate(): PaymentStatus = apply {
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

                    return other is PaymentStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Current payment collection or processing step. */
            class PaymentStep
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

                    @JvmField val PAYMENT_CARD_NUMBER = of("payment-card-number")

                    @JvmField val EXPIRATION_DATE = of("expiration-date")

                    @JvmField val POSTAL_CODE = of("postal-code")

                    @JvmField val SECURITY_CODE = of("security-code")

                    @JvmField val BANK_ROUTING_NUMBER = of("bank-routing-number")

                    @JvmField val BANK_ACCOUNT_NUMBER = of("bank-account-number")

                    @JvmField val PAYMENT_PROCESSING = of("payment-processing")

                    @JvmStatic fun of(value: String) = PaymentStep(JsonField.of(value))
                }

                /** An enum containing [PaymentStep]'s known values. */
                enum class Known {
                    PAYMENT_CARD_NUMBER,
                    EXPIRATION_DATE,
                    POSTAL_CODE,
                    SECURITY_CODE,
                    BANK_ROUTING_NUMBER,
                    BANK_ACCOUNT_NUMBER,
                    PAYMENT_PROCESSING,
                }

                /**
                 * An enum containing [PaymentStep]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [PaymentStep] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PAYMENT_CARD_NUMBER,
                    EXPIRATION_DATE,
                    POSTAL_CODE,
                    SECURITY_CODE,
                    BANK_ROUTING_NUMBER,
                    BANK_ACCOUNT_NUMBER,
                    PAYMENT_PROCESSING,
                    /**
                     * An enum member indicating that [PaymentStep] was instantiated with an unknown
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
                        PAYMENT_CARD_NUMBER -> Value.PAYMENT_CARD_NUMBER
                        EXPIRATION_DATE -> Value.EXPIRATION_DATE
                        POSTAL_CODE -> Value.POSTAL_CODE
                        SECURITY_CODE -> Value.SECURITY_CODE
                        BANK_ROUTING_NUMBER -> Value.BANK_ROUTING_NUMBER
                        BANK_ACCOUNT_NUMBER -> Value.BANK_ACCOUNT_NUMBER
                        PAYMENT_PROCESSING -> Value.PAYMENT_PROCESSING
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
                        PAYMENT_CARD_NUMBER -> Known.PAYMENT_CARD_NUMBER
                        EXPIRATION_DATE -> Known.EXPIRATION_DATE
                        POSTAL_CODE -> Known.POSTAL_CODE
                        SECURITY_CODE -> Known.SECURITY_CODE
                        BANK_ROUTING_NUMBER -> Known.BANK_ROUTING_NUMBER
                        BANK_ACCOUNT_NUMBER -> Known.BANK_ACCOUNT_NUMBER
                        PAYMENT_PROCESSING -> Known.PAYMENT_PROCESSING
                        else -> throw TelnyxInvalidDataException("Unknown PaymentStep: $value")
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
                fun validate(): PaymentStep = apply {
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

                    return other is PaymentStep && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    attempt == other.attempt &&
                    bankAccountNumber == other.bankAccountNumber &&
                    bankAccountType == other.bankAccountType &&
                    bankRoutingNumber == other.bankRoutingNumber &&
                    callControlId == other.callControlId &&
                    callLegId == other.callLegId &&
                    callSessionId == other.callSessionId &&
                    clientState == other.clientState &&
                    connectionId == other.connectionId &&
                    errorType == other.errorType &&
                    expirationDate == other.expirationDate &&
                    from == other.from &&
                    paymentCardNumber == other.paymentCardNumber &&
                    paymentCardPostalCode == other.paymentCardPostalCode &&
                    paymentCardType == other.paymentCardType &&
                    paymentConnector == other.paymentConnector &&
                    paymentMethod == other.paymentMethod &&
                    paymentStatus == other.paymentStatus &&
                    paymentStep == other.paymentStep &&
                    securityCode == other.securityCode &&
                    to == other.to &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    attempt,
                    bankAccountNumber,
                    bankAccountType,
                    bankRoutingNumber,
                    callControlId,
                    callLegId,
                    callSessionId,
                    clientState,
                    connectionId,
                    errorType,
                    expirationDate,
                    from,
                    paymentCardNumber,
                    paymentCardPostalCode,
                    paymentCardType,
                    paymentConnector,
                    paymentMethod,
                    paymentStatus,
                    paymentStep,
                    securityCode,
                    to,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{attempt=$attempt, bankAccountNumber=$bankAccountNumber, bankAccountType=$bankAccountType, bankRoutingNumber=$bankRoutingNumber, callControlId=$callControlId, callLegId=$callLegId, callSessionId=$callSessionId, clientState=$clientState, connectionId=$connectionId, errorType=$errorType, expirationDate=$expirationDate, from=$from, paymentCardNumber=$paymentCardNumber, paymentCardPostalCode=$paymentCardPostalCode, paymentCardType=$paymentCardType, paymentConnector=$paymentConnector, paymentMethod=$paymentMethod, paymentStatus=$paymentStatus, paymentStep=$paymentStep, securityCode=$securityCode, to=$to, additionalProperties=$additionalProperties}"
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

        return other is CallPaymentProgressWebhookEvent &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallPaymentProgressWebhookEvent{data=$data, additionalProperties=$additionalProperties}"
}
