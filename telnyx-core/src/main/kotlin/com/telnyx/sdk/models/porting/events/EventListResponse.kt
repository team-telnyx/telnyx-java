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
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = EventListResponse.Deserializer::class)
@JsonSerialize(using = EventListResponse.Serializer::class)
class EventListResponse
private constructor(
    private val portingOrderDeleted: PortingEventDeletedPayload? = null,
    private val portingOrderMessagingChanged: PortingEventMessagingChangedPayload? = null,
    private val portingOrderStatusChanged: PortingEventStatusChangedEvent? = null,
    private val portingOrderNewComment: PortingEventNewCommentEvent? = null,
    private val portingOrderSplit: PortingEventSplitEvent? = null,
    private val portingEventWithoutWebhook: PortingEventWithoutWebhook? = null,
    private val _json: JsonValue? = null,
) {

    fun portingOrderDeleted(): Optional<PortingEventDeletedPayload> =
        Optional.ofNullable(portingOrderDeleted)

    fun portingOrderMessagingChanged(): Optional<PortingEventMessagingChangedPayload> =
        Optional.ofNullable(portingOrderMessagingChanged)

    fun portingOrderStatusChanged(): Optional<PortingEventStatusChangedEvent> =
        Optional.ofNullable(portingOrderStatusChanged)

    fun portingOrderNewComment(): Optional<PortingEventNewCommentEvent> =
        Optional.ofNullable(portingOrderNewComment)

    fun portingOrderSplit(): Optional<PortingEventSplitEvent> =
        Optional.ofNullable(portingOrderSplit)

    fun portingEventWithoutWebhook(): Optional<PortingEventWithoutWebhook> =
        Optional.ofNullable(portingEventWithoutWebhook)

    fun isPortingOrderDeleted(): Boolean = portingOrderDeleted != null

    fun isPortingOrderMessagingChanged(): Boolean = portingOrderMessagingChanged != null

    fun isPortingOrderStatusChanged(): Boolean = portingOrderStatusChanged != null

    fun isPortingOrderNewComment(): Boolean = portingOrderNewComment != null

    fun isPortingOrderSplit(): Boolean = portingOrderSplit != null

    fun isPortingEventWithoutWebhook(): Boolean = portingEventWithoutWebhook != null

    fun asPortingOrderDeleted(): PortingEventDeletedPayload =
        portingOrderDeleted.getOrThrow("portingOrderDeleted")

    fun asPortingOrderMessagingChanged(): PortingEventMessagingChangedPayload =
        portingOrderMessagingChanged.getOrThrow("portingOrderMessagingChanged")

    fun asPortingOrderStatusChanged(): PortingEventStatusChangedEvent =
        portingOrderStatusChanged.getOrThrow("portingOrderStatusChanged")

    fun asPortingOrderNewComment(): PortingEventNewCommentEvent =
        portingOrderNewComment.getOrThrow("portingOrderNewComment")

    fun asPortingOrderSplit(): PortingEventSplitEvent =
        portingOrderSplit.getOrThrow("portingOrderSplit")

    fun asPortingEventWithoutWebhook(): PortingEventWithoutWebhook =
        portingEventWithoutWebhook.getOrThrow("portingEventWithoutWebhook")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            portingOrderDeleted != null -> visitor.visitPortingOrderDeleted(portingOrderDeleted)
            portingOrderMessagingChanged != null ->
                visitor.visitPortingOrderMessagingChanged(portingOrderMessagingChanged)
            portingOrderStatusChanged != null ->
                visitor.visitPortingOrderStatusChanged(portingOrderStatusChanged)
            portingOrderNewComment != null ->
                visitor.visitPortingOrderNewComment(portingOrderNewComment)
            portingOrderSplit != null -> visitor.visitPortingOrderSplit(portingOrderSplit)
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
                override fun visitPortingOrderDeleted(
                    portingOrderDeleted: PortingEventDeletedPayload
                ) {
                    portingOrderDeleted.validate()
                }

                override fun visitPortingOrderMessagingChanged(
                    portingOrderMessagingChanged: PortingEventMessagingChangedPayload
                ) {
                    portingOrderMessagingChanged.validate()
                }

                override fun visitPortingOrderStatusChanged(
                    portingOrderStatusChanged: PortingEventStatusChangedEvent
                ) {
                    portingOrderStatusChanged.validate()
                }

                override fun visitPortingOrderNewComment(
                    portingOrderNewComment: PortingEventNewCommentEvent
                ) {
                    portingOrderNewComment.validate()
                }

                override fun visitPortingOrderSplit(portingOrderSplit: PortingEventSplitEvent) {
                    portingOrderSplit.validate()
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
                override fun visitPortingOrderDeleted(
                    portingOrderDeleted: PortingEventDeletedPayload
                ) = portingOrderDeleted.validity()

                override fun visitPortingOrderMessagingChanged(
                    portingOrderMessagingChanged: PortingEventMessagingChangedPayload
                ) = portingOrderMessagingChanged.validity()

                override fun visitPortingOrderStatusChanged(
                    portingOrderStatusChanged: PortingEventStatusChangedEvent
                ) = portingOrderStatusChanged.validity()

                override fun visitPortingOrderNewComment(
                    portingOrderNewComment: PortingEventNewCommentEvent
                ) = portingOrderNewComment.validity()

                override fun visitPortingOrderSplit(portingOrderSplit: PortingEventSplitEvent) =
                    portingOrderSplit.validity()

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
            portingOrderDeleted == other.portingOrderDeleted &&
            portingOrderMessagingChanged == other.portingOrderMessagingChanged &&
            portingOrderStatusChanged == other.portingOrderStatusChanged &&
            portingOrderNewComment == other.portingOrderNewComment &&
            portingOrderSplit == other.portingOrderSplit &&
            portingEventWithoutWebhook == other.portingEventWithoutWebhook
    }

    override fun hashCode(): Int =
        Objects.hash(
            portingOrderDeleted,
            portingOrderMessagingChanged,
            portingOrderStatusChanged,
            portingOrderNewComment,
            portingOrderSplit,
            portingEventWithoutWebhook,
        )

    override fun toString(): String =
        when {
            portingOrderDeleted != null ->
                "EventListResponse{portingOrderDeleted=$portingOrderDeleted}"
            portingOrderMessagingChanged != null ->
                "EventListResponse{portingOrderMessagingChanged=$portingOrderMessagingChanged}"
            portingOrderStatusChanged != null ->
                "EventListResponse{portingOrderStatusChanged=$portingOrderStatusChanged}"
            portingOrderNewComment != null ->
                "EventListResponse{portingOrderNewComment=$portingOrderNewComment}"
            portingOrderSplit != null -> "EventListResponse{portingOrderSplit=$portingOrderSplit}"
            portingEventWithoutWebhook != null ->
                "EventListResponse{portingEventWithoutWebhook=$portingEventWithoutWebhook}"
            _json != null -> "EventListResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EventListResponse")
        }

    companion object {

        @JvmStatic
        fun ofPortingOrderDeleted(portingOrderDeleted: PortingEventDeletedPayload) =
            EventListResponse(portingOrderDeleted = portingOrderDeleted)

        @JvmStatic
        fun ofPortingOrderMessagingChanged(
            portingOrderMessagingChanged: PortingEventMessagingChangedPayload
        ) = EventListResponse(portingOrderMessagingChanged = portingOrderMessagingChanged)

        @JvmStatic
        fun ofPortingOrderStatusChanged(portingOrderStatusChanged: PortingEventStatusChangedEvent) =
            EventListResponse(portingOrderStatusChanged = portingOrderStatusChanged)

        @JvmStatic
        fun ofPortingOrderNewComment(portingOrderNewComment: PortingEventNewCommentEvent) =
            EventListResponse(portingOrderNewComment = portingOrderNewComment)

        @JvmStatic
        fun ofPortingOrderSplit(portingOrderSplit: PortingEventSplitEvent) =
            EventListResponse(portingOrderSplit = portingOrderSplit)

        @JvmStatic
        fun ofPortingEventWithoutWebhook(portingEventWithoutWebhook: PortingEventWithoutWebhook) =
            EventListResponse(portingEventWithoutWebhook = portingEventWithoutWebhook)
    }

    /**
     * An interface that defines how to map each variant of [EventListResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitPortingOrderDeleted(portingOrderDeleted: PortingEventDeletedPayload): T

        fun visitPortingOrderMessagingChanged(
            portingOrderMessagingChanged: PortingEventMessagingChangedPayload
        ): T

        fun visitPortingOrderStatusChanged(
            portingOrderStatusChanged: PortingEventStatusChangedEvent
        ): T

        fun visitPortingOrderNewComment(portingOrderNewComment: PortingEventNewCommentEvent): T

        fun visitPortingOrderSplit(portingOrderSplit: PortingEventSplitEvent): T

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

            when (eventType) {
                "porting_order.deleted" -> {
                    return tryDeserialize(node, jacksonTypeRef<PortingEventDeletedPayload>())?.let {
                        EventListResponse(portingOrderDeleted = it, _json = json)
                    } ?: EventListResponse(_json = json)
                }
                "porting_order.messaging_changed" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<PortingEventMessagingChangedPayload>(),
                        )
                        ?.let { EventListResponse(portingOrderMessagingChanged = it, _json = json) }
                        ?: EventListResponse(_json = json)
                }
                "porting_order.status_changed" -> {
                    return tryDeserialize(node, jacksonTypeRef<PortingEventStatusChangedEvent>())
                        ?.let { EventListResponse(portingOrderStatusChanged = it, _json = json) }
                        ?: EventListResponse(_json = json)
                }
                "porting_order.new_comment" -> {
                    return tryDeserialize(node, jacksonTypeRef<PortingEventNewCommentEvent>())
                        ?.let { EventListResponse(portingOrderNewComment = it, _json = json) }
                        ?: EventListResponse(_json = json)
                }
                "porting_order.split" -> {
                    return tryDeserialize(node, jacksonTypeRef<PortingEventSplitEvent>())?.let {
                        EventListResponse(portingOrderSplit = it, _json = json)
                    } ?: EventListResponse(_json = json)
                }
            }

            return tryDeserialize(node, jacksonTypeRef<PortingEventWithoutWebhook>())?.let {
                EventListResponse(portingEventWithoutWebhook = it, _json = json)
            } ?: EventListResponse(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<EventListResponse>(EventListResponse::class) {

        override fun serialize(
            value: EventListResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.portingOrderDeleted != null ->
                    generator.writeObject(value.portingOrderDeleted)
                value.portingOrderMessagingChanged != null ->
                    generator.writeObject(value.portingOrderMessagingChanged)
                value.portingOrderStatusChanged != null ->
                    generator.writeObject(value.portingOrderStatusChanged)
                value.portingOrderNewComment != null ->
                    generator.writeObject(value.portingOrderNewComment)
                value.portingOrderSplit != null -> generator.writeObject(value.portingOrderSplit)
                value.portingEventWithoutWebhook != null ->
                    generator.writeObject(value.portingEventWithoutWebhook)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EventListResponse")
            }
        }
    }
}
