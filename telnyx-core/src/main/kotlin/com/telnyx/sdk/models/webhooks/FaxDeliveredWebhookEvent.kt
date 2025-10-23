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
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FaxDeliveredWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val eventType: JsonField<EventType>,
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
        @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
    ) : this(id, eventType, payload, recordType, mutableMapOf())

    /**
     * Identifies the type of resource.
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
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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

        /** Returns a mutable builder for constructing an instance of [FaxDeliveredWebhookEvent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FaxDeliveredWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var payload: JsonField<Payload> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(faxDeliveredWebhookEvent: FaxDeliveredWebhookEvent) = apply {
            id = faxDeliveredWebhookEvent.id
            eventType = faxDeliveredWebhookEvent.eventType
            payload = faxDeliveredWebhookEvent.payload
            recordType = faxDeliveredWebhookEvent.recordType
            additionalProperties = faxDeliveredWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Identifies the type of resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The type of event being delivered. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun payload(payload: Payload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [Payload] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

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
         * Returns an immutable instance of [FaxDeliveredWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FaxDeliveredWebhookEvent =
            FaxDeliveredWebhookEvent(
                id,
                eventType,
                payload,
                recordType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FaxDeliveredWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        eventType().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (payload.asKnown().getOrNull()?.validity() ?: 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0)

    /** The type of event being delivered. */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FAX_DELIVERED = of("fax.delivered")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            FAX_DELIVERED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAX_DELIVERED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FAX_DELIVERED -> Value.FAX_DELIVERED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FAX_DELIVERED -> Known.FAX_DELIVERED
                else -> throw TelnyxInvalidDataException("Unknown EventType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

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
        private val callDurationSecs: JsonField<Long>,
        private val clientState: JsonField<String>,
        private val connectionId: JsonField<String>,
        private val direction: JsonField<Direction>,
        private val faxId: JsonField<String>,
        private val from: JsonField<String>,
        private val mediaName: JsonField<String>,
        private val originalMediaUrl: JsonField<String>,
        private val pageCount: JsonField<Long>,
        private val status: JsonField<Status>,
        private val to: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_duration_secs")
            @ExcludeMissing
            callDurationSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("fax_id") @ExcludeMissing faxId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("media_name")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("original_media_url")
            @ExcludeMissing
            originalMediaUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page_count")
            @ExcludeMissing
            pageCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(
            callDurationSecs,
            clientState,
            connectionId,
            direction,
            faxId,
            from,
            mediaName,
            originalMediaUrl,
            pageCount,
            status,
            to,
            userId,
            mutableMapOf(),
        )

        /**
         * The duration of the call in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callDurationSecs(): Optional<Long> = callDurationSecs.getOptional("call_duration_secs")

        /**
         * State received from a command.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * The ID of the connection used to send the fax.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * The direction of the fax.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun direction(): Optional<Direction> = direction.getOptional("direction")

        /**
         * Identifies the fax.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun faxId(): Optional<String> = faxId.getOptional("fax_id")

        /**
         * The phone number, in E.164 format, the fax will be sent from.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<String> = from.getOptional("from")

        /**
         * The media_name used for the fax's media. Must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. media_name and media_url/contents
         * can't be submitted together.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

        /**
         * The original URL to the PDF used for the fax's media. If media_name was supplied, this is
         * omitted
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun originalMediaUrl(): Optional<String> =
            originalMediaUrl.getOptional("original_media_url")

        /**
         * Number of transferred pages
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageCount(): Optional<Long> = pageCount.getOptional("page_count")

        /**
         * The status of the fax.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * The phone number, in E.164 format, the fax will be sent to or SIP URI
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<String> = to.getOptional("to")

        /**
         * Identifier of the user to whom the fax belongs
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Returns the raw JSON value of [callDurationSecs].
         *
         * Unlike [callDurationSecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_duration_secs")
        @ExcludeMissing
        fun _callDurationSecs(): JsonField<Long> = callDurationSecs

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [faxId].
         *
         * Unlike [faxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fax_id") @ExcludeMissing fun _faxId(): JsonField<String> = faxId

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [mediaName].
         *
         * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media_name") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

        /**
         * Returns the raw JSON value of [originalMediaUrl].
         *
         * Unlike [originalMediaUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("original_media_url")
        @ExcludeMissing
        fun _originalMediaUrl(): JsonField<String> = originalMediaUrl

        /**
         * Returns the raw JSON value of [pageCount].
         *
         * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_count") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

            private var callDurationSecs: JsonField<Long> = JsonMissing.of()
            private var clientState: JsonField<String> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var faxId: JsonField<String> = JsonMissing.of()
            private var from: JsonField<String> = JsonMissing.of()
            private var mediaName: JsonField<String> = JsonMissing.of()
            private var originalMediaUrl: JsonField<String> = JsonMissing.of()
            private var pageCount: JsonField<Long> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var to: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                callDurationSecs = payload.callDurationSecs
                clientState = payload.clientState
                connectionId = payload.connectionId
                direction = payload.direction
                faxId = payload.faxId
                from = payload.from
                mediaName = payload.mediaName
                originalMediaUrl = payload.originalMediaUrl
                pageCount = payload.pageCount
                status = payload.status
                to = payload.to
                userId = payload.userId
                additionalProperties = payload.additionalProperties.toMutableMap()
            }

            /** The duration of the call in seconds. */
            fun callDurationSecs(callDurationSecs: Long) =
                callDurationSecs(JsonField.of(callDurationSecs))

            /**
             * Sets [Builder.callDurationSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callDurationSecs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callDurationSecs(callDurationSecs: JsonField<Long>) = apply {
                this.callDurationSecs = callDurationSecs
            }

            /** State received from a command. */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
            }

            /** The ID of the connection used to send the fax. */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** The direction of the fax. */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /** Identifies the fax. */
            fun faxId(faxId: String) = faxId(JsonField.of(faxId))

            /**
             * Sets [Builder.faxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.faxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun faxId(faxId: JsonField<String>) = apply { this.faxId = faxId }

            /** The phone number, in E.164 format, the fax will be sent from. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /**
             * The media_name used for the fax's media. Must point to a file previously uploaded to
             * api.telnyx.com/v2/media by the same user/organization. media_name and
             * media_url/contents can't be submitted together.
             */
            fun mediaName(mediaName: String) = mediaName(JsonField.of(mediaName))

            /**
             * Sets [Builder.mediaName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaName(mediaName: JsonField<String>) = apply { this.mediaName = mediaName }

            /**
             * The original URL to the PDF used for the fax's media. If media_name was supplied,
             * this is omitted
             */
            fun originalMediaUrl(originalMediaUrl: String) =
                originalMediaUrl(JsonField.of(originalMediaUrl))

            /**
             * Sets [Builder.originalMediaUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originalMediaUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originalMediaUrl(originalMediaUrl: JsonField<String>) = apply {
                this.originalMediaUrl = originalMediaUrl
            }

            /** Number of transferred pages */
            fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

            /**
             * Sets [Builder.pageCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

            /** The status of the fax. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The phone number, in E.164 format, the fax will be sent to or SIP URI */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /** Identifier of the user to whom the fax belongs */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * Returns an immutable instance of [Payload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Payload =
                Payload(
                    callDurationSecs,
                    clientState,
                    connectionId,
                    direction,
                    faxId,
                    from,
                    mediaName,
                    originalMediaUrl,
                    pageCount,
                    status,
                    to,
                    userId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

            callDurationSecs()
            clientState()
            connectionId()
            direction().ifPresent { it.validate() }
            faxId()
            from()
            mediaName()
            originalMediaUrl()
            pageCount()
            status().ifPresent { it.validate() }
            to()
            userId()
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
            (if (callDurationSecs.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (faxId.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (if (mediaName.asKnown().isPresent) 1 else 0) +
                (if (originalMediaUrl.asKnown().isPresent) 1 else 0) +
                (if (pageCount.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        /** The direction of the fax. */
        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val INBOUND = of("inbound")

                @JvmField val OUTBOUND = of("outbound")

                @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
            }

            /** An enum containing [Direction]'s known values. */
            enum class Known {
                INBOUND,
                OUTBOUND,
            }

            /**
             * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Direction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INBOUND,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INBOUND -> Value.INBOUND
                    OUTBOUND -> Value.OUTBOUND
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
                    INBOUND -> Known.INBOUND
                    OUTBOUND -> Known.OUTBOUND
                    else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
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

        /** The status of the fax. */
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

                @JvmField val DELIVERED = of("delivered")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                DELIVERED
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
                DELIVERED,
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
                    DELIVERED -> Value.DELIVERED
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
                    DELIVERED -> Known.DELIVERED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload &&
                callDurationSecs == other.callDurationSecs &&
                clientState == other.clientState &&
                connectionId == other.connectionId &&
                direction == other.direction &&
                faxId == other.faxId &&
                from == other.from &&
                mediaName == other.mediaName &&
                originalMediaUrl == other.originalMediaUrl &&
                pageCount == other.pageCount &&
                status == other.status &&
                to == other.to &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callDurationSecs,
                clientState,
                connectionId,
                direction,
                faxId,
                from,
                mediaName,
                originalMediaUrl,
                pageCount,
                status,
                to,
                userId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payload{callDurationSecs=$callDurationSecs, clientState=$clientState, connectionId=$connectionId, direction=$direction, faxId=$faxId, from=$from, mediaName=$mediaName, originalMediaUrl=$originalMediaUrl, pageCount=$pageCount, status=$status, to=$to, userId=$userId, additionalProperties=$additionalProperties}"
    }

    /** Identifies the type of the resource. */
    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EVENT,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EVENT -> Value.EVENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

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

        return other is FaxDeliveredWebhookEvent &&
            id == other.id &&
            eventType == other.eventType &&
            payload == other.payload &&
            recordType == other.recordType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, eventType, payload, recordType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FaxDeliveredWebhookEvent{id=$id, eventType=$eventType, payload=$payload, recordType=$recordType, additionalProperties=$additionalProperties}"
}
