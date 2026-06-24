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

@JsonDeserialize(using = PortingEvent.Deserializer::class)
@JsonSerialize(using = PortingEvent.Serializer::class)
class PortingEvent
private constructor(
    private val orderDeleted: PortingEventDeletedPayload? = null,
    private val orderMessagingChanged: PortingEventMessagingChangedPayload? = null,
    private val orderStatusChanged: PortingEventStatusChangedEvent? = null,
    private val orderNewComment: PortingEventNewCommentEvent? = null,
    private val orderSplit: PortingEventSplitEvent? = null,
    private val withoutWebhook: PortingEventWithoutWebhook? = null,
    private val _json: JsonValue? = null,
) {

    fun orderDeleted(): Optional<PortingEventDeletedPayload> = Optional.ofNullable(orderDeleted)

    fun orderMessagingChanged(): Optional<PortingEventMessagingChangedPayload> =
        Optional.ofNullable(orderMessagingChanged)

    fun orderStatusChanged(): Optional<PortingEventStatusChangedEvent> =
        Optional.ofNullable(orderStatusChanged)

    fun orderNewComment(): Optional<PortingEventNewCommentEvent> =
        Optional.ofNullable(orderNewComment)

    fun orderSplit(): Optional<PortingEventSplitEvent> = Optional.ofNullable(orderSplit)

    fun withoutWebhook(): Optional<PortingEventWithoutWebhook> = Optional.ofNullable(withoutWebhook)

    fun isOrderDeleted(): Boolean = orderDeleted != null

    fun isOrderMessagingChanged(): Boolean = orderMessagingChanged != null

    fun isOrderStatusChanged(): Boolean = orderStatusChanged != null

    fun isOrderNewComment(): Boolean = orderNewComment != null

    fun isOrderSplit(): Boolean = orderSplit != null

    fun isWithoutWebhook(): Boolean = withoutWebhook != null

    fun asOrderDeleted(): PortingEventDeletedPayload = orderDeleted.getOrThrow("orderDeleted")

    fun asOrderMessagingChanged(): PortingEventMessagingChangedPayload =
        orderMessagingChanged.getOrThrow("orderMessagingChanged")

    fun asOrderStatusChanged(): PortingEventStatusChangedEvent =
        orderStatusChanged.getOrThrow("orderStatusChanged")

    fun asOrderNewComment(): PortingEventNewCommentEvent =
        orderNewComment.getOrThrow("orderNewComment")

    fun asOrderSplit(): PortingEventSplitEvent = orderSplit.getOrThrow("orderSplit")

    fun asWithoutWebhook(): PortingEventWithoutWebhook = withoutWebhook.getOrThrow("withoutWebhook")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.telnyx.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = portingEvent.accept(new PortingEvent.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitOrderDeleted(PortingEventDeletedPayload orderDeleted) {
     *         return Optional.of(orderDeleted.toString());
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
     * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            orderDeleted != null -> visitor.visitOrderDeleted(orderDeleted)
            orderMessagingChanged != null ->
                visitor.visitOrderMessagingChanged(orderMessagingChanged)
            orderStatusChanged != null -> visitor.visitOrderStatusChanged(orderStatusChanged)
            orderNewComment != null -> visitor.visitOrderNewComment(orderNewComment)
            orderSplit != null -> visitor.visitOrderSplit(orderSplit)
            withoutWebhook != null -> visitor.visitWithoutWebhook(withoutWebhook)
            else -> visitor.unknown(_json)
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
    fun validate(): PortingEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitOrderDeleted(orderDeleted: PortingEventDeletedPayload) {
                    orderDeleted.validate()
                }

                override fun visitOrderMessagingChanged(
                    orderMessagingChanged: PortingEventMessagingChangedPayload
                ) {
                    orderMessagingChanged.validate()
                }

                override fun visitOrderStatusChanged(
                    orderStatusChanged: PortingEventStatusChangedEvent
                ) {
                    orderStatusChanged.validate()
                }

                override fun visitOrderNewComment(orderNewComment: PortingEventNewCommentEvent) {
                    orderNewComment.validate()
                }

                override fun visitOrderSplit(orderSplit: PortingEventSplitEvent) {
                    orderSplit.validate()
                }

                override fun visitWithoutWebhook(withoutWebhook: PortingEventWithoutWebhook) {
                    withoutWebhook.validate()
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
                override fun visitOrderDeleted(orderDeleted: PortingEventDeletedPayload) =
                    orderDeleted.validity()

                override fun visitOrderMessagingChanged(
                    orderMessagingChanged: PortingEventMessagingChangedPayload
                ) = orderMessagingChanged.validity()

                override fun visitOrderStatusChanged(
                    orderStatusChanged: PortingEventStatusChangedEvent
                ) = orderStatusChanged.validity()

                override fun visitOrderNewComment(orderNewComment: PortingEventNewCommentEvent) =
                    orderNewComment.validity()

                override fun visitOrderSplit(orderSplit: PortingEventSplitEvent) =
                    orderSplit.validity()

                override fun visitWithoutWebhook(withoutWebhook: PortingEventWithoutWebhook) =
                    withoutWebhook.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingEvent &&
            orderDeleted == other.orderDeleted &&
            orderMessagingChanged == other.orderMessagingChanged &&
            orderStatusChanged == other.orderStatusChanged &&
            orderNewComment == other.orderNewComment &&
            orderSplit == other.orderSplit &&
            withoutWebhook == other.withoutWebhook
    }

    override fun hashCode(): Int =
        Objects.hash(
            orderDeleted,
            orderMessagingChanged,
            orderStatusChanged,
            orderNewComment,
            orderSplit,
            withoutWebhook,
        )

    override fun toString(): String =
        when {
            orderDeleted != null -> "PortingEvent{orderDeleted=$orderDeleted}"
            orderMessagingChanged != null ->
                "PortingEvent{orderMessagingChanged=$orderMessagingChanged}"
            orderStatusChanged != null -> "PortingEvent{orderStatusChanged=$orderStatusChanged}"
            orderNewComment != null -> "PortingEvent{orderNewComment=$orderNewComment}"
            orderSplit != null -> "PortingEvent{orderSplit=$orderSplit}"
            withoutWebhook != null -> "PortingEvent{withoutWebhook=$withoutWebhook}"
            _json != null -> "PortingEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PortingEvent")
        }

    companion object {

        @JvmStatic
        fun ofOrderDeleted(orderDeleted: PortingEventDeletedPayload) =
            PortingEvent(orderDeleted = orderDeleted)

        @JvmStatic
        fun ofOrderMessagingChanged(orderMessagingChanged: PortingEventMessagingChangedPayload) =
            PortingEvent(orderMessagingChanged = orderMessagingChanged)

        @JvmStatic
        fun ofOrderStatusChanged(orderStatusChanged: PortingEventStatusChangedEvent) =
            PortingEvent(orderStatusChanged = orderStatusChanged)

        @JvmStatic
        fun ofOrderNewComment(orderNewComment: PortingEventNewCommentEvent) =
            PortingEvent(orderNewComment = orderNewComment)

        @JvmStatic
        fun ofOrderSplit(orderSplit: PortingEventSplitEvent) = PortingEvent(orderSplit = orderSplit)

        @JvmStatic
        fun ofWithoutWebhook(withoutWebhook: PortingEventWithoutWebhook) =
            PortingEvent(withoutWebhook = withoutWebhook)
    }

    /**
     * An interface that defines how to map each variant of [PortingEvent] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitOrderDeleted(orderDeleted: PortingEventDeletedPayload): T

        fun visitOrderMessagingChanged(
            orderMessagingChanged: PortingEventMessagingChangedPayload
        ): T

        fun visitOrderStatusChanged(orderStatusChanged: PortingEventStatusChangedEvent): T

        fun visitOrderNewComment(orderNewComment: PortingEventNewCommentEvent): T

        fun visitOrderSplit(orderSplit: PortingEventSplitEvent): T

        fun visitWithoutWebhook(withoutWebhook: PortingEventWithoutWebhook): T

        /**
         * Maps an unknown variant of [PortingEvent] to a value of type [T].
         *
         * An instance of [PortingEvent] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown PortingEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<PortingEvent>(PortingEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PortingEvent {
            val json = JsonValue.fromJsonNode(node)
            val eventType = json.asObject().getOrNull()?.get("event_type")?.asString()?.getOrNull()

            when (eventType) {
                "porting_order.deleted" -> {
                    return tryDeserialize(node, jacksonTypeRef<PortingEventDeletedPayload>())?.let {
                        PortingEvent(orderDeleted = it, _json = json)
                    } ?: PortingEvent(_json = json)
                }
                "porting_order.messaging_changed" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<PortingEventMessagingChangedPayload>(),
                        )
                        ?.let { PortingEvent(orderMessagingChanged = it, _json = json) }
                        ?: PortingEvent(_json = json)
                }
                "porting_order.status_changed" -> {
                    return tryDeserialize(node, jacksonTypeRef<PortingEventStatusChangedEvent>())
                        ?.let { PortingEvent(orderStatusChanged = it, _json = json) }
                        ?: PortingEvent(_json = json)
                }
                "porting_order.new_comment" -> {
                    return tryDeserialize(node, jacksonTypeRef<PortingEventNewCommentEvent>())
                        ?.let { PortingEvent(orderNewComment = it, _json = json) }
                        ?: PortingEvent(_json = json)
                }
                "porting_order.split" -> {
                    return tryDeserialize(node, jacksonTypeRef<PortingEventSplitEvent>())?.let {
                        PortingEvent(orderSplit = it, _json = json)
                    } ?: PortingEvent(_json = json)
                }
            }

            return tryDeserialize(node, jacksonTypeRef<PortingEventWithoutWebhook>())?.let {
                PortingEvent(withoutWebhook = it, _json = json)
            } ?: PortingEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<PortingEvent>(PortingEvent::class) {

        override fun serialize(
            value: PortingEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.orderDeleted != null -> generator.writeObject(value.orderDeleted)
                value.orderMessagingChanged != null ->
                    generator.writeObject(value.orderMessagingChanged)
                value.orderStatusChanged != null -> generator.writeObject(value.orderStatusChanged)
                value.orderNewComment != null -> generator.writeObject(value.orderNewComment)
                value.orderSplit != null -> generator.writeObject(value.orderSplit)
                value.withoutWebhook != null -> generator.writeObject(value.withoutWebhook)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PortingEvent")
            }
        }
    }
}
