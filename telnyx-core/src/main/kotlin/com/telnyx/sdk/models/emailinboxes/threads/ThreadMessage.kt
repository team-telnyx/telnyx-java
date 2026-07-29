// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads

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

class ThreadMessage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attachments: JsonField<List<Attachment>>,
    private val bcc: JsonField<List<InboundEmailAddress>>,
    private val cc: JsonField<List<InboundEmailAddress>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val direction: JsonField<Direction>,
    private val from: JsonField<InboundEmailAddress>,
    private val hasQuotedText: JsonField<Boolean>,
    private val headers: JsonField<Headers>,
    private val htmlBodyUrl: JsonField<String>,
    private val inReplyTo: JsonField<String>,
    private val inboxId: JsonField<String>,
    private val inlineFiles: JsonField<List<InlineFile>>,
    private val labels: JsonField<List<String>>,
    private val messageId: JsonField<String>,
    private val readAt: JsonField<OffsetDateTime>,
    private val receivedAt: JsonField<OffsetDateTime>,
    private val recordType: JsonField<RecordType>,
    private val references: JsonField<List<String>>,
    private val replyText: JsonField<String>,
    private val replyTo: JsonField<List<InboundEmailAddress>>,
    private val sentAt: JsonField<OffsetDateTime>,
    private val status: JsonField<String>,
    private val subject: JsonField<String>,
    private val textBodyUrl: JsonField<String>,
    private val threadId: JsonField<String>,
    private val to: JsonField<List<InboundEmailAddress>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<List<Attachment>> = JsonMissing.of(),
        @JsonProperty("bcc")
        @ExcludeMissing
        bcc: JsonField<List<InboundEmailAddress>> = JsonMissing.of(),
        @JsonProperty("cc")
        @ExcludeMissing
        cc: JsonField<List<InboundEmailAddress>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("from")
        @ExcludeMissing
        from: JsonField<InboundEmailAddress> = JsonMissing.of(),
        @JsonProperty("has_quoted_text")
        @ExcludeMissing
        hasQuotedText: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("html_body_url")
        @ExcludeMissing
        htmlBodyUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("in_reply_to")
        @ExcludeMissing
        inReplyTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inbox_id") @ExcludeMissing inboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inline_files")
        @ExcludeMissing
        inlineFiles: JsonField<List<InlineFile>> = JsonMissing.of(),
        @JsonProperty("labels") @ExcludeMissing labels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("read_at")
        @ExcludeMissing
        readAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("received_at")
        @ExcludeMissing
        receivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("references")
        @ExcludeMissing
        references: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("reply_text") @ExcludeMissing replyText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reply_to")
        @ExcludeMissing
        replyTo: JsonField<List<InboundEmailAddress>> = JsonMissing.of(),
        @JsonProperty("sent_at")
        @ExcludeMissing
        sentAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_body_url")
        @ExcludeMissing
        textBodyUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to")
        @ExcludeMissing
        to: JsonField<List<InboundEmailAddress>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        attachments,
        bcc,
        cc,
        createdAt,
        direction,
        from,
        hasQuotedText,
        headers,
        htmlBodyUrl,
        inReplyTo,
        inboxId,
        inlineFiles,
        labels,
        messageId,
        readAt,
        receivedAt,
        recordType,
        references,
        replyText,
        replyTo,
        sentAt,
        status,
        subject,
        textBodyUrl,
        threadId,
        to,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attachments(): List<Attachment> = attachments.getRequired("attachments")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bcc(): List<InboundEmailAddress> = bcc.getRequired("bcc")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cc(): List<InboundEmailAddress> = cc.getRequired("cc")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): InboundEmailAddress = from.getRequired("from")

    /**
     * Whether conservative plain-text extraction detected a quoted tail. False does not prove that
     * the source contains no quoted content.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasQuotedText(): Boolean = hasQuotedText.getRequired("has_quoted_text")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun headers(): Headers = headers.getRequired("headers")

    /**
     * URL for an offloaded HTML body. Null means the body is not offloaded to a URL; an inline HTML
     * body may still exist but is not returned on list reads. Reply extraction uses only the
     * plain-text body during ingest.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun htmlBodyUrl(): Optional<String> = htmlBodyUrl.getOptional("html_body_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inReplyTo(): Optional<String> = inReplyTo.getOptional("in_reply_to")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inboxId(): String = inboxId.getRequired("inbox_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inlineFiles(): List<InlineFile> = inlineFiles.getRequired("inline_files")

    /**
     * Mutable message labels used for agent workflow state (for example `spam`, `needs_review`,
     * `processed`). Distinct from the immutable send-time `tags` on outbound messages: labels are
     * never propagated to Email Detail Records or Mission Control reporting. Always empty for
     * outbound messages. Labels on a message are independent of the labels on its thread.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labels(): List<String> = labels.getRequired("labels")

    /**
     * RFC Message-ID header. Null is possible for legacy outbound messages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageId(): Optional<String> = messageId.getOptional("message_id")

    /**
     * Time the inbound message was marked read. Null means unread.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readAt(): Optional<OffsetDateTime> = readAt.getOptional("read_at")

    /**
     * Receipt time for inbound messages; null for outbound messages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receivedAt(): Optional<OffsetDateTime> = receivedAt.getOptional("received_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): RecordType = recordType.getRequired("record_type")

    /**
     * Ordered RFC Message-ID values from the References header.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun references(): List<String> = references.getRequired("references")

    /**
     * Conservatively extracted new-reply content persisted from the plain-text body during ingest.
     * Null means no plain-text extraction input was available or extraction was skipped or failed;
     * HTML bodies are not parsed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyText(): Optional<String> = replyText.getOptional("reply_text")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun replyTo(): List<InboundEmailAddress> = replyTo.getRequired("reply_to")

    /**
     * Creation/send-acceptance time for outbound messages; null for inbound messages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sentAt(): Optional<OffsetDateTime> = sentAt.getOptional("sent_at")

    /**
     * Received for inbound messages; the current send status for outbound messages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * URL for an offloaded plain-text body. Null means the body is not offloaded to a URL; an
     * inline plain-text body may still exist but is not returned on list reads. `reply_text` and
     * `has_quoted_text` are persisted during ingest before any body offload.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textBodyUrl(): Optional<String> = textBodyUrl.getOptional("text_body_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun threadId(): String = threadId.getRequired("thread_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): List<InboundEmailAddress> = to.getRequired("to")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attachments")
    @ExcludeMissing
    fun _attachments(): JsonField<List<Attachment>> = attachments

    /**
     * Returns the raw JSON value of [bcc].
     *
     * Unlike [bcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bcc") @ExcludeMissing fun _bcc(): JsonField<List<InboundEmailAddress>> = bcc

    /**
     * Returns the raw JSON value of [cc].
     *
     * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<List<InboundEmailAddress>> = cc

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<InboundEmailAddress> = from

    /**
     * Returns the raw JSON value of [hasQuotedText].
     *
     * Unlike [hasQuotedText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_quoted_text")
    @ExcludeMissing
    fun _hasQuotedText(): JsonField<Boolean> = hasQuotedText

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /**
     * Returns the raw JSON value of [htmlBodyUrl].
     *
     * Unlike [htmlBodyUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html_body_url")
    @ExcludeMissing
    fun _htmlBodyUrl(): JsonField<String> = htmlBodyUrl

    /**
     * Returns the raw JSON value of [inReplyTo].
     *
     * Unlike [inReplyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("in_reply_to") @ExcludeMissing fun _inReplyTo(): JsonField<String> = inReplyTo

    /**
     * Returns the raw JSON value of [inboxId].
     *
     * Unlike [inboxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbox_id") @ExcludeMissing fun _inboxId(): JsonField<String> = inboxId

    /**
     * Returns the raw JSON value of [inlineFiles].
     *
     * Unlike [inlineFiles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inline_files")
    @ExcludeMissing
    fun _inlineFiles(): JsonField<List<InlineFile>> = inlineFiles

    /**
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<List<String>> = labels

    /**
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_id") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

    /**
     * Returns the raw JSON value of [readAt].
     *
     * Unlike [readAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("read_at") @ExcludeMissing fun _readAt(): JsonField<OffsetDateTime> = readAt

    /**
     * Returns the raw JSON value of [receivedAt].
     *
     * Unlike [receivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("received_at")
    @ExcludeMissing
    fun _receivedAt(): JsonField<OffsetDateTime> = receivedAt

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [references].
     *
     * Unlike [references], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("references")
    @ExcludeMissing
    fun _references(): JsonField<List<String>> = references

    /**
     * Returns the raw JSON value of [replyText].
     *
     * Unlike [replyText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reply_text") @ExcludeMissing fun _replyText(): JsonField<String> = replyText

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reply_to")
    @ExcludeMissing
    fun _replyTo(): JsonField<List<InboundEmailAddress>> = replyTo

    /**
     * Returns the raw JSON value of [sentAt].
     *
     * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sent_at") @ExcludeMissing fun _sentAt(): JsonField<OffsetDateTime> = sentAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [textBodyUrl].
     *
     * Unlike [textBodyUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_body_url")
    @ExcludeMissing
    fun _textBodyUrl(): JsonField<String> = textBodyUrl

    /**
     * Returns the raw JSON value of [threadId].
     *
     * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<List<InboundEmailAddress>> = to

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
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

        /**
         * Returns a mutable builder for constructing an instance of [ThreadMessage].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .attachments()
         * .bcc()
         * .cc()
         * .createdAt()
         * .direction()
         * .from()
         * .hasQuotedText()
         * .headers()
         * .htmlBodyUrl()
         * .inReplyTo()
         * .inboxId()
         * .inlineFiles()
         * .labels()
         * .messageId()
         * .readAt()
         * .receivedAt()
         * .recordType()
         * .references()
         * .replyText()
         * .replyTo()
         * .sentAt()
         * .status()
         * .subject()
         * .textBodyUrl()
         * .threadId()
         * .to()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadMessage]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attachments: JsonField<MutableList<Attachment>>? = null
        private var bcc: JsonField<MutableList<InboundEmailAddress>>? = null
        private var cc: JsonField<MutableList<InboundEmailAddress>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var direction: JsonField<Direction>? = null
        private var from: JsonField<InboundEmailAddress>? = null
        private var hasQuotedText: JsonField<Boolean>? = null
        private var headers: JsonField<Headers>? = null
        private var htmlBodyUrl: JsonField<String>? = null
        private var inReplyTo: JsonField<String>? = null
        private var inboxId: JsonField<String>? = null
        private var inlineFiles: JsonField<MutableList<InlineFile>>? = null
        private var labels: JsonField<MutableList<String>>? = null
        private var messageId: JsonField<String>? = null
        private var readAt: JsonField<OffsetDateTime>? = null
        private var receivedAt: JsonField<OffsetDateTime>? = null
        private var recordType: JsonField<RecordType>? = null
        private var references: JsonField<MutableList<String>>? = null
        private var replyText: JsonField<String>? = null
        private var replyTo: JsonField<MutableList<InboundEmailAddress>>? = null
        private var sentAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<String>? = null
        private var subject: JsonField<String>? = null
        private var textBodyUrl: JsonField<String>? = null
        private var threadId: JsonField<String>? = null
        private var to: JsonField<MutableList<InboundEmailAddress>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(threadMessage: ThreadMessage) = apply {
            id = threadMessage.id
            attachments = threadMessage.attachments.map { it.toMutableList() }
            bcc = threadMessage.bcc.map { it.toMutableList() }
            cc = threadMessage.cc.map { it.toMutableList() }
            createdAt = threadMessage.createdAt
            direction = threadMessage.direction
            from = threadMessage.from
            hasQuotedText = threadMessage.hasQuotedText
            headers = threadMessage.headers
            htmlBodyUrl = threadMessage.htmlBodyUrl
            inReplyTo = threadMessage.inReplyTo
            inboxId = threadMessage.inboxId
            inlineFiles = threadMessage.inlineFiles.map { it.toMutableList() }
            labels = threadMessage.labels.map { it.toMutableList() }
            messageId = threadMessage.messageId
            readAt = threadMessage.readAt
            receivedAt = threadMessage.receivedAt
            recordType = threadMessage.recordType
            references = threadMessage.references.map { it.toMutableList() }
            replyText = threadMessage.replyText
            replyTo = threadMessage.replyTo.map { it.toMutableList() }
            sentAt = threadMessage.sentAt
            status = threadMessage.status
            subject = threadMessage.subject
            textBodyUrl = threadMessage.textBodyUrl
            threadId = threadMessage.threadId
            to = threadMessage.to.map { it.toMutableList() }
            updatedAt = threadMessage.updatedAt
            additionalProperties = threadMessage.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun attachments(attachments: List<Attachment>) = attachments(JsonField.of(attachments))

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<Attachment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<List<Attachment>>) = apply {
            this.attachments = attachments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Attachment] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: Attachment) = apply {
            attachments =
                (attachments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("attachments", it).add(attachment)
                }
        }

        fun bcc(bcc: List<InboundEmailAddress>) = bcc(JsonField.of(bcc))

        /**
         * Sets [Builder.bcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bcc] with a well-typed `List<InboundEmailAddress>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bcc(bcc: JsonField<List<InboundEmailAddress>>) = apply {
            this.bcc = bcc.map { it.toMutableList() }
        }

        /**
         * Adds a single [InboundEmailAddress] to [Builder.bcc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBcc(bcc: InboundEmailAddress) = apply {
            this.bcc =
                (this.bcc ?: JsonField.of(mutableListOf())).also { checkKnown("bcc", it).add(bcc) }
        }

        fun cc(cc: List<InboundEmailAddress>) = cc(JsonField.of(cc))

        /**
         * Sets [Builder.cc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cc] with a well-typed `List<InboundEmailAddress>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cc(cc: JsonField<List<InboundEmailAddress>>) = apply {
            this.cc = cc.map { it.toMutableList() }
        }

        /**
         * Adds a single [InboundEmailAddress] to [Builder.cc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCc(cc: InboundEmailAddress) = apply {
            this.cc =
                (this.cc ?: JsonField.of(mutableListOf())).also { checkKnown("cc", it).add(cc) }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        fun from(from: InboundEmailAddress) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [InboundEmailAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun from(from: JsonField<InboundEmailAddress>) = apply { this.from = from }

        /**
         * Whether conservative plain-text extraction detected a quoted tail. False does not prove
         * that the source contains no quoted content.
         */
        fun hasQuotedText(hasQuotedText: Boolean) = hasQuotedText(JsonField.of(hasQuotedText))

        /**
         * Sets [Builder.hasQuotedText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasQuotedText] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasQuotedText(hasQuotedText: JsonField<Boolean>) = apply {
            this.hasQuotedText = hasQuotedText
        }

        fun headers(headers: Headers) = headers(JsonField.of(headers))

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /**
         * URL for an offloaded HTML body. Null means the body is not offloaded to a URL; an inline
         * HTML body may still exist but is not returned on list reads. Reply extraction uses only
         * the plain-text body during ingest.
         */
        fun htmlBodyUrl(htmlBodyUrl: String?) = htmlBodyUrl(JsonField.ofNullable(htmlBodyUrl))

        /** Alias for calling [Builder.htmlBodyUrl] with `htmlBodyUrl.orElse(null)`. */
        fun htmlBodyUrl(htmlBodyUrl: Optional<String>) = htmlBodyUrl(htmlBodyUrl.getOrNull())

        /**
         * Sets [Builder.htmlBodyUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlBodyUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun htmlBodyUrl(htmlBodyUrl: JsonField<String>) = apply { this.htmlBodyUrl = htmlBodyUrl }

        fun inReplyTo(inReplyTo: String?) = inReplyTo(JsonField.ofNullable(inReplyTo))

        /** Alias for calling [Builder.inReplyTo] with `inReplyTo.orElse(null)`. */
        fun inReplyTo(inReplyTo: Optional<String>) = inReplyTo(inReplyTo.getOrNull())

        /**
         * Sets [Builder.inReplyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inReplyTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inReplyTo(inReplyTo: JsonField<String>) = apply { this.inReplyTo = inReplyTo }

        fun inboxId(inboxId: String) = inboxId(JsonField.of(inboxId))

        /**
         * Sets [Builder.inboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inboxId(inboxId: JsonField<String>) = apply { this.inboxId = inboxId }

        fun inlineFiles(inlineFiles: List<InlineFile>) = inlineFiles(JsonField.of(inlineFiles))

        /**
         * Sets [Builder.inlineFiles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inlineFiles] with a well-typed `List<InlineFile>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inlineFiles(inlineFiles: JsonField<List<InlineFile>>) = apply {
            this.inlineFiles = inlineFiles.map { it.toMutableList() }
        }

        /**
         * Adds a single [InlineFile] to [inlineFiles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInlineFile(inlineFile: InlineFile) = apply {
            inlineFiles =
                (inlineFiles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inlineFiles", it).add(inlineFile)
                }
        }

        /**
         * Mutable message labels used for agent workflow state (for example `spam`, `needs_review`,
         * `processed`). Distinct from the immutable send-time `tags` on outbound messages: labels
         * are never propagated to Email Detail Records or Mission Control reporting. Always empty
         * for outbound messages. Labels on a message are independent of the labels on its thread.
         */
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

        /** RFC Message-ID header. Null is possible for legacy outbound messages. */
        fun messageId(messageId: String?) = messageId(JsonField.ofNullable(messageId))

        /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
        fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

        /** Time the inbound message was marked read. Null means unread. */
        fun readAt(readAt: OffsetDateTime?) = readAt(JsonField.ofNullable(readAt))

        /** Alias for calling [Builder.readAt] with `readAt.orElse(null)`. */
        fun readAt(readAt: Optional<OffsetDateTime>) = readAt(readAt.getOrNull())

        /**
         * Sets [Builder.readAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readAt(readAt: JsonField<OffsetDateTime>) = apply { this.readAt = readAt }

        /** Receipt time for inbound messages; null for outbound messages. */
        fun receivedAt(receivedAt: OffsetDateTime?) = receivedAt(JsonField.ofNullable(receivedAt))

        /** Alias for calling [Builder.receivedAt] with `receivedAt.orElse(null)`. */
        fun receivedAt(receivedAt: Optional<OffsetDateTime>) = receivedAt(receivedAt.getOrNull())

        /**
         * Sets [Builder.receivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivedAt(receivedAt: JsonField<OffsetDateTime>) = apply {
            this.receivedAt = receivedAt
        }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** Ordered RFC Message-ID values from the References header. */
        fun references(references: List<String>) = references(JsonField.of(references))

        /**
         * Sets [Builder.references] to an arbitrary JSON value.
         *
         * You should usually call [Builder.references] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun references(references: JsonField<List<String>>) = apply {
            this.references = references.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [references].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReference(reference: String) = apply {
            references =
                (references ?: JsonField.of(mutableListOf())).also {
                    checkKnown("references", it).add(reference)
                }
        }

        /**
         * Conservatively extracted new-reply content persisted from the plain-text body during
         * ingest. Null means no plain-text extraction input was available or extraction was skipped
         * or failed; HTML bodies are not parsed.
         */
        fun replyText(replyText: String?) = replyText(JsonField.ofNullable(replyText))

        /** Alias for calling [Builder.replyText] with `replyText.orElse(null)`. */
        fun replyText(replyText: Optional<String>) = replyText(replyText.getOrNull())

        /**
         * Sets [Builder.replyText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun replyText(replyText: JsonField<String>) = apply { this.replyText = replyText }

        fun replyTo(replyTo: List<InboundEmailAddress>) = replyTo(JsonField.of(replyTo))

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed `List<InboundEmailAddress>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun replyTo(replyTo: JsonField<List<InboundEmailAddress>>) = apply {
            this.replyTo = replyTo.map { it.toMutableList() }
        }

        /**
         * Adds a single [InboundEmailAddress] to [Builder.replyTo].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplyTo(replyTo: InboundEmailAddress) = apply {
            this.replyTo =
                (this.replyTo ?: JsonField.of(mutableListOf())).also {
                    checkKnown("replyTo", it).add(replyTo)
                }
        }

        /** Creation/send-acceptance time for outbound messages; null for inbound messages. */
        fun sentAt(sentAt: OffsetDateTime?) = sentAt(JsonField.ofNullable(sentAt))

        /** Alias for calling [Builder.sentAt] with `sentAt.orElse(null)`. */
        fun sentAt(sentAt: Optional<OffsetDateTime>) = sentAt(sentAt.getOrNull())

        /**
         * Sets [Builder.sentAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sentAt(sentAt: JsonField<OffsetDateTime>) = apply { this.sentAt = sentAt }

        /** Received for inbound messages; the current send status for outbound messages. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun subject(subject: String?) = subject(JsonField.ofNullable(subject))

        /** Alias for calling [Builder.subject] with `subject.orElse(null)`. */
        fun subject(subject: Optional<String>) = subject(subject.getOrNull())

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

        /**
         * URL for an offloaded plain-text body. Null means the body is not offloaded to a URL; an
         * inline plain-text body may still exist but is not returned on list reads. `reply_text`
         * and `has_quoted_text` are persisted during ingest before any body offload.
         */
        fun textBodyUrl(textBodyUrl: String?) = textBodyUrl(JsonField.ofNullable(textBodyUrl))

        /** Alias for calling [Builder.textBodyUrl] with `textBodyUrl.orElse(null)`. */
        fun textBodyUrl(textBodyUrl: Optional<String>) = textBodyUrl(textBodyUrl.getOrNull())

        /**
         * Sets [Builder.textBodyUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textBodyUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textBodyUrl(textBodyUrl: JsonField<String>) = apply { this.textBodyUrl = textBodyUrl }

        fun threadId(threadId: String) = threadId(JsonField.of(threadId))

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

        fun to(to: List<InboundEmailAddress>) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed `List<InboundEmailAddress>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun to(to: JsonField<List<InboundEmailAddress>>) = apply {
            this.to = to.map { it.toMutableList() }
        }

        /**
         * Adds a single [InboundEmailAddress] to [Builder.to].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTo(to: InboundEmailAddress) = apply {
            this.to =
                (this.to ?: JsonField.of(mutableListOf())).also { checkKnown("to", it).add(to) }
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ThreadMessage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .attachments()
         * .bcc()
         * .cc()
         * .createdAt()
         * .direction()
         * .from()
         * .hasQuotedText()
         * .headers()
         * .htmlBodyUrl()
         * .inReplyTo()
         * .inboxId()
         * .inlineFiles()
         * .labels()
         * .messageId()
         * .readAt()
         * .receivedAt()
         * .recordType()
         * .references()
         * .replyText()
         * .replyTo()
         * .sentAt()
         * .status()
         * .subject()
         * .textBodyUrl()
         * .threadId()
         * .to()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreadMessage =
            ThreadMessage(
                checkRequired("id", id),
                checkRequired("attachments", attachments).map { it.toImmutable() },
                checkRequired("bcc", bcc).map { it.toImmutable() },
                checkRequired("cc", cc).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("direction", direction),
                checkRequired("from", from),
                checkRequired("hasQuotedText", hasQuotedText),
                checkRequired("headers", headers),
                checkRequired("htmlBodyUrl", htmlBodyUrl),
                checkRequired("inReplyTo", inReplyTo),
                checkRequired("inboxId", inboxId),
                checkRequired("inlineFiles", inlineFiles).map { it.toImmutable() },
                checkRequired("labels", labels).map { it.toImmutable() },
                checkRequired("messageId", messageId),
                checkRequired("readAt", readAt),
                checkRequired("receivedAt", receivedAt),
                checkRequired("recordType", recordType),
                checkRequired("references", references).map { it.toImmutable() },
                checkRequired("replyText", replyText),
                checkRequired("replyTo", replyTo).map { it.toImmutable() },
                checkRequired("sentAt", sentAt),
                checkRequired("status", status),
                checkRequired("subject", subject),
                checkRequired("textBodyUrl", textBodyUrl),
                checkRequired("threadId", threadId),
                checkRequired("to", to).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): ThreadMessage = apply {
        if (validated) {
            return@apply
        }

        id()
        attachments().forEach { it.validate() }
        bcc().forEach { it.validate() }
        cc().forEach { it.validate() }
        createdAt()
        direction().validate()
        from().validate()
        hasQuotedText()
        headers().validate()
        htmlBodyUrl()
        inReplyTo()
        inboxId()
        inlineFiles().forEach { it.validate() }
        labels()
        messageId()
        readAt()
        receivedAt()
        recordType().validate()
        references()
        replyText()
        replyTo().forEach { it.validate() }
        sentAt()
        status()
        subject()
        textBodyUrl()
        threadId()
        to().forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (bcc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (cc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (from.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hasQuotedText.asKnown().isPresent) 1 else 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (if (htmlBodyUrl.asKnown().isPresent) 1 else 0) +
            (if (inReplyTo.asKnown().isPresent) 1 else 0) +
            (if (inboxId.asKnown().isPresent) 1 else 0) +
            (inlineFiles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (labels.asKnown().getOrNull()?.size ?: 0) +
            (if (messageId.asKnown().isPresent) 1 else 0) +
            (if (readAt.asKnown().isPresent) 1 else 0) +
            (if (receivedAt.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (references.asKnown().getOrNull()?.size ?: 0) +
            (if (replyText.asKnown().isPresent) 1 else 0) +
            (replyTo.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sentAt.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (if (textBodyUrl.asKnown().isPresent) 1 else 0) +
            (if (threadId.asKnown().isPresent) 1 else 0) +
            (to.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class Attachment
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

            /** Returns a mutable builder for constructing an instance of [Attachment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attachment]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attachment: Attachment) = apply {
                additionalProperties = attachment.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Attachment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attachment = Attachment(additionalProperties.toImmutable())
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
        fun validate(): Attachment = apply {
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

            return other is Attachment && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Attachment{additionalProperties=$additionalProperties}"
    }

    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
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
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
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

    class InlineFile
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

            /** Returns a mutable builder for constructing an instance of [InlineFile]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InlineFile]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inlineFile: InlineFile) = apply {
                additionalProperties = inlineFile.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InlineFile].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InlineFile = InlineFile(additionalProperties.toImmutable())
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
        fun validate(): InlineFile = apply {
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

            return other is InlineFile && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "InlineFile{additionalProperties=$additionalProperties}"
    }

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

            @JvmField val EMAIL_MESSAGE = of("email_message")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            EMAIL_MESSAGE
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
            EMAIL_MESSAGE,
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
                EMAIL_MESSAGE -> Value.EMAIL_MESSAGE
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
                EMAIL_MESSAGE -> Known.EMAIL_MESSAGE
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is ThreadMessage &&
            id == other.id &&
            attachments == other.attachments &&
            bcc == other.bcc &&
            cc == other.cc &&
            createdAt == other.createdAt &&
            direction == other.direction &&
            from == other.from &&
            hasQuotedText == other.hasQuotedText &&
            headers == other.headers &&
            htmlBodyUrl == other.htmlBodyUrl &&
            inReplyTo == other.inReplyTo &&
            inboxId == other.inboxId &&
            inlineFiles == other.inlineFiles &&
            labels == other.labels &&
            messageId == other.messageId &&
            readAt == other.readAt &&
            receivedAt == other.receivedAt &&
            recordType == other.recordType &&
            references == other.references &&
            replyText == other.replyText &&
            replyTo == other.replyTo &&
            sentAt == other.sentAt &&
            status == other.status &&
            subject == other.subject &&
            textBodyUrl == other.textBodyUrl &&
            threadId == other.threadId &&
            to == other.to &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            attachments,
            bcc,
            cc,
            createdAt,
            direction,
            from,
            hasQuotedText,
            headers,
            htmlBodyUrl,
            inReplyTo,
            inboxId,
            inlineFiles,
            labels,
            messageId,
            readAt,
            receivedAt,
            recordType,
            references,
            replyText,
            replyTo,
            sentAt,
            status,
            subject,
            textBodyUrl,
            threadId,
            to,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThreadMessage{id=$id, attachments=$attachments, bcc=$bcc, cc=$cc, createdAt=$createdAt, direction=$direction, from=$from, hasQuotedText=$hasQuotedText, headers=$headers, htmlBodyUrl=$htmlBodyUrl, inReplyTo=$inReplyTo, inboxId=$inboxId, inlineFiles=$inlineFiles, labels=$labels, messageId=$messageId, readAt=$readAt, receivedAt=$receivedAt, recordType=$recordType, references=$references, replyText=$replyText, replyTo=$replyTo, sentAt=$sentAt, status=$status, subject=$subject, textBodyUrl=$textBodyUrl, threadId=$threadId, to=$to, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
