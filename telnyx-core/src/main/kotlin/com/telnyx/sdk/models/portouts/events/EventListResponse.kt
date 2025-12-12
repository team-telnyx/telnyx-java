// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = EventListResponse.Deserializer::class)
@JsonSerialize(using = EventListResponse.Serializer::class)
class EventListResponse
private constructor(
    private val webhookPortoutStatusChanged: WebhookPortoutStatusChanged? = null,
    private val webhookPortoutNewComment: WebhookPortoutNewComment? = null,
    private val webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged? = null,
    private val _json: JsonValue? = null,
) {

    fun webhookPortoutStatusChanged(): Optional<WebhookPortoutStatusChanged> =
        Optional.ofNullable(webhookPortoutStatusChanged)

    fun webhookPortoutNewComment(): Optional<WebhookPortoutNewComment> =
        Optional.ofNullable(webhookPortoutNewComment)

    fun webhookPortoutFocDateChanged(): Optional<WebhookPortoutFocDateChanged> =
        Optional.ofNullable(webhookPortoutFocDateChanged)

    fun isWebhookPortoutStatusChanged(): Boolean = webhookPortoutStatusChanged != null

    fun isWebhookPortoutNewComment(): Boolean = webhookPortoutNewComment != null

    fun isWebhookPortoutFocDateChanged(): Boolean = webhookPortoutFocDateChanged != null

    fun asWebhookPortoutStatusChanged(): WebhookPortoutStatusChanged =
        webhookPortoutStatusChanged.getOrThrow("webhookPortoutStatusChanged")

    fun asWebhookPortoutNewComment(): WebhookPortoutNewComment =
        webhookPortoutNewComment.getOrThrow("webhookPortoutNewComment")

    fun asWebhookPortoutFocDateChanged(): WebhookPortoutFocDateChanged =
        webhookPortoutFocDateChanged.getOrThrow("webhookPortoutFocDateChanged")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            webhookPortoutStatusChanged != null ->
                visitor.visitWebhookPortoutStatusChanged(webhookPortoutStatusChanged)
            webhookPortoutNewComment != null ->
                visitor.visitWebhookPortoutNewComment(webhookPortoutNewComment)
            webhookPortoutFocDateChanged != null ->
                visitor.visitWebhookPortoutFocDateChanged(webhookPortoutFocDateChanged)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): EventListResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitWebhookPortoutStatusChanged(
                    webhookPortoutStatusChanged: WebhookPortoutStatusChanged
                ) {
                    webhookPortoutStatusChanged.validate()
                }

                override fun visitWebhookPortoutNewComment(
                    webhookPortoutNewComment: WebhookPortoutNewComment
                ) {
                    webhookPortoutNewComment.validate()
                }

                override fun visitWebhookPortoutFocDateChanged(
                    webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged
                ) {
                    webhookPortoutFocDateChanged.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitWebhookPortoutStatusChanged(
                    webhookPortoutStatusChanged: WebhookPortoutStatusChanged
                ) = webhookPortoutStatusChanged.validity()

                override fun visitWebhookPortoutNewComment(
                    webhookPortoutNewComment: WebhookPortoutNewComment
                ) = webhookPortoutNewComment.validity()

                override fun visitWebhookPortoutFocDateChanged(
                    webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged
                ) = webhookPortoutFocDateChanged.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListResponse &&
            webhookPortoutStatusChanged == other.webhookPortoutStatusChanged &&
            webhookPortoutNewComment == other.webhookPortoutNewComment &&
            webhookPortoutFocDateChanged == other.webhookPortoutFocDateChanged
    }

    override fun hashCode(): Int =
        Objects.hash(
            webhookPortoutStatusChanged,
            webhookPortoutNewComment,
            webhookPortoutFocDateChanged,
        )

    override fun toString(): String =
        when {
            webhookPortoutStatusChanged != null ->
                "EventListResponse{webhookPortoutStatusChanged=$webhookPortoutStatusChanged}"
            webhookPortoutNewComment != null ->
                "EventListResponse{webhookPortoutNewComment=$webhookPortoutNewComment}"
            webhookPortoutFocDateChanged != null ->
                "EventListResponse{webhookPortoutFocDateChanged=$webhookPortoutFocDateChanged}"
            _json != null -> "EventListResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EventListResponse")
        }

    companion object {

        @JvmStatic
        fun ofWebhookPortoutStatusChanged(
            webhookPortoutStatusChanged: WebhookPortoutStatusChanged
        ) = EventListResponse(webhookPortoutStatusChanged = webhookPortoutStatusChanged)

        @JvmStatic
        fun ofWebhookPortoutNewComment(webhookPortoutNewComment: WebhookPortoutNewComment) =
            EventListResponse(webhookPortoutNewComment = webhookPortoutNewComment)

        @JvmStatic
        fun ofWebhookPortoutFocDateChanged(
            webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged
        ) = EventListResponse(webhookPortoutFocDateChanged = webhookPortoutFocDateChanged)
    }

    /**
     * An interface that defines how to map each variant of [EventListResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitWebhookPortoutStatusChanged(
            webhookPortoutStatusChanged: WebhookPortoutStatusChanged
        ): T

        fun visitWebhookPortoutNewComment(webhookPortoutNewComment: WebhookPortoutNewComment): T

        fun visitWebhookPortoutFocDateChanged(
            webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged
        ): T

        /**
         * Maps an unknown variant of [EventListResponse] to a value of type [T].
         *
         * An instance of [EventListResponse] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown EventListResponse: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<EventListResponse>(EventListResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EventListResponse {
            val json = JsonValue.fromJsonNode(node)
            val eventType = json.asObject().getOrNull()?.get("event_type")?.asString()?.getOrNull()

            when (eventType) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<WebhookPortoutStatusChanged>())?.let {
                            EventListResponse(webhookPortoutStatusChanged = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<WebhookPortoutNewComment>())?.let {
                            EventListResponse(webhookPortoutNewComment = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<WebhookPortoutFocDateChanged>())?.let {
                            EventListResponse(webhookPortoutFocDateChanged = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> EventListResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<EventListResponse>(EventListResponse::class) {

        override fun serialize(
            value: EventListResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.webhookPortoutStatusChanged != null ->
                    generator.writeObject(value.webhookPortoutStatusChanged)
                value.webhookPortoutNewComment != null ->
                    generator.writeObject(value.webhookPortoutNewComment)
                value.webhookPortoutFocDateChanged != null ->
                    generator.writeObject(value.webhookPortoutFocDateChanged)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EventListResponse")
            }
        }
    }

    class WebhookPortoutStatusChanged
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val availableNotificationMethods: JsonField<List<AvailableNotificationMethod>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val eventType: JsonField<EventType>,
        private val payload: JsonField<Payload>,
        private val payloadStatus: JsonField<PayloadStatus>,
        private val portoutId: JsonField<String>,
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
            @JsonProperty("portout_id")
            @ExcludeMissing
            portoutId: JsonField<String> = JsonMissing.of(),
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
            portoutId,
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
         * The webhook payload for the portout.status_changed event
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
         * Identifies the port-out order associated with the event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portoutId(): Optional<String> = portoutId.getOptional("portout_id")

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
         * Returns the raw JSON value of [portoutId].
         *
         * Unlike [portoutId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("portout_id") @ExcludeMissing fun _portoutId(): JsonField<String> = portoutId

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

            /**
             * Returns a mutable builder for constructing an instance of
             * [WebhookPortoutStatusChanged].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookPortoutStatusChanged]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var availableNotificationMethods:
                JsonField<MutableList<AvailableNotificationMethod>>? =
                null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var payload: JsonField<Payload> = JsonMissing.of()
            private var payloadStatus: JsonField<PayloadStatus> = JsonMissing.of()
            private var portoutId: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookPortoutStatusChanged: WebhookPortoutStatusChanged) = apply {
                id = webhookPortoutStatusChanged.id
                availableNotificationMethods =
                    webhookPortoutStatusChanged.availableNotificationMethods.map {
                        it.toMutableList()
                    }
                createdAt = webhookPortoutStatusChanged.createdAt
                eventType = webhookPortoutStatusChanged.eventType
                payload = webhookPortoutStatusChanged.payload
                payloadStatus = webhookPortoutStatusChanged.payloadStatus
                portoutId = webhookPortoutStatusChanged.portoutId
                recordType = webhookPortoutStatusChanged.recordType
                updatedAt = webhookPortoutStatusChanged.updatedAt
                additionalProperties =
                    webhookPortoutStatusChanged.additionalProperties.toMutableMap()
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

            /** The webhook payload for the portout.status_changed event */
            fun payload(payload: Payload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

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

            /** Identifies the port-out order associated with the event. */
            fun portoutId(portoutId: String) = portoutId(JsonField.of(portoutId))

            /**
             * Sets [Builder.portoutId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portoutId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portoutId(portoutId: JsonField<String>) = apply { this.portoutId = portoutId }

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
             * Returns an immutable instance of [WebhookPortoutStatusChanged].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookPortoutStatusChanged =
                WebhookPortoutStatusChanged(
                    id,
                    (availableNotificationMethods ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    eventType,
                    payload,
                    payloadStatus,
                    portoutId,
                    recordType,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): WebhookPortoutStatusChanged = apply {
            if (validated) {
                return@apply
            }

            id()
            availableNotificationMethods().ifPresent { it.forEach { it.validate() } }
            createdAt()
            eventType().ifPresent { it.validate() }
            payload().ifPresent { it.validate() }
            payloadStatus().ifPresent { it.validate() }
            portoutId()
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
                (if (portoutId.asKnown().isPresent) 1 else 0) +
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

                @JvmStatic fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
            }

            /** An enum containing [AvailableNotificationMethod]'s known values. */
            enum class Known {
                EMAIL,
                WEBHOOK,
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

                @JvmField val PORTOUT_STATUS_CHANGED = of("portout.status_changed")

                @JvmField val PORTOUT_FOC_DATE_CHANGED = of("portout.foc_date_changed")

                @JvmField val PORTOUT_NEW_COMMENT = of("portout.new_comment")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                PORTOUT_STATUS_CHANGED,
                PORTOUT_FOC_DATE_CHANGED,
                PORTOUT_NEW_COMMENT,
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
                PORTOUT_STATUS_CHANGED,
                PORTOUT_FOC_DATE_CHANGED,
                PORTOUT_NEW_COMMENT,
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
                    PORTOUT_STATUS_CHANGED -> Value.PORTOUT_STATUS_CHANGED
                    PORTOUT_FOC_DATE_CHANGED -> Value.PORTOUT_FOC_DATE_CHANGED
                    PORTOUT_NEW_COMMENT -> Value.PORTOUT_NEW_COMMENT
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
                    PORTOUT_STATUS_CHANGED -> Known.PORTOUT_STATUS_CHANGED
                    PORTOUT_FOC_DATE_CHANGED -> Known.PORTOUT_FOC_DATE_CHANGED
                    PORTOUT_NEW_COMMENT -> Known.PORTOUT_NEW_COMMENT
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

        /** The webhook payload for the portout.status_changed event */
        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val attemptedPin: JsonField<String>,
            private val carrierName: JsonField<String>,
            private val phoneNumbers: JsonField<List<String>>,
            private val rejectionReason: JsonField<String>,
            private val spid: JsonField<String>,
            private val status: JsonField<Status>,
            private val subscriberName: JsonField<String>,
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("attempted_pin")
                @ExcludeMissing
                attemptedPin: JsonField<String> = JsonMissing.of(),
                @JsonProperty("carrier_name")
                @ExcludeMissing
                carrierName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_numbers")
                @ExcludeMissing
                phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("rejection_reason")
                @ExcludeMissing
                rejectionReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("spid") @ExcludeMissing spid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("subscriber_name")
                @ExcludeMissing
                subscriberName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                attemptedPin,
                carrierName,
                phoneNumbers,
                rejectionReason,
                spid,
                status,
                subscriberName,
                userId,
                mutableMapOf(),
            )

            /**
             * Identifies the port out that was moved.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The PIN that was attempted to be used to authorize the port out.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attemptedPin(): Optional<String> = attemptedPin.getOptional("attempted_pin")

            /**
             * Carrier the number will be ported out to
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun carrierName(): Optional<String> = carrierName.getOptional("carrier_name")

            /**
             * Phone numbers associated with this port-out order
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumbers(): Optional<List<String>> = phoneNumbers.getOptional("phone_numbers")

            /**
             * The reason why the order is being rejected by the user. If the order is authorized,
             * this field can be left null
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rejectionReason(): Optional<String> =
                rejectionReason.getOptional("rejection_reason")

            /**
             * The new carrier SPID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spid(): Optional<String> = spid.getOptional("spid")

            /**
             * The new status of the port out.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * The name of the port-out's end user.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subscriberName(): Optional<String> = subscriberName.getOptional("subscriber_name")

            /**
             * Identifies the user that the port-out order belongs to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): Optional<String> = userId.getOptional("user_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [attemptedPin].
             *
             * Unlike [attemptedPin], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attempted_pin")
            @ExcludeMissing
            fun _attemptedPin(): JsonField<String> = attemptedPin

            /**
             * Returns the raw JSON value of [carrierName].
             *
             * Unlike [carrierName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("carrier_name")
            @ExcludeMissing
            fun _carrierName(): JsonField<String> = carrierName

            /**
             * Returns the raw JSON value of [phoneNumbers].
             *
             * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

            /**
             * Returns the raw JSON value of [rejectionReason].
             *
             * Unlike [rejectionReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("rejection_reason")
            @ExcludeMissing
            fun _rejectionReason(): JsonField<String> = rejectionReason

            /**
             * Returns the raw JSON value of [spid].
             *
             * Unlike [spid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spid") @ExcludeMissing fun _spid(): JsonField<String> = spid

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [subscriberName].
             *
             * Unlike [subscriberName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscriber_name")
            @ExcludeMissing
            fun _subscriberName(): JsonField<String> = subscriberName

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

                private var id: JsonField<String> = JsonMissing.of()
                private var attemptedPin: JsonField<String> = JsonMissing.of()
                private var carrierName: JsonField<String> = JsonMissing.of()
                private var phoneNumbers: JsonField<MutableList<String>>? = null
                private var rejectionReason: JsonField<String> = JsonMissing.of()
                private var spid: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var subscriberName: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    id = payload.id
                    attemptedPin = payload.attemptedPin
                    carrierName = payload.carrierName
                    phoneNumbers = payload.phoneNumbers.map { it.toMutableList() }
                    rejectionReason = payload.rejectionReason
                    spid = payload.spid
                    status = payload.status
                    subscriberName = payload.subscriberName
                    userId = payload.userId
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** Identifies the port out that was moved. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The PIN that was attempted to be used to authorize the port out. */
                fun attemptedPin(attemptedPin: String) = attemptedPin(JsonField.of(attemptedPin))

                /**
                 * Sets [Builder.attemptedPin] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attemptedPin] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attemptedPin(attemptedPin: JsonField<String>) = apply {
                    this.attemptedPin = attemptedPin
                }

                /** Carrier the number will be ported out to */
                fun carrierName(carrierName: String) = carrierName(JsonField.of(carrierName))

                /**
                 * Sets [Builder.carrierName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.carrierName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun carrierName(carrierName: JsonField<String>) = apply {
                    this.carrierName = carrierName
                }

                /** Phone numbers associated with this port-out order */
                fun phoneNumbers(phoneNumbers: List<String>) =
                    phoneNumbers(JsonField.of(phoneNumbers))

                /**
                 * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
                    this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [phoneNumbers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPhoneNumber(phoneNumber: String) = apply {
                    phoneNumbers =
                        (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("phoneNumbers", it).add(phoneNumber)
                        }
                }

                /**
                 * The reason why the order is being rejected by the user. If the order is
                 * authorized, this field can be left null
                 */
                fun rejectionReason(rejectionReason: String?) =
                    rejectionReason(JsonField.ofNullable(rejectionReason))

                /**
                 * Alias for calling [Builder.rejectionReason] with `rejectionReason.orElse(null)`.
                 */
                fun rejectionReason(rejectionReason: Optional<String>) =
                    rejectionReason(rejectionReason.getOrNull())

                /**
                 * Sets [Builder.rejectionReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rejectionReason] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rejectionReason(rejectionReason: JsonField<String>) = apply {
                    this.rejectionReason = rejectionReason
                }

                /** The new carrier SPID. */
                fun spid(spid: String) = spid(JsonField.of(spid))

                /**
                 * Sets [Builder.spid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spid] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spid(spid: JsonField<String>) = apply { this.spid = spid }

                /** The new status of the port out. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** The name of the port-out's end user. */
                fun subscriberName(subscriberName: String) =
                    subscriberName(JsonField.of(subscriberName))

                /**
                 * Sets [Builder.subscriberName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriberName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriberName(subscriberName: JsonField<String>) = apply {
                    this.subscriberName = subscriberName
                }

                /** Identifies the user that the port-out order belongs to. */
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
                        id,
                        attemptedPin,
                        carrierName,
                        (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                        rejectionReason,
                        spid,
                        status,
                        subscriberName,
                        userId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                id()
                attemptedPin()
                carrierName()
                phoneNumbers()
                rejectionReason()
                spid()
                status().ifPresent { it.validate() }
                subscriberName()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (attemptedPin.asKnown().isPresent) 1 else 0) +
                    (if (carrierName.asKnown().isPresent) 1 else 0) +
                    (phoneNumbers.asKnown().getOrNull()?.size ?: 0) +
                    (if (rejectionReason.asKnown().isPresent) 1 else 0) +
                    (if (spid.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (subscriberName.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0)

            /** The new status of the port out. */
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

                    @JvmField val PENDING = of("pending")

                    @JvmField val AUTHORIZED = of("authorized")

                    @JvmField val PORTED = of("ported")

                    @JvmField val REJECTED = of("rejected")

                    @JvmField val REJECTED_PENDING = of("rejected-pending")

                    @JvmField val CANCELED = of("canceled")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    PENDING,
                    AUTHORIZED,
                    PORTED,
                    REJECTED,
                    REJECTED_PENDING,
                    CANCELED,
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
                    PENDING,
                    AUTHORIZED,
                    PORTED,
                    REJECTED,
                    REJECTED_PENDING,
                    CANCELED,
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
                        PENDING -> Value.PENDING
                        AUTHORIZED -> Value.AUTHORIZED
                        PORTED -> Value.PORTED
                        REJECTED -> Value.REJECTED
                        REJECTED_PENDING -> Value.REJECTED_PENDING
                        CANCELED -> Value.CANCELED
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
                        AUTHORIZED -> Known.AUTHORIZED
                        PORTED -> Known.PORTED
                        REJECTED -> Known.REJECTED
                        REJECTED_PENDING -> Known.REJECTED_PENDING
                        CANCELED -> Known.CANCELED
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
                    id == other.id &&
                    attemptedPin == other.attemptedPin &&
                    carrierName == other.carrierName &&
                    phoneNumbers == other.phoneNumbers &&
                    rejectionReason == other.rejectionReason &&
                    spid == other.spid &&
                    status == other.status &&
                    subscriberName == other.subscriberName &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    attemptedPin,
                    carrierName,
                    phoneNumbers,
                    rejectionReason,
                    spid,
                    status,
                    subscriberName,
                    userId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{id=$id, attemptedPin=$attemptedPin, carrierName=$carrierName, phoneNumbers=$phoneNumbers, rejectionReason=$rejectionReason, spid=$spid, status=$status, subscriberName=$subscriberName, userId=$userId, additionalProperties=$additionalProperties}"
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

            return other is WebhookPortoutStatusChanged &&
                id == other.id &&
                availableNotificationMethods == other.availableNotificationMethods &&
                createdAt == other.createdAt &&
                eventType == other.eventType &&
                payload == other.payload &&
                payloadStatus == other.payloadStatus &&
                portoutId == other.portoutId &&
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
                portoutId,
                recordType,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WebhookPortoutStatusChanged{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portoutId=$portoutId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    class WebhookPortoutNewComment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val availableNotificationMethods: JsonField<List<AvailableNotificationMethod>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val eventType: JsonField<EventType>,
        private val payload: JsonField<Payload>,
        private val payloadStatus: JsonField<PayloadStatus>,
        private val portoutId: JsonField<String>,
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
            @JsonProperty("portout_id")
            @ExcludeMissing
            portoutId: JsonField<String> = JsonMissing.of(),
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
            portoutId,
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
         * The webhook payload for the portout.new_comment event
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
         * Identifies the port-out order associated with the event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portoutId(): Optional<String> = portoutId.getOptional("portout_id")

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
         * Returns the raw JSON value of [portoutId].
         *
         * Unlike [portoutId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("portout_id") @ExcludeMissing fun _portoutId(): JsonField<String> = portoutId

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

            /**
             * Returns a mutable builder for constructing an instance of [WebhookPortoutNewComment].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookPortoutNewComment]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var availableNotificationMethods:
                JsonField<MutableList<AvailableNotificationMethod>>? =
                null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var payload: JsonField<Payload> = JsonMissing.of()
            private var payloadStatus: JsonField<PayloadStatus> = JsonMissing.of()
            private var portoutId: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookPortoutNewComment: WebhookPortoutNewComment) = apply {
                id = webhookPortoutNewComment.id
                availableNotificationMethods =
                    webhookPortoutNewComment.availableNotificationMethods.map { it.toMutableList() }
                createdAt = webhookPortoutNewComment.createdAt
                eventType = webhookPortoutNewComment.eventType
                payload = webhookPortoutNewComment.payload
                payloadStatus = webhookPortoutNewComment.payloadStatus
                portoutId = webhookPortoutNewComment.portoutId
                recordType = webhookPortoutNewComment.recordType
                updatedAt = webhookPortoutNewComment.updatedAt
                additionalProperties = webhookPortoutNewComment.additionalProperties.toMutableMap()
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

            /** The webhook payload for the portout.new_comment event */
            fun payload(payload: Payload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

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

            /** Identifies the port-out order associated with the event. */
            fun portoutId(portoutId: String) = portoutId(JsonField.of(portoutId))

            /**
             * Sets [Builder.portoutId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portoutId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portoutId(portoutId: JsonField<String>) = apply { this.portoutId = portoutId }

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
             * Returns an immutable instance of [WebhookPortoutNewComment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookPortoutNewComment =
                WebhookPortoutNewComment(
                    id,
                    (availableNotificationMethods ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    eventType,
                    payload,
                    payloadStatus,
                    portoutId,
                    recordType,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): WebhookPortoutNewComment = apply {
            if (validated) {
                return@apply
            }

            id()
            availableNotificationMethods().ifPresent { it.forEach { it.validate() } }
            createdAt()
            eventType().ifPresent { it.validate() }
            payload().ifPresent { it.validate() }
            payloadStatus().ifPresent { it.validate() }
            portoutId()
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
                (if (portoutId.asKnown().isPresent) 1 else 0) +
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

                @JvmStatic fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
            }

            /** An enum containing [AvailableNotificationMethod]'s known values. */
            enum class Known {
                EMAIL,
                WEBHOOK,
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

                @JvmField val PORTOUT_STATUS_CHANGED = of("portout.status_changed")

                @JvmField val PORTOUT_FOC_DATE_CHANGED = of("portout.foc_date_changed")

                @JvmField val PORTOUT_NEW_COMMENT = of("portout.new_comment")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                PORTOUT_STATUS_CHANGED,
                PORTOUT_FOC_DATE_CHANGED,
                PORTOUT_NEW_COMMENT,
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
                PORTOUT_STATUS_CHANGED,
                PORTOUT_FOC_DATE_CHANGED,
                PORTOUT_NEW_COMMENT,
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
                    PORTOUT_STATUS_CHANGED -> Value.PORTOUT_STATUS_CHANGED
                    PORTOUT_FOC_DATE_CHANGED -> Value.PORTOUT_FOC_DATE_CHANGED
                    PORTOUT_NEW_COMMENT -> Value.PORTOUT_NEW_COMMENT
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
                    PORTOUT_STATUS_CHANGED -> Known.PORTOUT_STATUS_CHANGED
                    PORTOUT_FOC_DATE_CHANGED -> Known.PORTOUT_FOC_DATE_CHANGED
                    PORTOUT_NEW_COMMENT -> Known.PORTOUT_NEW_COMMENT
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

        /** The webhook payload for the portout.new_comment event */
        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val comment: JsonField<String>,
            private val portoutId: JsonField<String>,
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("comment")
                @ExcludeMissing
                comment: JsonField<String> = JsonMissing.of(),
                @JsonProperty("portout_id")
                @ExcludeMissing
                portoutId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
            ) : this(id, comment, portoutId, userId, mutableMapOf())

            /**
             * Identifies the comment that was added to the port-out order.
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
            fun comment(): Optional<String> = comment.getOptional("comment")

            /**
             * Identifies the port-out order that the comment was added to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun portoutId(): Optional<String> = portoutId.getOptional("portout_id")

            /**
             * Identifies the user that added the comment.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): Optional<String> = userId.getOptional("user_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [comment].
             *
             * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

            /**
             * Returns the raw JSON value of [portoutId].
             *
             * Unlike [portoutId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("portout_id")
            @ExcludeMissing
            fun _portoutId(): JsonField<String> = portoutId

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

                private var id: JsonField<String> = JsonMissing.of()
                private var comment: JsonField<String> = JsonMissing.of()
                private var portoutId: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    id = payload.id
                    comment = payload.comment
                    portoutId = payload.portoutId
                    userId = payload.userId
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** Identifies the comment that was added to the port-out order. */
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
                fun comment(comment: String) = comment(JsonField.of(comment))

                /**
                 * Sets [Builder.comment] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comment] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comment(comment: JsonField<String>) = apply { this.comment = comment }

                /** Identifies the port-out order that the comment was added to. */
                fun portoutId(portoutId: String) = portoutId(JsonField.of(portoutId))

                /**
                 * Sets [Builder.portoutId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.portoutId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun portoutId(portoutId: JsonField<String>) = apply { this.portoutId = portoutId }

                /** Identifies the user that added the comment. */
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
                    Payload(id, comment, portoutId, userId, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                id()
                comment()
                portoutId()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (comment.asKnown().isPresent) 1 else 0) +
                    (if (portoutId.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    id == other.id &&
                    comment == other.comment &&
                    portoutId == other.portoutId &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, comment, portoutId, userId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{id=$id, comment=$comment, portoutId=$portoutId, userId=$userId, additionalProperties=$additionalProperties}"
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

            return other is WebhookPortoutNewComment &&
                id == other.id &&
                availableNotificationMethods == other.availableNotificationMethods &&
                createdAt == other.createdAt &&
                eventType == other.eventType &&
                payload == other.payload &&
                payloadStatus == other.payloadStatus &&
                portoutId == other.portoutId &&
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
                portoutId,
                recordType,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WebhookPortoutNewComment{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portoutId=$portoutId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    class WebhookPortoutFocDateChanged
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val availableNotificationMethods: JsonField<List<AvailableNotificationMethod>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val eventType: JsonField<EventType>,
        private val payload: JsonField<Payload>,
        private val payloadStatus: JsonField<PayloadStatus>,
        private val portoutId: JsonField<String>,
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
            @JsonProperty("portout_id")
            @ExcludeMissing
            portoutId: JsonField<String> = JsonMissing.of(),
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
            portoutId,
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
         * The webhook payload for the portout.foc_date_changed event
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
         * Identifies the port-out order associated with the event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portoutId(): Optional<String> = portoutId.getOptional("portout_id")

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
         * Returns the raw JSON value of [portoutId].
         *
         * Unlike [portoutId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("portout_id") @ExcludeMissing fun _portoutId(): JsonField<String> = portoutId

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

            /**
             * Returns a mutable builder for constructing an instance of
             * [WebhookPortoutFocDateChanged].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookPortoutFocDateChanged]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var availableNotificationMethods:
                JsonField<MutableList<AvailableNotificationMethod>>? =
                null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var payload: JsonField<Payload> = JsonMissing.of()
            private var payloadStatus: JsonField<PayloadStatus> = JsonMissing.of()
            private var portoutId: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged) = apply {
                id = webhookPortoutFocDateChanged.id
                availableNotificationMethods =
                    webhookPortoutFocDateChanged.availableNotificationMethods.map {
                        it.toMutableList()
                    }
                createdAt = webhookPortoutFocDateChanged.createdAt
                eventType = webhookPortoutFocDateChanged.eventType
                payload = webhookPortoutFocDateChanged.payload
                payloadStatus = webhookPortoutFocDateChanged.payloadStatus
                portoutId = webhookPortoutFocDateChanged.portoutId
                recordType = webhookPortoutFocDateChanged.recordType
                updatedAt = webhookPortoutFocDateChanged.updatedAt
                additionalProperties =
                    webhookPortoutFocDateChanged.additionalProperties.toMutableMap()
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

            /** The webhook payload for the portout.foc_date_changed event */
            fun payload(payload: Payload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

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

            /** Identifies the port-out order associated with the event. */
            fun portoutId(portoutId: String) = portoutId(JsonField.of(portoutId))

            /**
             * Sets [Builder.portoutId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portoutId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portoutId(portoutId: JsonField<String>) = apply { this.portoutId = portoutId }

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
             * Returns an immutable instance of [WebhookPortoutFocDateChanged].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookPortoutFocDateChanged =
                WebhookPortoutFocDateChanged(
                    id,
                    (availableNotificationMethods ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    eventType,
                    payload,
                    payloadStatus,
                    portoutId,
                    recordType,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): WebhookPortoutFocDateChanged = apply {
            if (validated) {
                return@apply
            }

            id()
            availableNotificationMethods().ifPresent { it.forEach { it.validate() } }
            createdAt()
            eventType().ifPresent { it.validate() }
            payload().ifPresent { it.validate() }
            payloadStatus().ifPresent { it.validate() }
            portoutId()
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
                (if (portoutId.asKnown().isPresent) 1 else 0) +
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

                @JvmStatic fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
            }

            /** An enum containing [AvailableNotificationMethod]'s known values. */
            enum class Known {
                EMAIL,
                WEBHOOK,
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

                @JvmField val PORTOUT_STATUS_CHANGED = of("portout.status_changed")

                @JvmField val PORTOUT_FOC_DATE_CHANGED = of("portout.foc_date_changed")

                @JvmField val PORTOUT_NEW_COMMENT = of("portout.new_comment")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                PORTOUT_STATUS_CHANGED,
                PORTOUT_FOC_DATE_CHANGED,
                PORTOUT_NEW_COMMENT,
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
                PORTOUT_STATUS_CHANGED,
                PORTOUT_FOC_DATE_CHANGED,
                PORTOUT_NEW_COMMENT,
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
                    PORTOUT_STATUS_CHANGED -> Value.PORTOUT_STATUS_CHANGED
                    PORTOUT_FOC_DATE_CHANGED -> Value.PORTOUT_FOC_DATE_CHANGED
                    PORTOUT_NEW_COMMENT -> Value.PORTOUT_NEW_COMMENT
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
                    PORTOUT_STATUS_CHANGED -> Known.PORTOUT_STATUS_CHANGED
                    PORTOUT_FOC_DATE_CHANGED -> Known.PORTOUT_FOC_DATE_CHANGED
                    PORTOUT_NEW_COMMENT -> Known.PORTOUT_NEW_COMMENT
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

        /** The webhook payload for the portout.foc_date_changed event */
        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val focDate: JsonField<OffsetDateTime>,
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("foc_date")
                @ExcludeMissing
                focDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
            ) : this(id, focDate, userId, mutableMapOf())

            /**
             * Identifies the port-out order that have the FOC date changed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * ISO 8601 formatted date indicating the new FOC date.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun focDate(): Optional<OffsetDateTime> = focDate.getOptional("foc_date")

            /**
             * Identifies the organization that port-out order belongs to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): Optional<String> = userId.getOptional("user_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [focDate].
             *
             * Unlike [focDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("foc_date")
            @ExcludeMissing
            fun _focDate(): JsonField<OffsetDateTime> = focDate

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

                private var id: JsonField<String> = JsonMissing.of()
                private var focDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    id = payload.id
                    focDate = payload.focDate
                    userId = payload.userId
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** Identifies the port-out order that have the FOC date changed. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** ISO 8601 formatted date indicating the new FOC date. */
                fun focDate(focDate: OffsetDateTime) = focDate(JsonField.of(focDate))

                /**
                 * Sets [Builder.focDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.focDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun focDate(focDate: JsonField<OffsetDateTime>) = apply { this.focDate = focDate }

                /** Identifies the organization that port-out order belongs to. */
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
                    Payload(id, focDate, userId, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                id()
                focDate()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (focDate.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    id == other.id &&
                    focDate == other.focDate &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, focDate, userId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{id=$id, focDate=$focDate, userId=$userId, additionalProperties=$additionalProperties}"
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

            return other is WebhookPortoutFocDateChanged &&
                id == other.id &&
                availableNotificationMethods == other.availableNotificationMethods &&
                createdAt == other.createdAt &&
                eventType == other.eventType &&
                payload == other.payload &&
                payloadStatus == other.payloadStatus &&
                portoutId == other.portoutId &&
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
                portoutId,
                recordType,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WebhookPortoutFocDateChanged{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portoutId=$portoutId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }
}
