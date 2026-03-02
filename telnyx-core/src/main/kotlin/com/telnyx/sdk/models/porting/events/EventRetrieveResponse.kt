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

        /** Alias for calling [data] with `Data.ofPortingOrderDeleted(portingOrderDeleted)`. */
        fun data(portingOrderDeleted: PortingEventDeletedPayload) =
            data(Data.ofPortingOrderDeleted(portingOrderDeleted))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingOrderMessagingChanged(portingOrderMessagingChanged)`.
         */
        fun data(portingOrderMessagingChanged: PortingEventMessagingChangedPayload) =
            data(Data.ofPortingOrderMessagingChanged(portingOrderMessagingChanged))

        /**
         * Alias for calling [data] with
         * `Data.ofPortingOrderStatusChanged(portingOrderStatusChanged)`.
         */
        fun data(portingOrderStatusChanged: PortingEventStatusChangedEvent) =
            data(Data.ofPortingOrderStatusChanged(portingOrderStatusChanged))

        /**
         * Alias for calling [data] with `Data.ofPortingOrderNewComment(portingOrderNewComment)`.
         */
        fun data(portingOrderNewComment: PortingEventNewCommentEvent) =
            data(Data.ofPortingOrderNewComment(portingOrderNewComment))

        /** Alias for calling [data] with `Data.ofPortingOrderSplit(portingOrderSplit)`. */
        fun data(portingOrderSplit: PortingEventSplitEvent) =
            data(Data.ofPortingOrderSplit(portingOrderSplit))

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

        fun validate(): Data = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Data &&
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
                portingOrderDeleted != null -> "Data{portingOrderDeleted=$portingOrderDeleted}"
                portingOrderMessagingChanged != null ->
                    "Data{portingOrderMessagingChanged=$portingOrderMessagingChanged}"
                portingOrderStatusChanged != null ->
                    "Data{portingOrderStatusChanged=$portingOrderStatusChanged}"
                portingOrderNewComment != null ->
                    "Data{portingOrderNewComment=$portingOrderNewComment}"
                portingOrderSplit != null -> "Data{portingOrderSplit=$portingOrderSplit}"
                portingEventWithoutWebhook != null ->
                    "Data{portingEventWithoutWebhook=$portingEventWithoutWebhook}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            @JvmStatic
            fun ofPortingOrderDeleted(portingOrderDeleted: PortingEventDeletedPayload) =
                Data(portingOrderDeleted = portingOrderDeleted)

            @JvmStatic
            fun ofPortingOrderMessagingChanged(
                portingOrderMessagingChanged: PortingEventMessagingChangedPayload
            ) = Data(portingOrderMessagingChanged = portingOrderMessagingChanged)

            @JvmStatic
            fun ofPortingOrderStatusChanged(
                portingOrderStatusChanged: PortingEventStatusChangedEvent
            ) = Data(portingOrderStatusChanged = portingOrderStatusChanged)

            @JvmStatic
            fun ofPortingOrderNewComment(portingOrderNewComment: PortingEventNewCommentEvent) =
                Data(portingOrderNewComment = portingOrderNewComment)

            @JvmStatic
            fun ofPortingOrderSplit(portingOrderSplit: PortingEventSplitEvent) =
                Data(portingOrderSplit = portingOrderSplit)

            @JvmStatic
            fun ofPortingEventWithoutWebhook(
                portingEventWithoutWebhook: PortingEventWithoutWebhook
            ) = Data(portingEventWithoutWebhook = portingEventWithoutWebhook)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
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

                when (eventType) {
                    "porting_order.deleted" -> {
                        return tryDeserialize(node, jacksonTypeRef<PortingEventDeletedPayload>())
                            ?.let { Data(portingOrderDeleted = it, _json = json) }
                            ?: Data(_json = json)
                    }
                    "porting_order.messaging_changed" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PortingEventMessagingChangedPayload>(),
                            )
                            ?.let { Data(portingOrderMessagingChanged = it, _json = json) }
                            ?: Data(_json = json)
                    }
                    "porting_order.status_changed" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PortingEventStatusChangedEvent>(),
                            )
                            ?.let { Data(portingOrderStatusChanged = it, _json = json) }
                            ?: Data(_json = json)
                    }
                    "porting_order.new_comment" -> {
                        return tryDeserialize(node, jacksonTypeRef<PortingEventNewCommentEvent>())
                            ?.let { Data(portingOrderNewComment = it, _json = json) }
                            ?: Data(_json = json)
                    }
                    "porting_order.split" -> {
                        return tryDeserialize(node, jacksonTypeRef<PortingEventSplitEvent>())?.let {
                            Data(portingOrderSplit = it, _json = json)
                        } ?: Data(_json = json)
                    }
                }

                return tryDeserialize(node, jacksonTypeRef<PortingEventWithoutWebhook>())?.let {
                    Data(portingEventWithoutWebhook = it, _json = json)
                } ?: Data(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
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
                    value.portingOrderSplit != null ->
                        generator.writeObject(value.portingOrderSplit)
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
