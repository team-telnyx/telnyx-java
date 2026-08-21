// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallPaymentCompletedWebhookEvent
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
         * [CallPaymentCompletedWebhookEvent].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallPaymentCompletedWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callPaymentCompletedWebhookEvent: CallPaymentCompletedWebhookEvent) =
            apply {
                data = callPaymentCompletedWebhookEvent.data
                additionalProperties =
                    callPaymentCompletedWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CallPaymentCompletedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallPaymentCompletedWebhookEvent =
            CallPaymentCompletedWebhookEvent(data, additionalProperties.toMutableMap())
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
    fun validate(): CallPaymentCompletedWebhookEvent = apply {
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

                @JvmField val CALL_PAYMENT_COMPLETED = of("call.payment.completed")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                CALL_PAYMENT_COMPLETED
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
                CALL_PAYMENT_COMPLETED,
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
                    CALL_PAYMENT_COMPLETED -> Value.CALL_PAYMENT_COMPLETED
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
                    CALL_PAYMENT_COMPLETED -> Known.CALL_PAYMENT_COMPLETED
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
            private val bankAccountNumber: JsonField<String>,
            private val bankAccountType: JsonField<String>,
            private val bankRoutingNumber: JsonField<String>,
            private val callControlId: JsonField<String>,
            private val callLegId: JsonField<String>,
            private val callSessionId: JsonField<String>,
            private val chargeId: JsonField<String>,
            private val clientState: JsonField<String>,
            private val connectionId: JsonField<String>,
            private val connectorError: JsonField<ConnectorError>,
            private val expirationDate: JsonField<String>,
            private val from: JsonField<String>,
            private val payErrorCode: JsonField<String>,
            private val paymentCardNumber: JsonField<String>,
            private val paymentCardPostalCode: JsonField<String>,
            private val paymentCardType: JsonField<PaymentCardType>,
            private val paymentConfirmationCode: JsonField<String>,
            private val paymentConnector: JsonField<String>,
            private val paymentError: JsonField<String>,
            private val paymentMethod: JsonField<PaymentMethod>,
            private val result: JsonField<Result>,
            private val securityCode: JsonField<String>,
            private val to: JsonField<String>,
            private val tokenId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
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
                @JsonProperty("charge_id")
                @ExcludeMissing
                chargeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("client_state")
                @ExcludeMissing
                clientState: JsonField<String> = JsonMissing.of(),
                @JsonProperty("connection_id")
                @ExcludeMissing
                connectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("connector_error")
                @ExcludeMissing
                connectorError: JsonField<ConnectorError> = JsonMissing.of(),
                @JsonProperty("expiration_date")
                @ExcludeMissing
                expirationDate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pay_error_code")
                @ExcludeMissing
                payErrorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_card_number")
                @ExcludeMissing
                paymentCardNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_card_postal_code")
                @ExcludeMissing
                paymentCardPostalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_card_type")
                @ExcludeMissing
                paymentCardType: JsonField<PaymentCardType> = JsonMissing.of(),
                @JsonProperty("payment_confirmation_code")
                @ExcludeMissing
                paymentConfirmationCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_connector")
                @ExcludeMissing
                paymentConnector: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_error")
                @ExcludeMissing
                paymentError: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_method")
                @ExcludeMissing
                paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
                @JsonProperty("result")
                @ExcludeMissing
                result: JsonField<Result> = JsonMissing.of(),
                @JsonProperty("security_code")
                @ExcludeMissing
                securityCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token_id")
                @ExcludeMissing
                tokenId: JsonField<String> = JsonMissing.of(),
            ) : this(
                bankAccountNumber,
                bankAccountType,
                bankRoutingNumber,
                callControlId,
                callLegId,
                callSessionId,
                chargeId,
                clientState,
                connectionId,
                connectorError,
                expirationDate,
                from,
                payErrorCode,
                paymentCardNumber,
                paymentCardPostalCode,
                paymentCardType,
                paymentConfirmationCode,
                paymentConnector,
                paymentError,
                paymentMethod,
                result,
                securityCode,
                to,
                tokenId,
                mutableMapOf(),
            )

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
             * Charge identifier returned for a successful charge transaction.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun chargeId(): Optional<String> = chargeId.getOptional("charge_id")

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
             * Additional connector error information, when supplied by the processor.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun connectorError(): Optional<ConnectorError> =
                connectorError.getOptional("connector_error")

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
             * Error code returned by the payment connector or processor.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payErrorCode(): Optional<String> = payErrorCode.getOptional("pay_error_code")

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
             * Payment confirmation code returned by the processor, when available.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentConfirmationCode(): Optional<String> =
                paymentConfirmationCode.getOptional("payment_confirmation_code")

            /**
             * Name of the Pay connector used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentConnector(): Optional<String> =
                paymentConnector.getOptional("payment_connector")

            /**
             * Step-level or processor error associated with the final result.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentError(): Optional<String> = paymentError.getOptional("payment_error")

            /**
             * Payment method being collected.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentMethod(): Optional<PaymentMethod> =
                paymentMethod.getOptional("payment_method")

            /**
             * Final Pay session result.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun result(): Optional<Result> = result.getOptional("result")

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
             * Token identifier returned for a successful tokenize transaction.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tokenId(): Optional<String> = tokenId.getOptional("token_id")

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
             * Returns the raw JSON value of [chargeId].
             *
             * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("charge_id") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

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
             * Returns the raw JSON value of [connectorError].
             *
             * Unlike [connectorError], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("connector_error")
            @ExcludeMissing
            fun _connectorError(): JsonField<ConnectorError> = connectorError

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
             * Returns the raw JSON value of [payErrorCode].
             *
             * Unlike [payErrorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pay_error_code")
            @ExcludeMissing
            fun _payErrorCode(): JsonField<String> = payErrorCode

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
             * Returns the raw JSON value of [paymentConfirmationCode].
             *
             * Unlike [paymentConfirmationCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_confirmation_code")
            @ExcludeMissing
            fun _paymentConfirmationCode(): JsonField<String> = paymentConfirmationCode

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
             * Returns the raw JSON value of [paymentError].
             *
             * Unlike [paymentError], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_error")
            @ExcludeMissing
            fun _paymentError(): JsonField<String> = paymentError

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
             * Returns the raw JSON value of [result].
             *
             * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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

            /**
             * Returns the raw JSON value of [tokenId].
             *
             * Unlike [tokenId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token_id") @ExcludeMissing fun _tokenId(): JsonField<String> = tokenId

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

                private var bankAccountNumber: JsonField<String> = JsonMissing.of()
                private var bankAccountType: JsonField<String> = JsonMissing.of()
                private var bankRoutingNumber: JsonField<String> = JsonMissing.of()
                private var callControlId: JsonField<String> = JsonMissing.of()
                private var callLegId: JsonField<String> = JsonMissing.of()
                private var callSessionId: JsonField<String> = JsonMissing.of()
                private var chargeId: JsonField<String> = JsonMissing.of()
                private var clientState: JsonField<String> = JsonMissing.of()
                private var connectionId: JsonField<String> = JsonMissing.of()
                private var connectorError: JsonField<ConnectorError> = JsonMissing.of()
                private var expirationDate: JsonField<String> = JsonMissing.of()
                private var from: JsonField<String> = JsonMissing.of()
                private var payErrorCode: JsonField<String> = JsonMissing.of()
                private var paymentCardNumber: JsonField<String> = JsonMissing.of()
                private var paymentCardPostalCode: JsonField<String> = JsonMissing.of()
                private var paymentCardType: JsonField<PaymentCardType> = JsonMissing.of()
                private var paymentConfirmationCode: JsonField<String> = JsonMissing.of()
                private var paymentConnector: JsonField<String> = JsonMissing.of()
                private var paymentError: JsonField<String> = JsonMissing.of()
                private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
                private var result: JsonField<Result> = JsonMissing.of()
                private var securityCode: JsonField<String> = JsonMissing.of()
                private var to: JsonField<String> = JsonMissing.of()
                private var tokenId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    bankAccountNumber = payload.bankAccountNumber
                    bankAccountType = payload.bankAccountType
                    bankRoutingNumber = payload.bankRoutingNumber
                    callControlId = payload.callControlId
                    callLegId = payload.callLegId
                    callSessionId = payload.callSessionId
                    chargeId = payload.chargeId
                    clientState = payload.clientState
                    connectionId = payload.connectionId
                    connectorError = payload.connectorError
                    expirationDate = payload.expirationDate
                    from = payload.from
                    payErrorCode = payload.payErrorCode
                    paymentCardNumber = payload.paymentCardNumber
                    paymentCardPostalCode = payload.paymentCardPostalCode
                    paymentCardType = payload.paymentCardType
                    paymentConfirmationCode = payload.paymentConfirmationCode
                    paymentConnector = payload.paymentConnector
                    paymentError = payload.paymentError
                    paymentMethod = payload.paymentMethod
                    result = payload.result
                    securityCode = payload.securityCode
                    to = payload.to
                    tokenId = payload.tokenId
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

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

                /** Charge identifier returned for a successful charge transaction. */
                fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

                /**
                 * Sets [Builder.chargeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chargeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

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

                /** Additional connector error information, when supplied by the processor. */
                fun connectorError(connectorError: ConnectorError) =
                    connectorError(JsonField.of(connectorError))

                /**
                 * Sets [Builder.connectorError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connectorError] with a well-typed
                 * [ConnectorError] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun connectorError(connectorError: JsonField<ConnectorError>) = apply {
                    this.connectorError = connectorError
                }

                /** Alias for calling [connectorError] with `ConnectorError.ofString(string)`. */
                fun connectorError(string: String) = connectorError(ConnectorError.ofString(string))

                /** Alias for calling [connectorError] with `ConnectorError.ofDetails(details)`. */
                fun connectorError(details: ConnectorError.ConnectorErrorDetails) =
                    connectorError(ConnectorError.ofDetails(details))

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

                /** Error code returned by the payment connector or processor. */
                fun payErrorCode(payErrorCode: String) = payErrorCode(JsonField.of(payErrorCode))

                /**
                 * Sets [Builder.payErrorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payErrorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payErrorCode(payErrorCode: JsonField<String>) = apply {
                    this.payErrorCode = payErrorCode
                }

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

                /** Payment confirmation code returned by the processor, when available. */
                fun paymentConfirmationCode(paymentConfirmationCode: String) =
                    paymentConfirmationCode(JsonField.of(paymentConfirmationCode))

                /**
                 * Sets [Builder.paymentConfirmationCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentConfirmationCode] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun paymentConfirmationCode(paymentConfirmationCode: JsonField<String>) = apply {
                    this.paymentConfirmationCode = paymentConfirmationCode
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

                /** Step-level or processor error associated with the final result. */
                fun paymentError(paymentError: String) = paymentError(JsonField.of(paymentError))

                /**
                 * Sets [Builder.paymentError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentError] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentError(paymentError: JsonField<String>) = apply {
                    this.paymentError = paymentError
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

                /** Final Pay session result. */
                fun result(result: Result) = result(JsonField.of(result))

                /**
                 * Sets [Builder.result] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.result] with a well-typed [Result] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun result(result: JsonField<Result>) = apply { this.result = result }

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

                /** Token identifier returned for a successful tokenize transaction. */
                fun tokenId(tokenId: String) = tokenId(JsonField.of(tokenId))

                /**
                 * Sets [Builder.tokenId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokenId(tokenId: JsonField<String>) = apply { this.tokenId = tokenId }

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
                        bankAccountNumber,
                        bankAccountType,
                        bankRoutingNumber,
                        callControlId,
                        callLegId,
                        callSessionId,
                        chargeId,
                        clientState,
                        connectionId,
                        connectorError,
                        expirationDate,
                        from,
                        payErrorCode,
                        paymentCardNumber,
                        paymentCardPostalCode,
                        paymentCardType,
                        paymentConfirmationCode,
                        paymentConnector,
                        paymentError,
                        paymentMethod,
                        result,
                        securityCode,
                        to,
                        tokenId,
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

                bankAccountNumber()
                bankAccountType()
                bankRoutingNumber()
                callControlId()
                callLegId()
                callSessionId()
                chargeId()
                clientState()
                connectionId()
                connectorError().ifPresent { it.validate() }
                expirationDate()
                from()
                payErrorCode()
                paymentCardNumber()
                paymentCardPostalCode()
                paymentCardType().ifPresent { it.validate() }
                paymentConfirmationCode()
                paymentConnector()
                paymentError()
                paymentMethod().ifPresent { it.validate() }
                result().ifPresent { it.validate() }
                securityCode()
                to()
                tokenId()
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
                (if (bankAccountNumber.asKnown().isPresent) 1 else 0) +
                    (if (bankAccountType.asKnown().isPresent) 1 else 0) +
                    (if (bankRoutingNumber.asKnown().isPresent) 1 else 0) +
                    (if (callControlId.asKnown().isPresent) 1 else 0) +
                    (if (callLegId.asKnown().isPresent) 1 else 0) +
                    (if (callSessionId.asKnown().isPresent) 1 else 0) +
                    (if (chargeId.asKnown().isPresent) 1 else 0) +
                    (if (clientState.asKnown().isPresent) 1 else 0) +
                    (if (connectionId.asKnown().isPresent) 1 else 0) +
                    (connectorError.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (expirationDate.asKnown().isPresent) 1 else 0) +
                    (if (from.asKnown().isPresent) 1 else 0) +
                    (if (payErrorCode.asKnown().isPresent) 1 else 0) +
                    (if (paymentCardNumber.asKnown().isPresent) 1 else 0) +
                    (if (paymentCardPostalCode.asKnown().isPresent) 1 else 0) +
                    (paymentCardType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (paymentConfirmationCode.asKnown().isPresent) 1 else 0) +
                    (if (paymentConnector.asKnown().isPresent) 1 else 0) +
                    (if (paymentError.asKnown().isPresent) 1 else 0) +
                    (paymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (result.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (securityCode.asKnown().isPresent) 1 else 0) +
                    (if (to.asKnown().isPresent) 1 else 0) +
                    (if (tokenId.asKnown().isPresent) 1 else 0)

            /** Additional connector error information, when supplied by the processor. */
            @JsonDeserialize(using = ConnectorError.Deserializer::class)
            @JsonSerialize(using = ConnectorError.Serializer::class)
            class ConnectorError
            private constructor(
                private val string: String? = null,
                private val details: ConnectorErrorDetails? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun details(): Optional<ConnectorErrorDetails> = Optional.ofNullable(details)

                fun isString(): Boolean = string != null

                fun isDetails(): Boolean = details != null

                fun asString(): String = string.getOrThrow("string")

                fun asDetails(): ConnectorErrorDetails = details.getOrThrow("details")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.telnyx.sdk.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = connectorError.accept(new ConnectorError.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitString(String string) {
                 *         return Optional.of(string.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        details != null -> visitor.visitDetails(details)
                        else -> visitor.unknown(_json)
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
                fun validate(): ConnectorError = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitDetails(details: ConnectorErrorDetails) {
                                details.validate()
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitDetails(details: ConnectorErrorDetails) =
                                details.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ConnectorError &&
                        string == other.string &&
                        details == other.details
                }

                override fun hashCode(): Int = Objects.hash(string, details)

                override fun toString(): String =
                    when {
                        string != null -> "ConnectorError{string=$string}"
                        details != null -> "ConnectorError{details=$details}"
                        _json != null -> "ConnectorError{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ConnectorError")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = ConnectorError(string = string)

                    @JvmStatic
                    fun ofDetails(details: ConnectorErrorDetails) =
                        ConnectorError(details = details)
                }

                /**
                 * An interface that defines how to map each variant of [ConnectorError] to a value
                 * of type [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitDetails(details: ConnectorErrorDetails): T

                    /**
                     * Maps an unknown variant of [ConnectorError] to a value of type [T].
                     *
                     * An instance of [ConnectorError] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown ConnectorError: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<ConnectorError>(ConnectorError::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): ConnectorError {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<ConnectorErrorDetails>())
                                        ?.let { ConnectorError(details = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        ConnectorError(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> ConnectorError(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<ConnectorError>(ConnectorError::class) {

                    override fun serialize(
                        value: ConnectorError,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.details != null -> generator.writeObject(value.details)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid ConnectorError")
                        }
                    }
                }

                class ConnectorErrorDetails
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [ConnectorErrorDetails].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ConnectorErrorDetails]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(connectorErrorDetails: ConnectorErrorDetails) = apply {
                            additionalProperties =
                                connectorErrorDetails.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [ConnectorErrorDetails].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ConnectorErrorDetails =
                            ConnectorErrorDetails(additionalProperties.toImmutable())
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
                    fun validate(): ConnectorErrorDetails = apply {
                        if (validated) {
                            return@apply
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ConnectorErrorDetails &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ConnectorErrorDetails{additionalProperties=$additionalProperties}"
                }
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

                    @JvmField val DISCOVER = of("discover")

                    @JvmField val DINERS_CLUB = of("diners-club")

                    @JvmField val JCB = of("jcb")

                    @JvmStatic fun of(value: String) = PaymentCardType(JsonField.of(value))
                }

                /** An enum containing [PaymentCardType]'s known values. */
                enum class Known {
                    VISA,
                    MASTERCARD,
                    AMEX,
                    DISCOVER,
                    DINERS_CLUB,
                    JCB,
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
                    DISCOVER,
                    DINERS_CLUB,
                    JCB,
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
                        DISCOVER -> Value.DISCOVER
                        DINERS_CLUB -> Value.DINERS_CLUB
                        JCB -> Value.JCB
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
                        DISCOVER -> Known.DISCOVER
                        DINERS_CLUB -> Known.DINERS_CLUB
                        JCB -> Known.JCB
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

            /** Final Pay session result. */
            class Result @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val PAYMENT_CONNECTOR_ERROR = of("payment-connector-error")

                    @JvmField val INTERNAL_ERROR = of("internal-error")

                    @JvmField val TOO_MANY_FAILED_ATTEMPTS = of("too-many-failed-attempts")

                    @JvmField val CANCELLED = of("cancelled")

                    @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                }

                /** An enum containing [Result]'s known values. */
                enum class Known {
                    SUCCESS,
                    PAYMENT_CONNECTOR_ERROR,
                    INTERNAL_ERROR,
                    TOO_MANY_FAILED_ATTEMPTS,
                    CANCELLED,
                }

                /**
                 * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Result] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUCCESS,
                    PAYMENT_CONNECTOR_ERROR,
                    INTERNAL_ERROR,
                    TOO_MANY_FAILED_ATTEMPTS,
                    CANCELLED,
                    /**
                     * An enum member indicating that [Result] was instantiated with an unknown
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
                        PAYMENT_CONNECTOR_ERROR -> Value.PAYMENT_CONNECTOR_ERROR
                        INTERNAL_ERROR -> Value.INTERNAL_ERROR
                        TOO_MANY_FAILED_ATTEMPTS -> Value.TOO_MANY_FAILED_ATTEMPTS
                        CANCELLED -> Value.CANCELLED
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
                        PAYMENT_CONNECTOR_ERROR -> Known.PAYMENT_CONNECTOR_ERROR
                        INTERNAL_ERROR -> Known.INTERNAL_ERROR
                        TOO_MANY_FAILED_ATTEMPTS -> Known.TOO_MANY_FAILED_ATTEMPTS
                        CANCELLED -> Known.CANCELLED
                        else -> throw TelnyxInvalidDataException("Unknown Result: $value")
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
                fun validate(): Result = apply {
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

                    return other is Result && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    bankAccountNumber == other.bankAccountNumber &&
                    bankAccountType == other.bankAccountType &&
                    bankRoutingNumber == other.bankRoutingNumber &&
                    callControlId == other.callControlId &&
                    callLegId == other.callLegId &&
                    callSessionId == other.callSessionId &&
                    chargeId == other.chargeId &&
                    clientState == other.clientState &&
                    connectionId == other.connectionId &&
                    connectorError == other.connectorError &&
                    expirationDate == other.expirationDate &&
                    from == other.from &&
                    payErrorCode == other.payErrorCode &&
                    paymentCardNumber == other.paymentCardNumber &&
                    paymentCardPostalCode == other.paymentCardPostalCode &&
                    paymentCardType == other.paymentCardType &&
                    paymentConfirmationCode == other.paymentConfirmationCode &&
                    paymentConnector == other.paymentConnector &&
                    paymentError == other.paymentError &&
                    paymentMethod == other.paymentMethod &&
                    result == other.result &&
                    securityCode == other.securityCode &&
                    to == other.to &&
                    tokenId == other.tokenId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    bankAccountNumber,
                    bankAccountType,
                    bankRoutingNumber,
                    callControlId,
                    callLegId,
                    callSessionId,
                    chargeId,
                    clientState,
                    connectionId,
                    connectorError,
                    expirationDate,
                    from,
                    payErrorCode,
                    paymentCardNumber,
                    paymentCardPostalCode,
                    paymentCardType,
                    paymentConfirmationCode,
                    paymentConnector,
                    paymentError,
                    paymentMethod,
                    result,
                    securityCode,
                    to,
                    tokenId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{bankAccountNumber=$bankAccountNumber, bankAccountType=$bankAccountType, bankRoutingNumber=$bankRoutingNumber, callControlId=$callControlId, callLegId=$callLegId, callSessionId=$callSessionId, chargeId=$chargeId, clientState=$clientState, connectionId=$connectionId, connectorError=$connectorError, expirationDate=$expirationDate, from=$from, payErrorCode=$payErrorCode, paymentCardNumber=$paymentCardNumber, paymentCardPostalCode=$paymentCardPostalCode, paymentCardType=$paymentCardType, paymentConfirmationCode=$paymentConfirmationCode, paymentConnector=$paymentConnector, paymentError=$paymentError, paymentMethod=$paymentMethod, result=$result, securityCode=$securityCode, to=$to, tokenId=$tokenId, additionalProperties=$additionalProperties}"
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

        return other is CallPaymentCompletedWebhookEvent &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallPaymentCompletedWebhookEvent{data=$data, additionalProperties=$additionalProperties}"
}
