// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

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
import com.telnyx.sdk.models.emailmessages.MessageEvent
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailMessage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attachments: JsonField<List<Attachment>>,
    private val bcc: JsonField<List<EmailAddress>>,
    private val cc: JsonField<List<EmailAddress>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val events: JsonField<List<MessageEvent>>,
    private val from: JsonField<EmailAddress>,
    private val recordType: JsonField<RecordType>,
    private val replyTo: JsonField<String>,
    private val status: JsonField<Status>,
    private val subject: JsonField<String>,
    private val templateId: JsonField<String>,
    private val templateVariables: JsonField<TemplateVariables>,
    private val to: JsonField<List<EmailAddress>>,
    private val inlineCss: JsonField<Boolean>,
    private val recipientStatuses: JsonField<RecipientStatuses>,
    private val sandbox: JsonField<Boolean>,
    private val scheduledAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<List<Attachment>> = JsonMissing.of(),
        @JsonProperty("bcc") @ExcludeMissing bcc: JsonField<List<EmailAddress>> = JsonMissing.of(),
        @JsonProperty("cc") @ExcludeMissing cc: JsonField<List<EmailAddress>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<MessageEvent>> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<EmailAddress> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("reply_to") @ExcludeMissing replyTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template_id")
        @ExcludeMissing
        templateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template_variables")
        @ExcludeMissing
        templateVariables: JsonField<TemplateVariables> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<List<EmailAddress>> = JsonMissing.of(),
        @JsonProperty("inline_css")
        @ExcludeMissing
        inlineCss: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("recipient_statuses")
        @ExcludeMissing
        recipientStatuses: JsonField<RecipientStatuses> = JsonMissing.of(),
        @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        attachments,
        bcc,
        cc,
        createdAt,
        events,
        from,
        recordType,
        replyTo,
        status,
        subject,
        templateId,
        templateVariables,
        to,
        inlineCss,
        recipientStatuses,
        sandbox,
        scheduledAt,
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
    fun bcc(): List<EmailAddress> = bcc.getRequired("bcc")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cc(): List<EmailAddress> = cc.getRequired("cc")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<MessageEvent> = events.getRequired("events")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): EmailAddress = from.getRequired("from")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): RecordType = recordType.getRequired("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyTo(): Optional<String> = replyTo.getOptional("reply_to")

    /**
     * Current status of an email message. Lifecycle statuses (queued, scheduled, etc.) are set on
     * creation. Delivery statuses (delivered, bounced, etc.) are updated by delivery event
     * consumers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subject(): String = subject.getRequired("subject")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateId(): Optional<String> = templateId.getOptional("template_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateVariables(): TemplateVariables = templateVariables.getRequired("template_variables")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): List<EmailAddress> = to.getRequired("to")

    /**
     * Present when true in the immediate create response. Not persisted; absent on subsequent GET
     * requests.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inlineCss(): Optional<Boolean> = inlineCss.getOptional("inline_css")

    /**
     * Per-status recipient counts for the message. Present only for outbound messages with
     * recipient rows. Keys are recipient statuses, values are counts. Example: `{"delivered": 998,
     * "bounced": 2}`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientStatuses(): Optional<RecipientStatuses> =
        recipientStatuses.getOptional("recipient_statuses")

    /**
     * Present when sandbox mode was used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandbox(): Optional<Boolean> = sandbox.getOptional("sandbox")

    /**
     * Present when a scheduled_at value was stored. Persists even after the scheduled send has been
     * processed or cancelled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledAt(): Optional<OffsetDateTime> = scheduledAt.getOptional("scheduled_at")

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
    @JsonProperty("bcc") @ExcludeMissing fun _bcc(): JsonField<List<EmailAddress>> = bcc

    /**
     * Returns the raw JSON value of [cc].
     *
     * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<List<EmailAddress>> = cc

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<MessageEvent>> = events

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<EmailAddress> = from

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reply_to") @ExcludeMissing fun _replyTo(): JsonField<String> = replyTo

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template_id") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

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
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<List<EmailAddress>> = to

    /**
     * Returns the raw JSON value of [inlineCss].
     *
     * Unlike [inlineCss], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inline_css") @ExcludeMissing fun _inlineCss(): JsonField<Boolean> = inlineCss

    /**
     * Returns the raw JSON value of [recipientStatuses].
     *
     * Unlike [recipientStatuses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recipient_statuses")
    @ExcludeMissing
    fun _recipientStatuses(): JsonField<RecipientStatuses> = recipientStatuses

    /**
     * Returns the raw JSON value of [sandbox].
     *
     * Unlike [sandbox], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sandbox") @ExcludeMissing fun _sandbox(): JsonField<Boolean> = sandbox

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

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
         * Returns a mutable builder for constructing an instance of [EmailMessage].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .attachments()
         * .bcc()
         * .cc()
         * .createdAt()
         * .events()
         * .from()
         * .recordType()
         * .replyTo()
         * .status()
         * .subject()
         * .templateId()
         * .templateVariables()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailMessage]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attachments: JsonField<MutableList<Attachment>>? = null
        private var bcc: JsonField<MutableList<EmailAddress>>? = null
        private var cc: JsonField<MutableList<EmailAddress>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var events: JsonField<MutableList<MessageEvent>>? = null
        private var from: JsonField<EmailAddress>? = null
        private var recordType: JsonField<RecordType>? = null
        private var replyTo: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var subject: JsonField<String>? = null
        private var templateId: JsonField<String>? = null
        private var templateVariables: JsonField<TemplateVariables>? = null
        private var to: JsonField<MutableList<EmailAddress>>? = null
        private var inlineCss: JsonField<Boolean> = JsonMissing.of()
        private var recipientStatuses: JsonField<RecipientStatuses> = JsonMissing.of()
        private var sandbox: JsonField<Boolean> = JsonMissing.of()
        private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailMessage: EmailMessage) = apply {
            id = emailMessage.id
            attachments = emailMessage.attachments.map { it.toMutableList() }
            bcc = emailMessage.bcc.map { it.toMutableList() }
            cc = emailMessage.cc.map { it.toMutableList() }
            createdAt = emailMessage.createdAt
            events = emailMessage.events.map { it.toMutableList() }
            from = emailMessage.from
            recordType = emailMessage.recordType
            replyTo = emailMessage.replyTo
            status = emailMessage.status
            subject = emailMessage.subject
            templateId = emailMessage.templateId
            templateVariables = emailMessage.templateVariables
            to = emailMessage.to.map { it.toMutableList() }
            inlineCss = emailMessage.inlineCss
            recipientStatuses = emailMessage.recipientStatuses
            sandbox = emailMessage.sandbox
            scheduledAt = emailMessage.scheduledAt
            additionalProperties = emailMessage.additionalProperties.toMutableMap()
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

        fun bcc(bcc: List<EmailAddress>) = bcc(JsonField.of(bcc))

        /**
         * Sets [Builder.bcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bcc] with a well-typed `List<EmailAddress>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bcc(bcc: JsonField<List<EmailAddress>>) = apply {
            this.bcc = bcc.map { it.toMutableList() }
        }

        /**
         * Adds a single [EmailAddress] to [Builder.bcc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBcc(bcc: EmailAddress) = apply {
            this.bcc =
                (this.bcc ?: JsonField.of(mutableListOf())).also { checkKnown("bcc", it).add(bcc) }
        }

        fun cc(cc: List<EmailAddress>) = cc(JsonField.of(cc))

        /**
         * Sets [Builder.cc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cc] with a well-typed `List<EmailAddress>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cc(cc: JsonField<List<EmailAddress>>) = apply {
            this.cc = cc.map { it.toMutableList() }
        }

        /**
         * Adds a single [EmailAddress] to [Builder.cc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCc(cc: EmailAddress) = apply {
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

        fun events(events: List<MessageEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<MessageEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<MessageEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [MessageEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: MessageEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        fun from(from: EmailAddress) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [EmailAddress] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun from(from: JsonField<EmailAddress>) = apply { this.from = from }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        fun replyTo(replyTo: String?) = replyTo(JsonField.ofNullable(replyTo))

        /** Alias for calling [Builder.replyTo] with `replyTo.orElse(null)`. */
        fun replyTo(replyTo: Optional<String>) = replyTo(replyTo.getOrNull())

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun replyTo(replyTo: JsonField<String>) = apply { this.replyTo = replyTo }

        /**
         * Current status of an email message. Lifecycle statuses (queued, scheduled, etc.) are set
         * on creation. Delivery statuses (delivered, bounced, etc.) are updated by delivery event
         * consumers.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subject(subject: String) = subject(JsonField.of(subject))

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

        fun templateId(templateId: String?) = templateId(JsonField.ofNullable(templateId))

        /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
        fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        fun templateVariables(templateVariables: TemplateVariables) =
            templateVariables(JsonField.of(templateVariables))

        /**
         * Sets [Builder.templateVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateVariables] with a well-typed [TemplateVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun templateVariables(templateVariables: JsonField<TemplateVariables>) = apply {
            this.templateVariables = templateVariables
        }

        fun to(to: List<EmailAddress>) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed `List<EmailAddress>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun to(to: JsonField<List<EmailAddress>>) = apply {
            this.to = to.map { it.toMutableList() }
        }

        /**
         * Adds a single [EmailAddress] to [Builder.to].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTo(to: EmailAddress) = apply {
            this.to =
                (this.to ?: JsonField.of(mutableListOf())).also { checkKnown("to", it).add(to) }
        }

        /**
         * Present when true in the immediate create response. Not persisted; absent on subsequent
         * GET requests.
         */
        fun inlineCss(inlineCss: Boolean) = inlineCss(JsonField.of(inlineCss))

        /**
         * Sets [Builder.inlineCss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inlineCss] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inlineCss(inlineCss: JsonField<Boolean>) = apply { this.inlineCss = inlineCss }

        /**
         * Per-status recipient counts for the message. Present only for outbound messages with
         * recipient rows. Keys are recipient statuses, values are counts. Example: `{"delivered":
         * 998, "bounced": 2}`.
         */
        fun recipientStatuses(recipientStatuses: RecipientStatuses) =
            recipientStatuses(JsonField.of(recipientStatuses))

        /**
         * Sets [Builder.recipientStatuses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientStatuses] with a well-typed [RecipientStatuses]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recipientStatuses(recipientStatuses: JsonField<RecipientStatuses>) = apply {
            this.recipientStatuses = recipientStatuses
        }

        /** Present when sandbox mode was used. */
        fun sandbox(sandbox: Boolean) = sandbox(JsonField.of(sandbox))

        /**
         * Sets [Builder.sandbox] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandbox] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sandbox(sandbox: JsonField<Boolean>) = apply { this.sandbox = sandbox }

        /**
         * Present when a scheduled_at value was stored. Persists even after the scheduled send has
         * been processed or cancelled.
         */
        fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

        /**
         * Sets [Builder.scheduledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
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
         * Returns an immutable instance of [EmailMessage].
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
         * .events()
         * .from()
         * .recordType()
         * .replyTo()
         * .status()
         * .subject()
         * .templateId()
         * .templateVariables()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailMessage =
            EmailMessage(
                checkRequired("id", id),
                checkRequired("attachments", attachments).map { it.toImmutable() },
                checkRequired("bcc", bcc).map { it.toImmutable() },
                checkRequired("cc", cc).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("from", from),
                checkRequired("recordType", recordType),
                checkRequired("replyTo", replyTo),
                checkRequired("status", status),
                checkRequired("subject", subject),
                checkRequired("templateId", templateId),
                checkRequired("templateVariables", templateVariables),
                checkRequired("to", to).map { it.toImmutable() },
                inlineCss,
                recipientStatuses,
                sandbox,
                scheduledAt,
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
    fun validate(): EmailMessage = apply {
        if (validated) {
            return@apply
        }

        id()
        attachments().forEach { it.validate() }
        bcc().forEach { it.validate() }
        cc().forEach { it.validate() }
        createdAt()
        events().forEach { it.validate() }
        from().validate()
        recordType().validate()
        replyTo()
        status().validate()
        subject()
        templateId()
        templateVariables().validate()
        to().forEach { it.validate() }
        inlineCss()
        recipientStatuses().ifPresent { it.validate() }
        sandbox()
        scheduledAt()
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
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (from.asKnown().getOrNull()?.validity() ?: 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (replyTo.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (if (templateId.asKnown().isPresent) 1 else 0) +
            (templateVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (to.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (inlineCss.asKnown().isPresent) 1 else 0) +
            (recipientStatuses.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sandbox.asKnown().isPresent) 1 else 0) +
            (if (scheduledAt.asKnown().isPresent) 1 else 0)

    /** EDR-aligned attachment metadata. The base64 `content` is never returned. */
    class Attachment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contentId: JsonField<String>,
        private val contentType: JsonField<String>,
        private val disposition: JsonField<String>,
        private val filename: JsonField<String>,
        private val sha256: JsonField<String>,
        private val sizeBytes: JsonField<Long>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_id")
            @ExcludeMissing
            contentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disposition")
            @ExcludeMissing
            disposition: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sha256") @ExcludeMissing sha256: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size_bytes")
            @ExcludeMissing
            sizeBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            contentId,
            contentType,
            disposition,
            filename,
            sha256,
            sizeBytes,
            url,
            mutableMapOf(),
        )

        /**
         * MIME Content-ID for inline references.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentId(): Optional<String> = contentId.getOptional("content_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contentType(): String = contentType.getRequired("content_type")

        /**
         * MIME disposition (e.g. `attachment` or `inline`). Runtime passes through the stored value
         * without enforcing an enum.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun disposition(): String = disposition.getRequired("disposition")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * SHA-256 hex digest of the attachment content.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sha256(): Optional<String> = sha256.getOptional("sha256")

        /**
         * Attachment size in bytes.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("size_bytes")

        /**
         * Telnyx-hosted public URL for the attachment content.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [contentId].
         *
         * Unlike [contentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_id") @ExcludeMissing fun _contentId(): JsonField<String> = contentId

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [disposition].
         *
         * Unlike [disposition], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("disposition")
        @ExcludeMissing
        fun _disposition(): JsonField<String> = disposition

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [sha256].
         *
         * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

        /**
         * Returns the raw JSON value of [sizeBytes].
         *
         * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size_bytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

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

            /**
             * Returns a mutable builder for constructing an instance of [Attachment].
             *
             * The following fields are required:
             * ```java
             * .contentId()
             * .contentType()
             * .disposition()
             * .filename()
             * .sha256()
             * .sizeBytes()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attachment]. */
        class Builder internal constructor() {

            private var contentId: JsonField<String>? = null
            private var contentType: JsonField<String>? = null
            private var disposition: JsonField<String>? = null
            private var filename: JsonField<String>? = null
            private var sha256: JsonField<String>? = null
            private var sizeBytes: JsonField<Long>? = null
            private var url: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attachment: Attachment) = apply {
                contentId = attachment.contentId
                contentType = attachment.contentType
                disposition = attachment.disposition
                filename = attachment.filename
                sha256 = attachment.sha256
                sizeBytes = attachment.sizeBytes
                url = attachment.url
                additionalProperties = attachment.additionalProperties.toMutableMap()
            }

            /** MIME Content-ID for inline references. */
            fun contentId(contentId: String?) = contentId(JsonField.ofNullable(contentId))

            /** Alias for calling [Builder.contentId] with `contentId.orElse(null)`. */
            fun contentId(contentId: Optional<String>) = contentId(contentId.getOrNull())

            /**
             * Sets [Builder.contentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentId(contentId: JsonField<String>) = apply { this.contentId = contentId }

            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

            /**
             * MIME disposition (e.g. `attachment` or `inline`). Runtime passes through the stored
             * value without enforcing an enum.
             */
            fun disposition(disposition: String) = disposition(JsonField.of(disposition))

            /**
             * Sets [Builder.disposition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disposition] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun disposition(disposition: JsonField<String>) = apply {
                this.disposition = disposition
            }

            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** SHA-256 hex digest of the attachment content. */
            fun sha256(sha256: String?) = sha256(JsonField.ofNullable(sha256))

            /** Alias for calling [Builder.sha256] with `sha256.orElse(null)`. */
            fun sha256(sha256: Optional<String>) = sha256(sha256.getOrNull())

            /**
             * Sets [Builder.sha256] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sha256] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

            /** Attachment size in bytes. */
            fun sizeBytes(sizeBytes: Long?) = sizeBytes(JsonField.ofNullable(sizeBytes))

            /**
             * Alias for [Builder.sizeBytes].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sizeBytes(sizeBytes: Long) = sizeBytes(sizeBytes as Long?)

            /** Alias for calling [Builder.sizeBytes] with `sizeBytes.orElse(null)`. */
            fun sizeBytes(sizeBytes: Optional<Long>) = sizeBytes(sizeBytes.getOrNull())

            /**
             * Sets [Builder.sizeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

            /** Telnyx-hosted public URL for the attachment content. */
            fun url(url: String?) = url(JsonField.ofNullable(url))

            /** Alias for calling [Builder.url] with `url.orElse(null)`. */
            fun url(url: Optional<String>) = url(url.getOrNull())

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             *
             * The following fields are required:
             * ```java
             * .contentId()
             * .contentType()
             * .disposition()
             * .filename()
             * .sha256()
             * .sizeBytes()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attachment =
                Attachment(
                    checkRequired("contentId", contentId),
                    checkRequired("contentType", contentType),
                    checkRequired("disposition", disposition),
                    checkRequired("filename", filename),
                    checkRequired("sha256", sha256),
                    checkRequired("sizeBytes", sizeBytes),
                    checkRequired("url", url),
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
        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            contentId()
            contentType()
            disposition()
            filename()
            sha256()
            sizeBytes()
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
            (if (contentId.asKnown().isPresent) 1 else 0) +
                (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (disposition.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (sha256.asKnown().isPresent) 1 else 0) +
                (if (sizeBytes.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                contentId == other.contentId &&
                contentType == other.contentType &&
                disposition == other.disposition &&
                filename == other.filename &&
                sha256 == other.sha256 &&
                sizeBytes == other.sizeBytes &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                contentId,
                contentType,
                disposition,
                filename,
                sha256,
                sizeBytes,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attachment{contentId=$contentId, contentType=$contentType, disposition=$disposition, filename=$filename, sha256=$sha256, sizeBytes=$sizeBytes, url=$url, additionalProperties=$additionalProperties}"
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

    /**
     * Current status of an email message. Lifecycle statuses (queued, scheduled, etc.) are set on
     * creation. Delivery statuses (delivered, bounced, etc.) are updated by delivery event
     * consumers.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val QUEUED = of("queued")

            @JvmField val SCHEDULED = of("scheduled")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val SANDBOX = of("sandbox")

            @JvmField val SENDING = of("sending")

            @JvmField val SENT = of("sent")

            @JvmField val FAILED = of("failed")

            @JvmField val DEFERRED = of("deferred")

            @JvmField val DELIVERED = of("delivered")

            @JvmField val BOUNCED = of("bounced")

            @JvmField val COMPLAINED = of("complained")

            @JvmField val REJECTED = of("rejected")

            @JvmField val OPENED = of("opened")

            @JvmField val CLICKED = of("clicked")

            @JvmField val UNSUBSCRIBED = of("unsubscribed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            SCHEDULED,
            CANCELLED,
            SANDBOX,
            SENDING,
            SENT,
            FAILED,
            DEFERRED,
            DELIVERED,
            BOUNCED,
            COMPLAINED,
            REJECTED,
            OPENED,
            CLICKED,
            UNSUBSCRIBED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUEUED,
            SCHEDULED,
            CANCELLED,
            SANDBOX,
            SENDING,
            SENT,
            FAILED,
            DEFERRED,
            DELIVERED,
            BOUNCED,
            COMPLAINED,
            REJECTED,
            OPENED,
            CLICKED,
            UNSUBSCRIBED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                QUEUED -> Value.QUEUED
                SCHEDULED -> Value.SCHEDULED
                CANCELLED -> Value.CANCELLED
                SANDBOX -> Value.SANDBOX
                SENDING -> Value.SENDING
                SENT -> Value.SENT
                FAILED -> Value.FAILED
                DEFERRED -> Value.DEFERRED
                DELIVERED -> Value.DELIVERED
                BOUNCED -> Value.BOUNCED
                COMPLAINED -> Value.COMPLAINED
                REJECTED -> Value.REJECTED
                OPENED -> Value.OPENED
                CLICKED -> Value.CLICKED
                UNSUBSCRIBED -> Value.UNSUBSCRIBED
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
                QUEUED -> Known.QUEUED
                SCHEDULED -> Known.SCHEDULED
                CANCELLED -> Known.CANCELLED
                SANDBOX -> Known.SANDBOX
                SENDING -> Known.SENDING
                SENT -> Known.SENT
                FAILED -> Known.FAILED
                DEFERRED -> Known.DEFERRED
                DELIVERED -> Known.DELIVERED
                BOUNCED -> Known.BOUNCED
                COMPLAINED -> Known.COMPLAINED
                REJECTED -> Known.REJECTED
                OPENED -> Known.OPENED
                CLICKED -> Known.CLICKED
                UNSUBSCRIBED -> Known.UNSUBSCRIBED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

    /**
     * Per-status recipient counts for the message. Present only for outbound messages with
     * recipient rows. Keys are recipient statuses, values are counts. Example: `{"delivered": 998,
     * "bounced": 2}`.
     */
    class RecipientStatuses
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

            /** Returns a mutable builder for constructing an instance of [RecipientStatuses]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RecipientStatuses]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(recipientStatuses: RecipientStatuses) = apply {
                additionalProperties = recipientStatuses.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RecipientStatuses].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RecipientStatuses = RecipientStatuses(additionalProperties.toImmutable())
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
        fun validate(): RecipientStatuses = apply {
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

            return other is RecipientStatuses && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RecipientStatuses{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailMessage &&
            id == other.id &&
            attachments == other.attachments &&
            bcc == other.bcc &&
            cc == other.cc &&
            createdAt == other.createdAt &&
            events == other.events &&
            from == other.from &&
            recordType == other.recordType &&
            replyTo == other.replyTo &&
            status == other.status &&
            subject == other.subject &&
            templateId == other.templateId &&
            templateVariables == other.templateVariables &&
            to == other.to &&
            inlineCss == other.inlineCss &&
            recipientStatuses == other.recipientStatuses &&
            sandbox == other.sandbox &&
            scheduledAt == other.scheduledAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            attachments,
            bcc,
            cc,
            createdAt,
            events,
            from,
            recordType,
            replyTo,
            status,
            subject,
            templateId,
            templateVariables,
            to,
            inlineCss,
            recipientStatuses,
            sandbox,
            scheduledAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailMessage{id=$id, attachments=$attachments, bcc=$bcc, cc=$cc, createdAt=$createdAt, events=$events, from=$from, recordType=$recordType, replyTo=$replyTo, status=$status, subject=$subject, templateId=$templateId, templateVariables=$templateVariables, to=$to, inlineCss=$inlineCss, recipientStatuses=$recipientStatuses, sandbox=$sandbox, scheduledAt=$scheduledAt, additionalProperties=$additionalProperties}"
}
