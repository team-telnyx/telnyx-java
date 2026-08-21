// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.actions

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
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Sends from the inbox address through the standard email send pipeline to caller-supplied To, Cc,
 * and Bcc recipients. `to` must contain at least one recipient. Optional `text` and `html` are
 * prepended to a forwarded-message block containing the original metadata and available body
 * content. The subject is prefixed with `Fwd:` unless it already has that prefix.
 *
 * Threading headers are derived from the original message: `In-Reply-To` is set to its RFC
 * Message-ID, and `References` contains the original References values plus that Message-ID,
 * de-duplicated and limited to the most recent 20 values.
 */
class ActionForwardParams
private constructor(
    private val inboxId: String,
    private val messageId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): String = inboxId

    fun messageId(): Optional<String> = Optional.ofNullable(messageId)

    /**
     * One recipient or a non-empty recipient array. Each recipient may be an email string or an
     * object with `email` and optional `name`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): To = body.to()

    /**
     * One recipient or a recipient array. Each recipient may be an email string or an object with
     * `email` and optional `name`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bcc(): Optional<InboxActionRecipientInput> = body.bcc()

    /**
     * One recipient or a recipient array. Each recipient may be an email string or an object with
     * `email` and optional `name`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cc(): Optional<InboxActionRecipientInput> = body.cc()

    /**
     * Optional HTML note prepended to the generated forwarded-message block. Blank values are
     * treated as omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun html(): Optional<String> = body.html()

    /**
     * Optional plain-text note prepended to the generated forwarded-message block. Blank values are
     * treated as omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<To> = body._to()

    /**
     * Returns the raw JSON value of [bcc].
     *
     * Unlike [bcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bcc(): JsonField<InboxActionRecipientInput> = body._bcc()

    /**
     * Returns the raw JSON value of [cc].
     *
     * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cc(): JsonField<InboxActionRecipientInput> = body._cc()

    /**
     * Returns the raw JSON value of [html].
     *
     * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _html(): JsonField<String> = body._html()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionForwardParams].
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionForwardParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var messageId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionForwardParams: ActionForwardParams) = apply {
            inboxId = actionForwardParams.inboxId
            messageId = actionForwardParams.messageId
            body = actionForwardParams.body.toBuilder()
            additionalHeaders = actionForwardParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionForwardParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String) = apply { this.inboxId = inboxId }

        fun messageId(messageId: String?) = apply { this.messageId = messageId }

        /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
        fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [to]
         * - [bcc]
         * - [cc]
         * - [html]
         * - [text]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * One recipient or a non-empty recipient array. Each recipient may be an email string or an
         * object with `email` and optional `name`.
         */
        fun to(to: To) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [To] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<To>) = apply { body.to(to) }

        /** Alias for calling [to] with `To.ofString(string)`. */
        fun to(string: String) = apply { body.to(string) }

        /** Alias for calling [to] with `To.ofInboxRecipientAddress(inboxRecipientAddress)`. */
        fun to(inboxRecipientAddress: To.InboxRecipientAddress) = apply {
            body.to(inboxRecipientAddress)
        }

        /**
         * Alias for calling [to] with
         * `To.ofRequiredInboxRecipientList(requiredInboxRecipientList)`.
         */
        fun toOfRequiredInboxRecipientList(
            requiredInboxRecipientList: List<InboxActionEmailAddressInput>
        ) = apply { body.toOfRequiredInboxRecipientList(requiredInboxRecipientList) }

        /**
         * One recipient or a recipient array. Each recipient may be an email string or an object
         * with `email` and optional `name`.
         */
        fun bcc(bcc: InboxActionRecipientInput) = apply { body.bcc(bcc) }

        /**
         * Sets [Builder.bcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bcc] with a well-typed [InboxActionRecipientInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bcc(bcc: JsonField<InboxActionRecipientInput>) = apply { body.bcc(bcc) }

        /** Alias for calling [bcc] with `InboxActionRecipientInput.ofString(string)`. */
        fun bcc(string: String) = apply { body.bcc(string) }

        /**
         * Alias for calling [bcc] with
         * `InboxActionRecipientInput.ofRecipientAddress(recipientAddress)`.
         */
        fun bcc(recipientAddress: InboxActionRecipientInput.InboxRecipientAddress) = apply {
            body.bcc(recipientAddress)
        }

        /**
         * Alias for calling [bcc] with `InboxActionRecipientInput.ofRecipientList(recipientList)`.
         */
        fun bccOfRecipientList(recipientList: List<InboxActionEmailAddressInput>) = apply {
            body.bccOfRecipientList(recipientList)
        }

        /**
         * One recipient or a recipient array. Each recipient may be an email string or an object
         * with `email` and optional `name`.
         */
        fun cc(cc: InboxActionRecipientInput) = apply { body.cc(cc) }

        /**
         * Sets [Builder.cc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cc] with a well-typed [InboxActionRecipientInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cc(cc: JsonField<InboxActionRecipientInput>) = apply { body.cc(cc) }

        /** Alias for calling [cc] with `InboxActionRecipientInput.ofString(string)`. */
        fun cc(string: String) = apply { body.cc(string) }

        /**
         * Alias for calling [cc] with
         * `InboxActionRecipientInput.ofRecipientAddress(recipientAddress)`.
         */
        fun cc(recipientAddress: InboxActionRecipientInput.InboxRecipientAddress) = apply {
            body.cc(recipientAddress)
        }

        /**
         * Alias for calling [cc] with `InboxActionRecipientInput.ofRecipientList(recipientList)`.
         */
        fun ccOfRecipientList(recipientList: List<InboxActionEmailAddressInput>) = apply {
            body.ccOfRecipientList(recipientList)
        }

        /**
         * Optional HTML note prepended to the generated forwarded-message block. Blank values are
         * treated as omitted.
         */
        fun html(html: String) = apply { body.html(html) }

        /**
         * Sets [Builder.html] to an arbitrary JSON value.
         *
         * You should usually call [Builder.html] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun html(html: JsonField<String>) = apply { body.html(html) }

        /**
         * Optional plain-text note prepended to the generated forwarded-message block. Blank values
         * are treated as omitted.
         */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

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
         * Returns an immutable instance of [ActionForwardParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionForwardParams =
            ActionForwardParams(
                checkRequired("inboxId", inboxId),
                messageId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId
            1 -> messageId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val to: JsonField<To>,
        private val bcc: JsonField<InboxActionRecipientInput>,
        private val cc: JsonField<InboxActionRecipientInput>,
        private val html: JsonField<String>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("to") @ExcludeMissing to: JsonField<To> = JsonMissing.of(),
            @JsonProperty("bcc")
            @ExcludeMissing
            bcc: JsonField<InboxActionRecipientInput> = JsonMissing.of(),
            @JsonProperty("cc")
            @ExcludeMissing
            cc: JsonField<InboxActionRecipientInput> = JsonMissing.of(),
            @JsonProperty("html") @ExcludeMissing html: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(to, bcc, cc, html, text, mutableMapOf())

        /**
         * One recipient or a non-empty recipient array. Each recipient may be an email string or an
         * object with `email` and optional `name`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): To = to.getRequired("to")

        /**
         * One recipient or a recipient array. Each recipient may be an email string or an object
         * with `email` and optional `name`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bcc(): Optional<InboxActionRecipientInput> = bcc.getOptional("bcc")

        /**
         * One recipient or a recipient array. Each recipient may be an email string or an object
         * with `email` and optional `name`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cc(): Optional<InboxActionRecipientInput> = cc.getOptional("cc")

        /**
         * Optional HTML note prepended to the generated forwarded-message block. Blank values are
         * treated as omitted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun html(): Optional<String> = html.getOptional("html")

        /**
         * Optional plain-text note prepended to the generated forwarded-message block. Blank values
         * are treated as omitted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<To> = to

        /**
         * Returns the raw JSON value of [bcc].
         *
         * Unlike [bcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bcc") @ExcludeMissing fun _bcc(): JsonField<InboxActionRecipientInput> = bcc

        /**
         * Returns the raw JSON value of [cc].
         *
         * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<InboxActionRecipientInput> = cc

        /**
         * Returns the raw JSON value of [html].
         *
         * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("html") @ExcludeMissing fun _html(): JsonField<String> = html

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var to: JsonField<To>? = null
            private var bcc: JsonField<InboxActionRecipientInput> = JsonMissing.of()
            private var cc: JsonField<InboxActionRecipientInput> = JsonMissing.of()
            private var html: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                to = body.to
                bcc = body.bcc
                cc = body.cc
                html = body.html
                text = body.text
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * One recipient or a non-empty recipient array. Each recipient may be an email string
             * or an object with `email` and optional `name`.
             */
            fun to(to: To) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [To] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<To>) = apply { this.to = to }

            /** Alias for calling [to] with `To.ofString(string)`. */
            fun to(string: String) = to(To.ofString(string))

            /** Alias for calling [to] with `To.ofInboxRecipientAddress(inboxRecipientAddress)`. */
            fun to(inboxRecipientAddress: To.InboxRecipientAddress) =
                to(To.ofInboxRecipientAddress(inboxRecipientAddress))

            /**
             * Alias for calling [to] with
             * `To.ofRequiredInboxRecipientList(requiredInboxRecipientList)`.
             */
            fun toOfRequiredInboxRecipientList(
                requiredInboxRecipientList: List<InboxActionEmailAddressInput>
            ) = to(To.ofRequiredInboxRecipientList(requiredInboxRecipientList))

            /**
             * One recipient or a recipient array. Each recipient may be an email string or an
             * object with `email` and optional `name`.
             */
            fun bcc(bcc: InboxActionRecipientInput) = bcc(JsonField.of(bcc))

            /**
             * Sets [Builder.bcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bcc] with a well-typed [InboxActionRecipientInput]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun bcc(bcc: JsonField<InboxActionRecipientInput>) = apply { this.bcc = bcc }

            /** Alias for calling [bcc] with `InboxActionRecipientInput.ofString(string)`. */
            fun bcc(string: String) = bcc(InboxActionRecipientInput.ofString(string))

            /**
             * Alias for calling [bcc] with
             * `InboxActionRecipientInput.ofRecipientAddress(recipientAddress)`.
             */
            fun bcc(recipientAddress: InboxActionRecipientInput.InboxRecipientAddress) =
                bcc(InboxActionRecipientInput.ofRecipientAddress(recipientAddress))

            /**
             * Alias for calling [bcc] with
             * `InboxActionRecipientInput.ofRecipientList(recipientList)`.
             */
            fun bccOfRecipientList(recipientList: List<InboxActionEmailAddressInput>) =
                bcc(InboxActionRecipientInput.ofRecipientList(recipientList))

            /**
             * One recipient or a recipient array. Each recipient may be an email string or an
             * object with `email` and optional `name`.
             */
            fun cc(cc: InboxActionRecipientInput) = cc(JsonField.of(cc))

            /**
             * Sets [Builder.cc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cc] with a well-typed [InboxActionRecipientInput]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cc(cc: JsonField<InboxActionRecipientInput>) = apply { this.cc = cc }

            /** Alias for calling [cc] with `InboxActionRecipientInput.ofString(string)`. */
            fun cc(string: String) = cc(InboxActionRecipientInput.ofString(string))

            /**
             * Alias for calling [cc] with
             * `InboxActionRecipientInput.ofRecipientAddress(recipientAddress)`.
             */
            fun cc(recipientAddress: InboxActionRecipientInput.InboxRecipientAddress) =
                cc(InboxActionRecipientInput.ofRecipientAddress(recipientAddress))

            /**
             * Alias for calling [cc] with
             * `InboxActionRecipientInput.ofRecipientList(recipientList)`.
             */
            fun ccOfRecipientList(recipientList: List<InboxActionEmailAddressInput>) =
                cc(InboxActionRecipientInput.ofRecipientList(recipientList))

            /**
             * Optional HTML note prepended to the generated forwarded-message block. Blank values
             * are treated as omitted.
             */
            fun html(html: String) = html(JsonField.of(html))

            /**
             * Sets [Builder.html] to an arbitrary JSON value.
             *
             * You should usually call [Builder.html] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun html(html: JsonField<String>) = apply { this.html = html }

            /**
             * Optional plain-text note prepended to the generated forwarded-message block. Blank
             * values are treated as omitted.
             */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

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
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("to", to),
                    bcc,
                    cc,
                    html,
                    text,
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

            to().validate()
            bcc().ifPresent { it.validate() }
            cc().ifPresent { it.validate() }
            html()
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
        internal fun validity(): Int =
            (to.asKnown().getOrNull()?.validity() ?: 0) +
                (bcc.asKnown().getOrNull()?.validity() ?: 0) +
                (cc.asKnown().getOrNull()?.validity() ?: 0) +
                (if (html.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                to == other.to &&
                bcc == other.bcc &&
                cc == other.cc &&
                html == other.html &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(to, bcc, cc, html, text, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{to=$to, bcc=$bcc, cc=$cc, html=$html, text=$text, additionalProperties=$additionalProperties}"
    }

    /**
     * One recipient or a non-empty recipient array. Each recipient may be an email string or an
     * object with `email` and optional `name`.
     */
    @JsonDeserialize(using = To.Deserializer::class)
    @JsonSerialize(using = To.Serializer::class)
    class To
    private constructor(
        private val string: String? = null,
        private val inboxRecipientAddress: InboxRecipientAddress? = null,
        private val requiredInboxRecipientList: List<InboxActionEmailAddressInput>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun inboxRecipientAddress(): Optional<InboxRecipientAddress> =
            Optional.ofNullable(inboxRecipientAddress)

        fun requiredInboxRecipientList(): Optional<List<InboxActionEmailAddressInput>> =
            Optional.ofNullable(requiredInboxRecipientList)

        fun isString(): Boolean = string != null

        fun isInboxRecipientAddress(): Boolean = inboxRecipientAddress != null

        fun isRequiredInboxRecipientList(): Boolean = requiredInboxRecipientList != null

        fun asString(): String = string.getOrThrow("string")

        fun asInboxRecipientAddress(): InboxRecipientAddress =
            inboxRecipientAddress.getOrThrow("inboxRecipientAddress")

        fun asRequiredInboxRecipientList(): List<InboxActionEmailAddressInput> =
            requiredInboxRecipientList.getOrThrow("requiredInboxRecipientList")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = to.accept(new To.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
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
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                inboxRecipientAddress != null ->
                    visitor.visitInboxRecipientAddress(inboxRecipientAddress)
                requiredInboxRecipientList != null ->
                    visitor.visitRequiredInboxRecipientList(requiredInboxRecipientList)
                else -> visitor.unknown(_json)
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
        fun validate(): To = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitInboxRecipientAddress(
                        inboxRecipientAddress: InboxRecipientAddress
                    ) {
                        inboxRecipientAddress.validate()
                    }

                    override fun visitRequiredInboxRecipientList(
                        requiredInboxRecipientList: List<InboxActionEmailAddressInput>
                    ) {
                        requiredInboxRecipientList.forEach { it.validate() }
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
                    override fun visitString(string: String) = 1

                    override fun visitInboxRecipientAddress(
                        inboxRecipientAddress: InboxRecipientAddress
                    ) = inboxRecipientAddress.validity()

                    override fun visitRequiredInboxRecipientList(
                        requiredInboxRecipientList: List<InboxActionEmailAddressInput>
                    ) = requiredInboxRecipientList.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is To &&
                string == other.string &&
                inboxRecipientAddress == other.inboxRecipientAddress &&
                requiredInboxRecipientList == other.requiredInboxRecipientList
        }

        override fun hashCode(): Int =
            Objects.hash(string, inboxRecipientAddress, requiredInboxRecipientList)

        override fun toString(): String =
            when {
                string != null -> "To{string=$string}"
                inboxRecipientAddress != null -> "To{inboxRecipientAddress=$inboxRecipientAddress}"
                requiredInboxRecipientList != null ->
                    "To{requiredInboxRecipientList=$requiredInboxRecipientList}"
                _json != null -> "To{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid To")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = To(string = string)

            @JvmStatic
            fun ofInboxRecipientAddress(inboxRecipientAddress: InboxRecipientAddress) =
                To(inboxRecipientAddress = inboxRecipientAddress)

            @JvmStatic
            fun ofRequiredInboxRecipientList(
                requiredInboxRecipientList: List<InboxActionEmailAddressInput>
            ) = To(requiredInboxRecipientList = requiredInboxRecipientList.toImmutable())
        }

        /** An interface that defines how to map each variant of [To] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitInboxRecipientAddress(inboxRecipientAddress: InboxRecipientAddress): T

            fun visitRequiredInboxRecipientList(
                requiredInboxRecipientList: List<InboxActionEmailAddressInput>
            ): T

            /**
             * Maps an unknown variant of [To] to a value of type [T].
             *
             * An instance of [To] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
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
                            tryDeserialize(node, jacksonTypeRef<InboxRecipientAddress>())?.let {
                                To(inboxRecipientAddress = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                To(string = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<InboxActionEmailAddressInput>>(),
                                )
                                ?.let { To(requiredInboxRecipientList = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> To(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
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
                    value.string != null -> generator.writeObject(value.string)
                    value.inboxRecipientAddress != null ->
                        generator.writeObject(value.inboxRecipientAddress)
                    value.requiredInboxRecipientList != null ->
                        generator.writeObject(value.requiredInboxRecipientList)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid To")
                }
            }
        }

        class InboxRecipientAddress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val email: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(email, name, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [InboxRecipientAddress].
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InboxRecipientAddress]. */
            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboxRecipientAddress: InboxRecipientAddress) = apply {
                    email = inboxRecipientAddress.email
                    name = inboxRecipientAddress.name
                    additionalProperties = inboxRecipientAddress.additionalProperties.toMutableMap()
                }

                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * Returns an immutable instance of [InboxRecipientAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InboxRecipientAddress =
                    InboxRecipientAddress(
                        checkRequired("email", email),
                        name,
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
            fun validate(): InboxRecipientAddress = apply {
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
                (if (email.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboxRecipientAddress &&
                    email == other.email &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(email, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboxRecipientAddress{email=$email, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionForwardParams &&
            inboxId == other.inboxId &&
            messageId == other.messageId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(inboxId, messageId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionForwardParams{inboxId=$inboxId, messageId=$messageId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
