// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.emailmessages.EmailAddressInput
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * All fields are optional — a draft may be saved incomplete. `account_id`, `inbox_id`, `status`,
 * `sent_at`, `sent_message_id`, `reply_to_message_id` and `thread_id` are server-owned and ignored
 * if supplied.
 */
class EmailDraftRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attachments: JsonField<List<JsonValue>>,
    private val bcc: JsonField<List<EmailAddressInput>>,
    private val cc: JsonField<List<EmailAddressInput>>,
    private val fromEmail: JsonField<String>,
    private val fromName: JsonField<String>,
    private val headers: JsonField<Headers>,
    private val html: JsonField<String>,
    private val htmlBody: JsonField<String>,
    private val labels: JsonField<List<String>>,
    private val metadata: JsonValue,
    private val replyTo: JsonField<String>,
    private val subject: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val text: JsonField<String>,
    private val textBody: JsonField<String>,
    private val to: JsonField<List<EmailAddressInput>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("bcc")
        @ExcludeMissing
        bcc: JsonField<List<EmailAddressInput>> = JsonMissing.of(),
        @JsonProperty("cc")
        @ExcludeMissing
        cc: JsonField<List<EmailAddressInput>> = JsonMissing.of(),
        @JsonProperty("from_email") @ExcludeMissing fromEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("from_name") @ExcludeMissing fromName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("html") @ExcludeMissing html: JsonField<String> = JsonMissing.of(),
        @JsonProperty("html_body") @ExcludeMissing htmlBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labels") @ExcludeMissing labels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("reply_to") @ExcludeMissing replyTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_body") @ExcludeMissing textBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to")
        @ExcludeMissing
        to: JsonField<List<EmailAddressInput>> = JsonMissing.of(),
    ) : this(
        attachments,
        bcc,
        cc,
        fromEmail,
        fromName,
        headers,
        html,
        htmlBody,
        labels,
        metadata,
        replyTo,
        subject,
        tags,
        text,
        textBody,
        to,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachments(): Optional<List<JsonValue>> = attachments.getOptional("attachments")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bcc(): Optional<List<EmailAddressInput>> = bcc.getOptional("bcc")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cc(): Optional<List<EmailAddressInput>> = cc.getOptional("cc")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromEmail(): Optional<String> = fromEmail.getOptional("from_email")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromName(): Optional<String> = fromName.getOptional("from_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = headers.getOptional("headers")

    /**
     * Alias for `html_body`, matching the send endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun html(): Optional<String> = html.getOptional("html")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun htmlBody(): Optional<String> = htmlBody.getOptional("html_body")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun labels(): Optional<List<String>> = labels.getOptional("labels")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = emailDraftRequest.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyTo(): Optional<String> = replyTo.getOptional("reply_to")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Alias for `text_body`, matching the send endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textBody(): Optional<String> = textBody.getOptional("text_body")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<List<EmailAddressInput>> = to.getOptional("to")

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attachments")
    @ExcludeMissing
    fun _attachments(): JsonField<List<JsonValue>> = attachments

    /**
     * Returns the raw JSON value of [bcc].
     *
     * Unlike [bcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bcc") @ExcludeMissing fun _bcc(): JsonField<List<EmailAddressInput>> = bcc

    /**
     * Returns the raw JSON value of [cc].
     *
     * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<List<EmailAddressInput>> = cc

    /**
     * Returns the raw JSON value of [fromEmail].
     *
     * Unlike [fromEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from_email") @ExcludeMissing fun _fromEmail(): JsonField<String> = fromEmail

    /**
     * Returns the raw JSON value of [fromName].
     *
     * Unlike [fromName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from_name") @ExcludeMissing fun _fromName(): JsonField<String> = fromName

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /**
     * Returns the raw JSON value of [html].
     *
     * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html") @ExcludeMissing fun _html(): JsonField<String> = html

    /**
     * Returns the raw JSON value of [htmlBody].
     *
     * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html_body") @ExcludeMissing fun _htmlBody(): JsonField<String> = htmlBody

    /**
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<List<String>> = labels

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reply_to") @ExcludeMissing fun _replyTo(): JsonField<String> = replyTo

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [textBody].
     *
     * Unlike [textBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_body") @ExcludeMissing fun _textBody(): JsonField<String> = textBody

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<List<EmailAddressInput>> = to

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

        /** Returns a mutable builder for constructing an instance of [EmailDraftRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailDraftRequest]. */
    class Builder internal constructor() {

        private var attachments: JsonField<MutableList<JsonValue>>? = null
        private var bcc: JsonField<MutableList<EmailAddressInput>>? = null
        private var cc: JsonField<MutableList<EmailAddressInput>>? = null
        private var fromEmail: JsonField<String> = JsonMissing.of()
        private var fromName: JsonField<String> = JsonMissing.of()
        private var headers: JsonField<Headers> = JsonMissing.of()
        private var html: JsonField<String> = JsonMissing.of()
        private var htmlBody: JsonField<String> = JsonMissing.of()
        private var labels: JsonField<MutableList<String>>? = null
        private var metadata: JsonValue = JsonMissing.of()
        private var replyTo: JsonField<String> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var text: JsonField<String> = JsonMissing.of()
        private var textBody: JsonField<String> = JsonMissing.of()
        private var to: JsonField<MutableList<EmailAddressInput>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailDraftRequest: EmailDraftRequest) = apply {
            attachments = emailDraftRequest.attachments.map { it.toMutableList() }
            bcc = emailDraftRequest.bcc.map { it.toMutableList() }
            cc = emailDraftRequest.cc.map { it.toMutableList() }
            fromEmail = emailDraftRequest.fromEmail
            fromName = emailDraftRequest.fromName
            headers = emailDraftRequest.headers
            html = emailDraftRequest.html
            htmlBody = emailDraftRequest.htmlBody
            labels = emailDraftRequest.labels.map { it.toMutableList() }
            metadata = emailDraftRequest.metadata
            replyTo = emailDraftRequest.replyTo
            subject = emailDraftRequest.subject
            tags = emailDraftRequest.tags.map { it.toMutableList() }
            text = emailDraftRequest.text
            textBody = emailDraftRequest.textBody
            to = emailDraftRequest.to.map { it.toMutableList() }
            additionalProperties = emailDraftRequest.additionalProperties.toMutableMap()
        }

        fun attachments(attachments: List<JsonValue>) = attachments(JsonField.of(attachments))

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<List<JsonValue>>) = apply {
            this.attachments = attachments.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: JsonValue) = apply {
            attachments =
                (attachments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("attachments", it).add(attachment)
                }
        }

        fun bcc(bcc: List<EmailAddressInput>) = bcc(JsonField.of(bcc))

        /**
         * Sets [Builder.bcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bcc] with a well-typed `List<EmailAddressInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bcc(bcc: JsonField<List<EmailAddressInput>>) = apply {
            this.bcc = bcc.map { it.toMutableList() }
        }

        /**
         * Adds a single [EmailAddressInput] to [Builder.bcc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBcc(bcc: EmailAddressInput) = apply {
            this.bcc =
                (this.bcc ?: JsonField.of(mutableListOf())).also { checkKnown("bcc", it).add(bcc) }
        }

        /** Alias for calling [addBcc] with `EmailAddressInput.ofString(string)`. */
        fun addBcc(string: String) = addBcc(EmailAddressInput.ofString(string))

        /** Alias for calling [addBcc] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
        fun addBcc(emailAddress: EmailAddress) =
            addBcc(EmailAddressInput.ofEmailAddress(emailAddress))

        fun cc(cc: List<EmailAddressInput>) = cc(JsonField.of(cc))

        /**
         * Sets [Builder.cc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cc] with a well-typed `List<EmailAddressInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cc(cc: JsonField<List<EmailAddressInput>>) = apply {
            this.cc = cc.map { it.toMutableList() }
        }

        /**
         * Adds a single [EmailAddressInput] to [Builder.cc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCc(cc: EmailAddressInput) = apply {
            this.cc =
                (this.cc ?: JsonField.of(mutableListOf())).also { checkKnown("cc", it).add(cc) }
        }

        /** Alias for calling [addCc] with `EmailAddressInput.ofString(string)`. */
        fun addCc(string: String) = addCc(EmailAddressInput.ofString(string))

        /** Alias for calling [addCc] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
        fun addCc(emailAddress: EmailAddress) =
            addCc(EmailAddressInput.ofEmailAddress(emailAddress))

        fun fromEmail(fromEmail: String) = fromEmail(JsonField.of(fromEmail))

        /**
         * Sets [Builder.fromEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fromEmail(fromEmail: JsonField<String>) = apply { this.fromEmail = fromEmail }

        fun fromName(fromName: String) = fromName(JsonField.of(fromName))

        /**
         * Sets [Builder.fromName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fromName(fromName: JsonField<String>) = apply { this.fromName = fromName }

        fun headers(headers: Headers) = headers(JsonField.of(headers))

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /** Alias for `html_body`, matching the send endpoint. */
        fun html(html: String) = html(JsonField.of(html))

        /**
         * Sets [Builder.html] to an arbitrary JSON value.
         *
         * You should usually call [Builder.html] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun html(html: JsonField<String>) = apply { this.html = html }

        fun htmlBody(htmlBody: String) = htmlBody(JsonField.of(htmlBody))

        /**
         * Sets [Builder.htmlBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun htmlBody(htmlBody: JsonField<String>) = apply { this.htmlBody = htmlBody }

        fun labels(labels: List<String>) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun labels(labels: JsonField<List<String>>) = apply {
            this.labels = labels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [labels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLabel(label: String) = apply {
            labels =
                (labels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("labels", it).add(label)
                }
        }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun replyTo(replyTo: String) = replyTo(JsonField.of(replyTo))

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun replyTo(replyTo: JsonField<String>) = apply { this.replyTo = replyTo }

        fun subject(subject: String) = subject(JsonField.of(subject))

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Alias for `text_body`, matching the send endpoint. */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun textBody(textBody: String) = textBody(JsonField.of(textBody))

        /**
         * Sets [Builder.textBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textBody(textBody: JsonField<String>) = apply { this.textBody = textBody }

        fun to(to: List<EmailAddressInput>) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed `List<EmailAddressInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun to(to: JsonField<List<EmailAddressInput>>) = apply {
            this.to = to.map { it.toMutableList() }
        }

        /**
         * Adds a single [EmailAddressInput] to [Builder.to].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTo(to: EmailAddressInput) = apply {
            this.to =
                (this.to ?: JsonField.of(mutableListOf())).also { checkKnown("to", it).add(to) }
        }

        /** Alias for calling [addTo] with `EmailAddressInput.ofString(string)`. */
        fun addTo(string: String) = addTo(EmailAddressInput.ofString(string))

        /** Alias for calling [addTo] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
        fun addTo(emailAddress: EmailAddress) =
            addTo(EmailAddressInput.ofEmailAddress(emailAddress))

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
         * Returns an immutable instance of [EmailDraftRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailDraftRequest =
            EmailDraftRequest(
                (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                (bcc ?: JsonMissing.of()).map { it.toImmutable() },
                (cc ?: JsonMissing.of()).map { it.toImmutable() },
                fromEmail,
                fromName,
                headers,
                html,
                htmlBody,
                (labels ?: JsonMissing.of()).map { it.toImmutable() },
                metadata,
                replyTo,
                subject,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                text,
                textBody,
                (to ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): EmailDraftRequest = apply {
        if (validated) {
            return@apply
        }

        attachments()
        bcc().ifPresent { it.forEach { it.validate() } }
        cc().ifPresent { it.forEach { it.validate() } }
        fromEmail()
        fromName()
        headers().ifPresent { it.validate() }
        html()
        htmlBody()
        labels()
        replyTo()
        subject()
        tags()
        text()
        textBody()
        to().ifPresent { it.forEach { it.validate() } }
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
        (attachments.asKnown().getOrNull()?.size ?: 0) +
            (bcc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (cc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (fromEmail.asKnown().isPresent) 1 else 0) +
            (if (fromName.asKnown().isPresent) 1 else 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (if (html.asKnown().isPresent) 1 else 0) +
            (if (htmlBody.asKnown().isPresent) 1 else 0) +
            (labels.asKnown().getOrNull()?.size ?: 0) +
            (if (replyTo.asKnown().isPresent) 1 else 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (textBody.asKnown().isPresent) 1 else 0) +
            (to.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Headers
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

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
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
        fun validate(): Headers = apply {
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

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailDraftRequest &&
            attachments == other.attachments &&
            bcc == other.bcc &&
            cc == other.cc &&
            fromEmail == other.fromEmail &&
            fromName == other.fromName &&
            headers == other.headers &&
            html == other.html &&
            htmlBody == other.htmlBody &&
            labels == other.labels &&
            metadata == other.metadata &&
            replyTo == other.replyTo &&
            subject == other.subject &&
            tags == other.tags &&
            text == other.text &&
            textBody == other.textBody &&
            to == other.to &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            attachments,
            bcc,
            cc,
            fromEmail,
            fromName,
            headers,
            html,
            htmlBody,
            labels,
            metadata,
            replyTo,
            subject,
            tags,
            text,
            textBody,
            to,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailDraftRequest{attachments=$attachments, bcc=$bcc, cc=$cc, fromEmail=$fromEmail, fromName=$fromName, headers=$headers, html=$html, htmlBody=$htmlBody, labels=$labels, metadata=$metadata, replyTo=$replyTo, subject=$subject, tags=$tags, text=$text, textBody=$textBody, to=$to, additionalProperties=$additionalProperties}"
}
