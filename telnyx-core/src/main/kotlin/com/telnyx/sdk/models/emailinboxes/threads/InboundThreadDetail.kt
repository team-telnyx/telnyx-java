// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InboundThreadDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val inboxId: JsonField<String>,
    private val labels: JsonField<List<String>>,
    private val lastMessageAt: JsonField<OffsetDateTime>,
    private val lastMessageId: JsonField<String>,
    private val messageCount: JsonField<Long>,
    private val preview: JsonField<String>,
    private val recordType: JsonField<InboundThread.RecordType>,
    private val subject: JsonField<String>,
    private val unreadCount: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val messages: JsonField<List<ThreadMessage>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inbox_id") @ExcludeMissing inboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labels") @ExcludeMissing labels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("last_message_at")
        @ExcludeMissing
        lastMessageAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_message_id")
        @ExcludeMissing
        lastMessageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_count")
        @ExcludeMissing
        messageCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("preview") @ExcludeMissing preview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<InboundThread.RecordType> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unread_count")
        @ExcludeMissing
        unreadCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("messages")
        @ExcludeMissing
        messages: JsonField<List<ThreadMessage>> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        inboxId,
        labels,
        lastMessageAt,
        lastMessageId,
        messageCount,
        preview,
        recordType,
        subject,
        unreadCount,
        updatedAt,
        messages,
        mutableMapOf(),
    )

    fun toInboundThread(): InboundThread =
        InboundThread.builder()
            .id(id)
            .createdAt(createdAt)
            .inboxId(inboxId)
            .labels(labels)
            .lastMessageAt(lastMessageAt)
            .lastMessageId(lastMessageId)
            .messageCount(messageCount)
            .preview(preview)
            .recordType(recordType)
            .subject(subject)
            .unreadCount(unreadCount)
            .updatedAt(updatedAt)
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
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inboxId(): String = inboxId.getRequired("inbox_id")

    /**
     * Mutable thread labels used for agent workflow state. Independent of the labels on the
     * thread's messages, and distinct from the send-time `tags` on outbound messages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labels(): List<String> = labels.getRequired("labels")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastMessageAt(): OffsetDateTime = lastMessageAt.getRequired("last_message_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastMessageId(): String = lastMessageId.getRequired("last_message_id")

    /**
     * Total inbound and outbound messages in the thread.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageCount(): Long = messageCount.getRequired("message_count")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preview(): Optional<String> = preview.getOptional("preview")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): InboundThread.RecordType = recordType.getRequired("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * Unread inbound messages; outbound messages never increment this count.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unreadCount(): Long = unreadCount.getRequired("unread_count")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<ThreadMessage> = messages.getRequired("messages")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [inboxId].
     *
     * Unlike [inboxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbox_id") @ExcludeMissing fun _inboxId(): JsonField<String> = inboxId

    /**
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<List<String>> = labels

    /**
     * Returns the raw JSON value of [lastMessageAt].
     *
     * Unlike [lastMessageAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_message_at")
    @ExcludeMissing
    fun _lastMessageAt(): JsonField<OffsetDateTime> = lastMessageAt

    /**
     * Returns the raw JSON value of [lastMessageId].
     *
     * Unlike [lastMessageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_message_id")
    @ExcludeMissing
    fun _lastMessageId(): JsonField<String> = lastMessageId

    /**
     * Returns the raw JSON value of [messageCount].
     *
     * Unlike [messageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_count")
    @ExcludeMissing
    fun _messageCount(): JsonField<Long> = messageCount

    /**
     * Returns the raw JSON value of [preview].
     *
     * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preview") @ExcludeMissing fun _preview(): JsonField<String> = preview

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<InboundThread.RecordType> = recordType

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [unreadCount].
     *
     * Unlike [unreadCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unread_count") @ExcludeMissing fun _unreadCount(): JsonField<Long> = unreadCount

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages")
    @ExcludeMissing
    fun _messages(): JsonField<List<ThreadMessage>> = messages

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
         * Returns a mutable builder for constructing an instance of [InboundThreadDetail].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .inboxId()
         * .labels()
         * .lastMessageAt()
         * .lastMessageId()
         * .messageCount()
         * .preview()
         * .recordType()
         * .subject()
         * .unreadCount()
         * .updatedAt()
         * .messages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundThreadDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var inboxId: JsonField<String>? = null
        private var labels: JsonField<MutableList<String>>? = null
        private var lastMessageAt: JsonField<OffsetDateTime>? = null
        private var lastMessageId: JsonField<String>? = null
        private var messageCount: JsonField<Long>? = null
        private var preview: JsonField<String>? = null
        private var recordType: JsonField<InboundThread.RecordType>? = null
        private var subject: JsonField<String>? = null
        private var unreadCount: JsonField<Long>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var messages: JsonField<MutableList<ThreadMessage>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundThreadDetail: InboundThreadDetail) = apply {
            id = inboundThreadDetail.id
            createdAt = inboundThreadDetail.createdAt
            inboxId = inboundThreadDetail.inboxId
            labels = inboundThreadDetail.labels.map { it.toMutableList() }
            lastMessageAt = inboundThreadDetail.lastMessageAt
            lastMessageId = inboundThreadDetail.lastMessageId
            messageCount = inboundThreadDetail.messageCount
            preview = inboundThreadDetail.preview
            recordType = inboundThreadDetail.recordType
            subject = inboundThreadDetail.subject
            unreadCount = inboundThreadDetail.unreadCount
            updatedAt = inboundThreadDetail.updatedAt
            messages = inboundThreadDetail.messages.map { it.toMutableList() }
            additionalProperties = inboundThreadDetail.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun inboxId(inboxId: String) = inboxId(JsonField.of(inboxId))

        /**
         * Sets [Builder.inboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inboxId(inboxId: JsonField<String>) = apply { this.inboxId = inboxId }

        /**
         * Mutable thread labels used for agent workflow state. Independent of the labels on the
         * thread's messages, and distinct from the send-time `tags` on outbound messages.
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

        fun lastMessageAt(lastMessageAt: OffsetDateTime) =
            lastMessageAt(JsonField.of(lastMessageAt))

        /**
         * Sets [Builder.lastMessageAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastMessageAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastMessageAt(lastMessageAt: JsonField<OffsetDateTime>) = apply {
            this.lastMessageAt = lastMessageAt
        }

        fun lastMessageId(lastMessageId: String) = lastMessageId(JsonField.of(lastMessageId))

        /**
         * Sets [Builder.lastMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastMessageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastMessageId(lastMessageId: JsonField<String>) = apply {
            this.lastMessageId = lastMessageId
        }

        /** Total inbound and outbound messages in the thread. */
        fun messageCount(messageCount: Long) = messageCount(JsonField.of(messageCount))

        /**
         * Sets [Builder.messageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageCount(messageCount: JsonField<Long>) = apply { this.messageCount = messageCount }

        fun preview(preview: String?) = preview(JsonField.ofNullable(preview))

        /** Alias for calling [Builder.preview] with `preview.orElse(null)`. */
        fun preview(preview: Optional<String>) = preview(preview.getOrNull())

        /**
         * Sets [Builder.preview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preview] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun preview(preview: JsonField<String>) = apply { this.preview = preview }

        fun recordType(recordType: InboundThread.RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [InboundThread.RecordType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordType(recordType: JsonField<InboundThread.RecordType>) = apply {
            this.recordType = recordType
        }

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

        /** Unread inbound messages; outbound messages never increment this count. */
        fun unreadCount(unreadCount: Long) = unreadCount(JsonField.of(unreadCount))

        /**
         * Sets [Builder.unreadCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unreadCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unreadCount(unreadCount: JsonField<Long>) = apply { this.unreadCount = unreadCount }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun messages(messages: List<ThreadMessage>) = messages(JsonField.of(messages))

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<ThreadMessage>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<ThreadMessage>>) = apply {
            this.messages = messages.map { it.toMutableList() }
        }

        /**
         * Adds a single [ThreadMessage] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: ThreadMessage) = apply {
            messages =
                (messages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("messages", it).add(message)
                }
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
         * Returns an immutable instance of [InboundThreadDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .inboxId()
         * .labels()
         * .lastMessageAt()
         * .lastMessageId()
         * .messageCount()
         * .preview()
         * .recordType()
         * .subject()
         * .unreadCount()
         * .updatedAt()
         * .messages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundThreadDetail =
            InboundThreadDetail(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("inboxId", inboxId),
                checkRequired("labels", labels).map { it.toImmutable() },
                checkRequired("lastMessageAt", lastMessageAt),
                checkRequired("lastMessageId", lastMessageId),
                checkRequired("messageCount", messageCount),
                checkRequired("preview", preview),
                checkRequired("recordType", recordType),
                checkRequired("subject", subject),
                checkRequired("unreadCount", unreadCount),
                checkRequired("updatedAt", updatedAt),
                checkRequired("messages", messages).map { it.toImmutable() },
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
    fun validate(): InboundThreadDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        inboxId()
        labels()
        lastMessageAt()
        lastMessageId()
        messageCount()
        preview()
        recordType().validate()
        subject()
        unreadCount()
        updatedAt()
        messages().forEach { it.validate() }
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (inboxId.asKnown().isPresent) 1 else 0) +
            (labels.asKnown().getOrNull()?.size ?: 0) +
            (if (lastMessageAt.asKnown().isPresent) 1 else 0) +
            (if (lastMessageId.asKnown().isPresent) 1 else 0) +
            (if (messageCount.asKnown().isPresent) 1 else 0) +
            (if (preview.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (if (unreadCount.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundThreadDetail &&
            id == other.id &&
            createdAt == other.createdAt &&
            inboxId == other.inboxId &&
            labels == other.labels &&
            lastMessageAt == other.lastMessageAt &&
            lastMessageId == other.lastMessageId &&
            messageCount == other.messageCount &&
            preview == other.preview &&
            recordType == other.recordType &&
            subject == other.subject &&
            unreadCount == other.unreadCount &&
            updatedAt == other.updatedAt &&
            messages == other.messages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            inboxId,
            labels,
            lastMessageAt,
            lastMessageId,
            messageCount,
            preview,
            recordType,
            subject,
            unreadCount,
            updatedAt,
            messages,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundThreadDetail{id=$id, createdAt=$createdAt, inboxId=$inboxId, labels=$labels, lastMessageAt=$lastMessageAt, lastMessageId=$lastMessageId, messageCount=$messageCount, preview=$preview, recordType=$recordType, subject=$subject, unreadCount=$unreadCount, updatedAt=$updatedAt, messages=$messages, additionalProperties=$additionalProperties}"
}
