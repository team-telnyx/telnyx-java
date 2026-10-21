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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallAnalyzedWebhookEvent
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

        /** Returns a mutable builder for constructing an instance of [CallAnalyzedWebhookEvent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallAnalyzedWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callAnalyzedWebhookEvent: CallAnalyzedWebhookEvent) = apply {
            data = callAnalyzedWebhookEvent.data
            additionalProperties = callAnalyzedWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CallAnalyzedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallAnalyzedWebhookEvent =
            CallAnalyzedWebhookEvent(data, additionalProperties.toMutableMap())
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
    fun validate(): CallAnalyzedWebhookEvent = apply {
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
         * Unique identifier for the event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The type of event being delivered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

        /**
         * ISO 8601 datetime of when the event occurred.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun occurredAt(): Optional<OffsetDateTime> = occurredAt.getOptional("occurred_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payload(): Optional<Payload> = payload.getOptional("payload")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var occurredAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var payload: JsonField<Payload> = JsonMissing.of()
            private var recordType: JsonField<RecordType> = JsonMissing.of()
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

            /** Unique identifier for the event. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The type of event being delivered. */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /** ISO 8601 datetime of when the event occurred. */
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

            /** Identifies the type of the resource. */
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
             */
            fun build(): Data =
                Data(
                    id,
                    eventType,
                    occurredAt,
                    payload,
                    recordType,
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
            eventType().ifPresent { it.validate() }
            occurredAt()
            payload().ifPresent { it.validate() }
            recordType().ifPresent { it.validate() }
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

        /** The type of event being delivered. */
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

                @JvmField val CALL_ANALYZED = of("call.analyzed")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                CALL_ANALYZED
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
                CALL_ANALYZED,
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
                    CALL_ANALYZED -> Value.CALL_ANALYZED
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
                    CALL_ANALYZED -> Known.CALL_ANALYZED
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
            private val assistantId: JsonField<String>,
            private val callControlId: JsonField<String>,
            private val callLegId: JsonField<String>,
            private val callSessionId: JsonField<String>,
            private val clientState: JsonField<String>,
            private val connectionId: JsonField<String>,
            private val conversationId: JsonField<String>,
            private val conversationInsights: JsonField<List<ConversationInsight>>,
            private val cost: JsonField<Cost>,
            private val durationSec: JsonField<Long>,
            private val from: JsonField<String>,
            private val llmModel: JsonField<String>,
            private val reason: JsonField<String>,
            private val recordings: JsonField<List<Recording>>,
            private val sttModel: JsonField<String>,
            private val to: JsonField<String>,
            private val ttsModelId: JsonField<String>,
            private val ttsProvider: JsonField<String>,
            private val ttsVoiceId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("assistant_id")
                @ExcludeMissing
                assistantId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("call_control_id")
                @ExcludeMissing
                callControlId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("call_leg_id")
                @ExcludeMissing
                callLegId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("call_session_id")
                @ExcludeMissing
                callSessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("client_state")
                @ExcludeMissing
                clientState: JsonField<String> = JsonMissing.of(),
                @JsonProperty("connection_id")
                @ExcludeMissing
                connectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("conversation_id")
                @ExcludeMissing
                conversationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("conversation_insights")
                @ExcludeMissing
                conversationInsights: JsonField<List<ConversationInsight>> = JsonMissing.of(),
                @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
                @JsonProperty("duration_sec")
                @ExcludeMissing
                durationSec: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
                @JsonProperty("llm_model")
                @ExcludeMissing
                llmModel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("recordings")
                @ExcludeMissing
                recordings: JsonField<List<Recording>> = JsonMissing.of(),
                @JsonProperty("stt_model")
                @ExcludeMissing
                sttModel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tts_model_id")
                @ExcludeMissing
                ttsModelId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tts_provider")
                @ExcludeMissing
                ttsProvider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tts_voice_id")
                @ExcludeMissing
                ttsVoiceId: JsonField<String> = JsonMissing.of(),
            ) : this(
                assistantId,
                callControlId,
                callLegId,
                callSessionId,
                clientState,
                connectionId,
                conversationId,
                conversationInsights,
                cost,
                durationSec,
                from,
                llmModel,
                reason,
                recordings,
                sttModel,
                to,
                ttsModelId,
                ttsProvider,
                ttsVoiceId,
                mutableMapOf(),
            )

            /**
             * Unique identifier of the assistant involved in the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun assistantId(): Optional<String> = assistantId.getOptional("assistant_id")

            /**
             * Call ID used to issue commands via Call Control API.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callControlId(): Optional<String> = callControlId.getOptional("call_control_id")

            /**
             * ID that is unique to the call leg.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callLegId(): Optional<String> = callLegId.getOptional("call_leg_id")

            /**
             * ID that is unique to the call session (group of related call legs).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callSessionId(): Optional<String> = callSessionId.getOptional("call_session_id")

            /**
             * Base64-encoded state received from a command.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clientState(): Optional<String> = clientState.getOptional("client_state")

            /**
             * Call Control App ID (formerly Telnyx connection ID) used in the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

            /**
             * ID unique to the conversation generated for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun conversationId(): Optional<String> = conversationId.getOptional("conversation_id")

            /**
             * The conversation's generated insights, when insight generation was enabled for the
             * assistant and has completed. Each entry carries a `status` and the generated
             * `conversation_insights` results. An empty array when the conversation has no
             * generated insights; null when insight data could not be retrieved.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun conversationInsights(): Optional<List<ConversationInsight>> =
                conversationInsights.getOptional("conversation_insights")

            /**
             * The session's cost breakdown from Session Analysis, covering every product billed on
             * the call: the AI Voice Assistant engine minutes (`ai-voice-assistant`), LLM inference
             * tokens (`inference`), and call-control, SIP trunking, and recording lines. If cost
             * data could not be retrieved after retries, this field carries the placeholder string
             * `No cost data available.` instead of an object.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cost(): Optional<Cost> = cost.getOptional("cost")

            /**
             * Duration of the conversation in seconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun durationSec(): Optional<Long> = durationSec.getOptional("duration_sec")

            /**
             * The caller's number or identifier.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun from(): Optional<String> = from.getOptional("from")

            /**
             * The large language model used during the conversation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun llmModel(): Optional<String> = llmModel.getOptional("llm_model")

            /**
             * Reason the conversation ended.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reason(): Optional<String> = reason.getOptional("reason")

            /**
             * Recordings created for the call. An empty array when the call had no recordings; null
             * when recording data could not be retrieved.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordings(): Optional<List<Recording>> = recordings.getOptional("recordings")

            /**
             * The speech-to-text model used in the conversation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sttModel(): Optional<String> = sttModel.getOptional("stt_model")

            /**
             * The callee's number or SIP address.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun to(): Optional<String> = to.getOptional("to")

            /**
             * The model ID used for text-to-speech synthesis.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ttsModelId(): Optional<String> = ttsModelId.getOptional("tts_model_id")

            /**
             * The text-to-speech provider used in the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ttsProvider(): Optional<String> = ttsProvider.getOptional("tts_provider")

            /**
             * Voice ID used for TTS.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ttsVoiceId(): Optional<String> = ttsVoiceId.getOptional("tts_voice_id")

            /**
             * Returns the raw JSON value of [assistantId].
             *
             * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assistant_id")
            @ExcludeMissing
            fun _assistantId(): JsonField<String> = assistantId

            /**
             * Returns the raw JSON value of [callControlId].
             *
             * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("call_control_id")
            @ExcludeMissing
            fun _callControlId(): JsonField<String> = callControlId

            /**
             * Returns the raw JSON value of [callLegId].
             *
             * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("call_leg_id")
            @ExcludeMissing
            fun _callLegId(): JsonField<String> = callLegId

            /**
             * Returns the raw JSON value of [callSessionId].
             *
             * Unlike [callSessionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("call_session_id")
            @ExcludeMissing
            fun _callSessionId(): JsonField<String> = callSessionId

            /**
             * Returns the raw JSON value of [clientState].
             *
             * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("client_state")
            @ExcludeMissing
            fun _clientState(): JsonField<String> = clientState

            /**
             * Returns the raw JSON value of [connectionId].
             *
             * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("connection_id")
            @ExcludeMissing
            fun _connectionId(): JsonField<String> = connectionId

            /**
             * Returns the raw JSON value of [conversationId].
             *
             * Unlike [conversationId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversation_id")
            @ExcludeMissing
            fun _conversationId(): JsonField<String> = conversationId

            /**
             * Returns the raw JSON value of [conversationInsights].
             *
             * Unlike [conversationInsights], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversation_insights")
            @ExcludeMissing
            fun _conversationInsights(): JsonField<List<ConversationInsight>> = conversationInsights

            /**
             * Returns the raw JSON value of [cost].
             *
             * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

            /**
             * Returns the raw JSON value of [durationSec].
             *
             * Unlike [durationSec], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration_sec")
            @ExcludeMissing
            fun _durationSec(): JsonField<Long> = durationSec

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

            /**
             * Returns the raw JSON value of [llmModel].
             *
             * Unlike [llmModel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("llm_model") @ExcludeMissing fun _llmModel(): JsonField<String> = llmModel

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * Returns the raw JSON value of [recordings].
             *
             * Unlike [recordings], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recordings")
            @ExcludeMissing
            fun _recordings(): JsonField<List<Recording>> = recordings

            /**
             * Returns the raw JSON value of [sttModel].
             *
             * Unlike [sttModel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stt_model") @ExcludeMissing fun _sttModel(): JsonField<String> = sttModel

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

            /**
             * Returns the raw JSON value of [ttsModelId].
             *
             * Unlike [ttsModelId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tts_model_id")
            @ExcludeMissing
            fun _ttsModelId(): JsonField<String> = ttsModelId

            /**
             * Returns the raw JSON value of [ttsProvider].
             *
             * Unlike [ttsProvider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tts_provider")
            @ExcludeMissing
            fun _ttsProvider(): JsonField<String> = ttsProvider

            /**
             * Returns the raw JSON value of [ttsVoiceId].
             *
             * Unlike [ttsVoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tts_voice_id")
            @ExcludeMissing
            fun _ttsVoiceId(): JsonField<String> = ttsVoiceId

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

                /** Returns a mutable builder for constructing an instance of [Payload]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Payload]. */
            class Builder internal constructor() {

                private var assistantId: JsonField<String> = JsonMissing.of()
                private var callControlId: JsonField<String> = JsonMissing.of()
                private var callLegId: JsonField<String> = JsonMissing.of()
                private var callSessionId: JsonField<String> = JsonMissing.of()
                private var clientState: JsonField<String> = JsonMissing.of()
                private var connectionId: JsonField<String> = JsonMissing.of()
                private var conversationId: JsonField<String> = JsonMissing.of()
                private var conversationInsights: JsonField<MutableList<ConversationInsight>>? =
                    null
                private var cost: JsonField<Cost> = JsonMissing.of()
                private var durationSec: JsonField<Long> = JsonMissing.of()
                private var from: JsonField<String> = JsonMissing.of()
                private var llmModel: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var recordings: JsonField<MutableList<Recording>>? = null
                private var sttModel: JsonField<String> = JsonMissing.of()
                private var to: JsonField<String> = JsonMissing.of()
                private var ttsModelId: JsonField<String> = JsonMissing.of()
                private var ttsProvider: JsonField<String> = JsonMissing.of()
                private var ttsVoiceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    assistantId = payload.assistantId
                    callControlId = payload.callControlId
                    callLegId = payload.callLegId
                    callSessionId = payload.callSessionId
                    clientState = payload.clientState
                    connectionId = payload.connectionId
                    conversationId = payload.conversationId
                    conversationInsights = payload.conversationInsights.map { it.toMutableList() }
                    cost = payload.cost
                    durationSec = payload.durationSec
                    from = payload.from
                    llmModel = payload.llmModel
                    reason = payload.reason
                    recordings = payload.recordings.map { it.toMutableList() }
                    sttModel = payload.sttModel
                    to = payload.to
                    ttsModelId = payload.ttsModelId
                    ttsProvider = payload.ttsProvider
                    ttsVoiceId = payload.ttsVoiceId
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** Unique identifier of the assistant involved in the call. */
                fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

                /**
                 * Sets [Builder.assistantId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assistantId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assistantId(assistantId: JsonField<String>) = apply {
                    this.assistantId = assistantId
                }

                /** Call ID used to issue commands via Call Control API. */
                fun callControlId(callControlId: String) =
                    callControlId(JsonField.of(callControlId))

                /**
                 * Sets [Builder.callControlId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callControlId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callControlId(callControlId: JsonField<String>) = apply {
                    this.callControlId = callControlId
                }

                /** ID that is unique to the call leg. */
                fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

                /**
                 * Sets [Builder.callLegId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callLegId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

                /** ID that is unique to the call session (group of related call legs). */
                fun callSessionId(callSessionId: String) =
                    callSessionId(JsonField.of(callSessionId))

                /**
                 * Sets [Builder.callSessionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callSessionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callSessionId(callSessionId: JsonField<String>) = apply {
                    this.callSessionId = callSessionId
                }

                /** Base64-encoded state received from a command. */
                fun clientState(clientState: String) = clientState(JsonField.of(clientState))

                /**
                 * Sets [Builder.clientState] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientState] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clientState(clientState: JsonField<String>) = apply {
                    this.clientState = clientState
                }

                /** Call Control App ID (formerly Telnyx connection ID) used in the call. */
                fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

                /**
                 * Sets [Builder.connectionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connectionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun connectionId(connectionId: JsonField<String>) = apply {
                    this.connectionId = connectionId
                }

                /** ID unique to the conversation generated for the call. */
                fun conversationId(conversationId: String) =
                    conversationId(JsonField.of(conversationId))

                /**
                 * Sets [Builder.conversationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversationId(conversationId: JsonField<String>) = apply {
                    this.conversationId = conversationId
                }

                /**
                 * The conversation's generated insights, when insight generation was enabled for
                 * the assistant and has completed. Each entry carries a `status` and the generated
                 * `conversation_insights` results. An empty array when the conversation has no
                 * generated insights; null when insight data could not be retrieved.
                 */
                fun conversationInsights(conversationInsights: List<ConversationInsight>?) =
                    conversationInsights(JsonField.ofNullable(conversationInsights))

                /**
                 * Alias for calling [Builder.conversationInsights] with
                 * `conversationInsights.orElse(null)`.
                 */
                fun conversationInsights(
                    conversationInsights: Optional<List<ConversationInsight>>
                ) = conversationInsights(conversationInsights.getOrNull())

                /**
                 * Sets [Builder.conversationInsights] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversationInsights] with a well-typed
                 * `List<ConversationInsight>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun conversationInsights(
                    conversationInsights: JsonField<List<ConversationInsight>>
                ) = apply {
                    this.conversationInsights = conversationInsights.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ConversationInsight] to [conversationInsights].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addConversationInsight(conversationInsight: ConversationInsight) = apply {
                    conversationInsights =
                        (conversationInsights ?: JsonField.of(mutableListOf())).also {
                            checkKnown("conversationInsights", it).add(conversationInsight)
                        }
                }

                /**
                 * The session's cost breakdown from Session Analysis, covering every product billed
                 * on the call: the AI Voice Assistant engine minutes (`ai-voice-assistant`), LLM
                 * inference tokens (`inference`), and call-control, SIP trunking, and recording
                 * lines. If cost data could not be retrieved after retries, this field carries the
                 * placeholder string `No cost data available.` instead of an object.
                 */
                fun cost(cost: Cost) = cost(JsonField.of(cost))

                /**
                 * Sets [Builder.cost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cost] with a well-typed [Cost] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

                /** Alias for calling [cost] with `Cost.ofUnionMember0(unionMember0)`. */
                fun cost(unionMember0: Cost.UnionMember0) = cost(Cost.ofUnionMember0(unionMember0))

                /** Alias for calling [cost] with `Cost.ofString(string)`. */
                fun cost(string: String) = cost(Cost.ofString(string))

                /** Duration of the conversation in seconds. */
                fun durationSec(durationSec: Long) = durationSec(JsonField.of(durationSec))

                /**
                 * Sets [Builder.durationSec] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.durationSec] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun durationSec(durationSec: JsonField<Long>) = apply {
                    this.durationSec = durationSec
                }

                /** The caller's number or identifier. */
                fun from(from: String) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<String>) = apply { this.from = from }

                /** The large language model used during the conversation. */
                fun llmModel(llmModel: String) = llmModel(JsonField.of(llmModel))

                /**
                 * Sets [Builder.llmModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.llmModel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun llmModel(llmModel: JsonField<String>) = apply { this.llmModel = llmModel }

                /** Reason the conversation ended. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * Recordings created for the call. An empty array when the call had no recordings;
                 * null when recording data could not be retrieved.
                 */
                fun recordings(recordings: List<Recording>?) =
                    recordings(JsonField.ofNullable(recordings))

                /** Alias for calling [Builder.recordings] with `recordings.orElse(null)`. */
                fun recordings(recordings: Optional<List<Recording>>) =
                    recordings(recordings.getOrNull())

                /**
                 * Sets [Builder.recordings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordings] with a well-typed `List<Recording>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun recordings(recordings: JsonField<List<Recording>>) = apply {
                    this.recordings = recordings.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Recording] to [recordings].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRecording(recording: Recording) = apply {
                    recordings =
                        (recordings ?: JsonField.of(mutableListOf())).also {
                            checkKnown("recordings", it).add(recording)
                        }
                }

                /** The speech-to-text model used in the conversation. */
                fun sttModel(sttModel: String) = sttModel(JsonField.of(sttModel))

                /**
                 * Sets [Builder.sttModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sttModel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sttModel(sttModel: JsonField<String>) = apply { this.sttModel = sttModel }

                /** The callee's number or SIP address. */
                fun to(to: String) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun to(to: JsonField<String>) = apply { this.to = to }

                /** The model ID used for text-to-speech synthesis. */
                fun ttsModelId(ttsModelId: String) = ttsModelId(JsonField.of(ttsModelId))

                /**
                 * Sets [Builder.ttsModelId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ttsModelId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ttsModelId(ttsModelId: JsonField<String>) = apply {
                    this.ttsModelId = ttsModelId
                }

                /** The text-to-speech provider used in the call. */
                fun ttsProvider(ttsProvider: String) = ttsProvider(JsonField.of(ttsProvider))

                /**
                 * Sets [Builder.ttsProvider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ttsProvider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ttsProvider(ttsProvider: JsonField<String>) = apply {
                    this.ttsProvider = ttsProvider
                }

                /** Voice ID used for TTS. */
                fun ttsVoiceId(ttsVoiceId: String) = ttsVoiceId(JsonField.of(ttsVoiceId))

                /**
                 * Sets [Builder.ttsVoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ttsVoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ttsVoiceId(ttsVoiceId: JsonField<String>) = apply {
                    this.ttsVoiceId = ttsVoiceId
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
                 */
                fun build(): Payload =
                    Payload(
                        assistantId,
                        callControlId,
                        callLegId,
                        callSessionId,
                        clientState,
                        connectionId,
                        conversationId,
                        (conversationInsights ?: JsonMissing.of()).map { it.toImmutable() },
                        cost,
                        durationSec,
                        from,
                        llmModel,
                        reason,
                        (recordings ?: JsonMissing.of()).map { it.toImmutable() },
                        sttModel,
                        to,
                        ttsModelId,
                        ttsProvider,
                        ttsVoiceId,
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

                assistantId()
                callControlId()
                callLegId()
                callSessionId()
                clientState()
                connectionId()
                conversationId()
                conversationInsights().ifPresent { it.forEach { it.validate() } }
                cost().ifPresent { it.validate() }
                durationSec()
                from()
                llmModel()
                reason()
                recordings().ifPresent { it.forEach { it.validate() } }
                sttModel()
                to()
                ttsModelId()
                ttsProvider()
                ttsVoiceId()
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
                (if (assistantId.asKnown().isPresent) 1 else 0) +
                    (if (callControlId.asKnown().isPresent) 1 else 0) +
                    (if (callLegId.asKnown().isPresent) 1 else 0) +
                    (if (callSessionId.asKnown().isPresent) 1 else 0) +
                    (if (clientState.asKnown().isPresent) 1 else 0) +
                    (if (connectionId.asKnown().isPresent) 1 else 0) +
                    (if (conversationId.asKnown().isPresent) 1 else 0) +
                    (conversationInsights.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (cost.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (durationSec.asKnown().isPresent) 1 else 0) +
                    (if (from.asKnown().isPresent) 1 else 0) +
                    (if (llmModel.asKnown().isPresent) 1 else 0) +
                    (if (reason.asKnown().isPresent) 1 else 0) +
                    (recordings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (sttModel.asKnown().isPresent) 1 else 0) +
                    (if (to.asKnown().isPresent) 1 else 0) +
                    (if (ttsModelId.asKnown().isPresent) 1 else 0) +
                    (if (ttsProvider.asKnown().isPresent) 1 else 0) +
                    (if (ttsVoiceId.asKnown().isPresent) 1 else 0)

            class ConversationInsight
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val conversationInsights: JsonField<List<InnerConversationInsight>>,
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("conversation_insights")
                    @ExcludeMissing
                    conversationInsights: JsonField<List<InnerConversationInsight>> =
                        JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                ) : this(conversationInsights, status, mutableMapOf())

                /**
                 * Generated insight results.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun conversationInsights(): Optional<List<InnerConversationInsight>> =
                    conversationInsights.getOptional("conversation_insights")

                /**
                 * Status of insight generation for this entry.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun status(): Optional<String> = status.getOptional("status")

                /**
                 * Returns the raw JSON value of [conversationInsights].
                 *
                 * Unlike [conversationInsights], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversation_insights")
                @ExcludeMissing
                fun _conversationInsights(): JsonField<List<InnerConversationInsight>> =
                    conversationInsights

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
                     * [ConversationInsight].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ConversationInsight]. */
                class Builder internal constructor() {

                    private var conversationInsights:
                        JsonField<MutableList<InnerConversationInsight>>? =
                        null
                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(conversationInsight: ConversationInsight) = apply {
                        conversationInsights =
                            conversationInsight.conversationInsights.map { it.toMutableList() }
                        status = conversationInsight.status
                        additionalProperties =
                            conversationInsight.additionalProperties.toMutableMap()
                    }

                    /** Generated insight results. */
                    fun conversationInsights(
                        conversationInsights: List<InnerConversationInsight>?
                    ) = conversationInsights(JsonField.ofNullable(conversationInsights))

                    /**
                     * Alias for calling [Builder.conversationInsights] with
                     * `conversationInsights.orElse(null)`.
                     */
                    fun conversationInsights(
                        conversationInsights: Optional<List<InnerConversationInsight>>
                    ) = conversationInsights(conversationInsights.getOrNull())

                    /**
                     * Sets [Builder.conversationInsights] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversationInsights] with a well-typed
                     * `List<InnerConversationInsight>` value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun conversationInsights(
                        conversationInsights: JsonField<List<InnerConversationInsight>>
                    ) = apply {
                        this.conversationInsights = conversationInsights.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [InnerConversationInsight] to [conversationInsights].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addConversationInsight(conversationInsight: InnerConversationInsight) =
                        apply {
                            conversationInsights =
                                (conversationInsights ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("conversationInsights", it).add(conversationInsight)
                                }
                        }

                    /** Status of insight generation for this entry. */
                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

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
                     * Returns an immutable instance of [ConversationInsight].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ConversationInsight =
                        ConversationInsight(
                            (conversationInsights ?: JsonMissing.of()).map { it.toImmutable() },
                            status,
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
                fun validate(): ConversationInsight = apply {
                    if (validated) {
                        return@apply
                    }

                    conversationInsights().ifPresent { it.forEach { it.validate() } }
                    status()
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
                    (conversationInsights.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) + (if (status.asKnown().isPresent) 1 else 0)

                class InnerConversationInsight
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val insightId: JsonField<String>,
                    private val result: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("insight_id")
                        @ExcludeMissing
                        insightId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("result")
                        @ExcludeMissing
                        result: JsonField<String> = JsonMissing.of(),
                    ) : this(insightId, result, mutableMapOf())

                    /**
                     * Identifier of the insight template the result was generated from.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun insightId(): Optional<String> = insightId.getOptional("insight_id")

                    /**
                     * The generated insight result.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun result(): Optional<String> = result.getOptional("result")

                    /**
                     * Returns the raw JSON value of [insightId].
                     *
                     * Unlike [insightId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("insight_id")
                    @ExcludeMissing
                    fun _insightId(): JsonField<String> = insightId

                    /**
                     * Returns the raw JSON value of [result].
                     *
                     * Unlike [result], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun _result(): JsonField<String> = result

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
                         * [InnerConversationInsight].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InnerConversationInsight]. */
                    class Builder internal constructor() {

                        private var insightId: JsonField<String> = JsonMissing.of()
                        private var result: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(innerConversationInsight: InnerConversationInsight) =
                            apply {
                                insightId = innerConversationInsight.insightId
                                result = innerConversationInsight.result
                                additionalProperties =
                                    innerConversationInsight.additionalProperties.toMutableMap()
                            }

                        /** Identifier of the insight template the result was generated from. */
                        fun insightId(insightId: String) = insightId(JsonField.of(insightId))

                        /**
                         * Sets [Builder.insightId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.insightId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun insightId(insightId: JsonField<String>) = apply {
                            this.insightId = insightId
                        }

                        /** The generated insight result. */
                        fun result(result: String) = result(JsonField.of(result))

                        /**
                         * Sets [Builder.result] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.result] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun result(result: JsonField<String>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [InnerConversationInsight].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): InnerConversationInsight =
                            InnerConversationInsight(
                                insightId,
                                result,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): InnerConversationInsight = apply {
                        if (validated) {
                            return@apply
                        }

                        insightId()
                        result()
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
                        (if (insightId.asKnown().isPresent) 1 else 0) +
                            (if (result.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InnerConversationInsight &&
                            insightId == other.insightId &&
                            result == other.result &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(insightId, result, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerConversationInsight{insightId=$insightId, result=$result, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ConversationInsight &&
                        conversationInsights == other.conversationInsights &&
                        status == other.status &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(conversationInsights, status, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConversationInsight{conversationInsights=$conversationInsights, status=$status, additionalProperties=$additionalProperties}"
            }

            /**
             * The session's cost breakdown from Session Analysis, covering every product billed on
             * the call: the AI Voice Assistant engine minutes (`ai-voice-assistant`), LLM inference
             * tokens (`inference`), and call-control, SIP trunking, and recording lines. If cost
             * data could not be retrieved after retries, this field carries the placeholder string
             * `No cost data available.` instead of an object.
             */
            @JsonDeserialize(using = Cost.Deserializer::class)
            @JsonSerialize(using = Cost.Serializer::class)
            class Cost
            private constructor(
                private val unionMember0: UnionMember0? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                /**
                 * The session's cost breakdown from Session Analysis, covering every product billed
                 * on the call: the AI Voice Assistant engine minutes (`ai-voice-assistant`), LLM
                 * inference tokens (`inference`), and call-control, SIP trunking, and recording
                 * lines. If cost data could not be retrieved after retries, this field carries the
                 * placeholder string `No cost data available.` instead of an object.
                 */
                fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

                /**
                 * The session's cost breakdown from Session Analysis, covering every product billed
                 * on the call: the AI Voice Assistant engine minutes (`ai-voice-assistant`), LLM
                 * inference tokens (`inference`), and call-control, SIP trunking, and recording
                 * lines. If cost data could not be retrieved after retries, this field carries the
                 * placeholder string `No cost data available.` instead of an object.
                 */
                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isUnionMember0(): Boolean = unionMember0 != null

                fun isString(): Boolean = string != null

                /**
                 * The session's cost breakdown from Session Analysis, covering every product billed
                 * on the call: the AI Voice Assistant engine minutes (`ai-voice-assistant`), LLM
                 * inference tokens (`inference`), and call-control, SIP trunking, and recording
                 * lines. If cost data could not be retrieved after retries, this field carries the
                 * placeholder string `No cost data available.` instead of an object.
                 */
                fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

                /**
                 * The session's cost breakdown from Session Analysis, covering every product billed
                 * on the call: the AI Voice Assistant engine minutes (`ai-voice-assistant`), LLM
                 * inference tokens (`inference`), and call-control, SIP trunking, and recording
                 * lines. If cost data could not be retrieved after retries, this field carries the
                 * placeholder string `No cost data available.` instead of an object.
                 */
                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.telnyx.sdk.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = cost.accept(new Cost.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
                 *         return Optional.of(unionMember0.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
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

                    accept(
                        object : Visitor<Unit> {
                            override fun visitUnionMember0(unionMember0: UnionMember0) {
                                unionMember0.validate()
                            }

                            override fun visitString(string: String) {}
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
                            override fun visitUnionMember0(unionMember0: UnionMember0) =
                                unionMember0.validity()

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cost &&
                        unionMember0 == other.unionMember0 &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(unionMember0, string)

                override fun toString(): String =
                    when {
                        unionMember0 != null -> "Cost{unionMember0=$unionMember0}"
                        string != null -> "Cost{string=$string}"
                        _json != null -> "Cost{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Cost")
                    }

                companion object {

                    /**
                     * The session's cost breakdown from Session Analysis, covering every product
                     * billed on the call: the AI Voice Assistant engine minutes
                     * (`ai-voice-assistant`), LLM inference tokens (`inference`), and call-control,
                     * SIP trunking, and recording lines. If cost data could not be retrieved after
                     * retries, this field carries the placeholder string `No cost data available.`
                     * instead of an object.
                     */
                    @JvmStatic
                    fun ofUnionMember0(unionMember0: UnionMember0) =
                        Cost(unionMember0 = unionMember0)

                    /**
                     * The session's cost breakdown from Session Analysis, covering every product
                     * billed on the call: the AI Voice Assistant engine minutes
                     * (`ai-voice-assistant`), LLM inference tokens (`inference`), and call-control,
                     * SIP trunking, and recording lines. If cost data could not be retrieved after
                     * retries, this field carries the placeholder string `No cost data available.`
                     * instead of an object.
                     */
                    @JvmStatic fun ofString(string: String) = Cost(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [Cost] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    /**
                     * The session's cost breakdown from Session Analysis, covering every product
                     * billed on the call: the AI Voice Assistant engine minutes
                     * (`ai-voice-assistant`), LLM inference tokens (`inference`), and call-control,
                     * SIP trunking, and recording lines. If cost data could not be retrieved after
                     * retries, this field carries the placeholder string `No cost data available.`
                     * instead of an object.
                     */
                    fun visitUnionMember0(unionMember0: UnionMember0): T

                    /**
                     * The session's cost breakdown from Session Analysis, covering every product
                     * billed on the call: the AI Voice Assistant engine minutes
                     * (`ai-voice-assistant`), LLM inference tokens (`inference`), and call-control,
                     * SIP trunking, and recording lines. If cost data could not be retrieved after
                     * retries, this field carries the placeholder string `No cost data available.`
                     * instead of an object.
                     */
                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [Cost] to a value of type [T].
                     *
                     * An instance of [Cost] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown Cost: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Cost>(Cost::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Cost {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                        Cost(unionMember0 = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Cost(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Cost(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Cost>(Cost::class) {

                    override fun serialize(
                        value: Cost,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Cost")
                        }
                    }
                }

                /**
                 * The session's cost breakdown from Session Analysis, covering every product billed
                 * on the call: the AI Voice Assistant engine minutes (`ai-voice-assistant`), LLM
                 * inference tokens (`inference`), and call-control, SIP trunking, and recording
                 * lines. If cost data could not be retrieved after retries, this field carries the
                 * placeholder string `No cost data available.` instead of an object.
                 */
                class UnionMember0
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val breakdown: JsonField<List<Breakdown>>,
                    private val currency: JsonField<String>,
                    private val total: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("breakdown")
                        @ExcludeMissing
                        breakdown: JsonField<List<Breakdown>> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("total")
                        @ExcludeMissing
                        total: JsonField<String> = JsonMissing.of(),
                    ) : this(breakdown, currency, total, mutableMapOf())

                    /**
                     * Cost lines grouped by product.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun breakdown(): Optional<List<Breakdown>> = breakdown.getOptional("breakdown")

                    /**
                     * The currency of the cost amounts.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun currency(): Optional<String> = currency.getOptional("currency")

                    /**
                     * The total cost of the call, summed across every product in the breakdown.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun total(): Optional<String> = total.getOptional("total")

                    /**
                     * Returns the raw JSON value of [breakdown].
                     *
                     * Unlike [breakdown], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("breakdown")
                    @ExcludeMissing
                    fun _breakdown(): JsonField<List<Breakdown>> = breakdown

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

                    /**
                     * Returns the raw JSON value of [total].
                     *
                     * Unlike [total], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

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
                         * Returns a mutable builder for constructing an instance of [UnionMember0].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UnionMember0]. */
                    class Builder internal constructor() {

                        private var breakdown: JsonField<MutableList<Breakdown>>? = null
                        private var currency: JsonField<String> = JsonMissing.of()
                        private var total: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember0: UnionMember0) = apply {
                            breakdown = unionMember0.breakdown.map { it.toMutableList() }
                            currency = unionMember0.currency
                            total = unionMember0.total
                            additionalProperties = unionMember0.additionalProperties.toMutableMap()
                        }

                        /** Cost lines grouped by product. */
                        fun breakdown(breakdown: List<Breakdown>) =
                            breakdown(JsonField.of(breakdown))

                        /**
                         * Sets [Builder.breakdown] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.breakdown] with a well-typed
                         * `List<Breakdown>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun breakdown(breakdown: JsonField<List<Breakdown>>) = apply {
                            this.breakdown = breakdown.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Breakdown] to [Builder.breakdown].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addBreakdown(breakdown: Breakdown) = apply {
                            this.breakdown =
                                (this.breakdown ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("breakdown", it).add(breakdown)
                                }
                        }

                        /** The currency of the cost amounts. */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

                        /**
                         * The total cost of the call, summed across every product in the breakdown.
                         */
                        fun total(total: String) = total(JsonField.of(total))

                        /**
                         * Sets [Builder.total] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.total] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun total(total: JsonField<String>) = apply { this.total = total }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [UnionMember0].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): UnionMember0 =
                            UnionMember0(
                                (breakdown ?: JsonMissing.of()).map { it.toImmutable() },
                                currency,
                                total,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): UnionMember0 = apply {
                        if (validated) {
                            return@apply
                        }

                        breakdown().ifPresent { it.forEach { it.validate() } }
                        currency()
                        total()
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
                        (breakdown.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (if (currency.asKnown().isPresent) 1 else 0) +
                            (if (total.asKnown().isPresent) 1 else 0)

                    class Breakdown
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val cost: JsonField<String>,
                        private val product: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("cost")
                            @ExcludeMissing
                            cost: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("product")
                            @ExcludeMissing
                            product: JsonField<String> = JsonMissing.of(),
                        ) : this(cost, product, mutableMapOf())

                        /**
                         * Total cost for this product across the call, in the currency given by
                         * `cost.currency`.
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun cost(): Optional<String> = cost.getOptional("cost")

                        /**
                         * The Telnyx product the cost line belongs to (for example
                         * `ai-voice-assistant`, `inference`, `callcontrol-cdrs`,
                         * `siptrunking-cdrs`, `recording-cdrs`).
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun product(): Optional<String> = product.getOptional("product")

                        /**
                         * Returns the raw JSON value of [cost].
                         *
                         * Unlike [cost], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

                        /**
                         * Returns the raw JSON value of [product].
                         *
                         * Unlike [product], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("product")
                        @ExcludeMissing
                        fun _product(): JsonField<String> = product

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
                             * [Breakdown].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Breakdown]. */
                        class Builder internal constructor() {

                            private var cost: JsonField<String> = JsonMissing.of()
                            private var product: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(breakdown: Breakdown) = apply {
                                cost = breakdown.cost
                                product = breakdown.product
                                additionalProperties = breakdown.additionalProperties.toMutableMap()
                            }

                            /**
                             * Total cost for this product across the call, in the currency given by
                             * `cost.currency`.
                             */
                            fun cost(cost: String) = cost(JsonField.of(cost))

                            /**
                             * Sets [Builder.cost] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.cost] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun cost(cost: JsonField<String>) = apply { this.cost = cost }

                            /**
                             * The Telnyx product the cost line belongs to (for example
                             * `ai-voice-assistant`, `inference`, `callcontrol-cdrs`,
                             * `siptrunking-cdrs`, `recording-cdrs`).
                             */
                            fun product(product: String) = product(JsonField.of(product))

                            /**
                             * Sets [Builder.product] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.product] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun product(product: JsonField<String>) = apply {
                                this.product = product
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Breakdown].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Breakdown =
                                Breakdown(cost, product, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws TelnyxInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Breakdown = apply {
                            if (validated) {
                                return@apply
                            }

                            cost()
                            product()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (cost.asKnown().isPresent) 1 else 0) +
                                (if (product.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Breakdown &&
                                cost == other.cost &&
                                product == other.product &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(cost, product, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Breakdown{cost=$cost, product=$product, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnionMember0 &&
                            breakdown == other.breakdown &&
                            currency == other.currency &&
                            total == other.total &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(breakdown, currency, total, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UnionMember0{breakdown=$breakdown, currency=$currency, total=$total, additionalProperties=$additionalProperties}"
                }
            }

            class Recording
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val channels: JsonField<String>,
                private val downloadUrls: JsonField<DownloadUrls>,
                private val endTime: JsonField<OffsetDateTime>,
                private val format: JsonField<String>,
                private val startTime: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("channels")
                    @ExcludeMissing
                    channels: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("download_urls")
                    @ExcludeMissing
                    downloadUrls: JsonField<DownloadUrls> = JsonMissing.of(),
                    @JsonProperty("end_time")
                    @ExcludeMissing
                    endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("format")
                    @ExcludeMissing
                    format: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("start_time")
                    @ExcludeMissing
                    startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(id, channels, downloadUrls, endTime, format, startTime, mutableMapOf())

                /**
                 * Unique identifier of the recording.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * The recording channel configuration.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun channels(): Optional<String> = channels.getOptional("channels")

                /**
                 * Download URL per format. URLs are pre-signed and expire.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun downloadUrls(): Optional<DownloadUrls> =
                    downloadUrls.getOptional("download_urls")

                /**
                 * ISO 8601 datetime of when the recording ended.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

                /**
                 * The recording file format.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun format(): Optional<String> = format.getOptional("format")

                /**
                 * ISO 8601 datetime of when the recording started.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [channels].
                 *
                 * Unlike [channels], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("channels")
                @ExcludeMissing
                fun _channels(): JsonField<String> = channels

                /**
                 * Returns the raw JSON value of [downloadUrls].
                 *
                 * Unlike [downloadUrls], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("download_urls")
                @ExcludeMissing
                fun _downloadUrls(): JsonField<DownloadUrls> = downloadUrls

                /**
                 * Returns the raw JSON value of [endTime].
                 *
                 * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("end_time")
                @ExcludeMissing
                fun _endTime(): JsonField<OffsetDateTime> = endTime

                /**
                 * Returns the raw JSON value of [format].
                 *
                 * Unlike [format], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

                /**
                 * Returns the raw JSON value of [startTime].
                 *
                 * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("start_time")
                @ExcludeMissing
                fun _startTime(): JsonField<OffsetDateTime> = startTime

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

                    /** Returns a mutable builder for constructing an instance of [Recording]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Recording]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var channels: JsonField<String> = JsonMissing.of()
                    private var downloadUrls: JsonField<DownloadUrls> = JsonMissing.of()
                    private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var format: JsonField<String> = JsonMissing.of()
                    private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recording: Recording) = apply {
                        id = recording.id
                        channels = recording.channels
                        downloadUrls = recording.downloadUrls
                        endTime = recording.endTime
                        format = recording.format
                        startTime = recording.startTime
                        additionalProperties = recording.additionalProperties.toMutableMap()
                    }

                    /** Unique identifier of the recording. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The recording channel configuration. */
                    fun channels(channels: String) = channels(JsonField.of(channels))

                    /**
                     * Sets [Builder.channels] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channels] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun channels(channels: JsonField<String>) = apply { this.channels = channels }

                    /** Download URL per format. URLs are pre-signed and expire. */
                    fun downloadUrls(downloadUrls: DownloadUrls) =
                        downloadUrls(JsonField.of(downloadUrls))

                    /**
                     * Sets [Builder.downloadUrls] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.downloadUrls] with a well-typed
                     * [DownloadUrls] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun downloadUrls(downloadUrls: JsonField<DownloadUrls>) = apply {
                        this.downloadUrls = downloadUrls
                    }

                    /** ISO 8601 datetime of when the recording ended. */
                    fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

                    /**
                     * Sets [Builder.endTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun endTime(endTime: JsonField<OffsetDateTime>) = apply {
                        this.endTime = endTime
                    }

                    /** The recording file format. */
                    fun format(format: String) = format(JsonField.of(format))

                    /**
                     * Sets [Builder.format] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.format] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun format(format: JsonField<String>) = apply { this.format = format }

                    /** ISO 8601 datetime of when the recording started. */
                    fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

                    /**
                     * Sets [Builder.startTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startTime] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                        this.startTime = startTime
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
                     * Returns an immutable instance of [Recording].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Recording =
                        Recording(
                            id,
                            channels,
                            downloadUrls,
                            endTime,
                            format,
                            startTime,
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
                fun validate(): Recording = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    channels()
                    downloadUrls().ifPresent { it.validate() }
                    endTime()
                    format()
                    startTime()
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
                        (if (channels.asKnown().isPresent) 1 else 0) +
                        (downloadUrls.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (endTime.asKnown().isPresent) 1 else 0) +
                        (if (format.asKnown().isPresent) 1 else 0) +
                        (if (startTime.asKnown().isPresent) 1 else 0)

                /** Download URL per format. URLs are pre-signed and expire. */
                class DownloadUrls
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val mp3: JsonField<String>,
                    private val wav: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("mp3")
                        @ExcludeMissing
                        mp3: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("wav")
                        @ExcludeMissing
                        wav: JsonField<String> = JsonMissing.of(),
                    ) : this(mp3, wav, mutableMapOf())

                    /**
                     * Pre-signed URL for the mp3 recording file.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun mp3(): Optional<String> = mp3.getOptional("mp3")

                    /**
                     * Pre-signed URL for the wav recording file.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun wav(): Optional<String> = wav.getOptional("wav")

                    /**
                     * Returns the raw JSON value of [mp3].
                     *
                     * Unlike [mp3], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("mp3") @ExcludeMissing fun _mp3(): JsonField<String> = mp3

                    /**
                     * Returns the raw JSON value of [wav].
                     *
                     * Unlike [wav], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("wav") @ExcludeMissing fun _wav(): JsonField<String> = wav

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
                         * Returns a mutable builder for constructing an instance of [DownloadUrls].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [DownloadUrls]. */
                    class Builder internal constructor() {

                        private var mp3: JsonField<String> = JsonMissing.of()
                        private var wav: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(downloadUrls: DownloadUrls) = apply {
                            mp3 = downloadUrls.mp3
                            wav = downloadUrls.wav
                            additionalProperties = downloadUrls.additionalProperties.toMutableMap()
                        }

                        /** Pre-signed URL for the mp3 recording file. */
                        fun mp3(mp3: String) = mp3(JsonField.of(mp3))

                        /**
                         * Sets [Builder.mp3] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.mp3] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun mp3(mp3: JsonField<String>) = apply { this.mp3 = mp3 }

                        /** Pre-signed URL for the wav recording file. */
                        fun wav(wav: String) = wav(JsonField.of(wav))

                        /**
                         * Sets [Builder.wav] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.wav] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun wav(wav: JsonField<String>) = apply { this.wav = wav }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [DownloadUrls].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): DownloadUrls =
                            DownloadUrls(mp3, wav, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): DownloadUrls = apply {
                        if (validated) {
                            return@apply
                        }

                        mp3()
                        wav()
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
                        (if (mp3.asKnown().isPresent) 1 else 0) +
                            (if (wav.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DownloadUrls &&
                            mp3 == other.mp3 &&
                            wav == other.wav &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(mp3, wav, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DownloadUrls{mp3=$mp3, wav=$wav, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Recording &&
                        id == other.id &&
                        channels == other.channels &&
                        downloadUrls == other.downloadUrls &&
                        endTime == other.endTime &&
                        format == other.format &&
                        startTime == other.startTime &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        channels,
                        downloadUrls,
                        endTime,
                        format,
                        startTime,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Recording{id=$id, channels=$channels, downloadUrls=$downloadUrls, endTime=$endTime, format=$format, startTime=$startTime, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    assistantId == other.assistantId &&
                    callControlId == other.callControlId &&
                    callLegId == other.callLegId &&
                    callSessionId == other.callSessionId &&
                    clientState == other.clientState &&
                    connectionId == other.connectionId &&
                    conversationId == other.conversationId &&
                    conversationInsights == other.conversationInsights &&
                    cost == other.cost &&
                    durationSec == other.durationSec &&
                    from == other.from &&
                    llmModel == other.llmModel &&
                    reason == other.reason &&
                    recordings == other.recordings &&
                    sttModel == other.sttModel &&
                    to == other.to &&
                    ttsModelId == other.ttsModelId &&
                    ttsProvider == other.ttsProvider &&
                    ttsVoiceId == other.ttsVoiceId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    assistantId,
                    callControlId,
                    callLegId,
                    callSessionId,
                    clientState,
                    connectionId,
                    conversationId,
                    conversationInsights,
                    cost,
                    durationSec,
                    from,
                    llmModel,
                    reason,
                    recordings,
                    sttModel,
                    to,
                    ttsModelId,
                    ttsProvider,
                    ttsVoiceId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{assistantId=$assistantId, callControlId=$callControlId, callLegId=$callLegId, callSessionId=$callSessionId, clientState=$clientState, connectionId=$connectionId, conversationId=$conversationId, conversationInsights=$conversationInsights, cost=$cost, durationSec=$durationSec, from=$from, llmModel=$llmModel, reason=$reason, recordings=$recordings, sttModel=$sttModel, to=$to, ttsModelId=$ttsModelId, ttsProvider=$ttsProvider, ttsVoiceId=$ttsVoiceId, additionalProperties=$additionalProperties}"
        }

        /** Identifies the type of the resource. */
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

        return other is CallAnalyzedWebhookEvent &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallAnalyzedWebhookEvent{data=$data, additionalProperties=$additionalProperties}"
}
