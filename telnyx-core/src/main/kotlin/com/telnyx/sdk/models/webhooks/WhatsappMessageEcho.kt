// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.messages.MessagingError0b38e7044b
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WhatsappMessageEcho
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

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

        /**
         * Returns a mutable builder for constructing an instance of [WhatsappMessageEcho].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappMessageEcho]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappMessageEcho: WhatsappMessageEcho) = apply {
            data = whatsappMessageEcho.data
            additionalProperties = whatsappMessageEcho.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [WhatsappMessageEcho].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WhatsappMessageEcho =
            WhatsappMessageEcho(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): WhatsappMessageEcho = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val eventType: JsonField<EventType>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val payload: JsonField<Payload>,
        private val recordType: JsonField<RecordType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<EventType> = JsonMissing.of(),
            @JsonProperty("occurred_at")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
        ) : this(id, eventType, occurredAt, payload, recordType, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): EventType = eventType.getRequired("event_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurred_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payload(): Payload = payload.getRequired("payload")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        /**
         * Returns the raw JSON value of [occurredAt].
         *
         * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occurred_at")
        @ExcludeMissing
        fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .eventType()
             * .occurredAt()
             * .payload()
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var eventType: JsonField<EventType>? = null
            private var occurredAt: JsonField<OffsetDateTime>? = null
            private var payload: JsonField<Payload>? = null
            private var recordType: JsonField<RecordType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                eventType = data.eventType
                occurredAt = data.occurredAt
                payload = data.payload
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

            /**
             * Sets [Builder.occurredAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                this.occurredAt = occurredAt
            }

            fun payload(payload: Payload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .eventType()
             * .occurredAt()
             * .payload()
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("eventType", eventType),
                    checkRequired("occurredAt", occurredAt),
                    checkRequired("payload", payload),
                    checkRequired("recordType", recordType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            eventType().validate()
            occurredAt()
            payload().validate()
            recordType().validate()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (occurredAt.asKnown().isPresent) 1 else 0) +
                (payload.asKnown().getOrNull()?.validity() ?: 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0)

        class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val MESSAGE_ECHO = of("message.echo")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                MESSAGE_ECHO
            }

            /**
             * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EventType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MESSAGE_ECHO,
                /**
                 * An enum member indicating that [EventType] was instantiated with an unknown
                 * value.
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
                    MESSAGE_ECHO -> Value.MESSAGE_ECHO
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
                    MESSAGE_ECHO -> Known.MESSAGE_ECHO
                    else -> throw TelnyxInvalidDataException("Unknown EventType: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): EventType = apply {
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

                return other is EventType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val body: JsonField<Body>,
            private val cost: JsonField<Cost>,
            private val direction: JsonField<Direction>,
            private val errors: JsonField<List<MessagingError0b38e7044b>>,
            private val from: JsonField<From>,
            private val messagingProfileId: JsonField<String>,
            private val organizationId: JsonField<String>,
            private val origin: JsonField<Origin>,
            private val recordType: JsonField<RecordType>,
            private val to: JsonField<String>,
            private val type: JsonField<Type>,
            private val receivedAt: JsonField<OffsetDateTime>,
            private val tags: JsonField<List<String>>,
            private val webhookFailoverUrl: JsonField<String>,
            private val webhookUrl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("body") @ExcludeMissing body: JsonField<Body> = JsonMissing.of(),
                @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("errors")
                @ExcludeMissing
                errors: JsonField<List<MessagingError0b38e7044b>> = JsonMissing.of(),
                @JsonProperty("from") @ExcludeMissing from: JsonField<From> = JsonMissing.of(),
                @JsonProperty("messaging_profile_id")
                @ExcludeMissing
                messagingProfileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("organization_id")
                @ExcludeMissing
                organizationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("origin")
                @ExcludeMissing
                origin: JsonField<Origin> = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<RecordType> = JsonMissing.of(),
                @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("received_at")
                @ExcludeMissing
                receivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("webhook_failover_url")
                @ExcludeMissing
                webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("webhook_url")
                @ExcludeMissing
                webhookUrl: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                body,
                cost,
                direction,
                errors,
                from,
                messagingProfileId,
                organizationId,
                origin,
                recordType,
                to,
                type,
                receivedAt,
                tags,
                webhookFailoverUrl,
                webhookUrl,
                mutableMapOf(),
            )

            /**
             * Telnyx identifier for the mirrored message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Mirrored WhatsApp message content. The content property matches the value of `type`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun body(): Body = body.getRequired("body")

            /**
             * No charge is created for a Business app message echo.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cost(): Cost = cost.getRequired("cost")

            /**
             * Indicates that the business sent the message to the WhatsApp user.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun errors(): List<MessagingError0b38e7044b> = errors.getRequired("errors")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun from(): From = from.getRequired("from")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun messagingProfileId(): String =
                messagingProfileId.getRequired("messaging_profile_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun organizationId(): String = organizationId.getRequired("organization_id")

            /**
             * Identifies the WhatsApp Business app as the source of the message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun origin(): Origin = origin.getRequired("origin")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun recordType(): RecordType = recordType.getRequired("record_type")

            /**
             * WhatsApp user who received the Business app message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun to(): String = to.getRequired("to")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun receivedAt(): Optional<OffsetDateTime> = receivedAt.getOptional("received_at")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tags(): Optional<List<String>> = tags.getOptional("tags")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun webhookFailoverUrl(): Optional<String> =
                webhookFailoverUrl.getOptional("webhook_failover_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [body].
             *
             * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

            /**
             * Returns the raw JSON value of [cost].
             *
             * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Returns the raw JSON value of [errors].
             *
             * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("errors")
            @ExcludeMissing
            fun _errors(): JsonField<List<MessagingError0b38e7044b>> = errors

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<From> = from

            /**
             * Returns the raw JSON value of [messagingProfileId].
             *
             * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("messaging_profile_id")
            @ExcludeMissing
            fun _messagingProfileId(): JsonField<String> = messagingProfileId

            /**
             * Returns the raw JSON value of [organizationId].
             *
             * Unlike [organizationId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_id")
            @ExcludeMissing
            fun _organizationId(): JsonField<String> = organizationId

            /**
             * Returns the raw JSON value of [origin].
             *
             * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<Origin> = origin

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<RecordType> = recordType

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [receivedAt].
             *
             * Unlike [receivedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("received_at")
            @ExcludeMissing
            fun _receivedAt(): JsonField<OffsetDateTime> = receivedAt

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            /**
             * Returns the raw JSON value of [webhookFailoverUrl].
             *
             * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("webhook_failover_url")
            @ExcludeMissing
            fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

            /**
             * Returns the raw JSON value of [webhookUrl].
             *
             * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("webhook_url")
            @ExcludeMissing
            fun _webhookUrl(): JsonField<String> = webhookUrl

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
                 * Returns a mutable builder for constructing an instance of [Payload].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .body()
                 * .cost()
                 * .direction()
                 * .errors()
                 * .from()
                 * .messagingProfileId()
                 * .organizationId()
                 * .origin()
                 * .recordType()
                 * .to()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Payload]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var body: JsonField<Body>? = null
                private var cost: JsonField<Cost>? = null
                private var direction: JsonField<Direction>? = null
                private var errors: JsonField<MutableList<MessagingError0b38e7044b>>? = null
                private var from: JsonField<From>? = null
                private var messagingProfileId: JsonField<String>? = null
                private var organizationId: JsonField<String>? = null
                private var origin: JsonField<Origin>? = null
                private var recordType: JsonField<RecordType>? = null
                private var to: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var receivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
                private var webhookUrl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    id = payload.id
                    body = payload.body
                    cost = payload.cost
                    direction = payload.direction
                    errors = payload.errors.map { it.toMutableList() }
                    from = payload.from
                    messagingProfileId = payload.messagingProfileId
                    organizationId = payload.organizationId
                    origin = payload.origin
                    recordType = payload.recordType
                    to = payload.to
                    type = payload.type
                    receivedAt = payload.receivedAt
                    tags = payload.tags.map { it.toMutableList() }
                    webhookFailoverUrl = payload.webhookFailoverUrl
                    webhookUrl = payload.webhookUrl
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** Telnyx identifier for the mirrored message. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Mirrored WhatsApp message content. The content property matches the value of
                 * `type`.
                 */
                fun body(body: Body) = body(JsonField.of(body))

                /**
                 * Sets [Builder.body] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.body] with a well-typed [Body] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun body(body: JsonField<Body>) = apply { this.body = body }

                /** No charge is created for a Business app message echo. */
                fun cost(cost: Cost) = cost(JsonField.of(cost))

                /**
                 * Sets [Builder.cost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cost] with a well-typed [Cost] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

                /** Indicates that the business sent the message to the WhatsApp user. */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [Direction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                fun errors(errors: List<MessagingError0b38e7044b>) = errors(JsonField.of(errors))

                /**
                 * Sets [Builder.errors] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errors] with a well-typed
                 * `List<MessagingError0b38e7044b>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun errors(errors: JsonField<List<MessagingError0b38e7044b>>) = apply {
                    this.errors = errors.map { it.toMutableList() }
                }

                /**
                 * Adds a single [MessagingError0b38e7044b] to [errors].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addError(error: MessagingError0b38e7044b) = apply {
                    errors =
                        (errors ?: JsonField.of(mutableListOf())).also {
                            checkKnown("errors", it).add(error)
                        }
                }

                fun from(from: From) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [From] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<From>) = apply { this.from = from }

                fun messagingProfileId(messagingProfileId: String) =
                    messagingProfileId(JsonField.of(messagingProfileId))

                /**
                 * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messagingProfileId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
                    this.messagingProfileId = messagingProfileId
                }

                fun organizationId(organizationId: String) =
                    organizationId(JsonField.of(organizationId))

                /**
                 * Sets [Builder.organizationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun organizationId(organizationId: JsonField<String>) = apply {
                    this.organizationId = organizationId
                }

                /** Identifies the WhatsApp Business app as the source of the message. */
                fun origin(origin: Origin) = origin(JsonField.of(origin))

                /**
                 * Sets [Builder.origin] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origin] with a well-typed [Origin] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

                fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

                /**
                 * Sets [Builder.recordType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordType] with a well-typed [RecordType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<RecordType>) = apply {
                    this.recordType = recordType
                }

                /** WhatsApp user who received the Business app message. */
                fun to(to: String) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun to(to: JsonField<String>) = apply { this.to = to }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun receivedAt(receivedAt: OffsetDateTime) = receivedAt(JsonField.of(receivedAt))

                /**
                 * Sets [Builder.receivedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun receivedAt(receivedAt: JsonField<OffsetDateTime>) = apply {
                    this.receivedAt = receivedAt
                }

                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: String) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                fun webhookFailoverUrl(webhookFailoverUrl: String?) =
                    webhookFailoverUrl(JsonField.ofNullable(webhookFailoverUrl))

                /**
                 * Alias for calling [Builder.webhookFailoverUrl] with
                 * `webhookFailoverUrl.orElse(null)`.
                 */
                fun webhookFailoverUrl(webhookFailoverUrl: Optional<String>) =
                    webhookFailoverUrl(webhookFailoverUrl.getOrNull())

                /**
                 * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
                    this.webhookFailoverUrl = webhookFailoverUrl
                }

                fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

                /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
                fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

                /**
                 * Sets [Builder.webhookUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun webhookUrl(webhookUrl: JsonField<String>) = apply {
                    this.webhookUrl = webhookUrl
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Payload].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .body()
                 * .cost()
                 * .direction()
                 * .errors()
                 * .from()
                 * .messagingProfileId()
                 * .organizationId()
                 * .origin()
                 * .recordType()
                 * .to()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Payload =
                    Payload(
                        checkRequired("id", id),
                        checkRequired("body", body),
                        checkRequired("cost", cost),
                        checkRequired("direction", direction),
                        checkRequired("errors", errors).map { it.toImmutable() },
                        checkRequired("from", from),
                        checkRequired("messagingProfileId", messagingProfileId),
                        checkRequired("organizationId", organizationId),
                        checkRequired("origin", origin),
                        checkRequired("recordType", recordType),
                        checkRequired("to", to),
                        checkRequired("type", type),
                        receivedAt,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        webhookFailoverUrl,
                        webhookUrl,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Payload = apply {
                if (validated) {
                    return@apply
                }

                id()
                body().validate()
                cost().validate()
                direction().validate()
                errors().forEach { it.validate() }
                from().validate()
                messagingProfileId()
                organizationId()
                origin().validate()
                recordType().validate()
                to()
                type().validate()
                receivedAt()
                tags()
                webhookFailoverUrl()
                webhookUrl()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (body.asKnown().getOrNull()?.validity() ?: 0) +
                    (cost.asKnown().getOrNull()?.validity() ?: 0) +
                    (direction.asKnown().getOrNull()?.validity() ?: 0) +
                    (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (from.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                    (if (organizationId.asKnown().isPresent) 1 else 0) +
                    (origin.asKnown().getOrNull()?.validity() ?: 0) +
                    (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (to.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (receivedAt.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
                    (if (webhookUrl.asKnown().isPresent) 1 else 0)

            /**
             * Mirrored WhatsApp message content. The content property matches the value of `type`.
             */
            class Body
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val foreignId: JsonField<String>,
                private val timestamp: JsonField<String>,
                private val type: JsonField<String>,
                private val from: JsonField<String>,
                private val fromUserId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("foreign_id")
                    @ExcludeMissing
                    foreignId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("from")
                    @ExcludeMissing
                    from: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("from_user_id")
                    @ExcludeMissing
                    fromUserId: JsonField<String> = JsonMissing.of(),
                ) : this(id, foreignId, timestamp, type, from, fromUserId, mutableMapOf())

                /**
                 * Telnyx identifier for the mirrored message.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Meta WhatsApp message identifier, also known as a wamid.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun foreignId(): String = foreignId.getRequired("foreign_id")

                /**
                 * Unix timestamp supplied by Meta.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timestamp(): String = timestamp.getRequired("timestamp")

                /**
                 * WhatsApp message content type.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): String = type.getRequired("type")

                /**
                 * WhatsApp user who received the message.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun from(): Optional<String> = from.getOptional("from")

                /**
                 * Opaque recipient identifier when Meta does not supply a phone number.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun fromUserId(): Optional<String> = fromUserId.getOptional("from_user_id")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [foreignId].
                 *
                 * Unlike [foreignId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("foreign_id")
                @ExcludeMissing
                fun _foreignId(): JsonField<String> = foreignId

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<String> = timestamp

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                /**
                 * Returns the raw JSON value of [from].
                 *
                 * Unlike [from], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

                /**
                 * Returns the raw JSON value of [fromUserId].
                 *
                 * Unlike [fromUserId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("from_user_id")
                @ExcludeMissing
                fun _fromUserId(): JsonField<String> = fromUserId

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
                     * Returns a mutable builder for constructing an instance of [Body].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .foreignId()
                     * .timestamp()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Body]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var foreignId: JsonField<String>? = null
                    private var timestamp: JsonField<String>? = null
                    private var type: JsonField<String>? = null
                    private var from: JsonField<String> = JsonMissing.of()
                    private var fromUserId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(body: Body) = apply {
                        id = body.id
                        foreignId = body.foreignId
                        timestamp = body.timestamp
                        type = body.type
                        from = body.from
                        fromUserId = body.fromUserId
                        additionalProperties = body.additionalProperties.toMutableMap()
                    }

                    /** Telnyx identifier for the mirrored message. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Meta WhatsApp message identifier, also known as a wamid. */
                    fun foreignId(foreignId: String) = foreignId(JsonField.of(foreignId))

                    /**
                     * Sets [Builder.foreignId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.foreignId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun foreignId(foreignId: JsonField<String>) = apply {
                        this.foreignId = foreignId
                    }

                    /** Unix timestamp supplied by Meta. */
                    fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<String>) = apply {
                        this.timestamp = timestamp
                    }

                    /** WhatsApp message content type. */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    /** WhatsApp user who received the message. */
                    fun from(from: String) = from(JsonField.of(from))

                    /**
                     * Sets [Builder.from] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.from] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun from(from: JsonField<String>) = apply { this.from = from }

                    /** Opaque recipient identifier when Meta does not supply a phone number. */
                    fun fromUserId(fromUserId: String) = fromUserId(JsonField.of(fromUserId))

                    /**
                     * Sets [Builder.fromUserId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fromUserId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fromUserId(fromUserId: JsonField<String>) = apply {
                        this.fromUserId = fromUserId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Body].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .foreignId()
                     * .timestamp()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Body =
                        Body(
                            checkRequired("id", id),
                            checkRequired("foreignId", foreignId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("type", type),
                            from,
                            fromUserId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Body = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    foreignId()
                    timestamp()
                    type()
                    from()
                    fromUserId()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (foreignId.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (if (type.asKnown().isPresent) 1 else 0) +
                        (if (from.asKnown().isPresent) 1 else 0) +
                        (if (fromUserId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Body &&
                        id == other.id &&
                        foreignId == other.foreignId &&
                        timestamp == other.timestamp &&
                        type == other.type &&
                        from == other.from &&
                        fromUserId == other.fromUserId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        foreignId,
                        timestamp,
                        type,
                        from,
                        fromUserId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Body{id=$id, foreignId=$foreignId, timestamp=$timestamp, type=$type, from=$from, fromUserId=$fromUserId, additionalProperties=$additionalProperties}"
            }

            /** No charge is created for a Business app message echo. */
            class Cost
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<String>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<String> = amount.getOptional("amount")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<String> = currency.getOptional("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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

                    /** Returns a mutable builder for constructing an instance of [Cost]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Cost]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cost: Cost) = apply {
                        amount = cost.amount
                        currency = cost.currency
                        additionalProperties = cost.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

                    /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
                    fun amount(amount: Optional<String>) = amount(amount.getOrNull())

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                    fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Cost].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Cost = Cost(amount, currency, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cost = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cost &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Cost{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** Indicates that the business sent the message to the WhatsApp user. */
            class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val OUTBOUND = of("outbound")

                    @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
                }

                /** An enum containing [Direction]'s known values. */
                enum class Known {
                    OUTBOUND
                }

                /**
                 * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Direction] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OUTBOUND,
                    /**
                     * An enum member indicating that [Direction] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        OUTBOUND -> Value.OUTBOUND
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        OUTBOUND -> Known.OUTBOUND
                        else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Direction = apply {
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

                    return other is Direction && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class From
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val phoneNumber: JsonField<String>,
                private val carrier: JsonField<String>,
                private val lineType: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("phone_number")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("carrier")
                    @ExcludeMissing
                    carrier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line_type")
                    @ExcludeMissing
                    lineType: JsonField<String> = JsonMissing.of(),
                ) : this(phoneNumber, carrier, lineType, mutableMapOf())

                /**
                 * Coexistence-enabled business phone number in E.164 format.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun carrier(): Optional<String> = carrier.getOptional("carrier")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun lineType(): Optional<String> = lineType.getOptional("line_type")

                /**
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phone_number")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [carrier].
                 *
                 * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<String> = carrier

                /**
                 * Returns the raw JSON value of [lineType].
                 *
                 * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line_type")
                @ExcludeMissing
                fun _lineType(): JsonField<String> = lineType

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
                     * Returns a mutable builder for constructing an instance of [From].
                     *
                     * The following fields are required:
                     * ```java
                     * .phoneNumber()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [From]. */
                class Builder internal constructor() {

                    private var phoneNumber: JsonField<String>? = null
                    private var carrier: JsonField<String> = JsonMissing.of()
                    private var lineType: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(from: From) = apply {
                        phoneNumber = from.phoneNumber
                        carrier = from.carrier
                        lineType = from.lineType
                        additionalProperties = from.additionalProperties.toMutableMap()
                    }

                    /** Coexistence-enabled business phone number in E.164 format. */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    fun carrier(carrier: String) = carrier(JsonField.of(carrier))

                    /**
                     * Sets [Builder.carrier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.carrier] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

                    fun lineType(lineType: String) = lineType(JsonField.of(lineType))

                    /**
                     * Sets [Builder.lineType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lineType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lineType(lineType: JsonField<String>) = apply { this.lineType = lineType }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [From].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .phoneNumber()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): From =
                        From(
                            checkRequired("phoneNumber", phoneNumber),
                            carrier,
                            lineType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): From = apply {
                    if (validated) {
                        return@apply
                    }

                    phoneNumber()
                    carrier()
                    lineType()
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
                    (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                        (if (carrier.asKnown().isPresent) 1 else 0) +
                        (if (lineType.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is From &&
                        phoneNumber == other.phoneNumber &&
                        carrier == other.carrier &&
                        lineType == other.lineType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(phoneNumber, carrier, lineType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "From{phoneNumber=$phoneNumber, carrier=$carrier, lineType=$lineType, additionalProperties=$additionalProperties}"
            }

            /** Identifies the WhatsApp Business app as the source of the message. */
            class Origin @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WHATSAPP_BUSINESS_APP = of("whatsapp_business_app")

                    @JvmStatic fun of(value: String) = Origin(JsonField.of(value))
                }

                /** An enum containing [Origin]'s known values. */
                enum class Known {
                    WHATSAPP_BUSINESS_APP
                }

                /**
                 * An enum containing [Origin]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Origin] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WHATSAPP_BUSINESS_APP,
                    /**
                     * An enum member indicating that [Origin] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        WHATSAPP_BUSINESS_APP -> Value.WHATSAPP_BUSINESS_APP
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        WHATSAPP_BUSINESS_APP -> Known.WHATSAPP_BUSINESS_APP
                        else -> throw TelnyxInvalidDataException("Unknown Origin: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Origin = apply {
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

                    return other is Origin && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class RecordType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MESSAGE = of("message")

                    @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
                }

                /** An enum containing [RecordType]'s known values. */
                enum class Known {
                    MESSAGE
                }

                /**
                 * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RecordType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MESSAGE,
                    /**
                     * An enum member indicating that [RecordType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MESSAGE -> Value.MESSAGE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MESSAGE -> Known.MESSAGE
                        else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RecordType = apply {
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

                    return other is RecordType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WHATSAPP = of("WHATSAPP")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    WHATSAPP
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WHATSAPP,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        WHATSAPP -> Value.WHATSAPP
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        WHATSAPP -> Known.WHATSAPP
                        else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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

                return other is Payload &&
                    id == other.id &&
                    body == other.body &&
                    cost == other.cost &&
                    direction == other.direction &&
                    errors == other.errors &&
                    from == other.from &&
                    messagingProfileId == other.messagingProfileId &&
                    organizationId == other.organizationId &&
                    origin == other.origin &&
                    recordType == other.recordType &&
                    to == other.to &&
                    type == other.type &&
                    receivedAt == other.receivedAt &&
                    tags == other.tags &&
                    webhookFailoverUrl == other.webhookFailoverUrl &&
                    webhookUrl == other.webhookUrl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    body,
                    cost,
                    direction,
                    errors,
                    from,
                    messagingProfileId,
                    organizationId,
                    origin,
                    recordType,
                    to,
                    type,
                    receivedAt,
                    tags,
                    webhookFailoverUrl,
                    webhookUrl,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{id=$id, body=$body, cost=$cost, direction=$direction, errors=$errors, from=$from, messagingProfileId=$messagingProfileId, organizationId=$organizationId, origin=$origin, recordType=$recordType, to=$to, type=$type, receivedAt=$receivedAt, tags=$tags, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
        }

        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val EVENT = of("event")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                EVENT
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EVENT,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
                 * value.
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
                    EVENT -> Value.EVENT
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
                    EVENT -> Known.EVENT
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): RecordType = apply {
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

                return other is RecordType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                eventType == other.eventType &&
                occurredAt == other.occurredAt &&
                payload == other.payload &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, eventType, occurredAt, payload, recordType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, eventType=$eventType, occurredAt=$occurredAt, payload=$payload, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappMessageEcho &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappMessageEcho{data=$data, additionalProperties=$additionalProperties}"
}
