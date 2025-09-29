// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.BaseDeserializer
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.allMaxBy
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional

/** Union type for different scheduled event response types */
@JsonDeserialize(using = ScheduledEventResponse.Deserializer::class)
@JsonSerialize(using = ScheduledEventResponse.Serializer::class)
class ScheduledEventResponse
private constructor(
    private val phoneCall: ScheduledPhoneCallEventResponse? = null,
    private val sms: ScheduledSmsEventResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun phoneCall(): Optional<ScheduledPhoneCallEventResponse> = Optional.ofNullable(phoneCall)

    fun sms(): Optional<ScheduledSmsEventResponse> = Optional.ofNullable(sms)

    fun isPhoneCall(): Boolean = phoneCall != null

    fun isSms(): Boolean = sms != null

    fun asPhoneCall(): ScheduledPhoneCallEventResponse = phoneCall.getOrThrow("phoneCall")

    fun asSms(): ScheduledSmsEventResponse = sms.getOrThrow("sms")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            phoneCall != null -> visitor.visitPhoneCall(phoneCall)
            sms != null -> visitor.visitSms(sms)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ScheduledEventResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPhoneCall(phoneCall: ScheduledPhoneCallEventResponse) {
                    phoneCall.validate()
                }

                override fun visitSms(sms: ScheduledSmsEventResponse) {
                    sms.validate()
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
                override fun visitPhoneCall(phoneCall: ScheduledPhoneCallEventResponse) =
                    phoneCall.validity()

                override fun visitSms(sms: ScheduledSmsEventResponse) = sms.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduledEventResponse && phoneCall == other.phoneCall && sms == other.sms
    }

    override fun hashCode(): Int = Objects.hash(phoneCall, sms)

    override fun toString(): String =
        when {
            phoneCall != null -> "ScheduledEventResponse{phoneCall=$phoneCall}"
            sms != null -> "ScheduledEventResponse{sms=$sms}"
            _json != null -> "ScheduledEventResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ScheduledEventResponse")
        }

    companion object {

        @JvmStatic
        fun ofPhoneCall(phoneCall: ScheduledPhoneCallEventResponse) =
            ScheduledEventResponse(phoneCall = phoneCall)

        @JvmStatic fun ofSms(sms: ScheduledSmsEventResponse) = ScheduledEventResponse(sms = sms)
    }

    /**
     * An interface that defines how to map each variant of [ScheduledEventResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitPhoneCall(phoneCall: ScheduledPhoneCallEventResponse): T

        fun visitSms(sms: ScheduledSmsEventResponse): T

        /**
         * Maps an unknown variant of [ScheduledEventResponse] to a value of type [T].
         *
         * An instance of [ScheduledEventResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown ScheduledEventResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ScheduledEventResponse>(ScheduledEventResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ScheduledEventResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ScheduledPhoneCallEventResponse>())
                            ?.let { ScheduledEventResponse(phoneCall = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<ScheduledSmsEventResponse>())?.let {
                            ScheduledEventResponse(sms = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ScheduledEventResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<ScheduledEventResponse>(ScheduledEventResponse::class) {

        override fun serialize(
            value: ScheduledEventResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.phoneCall != null -> generator.writeObject(value.phoneCall)
                value.sms != null -> generator.writeObject(value.sms)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ScheduledEventResponse")
            }
        }
    }
}
