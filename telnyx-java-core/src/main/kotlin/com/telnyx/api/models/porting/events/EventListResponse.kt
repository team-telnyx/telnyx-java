// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.events

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
import com.telnyx.api.core.BaseDeserializer
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.allMaxBy
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.PortingOrderStatus
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EventListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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

        /** Returns a mutable builder for constructing an instance of [EventListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventListResponse: EventListResponse) = apply {
            data = eventListResponse.data.map { it.toMutableList() }
            meta = eventListResponse.meta
            additionalProperties = eventListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [EventListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventListResponse =
            EventListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
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
         * The webhook payload for the porting_order.deleted event
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
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

        /**
         * Returns the raw JSON value of [payloadStatus].
         *
         * Unlike [payloadStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payload_status")
        @ExcludeMissing
        fun _payloadStatus(): JsonField<PayloadStatus> = payloadStatus

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
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
            internal fun from(data: Data) = apply {
                id = data.id
                availableNotificationMethods =
                    data.availableNotificationMethods.map { it.toMutableList() }
                createdAt = data.createdAt
                eventType = data.eventType
                payload = data.payload
                payloadStatus = data.payloadStatus
                portingOrderId = data.portingOrderId
                recordType = data.recordType
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Uniquely identifies the event. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * `List<AvailableNotificationMethod>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
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
                        checkKnown("availableNotificationMethods", it)
                            .add(availableNotificationMethod)
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Identifies the event type */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /** The webhook payload for the porting_order.deleted event */
            fun payload(payload: Payload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

            /**
             * Alias for calling [payload] with
             * `Payload.ofWebhookPortingOrderDeleted(webhookPortingOrderDeleted)`.
             */
            fun payload(webhookPortingOrderDeleted: Payload.WebhookPortingOrderDeletedPayload) =
                payload(Payload.ofWebhookPortingOrderDeleted(webhookPortingOrderDeleted))

            /**
             * Alias for calling [payload] with
             * `Payload.ofWebhookPortingOrderMessagingChanged(webhookPortingOrderMessagingChanged)`.
             */
            fun payload(
                webhookPortingOrderMessagingChanged:
                    Payload.WebhookPortingOrderMessagingChangedPayload
            ) =
                payload(
                    Payload.ofWebhookPortingOrderMessagingChanged(
                        webhookPortingOrderMessagingChanged
                    )
                )

            /**
             * Alias for calling [payload] with
             * `Payload.ofWebhookPortingOrderStatusChanged(webhookPortingOrderStatusChanged)`.
             */
            fun payload(
                webhookPortingOrderStatusChanged: Payload.WebhookPortingOrderStatusChangedPayload
            ) =
                payload(
                    Payload.ofWebhookPortingOrderStatusChanged(webhookPortingOrderStatusChanged)
                )

            /**
             * Alias for calling [payload] with
             * `Payload.ofWebhookPortingOrderNewComment(webhookPortingOrderNewComment)`.
             */
            fun payload(
                webhookPortingOrderNewComment: Payload.WebhookPortingOrderNewCommentPayload
            ) = payload(Payload.ofWebhookPortingOrderNewComment(webhookPortingOrderNewComment))

            /**
             * Alias for calling [payload] with
             * `Payload.ofWebhookPortingOrderSplit(webhookPortingOrderSplit)`.
             */
            fun payload(webhookPortingOrderSplit: Payload.WebhookPortingOrderSplitPayload) =
                payload(Payload.ofWebhookPortingOrderSplit(webhookPortingOrderSplit))

            /** The status of the payload generation. */
            fun payloadStatus(payloadStatus: PayloadStatus) =
                payloadStatus(JsonField.of(payloadStatus))

            /**
             * Sets [Builder.payloadStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadStatus] with a well-typed [PayloadStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun payloadStatus(payloadStatus: JsonField<PayloadStatus>) = apply {
                this.payloadStatus = payloadStatus
            }

            /** Identifies the porting order associated with the event. */
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
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

        fun validate(): Data = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [AvailableNotificationMethod]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [AvailableNotificationMethod] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMAIL,
                WEBHOOK,
                WEBHOOK_V1,
                /**
                 * An enum member indicating that [AvailableNotificationMethod] was instantiated
                 * with an unknown value.
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
                    EMAIL -> Value.EMAIL
                    WEBHOOK -> Value.WEBHOOK
                    WEBHOOK_V1 -> Value.WEBHOOK_V1
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
                    EMAIL -> Known.EMAIL
                    WEBHOOK -> Known.WEBHOOK
                    WEBHOOK_V1 -> Known.WEBHOOK_V1
                    else ->
                        throw TelnyxInvalidDataException(
                            "Unknown AvailableNotificationMethod: $value"
                        )
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

                @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

                @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

                @JvmField
                val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

        /** The webhook payload for the porting_order.deleted event */
        @JsonDeserialize(using = Payload.Deserializer::class)
        @JsonSerialize(using = Payload.Serializer::class)
        class Payload
        private constructor(
            private val webhookPortingOrderDeleted: WebhookPortingOrderDeletedPayload? = null,
            private val webhookPortingOrderMessagingChanged:
                WebhookPortingOrderMessagingChangedPayload? =
                null,
            private val webhookPortingOrderStatusChanged: WebhookPortingOrderStatusChangedPayload? =
                null,
            private val webhookPortingOrderNewComment: WebhookPortingOrderNewCommentPayload? = null,
            private val webhookPortingOrderSplit: WebhookPortingOrderSplitPayload? = null,
            private val _json: JsonValue? = null,
        ) {

            /** The webhook payload for the porting_order.deleted event */
            fun webhookPortingOrderDeleted(): Optional<WebhookPortingOrderDeletedPayload> =
                Optional.ofNullable(webhookPortingOrderDeleted)

            /** The webhook payload for the porting_order.messaging_changed event */
            fun webhookPortingOrderMessagingChanged():
                Optional<WebhookPortingOrderMessagingChangedPayload> =
                Optional.ofNullable(webhookPortingOrderMessagingChanged)

            /** The webhook payload for the porting_order.status_changed event */
            fun webhookPortingOrderStatusChanged():
                Optional<WebhookPortingOrderStatusChangedPayload> =
                Optional.ofNullable(webhookPortingOrderStatusChanged)

            /** The webhook payload for the porting_order.new_comment event */
            fun webhookPortingOrderNewComment(): Optional<WebhookPortingOrderNewCommentPayload> =
                Optional.ofNullable(webhookPortingOrderNewComment)

            /** The webhook payload for the porting_order.split event */
            fun webhookPortingOrderSplit(): Optional<WebhookPortingOrderSplitPayload> =
                Optional.ofNullable(webhookPortingOrderSplit)

            fun isWebhookPortingOrderDeleted(): Boolean = webhookPortingOrderDeleted != null

            fun isWebhookPortingOrderMessagingChanged(): Boolean =
                webhookPortingOrderMessagingChanged != null

            fun isWebhookPortingOrderStatusChanged(): Boolean =
                webhookPortingOrderStatusChanged != null

            fun isWebhookPortingOrderNewComment(): Boolean = webhookPortingOrderNewComment != null

            fun isWebhookPortingOrderSplit(): Boolean = webhookPortingOrderSplit != null

            /** The webhook payload for the porting_order.deleted event */
            fun asWebhookPortingOrderDeleted(): WebhookPortingOrderDeletedPayload =
                webhookPortingOrderDeleted.getOrThrow("webhookPortingOrderDeleted")

            /** The webhook payload for the porting_order.messaging_changed event */
            fun asWebhookPortingOrderMessagingChanged():
                WebhookPortingOrderMessagingChangedPayload =
                webhookPortingOrderMessagingChanged.getOrThrow(
                    "webhookPortingOrderMessagingChanged"
                )

            /** The webhook payload for the porting_order.status_changed event */
            fun asWebhookPortingOrderStatusChanged(): WebhookPortingOrderStatusChangedPayload =
                webhookPortingOrderStatusChanged.getOrThrow("webhookPortingOrderStatusChanged")

            /** The webhook payload for the porting_order.new_comment event */
            fun asWebhookPortingOrderNewComment(): WebhookPortingOrderNewCommentPayload =
                webhookPortingOrderNewComment.getOrThrow("webhookPortingOrderNewComment")

            /** The webhook payload for the porting_order.split event */
            fun asWebhookPortingOrderSplit(): WebhookPortingOrderSplitPayload =
                webhookPortingOrderSplit.getOrThrow("webhookPortingOrderSplit")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    webhookPortingOrderDeleted != null ->
                        visitor.visitWebhookPortingOrderDeleted(webhookPortingOrderDeleted)
                    webhookPortingOrderMessagingChanged != null ->
                        visitor.visitWebhookPortingOrderMessagingChanged(
                            webhookPortingOrderMessagingChanged
                        )
                    webhookPortingOrderStatusChanged != null ->
                        visitor.visitWebhookPortingOrderStatusChanged(
                            webhookPortingOrderStatusChanged
                        )
                    webhookPortingOrderNewComment != null ->
                        visitor.visitWebhookPortingOrderNewComment(webhookPortingOrderNewComment)
                    webhookPortingOrderSplit != null ->
                        visitor.visitWebhookPortingOrderSplit(webhookPortingOrderSplit)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitWebhookPortingOrderDeleted(
                            webhookPortingOrderDeleted: WebhookPortingOrderDeletedPayload
                        ) {
                            webhookPortingOrderDeleted.validate()
                        }

                        override fun visitWebhookPortingOrderMessagingChanged(
                            webhookPortingOrderMessagingChanged:
                                WebhookPortingOrderMessagingChangedPayload
                        ) {
                            webhookPortingOrderMessagingChanged.validate()
                        }

                        override fun visitWebhookPortingOrderStatusChanged(
                            webhookPortingOrderStatusChanged:
                                WebhookPortingOrderStatusChangedPayload
                        ) {
                            webhookPortingOrderStatusChanged.validate()
                        }

                        override fun visitWebhookPortingOrderNewComment(
                            webhookPortingOrderNewComment: WebhookPortingOrderNewCommentPayload
                        ) {
                            webhookPortingOrderNewComment.validate()
                        }

                        override fun visitWebhookPortingOrderSplit(
                            webhookPortingOrderSplit: WebhookPortingOrderSplitPayload
                        ) {
                            webhookPortingOrderSplit.validate()
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
                        override fun visitWebhookPortingOrderDeleted(
                            webhookPortingOrderDeleted: WebhookPortingOrderDeletedPayload
                        ) = webhookPortingOrderDeleted.validity()

                        override fun visitWebhookPortingOrderMessagingChanged(
                            webhookPortingOrderMessagingChanged:
                                WebhookPortingOrderMessagingChangedPayload
                        ) = webhookPortingOrderMessagingChanged.validity()

                        override fun visitWebhookPortingOrderStatusChanged(
                            webhookPortingOrderStatusChanged:
                                WebhookPortingOrderStatusChangedPayload
                        ) = webhookPortingOrderStatusChanged.validity()

                        override fun visitWebhookPortingOrderNewComment(
                            webhookPortingOrderNewComment: WebhookPortingOrderNewCommentPayload
                        ) = webhookPortingOrderNewComment.validity()

                        override fun visitWebhookPortingOrderSplit(
                            webhookPortingOrderSplit: WebhookPortingOrderSplitPayload
                        ) = webhookPortingOrderSplit.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    webhookPortingOrderDeleted == other.webhookPortingOrderDeleted &&
                    webhookPortingOrderMessagingChanged ==
                        other.webhookPortingOrderMessagingChanged &&
                    webhookPortingOrderStatusChanged == other.webhookPortingOrderStatusChanged &&
                    webhookPortingOrderNewComment == other.webhookPortingOrderNewComment &&
                    webhookPortingOrderSplit == other.webhookPortingOrderSplit
            }

            override fun hashCode(): Int =
                Objects.hash(
                    webhookPortingOrderDeleted,
                    webhookPortingOrderMessagingChanged,
                    webhookPortingOrderStatusChanged,
                    webhookPortingOrderNewComment,
                    webhookPortingOrderSplit,
                )

            override fun toString(): String =
                when {
                    webhookPortingOrderDeleted != null ->
                        "Payload{webhookPortingOrderDeleted=$webhookPortingOrderDeleted}"
                    webhookPortingOrderMessagingChanged != null ->
                        "Payload{webhookPortingOrderMessagingChanged=$webhookPortingOrderMessagingChanged}"
                    webhookPortingOrderStatusChanged != null ->
                        "Payload{webhookPortingOrderStatusChanged=$webhookPortingOrderStatusChanged}"
                    webhookPortingOrderNewComment != null ->
                        "Payload{webhookPortingOrderNewComment=$webhookPortingOrderNewComment}"
                    webhookPortingOrderSplit != null ->
                        "Payload{webhookPortingOrderSplit=$webhookPortingOrderSplit}"
                    _json != null -> "Payload{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Payload")
                }

            companion object {

                /** The webhook payload for the porting_order.deleted event */
                @JvmStatic
                fun ofWebhookPortingOrderDeleted(
                    webhookPortingOrderDeleted: WebhookPortingOrderDeletedPayload
                ) = Payload(webhookPortingOrderDeleted = webhookPortingOrderDeleted)

                /** The webhook payload for the porting_order.messaging_changed event */
                @JvmStatic
                fun ofWebhookPortingOrderMessagingChanged(
                    webhookPortingOrderMessagingChanged: WebhookPortingOrderMessagingChangedPayload
                ) =
                    Payload(
                        webhookPortingOrderMessagingChanged = webhookPortingOrderMessagingChanged
                    )

                /** The webhook payload for the porting_order.status_changed event */
                @JvmStatic
                fun ofWebhookPortingOrderStatusChanged(
                    webhookPortingOrderStatusChanged: WebhookPortingOrderStatusChangedPayload
                ) = Payload(webhookPortingOrderStatusChanged = webhookPortingOrderStatusChanged)

                /** The webhook payload for the porting_order.new_comment event */
                @JvmStatic
                fun ofWebhookPortingOrderNewComment(
                    webhookPortingOrderNewComment: WebhookPortingOrderNewCommentPayload
                ) = Payload(webhookPortingOrderNewComment = webhookPortingOrderNewComment)

                /** The webhook payload for the porting_order.split event */
                @JvmStatic
                fun ofWebhookPortingOrderSplit(
                    webhookPortingOrderSplit: WebhookPortingOrderSplitPayload
                ) = Payload(webhookPortingOrderSplit = webhookPortingOrderSplit)
            }

            /**
             * An interface that defines how to map each variant of [Payload] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /** The webhook payload for the porting_order.deleted event */
                fun visitWebhookPortingOrderDeleted(
                    webhookPortingOrderDeleted: WebhookPortingOrderDeletedPayload
                ): T

                /** The webhook payload for the porting_order.messaging_changed event */
                fun visitWebhookPortingOrderMessagingChanged(
                    webhookPortingOrderMessagingChanged: WebhookPortingOrderMessagingChangedPayload
                ): T

                /** The webhook payload for the porting_order.status_changed event */
                fun visitWebhookPortingOrderStatusChanged(
                    webhookPortingOrderStatusChanged: WebhookPortingOrderStatusChangedPayload
                ): T

                /** The webhook payload for the porting_order.new_comment event */
                fun visitWebhookPortingOrderNewComment(
                    webhookPortingOrderNewComment: WebhookPortingOrderNewCommentPayload
                ): T

                /** The webhook payload for the porting_order.split event */
                fun visitWebhookPortingOrderSplit(
                    webhookPortingOrderSplit: WebhookPortingOrderSplitPayload
                ): T

                /**
                 * Maps an unknown variant of [Payload] to a value of type [T].
                 *
                 * An instance of [Payload] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Payload: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Payload>(Payload::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Payload {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<WebhookPortingOrderDeletedPayload>(),
                                    )
                                    ?.let {
                                        Payload(webhookPortingOrderDeleted = it, _json = json)
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<WebhookPortingOrderMessagingChangedPayload>(),
                                    )
                                    ?.let {
                                        Payload(
                                            webhookPortingOrderMessagingChanged = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<WebhookPortingOrderStatusChangedPayload>(),
                                    )
                                    ?.let {
                                        Payload(webhookPortingOrderStatusChanged = it, _json = json)
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<WebhookPortingOrderNewCommentPayload>(),
                                    )
                                    ?.let {
                                        Payload(webhookPortingOrderNewComment = it, _json = json)
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<WebhookPortingOrderSplitPayload>(),
                                    )
                                    ?.let { Payload(webhookPortingOrderSplit = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Payload(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Payload>(Payload::class) {

                override fun serialize(
                    value: Payload,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.webhookPortingOrderDeleted != null ->
                            generator.writeObject(value.webhookPortingOrderDeleted)
                        value.webhookPortingOrderMessagingChanged != null ->
                            generator.writeObject(value.webhookPortingOrderMessagingChanged)
                        value.webhookPortingOrderStatusChanged != null ->
                            generator.writeObject(value.webhookPortingOrderStatusChanged)
                        value.webhookPortingOrderNewComment != null ->
                            generator.writeObject(value.webhookPortingOrderNewComment)
                        value.webhookPortingOrderSplit != null ->
                            generator.writeObject(value.webhookPortingOrderSplit)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Payload")
                    }
                }
            }

            /** The webhook payload for the porting_order.deleted event */
            class WebhookPortingOrderDeletedPayload
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val customerReference: JsonField<String>,
                private val deletedAt: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("customer_reference")
                    @ExcludeMissing
                    customerReference: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("deleted_at")
                    @ExcludeMissing
                    deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(id, customerReference, deletedAt, mutableMapOf())

                /**
                 * Identifies the porting order that was deleted.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * Identifies the customer reference associated with the porting order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun customerReference(): Optional<String> =
                    customerReference.getOptional("customer_reference")

                /**
                 * ISO 8601 formatted date indicating when the porting order was deleted.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun deletedAt(): Optional<OffsetDateTime> = deletedAt.getOptional("deleted_at")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [customerReference].
                 *
                 * Unlike [customerReference], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("customer_reference")
                @ExcludeMissing
                fun _customerReference(): JsonField<String> = customerReference

                /**
                 * Returns the raw JSON value of [deletedAt].
                 *
                 * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("deleted_at")
                @ExcludeMissing
                fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

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
                     * [WebhookPortingOrderDeletedPayload].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebhookPortingOrderDeletedPayload]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var customerReference: JsonField<String> = JsonMissing.of()
                    private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        webhookPortingOrderDeletedPayload: WebhookPortingOrderDeletedPayload
                    ) = apply {
                        id = webhookPortingOrderDeletedPayload.id
                        customerReference = webhookPortingOrderDeletedPayload.customerReference
                        deletedAt = webhookPortingOrderDeletedPayload.deletedAt
                        additionalProperties =
                            webhookPortingOrderDeletedPayload.additionalProperties.toMutableMap()
                    }

                    /** Identifies the porting order that was deleted. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Identifies the customer reference associated with the porting order. */
                    fun customerReference(customerReference: String) =
                        customerReference(JsonField.of(customerReference))

                    /**
                     * Sets [Builder.customerReference] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customerReference] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun customerReference(customerReference: JsonField<String>) = apply {
                        this.customerReference = customerReference
                    }

                    /** ISO 8601 formatted date indicating when the porting order was deleted. */
                    fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

                    /**
                     * Sets [Builder.deletedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deletedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply {
                        this.deletedAt = deletedAt
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
                     * Returns an immutable instance of [WebhookPortingOrderDeletedPayload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): WebhookPortingOrderDeletedPayload =
                        WebhookPortingOrderDeletedPayload(
                            id,
                            customerReference,
                            deletedAt,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WebhookPortingOrderDeletedPayload = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    customerReference()
                    deletedAt()
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
                        (if (customerReference.asKnown().isPresent) 1 else 0) +
                        (if (deletedAt.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WebhookPortingOrderDeletedPayload &&
                        id == other.id &&
                        customerReference == other.customerReference &&
                        deletedAt == other.deletedAt &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, customerReference, deletedAt, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebhookPortingOrderDeletedPayload{id=$id, customerReference=$customerReference, deletedAt=$deletedAt, additionalProperties=$additionalProperties}"
            }

            /** The webhook payload for the porting_order.messaging_changed event */
            class WebhookPortingOrderMessagingChangedPayload
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val customerReference: JsonField<String>,
                private val messaging: JsonField<Messaging>,
                private val supportKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("customer_reference")
                    @ExcludeMissing
                    customerReference: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("messaging")
                    @ExcludeMissing
                    messaging: JsonField<Messaging> = JsonMissing.of(),
                    @JsonProperty("support_key")
                    @ExcludeMissing
                    supportKey: JsonField<String> = JsonMissing.of(),
                ) : this(id, customerReference, messaging, supportKey, mutableMapOf())

                /**
                 * Identifies the porting order that was moved.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * Identifies the customer reference associated with the porting order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun customerReference(): Optional<String> =
                    customerReference.getOptional("customer_reference")

                /**
                 * The messaging portability status of the porting order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun messaging(): Optional<Messaging> = messaging.getOptional("messaging")

                /**
                 * Identifies the support key associated with the porting order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun supportKey(): Optional<String> = supportKey.getOptional("support_key")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [customerReference].
                 *
                 * Unlike [customerReference], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("customer_reference")
                @ExcludeMissing
                fun _customerReference(): JsonField<String> = customerReference

                /**
                 * Returns the raw JSON value of [messaging].
                 *
                 * Unlike [messaging], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("messaging")
                @ExcludeMissing
                fun _messaging(): JsonField<Messaging> = messaging

                /**
                 * Returns the raw JSON value of [supportKey].
                 *
                 * Unlike [supportKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
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

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [WebhookPortingOrderMessagingChangedPayload].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebhookPortingOrderMessagingChangedPayload]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var customerReference: JsonField<String> = JsonMissing.of()
                    private var messaging: JsonField<Messaging> = JsonMissing.of()
                    private var supportKey: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        webhookPortingOrderMessagingChangedPayload:
                            WebhookPortingOrderMessagingChangedPayload
                    ) = apply {
                        id = webhookPortingOrderMessagingChangedPayload.id
                        customerReference =
                            webhookPortingOrderMessagingChangedPayload.customerReference
                        messaging = webhookPortingOrderMessagingChangedPayload.messaging
                        supportKey = webhookPortingOrderMessagingChangedPayload.supportKey
                        additionalProperties =
                            webhookPortingOrderMessagingChangedPayload.additionalProperties
                                .toMutableMap()
                    }

                    /** Identifies the porting order that was moved. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Identifies the customer reference associated with the porting order. */
                    fun customerReference(customerReference: String) =
                        customerReference(JsonField.of(customerReference))

                    /**
                     * Sets [Builder.customerReference] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customerReference] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun customerReference(customerReference: JsonField<String>) = apply {
                        this.customerReference = customerReference
                    }

                    /** The messaging portability status of the porting order. */
                    fun messaging(messaging: Messaging) = messaging(JsonField.of(messaging))

                    /**
                     * Sets [Builder.messaging] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.messaging] with a well-typed [Messaging]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun messaging(messaging: JsonField<Messaging>) = apply {
                        this.messaging = messaging
                    }

                    /** Identifies the support key associated with the porting order. */
                    fun supportKey(supportKey: String) = supportKey(JsonField.of(supportKey))

                    /**
                     * Sets [Builder.supportKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.supportKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun supportKey(supportKey: JsonField<String>) = apply {
                        this.supportKey = supportKey
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
                     * Returns an immutable instance of
                     * [WebhookPortingOrderMessagingChangedPayload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): WebhookPortingOrderMessagingChangedPayload =
                        WebhookPortingOrderMessagingChangedPayload(
                            id,
                            customerReference,
                            messaging,
                            supportKey,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WebhookPortingOrderMessagingChangedPayload = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    customerReference()
                    messaging().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (customerReference.asKnown().isPresent) 1 else 0) +
                        (messaging.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (supportKey.asKnown().isPresent) 1 else 0)

                /** The messaging portability status of the porting order. */
                class Messaging
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val enableMessaging: JsonField<Boolean>,
                    private val messagingCapable: JsonField<Boolean>,
                    private val messagingPortCompleted: JsonField<Boolean>,
                    private val messagingPortStatus: JsonField<MessagingPortStatus>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("enable_messaging")
                        @ExcludeMissing
                        enableMessaging: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("messaging_capable")
                        @ExcludeMissing
                        messagingCapable: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("messaging_port_completed")
                        @ExcludeMissing
                        messagingPortCompleted: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("messaging_port_status")
                        @ExcludeMissing
                        messagingPortStatus: JsonField<MessagingPortStatus> = JsonMissing.of(),
                    ) : this(
                        enableMessaging,
                        messagingCapable,
                        messagingPortCompleted,
                        messagingPortStatus,
                        mutableMapOf(),
                    )

                    /**
                     * Indicates whether Telnyx will port messaging capabilities from the losing
                     * carrier. If false, any messaging capabilities will stay with their current
                     * provider.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun enableMessaging(): Optional<Boolean> =
                        enableMessaging.getOptional("enable_messaging")

                    /**
                     * Indicates whether the porting order is messaging capable.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun messagingCapable(): Optional<Boolean> =
                        messagingCapable.getOptional("messaging_capable")

                    /**
                     * Indicates whether the messaging port is completed.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun messagingPortCompleted(): Optional<Boolean> =
                        messagingPortCompleted.getOptional("messaging_port_completed")

                    /**
                     * Indicates the messaging port status of the porting order.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun messagingPortStatus(): Optional<MessagingPortStatus> =
                        messagingPortStatus.getOptional("messaging_port_status")

                    /**
                     * Returns the raw JSON value of [enableMessaging].
                     *
                     * Unlike [enableMessaging], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("enable_messaging")
                    @ExcludeMissing
                    fun _enableMessaging(): JsonField<Boolean> = enableMessaging

                    /**
                     * Returns the raw JSON value of [messagingCapable].
                     *
                     * Unlike [messagingCapable], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("messaging_capable")
                    @ExcludeMissing
                    fun _messagingCapable(): JsonField<Boolean> = messagingCapable

                    /**
                     * Returns the raw JSON value of [messagingPortCompleted].
                     *
                     * Unlike [messagingPortCompleted], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("messaging_port_completed")
                    @ExcludeMissing
                    fun _messagingPortCompleted(): JsonField<Boolean> = messagingPortCompleted

                    /**
                     * Returns the raw JSON value of [messagingPortStatus].
                     *
                     * Unlike [messagingPortStatus], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("messaging_port_status")
                    @ExcludeMissing
                    fun _messagingPortStatus(): JsonField<MessagingPortStatus> = messagingPortStatus

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
                         * Returns a mutable builder for constructing an instance of [Messaging].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Messaging]. */
                    class Builder internal constructor() {

                        private var enableMessaging: JsonField<Boolean> = JsonMissing.of()
                        private var messagingCapable: JsonField<Boolean> = JsonMissing.of()
                        private var messagingPortCompleted: JsonField<Boolean> = JsonMissing.of()
                        private var messagingPortStatus: JsonField<MessagingPortStatus> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(messaging: Messaging) = apply {
                            enableMessaging = messaging.enableMessaging
                            messagingCapable = messaging.messagingCapable
                            messagingPortCompleted = messaging.messagingPortCompleted
                            messagingPortStatus = messaging.messagingPortStatus
                            additionalProperties = messaging.additionalProperties.toMutableMap()
                        }

                        /**
                         * Indicates whether Telnyx will port messaging capabilities from the losing
                         * carrier. If false, any messaging capabilities will stay with their
                         * current provider.
                         */
                        fun enableMessaging(enableMessaging: Boolean) =
                            enableMessaging(JsonField.of(enableMessaging))

                        /**
                         * Sets [Builder.enableMessaging] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.enableMessaging] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun enableMessaging(enableMessaging: JsonField<Boolean>) = apply {
                            this.enableMessaging = enableMessaging
                        }

                        /** Indicates whether the porting order is messaging capable. */
                        fun messagingCapable(messagingCapable: Boolean) =
                            messagingCapable(JsonField.of(messagingCapable))

                        /**
                         * Sets [Builder.messagingCapable] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.messagingCapable] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun messagingCapable(messagingCapable: JsonField<Boolean>) = apply {
                            this.messagingCapable = messagingCapable
                        }

                        /** Indicates whether the messaging port is completed. */
                        fun messagingPortCompleted(messagingPortCompleted: Boolean) =
                            messagingPortCompleted(JsonField.of(messagingPortCompleted))

                        /**
                         * Sets [Builder.messagingPortCompleted] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.messagingPortCompleted] with a
                         * well-typed [Boolean] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun messagingPortCompleted(messagingPortCompleted: JsonField<Boolean>) =
                            apply {
                                this.messagingPortCompleted = messagingPortCompleted
                            }

                        /** Indicates the messaging port status of the porting order. */
                        fun messagingPortStatus(messagingPortStatus: MessagingPortStatus) =
                            messagingPortStatus(JsonField.of(messagingPortStatus))

                        /**
                         * Sets [Builder.messagingPortStatus] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.messagingPortStatus] with a well-typed
                         * [MessagingPortStatus] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun messagingPortStatus(
                            messagingPortStatus: JsonField<MessagingPortStatus>
                        ) = apply { this.messagingPortStatus = messagingPortStatus }

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
                         * Returns an immutable instance of [Messaging].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Messaging =
                            Messaging(
                                enableMessaging,
                                messagingCapable,
                                messagingPortCompleted,
                                messagingPortStatus,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Messaging = apply {
                        if (validated) {
                            return@apply
                        }

                        enableMessaging()
                        messagingCapable()
                        messagingPortCompleted()
                        messagingPortStatus().ifPresent { it.validate() }
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
                        (if (enableMessaging.asKnown().isPresent) 1 else 0) +
                            (if (messagingCapable.asKnown().isPresent) 1 else 0) +
                            (if (messagingPortCompleted.asKnown().isPresent) 1 else 0) +
                            (messagingPortStatus.asKnown().getOrNull()?.validity() ?: 0)

                    /** Indicates the messaging port status of the porting order. */
                    class MessagingPortStatus
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val NOT_APPLICABLE = of("not_applicable")

                            @JvmField val PENDING = of("pending")

                            @JvmField val ACTIVATING = of("activating")

                            @JvmField val EXCEPTION = of("exception")

                            @JvmField val CANCELED = of("canceled")

                            @JvmField val PARTIAL_PORT_COMPLETE = of("partial_port_complete")

                            @JvmField val PORTED = of("ported")

                            @JvmStatic
                            fun of(value: String) = MessagingPortStatus(JsonField.of(value))
                        }

                        /** An enum containing [MessagingPortStatus]'s known values. */
                        enum class Known {
                            NOT_APPLICABLE,
                            PENDING,
                            ACTIVATING,
                            EXCEPTION,
                            CANCELED,
                            PARTIAL_PORT_COMPLETE,
                            PORTED,
                        }

                        /**
                         * An enum containing [MessagingPortStatus]'s known values, as well as an
                         * [_UNKNOWN] member.
                         *
                         * An instance of [MessagingPortStatus] can contain an unknown value in a
                         * couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            NOT_APPLICABLE,
                            PENDING,
                            ACTIVATING,
                            EXCEPTION,
                            CANCELED,
                            PARTIAL_PORT_COMPLETE,
                            PORTED,
                            /**
                             * An enum member indicating that [MessagingPortStatus] was instantiated
                             * with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                PENDING -> Value.PENDING
                                ACTIVATING -> Value.ACTIVATING
                                EXCEPTION -> Value.EXCEPTION
                                CANCELED -> Value.CANCELED
                                PARTIAL_PORT_COMPLETE -> Value.PARTIAL_PORT_COMPLETE
                                PORTED -> Value.PORTED
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                PENDING -> Known.PENDING
                                ACTIVATING -> Known.ACTIVATING
                                EXCEPTION -> Known.EXCEPTION
                                CANCELED -> Known.CANCELED
                                PARTIAL_PORT_COMPLETE -> Known.PARTIAL_PORT_COMPLETE
                                PORTED -> Known.PORTED
                                else ->
                                    throw TelnyxInvalidDataException(
                                        "Unknown MessagingPortStatus: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                TelnyxInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): MessagingPortStatus = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is MessagingPortStatus && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Messaging &&
                            enableMessaging == other.enableMessaging &&
                            messagingCapable == other.messagingCapable &&
                            messagingPortCompleted == other.messagingPortCompleted &&
                            messagingPortStatus == other.messagingPortStatus &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            enableMessaging,
                            messagingCapable,
                            messagingPortCompleted,
                            messagingPortStatus,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Messaging{enableMessaging=$enableMessaging, messagingCapable=$messagingCapable, messagingPortCompleted=$messagingPortCompleted, messagingPortStatus=$messagingPortStatus, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WebhookPortingOrderMessagingChangedPayload &&
                        id == other.id &&
                        customerReference == other.customerReference &&
                        messaging == other.messaging &&
                        supportKey == other.supportKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, customerReference, messaging, supportKey, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebhookPortingOrderMessagingChangedPayload{id=$id, customerReference=$customerReference, messaging=$messaging, supportKey=$supportKey, additionalProperties=$additionalProperties}"
            }

            /** The webhook payload for the porting_order.status_changed event */
            class WebhookPortingOrderStatusChangedPayload
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val customerReference: JsonField<String>,
                private val status: JsonField<PortingOrderStatus>,
                private val supportKey: JsonField<String>,
                private val updatedAt: JsonField<OffsetDateTime>,
                private val webhookUrl: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("customer_reference")
                    @ExcludeMissing
                    customerReference: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<PortingOrderStatus> = JsonMissing.of(),
                    @JsonProperty("support_key")
                    @ExcludeMissing
                    supportKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("updated_at")
                    @ExcludeMissing
                    updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("webhook_url")
                    @ExcludeMissing
                    webhookUrl: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    customerReference,
                    status,
                    supportKey,
                    updatedAt,
                    webhookUrl,
                    mutableMapOf(),
                )

                /**
                 * Identifies the porting order that was moved.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * Identifies the customer reference associated with the porting order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun customerReference(): Optional<String> =
                    customerReference.getOptional("customer_reference")

                /**
                 * Porting order status
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun status(): Optional<PortingOrderStatus> = status.getOptional("status")

                /**
                 * Identifies the support key associated with the porting order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun supportKey(): Optional<String> = supportKey.getOptional("support_key")

                /**
                 * ISO 8601 formatted date indicating when the porting order was moved.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

                /**
                 * The URL to send the webhook to.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [customerReference].
                 *
                 * Unlike [customerReference], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("customer_reference")
                @ExcludeMissing
                fun _customerReference(): JsonField<String> = customerReference

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status")
                @ExcludeMissing
                fun _status(): JsonField<PortingOrderStatus> = status

                /**
                 * Returns the raw JSON value of [supportKey].
                 *
                 * Unlike [supportKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("support_key")
                @ExcludeMissing
                fun _supportKey(): JsonField<String> = supportKey

                /**
                 * Returns the raw JSON value of [updatedAt].
                 *
                 * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("updated_at")
                @ExcludeMissing
                fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

                /**
                 * Returns the raw JSON value of [webhookUrl].
                 *
                 * Unlike [webhookUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("webhook_url")
                @ExcludeMissing
                fun _webhookUrl(): JsonField<String> = webhookUrl

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
                     * [WebhookPortingOrderStatusChangedPayload].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebhookPortingOrderStatusChangedPayload]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var customerReference: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<PortingOrderStatus> = JsonMissing.of()
                    private var supportKey: JsonField<String> = JsonMissing.of()
                    private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var webhookUrl: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        webhookPortingOrderStatusChangedPayload:
                            WebhookPortingOrderStatusChangedPayload
                    ) = apply {
                        id = webhookPortingOrderStatusChangedPayload.id
                        customerReference =
                            webhookPortingOrderStatusChangedPayload.customerReference
                        status = webhookPortingOrderStatusChangedPayload.status
                        supportKey = webhookPortingOrderStatusChangedPayload.supportKey
                        updatedAt = webhookPortingOrderStatusChangedPayload.updatedAt
                        webhookUrl = webhookPortingOrderStatusChangedPayload.webhookUrl
                        additionalProperties =
                            webhookPortingOrderStatusChangedPayload.additionalProperties
                                .toMutableMap()
                    }

                    /** Identifies the porting order that was moved. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Identifies the customer reference associated with the porting order. */
                    fun customerReference(customerReference: String) =
                        customerReference(JsonField.of(customerReference))

                    /**
                     * Sets [Builder.customerReference] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customerReference] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun customerReference(customerReference: JsonField<String>) = apply {
                        this.customerReference = customerReference
                    }

                    /** Porting order status */
                    fun status(status: PortingOrderStatus) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed
                     * [PortingOrderStatus] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun status(status: JsonField<PortingOrderStatus>) = apply {
                        this.status = status
                    }

                    /** Identifies the support key associated with the porting order. */
                    fun supportKey(supportKey: String) = supportKey(JsonField.of(supportKey))

                    /**
                     * Sets [Builder.supportKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.supportKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun supportKey(supportKey: JsonField<String>) = apply {
                        this.supportKey = supportKey
                    }

                    /** ISO 8601 formatted date indicating when the porting order was moved. */
                    fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                    /**
                     * Sets [Builder.updatedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.updatedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                        this.updatedAt = updatedAt
                    }

                    /** The URL to send the webhook to. */
                    fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

                    /**
                     * Sets [Builder.webhookUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.webhookUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun webhookUrl(webhookUrl: JsonField<String>) = apply {
                        this.webhookUrl = webhookUrl
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
                     * Returns an immutable instance of [WebhookPortingOrderStatusChangedPayload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): WebhookPortingOrderStatusChangedPayload =
                        WebhookPortingOrderStatusChangedPayload(
                            id,
                            customerReference,
                            status,
                            supportKey,
                            updatedAt,
                            webhookUrl,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WebhookPortingOrderStatusChangedPayload = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    customerReference()
                    status().ifPresent { it.validate() }
                    supportKey()
                    updatedAt()
                    webhookUrl()
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
                        (if (customerReference.asKnown().isPresent) 1 else 0) +
                        (status.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (supportKey.asKnown().isPresent) 1 else 0) +
                        (if (updatedAt.asKnown().isPresent) 1 else 0) +
                        (if (webhookUrl.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WebhookPortingOrderStatusChangedPayload &&
                        id == other.id &&
                        customerReference == other.customerReference &&
                        status == other.status &&
                        supportKey == other.supportKey &&
                        updatedAt == other.updatedAt &&
                        webhookUrl == other.webhookUrl &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        customerReference,
                        status,
                        supportKey,
                        updatedAt,
                        webhookUrl,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebhookPortingOrderStatusChangedPayload{id=$id, customerReference=$customerReference, status=$status, supportKey=$supportKey, updatedAt=$updatedAt, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
            }

            /** The webhook payload for the porting_order.new_comment event */
            class WebhookPortingOrderNewCommentPayload
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val comment: JsonField<Comment>,
                private val portingOrderId: JsonField<String>,
                private val supportKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("comment")
                    @ExcludeMissing
                    comment: JsonField<Comment> = JsonMissing.of(),
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
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun comment(): Optional<Comment> = comment.getOptional("comment")

                /**
                 * Identifies the porting order that the comment was added to.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun portingOrderId(): Optional<String> =
                    portingOrderId.getOptional("porting_order_id")

                /**
                 * Identifies the support key associated with the porting order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun supportKey(): Optional<String> = supportKey.getOptional("support_key")

                /**
                 * Returns the raw JSON value of [comment].
                 *
                 * Unlike [comment], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("comment")
                @ExcludeMissing
                fun _comment(): JsonField<Comment> = comment

                /**
                 * Returns the raw JSON value of [portingOrderId].
                 *
                 * Unlike [portingOrderId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("porting_order_id")
                @ExcludeMissing
                fun _portingOrderId(): JsonField<String> = portingOrderId

                /**
                 * Returns the raw JSON value of [supportKey].
                 *
                 * Unlike [supportKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
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

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [WebhookPortingOrderNewCommentPayload].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebhookPortingOrderNewCommentPayload]. */
                class Builder internal constructor() {

                    private var comment: JsonField<Comment> = JsonMissing.of()
                    private var portingOrderId: JsonField<String> = JsonMissing.of()
                    private var supportKey: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        webhookPortingOrderNewCommentPayload: WebhookPortingOrderNewCommentPayload
                    ) = apply {
                        comment = webhookPortingOrderNewCommentPayload.comment
                        portingOrderId = webhookPortingOrderNewCommentPayload.portingOrderId
                        supportKey = webhookPortingOrderNewCommentPayload.supportKey
                        additionalProperties =
                            webhookPortingOrderNewCommentPayload.additionalProperties.toMutableMap()
                    }

                    /** The comment that was added to the porting order. */
                    fun comment(comment: Comment) = comment(JsonField.of(comment))

                    /**
                     * Sets [Builder.comment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.comment] with a well-typed [Comment] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun comment(comment: JsonField<Comment>) = apply { this.comment = comment }

                    /** Identifies the porting order that the comment was added to. */
                    fun portingOrderId(portingOrderId: String) =
                        portingOrderId(JsonField.of(portingOrderId))

                    /**
                     * Sets [Builder.portingOrderId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.portingOrderId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun supportKey(supportKey: JsonField<String>) = apply {
                        this.supportKey = supportKey
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
                     * Returns an immutable instance of [WebhookPortingOrderNewCommentPayload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): WebhookPortingOrderNewCommentPayload =
                        WebhookPortingOrderNewCommentPayload(
                            comment,
                            portingOrderId,
                            supportKey,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WebhookPortingOrderNewCommentPayload = apply {
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
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("body")
                        @ExcludeMissing
                        body: JsonField<String> = JsonMissing.of(),
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
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * The body of the comment.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun body(): Optional<String> = body.getOptional("body")

                    /**
                     * ISO 8601 formatted date indicating when the comment was created.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun insertedAt(): Optional<OffsetDateTime> =
                        insertedAt.getOptional("inserted_at")

                    /**
                     * Identifies the user that create the comment.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun userId(): Optional<String> = userId.getOptional("user_id")

                    /**
                     * Identifies the type of the user that created the comment.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun userType(): Optional<UserType> = userType.getOptional("user_type")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [body].
                     *
                     * Unlike [body], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

                    /**
                     * Returns the raw JSON value of [insertedAt].
                     *
                     * Unlike [insertedAt], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("inserted_at")
                    @ExcludeMissing
                    fun _insertedAt(): JsonField<OffsetDateTime> = insertedAt

                    /**
                     * Returns the raw JSON value of [userId].
                     *
                     * Unlike [userId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("user_id")
                    @ExcludeMissing
                    fun _userId(): JsonField<String> = userId

                    /**
                     * Returns the raw JSON value of [userType].
                     *
                     * Unlike [userType], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        /** The body of the comment. */
                        fun body(body: String) = body(JsonField.of(body))

                        /**
                         * Sets [Builder.body] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.body] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun body(body: JsonField<String>) = apply { this.body = body }

                        /** ISO 8601 formatted date indicating when the comment was created. */
                        fun insertedAt(insertedAt: OffsetDateTime) =
                            insertedAt(JsonField.of(insertedAt))

                        /**
                         * Sets [Builder.insertedAt] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.insertedAt] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
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
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                        /** Identifies the type of the user that created the comment. */
                        fun userType(userType: UserType) = userType(JsonField.of(userType))

                        /**
                         * Sets [Builder.userType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.userType] with a well-typed [UserType]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun userType(userType: JsonField<UserType>) = apply {
                            this.userType = userType
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
                    class UserType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                         * An enum containing [UserType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [UserType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            USER,
                            ADMIN,
                            SYSTEM,
                            /**
                             * An enum member indicating that [UserType] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value is a
                         *   not a known member.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is WebhookPortingOrderNewCommentPayload &&
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
                    "WebhookPortingOrderNewCommentPayload{comment=$comment, portingOrderId=$portingOrderId, supportKey=$supportKey, additionalProperties=$additionalProperties}"
            }

            /** The webhook payload for the porting_order.split event */
            class WebhookPortingOrderSplitPayload
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val from: JsonField<From>,
                private val portingPhoneNumbers: JsonField<List<PortingPhoneNumber>>,
                private val to: JsonField<To>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("from") @ExcludeMissing from: JsonField<From> = JsonMissing.of(),
                    @JsonProperty("porting_phone_numbers")
                    @ExcludeMissing
                    portingPhoneNumbers: JsonField<List<PortingPhoneNumber>> = JsonMissing.of(),
                    @JsonProperty("to") @ExcludeMissing to: JsonField<To> = JsonMissing.of(),
                ) : this(from, portingPhoneNumbers, to, mutableMapOf())

                /**
                 * The porting order that was split.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun from(): Optional<From> = from.getOptional("from")

                /**
                 * The list of porting phone numbers that were moved to the new porting order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun portingPhoneNumbers(): Optional<List<PortingPhoneNumber>> =
                    portingPhoneNumbers.getOptional("porting_phone_numbers")

                /**
                 * The new porting order that the phone numbers was moved to.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun to(): Optional<To> = to.getOptional("to")

                /**
                 * Returns the raw JSON value of [from].
                 *
                 * Unlike [from], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<From> = from

                /**
                 * Returns the raw JSON value of [portingPhoneNumbers].
                 *
                 * Unlike [portingPhoneNumbers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("porting_phone_numbers")
                @ExcludeMissing
                fun _portingPhoneNumbers(): JsonField<List<PortingPhoneNumber>> =
                    portingPhoneNumbers

                /**
                 * Returns the raw JSON value of [to].
                 *
                 * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<To> = to

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
                     * [WebhookPortingOrderSplitPayload].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [WebhookPortingOrderSplitPayload]. */
                class Builder internal constructor() {

                    private var from: JsonField<From> = JsonMissing.of()
                    private var portingPhoneNumbers: JsonField<MutableList<PortingPhoneNumber>>? =
                        null
                    private var to: JsonField<To> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        webhookPortingOrderSplitPayload: WebhookPortingOrderSplitPayload
                    ) = apply {
                        from = webhookPortingOrderSplitPayload.from
                        portingPhoneNumbers =
                            webhookPortingOrderSplitPayload.portingPhoneNumbers.map {
                                it.toMutableList()
                            }
                        to = webhookPortingOrderSplitPayload.to
                        additionalProperties =
                            webhookPortingOrderSplitPayload.additionalProperties.toMutableMap()
                    }

                    /** The porting order that was split. */
                    fun from(from: From) = from(JsonField.of(from))

                    /**
                     * Sets [Builder.from] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.from] with a well-typed [From] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun from(from: JsonField<From>) = apply { this.from = from }

                    /**
                     * The list of porting phone numbers that were moved to the new porting order.
                     */
                    fun portingPhoneNumbers(portingPhoneNumbers: List<PortingPhoneNumber>) =
                        portingPhoneNumbers(JsonField.of(portingPhoneNumbers))

                    /**
                     * Sets [Builder.portingPhoneNumbers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.portingPhoneNumbers] with a well-typed
                     * `List<PortingPhoneNumber>` value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun portingPhoneNumbers(
                        portingPhoneNumbers: JsonField<List<PortingPhoneNumber>>
                    ) = apply {
                        this.portingPhoneNumbers = portingPhoneNumbers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [PortingPhoneNumber] to [portingPhoneNumbers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addPortingPhoneNumber(portingPhoneNumber: PortingPhoneNumber) = apply {
                        portingPhoneNumbers =
                            (portingPhoneNumbers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("portingPhoneNumbers", it).add(portingPhoneNumber)
                            }
                    }

                    /** The new porting order that the phone numbers was moved to. */
                    fun to(to: To) = to(JsonField.of(to))

                    /**
                     * Sets [Builder.to] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.to] with a well-typed [To] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun to(to: JsonField<To>) = apply { this.to = to }

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
                     * Returns an immutable instance of [WebhookPortingOrderSplitPayload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): WebhookPortingOrderSplitPayload =
                        WebhookPortingOrderSplitPayload(
                            from,
                            (portingPhoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                            to,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): WebhookPortingOrderSplitPayload = apply {
                    if (validated) {
                        return@apply
                    }

                    from().ifPresent { it.validate() }
                    portingPhoneNumbers().ifPresent { it.forEach { it.validate() } }
                    to().ifPresent { it.validate() }
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
                    (from.asKnown().getOrNull()?.validity() ?: 0) +
                        (portingPhoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0) +
                        (to.asKnown().getOrNull()?.validity() ?: 0)

                /** The porting order that was split. */
                class From
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
                    ) : this(id, mutableMapOf())

                    /**
                     * Identifies the porting order that was split.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                        /** Returns a mutable builder for constructing an instance of [From]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [From]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(from: From) = apply {
                            id = from.id
                            additionalProperties = from.additionalProperties.toMutableMap()
                        }

                        /** Identifies the porting order that was split. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

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
                         * Returns an immutable instance of [From].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): From = From(id, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): From = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
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
                    internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is From &&
                            id == other.id &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "From{id=$id, additionalProperties=$additionalProperties}"
                }

                class PortingPhoneNumber
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
                    ) : this(id, mutableMapOf())

                    /**
                     * Identifies the porting phone number that was moved.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                         * [PortingPhoneNumber].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [PortingPhoneNumber]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(portingPhoneNumber: PortingPhoneNumber) = apply {
                            id = portingPhoneNumber.id
                            additionalProperties =
                                portingPhoneNumber.additionalProperties.toMutableMap()
                        }

                        /** Identifies the porting phone number that was moved. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

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
                         * Returns an immutable instance of [PortingPhoneNumber].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): PortingPhoneNumber =
                            PortingPhoneNumber(id, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): PortingPhoneNumber = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
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
                    internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PortingPhoneNumber &&
                            id == other.id &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PortingPhoneNumber{id=$id, additionalProperties=$additionalProperties}"
                }

                /** The new porting order that the phone numbers was moved to. */
                class To
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
                    ) : this(id, mutableMapOf())

                    /**
                     * Identifies the porting order that was split.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                        /** Returns a mutable builder for constructing an instance of [To]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [To]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(to: To) = apply {
                            id = to.id
                            additionalProperties = to.additionalProperties.toMutableMap()
                        }

                        /** Identifies the porting order that was split. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

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
                         * Returns an immutable instance of [To].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): To = To(id, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): To = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
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
                    internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is To &&
                            id == other.id &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "To{id=$id, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WebhookPortingOrderSplitPayload &&
                        from == other.from &&
                        portingPhoneNumbers == other.portingPhoneNumbers &&
                        to == other.to &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(from, portingPhoneNumbers, to, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "WebhookPortingOrderSplitPayload{from=$from, portingPhoneNumbers=$portingPhoneNumbers, to=$to, additionalProperties=$additionalProperties}"
            }
        }

        /** The status of the payload generation. */
        class PayloadStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

            return other is Data &&
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
            "Data{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portingOrderId=$portingOrderId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
