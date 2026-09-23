// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailEventListResponse
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
         * Returns a mutable builder for constructing an instance of [EmailEventListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailEventListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailEventListResponse: EmailEventListResponse) = apply {
            data = emailEventListResponse.data.map { it.toMutableList() }
            meta = emailEventListResponse.meta
            additionalProperties = emailEventListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [EmailEventListResponse].
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
        fun build(): EmailEventListResponse =
            EmailEventListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("meta", meta),
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): EmailEventListResponse = apply {
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

    /**
     * An account-polling event. The envelope is webhook-shaped, but polling preserves stored-event
     * cardinality: queued, sending, sandbox, cancelled, and daily_limit_exceeded message events fan
     * out per recipient; scheduled remains one message-scoped row. Payload fields vary among
     * recipient-scoped, message-scoped, and minimal fallback rows.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val canonicalEventType: JsonField<String>,
        private val eventType: JsonField<String>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val payload: JsonField<Payload>,
        private val recipientId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("canonical_event_type")
            @ExcludeMissing
            canonicalEventType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occurred_at")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
            @JsonProperty("recipient_id")
            @ExcludeMissing
            recipientId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            canonicalEventType,
            eventType,
            occurredAt,
            payload,
            recipientId,
            mutableMapOf(),
        )

        /**
         * Event UUID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Additive canonical outcome name, prefixed with `email.`. Gateway rejection is
         * `email.gw_reject`, ambiguous injection timeout is `email.injection_timeout`, and MTA
         * expiration is `email.expired`. Unchanged outcomes retain their names. Existing stored
         * rows are translated only when recorded payload evidence proves the outcome; a legacy
         * failed row is not guessed or sharpened.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun canonicalEventType(): String = canonicalEventType.getRequired("canonical_event_type")

        /**
         * Legacy customer-visible event name, prefixed with `email.`. Gateway rejections render
         * `email.failed`; MTA expirations render `email.bounced`. Webhook subscription allowlists
         * match the legacy name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): String = eventType.getRequired("event_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurred_at")

        /**
         * Payload returned by GET /email_events. Every row includes id, status, and occurred_at.
         * Recipient-scoped rows also include recipient_id, from, subject, and exactly one
         * object-valued to, cc, or bcc field. Legacy or message-scoped rows can omit recipient_id
         * and use object-valued or string-valued to/cc fields, including an empty string when no
         * address exists; bcc is redacted. If the related message or recipient cannot be loaded,
         * the minimal fallback can omit from, subject, and recipient fields. Additional persisted
         * public evidence can be present.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payload(): Payload = payload.getRequired("payload")

        /**
         * Durable email recipient UUID. Present for recipient-scoped events, including each queued,
         * sending, sandbox, cancelled, and daily_limit_exceeded fan-out event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recipientId(): Optional<String> = recipientId.getOptional("recipient_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [canonicalEventType].
         *
         * Unlike [canonicalEventType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("canonical_event_type")
        @ExcludeMissing
        fun _canonicalEventType(): JsonField<String> = canonicalEventType

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

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
         * Returns the raw JSON value of [recipientId].
         *
         * Unlike [recipientId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recipient_id")
        @ExcludeMissing
        fun _recipientId(): JsonField<String> = recipientId

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
             * .canonicalEventType()
             * .eventType()
             * .occurredAt()
             * .payload()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var canonicalEventType: JsonField<String>? = null
            private var eventType: JsonField<String>? = null
            private var occurredAt: JsonField<OffsetDateTime>? = null
            private var payload: JsonField<Payload>? = null
            private var recipientId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                canonicalEventType = data.canonicalEventType
                eventType = data.eventType
                occurredAt = data.occurredAt
                payload = data.payload
                recipientId = data.recipientId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Event UUID. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Additive canonical outcome name, prefixed with `email.`. Gateway rejection is
             * `email.gw_reject`, ambiguous injection timeout is `email.injection_timeout`, and MTA
             * expiration is `email.expired`. Unchanged outcomes retain their names. Existing stored
             * rows are translated only when recorded payload evidence proves the outcome; a legacy
             * failed row is not guessed or sharpened.
             */
            fun canonicalEventType(canonicalEventType: String) =
                canonicalEventType(JsonField.of(canonicalEventType))

            /**
             * Sets [Builder.canonicalEventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canonicalEventType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canonicalEventType(canonicalEventType: JsonField<String>) = apply {
                this.canonicalEventType = canonicalEventType
            }

            /**
             * Legacy customer-visible event name, prefixed with `email.`. Gateway rejections render
             * `email.failed`; MTA expirations render `email.bounced`. Webhook subscription
             * allowlists match the legacy name.
             */
            fun eventType(eventType: String) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

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

            /**
             * Payload returned by GET /email_events. Every row includes id, status, and
             * occurred_at. Recipient-scoped rows also include recipient_id, from, subject, and
             * exactly one object-valued to, cc, or bcc field. Legacy or message-scoped rows can
             * omit recipient_id and use object-valued or string-valued to/cc fields, including an
             * empty string when no address exists; bcc is redacted. If the related message or
             * recipient cannot be loaded, the minimal fallback can omit from, subject, and
             * recipient fields. Additional persisted public evidence can be present.
             */
            fun payload(payload: Payload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

            /**
             * Durable email recipient UUID. Present for recipient-scoped events, including each
             * queued, sending, sandbox, cancelled, and daily_limit_exceeded fan-out event.
             */
            fun recipientId(recipientId: String) = recipientId(JsonField.of(recipientId))

            /**
             * Sets [Builder.recipientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientId(recipientId: JsonField<String>) = apply {
                this.recipientId = recipientId
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
             * .canonicalEventType()
             * .eventType()
             * .occurredAt()
             * .payload()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("canonicalEventType", canonicalEventType),
                    checkRequired("eventType", eventType),
                    checkRequired("occurredAt", occurredAt),
                    checkRequired("payload", payload),
                    recipientId,
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
            canonicalEventType()
            eventType()
            occurredAt()
            payload().validate()
            recipientId()
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
                (if (canonicalEventType.asKnown().isPresent) 1 else 0) +
                (if (eventType.asKnown().isPresent) 1 else 0) +
                (if (occurredAt.asKnown().isPresent) 1 else 0) +
                (payload.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recipientId.asKnown().isPresent) 1 else 0)

        /**
         * Payload returned by GET /email_events. Every row includes id, status, and occurred_at.
         * Recipient-scoped rows also include recipient_id, from, subject, and exactly one
         * object-valued to, cc, or bcc field. Legacy or message-scoped rows can omit recipient_id
         * and use object-valued or string-valued to/cc fields, including an empty string when no
         * address exists; bcc is redacted. If the related message or recipient cannot be loaded,
         * the minimal fallback can omit from, subject, and recipient fields. Additional persisted
         * public evidence can be present.
         */
        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val occurredAt: JsonField<OffsetDateTime>,
            private val status: JsonField<Status>,
            private val bcc: JsonField<Bcc>,
            private val cc: JsonField<Cc>,
            private val from: JsonField<From>,
            private val recipientId: JsonField<String>,
            private val subject: JsonField<String>,
            private val to: JsonField<To>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("occurred_at")
                @ExcludeMissing
                occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("bcc") @ExcludeMissing bcc: JsonField<Bcc> = JsonMissing.of(),
                @JsonProperty("cc") @ExcludeMissing cc: JsonField<Cc> = JsonMissing.of(),
                @JsonProperty("from") @ExcludeMissing from: JsonField<From> = JsonMissing.of(),
                @JsonProperty("recipient_id")
                @ExcludeMissing
                recipientId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subject")
                @ExcludeMissing
                subject: JsonField<String> = JsonMissing.of(),
                @JsonProperty("to") @ExcludeMissing to: JsonField<To> = JsonMissing.of(),
            ) : this(
                id,
                occurredAt,
                status,
                bcc,
                cc,
                from,
                recipientId,
                subject,
                to,
                mutableMapOf(),
            )

            /**
             * Email message UUID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurred_at")

            /**
             * Stored event outcome slug, not the authoritative recipient status. Account polling
             * returns the stored name, including suppression, scan, and quarantine lifecycle names.
             * Webhooks retain legacy payload names: gateway rejections use failed and MTA
             * expirations use bounced. New sharp stored rows can expose gw_reject,
             * injection_timeout, or expired. Use the envelope canonical_event_type to identify the
             * outcome across surfaces.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bcc(): Optional<Bcc> = bcc.getOptional("bcc")

            /**
             * Legacy message-scoped address, or an empty string when absent.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cc(): Optional<Cc> = cc.getOptional("cc")

            /**
             * Sender projection in account event polling. The display name is explicitly null when
             * the message has no sender name.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun from(): Optional<From> = from.getOptional("from")

            /**
             * Durable email recipient UUID. Present for recipient-scoped events.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recipientId(): Optional<String> = recipientId.getOptional("recipient_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subject(): Optional<String> = subject.getOptional("subject")

            /**
             * Legacy message-scoped address, or an empty string when absent.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun to(): Optional<To> = to.getOptional("to")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [occurredAt].
             *
             * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("occurred_at")
            @ExcludeMissing
            fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [bcc].
             *
             * Unlike [bcc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bcc") @ExcludeMissing fun _bcc(): JsonField<Bcc> = bcc

            /**
             * Returns the raw JSON value of [cc].
             *
             * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<Cc> = cc

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<From> = from

            /**
             * Returns the raw JSON value of [recipientId].
             *
             * Unlike [recipientId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recipient_id")
            @ExcludeMissing
            fun _recipientId(): JsonField<String> = recipientId

            /**
             * Returns the raw JSON value of [subject].
             *
             * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<To> = to

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
                 * .occurredAt()
                 * .status()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Payload]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var occurredAt: JsonField<OffsetDateTime>? = null
                private var status: JsonField<Status>? = null
                private var bcc: JsonField<Bcc> = JsonMissing.of()
                private var cc: JsonField<Cc> = JsonMissing.of()
                private var from: JsonField<From> = JsonMissing.of()
                private var recipientId: JsonField<String> = JsonMissing.of()
                private var subject: JsonField<String> = JsonMissing.of()
                private var to: JsonField<To> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    id = payload.id
                    occurredAt = payload.occurredAt
                    status = payload.status
                    bcc = payload.bcc
                    cc = payload.cc
                    from = payload.from
                    recipientId = payload.recipientId
                    subject = payload.subject
                    to = payload.to
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                /** Email message UUID. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

                /**
                 * Sets [Builder.occurredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                    this.occurredAt = occurredAt
                }

                /**
                 * Stored event outcome slug, not the authoritative recipient status. Account
                 * polling returns the stored name, including suppression, scan, and quarantine
                 * lifecycle names. Webhooks retain legacy payload names: gateway rejections use
                 * failed and MTA expirations use bounced. New sharp stored rows can expose
                 * gw_reject, injection_timeout, or expired. Use the envelope canonical_event_type
                 * to identify the outcome across surfaces.
                 */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun bcc(bcc: Bcc) = bcc(JsonField.of(bcc))

                /**
                 * Sets [Builder.bcc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bcc] with a well-typed [Bcc] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun bcc(bcc: JsonField<Bcc>) = apply { this.bcc = bcc }

                /**
                 * Alias for calling [bcc] with
                 * `Bcc.ofEmailWebhookRecipient(emailWebhookRecipient)`.
                 */
                fun bcc(emailWebhookRecipient: EmailWebhookRecipient) =
                    bcc(Bcc.ofEmailWebhookRecipient(emailWebhookRecipient))

                /** Alias for calling [bcc] with `Bcc.ofUnionMember1(unionMember1)`. */
                fun bcc(unionMember1: Bcc.UnionMember1) = bcc(Bcc.ofUnionMember1(unionMember1))

                /** Legacy message-scoped address, or an empty string when absent. */
                fun cc(cc: Cc) = cc(JsonField.of(cc))

                /**
                 * Sets [Builder.cc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cc] with a well-typed [Cc] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun cc(cc: JsonField<Cc>) = apply { this.cc = cc }

                /**
                 * Alias for calling [cc] with `Cc.ofEmailWebhookRecipient(emailWebhookRecipient)`.
                 */
                fun cc(emailWebhookRecipient: EmailWebhookRecipient) =
                    cc(Cc.ofEmailWebhookRecipient(emailWebhookRecipient))

                /** Alias for calling [cc] with `Cc.ofString(string)`. */
                fun cc(string: String) = cc(Cc.ofString(string))

                /**
                 * Sender projection in account event polling. The display name is explicitly null
                 * when the message has no sender name.
                 */
                fun from(from: From) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [From] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<From>) = apply { this.from = from }

                /** Durable email recipient UUID. Present for recipient-scoped events. */
                fun recipientId(recipientId: String) = recipientId(JsonField.of(recipientId))

                /**
                 * Sets [Builder.recipientId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recipientId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recipientId(recipientId: JsonField<String>) = apply {
                    this.recipientId = recipientId
                }

                fun subject(subject: String) = subject(JsonField.of(subject))

                /**
                 * Sets [Builder.subject] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subject] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subject(subject: JsonField<String>) = apply { this.subject = subject }

                /** Legacy message-scoped address, or an empty string when absent. */
                fun to(to: To) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [To] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun to(to: JsonField<To>) = apply { this.to = to }

                /**
                 * Alias for calling [to] with `To.ofEmailWebhookRecipient(emailWebhookRecipient)`.
                 */
                fun to(emailWebhookRecipient: EmailWebhookRecipient) =
                    to(To.ofEmailWebhookRecipient(emailWebhookRecipient))

                /** Alias for calling [to] with `To.ofString(string)`. */
                fun to(string: String) = to(To.ofString(string))

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
                 * .occurredAt()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Payload =
                    Payload(
                        checkRequired("id", id),
                        checkRequired("occurredAt", occurredAt),
                        checkRequired("status", status),
                        bcc,
                        cc,
                        from,
                        recipientId,
                        subject,
                        to,
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
                occurredAt()
                status().validate()
                bcc().ifPresent { it.validate() }
                cc().ifPresent { it.validate() }
                from().ifPresent { it.validate() }
                recipientId()
                subject()
                to().ifPresent { it.validate() }
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
                    (if (occurredAt.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (bcc.asKnown().getOrNull()?.validity() ?: 0) +
                    (cc.asKnown().getOrNull()?.validity() ?: 0) +
                    (from.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (recipientId.asKnown().isPresent) 1 else 0) +
                    (if (subject.asKnown().isPresent) 1 else 0) +
                    (to.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Stored event outcome slug, not the authoritative recipient status. Account polling
             * returns the stored name, including suppression, scan, and quarantine lifecycle names.
             * Webhooks retain legacy payload names: gateway rejections use failed and MTA
             * expirations use bounced. New sharp stored rows can expose gw_reject,
             * injection_timeout, or expired. Use the envelope canonical_event_type to identify the
             * outcome across surfaces.
             */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val QUEUED = of("queued")

                    @JvmField val DEFERRED = of("deferred")

                    @JvmField val SCHEDULED = of("scheduled")

                    @JvmField val CANCELLED = of("cancelled")

                    @JvmField val SANDBOX = of("sandbox")

                    @JvmField val SENDING = of("sending")

                    @JvmField val SENT = of("sent")

                    @JvmField val FAILED = of("failed")

                    @JvmField val DELIVERED = of("delivered")

                    @JvmField val BOUNCED = of("bounced")

                    @JvmField val COMPLAINED = of("complained")

                    @JvmField val SUPPRESSED = of("suppressed")

                    @JvmField val REJECTED = of("rejected")

                    @JvmField val OPENED = of("opened")

                    @JvmField val CLICKED = of("clicked")

                    @JvmField val UNSUBSCRIBED = of("unsubscribed")

                    @JvmField val DAILY_LIMIT_EXCEEDED = of("daily_limit_exceeded")

                    @JvmField val SCAN_DEFERRED = of("scan_deferred")

                    @JvmField val QUARANTINED = of("quarantined")

                    @JvmField val QUARANTINE_RELEASED = of("quarantine_released")

                    @JvmField
                    val QUARANTINE_RELEASE_DISPATCHED = of("quarantine_release_dispatched")

                    @JvmField val QUARANTINE_REJECTED = of("quarantine_rejected")

                    @JvmField val QUARANTINE_EXPIRED = of("quarantine_expired")

                    @JvmField val GW_REJECT = of("gw_reject")

                    @JvmField val INJECTION_TIMEOUT = of("injection_timeout")

                    @JvmField val EXPIRED = of("expired")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    QUEUED,
                    DEFERRED,
                    SCHEDULED,
                    CANCELLED,
                    SANDBOX,
                    SENDING,
                    SENT,
                    FAILED,
                    DELIVERED,
                    BOUNCED,
                    COMPLAINED,
                    SUPPRESSED,
                    REJECTED,
                    OPENED,
                    CLICKED,
                    UNSUBSCRIBED,
                    DAILY_LIMIT_EXCEEDED,
                    SCAN_DEFERRED,
                    QUARANTINED,
                    QUARANTINE_RELEASED,
                    QUARANTINE_RELEASE_DISPATCHED,
                    QUARANTINE_REJECTED,
                    QUARANTINE_EXPIRED,
                    GW_REJECT,
                    INJECTION_TIMEOUT,
                    EXPIRED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    QUEUED,
                    DEFERRED,
                    SCHEDULED,
                    CANCELLED,
                    SANDBOX,
                    SENDING,
                    SENT,
                    FAILED,
                    DELIVERED,
                    BOUNCED,
                    COMPLAINED,
                    SUPPRESSED,
                    REJECTED,
                    OPENED,
                    CLICKED,
                    UNSUBSCRIBED,
                    DAILY_LIMIT_EXCEEDED,
                    SCAN_DEFERRED,
                    QUARANTINED,
                    QUARANTINE_RELEASED,
                    QUARANTINE_RELEASE_DISPATCHED,
                    QUARANTINE_REJECTED,
                    QUARANTINE_EXPIRED,
                    GW_REJECT,
                    INJECTION_TIMEOUT,
                    EXPIRED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
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
                        QUEUED -> Value.QUEUED
                        DEFERRED -> Value.DEFERRED
                        SCHEDULED -> Value.SCHEDULED
                        CANCELLED -> Value.CANCELLED
                        SANDBOX -> Value.SANDBOX
                        SENDING -> Value.SENDING
                        SENT -> Value.SENT
                        FAILED -> Value.FAILED
                        DELIVERED -> Value.DELIVERED
                        BOUNCED -> Value.BOUNCED
                        COMPLAINED -> Value.COMPLAINED
                        SUPPRESSED -> Value.SUPPRESSED
                        REJECTED -> Value.REJECTED
                        OPENED -> Value.OPENED
                        CLICKED -> Value.CLICKED
                        UNSUBSCRIBED -> Value.UNSUBSCRIBED
                        DAILY_LIMIT_EXCEEDED -> Value.DAILY_LIMIT_EXCEEDED
                        SCAN_DEFERRED -> Value.SCAN_DEFERRED
                        QUARANTINED -> Value.QUARANTINED
                        QUARANTINE_RELEASED -> Value.QUARANTINE_RELEASED
                        QUARANTINE_RELEASE_DISPATCHED -> Value.QUARANTINE_RELEASE_DISPATCHED
                        QUARANTINE_REJECTED -> Value.QUARANTINE_REJECTED
                        QUARANTINE_EXPIRED -> Value.QUARANTINE_EXPIRED
                        GW_REJECT -> Value.GW_REJECT
                        INJECTION_TIMEOUT -> Value.INJECTION_TIMEOUT
                        EXPIRED -> Value.EXPIRED
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
                        QUEUED -> Known.QUEUED
                        DEFERRED -> Known.DEFERRED
                        SCHEDULED -> Known.SCHEDULED
                        CANCELLED -> Known.CANCELLED
                        SANDBOX -> Known.SANDBOX
                        SENDING -> Known.SENDING
                        SENT -> Known.SENT
                        FAILED -> Known.FAILED
                        DELIVERED -> Known.DELIVERED
                        BOUNCED -> Known.BOUNCED
                        COMPLAINED -> Known.COMPLAINED
                        SUPPRESSED -> Known.SUPPRESSED
                        REJECTED -> Known.REJECTED
                        OPENED -> Known.OPENED
                        CLICKED -> Known.CLICKED
                        UNSUBSCRIBED -> Known.UNSUBSCRIBED
                        DAILY_LIMIT_EXCEEDED -> Known.DAILY_LIMIT_EXCEEDED
                        SCAN_DEFERRED -> Known.SCAN_DEFERRED
                        QUARANTINED -> Known.QUARANTINED
                        QUARANTINE_RELEASED -> Known.QUARANTINE_RELEASED
                        QUARANTINE_RELEASE_DISPATCHED -> Known.QUARANTINE_RELEASE_DISPATCHED
                        QUARANTINE_REJECTED -> Known.QUARANTINE_REJECTED
                        QUARANTINE_EXPIRED -> Known.QUARANTINE_EXPIRED
                        GW_REJECT -> Known.GW_REJECT
                        INJECTION_TIMEOUT -> Known.INJECTION_TIMEOUT
                        EXPIRED -> Known.EXPIRED
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

            @JsonDeserialize(using = Bcc.Deserializer::class)
            @JsonSerialize(using = Bcc.Serializer::class)
            class Bcc
            private constructor(
                private val emailWebhookRecipient: EmailWebhookRecipient? = null,
                private val unionMember1: UnionMember1? = null,
                private val _json: JsonValue? = null,
            ) {

                fun emailWebhookRecipient(): Optional<EmailWebhookRecipient> =
                    Optional.ofNullable(emailWebhookRecipient)

                fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

                fun isEmailWebhookRecipient(): Boolean = emailWebhookRecipient != null

                fun isUnionMember1(): Boolean = unionMember1 != null

                fun asEmailWebhookRecipient(): EmailWebhookRecipient =
                    emailWebhookRecipient.getOrThrow("emailWebhookRecipient")

                fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

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
                 * Optional<String> result = bcc.accept(new Bcc.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitEmailWebhookRecipient(EmailWebhookRecipient emailWebhookRecipient) {
                 *         return Optional.of(emailWebhookRecipient.toString());
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
                        emailWebhookRecipient != null ->
                            visitor.visitEmailWebhookRecipient(emailWebhookRecipient)
                        unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
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
                fun validate(): Bcc = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitEmailWebhookRecipient(
                                emailWebhookRecipient: EmailWebhookRecipient
                            ) {
                                emailWebhookRecipient.validate()
                            }

                            override fun visitUnionMember1(unionMember1: UnionMember1) {
                                unionMember1.validate()
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
                            override fun visitEmailWebhookRecipient(
                                emailWebhookRecipient: EmailWebhookRecipient
                            ) = emailWebhookRecipient.validity()

                            override fun visitUnionMember1(unionMember1: UnionMember1) =
                                unionMember1.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Bcc &&
                        emailWebhookRecipient == other.emailWebhookRecipient &&
                        unionMember1 == other.unionMember1
                }

                override fun hashCode(): Int = Objects.hash(emailWebhookRecipient, unionMember1)

                override fun toString(): String =
                    when {
                        emailWebhookRecipient != null ->
                            "Bcc{emailWebhookRecipient=$emailWebhookRecipient}"
                        unionMember1 != null -> "Bcc{unionMember1=$unionMember1}"
                        _json != null -> "Bcc{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Bcc")
                    }

                companion object {

                    @JvmStatic
                    fun ofEmailWebhookRecipient(emailWebhookRecipient: EmailWebhookRecipient) =
                        Bcc(emailWebhookRecipient = emailWebhookRecipient)

                    @JvmStatic
                    fun ofUnionMember1(unionMember1: UnionMember1) =
                        Bcc(unionMember1 = unionMember1)
                }

                /**
                 * An interface that defines how to map each variant of [Bcc] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitEmailWebhookRecipient(emailWebhookRecipient: EmailWebhookRecipient): T

                    fun visitUnionMember1(unionMember1: UnionMember1): T

                    /**
                     * Maps an unknown variant of [Bcc] to a value of type [T].
                     *
                     * An instance of [Bcc] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown Bcc: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Bcc>(Bcc::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Bcc {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<EmailWebhookRecipient>())
                                        ?.let { Bcc(emailWebhookRecipient = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                        Bcc(unionMember1 = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Bcc(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Bcc>(Bcc::class) {

                    override fun serialize(
                        value: Bcc,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.emailWebhookRecipient != null ->
                                generator.writeObject(value.emailWebhookRecipient)
                            value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Bcc")
                        }
                    }
                }

                class UnionMember1
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val REDACTED = of("redacted")

                        @JvmStatic fun of(value: String) = UnionMember1(JsonField.of(value))
                    }

                    /** An enum containing [UnionMember1]'s known values. */
                    enum class Known {
                        REDACTED
                    }

                    /**
                     * An enum containing [UnionMember1]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [UnionMember1] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        REDACTED,
                        /**
                         * An enum member indicating that [UnionMember1] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            REDACTED -> Value.REDACTED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            REDACTED -> Known.REDACTED
                            else -> throw TelnyxInvalidDataException("Unknown UnionMember1: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
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
                    fun validate(): UnionMember1 = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnionMember1 && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }
            }

            /** Legacy message-scoped address, or an empty string when absent. */
            @JsonDeserialize(using = Cc.Deserializer::class)
            @JsonSerialize(using = Cc.Serializer::class)
            class Cc
            private constructor(
                private val emailWebhookRecipient: EmailWebhookRecipient? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun emailWebhookRecipient(): Optional<EmailWebhookRecipient> =
                    Optional.ofNullable(emailWebhookRecipient)

                /** Legacy message-scoped address, or an empty string when absent. */
                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isEmailWebhookRecipient(): Boolean = emailWebhookRecipient != null

                fun isString(): Boolean = string != null

                fun asEmailWebhookRecipient(): EmailWebhookRecipient =
                    emailWebhookRecipient.getOrThrow("emailWebhookRecipient")

                /** Legacy message-scoped address, or an empty string when absent. */
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
                 * Optional<String> result = cc.accept(new Cc.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitEmailWebhookRecipient(EmailWebhookRecipient emailWebhookRecipient) {
                 *         return Optional.of(emailWebhookRecipient.toString());
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
                        emailWebhookRecipient != null ->
                            visitor.visitEmailWebhookRecipient(emailWebhookRecipient)
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
                fun validate(): Cc = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitEmailWebhookRecipient(
                                emailWebhookRecipient: EmailWebhookRecipient
                            ) {
                                emailWebhookRecipient.validate()
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
                            override fun visitEmailWebhookRecipient(
                                emailWebhookRecipient: EmailWebhookRecipient
                            ) = emailWebhookRecipient.validity()

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cc &&
                        emailWebhookRecipient == other.emailWebhookRecipient &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(emailWebhookRecipient, string)

                override fun toString(): String =
                    when {
                        emailWebhookRecipient != null ->
                            "Cc{emailWebhookRecipient=$emailWebhookRecipient}"
                        string != null -> "Cc{string=$string}"
                        _json != null -> "Cc{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Cc")
                    }

                companion object {

                    @JvmStatic
                    fun ofEmailWebhookRecipient(emailWebhookRecipient: EmailWebhookRecipient) =
                        Cc(emailWebhookRecipient = emailWebhookRecipient)

                    /** Legacy message-scoped address, or an empty string when absent. */
                    @JvmStatic fun ofString(string: String) = Cc(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [Cc] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitEmailWebhookRecipient(emailWebhookRecipient: EmailWebhookRecipient): T

                    /** Legacy message-scoped address, or an empty string when absent. */
                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [Cc] to a value of type [T].
                     *
                     * An instance of [Cc] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown Cc: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Cc>(Cc::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Cc {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<EmailWebhookRecipient>())
                                        ?.let { Cc(emailWebhookRecipient = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Cc(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Cc(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Cc>(Cc::class) {

                    override fun serialize(
                        value: Cc,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.emailWebhookRecipient != null ->
                                generator.writeObject(value.emailWebhookRecipient)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Cc")
                        }
                    }
                }
            }

            /**
             * Sender projection in account event polling. The display name is explicitly null when
             * the message has no sender name.
             */
            class From
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val email: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(email, name, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun email(): String = email.getRequired("email")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                     * .email()
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [From]. */
                class Builder internal constructor() {

                    private var email: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(from: From) = apply {
                        email = from.email
                        name = from.name
                        additionalProperties = from.additionalProperties.toMutableMap()
                    }

                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                     * .email()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): From =
                        From(
                            checkRequired("email", email),
                            checkRequired("name", name),
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

                    email()
                    name()
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
                    (if (email.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is From &&
                        email == other.email &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(email, name, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "From{email=$email, name=$name, additionalProperties=$additionalProperties}"
            }

            /** Legacy message-scoped address, or an empty string when absent. */
            @JsonDeserialize(using = To.Deserializer::class)
            @JsonSerialize(using = To.Serializer::class)
            class To
            private constructor(
                private val emailWebhookRecipient: EmailWebhookRecipient? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun emailWebhookRecipient(): Optional<EmailWebhookRecipient> =
                    Optional.ofNullable(emailWebhookRecipient)

                /** Legacy message-scoped address, or an empty string when absent. */
                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isEmailWebhookRecipient(): Boolean = emailWebhookRecipient != null

                fun isString(): Boolean = string != null

                fun asEmailWebhookRecipient(): EmailWebhookRecipient =
                    emailWebhookRecipient.getOrThrow("emailWebhookRecipient")

                /** Legacy message-scoped address, or an empty string when absent. */
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
                 * Optional<String> result = to.accept(new To.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitEmailWebhookRecipient(EmailWebhookRecipient emailWebhookRecipient) {
                 *         return Optional.of(emailWebhookRecipient.toString());
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
                        emailWebhookRecipient != null ->
                            visitor.visitEmailWebhookRecipient(emailWebhookRecipient)
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
                fun validate(): To = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitEmailWebhookRecipient(
                                emailWebhookRecipient: EmailWebhookRecipient
                            ) {
                                emailWebhookRecipient.validate()
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
                            override fun visitEmailWebhookRecipient(
                                emailWebhookRecipient: EmailWebhookRecipient
                            ) = emailWebhookRecipient.validity()

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is To &&
                        emailWebhookRecipient == other.emailWebhookRecipient &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(emailWebhookRecipient, string)

                override fun toString(): String =
                    when {
                        emailWebhookRecipient != null ->
                            "To{emailWebhookRecipient=$emailWebhookRecipient}"
                        string != null -> "To{string=$string}"
                        _json != null -> "To{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid To")
                    }

                companion object {

                    @JvmStatic
                    fun ofEmailWebhookRecipient(emailWebhookRecipient: EmailWebhookRecipient) =
                        To(emailWebhookRecipient = emailWebhookRecipient)

                    /** Legacy message-scoped address, or an empty string when absent. */
                    @JvmStatic fun ofString(string: String) = To(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [To] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitEmailWebhookRecipient(emailWebhookRecipient: EmailWebhookRecipient): T

                    /** Legacy message-scoped address, or an empty string when absent. */
                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [To] to a value of type [T].
                     *
                     * An instance of [To] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown To: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<To>(To::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): To {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<EmailWebhookRecipient>())
                                        ?.let { To(emailWebhookRecipient = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        To(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> To(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<To>(To::class) {

                    override fun serialize(
                        value: To,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.emailWebhookRecipient != null ->
                                generator.writeObject(value.emailWebhookRecipient)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid To")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    id == other.id &&
                    occurredAt == other.occurredAt &&
                    status == other.status &&
                    bcc == other.bcc &&
                    cc == other.cc &&
                    from == other.from &&
                    recipientId == other.recipientId &&
                    subject == other.subject &&
                    to == other.to &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    occurredAt,
                    status,
                    bcc,
                    cc,
                    from,
                    recipientId,
                    subject,
                    to,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{id=$id, occurredAt=$occurredAt, status=$status, bcc=$bcc, cc=$cc, from=$from, recipientId=$recipientId, subject=$subject, to=$to, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                canonicalEventType == other.canonicalEventType &&
                eventType == other.eventType &&
                occurredAt == other.occurredAt &&
                payload == other.payload &&
                recipientId == other.recipientId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                canonicalEventType,
                eventType,
                occurredAt,
                payload,
                recipientId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, canonicalEventType=$canonicalEventType, eventType=$eventType, occurredAt=$occurredAt, payload=$payload, recipientId=$recipientId, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pageSize: JsonField<Long>,
        private val timeRange: JsonField<TimeRange>,
        private val pageCursor: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_range")
            @ExcludeMissing
            timeRange: JsonField<TimeRange> = JsonMissing.of(),
            @JsonProperty("page_cursor")
            @ExcludeMissing
            pageCursor: JsonField<String> = JsonMissing.of(),
        ) : this(pageSize, timeRange, pageCursor, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pageSize(): Long = pageSize.getRequired("page_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeRange(): TimeRange = timeRange.getRequired("time_range")

        /**
         * Cursor for the next page, when more results are available.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageCursor(): Optional<String> = pageCursor.getOptional("page_cursor")

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [timeRange].
         *
         * Unlike [timeRange], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("time_range")
        @ExcludeMissing
        fun _timeRange(): JsonField<TimeRange> = timeRange

        /**
         * Returns the raw JSON value of [pageCursor].
         *
         * Unlike [pageCursor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_cursor")
        @ExcludeMissing
        fun _pageCursor(): JsonField<String> = pageCursor

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
             * Returns a mutable builder for constructing an instance of [Meta].
             *
             * The following fields are required:
             * ```java
             * .pageSize()
             * .timeRange()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var pageSize: JsonField<Long>? = null
            private var timeRange: JsonField<TimeRange>? = null
            private var pageCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                pageSize = meta.pageSize
                timeRange = meta.timeRange
                pageCursor = meta.pageCursor
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun timeRange(timeRange: TimeRange) = timeRange(JsonField.of(timeRange))

            /**
             * Sets [Builder.timeRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeRange] with a well-typed [TimeRange] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeRange(timeRange: JsonField<TimeRange>) = apply { this.timeRange = timeRange }

            /** Cursor for the next page, when more results are available. */
            fun pageCursor(pageCursor: String) = pageCursor(JsonField.of(pageCursor))

            /**
             * Sets [Builder.pageCursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageCursor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageCursor(pageCursor: JsonField<String>) = apply { this.pageCursor = pageCursor }

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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pageSize()
             * .timeRange()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("pageSize", pageSize),
                    checkRequired("timeRange", timeRange),
                    pageCursor,
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
        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            pageSize()
            timeRange().validate()
            pageCursor()
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
            (if (pageSize.asKnown().isPresent) 1 else 0) +
                (timeRange.asKnown().getOrNull()?.validity() ?: 0) +
                (if (pageCursor.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                pageSize == other.pageSize &&
                timeRange == other.timeRange &&
                pageCursor == other.pageCursor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pageSize, timeRange, pageCursor, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{pageSize=$pageSize, timeRange=$timeRange, pageCursor=$pageCursor, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailEventListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailEventListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
