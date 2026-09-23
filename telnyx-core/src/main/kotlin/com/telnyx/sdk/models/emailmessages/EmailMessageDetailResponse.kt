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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessage
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailMessageDetailResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [EmailMessageDetailResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailMessageDetailResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailMessageDetailResponse: EmailMessageDetailResponse) = apply {
            data = emailMessageDetailResponse.data
            additionalProperties = emailMessageDetailResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [EmailMessageDetailResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailMessageDetailResponse =
            EmailMessageDetailResponse(
                checkRequired("data", data),
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
    fun validate(): EmailMessageDetailResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val attachments: JsonField<List<EmailMessage.Attachment>>,
        private val bcc: JsonField<List<EmailAddress>>,
        private val cc: JsonField<List<EmailAddress>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val events: JsonField<List<EmailMessage.Event>>,
        private val from: JsonField<EmailAddress>,
        private val metadata: JsonField<EmailMessage.Metadata>,
        private val recordType: JsonField<EmailMessage.RecordType>,
        private val replyTo: JsonField<String>,
        private val status: JsonField<EmailMessage.Status>,
        private val subject: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val templateId: JsonField<String>,
        private val templateVariables: JsonField<EmailMessage.TemplateVariables>,
        private val to: JsonField<List<EmailAddress>>,
        private val inlineCss: JsonField<Boolean>,
        private val recipientStatuses: JsonField<EmailMessage.RecipientStatuses>,
        private val sandbox: JsonField<Boolean>,
        private val scheduledAt: JsonField<OffsetDateTime>,
        private val suppressed: JsonField<List<SuppressedRecipient>>,
        private val htmlBody: JsonField<String>,
        private val textBody: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attachments")
            @ExcludeMissing
            attachments: JsonField<List<EmailMessage.Attachment>> = JsonMissing.of(),
            @JsonProperty("bcc")
            @ExcludeMissing
            bcc: JsonField<List<EmailAddress>> = JsonMissing.of(),
            @JsonProperty("cc")
            @ExcludeMissing
            cc: JsonField<List<EmailAddress>> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<EmailMessage.Event>> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<EmailAddress> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<EmailMessage.Metadata> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<EmailMessage.RecordType> = JsonMissing.of(),
            @JsonProperty("reply_to") @ExcludeMissing replyTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<EmailMessage.Status> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("template_id")
            @ExcludeMissing
            templateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template_variables")
            @ExcludeMissing
            templateVariables: JsonField<EmailMessage.TemplateVariables> = JsonMissing.of(),
            @JsonProperty("to")
            @ExcludeMissing
            to: JsonField<List<EmailAddress>> = JsonMissing.of(),
            @JsonProperty("inline_css")
            @ExcludeMissing
            inlineCss: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recipient_statuses")
            @ExcludeMissing
            recipientStatuses: JsonField<EmailMessage.RecipientStatuses> = JsonMissing.of(),
            @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("scheduled_at")
            @ExcludeMissing
            scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("suppressed")
            @ExcludeMissing
            suppressed: JsonField<List<SuppressedRecipient>> = JsonMissing.of(),
            @JsonProperty("html_body")
            @ExcludeMissing
            htmlBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text_body")
            @ExcludeMissing
            textBody: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            attachments,
            bcc,
            cc,
            createdAt,
            events,
            from,
            metadata,
            recordType,
            replyTo,
            status,
            subject,
            tags,
            templateId,
            templateVariables,
            to,
            inlineCss,
            recipientStatuses,
            sandbox,
            scheduledAt,
            suppressed,
            htmlBody,
            textBody,
            mutableMapOf(),
        )

        fun toEmailMessage(): EmailMessage =
            EmailMessage.builder()
                .id(id)
                .attachments(attachments)
                .bcc(bcc)
                .cc(cc)
                .createdAt(createdAt)
                .events(events)
                .from(from)
                .metadata(metadata)
                .recordType(recordType)
                .replyTo(replyTo)
                .status(status)
                .subject(subject)
                .tags(tags)
                .templateId(templateId)
                .templateVariables(templateVariables)
                .to(to)
                .inlineCss(inlineCss)
                .recipientStatuses(recipientStatuses)
                .sandbox(sandbox)
                .scheduledAt(scheduledAt)
                .suppressed(suppressed)
                .build()

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attachments(): List<EmailMessage.Attachment> = attachments.getRequired("attachments")

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
        fun events(): List<EmailMessage.Event> = events.getRequired("events")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): EmailAddress = from.getRequired("from")

        /**
         * Customer-supplied metadata stored with the message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): EmailMessage.Metadata = metadata.getRequired("metadata")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): EmailMessage.RecordType = recordType.getRequired("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replyTo(): Optional<String> = replyTo.getOptional("reply_to")

        /**
         * Current status of an email message. Lifecycle statuses (queued, scheduled, etc.) are set
         * on creation. Delivery statuses (delivered, bounced, etc.) are updated by delivery event
         * consumers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): EmailMessage.Status = status.getRequired("status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subject(): String = subject.getRequired("subject")

        /**
         * Customer-supplied tags stored with the message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tags(): List<String> = tags.getRequired("tags")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateId(): Optional<String> = templateId.getOptional("template_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun templateVariables(): EmailMessage.TemplateVariables =
            templateVariables.getRequired("template_variables")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): List<EmailAddress> = to.getRequired("to")

        /**
         * Present when true in the immediate create response. Not persisted; absent on subsequent
         * GET requests.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inlineCss(): Optional<Boolean> = inlineCss.getOptional("inline_css")

        /**
         * Per-status recipient counts for the message. Present only for outbound messages with
         * recipient rows. Keys are recipient statuses, values are counts. Example: `{"delivered":
         * 998, "bounced": 2}`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recipientStatuses(): Optional<EmailMessage.RecipientStatuses> =
            recipientStatuses.getOptional("recipient_statuses")

        /**
         * Present when sandbox mode was used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sandbox(): Optional<Boolean> = sandbox.getOptional("sandbox")

        /**
         * Present when a scheduled_at value was stored. Persists even after the scheduled send has
         * been processed or cancelled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scheduledAt(): Optional<OffsetDateTime> = scheduledAt.getOptional("scheduled_at")

        /**
         * Recipients excluded from delivery by suppression checks, with reasons. On batch items,
         * present when that item had suppressed recipients; all other recipients of the item still
         * receive the message. For single sends this information appears at the top level of the
         * response instead (see EmailMessageResponse.suppressed).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suppressed(): Optional<List<SuppressedRecipient>> = suppressed.getOptional("suppressed")

        /**
         * HTML body submitted for the message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun htmlBody(): Optional<String> = htmlBody.getOptional("html_body")

        /**
         * Plain-text body submitted for the message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun textBody(): Optional<String> = textBody.getOptional("text_body")

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
        fun _attachments(): JsonField<List<EmailMessage.Attachment>> = attachments

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
        @JsonProperty("events")
        @ExcludeMissing
        fun _events(): JsonField<List<EmailMessage.Event>> = events

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<EmailAddress> = from

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): JsonField<EmailMessage.Metadata> = metadata

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<EmailMessage.RecordType> = recordType

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
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<EmailMessage.Status> = status

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
        fun _templateVariables(): JsonField<EmailMessage.TemplateVariables> = templateVariables

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
        fun _recipientStatuses(): JsonField<EmailMessage.RecipientStatuses> = recipientStatuses

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

        /**
         * Returns the raw JSON value of [suppressed].
         *
         * Unlike [suppressed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suppressed")
        @ExcludeMissing
        fun _suppressed(): JsonField<List<SuppressedRecipient>> = suppressed

        /**
         * Returns the raw JSON value of [htmlBody].
         *
         * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("html_body") @ExcludeMissing fun _htmlBody(): JsonField<String> = htmlBody

        /**
         * Returns the raw JSON value of [textBody].
         *
         * Unlike [textBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text_body") @ExcludeMissing fun _textBody(): JsonField<String> = textBody

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
             * .attachments()
             * .bcc()
             * .cc()
             * .createdAt()
             * .events()
             * .from()
             * .metadata()
             * .recordType()
             * .replyTo()
             * .status()
             * .subject()
             * .tags()
             * .templateId()
             * .templateVariables()
             * .to()
             * .htmlBody()
             * .textBody()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var attachments: JsonField<MutableList<EmailMessage.Attachment>>? = null
            private var bcc: JsonField<MutableList<EmailAddress>>? = null
            private var cc: JsonField<MutableList<EmailAddress>>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var events: JsonField<MutableList<EmailMessage.Event>>? = null
            private var from: JsonField<EmailAddress>? = null
            private var metadata: JsonField<EmailMessage.Metadata>? = null
            private var recordType: JsonField<EmailMessage.RecordType>? = null
            private var replyTo: JsonField<String>? = null
            private var status: JsonField<EmailMessage.Status>? = null
            private var subject: JsonField<String>? = null
            private var tags: JsonField<MutableList<String>>? = null
            private var templateId: JsonField<String>? = null
            private var templateVariables: JsonField<EmailMessage.TemplateVariables>? = null
            private var to: JsonField<MutableList<EmailAddress>>? = null
            private var inlineCss: JsonField<Boolean> = JsonMissing.of()
            private var recipientStatuses: JsonField<EmailMessage.RecipientStatuses> =
                JsonMissing.of()
            private var sandbox: JsonField<Boolean> = JsonMissing.of()
            private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var suppressed: JsonField<MutableList<SuppressedRecipient>>? = null
            private var htmlBody: JsonField<String>? = null
            private var textBody: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                attachments = data.attachments.map { it.toMutableList() }
                bcc = data.bcc.map { it.toMutableList() }
                cc = data.cc.map { it.toMutableList() }
                createdAt = data.createdAt
                events = data.events.map { it.toMutableList() }
                from = data.from
                metadata = data.metadata
                recordType = data.recordType
                replyTo = data.replyTo
                status = data.status
                subject = data.subject
                tags = data.tags.map { it.toMutableList() }
                templateId = data.templateId
                templateVariables = data.templateVariables
                to = data.to.map { it.toMutableList() }
                inlineCss = data.inlineCss
                recipientStatuses = data.recipientStatuses
                sandbox = data.sandbox
                scheduledAt = data.scheduledAt
                suppressed = data.suppressed.map { it.toMutableList() }
                htmlBody = data.htmlBody
                textBody = data.textBody
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun attachments(attachments: List<EmailMessage.Attachment>) =
                attachments(JsonField.of(attachments))

            /**
             * Sets [Builder.attachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachments] with a well-typed
             * `List<EmailMessage.Attachment>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun attachments(attachments: JsonField<List<EmailMessage.Attachment>>) = apply {
                this.attachments = attachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmailMessage.Attachment] to [attachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttachment(attachment: EmailMessage.Attachment) = apply {
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
                    (this.bcc ?: JsonField.of(mutableListOf())).also {
                        checkKnown("bcc", it).add(bcc)
                    }
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun events(events: List<EmailMessage.Event>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<EmailMessage.Event>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun events(events: JsonField<List<EmailMessage.Event>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmailMessage.Event] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: EmailMessage.Event) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            fun from(from: EmailAddress) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [EmailAddress] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun from(from: JsonField<EmailAddress>) = apply { this.from = from }

            /** Customer-supplied metadata stored with the message. */
            fun metadata(metadata: EmailMessage.Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [EmailMessage.Metadata]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun metadata(metadata: JsonField<EmailMessage.Metadata>) = apply {
                this.metadata = metadata
            }

            fun recordType(recordType: EmailMessage.RecordType) =
                recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed
             * [EmailMessage.RecordType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun recordType(recordType: JsonField<EmailMessage.RecordType>) = apply {
                this.recordType = recordType
            }

            fun replyTo(replyTo: String?) = replyTo(JsonField.ofNullable(replyTo))

            /** Alias for calling [Builder.replyTo] with `replyTo.orElse(null)`. */
            fun replyTo(replyTo: Optional<String>) = replyTo(replyTo.getOrNull())

            /**
             * Sets [Builder.replyTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replyTo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replyTo(replyTo: JsonField<String>) = apply { this.replyTo = replyTo }

            /**
             * Current status of an email message. Lifecycle statuses (queued, scheduled, etc.) are
             * set on creation. Delivery statuses (delivered, bounced, etc.) are updated by delivery
             * event consumers.
             */
            fun status(status: EmailMessage.Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [EmailMessage.Status]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun status(status: JsonField<EmailMessage.Status>) = apply { this.status = status }

            fun subject(subject: String) = subject(JsonField.of(subject))

            /**
             * Sets [Builder.subject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subject] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subject(subject: JsonField<String>) = apply { this.subject = subject }

            /** Customer-supplied tags stored with the message. */
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

            fun templateId(templateId: String?) = templateId(JsonField.ofNullable(templateId))

            /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
            fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

            /**
             * Sets [Builder.templateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

            fun templateVariables(templateVariables: EmailMessage.TemplateVariables) =
                templateVariables(JsonField.of(templateVariables))

            /**
             * Sets [Builder.templateVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateVariables] with a well-typed
             * [EmailMessage.TemplateVariables] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun templateVariables(templateVariables: JsonField<EmailMessage.TemplateVariables>) =
                apply {
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
             * Present when true in the immediate create response. Not persisted; absent on
             * subsequent GET requests.
             */
            fun inlineCss(inlineCss: Boolean) = inlineCss(JsonField.of(inlineCss))

            /**
             * Sets [Builder.inlineCss] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inlineCss] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inlineCss(inlineCss: JsonField<Boolean>) = apply { this.inlineCss = inlineCss }

            /**
             * Per-status recipient counts for the message. Present only for outbound messages with
             * recipient rows. Keys are recipient statuses, values are counts. Example:
             * `{"delivered": 998, "bounced": 2}`.
             */
            fun recipientStatuses(recipientStatuses: EmailMessage.RecipientStatuses) =
                recipientStatuses(JsonField.of(recipientStatuses))

            /**
             * Sets [Builder.recipientStatuses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientStatuses] with a well-typed
             * [EmailMessage.RecipientStatuses] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun recipientStatuses(recipientStatuses: JsonField<EmailMessage.RecipientStatuses>) =
                apply {
                    this.recipientStatuses = recipientStatuses
                }

            /** Present when sandbox mode was used. */
            fun sandbox(sandbox: Boolean) = sandbox(JsonField.of(sandbox))

            /**
             * Sets [Builder.sandbox] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sandbox] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sandbox(sandbox: JsonField<Boolean>) = apply { this.sandbox = sandbox }

            /**
             * Present when a scheduled_at value was stored. Persists even after the scheduled send
             * has been processed or cancelled.
             */
            fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

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

            /**
             * Recipients excluded from delivery by suppression checks, with reasons. On batch
             * items, present when that item had suppressed recipients; all other recipients of the
             * item still receive the message. For single sends this information appears at the top
             * level of the response instead (see EmailMessageResponse.suppressed).
             */
            fun suppressed(suppressed: List<SuppressedRecipient>) =
                suppressed(JsonField.of(suppressed))

            /**
             * Sets [Builder.suppressed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suppressed] with a well-typed
             * `List<SuppressedRecipient>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun suppressed(suppressed: JsonField<List<SuppressedRecipient>>) = apply {
                this.suppressed = suppressed.map { it.toMutableList() }
            }

            /**
             * Adds a single [SuppressedRecipient] to [Builder.suppressed].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSuppressed(suppressed: SuppressedRecipient) = apply {
                this.suppressed =
                    (this.suppressed ?: JsonField.of(mutableListOf())).also {
                        checkKnown("suppressed", it).add(suppressed)
                    }
            }

            /** HTML body submitted for the message. */
            fun htmlBody(htmlBody: String?) = htmlBody(JsonField.ofNullable(htmlBody))

            /** Alias for calling [Builder.htmlBody] with `htmlBody.orElse(null)`. */
            fun htmlBody(htmlBody: Optional<String>) = htmlBody(htmlBody.getOrNull())

            /**
             * Sets [Builder.htmlBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.htmlBody] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun htmlBody(htmlBody: JsonField<String>) = apply { this.htmlBody = htmlBody }

            /** Plain-text body submitted for the message. */
            fun textBody(textBody: String?) = textBody(JsonField.ofNullable(textBody))

            /** Alias for calling [Builder.textBody] with `textBody.orElse(null)`. */
            fun textBody(textBody: Optional<String>) = textBody(textBody.getOrNull())

            /**
             * Sets [Builder.textBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textBody] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textBody(textBody: JsonField<String>) = apply { this.textBody = textBody }

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
             * .attachments()
             * .bcc()
             * .cc()
             * .createdAt()
             * .events()
             * .from()
             * .metadata()
             * .recordType()
             * .replyTo()
             * .status()
             * .subject()
             * .tags()
             * .templateId()
             * .templateVariables()
             * .to()
             * .htmlBody()
             * .textBody()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("attachments", attachments).map { it.toImmutable() },
                    checkRequired("bcc", bcc).map { it.toImmutable() },
                    checkRequired("cc", cc).map { it.toImmutable() },
                    checkRequired("createdAt", createdAt),
                    checkRequired("events", events).map { it.toImmutable() },
                    checkRequired("from", from),
                    checkRequired("metadata", metadata),
                    checkRequired("recordType", recordType),
                    checkRequired("replyTo", replyTo),
                    checkRequired("status", status),
                    checkRequired("subject", subject),
                    checkRequired("tags", tags).map { it.toImmutable() },
                    checkRequired("templateId", templateId),
                    checkRequired("templateVariables", templateVariables),
                    checkRequired("to", to).map { it.toImmutable() },
                    inlineCss,
                    recipientStatuses,
                    sandbox,
                    scheduledAt,
                    (suppressed ?: JsonMissing.of()).map { it.toImmutable() },
                    checkRequired("htmlBody", htmlBody),
                    checkRequired("textBody", textBody),
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
            attachments().forEach { it.validate() }
            bcc().forEach { it.validate() }
            cc().forEach { it.validate() }
            createdAt()
            events().forEach { it.validate() }
            from().validate()
            metadata().validate()
            recordType().validate()
            replyTo()
            status().validate()
            subject()
            tags()
            templateId()
            templateVariables().validate()
            to().forEach { it.validate() }
            inlineCss()
            recipientStatuses().ifPresent { it.validate() }
            sandbox()
            scheduledAt()
            suppressed().ifPresent { it.forEach { it.validate() } }
            htmlBody()
            textBody()
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
                (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (bcc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (cc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (from.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (replyTo.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subject.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (templateId.asKnown().isPresent) 1 else 0) +
                (templateVariables.asKnown().getOrNull()?.validity() ?: 0) +
                (to.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (inlineCss.asKnown().isPresent) 1 else 0) +
                (recipientStatuses.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sandbox.asKnown().isPresent) 1 else 0) +
                (if (scheduledAt.asKnown().isPresent) 1 else 0) +
                (suppressed.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (htmlBody.asKnown().isPresent) 1 else 0) +
                (if (textBody.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                attachments == other.attachments &&
                bcc == other.bcc &&
                cc == other.cc &&
                createdAt == other.createdAt &&
                events == other.events &&
                from == other.from &&
                metadata == other.metadata &&
                recordType == other.recordType &&
                replyTo == other.replyTo &&
                status == other.status &&
                subject == other.subject &&
                tags == other.tags &&
                templateId == other.templateId &&
                templateVariables == other.templateVariables &&
                to == other.to &&
                inlineCss == other.inlineCss &&
                recipientStatuses == other.recipientStatuses &&
                sandbox == other.sandbox &&
                scheduledAt == other.scheduledAt &&
                suppressed == other.suppressed &&
                htmlBody == other.htmlBody &&
                textBody == other.textBody &&
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
                metadata,
                recordType,
                replyTo,
                status,
                subject,
                tags,
                templateId,
                templateVariables,
                to,
                inlineCss,
                recipientStatuses,
                sandbox,
                scheduledAt,
                suppressed,
                htmlBody,
                textBody,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, attachments=$attachments, bcc=$bcc, cc=$cc, createdAt=$createdAt, events=$events, from=$from, metadata=$metadata, recordType=$recordType, replyTo=$replyTo, status=$status, subject=$subject, tags=$tags, templateId=$templateId, templateVariables=$templateVariables, to=$to, inlineCss=$inlineCss, recipientStatuses=$recipientStatuses, sandbox=$sandbox, scheduledAt=$scheduledAt, suppressed=$suppressed, htmlBody=$htmlBody, textBody=$textBody, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailMessageDetailResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailMessageDetailResponse{data=$data, additionalProperties=$additionalProperties}"
}
