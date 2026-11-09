// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Sends a WhatsApp message using a Telnyx WhatsApp-enabled number. The message body, interactive
 * elements, media, location, and reaction content are specified in the `whatsapp_message` field.
 * Delivery progress and final disposition are reported asynchronously through messaging webhooks.
 */
class MessageWhatsappParams
private constructor(
    private val idempotencyKey: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /**
     * Phone number in +E.164 format associated with Whatsapp account
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = body.from()

    /**
     * Recipient phone number in +E.164 format, or the business-scoped user ID (BSUID) of a WhatsApp
     * user who hides their phone number, for example `US.13491208655302741918`. Authentication
     * templates cannot be sent to a BSUID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun whatsappMessage(): WhatsappMessage = body.whatsappMessage()

    /**
     * Messaging profile ID - required if the 'from' number is not SMS-enabled
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> = body.messagingProfileId()

    /**
     * Message type - must be set to "WHATSAPP"
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = body.type()

    /**
     * The URL where webhooks related to this message will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

    /**
     * Returns the raw JSON value of [whatsappMessage].
     *
     * Unlike [whatsappMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _whatsappMessage(): JsonField<WhatsappMessage> = body._whatsappMessage()

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messagingProfileId(): JsonField<String> = body._messagingProfileId()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageWhatsappParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * .whatsappMessage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageWhatsappParams]. */
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageWhatsappParams: MessageWhatsappParams) = apply {
            idempotencyKey = messageWhatsappParams.idempotencyKey
            body = messageWhatsappParams.body.toBuilder()
            additionalHeaders = messageWhatsappParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageWhatsappParams.additionalQueryParams.toBuilder()
        }

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [from]
         * - [to]
         * - [whatsappMessage]
         * - [messagingProfileId]
         * - [type]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Phone number in +E.164 format associated with Whatsapp account */
        fun from(from: String) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { body.from(from) }

        /**
         * Recipient phone number in +E.164 format, or the business-scoped user ID (BSUID) of a
         * WhatsApp user who hides their phone number, for example `US.13491208655302741918`.
         * Authentication templates cannot be sent to a BSUID.
         */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        fun whatsappMessage(whatsappMessage: WhatsappMessage) = apply {
            body.whatsappMessage(whatsappMessage)
        }

        /**
         * Sets [Builder.whatsappMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whatsappMessage] with a well-typed [WhatsappMessage]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun whatsappMessage(whatsappMessage: JsonField<WhatsappMessage>) = apply {
            body.whatsappMessage(whatsappMessage)
        }

        /** Messaging profile ID - required if the 'from' number is not SMS-enabled */
        fun messagingProfileId(messagingProfileId: String) = apply {
            body.messagingProfileId(messagingProfileId)
        }

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            body.messagingProfileId(messagingProfileId)
        }

        /** Message type - must be set to "WHATSAPP" */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** The URL where webhooks related to this message will be sent. */
        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [MessageWhatsappParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * .whatsappMessage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageWhatsappParams =
            MessageWhatsappParams(
                idempotencyKey,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers =
        com.telnyx.sdk.core.http.Headers.builder()
            .apply {
                idempotencyKey?.let { put("Idempotency-Key", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val from: JsonField<String>,
        private val to: JsonField<String>,
        private val whatsappMessage: JsonField<WhatsappMessage>,
        private val messagingProfileId: JsonField<String>,
        private val type: JsonField<Type>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("whatsapp_message")
            @ExcludeMissing
            whatsappMessage: JsonField<WhatsappMessage> = JsonMissing.of(),
            @JsonProperty("messaging_profile_id")
            @ExcludeMissing
            messagingProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(from, to, whatsappMessage, messagingProfileId, type, webhookUrl, mutableMapOf())

        /**
         * Phone number in +E.164 format associated with Whatsapp account
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("from")

        /**
         * Recipient phone number in +E.164 format, or the business-scoped user ID (BSUID) of a
         * WhatsApp user who hides their phone number, for example `US.13491208655302741918`.
         * Authentication templates cannot be sent to a BSUID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("to")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun whatsappMessage(): WhatsappMessage = whatsappMessage.getRequired("whatsapp_message")

        /**
         * Messaging profile ID - required if the 'from' number is not SMS-enabled
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messagingProfileId(): Optional<String> =
            messagingProfileId.getOptional("messaging_profile_id")

        /**
         * Message type - must be set to "WHATSAPP"
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * The URL where webhooks related to this message will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [whatsappMessage].
         *
         * Unlike [whatsappMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("whatsapp_message")
        @ExcludeMissing
        fun _whatsappMessage(): JsonField<WhatsappMessage> = whatsappMessage

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .from()
             * .to()
             * .whatsappMessage()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var from: JsonField<String>? = null
            private var to: JsonField<String>? = null
            private var whatsappMessage: JsonField<WhatsappMessage>? = null
            private var messagingProfileId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                from = body.from
                to = body.to
                whatsappMessage = body.whatsappMessage
                messagingProfileId = body.messagingProfileId
                type = body.type
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Phone number in +E.164 format associated with Whatsapp account */
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
             * Recipient phone number in +E.164 format, or the business-scoped user ID (BSUID) of a
             * WhatsApp user who hides their phone number, for example `US.13491208655302741918`.
             * Authentication templates cannot be sent to a BSUID.
             */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            fun whatsappMessage(whatsappMessage: WhatsappMessage) =
                whatsappMessage(JsonField.of(whatsappMessage))

            /**
             * Sets [Builder.whatsappMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whatsappMessage] with a well-typed [WhatsappMessage]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun whatsappMessage(whatsappMessage: JsonField<WhatsappMessage>) = apply {
                this.whatsappMessage = whatsappMessage
            }

            /** Messaging profile ID - required if the 'from' number is not SMS-enabled */
            fun messagingProfileId(messagingProfileId: String) =
                messagingProfileId(JsonField.of(messagingProfileId))

            /**
             * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
                this.messagingProfileId = messagingProfileId
            }

            /** Message type - must be set to "WHATSAPP" */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The URL where webhooks related to this message will be sent. */
            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             *
             * The following fields are required:
             * ```java
             * .from()
             * .to()
             * .whatsappMessage()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("from", from),
                    checkRequired("to", to),
                    checkRequired("whatsappMessage", whatsappMessage),
                    messagingProfileId,
                    type,
                    webhookUrl,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            from()
            to()
            whatsappMessage().validate()
            messagingProfileId()
            type().ifPresent { it.validate() }
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
            (if (from.asKnown().isPresent) 1 else 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (whatsappMessage.asKnown().getOrNull()?.validity() ?: 0) +
                (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                from == other.from &&
                to == other.to &&
                whatsappMessage == other.whatsappMessage &&
                messagingProfileId == other.messagingProfileId &&
                type == other.type &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                from,
                to,
                whatsappMessage,
                messagingProfileId,
                type,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{from=$from, to=$to, whatsappMessage=$whatsappMessage, messagingProfileId=$messagingProfileId, type=$type, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    class WhatsappMessage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audio: JsonField<WhatsappMedia>,
        private val bizOpaqueCallbackData: JsonField<String>,
        private val contacts: JsonField<List<Contact>>,
        private val document: JsonField<WhatsappMedia>,
        private val image: JsonField<WhatsappMedia>,
        private val interactive: JsonField<Interactive>,
        private val location: JsonField<WhatsappLocation>,
        private val reaction: JsonField<WhatsappReaction>,
        private val sticker: JsonField<WhatsappMedia>,
        private val template: JsonField<Template>,
        private val text: JsonField<Text>,
        private val type: JsonField<Type>,
        private val video: JsonField<WhatsappMedia>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio")
            @ExcludeMissing
            audio: JsonField<WhatsappMedia> = JsonMissing.of(),
            @JsonProperty("biz_opaque_callback_data")
            @ExcludeMissing
            bizOpaqueCallbackData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contacts")
            @ExcludeMissing
            contacts: JsonField<List<Contact>> = JsonMissing.of(),
            @JsonProperty("document")
            @ExcludeMissing
            document: JsonField<WhatsappMedia> = JsonMissing.of(),
            @JsonProperty("image")
            @ExcludeMissing
            image: JsonField<WhatsappMedia> = JsonMissing.of(),
            @JsonProperty("interactive")
            @ExcludeMissing
            interactive: JsonField<Interactive> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<WhatsappLocation> = JsonMissing.of(),
            @JsonProperty("reaction")
            @ExcludeMissing
            reaction: JsonField<WhatsappReaction> = JsonMissing.of(),
            @JsonProperty("sticker")
            @ExcludeMissing
            sticker: JsonField<WhatsappMedia> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<Template> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<Text> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("video")
            @ExcludeMissing
            video: JsonField<WhatsappMedia> = JsonMissing.of(),
        ) : this(
            audio,
            bizOpaqueCallbackData,
            contacts,
            document,
            image,
            interactive,
            location,
            reaction,
            sticker,
            template,
            text,
            type,
            video,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audio(): Optional<WhatsappMedia> = audio.getOptional("audio")

        /**
         * custom data to return with status update
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bizOpaqueCallbackData(): Optional<String> =
            bizOpaqueCallbackData.getOptional("biz_opaque_callback_data")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contacts(): Optional<List<Contact>> = contacts.getOptional("contacts")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun document(): Optional<WhatsappMedia> = document.getOptional("document")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun image(): Optional<WhatsappMedia> = image.getOptional("image")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interactive(): Optional<Interactive> = interactive.getOptional("interactive")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun location(): Optional<WhatsappLocation> = location.getOptional("location")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reaction(): Optional<WhatsappReaction> = reaction.getOptional("reaction")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sticker(): Optional<WhatsappMedia> = sticker.getOptional("sticker")

        /**
         * Template message object. Provide either template_id or name + language to identify the
         * template.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun template(): Optional<Template> = template.getOptional("template")

        /**
         * Text message content. Can only be sent within a 24-hour customer service window.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<Text> = text.getOptional("text")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun video(): Optional<WhatsappMedia> = video.getOptional("video")

        /**
         * Returns the raw JSON value of [audio].
         *
         * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<WhatsappMedia> = audio

        /**
         * Returns the raw JSON value of [bizOpaqueCallbackData].
         *
         * Unlike [bizOpaqueCallbackData], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("biz_opaque_callback_data")
        @ExcludeMissing
        fun _bizOpaqueCallbackData(): JsonField<String> = bizOpaqueCallbackData

        /**
         * Returns the raw JSON value of [contacts].
         *
         * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contacts")
        @ExcludeMissing
        fun _contacts(): JsonField<List<Contact>> = contacts

        /**
         * Returns the raw JSON value of [document].
         *
         * Unlike [document], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document")
        @ExcludeMissing
        fun _document(): JsonField<WhatsappMedia> = document

        /**
         * Returns the raw JSON value of [image].
         *
         * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<WhatsappMedia> = image

        /**
         * Returns the raw JSON value of [interactive].
         *
         * Unlike [interactive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("interactive")
        @ExcludeMissing
        fun _interactive(): JsonField<Interactive> = interactive

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location")
        @ExcludeMissing
        fun _location(): JsonField<WhatsappLocation> = location

        /**
         * Returns the raw JSON value of [reaction].
         *
         * Unlike [reaction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reaction")
        @ExcludeMissing
        fun _reaction(): JsonField<WhatsappReaction> = reaction

        /**
         * Returns the raw JSON value of [sticker].
         *
         * Unlike [sticker], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sticker") @ExcludeMissing fun _sticker(): JsonField<WhatsappMedia> = sticker

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<Template> = template

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<Text> = text

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [video].
         *
         * Unlike [video], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("video") @ExcludeMissing fun _video(): JsonField<WhatsappMedia> = video

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

            /** Returns a mutable builder for constructing an instance of [WhatsappMessage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WhatsappMessage]. */
        class Builder internal constructor() {

            private var audio: JsonField<WhatsappMedia> = JsonMissing.of()
            private var bizOpaqueCallbackData: JsonField<String> = JsonMissing.of()
            private var contacts: JsonField<MutableList<Contact>>? = null
            private var document: JsonField<WhatsappMedia> = JsonMissing.of()
            private var image: JsonField<WhatsappMedia> = JsonMissing.of()
            private var interactive: JsonField<Interactive> = JsonMissing.of()
            private var location: JsonField<WhatsappLocation> = JsonMissing.of()
            private var reaction: JsonField<WhatsappReaction> = JsonMissing.of()
            private var sticker: JsonField<WhatsappMedia> = JsonMissing.of()
            private var template: JsonField<Template> = JsonMissing.of()
            private var text: JsonField<Text> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var video: JsonField<WhatsappMedia> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(whatsappMessage: WhatsappMessage) = apply {
                audio = whatsappMessage.audio
                bizOpaqueCallbackData = whatsappMessage.bizOpaqueCallbackData
                contacts = whatsappMessage.contacts.map { it.toMutableList() }
                document = whatsappMessage.document
                image = whatsappMessage.image
                interactive = whatsappMessage.interactive
                location = whatsappMessage.location
                reaction = whatsappMessage.reaction
                sticker = whatsappMessage.sticker
                template = whatsappMessage.template
                text = whatsappMessage.text
                type = whatsappMessage.type
                video = whatsappMessage.video
                additionalProperties = whatsappMessage.additionalProperties.toMutableMap()
            }

            fun audio(audio: WhatsappMedia) = audio(JsonField.of(audio))

            /**
             * Sets [Builder.audio] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audio] with a well-typed [WhatsappMedia] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audio(audio: JsonField<WhatsappMedia>) = apply { this.audio = audio }

            /** custom data to return with status update */
            fun bizOpaqueCallbackData(bizOpaqueCallbackData: String) =
                bizOpaqueCallbackData(JsonField.of(bizOpaqueCallbackData))

            /**
             * Sets [Builder.bizOpaqueCallbackData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bizOpaqueCallbackData] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun bizOpaqueCallbackData(bizOpaqueCallbackData: JsonField<String>) = apply {
                this.bizOpaqueCallbackData = bizOpaqueCallbackData
            }

            fun contacts(contacts: List<Contact>) = contacts(JsonField.of(contacts))

            /**
             * Sets [Builder.contacts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contacts] with a well-typed `List<Contact>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contacts(contacts: JsonField<List<Contact>>) = apply {
                this.contacts = contacts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Contact] to [contacts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContact(contact: Contact) = apply {
                contacts =
                    (contacts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contacts", it).add(contact)
                    }
            }

            fun document(document: WhatsappMedia) = document(JsonField.of(document))

            /**
             * Sets [Builder.document] to an arbitrary JSON value.
             *
             * You should usually call [Builder.document] with a well-typed [WhatsappMedia] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun document(document: JsonField<WhatsappMedia>) = apply { this.document = document }

            fun image(image: WhatsappMedia) = image(JsonField.of(image))

            /**
             * Sets [Builder.image] to an arbitrary JSON value.
             *
             * You should usually call [Builder.image] with a well-typed [WhatsappMedia] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun image(image: JsonField<WhatsappMedia>) = apply { this.image = image }

            fun interactive(interactive: Interactive) = interactive(JsonField.of(interactive))

            /**
             * Sets [Builder.interactive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interactive] with a well-typed [Interactive] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interactive(interactive: JsonField<Interactive>) = apply {
                this.interactive = interactive
            }

            fun location(location: WhatsappLocation) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [WhatsappLocation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<WhatsappLocation>) = apply { this.location = location }

            fun reaction(reaction: WhatsappReaction) = reaction(JsonField.of(reaction))

            /**
             * Sets [Builder.reaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reaction] with a well-typed [WhatsappReaction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reaction(reaction: JsonField<WhatsappReaction>) = apply { this.reaction = reaction }

            fun sticker(sticker: WhatsappMedia) = sticker(JsonField.of(sticker))

            /**
             * Sets [Builder.sticker] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sticker] with a well-typed [WhatsappMedia] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sticker(sticker: JsonField<WhatsappMedia>) = apply { this.sticker = sticker }

            /**
             * Template message object. Provide either template_id or name + language to identify
             * the template.
             */
            fun template(template: Template) = template(JsonField.of(template))

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [Template] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<Template>) = apply { this.template = template }

            /** Text message content. Can only be sent within a 24-hour customer service window. */
            fun text(text: Text) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [Text] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<Text>) = apply { this.text = text }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun video(video: WhatsappMedia) = video(JsonField.of(video))

            /**
             * Sets [Builder.video] to an arbitrary JSON value.
             *
             * You should usually call [Builder.video] with a well-typed [WhatsappMedia] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun video(video: JsonField<WhatsappMedia>) = apply { this.video = video }

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
             * Returns an immutable instance of [WhatsappMessage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WhatsappMessage =
                WhatsappMessage(
                    audio,
                    bizOpaqueCallbackData,
                    (contacts ?: JsonMissing.of()).map { it.toImmutable() },
                    document,
                    image,
                    interactive,
                    location,
                    reaction,
                    sticker,
                    template,
                    text,
                    type,
                    video,
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
        fun validate(): WhatsappMessage = apply {
            if (validated) {
                return@apply
            }

            audio().ifPresent { it.validate() }
            bizOpaqueCallbackData()
            contacts().ifPresent { it.forEach { it.validate() } }
            document().ifPresent { it.validate() }
            image().ifPresent { it.validate() }
            interactive().ifPresent { it.validate() }
            location().ifPresent { it.validate() }
            reaction().ifPresent { it.validate() }
            sticker().ifPresent { it.validate() }
            template().ifPresent { it.validate() }
            text().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
            video().ifPresent { it.validate() }
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
            (audio.asKnown().getOrNull()?.validity() ?: 0) +
                (if (bizOpaqueCallbackData.asKnown().isPresent) 1 else 0) +
                (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (document.asKnown().getOrNull()?.validity() ?: 0) +
                (image.asKnown().getOrNull()?.validity() ?: 0) +
                (interactive.asKnown().getOrNull()?.validity() ?: 0) +
                (location.asKnown().getOrNull()?.validity() ?: 0) +
                (reaction.asKnown().getOrNull()?.validity() ?: 0) +
                (sticker.asKnown().getOrNull()?.validity() ?: 0) +
                (template.asKnown().getOrNull()?.validity() ?: 0) +
                (text.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (video.asKnown().getOrNull()?.validity() ?: 0)

        class Contact
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val addresses: JsonField<List<Address>>,
            private val birthday: JsonField<String>,
            private val emails: JsonField<List<Email>>,
            private val name: JsonField<Name>,
            private val org: JsonField<Org>,
            private val phones: JsonField<List<Phone>>,
            private val urls: JsonField<List<Url>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("addresses")
                @ExcludeMissing
                addresses: JsonField<List<Address>> = JsonMissing.of(),
                @JsonProperty("birthday")
                @ExcludeMissing
                birthday: JsonField<String> = JsonMissing.of(),
                @JsonProperty("emails")
                @ExcludeMissing
                emails: JsonField<List<Email>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
                @JsonProperty("org") @ExcludeMissing org: JsonField<Org> = JsonMissing.of(),
                @JsonProperty("phones")
                @ExcludeMissing
                phones: JsonField<List<Phone>> = JsonMissing.of(),
                @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<Url>> = JsonMissing.of(),
            ) : this(addresses, birthday, emails, name, org, phones, urls, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun addresses(): Optional<List<Address>> = addresses.getOptional("addresses")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun birthday(): Optional<String> = birthday.getOptional("birthday")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun emails(): Optional<List<Email>> = emails.getOptional("emails")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<Name> = name.getOptional("name")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun org(): Optional<Org> = org.getOptional("org")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phones(): Optional<List<Phone>> = phones.getOptional("phones")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun urls(): Optional<List<Url>> = urls.getOptional("urls")

            /**
             * Returns the raw JSON value of [addresses].
             *
             * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("addresses")
            @ExcludeMissing
            fun _addresses(): JsonField<List<Address>> = addresses

            /**
             * Returns the raw JSON value of [birthday].
             *
             * Unlike [birthday], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("birthday") @ExcludeMissing fun _birthday(): JsonField<String> = birthday

            /**
             * Returns the raw JSON value of [emails].
             *
             * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<Email>> = emails

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

            /**
             * Returns the raw JSON value of [org].
             *
             * Unlike [org], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("org") @ExcludeMissing fun _org(): JsonField<Org> = org

            /**
             * Returns the raw JSON value of [phones].
             *
             * Unlike [phones], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("phones") @ExcludeMissing fun _phones(): JsonField<List<Phone>> = phones

            /**
             * Returns the raw JSON value of [urls].
             *
             * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<Url>> = urls

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

                /** Returns a mutable builder for constructing an instance of [Contact]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contact]. */
            class Builder internal constructor() {

                private var addresses: JsonField<MutableList<Address>>? = null
                private var birthday: JsonField<String> = JsonMissing.of()
                private var emails: JsonField<MutableList<Email>>? = null
                private var name: JsonField<Name> = JsonMissing.of()
                private var org: JsonField<Org> = JsonMissing.of()
                private var phones: JsonField<MutableList<Phone>>? = null
                private var urls: JsonField<MutableList<Url>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contact: Contact) = apply {
                    addresses = contact.addresses.map { it.toMutableList() }
                    birthday = contact.birthday
                    emails = contact.emails.map { it.toMutableList() }
                    name = contact.name
                    org = contact.org
                    phones = contact.phones.map { it.toMutableList() }
                    urls = contact.urls.map { it.toMutableList() }
                    additionalProperties = contact.additionalProperties.toMutableMap()
                }

                fun addresses(addresses: List<Address>) = addresses(JsonField.of(addresses))

                /**
                 * Sets [Builder.addresses] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.addresses] with a well-typed `List<Address>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun addresses(addresses: JsonField<List<Address>>) = apply {
                    this.addresses = addresses.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Address] to [addresses].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAddress(address: Address) = apply {
                    addresses =
                        (addresses ?: JsonField.of(mutableListOf())).also {
                            checkKnown("addresses", it).add(address)
                        }
                }

                fun birthday(birthday: String) = birthday(JsonField.of(birthday))

                /**
                 * Sets [Builder.birthday] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.birthday] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun birthday(birthday: JsonField<String>) = apply { this.birthday = birthday }

                fun emails(emails: List<Email>) = emails(JsonField.of(emails))

                /**
                 * Sets [Builder.emails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.emails] with a well-typed `List<Email>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun emails(emails: JsonField<List<Email>>) = apply {
                    this.emails = emails.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Email] to [emails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEmail(email: Email) = apply {
                    emails =
                        (emails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("emails", it).add(email)
                        }
                }

                fun name(name: Name) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [Name] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<Name>) = apply { this.name = name }

                fun org(org: Org) = org(JsonField.of(org))

                /**
                 * Sets [Builder.org] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.org] with a well-typed [Org] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun org(org: JsonField<Org>) = apply { this.org = org }

                fun phones(phones: List<Phone>) = phones(JsonField.of(phones))

                /**
                 * Sets [Builder.phones] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phones] with a well-typed `List<Phone>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phones(phones: JsonField<List<Phone>>) = apply {
                    this.phones = phones.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Phone] to [phones].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPhone(phone: Phone) = apply {
                    phones =
                        (phones ?: JsonField.of(mutableListOf())).also {
                            checkKnown("phones", it).add(phone)
                        }
                }

                fun urls(urls: List<Url>) = urls(JsonField.of(urls))

                /**
                 * Sets [Builder.urls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.urls] with a well-typed `List<Url>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun urls(urls: JsonField<List<Url>>) = apply {
                    this.urls = urls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Url] to [urls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addUrl(url: Url) = apply {
                    urls =
                        (urls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("urls", it).add(url)
                        }
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
                 * Returns an immutable instance of [Contact].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Contact =
                    Contact(
                        (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                        birthday,
                        (emails ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        org,
                        (phones ?: JsonMissing.of()).map { it.toImmutable() },
                        (urls ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): Contact = apply {
                if (validated) {
                    return@apply
                }

                addresses().ifPresent { it.forEach { it.validate() } }
                birthday()
                emails().ifPresent { it.forEach { it.validate() } }
                name().ifPresent { it.validate() }
                org().ifPresent { it.validate() }
                phones().ifPresent { it.forEach { it.validate() } }
                urls().ifPresent { it.forEach { it.validate() } }
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
                (addresses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (birthday.asKnown().isPresent) 1 else 0) +
                    (emails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (name.asKnown().getOrNull()?.validity() ?: 0) +
                    (org.asKnown().getOrNull()?.validity() ?: 0) +
                    (phones.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (urls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Address
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val city: JsonField<String>,
                private val country: JsonField<String>,
                private val countryCode: JsonField<String>,
                private val state: JsonField<String>,
                private val street: JsonField<String>,
                private val type: JsonField<String>,
                private val zip: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("city")
                    @ExcludeMissing
                    city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("country")
                    @ExcludeMissing
                    country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("country_code")
                    @ExcludeMissing
                    countryCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("street")
                    @ExcludeMissing
                    street: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                ) : this(city, country, countryCode, state, street, type, zip, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun city(): Optional<String> = city.getOptional("city")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun country(): Optional<String> = country.getOptional("country")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun state(): Optional<String> = state.getOptional("state")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun street(): Optional<String> = street.getOptional("street")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun zip(): Optional<String> = zip.getOptional("zip")

                /**
                 * Returns the raw JSON value of [city].
                 *
                 * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /**
                 * Returns the raw JSON value of [country].
                 *
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
                 * Returns the raw JSON value of [state].
                 *
                 * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                /**
                 * Returns the raw JSON value of [street].
                 *
                 * Unlike [street], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                /**
                 * Returns the raw JSON value of [zip].
                 *
                 * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

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

                    /** Returns a mutable builder for constructing an instance of [Address]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Address]. */
                class Builder internal constructor() {

                    private var city: JsonField<String> = JsonMissing.of()
                    private var country: JsonField<String> = JsonMissing.of()
                    private var countryCode: JsonField<String> = JsonMissing.of()
                    private var state: JsonField<String> = JsonMissing.of()
                    private var street: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<String> = JsonMissing.of()
                    private var zip: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        city = address.city
                        country = address.country
                        countryCode = address.countryCode
                        state = address.state
                        street = address.street
                        type = address.type
                        zip = address.zip
                        additionalProperties = address.additionalProperties.toMutableMap()
                    }

                    fun city(city: String) = city(JsonField.of(city))

                    /**
                     * Sets [Builder.city] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.city] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * Sets [Builder.country] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.country] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

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

                    fun state(state: String) = state(JsonField.of(state))

                    /**
                     * Sets [Builder.state] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.state] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    fun street(street: String) = street(JsonField.of(street))

                    /**
                     * Sets [Builder.street] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.street] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun street(street: JsonField<String>) = apply { this.street = street }

                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    fun zip(zip: String) = zip(JsonField.of(zip))

                    /**
                     * Sets [Builder.zip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zip] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun zip(zip: JsonField<String>) = apply { this.zip = zip }

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
                     * Returns an immutable instance of [Address].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Address =
                        Address(
                            city,
                            country,
                            countryCode,
                            state,
                            street,
                            type,
                            zip,
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
                fun validate(): Address = apply {
                    if (validated) {
                        return@apply
                    }

                    city()
                    country()
                    countryCode()
                    state()
                    street()
                    type()
                    zip()
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
                    (if (city.asKnown().isPresent) 1 else 0) +
                        (if (country.asKnown().isPresent) 1 else 0) +
                        (if (countryCode.asKnown().isPresent) 1 else 0) +
                        (if (state.asKnown().isPresent) 1 else 0) +
                        (if (street.asKnown().isPresent) 1 else 0) +
                        (if (type.asKnown().isPresent) 1 else 0) +
                        (if (zip.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Address &&
                        city == other.city &&
                        country == other.country &&
                        countryCode == other.countryCode &&
                        state == other.state &&
                        street == other.street &&
                        type == other.type &&
                        zip == other.zip &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        city,
                        country,
                        countryCode,
                        state,
                        street,
                        type,
                        zip,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{city=$city, country=$country, countryCode=$countryCode, state=$state, street=$street, type=$type, zip=$zip, additionalProperties=$additionalProperties}"
            }

            class Email
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val email: JsonField<String>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(email, type, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun email(): Optional<String> = email.getOptional("email")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                    /** Returns a mutable builder for constructing an instance of [Email]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Email]. */
                class Builder internal constructor() {

                    private var email: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(email: Email) = apply {
                        this.email = email.email
                        type = email.type
                        additionalProperties = email.additionalProperties.toMutableMap()
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

                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                     * Returns an immutable instance of [Email].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Email = Email(email, type, additionalProperties.toMutableMap())
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
                fun validate(): Email = apply {
                    if (validated) {
                        return@apply
                    }

                    email()
                    type()
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
                        (if (type.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Email &&
                        email == other.email &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(email, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Email{email=$email, type=$type, additionalProperties=$additionalProperties}"
            }

            class Name
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val formattedName: JsonField<String>,
                private val firstName: JsonField<String>,
                private val lastName: JsonField<String>,
                private val middleName: JsonField<String>,
                private val prefix: JsonField<String>,
                private val suffix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("formatted_name")
                    @ExcludeMissing
                    formattedName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    firstName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    lastName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    middleName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("suffix")
                    @ExcludeMissing
                    suffix: JsonField<String> = JsonMissing.of(),
                ) : this(
                    formattedName,
                    firstName,
                    lastName,
                    middleName,
                    prefix,
                    suffix,
                    mutableMapOf(),
                )

                /**
                 * contact's full name as displayed in the message
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun formattedName(): String = formattedName.getRequired("formatted_name")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun firstName(): Optional<String> = firstName.getOptional("first_name")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun lastName(): Optional<String> = lastName.getOptional("last_name")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun middleName(): Optional<String> = middleName.getOptional("middle_name")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun suffix(): Optional<String> = suffix.getOptional("suffix")

                /**
                 * Returns the raw JSON value of [formattedName].
                 *
                 * Unlike [formattedName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("formatted_name")
                @ExcludeMissing
                fun _formattedName(): JsonField<String> = formattedName

                /**
                 * Returns the raw JSON value of [firstName].
                 *
                 * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Returns the raw JSON value of [lastName].
                 *
                 * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /**
                 * Returns the raw JSON value of [middleName].
                 *
                 * Unlike [middleName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("middle_name")
                @ExcludeMissing
                fun _middleName(): JsonField<String> = middleName

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                /**
                 * Returns the raw JSON value of [suffix].
                 *
                 * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

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
                     * Returns a mutable builder for constructing an instance of [Name].
                     *
                     * The following fields are required:
                     * ```java
                     * .formattedName()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Name]. */
                class Builder internal constructor() {

                    private var formattedName: JsonField<String>? = null
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var middleName: JsonField<String> = JsonMissing.of()
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var suffix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(name: Name) = apply {
                        formattedName = name.formattedName
                        firstName = name.firstName
                        lastName = name.lastName
                        middleName = name.middleName
                        prefix = name.prefix
                        suffix = name.suffix
                        additionalProperties = name.additionalProperties.toMutableMap()
                    }

                    /** contact's full name as displayed in the message */
                    fun formattedName(formattedName: String) =
                        formattedName(JsonField.of(formattedName))

                    /**
                     * Sets [Builder.formattedName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.formattedName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun formattedName(formattedName: JsonField<String>) = apply {
                        this.formattedName = formattedName
                    }

                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Sets [Builder.firstName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                    /**
                     * Sets [Builder.lastName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    fun middleName(middleName: String) = middleName(JsonField.of(middleName))

                    /**
                     * Sets [Builder.middleName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.middleName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun middleName(middleName: JsonField<String>) = apply {
                        this.middleName = middleName
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun suffix(suffix: String) = suffix(JsonField.of(suffix))

                    /**
                     * Sets [Builder.suffix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.suffix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

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
                     * Returns an immutable instance of [Name].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .formattedName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Name =
                        Name(
                            checkRequired("formattedName", formattedName),
                            firstName,
                            lastName,
                            middleName,
                            prefix,
                            suffix,
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
                fun validate(): Name = apply {
                    if (validated) {
                        return@apply
                    }

                    formattedName()
                    firstName()
                    lastName()
                    middleName()
                    prefix()
                    suffix()
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
                    (if (formattedName.asKnown().isPresent) 1 else 0) +
                        (if (firstName.asKnown().isPresent) 1 else 0) +
                        (if (lastName.asKnown().isPresent) 1 else 0) +
                        (if (middleName.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0) +
                        (if (suffix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Name &&
                        formattedName == other.formattedName &&
                        firstName == other.firstName &&
                        lastName == other.lastName &&
                        middleName == other.middleName &&
                        prefix == other.prefix &&
                        suffix == other.suffix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        formattedName,
                        firstName,
                        lastName,
                        middleName,
                        prefix,
                        suffix,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Name{formattedName=$formattedName, firstName=$firstName, lastName=$lastName, middleName=$middleName, prefix=$prefix, suffix=$suffix, additionalProperties=$additionalProperties}"
            }

            class Org
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val company: JsonField<String>,
                private val department: JsonField<String>,
                private val title: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("company")
                    @ExcludeMissing
                    company: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("department")
                    @ExcludeMissing
                    department: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("title")
                    @ExcludeMissing
                    title: JsonField<String> = JsonMissing.of(),
                ) : this(company, department, title, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun company(): Optional<String> = company.getOptional("company")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun department(): Optional<String> = department.getOptional("department")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun title(): Optional<String> = title.getOptional("title")

                /**
                 * Returns the raw JSON value of [company].
                 *
                 * Unlike [company], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<String> = company

                /**
                 * Returns the raw JSON value of [department].
                 *
                 * Unlike [department], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("department")
                @ExcludeMissing
                fun _department(): JsonField<String> = department

                /**
                 * Returns the raw JSON value of [title].
                 *
                 * Unlike [title], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

                    /** Returns a mutable builder for constructing an instance of [Org]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Org]. */
                class Builder internal constructor() {

                    private var company: JsonField<String> = JsonMissing.of()
                    private var department: JsonField<String> = JsonMissing.of()
                    private var title: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(org: Org) = apply {
                        company = org.company
                        department = org.department
                        title = org.title
                        additionalProperties = org.additionalProperties.toMutableMap()
                    }

                    fun company(company: String) = company(JsonField.of(company))

                    /**
                     * Sets [Builder.company] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.company] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun company(company: JsonField<String>) = apply { this.company = company }

                    fun department(department: String) = department(JsonField.of(department))

                    /**
                     * Sets [Builder.department] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.department] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun department(department: JsonField<String>) = apply {
                        this.department = department
                    }

                    fun title(title: String) = title(JsonField.of(title))

                    /**
                     * Sets [Builder.title] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.title] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun title(title: JsonField<String>) = apply { this.title = title }

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
                     * Returns an immutable instance of [Org].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Org =
                        Org(company, department, title, additionalProperties.toMutableMap())
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
                fun validate(): Org = apply {
                    if (validated) {
                        return@apply
                    }

                    company()
                    department()
                    title()
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
                    (if (company.asKnown().isPresent) 1 else 0) +
                        (if (department.asKnown().isPresent) 1 else 0) +
                        (if (title.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Org &&
                        company == other.company &&
                        department == other.department &&
                        title == other.title &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(company, department, title, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Org{company=$company, department=$department, title=$title, additionalProperties=$additionalProperties}"
            }

            class Phone
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val phone: JsonField<String>,
                private val type: JsonField<String>,
                private val waId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("phone")
                    @ExcludeMissing
                    phone: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("wa_id")
                    @ExcludeMissing
                    waId: JsonField<String> = JsonMissing.of(),
                ) : this(phone, type, waId, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phone(): Optional<String> = phone.getOptional("phone")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun waId(): Optional<String> = waId.getOptional("wa_id")

                /**
                 * Returns the raw JSON value of [phone].
                 *
                 * Unlike [phone], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                /**
                 * Returns the raw JSON value of [waId].
                 *
                 * Unlike [waId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("wa_id") @ExcludeMissing fun _waId(): JsonField<String> = waId

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

                    /** Returns a mutable builder for constructing an instance of [Phone]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Phone]. */
                class Builder internal constructor() {

                    private var phone: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<String> = JsonMissing.of()
                    private var waId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(phone: Phone) = apply {
                        this.phone = phone.phone
                        type = phone.type
                        waId = phone.waId
                        additionalProperties = phone.additionalProperties.toMutableMap()
                    }

                    fun phone(phone: String) = phone(JsonField.of(phone))

                    /**
                     * Sets [Builder.phone] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phone] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun phone(phone: JsonField<String>) = apply { this.phone = phone }

                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    fun waId(waId: String) = waId(JsonField.of(waId))

                    /**
                     * Sets [Builder.waId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.waId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun waId(waId: JsonField<String>) = apply { this.waId = waId }

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
                     * Returns an immutable instance of [Phone].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Phone =
                        Phone(phone, type, waId, additionalProperties.toMutableMap())
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
                fun validate(): Phone = apply {
                    if (validated) {
                        return@apply
                    }

                    phone()
                    type()
                    waId()
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
                    (if (phone.asKnown().isPresent) 1 else 0) +
                        (if (type.asKnown().isPresent) 1 else 0) +
                        (if (waId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Phone &&
                        phone == other.phone &&
                        type == other.type &&
                        waId == other.waId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(phone, type, waId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Phone{phone=$phone, type=$type, waId=$waId, additionalProperties=$additionalProperties}"
            }

            class Url
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val type: JsonField<String>,
                private val url: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                ) : this(type, url, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun url(): Optional<String> = url.getOptional("url")

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                /**
                 * Returns the raw JSON value of [url].
                 *
                 * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
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

                    /** Returns a mutable builder for constructing an instance of [Url]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Url]. */
                class Builder internal constructor() {

                    private var type: JsonField<String> = JsonMissing.of()
                    private var url: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(url: Url) = apply {
                        type = url.type
                        this.url = url.url
                        additionalProperties = url.additionalProperties.toMutableMap()
                    }

                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    fun url(url: String) = url(JsonField.of(url))

                    /**
                     * Sets [Builder.url] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.url] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun url(url: JsonField<String>) = apply { this.url = url }

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
                     * Returns an immutable instance of [Url].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Url = Url(type, url, additionalProperties.toMutableMap())
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
                fun validate(): Url = apply {
                    if (validated) {
                        return@apply
                    }

                    type()
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
                    (if (type.asKnown().isPresent) 1 else 0) +
                        (if (url.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Url &&
                        type == other.type &&
                        url == other.url &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(type, url, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Url{type=$type, url=$url, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Contact &&
                    addresses == other.addresses &&
                    birthday == other.birthday &&
                    emails == other.emails &&
                    name == other.name &&
                    org == other.org &&
                    phones == other.phones &&
                    urls == other.urls &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    addresses,
                    birthday,
                    emails,
                    name,
                    org,
                    phones,
                    urls,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Contact{addresses=$addresses, birthday=$birthday, emails=$emails, name=$name, org=$org, phones=$phones, urls=$urls, additionalProperties=$additionalProperties}"
        }

        class Interactive
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val action: JsonField<Action>,
            private val body: JsonField<Body>,
            private val footer: JsonField<Footer>,
            private val header: JsonField<Header>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("action")
                @ExcludeMissing
                action: JsonField<Action> = JsonMissing.of(),
                @JsonProperty("body") @ExcludeMissing body: JsonField<Body> = JsonMissing.of(),
                @JsonProperty("footer")
                @ExcludeMissing
                footer: JsonField<Footer> = JsonMissing.of(),
                @JsonProperty("header")
                @ExcludeMissing
                header: JsonField<Header> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(action, body, footer, header, type, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun action(): Optional<Action> = action.getOptional("action")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun body(): Optional<Body> = body.getOptional("body")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun footer(): Optional<Footer> = footer.getOptional("footer")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun header(): Optional<Header> = header.getOptional("header")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [action].
             *
             * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

            /**
             * Returns the raw JSON value of [body].
             *
             * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

            /**
             * Returns the raw JSON value of [footer].
             *
             * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<Footer> = footer

            /**
             * Returns the raw JSON value of [header].
             *
             * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<Header> = header

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

                /** Returns a mutable builder for constructing an instance of [Interactive]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Interactive]. */
            class Builder internal constructor() {

                private var action: JsonField<Action> = JsonMissing.of()
                private var body: JsonField<Body> = JsonMissing.of()
                private var footer: JsonField<Footer> = JsonMissing.of()
                private var header: JsonField<Header> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(interactive: Interactive) = apply {
                    action = interactive.action
                    body = interactive.body
                    footer = interactive.footer
                    header = interactive.header
                    type = interactive.type
                    additionalProperties = interactive.additionalProperties.toMutableMap()
                }

                fun action(action: Action) = action(JsonField.of(action))

                /**
                 * Sets [Builder.action] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.action] with a well-typed [Action] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun action(action: JsonField<Action>) = apply { this.action = action }

                fun body(body: Body) = body(JsonField.of(body))

                /**
                 * Sets [Builder.body] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.body] with a well-typed [Body] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun body(body: JsonField<Body>) = apply { this.body = body }

                fun footer(footer: Footer) = footer(JsonField.of(footer))

                /**
                 * Sets [Builder.footer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.footer] with a well-typed [Footer] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun footer(footer: JsonField<Footer>) = apply { this.footer = footer }

                fun header(header: Header) = header(JsonField.of(header))

                /**
                 * Sets [Builder.header] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.header] with a well-typed [Header] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun header(header: JsonField<Header>) = apply { this.header = header }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Interactive].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Interactive =
                    Interactive(
                        action,
                        body,
                        footer,
                        header,
                        type,
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
            fun validate(): Interactive = apply {
                if (validated) {
                    return@apply
                }

                action().ifPresent { it.validate() }
                body().ifPresent { it.validate() }
                footer().ifPresent { it.validate() }
                header().ifPresent { it.validate() }
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
                (action.asKnown().getOrNull()?.validity() ?: 0) +
                    (body.asKnown().getOrNull()?.validity() ?: 0) +
                    (footer.asKnown().getOrNull()?.validity() ?: 0) +
                    (header.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Action
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val button: JsonField<String>,
                private val buttons: JsonField<List<Button>>,
                private val cards: JsonField<List<Card>>,
                private val catalogId: JsonField<String>,
                private val mode: JsonField<String>,
                private val name: JsonField<String>,
                private val parameters: JsonField<Parameters>,
                private val productRetailerId: JsonField<String>,
                private val sections: JsonField<List<Section>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("button")
                    @ExcludeMissing
                    button: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("buttons")
                    @ExcludeMissing
                    buttons: JsonField<List<Button>> = JsonMissing.of(),
                    @JsonProperty("cards")
                    @ExcludeMissing
                    cards: JsonField<List<Card>> = JsonMissing.of(),
                    @JsonProperty("catalog_id")
                    @ExcludeMissing
                    catalogId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("mode")
                    @ExcludeMissing
                    mode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parameters")
                    @ExcludeMissing
                    parameters: JsonField<Parameters> = JsonMissing.of(),
                    @JsonProperty("product_retailer_id")
                    @ExcludeMissing
                    productRetailerId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sections")
                    @ExcludeMissing
                    sections: JsonField<List<Section>> = JsonMissing.of(),
                ) : this(
                    button,
                    buttons,
                    cards,
                    catalogId,
                    mode,
                    name,
                    parameters,
                    productRetailerId,
                    sections,
                    mutableMapOf(),
                )

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun button(): Optional<String> = button.getOptional("button")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun buttons(): Optional<List<Button>> = buttons.getOptional("buttons")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun cards(): Optional<List<Card>> = cards.getOptional("cards")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun catalogId(): Optional<String> = catalogId.getOptional("catalog_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mode(): Optional<String> = mode.getOptional("mode")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun productRetailerId(): Optional<String> =
                    productRetailerId.getOptional("product_retailer_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun sections(): Optional<List<Section>> = sections.getOptional("sections")

                /**
                 * Returns the raw JSON value of [button].
                 *
                 * Unlike [button], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("button") @ExcludeMissing fun _button(): JsonField<String> = button

                /**
                 * Returns the raw JSON value of [buttons].
                 *
                 * Unlike [buttons], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("buttons")
                @ExcludeMissing
                fun _buttons(): JsonField<List<Button>> = buttons

                /**
                 * Returns the raw JSON value of [cards].
                 *
                 * Unlike [cards], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cards") @ExcludeMissing fun _cards(): JsonField<List<Card>> = cards

                /**
                 * Returns the raw JSON value of [catalogId].
                 *
                 * Unlike [catalogId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("catalog_id")
                @ExcludeMissing
                fun _catalogId(): JsonField<String> = catalogId

                /**
                 * Returns the raw JSON value of [mode].
                 *
                 * Unlike [mode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [parameters].
                 *
                 * Unlike [parameters], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parameters")
                @ExcludeMissing
                fun _parameters(): JsonField<Parameters> = parameters

                /**
                 * Returns the raw JSON value of [productRetailerId].
                 *
                 * Unlike [productRetailerId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("product_retailer_id")
                @ExcludeMissing
                fun _productRetailerId(): JsonField<String> = productRetailerId

                /**
                 * Returns the raw JSON value of [sections].
                 *
                 * Unlike [sections], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sections")
                @ExcludeMissing
                fun _sections(): JsonField<List<Section>> = sections

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

                    /** Returns a mutable builder for constructing an instance of [Action]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Action]. */
                class Builder internal constructor() {

                    private var button: JsonField<String> = JsonMissing.of()
                    private var buttons: JsonField<MutableList<Button>>? = null
                    private var cards: JsonField<MutableList<Card>>? = null
                    private var catalogId: JsonField<String> = JsonMissing.of()
                    private var mode: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var parameters: JsonField<Parameters> = JsonMissing.of()
                    private var productRetailerId: JsonField<String> = JsonMissing.of()
                    private var sections: JsonField<MutableList<Section>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(action: Action) = apply {
                        button = action.button
                        buttons = action.buttons.map { it.toMutableList() }
                        cards = action.cards.map { it.toMutableList() }
                        catalogId = action.catalogId
                        mode = action.mode
                        name = action.name
                        parameters = action.parameters
                        productRetailerId = action.productRetailerId
                        sections = action.sections.map { it.toMutableList() }
                        additionalProperties = action.additionalProperties.toMutableMap()
                    }

                    fun button(button: String) = button(JsonField.of(button))

                    /**
                     * Sets [Builder.button] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.button] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun button(button: JsonField<String>) = apply { this.button = button }

                    fun buttons(buttons: List<Button>) = buttons(JsonField.of(buttons))

                    /**
                     * Sets [Builder.buttons] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttons] with a well-typed `List<Button>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttons(buttons: JsonField<List<Button>>) = apply {
                        this.buttons = buttons.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Button] to [buttons].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addButton(button: Button) = apply {
                        buttons =
                            (buttons ?: JsonField.of(mutableListOf())).also {
                                checkKnown("buttons", it).add(button)
                            }
                    }

                    fun cards(cards: List<Card>) = cards(JsonField.of(cards))

                    /**
                     * Sets [Builder.cards] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cards] with a well-typed `List<Card>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cards(cards: JsonField<List<Card>>) = apply {
                        this.cards = cards.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Card] to [cards].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addCard(card: Card) = apply {
                        cards =
                            (cards ?: JsonField.of(mutableListOf())).also {
                                checkKnown("cards", it).add(card)
                            }
                    }

                    fun catalogId(catalogId: String) = catalogId(JsonField.of(catalogId))

                    /**
                     * Sets [Builder.catalogId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.catalogId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun catalogId(catalogId: JsonField<String>) = apply {
                        this.catalogId = catalogId
                    }

                    fun mode(mode: String) = mode(JsonField.of(mode))

                    /**
                     * Sets [Builder.mode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mode] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun mode(mode: JsonField<String>) = apply { this.mode = mode }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                    /**
                     * Sets [Builder.parameters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parameters] with a well-typed [Parameters]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun parameters(parameters: JsonField<Parameters>) = apply {
                        this.parameters = parameters
                    }

                    fun productRetailerId(productRetailerId: String) =
                        productRetailerId(JsonField.of(productRetailerId))

                    /**
                     * Sets [Builder.productRetailerId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.productRetailerId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun productRetailerId(productRetailerId: JsonField<String>) = apply {
                        this.productRetailerId = productRetailerId
                    }

                    fun sections(sections: List<Section>) = sections(JsonField.of(sections))

                    /**
                     * Sets [Builder.sections] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sections] with a well-typed `List<Section>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sections(sections: JsonField<List<Section>>) = apply {
                        this.sections = sections.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Section] to [sections].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSection(section: Section) = apply {
                        sections =
                            (sections ?: JsonField.of(mutableListOf())).also {
                                checkKnown("sections", it).add(section)
                            }
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
                     * Returns an immutable instance of [Action].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Action =
                        Action(
                            button,
                            (buttons ?: JsonMissing.of()).map { it.toImmutable() },
                            (cards ?: JsonMissing.of()).map { it.toImmutable() },
                            catalogId,
                            mode,
                            name,
                            parameters,
                            productRetailerId,
                            (sections ?: JsonMissing.of()).map { it.toImmutable() },
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
                fun validate(): Action = apply {
                    if (validated) {
                        return@apply
                    }

                    button()
                    buttons().ifPresent { it.forEach { it.validate() } }
                    cards().ifPresent { it.forEach { it.validate() } }
                    catalogId()
                    mode()
                    name()
                    parameters().ifPresent { it.validate() }
                    productRetailerId()
                    sections().ifPresent { it.forEach { it.validate() } }
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
                    (if (button.asKnown().isPresent) 1 else 0) +
                        (buttons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (cards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (catalogId.asKnown().isPresent) 1 else 0) +
                        (if (mode.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (productRetailerId.asKnown().isPresent) 1 else 0) +
                        (sections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                class Button
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val reply: JsonField<Reply>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("reply")
                        @ExcludeMissing
                        reply: JsonField<Reply> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(reply, type, mutableMapOf())

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun reply(): Optional<Reply> = reply.getOptional("reply")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<Type> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [reply].
                     *
                     * Unlike [reply], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("reply") @ExcludeMissing fun _reply(): JsonField<Reply> = reply

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
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

                        /** Returns a mutable builder for constructing an instance of [Button]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Button]. */
                    class Builder internal constructor() {

                        private var reply: JsonField<Reply> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(button: Button) = apply {
                            reply = button.reply
                            type = button.type
                            additionalProperties = button.additionalProperties.toMutableMap()
                        }

                        fun reply(reply: Reply) = reply(JsonField.of(reply))

                        /**
                         * Sets [Builder.reply] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.reply] with a well-typed [Reply] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun reply(reply: JsonField<Reply>) = apply { this.reply = reply }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                         * Returns an immutable instance of [Button].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Button =
                            Button(reply, type, additionalProperties.toMutableMap())
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
                    fun validate(): Button = apply {
                        if (validated) {
                            return@apply
                        }

                        reply().ifPresent { it.validate() }
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
                        (reply.asKnown().getOrNull()?.validity() ?: 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Reply
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val id: JsonField<String>,
                        private val title: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            id: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("title")
                            @ExcludeMissing
                            title: JsonField<String> = JsonMissing.of(),
                        ) : this(id, title, mutableMapOf())

                        /**
                         * unique identifier for each button, 256 character maximum
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun id(): Optional<String> = id.getOptional("id")

                        /**
                         * button label, 20 character maximum
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun title(): Optional<String> = title.getOptional("title")

                        /**
                         * Returns the raw JSON value of [id].
                         *
                         * Unlike [id], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                        /**
                         * Returns the raw JSON value of [title].
                         *
                         * Unlike [title], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("title")
                        @ExcludeMissing
                        fun _title(): JsonField<String> = title

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
                             * Returns a mutable builder for constructing an instance of [Reply].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Reply]. */
                        class Builder internal constructor() {

                            private var id: JsonField<String> = JsonMissing.of()
                            private var title: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(reply: Reply) = apply {
                                id = reply.id
                                title = reply.title
                                additionalProperties = reply.additionalProperties.toMutableMap()
                            }

                            /** unique identifier for each button, 256 character maximum */
                            fun id(id: String) = id(JsonField.of(id))

                            /**
                             * Sets [Builder.id] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.id] with a well-typed [String] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun id(id: JsonField<String>) = apply { this.id = id }

                            /** button label, 20 character maximum */
                            fun title(title: String) = title(JsonField.of(title))

                            /**
                             * Sets [Builder.title] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.title] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun title(title: JsonField<String>) = apply { this.title = title }

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
                             * Returns an immutable instance of [Reply].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Reply =
                                Reply(id, title, additionalProperties.toMutableMap())
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
                        fun validate(): Reply = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            title()
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
                            (if (id.asKnown().isPresent) 1 else 0) +
                                (if (title.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Reply &&
                                id == other.id &&
                                title == other.title &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(id, title, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Reply{id=$id, title=$title, additionalProperties=$additionalProperties}"
                    }

                    class Type
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

                            @JvmField val REPLY = of("reply")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            REPLY
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            REPLY,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
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
                                REPLY -> Value.REPLY
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
                                REPLY -> Known.REPLY
                                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Button &&
                            reply == other.reply &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(reply, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Button{reply=$reply, type=$type, additionalProperties=$additionalProperties}"
                }

                class Card
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val action: JsonField<InnerAction>,
                    private val body: JsonField<Body>,
                    private val cardIndex: JsonField<Long>,
                    private val header: JsonField<Header>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("action")
                        @ExcludeMissing
                        action: JsonField<InnerAction> = JsonMissing.of(),
                        @JsonProperty("body")
                        @ExcludeMissing
                        body: JsonField<Body> = JsonMissing.of(),
                        @JsonProperty("card_index")
                        @ExcludeMissing
                        cardIndex: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("header")
                        @ExcludeMissing
                        header: JsonField<Header> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(action, body, cardIndex, header, type, mutableMapOf())

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun action(): Optional<InnerAction> = action.getOptional("action")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun body(): Optional<Body> = body.getOptional("body")

                    /**
                     * unique index for each card (0-9)
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun cardIndex(): Optional<Long> = cardIndex.getOptional("card_index")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun header(): Optional<Header> = header.getOptional("header")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<Type> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [action].
                     *
                     * Unlike [action], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("action")
                    @ExcludeMissing
                    fun _action(): JsonField<InnerAction> = action

                    /**
                     * Returns the raw JSON value of [body].
                     *
                     * Unlike [body], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

                    /**
                     * Returns the raw JSON value of [cardIndex].
                     *
                     * Unlike [cardIndex], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("card_index")
                    @ExcludeMissing
                    fun _cardIndex(): JsonField<Long> = cardIndex

                    /**
                     * Returns the raw JSON value of [header].
                     *
                     * Unlike [header], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("header")
                    @ExcludeMissing
                    fun _header(): JsonField<Header> = header

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
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

                        /** Returns a mutable builder for constructing an instance of [Card]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Card]. */
                    class Builder internal constructor() {

                        private var action: JsonField<InnerAction> = JsonMissing.of()
                        private var body: JsonField<Body> = JsonMissing.of()
                        private var cardIndex: JsonField<Long> = JsonMissing.of()
                        private var header: JsonField<Header> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(card: Card) = apply {
                            action = card.action
                            body = card.body
                            cardIndex = card.cardIndex
                            header = card.header
                            type = card.type
                            additionalProperties = card.additionalProperties.toMutableMap()
                        }

                        fun action(action: InnerAction) = action(JsonField.of(action))

                        /**
                         * Sets [Builder.action] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.action] with a well-typed [InnerAction]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun action(action: JsonField<InnerAction>) = apply { this.action = action }

                        fun body(body: Body) = body(JsonField.of(body))

                        /**
                         * Sets [Builder.body] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.body] with a well-typed [Body] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun body(body: JsonField<Body>) = apply { this.body = body }

                        /** unique index for each card (0-9) */
                        fun cardIndex(cardIndex: Long) = cardIndex(JsonField.of(cardIndex))

                        /**
                         * Sets [Builder.cardIndex] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cardIndex] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun cardIndex(cardIndex: JsonField<Long>) = apply {
                            this.cardIndex = cardIndex
                        }

                        fun header(header: Header) = header(JsonField.of(header))

                        /**
                         * Sets [Builder.header] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.header] with a well-typed [Header] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun header(header: JsonField<Header>) = apply { this.header = header }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                         * Returns an immutable instance of [Card].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Card =
                            Card(
                                action,
                                body,
                                cardIndex,
                                header,
                                type,
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
                    fun validate(): Card = apply {
                        if (validated) {
                            return@apply
                        }

                        action().ifPresent { it.validate() }
                        body().ifPresent { it.validate() }
                        cardIndex()
                        header().ifPresent { it.validate() }
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
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                            (body.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (cardIndex.asKnown().isPresent) 1 else 0) +
                            (header.asKnown().getOrNull()?.validity() ?: 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class InnerAction
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val catalogId: JsonField<String>,
                        private val productRetailerId: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("catalog_id")
                            @ExcludeMissing
                            catalogId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("product_retailer_id")
                            @ExcludeMissing
                            productRetailerId: JsonField<String> = JsonMissing.of(),
                        ) : this(catalogId, productRetailerId, mutableMapOf())

                        /**
                         * the unique ID of the catalog
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun catalogId(): Optional<String> = catalogId.getOptional("catalog_id")

                        /**
                         * the unique retailer ID of the product
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun productRetailerId(): Optional<String> =
                            productRetailerId.getOptional("product_retailer_id")

                        /**
                         * Returns the raw JSON value of [catalogId].
                         *
                         * Unlike [catalogId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("catalog_id")
                        @ExcludeMissing
                        fun _catalogId(): JsonField<String> = catalogId

                        /**
                         * Returns the raw JSON value of [productRetailerId].
                         *
                         * Unlike [productRetailerId], this method doesn't throw if the JSON field
                         * has an unexpected type.
                         */
                        @JsonProperty("product_retailer_id")
                        @ExcludeMissing
                        fun _productRetailerId(): JsonField<String> = productRetailerId

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
                             * [InnerAction].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [InnerAction]. */
                        class Builder internal constructor() {

                            private var catalogId: JsonField<String> = JsonMissing.of()
                            private var productRetailerId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerAction: InnerAction) = apply {
                                catalogId = innerAction.catalogId
                                productRetailerId = innerAction.productRetailerId
                                additionalProperties =
                                    innerAction.additionalProperties.toMutableMap()
                            }

                            /** the unique ID of the catalog */
                            fun catalogId(catalogId: String) = catalogId(JsonField.of(catalogId))

                            /**
                             * Sets [Builder.catalogId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.catalogId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun catalogId(catalogId: JsonField<String>) = apply {
                                this.catalogId = catalogId
                            }

                            /** the unique retailer ID of the product */
                            fun productRetailerId(productRetailerId: String) =
                                productRetailerId(JsonField.of(productRetailerId))

                            /**
                             * Sets [Builder.productRetailerId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.productRetailerId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun productRetailerId(productRetailerId: JsonField<String>) = apply {
                                this.productRetailerId = productRetailerId
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
                             * Returns an immutable instance of [InnerAction].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): InnerAction =
                                InnerAction(
                                    catalogId,
                                    productRetailerId,
                                    additionalProperties.toMutableMap(),
                                )
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
                        fun validate(): InnerAction = apply {
                            if (validated) {
                                return@apply
                            }

                            catalogId()
                            productRetailerId()
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
                            (if (catalogId.asKnown().isPresent) 1 else 0) +
                                (if (productRetailerId.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is InnerAction &&
                                catalogId == other.catalogId &&
                                productRetailerId == other.productRetailerId &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(catalogId, productRetailerId, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InnerAction{catalogId=$catalogId, productRetailerId=$productRetailerId, additionalProperties=$additionalProperties}"
                    }

                    class Body
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val text: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of()
                        ) : this(text, mutableMapOf())

                        /**
                         * 160 character maximum, up to 2 line breaks
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun text(): Optional<String> = text.getOptional("text")

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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

                            private var text: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(body: Body) = apply {
                                text = body.text
                                additionalProperties = body.additionalProperties.toMutableMap()
                            }

                            /** 160 character maximum, up to 2 line breaks */
                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

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
                             * Returns an immutable instance of [Body].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Body = Body(text, additionalProperties.toMutableMap())
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
                        fun validate(): Body = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
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
                        internal fun validity(): Int = (if (text.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Body &&
                                text == other.text &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(text, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Body{text=$text, additionalProperties=$additionalProperties}"
                    }

                    class Header
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val image: JsonField<WhatsappMedia>,
                        private val type: JsonField<Type>,
                        private val video: JsonField<WhatsappMedia>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("image")
                            @ExcludeMissing
                            image: JsonField<WhatsappMedia> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                            @JsonProperty("video")
                            @ExcludeMissing
                            video: JsonField<WhatsappMedia> = JsonMissing.of(),
                        ) : this(image, type, video, mutableMapOf())

                        /**
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun image(): Optional<WhatsappMedia> = image.getOptional("image")

                        /**
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun type(): Optional<Type> = type.getOptional("type")

                        /**
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun video(): Optional<WhatsappMedia> = video.getOptional("video")

                        /**
                         * Returns the raw JSON value of [image].
                         *
                         * Unlike [image], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("image")
                        @ExcludeMissing
                        fun _image(): JsonField<WhatsappMedia> = image

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                        /**
                         * Returns the raw JSON value of [video].
                         *
                         * Unlike [video], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("video")
                        @ExcludeMissing
                        fun _video(): JsonField<WhatsappMedia> = video

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
                             * Returns a mutable builder for constructing an instance of [Header].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Header]. */
                        class Builder internal constructor() {

                            private var image: JsonField<WhatsappMedia> = JsonMissing.of()
                            private var type: JsonField<Type> = JsonMissing.of()
                            private var video: JsonField<WhatsappMedia> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(header: Header) = apply {
                                image = header.image
                                type = header.type
                                video = header.video
                                additionalProperties = header.additionalProperties.toMutableMap()
                            }

                            fun image(image: WhatsappMedia) = image(JsonField.of(image))

                            /**
                             * Sets [Builder.image] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.image] with a well-typed
                             * [WhatsappMedia] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun image(image: JsonField<WhatsappMedia>) = apply {
                                this.image = image
                            }

                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun video(video: WhatsappMedia) = video(JsonField.of(video))

                            /**
                             * Sets [Builder.video] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.video] with a well-typed
                             * [WhatsappMedia] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun video(video: JsonField<WhatsappMedia>) = apply {
                                this.video = video
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
                             * Returns an immutable instance of [Header].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Header =
                                Header(image, type, video, additionalProperties.toMutableMap())
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
                        fun validate(): Header = apply {
                            if (validated) {
                                return@apply
                            }

                            image().ifPresent { it.validate() }
                            type().ifPresent { it.validate() }
                            video().ifPresent { it.validate() }
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
                            (image.asKnown().getOrNull()?.validity() ?: 0) +
                                (type.asKnown().getOrNull()?.validity() ?: 0) +
                                (video.asKnown().getOrNull()?.validity() ?: 0)

                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val IMAGE = of("image")

                                @JvmField val VIDEO = of("video")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                IMAGE,
                                VIDEO,
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                IMAGE,
                                VIDEO,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    IMAGE -> Value.IMAGE
                                    VIDEO -> Value.VIDEO
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws TelnyxInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    IMAGE -> Known.IMAGE
                                    VIDEO -> Known.VIDEO
                                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws TelnyxInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
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
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws TelnyxInvalidDataException if any value type in this object
                             *   doesn't match its expected type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                            return other is Header &&
                                image == other.image &&
                                type == other.type &&
                                video == other.video &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(image, type, video, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Header{image=$image, type=$type, video=$video, additionalProperties=$additionalProperties}"
                    }

                    class Type
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

                            @JvmField val CTA_URL = of("cta_url")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            CTA_URL
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            CTA_URL,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
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
                                CTA_URL -> Value.CTA_URL
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
                                CTA_URL -> Known.CTA_URL
                                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Card &&
                            action == other.action &&
                            body == other.body &&
                            cardIndex == other.cardIndex &&
                            header == other.header &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(action, body, cardIndex, header, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Card{action=$action, body=$body, cardIndex=$cardIndex, header=$header, type=$type, additionalProperties=$additionalProperties}"
                }

                class Parameters
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val displayText: JsonField<String>,
                    private val flowAction: JsonField<FlowAction>,
                    private val flowActionPayload: JsonField<FlowActionPayload>,
                    private val flowCta: JsonField<String>,
                    private val flowId: JsonField<String>,
                    private val flowMessageVersion: JsonField<String>,
                    private val flowName: JsonField<String>,
                    private val flowToken: JsonField<String>,
                    private val mode: JsonField<Mode>,
                    private val url: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("display_text")
                        @ExcludeMissing
                        displayText: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("flow_action")
                        @ExcludeMissing
                        flowAction: JsonField<FlowAction> = JsonMissing.of(),
                        @JsonProperty("flow_action_payload")
                        @ExcludeMissing
                        flowActionPayload: JsonField<FlowActionPayload> = JsonMissing.of(),
                        @JsonProperty("flow_cta")
                        @ExcludeMissing
                        flowCta: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("flow_id")
                        @ExcludeMissing
                        flowId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("flow_message_version")
                        @ExcludeMissing
                        flowMessageVersion: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("flow_name")
                        @ExcludeMissing
                        flowName: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("flow_token")
                        @ExcludeMissing
                        flowToken: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("mode")
                        @ExcludeMissing
                        mode: JsonField<Mode> = JsonMissing.of(),
                        @JsonProperty("url")
                        @ExcludeMissing
                        url: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        displayText,
                        flowAction,
                        flowActionPayload,
                        flowCta,
                        flowId,
                        flowMessageVersion,
                        flowName,
                        flowToken,
                        mode,
                        url,
                        mutableMapOf(),
                    )

                    /**
                     * button label text, 20 character maximum
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun displayText(): Optional<String> = displayText.getOptional("display_text")

                    /**
                     * how the flow starts. navigate opens the screen in flow_action_payload;
                     * data_exchange requests the first screen from the business's flow endpoint.
                     * Defaults to navigate
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun flowAction(): Optional<FlowAction> = flowAction.getOptional("flow_action")

                    /**
                     * optional initial screen and data. When omitted, the flow opens on its first
                     * entry screen. Must be omitted when flow_action is data_exchange
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun flowActionPayload(): Optional<FlowActionPayload> =
                        flowActionPayload.getOptional("flow_action_payload")

                    /**
                     * text of the button that opens the flow, 1-20 characters, no emoji. Required
                     * for flow messages
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun flowCta(): Optional<String> = flowCta.getOptional("flow_cta")

                    /**
                     * ID of the flow to open. Provide exactly one of flow_id or flow_name
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun flowId(): Optional<String> = flowId.getOptional("flow_id")

                    /**
                     * flow message version, must be 3. Required for flow messages
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun flowMessageVersion(): Optional<String> =
                        flowMessageVersion.getOptional("flow_message_version")

                    /**
                     * name of the flow to open. Provide exactly one of flow_id or flow_name
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun flowName(): Optional<String> = flowName.getOptional("flow_name")

                    /**
                     * business-generated identifier for the flow session. Returned in the flow
                     * response for correlation
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun flowToken(): Optional<String> = flowToken.getOptional("flow_token")

                    /**
                     * use draft to test an unpublished flow. Defaults to published
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun mode(): Optional<Mode> = mode.getOptional("mode")

                    /**
                     * button URL to load when tapped by the user
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun url(): Optional<String> = url.getOptional("url")

                    /**
                     * Returns the raw JSON value of [displayText].
                     *
                     * Unlike [displayText], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("display_text")
                    @ExcludeMissing
                    fun _displayText(): JsonField<String> = displayText

                    /**
                     * Returns the raw JSON value of [flowAction].
                     *
                     * Unlike [flowAction], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("flow_action")
                    @ExcludeMissing
                    fun _flowAction(): JsonField<FlowAction> = flowAction

                    /**
                     * Returns the raw JSON value of [flowActionPayload].
                     *
                     * Unlike [flowActionPayload], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("flow_action_payload")
                    @ExcludeMissing
                    fun _flowActionPayload(): JsonField<FlowActionPayload> = flowActionPayload

                    /**
                     * Returns the raw JSON value of [flowCta].
                     *
                     * Unlike [flowCta], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("flow_cta")
                    @ExcludeMissing
                    fun _flowCta(): JsonField<String> = flowCta

                    /**
                     * Returns the raw JSON value of [flowId].
                     *
                     * Unlike [flowId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("flow_id")
                    @ExcludeMissing
                    fun _flowId(): JsonField<String> = flowId

                    /**
                     * Returns the raw JSON value of [flowMessageVersion].
                     *
                     * Unlike [flowMessageVersion], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("flow_message_version")
                    @ExcludeMissing
                    fun _flowMessageVersion(): JsonField<String> = flowMessageVersion

                    /**
                     * Returns the raw JSON value of [flowName].
                     *
                     * Unlike [flowName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("flow_name")
                    @ExcludeMissing
                    fun _flowName(): JsonField<String> = flowName

                    /**
                     * Returns the raw JSON value of [flowToken].
                     *
                     * Unlike [flowToken], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("flow_token")
                    @ExcludeMissing
                    fun _flowToken(): JsonField<String> = flowToken

                    /**
                     * Returns the raw JSON value of [mode].
                     *
                     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

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

                        /**
                         * Returns a mutable builder for constructing an instance of [Parameters].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Parameters]. */
                    class Builder internal constructor() {

                        private var displayText: JsonField<String> = JsonMissing.of()
                        private var flowAction: JsonField<FlowAction> = JsonMissing.of()
                        private var flowActionPayload: JsonField<FlowActionPayload> =
                            JsonMissing.of()
                        private var flowCta: JsonField<String> = JsonMissing.of()
                        private var flowId: JsonField<String> = JsonMissing.of()
                        private var flowMessageVersion: JsonField<String> = JsonMissing.of()
                        private var flowName: JsonField<String> = JsonMissing.of()
                        private var flowToken: JsonField<String> = JsonMissing.of()
                        private var mode: JsonField<Mode> = JsonMissing.of()
                        private var url: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(parameters: Parameters) = apply {
                            displayText = parameters.displayText
                            flowAction = parameters.flowAction
                            flowActionPayload = parameters.flowActionPayload
                            flowCta = parameters.flowCta
                            flowId = parameters.flowId
                            flowMessageVersion = parameters.flowMessageVersion
                            flowName = parameters.flowName
                            flowToken = parameters.flowToken
                            mode = parameters.mode
                            url = parameters.url
                            additionalProperties = parameters.additionalProperties.toMutableMap()
                        }

                        /** button label text, 20 character maximum */
                        fun displayText(displayText: String) =
                            displayText(JsonField.of(displayText))

                        /**
                         * Sets [Builder.displayText] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.displayText] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun displayText(displayText: JsonField<String>) = apply {
                            this.displayText = displayText
                        }

                        /**
                         * how the flow starts. navigate opens the screen in flow_action_payload;
                         * data_exchange requests the first screen from the business's flow
                         * endpoint. Defaults to navigate
                         */
                        fun flowAction(flowAction: FlowAction) =
                            flowAction(JsonField.of(flowAction))

                        /**
                         * Sets [Builder.flowAction] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.flowAction] with a well-typed
                         * [FlowAction] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun flowAction(flowAction: JsonField<FlowAction>) = apply {
                            this.flowAction = flowAction
                        }

                        /**
                         * optional initial screen and data. When omitted, the flow opens on its
                         * first entry screen. Must be omitted when flow_action is data_exchange
                         */
                        fun flowActionPayload(flowActionPayload: FlowActionPayload) =
                            flowActionPayload(JsonField.of(flowActionPayload))

                        /**
                         * Sets [Builder.flowActionPayload] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.flowActionPayload] with a well-typed
                         * [FlowActionPayload] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun flowActionPayload(flowActionPayload: JsonField<FlowActionPayload>) =
                            apply {
                                this.flowActionPayload = flowActionPayload
                            }

                        /**
                         * text of the button that opens the flow, 1-20 characters, no emoji.
                         * Required for flow messages
                         */
                        fun flowCta(flowCta: String) = flowCta(JsonField.of(flowCta))

                        /**
                         * Sets [Builder.flowCta] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.flowCta] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun flowCta(flowCta: JsonField<String>) = apply { this.flowCta = flowCta }

                        /** ID of the flow to open. Provide exactly one of flow_id or flow_name */
                        fun flowId(flowId: String) = flowId(JsonField.of(flowId))

                        /**
                         * Sets [Builder.flowId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.flowId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun flowId(flowId: JsonField<String>) = apply { this.flowId = flowId }

                        /** flow message version, must be 3. Required for flow messages */
                        fun flowMessageVersion(flowMessageVersion: String) =
                            flowMessageVersion(JsonField.of(flowMessageVersion))

                        /**
                         * Sets [Builder.flowMessageVersion] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.flowMessageVersion] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun flowMessageVersion(flowMessageVersion: JsonField<String>) = apply {
                            this.flowMessageVersion = flowMessageVersion
                        }

                        /** name of the flow to open. Provide exactly one of flow_id or flow_name */
                        fun flowName(flowName: String) = flowName(JsonField.of(flowName))

                        /**
                         * Sets [Builder.flowName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.flowName] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun flowName(flowName: JsonField<String>) = apply {
                            this.flowName = flowName
                        }

                        /**
                         * business-generated identifier for the flow session. Returned in the flow
                         * response for correlation
                         */
                        fun flowToken(flowToken: String) = flowToken(JsonField.of(flowToken))

                        /**
                         * Sets [Builder.flowToken] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.flowToken] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun flowToken(flowToken: JsonField<String>) = apply {
                            this.flowToken = flowToken
                        }

                        /** use draft to test an unpublished flow. Defaults to published */
                        fun mode(mode: Mode) = mode(JsonField.of(mode))

                        /**
                         * Sets [Builder.mode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.mode] with a well-typed [Mode] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                        /** button URL to load when tapped by the user */
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
                         * Returns an immutable instance of [Parameters].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Parameters =
                            Parameters(
                                displayText,
                                flowAction,
                                flowActionPayload,
                                flowCta,
                                flowId,
                                flowMessageVersion,
                                flowName,
                                flowToken,
                                mode,
                                url,
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
                    fun validate(): Parameters = apply {
                        if (validated) {
                            return@apply
                        }

                        displayText()
                        flowAction().ifPresent { it.validate() }
                        flowActionPayload().ifPresent { it.validate() }
                        flowCta()
                        flowId()
                        flowMessageVersion()
                        flowName()
                        flowToken()
                        mode().ifPresent { it.validate() }
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
                        (if (displayText.asKnown().isPresent) 1 else 0) +
                            (flowAction.asKnown().getOrNull()?.validity() ?: 0) +
                            (flowActionPayload.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (flowCta.asKnown().isPresent) 1 else 0) +
                            (if (flowId.asKnown().isPresent) 1 else 0) +
                            (if (flowMessageVersion.asKnown().isPresent) 1 else 0) +
                            (if (flowName.asKnown().isPresent) 1 else 0) +
                            (if (flowToken.asKnown().isPresent) 1 else 0) +
                            (mode.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (url.asKnown().isPresent) 1 else 0)

                    /**
                     * how the flow starts. navigate opens the screen in flow_action_payload;
                     * data_exchange requests the first screen from the business's flow endpoint.
                     * Defaults to navigate
                     */
                    class FlowAction
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

                            @JvmField val NAVIGATE = of("navigate")

                            @JvmField val DATA_EXCHANGE = of("data_exchange")

                            @JvmStatic fun of(value: String) = FlowAction(JsonField.of(value))
                        }

                        /** An enum containing [FlowAction]'s known values. */
                        enum class Known {
                            NAVIGATE,
                            DATA_EXCHANGE,
                        }

                        /**
                         * An enum containing [FlowAction]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [FlowAction] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            NAVIGATE,
                            DATA_EXCHANGE,
                            /**
                             * An enum member indicating that [FlowAction] was instantiated with an
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
                                NAVIGATE -> Value.NAVIGATE
                                DATA_EXCHANGE -> Value.DATA_EXCHANGE
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
                                NAVIGATE -> Known.NAVIGATE
                                DATA_EXCHANGE -> Known.DATA_EXCHANGE
                                else ->
                                    throw TelnyxInvalidDataException("Unknown FlowAction: $value")
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
                        fun validate(): FlowAction = apply {
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

                            return other is FlowAction && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /**
                     * optional initial screen and data. When omitted, the flow opens on its first
                     * entry screen. Must be omitted when flow_action is data_exchange
                     */
                    class FlowActionPayload
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val data: JsonField<Data>,
                        private val screen: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("data")
                            @ExcludeMissing
                            data: JsonField<Data> = JsonMissing.of(),
                            @JsonProperty("screen")
                            @ExcludeMissing
                            screen: JsonField<String> = JsonMissing.of(),
                        ) : this(data, screen, mutableMapOf())

                        /**
                         * input data for the first screen. Must be a non-empty object when provided
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun data(): Optional<Data> = data.getOptional("data")

                        /**
                         * ID of the first screen to show
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun screen(): Optional<String> = screen.getOptional("screen")

                        /**
                         * Returns the raw JSON value of [data].
                         *
                         * Unlike [data], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

                        /**
                         * Returns the raw JSON value of [screen].
                         *
                         * Unlike [screen], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("screen")
                        @ExcludeMissing
                        fun _screen(): JsonField<String> = screen

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
                             * [FlowActionPayload].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [FlowActionPayload]. */
                        class Builder internal constructor() {

                            private var data: JsonField<Data> = JsonMissing.of()
                            private var screen: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(flowActionPayload: FlowActionPayload) = apply {
                                data = flowActionPayload.data
                                screen = flowActionPayload.screen
                                additionalProperties =
                                    flowActionPayload.additionalProperties.toMutableMap()
                            }

                            /**
                             * input data for the first screen. Must be a non-empty object when
                             * provided
                             */
                            fun data(data: Data) = data(JsonField.of(data))

                            /**
                             * Sets [Builder.data] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.data] with a well-typed [Data] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun data(data: JsonField<Data>) = apply { this.data = data }

                            /** ID of the first screen to show */
                            fun screen(screen: String) = screen(JsonField.of(screen))

                            /**
                             * Sets [Builder.screen] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.screen] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun screen(screen: JsonField<String>) = apply { this.screen = screen }

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
                             * Returns an immutable instance of [FlowActionPayload].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): FlowActionPayload =
                                FlowActionPayload(data, screen, additionalProperties.toMutableMap())
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
                        fun validate(): FlowActionPayload = apply {
                            if (validated) {
                                return@apply
                            }

                            data().ifPresent { it.validate() }
                            screen()
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
                            (data.asKnown().getOrNull()?.validity() ?: 0) +
                                (if (screen.asKnown().isPresent) 1 else 0)

                        /**
                         * input data for the first screen. Must be a non-empty object when provided
                         */
                        class Data
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of [Data].
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Data]. */
                            class Builder internal constructor() {

                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(data: Data) = apply {
                                    additionalProperties = data.additionalProperties.toMutableMap()
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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
                                 * Returns an immutable instance of [Data].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Data = Data(additionalProperties.toImmutable())
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws TelnyxInvalidDataException if any value type in this object
                             *   doesn't match its expected type.
                             */
                            fun validate(): Data = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                additionalProperties.count { (_, value) ->
                                    !value.isNull() && !value.isMissing()
                                }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Data &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Data{additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is FlowActionPayload &&
                                data == other.data &&
                                screen == other.screen &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(data, screen, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "FlowActionPayload{data=$data, screen=$screen, additionalProperties=$additionalProperties}"
                    }

                    /** use draft to test an unpublished flow. Defaults to published */
                    class Mode
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

                            @JvmField val DRAFT = of("draft")

                            @JvmField val PUBLISHED = of("published")

                            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                        }

                        /** An enum containing [Mode]'s known values. */
                        enum class Known {
                            DRAFT,
                            PUBLISHED,
                        }

                        /**
                         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Mode] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DRAFT,
                            PUBLISHED,
                            /**
                             * An enum member indicating that [Mode] was instantiated with an
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
                                DRAFT -> Value.DRAFT
                                PUBLISHED -> Value.PUBLISHED
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
                                DRAFT -> Known.DRAFT
                                PUBLISHED -> Known.PUBLISHED
                                else -> throw TelnyxInvalidDataException("Unknown Mode: $value")
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
                        fun validate(): Mode = apply {
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

                            return other is Mode && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Parameters &&
                            displayText == other.displayText &&
                            flowAction == other.flowAction &&
                            flowActionPayload == other.flowActionPayload &&
                            flowCta == other.flowCta &&
                            flowId == other.flowId &&
                            flowMessageVersion == other.flowMessageVersion &&
                            flowName == other.flowName &&
                            flowToken == other.flowToken &&
                            mode == other.mode &&
                            url == other.url &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            displayText,
                            flowAction,
                            flowActionPayload,
                            flowCta,
                            flowId,
                            flowMessageVersion,
                            flowName,
                            flowToken,
                            mode,
                            url,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Parameters{displayText=$displayText, flowAction=$flowAction, flowActionPayload=$flowActionPayload, flowCta=$flowCta, flowId=$flowId, flowMessageVersion=$flowMessageVersion, flowName=$flowName, flowToken=$flowToken, mode=$mode, url=$url, additionalProperties=$additionalProperties}"
                }

                class Section
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val productItems: JsonField<List<ProductItem>>,
                    private val rows: JsonField<List<Row>>,
                    private val title: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("product_items")
                        @ExcludeMissing
                        productItems: JsonField<List<ProductItem>> = JsonMissing.of(),
                        @JsonProperty("rows")
                        @ExcludeMissing
                        rows: JsonField<List<Row>> = JsonMissing.of(),
                        @JsonProperty("title")
                        @ExcludeMissing
                        title: JsonField<String> = JsonMissing.of(),
                    ) : this(productItems, rows, title, mutableMapOf())

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun productItems(): Optional<List<ProductItem>> =
                        productItems.getOptional("product_items")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun rows(): Optional<List<Row>> = rows.getOptional("rows")

                    /**
                     * section title, 24 character maximum
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun title(): Optional<String> = title.getOptional("title")

                    /**
                     * Returns the raw JSON value of [productItems].
                     *
                     * Unlike [productItems], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("product_items")
                    @ExcludeMissing
                    fun _productItems(): JsonField<List<ProductItem>> = productItems

                    /**
                     * Returns the raw JSON value of [rows].
                     *
                     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

                    /**
                     * Returns the raw JSON value of [title].
                     *
                     * Unlike [title], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

                        /** Returns a mutable builder for constructing an instance of [Section]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Section]. */
                    class Builder internal constructor() {

                        private var productItems: JsonField<MutableList<ProductItem>>? = null
                        private var rows: JsonField<MutableList<Row>>? = null
                        private var title: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(section: Section) = apply {
                            productItems = section.productItems.map { it.toMutableList() }
                            rows = section.rows.map { it.toMutableList() }
                            title = section.title
                            additionalProperties = section.additionalProperties.toMutableMap()
                        }

                        fun productItems(productItems: List<ProductItem>) =
                            productItems(JsonField.of(productItems))

                        /**
                         * Sets [Builder.productItems] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.productItems] with a well-typed
                         * `List<ProductItem>` value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun productItems(productItems: JsonField<List<ProductItem>>) = apply {
                            this.productItems = productItems.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [ProductItem] to [productItems].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addProductItem(productItem: ProductItem) = apply {
                            productItems =
                                (productItems ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("productItems", it).add(productItem)
                                }
                        }

                        fun rows(rows: List<Row>) = rows(JsonField.of(rows))

                        /**
                         * Sets [Builder.rows] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.rows] with a well-typed `List<Row>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun rows(rows: JsonField<List<Row>>) = apply {
                            this.rows = rows.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Row] to [rows].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addRow(row: Row) = apply {
                            rows =
                                (rows ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("rows", it).add(row)
                                }
                        }

                        /** section title, 24 character maximum */
                        fun title(title: String) = title(JsonField.of(title))

                        /**
                         * Sets [Builder.title] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.title] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun title(title: JsonField<String>) = apply { this.title = title }

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
                         * Returns an immutable instance of [Section].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Section =
                            Section(
                                (productItems ?: JsonMissing.of()).map { it.toImmutable() },
                                (rows ?: JsonMissing.of()).map { it.toImmutable() },
                                title,
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
                    fun validate(): Section = apply {
                        if (validated) {
                            return@apply
                        }

                        productItems().ifPresent { it.forEach { it.validate() } }
                        rows().ifPresent { it.forEach { it.validate() } }
                        title()
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
                        (productItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (rows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (if (title.asKnown().isPresent) 1 else 0)

                    class ProductItem
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val productRetailerId: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("product_retailer_id")
                            @ExcludeMissing
                            productRetailerId: JsonField<String> = JsonMissing.of()
                        ) : this(productRetailerId, mutableMapOf())

                        /**
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun productRetailerId(): Optional<String> =
                            productRetailerId.getOptional("product_retailer_id")

                        /**
                         * Returns the raw JSON value of [productRetailerId].
                         *
                         * Unlike [productRetailerId], this method doesn't throw if the JSON field
                         * has an unexpected type.
                         */
                        @JsonProperty("product_retailer_id")
                        @ExcludeMissing
                        fun _productRetailerId(): JsonField<String> = productRetailerId

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
                             * [ProductItem].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ProductItem]. */
                        class Builder internal constructor() {

                            private var productRetailerId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(productItem: ProductItem) = apply {
                                productRetailerId = productItem.productRetailerId
                                additionalProperties =
                                    productItem.additionalProperties.toMutableMap()
                            }

                            fun productRetailerId(productRetailerId: String) =
                                productRetailerId(JsonField.of(productRetailerId))

                            /**
                             * Sets [Builder.productRetailerId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.productRetailerId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun productRetailerId(productRetailerId: JsonField<String>) = apply {
                                this.productRetailerId = productRetailerId
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
                             * Returns an immutable instance of [ProductItem].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): ProductItem =
                                ProductItem(productRetailerId, additionalProperties.toMutableMap())
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
                        fun validate(): ProductItem = apply {
                            if (validated) {
                                return@apply
                            }

                            productRetailerId()
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
                            (if (productRetailerId.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ProductItem &&
                                productRetailerId == other.productRetailerId &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(productRetailerId, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ProductItem{productRetailerId=$productRetailerId, additionalProperties=$additionalProperties}"
                    }

                    class Row
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val id: JsonField<String>,
                        private val description: JsonField<String>,
                        private val title: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            id: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("description")
                            @ExcludeMissing
                            description: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("title")
                            @ExcludeMissing
                            title: JsonField<String> = JsonMissing.of(),
                        ) : this(id, description, title, mutableMapOf())

                        /**
                         * arbitrary string identifying the row, 200 character maximum
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun id(): Optional<String> = id.getOptional("id")

                        /**
                         * row description, 72 character maximum
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun description(): Optional<String> = description.getOptional("description")

                        /**
                         * row title, 24 character maximum
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun title(): Optional<String> = title.getOptional("title")

                        /**
                         * Returns the raw JSON value of [id].
                         *
                         * Unlike [id], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                        /**
                         * Returns the raw JSON value of [description].
                         *
                         * Unlike [description], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("description")
                        @ExcludeMissing
                        fun _description(): JsonField<String> = description

                        /**
                         * Returns the raw JSON value of [title].
                         *
                         * Unlike [title], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("title")
                        @ExcludeMissing
                        fun _title(): JsonField<String> = title

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

                            /** Returns a mutable builder for constructing an instance of [Row]. */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Row]. */
                        class Builder internal constructor() {

                            private var id: JsonField<String> = JsonMissing.of()
                            private var description: JsonField<String> = JsonMissing.of()
                            private var title: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(row: Row) = apply {
                                id = row.id
                                description = row.description
                                title = row.title
                                additionalProperties = row.additionalProperties.toMutableMap()
                            }

                            /** arbitrary string identifying the row, 200 character maximum */
                            fun id(id: String) = id(JsonField.of(id))

                            /**
                             * Sets [Builder.id] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.id] with a well-typed [String] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun id(id: JsonField<String>) = apply { this.id = id }

                            /** row description, 72 character maximum */
                            fun description(description: String) =
                                description(JsonField.of(description))

                            /**
                             * Sets [Builder.description] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.description] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun description(description: JsonField<String>) = apply {
                                this.description = description
                            }

                            /** row title, 24 character maximum */
                            fun title(title: String) = title(JsonField.of(title))

                            /**
                             * Sets [Builder.title] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.title] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun title(title: JsonField<String>) = apply { this.title = title }

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
                             * Returns an immutable instance of [Row].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Row =
                                Row(id, description, title, additionalProperties.toMutableMap())
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
                        fun validate(): Row = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            description()
                            title()
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
                            (if (id.asKnown().isPresent) 1 else 0) +
                                (if (description.asKnown().isPresent) 1 else 0) +
                                (if (title.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Row &&
                                id == other.id &&
                                description == other.description &&
                                title == other.title &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(id, description, title, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Row{id=$id, description=$description, title=$title, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Section &&
                            productItems == other.productItems &&
                            rows == other.rows &&
                            title == other.title &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(productItems, rows, title, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Section{productItems=$productItems, rows=$rows, title=$title, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Action &&
                        button == other.button &&
                        buttons == other.buttons &&
                        cards == other.cards &&
                        catalogId == other.catalogId &&
                        mode == other.mode &&
                        name == other.name &&
                        parameters == other.parameters &&
                        productRetailerId == other.productRetailerId &&
                        sections == other.sections &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        button,
                        buttons,
                        cards,
                        catalogId,
                        mode,
                        name,
                        parameters,
                        productRetailerId,
                        sections,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Action{button=$button, buttons=$buttons, cards=$cards, catalogId=$catalogId, mode=$mode, name=$name, parameters=$parameters, productRetailerId=$productRetailerId, sections=$sections, additionalProperties=$additionalProperties}"
            }

            class Body
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of()
                ) : this(text, mutableMapOf())

                /**
                 * body text, 1024 character maximum
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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

                    private var text: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(body: Body) = apply {
                        text = body.text
                        additionalProperties = body.additionalProperties.toMutableMap()
                    }

                    /** body text, 1024 character maximum */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

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
                     */
                    fun build(): Body = Body(text, additionalProperties.toMutableMap())
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

                    text()
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
                internal fun validity(): Int = (if (text.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Body &&
                        text == other.text &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(text, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Body{text=$text, additionalProperties=$additionalProperties}"
            }

            class Footer
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val text: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of()
                ) : this(text, mutableMapOf())

                /**
                 * footer text, 60 character maximum
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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

                    /** Returns a mutable builder for constructing an instance of [Footer]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Footer]. */
                class Builder internal constructor() {

                    private var text: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(footer: Footer) = apply {
                        text = footer.text
                        additionalProperties = footer.additionalProperties.toMutableMap()
                    }

                    /** footer text, 60 character maximum */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

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
                     * Returns an immutable instance of [Footer].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Footer = Footer(text, additionalProperties.toMutableMap())
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
                fun validate(): Footer = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
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
                internal fun validity(): Int = (if (text.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Footer &&
                        text == other.text &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(text, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Footer{text=$text, additionalProperties=$additionalProperties}"
            }

            class Header
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val type: JsonField<Type>,
                private val document: JsonField<WhatsappMedia>,
                private val image: JsonField<WhatsappMedia>,
                private val subText: JsonField<String>,
                private val text: JsonField<String>,
                private val video: JsonField<WhatsappMedia>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("document")
                    @ExcludeMissing
                    document: JsonField<WhatsappMedia> = JsonMissing.of(),
                    @JsonProperty("image")
                    @ExcludeMissing
                    image: JsonField<WhatsappMedia> = JsonMissing.of(),
                    @JsonProperty("sub_text")
                    @ExcludeMissing
                    subText: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text")
                    @ExcludeMissing
                    text: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("video")
                    @ExcludeMissing
                    video: JsonField<WhatsappMedia> = JsonMissing.of(),
                ) : this(type, document, image, subText, text, video, mutableMapOf())

                /**
                 * header type. Required when a header is provided; the matching document, image,
                 * text, or video field must be set
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun document(): Optional<WhatsappMedia> = document.getOptional("document")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun image(): Optional<WhatsappMedia> = image.getOptional("image")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun subText(): Optional<String> = subText.getOptional("sub_text")

                /**
                 * header text, 60 character maximum
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun video(): Optional<WhatsappMedia> = video.getOptional("video")

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [document].
                 *
                 * Unlike [document], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("document")
                @ExcludeMissing
                fun _document(): JsonField<WhatsappMedia> = document

                /**
                 * Returns the raw JSON value of [image].
                 *
                 * Unlike [image], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("image")
                @ExcludeMissing
                fun _image(): JsonField<WhatsappMedia> = image

                /**
                 * Returns the raw JSON value of [subText].
                 *
                 * Unlike [subText], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sub_text")
                @ExcludeMissing
                fun _subText(): JsonField<String> = subText

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                /**
                 * Returns the raw JSON value of [video].
                 *
                 * Unlike [video], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("video")
                @ExcludeMissing
                fun _video(): JsonField<WhatsappMedia> = video

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
                     * Returns a mutable builder for constructing an instance of [Header].
                     *
                     * The following fields are required:
                     * ```java
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Header]. */
                class Builder internal constructor() {

                    private var type: JsonField<Type>? = null
                    private var document: JsonField<WhatsappMedia> = JsonMissing.of()
                    private var image: JsonField<WhatsappMedia> = JsonMissing.of()
                    private var subText: JsonField<String> = JsonMissing.of()
                    private var text: JsonField<String> = JsonMissing.of()
                    private var video: JsonField<WhatsappMedia> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(header: Header) = apply {
                        type = header.type
                        document = header.document
                        image = header.image
                        subText = header.subText
                        text = header.text
                        video = header.video
                        additionalProperties = header.additionalProperties.toMutableMap()
                    }

                    /**
                     * header type. Required when a header is provided; the matching document,
                     * image, text, or video field must be set
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun document(document: WhatsappMedia) = document(JsonField.of(document))

                    /**
                     * Sets [Builder.document] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.document] with a well-typed [WhatsappMedia]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun document(document: JsonField<WhatsappMedia>) = apply {
                        this.document = document
                    }

                    fun image(image: WhatsappMedia) = image(JsonField.of(image))

                    /**
                     * Sets [Builder.image] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.image] with a well-typed [WhatsappMedia]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun image(image: JsonField<WhatsappMedia>) = apply { this.image = image }

                    fun subText(subText: String) = subText(JsonField.of(subText))

                    /**
                     * Sets [Builder.subText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subText] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun subText(subText: JsonField<String>) = apply { this.subText = subText }

                    /** header text, 60 character maximum */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    fun video(video: WhatsappMedia) = video(JsonField.of(video))

                    /**
                     * Sets [Builder.video] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.video] with a well-typed [WhatsappMedia]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun video(video: JsonField<WhatsappMedia>) = apply { this.video = video }

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
                     * Returns an immutable instance of [Header].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Header =
                        Header(
                            checkRequired("type", type),
                            document,
                            image,
                            subText,
                            text,
                            video,
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
                fun validate(): Header = apply {
                    if (validated) {
                        return@apply
                    }

                    type().validate()
                    document().ifPresent { it.validate() }
                    image().ifPresent { it.validate() }
                    subText()
                    text()
                    video().ifPresent { it.validate() }
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
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (document.asKnown().getOrNull()?.validity() ?: 0) +
                        (image.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (subText.asKnown().isPresent) 1 else 0) +
                        (if (text.asKnown().isPresent) 1 else 0) +
                        (video.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * header type. Required when a header is provided; the matching document, image,
                 * text, or video field must be set
                 */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

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

                        @JvmField val DOCUMENT = of("document")

                        @JvmField val IMAGE = of("image")

                        @JvmField val TEXT = of("text")

                        @JvmField val VIDEO = of("video")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        DOCUMENT,
                        IMAGE,
                        TEXT,
                        VIDEO,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DOCUMENT,
                        IMAGE,
                        TEXT,
                        VIDEO,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
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
                            DOCUMENT -> Value.DOCUMENT
                            IMAGE -> Value.IMAGE
                            TEXT -> Value.TEXT
                            VIDEO -> Value.VIDEO
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
                            DOCUMENT -> Known.DOCUMENT
                            IMAGE -> Known.IMAGE
                            TEXT -> Known.TEXT
                            VIDEO -> Known.VIDEO
                            else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is Header &&
                        type == other.type &&
                        document == other.document &&
                        image == other.image &&
                        subText == other.subText &&
                        text == other.text &&
                        video == other.video &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(type, document, image, subText, text, video, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Header{type=$type, document=$document, image=$image, subText=$subText, text=$text, video=$video, additionalProperties=$additionalProperties}"
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

                    @JvmField val CTA_URL = of("cta_url")

                    @JvmField val LIST = of("list")

                    @JvmField val CAROUSEL = of("carousel")

                    @JvmField val BUTTON = of("button")

                    @JvmField val LOCATION_REQUEST_MESSAGE = of("location_request_message")

                    @JvmField val FLOW = of("flow")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CTA_URL,
                    LIST,
                    CAROUSEL,
                    BUTTON,
                    LOCATION_REQUEST_MESSAGE,
                    FLOW,
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
                    CTA_URL,
                    LIST,
                    CAROUSEL,
                    BUTTON,
                    LOCATION_REQUEST_MESSAGE,
                    FLOW,
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
                        CTA_URL -> Value.CTA_URL
                        LIST -> Value.LIST
                        CAROUSEL -> Value.CAROUSEL
                        BUTTON -> Value.BUTTON
                        LOCATION_REQUEST_MESSAGE -> Value.LOCATION_REQUEST_MESSAGE
                        FLOW -> Value.FLOW
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
                        CTA_URL -> Known.CTA_URL
                        LIST -> Known.LIST
                        CAROUSEL -> Known.CAROUSEL
                        BUTTON -> Known.BUTTON
                        LOCATION_REQUEST_MESSAGE -> Known.LOCATION_REQUEST_MESSAGE
                        FLOW -> Known.FLOW
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

                return other is Interactive &&
                    action == other.action &&
                    body == other.body &&
                    footer == other.footer &&
                    header == other.header &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(action, body, footer, header, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Interactive{action=$action, body=$body, footer=$footer, header=$header, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Template message object. Provide either template_id or name + language to identify the
         * template.
         */
        class Template
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val components: JsonField<List<Component>>,
            private val language: JsonField<Language>,
            private val name: JsonField<String>,
            private val templateId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("components")
                @ExcludeMissing
                components: JsonField<List<Component>> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<Language> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("template_id")
                @ExcludeMissing
                templateId: JsonField<String> = JsonMissing.of(),
            ) : this(components, language, name, templateId, mutableMapOf())

            /**
             * Template parameter values for header, body, and button components.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun components(): Optional<List<Component>> = components.getOptional("components")

            /**
             * Template language. Required unless template_id is provided.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun language(): Optional<Language> = language.getOptional("language")

            /**
             * Template name as registered with Meta. Required unless template_id is provided.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Telnyx template ID (the id field from template list/get responses). When provided,
             * name and language are resolved automatically.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun templateId(): Optional<String> = templateId.getOptional("template_id")

            /**
             * Returns the raw JSON value of [components].
             *
             * Unlike [components], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("components")
            @ExcludeMissing
            fun _components(): JsonField<List<Component>> = components

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language")
            @ExcludeMissing
            fun _language(): JsonField<Language> = language

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [templateId].
             *
             * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("template_id")
            @ExcludeMissing
            fun _templateId(): JsonField<String> = templateId

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

                /** Returns a mutable builder for constructing an instance of [Template]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Template]. */
            class Builder internal constructor() {

                private var components: JsonField<MutableList<Component>>? = null
                private var language: JsonField<Language> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var templateId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(template: Template) = apply {
                    components = template.components.map { it.toMutableList() }
                    language = template.language
                    name = template.name
                    templateId = template.templateId
                    additionalProperties = template.additionalProperties.toMutableMap()
                }

                /** Template parameter values for header, body, and button components. */
                fun components(components: List<Component>) = components(JsonField.of(components))

                /**
                 * Sets [Builder.components] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.components] with a well-typed `List<Component>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun components(components: JsonField<List<Component>>) = apply {
                    this.components = components.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Component] to [components].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addComponent(component: Component) = apply {
                    components =
                        (components ?: JsonField.of(mutableListOf())).also {
                            checkKnown("components", it).add(component)
                        }
                }

                /** Template language. Required unless template_id is provided. */
                fun language(language: Language) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [Language] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<Language>) = apply { this.language = language }

                /**
                 * Template name as registered with Meta. Required unless template_id is provided.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * Telnyx template ID (the id field from template list/get responses). When
                 * provided, name and language are resolved automatically.
                 */
                fun templateId(templateId: String) = templateId(JsonField.of(templateId))

                /**
                 * Sets [Builder.templateId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.templateId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun templateId(templateId: JsonField<String>) = apply {
                    this.templateId = templateId
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
                 * Returns an immutable instance of [Template].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Template =
                    Template(
                        (components ?: JsonMissing.of()).map { it.toImmutable() },
                        language,
                        name,
                        templateId,
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
            fun validate(): Template = apply {
                if (validated) {
                    return@apply
                }

                components().ifPresent { it.forEach { it.validate() } }
                language().ifPresent { it.validate() }
                name()
                templateId()
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
                (components.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (language.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (templateId.asKnown().isPresent) 1 else 0)

            class Component
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val index: JsonField<Long>,
                private val parameters: JsonField<List<Parameter>>,
                private val subType: JsonField<SubType>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("index")
                    @ExcludeMissing
                    index: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("parameters")
                    @ExcludeMissing
                    parameters: JsonField<List<Parameter>> = JsonMissing.of(),
                    @JsonProperty("sub_type")
                    @ExcludeMissing
                    subType: JsonField<SubType> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(index, parameters, subType, type, mutableMapOf())

                /**
                 * Button index (required for button components)
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun index(): Optional<Long> = index.getOptional("index")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun parameters(): Optional<List<Parameter>> = parameters.getOptional("parameters")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun subType(): Optional<SubType> = subType.getOptional("sub_type")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [index].
                 *
                 * Unlike [index], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

                /**
                 * Returns the raw JSON value of [parameters].
                 *
                 * Unlike [parameters], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parameters")
                @ExcludeMissing
                fun _parameters(): JsonField<List<Parameter>> = parameters

                /**
                 * Returns the raw JSON value of [subType].
                 *
                 * Unlike [subType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sub_type")
                @ExcludeMissing
                fun _subType(): JsonField<SubType> = subType

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /** Returns a mutable builder for constructing an instance of [Component]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Component]. */
                class Builder internal constructor() {

                    private var index: JsonField<Long> = JsonMissing.of()
                    private var parameters: JsonField<MutableList<Parameter>>? = null
                    private var subType: JsonField<SubType> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(component: Component) = apply {
                        index = component.index
                        parameters = component.parameters.map { it.toMutableList() }
                        subType = component.subType
                        type = component.type
                        additionalProperties = component.additionalProperties.toMutableMap()
                    }

                    /** Button index (required for button components) */
                    fun index(index: Long) = index(JsonField.of(index))

                    /**
                     * Sets [Builder.index] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.index] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun index(index: JsonField<Long>) = apply { this.index = index }

                    fun parameters(parameters: List<Parameter>) =
                        parameters(JsonField.of(parameters))

                    /**
                     * Sets [Builder.parameters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parameters] with a well-typed
                     * `List<Parameter>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun parameters(parameters: JsonField<List<Parameter>>) = apply {
                        this.parameters = parameters.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Parameter] to [parameters].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addParameter(parameter: Parameter) = apply {
                        parameters =
                            (parameters ?: JsonField.of(mutableListOf())).also {
                                checkKnown("parameters", it).add(parameter)
                            }
                    }

                    fun subType(subType: SubType) = subType(JsonField.of(subType))

                    /**
                     * Sets [Builder.subType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subType] with a well-typed [SubType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun subType(subType: JsonField<SubType>) = apply { this.subType = subType }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * Returns an immutable instance of [Component].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Component =
                        Component(
                            index,
                            (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                            subType,
                            type,
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
                fun validate(): Component = apply {
                    if (validated) {
                        return@apply
                    }

                    index()
                    parameters().ifPresent { it.forEach { it.validate() } }
                    subType().ifPresent { it.validate() }
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
                    (if (index.asKnown().isPresent) 1 else 0) +
                        (parameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (subType.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                class Parameter
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val action: JsonField<Action>,
                    private val text: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("action")
                        @ExcludeMissing
                        action: JsonField<Action> = JsonMissing.of(),
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(action, text, type, mutableMapOf())

                    /**
                     * Flow button parameters. Used with type action on a flow button component
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun action(): Optional<Action> = action.getOptional("action")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun text(): Optional<String> = text.getOptional("text")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<Type> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [action].
                     *
                     * Unlike [action], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("action")
                    @ExcludeMissing
                    fun _action(): JsonField<Action> = action

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [Parameter].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Parameter]. */
                    class Builder internal constructor() {

                        private var action: JsonField<Action> = JsonMissing.of()
                        private var text: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(parameter: Parameter) = apply {
                            action = parameter.action
                            text = parameter.text
                            type = parameter.type
                            additionalProperties = parameter.additionalProperties.toMutableMap()
                        }

                        /**
                         * Flow button parameters. Used with type action on a flow button component
                         */
                        fun action(action: Action) = action(JsonField.of(action))

                        /**
                         * Sets [Builder.action] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.action] with a well-typed [Action] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun action(action: JsonField<Action>) = apply { this.action = action }

                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                         * Returns an immutable instance of [Parameter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Parameter =
                            Parameter(action, text, type, additionalProperties.toMutableMap())
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
                    fun validate(): Parameter = apply {
                        if (validated) {
                            return@apply
                        }

                        action().ifPresent { it.validate() }
                        text()
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
                        (action.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (text.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    /** Flow button parameters. Used with type action on a flow button component */
                    class Action
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val flowActionData: JsonField<FlowActionData>,
                        private val flowToken: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("flow_action_data")
                            @ExcludeMissing
                            flowActionData: JsonField<FlowActionData> = JsonMissing.of(),
                            @JsonProperty("flow_token")
                            @ExcludeMissing
                            flowToken: JsonField<String> = JsonMissing.of(),
                        ) : this(flowActionData, flowToken, mutableMapOf())

                        /**
                         * input data for the first screen of the flow
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun flowActionData(): Optional<FlowActionData> =
                            flowActionData.getOptional("flow_action_data")

                        /**
                         * business-generated identifier for the flow session. Returned in the flow
                         * response for correlation
                         *
                         * @throws TelnyxInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun flowToken(): Optional<String> = flowToken.getOptional("flow_token")

                        /**
                         * Returns the raw JSON value of [flowActionData].
                         *
                         * Unlike [flowActionData], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("flow_action_data")
                        @ExcludeMissing
                        fun _flowActionData(): JsonField<FlowActionData> = flowActionData

                        /**
                         * Returns the raw JSON value of [flowToken].
                         *
                         * Unlike [flowToken], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("flow_token")
                        @ExcludeMissing
                        fun _flowToken(): JsonField<String> = flowToken

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
                             * Returns a mutable builder for constructing an instance of [Action].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Action]. */
                        class Builder internal constructor() {

                            private var flowActionData: JsonField<FlowActionData> = JsonMissing.of()
                            private var flowToken: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(action: Action) = apply {
                                flowActionData = action.flowActionData
                                flowToken = action.flowToken
                                additionalProperties = action.additionalProperties.toMutableMap()
                            }

                            /** input data for the first screen of the flow */
                            fun flowActionData(flowActionData: FlowActionData) =
                                flowActionData(JsonField.of(flowActionData))

                            /**
                             * Sets [Builder.flowActionData] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.flowActionData] with a well-typed
                             * [FlowActionData] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun flowActionData(flowActionData: JsonField<FlowActionData>) = apply {
                                this.flowActionData = flowActionData
                            }

                            /**
                             * business-generated identifier for the flow session. Returned in the
                             * flow response for correlation
                             */
                            fun flowToken(flowToken: String) = flowToken(JsonField.of(flowToken))

                            /**
                             * Sets [Builder.flowToken] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.flowToken] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun flowToken(flowToken: JsonField<String>) = apply {
                                this.flowToken = flowToken
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
                             * Returns an immutable instance of [Action].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Action =
                                Action(
                                    flowActionData,
                                    flowToken,
                                    additionalProperties.toMutableMap(),
                                )
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
                        fun validate(): Action = apply {
                            if (validated) {
                                return@apply
                            }

                            flowActionData().ifPresent { it.validate() }
                            flowToken()
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
                            (flowActionData.asKnown().getOrNull()?.validity() ?: 0) +
                                (if (flowToken.asKnown().isPresent) 1 else 0)

                        /** input data for the first screen of the flow */
                        class FlowActionData
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [FlowActionData].
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [FlowActionData]. */
                            class Builder internal constructor() {

                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(flowActionData: FlowActionData) = apply {
                                    additionalProperties =
                                        flowActionData.additionalProperties.toMutableMap()
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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
                                 * Returns an immutable instance of [FlowActionData].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): FlowActionData =
                                    FlowActionData(additionalProperties.toImmutable())
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws TelnyxInvalidDataException if any value type in this object
                             *   doesn't match its expected type.
                             */
                            fun validate(): FlowActionData = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                additionalProperties.count { (_, value) ->
                                    !value.isNull() && !value.isMissing()
                                }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is FlowActionData &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "FlowActionData{additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Action &&
                                flowActionData == other.flowActionData &&
                                flowToken == other.flowToken &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(flowActionData, flowToken, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Action{flowActionData=$flowActionData, flowToken=$flowToken, additionalProperties=$additionalProperties}"
                    }

                    class Type
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

                            @JvmField val TEXT = of("text")

                            @JvmField val IMAGE = of("image")

                            @JvmField val VIDEO = of("video")

                            @JvmField val DOCUMENT = of("document")

                            @JvmField val CURRENCY = of("currency")

                            @JvmField val DATE_TIME = of("date_time")

                            @JvmField val ACTION = of("action")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            TEXT,
                            IMAGE,
                            VIDEO,
                            DOCUMENT,
                            CURRENCY,
                            DATE_TIME,
                            ACTION,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TEXT,
                            IMAGE,
                            VIDEO,
                            DOCUMENT,
                            CURRENCY,
                            DATE_TIME,
                            ACTION,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
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
                                TEXT -> Value.TEXT
                                IMAGE -> Value.IMAGE
                                VIDEO -> Value.VIDEO
                                DOCUMENT -> Value.DOCUMENT
                                CURRENCY -> Value.CURRENCY
                                DATE_TIME -> Value.DATE_TIME
                                ACTION -> Value.ACTION
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
                                TEXT -> Known.TEXT
                                IMAGE -> Known.IMAGE
                                VIDEO -> Known.VIDEO
                                DOCUMENT -> Known.DOCUMENT
                                CURRENCY -> Known.CURRENCY
                                DATE_TIME -> Known.DATE_TIME
                                ACTION -> Known.ACTION
                                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Parameter &&
                            action == other.action &&
                            text == other.text &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(action, text, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Parameter{action=$action, text=$text, type=$type, additionalProperties=$additionalProperties}"
                }

                class SubType
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

                        @JvmField val QUICK_REPLY = of("quick_reply")

                        @JvmField val URL = of("url")

                        @JvmField val FLOW = of("flow")

                        @JvmStatic fun of(value: String) = SubType(JsonField.of(value))
                    }

                    /** An enum containing [SubType]'s known values. */
                    enum class Known {
                        QUICK_REPLY,
                        URL,
                        FLOW,
                    }

                    /**
                     * An enum containing [SubType]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [SubType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        QUICK_REPLY,
                        URL,
                        FLOW,
                        /**
                         * An enum member indicating that [SubType] was instantiated with an unknown
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
                            QUICK_REPLY -> Value.QUICK_REPLY
                            URL -> Value.URL
                            FLOW -> Value.FLOW
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
                            QUICK_REPLY -> Known.QUICK_REPLY
                            URL -> Known.URL
                            FLOW -> Known.FLOW
                            else -> throw TelnyxInvalidDataException("Unknown SubType: $value")
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
                    fun validate(): SubType = apply {
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

                        return other is SubType && value == other.value
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val HEADER = of("header")

                        @JvmField val BODY = of("body")

                        @JvmField val BUTTON = of("button")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        HEADER,
                        BODY,
                        BUTTON,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        HEADER,
                        BODY,
                        BUTTON,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
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
                            HEADER -> Value.HEADER
                            BODY -> Value.BODY
                            BUTTON -> Value.BUTTON
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
                            HEADER -> Known.HEADER
                            BODY -> Known.BODY
                            BUTTON -> Known.BUTTON
                            else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is Component &&
                        index == other.index &&
                        parameters == other.parameters &&
                        subType == other.subType &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(index, parameters, subType, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Component{index=$index, parameters=$parameters, subType=$subType, type=$type, additionalProperties=$additionalProperties}"
            }

            /** Template language. Required unless template_id is provided. */
            class Language
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val code: JsonField<String>,
                private val policy: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("code")
                    @ExcludeMissing
                    code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("policy")
                    @ExcludeMissing
                    policy: JsonField<String> = JsonMissing.of(),
                ) : this(code, policy, mutableMapOf())

                /**
                 * Language code (e.g. en_US)
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun code(): String = code.getRequired("code")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun policy(): Optional<String> = policy.getOptional("policy")

                /**
                 * Returns the raw JSON value of [code].
                 *
                 * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                /**
                 * Returns the raw JSON value of [policy].
                 *
                 * Unlike [policy], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<String> = policy

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
                     * Returns a mutable builder for constructing an instance of [Language].
                     *
                     * The following fields are required:
                     * ```java
                     * .code()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Language]. */
                class Builder internal constructor() {

                    private var code: JsonField<String>? = null
                    private var policy: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(language: Language) = apply {
                        code = language.code
                        policy = language.policy
                        additionalProperties = language.additionalProperties.toMutableMap()
                    }

                    /** Language code (e.g. en_US) */
                    fun code(code: String) = code(JsonField.of(code))

                    /**
                     * Sets [Builder.code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.code] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun policy(policy: String) = policy(JsonField.of(policy))

                    /**
                     * Sets [Builder.policy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.policy] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun policy(policy: JsonField<String>) = apply { this.policy = policy }

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
                     * Returns an immutable instance of [Language].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .code()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Language =
                        Language(
                            checkRequired("code", code),
                            policy,
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
                fun validate(): Language = apply {
                    if (validated) {
                        return@apply
                    }

                    code()
                    policy()
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
                    (if (code.asKnown().isPresent) 1 else 0) +
                        (if (policy.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Language &&
                        code == other.code &&
                        policy == other.policy &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(code, policy, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Language{code=$code, policy=$policy, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Template &&
                    components == other.components &&
                    language == other.language &&
                    name == other.name &&
                    templateId == other.templateId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(components, language, name, templateId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Template{components=$components, language=$language, name=$name, templateId=$templateId, additionalProperties=$additionalProperties}"
        }

        /** Text message content. Can only be sent within a 24-hour customer service window. */
        class Text
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val body: JsonField<String>,
            private val previewUrl: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
                @JsonProperty("preview_url")
                @ExcludeMissing
                previewUrl: JsonField<Boolean> = JsonMissing.of(),
            ) : this(body, previewUrl, mutableMapOf())

            /**
             * The text message body.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun body(): String = body.getRequired("body")

            /**
             * Whether to show a URL preview in the message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun previewUrl(): Optional<Boolean> = previewUrl.getOptional("preview_url")

            /**
             * Returns the raw JSON value of [body].
             *
             * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

            /**
             * Returns the raw JSON value of [previewUrl].
             *
             * Unlike [previewUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("preview_url")
            @ExcludeMissing
            fun _previewUrl(): JsonField<Boolean> = previewUrl

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
                 * Returns a mutable builder for constructing an instance of [Text].
                 *
                 * The following fields are required:
                 * ```java
                 * .body()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Text]. */
            class Builder internal constructor() {

                private var body: JsonField<String>? = null
                private var previewUrl: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(text: Text) = apply {
                    body = text.body
                    previewUrl = text.previewUrl
                    additionalProperties = text.additionalProperties.toMutableMap()
                }

                /** The text message body. */
                fun body(body: String) = body(JsonField.of(body))

                /**
                 * Sets [Builder.body] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.body] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun body(body: JsonField<String>) = apply { this.body = body }

                /** Whether to show a URL preview in the message. */
                fun previewUrl(previewUrl: Boolean) = previewUrl(JsonField.of(previewUrl))

                /**
                 * Sets [Builder.previewUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.previewUrl] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun previewUrl(previewUrl: JsonField<Boolean>) = apply {
                    this.previewUrl = previewUrl
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
                 * Returns an immutable instance of [Text].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .body()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Text =
                    Text(
                        checkRequired("body", body),
                        previewUrl,
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
            fun validate(): Text = apply {
                if (validated) {
                    return@apply
                }

                body()
                previewUrl()
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
                    (if (previewUrl.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Text &&
                    body == other.body &&
                    previewUrl == other.previewUrl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(body, previewUrl, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Text{body=$body, previewUrl=$previewUrl, additionalProperties=$additionalProperties}"
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

                @JvmField val AUDIO = of("audio")

                @JvmField val DOCUMENT = of("document")

                @JvmField val IMAGE = of("image")

                @JvmField val STICKER = of("sticker")

                @JvmField val VIDEO = of("video")

                @JvmField val INTERACTIVE = of("interactive")

                @JvmField val LOCATION = of("location")

                @JvmField val TEMPLATE = of("template")

                @JvmField val REACTION = of("reaction")

                @JvmField val CONTACTS = of("contacts")

                @JvmField val TEXT = of("text")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                AUDIO,
                DOCUMENT,
                IMAGE,
                STICKER,
                VIDEO,
                INTERACTIVE,
                LOCATION,
                TEMPLATE,
                REACTION,
                CONTACTS,
                TEXT,
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
                AUDIO,
                DOCUMENT,
                IMAGE,
                STICKER,
                VIDEO,
                INTERACTIVE,
                LOCATION,
                TEMPLATE,
                REACTION,
                CONTACTS,
                TEXT,
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
                    AUDIO -> Value.AUDIO
                    DOCUMENT -> Value.DOCUMENT
                    IMAGE -> Value.IMAGE
                    STICKER -> Value.STICKER
                    VIDEO -> Value.VIDEO
                    INTERACTIVE -> Value.INTERACTIVE
                    LOCATION -> Value.LOCATION
                    TEMPLATE -> Value.TEMPLATE
                    REACTION -> Value.REACTION
                    CONTACTS -> Value.CONTACTS
                    TEXT -> Value.TEXT
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
                    AUDIO -> Known.AUDIO
                    DOCUMENT -> Known.DOCUMENT
                    IMAGE -> Known.IMAGE
                    STICKER -> Known.STICKER
                    VIDEO -> Known.VIDEO
                    INTERACTIVE -> Known.INTERACTIVE
                    LOCATION -> Known.LOCATION
                    TEMPLATE -> Known.TEMPLATE
                    REACTION -> Known.REACTION
                    CONTACTS -> Known.CONTACTS
                    TEXT -> Known.TEXT
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

            return other is WhatsappMessage &&
                audio == other.audio &&
                bizOpaqueCallbackData == other.bizOpaqueCallbackData &&
                contacts == other.contacts &&
                document == other.document &&
                image == other.image &&
                interactive == other.interactive &&
                location == other.location &&
                reaction == other.reaction &&
                sticker == other.sticker &&
                template == other.template &&
                text == other.text &&
                type == other.type &&
                video == other.video &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                audio,
                bizOpaqueCallbackData,
                contacts,
                document,
                image,
                interactive,
                location,
                reaction,
                sticker,
                template,
                text,
                type,
                video,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WhatsappMessage{audio=$audio, bizOpaqueCallbackData=$bizOpaqueCallbackData, contacts=$contacts, document=$document, image=$image, interactive=$interactive, location=$location, reaction=$reaction, sticker=$sticker, template=$template, text=$text, type=$type, video=$video, additionalProperties=$additionalProperties}"
    }

    /** Message type - must be set to "WHATSAPP" */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WHATSAPP,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                WHATSAPP -> Value.WHATSAPP
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
                WHATSAPP -> Known.WHATSAPP
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

        return other is MessageWhatsappParams &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(idempotencyKey, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageWhatsappParams{idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
