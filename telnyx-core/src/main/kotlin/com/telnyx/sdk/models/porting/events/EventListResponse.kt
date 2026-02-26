// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = EventListResponse.Deserializer::class)
@JsonSerialize(using = EventListResponse.Serializer::class)
class EventListResponse
private constructor(
    private val portingEventDeletedPayload: PortingEventDeletedPayload? = null,
    private val portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload? = null,
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

    fun validate(): EventListResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is EventListResponse &&
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
                "EventListResponse{portingEventDeletedPayload=$portingEventDeletedPayload}"
            portingEventMessagingChangedPayload != null ->
                "EventListResponse{portingEventMessagingChangedPayload=$portingEventMessagingChangedPayload}"
            portingEventStatusChangedEvent != null ->
                "EventListResponse{portingEventStatusChangedEvent=$portingEventStatusChangedEvent}"
            portingEventNewCommentEvent != null ->
                "EventListResponse{portingEventNewCommentEvent=$portingEventNewCommentEvent}"
            portingEventSplitEvent != null ->
                "EventListResponse{portingEventSplitEvent=$portingEventSplitEvent}"
            portingEventWithoutWebhook != null ->
                "EventListResponse{portingEventWithoutWebhook=$portingEventWithoutWebhook}"
            _json != null -> "EventListResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EventListResponse")
        }

    companion object {

        @JvmStatic
        fun ofPortingEventDeletedPayload(portingEventDeletedPayload: PortingEventDeletedPayload) =
            EventListResponse(portingEventDeletedPayload = portingEventDeletedPayload)

        @JvmStatic
        fun ofPortingEventMessagingChangedPayload(
            portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload
        ) =
            EventListResponse(
                portingEventMessagingChangedPayload = portingEventMessagingChangedPayload
            )

        @JvmStatic
        fun ofPortingEventStatusChangedEvent(
            portingEventStatusChangedEvent: PortingEventStatusChangedEvent
        ) = EventListResponse(portingEventStatusChangedEvent = portingEventStatusChangedEvent)

        @JvmStatic
        fun ofPortingEventNewCommentEvent(
            portingEventNewCommentEvent: PortingEventNewCommentEvent
        ) = EventListResponse(portingEventNewCommentEvent = portingEventNewCommentEvent)

        @JvmStatic
        fun ofPortingEventSplitEvent(portingEventSplitEvent: PortingEventSplitEvent) =
            EventListResponse(portingEventSplitEvent = portingEventSplitEvent)

        @JvmStatic
        fun ofPortingEventWithoutWebhook(portingEventWithoutWebhook: PortingEventWithoutWebhook) =
            EventListResponse(portingEventWithoutWebhook = portingEventWithoutWebhook)
    }

    /**
     * An interface that defines how to map each variant of [EventListResponse] to a value of type
     * [T].
     */
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
                        tryDeserialize(node, jacksonTypeRef<PortingEventDeletedPayload>())?.let {
                            EventListResponse(portingEventDeletedPayload = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PortingEventMessagingChangedPayload>())
                            ?.let {
                                EventListResponse(
                                    portingEventMessagingChangedPayload = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<PortingEventStatusChangedEvent>())
                            ?.let {
                                EventListResponse(portingEventStatusChangedEvent = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<PortingEventNewCommentEvent>())?.let {
                            EventListResponse(portingEventNewCommentEvent = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PortingEventSplitEvent>())?.let {
                            EventListResponse(portingEventSplitEvent = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PortingEventWithoutWebhook>())?.let {
                            EventListResponse(portingEventWithoutWebhook = it, _json = json)
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
                else -> throw IllegalStateException("Invalid EventListResponse")
            }
        }
    }
}
