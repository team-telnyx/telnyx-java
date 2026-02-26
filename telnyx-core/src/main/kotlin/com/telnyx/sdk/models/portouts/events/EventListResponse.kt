// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

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
}
