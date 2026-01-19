// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Synchronously create a Room. */
class RoomCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Enable or disable recording for that room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableRecording(): Optional<Boolean> = body.enableRecording()

    /**
     * The maximum amount of participants allowed in a room. If new participants try to join after
     * that limit is reached, their request will be rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParticipants(): Optional<Long> = body.maxParticipants()

    /**
     * The unique (within the Telnyx account scope) name of the room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniqueName(): Optional<String> = body.uniqueName()

    /**
     * The failover URL where webhooks related to this room will be sent if sending to the primary
     * URL fails. Must include a scheme, such as 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventFailoverUrl(): Optional<String> = body.webhookEventFailoverUrl()

    /**
     * The URL where webhooks related to this room will be sent. Must include a scheme, such as
     * 'https'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventUrl(): Optional<String> = body.webhookEventUrl()

    /**
     * Specifies how many seconds to wait before timing out a webhook.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookTimeoutSecs(): Optional<Long> = body.webhookTimeoutSecs()

    /**
     * Returns the raw JSON value of [enableRecording].
     *
     * Unlike [enableRecording], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enableRecording(): JsonField<Boolean> = body._enableRecording()

    /**
     * Returns the raw JSON value of [maxParticipants].
     *
     * Unlike [maxParticipants], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxParticipants(): JsonField<Long> = body._maxParticipants()

    /**
     * Returns the raw JSON value of [uniqueName].
     *
     * Unlike [uniqueName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uniqueName(): JsonField<String> = body._uniqueName()

    /**
     * Returns the raw JSON value of [webhookEventFailoverUrl].
     *
     * Unlike [webhookEventFailoverUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _webhookEventFailoverUrl(): JsonField<String> = body._webhookEventFailoverUrl()

    /**
     * Returns the raw JSON value of [webhookEventUrl].
     *
     * Unlike [webhookEventUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookEventUrl(): JsonField<String> = body._webhookEventUrl()

    /**
     * Returns the raw JSON value of [webhookTimeoutSecs].
     *
     * Unlike [webhookTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookTimeoutSecs(): JsonField<Long> = body._webhookTimeoutSecs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RoomCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RoomCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoomCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(roomCreateParams: RoomCreateParams) = apply {
            body = roomCreateParams.body.toBuilder()
            additionalHeaders = roomCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = roomCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [enableRecording]
         * - [maxParticipants]
         * - [uniqueName]
         * - [webhookEventFailoverUrl]
         * - [webhookEventUrl]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Enable or disable recording for that room. */
        fun enableRecording(enableRecording: Boolean) = apply {
            body.enableRecording(enableRecording)
        }

        /**
         * Sets [Builder.enableRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableRecording] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableRecording(enableRecording: JsonField<Boolean>) = apply {
            body.enableRecording(enableRecording)
        }

        /**
         * The maximum amount of participants allowed in a room. If new participants try to join
         * after that limit is reached, their request will be rejected.
         */
        fun maxParticipants(maxParticipants: Long) = apply { body.maxParticipants(maxParticipants) }

        /**
         * Sets [Builder.maxParticipants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxParticipants] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxParticipants(maxParticipants: JsonField<Long>) = apply {
            body.maxParticipants(maxParticipants)
        }

        /** The unique (within the Telnyx account scope) name of the room. */
        fun uniqueName(uniqueName: String) = apply { body.uniqueName(uniqueName) }

        /**
         * Sets [Builder.uniqueName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniqueName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uniqueName(uniqueName: JsonField<String>) = apply { body.uniqueName(uniqueName) }

        /**
         * The failover URL where webhooks related to this room will be sent if sending to the
         * primary URL fails. Must include a scheme, such as 'https'.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: String) = apply {
            body.webhookEventFailoverUrl(webhookEventFailoverUrl)
        }

        /**
         * Sets [Builder.webhookEventFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventFailoverUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: JsonField<String>) = apply {
            body.webhookEventFailoverUrl(webhookEventFailoverUrl)
        }

        /**
         * The URL where webhooks related to this room will be sent. Must include a scheme, such as
         * 'https'.
         */
        fun webhookEventUrl(webhookEventUrl: String) = apply {
            body.webhookEventUrl(webhookEventUrl)
        }

        /**
         * Sets [Builder.webhookEventUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookEventUrl(webhookEventUrl: JsonField<String>) = apply {
            body.webhookEventUrl(webhookEventUrl)
        }

        /** Specifies how many seconds to wait before timing out a webhook. */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Long) = apply {
            body.webhookTimeoutSecs(webhookTimeoutSecs)
        }

        /**
         * Sets [Builder.webhookTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookTimeoutSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: JsonField<Long>) = apply {
            body.webhookTimeoutSecs(webhookTimeoutSecs)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [RoomCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoomCreateParams =
            RoomCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enableRecording: JsonField<Boolean>,
        private val maxParticipants: JsonField<Long>,
        private val uniqueName: JsonField<String>,
        private val webhookEventFailoverUrl: JsonField<String>,
        private val webhookEventUrl: JsonField<String>,
        private val webhookTimeoutSecs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enable_recording")
            @ExcludeMissing
            enableRecording: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("max_participants")
            @ExcludeMissing
            maxParticipants: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("unique_name")
            @ExcludeMissing
            uniqueName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_event_failover_url")
            @ExcludeMissing
            webhookEventFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_event_url")
            @ExcludeMissing
            webhookEventUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_timeout_secs")
            @ExcludeMissing
            webhookTimeoutSecs: JsonField<Long> = JsonMissing.of(),
        ) : this(
            enableRecording,
            maxParticipants,
            uniqueName,
            webhookEventFailoverUrl,
            webhookEventUrl,
            webhookTimeoutSecs,
            mutableMapOf(),
        )

        /**
         * Enable or disable recording for that room.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableRecording(): Optional<Boolean> = enableRecording.getOptional("enable_recording")

        /**
         * The maximum amount of participants allowed in a room. If new participants try to join
         * after that limit is reached, their request will be rejected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxParticipants(): Optional<Long> = maxParticipants.getOptional("max_participants")

        /**
         * The unique (within the Telnyx account scope) name of the room.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uniqueName(): Optional<String> = uniqueName.getOptional("unique_name")

        /**
         * The failover URL where webhooks related to this room will be sent if sending to the
         * primary URL fails. Must include a scheme, such as 'https'.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookEventFailoverUrl(): Optional<String> =
            webhookEventFailoverUrl.getOptional("webhook_event_failover_url")

        /**
         * The URL where webhooks related to this room will be sent. Must include a scheme, such as
         * 'https'.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookEventUrl(): Optional<String> = webhookEventUrl.getOptional("webhook_event_url")

        /**
         * Specifies how many seconds to wait before timing out a webhook.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookTimeoutSecs(): Optional<Long> =
            webhookTimeoutSecs.getOptional("webhook_timeout_secs")

        /**
         * Returns the raw JSON value of [enableRecording].
         *
         * Unlike [enableRecording], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enable_recording")
        @ExcludeMissing
        fun _enableRecording(): JsonField<Boolean> = enableRecording

        /**
         * Returns the raw JSON value of [maxParticipants].
         *
         * Unlike [maxParticipants], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_participants")
        @ExcludeMissing
        fun _maxParticipants(): JsonField<Long> = maxParticipants

        /**
         * Returns the raw JSON value of [uniqueName].
         *
         * Unlike [uniqueName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unique_name")
        @ExcludeMissing
        fun _uniqueName(): JsonField<String> = uniqueName

        /**
         * Returns the raw JSON value of [webhookEventFailoverUrl].
         *
         * Unlike [webhookEventFailoverUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_event_failover_url")
        @ExcludeMissing
        fun _webhookEventFailoverUrl(): JsonField<String> = webhookEventFailoverUrl

        /**
         * Returns the raw JSON value of [webhookEventUrl].
         *
         * Unlike [webhookEventUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_event_url")
        @ExcludeMissing
        fun _webhookEventUrl(): JsonField<String> = webhookEventUrl

        /**
         * Returns the raw JSON value of [webhookTimeoutSecs].
         *
         * Unlike [webhookTimeoutSecs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_timeout_secs")
        @ExcludeMissing
        fun _webhookTimeoutSecs(): JsonField<Long> = webhookTimeoutSecs

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var enableRecording: JsonField<Boolean> = JsonMissing.of()
            private var maxParticipants: JsonField<Long> = JsonMissing.of()
            private var uniqueName: JsonField<String> = JsonMissing.of()
            private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookEventUrl: JsonField<String> = JsonMissing.of()
            private var webhookTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                enableRecording = body.enableRecording
                maxParticipants = body.maxParticipants
                uniqueName = body.uniqueName
                webhookEventFailoverUrl = body.webhookEventFailoverUrl
                webhookEventUrl = body.webhookEventUrl
                webhookTimeoutSecs = body.webhookTimeoutSecs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Enable or disable recording for that room. */
            fun enableRecording(enableRecording: Boolean) =
                enableRecording(JsonField.of(enableRecording))

            /**
             * Sets [Builder.enableRecording] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableRecording] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableRecording(enableRecording: JsonField<Boolean>) = apply {
                this.enableRecording = enableRecording
            }

            /**
             * The maximum amount of participants allowed in a room. If new participants try to join
             * after that limit is reached, their request will be rejected.
             */
            fun maxParticipants(maxParticipants: Long) =
                maxParticipants(JsonField.of(maxParticipants))

            /**
             * Sets [Builder.maxParticipants] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxParticipants] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxParticipants(maxParticipants: JsonField<Long>) = apply {
                this.maxParticipants = maxParticipants
            }

            /** The unique (within the Telnyx account scope) name of the room. */
            fun uniqueName(uniqueName: String) = uniqueName(JsonField.of(uniqueName))

            /**
             * Sets [Builder.uniqueName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniqueName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uniqueName(uniqueName: JsonField<String>) = apply { this.uniqueName = uniqueName }

            /**
             * The failover URL where webhooks related to this room will be sent if sending to the
             * primary URL fails. Must include a scheme, such as 'https'.
             */
            fun webhookEventFailoverUrl(webhookEventFailoverUrl: String) =
                webhookEventFailoverUrl(JsonField.of(webhookEventFailoverUrl))

            /**
             * Sets [Builder.webhookEventFailoverUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookEventFailoverUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun webhookEventFailoverUrl(webhookEventFailoverUrl: JsonField<String>) = apply {
                this.webhookEventFailoverUrl = webhookEventFailoverUrl
            }

            /**
             * The URL where webhooks related to this room will be sent. Must include a scheme, such
             * as 'https'.
             */
            fun webhookEventUrl(webhookEventUrl: String) =
                webhookEventUrl(JsonField.of(webhookEventUrl))

            /**
             * Sets [Builder.webhookEventUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookEventUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookEventUrl(webhookEventUrl: JsonField<String>) = apply {
                this.webhookEventUrl = webhookEventUrl
            }

            /** Specifies how many seconds to wait before timing out a webhook. */
            fun webhookTimeoutSecs(webhookTimeoutSecs: Long) =
                webhookTimeoutSecs(JsonField.of(webhookTimeoutSecs))

            /**
             * Sets [Builder.webhookTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookTimeoutSecs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookTimeoutSecs(webhookTimeoutSecs: JsonField<Long>) = apply {
                this.webhookTimeoutSecs = webhookTimeoutSecs
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    enableRecording,
                    maxParticipants,
                    uniqueName,
                    webhookEventFailoverUrl,
                    webhookEventUrl,
                    webhookTimeoutSecs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            enableRecording()
            maxParticipants()
            uniqueName()
            webhookEventFailoverUrl()
            webhookEventUrl()
            webhookTimeoutSecs()
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
            (if (enableRecording.asKnown().isPresent) 1 else 0) +
                (if (maxParticipants.asKnown().isPresent) 1 else 0) +
                (if (uniqueName.asKnown().isPresent) 1 else 0) +
                (if (webhookEventFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookEventUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookTimeoutSecs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                enableRecording == other.enableRecording &&
                maxParticipants == other.maxParticipants &&
                uniqueName == other.uniqueName &&
                webhookEventFailoverUrl == other.webhookEventFailoverUrl &&
                webhookEventUrl == other.webhookEventUrl &&
                webhookTimeoutSecs == other.webhookTimeoutSecs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                enableRecording,
                maxParticipants,
                uniqueName,
                webhookEventFailoverUrl,
                webhookEventUrl,
                webhookTimeoutSecs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{enableRecording=$enableRecording, maxParticipants=$maxParticipants, uniqueName=$uniqueName, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, webhookTimeoutSecs=$webhookTimeoutSecs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoomCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RoomCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
