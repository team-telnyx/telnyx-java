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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessageCancelScheduledResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cc: JsonField<List<Cc>>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val cost: JsonField<Cost>,
    private val costBreakdown: JsonField<CostBreakdown>,
    private val direction: JsonField<Direction>,
    private val encoding: JsonField<String>,
    private val errors: JsonField<List<MessagingError>>,
    private val from: JsonField<From>,
    private val media: JsonField<List<Media>>,
    private val messagingProfileId: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val parts: JsonField<Long>,
    private val receivedAt: JsonField<OffsetDateTime>,
    private val recordType: JsonField<RecordType>,
    private val sentAt: JsonField<OffsetDateTime>,
    private val subject: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val tcrCampaignBillable: JsonField<Boolean>,
    private val tcrCampaignId: JsonField<String>,
    private val tcrCampaignRegistered: JsonField<String>,
    private val text: JsonField<String>,
    private val to: JsonField<List<To>>,
    private val type: JsonField<Type>,
    private val validUntil: JsonField<OffsetDateTime>,
    private val webhookFailoverUrl: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cc") @ExcludeMissing cc: JsonField<List<Cc>> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
        @JsonProperty("cost_breakdown")
        @ExcludeMissing
        costBreakdown: JsonField<CostBreakdown> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("encoding") @ExcludeMissing encoding: JsonField<String> = JsonMissing.of(),
        @JsonProperty("errors")
        @ExcludeMissing
        errors: JsonField<List<MessagingError>> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<From> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parts") @ExcludeMissing parts: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("received_at")
        @ExcludeMissing
        receivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("sent_at")
        @ExcludeMissing
        sentAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tcr_campaign_billable")
        @ExcludeMissing
        tcrCampaignBillable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tcr_campaign_id")
        @ExcludeMissing
        tcrCampaignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tcr_campaign_registered")
        @ExcludeMissing
        tcrCampaignRegistered: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<List<To>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("valid_until")
        @ExcludeMissing
        validUntil: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("webhook_failover_url")
        @ExcludeMissing
        webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        cc,
        completedAt,
        cost,
        costBreakdown,
        direction,
        encoding,
        errors,
        from,
        media,
        messagingProfileId,
        organizationId,
        parts,
        receivedAt,
        recordType,
        sentAt,
        subject,
        tags,
        tcrCampaignBillable,
        tcrCampaignId,
        tcrCampaignRegistered,
        text,
        to,
        type,
        validUntil,
        webhookFailoverUrl,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * Identifies the type of resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cc(): Optional<List<Cc>> = cc.getOptional("cc")

    /**
     * ISO 8601 formatted date indicating when the message was finalized.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cost(): Optional<Cost> = cost.getOptional("cost")

    /**
     * Detailed breakdown of the message cost components.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun costBreakdown(): Optional<CostBreakdown> = costBreakdown.getOptional("cost_breakdown")

    /**
     * The direction of the message. Inbound messages are sent to you whereas outbound messages are
     * sent from you.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun direction(): Optional<Direction> = direction.getOptional("direction")

    /**
     * Encoding scheme used for the message body.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encoding(): Optional<String> = encoding.getOptional("encoding")

    /**
     * These errors may point at addressees when referring to unsuccessful/unconfirmed delivery
     * statuses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errors(): Optional<List<MessagingError>> = errors.getOptional("errors")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<From> = from.getOptional("from")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun media(): Optional<List<Media>> = media.getOptional("media")

    /**
     * Unique identifier for a messaging profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> =
        messagingProfileId.getOptional("messaging_profile_id")

    /**
     * The id of the organization the messaging profile belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * Number of parts into which the message's body must be split.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parts(): Optional<Long> = parts.getOptional("parts")

    /**
     * ISO 8601 formatted date indicating when the message request was received.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receivedAt(): Optional<OffsetDateTime> = receivedAt.getOptional("received_at")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * ISO 8601 formatted date indicating when the message was sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sentAt(): Optional<OffsetDateTime> = sentAt.getOptional("sent_at")

    /**
     * Subject of multimedia message
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * Tags associated with the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Indicates whether the TCR campaign is billable.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tcrCampaignBillable(): Optional<Boolean> =
        tcrCampaignBillable.getOptional("tcr_campaign_billable")

    /**
     * The Campaign Registry (TCR) campaign ID associated with the message.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tcrCampaignId(): Optional<String> = tcrCampaignId.getOptional("tcr_campaign_id")

    /**
     * The registration status of the TCR campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tcrCampaignRegistered(): Optional<String> =
        tcrCampaignRegistered.getOptional("tcr_campaign_registered")

    /**
     * Message body (i.e., content) as a non-empty string.
     *
     * **Required for SMS**
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<List<To>> = to.getOptional("to")

    /**
     * The type of message.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Message must be out of the queue by this time or else it will be discarded and marked as
     * 'sending_failed'. Once the message moves out of the queue, this field will be nulled
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validUntil(): Optional<OffsetDateTime> = validUntil.getOptional("valid_until")

    /**
     * The failover URL where webhooks related to this message will be sent if sending to the
     * primary URL fails.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> =
        webhookFailoverUrl.getOptional("webhook_failover_url")

    /**
     * The URL where webhooks related to this message will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cc].
     *
     * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<List<Cc>> = cc

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

    /**
     * Returns the raw JSON value of [costBreakdown].
     *
     * Unlike [costBreakdown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_breakdown")
    @ExcludeMissing
    fun _costBreakdown(): JsonField<CostBreakdown> = costBreakdown

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [encoding].
     *
     * Unlike [encoding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encoding") @ExcludeMissing fun _encoding(): JsonField<String> = encoding

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<MessagingError>> = errors

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<From> = from

    /**
     * Returns the raw JSON value of [media].
     *
     * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<Media>> = media

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_profile_id")
    @ExcludeMissing
    fun _messagingProfileId(): JsonField<String> = messagingProfileId

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [parts].
     *
     * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<Long> = parts

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
     * Returns the raw JSON value of [sentAt].
     *
     * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sent_at") @ExcludeMissing fun _sentAt(): JsonField<OffsetDateTime> = sentAt

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
     * Returns the raw JSON value of [tcrCampaignBillable].
     *
     * Unlike [tcrCampaignBillable], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tcr_campaign_billable")
    @ExcludeMissing
    fun _tcrCampaignBillable(): JsonField<Boolean> = tcrCampaignBillable

    /**
     * Returns the raw JSON value of [tcrCampaignId].
     *
     * Unlike [tcrCampaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tcr_campaign_id")
    @ExcludeMissing
    fun _tcrCampaignId(): JsonField<String> = tcrCampaignId

    /**
     * Returns the raw JSON value of [tcrCampaignRegistered].
     *
     * Unlike [tcrCampaignRegistered], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tcr_campaign_registered")
    @ExcludeMissing
    fun _tcrCampaignRegistered(): JsonField<String> = tcrCampaignRegistered

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<List<To>> = to

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [validUntil].
     *
     * Unlike [validUntil], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid_until")
    @ExcludeMissing
    fun _validUntil(): JsonField<OffsetDateTime> = validUntil

    /**
     * Returns the raw JSON value of [webhookFailoverUrl].
     *
     * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_failover_url")
    @ExcludeMissing
    fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_url") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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
         * [MessageCancelScheduledResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageCancelScheduledResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var cc: JsonField<MutableList<Cc>>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var cost: JsonField<Cost> = JsonMissing.of()
        private var costBreakdown: JsonField<CostBreakdown> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var encoding: JsonField<String> = JsonMissing.of()
        private var errors: JsonField<MutableList<MessagingError>>? = null
        private var from: JsonField<From> = JsonMissing.of()
        private var media: JsonField<MutableList<Media>>? = null
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var parts: JsonField<Long> = JsonMissing.of()
        private var receivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var sentAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var tcrCampaignBillable: JsonField<Boolean> = JsonMissing.of()
        private var tcrCampaignId: JsonField<String> = JsonMissing.of()
        private var tcrCampaignRegistered: JsonField<String> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var to: JsonField<MutableList<To>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var validUntil: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageCancelScheduledResponse: MessageCancelScheduledResponse) = apply {
            id = messageCancelScheduledResponse.id
            cc = messageCancelScheduledResponse.cc.map { it.toMutableList() }
            completedAt = messageCancelScheduledResponse.completedAt
            cost = messageCancelScheduledResponse.cost
            costBreakdown = messageCancelScheduledResponse.costBreakdown
            direction = messageCancelScheduledResponse.direction
            encoding = messageCancelScheduledResponse.encoding
            errors = messageCancelScheduledResponse.errors.map { it.toMutableList() }
            from = messageCancelScheduledResponse.from
            media = messageCancelScheduledResponse.media.map { it.toMutableList() }
            messagingProfileId = messageCancelScheduledResponse.messagingProfileId
            organizationId = messageCancelScheduledResponse.organizationId
            parts = messageCancelScheduledResponse.parts
            receivedAt = messageCancelScheduledResponse.receivedAt
            recordType = messageCancelScheduledResponse.recordType
            sentAt = messageCancelScheduledResponse.sentAt
            subject = messageCancelScheduledResponse.subject
            tags = messageCancelScheduledResponse.tags.map { it.toMutableList() }
            tcrCampaignBillable = messageCancelScheduledResponse.tcrCampaignBillable
            tcrCampaignId = messageCancelScheduledResponse.tcrCampaignId
            tcrCampaignRegistered = messageCancelScheduledResponse.tcrCampaignRegistered
            text = messageCancelScheduledResponse.text
            to = messageCancelScheduledResponse.to.map { it.toMutableList() }
            type = messageCancelScheduledResponse.type
            validUntil = messageCancelScheduledResponse.validUntil
            webhookFailoverUrl = messageCancelScheduledResponse.webhookFailoverUrl
            webhookUrl = messageCancelScheduledResponse.webhookUrl
            additionalProperties =
                messageCancelScheduledResponse.additionalProperties.toMutableMap()
        }

        /** Identifies the type of resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun cc(cc: List<Cc>) = cc(JsonField.of(cc))

        /**
         * Sets [Builder.cc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cc] with a well-typed `List<Cc>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cc(cc: JsonField<List<Cc>>) = apply { this.cc = cc.map { it.toMutableList() } }

        /**
         * Adds a single [Cc] to [Builder.cc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCc(cc: Cc) = apply {
            this.cc =
                (this.cc ?: JsonField.of(mutableListOf())).also { checkKnown("cc", it).add(cc) }
        }

        /** ISO 8601 formatted date indicating when the message was finalized. */
        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.getOrNull())

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun cost(cost: Cost?) = cost(JsonField.ofNullable(cost))

        /** Alias for calling [Builder.cost] with `cost.orElse(null)`. */
        fun cost(cost: Optional<Cost>) = cost(cost.getOrNull())

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Cost] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

        /** Detailed breakdown of the message cost components. */
        fun costBreakdown(costBreakdown: CostBreakdown?) =
            costBreakdown(JsonField.ofNullable(costBreakdown))

        /** Alias for calling [Builder.costBreakdown] with `costBreakdown.orElse(null)`. */
        fun costBreakdown(costBreakdown: Optional<CostBreakdown>) =
            costBreakdown(costBreakdown.getOrNull())

        /**
         * Sets [Builder.costBreakdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costBreakdown] with a well-typed [CostBreakdown] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun costBreakdown(costBreakdown: JsonField<CostBreakdown>) = apply {
            this.costBreakdown = costBreakdown
        }

        /**
         * The direction of the message. Inbound messages are sent to you whereas outbound messages
         * are sent from you.
         */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** Encoding scheme used for the message body. */
        fun encoding(encoding: String) = encoding(JsonField.of(encoding))

        /**
         * Sets [Builder.encoding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encoding] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun encoding(encoding: JsonField<String>) = apply { this.encoding = encoding }

        /**
         * These errors may point at addressees when referring to unsuccessful/unconfirmed delivery
         * statuses.
         */
        fun errors(errors: List<MessagingError>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<MessagingError>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun errors(errors: JsonField<List<MessagingError>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [MessagingError] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: MessagingError) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        fun from(from: From) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [From] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<From>) = apply { this.from = from }

        fun media(media: List<Media>) = media(JsonField.of(media))

        /**
         * Sets [Builder.media] to an arbitrary JSON value.
         *
         * You should usually call [Builder.media] with a well-typed `List<Media>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun media(media: JsonField<List<Media>>) = apply {
            this.media = media.map { it.toMutableList() }
        }

        /**
         * Adds a single [Media] to [Builder.media].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMedia(media: Media) = apply {
            this.media =
                (this.media ?: JsonField.of(mutableListOf())).also {
                    checkKnown("media", it).add(media)
                }
        }

        /** Unique identifier for a messaging profile. */
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

        /** The id of the organization the messaging profile belongs to. */
        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        /** Number of parts into which the message's body must be split. */
        fun parts(parts: Long) = parts(JsonField.of(parts))

        /**
         * Sets [Builder.parts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parts] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parts(parts: JsonField<Long>) = apply { this.parts = parts }

        /** ISO 8601 formatted date indicating when the message request was received. */
        fun receivedAt(receivedAt: OffsetDateTime) = receivedAt(JsonField.of(receivedAt))

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

        /** Identifies the type of the resource. */
        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** ISO 8601 formatted date indicating when the message was sent. */
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

        /** Subject of multimedia message */
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

        /** Tags associated with the resource. */
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

        /** Indicates whether the TCR campaign is billable. */
        fun tcrCampaignBillable(tcrCampaignBillable: Boolean) =
            tcrCampaignBillable(JsonField.of(tcrCampaignBillable))

        /**
         * Sets [Builder.tcrCampaignBillable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tcrCampaignBillable] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tcrCampaignBillable(tcrCampaignBillable: JsonField<Boolean>) = apply {
            this.tcrCampaignBillable = tcrCampaignBillable
        }

        /** The Campaign Registry (TCR) campaign ID associated with the message. */
        fun tcrCampaignId(tcrCampaignId: String?) =
            tcrCampaignId(JsonField.ofNullable(tcrCampaignId))

        /** Alias for calling [Builder.tcrCampaignId] with `tcrCampaignId.orElse(null)`. */
        fun tcrCampaignId(tcrCampaignId: Optional<String>) =
            tcrCampaignId(tcrCampaignId.getOrNull())

        /**
         * Sets [Builder.tcrCampaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tcrCampaignId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tcrCampaignId(tcrCampaignId: JsonField<String>) = apply {
            this.tcrCampaignId = tcrCampaignId
        }

        /** The registration status of the TCR campaign. */
        fun tcrCampaignRegistered(tcrCampaignRegistered: String?) =
            tcrCampaignRegistered(JsonField.ofNullable(tcrCampaignRegistered))

        /**
         * Alias for calling [Builder.tcrCampaignRegistered] with
         * `tcrCampaignRegistered.orElse(null)`.
         */
        fun tcrCampaignRegistered(tcrCampaignRegistered: Optional<String>) =
            tcrCampaignRegistered(tcrCampaignRegistered.getOrNull())

        /**
         * Sets [Builder.tcrCampaignRegistered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tcrCampaignRegistered] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tcrCampaignRegistered(tcrCampaignRegistered: JsonField<String>) = apply {
            this.tcrCampaignRegistered = tcrCampaignRegistered
        }

        /**
         * Message body (i.e., content) as a non-empty string.
         *
         * **Required for SMS**
         */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun to(to: List<To>) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed `List<To>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<List<To>>) = apply { this.to = to.map { it.toMutableList() } }

        /**
         * Adds a single [To] to [Builder.to].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTo(to: To) = apply {
            this.to =
                (this.to ?: JsonField.of(mutableListOf())).also { checkKnown("to", it).add(to) }
        }

        /** The type of message. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Message must be out of the queue by this time or else it will be discarded and marked as
         * 'sending_failed'. Once the message moves out of the queue, this field will be nulled
         */
        fun validUntil(validUntil: OffsetDateTime?) = validUntil(JsonField.ofNullable(validUntil))

        /** Alias for calling [Builder.validUntil] with `validUntil.orElse(null)`. */
        fun validUntil(validUntil: Optional<OffsetDateTime>) = validUntil(validUntil.getOrNull())

        /**
         * Sets [Builder.validUntil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validUntil] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validUntil(validUntil: JsonField<OffsetDateTime>) = apply {
            this.validUntil = validUntil
        }

        /**
         * The failover URL where webhooks related to this message will be sent if sending to the
         * primary URL fails.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: String?) =
            webhookFailoverUrl(JsonField.ofNullable(webhookFailoverUrl))

        /**
         * Alias for calling [Builder.webhookFailoverUrl] with `webhookFailoverUrl.orElse(null)`.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: Optional<String>) =
            webhookFailoverUrl(webhookFailoverUrl.getOrNull())

        /**
         * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
            this.webhookFailoverUrl = webhookFailoverUrl
        }

        /** The URL where webhooks related to this message will be sent. */
        fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

        /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
        fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [MessageCancelScheduledResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageCancelScheduledResponse =
            MessageCancelScheduledResponse(
                id,
                (cc ?: JsonMissing.of()).map { it.toImmutable() },
                completedAt,
                cost,
                costBreakdown,
                direction,
                encoding,
                (errors ?: JsonMissing.of()).map { it.toImmutable() },
                from,
                (media ?: JsonMissing.of()).map { it.toImmutable() },
                messagingProfileId,
                organizationId,
                parts,
                receivedAt,
                recordType,
                sentAt,
                subject,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                tcrCampaignBillable,
                tcrCampaignId,
                tcrCampaignRegistered,
                text,
                (to ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                validUntil,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageCancelScheduledResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        cc().ifPresent { it.forEach { it.validate() } }
        completedAt()
        cost().ifPresent { it.validate() }
        costBreakdown().ifPresent { it.validate() }
        direction().ifPresent { it.validate() }
        encoding()
        errors().ifPresent { it.forEach { it.validate() } }
        from().ifPresent { it.validate() }
        media().ifPresent { it.forEach { it.validate() } }
        messagingProfileId()
        organizationId()
        parts()
        receivedAt()
        recordType().ifPresent { it.validate() }
        sentAt()
        subject()
        tags()
        tcrCampaignBillable()
        tcrCampaignId()
        tcrCampaignRegistered()
        text()
        to().ifPresent { it.forEach { it.validate() } }
        type().ifPresent { it.validate() }
        validUntil()
        webhookFailoverUrl()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (cc.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (cost.asKnown().getOrNull()?.validity() ?: 0) +
            (costBreakdown.asKnown().getOrNull()?.validity() ?: 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (encoding.asKnown().isPresent) 1 else 0) +
            (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (from.asKnown().getOrNull()?.validity() ?: 0) +
            (media.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (parts.asKnown().isPresent) 1 else 0) +
            (if (receivedAt.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sentAt.asKnown().isPresent) 1 else 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (tcrCampaignBillable.asKnown().isPresent) 1 else 0) +
            (if (tcrCampaignId.asKnown().isPresent) 1 else 0) +
            (if (tcrCampaignRegistered.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (to.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (validUntil.asKnown().isPresent) 1 else 0) +
            (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    class Cc
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val carrier: JsonField<String>,
        private val lineType: JsonField<LineType>,
        private val phoneNumber: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("carrier") @ExcludeMissing carrier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line_type")
            @ExcludeMissing
            lineType: JsonField<LineType> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(carrier, lineType, phoneNumber, status, mutableMapOf())

        /**
         * The carrier of the receiver.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrier(): Optional<String> = carrier.getOptional("carrier")

        /**
         * The line-type of the receiver.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lineType(): Optional<LineType> = lineType.getOptional("line_type")

        /**
         * Receiving address (+E.164 formatted phone number or short code).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * The delivery status of the message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [carrier].
         *
         * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<String> = carrier

        /**
         * Returns the raw JSON value of [lineType].
         *
         * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line_type") @ExcludeMissing fun _lineType(): JsonField<LineType> = lineType

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [Cc]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cc]. */
        class Builder internal constructor() {

            private var carrier: JsonField<String> = JsonMissing.of()
            private var lineType: JsonField<LineType> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cc: Cc) = apply {
                carrier = cc.carrier
                lineType = cc.lineType
                phoneNumber = cc.phoneNumber
                status = cc.status
                additionalProperties = cc.additionalProperties.toMutableMap()
            }

            /** The carrier of the receiver. */
            fun carrier(carrier: String) = carrier(JsonField.of(carrier))

            /**
             * Sets [Builder.carrier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrier] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

            /** The line-type of the receiver. */
            fun lineType(lineType: LineType) = lineType(JsonField.of(lineType))

            /**
             * Sets [Builder.lineType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineType] with a well-typed [LineType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineType(lineType: JsonField<LineType>) = apply { this.lineType = lineType }

            /** Receiving address (+E.164 formatted phone number or short code). */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** The delivery status of the message. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [Cc].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Cc =
                Cc(carrier, lineType, phoneNumber, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Cc = apply {
            if (validated) {
                return@apply
            }

            carrier()
            lineType().ifPresent { it.validate() }
            phoneNumber()
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
            (if (carrier.asKnown().isPresent) 1 else 0) +
                (lineType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        /** The line-type of the receiver. */
        class LineType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val WIRELINE = of("Wireline")

                @JvmField val WIRELESS = of("Wireless")

                @JvmField val VO_WI_FI = of("VoWiFi")

                @JvmField val VO_IP = of("VoIP")

                @JvmField val PRE_PAID_WIRELESS = of("Pre-Paid Wireless")

                @JvmField val EMPTY = of("")

                @JvmStatic fun of(value: String) = LineType(JsonField.of(value))
            }

            /** An enum containing [LineType]'s known values. */
            enum class Known {
                WIRELINE,
                WIRELESS,
                VO_WI_FI,
                VO_IP,
                PRE_PAID_WIRELESS,
                EMPTY,
            }

            /**
             * An enum containing [LineType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LineType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WIRELINE,
                WIRELESS,
                VO_WI_FI,
                VO_IP,
                PRE_PAID_WIRELESS,
                EMPTY,
                /**
                 * An enum member indicating that [LineType] was instantiated with an unknown value.
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
                    WIRELINE -> Value.WIRELINE
                    WIRELESS -> Value.WIRELESS
                    VO_WI_FI -> Value.VO_WI_FI
                    VO_IP -> Value.VO_IP
                    PRE_PAID_WIRELESS -> Value.PRE_PAID_WIRELESS
                    EMPTY -> Value.EMPTY
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
                    WIRELINE -> Known.WIRELINE
                    WIRELESS -> Known.WIRELESS
                    VO_WI_FI -> Known.VO_WI_FI
                    VO_IP -> Known.VO_IP
                    PRE_PAID_WIRELESS -> Known.PRE_PAID_WIRELESS
                    EMPTY -> Known.EMPTY
                    else -> throw TelnyxInvalidDataException("Unknown LineType: $value")
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

            fun validate(): LineType = apply {
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

                return other is LineType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The delivery status of the message. */
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

                @JvmField val SCHEDULED = of("scheduled")

                @JvmField val QUEUED = of("queued")

                @JvmField val SENDING = of("sending")

                @JvmField val SENT = of("sent")

                @JvmField val CANCELLED = of("cancelled")

                @JvmField val EXPIRED = of("expired")

                @JvmField val SENDING_FAILED = of("sending_failed")

                @JvmField val DELIVERY_UNCONFIRMED = of("delivery_unconfirmed")

                @JvmField val DELIVERED = of("delivered")

                @JvmField val DELIVERY_FAILED = of("delivery_failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                SCHEDULED,
                QUEUED,
                SENDING,
                SENT,
                CANCELLED,
                EXPIRED,
                SENDING_FAILED,
                DELIVERY_UNCONFIRMED,
                DELIVERED,
                DELIVERY_FAILED,
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
                SCHEDULED,
                QUEUED,
                SENDING,
                SENT,
                CANCELLED,
                EXPIRED,
                SENDING_FAILED,
                DELIVERY_UNCONFIRMED,
                DELIVERED,
                DELIVERY_FAILED,
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
                    SCHEDULED -> Value.SCHEDULED
                    QUEUED -> Value.QUEUED
                    SENDING -> Value.SENDING
                    SENT -> Value.SENT
                    CANCELLED -> Value.CANCELLED
                    EXPIRED -> Value.EXPIRED
                    SENDING_FAILED -> Value.SENDING_FAILED
                    DELIVERY_UNCONFIRMED -> Value.DELIVERY_UNCONFIRMED
                    DELIVERED -> Value.DELIVERED
                    DELIVERY_FAILED -> Value.DELIVERY_FAILED
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
                    SCHEDULED -> Known.SCHEDULED
                    QUEUED -> Known.QUEUED
                    SENDING -> Known.SENDING
                    SENT -> Known.SENT
                    CANCELLED -> Known.CANCELLED
                    EXPIRED -> Known.EXPIRED
                    SENDING_FAILED -> Known.SENDING_FAILED
                    DELIVERY_UNCONFIRMED -> Known.DELIVERY_UNCONFIRMED
                    DELIVERED -> Known.DELIVERED
                    DELIVERY_FAILED -> Known.DELIVERY_FAILED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cc &&
                carrier == other.carrier &&
                lineType == other.lineType &&
                phoneNumber == other.phoneNumber &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(carrier, lineType, phoneNumber, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cc{carrier=$carrier, lineType=$lineType, phoneNumber=$phoneNumber, status=$status, additionalProperties=$additionalProperties}"
    }

    class Cost
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val currency: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        ) : this(amount, currency, mutableMapOf())

        /**
         * The amount deducted from your account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * The ISO 4217 currency identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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

            /** Returns a mutable builder for constructing an instance of [Cost]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cost]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cost: Cost) = apply {
                amount = cost.amount
                currency = cost.currency
                additionalProperties = cost.additionalProperties.toMutableMap()
            }

            /** The amount deducted from your account. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The ISO 4217 currency identifier. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
             * Returns an immutable instance of [Cost].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Cost = Cost(amount, currency, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Cost = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cost &&
                amount == other.amount &&
                currency == other.currency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cost{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    /** Detailed breakdown of the message cost components. */
    class CostBreakdown
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val carrierFee: JsonField<CarrierFee>,
        private val rate: JsonField<Rate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("carrier_fee")
            @ExcludeMissing
            carrierFee: JsonField<CarrierFee> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<Rate> = JsonMissing.of(),
        ) : this(carrierFee, rate, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrierFee(): Optional<CarrierFee> = carrierFee.getOptional("carrier_fee")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rate(): Optional<Rate> = rate.getOptional("rate")

        /**
         * Returns the raw JSON value of [carrierFee].
         *
         * Unlike [carrierFee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier_fee")
        @ExcludeMissing
        fun _carrierFee(): JsonField<CarrierFee> = carrierFee

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<Rate> = rate

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

            /** Returns a mutable builder for constructing an instance of [CostBreakdown]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CostBreakdown]. */
        class Builder internal constructor() {

            private var carrierFee: JsonField<CarrierFee> = JsonMissing.of()
            private var rate: JsonField<Rate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(costBreakdown: CostBreakdown) = apply {
                carrierFee = costBreakdown.carrierFee
                rate = costBreakdown.rate
                additionalProperties = costBreakdown.additionalProperties.toMutableMap()
            }

            fun carrierFee(carrierFee: CarrierFee) = carrierFee(JsonField.of(carrierFee))

            /**
             * Sets [Builder.carrierFee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierFee] with a well-typed [CarrierFee] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrierFee(carrierFee: JsonField<CarrierFee>) = apply {
                this.carrierFee = carrierFee
            }

            fun rate(rate: Rate) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [Rate] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<Rate>) = apply { this.rate = rate }

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
             * Returns an immutable instance of [CostBreakdown].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CostBreakdown =
                CostBreakdown(carrierFee, rate, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): CostBreakdown = apply {
            if (validated) {
                return@apply
            }

            carrierFee().ifPresent { it.validate() }
            rate().ifPresent { it.validate() }
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
            (carrierFee.asKnown().getOrNull()?.validity() ?: 0) +
                (rate.asKnown().getOrNull()?.validity() ?: 0)

        class CarrierFee
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * The carrier fee amount.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<String> = amount.getOptional("amount")

            /**
             * The ISO 4217 currency identifier.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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

                /** Returns a mutable builder for constructing an instance of [CarrierFee]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CarrierFee]. */
            class Builder internal constructor() {

                private var amount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(carrierFee: CarrierFee) = apply {
                    amount = carrierFee.amount
                    currency = carrierFee.currency
                    additionalProperties = carrierFee.additionalProperties.toMutableMap()
                }

                /** The carrier fee amount. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The ISO 4217 currency identifier. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                 * Returns an immutable instance of [CarrierFee].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CarrierFee =
                    CarrierFee(amount, currency, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): CarrierFee = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CarrierFee &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CarrierFee{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        class Rate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * The rate amount applied.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<String> = amount.getOptional("amount")

            /**
             * The ISO 4217 currency identifier.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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

                /** Returns a mutable builder for constructing an instance of [Rate]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Rate]. */
            class Builder internal constructor() {

                private var amount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rate: Rate) = apply {
                    amount = rate.amount
                    currency = rate.currency
                    additionalProperties = rate.additionalProperties.toMutableMap()
                }

                /** The rate amount applied. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The ISO 4217 currency identifier. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                 * Returns an immutable instance of [Rate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Rate = Rate(amount, currency, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Rate = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Rate &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rate{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CostBreakdown &&
                carrierFee == other.carrierFee &&
                rate == other.rate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(carrierFee, rate, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CostBreakdown{carrierFee=$carrierFee, rate=$rate, additionalProperties=$additionalProperties}"
    }

    /**
     * The direction of the message. Inbound messages are sent to you whereas outbound messages are
     * sent from you.
     */
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

            @JvmField val OUTBOUND = of("outbound")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            OUTBOUND
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

    class From
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val carrier: JsonField<String>,
        private val lineType: JsonField<LineType>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("carrier") @ExcludeMissing carrier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line_type")
            @ExcludeMissing
            lineType: JsonField<LineType> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(carrier, lineType, phoneNumber, mutableMapOf())

        /**
         * The carrier of the receiver.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrier(): Optional<String> = carrier.getOptional("carrier")

        /**
         * The line-type of the receiver.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lineType(): Optional<LineType> = lineType.getOptional("line_type")

        /**
         * Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Returns the raw JSON value of [carrier].
         *
         * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<String> = carrier

        /**
         * Returns the raw JSON value of [lineType].
         *
         * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line_type") @ExcludeMissing fun _lineType(): JsonField<LineType> = lineType

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [From]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [From]. */
        class Builder internal constructor() {

            private var carrier: JsonField<String> = JsonMissing.of()
            private var lineType: JsonField<LineType> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(from: From) = apply {
                carrier = from.carrier
                lineType = from.lineType
                phoneNumber = from.phoneNumber
                additionalProperties = from.additionalProperties.toMutableMap()
            }

            /** The carrier of the receiver. */
            fun carrier(carrier: String) = carrier(JsonField.of(carrier))

            /**
             * Sets [Builder.carrier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrier] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

            /** The line-type of the receiver. */
            fun lineType(lineType: LineType) = lineType(JsonField.of(lineType))

            /**
             * Sets [Builder.lineType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineType] with a well-typed [LineType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineType(lineType: JsonField<LineType>) = apply { this.lineType = lineType }

            /**
             * Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short
             * code).
             */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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
             * Returns an immutable instance of [From].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): From =
                From(carrier, lineType, phoneNumber, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): From = apply {
            if (validated) {
                return@apply
            }

            carrier()
            lineType().ifPresent { it.validate() }
            phoneNumber()
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
            (if (carrier.asKnown().isPresent) 1 else 0) +
                (lineType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        /** The line-type of the receiver. */
        class LineType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val WIRELINE = of("Wireline")

                @JvmField val WIRELESS = of("Wireless")

                @JvmField val VO_WI_FI = of("VoWiFi")

                @JvmField val VO_IP = of("VoIP")

                @JvmField val PRE_PAID_WIRELESS = of("Pre-Paid Wireless")

                @JvmField val EMPTY = of("")

                @JvmStatic fun of(value: String) = LineType(JsonField.of(value))
            }

            /** An enum containing [LineType]'s known values. */
            enum class Known {
                WIRELINE,
                WIRELESS,
                VO_WI_FI,
                VO_IP,
                PRE_PAID_WIRELESS,
                EMPTY,
            }

            /**
             * An enum containing [LineType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LineType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WIRELINE,
                WIRELESS,
                VO_WI_FI,
                VO_IP,
                PRE_PAID_WIRELESS,
                EMPTY,
                /**
                 * An enum member indicating that [LineType] was instantiated with an unknown value.
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
                    WIRELINE -> Value.WIRELINE
                    WIRELESS -> Value.WIRELESS
                    VO_WI_FI -> Value.VO_WI_FI
                    VO_IP -> Value.VO_IP
                    PRE_PAID_WIRELESS -> Value.PRE_PAID_WIRELESS
                    EMPTY -> Value.EMPTY
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
                    WIRELINE -> Known.WIRELINE
                    WIRELESS -> Known.WIRELESS
                    VO_WI_FI -> Known.VO_WI_FI
                    VO_IP -> Known.VO_IP
                    PRE_PAID_WIRELESS -> Known.PRE_PAID_WIRELESS
                    EMPTY -> Known.EMPTY
                    else -> throw TelnyxInvalidDataException("Unknown LineType: $value")
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

            fun validate(): LineType = apply {
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

                return other is LineType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is From &&
                carrier == other.carrier &&
                lineType == other.lineType &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(carrier, lineType, phoneNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "From{carrier=$carrier, lineType=$lineType, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    class Media
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contentType: JsonField<String>,
        private val sha256: JsonField<String>,
        private val size: JsonField<Long>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sha256") @ExcludeMissing sha256: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(contentType, sha256, size, url, mutableMapOf())

        /**
         * The MIME type of the requested media.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("content_type")

        /**
         * The SHA256 hash of the requested media.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sha256(): Optional<String> = sha256.getOptional("sha256")

        /**
         * The size of the requested media.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun size(): Optional<Long> = size.getOptional("size")

        /**
         * The url of the media requested to be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [sha256].
         *
         * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

        /**
         * Returns the raw JSON value of [size].
         *
         * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

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

            /** Returns a mutable builder for constructing an instance of [Media]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Media]. */
        class Builder internal constructor() {

            private var contentType: JsonField<String> = JsonMissing.of()
            private var sha256: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Long> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(media: Media) = apply {
                contentType = media.contentType
                sha256 = media.sha256
                size = media.size
                url = media.url
                additionalProperties = media.additionalProperties.toMutableMap()
            }

            /** The MIME type of the requested media. */
            fun contentType(contentType: String?) = contentType(JsonField.ofNullable(contentType))

            /** Alias for calling [Builder.contentType] with `contentType.orElse(null)`. */
            fun contentType(contentType: Optional<String>) = contentType(contentType.getOrNull())

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

            /** The SHA256 hash of the requested media. */
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

            /** The size of the requested media. */
            fun size(size: Long?) = size(JsonField.ofNullable(size))

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Long) = size(size as Long?)

            /** Alias for calling [Builder.size] with `size.orElse(null)`. */
            fun size(size: Optional<Long>) = size(size.getOrNull())

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Long>) = apply { this.size = size }

            /** The url of the media requested to be sent. */
            fun url(url: String) = url(JsonField.of(url))

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
             * Returns an immutable instance of [Media].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Media =
                Media(contentType, sha256, size, url, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Media = apply {
            if (validated) {
                return@apply
            }

            contentType()
            sha256()
            size()
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
            (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (sha256.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Media &&
                contentType == other.contentType &&
                sha256 == other.sha256 &&
                size == other.size &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contentType, sha256, size, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Media{contentType=$contentType, sha256=$sha256, size=$size, url=$url, additionalProperties=$additionalProperties}"
    }

    /** Identifies the type of the resource. */
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

            @JvmField val MESSAGE = of("message")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            MESSAGE
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
            MESSAGE,
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
                MESSAGE -> Value.MESSAGE
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
                MESSAGE -> Known.MESSAGE
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

    class To
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val carrier: JsonField<String>,
        private val lineType: JsonField<LineType>,
        private val phoneNumber: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("carrier") @ExcludeMissing carrier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line_type")
            @ExcludeMissing
            lineType: JsonField<LineType> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(carrier, lineType, phoneNumber, status, mutableMapOf())

        /**
         * The carrier of the receiver.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrier(): Optional<String> = carrier.getOptional("carrier")

        /**
         * The line-type of the receiver.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lineType(): Optional<LineType> = lineType.getOptional("line_type")

        /**
         * Receiving address (+E.164 formatted phone number or short code).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * The delivery status of the message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [carrier].
         *
         * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<String> = carrier

        /**
         * Returns the raw JSON value of [lineType].
         *
         * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line_type") @ExcludeMissing fun _lineType(): JsonField<LineType> = lineType

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [To]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [To]. */
        class Builder internal constructor() {

            private var carrier: JsonField<String> = JsonMissing.of()
            private var lineType: JsonField<LineType> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(to: To) = apply {
                carrier = to.carrier
                lineType = to.lineType
                phoneNumber = to.phoneNumber
                status = to.status
                additionalProperties = to.additionalProperties.toMutableMap()
            }

            /** The carrier of the receiver. */
            fun carrier(carrier: String) = carrier(JsonField.of(carrier))

            /**
             * Sets [Builder.carrier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrier] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

            /** The line-type of the receiver. */
            fun lineType(lineType: LineType) = lineType(JsonField.of(lineType))

            /**
             * Sets [Builder.lineType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineType] with a well-typed [LineType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineType(lineType: JsonField<LineType>) = apply { this.lineType = lineType }

            /** Receiving address (+E.164 formatted phone number or short code). */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** The delivery status of the message. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [To].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): To =
                To(carrier, lineType, phoneNumber, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): To = apply {
            if (validated) {
                return@apply
            }

            carrier()
            lineType().ifPresent { it.validate() }
            phoneNumber()
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
            (if (carrier.asKnown().isPresent) 1 else 0) +
                (lineType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        /** The line-type of the receiver. */
        class LineType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val WIRELINE = of("Wireline")

                @JvmField val WIRELESS = of("Wireless")

                @JvmField val VO_WI_FI = of("VoWiFi")

                @JvmField val VO_IP = of("VoIP")

                @JvmField val PRE_PAID_WIRELESS = of("Pre-Paid Wireless")

                @JvmField val EMPTY = of("")

                @JvmStatic fun of(value: String) = LineType(JsonField.of(value))
            }

            /** An enum containing [LineType]'s known values. */
            enum class Known {
                WIRELINE,
                WIRELESS,
                VO_WI_FI,
                VO_IP,
                PRE_PAID_WIRELESS,
                EMPTY,
            }

            /**
             * An enum containing [LineType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LineType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WIRELINE,
                WIRELESS,
                VO_WI_FI,
                VO_IP,
                PRE_PAID_WIRELESS,
                EMPTY,
                /**
                 * An enum member indicating that [LineType] was instantiated with an unknown value.
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
                    WIRELINE -> Value.WIRELINE
                    WIRELESS -> Value.WIRELESS
                    VO_WI_FI -> Value.VO_WI_FI
                    VO_IP -> Value.VO_IP
                    PRE_PAID_WIRELESS -> Value.PRE_PAID_WIRELESS
                    EMPTY -> Value.EMPTY
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
                    WIRELINE -> Known.WIRELINE
                    WIRELESS -> Known.WIRELESS
                    VO_WI_FI -> Known.VO_WI_FI
                    VO_IP -> Known.VO_IP
                    PRE_PAID_WIRELESS -> Known.PRE_PAID_WIRELESS
                    EMPTY -> Known.EMPTY
                    else -> throw TelnyxInvalidDataException("Unknown LineType: $value")
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

            fun validate(): LineType = apply {
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

                return other is LineType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The delivery status of the message. */
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

                @JvmField val SCHEDULED = of("scheduled")

                @JvmField val QUEUED = of("queued")

                @JvmField val SENDING = of("sending")

                @JvmField val SENT = of("sent")

                @JvmField val CANCELLED = of("cancelled")

                @JvmField val EXPIRED = of("expired")

                @JvmField val SENDING_FAILED = of("sending_failed")

                @JvmField val DELIVERY_UNCONFIRMED = of("delivery_unconfirmed")

                @JvmField val DELIVERED = of("delivered")

                @JvmField val DELIVERY_FAILED = of("delivery_failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                SCHEDULED,
                QUEUED,
                SENDING,
                SENT,
                CANCELLED,
                EXPIRED,
                SENDING_FAILED,
                DELIVERY_UNCONFIRMED,
                DELIVERED,
                DELIVERY_FAILED,
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
                SCHEDULED,
                QUEUED,
                SENDING,
                SENT,
                CANCELLED,
                EXPIRED,
                SENDING_FAILED,
                DELIVERY_UNCONFIRMED,
                DELIVERED,
                DELIVERY_FAILED,
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
                    SCHEDULED -> Value.SCHEDULED
                    QUEUED -> Value.QUEUED
                    SENDING -> Value.SENDING
                    SENT -> Value.SENT
                    CANCELLED -> Value.CANCELLED
                    EXPIRED -> Value.EXPIRED
                    SENDING_FAILED -> Value.SENDING_FAILED
                    DELIVERY_UNCONFIRMED -> Value.DELIVERY_UNCONFIRMED
                    DELIVERED -> Value.DELIVERED
                    DELIVERY_FAILED -> Value.DELIVERY_FAILED
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
                    SCHEDULED -> Known.SCHEDULED
                    QUEUED -> Known.QUEUED
                    SENDING -> Known.SENDING
                    SENT -> Known.SENT
                    CANCELLED -> Known.CANCELLED
                    EXPIRED -> Known.EXPIRED
                    SENDING_FAILED -> Known.SENDING_FAILED
                    DELIVERY_UNCONFIRMED -> Known.DELIVERY_UNCONFIRMED
                    DELIVERED -> Known.DELIVERED
                    DELIVERY_FAILED -> Known.DELIVERY_FAILED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is To &&
                carrier == other.carrier &&
                lineType == other.lineType &&
                phoneNumber == other.phoneNumber &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(carrier, lineType, phoneNumber, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "To{carrier=$carrier, lineType=$lineType, phoneNumber=$phoneNumber, status=$status, additionalProperties=$additionalProperties}"
    }

    /** The type of message. */
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

            @JvmField val SMS = of("SMS")

            @JvmField val MMS = of("MMS")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SMS,
            MMS,
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
            SMS,
            MMS,
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
                SMS -> Value.SMS
                MMS -> Value.MMS
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
                SMS -> Known.SMS
                MMS -> Known.MMS
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

        return other is MessageCancelScheduledResponse &&
            id == other.id &&
            cc == other.cc &&
            completedAt == other.completedAt &&
            cost == other.cost &&
            costBreakdown == other.costBreakdown &&
            direction == other.direction &&
            encoding == other.encoding &&
            errors == other.errors &&
            from == other.from &&
            media == other.media &&
            messagingProfileId == other.messagingProfileId &&
            organizationId == other.organizationId &&
            parts == other.parts &&
            receivedAt == other.receivedAt &&
            recordType == other.recordType &&
            sentAt == other.sentAt &&
            subject == other.subject &&
            tags == other.tags &&
            tcrCampaignBillable == other.tcrCampaignBillable &&
            tcrCampaignId == other.tcrCampaignId &&
            tcrCampaignRegistered == other.tcrCampaignRegistered &&
            text == other.text &&
            to == other.to &&
            type == other.type &&
            validUntil == other.validUntil &&
            webhookFailoverUrl == other.webhookFailoverUrl &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cc,
            completedAt,
            cost,
            costBreakdown,
            direction,
            encoding,
            errors,
            from,
            media,
            messagingProfileId,
            organizationId,
            parts,
            receivedAt,
            recordType,
            sentAt,
            subject,
            tags,
            tcrCampaignBillable,
            tcrCampaignId,
            tcrCampaignRegistered,
            text,
            to,
            type,
            validUntil,
            webhookFailoverUrl,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageCancelScheduledResponse{id=$id, cc=$cc, completedAt=$completedAt, cost=$cost, costBreakdown=$costBreakdown, direction=$direction, encoding=$encoding, errors=$errors, from=$from, media=$media, messagingProfileId=$messagingProfileId, organizationId=$organizationId, parts=$parts, receivedAt=$receivedAt, recordType=$recordType, sentAt=$sentAt, subject=$subject, tags=$tags, tcrCampaignBillable=$tcrCampaignBillable, tcrCampaignId=$tcrCampaignId, tcrCampaignRegistered=$tcrCampaignRegistered, text=$text, to=$to, type=$type, validUntil=$validUntil, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
