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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumberOrderStatusUpdateWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

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
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of
         * [NumberOrderStatusUpdateWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberOrderStatusUpdateWebhookEvent]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            numberOrderStatusUpdateWebhookEvent: NumberOrderStatusUpdateWebhookEvent
        ) = apply {
            data = numberOrderStatusUpdateWebhookEvent.data
            meta = numberOrderStatusUpdateWebhookEvent.meta
            additionalProperties =
                numberOrderStatusUpdateWebhookEvent.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [NumberOrderStatusUpdateWebhookEvent].
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
        fun build(): NumberOrderStatusUpdateWebhookEvent =
            NumberOrderStatusUpdateWebhookEvent(
                checkRequired("data", data),
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
    fun validate(): NumberOrderStatusUpdateWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val eventType: JsonField<String>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val payload: JsonField<Payload>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occurred_at")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(id, eventType, occurredAt, payload, recordType, mutableMapOf())

        /**
         * Unique identifier for the event
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The type of event being sent
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): String = eventType.getRequired("event_type")

        /**
         * ISO 8601 timestamp of when the event occurred
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurred_at")

        /**
         * Number order data delivered in a webhook. Server-generated fields are valid in this
         * outbound webhook request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payload(): Payload = payload.getRequired("payload")

        /**
         * Type of record
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

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
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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
            private var eventType: JsonField<String>? = null
            private var occurredAt: JsonField<OffsetDateTime>? = null
            private var payload: JsonField<Payload>? = null
            private var recordType: JsonField<String>? = null
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

            /** Unique identifier for the event */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The type of event being sent */
            fun eventType(eventType: String) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

            /** ISO 8601 timestamp of when the event occurred */
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
             * Number order data delivered in a webhook. Server-generated fields are valid in this
             * outbound webhook request.
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

            /** Type of record */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
            eventType()
            occurredAt()
            payload().validate()
            recordType()
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
                (if (eventType.asKnown().isPresent) 1 else 0) +
                (if (occurredAt.asKnown().isPresent) 1 else 0) +
                (payload.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        /**
         * Number order data delivered in a webhook. Server-generated fields are valid in this
         * outbound webhook request.
         */
        class Payload
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val billingGroupId: JsonField<String>,
            private val connectionId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val customerReference: JsonField<String>,
            private val messagingProfileId: JsonField<String>,
            private val phoneNumbers: JsonField<List<PhoneNumber>>,
            private val phoneNumbersCount: JsonField<Long>,
            private val recordType: JsonField<String>,
            private val requirementsMet: JsonField<Boolean>,
            private val status: JsonField<Status>,
            private val subNumberOrdersIds: JsonField<List<String>>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billing_group_id")
                @ExcludeMissing
                billingGroupId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("connection_id")
                @ExcludeMissing
                connectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("customer_reference")
                @ExcludeMissing
                customerReference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("messaging_profile_id")
                @ExcludeMissing
                messagingProfileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_numbers")
                @ExcludeMissing
                phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
                @JsonProperty("phone_numbers_count")
                @ExcludeMissing
                phoneNumbersCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("requirements_met")
                @ExcludeMissing
                requirementsMet: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("sub_number_orders_ids")
                @ExcludeMissing
                subNumberOrdersIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                id,
                billingGroupId,
                connectionId,
                createdAt,
                customerReference,
                messagingProfileId,
                phoneNumbers,
                phoneNumbersCount,
                recordType,
                requirementsMet,
                status,
                subNumberOrdersIds,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Identifies the messaging profile associated with the phone number.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

            /**
             * Identifies the connection associated with this phone number.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

            /**
             * An ISO 8901 datetime string denoting when the number order was created.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * A customer reference string for customer look ups.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customerReference(): Optional<String> =
                customerReference.getOptional("customer_reference")

            /**
             * Identifies the messaging profile associated with the phone number.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun messagingProfileId(): Optional<String> =
                messagingProfileId.getOptional("messaging_profile_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumbers(): Optional<List<PhoneNumber>> =
                phoneNumbers.getOptional("phone_numbers")

            /**
             * The count of phone numbers in the number order.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumbersCount(): Optional<Long> =
                phoneNumbersCount.getOptional("phone_numbers_count")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * True if all requirements are met for every phone number, false otherwise.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requirementsMet(): Optional<Boolean> =
                requirementsMet.getOptional("requirements_met")

            /**
             * The status of the order.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subNumberOrdersIds(): Optional<List<String>> =
                subNumberOrdersIds.getOptional("sub_number_orders_ids")

            /**
             * An ISO 8901 datetime string for when the number order was updated.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [billingGroupId].
             *
             * Unlike [billingGroupId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            fun _billingGroupId(): JsonField<String> = billingGroupId

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
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [customerReference].
             *
             * Unlike [customerReference], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("customer_reference")
            @ExcludeMissing
            fun _customerReference(): JsonField<String> = customerReference

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
             * Returns the raw JSON value of [phoneNumbers].
             *
             * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

            /**
             * Returns the raw JSON value of [phoneNumbersCount].
             *
             * Unlike [phoneNumbersCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("phone_numbers_count")
            @ExcludeMissing
            fun _phoneNumbersCount(): JsonField<Long> = phoneNumbersCount

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<String> = recordType

            /**
             * Returns the raw JSON value of [requirementsMet].
             *
             * Unlike [requirementsMet], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("requirements_met")
            @ExcludeMissing
            fun _requirementsMet(): JsonField<Boolean> = requirementsMet

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [subNumberOrdersIds].
             *
             * Unlike [subNumberOrdersIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sub_number_orders_ids")
            @ExcludeMissing
            fun _subNumberOrdersIds(): JsonField<List<String>> = subNumberOrdersIds

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

                private var id: JsonField<String> = JsonMissing.of()
                private var billingGroupId: JsonField<String> = JsonMissing.of()
                private var connectionId: JsonField<String> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var customerReference: JsonField<String> = JsonMissing.of()
                private var messagingProfileId: JsonField<String> = JsonMissing.of()
                private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
                private var phoneNumbersCount: JsonField<Long> = JsonMissing.of()
                private var recordType: JsonField<String> = JsonMissing.of()
                private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var subNumberOrdersIds: JsonField<MutableList<String>>? = null
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payload: Payload) = apply {
                    id = payload.id
                    billingGroupId = payload.billingGroupId
                    connectionId = payload.connectionId
                    createdAt = payload.createdAt
                    customerReference = payload.customerReference
                    messagingProfileId = payload.messagingProfileId
                    phoneNumbers = payload.phoneNumbers.map { it.toMutableList() }
                    phoneNumbersCount = payload.phoneNumbersCount
                    recordType = payload.recordType
                    requirementsMet = payload.requirementsMet
                    status = payload.status
                    subNumberOrdersIds = payload.subNumberOrdersIds.map { it.toMutableList() }
                    updatedAt = payload.updatedAt
                    additionalProperties = payload.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Identifies the messaging profile associated with the phone number. */
                fun billingGroupId(billingGroupId: String) =
                    billingGroupId(JsonField.of(billingGroupId))

                /**
                 * Sets [Builder.billingGroupId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingGroupId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billingGroupId(billingGroupId: JsonField<String>) = apply {
                    this.billingGroupId = billingGroupId
                }

                /** Identifies the connection associated with this phone number. */
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

                /** An ISO 8901 datetime string denoting when the number order was created. */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** A customer reference string for customer look ups. */
                fun customerReference(customerReference: String) =
                    customerReference(JsonField.of(customerReference))

                /**
                 * Sets [Builder.customerReference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerReference] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customerReference(customerReference: JsonField<String>) = apply {
                    this.customerReference = customerReference
                }

                /** Identifies the messaging profile associated with the phone number. */
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

                fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                    phoneNumbers(JsonField.of(phoneNumbers))

                /**
                 * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumbers] with a well-typed
                 * `List<PhoneNumber>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
                    this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [PhoneNumber] to [phoneNumbers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                    phoneNumbers =
                        (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("phoneNumbers", it).add(phoneNumber)
                        }
                }

                /** The count of phone numbers in the number order. */
                fun phoneNumbersCount(phoneNumbersCount: Long) =
                    phoneNumbersCount(JsonField.of(phoneNumbersCount))

                /**
                 * Sets [Builder.phoneNumbersCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumbersCount] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun phoneNumbersCount(phoneNumbersCount: JsonField<Long>) = apply {
                    this.phoneNumbersCount = phoneNumbersCount
                }

                fun recordType(recordType: String) = recordType(JsonField.of(recordType))

                /**
                 * Sets [Builder.recordType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
                }

                /** True if all requirements are met for every phone number, false otherwise. */
                fun requirementsMet(requirementsMet: Boolean) =
                    requirementsMet(JsonField.of(requirementsMet))

                /**
                 * Sets [Builder.requirementsMet] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requirementsMet] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun requirementsMet(requirementsMet: JsonField<Boolean>) = apply {
                    this.requirementsMet = requirementsMet
                }

                /** The status of the order. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun subNumberOrdersIds(subNumberOrdersIds: List<String>) =
                    subNumberOrdersIds(JsonField.of(subNumberOrdersIds))

                /**
                 * Sets [Builder.subNumberOrdersIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subNumberOrdersIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun subNumberOrdersIds(subNumberOrdersIds: JsonField<List<String>>) = apply {
                    this.subNumberOrdersIds = subNumberOrdersIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [subNumberOrdersIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSubNumberOrdersId(subNumberOrdersId: String) = apply {
                    subNumberOrdersIds =
                        (subNumberOrdersIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("subNumberOrdersIds", it).add(subNumberOrdersId)
                        }
                }

                /** An ISO 8901 datetime string for when the number order was updated. */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
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
                        id,
                        billingGroupId,
                        connectionId,
                        createdAt,
                        customerReference,
                        messagingProfileId,
                        (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                        phoneNumbersCount,
                        recordType,
                        requirementsMet,
                        status,
                        (subNumberOrdersIds ?: JsonMissing.of()).map { it.toImmutable() },
                        updatedAt,
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
                billingGroupId()
                connectionId()
                createdAt()
                customerReference()
                messagingProfileId()
                phoneNumbers().ifPresent { it.forEach { it.validate() } }
                phoneNumbersCount()
                recordType()
                requirementsMet()
                status().ifPresent { it.validate() }
                subNumberOrdersIds()
                updatedAt()
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
                    (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                    (if (connectionId.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (customerReference.asKnown().isPresent) 1 else 0) +
                    (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                    (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (phoneNumbersCount.asKnown().isPresent) 1 else 0) +
                    (if (recordType.asKnown().isPresent) 1 else 0) +
                    (if (requirementsMet.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (subNumberOrdersIds.asKnown().getOrNull()?.size ?: 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            /** The unique phone numbers given as arguments in the job creation. */
            class PhoneNumber
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val bundleId: JsonField<String>,
                private val countryCode: JsonField<String>,
                private val countryIsoAlpha2: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val phoneNumberType: JsonField<PhoneNumberType>,
                private val recordType: JsonField<String>,
                private val regulatoryRequirements: JsonField<List<RegulatoryRequirement>>,
                private val requirementsMet: JsonField<Boolean>,
                private val requirementsStatus: JsonField<RequirementsStatus>,
                private val status: JsonField<Status>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("bundle_id")
                    @ExcludeMissing
                    bundleId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("country_code")
                    @ExcludeMissing
                    countryCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("country_iso_alpha2")
                    @ExcludeMissing
                    countryIsoAlpha2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phone_number")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phone_number_type")
                    @ExcludeMissing
                    phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
                    @JsonProperty("record_type")
                    @ExcludeMissing
                    recordType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("regulatory_requirements")
                    @ExcludeMissing
                    regulatoryRequirements: JsonField<List<RegulatoryRequirement>> =
                        JsonMissing.of(),
                    @JsonProperty("requirements_met")
                    @ExcludeMissing
                    requirementsMet: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("requirements_status")
                    @ExcludeMissing
                    requirementsStatus: JsonField<RequirementsStatus> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<Status> = JsonMissing.of(),
                ) : this(
                    id,
                    bundleId,
                    countryCode,
                    countryIsoAlpha2,
                    phoneNumber,
                    phoneNumberType,
                    recordType,
                    regulatoryRequirements,
                    requirementsMet,
                    requirementsStatus,
                    status,
                    mutableMapOf(),
                )

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun bundleId(): Optional<String> = bundleId.getOptional("bundle_id")

                /**
                 * Country code of the phone number
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

                /**
                 * The ISO 3166-1 alpha-2 country code of the phone number.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun countryIsoAlpha2(): Optional<String> =
                    countryIsoAlpha2.getOptional("country_iso_alpha2")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

                /**
                 * Phone number type
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumberType(): Optional<PhoneNumberType> =
                    phoneNumberType.getOptional("phone_number_type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun recordType(): Optional<String> = recordType.getOptional("record_type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
                    regulatoryRequirements.getOptional("regulatory_requirements")

                /**
                 * True if all requirements are met for a phone number, false otherwise.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun requirementsMet(): Optional<Boolean> =
                    requirementsMet.getOptional("requirements_met")

                /**
                 * Status of document requirements (if applicable)
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun requirementsStatus(): Optional<RequirementsStatus> =
                    requirementsStatus.getOptional("requirements_status")

                /**
                 * The status of the phone number in the order.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun status(): Optional<Status> = status.getOptional("status")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [bundleId].
                 *
                 * Unlike [bundleId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bundle_id")
                @ExcludeMissing
                fun _bundleId(): JsonField<String> = bundleId

                /**
                 * Returns the raw JSON value of [countryCode].
                 *
                 * Unlike [countryCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("country_code")
                @ExcludeMissing
                fun _countryCode(): JsonField<String> = countryCode

                /**
                 * Returns the raw JSON value of [countryIsoAlpha2].
                 *
                 * Unlike [countryIsoAlpha2], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("country_iso_alpha2")
                @ExcludeMissing
                fun _countryIsoAlpha2(): JsonField<String> = countryIsoAlpha2

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
                 * Returns the raw JSON value of [phoneNumberType].
                 *
                 * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phone_number_type")
                @ExcludeMissing
                fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

                /**
                 * Returns the raw JSON value of [recordType].
                 *
                 * Unlike [recordType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("record_type")
                @ExcludeMissing
                fun _recordType(): JsonField<String> = recordType

                /**
                 * Returns the raw JSON value of [regulatoryRequirements].
                 *
                 * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("regulatory_requirements")
                @ExcludeMissing
                fun _regulatoryRequirements(): JsonField<List<RegulatoryRequirement>> =
                    regulatoryRequirements

                /**
                 * Returns the raw JSON value of [requirementsMet].
                 *
                 * Unlike [requirementsMet], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("requirements_met")
                @ExcludeMissing
                fun _requirementsMet(): JsonField<Boolean> = requirementsMet

                /**
                 * Returns the raw JSON value of [requirementsStatus].
                 *
                 * Unlike [requirementsStatus], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("requirements_status")
                @ExcludeMissing
                fun _requirementsStatus(): JsonField<RequirementsStatus> = requirementsStatus

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

                    /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PhoneNumber]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var bundleId: JsonField<String> = JsonMissing.of()
                    private var countryCode: JsonField<String> = JsonMissing.of()
                    private var countryIsoAlpha2: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of()
                    private var recordType: JsonField<String> = JsonMissing.of()
                    private var regulatoryRequirements:
                        JsonField<MutableList<RegulatoryRequirement>>? =
                        null
                    private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
                    private var requirementsStatus: JsonField<RequirementsStatus> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(phoneNumber: PhoneNumber) = apply {
                        id = phoneNumber.id
                        bundleId = phoneNumber.bundleId
                        countryCode = phoneNumber.countryCode
                        countryIsoAlpha2 = phoneNumber.countryIsoAlpha2
                        this.phoneNumber = phoneNumber.phoneNumber
                        phoneNumberType = phoneNumber.phoneNumberType
                        recordType = phoneNumber.recordType
                        regulatoryRequirements =
                            phoneNumber.regulatoryRequirements.map { it.toMutableList() }
                        requirementsMet = phoneNumber.requirementsMet
                        requirementsStatus = phoneNumber.requirementsStatus
                        status = phoneNumber.status
                        additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun bundleId(bundleId: String) = bundleId(JsonField.of(bundleId))

                    /**
                     * Sets [Builder.bundleId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bundleId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bundleId(bundleId: JsonField<String>) = apply { this.bundleId = bundleId }

                    /** Country code of the phone number */
                    fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

                    /**
                     * Sets [Builder.countryCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryCode] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryCode(countryCode: JsonField<String>) = apply {
                        this.countryCode = countryCode
                    }

                    /** The ISO 3166-1 alpha-2 country code of the phone number. */
                    fun countryIsoAlpha2(countryIsoAlpha2: String) =
                        countryIsoAlpha2(JsonField.of(countryIsoAlpha2))

                    /**
                     * Sets [Builder.countryIsoAlpha2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryIsoAlpha2] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryIsoAlpha2(countryIsoAlpha2: JsonField<String>) = apply {
                        this.countryIsoAlpha2 = countryIsoAlpha2
                    }

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

                    /** Phone number type */
                    fun phoneNumberType(phoneNumberType: PhoneNumberType) =
                        phoneNumberType(JsonField.of(phoneNumberType))

                    /**
                     * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumberType] with a well-typed
                     * [PhoneNumberType] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
                        this.phoneNumberType = phoneNumberType
                    }

                    fun recordType(recordType: String) = recordType(JsonField.of(recordType))

                    /**
                     * Sets [Builder.recordType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recordType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun recordType(recordType: JsonField<String>) = apply {
                        this.recordType = recordType
                    }

                    fun regulatoryRequirements(
                        regulatoryRequirements: List<RegulatoryRequirement>
                    ) = regulatoryRequirements(JsonField.of(regulatoryRequirements))

                    /**
                     * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.regulatoryRequirements] with a well-typed
                     * `List<RegulatoryRequirement>` value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun regulatoryRequirements(
                        regulatoryRequirements: JsonField<List<RegulatoryRequirement>>
                    ) = apply {
                        this.regulatoryRequirements =
                            regulatoryRequirements.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [RegulatoryRequirement] to [regulatoryRequirements].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addRegulatoryRequirement(regulatoryRequirement: RegulatoryRequirement) =
                        apply {
                            regulatoryRequirements =
                                (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("regulatoryRequirements", it)
                                        .add(regulatoryRequirement)
                                }
                        }

                    /** True if all requirements are met for a phone number, false otherwise. */
                    fun requirementsMet(requirementsMet: Boolean) =
                        requirementsMet(JsonField.of(requirementsMet))

                    /**
                     * Sets [Builder.requirementsMet] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.requirementsMet] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun requirementsMet(requirementsMet: JsonField<Boolean>) = apply {
                        this.requirementsMet = requirementsMet
                    }

                    /** Status of document requirements (if applicable) */
                    fun requirementsStatus(requirementsStatus: RequirementsStatus) =
                        requirementsStatus(JsonField.of(requirementsStatus))

                    /**
                     * Sets [Builder.requirementsStatus] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.requirementsStatus] with a well-typed
                     * [RequirementsStatus] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun requirementsStatus(requirementsStatus: JsonField<RequirementsStatus>) =
                        apply {
                            this.requirementsStatus = requirementsStatus
                        }

                    /** The status of the phone number in the order. */
                    fun status(status: Status) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [Status] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<Status>) = apply { this.status = status }

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
                     * Returns an immutable instance of [PhoneNumber].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PhoneNumber =
                        PhoneNumber(
                            id,
                            bundleId,
                            countryCode,
                            countryIsoAlpha2,
                            phoneNumber,
                            phoneNumberType,
                            recordType,
                            (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                            requirementsMet,
                            requirementsStatus,
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
                fun validate(): PhoneNumber = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    bundleId()
                    countryCode()
                    countryIsoAlpha2()
                    phoneNumber()
                    phoneNumberType().ifPresent { it.validate() }
                    recordType()
                    regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
                    requirementsMet()
                    requirementsStatus().ifPresent { it.validate() }
                    status().ifPresent { it.validate() }
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
                        (if (bundleId.asKnown().isPresent) 1 else 0) +
                        (if (countryCode.asKnown().isPresent) 1 else 0) +
                        (if (countryIsoAlpha2.asKnown().isPresent) 1 else 0) +
                        (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                        (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (recordType.asKnown().isPresent) 1 else 0) +
                        (regulatoryRequirements.asKnown().getOrNull()?.sumOf {
                            it.validity().toInt()
                        } ?: 0) +
                        (if (requirementsMet.asKnown().isPresent) 1 else 0) +
                        (requirementsStatus.asKnown().getOrNull()?.validity() ?: 0) +
                        (status.asKnown().getOrNull()?.validity() ?: 0)

                /** Phone number type */
                class PhoneNumberType
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

                        @JvmField val LOCAL = of("local")

                        @JvmField val MOBILE = of("mobile")

                        @JvmField val NATIONAL = of("national")

                        @JvmField val SHARED_COST = of("shared_cost")

                        @JvmField val TOLL_FREE = of("toll_free")

                        @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
                    }

                    /** An enum containing [PhoneNumberType]'s known values. */
                    enum class Known {
                        LOCAL,
                        MOBILE,
                        NATIONAL,
                        SHARED_COST,
                        TOLL_FREE,
                    }

                    /**
                     * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [PhoneNumberType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        LOCAL,
                        MOBILE,
                        NATIONAL,
                        SHARED_COST,
                        TOLL_FREE,
                        /**
                         * An enum member indicating that [PhoneNumberType] was instantiated with an
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
                            LOCAL -> Value.LOCAL
                            MOBILE -> Value.MOBILE
                            NATIONAL -> Value.NATIONAL
                            SHARED_COST -> Value.SHARED_COST
                            TOLL_FREE -> Value.TOLL_FREE
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
                            LOCAL -> Known.LOCAL
                            MOBILE -> Known.MOBILE
                            NATIONAL -> Known.NATIONAL
                            SHARED_COST -> Known.SHARED_COST
                            TOLL_FREE -> Known.TOLL_FREE
                            else ->
                                throw TelnyxInvalidDataException("Unknown PhoneNumberType: $value")
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
                    fun validate(): PhoneNumberType = apply {
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

                        return other is PhoneNumberType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Regulatory requirement data delivered in a number order webhook. */
                class RegulatoryRequirement
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val fieldType: JsonField<FieldType>,
                    private val fieldValue: JsonField<String>,
                    private val recordType: JsonField<String>,
                    private val requirementId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field_type")
                        @ExcludeMissing
                        fieldType: JsonField<FieldType> = JsonMissing.of(),
                        @JsonProperty("field_value")
                        @ExcludeMissing
                        fieldValue: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("record_type")
                        @ExcludeMissing
                        recordType: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("requirement_id")
                        @ExcludeMissing
                        requirementId: JsonField<String> = JsonMissing.of(),
                    ) : this(fieldType, fieldValue, recordType, requirementId, mutableMapOf())

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fieldType(): Optional<FieldType> = fieldType.getOptional("field_type")

                    /**
                     * The value of the requirement, this could be an id to a resource or a string
                     * value.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun fieldValue(): Optional<String> = fieldValue.getOptional("field_value")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun recordType(): Optional<String> = recordType.getOptional("record_type")

                    /**
                     * Unique id for a requirement.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun requirementId(): Optional<String> =
                        requirementId.getOptional("requirement_id")

                    /**
                     * Returns the raw JSON value of [fieldType].
                     *
                     * Unlike [fieldType], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("field_type")
                    @ExcludeMissing
                    fun _fieldType(): JsonField<FieldType> = fieldType

                    /**
                     * Returns the raw JSON value of [fieldValue].
                     *
                     * Unlike [fieldValue], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("field_value")
                    @ExcludeMissing
                    fun _fieldValue(): JsonField<String> = fieldValue

                    /**
                     * Returns the raw JSON value of [recordType].
                     *
                     * Unlike [recordType], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("record_type")
                    @ExcludeMissing
                    fun _recordType(): JsonField<String> = recordType

                    /**
                     * Returns the raw JSON value of [requirementId].
                     *
                     * Unlike [requirementId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("requirement_id")
                    @ExcludeMissing
                    fun _requirementId(): JsonField<String> = requirementId

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
                         * [RegulatoryRequirement].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RegulatoryRequirement]. */
                    class Builder internal constructor() {

                        private var fieldType: JsonField<FieldType> = JsonMissing.of()
                        private var fieldValue: JsonField<String> = JsonMissing.of()
                        private var recordType: JsonField<String> = JsonMissing.of()
                        private var requirementId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(regulatoryRequirement: RegulatoryRequirement) = apply {
                            fieldType = regulatoryRequirement.fieldType
                            fieldValue = regulatoryRequirement.fieldValue
                            recordType = regulatoryRequirement.recordType
                            requirementId = regulatoryRequirement.requirementId
                            additionalProperties =
                                regulatoryRequirement.additionalProperties.toMutableMap()
                        }

                        fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

                        /**
                         * Sets [Builder.fieldType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fieldType] with a well-typed [FieldType]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fieldType(fieldType: JsonField<FieldType>) = apply {
                            this.fieldType = fieldType
                        }

                        /**
                         * The value of the requirement, this could be an id to a resource or a
                         * string value.
                         */
                        fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

                        /**
                         * Sets [Builder.fieldValue] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fieldValue] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fieldValue(fieldValue: JsonField<String>) = apply {
                            this.fieldValue = fieldValue
                        }

                        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

                        /**
                         * Sets [Builder.recordType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.recordType] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun recordType(recordType: JsonField<String>) = apply {
                            this.recordType = recordType
                        }

                        /** Unique id for a requirement. */
                        fun requirementId(requirementId: String) =
                            requirementId(JsonField.of(requirementId))

                        /**
                         * Sets [Builder.requirementId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.requirementId] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun requirementId(requirementId: JsonField<String>) = apply {
                            this.requirementId = requirementId
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
                         * Returns an immutable instance of [RegulatoryRequirement].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): RegulatoryRequirement =
                            RegulatoryRequirement(
                                fieldType,
                                fieldValue,
                                recordType,
                                requirementId,
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
                    fun validate(): RegulatoryRequirement = apply {
                        if (validated) {
                            return@apply
                        }

                        fieldType().ifPresent { it.validate() }
                        fieldValue()
                        recordType()
                        requirementId()
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
                        (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (fieldValue.asKnown().isPresent) 1 else 0) +
                            (if (recordType.asKnown().isPresent) 1 else 0) +
                            (if (requirementId.asKnown().isPresent) 1 else 0)

                    class FieldType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val TEXTUAL = of("textual")

                            @JvmField val DATETIME = of("datetime")

                            @JvmField val ADDRESS = of("address")

                            @JvmField val DOCUMENT = of("document")

                            @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
                        }

                        /** An enum containing [FieldType]'s known values. */
                        enum class Known {
                            TEXTUAL,
                            DATETIME,
                            ADDRESS,
                            DOCUMENT,
                        }

                        /**
                         * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [FieldType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TEXTUAL,
                            DATETIME,
                            ADDRESS,
                            DOCUMENT,
                            /**
                             * An enum member indicating that [FieldType] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                TEXTUAL -> Value.TEXTUAL
                                DATETIME -> Value.DATETIME
                                ADDRESS -> Value.ADDRESS
                                DOCUMENT -> Value.DOCUMENT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                TEXTUAL -> Known.TEXTUAL
                                DATETIME -> Known.DATETIME
                                ADDRESS -> Known.ADDRESS
                                DOCUMENT -> Known.DOCUMENT
                                else ->
                                    throw TelnyxInvalidDataException("Unknown FieldType: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws TelnyxInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                TelnyxInvalidDataException("Value is not a String")
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
                        fun validate(): FieldType = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is FieldType && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RegulatoryRequirement &&
                            fieldType == other.fieldType &&
                            fieldValue == other.fieldValue &&
                            recordType == other.recordType &&
                            requirementId == other.requirementId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            fieldType,
                            fieldValue,
                            recordType,
                            requirementId,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RegulatoryRequirement{fieldType=$fieldType, fieldValue=$fieldValue, recordType=$recordType, requirementId=$requirementId, additionalProperties=$additionalProperties}"
                }

                /** Status of document requirements (if applicable) */
                class RequirementsStatus
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

                        @JvmField val PENDING = of("pending")

                        @JvmField val APPROVED = of("approved")

                        @JvmField val CANCELLED = of("cancelled")

                        @JvmField val DELETED = of("deleted")

                        @JvmField val REQUIREMENT_INFO_EXCEPTION = of("requirement-info-exception")

                        @JvmField val REQUIREMENT_INFO_PENDING = of("requirement-info-pending")

                        @JvmField
                        val REQUIREMENT_INFO_UNDER_REVIEW = of("requirement-info-under-review")

                        @JvmStatic fun of(value: String) = RequirementsStatus(JsonField.of(value))
                    }

                    /** An enum containing [RequirementsStatus]'s known values. */
                    enum class Known {
                        PENDING,
                        APPROVED,
                        CANCELLED,
                        DELETED,
                        REQUIREMENT_INFO_EXCEPTION,
                        REQUIREMENT_INFO_PENDING,
                        REQUIREMENT_INFO_UNDER_REVIEW,
                    }

                    /**
                     * An enum containing [RequirementsStatus]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [RequirementsStatus] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PENDING,
                        APPROVED,
                        CANCELLED,
                        DELETED,
                        REQUIREMENT_INFO_EXCEPTION,
                        REQUIREMENT_INFO_PENDING,
                        REQUIREMENT_INFO_UNDER_REVIEW,
                        /**
                         * An enum member indicating that [RequirementsStatus] was instantiated with
                         * an unknown value.
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
                            PENDING -> Value.PENDING
                            APPROVED -> Value.APPROVED
                            CANCELLED -> Value.CANCELLED
                            DELETED -> Value.DELETED
                            REQUIREMENT_INFO_EXCEPTION -> Value.REQUIREMENT_INFO_EXCEPTION
                            REQUIREMENT_INFO_PENDING -> Value.REQUIREMENT_INFO_PENDING
                            REQUIREMENT_INFO_UNDER_REVIEW -> Value.REQUIREMENT_INFO_UNDER_REVIEW
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
                            PENDING -> Known.PENDING
                            APPROVED -> Known.APPROVED
                            CANCELLED -> Known.CANCELLED
                            DELETED -> Known.DELETED
                            REQUIREMENT_INFO_EXCEPTION -> Known.REQUIREMENT_INFO_EXCEPTION
                            REQUIREMENT_INFO_PENDING -> Known.REQUIREMENT_INFO_PENDING
                            REQUIREMENT_INFO_UNDER_REVIEW -> Known.REQUIREMENT_INFO_UNDER_REVIEW
                            else ->
                                throw TelnyxInvalidDataException(
                                    "Unknown RequirementsStatus: $value"
                                )
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
                    fun validate(): RequirementsStatus = apply {
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

                        return other is RequirementsStatus && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** The status of the phone number in the order. */
                class Status
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

                        @JvmField val PENDING = of("pending")

                        @JvmField val SUCCESS = of("success")

                        @JvmField val FAILURE = of("failure")

                        @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                    }

                    /** An enum containing [Status]'s known values. */
                    enum class Known {
                        PENDING,
                        SUCCESS,
                        FAILURE,
                    }

                    /**
                     * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Status] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PENDING,
                        SUCCESS,
                        FAILURE,
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
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PENDING -> Value.PENDING
                            SUCCESS -> Value.SUCCESS
                            FAILURE -> Value.FAILURE
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
                            PENDING -> Known.PENDING
                            SUCCESS -> Known.SUCCESS
                            FAILURE -> Known.FAILURE
                            else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is PhoneNumber &&
                        id == other.id &&
                        bundleId == other.bundleId &&
                        countryCode == other.countryCode &&
                        countryIsoAlpha2 == other.countryIsoAlpha2 &&
                        phoneNumber == other.phoneNumber &&
                        phoneNumberType == other.phoneNumberType &&
                        recordType == other.recordType &&
                        regulatoryRequirements == other.regulatoryRequirements &&
                        requirementsMet == other.requirementsMet &&
                        requirementsStatus == other.requirementsStatus &&
                        status == other.status &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        bundleId,
                        countryCode,
                        countryIsoAlpha2,
                        phoneNumber,
                        phoneNumberType,
                        recordType,
                        regulatoryRequirements,
                        requirementsMet,
                        requirementsStatus,
                        status,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PhoneNumber{id=$id, bundleId=$bundleId, countryCode=$countryCode, countryIsoAlpha2=$countryIsoAlpha2, phoneNumber=$phoneNumber, phoneNumberType=$phoneNumberType, recordType=$recordType, regulatoryRequirements=$regulatoryRequirements, requirementsMet=$requirementsMet, requirementsStatus=$requirementsStatus, status=$status, additionalProperties=$additionalProperties}"
            }

            /** The status of the order. */
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

                    @JvmField val PENDING = of("pending")

                    @JvmField val SUCCESS = of("success")

                    @JvmField val FAILURE = of("failure")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    PENDING,
                    SUCCESS,
                    FAILURE,
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
                    PENDING,
                    SUCCESS,
                    FAILURE,
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
                        PENDING -> Value.PENDING
                        SUCCESS -> Value.SUCCESS
                        FAILURE -> Value.FAILURE
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
                        PENDING -> Known.PENDING
                        SUCCESS -> Known.SUCCESS
                        FAILURE -> Known.FAILURE
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payload &&
                    id == other.id &&
                    billingGroupId == other.billingGroupId &&
                    connectionId == other.connectionId &&
                    createdAt == other.createdAt &&
                    customerReference == other.customerReference &&
                    messagingProfileId == other.messagingProfileId &&
                    phoneNumbers == other.phoneNumbers &&
                    phoneNumbersCount == other.phoneNumbersCount &&
                    recordType == other.recordType &&
                    requirementsMet == other.requirementsMet &&
                    status == other.status &&
                    subNumberOrdersIds == other.subNumberOrdersIds &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    billingGroupId,
                    connectionId,
                    createdAt,
                    customerReference,
                    messagingProfileId,
                    phoneNumbers,
                    phoneNumbersCount,
                    recordType,
                    requirementsMet,
                    status,
                    subNumberOrdersIds,
                    updatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payload{id=$id, billingGroupId=$billingGroupId, connectionId=$connectionId, createdAt=$createdAt, customerReference=$customerReference, messagingProfileId=$messagingProfileId, phoneNumbers=$phoneNumbers, phoneNumbersCount=$phoneNumbersCount, recordType=$recordType, requirementsMet=$requirementsMet, status=$status, subNumberOrdersIds=$subNumberOrdersIds, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
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

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attempt: JsonField<Long>,
        private val deliveredTo: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attempt") @ExcludeMissing attempt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("delivered_to")
            @ExcludeMissing
            deliveredTo: JsonField<String> = JsonMissing.of(),
        ) : this(attempt, deliveredTo, mutableMapOf())

        /**
         * Webhook delivery attempt number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attempt(): Long = attempt.getRequired("attempt")

        /**
         * URL where the webhook was delivered
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveredTo(): String = deliveredTo.getRequired("delivered_to")

        /**
         * Returns the raw JSON value of [attempt].
         *
         * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<Long> = attempt

        /**
         * Returns the raw JSON value of [deliveredTo].
         *
         * Unlike [deliveredTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delivered_to")
        @ExcludeMissing
        fun _deliveredTo(): JsonField<String> = deliveredTo

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
             * .attempt()
             * .deliveredTo()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var attempt: JsonField<Long>? = null
            private var deliveredTo: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                attempt = meta.attempt
                deliveredTo = meta.deliveredTo
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /** Webhook delivery attempt number */
            fun attempt(attempt: Long) = attempt(JsonField.of(attempt))

            /**
             * Sets [Builder.attempt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attempt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attempt(attempt: JsonField<Long>) = apply { this.attempt = attempt }

            /** URL where the webhook was delivered */
            fun deliveredTo(deliveredTo: String) = deliveredTo(JsonField.of(deliveredTo))

            /**
             * Sets [Builder.deliveredTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveredTo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deliveredTo(deliveredTo: JsonField<String>) = apply {
                this.deliveredTo = deliveredTo
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .attempt()
             * .deliveredTo()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("attempt", attempt),
                    checkRequired("deliveredTo", deliveredTo),
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

            attempt()
            deliveredTo()
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
            (if (attempt.asKnown().isPresent) 1 else 0) +
                (if (deliveredTo.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                attempt == other.attempt &&
                deliveredTo == other.deliveredTo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(attempt, deliveredTo, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{attempt=$attempt, deliveredTo=$deliveredTo, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberOrderStatusUpdateWebhookEvent &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberOrderStatusUpdateWebhookEvent{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
