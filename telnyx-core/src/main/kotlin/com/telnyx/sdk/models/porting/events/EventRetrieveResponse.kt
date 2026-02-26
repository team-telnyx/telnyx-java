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
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
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
        fun data(portingEventDeletedPayload: PortingEventDeletedPayload) =
            data(Data.ofPortingEventDeletedPayload(portingEventDeletedPayload))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventMessagingChangedPayload(portingEventMessagingChangedPayload)`.
         */
        fun data(portingEventMessagingChangedPayload: PortingEventMessagingChangedPayload) =
            data(Data.ofPortingEventMessagingChangedPayload(portingEventMessagingChangedPayload))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventStatusChangedEvent(portingEventStatusChangedEvent)`.
         */
        fun data(portingEventStatusChangedEvent: PortingEventStatusChangedEvent) =
            data(Data.ofPortingEventStatusChangedEvent(portingEventStatusChangedEvent))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventNewCommentEvent(portingEventNewCommentEvent)`.
         */
        fun data(portingEventNewCommentEvent: PortingEventNewCommentEvent) =
            data(Data.ofPortingEventNewCommentEvent(portingEventNewCommentEvent))

        /**
         * Alias for calling [data] with `Data.ofPortingEventSplitEvent(portingEventSplitEvent)`.
         */
        fun data(portingEventSplitEvent: PortingEventSplitEvent) =
            data(Data.ofPortingEventSplitEvent(portingEventSplitEvent))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingEventWithoutWebhook(portingEventWithoutWebhook)`.
         */
        fun data(portingEventWithoutWebhook: PortingEventWithoutWebhook) =
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
