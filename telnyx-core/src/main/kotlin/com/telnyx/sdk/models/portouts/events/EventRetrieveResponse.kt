// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

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
         * `Data.ofWebhookPortoutStatusChanged(webhookPortoutStatusChanged)`.
         */
        fun data(webhookPortoutStatusChanged: WebhookPortoutStatusChanged) =
            data(Data.ofWebhookPortoutStatusChanged(webhookPortoutStatusChanged))

        /**
         * Alias for calling [data] with
         * `Data.ofWebhookPortoutNewComment(webhookPortoutNewComment)`.
         */
        fun data(webhookPortoutNewComment: WebhookPortoutNewComment) =
            data(Data.ofWebhookPortoutNewComment(webhookPortoutNewComment))

        /**
         * Alias for calling [data] with
         * `Data.ofWebhookPortoutFocDateChanged(webhookPortoutFocDateChanged)`.
         */
        fun data(webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged) =
            data(Data.ofWebhookPortoutFocDateChanged(webhookPortoutFocDateChanged))

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

        fun validate(): Data = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Data &&
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
                    "Data{webhookPortoutStatusChanged=$webhookPortoutStatusChanged}"
                webhookPortoutNewComment != null ->
                    "Data{webhookPortoutNewComment=$webhookPortoutNewComment}"
                webhookPortoutFocDateChanged != null ->
                    "Data{webhookPortoutFocDateChanged=$webhookPortoutFocDateChanged}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            @JvmStatic
            fun ofWebhookPortoutStatusChanged(
                webhookPortoutStatusChanged: WebhookPortoutStatusChanged
            ) = Data(webhookPortoutStatusChanged = webhookPortoutStatusChanged)

            @JvmStatic
            fun ofWebhookPortoutNewComment(webhookPortoutNewComment: WebhookPortoutNewComment) =
                Data(webhookPortoutNewComment = webhookPortoutNewComment)

            @JvmStatic
            fun ofWebhookPortoutFocDateChanged(
                webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged
            ) = Data(webhookPortoutFocDateChanged = webhookPortoutFocDateChanged)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitWebhookPortoutStatusChanged(
                webhookPortoutStatusChanged: WebhookPortoutStatusChanged
            ): T

            fun visitWebhookPortoutNewComment(webhookPortoutNewComment: WebhookPortoutNewComment): T

            fun visitWebhookPortoutFocDateChanged(
                webhookPortoutFocDateChanged: WebhookPortoutFocDateChanged
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
                            tryDeserialize(node, jacksonTypeRef<WebhookPortoutStatusChanged>())
                                ?.let { Data(webhookPortoutStatusChanged = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<WebhookPortoutNewComment>())?.let {
                                Data(webhookPortoutNewComment = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<WebhookPortoutFocDateChanged>())
                                ?.let { Data(webhookPortoutFocDateChanged = it, _json = json) },
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
                    value.webhookPortoutStatusChanged != null ->
                        generator.writeObject(value.webhookPortoutStatusChanged)
                    value.webhookPortoutNewComment != null ->
                        generator.writeObject(value.webhookPortoutNewComment)
                    value.webhookPortoutFocDateChanged != null ->
                        generator.writeObject(value.webhookPortoutFocDateChanged)
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
