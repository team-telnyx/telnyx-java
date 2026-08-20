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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Queues, schedules, or sandbox-sends an email message. The legacy `/v2/emails` POST route is a
 * backward-compatible alias for this operation.
 *
 * `subject` is required unless `template_id` is supplied. When using `template_id`, do not also
 * provide `subject`, `html_body`, or `text_body`; the template is rendered with
 * `template_variables`.
 *
 * Note: template lookup failures (not found, wrong account) return 400, not 404.
 */
class EmailMessageCreateParams
private constructor(
    private val idempotencyKey: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): EmailAddressInput = body.from()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): List<EmailAddressInput> = body.to()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachments(): Optional<List<AttachmentRequest>> = body.attachments()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bcc(): Optional<List<EmailAddressInput>> = body.bcc()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cc(): Optional<List<EmailAddressInput>> = body.cc()

    /**
     * Telnyx message UUID of the message this send forwards. Forwarded messages start a NEW thread
     * per RFC 5322 — NO `In-Reply-To` or `References` headers are set on the outbound MIME. The id
     * is recorded in the message's metadata for EDR provenance only.
     *
     * The id is validated as a UUID but is NOT looked up against the message store — existence is
     * the caller's responsibility (the forward is pure metadata; it does not affect delivery).
     * Cannot be combined with `in_reply_to_message_id` (422).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forwardOfMessageId(): Optional<String> = body.forwardOfMessageId()

    /**
     * Optional display name for string `from`; overrides `from.name` when provided.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromName(): Optional<String> = body.fromName()

    /**
     * Optional unsubscribe-group UUID used for group-scoped suppression checks and unsubscribe
     * handling.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<String> = body.groupId()

    /**
     * Custom email headers. Write-only; not returned in responses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = body.headers()

    /**
     * HTML email body. Returned only by `GET /email_messages/{id}`; omitted from create and list
     * responses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun htmlBody(): Optional<String> = body.htmlBody()

    /**
     * When true, allows delivery to recipients whose suppressions explicitly permit an override.
     * Hard bounces, spam complaints, and invalid-address suppressions cannot be overridden.
     * Requires the `email:override` API scope.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ignoreSuppression(): Optional<Boolean> = body.ignoreSuppression()

    /**
     * Telnyx message UUID of the message this send replies to. When provided, the API sets RFC 5322
     * `In-Reply-To` and `References` headers on the outbound MIME so the recipient's mailbox
     * (Gmail/Outlook) threads it correctly. The parent is looked up under the caller's account
     * scope; a UUID belonging to another account yields a non-enumerating 404.
     *
     * Wire-only (Phase 1): the API sets the headers and does NOT resolve or mutate `thread_id` on
     * the server side. Messages sent without this parameter are standalone (no threading headers
     * injected).
     *
     * Cannot be combined with `forward_of_message_id` (422).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inReplyToMessageId(): Optional<String> = body.inReplyToMessageId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inlineCss(): Optional<Boolean> = body.inlineCss()

    /**
     * Custom metadata. Write-only; not returned in responses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Reply-to address. If provided as an object with a name, only the email is stored; the name is
     * ignored.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyTo(): Optional<EmailAddressInput> = body.replyTo()

    /**
     * Indicates a reply-all intent. In Phase 1 (wire-only) this does not change the threading
     * headers — recipient selection is customer- controlled (`to`/`cc`), and a thread is not
     * defined by its audience. When the referenced message has no thread context, reply-all
     * degrades to a plain reply (parent ID only in `References`). The resolution engine (separate
     * work) will expand the ancestor chain at a later phase with no API change.
     *
     * Only meaningful alongside `in_reply_to_message_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyToAll(): Optional<Boolean> = body.replyToAll()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandboxMode(): Optional<Boolean> = body.sandboxMode()

    /**
     * Future ISO 8601 time to schedule sending. Invalid or past timestamps are silently ignored and
     * the email is sent immediately. The legacy alias `send_at` is still accepted for backward
     * compatibility; when both are provided, `scheduled_at` wins.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledAt(): Optional<OffsetDateTime> = body.scheduledAt()

    /**
     * Deprecated alias for `scheduled_at`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("Use scheduled_at instead.") fun sendAt(): Optional<OffsetDateTime> = body.sendAt()

    /**
     * Required unless `template_id` is supplied. When using a template, the template's subject is
     * rendered; if the template has no subject or renders empty, the request returns 400.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = body.subject()

    /**
     * Tags for categorization and reporting. Stored on the message and propagated to Email Detail
     * Records. Not returned in API responses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateId(): Optional<String> = body.templateId()

    /**
     * Variables for Liquid template rendering. Non-object values may cause a 422 validation error
     * on message creation, but are silently treated as an empty object for template rendering.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateVariables(): Optional<TemplateVariables> = body.templateVariables()

    /**
     * Plain text email body. Returned only by `GET /email_messages/{id}`; omitted from create and
     * list responses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textBody(): Optional<String> = body.textBody()

    /**
     * Per-send open and click tracking overrides. Omitted properties inherit the sender domain's
     * tracking settings.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trackingSettings(): Optional<TrackingSettings> = body.trackingSettings()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<EmailAddressInput> = body._from()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<List<EmailAddressInput>> = body._to()

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attachments(): JsonField<List<AttachmentRequest>> = body._attachments()

    /**
     * Returns the raw JSON value of [bcc].
     *
     * Unlike [bcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bcc(): JsonField<List<EmailAddressInput>> = body._bcc()

    /**
     * Returns the raw JSON value of [cc].
     *
     * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cc(): JsonField<List<EmailAddressInput>> = body._cc()

    /**
     * Returns the raw JSON value of [forwardOfMessageId].
     *
     * Unlike [forwardOfMessageId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _forwardOfMessageId(): JsonField<String> = body._forwardOfMessageId()

    /**
     * Returns the raw JSON value of [fromName].
     *
     * Unlike [fromName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fromName(): JsonField<String> = body._fromName()

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupId(): JsonField<String> = body._groupId()

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _headers_(): JsonField<Headers> = body._headers_()

    /**
     * Returns the raw JSON value of [htmlBody].
     *
     * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _htmlBody(): JsonField<String> = body._htmlBody()

    /**
     * Returns the raw JSON value of [ignoreSuppression].
     *
     * Unlike [ignoreSuppression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _ignoreSuppression(): JsonField<Boolean> = body._ignoreSuppression()

    /**
     * Returns the raw JSON value of [inReplyToMessageId].
     *
     * Unlike [inReplyToMessageId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _inReplyToMessageId(): JsonField<String> = body._inReplyToMessageId()

    /**
     * Returns the raw JSON value of [inlineCss].
     *
     * Unlike [inlineCss], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inlineCss(): JsonField<Boolean> = body._inlineCss()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _replyTo(): JsonField<EmailAddressInput> = body._replyTo()

    /**
     * Returns the raw JSON value of [replyToAll].
     *
     * Unlike [replyToAll], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _replyToAll(): JsonField<Boolean> = body._replyToAll()

    /**
     * Returns the raw JSON value of [sandboxMode].
     *
     * Unlike [sandboxMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sandboxMode(): JsonField<Boolean> = body._sandboxMode()

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scheduledAt(): JsonField<OffsetDateTime> = body._scheduledAt()

    /**
     * Returns the raw JSON value of [sendAt].
     *
     * Unlike [sendAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("Use scheduled_at instead.")
    fun _sendAt(): JsonField<OffsetDateTime> = body._sendAt()

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subject(): JsonField<String> = body._subject()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _templateId(): JsonField<String> = body._templateId()

    /**
     * Returns the raw JSON value of [templateVariables].
     *
     * Unlike [templateVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _templateVariables(): JsonField<TemplateVariables> = body._templateVariables()

    /**
     * Returns the raw JSON value of [textBody].
     *
     * Unlike [textBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _textBody(): JsonField<String> = body._textBody()

    /**
     * Returns the raw JSON value of [trackingSettings].
     *
     * Unlike [trackingSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _trackingSettings(): JsonField<TrackingSettings> = body._trackingSettings()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailMessageCreateParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailMessageCreateParams]. */
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailMessageCreateParams: EmailMessageCreateParams) = apply {
            idempotencyKey = emailMessageCreateParams.idempotencyKey
            body = emailMessageCreateParams.body.toBuilder()
            additionalHeaders = emailMessageCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailMessageCreateParams.additionalQueryParams.toBuilder()
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
         * - [attachments]
         * - [bcc]
         * - [cc]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun from(from: EmailAddressInput) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [EmailAddressInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun from(from: JsonField<EmailAddressInput>) = apply { body.from(from) }

        /** Alias for calling [from] with `EmailAddressInput.ofString(string)`. */
        fun from(string: String) = apply { body.from(string) }

        /** Alias for calling [from] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
        fun from(emailAddress: EmailAddress) = apply { body.from(emailAddress) }

        fun to(to: List<EmailAddressInput>) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed `List<EmailAddressInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun to(to: JsonField<List<EmailAddressInput>>) = apply { body.to(to) }

        /**
         * Adds a single [EmailAddressInput] to [Builder.to].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTo(to: EmailAddressInput) = apply { body.addTo(to) }

        /** Alias for calling [addTo] with `EmailAddressInput.ofString(string)`. */
        fun addTo(string: String) = apply { body.addTo(string) }

        /** Alias for calling [addTo] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
        fun addTo(emailAddress: EmailAddress) = apply { body.addTo(emailAddress) }

        fun attachments(attachments: List<AttachmentRequest>) = apply {
            body.attachments(attachments)
        }

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<AttachmentRequest>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attachments(attachments: JsonField<List<AttachmentRequest>>) = apply {
            body.attachments(attachments)
        }

        /**
         * Adds a single [AttachmentRequest] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: AttachmentRequest) = apply { body.addAttachment(attachment) }

        fun bcc(bcc: List<EmailAddressInput>) = apply { body.bcc(bcc) }

        /**
         * Sets [Builder.bcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bcc] with a well-typed `List<EmailAddressInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bcc(bcc: JsonField<List<EmailAddressInput>>) = apply { body.bcc(bcc) }

        /**
         * Adds a single [EmailAddressInput] to [Builder.bcc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBcc(bcc: EmailAddressInput) = apply { body.addBcc(bcc) }

        /** Alias for calling [addBcc] with `EmailAddressInput.ofString(string)`. */
        fun addBcc(string: String) = apply { body.addBcc(string) }

        /** Alias for calling [addBcc] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
        fun addBcc(emailAddress: EmailAddress) = apply { body.addBcc(emailAddress) }

        fun cc(cc: List<EmailAddressInput>) = apply { body.cc(cc) }

        /**
         * Sets [Builder.cc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cc] with a well-typed `List<EmailAddressInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cc(cc: JsonField<List<EmailAddressInput>>) = apply { body.cc(cc) }

        /**
         * Adds a single [EmailAddressInput] to [Builder.cc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCc(cc: EmailAddressInput) = apply { body.addCc(cc) }

        /** Alias for calling [addCc] with `EmailAddressInput.ofString(string)`. */
        fun addCc(string: String) = apply { body.addCc(string) }

        /** Alias for calling [addCc] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
        fun addCc(emailAddress: EmailAddress) = apply { body.addCc(emailAddress) }

        /**
         * Telnyx message UUID of the message this send forwards. Forwarded messages start a NEW
         * thread per RFC 5322 — NO `In-Reply-To` or `References` headers are set on the outbound
         * MIME. The id is recorded in the message's metadata for EDR provenance only.
         *
         * The id is validated as a UUID but is NOT looked up against the message store — existence
         * is the caller's responsibility (the forward is pure metadata; it does not affect
         * delivery). Cannot be combined with `in_reply_to_message_id` (422).
         */
        fun forwardOfMessageId(forwardOfMessageId: String?) = apply {
            body.forwardOfMessageId(forwardOfMessageId)
        }

        /**
         * Alias for calling [Builder.forwardOfMessageId] with `forwardOfMessageId.orElse(null)`.
         */
        fun forwardOfMessageId(forwardOfMessageId: Optional<String>) =
            forwardOfMessageId(forwardOfMessageId.getOrNull())

        /**
         * Sets [Builder.forwardOfMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forwardOfMessageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun forwardOfMessageId(forwardOfMessageId: JsonField<String>) = apply {
            body.forwardOfMessageId(forwardOfMessageId)
        }

        /** Optional display name for string `from`; overrides `from.name` when provided. */
        fun fromName(fromName: String) = apply { body.fromName(fromName) }

        /**
         * Sets [Builder.fromName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fromName(fromName: JsonField<String>) = apply { body.fromName(fromName) }

        /**
         * Optional unsubscribe-group UUID used for group-scoped suppression checks and unsubscribe
         * handling.
         */
        fun groupId(groupId: String?) = apply { body.groupId(groupId) }

        /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
        fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { body.groupId(groupId) }

        /** Custom email headers. Write-only; not returned in responses. */
        fun headers(headers: Headers) = apply { body.headers(headers) }

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { body.headers(headers) }

        /**
         * HTML email body. Returned only by `GET /email_messages/{id}`; omitted from create and
         * list responses.
         */
        fun htmlBody(htmlBody: String) = apply { body.htmlBody(htmlBody) }

        /**
         * Sets [Builder.htmlBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun htmlBody(htmlBody: JsonField<String>) = apply { body.htmlBody(htmlBody) }

        /**
         * When true, allows delivery to recipients whose suppressions explicitly permit an
         * override. Hard bounces, spam complaints, and invalid-address suppressions cannot be
         * overridden. Requires the `email:override` API scope.
         */
        fun ignoreSuppression(ignoreSuppression: Boolean) = apply {
            body.ignoreSuppression(ignoreSuppression)
        }

        /**
         * Sets [Builder.ignoreSuppression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ignoreSuppression] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ignoreSuppression(ignoreSuppression: JsonField<Boolean>) = apply {
            body.ignoreSuppression(ignoreSuppression)
        }

        /**
         * Telnyx message UUID of the message this send replies to. When provided, the API sets RFC
         * 5322 `In-Reply-To` and `References` headers on the outbound MIME so the recipient's
         * mailbox (Gmail/Outlook) threads it correctly. The parent is looked up under the caller's
         * account scope; a UUID belonging to another account yields a non-enumerating 404.
         *
         * Wire-only (Phase 1): the API sets the headers and does NOT resolve or mutate `thread_id`
         * on the server side. Messages sent without this parameter are standalone (no threading
         * headers injected).
         *
         * Cannot be combined with `forward_of_message_id` (422).
         */
        fun inReplyToMessageId(inReplyToMessageId: String?) = apply {
            body.inReplyToMessageId(inReplyToMessageId)
        }

        /**
         * Alias for calling [Builder.inReplyToMessageId] with `inReplyToMessageId.orElse(null)`.
         */
        fun inReplyToMessageId(inReplyToMessageId: Optional<String>) =
            inReplyToMessageId(inReplyToMessageId.getOrNull())

        /**
         * Sets [Builder.inReplyToMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inReplyToMessageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inReplyToMessageId(inReplyToMessageId: JsonField<String>) = apply {
            body.inReplyToMessageId(inReplyToMessageId)
        }

        fun inlineCss(inlineCss: Boolean) = apply { body.inlineCss(inlineCss) }

        /**
         * Sets [Builder.inlineCss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inlineCss] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inlineCss(inlineCss: JsonField<Boolean>) = apply { body.inlineCss(inlineCss) }

        /** Custom metadata. Write-only; not returned in responses. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * Reply-to address. If provided as an object with a name, only the email is stored; the
         * name is ignored.
         */
        fun replyTo(replyTo: EmailAddressInput) = apply { body.replyTo(replyTo) }

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed [EmailAddressInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replyTo(replyTo: JsonField<EmailAddressInput>) = apply { body.replyTo(replyTo) }

        /** Alias for calling [replyTo] with `EmailAddressInput.ofString(string)`. */
        fun replyTo(string: String) = apply { body.replyTo(string) }

        /** Alias for calling [replyTo] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
        fun replyTo(emailAddress: EmailAddress) = apply { body.replyTo(emailAddress) }

        /**
         * Indicates a reply-all intent. In Phase 1 (wire-only) this does not change the threading
         * headers — recipient selection is customer- controlled (`to`/`cc`), and a thread is not
         * defined by its audience. When the referenced message has no thread context, reply-all
         * degrades to a plain reply (parent ID only in `References`). The resolution engine
         * (separate work) will expand the ancestor chain at a later phase with no API change.
         *
         * Only meaningful alongside `in_reply_to_message_id`.
         */
        fun replyToAll(replyToAll: Boolean?) = apply { body.replyToAll(replyToAll) }

        /**
         * Alias for [Builder.replyToAll].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun replyToAll(replyToAll: Boolean) = replyToAll(replyToAll as Boolean?)

        /** Alias for calling [Builder.replyToAll] with `replyToAll.orElse(null)`. */
        fun replyToAll(replyToAll: Optional<Boolean>) = replyToAll(replyToAll.getOrNull())

        /**
         * Sets [Builder.replyToAll] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyToAll] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun replyToAll(replyToAll: JsonField<Boolean>) = apply { body.replyToAll(replyToAll) }

        fun sandboxMode(sandboxMode: Boolean) = apply { body.sandboxMode(sandboxMode) }

        /**
         * Sets [Builder.sandboxMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandboxMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sandboxMode(sandboxMode: JsonField<Boolean>) = apply { body.sandboxMode(sandboxMode) }

        /**
         * Future ISO 8601 time to schedule sending. Invalid or past timestamps are silently ignored
         * and the email is sent immediately. The legacy alias `send_at` is still accepted for
         * backward compatibility; when both are provided, `scheduled_at` wins.
         */
        fun scheduledAt(scheduledAt: OffsetDateTime?) = apply { body.scheduledAt(scheduledAt) }

        /** Alias for calling [Builder.scheduledAt] with `scheduledAt.orElse(null)`. */
        fun scheduledAt(scheduledAt: Optional<OffsetDateTime>) =
            scheduledAt(scheduledAt.getOrNull())

        /**
         * Sets [Builder.scheduledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            body.scheduledAt(scheduledAt)
        }

        /** Deprecated alias for `scheduled_at`. */
        @Deprecated("Use scheduled_at instead.")
        fun sendAt(sendAt: OffsetDateTime) = apply { body.sendAt(sendAt) }

        /**
         * Sets [Builder.sendAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("Use scheduled_at instead.")
        fun sendAt(sendAt: JsonField<OffsetDateTime>) = apply { body.sendAt(sendAt) }

        /**
         * Required unless `template_id` is supplied. When using a template, the template's subject
         * is rendered; if the template has no subject or renders empty, the request returns 400.
         */
        fun subject(subject: String) = apply { body.subject(subject) }

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { body.subject(subject) }

        /**
         * Tags for categorization and reporting. Stored on the message and propagated to Email
         * Detail Records. Not returned in API responses.
         */
        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        fun templateId(templateId: String) = apply { body.templateId(templateId) }

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { body.templateId(templateId) }

        /**
         * Variables for Liquid template rendering. Non-object values may cause a 422 validation
         * error on message creation, but are silently treated as an empty object for template
         * rendering.
         */
        fun templateVariables(templateVariables: TemplateVariables) = apply {
            body.templateVariables(templateVariables)
        }

        /**
         * Sets [Builder.templateVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateVariables] with a well-typed [TemplateVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun templateVariables(templateVariables: JsonField<TemplateVariables>) = apply {
            body.templateVariables(templateVariables)
        }

        /**
         * Plain text email body. Returned only by `GET /email_messages/{id}`; omitted from create
         * and list responses.
         */
        fun textBody(textBody: String) = apply { body.textBody(textBody) }

        /**
         * Sets [Builder.textBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun textBody(textBody: JsonField<String>) = apply { body.textBody(textBody) }

        /**
         * Per-send open and click tracking overrides. Omitted properties inherit the sender
         * domain's tracking settings.
         */
        fun trackingSettings(trackingSettings: TrackingSettings) = apply {
            body.trackingSettings(trackingSettings)
        }

        /**
         * Sets [Builder.trackingSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackingSettings] with a well-typed [TrackingSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun trackingSettings(trackingSettings: JsonField<TrackingSettings>) = apply {
            body.trackingSettings(trackingSettings)
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
         * Returns an immutable instance of [EmailMessageCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailMessageCreateParams =
            EmailMessageCreateParams(
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

    /**
     * Recipient email addresses must be unique across `to`, `cc`, and `bcc` after case-insensitive
     * normalization. Duplicate recipients return `400 Bad Request`.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val from: JsonField<EmailAddressInput>,
        private val to: JsonField<List<EmailAddressInput>>,
        private val attachments: JsonField<List<AttachmentRequest>>,
        private val bcc: JsonField<List<EmailAddressInput>>,
        private val cc: JsonField<List<EmailAddressInput>>,
        private val forwardOfMessageId: JsonField<String>,
        private val fromName: JsonField<String>,
        private val groupId: JsonField<String>,
        private val headers: JsonField<Headers>,
        private val htmlBody: JsonField<String>,
        private val ignoreSuppression: JsonField<Boolean>,
        private val inReplyToMessageId: JsonField<String>,
        private val inlineCss: JsonField<Boolean>,
        private val metadata: JsonField<Metadata>,
        private val replyTo: JsonField<EmailAddressInput>,
        private val replyToAll: JsonField<Boolean>,
        private val sandboxMode: JsonField<Boolean>,
        private val scheduledAt: JsonField<OffsetDateTime>,
        private val sendAt: JsonField<OffsetDateTime>,
        private val subject: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val templateId: JsonField<String>,
        private val templateVariables: JsonField<TemplateVariables>,
        private val textBody: JsonField<String>,
        private val trackingSettings: JsonField<TrackingSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("from")
            @ExcludeMissing
            from: JsonField<EmailAddressInput> = JsonMissing.of(),
            @JsonProperty("to")
            @ExcludeMissing
            to: JsonField<List<EmailAddressInput>> = JsonMissing.of(),
            @JsonProperty("attachments")
            @ExcludeMissing
            attachments: JsonField<List<AttachmentRequest>> = JsonMissing.of(),
            @JsonProperty("bcc")
            @ExcludeMissing
            bcc: JsonField<List<EmailAddressInput>> = JsonMissing.of(),
            @JsonProperty("cc")
            @ExcludeMissing
            cc: JsonField<List<EmailAddressInput>> = JsonMissing.of(),
            @JsonProperty("forward_of_message_id")
            @ExcludeMissing
            forwardOfMessageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from_name")
            @ExcludeMissing
            fromName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
            @JsonProperty("html_body")
            @ExcludeMissing
            htmlBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ignore_suppression")
            @ExcludeMissing
            ignoreSuppression: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("in_reply_to_message_id")
            @ExcludeMissing
            inReplyToMessageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inline_css")
            @ExcludeMissing
            inlineCss: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("reply_to")
            @ExcludeMissing
            replyTo: JsonField<EmailAddressInput> = JsonMissing.of(),
            @JsonProperty("reply_to_all")
            @ExcludeMissing
            replyToAll: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sandbox_mode")
            @ExcludeMissing
            sandboxMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("scheduled_at")
            @ExcludeMissing
            scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("send_at")
            @ExcludeMissing
            sendAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("template_id")
            @ExcludeMissing
            templateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template_variables")
            @ExcludeMissing
            templateVariables: JsonField<TemplateVariables> = JsonMissing.of(),
            @JsonProperty("text_body")
            @ExcludeMissing
            textBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tracking_settings")
            @ExcludeMissing
            trackingSettings: JsonField<TrackingSettings> = JsonMissing.of(),
        ) : this(
            from,
            to,
            attachments,
            bcc,
            cc,
            forwardOfMessageId,
            fromName,
            groupId,
            headers,
            htmlBody,
            ignoreSuppression,
            inReplyToMessageId,
            inlineCss,
            metadata,
            replyTo,
            replyToAll,
            sandboxMode,
            scheduledAt,
            sendAt,
            subject,
            tags,
            templateId,
            templateVariables,
            textBody,
            trackingSettings,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): EmailAddressInput = from.getRequired("from")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): List<EmailAddressInput> = to.getRequired("to")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attachments(): Optional<List<AttachmentRequest>> =
            attachments.getOptional("attachments")

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
         * Telnyx message UUID of the message this send forwards. Forwarded messages start a NEW
         * thread per RFC 5322 — NO `In-Reply-To` or `References` headers are set on the outbound
         * MIME. The id is recorded in the message's metadata for EDR provenance only.
         *
         * The id is validated as a UUID but is NOT looked up against the message store — existence
         * is the caller's responsibility (the forward is pure metadata; it does not affect
         * delivery). Cannot be combined with `in_reply_to_message_id` (422).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forwardOfMessageId(): Optional<String> =
            forwardOfMessageId.getOptional("forward_of_message_id")

        /**
         * Optional display name for string `from`; overrides `from.name` when provided.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fromName(): Optional<String> = fromName.getOptional("from_name")

        /**
         * Optional unsubscribe-group UUID used for group-scoped suppression checks and unsubscribe
         * handling.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupId(): Optional<String> = groupId.getOptional("group_id")

        /**
         * Custom email headers. Write-only; not returned in responses.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * HTML email body. Returned only by `GET /email_messages/{id}`; omitted from create and
         * list responses.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun htmlBody(): Optional<String> = htmlBody.getOptional("html_body")

        /**
         * When true, allows delivery to recipients whose suppressions explicitly permit an
         * override. Hard bounces, spam complaints, and invalid-address suppressions cannot be
         * overridden. Requires the `email:override` API scope.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ignoreSuppression(): Optional<Boolean> =
            ignoreSuppression.getOptional("ignore_suppression")

        /**
         * Telnyx message UUID of the message this send replies to. When provided, the API sets RFC
         * 5322 `In-Reply-To` and `References` headers on the outbound MIME so the recipient's
         * mailbox (Gmail/Outlook) threads it correctly. The parent is looked up under the caller's
         * account scope; a UUID belonging to another account yields a non-enumerating 404.
         *
         * Wire-only (Phase 1): the API sets the headers and does NOT resolve or mutate `thread_id`
         * on the server side. Messages sent without this parameter are standalone (no threading
         * headers injected).
         *
         * Cannot be combined with `forward_of_message_id` (422).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inReplyToMessageId(): Optional<String> =
            inReplyToMessageId.getOptional("in_reply_to_message_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inlineCss(): Optional<Boolean> = inlineCss.getOptional("inline_css")

        /**
         * Custom metadata. Write-only; not returned in responses.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Reply-to address. If provided as an object with a name, only the email is stored; the
         * name is ignored.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replyTo(): Optional<EmailAddressInput> = replyTo.getOptional("reply_to")

        /**
         * Indicates a reply-all intent. In Phase 1 (wire-only) this does not change the threading
         * headers — recipient selection is customer- controlled (`to`/`cc`), and a thread is not
         * defined by its audience. When the referenced message has no thread context, reply-all
         * degrades to a plain reply (parent ID only in `References`). The resolution engine
         * (separate work) will expand the ancestor chain at a later phase with no API change.
         *
         * Only meaningful alongside `in_reply_to_message_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replyToAll(): Optional<Boolean> = replyToAll.getOptional("reply_to_all")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sandboxMode(): Optional<Boolean> = sandboxMode.getOptional("sandbox_mode")

        /**
         * Future ISO 8601 time to schedule sending. Invalid or past timestamps are silently ignored
         * and the email is sent immediately. The legacy alias `send_at` is still accepted for
         * backward compatibility; when both are provided, `scheduled_at` wins.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scheduledAt(): Optional<OffsetDateTime> = scheduledAt.getOptional("scheduled_at")

        /**
         * Deprecated alias for `scheduled_at`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("Use scheduled_at instead.")
        fun sendAt(): Optional<OffsetDateTime> = sendAt.getOptional("send_at")

        /**
         * Required unless `template_id` is supplied. When using a template, the template's subject
         * is rendered; if the template has no subject or renders empty, the request returns 400.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subject(): Optional<String> = subject.getOptional("subject")

        /**
         * Tags for categorization and reporting. Stored on the message and propagated to Email
         * Detail Records. Not returned in API responses.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateId(): Optional<String> = templateId.getOptional("template_id")

        /**
         * Variables for Liquid template rendering. Non-object values may cause a 422 validation
         * error on message creation, but are silently treated as an empty object for template
         * rendering.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateVariables(): Optional<TemplateVariables> =
            templateVariables.getOptional("template_variables")

        /**
         * Plain text email body. Returned only by `GET /email_messages/{id}`; omitted from create
         * and list responses.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun textBody(): Optional<String> = textBody.getOptional("text_body")

        /**
         * Per-send open and click tracking overrides. Omitted properties inherit the sender
         * domain's tracking settings.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trackingSettings(): Optional<TrackingSettings> =
            trackingSettings.getOptional("tracking_settings")

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<EmailAddressInput> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<List<EmailAddressInput>> = to

        /**
         * Returns the raw JSON value of [attachments].
         *
         * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attachments")
        @ExcludeMissing
        fun _attachments(): JsonField<List<AttachmentRequest>> = attachments

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
         * Returns the raw JSON value of [forwardOfMessageId].
         *
         * Unlike [forwardOfMessageId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("forward_of_message_id")
        @ExcludeMissing
        fun _forwardOfMessageId(): JsonField<String> = forwardOfMessageId

        /**
         * Returns the raw JSON value of [fromName].
         *
         * Unlike [fromName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from_name") @ExcludeMissing fun _fromName(): JsonField<String> = fromName

        /**
         * Returns the raw JSON value of [groupId].
         *
         * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

        /**
         * Returns the raw JSON value of [headers].
         *
         * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers_(): JsonField<Headers> = headers

        /**
         * Returns the raw JSON value of [htmlBody].
         *
         * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("html_body") @ExcludeMissing fun _htmlBody(): JsonField<String> = htmlBody

        /**
         * Returns the raw JSON value of [ignoreSuppression].
         *
         * Unlike [ignoreSuppression], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ignore_suppression")
        @ExcludeMissing
        fun _ignoreSuppression(): JsonField<Boolean> = ignoreSuppression

        /**
         * Returns the raw JSON value of [inReplyToMessageId].
         *
         * Unlike [inReplyToMessageId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("in_reply_to_message_id")
        @ExcludeMissing
        fun _inReplyToMessageId(): JsonField<String> = inReplyToMessageId

        /**
         * Returns the raw JSON value of [inlineCss].
         *
         * Unlike [inlineCss], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inline_css") @ExcludeMissing fun _inlineCss(): JsonField<Boolean> = inlineCss

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [replyTo].
         *
         * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reply_to")
        @ExcludeMissing
        fun _replyTo(): JsonField<EmailAddressInput> = replyTo

        /**
         * Returns the raw JSON value of [replyToAll].
         *
         * Unlike [replyToAll], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reply_to_all")
        @ExcludeMissing
        fun _replyToAll(): JsonField<Boolean> = replyToAll

        /**
         * Returns the raw JSON value of [sandboxMode].
         *
         * Unlike [sandboxMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sandbox_mode")
        @ExcludeMissing
        fun _sandboxMode(): JsonField<Boolean> = sandboxMode

        /**
         * Returns the raw JSON value of [scheduledAt].
         *
         * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

        /**
         * Returns the raw JSON value of [sendAt].
         *
         * Unlike [sendAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("Use scheduled_at instead.")
        @JsonProperty("send_at")
        @ExcludeMissing
        fun _sendAt(): JsonField<OffsetDateTime> = sendAt

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
         * Returns the raw JSON value of [templateId].
         *
         * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun _templateId(): JsonField<String> = templateId

        /**
         * Returns the raw JSON value of [templateVariables].
         *
         * Unlike [templateVariables], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("template_variables")
        @ExcludeMissing
        fun _templateVariables(): JsonField<TemplateVariables> = templateVariables

        /**
         * Returns the raw JSON value of [textBody].
         *
         * Unlike [textBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text_body") @ExcludeMissing fun _textBody(): JsonField<String> = textBody

        /**
         * Returns the raw JSON value of [trackingSettings].
         *
         * Unlike [trackingSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tracking_settings")
        @ExcludeMissing
        fun _trackingSettings(): JsonField<TrackingSettings> = trackingSettings

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var from: JsonField<EmailAddressInput>? = null
            private var to: JsonField<MutableList<EmailAddressInput>>? = null
            private var attachments: JsonField<MutableList<AttachmentRequest>>? = null
            private var bcc: JsonField<MutableList<EmailAddressInput>>? = null
            private var cc: JsonField<MutableList<EmailAddressInput>>? = null
            private var forwardOfMessageId: JsonField<String> = JsonMissing.of()
            private var fromName: JsonField<String> = JsonMissing.of()
            private var groupId: JsonField<String> = JsonMissing.of()
            private var headers: JsonField<Headers> = JsonMissing.of()
            private var htmlBody: JsonField<String> = JsonMissing.of()
            private var ignoreSuppression: JsonField<Boolean> = JsonMissing.of()
            private var inReplyToMessageId: JsonField<String> = JsonMissing.of()
            private var inlineCss: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var replyTo: JsonField<EmailAddressInput> = JsonMissing.of()
            private var replyToAll: JsonField<Boolean> = JsonMissing.of()
            private var sandboxMode: JsonField<Boolean> = JsonMissing.of()
            private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var sendAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var subject: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var templateId: JsonField<String> = JsonMissing.of()
            private var templateVariables: JsonField<TemplateVariables> = JsonMissing.of()
            private var textBody: JsonField<String> = JsonMissing.of()
            private var trackingSettings: JsonField<TrackingSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                from = body.from
                to = body.to.map { it.toMutableList() }
                attachments = body.attachments.map { it.toMutableList() }
                bcc = body.bcc.map { it.toMutableList() }
                cc = body.cc.map { it.toMutableList() }
                forwardOfMessageId = body.forwardOfMessageId
                fromName = body.fromName
                groupId = body.groupId
                headers = body.headers
                htmlBody = body.htmlBody
                ignoreSuppression = body.ignoreSuppression
                inReplyToMessageId = body.inReplyToMessageId
                inlineCss = body.inlineCss
                metadata = body.metadata
                replyTo = body.replyTo
                replyToAll = body.replyToAll
                sandboxMode = body.sandboxMode
                scheduledAt = body.scheduledAt
                sendAt = body.sendAt
                subject = body.subject
                tags = body.tags.map { it.toMutableList() }
                templateId = body.templateId
                templateVariables = body.templateVariables
                textBody = body.textBody
                trackingSettings = body.trackingSettings
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun from(from: EmailAddressInput) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [EmailAddressInput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun from(from: JsonField<EmailAddressInput>) = apply { this.from = from }

            /** Alias for calling [from] with `EmailAddressInput.ofString(string)`. */
            fun from(string: String) = from(EmailAddressInput.ofString(string))

            /** Alias for calling [from] with `EmailAddressInput.ofEmailAddress(emailAddress)`. */
            fun from(emailAddress: EmailAddress) =
                from(EmailAddressInput.ofEmailAddress(emailAddress))

            fun to(to: List<EmailAddressInput>) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed `List<EmailAddressInput>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun attachments(attachments: List<AttachmentRequest>) =
                attachments(JsonField.of(attachments))

            /**
             * Sets [Builder.attachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachments] with a well-typed
             * `List<AttachmentRequest>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun attachments(attachments: JsonField<List<AttachmentRequest>>) = apply {
                this.attachments = attachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [AttachmentRequest] to [attachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttachment(attachment: AttachmentRequest) = apply {
                attachments =
                    (attachments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attachments", it).add(attachment)
                    }
            }

            fun bcc(bcc: List<EmailAddressInput>) = bcc(JsonField.of(bcc))

            /**
             * Sets [Builder.bcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bcc] with a well-typed `List<EmailAddressInput>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
                    (this.bcc ?: JsonField.of(mutableListOf())).also {
                        checkKnown("bcc", it).add(bcc)
                    }
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
             * You should usually call [Builder.cc] with a well-typed `List<EmailAddressInput>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /**
             * Telnyx message UUID of the message this send forwards. Forwarded messages start a NEW
             * thread per RFC 5322 — NO `In-Reply-To` or `References` headers are set on the
             * outbound MIME. The id is recorded in the message's metadata for EDR provenance only.
             *
             * The id is validated as a UUID but is NOT looked up against the message store —
             * existence is the caller's responsibility (the forward is pure metadata; it does not
             * affect delivery). Cannot be combined with `in_reply_to_message_id` (422).
             */
            fun forwardOfMessageId(forwardOfMessageId: String?) =
                forwardOfMessageId(JsonField.ofNullable(forwardOfMessageId))

            /**
             * Alias for calling [Builder.forwardOfMessageId] with
             * `forwardOfMessageId.orElse(null)`.
             */
            fun forwardOfMessageId(forwardOfMessageId: Optional<String>) =
                forwardOfMessageId(forwardOfMessageId.getOrNull())

            /**
             * Sets [Builder.forwardOfMessageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forwardOfMessageId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun forwardOfMessageId(forwardOfMessageId: JsonField<String>) = apply {
                this.forwardOfMessageId = forwardOfMessageId
            }

            /** Optional display name for string `from`; overrides `from.name` when provided. */
            fun fromName(fromName: String) = fromName(JsonField.of(fromName))

            /**
             * Sets [Builder.fromName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromName(fromName: JsonField<String>) = apply { this.fromName = fromName }

            /**
             * Optional unsubscribe-group UUID used for group-scoped suppression checks and
             * unsubscribe handling.
             */
            fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

            /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
            fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

            /**
             * Sets [Builder.groupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /** Custom email headers. Write-only; not returned in responses. */
            fun headers(headers: Headers) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

            /**
             * HTML email body. Returned only by `GET /email_messages/{id}`; omitted from create and
             * list responses.
             */
            fun htmlBody(htmlBody: String) = htmlBody(JsonField.of(htmlBody))

            /**
             * Sets [Builder.htmlBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.htmlBody] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun htmlBody(htmlBody: JsonField<String>) = apply { this.htmlBody = htmlBody }

            /**
             * When true, allows delivery to recipients whose suppressions explicitly permit an
             * override. Hard bounces, spam complaints, and invalid-address suppressions cannot be
             * overridden. Requires the `email:override` API scope.
             */
            fun ignoreSuppression(ignoreSuppression: Boolean) =
                ignoreSuppression(JsonField.of(ignoreSuppression))

            /**
             * Sets [Builder.ignoreSuppression] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ignoreSuppression] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ignoreSuppression(ignoreSuppression: JsonField<Boolean>) = apply {
                this.ignoreSuppression = ignoreSuppression
            }

            /**
             * Telnyx message UUID of the message this send replies to. When provided, the API sets
             * RFC 5322 `In-Reply-To` and `References` headers on the outbound MIME so the
             * recipient's mailbox (Gmail/Outlook) threads it correctly. The parent is looked up
             * under the caller's account scope; a UUID belonging to another account yields a
             * non-enumerating 404.
             *
             * Wire-only (Phase 1): the API sets the headers and does NOT resolve or mutate
             * `thread_id` on the server side. Messages sent without this parameter are standalone
             * (no threading headers injected).
             *
             * Cannot be combined with `forward_of_message_id` (422).
             */
            fun inReplyToMessageId(inReplyToMessageId: String?) =
                inReplyToMessageId(JsonField.ofNullable(inReplyToMessageId))

            /**
             * Alias for calling [Builder.inReplyToMessageId] with
             * `inReplyToMessageId.orElse(null)`.
             */
            fun inReplyToMessageId(inReplyToMessageId: Optional<String>) =
                inReplyToMessageId(inReplyToMessageId.getOrNull())

            /**
             * Sets [Builder.inReplyToMessageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inReplyToMessageId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inReplyToMessageId(inReplyToMessageId: JsonField<String>) = apply {
                this.inReplyToMessageId = inReplyToMessageId
            }

            fun inlineCss(inlineCss: Boolean) = inlineCss(JsonField.of(inlineCss))

            /**
             * Sets [Builder.inlineCss] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inlineCss] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inlineCss(inlineCss: JsonField<Boolean>) = apply { this.inlineCss = inlineCss }

            /** Custom metadata. Write-only; not returned in responses. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Reply-to address. If provided as an object with a name, only the email is stored; the
             * name is ignored.
             */
            fun replyTo(replyTo: EmailAddressInput) = replyTo(JsonField.of(replyTo))

            /**
             * Sets [Builder.replyTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replyTo] with a well-typed [EmailAddressInput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replyTo(replyTo: JsonField<EmailAddressInput>) = apply { this.replyTo = replyTo }

            /** Alias for calling [replyTo] with `EmailAddressInput.ofString(string)`. */
            fun replyTo(string: String) = replyTo(EmailAddressInput.ofString(string))

            /**
             * Alias for calling [replyTo] with `EmailAddressInput.ofEmailAddress(emailAddress)`.
             */
            fun replyTo(emailAddress: EmailAddress) =
                replyTo(EmailAddressInput.ofEmailAddress(emailAddress))

            /**
             * Indicates a reply-all intent. In Phase 1 (wire-only) this does not change the
             * threading headers — recipient selection is customer- controlled (`to`/`cc`), and a
             * thread is not defined by its audience. When the referenced message has no thread
             * context, reply-all degrades to a plain reply (parent ID only in `References`). The
             * resolution engine (separate work) will expand the ancestor chain at a later phase
             * with no API change.
             *
             * Only meaningful alongside `in_reply_to_message_id`.
             */
            fun replyToAll(replyToAll: Boolean?) = replyToAll(JsonField.ofNullable(replyToAll))

            /**
             * Alias for [Builder.replyToAll].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun replyToAll(replyToAll: Boolean) = replyToAll(replyToAll as Boolean?)

            /** Alias for calling [Builder.replyToAll] with `replyToAll.orElse(null)`. */
            fun replyToAll(replyToAll: Optional<Boolean>) = replyToAll(replyToAll.getOrNull())

            /**
             * Sets [Builder.replyToAll] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replyToAll] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replyToAll(replyToAll: JsonField<Boolean>) = apply { this.replyToAll = replyToAll }

            fun sandboxMode(sandboxMode: Boolean) = sandboxMode(JsonField.of(sandboxMode))

            /**
             * Sets [Builder.sandboxMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sandboxMode] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sandboxMode(sandboxMode: JsonField<Boolean>) = apply {
                this.sandboxMode = sandboxMode
            }

            /**
             * Future ISO 8601 time to schedule sending. Invalid or past timestamps are silently
             * ignored and the email is sent immediately. The legacy alias `send_at` is still
             * accepted for backward compatibility; when both are provided, `scheduled_at` wins.
             */
            fun scheduledAt(scheduledAt: OffsetDateTime?) =
                scheduledAt(JsonField.ofNullable(scheduledAt))

            /** Alias for calling [Builder.scheduledAt] with `scheduledAt.orElse(null)`. */
            fun scheduledAt(scheduledAt: Optional<OffsetDateTime>) =
                scheduledAt(scheduledAt.getOrNull())

            /**
             * Sets [Builder.scheduledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
                this.scheduledAt = scheduledAt
            }

            /** Deprecated alias for `scheduled_at`. */
            @Deprecated("Use scheduled_at instead.")
            fun sendAt(sendAt: OffsetDateTime) = sendAt(JsonField.of(sendAt))

            /**
             * Sets [Builder.sendAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("Use scheduled_at instead.")
            fun sendAt(sendAt: JsonField<OffsetDateTime>) = apply { this.sendAt = sendAt }

            /**
             * Required unless `template_id` is supplied. When using a template, the template's
             * subject is rendered; if the template has no subject or renders empty, the request
             * returns 400.
             */
            fun subject(subject: String) = subject(JsonField.of(subject))

            /**
             * Sets [Builder.subject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subject] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subject(subject: JsonField<String>) = apply { this.subject = subject }

            /**
             * Tags for categorization and reporting. Stored on the message and propagated to Email
             * Detail Records. Not returned in API responses.
             */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun templateId(templateId: String) = templateId(JsonField.of(templateId))

            /**
             * Sets [Builder.templateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

            /**
             * Variables for Liquid template rendering. Non-object values may cause a 422 validation
             * error on message creation, but are silently treated as an empty object for template
             * rendering.
             */
            fun templateVariables(templateVariables: TemplateVariables) =
                templateVariables(JsonField.of(templateVariables))

            /**
             * Sets [Builder.templateVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateVariables] with a well-typed
             * [TemplateVariables] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun templateVariables(templateVariables: JsonField<TemplateVariables>) = apply {
                this.templateVariables = templateVariables
            }

            /**
             * Plain text email body. Returned only by `GET /email_messages/{id}`; omitted from
             * create and list responses.
             */
            fun textBody(textBody: String) = textBody(JsonField.of(textBody))

            /**
             * Sets [Builder.textBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textBody] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textBody(textBody: JsonField<String>) = apply { this.textBody = textBody }

            /**
             * Per-send open and click tracking overrides. Omitted properties inherit the sender
             * domain's tracking settings.
             */
            fun trackingSettings(trackingSettings: TrackingSettings) =
                trackingSettings(JsonField.of(trackingSettings))

            /**
             * Sets [Builder.trackingSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trackingSettings] with a well-typed
             * [TrackingSettings] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun trackingSettings(trackingSettings: JsonField<TrackingSettings>) = apply {
                this.trackingSettings = trackingSettings
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
             *
             * The following fields are required:
             * ```java
             * .from()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("from", from),
                    checkRequired("to", to).map { it.toImmutable() },
                    (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                    (bcc ?: JsonMissing.of()).map { it.toImmutable() },
                    (cc ?: JsonMissing.of()).map { it.toImmutable() },
                    forwardOfMessageId,
                    fromName,
                    groupId,
                    headers,
                    htmlBody,
                    ignoreSuppression,
                    inReplyToMessageId,
                    inlineCss,
                    metadata,
                    replyTo,
                    replyToAll,
                    sandboxMode,
                    scheduledAt,
                    sendAt,
                    subject,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    templateId,
                    templateVariables,
                    textBody,
                    trackingSettings,
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

            from().validate()
            to().forEach { it.validate() }
            attachments().ifPresent { it.forEach { it.validate() } }
            bcc().ifPresent { it.forEach { it.validate() } }
            cc().ifPresent { it.forEach { it.validate() } }
            forwardOfMessageId()
            fromName()
            groupId()
            headers().ifPresent { it.validate() }
            htmlBody()
            ignoreSuppression()
            inReplyToMessageId()
            inlineCss()
            metadata().ifPresent { it.validate() }
            replyTo().ifPresent { it.validate() }
            replyToAll()
            sandboxMode()
            scheduledAt()
            sendAt()
            subject()
            tags()
            templateId()
            templateVariables().ifPresent { it.validate() }
            textBody()
            trackingSettings().ifPresent { it.validate() }
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
            (from.asKnown().getOrNull()?.validity() ?: 0) +
                (to.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (bcc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (cc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (forwardOfMessageId.asKnown().isPresent) 1 else 0) +
                (if (fromName.asKnown().isPresent) 1 else 0) +
                (if (groupId.asKnown().isPresent) 1 else 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0) +
                (if (htmlBody.asKnown().isPresent) 1 else 0) +
                (if (ignoreSuppression.asKnown().isPresent) 1 else 0) +
                (if (inReplyToMessageId.asKnown().isPresent) 1 else 0) +
                (if (inlineCss.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (replyTo.asKnown().getOrNull()?.validity() ?: 0) +
                (if (replyToAll.asKnown().isPresent) 1 else 0) +
                (if (sandboxMode.asKnown().isPresent) 1 else 0) +
                (if (scheduledAt.asKnown().isPresent) 1 else 0) +
                (if (sendAt.asKnown().isPresent) 1 else 0) +
                (if (subject.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (templateId.asKnown().isPresent) 1 else 0) +
                (templateVariables.asKnown().getOrNull()?.validity() ?: 0) +
                (if (textBody.asKnown().isPresent) 1 else 0) +
                (trackingSettings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                from == other.from &&
                to == other.to &&
                attachments == other.attachments &&
                bcc == other.bcc &&
                cc == other.cc &&
                forwardOfMessageId == other.forwardOfMessageId &&
                fromName == other.fromName &&
                groupId == other.groupId &&
                headers == other.headers &&
                htmlBody == other.htmlBody &&
                ignoreSuppression == other.ignoreSuppression &&
                inReplyToMessageId == other.inReplyToMessageId &&
                inlineCss == other.inlineCss &&
                metadata == other.metadata &&
                replyTo == other.replyTo &&
                replyToAll == other.replyToAll &&
                sandboxMode == other.sandboxMode &&
                scheduledAt == other.scheduledAt &&
                sendAt == other.sendAt &&
                subject == other.subject &&
                tags == other.tags &&
                templateId == other.templateId &&
                templateVariables == other.templateVariables &&
                textBody == other.textBody &&
                trackingSettings == other.trackingSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                from,
                to,
                attachments,
                bcc,
                cc,
                forwardOfMessageId,
                fromName,
                groupId,
                headers,
                htmlBody,
                ignoreSuppression,
                inReplyToMessageId,
                inlineCss,
                metadata,
                replyTo,
                replyToAll,
                sandboxMode,
                scheduledAt,
                sendAt,
                subject,
                tags,
                templateId,
                templateVariables,
                textBody,
                trackingSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{from=$from, to=$to, attachments=$attachments, bcc=$bcc, cc=$cc, forwardOfMessageId=$forwardOfMessageId, fromName=$fromName, groupId=$groupId, headers=$headers, htmlBody=$htmlBody, ignoreSuppression=$ignoreSuppression, inReplyToMessageId=$inReplyToMessageId, inlineCss=$inlineCss, metadata=$metadata, replyTo=$replyTo, replyToAll=$replyToAll, sandboxMode=$sandboxMode, scheduledAt=$scheduledAt, sendAt=$sendAt, subject=$subject, tags=$tags, templateId=$templateId, templateVariables=$templateVariables, textBody=$textBody, trackingSettings=$trackingSettings, additionalProperties=$additionalProperties}"
    }

    /** Custom email headers. Write-only; not returned in responses. */
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

    /** Custom metadata. Write-only; not returned in responses. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * Variables for Liquid template rendering. Non-object values may cause a 422 validation error
     * on message creation, but are silently treated as an empty object for template rendering.
     */
    class TemplateVariables
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

            /** Returns a mutable builder for constructing an instance of [TemplateVariables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateVariables: TemplateVariables) = apply {
                additionalProperties = templateVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateVariables = TemplateVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateVariables = apply {
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

            return other is TemplateVariables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TemplateVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailMessageCreateParams &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(idempotencyKey, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmailMessageCreateParams{idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
