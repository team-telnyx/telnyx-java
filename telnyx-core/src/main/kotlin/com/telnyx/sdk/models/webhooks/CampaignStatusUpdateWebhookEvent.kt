// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

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

@JsonDeserialize(using = CampaignStatusUpdateWebhookEvent.Deserializer::class)
@JsonSerialize(using = CampaignStatusUpdateWebhookEvent.Serializer::class)
class CampaignStatusUpdateWebhookEvent
private constructor(
    private val campaignStatusUpdateEvent: CampaignStatusUpdateEvent? = null,
    private val suspended: CampaignSuspendedEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun campaignStatusUpdateEvent(): Optional<CampaignStatusUpdateEvent> =
        Optional.ofNullable(campaignStatusUpdateEvent)

    fun suspended(): Optional<CampaignSuspendedEvent> = Optional.ofNullable(suspended)

    fun isCampaignStatusUpdateEvent(): Boolean = campaignStatusUpdateEvent != null

    fun isSuspended(): Boolean = suspended != null

    fun asCampaignStatusUpdateEvent(): CampaignStatusUpdateEvent =
        campaignStatusUpdateEvent.getOrThrow("campaignStatusUpdateEvent")

    fun asSuspended(): CampaignSuspendedEvent = suspended.getOrThrow("suspended")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            campaignStatusUpdateEvent != null ->
                visitor.visitCampaignStatusUpdateEvent(campaignStatusUpdateEvent)
            suspended != null -> visitor.visitSuspended(suspended)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): CampaignStatusUpdateWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitCampaignStatusUpdateEvent(
                    campaignStatusUpdateEvent: CampaignStatusUpdateEvent
                ) {
                    campaignStatusUpdateEvent.validate()
                }

                override fun visitSuspended(suspended: CampaignSuspendedEvent) {
                    suspended.validate()
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
                override fun visitCampaignStatusUpdateEvent(
                    campaignStatusUpdateEvent: CampaignStatusUpdateEvent
                ) = campaignStatusUpdateEvent.validity()

                override fun visitSuspended(suspended: CampaignSuspendedEvent) =
                    suspended.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignStatusUpdateWebhookEvent &&
            campaignStatusUpdateEvent == other.campaignStatusUpdateEvent &&
            suspended == other.suspended
    }

    override fun hashCode(): Int = Objects.hash(campaignStatusUpdateEvent, suspended)

    override fun toString(): String =
        when {
            campaignStatusUpdateEvent != null ->
                "CampaignStatusUpdateWebhookEvent{campaignStatusUpdateEvent=$campaignStatusUpdateEvent}"
            suspended != null -> "CampaignStatusUpdateWebhookEvent{suspended=$suspended}"
            _json != null -> "CampaignStatusUpdateWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CampaignStatusUpdateWebhookEvent")
        }

    companion object {

        @JvmStatic
        fun ofCampaignStatusUpdateEvent(campaignStatusUpdateEvent: CampaignStatusUpdateEvent) =
            CampaignStatusUpdateWebhookEvent(campaignStatusUpdateEvent = campaignStatusUpdateEvent)

        @JvmStatic
        fun ofSuspended(suspended: CampaignSuspendedEvent) =
            CampaignStatusUpdateWebhookEvent(suspended = suspended)
    }

    /**
     * An interface that defines how to map each variant of [CampaignStatusUpdateWebhookEvent] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitCampaignStatusUpdateEvent(campaignStatusUpdateEvent: CampaignStatusUpdateEvent): T

        fun visitSuspended(suspended: CampaignSuspendedEvent): T

        /**
         * Maps an unknown variant of [CampaignStatusUpdateWebhookEvent] to a value of type [T].
         *
         * An instance of [CampaignStatusUpdateWebhookEvent] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown CampaignStatusUpdateWebhookEvent: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CampaignStatusUpdateWebhookEvent>(
            CampaignStatusUpdateWebhookEvent::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): CampaignStatusUpdateWebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<CampaignStatusUpdateEvent>())?.let {
                            CampaignStatusUpdateWebhookEvent(
                                campaignStatusUpdateEvent = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<CampaignSuspendedEvent>())?.let {
                            CampaignStatusUpdateWebhookEvent(suspended = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CampaignStatusUpdateWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CampaignStatusUpdateWebhookEvent>(CampaignStatusUpdateWebhookEvent::class) {

        override fun serialize(
            value: CampaignStatusUpdateWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.campaignStatusUpdateEvent != null ->
                    generator.writeObject(value.campaignStatusUpdateEvent)
                value.suspended != null -> generator.writeObject(value.suspended)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CampaignStatusUpdateWebhookEvent")
            }
        }
    }
}
