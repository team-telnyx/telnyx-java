// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.emailevents.EmailEventType
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * An event on the per-message events endpoint. The legacy event_type and additive
 * canonical_event_type are email.-prefixed. The deprecated type preserves the bare stored event
 * name for compatibility.
 */
class MessageEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val canonicalEventType: JsonField<String>,
    private val eventType: JsonField<String>,
    private val occurredAt: JsonField<OffsetDateTime>,
    private val type: JsonField<EmailEventType>,
    private val payload: JsonField<Payload>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("canonical_event_type")
        @ExcludeMissing
        canonicalEventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occurred_at")
        @ExcludeMissing
        occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<EmailEventType> = JsonMissing.of(),
        @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
    ) : this(canonicalEventType, eventType, occurredAt, type, payload, mutableMapOf())

    /**
     * Additive canonical outcome name, prefixed with `email.`. Gateway rejection is
     * `email.gw_reject`, ambiguous injection timeout is `email.injection_timeout`, and MTA
     * expiration is `email.expired`. Unchanged outcomes retain their names. Existing stored rows
     * are translated only when recorded payload evidence proves the outcome; a legacy failed row is
     * not guessed or sharpened.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canonicalEventType(): String = canonicalEventType.getRequired("canonical_event_type")

    /**
     * Legacy customer-visible event name, prefixed with `email.`. Gateway rejections render
     * `email.failed`; MTA expirations render `email.bounced`. Webhook subscription allowlists match
     * the legacy name.
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
     * Bare stored event names returned by message history. In addition to the normal send and
     * delivery lifecycle, polling can expose suppression, scan, and quarantine lifecycle rows.
     * Sharp canonical names gw_reject, injection_timeout, and expired distinguish gateway
     * rejection, ambiguous injection timeout, and MTA expiration. The failed and bounced names
     * remain valid for system/admin failures and hard bounces respectively. Existing stored rows
     * retain their original names.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun type(): EmailEventType = type.getRequired("type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payload(): Optional<Payload> = payload.getOptional("payload")

    /**
     * Returns the raw JSON value of [canonicalEventType].
     *
     * Unlike [canonicalEventType], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<EmailEventType> = type

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

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
         * Returns a mutable builder for constructing an instance of [MessageEvent].
         *
         * The following fields are required:
         * ```java
         * .canonicalEventType()
         * .eventType()
         * .occurredAt()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageEvent]. */
    class Builder internal constructor() {

        private var canonicalEventType: JsonField<String>? = null
        private var eventType: JsonField<String>? = null
        private var occurredAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<EmailEventType>? = null
        private var payload: JsonField<Payload> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageEvent: MessageEvent) = apply {
            canonicalEventType = messageEvent.canonicalEventType
            eventType = messageEvent.eventType
            occurredAt = messageEvent.occurredAt
            type = messageEvent.type
            payload = messageEvent.payload
            additionalProperties = messageEvent.additionalProperties.toMutableMap()
        }

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
         * `email.failed`; MTA expirations render `email.bounced`. Webhook subscription allowlists
         * match the legacy name.
         */
        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Bare stored event names returned by message history. In addition to the normal send and
         * delivery lifecycle, polling can expose suppression, scan, and quarantine lifecycle rows.
         * Sharp canonical names gw_reject, injection_timeout, and expired distinguish gateway
         * rejection, ambiguous injection timeout, and MTA expiration. The failed and bounced names
         * remain valid for system/admin failures and hard bounces respectively. Existing stored
         * rows retain their original names.
         */
        @Deprecated("deprecated") fun type(type: EmailEventType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [EmailEventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun type(type: JsonField<EmailEventType>) = apply { this.type = type }

        fun payload(payload: Payload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [Payload] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

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
         * Returns an immutable instance of [MessageEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .canonicalEventType()
         * .eventType()
         * .occurredAt()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageEvent =
            MessageEvent(
                checkRequired("canonicalEventType", canonicalEventType),
                checkRequired("eventType", eventType),
                checkRequired("occurredAt", occurredAt),
                checkRequired("type", type),
                payload,
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
    fun validate(): MessageEvent = apply {
        if (validated) {
            return@apply
        }

        canonicalEventType()
        eventType()
        occurredAt()
        type().validate()
        payload().ifPresent { it.validate() }
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
        (if (canonicalEventType.asKnown().isPresent) 1 else 0) +
            (if (eventType.asKnown().isPresent) 1 else 0) +
            (if (occurredAt.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (payload.asKnown().getOrNull()?.validity() ?: 0)

    class Payload
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Payload]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payload]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                additionalProperties = payload.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Payload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Payload = Payload(additionalProperties.toImmutable())
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
        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Payload{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageEvent &&
            canonicalEventType == other.canonicalEventType &&
            eventType == other.eventType &&
            occurredAt == other.occurredAt &&
            type == other.type &&
            payload == other.payload &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(canonicalEventType, eventType, occurredAt, type, payload, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageEvent{canonicalEventType=$canonicalEventType, eventType=$eventType, occurredAt=$occurredAt, type=$type, payload=$payload, additionalProperties=$additionalProperties}"
}
