// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhookdeliveries

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WebhookDeliveryListResponse
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

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
         * Returns a mutable builder for constructing an instance of [WebhookDeliveryListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookDeliveryListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookDeliveryListResponse: WebhookDeliveryListResponse) = apply {
            data = webhookDeliveryListResponse.data.map { it.toMutableList() }
            meta = webhookDeliveryListResponse.meta
            additionalProperties = webhookDeliveryListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [WebhookDeliveryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WebhookDeliveryListResponse =
            WebhookDeliveryListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WebhookDeliveryListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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

    /** Record of all attempts to deliver a webhook. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val attempts: JsonField<List<Attempt>>,
        private val finishedAt: JsonField<OffsetDateTime>,
        private val recordType: JsonField<String>,
        private val startedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val userId: JsonField<String>,
        private val webhook: JsonField<Webhook>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attempts")
            @ExcludeMissing
            attempts: JsonField<List<Attempt>> = JsonMissing.of(),
            @JsonProperty("finished_at")
            @ExcludeMissing
            finishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("started_at")
            @ExcludeMissing
            startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook") @ExcludeMissing webhook: JsonField<Webhook> = JsonMissing.of(),
        ) : this(
            id,
            attempts,
            finishedAt,
            recordType,
            startedAt,
            status,
            userId,
            webhook,
            mutableMapOf(),
        )

        /**
         * Uniquely identifies the webhook_delivery record.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Detailed delivery attempts, ordered by most recent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attempts(): Optional<List<Attempt>> = attempts.getOptional("attempts")

        /**
         * ISO 8601 timestamp indicating when the last webhook response has been received.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun finishedAt(): Optional<OffsetDateTime> = finishedAt.getOptional("finished_at")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * ISO 8601 timestamp indicating when the first request attempt was initiated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

        /**
         * Delivery status: 'delivered' when successfuly delivered or 'failed' if all attempts have
         * failed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Uniquely identifies the user that owns the webhook_delivery record.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Original webhook JSON data. Payload fields vary according to event type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhook(): Optional<Webhook> = webhook.getOptional("webhook")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [attempts].
         *
         * Unlike [attempts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attempts")
        @ExcludeMissing
        fun _attempts(): JsonField<List<Attempt>> = attempts

        /**
         * Returns the raw JSON value of [finishedAt].
         *
         * Unlike [finishedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("finished_at")
        @ExcludeMissing
        fun _finishedAt(): JsonField<OffsetDateTime> = finishedAt

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [startedAt].
         *
         * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("started_at")
        @ExcludeMissing
        fun _startedAt(): JsonField<OffsetDateTime> = startedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [webhook].
         *
         * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<Webhook> = webhook

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
            private var attempts: JsonField<MutableList<Attempt>>? = null
            private var finishedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var webhook: JsonField<Webhook> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                attempts = data.attempts.map { it.toMutableList() }
                finishedAt = data.finishedAt
                recordType = data.recordType
                startedAt = data.startedAt
                status = data.status
                userId = data.userId
                webhook = data.webhook
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Uniquely identifies the webhook_delivery record. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Detailed delivery attempts, ordered by most recent. */
            fun attempts(attempts: List<Attempt>) = attempts(JsonField.of(attempts))

            /**
             * Sets [Builder.attempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attempts] with a well-typed `List<Attempt>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attempts(attempts: JsonField<List<Attempt>>) = apply {
                this.attempts = attempts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Attempt] to [attempts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttempt(attempt: Attempt) = apply {
                attempts =
                    (attempts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attempts", it).add(attempt)
                    }
            }

            /** ISO 8601 timestamp indicating when the last webhook response has been received. */
            fun finishedAt(finishedAt: OffsetDateTime) = finishedAt(JsonField.of(finishedAt))

            /**
             * Sets [Builder.finishedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finishedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finishedAt(finishedAt: JsonField<OffsetDateTime>) = apply {
                this.finishedAt = finishedAt
            }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** ISO 8601 timestamp indicating when the first request attempt was initiated. */
            fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

            /**
             * Sets [Builder.startedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply {
                this.startedAt = startedAt
            }

            /**
             * Delivery status: 'delivered' when successfuly delivered or 'failed' if all attempts
             * have failed.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Uniquely identifies the user that owns the webhook_delivery record. */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** Original webhook JSON data. Payload fields vary according to event type. */
            fun webhook(webhook: Webhook) = webhook(JsonField.of(webhook))

            /**
             * Sets [Builder.webhook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhook] with a well-typed [Webhook] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhook(webhook: JsonField<Webhook>) = apply { this.webhook = webhook }

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
                    (attempts ?: JsonMissing.of()).map { it.toImmutable() },
                    finishedAt,
                    recordType,
                    startedAt,
                    status,
                    userId,
                    webhook,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            attempts().ifPresent { it.forEach { it.validate() } }
            finishedAt()
            recordType()
            startedAt()
            status().ifPresent { it.validate() }
            userId()
            webhook().ifPresent { it.validate() }
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
                (attempts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (finishedAt.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (startedAt.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (webhook.asKnown().getOrNull()?.validity() ?: 0)

        /** Webhook delivery attempt details. */
        class Attempt
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val errors: JsonField<List<Long>>,
            private val finishedAt: JsonField<OffsetDateTime>,
            private val http: JsonField<Http>,
            private val startedAt: JsonField<OffsetDateTime>,
            private val status: JsonField<Status>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("errors")
                @ExcludeMissing
                errors: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("finished_at")
                @ExcludeMissing
                finishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("http") @ExcludeMissing http: JsonField<Http> = JsonMissing.of(),
                @JsonProperty("started_at")
                @ExcludeMissing
                startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            ) : this(errors, finishedAt, http, startedAt, status, mutableMapOf())

            /**
             * Webhook delivery error codes.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun errors(): Optional<List<Long>> = errors.getOptional("errors")

            /**
             * ISO 8601 timestamp indicating when the attempt has finished.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun finishedAt(): Optional<OffsetDateTime> = finishedAt.getOptional("finished_at")

            /**
             * HTTP request and response information.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun http(): Optional<Http> = http.getOptional("http")

            /**
             * ISO 8601 timestamp indicating when the attempt was initiated.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * Returns the raw JSON value of [errors].
             *
             * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<Long>> = errors

            /**
             * Returns the raw JSON value of [finishedAt].
             *
             * Unlike [finishedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("finished_at")
            @ExcludeMissing
            fun _finishedAt(): JsonField<OffsetDateTime> = finishedAt

            /**
             * Returns the raw JSON value of [http].
             *
             * Unlike [http], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("http") @ExcludeMissing fun _http(): JsonField<Http> = http

            /**
             * Returns the raw JSON value of [startedAt].
             *
             * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("started_at")
            @ExcludeMissing
            fun _startedAt(): JsonField<OffsetDateTime> = startedAt

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
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

                /** Returns a mutable builder for constructing an instance of [Attempt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Attempt]. */
            class Builder internal constructor() {

                private var errors: JsonField<MutableList<Long>>? = null
                private var finishedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var http: JsonField<Http> = JsonMissing.of()
                private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(attempt: Attempt) = apply {
                    errors = attempt.errors.map { it.toMutableList() }
                    finishedAt = attempt.finishedAt
                    http = attempt.http
                    startedAt = attempt.startedAt
                    status = attempt.status
                    additionalProperties = attempt.additionalProperties.toMutableMap()
                }

                /** Webhook delivery error codes. */
                fun errors(errors: List<Long>) = errors(JsonField.of(errors))

                /**
                 * Sets [Builder.errors] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errors] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errors(errors: JsonField<List<Long>>) = apply {
                    this.errors = errors.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [errors].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addError(error: Long) = apply {
                    errors =
                        (errors ?: JsonField.of(mutableListOf())).also {
                            checkKnown("errors", it).add(error)
                        }
                }

                /** ISO 8601 timestamp indicating when the attempt has finished. */
                fun finishedAt(finishedAt: OffsetDateTime) = finishedAt(JsonField.of(finishedAt))

                /**
                 * Sets [Builder.finishedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.finishedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun finishedAt(finishedAt: JsonField<OffsetDateTime>) = apply {
                    this.finishedAt = finishedAt
                }

                /** HTTP request and response information. */
                fun http(http: Http) = http(JsonField.of(http))

                /**
                 * Sets [Builder.http] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.http] with a well-typed [Http] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun http(http: JsonField<Http>) = apply { this.http = http }

                /** ISO 8601 timestamp indicating when the attempt was initiated. */
                fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

                /**
                 * Sets [Builder.startedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply {
                    this.startedAt = startedAt
                }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [Attempt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Attempt =
                    Attempt(
                        (errors ?: JsonMissing.of()).map { it.toImmutable() },
                        finishedAt,
                        http,
                        startedAt,
                        status,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Attempt = apply {
                if (validated) {
                    return@apply
                }

                errors()
                finishedAt()
                http().ifPresent { it.validate() }
                startedAt()
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
                (errors.asKnown().getOrNull()?.size ?: 0) +
                    (if (finishedAt.asKnown().isPresent) 1 else 0) +
                    (http.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (startedAt.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0)

            /** HTTP request and response information. */
            class Http
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val request: JsonField<Request>,
                private val response: JsonField<Response>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("request")
                    @ExcludeMissing
                    request: JsonField<Request> = JsonMissing.of(),
                    @JsonProperty("response")
                    @ExcludeMissing
                    response: JsonField<Response> = JsonMissing.of(),
                ) : this(request, response, mutableMapOf())

                /**
                 * Request details.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun request(): Optional<Request> = request.getOptional("request")

                /**
                 * Response details, optional.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun response(): Optional<Response> = response.getOptional("response")

                /**
                 * Returns the raw JSON value of [request].
                 *
                 * Unlike [request], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("request")
                @ExcludeMissing
                fun _request(): JsonField<Request> = request

                /**
                 * Returns the raw JSON value of [response].
                 *
                 * Unlike [response], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("response")
                @ExcludeMissing
                fun _response(): JsonField<Response> = response

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

                    /** Returns a mutable builder for constructing an instance of [Http]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Http]. */
                class Builder internal constructor() {

                    private var request: JsonField<Request> = JsonMissing.of()
                    private var response: JsonField<Response> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(http: Http) = apply {
                        request = http.request
                        response = http.response
                        additionalProperties = http.additionalProperties.toMutableMap()
                    }

                    /** Request details. */
                    fun request(request: Request) = request(JsonField.of(request))

                    /**
                     * Sets [Builder.request] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.request] with a well-typed [Request] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun request(request: JsonField<Request>) = apply { this.request = request }

                    /** Response details, optional. */
                    fun response(response: Response?) = response(JsonField.ofNullable(response))

                    /** Alias for calling [Builder.response] with `response.orElse(null)`. */
                    fun response(response: Optional<Response>) = response(response.getOrNull())

                    /**
                     * Sets [Builder.response] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.response] with a well-typed [Response] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun response(response: JsonField<Response>) = apply { this.response = response }

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
                     * Returns an immutable instance of [Http].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Http = Http(request, response, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Http = apply {
                    if (validated) {
                        return@apply
                    }

                    request().ifPresent { it.validate() }
                    response().ifPresent { it.validate() }
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
                    (request.asKnown().getOrNull()?.validity() ?: 0) +
                        (response.asKnown().getOrNull()?.validity() ?: 0)

                /** Request details. */
                class Request
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val headers: JsonField<List<List<String>>>,
                    private val url: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("headers")
                        @ExcludeMissing
                        headers: JsonField<List<List<String>>> = JsonMissing.of(),
                        @JsonProperty("url")
                        @ExcludeMissing
                        url: JsonField<String> = JsonMissing.of(),
                    ) : this(headers, url, mutableMapOf())

                    /**
                     * List of headers, limited to 10kB.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun headers(): Optional<List<List<String>>> = headers.getOptional("headers")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun url(): Optional<String> = url.getOptional("url")

                    /**
                     * Returns the raw JSON value of [headers].
                     *
                     * Unlike [headers], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("headers")
                    @ExcludeMissing
                    fun _headers(): JsonField<List<List<String>>> = headers

                    /**
                     * Returns the raw JSON value of [url].
                     *
                     * Unlike [url], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                        /** Returns a mutable builder for constructing an instance of [Request]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Request]. */
                    class Builder internal constructor() {

                        private var headers: JsonField<MutableList<List<String>>>? = null
                        private var url: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(request: Request) = apply {
                            headers = request.headers.map { it.toMutableList() }
                            url = request.url
                            additionalProperties = request.additionalProperties.toMutableMap()
                        }

                        /** List of headers, limited to 10kB. */
                        fun headers(headers: List<List<String>>) = headers(JsonField.of(headers))

                        /**
                         * Sets [Builder.headers] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.headers] with a well-typed
                         * `List<List<String>>` value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun headers(headers: JsonField<List<List<String>>>) = apply {
                            this.headers = headers.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [List<String>] to [headers].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addHeader(header: List<String>) = apply {
                            headers =
                                (headers ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("headers", it).add(header)
                                }
                        }

                        fun url(url: String) = url(JsonField.of(url))

                        /**
                         * Sets [Builder.url] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.url] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun url(url: JsonField<String>) = apply { this.url = url }

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
                         * Returns an immutable instance of [Request].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Request =
                            Request(
                                (headers ?: JsonMissing.of()).map { it.toImmutable() },
                                url,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Request = apply {
                        if (validated) {
                            return@apply
                        }

                        headers()
                        url()
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
                        (headers.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                            (if (url.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Request &&
                            headers == other.headers &&
                            url == other.url &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(headers, url, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Request{headers=$headers, url=$url, additionalProperties=$additionalProperties}"
                }

                /** Response details, optional. */
                class Response
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val body: JsonField<String>,
                    private val headers: JsonField<List<List<String>>>,
                    private val status: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("body")
                        @ExcludeMissing
                        body: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("headers")
                        @ExcludeMissing
                        headers: JsonField<List<List<String>>> = JsonMissing.of(),
                        @JsonProperty("status")
                        @ExcludeMissing
                        status: JsonField<Long> = JsonMissing.of(),
                    ) : this(body, headers, status, mutableMapOf())

                    /**
                     * Raw response body, limited to 10kB.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun body(): Optional<String> = body.getOptional("body")

                    /**
                     * List of headers, limited to 10kB.
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun headers(): Optional<List<List<String>>> = headers.getOptional("headers")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun status(): Optional<Long> = status.getOptional("status")

                    /**
                     * Returns the raw JSON value of [body].
                     *
                     * Unlike [body], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

                    /**
                     * Returns the raw JSON value of [headers].
                     *
                     * Unlike [headers], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("headers")
                    @ExcludeMissing
                    fun _headers(): JsonField<List<List<String>>> = headers

                    /**
                     * Returns the raw JSON value of [status].
                     *
                     * Unlike [status], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Long> = status

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

                        /** Returns a mutable builder for constructing an instance of [Response]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Response]. */
                    class Builder internal constructor() {

                        private var body: JsonField<String> = JsonMissing.of()
                        private var headers: JsonField<MutableList<List<String>>>? = null
                        private var status: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(response: Response) = apply {
                            body = response.body
                            headers = response.headers.map { it.toMutableList() }
                            status = response.status
                            additionalProperties = response.additionalProperties.toMutableMap()
                        }

                        /** Raw response body, limited to 10kB. */
                        fun body(body: String) = body(JsonField.of(body))

                        /**
                         * Sets [Builder.body] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.body] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun body(body: JsonField<String>) = apply { this.body = body }

                        /** List of headers, limited to 10kB. */
                        fun headers(headers: List<List<String>>) = headers(JsonField.of(headers))

                        /**
                         * Sets [Builder.headers] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.headers] with a well-typed
                         * `List<List<String>>` value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun headers(headers: JsonField<List<List<String>>>) = apply {
                            this.headers = headers.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [List<String>] to [headers].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addHeader(header: List<String>) = apply {
                            headers =
                                (headers ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("headers", it).add(header)
                                }
                        }

                        fun status(status: Long) = status(JsonField.of(status))

                        /**
                         * Sets [Builder.status] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.status] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun status(status: JsonField<Long>) = apply { this.status = status }

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
                         * Returns an immutable instance of [Response].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Response =
                            Response(
                                body,
                                (headers ?: JsonMissing.of()).map { it.toImmutable() },
                                status,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Response = apply {
                        if (validated) {
                            return@apply
                        }

                        body()
                        headers()
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
                        (if (body.asKnown().isPresent) 1 else 0) +
                            (headers.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                            (if (status.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Response &&
                            body == other.body &&
                            headers == other.headers &&
                            status == other.status &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(body, headers, status, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Response{body=$body, headers=$headers, status=$status, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Http &&
                        request == other.request &&
                        response == other.response &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(request, response, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Http{request=$request, response=$response, additionalProperties=$additionalProperties}"
            }

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

                    @JvmField val DELIVERED = of("delivered")

                    @JvmField val FAILED = of("failed")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    DELIVERED,
                    FAILED,
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
                    DELIVERED,
                    FAILED,
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
                        DELIVERED -> Value.DELIVERED
                        FAILED -> Value.FAILED
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
                        DELIVERED -> Known.DELIVERED
                        FAILED -> Known.FAILED
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

                return other is Attempt &&
                    errors == other.errors &&
                    finishedAt == other.finishedAt &&
                    http == other.http &&
                    startedAt == other.startedAt &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(errors, finishedAt, http, startedAt, status, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Attempt{errors=$errors, finishedAt=$finishedAt, http=$http, startedAt=$startedAt, status=$status, additionalProperties=$additionalProperties}"
        }

        /**
         * Delivery status: 'delivered' when successfuly delivered or 'failed' if all attempts have
         * failed.
         */
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

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                DELIVERED,
                FAILED,
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
                FAILED,
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
                    FAILED -> Value.FAILED
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
                    FAILED -> Known.FAILED
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

        /** Original webhook JSON data. Payload fields vary according to event type. */
        class Webhook
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val eventType: JsonField<String>,
            private val occurredAt: JsonField<OffsetDateTime>,
            private val payload: JsonValue,
            private val recordType: JsonField<RecordType>,
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
                @JsonProperty("payload") @ExcludeMissing payload: JsonValue = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<RecordType> = JsonMissing.of(),
            ) : this(id, eventType, occurredAt, payload, recordType, mutableMapOf())

            /**
             * Identifies the type of resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The type of event being delivered.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<String> = eventType.getOptional("event_type")

            /**
             * ISO 8601 datetime of when the event occurred.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun occurredAt(): Optional<OffsetDateTime> = occurredAt.getOptional("occurred_at")

            @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonValue = payload

            /**
             * Identifies the type of the resource.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_type")
            @ExcludeMissing
            fun _eventType(): JsonField<String> = eventType

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
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /** Returns a mutable builder for constructing an instance of [Webhook]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Webhook]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var eventType: JsonField<String> = JsonMissing.of()
                private var occurredAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var payload: JsonValue = JsonMissing.of()
                private var recordType: JsonField<RecordType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(webhook: Webhook) = apply {
                    id = webhook.id
                    eventType = webhook.eventType
                    occurredAt = webhook.occurredAt
                    payload = webhook.payload
                    recordType = webhook.recordType
                    additionalProperties = webhook.additionalProperties.toMutableMap()
                }

                /** Identifies the type of resource. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The type of event being delivered. */
                fun eventType(eventType: String) = eventType(JsonField.of(eventType))

                /**
                 * Sets [Builder.eventType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

                /** ISO 8601 datetime of when the event occurred. */
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

                fun payload(payload: JsonValue) = apply { this.payload = payload }

                /** Identifies the type of the resource. */
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
                 * Returns an immutable instance of [Webhook].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Webhook =
                    Webhook(
                        id,
                        eventType,
                        occurredAt,
                        payload,
                        recordType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Webhook = apply {
                if (validated) {
                    return@apply
                }

                id()
                eventType()
                occurredAt()
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
                    (if (eventType.asKnown().isPresent) 1 else 0) +
                    (if (occurredAt.asKnown().isPresent) 1 else 0) +
                    (recordType.asKnown().getOrNull()?.validity() ?: 0)

            /** Identifies the type of the resource. */
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

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

                return other is Webhook &&
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
                "Webhook{id=$id, eventType=$eventType, occurredAt=$occurredAt, payload=$payload, recordType=$recordType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                attempts == other.attempts &&
                finishedAt == other.finishedAt &&
                recordType == other.recordType &&
                startedAt == other.startedAt &&
                status == other.status &&
                userId == other.userId &&
                webhook == other.webhook &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                attempts,
                finishedAt,
                recordType,
                startedAt,
                status,
                userId,
                webhook,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, attempts=$attempts, finishedAt=$finishedAt, recordType=$recordType, startedAt=$startedAt, status=$status, userId=$userId, webhook=$webhook, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pageNumber: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val totalResults: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_results")
            @ExcludeMissing
            totalResults: JsonField<Long> = JsonMissing.of(),
        ) : this(pageNumber, pageSize, totalPages, totalResults, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageNumber(): Optional<Long> = pageNumber.getOptional("page_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalPages(): Optional<Long> = totalPages.getOptional("total_pages")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalResults(): Optional<Long> = totalResults.getOptional("total_results")

        /**
         * Returns the raw JSON value of [pageNumber].
         *
         * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Long> = pageNumber

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

        /**
         * Returns the raw JSON value of [totalResults].
         *
         * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_results")
        @ExcludeMissing
        fun _totalResults(): JsonField<Long> = totalResults

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var pageNumber: JsonField<Long> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var totalResults: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                pageNumber = meta.pageNumber
                pageSize = meta.pageSize
                totalPages = meta.totalPages
                totalResults = meta.totalResults
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

            /**
             * Sets [Builder.pageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

            fun totalResults(totalResults: Long) = totalResults(JsonField.of(totalResults))

            /**
             * Sets [Builder.totalResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalResults] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalResults(totalResults: JsonField<Long>) = apply {
                this.totalResults = totalResults
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
             */
            fun build(): Meta =
                Meta(
                    pageNumber,
                    pageSize,
                    totalPages,
                    totalResults,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            pageNumber()
            pageSize()
            totalPages()
            totalResults()
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
            (if (pageNumber.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (totalPages.asKnown().isPresent) 1 else 0) +
                (if (totalResults.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                pageNumber == other.pageNumber &&
                pageSize == other.pageSize &&
                totalPages == other.totalPages &&
                totalResults == other.totalResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pageNumber, pageSize, totalPages, totalResults, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{pageNumber=$pageNumber, pageSize=$pageSize, totalPages=$totalPages, totalResults=$totalResults, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookDeliveryListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookDeliveryListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
