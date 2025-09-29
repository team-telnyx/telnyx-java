// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.scheduledevents

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
import com.telnyx.api.core.BaseDeserializer
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.allMaxBy
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.Meta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ScheduledEventListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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

        /**
         * Returns a mutable builder for constructing an instance of [ScheduledEventListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduledEventListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduledEventListResponse: ScheduledEventListResponse) = apply {
            data = scheduledEventListResponse.data.map { it.toMutableList() }
            meta = scheduledEventListResponse.meta
            additionalProperties = scheduledEventListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /**
         * Alias for calling [addData] with
         * `Data.ofScheduledPhoneCallEventResponse(scheduledPhoneCallEventResponse)`.
         */
        fun addData(scheduledPhoneCallEventResponse: ScheduledPhoneCallEventResponse) =
            addData(Data.ofScheduledPhoneCallEventResponse(scheduledPhoneCallEventResponse))

        /**
         * Alias for calling [addData] with
         * `Data.ofScheduledSmsEventResponse(scheduledSmsEventResponse)`.
         */
        fun addData(scheduledSmsEventResponse: ScheduledSmsEventResponse) =
            addData(Data.ofScheduledSmsEventResponse(scheduledSmsEventResponse))

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [ScheduledEventListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScheduledEventListResponse =
            ScheduledEventListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("meta", meta),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScheduledEventListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        meta().validate()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val scheduledPhoneCallEventResponse: ScheduledPhoneCallEventResponse? = null,
        private val scheduledSmsEventResponse: ScheduledSmsEventResponse? = null,
        private val _json: JsonValue? = null,
    ) {

        fun scheduledPhoneCallEventResponse(): Optional<ScheduledPhoneCallEventResponse> =
            Optional.ofNullable(scheduledPhoneCallEventResponse)

        fun scheduledSmsEventResponse(): Optional<ScheduledSmsEventResponse> =
            Optional.ofNullable(scheduledSmsEventResponse)

        fun isScheduledPhoneCallEventResponse(): Boolean = scheduledPhoneCallEventResponse != null

        fun isScheduledSmsEventResponse(): Boolean = scheduledSmsEventResponse != null

        fun asScheduledPhoneCallEventResponse(): ScheduledPhoneCallEventResponse =
            scheduledPhoneCallEventResponse.getOrThrow("scheduledPhoneCallEventResponse")

        fun asScheduledSmsEventResponse(): ScheduledSmsEventResponse =
            scheduledSmsEventResponse.getOrThrow("scheduledSmsEventResponse")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                scheduledPhoneCallEventResponse != null ->
                    visitor.visitScheduledPhoneCallEventResponse(scheduledPhoneCallEventResponse)
                scheduledSmsEventResponse != null ->
                    visitor.visitScheduledSmsEventResponse(scheduledSmsEventResponse)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitScheduledPhoneCallEventResponse(
                        scheduledPhoneCallEventResponse: ScheduledPhoneCallEventResponse
                    ) {
                        scheduledPhoneCallEventResponse.validate()
                    }

                    override fun visitScheduledSmsEventResponse(
                        scheduledSmsEventResponse: ScheduledSmsEventResponse
                    ) {
                        scheduledSmsEventResponse.validate()
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
                    override fun visitScheduledPhoneCallEventResponse(
                        scheduledPhoneCallEventResponse: ScheduledPhoneCallEventResponse
                    ) = scheduledPhoneCallEventResponse.validity()

                    override fun visitScheduledSmsEventResponse(
                        scheduledSmsEventResponse: ScheduledSmsEventResponse
                    ) = scheduledSmsEventResponse.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                scheduledPhoneCallEventResponse == other.scheduledPhoneCallEventResponse &&
                scheduledSmsEventResponse == other.scheduledSmsEventResponse
        }

        override fun hashCode(): Int =
            Objects.hash(scheduledPhoneCallEventResponse, scheduledSmsEventResponse)

        override fun toString(): String =
            when {
                scheduledPhoneCallEventResponse != null ->
                    "Data{scheduledPhoneCallEventResponse=$scheduledPhoneCallEventResponse}"
                scheduledSmsEventResponse != null ->
                    "Data{scheduledSmsEventResponse=$scheduledSmsEventResponse}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            @JvmStatic
            fun ofScheduledPhoneCallEventResponse(
                scheduledPhoneCallEventResponse: ScheduledPhoneCallEventResponse
            ) = Data(scheduledPhoneCallEventResponse = scheduledPhoneCallEventResponse)

            @JvmStatic
            fun ofScheduledSmsEventResponse(scheduledSmsEventResponse: ScheduledSmsEventResponse) =
                Data(scheduledSmsEventResponse = scheduledSmsEventResponse)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitScheduledPhoneCallEventResponse(
                scheduledPhoneCallEventResponse: ScheduledPhoneCallEventResponse
            ): T

            fun visitScheduledSmsEventResponse(
                scheduledSmsEventResponse: ScheduledSmsEventResponse
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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ScheduledPhoneCallEventResponse>())
                                ?.let { Data(scheduledPhoneCallEventResponse = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ScheduledSmsEventResponse>())?.let {
                                Data(scheduledSmsEventResponse = it, _json = json)
                            },
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
                    value.scheduledPhoneCallEventResponse != null ->
                        generator.writeObject(value.scheduledPhoneCallEventResponse)
                    value.scheduledSmsEventResponse != null ->
                        generator.writeObject(value.scheduledSmsEventResponse)
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

        return other is ScheduledEventListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduledEventListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
