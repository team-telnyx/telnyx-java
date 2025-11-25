// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

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
import com.telnyx.sdk.core.Enum
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

    class CampaignStatusUpdateEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val brandId: JsonField<String>,
        private val campaignId: JsonField<String>,
        private val createDate: JsonField<String>,
        private val cspId: JsonField<String>,
        private val isTMobileRegistered: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("campaignId")
            @ExcludeMissing
            campaignId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createDate")
            @ExcludeMissing
            createDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cspId") @ExcludeMissing cspId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isTMobileRegistered")
            @ExcludeMissing
            isTMobileRegistered: JsonField<Boolean> = JsonMissing.of(),
        ) : this(brandId, campaignId, createDate, cspId, isTMobileRegistered, mutableMapOf())

        /**
         * Brand ID associated with the campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandId(): Optional<String> = brandId.getOptional("brandId")

        /**
         * The ID of the campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun campaignId(): Optional<String> = campaignId.getOptional("campaignId")

        /**
         * Unix timestamp when campaign was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createDate(): Optional<String> = createDate.getOptional("createDate")

        /**
         * Alphanumeric identifier of the CSP associated with this campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cspId(): Optional<String> = cspId.getOptional("cspId")

        /**
         * Indicates whether the campaign is registered with T-Mobile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTMobileRegistered(): Optional<Boolean> =
            isTMobileRegistered.getOptional("isTMobileRegistered")

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [campaignId].
         *
         * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("campaignId")
        @ExcludeMissing
        fun _campaignId(): JsonField<String> = campaignId

        /**
         * Returns the raw JSON value of [createDate].
         *
         * Unlike [createDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createDate")
        @ExcludeMissing
        fun _createDate(): JsonField<String> = createDate

        /**
         * Returns the raw JSON value of [cspId].
         *
         * Unlike [cspId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cspId") @ExcludeMissing fun _cspId(): JsonField<String> = cspId

        /**
         * Returns the raw JSON value of [isTMobileRegistered].
         *
         * Unlike [isTMobileRegistered], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("isTMobileRegistered")
        @ExcludeMissing
        fun _isTMobileRegistered(): JsonField<Boolean> = isTMobileRegistered

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
             * Returns a mutable builder for constructing an instance of
             * [CampaignStatusUpdateEvent].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CampaignStatusUpdateEvent]. */
        class Builder internal constructor() {

            private var brandId: JsonField<String> = JsonMissing.of()
            private var campaignId: JsonField<String> = JsonMissing.of()
            private var createDate: JsonField<String> = JsonMissing.of()
            private var cspId: JsonField<String> = JsonMissing.of()
            private var isTMobileRegistered: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(campaignStatusUpdateEvent: CampaignStatusUpdateEvent) = apply {
                brandId = campaignStatusUpdateEvent.brandId
                campaignId = campaignStatusUpdateEvent.campaignId
                createDate = campaignStatusUpdateEvent.createDate
                cspId = campaignStatusUpdateEvent.cspId
                isTMobileRegistered = campaignStatusUpdateEvent.isTMobileRegistered
                additionalProperties = campaignStatusUpdateEvent.additionalProperties.toMutableMap()
            }

            /** Brand ID associated with the campaign. */
            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /** The ID of the campaign. */
            fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

            /**
             * Sets [Builder.campaignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.campaignId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

            /** Unix timestamp when campaign was created. */
            fun createDate(createDate: String) = createDate(JsonField.of(createDate))

            /**
             * Sets [Builder.createDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createDate(createDate: JsonField<String>) = apply { this.createDate = createDate }

            /** Alphanumeric identifier of the CSP associated with this campaign. */
            fun cspId(cspId: String) = cspId(JsonField.of(cspId))

            /**
             * Sets [Builder.cspId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cspId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cspId(cspId: JsonField<String>) = apply { this.cspId = cspId }

            /** Indicates whether the campaign is registered with T-Mobile. */
            fun isTMobileRegistered(isTMobileRegistered: Boolean) =
                isTMobileRegistered(JsonField.of(isTMobileRegistered))

            /**
             * Sets [Builder.isTMobileRegistered] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTMobileRegistered] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isTMobileRegistered(isTMobileRegistered: JsonField<Boolean>) = apply {
                this.isTMobileRegistered = isTMobileRegistered
            }

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
             * Returns an immutable instance of [CampaignStatusUpdateEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CampaignStatusUpdateEvent =
                CampaignStatusUpdateEvent(
                    brandId,
                    campaignId,
                    createDate,
                    cspId,
                    isTMobileRegistered,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CampaignStatusUpdateEvent = apply {
            if (validated) {
                return@apply
            }

            brandId()
            campaignId()
            createDate()
            cspId()
            isTMobileRegistered()
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
            (if (brandId.asKnown().isPresent) 1 else 0) +
                (if (campaignId.asKnown().isPresent) 1 else 0) +
                (if (createDate.asKnown().isPresent) 1 else 0) +
                (if (cspId.asKnown().isPresent) 1 else 0) +
                (if (isTMobileRegistered.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CampaignStatusUpdateEvent &&
                brandId == other.brandId &&
                campaignId == other.campaignId &&
                createDate == other.createDate &&
                cspId == other.cspId &&
                isTMobileRegistered == other.isTMobileRegistered &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                brandId,
                campaignId,
                createDate,
                cspId,
                isTMobileRegistered,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CampaignStatusUpdateEvent{brandId=$brandId, campaignId=$campaignId, createDate=$createDate, cspId=$cspId, isTMobileRegistered=$isTMobileRegistered, additionalProperties=$additionalProperties}"
    }

    class CampaignSuspendedEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val campaignId: JsonField<String>,
        private val description: JsonField<String>,
        private val status: JsonField<Status>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("campaignId")
            @ExcludeMissing
            campaignId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(campaignId, description, status, type, mutableMapOf())

        /**
         * The ID of the campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun campaignId(): Optional<String> = campaignId.getOptional("campaignId")

        /**
         * Description of the event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The status of the campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [campaignId].
         *
         * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("campaignId")
        @ExcludeMissing
        fun _campaignId(): JsonField<String> = campaignId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [CampaignSuspendedEvent].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CampaignSuspendedEvent]. */
        class Builder internal constructor() {

            private var campaignId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(campaignSuspendedEvent: CampaignSuspendedEvent) = apply {
                campaignId = campaignSuspendedEvent.campaignId
                description = campaignSuspendedEvent.description
                status = campaignSuspendedEvent.status
                type = campaignSuspendedEvent.type
                additionalProperties = campaignSuspendedEvent.additionalProperties.toMutableMap()
            }

            /** The ID of the campaign. */
            fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

            /**
             * Sets [Builder.campaignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.campaignId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

            /** Description of the event. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The status of the campaign. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [CampaignSuspendedEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CampaignSuspendedEvent =
                CampaignSuspendedEvent(
                    campaignId,
                    description,
                    status,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CampaignSuspendedEvent = apply {
            if (validated) {
                return@apply
            }

            campaignId()
            description()
            status().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
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
            (if (campaignId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        /** The status of the campaign. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DORMANT = of("DORMANT")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                DORMANT
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DORMANT,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DORMANT -> Value.DORMANT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DORMANT -> Known.DORMANT
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TELNYX_EVENT = of("TELNYX_EVENT")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TELNYX_EVENT
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TELNYX_EVENT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TELNYX_EVENT -> Value.TELNYX_EVENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TELNYX_EVENT -> Known.TELNYX_EVENT
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CampaignSuspendedEvent &&
                campaignId == other.campaignId &&
                description == other.description &&
                status == other.status &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(campaignId, description, status, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CampaignSuspendedEvent{campaignId=$campaignId, description=$description, status=$status, type=$type, additionalProperties=$additionalProperties}"
    }
}
