// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

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

class PortingEventDeletedPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val availableNotificationMethods: JsonField<List<AvailableNotificationMethod>>,
    private val eventType: JsonField<EventType>,
    private val payload: JsonField<Payload>,
    private val payloadStatus: JsonField<PayloadStatus>,
    private val portingOrderId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("available_notification_methods")
        @ExcludeMissing
        availableNotificationMethods: JsonField<List<AvailableNotificationMethod>> =
            JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
        @JsonProperty("payload_status")
        @ExcludeMissing
        payloadStatus: JsonField<PayloadStatus> = JsonMissing.of(),
        @JsonProperty("porting_order_id")
        @ExcludeMissing
        portingOrderId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        availableNotificationMethods,
        eventType,
        payload,
        payloadStatus,
        portingOrderId,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies the event.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Indicates the notification methods used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableNotificationMethods(): Optional<List<AvailableNotificationMethod>> =
        availableNotificationMethods.getOptional("available_notification_methods")

    /**
     * Identifies the event type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payload(): Optional<Payload> = payload.getOptional("payload")

    /**
     * The status of the payload generation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payloadStatus(): Optional<PayloadStatus> = payloadStatus.getOptional("payload_status")

    /**
     * Identifies the porting order associated with the event.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [availableNotificationMethods].
     *
     * Unlike [availableNotificationMethods], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("available_notification_methods")
    @ExcludeMissing
    fun _availableNotificationMethods(): JsonField<List<AvailableNotificationMethod>> =
        availableNotificationMethods

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

    /**
     * Returns the raw JSON value of [payloadStatus].
     *
     * Unlike [payloadStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload_status")
    @ExcludeMissing
    fun _payloadStatus(): JsonField<PayloadStatus> = payloadStatus

    /**
     * Returns the raw JSON value of [portingOrderId].
     *
     * Unlike [portingOrderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("porting_order_id")
    @ExcludeMissing
    fun _portingOrderId(): JsonField<String> = portingOrderId

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
         * Returns a mutable builder for constructing an instance of [PortingEventDeletedPayload].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingEventDeletedPayload]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var availableNotificationMethods:
            JsonField<MutableList<AvailableNotificationMethod>>? =
            null
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var payload: JsonField<Payload> = JsonMissing.of()
        private var payloadStatus: JsonField<PayloadStatus> = JsonMissing.of()
        private var portingOrderId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingEventDeletedPayload: PortingEventDeletedPayload) = apply {
            id = portingEventDeletedPayload.id
            availableNotificationMethods =
                portingEventDeletedPayload.availableNotificationMethods.map { it.toMutableList() }
            eventType = portingEventDeletedPayload.eventType
            payload = portingEventDeletedPayload.payload
            payloadStatus = portingEventDeletedPayload.payloadStatus
            portingOrderId = portingEventDeletedPayload.portingOrderId
            additionalProperties = portingEventDeletedPayload.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies the event. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Indicates the notification methods used. */
        fun availableNotificationMethods(
            availableNotificationMethods: List<AvailableNotificationMethod>
        ) = availableNotificationMethods(JsonField.of(availableNotificationMethods))

        /**
         * Sets [Builder.availableNotificationMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableNotificationMethods] with a well-typed
         * `List<AvailableNotificationMethod>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun availableNotificationMethods(
            availableNotificationMethods: JsonField<List<AvailableNotificationMethod>>
        ) = apply {
            this.availableNotificationMethods =
                availableNotificationMethods.map { it.toMutableList() }
        }

        /**
         * Adds a single [AvailableNotificationMethod] to [availableNotificationMethods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAvailableNotificationMethod(
            availableNotificationMethod: AvailableNotificationMethod
        ) = apply {
            availableNotificationMethods =
                (availableNotificationMethods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("availableNotificationMethods", it).add(availableNotificationMethod)
                }
        }

        /** Identifies the event type */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun payload(payload: Payload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [Payload] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

        /** The status of the payload generation. */
        fun payloadStatus(payloadStatus: PayloadStatus) = payloadStatus(JsonField.of(payloadStatus))

        /**
         * Sets [Builder.payloadStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadStatus] with a well-typed [PayloadStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payloadStatus(payloadStatus: JsonField<PayloadStatus>) = apply {
            this.payloadStatus = payloadStatus
        }

        /** Identifies the porting order associated with the event. */
        fun portingOrderId(portingOrderId: String) = portingOrderId(JsonField.of(portingOrderId))

        /**
         * Sets [Builder.portingOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portingOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun portingOrderId(portingOrderId: JsonField<String>) = apply {
            this.portingOrderId = portingOrderId
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
         * Returns an immutable instance of [PortingEventDeletedPayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingEventDeletedPayload =
            PortingEventDeletedPayload(
                id,
                (availableNotificationMethods ?: JsonMissing.of()).map { it.toImmutable() },
                eventType,
                payload,
                payloadStatus,
                portingOrderId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingEventDeletedPayload = apply {
        if (validated) {
            return@apply
        }

        id()
        availableNotificationMethods().ifPresent { it.forEach { it.validate() } }
        eventType().ifPresent { it.validate() }
        payload().ifPresent { it.validate() }
        payloadStatus().ifPresent { it.validate() }
        portingOrderId()
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
            (availableNotificationMethods.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (payload.asKnown().getOrNull()?.validity() ?: 0) +
            (payloadStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portingOrderId.asKnown().isPresent) 1 else 0)

    class AvailableNotificationMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EMAIL = of("email")

            @JvmField val WEBHOOK = of("webhook")

            @JvmField val WEBHOOK_V1 = of("webhook_v1")

            @JvmStatic fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
        }

        /** An enum containing [AvailableNotificationMethod]'s known values. */
        enum class Known {
            EMAIL,
            WEBHOOK,
            WEBHOOK_V1,
        }

        /**
         * An enum containing [AvailableNotificationMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AvailableNotificationMethod] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL,
            WEBHOOK,
            WEBHOOK_V1,
            /**
             * An enum member indicating that [AvailableNotificationMethod] was instantiated with an
             * unknown value.
             */
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
                EMAIL -> Value.EMAIL
                WEBHOOK -> Value.WEBHOOK
                WEBHOOK_V1 -> Value.WEBHOOK_V1
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
                EMAIL -> Known.EMAIL
                WEBHOOK -> Known.WEBHOOK
                WEBHOOK_V1 -> Known.WEBHOOK_V1
                else ->
                    throw TelnyxInvalidDataException("Unknown AvailableNotificationMethod: $value")
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

        fun validate(): AvailableNotificationMethod = apply {
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

            return other is AvailableNotificationMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Identifies the event type */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

            @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

            @JvmField val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

            @JvmField val PORTING_ORDER_STATUS_CHANGED = of("porting_order.status_changed")

            @JvmField
            val PORTING_ORDER_SHARING_TOKEN_EXPIRED = of("porting_order.sharing_token_expired")

            @JvmField val PORTING_ORDER_NEW_COMMENT = of("porting_order.new_comment")

            @JvmField val PORTING_ORDER_SPLIT = of("porting_order.split")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            PORTING_ORDER_DELETED,
            PORTING_ORDER_LOA_UPDATED,
            PORTING_ORDER_MESSAGING_CHANGED,
            PORTING_ORDER_STATUS_CHANGED,
            PORTING_ORDER_SHARING_TOKEN_EXPIRED,
            PORTING_ORDER_NEW_COMMENT,
            PORTING_ORDER_SPLIT,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PORTING_ORDER_DELETED,
            PORTING_ORDER_LOA_UPDATED,
            PORTING_ORDER_MESSAGING_CHANGED,
            PORTING_ORDER_STATUS_CHANGED,
            PORTING_ORDER_SHARING_TOKEN_EXPIRED,
            PORTING_ORDER_NEW_COMMENT,
            PORTING_ORDER_SPLIT,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
             */
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
                PORTING_ORDER_DELETED -> Value.PORTING_ORDER_DELETED
                PORTING_ORDER_LOA_UPDATED -> Value.PORTING_ORDER_LOA_UPDATED
                PORTING_ORDER_MESSAGING_CHANGED -> Value.PORTING_ORDER_MESSAGING_CHANGED
                PORTING_ORDER_STATUS_CHANGED -> Value.PORTING_ORDER_STATUS_CHANGED
                PORTING_ORDER_SHARING_TOKEN_EXPIRED -> Value.PORTING_ORDER_SHARING_TOKEN_EXPIRED
                PORTING_ORDER_NEW_COMMENT -> Value.PORTING_ORDER_NEW_COMMENT
                PORTING_ORDER_SPLIT -> Value.PORTING_ORDER_SPLIT
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
                PORTING_ORDER_DELETED -> Known.PORTING_ORDER_DELETED
                PORTING_ORDER_LOA_UPDATED -> Known.PORTING_ORDER_LOA_UPDATED
                PORTING_ORDER_MESSAGING_CHANGED -> Known.PORTING_ORDER_MESSAGING_CHANGED
                PORTING_ORDER_STATUS_CHANGED -> Known.PORTING_ORDER_STATUS_CHANGED
                PORTING_ORDER_SHARING_TOKEN_EXPIRED -> Known.PORTING_ORDER_SHARING_TOKEN_EXPIRED
                PORTING_ORDER_NEW_COMMENT -> Known.PORTING_ORDER_NEW_COMMENT
                PORTING_ORDER_SPLIT -> Known.PORTING_ORDER_SPLIT
                else -> throw TelnyxInvalidDataException("Unknown EventType: $value")
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
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerReference: JsonField<String>,
        private val deletedAt: JsonField<OffsetDateTime>,
        private val recordType: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deleted_at")
            @ExcludeMissing
            deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, createdAt, customerReference, deletedAt, recordType, updatedAt, mutableMapOf())

        /**
         * Identifies the porting order that was deleted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * ISO 8601 formatted date indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Identifies the customer reference associated with the porting order.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * ISO 8601 formatted date indicating when the porting order was deleted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deletedAt(): Optional<OffsetDateTime> = deletedAt.getOptional("deleted_at")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * ISO 8601 formatted date indicating when the resource was updated.
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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [customerReference].
         *
         * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_reference")
        @ExcludeMissing
        fun _customerReference(): JsonField<String> = customerReference

        /**
         * Returns the raw JSON value of [deletedAt].
         *
         * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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

            /** Returns a mutable builder for constructing an instance of [Payload]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payload]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                id = payload.id
                createdAt = payload.createdAt
                customerReference = payload.customerReference
                deletedAt = payload.deletedAt
                recordType = payload.recordType
                updatedAt = payload.updatedAt
                additionalProperties = payload.additionalProperties.toMutableMap()
            }

            /** Identifies the porting order that was deleted. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ISO 8601 formatted date indicating when the resource was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Identifies the customer reference associated with the porting order. */
            fun customerReference(customerReference: String) =
                customerReference(JsonField.of(customerReference))

            /**
             * Sets [Builder.customerReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerReference(customerReference: JsonField<String>) = apply {
                this.customerReference = customerReference
            }

            /** ISO 8601 formatted date indicating when the porting order was deleted. */
            fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

            /**
             * Sets [Builder.deletedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply {
                this.deletedAt = deletedAt
            }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** ISO 8601 formatted date indicating when the resource was updated. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Payload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Payload =
                Payload(
                    id,
                    createdAt,
                    customerReference,
                    deletedAt,
                    recordType,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            customerReference()
            deletedAt()
            recordType()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (deletedAt.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload &&
                id == other.id &&
                createdAt == other.createdAt &&
                customerReference == other.customerReference &&
                deletedAt == other.deletedAt &&
                recordType == other.recordType &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                customerReference,
                deletedAt,
                recordType,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payload{id=$id, createdAt=$createdAt, customerReference=$customerReference, deletedAt=$deletedAt, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The status of the payload generation. */
    class PayloadStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CREATED = of("created")

            @JvmField val COMPLETED = of("completed")

            @JvmStatic fun of(value: String) = PayloadStatus(JsonField.of(value))
        }

        /** An enum containing [PayloadStatus]'s known values. */
        enum class Known {
            CREATED,
            COMPLETED,
        }

        /**
         * An enum containing [PayloadStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PayloadStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATED,
            COMPLETED,
            /**
             * An enum member indicating that [PayloadStatus] was instantiated with an unknown
             * value.
             */
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
                CREATED -> Value.CREATED
                COMPLETED -> Value.COMPLETED
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
                CREATED -> Known.CREATED
                COMPLETED -> Known.COMPLETED
                else -> throw TelnyxInvalidDataException("Unknown PayloadStatus: $value")
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

        fun validate(): PayloadStatus = apply {
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

            return other is PayloadStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingEventDeletedPayload &&
            id == other.id &&
            availableNotificationMethods == other.availableNotificationMethods &&
            eventType == other.eventType &&
            payload == other.payload &&
            payloadStatus == other.payloadStatus &&
            portingOrderId == other.portingOrderId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            availableNotificationMethods,
            eventType,
            payload,
            payloadStatus,
            portingOrderId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingEventDeletedPayload{id=$id, availableNotificationMethods=$availableNotificationMethods, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portingOrderId=$portingOrderId, additionalProperties=$additionalProperties}"
}
