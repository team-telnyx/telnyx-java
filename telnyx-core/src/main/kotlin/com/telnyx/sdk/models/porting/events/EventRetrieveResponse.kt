// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

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
import com.telnyx.sdk.models.PortingOrderStatus
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EventRetrieveResponse
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

        /** Returns a mutable builder for constructing an instance of [EventRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventRetrieveResponse: EventRetrieveResponse) = apply {
            data = eventRetrieveResponse.data
            additionalProperties = eventRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventDeletedPayload(portingEventDeletedPayload)`.
         */
        fun data(portingEventDeletedPayload: Data.PortingEventDeletedPayload) =
            data(Data.ofPortingEventDeletedPayload(portingEventDeletedPayload))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventMessagingChangedPayload(portingEventMessagingChangedPayload)`.
         */
        fun data(portingEventMessagingChangedPayload: Data.PortingEventMessagingChangedPayload) =
            data(Data.ofPortingEventMessagingChangedPayload(portingEventMessagingChangedPayload))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventStatusChangedEvent(portingEventStatusChangedEvent)`.
         */
        fun data(portingEventStatusChangedEvent: Data.PortingEventStatusChangedEvent) =
            data(Data.ofPortingEventStatusChangedEvent(portingEventStatusChangedEvent))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventNewCommentEvent(portingEventNewCommentEvent)`.
         */
        fun data(portingEventNewCommentEvent: Data.PortingEventNewCommentEvent) =
            data(Data.ofPortingEventNewCommentEvent(portingEventNewCommentEvent))

        /**
         * Alias for calling [data] with `Data.ofPortingEventSplitEvent(portingEventSplitEvent)`.
         */
        fun data(portingEventSplitEvent: Data.PortingEventSplitEvent) =
            data(Data.ofPortingEventSplitEvent(portingEventSplitEvent))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventWithoutWebhook(portingEventWithoutWebhook)`.
         */
        fun data(portingEventWithoutWebhook: Data.PortingEventWithoutWebhook) =
            data(Data.ofPortingEventWithoutWebhook(portingEventWithoutWebhook))

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
         * Returns an immutable instance of [EventRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventRetrieveResponse =
            EventRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): EventRetrieveResponse = apply {
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

    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val portingEventDeletedPayload: PortingEventDeletedPayload? = null,
        private val portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload? =
            null,
        private val portingEventStatusChangedEvent: PortingEventStatusChangedEvent? = null,
        private val portingEventNewCommentEvent: PortingEventNewCommentEvent? = null,
        private val portingEventSplitEvent: PortingEventSplitEvent? = null,
        private val portingEventWithoutWebhook: PortingEventWithoutWebhook? = null,
        private val _json: JsonValue? = null,
    ) {

        fun portingEventDeletedPayload(): Optional<PortingEventDeletedPayload> =
            Optional.ofNullable(portingEventDeletedPayload)

        fun portingEventMessagingChangedPayload(): Optional<PortingEventMessagingChangedPayload> =
            Optional.ofNullable(portingEventMessagingChangedPayload)

        fun portingEventStatusChangedEvent(): Optional<PortingEventStatusChangedEvent> =
            Optional.ofNullable(portingEventStatusChangedEvent)

        fun portingEventNewCommentEvent(): Optional<PortingEventNewCommentEvent> =
            Optional.ofNullable(portingEventNewCommentEvent)

        fun portingEventSplitEvent(): Optional<PortingEventSplitEvent> =
            Optional.ofNullable(portingEventSplitEvent)

        fun portingEventWithoutWebhook(): Optional<PortingEventWithoutWebhook> =
            Optional.ofNullable(portingEventWithoutWebhook)

        fun isPortingEventDeletedPayload(): Boolean = portingEventDeletedPayload != null

        fun isPortingEventMessagingChangedPayload(): Boolean =
            portingEventMessagingChangedPayload != null

        fun isPortingEventStatusChangedEvent(): Boolean = portingEventStatusChangedEvent != null

        fun isPortingEventNewCommentEvent(): Boolean = portingEventNewCommentEvent != null

        fun isPortingEventSplitEvent(): Boolean = portingEventSplitEvent != null

        fun isPortingEventWithoutWebhook(): Boolean = portingEventWithoutWebhook != null

        fun asPortingEventDeletedPayload(): PortingEventDeletedPayload =
            portingEventDeletedPayload.getOrThrow("portingEventDeletedPayload")

        fun asPortingEventMessagingChangedPayload(): PortingEventMessagingChangedPayload =
            portingEventMessagingChangedPayload.getOrThrow("portingEventMessagingChangedPayload")

        fun asPortingEventStatusChangedEvent(): PortingEventStatusChangedEvent =
            portingEventStatusChangedEvent.getOrThrow("portingEventStatusChangedEvent")

        fun asPortingEventNewCommentEvent(): PortingEventNewCommentEvent =
            portingEventNewCommentEvent.getOrThrow("portingEventNewCommentEvent")

        fun asPortingEventSplitEvent(): PortingEventSplitEvent =
            portingEventSplitEvent.getOrThrow("portingEventSplitEvent")

        fun asPortingEventWithoutWebhook(): PortingEventWithoutWebhook =
            portingEventWithoutWebhook.getOrThrow("portingEventWithoutWebhook")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                portingEventDeletedPayload != null ->
                    visitor.visitPortingEventDeletedPayload(portingEventDeletedPayload)
                portingEventMessagingChangedPayload != null ->
                    visitor.visitPortingEventMessagingChangedPayload(
                        portingEventMessagingChangedPayload
                    )
                portingEventStatusChangedEvent != null ->
                    visitor.visitPortingEventStatusChangedEvent(portingEventStatusChangedEvent)
                portingEventNewCommentEvent != null ->
                    visitor.visitPortingEventNewCommentEvent(portingEventNewCommentEvent)
                portingEventSplitEvent != null ->
                    visitor.visitPortingEventSplitEvent(portingEventSplitEvent)
                portingEventWithoutWebhook != null ->
                    visitor.visitPortingEventWithoutWebhook(portingEventWithoutWebhook)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPortingEventDeletedPayload(
                        portingEventDeletedPayload: PortingEventDeletedPayload
                    ) {
                        portingEventDeletedPayload.validate()
                    }

                    override fun visitPortingEventMessagingChangedPayload(
                        portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload
                    ) {
                        portingEventMessagingChangedPayload.validate()
                    }

                    override fun visitPortingEventStatusChangedEvent(
                        portingEventStatusChangedEvent: PortingEventStatusChangedEvent
                    ) {
                        portingEventStatusChangedEvent.validate()
                    }

                    override fun visitPortingEventNewCommentEvent(
                        portingEventNewCommentEvent: PortingEventNewCommentEvent
                    ) {
                        portingEventNewCommentEvent.validate()
                    }

                    override fun visitPortingEventSplitEvent(
                        portingEventSplitEvent: PortingEventSplitEvent
                    ) {
                        portingEventSplitEvent.validate()
                    }

                    override fun visitPortingEventWithoutWebhook(
                        portingEventWithoutWebhook: PortingEventWithoutWebhook
                    ) {
                        portingEventWithoutWebhook.validate()
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
                    override fun visitPortingEventDeletedPayload(
                        portingEventDeletedPayload: PortingEventDeletedPayload
                    ) = portingEventDeletedPayload.validity()

                    override fun visitPortingEventMessagingChangedPayload(
                        portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload
                    ) = portingEventMessagingChangedPayload.validity()

                    override fun visitPortingEventStatusChangedEvent(
                        portingEventStatusChangedEvent: PortingEventStatusChangedEvent
                    ) = portingEventStatusChangedEvent.validity()

                    override fun visitPortingEventNewCommentEvent(
                        portingEventNewCommentEvent: PortingEventNewCommentEvent
                    ) = portingEventNewCommentEvent.validity()

                    override fun visitPortingEventSplitEvent(
                        portingEventSplitEvent: PortingEventSplitEvent
                    ) = portingEventSplitEvent.validity()

                    override fun visitPortingEventWithoutWebhook(
                        portingEventWithoutWebhook: PortingEventWithoutWebhook
                    ) = portingEventWithoutWebhook.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                portingEventDeletedPayload == other.portingEventDeletedPayload &&
                portingEventMessagingChangedPayload == other.portingEventMessagingChangedPayload &&
                portingEventStatusChangedEvent == other.portingEventStatusChangedEvent &&
                portingEventNewCommentEvent == other.portingEventNewCommentEvent &&
                portingEventSplitEvent == other.portingEventSplitEvent &&
                portingEventWithoutWebhook == other.portingEventWithoutWebhook
        }

        override fun hashCode(): Int =
            Objects.hash(
                portingEventDeletedPayload,
                portingEventMessagingChangedPayload,
                portingEventStatusChangedEvent,
                portingEventNewCommentEvent,
                portingEventSplitEvent,
                portingEventWithoutWebhook,
            )

        override fun toString(): String =
            when {
                portingEventDeletedPayload != null ->
                    "Data{portingEventDeletedPayload=$portingEventDeletedPayload}"
                portingEventMessagingChangedPayload != null ->
                    "Data{portingEventMessagingChangedPayload=$portingEventMessagingChangedPayload}"
                portingEventStatusChangedEvent != null ->
                    "Data{portingEventStatusChangedEvent=$portingEventStatusChangedEvent}"
                portingEventNewCommentEvent != null ->
                    "Data{portingEventNewCommentEvent=$portingEventNewCommentEvent}"
                portingEventSplitEvent != null ->
                    "Data{portingEventSplitEvent=$portingEventSplitEvent}"
                portingEventWithoutWebhook != null ->
                    "Data{portingEventWithoutWebhook=$portingEventWithoutWebhook}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            @JvmStatic
            fun ofPortingEventDeletedPayload(
                portingEventDeletedPayload: PortingEventDeletedPayload
            ) = Data(portingEventDeletedPayload = portingEventDeletedPayload)

            @JvmStatic
            fun ofPortingEventMessagingChangedPayload(
                portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload
            ) = Data(portingEventMessagingChangedPayload = portingEventMessagingChangedPayload)

            @JvmStatic
            fun ofPortingEventStatusChangedEvent(
                portingEventStatusChangedEvent: PortingEventStatusChangedEvent
            ) = Data(portingEventStatusChangedEvent = portingEventStatusChangedEvent)

            @JvmStatic
            fun ofPortingEventNewCommentEvent(
                portingEventNewCommentEvent: PortingEventNewCommentEvent
            ) = Data(portingEventNewCommentEvent = portingEventNewCommentEvent)

            @JvmStatic
            fun ofPortingEventSplitEvent(portingEventSplitEvent: PortingEventSplitEvent) =
                Data(portingEventSplitEvent = portingEventSplitEvent)

            @JvmStatic
            fun ofPortingEventWithoutWebhook(
                portingEventWithoutWebhook: PortingEventWithoutWebhook
            ) = Data(portingEventWithoutWebhook = portingEventWithoutWebhook)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitPortingEventDeletedPayload(
                portingEventDeletedPayload: PortingEventDeletedPayload
            ): T

            fun visitPortingEventMessagingChangedPayload(
                portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload
            ): T

            fun visitPortingEventStatusChangedEvent(
                portingEventStatusChangedEvent: PortingEventStatusChangedEvent
            ): T

            fun visitPortingEventNewCommentEvent(
                portingEventNewCommentEvent: PortingEventNewCommentEvent
            ): T

            fun visitPortingEventSplitEvent(portingEventSplitEvent: PortingEventSplitEvent): T

            fun visitPortingEventWithoutWebhook(
                portingEventWithoutWebhook: PortingEventWithoutWebhook
            ): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)
                val eventType =
                    json.asObject().getOrNull()?.get("event_type")?.asString()?.getOrNull()

                when (eventType) {}

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PortingEventDeletedPayload>())
                                ?.let { Data(portingEventDeletedPayload = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PortingEventMessagingChangedPayload>(),
                                )
                                ?.let {
                                    Data(portingEventMessagingChangedPayload = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PortingEventStatusChangedEvent>())
                                ?.let { Data(portingEventStatusChangedEvent = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PortingEventNewCommentEvent>())
                                ?.let { Data(portingEventNewCommentEvent = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PortingEventSplitEvent>())?.let {
                                Data(portingEventSplitEvent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PortingEventWithoutWebhook>())
                                ?.let { Data(portingEventWithoutWebhook = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Data(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.portingEventDeletedPayload != null ->
                        generator.writeObject(value.portingEventDeletedPayload)
                    value.portingEventMessagingChangedPayload != null ->
                        generator.writeObject(value.portingEventMessagingChangedPayload)
                    value.portingEventStatusChangedEvent != null ->
                        generator.writeObject(value.portingEventStatusChangedEvent)
                    value.portingEventNewCommentEvent != null ->
                        generator.writeObject(value.portingEventNewCommentEvent)
                    value.portingEventSplitEvent != null ->
                        generator.writeObject(value.portingEventSplitEvent)
                    value.portingEventWithoutWebhook != null ->
                        generator.writeObject(value.portingEventWithoutWebhook)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

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
                @JsonProperty("payload")
                @ExcludeMissing
                payload: JsonField<Payload> = JsonMissing.of(),
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Indicates the notification methods used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun availableNotificationMethods(): Optional<List<AvailableNotificationMethod>> =
                availableNotificationMethods.getOptional("available_notification_methods")

            /**
             * Identifies the event type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payload(): Optional<Payload> = payload.getOptional("payload")

            /**
             * The status of the payload generation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payloadStatus(): Optional<PayloadStatus> =
                payloadStatus.getOptional("payload_status")

            /**
             * Identifies the porting order associated with the event.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [availableNotificationMethods], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("available_notification_methods")
            @ExcludeMissing
            fun _availableNotificationMethods(): JsonField<List<AvailableNotificationMethod>> =
                availableNotificationMethods

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [portingOrderId], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [PortingEventDeletedPayload].
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
                        portingEventDeletedPayload.availableNotificationMethods.map {
                            it.toMutableList()
                        }
                    eventType = portingEventDeletedPayload.eventType
                    payload = portingEventDeletedPayload.payload
                    payloadStatus = portingEventDeletedPayload.payloadStatus
                    portingOrderId = portingEventDeletedPayload.portingOrderId
                    additionalProperties =
                        portingEventDeletedPayload.additionalProperties.toMutableMap()
                }

                /** Uniquely identifies the event. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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

                /** Identifies the event type */
                fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                /**
                 * Sets [Builder.eventType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventType] with a well-typed [EventType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

                fun payload(payload: Payload) = payload(JsonField.of(payload))

                /**
                 * Sets [Builder.payload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payload] with a well-typed [Payload] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                /** The status of the payload generation. */
                fun payloadStatus(payloadStatus: PayloadStatus) =
                    payloadStatus(JsonField.of(payloadStatus))

                /**
                 * Sets [Builder.payloadStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payloadStatus] with a well-typed [PayloadStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (availableNotificationMethods.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EMAIL = of("email")

                    @JvmField val WEBHOOK = of("webhook")

                    @JvmField val WEBHOOK_V1 = of("webhook_v1")

                    @JvmStatic
                    fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
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
                 * An instance of [AvailableNotificationMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

                    @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

                    @JvmField
                    val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

                    @JvmField val PORTING_ORDER_STATUS_CHANGED = of("porting_order.status_changed")

                    @JvmField
                    val PORTING_ORDER_SHARING_TOKEN_EXPIRED =
                        of("porting_order.sharing_token_expired")

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PORTING_ORDER_DELETED -> Value.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Value.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Value.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Value.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Value.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PORTING_ORDER_DELETED -> Known.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Known.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Known.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Known.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Known.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                ) : this(
                    id,
                    createdAt,
                    customerReference,
                    deletedAt,
                    recordType,
                    updatedAt,
                    mutableMapOf(),
                )

                /**
                 * Identifies the porting order that was deleted.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * ISO 8601 formatted date indicating when the resource was created.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

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
                 * Identifies the type of the resource.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun recordType(): Optional<String> = recordType.getOptional("record_type")

                /**
                 * ISO 8601 formatted date indicating when the resource was updated.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
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
                 * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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

                /**
                 * Returns the raw JSON value of [recordType].
                 *
                 * Unlike [recordType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("record_type")
                @ExcludeMissing
                fun _recordType(): JsonField<String> = recordType

                /**
                 * Returns the raw JSON value of [updatedAt].
                 *
                 * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** ISO 8601 formatted date indicating when the resource was created. */
                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * Sets [Builder.createdAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.createdAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
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

                    /** Identifies the type of the resource. */
                    fun recordType(recordType: String) = recordType(JsonField.of(recordType))

                    /**
                     * Sets [Builder.recordType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recordType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun recordType(recordType: JsonField<String>) = apply {
                        this.recordType = recordType
                    }

                    /** ISO 8601 formatted date indicating when the resource was updated. */
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
            class PayloadStatus
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
                 * An enum containing [PayloadStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PayloadStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREATED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [PayloadStatus] was instantiated with an
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

        class PortingEventMessagingChangedPayload
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
                @JsonProperty("payload")
                @ExcludeMissing
                payload: JsonField<Payload> = JsonMissing.of(),
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Indicates the notification methods used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun availableNotificationMethods(): Optional<List<AvailableNotificationMethod>> =
                availableNotificationMethods.getOptional("available_notification_methods")

            /**
             * ISO 8601 formatted date indicating when the resource was created.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * Identifies the event type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * The webhook payload for the porting_order.messaging_changed event
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payload(): Optional<Payload> = payload.getOptional("payload")

            /**
             * The status of the payload generation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payloadStatus(): Optional<PayloadStatus> =
                payloadStatus.getOptional("payload_status")

            /**
             * Identifies the porting order associated with the event.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

            /**
             * Identifies the type of the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * ISO 8601 formatted date indicating when the resource was updated.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [availableNotificationMethods], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("available_notification_methods")
            @ExcludeMissing
            fun _availableNotificationMethods(): JsonField<List<AvailableNotificationMethod>> =
                availableNotificationMethods

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [portingOrderId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("porting_order_id")
            @ExcludeMissing
            fun _portingOrderId(): JsonField<String> = portingOrderId

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<String> = recordType

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * [PortingEventMessagingChangedPayload].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PortingEventMessagingChangedPayload]. */
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
                internal fun from(
                    portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload
                ) = apply {
                    id = portingEventMessagingChangedPayload.id
                    availableNotificationMethods =
                        portingEventMessagingChangedPayload.availableNotificationMethods.map {
                            it.toMutableList()
                        }
                    createdAt = portingEventMessagingChangedPayload.createdAt
                    eventType = portingEventMessagingChangedPayload.eventType
                    payload = portingEventMessagingChangedPayload.payload
                    payloadStatus = portingEventMessagingChangedPayload.payloadStatus
                    portingOrderId = portingEventMessagingChangedPayload.portingOrderId
                    recordType = portingEventMessagingChangedPayload.recordType
                    updatedAt = portingEventMessagingChangedPayload.updatedAt
                    additionalProperties =
                        portingEventMessagingChangedPayload.additionalProperties.toMutableMap()
                }

                /** Uniquely identifies the event. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

                /** The webhook payload for the porting_order.messaging_changed event */
                fun payload(payload: Payload) = payload(JsonField.of(payload))

                /**
                 * Sets [Builder.payload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payload] with a well-typed [Payload] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                /** The status of the payload generation. */
                fun payloadStatus(payloadStatus: PayloadStatus) =
                    payloadStatus(JsonField.of(payloadStatus))

                /**
                 * Sets [Builder.payloadStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payloadStatus] with a well-typed [PayloadStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
                }

                /** ISO 8601 formatted date indicating when the resource was updated. */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [PortingEventMessagingChangedPayload].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PortingEventMessagingChangedPayload =
                    PortingEventMessagingChangedPayload(
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

            fun validate(): PortingEventMessagingChangedPayload = apply {
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
                    (availableNotificationMethods.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EMAIL = of("email")

                    @JvmField val WEBHOOK = of("webhook")

                    @JvmField val WEBHOOK_V1 = of("webhook_v1")

                    @JvmStatic
                    fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
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
                 * An instance of [AvailableNotificationMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

                    @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

                    @JvmField
                    val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

                    @JvmField val PORTING_ORDER_STATUS_CHANGED = of("porting_order.status_changed")

                    @JvmField
                    val PORTING_ORDER_SHARING_TOKEN_EXPIRED =
                        of("porting_order.sharing_token_expired")

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PORTING_ORDER_DELETED -> Value.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Value.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Value.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Value.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Value.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PORTING_ORDER_DELETED -> Known.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Known.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Known.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Known.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Known.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

            /** The webhook payload for the porting_order.messaging_changed event */
            class Payload
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

                    /** Returns a mutable builder for constructing an instance of [Payload]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Payload]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var customerReference: JsonField<String> = JsonMissing.of()
                    private var messaging: JsonField<Messaging> = JsonMissing.of()
                    private var supportKey: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payload: Payload) = apply {
                        id = payload.id
                        customerReference = payload.customerReference
                        messaging = payload.messaging
                        supportKey = payload.supportKey
                        additionalProperties = payload.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Payload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Payload =
                        Payload(
                            id,
                            customerReference,
                            messaging,
                            supportKey,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Payload = apply {
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

                    return other is Payload &&
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
                    "Payload{id=$id, customerReference=$customerReference, messaging=$messaging, supportKey=$supportKey, additionalProperties=$additionalProperties}"
            }

            /** The status of the payload generation. */
            class PayloadStatus
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
                 * An enum containing [PayloadStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PayloadStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREATED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [PayloadStatus] was instantiated with an
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return other is PortingEventMessagingChangedPayload &&
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
                "PortingEventMessagingChangedPayload{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portingOrderId=$portingOrderId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        class PortingEventStatusChangedEvent
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
                @JsonProperty("payload")
                @ExcludeMissing
                payload: JsonField<Payload> = JsonMissing.of(),
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Indicates the notification methods used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun availableNotificationMethods(): Optional<List<AvailableNotificationMethod>> =
                availableNotificationMethods.getOptional("available_notification_methods")

            /**
             * ISO 8601 formatted date indicating when the resource was created.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * Identifies the event type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * The webhook payload for the porting_order.status_changed event
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payload(): Optional<Payload> = payload.getOptional("payload")

            /**
             * The status of the payload generation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payloadStatus(): Optional<PayloadStatus> =
                payloadStatus.getOptional("payload_status")

            /**
             * Identifies the porting order associated with the event.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

            /**
             * Identifies the type of the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * ISO 8601 formatted date indicating when the resource was updated.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [availableNotificationMethods], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("available_notification_methods")
            @ExcludeMissing
            fun _availableNotificationMethods(): JsonField<List<AvailableNotificationMethod>> =
                availableNotificationMethods

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [portingOrderId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("porting_order_id")
            @ExcludeMissing
            fun _portingOrderId(): JsonField<String> = portingOrderId

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<String> = recordType

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * [PortingEventStatusChangedEvent].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PortingEventStatusChangedEvent]. */
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
                internal fun from(portingEventStatusChangedEvent: PortingEventStatusChangedEvent) =
                    apply {
                        id = portingEventStatusChangedEvent.id
                        availableNotificationMethods =
                            portingEventStatusChangedEvent.availableNotificationMethods.map {
                                it.toMutableList()
                            }
                        createdAt = portingEventStatusChangedEvent.createdAt
                        eventType = portingEventStatusChangedEvent.eventType
                        payload = portingEventStatusChangedEvent.payload
                        payloadStatus = portingEventStatusChangedEvent.payloadStatus
                        portingOrderId = portingEventStatusChangedEvent.portingOrderId
                        recordType = portingEventStatusChangedEvent.recordType
                        updatedAt = portingEventStatusChangedEvent.updatedAt
                        additionalProperties =
                            portingEventStatusChangedEvent.additionalProperties.toMutableMap()
                    }

                /** Uniquely identifies the event. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

                /** The webhook payload for the porting_order.status_changed event */
                fun payload(payload: Payload) = payload(JsonField.of(payload))

                /**
                 * Sets [Builder.payload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payload] with a well-typed [Payload] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                /** The status of the payload generation. */
                fun payloadStatus(payloadStatus: PayloadStatus) =
                    payloadStatus(JsonField.of(payloadStatus))

                /**
                 * Sets [Builder.payloadStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payloadStatus] with a well-typed [PayloadStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
                }

                /** ISO 8601 formatted date indicating when the resource was updated. */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [PortingEventStatusChangedEvent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PortingEventStatusChangedEvent =
                    PortingEventStatusChangedEvent(
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

            fun validate(): PortingEventStatusChangedEvent = apply {
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
                    (availableNotificationMethods.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EMAIL = of("email")

                    @JvmField val WEBHOOK = of("webhook")

                    @JvmField val WEBHOOK_V1 = of("webhook_v1")

                    @JvmStatic
                    fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
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
                 * An instance of [AvailableNotificationMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

                    @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

                    @JvmField
                    val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

                    @JvmField val PORTING_ORDER_STATUS_CHANGED = of("porting_order.status_changed")

                    @JvmField
                    val PORTING_ORDER_SHARING_TOKEN_EXPIRED =
                        of("porting_order.sharing_token_expired")

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PORTING_ORDER_DELETED -> Value.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Value.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Value.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Value.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Value.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PORTING_ORDER_DELETED -> Known.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Known.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Known.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Known.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Known.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

            /** The webhook payload for the porting_order.status_changed event */
            class Payload
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

                    /** Returns a mutable builder for constructing an instance of [Payload]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Payload]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var customerReference: JsonField<String> = JsonMissing.of()
                    private var status: JsonField<PortingOrderStatus> = JsonMissing.of()
                    private var supportKey: JsonField<String> = JsonMissing.of()
                    private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var webhookUrl: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payload: Payload) = apply {
                        id = payload.id
                        customerReference = payload.customerReference
                        status = payload.status
                        supportKey = payload.supportKey
                        updatedAt = payload.updatedAt
                        webhookUrl = payload.webhookUrl
                        additionalProperties = payload.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Payload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Payload =
                        Payload(
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

                fun validate(): Payload = apply {
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

                    return other is Payload &&
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
                    "Payload{id=$id, customerReference=$customerReference, status=$status, supportKey=$supportKey, updatedAt=$updatedAt, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
            }

            /** The status of the payload generation. */
            class PayloadStatus
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
                 * An enum containing [PayloadStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PayloadStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREATED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [PayloadStatus] was instantiated with an
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return other is PortingEventStatusChangedEvent &&
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
                "PortingEventStatusChangedEvent{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portingOrderId=$portingOrderId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

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
                @JsonProperty("payload")
                @ExcludeMissing
                payload: JsonField<Payload> = JsonMissing.of(),
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Indicates the notification methods used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun availableNotificationMethods(): Optional<List<AvailableNotificationMethod>> =
                availableNotificationMethods.getOptional("available_notification_methods")

            /**
             * ISO 8601 formatted date indicating when the resource was created.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * Identifies the event type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * The webhook payload for the porting_order.new_comment event
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payload(): Optional<Payload> = payload.getOptional("payload")

            /**
             * The status of the payload generation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payloadStatus(): Optional<PayloadStatus> =
                payloadStatus.getOptional("payload_status")

            /**
             * Identifies the porting order associated with the event.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

            /**
             * Identifies the type of the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * ISO 8601 formatted date indicating when the resource was updated.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [availableNotificationMethods], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("available_notification_methods")
            @ExcludeMissing
            fun _availableNotificationMethods(): JsonField<List<AvailableNotificationMethod>> =
                availableNotificationMethods

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [portingOrderId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("porting_order_id")
            @ExcludeMissing
            fun _portingOrderId(): JsonField<String> = portingOrderId

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<String> = recordType

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * [PortingEventNewCommentEvent].
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
                internal fun from(portingEventNewCommentEvent: PortingEventNewCommentEvent) =
                    apply {
                        id = portingEventNewCommentEvent.id
                        availableNotificationMethods =
                            portingEventNewCommentEvent.availableNotificationMethods.map {
                                it.toMutableList()
                            }
                        createdAt = portingEventNewCommentEvent.createdAt
                        eventType = portingEventNewCommentEvent.eventType
                        payload = portingEventNewCommentEvent.payload
                        payloadStatus = portingEventNewCommentEvent.payloadStatus
                        portingOrderId = portingEventNewCommentEvent.portingOrderId
                        recordType = portingEventNewCommentEvent.recordType
                        updatedAt = portingEventNewCommentEvent.updatedAt
                        additionalProperties =
                            portingEventNewCommentEvent.additionalProperties.toMutableMap()
                    }

                /** Uniquely identifies the event. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

                /** The webhook payload for the porting_order.new_comment event */
                fun payload(payload: Payload) = payload(JsonField.of(payload))

                /**
                 * Sets [Builder.payload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payload] with a well-typed [Payload] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                /** The status of the payload generation. */
                fun payloadStatus(payloadStatus: PayloadStatus) =
                    payloadStatus(JsonField.of(payloadStatus))

                /**
                 * Sets [Builder.payloadStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payloadStatus] with a well-typed [PayloadStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
                }

                /** ISO 8601 formatted date indicating when the resource was updated. */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (availableNotificationMethods.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EMAIL = of("email")

                    @JvmField val WEBHOOK = of("webhook")

                    @JvmField val WEBHOOK_V1 = of("webhook_v1")

                    @JvmStatic
                    fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
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
                 * An instance of [AvailableNotificationMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

                    @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

                    @JvmField
                    val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

                    @JvmField val PORTING_ORDER_STATUS_CHANGED = of("porting_order.status_changed")

                    @JvmField
                    val PORTING_ORDER_SHARING_TOKEN_EXPIRED =
                        of("porting_order.sharing_token_expired")

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PORTING_ORDER_DELETED -> Value.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Value.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Value.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Value.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Value.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PORTING_ORDER_DELETED -> Known.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Known.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Known.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Known.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Known.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                     * Returns an immutable instance of [Payload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Payload =
                        Payload(
                            comment,
                            portingOrderId,
                            supportKey,
                            additionalProperties.toMutableMap(),
                        )
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
            class PayloadStatus
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
                 * An enum containing [PayloadStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PayloadStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREATED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [PayloadStatus] was instantiated with an
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

        class PortingEventSplitEvent
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
                @JsonProperty("payload")
                @ExcludeMissing
                payload: JsonField<Payload> = JsonMissing.of(),
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Indicates the notification methods used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun availableNotificationMethods(): Optional<List<AvailableNotificationMethod>> =
                availableNotificationMethods.getOptional("available_notification_methods")

            /**
             * ISO 8601 formatted date indicating when the resource was created.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * Identifies the event type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * The webhook payload for the porting_order.split event
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payload(): Optional<Payload> = payload.getOptional("payload")

            /**
             * The status of the payload generation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payloadStatus(): Optional<PayloadStatus> =
                payloadStatus.getOptional("payload_status")

            /**
             * Identifies the porting order associated with the event.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

            /**
             * Identifies the type of the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * ISO 8601 formatted date indicating when the resource was updated.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [availableNotificationMethods], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("available_notification_methods")
            @ExcludeMissing
            fun _availableNotificationMethods(): JsonField<List<AvailableNotificationMethod>> =
                availableNotificationMethods

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [portingOrderId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("porting_order_id")
            @ExcludeMissing
            fun _portingOrderId(): JsonField<String> = portingOrderId

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<String> = recordType

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * [PortingEventSplitEvent].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PortingEventSplitEvent]. */
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
                internal fun from(portingEventSplitEvent: PortingEventSplitEvent) = apply {
                    id = portingEventSplitEvent.id
                    availableNotificationMethods =
                        portingEventSplitEvent.availableNotificationMethods.map {
                            it.toMutableList()
                        }
                    createdAt = portingEventSplitEvent.createdAt
                    eventType = portingEventSplitEvent.eventType
                    payload = portingEventSplitEvent.payload
                    payloadStatus = portingEventSplitEvent.payloadStatus
                    portingOrderId = portingEventSplitEvent.portingOrderId
                    recordType = portingEventSplitEvent.recordType
                    updatedAt = portingEventSplitEvent.updatedAt
                    additionalProperties =
                        portingEventSplitEvent.additionalProperties.toMutableMap()
                }

                /** Uniquely identifies the event. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

                /** The webhook payload for the porting_order.split event */
                fun payload(payload: Payload) = payload(JsonField.of(payload))

                /**
                 * Sets [Builder.payload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payload] with a well-typed [Payload] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                /** The status of the payload generation. */
                fun payloadStatus(payloadStatus: PayloadStatus) =
                    payloadStatus(JsonField.of(payloadStatus))

                /**
                 * Sets [Builder.payloadStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payloadStatus] with a well-typed [PayloadStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
                }

                /** ISO 8601 formatted date indicating when the resource was updated. */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [PortingEventSplitEvent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PortingEventSplitEvent =
                    PortingEventSplitEvent(
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

            fun validate(): PortingEventSplitEvent = apply {
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
                    (availableNotificationMethods.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EMAIL = of("email")

                    @JvmField val WEBHOOK = of("webhook")

                    @JvmField val WEBHOOK_V1 = of("webhook_v1")

                    @JvmStatic
                    fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
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
                 * An instance of [AvailableNotificationMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

                    @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

                    @JvmField
                    val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

                    @JvmField val PORTING_ORDER_STATUS_CHANGED = of("porting_order.status_changed")

                    @JvmField
                    val PORTING_ORDER_SHARING_TOKEN_EXPIRED =
                        of("porting_order.sharing_token_expired")

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PORTING_ORDER_DELETED -> Value.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Value.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Value.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Value.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Value.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PORTING_ORDER_DELETED -> Known.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Known.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Known.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Known.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Known.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

            /** The webhook payload for the porting_order.split event */
            class Payload
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

                    /** Returns a mutable builder for constructing an instance of [Payload]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Payload]. */
                class Builder internal constructor() {

                    private var from: JsonField<From> = JsonMissing.of()
                    private var portingPhoneNumbers: JsonField<MutableList<PortingPhoneNumber>>? =
                        null
                    private var to: JsonField<To> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payload: Payload) = apply {
                        from = payload.from
                        portingPhoneNumbers = payload.portingPhoneNumbers.map { it.toMutableList() }
                        to = payload.to
                        additionalProperties = payload.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Payload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Payload =
                        Payload(
                            from,
                            (portingPhoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                            to,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Payload = apply {
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

                    return other is Payload &&
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
                    "Payload{from=$from, portingPhoneNumbers=$portingPhoneNumbers, to=$to, additionalProperties=$additionalProperties}"
            }

            /** The status of the payload generation. */
            class PayloadStatus
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
                 * An enum containing [PayloadStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PayloadStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREATED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [PayloadStatus] was instantiated with an
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return other is PortingEventSplitEvent &&
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
                "PortingEventSplitEvent{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portingOrderId=$portingOrderId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        class PortingEventWithoutWebhook
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val availableNotificationMethods: JsonField<List<AvailableNotificationMethod>>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val eventType: JsonField<EventType>,
            private val payload: JsonField<Void>,
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
                @JsonProperty("payload")
                @ExcludeMissing
                payload: JsonField<Void> = JsonMissing.of(),
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Indicates the notification methods used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun availableNotificationMethods(): Optional<List<AvailableNotificationMethod>> =
                availableNotificationMethods.getOptional("available_notification_methods")

            /**
             * ISO 8601 formatted date indicating when the resource was created.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * Identifies the event type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payload(): Optional<Void> = payload.getOptional("payload")

            /**
             * The status of the payload generation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun payloadStatus(): Optional<PayloadStatus> =
                payloadStatus.getOptional("payload_status")

            /**
             * Identifies the porting order associated with the event.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun portingOrderId(): Optional<String> = portingOrderId.getOptional("porting_order_id")

            /**
             * Identifies the type of the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * ISO 8601 formatted date indicating when the resource was updated.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [availableNotificationMethods], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("available_notification_methods")
            @ExcludeMissing
            fun _availableNotificationMethods(): JsonField<List<AvailableNotificationMethod>> =
                availableNotificationMethods

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_type")
            @ExcludeMissing
            fun _eventType(): JsonField<EventType> = eventType

            /**
             * Returns the raw JSON value of [payload].
             *
             * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Void> = payload

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
             * Unlike [portingOrderId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("porting_order_id")
            @ExcludeMissing
            fun _portingOrderId(): JsonField<String> = portingOrderId

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<String> = recordType

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * [PortingEventWithoutWebhook].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PortingEventWithoutWebhook]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var availableNotificationMethods:
                    JsonField<MutableList<AvailableNotificationMethod>>? =
                    null
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var eventType: JsonField<EventType> = JsonMissing.of()
                private var payload: JsonField<Void> = JsonMissing.of()
                private var payloadStatus: JsonField<PayloadStatus> = JsonMissing.of()
                private var portingOrderId: JsonField<String> = JsonMissing.of()
                private var recordType: JsonField<String> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(portingEventWithoutWebhook: PortingEventWithoutWebhook) = apply {
                    id = portingEventWithoutWebhook.id
                    availableNotificationMethods =
                        portingEventWithoutWebhook.availableNotificationMethods.map {
                            it.toMutableList()
                        }
                    createdAt = portingEventWithoutWebhook.createdAt
                    eventType = portingEventWithoutWebhook.eventType
                    payload = portingEventWithoutWebhook.payload
                    payloadStatus = portingEventWithoutWebhook.payloadStatus
                    portingOrderId = portingEventWithoutWebhook.portingOrderId
                    recordType = portingEventWithoutWebhook.recordType
                    updatedAt = portingEventWithoutWebhook.updatedAt
                    additionalProperties =
                        portingEventWithoutWebhook.additionalProperties.toMutableMap()
                }

                /** Uniquely identifies the event. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

                fun payload(payload: Void?) = payload(JsonField.ofNullable(payload))

                /** Alias for calling [Builder.payload] with `payload.orElse(null)`. */
                fun payload(payload: Optional<Void>) = payload(payload.getOrNull())

                /**
                 * Sets [Builder.payload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payload] with a well-typed [Void] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payload(payload: JsonField<Void>) = apply { this.payload = payload }

                /** The status of the payload generation. */
                fun payloadStatus(payloadStatus: PayloadStatus) =
                    payloadStatus(JsonField.of(payloadStatus))

                /**
                 * Sets [Builder.payloadStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payloadStatus] with a well-typed [PayloadStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
                }

                /** ISO 8601 formatted date indicating when the resource was updated. */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [PortingEventWithoutWebhook].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PortingEventWithoutWebhook =
                    PortingEventWithoutWebhook(
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

            fun validate(): PortingEventWithoutWebhook = apply {
                if (validated) {
                    return@apply
                }

                id()
                availableNotificationMethods().ifPresent { it.forEach { it.validate() } }
                createdAt()
                eventType().ifPresent { it.validate() }
                payload()
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
                    (availableNotificationMethods.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (payload.asKnown().isPresent) 1 else 0) +
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EMAIL = of("email")

                    @JvmField val WEBHOOK = of("webhook")

                    @JvmField val WEBHOOK_V1 = of("webhook_v1")

                    @JvmStatic
                    fun of(value: String) = AvailableNotificationMethod(JsonField.of(value))
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
                 * An instance of [AvailableNotificationMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

                    @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

                    @JvmField
                    val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

                    @JvmField val PORTING_ORDER_STATUS_CHANGED = of("porting_order.status_changed")

                    @JvmField
                    val PORTING_ORDER_SHARING_TOKEN_EXPIRED =
                        of("porting_order.sharing_token_expired")

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PORTING_ORDER_DELETED -> Value.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Value.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Value.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Value.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Value.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PORTING_ORDER_DELETED -> Known.PORTING_ORDER_DELETED
                        PORTING_ORDER_LOA_UPDATED -> Known.PORTING_ORDER_LOA_UPDATED
                        PORTING_ORDER_MESSAGING_CHANGED -> Known.PORTING_ORDER_MESSAGING_CHANGED
                        PORTING_ORDER_STATUS_CHANGED -> Known.PORTING_ORDER_STATUS_CHANGED
                        PORTING_ORDER_SHARING_TOKEN_EXPIRED ->
                            Known.PORTING_ORDER_SHARING_TOKEN_EXPIRED
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

            /** The status of the payload generation. */
            class PayloadStatus
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
                 * An enum containing [PayloadStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PayloadStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREATED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [PayloadStatus] was instantiated with an
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return other is PortingEventWithoutWebhook &&
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
                "PortingEventWithoutWebhook{id=$id, availableNotificationMethods=$availableNotificationMethods, createdAt=$createdAt, eventType=$eventType, payload=$payload, payloadStatus=$payloadStatus, portingOrderId=$portingOrderId, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
