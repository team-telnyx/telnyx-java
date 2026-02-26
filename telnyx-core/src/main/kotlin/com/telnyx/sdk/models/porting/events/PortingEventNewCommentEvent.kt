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

class PortingEventNewCommentEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val availableNotificationMethods: JsonField<List<AvailableNotificationMethod>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val eventType: JsonField<EventType>,
    private val payload: JsonField<Payload>,
    private val payloadStatus: JsonField<PayloadStatus>,
    private val portingOrderId: JsonField<String>,
    private val recordType: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("available_notification_methods")
        @ExcludeMissing
        availableNotificationMethods: JsonField<List<AvailableNotificationMethod>> =
            JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        availableNotificationMethods,
        createdAt,
        eventType,
        payload,
        payloadStatus,
        portingOrderId,
        recordType,
        updatedAt,
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
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Identifies the event type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

    /**
     * The webhook payload for the porting_order.new_comment event
     *
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

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

        /**
         * Returns a mutable builder for constructing an instance of [PortingEventNewCommentEvent].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingEventNewCommentEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var availableNotificationMethods:
            JsonField<MutableList<AvailableNotificationMethod>>? =
            null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var payload: JsonField<Payload> = JsonMissing.of()
        private var payloadStatus: JsonField<PayloadStatus> = JsonMissing.of()
        private var portingOrderId: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingEventNewCommentEvent: PortingEventNewCommentEvent) = apply {
            id = portingEventNewCommentEvent.id
            availableNotificationMethods =
                portingEventNewCommentEvent.availableNotificationMethods.map { it.toMutableList() }
            createdAt = portingEventNewCommentEvent.createdAt
            eventType = portingEventNewCommentEvent.eventType
            payload = portingEventNewCommentEvent.payload
            payloadStatus = portingEventNewCommentEvent.payloadStatus
            portingOrderId = portingEventNewCommentEvent.portingOrderId
            recordType = portingEventNewCommentEvent.recordType
            updatedAt = portingEventNewCommentEvent.updatedAt
            additionalProperties = portingEventNewCommentEvent.additionalProperties.toMutableMap()
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

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        /** The webhook payload for the porting_order.new_comment event */
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

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [PortingEventNewCommentEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingEventNewCommentEvent =
            PortingEventNewCommentEvent(
                id,
                (availableNotificationMethods ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                eventType,
                payload,
                payloadStatus,
                portingOrderId,
                recordType,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingEventNewCommentEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        availableNotificationMethods().ifPresent { it.forEach { it.validate() } }
        createdAt()
        eventType().ifPresent { it.validate() }
        payload().ifPresent { it.validate() }
        payloadStatus().ifPresent { it.validate() }
        portingOrderId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (availableNotificationMethods.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (payload.asKnown().getOrNull()?.validity() ?: 0) +
            (payloadStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portingOrderId.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

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

    /** The webhook payload for the porting_order.new_comment event */
    class Payload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val comment: JsonField<Comment>,
        private val portingOrderId: JsonField<String>,
        private val supportKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("comment") @ExcludeMissing comment: JsonField<Comment> = JsonMissing.of(),
            @JsonProperty("porting_order_id")
            @ExcludeMissing
            portingOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("support_key")
            @ExcludeMissing
            supportKey: JsonField<String> = JsonMissing.of(),
        ) : this(comment, portingOrderId, supportKey, mutableMapOf())

        /**
         * The comment that was added to the porting order.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun comment(): Optional<Comment> = comment.getOptional("comment")

        /**
         * Identifies the porting order that the comment was added to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

        /**
         * Identifies the support key associated with the porting order.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun supportKey(): Optional<String> = supportKey.getOptional("support_key")

        /**
         * Returns the raw JSON value of [comment].
         *
         * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<Comment> = comment

        /**
         * Returns the raw JSON value of [portingOrderId].
         *
         * Unlike [portingOrderId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("porting_order_id")
        @ExcludeMissing
        fun _portingOrderId(): JsonField<String> = portingOrderId

        /**
         * Returns the raw JSON value of [supportKey].
         *
         * Unlike [supportKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("support_key")
        @ExcludeMissing
        fun _supportKey(): JsonField<String> = supportKey

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

            private var comment: JsonField<Comment> = JsonMissing.of()
            private var portingOrderId: JsonField<String> = JsonMissing.of()
            private var supportKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                comment = payload.comment
                portingOrderId = payload.portingOrderId
                supportKey = payload.supportKey
                additionalProperties = payload.additionalProperties.toMutableMap()
            }

            /** The comment that was added to the porting order. */
            fun comment(comment: Comment) = comment(JsonField.of(comment))

            /**
             * Sets [Builder.comment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comment] with a well-typed [Comment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comment(comment: JsonField<Comment>) = apply { this.comment = comment }

            /** Identifies the porting order that the comment was added to. */
            fun portingOrderId(portingOrderId: String) =
                portingOrderId(JsonField.of(portingOrderId))

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

            /** Identifies the support key associated with the porting order. */
            fun supportKey(supportKey: String) = supportKey(JsonField.of(supportKey))

            /**
             * Sets [Builder.supportKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supportKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun supportKey(supportKey: JsonField<String>) = apply { this.supportKey = supportKey }

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
                Payload(comment, portingOrderId, supportKey, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

            comment().ifPresent { it.validate() }
            portingOrderId()
            supportKey()
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
            (comment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (portingOrderId.asKnown().isPresent) 1 else 0) +
                (if (supportKey.asKnown().isPresent) 1 else 0)

        /** The comment that was added to the porting order. */
        class Comment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val body: JsonField<String>,
            private val insertedAt: JsonField<OffsetDateTime>,
            private val userId: JsonField<String>,
            private val userType: JsonField<UserType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inserted_at")
                @ExcludeMissing
                insertedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_type")
                @ExcludeMissing
                userType: JsonField<UserType> = JsonMissing.of(),
            ) : this(id, body, insertedAt, userId, userType, mutableMapOf())

            /**
             * Identifies the comment.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The body of the comment.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun body(): Optional<String> = body.getOptional("body")

            /**
             * ISO 8601 formatted date indicating when the comment was created.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun insertedAt(): Optional<OffsetDateTime> = insertedAt.getOptional("inserted_at")

            /**
             * Identifies the user that create the comment.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): Optional<String> = userId.getOptional("user_id")

            /**
             * Identifies the type of the user that created the comment.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userType(): Optional<UserType> = userType.getOptional("user_type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [body].
             *
             * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

            /**
             * Returns the raw JSON value of [insertedAt].
             *
             * Unlike [insertedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inserted_at")
            @ExcludeMissing
            fun _insertedAt(): JsonField<OffsetDateTime> = insertedAt

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

            /**
             * Returns the raw JSON value of [userType].
             *
             * Unlike [userType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_type")
            @ExcludeMissing
            fun _userType(): JsonField<UserType> = userType

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

                /** Returns a mutable builder for constructing an instance of [Comment]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Comment]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var body: JsonField<String> = JsonMissing.of()
                private var insertedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var userType: JsonField<UserType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(comment: Comment) = apply {
                    id = comment.id
                    body = comment.body
                    insertedAt = comment.insertedAt
                    userId = comment.userId
                    userType = comment.userType
                    additionalProperties = comment.additionalProperties.toMutableMap()
                }

                /** Identifies the comment. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The body of the comment. */
                fun body(body: String) = body(JsonField.of(body))

                /**
                 * Sets [Builder.body] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.body] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun body(body: JsonField<String>) = apply { this.body = body }

                /** ISO 8601 formatted date indicating when the comment was created. */
                fun insertedAt(insertedAt: OffsetDateTime) = insertedAt(JsonField.of(insertedAt))

                /**
                 * Sets [Builder.insertedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.insertedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun insertedAt(insertedAt: JsonField<OffsetDateTime>) = apply {
                    this.insertedAt = insertedAt
                }

                /** Identifies the user that create the comment. */
                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                /** Identifies the type of the user that created the comment. */
                fun userType(userType: UserType) = userType(JsonField.of(userType))

                /**
                 * Sets [Builder.userType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userType] with a well-typed [UserType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userType(userType: JsonField<UserType>) = apply { this.userType = userType }

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
                 * Returns an immutable instance of [Comment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Comment =
                    Comment(
                        id,
                        body,
                        insertedAt,
                        userId,
                        userType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Comment = apply {
                if (validated) {
                    return@apply
                }

                id()
                body()
                insertedAt()
                userId()
                userType().ifPresent { it.validate() }
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
                    (if (body.asKnown().isPresent) 1 else 0) +
                    (if (insertedAt.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0) +
                    (userType.asKnown().getOrNull()?.validity() ?: 0)

            /** Identifies the type of the user that created the comment. */
            class UserType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val USER = of("user")

                    @JvmField val ADMIN = of("admin")

                    @JvmField val SYSTEM = of("system")

                    @JvmStatic fun of(value: String) = UserType(JsonField.of(value))
                }

                /** An enum containing [UserType]'s known values. */
                enum class Known {
                    USER,
                    ADMIN,
                    SYSTEM,
                }

                /**
                 * An enum containing [UserType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [UserType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USER,
                    ADMIN,
                    SYSTEM,
                    /**
                     * An enum member indicating that [UserType] was instantiated with an unknown
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
                        USER -> Value.USER
                        ADMIN -> Value.ADMIN
                        SYSTEM -> Value.SYSTEM
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
                        USER -> Known.USER
                        ADMIN -> Known.ADMIN
                        SYSTEM -> Known.SYSTEM
                        else -> throw TelnyxInvalidDataException("Unknown UserType: $value")
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

                fun validate(): UserType = apply {
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

                    return other is UserType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Comment &&
                    id == other.id &&
                    body == other.body &&
                    insertedAt == other.insertedAt &&
                    userId == other.userId &&
                    userType == other.userType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, body, insertedAt, userId, userType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Comment{id=$id, body=$body, insertedAt=$insertedAt, userId=$userId, userType=$userType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload &&
                comment == other.comment &&
                portingOrderId == other.portingOrderId &&
                supportKey == other.supportKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(comment, portingOrderId, supportKey, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payload{comment=$comment, portingOrderId=$portingOrderId, supportKey=$supportKey, additionalProperties=$additionalProperties}"
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

        return other is PortingEventNewCommentEvent &&
            id == other.id &&
            availableNotificationMethods == other.availableNotificationMethods &&
            createdAt == other.createdAt &&
            eventType == other.eventType &&
            payload == other.payload &&
            payloadStatus == other.payloadStatus &&
            portingOrderId == other.portingOrderId &&
            recordType == other.recordType &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            availableNotificationMethods,
            createdAt,
            eventType,
            payload,
            payloadStatus,
            portingOrderId,
            recordType,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingEventNewCommentEvent{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portingOrderId=$portingOrderId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
