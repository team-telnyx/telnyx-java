// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

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

@JsonDeserialize(using = ScheduledEventListResponse.Deserializer::class)
@JsonSerialize(using = ScheduledEventListResponse.Serializer::class)
class ScheduledEventListResponse
private constructor(
    private val phoneCallEvent: ScheduledPhoneCallEventResponse? = null,
    private val smsEvent: ScheduledSmsEventResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun phoneCallEvent(): Optional<ScheduledPhoneCallEventResponse> =
        Optional.ofNullable(phoneCallEvent)

    fun smsEvent(): Optional<ScheduledSmsEventResponse> = Optional.ofNullable(smsEvent)

    fun isPhoneCallEvent(): Boolean = phoneCallEvent != null

    fun isSmsEvent(): Boolean = smsEvent != null

    fun asPhoneCallEvent(): ScheduledPhoneCallEventResponse =
        phoneCallEvent.getOrThrow("phoneCallEvent")

    fun asSmsEvent(): ScheduledSmsEventResponse = smsEvent.getOrThrow("smsEvent")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            phoneCallEvent != null -> visitor.visitPhoneCallEvent(phoneCallEvent)
            smsEvent != null -> visitor.visitSmsEvent(smsEvent)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ScheduledEventListResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPhoneCallEvent(phoneCallEvent: ScheduledPhoneCallEventResponse) {
                    phoneCallEvent.validate()
                }

                override fun visitSmsEvent(smsEvent: ScheduledSmsEventResponse) {
                    smsEvent.validate()
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
                override fun visitPhoneCallEvent(phoneCallEvent: ScheduledPhoneCallEventResponse) =
                    phoneCallEvent.validity()

                override fun visitSmsEvent(smsEvent: ScheduledSmsEventResponse) =
                    smsEvent.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduledEventListResponse &&
            phoneCallEvent == other.phoneCallEvent &&
            smsEvent == other.smsEvent
    }

    override fun hashCode(): Int = Objects.hash(phoneCallEvent, smsEvent)

    override fun toString(): String =
        when {
            phoneCallEvent != null -> "ScheduledEventListResponse{phoneCallEvent=$phoneCallEvent}"
            smsEvent != null -> "ScheduledEventListResponse{smsEvent=$smsEvent}"
            _json != null -> "ScheduledEventListResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ScheduledEventListResponse")
        }

    companion object {

        @JvmStatic
        fun ofPhoneCallEvent(phoneCallEvent: ScheduledPhoneCallEventResponse) =
            ScheduledEventListResponse(phoneCallEvent = phoneCallEvent)

        @JvmStatic
        fun ofSmsEvent(smsEvent: ScheduledSmsEventResponse) =
            ScheduledEventListResponse(smsEvent = smsEvent)
    }

    /**
     * An interface that defines how to map each variant of [ScheduledEventListResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitPhoneCallEvent(phoneCallEvent: ScheduledPhoneCallEventResponse): T

        fun visitSmsEvent(smsEvent: ScheduledSmsEventResponse): T

        /**
         * Maps an unknown variant of [ScheduledEventListResponse] to a value of type [T].
         *
         * An instance of [ScheduledEventListResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown ScheduledEventListResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ScheduledEventListResponse>(ScheduledEventListResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ScheduledEventListResponse {
            val json = JsonValue.fromJsonNode(node)
            val telnyxConversationChannel =
                json
                    .asObject()
                    .getOrNull()
                    ?.get("telnyx_conversation_channel")
                    ?.asString()
                    ?.getOrNull()

            when (telnyxConversationChannel) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ScheduledPhoneCallEventResponse>())
                            ?.let { ScheduledEventListResponse(phoneCallEvent = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<ScheduledSmsEventResponse>())?.let {
                            ScheduledEventListResponse(smsEvent = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ScheduledEventListResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<ScheduledEventListResponse>(ScheduledEventListResponse::class) {

        override fun serialize(
            value: ScheduledEventListResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.phoneCallEvent != null -> generator.writeObject(value.phoneCallEvent)
                value.smsEvent != null -> generator.writeObject(value.smsEvent)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ScheduledEventListResponse")
            }
        }
    }
}
