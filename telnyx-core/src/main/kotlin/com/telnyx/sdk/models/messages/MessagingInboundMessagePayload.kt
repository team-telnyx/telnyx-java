// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

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
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessagingInboundMessagePayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val body: JsonField<Body>,
    private val cc: JsonField<List<Cc>>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val cost: JsonField<Cost>,
    private val costBreakdown: JsonField<CostBreakdown>,
    private val direction: JsonField<Direction>,
    private val encoding: JsonField<String>,
    private val errors: JsonField<List<MessagingError0b38e7044b>>,
    private val from: JsonField<From>,
    private val media: JsonField<List<Media>>,
    private val messagingProfileId: JsonField<String>,
    private val numChars: JsonField<Long>,
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
    private val to: JsonField<To>,
    private val type: JsonField<Type>,
    private val validUntil: JsonField<OffsetDateTime>,
    private val webhookFailoverUrl: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("body") @ExcludeMissing body: JsonField<Body> = JsonMissing.of(),
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
        errors: JsonField<List<MessagingError0b38e7044b>> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<From> = JsonMissing.of(),
        @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_chars") @ExcludeMissing numChars: JsonField<Long> = JsonMissing.of(),
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
        @JsonProperty("to") @ExcludeMissing to: JsonField<To> = JsonMissing.of(),
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
        body,
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
        numChars,
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
     * WhatsApp message body. For message edits and revocations, inspect `type` and the
     * corresponding `edit` or `revoke` object.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun body(): Optional<Body> = body.getOptional("body")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cc(): Optional<List<Cc>> = cc.getOptional("cc")

    /**
     * Not used for inbound messages.
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
    fun errors(): Optional<List<MessagingError0b38e7044b>> = errors.getOptional("errors")

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
     * The number of characters in the message text
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numChars(): Optional<Long> = numChars.getOptional("num_chars")

    /**
     * Unique identifier for a messaging profile.
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
     * Not used for inbound messages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sentAt(): Optional<OffsetDateTime> = sentAt.getOptional("sent_at")

    /**
     * Message subject.
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
     * Receiving address. SMS and MMS webhooks use an array of recipients. WhatsApp webhooks use one
     * E.164 phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<To> = to.getOptional("to")

    /**
     * The messaging channel used for the message.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Not used for inbound messages.
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
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

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
    @JsonProperty("errors")
    @ExcludeMissing
    fun _errors(): JsonField<List<MessagingError0b38e7044b>> = errors

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
     * Returns the raw JSON value of [numChars].
     *
     * Unlike [numChars], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_chars") @ExcludeMissing fun _numChars(): JsonField<Long> = numChars

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
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<To> = to

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
         * [MessagingInboundMessagePayload].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingInboundMessagePayload]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var body: JsonField<Body> = JsonMissing.of()
        private var cc: JsonField<MutableList<Cc>>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var cost: JsonField<Cost> = JsonMissing.of()
        private var costBreakdown: JsonField<CostBreakdown> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var encoding: JsonField<String> = JsonMissing.of()
        private var errors: JsonField<MutableList<MessagingError0b38e7044b>>? = null
        private var from: JsonField<From> = JsonMissing.of()
        private var media: JsonField<MutableList<Media>>? = null
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var numChars: JsonField<Long> = JsonMissing.of()
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
        private var to: JsonField<To> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var validUntil: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messagingInboundMessagePayload: MessagingInboundMessagePayload) = apply {
            id = messagingInboundMessagePayload.id
            body = messagingInboundMessagePayload.body
            cc = messagingInboundMessagePayload.cc.map { it.toMutableList() }
            completedAt = messagingInboundMessagePayload.completedAt
            cost = messagingInboundMessagePayload.cost
            costBreakdown = messagingInboundMessagePayload.costBreakdown
            direction = messagingInboundMessagePayload.direction
            encoding = messagingInboundMessagePayload.encoding
            errors = messagingInboundMessagePayload.errors.map { it.toMutableList() }
            from = messagingInboundMessagePayload.from
            media = messagingInboundMessagePayload.media.map { it.toMutableList() }
            messagingProfileId = messagingInboundMessagePayload.messagingProfileId
            numChars = messagingInboundMessagePayload.numChars
            organizationId = messagingInboundMessagePayload.organizationId
            parts = messagingInboundMessagePayload.parts
            receivedAt = messagingInboundMessagePayload.receivedAt
            recordType = messagingInboundMessagePayload.recordType
            sentAt = messagingInboundMessagePayload.sentAt
            subject = messagingInboundMessagePayload.subject
            tags = messagingInboundMessagePayload.tags.map { it.toMutableList() }
            tcrCampaignBillable = messagingInboundMessagePayload.tcrCampaignBillable
            tcrCampaignId = messagingInboundMessagePayload.tcrCampaignId
            tcrCampaignRegistered = messagingInboundMessagePayload.tcrCampaignRegistered
            text = messagingInboundMessagePayload.text
            to = messagingInboundMessagePayload.to
            type = messagingInboundMessagePayload.type
            validUntil = messagingInboundMessagePayload.validUntil
            webhookFailoverUrl = messagingInboundMessagePayload.webhookFailoverUrl
            webhookUrl = messagingInboundMessagePayload.webhookUrl
            additionalProperties =
                messagingInboundMessagePayload.additionalProperties.toMutableMap()
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

        /**
         * WhatsApp message body. For message edits and revocations, inspect `type` and the
         * corresponding `edit` or `revoke` object.
         */
        fun body(body: Body) = body(JsonField.of(body))

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [Body] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: JsonField<Body>) = apply { this.body = body }

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

        /** Not used for inbound messages. */
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
        fun errors(errors: List<MessagingError0b38e7044b>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed
         * `List<MessagingError0b38e7044b>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun errors(errors: JsonField<List<MessagingError0b38e7044b>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [MessagingError0b38e7044b] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: MessagingError0b38e7044b) = apply {
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

        /** The number of characters in the message text */
        fun numChars(numChars: Long) = numChars(JsonField.of(numChars))

        /**
         * Sets [Builder.numChars] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numChars] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numChars(numChars: JsonField<Long>) = apply { this.numChars = numChars }

        /** Unique identifier for a messaging profile. */
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

        /** Not used for inbound messages. */
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

        /** Message subject. */
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

        /**
         * Receiving address. SMS and MMS webhooks use an array of recipients. WhatsApp webhooks use
         * one E.164 phone number.
         */
        fun to(to: To) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [To] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<To>) = apply { this.to = to }

        /**
         * Alias for calling [to] with
         * `To.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)`.
         */
        fun toOfUnnamedSchemaWithArrayParent0s(
            unnamedSchemaWithArrayParent0s: List<To.UnnamedSchemaWithArrayParent0>
        ) = to(To.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s))

        /** Alias for calling [to] with `To.ofString(string)`. */
        fun to(string: String) = to(To.ofString(string))

        /** The messaging channel used for the message. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Not used for inbound messages. */
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
         * Returns an immutable instance of [MessagingInboundMessagePayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingInboundMessagePayload =
            MessagingInboundMessagePayload(
                id,
                body,
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
                numChars,
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
                to,
                type,
                validUntil,
                webhookFailoverUrl,
                webhookUrl,
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
    fun validate(): MessagingInboundMessagePayload = apply {
        if (validated) {
            return@apply
        }

        id()
        body().ifPresent { it.validate() }
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
        numChars()
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
        to().ifPresent { it.validate() }
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
            (body.asKnown().getOrNull()?.validity() ?: 0) +
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
            (if (numChars.asKnown().isPresent) 1 else 0) +
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
            (to.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (validUntil.asKnown().isPresent) 1 else 0) +
            (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    /**
     * WhatsApp message body. For message edits and revocations, inspect `type` and the
     * corresponding `edit` or `revoke` object.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val edit: JsonField<Edit>,
        private val foreignId: JsonField<String>,
        private val from: JsonField<String>,
        private val revoke: JsonField<Revoke>,
        private val timestamp: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("edit") @ExcludeMissing edit: JsonField<Edit> = JsonMissing.of(),
            @JsonProperty("foreign_id")
            @ExcludeMissing
            foreignId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("revoke") @ExcludeMissing revoke: JsonField<Revoke> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(id, edit, foreignId, from, revoke, timestamp, type, mutableMapOf())

        /**
         * Telnyx identifier for this webhook message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Details for an edited WhatsApp message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun edit(): Optional<Edit> = edit.getOptional("edit")

        /**
         * Meta WhatsApp message identifier for this webhook event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun foreignId(): Optional<String> = foreignId.getOptional("foreign_id")

        /**
         * WhatsApp sender in E.164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<String> = from.getOptional("from")

        /**
         * Details for a revoked WhatsApp message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun revoke(): Optional<Revoke> = revoke.getOptional("revoke")

        /**
         * Unix timestamp supplied by Meta.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

        /**
         * WhatsApp message body type. Edit and revoke events use `edit` and `revoke`, respectively.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [edit].
         *
         * Unlike [edit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("edit") @ExcludeMissing fun _edit(): JsonField<Edit> = edit

        /**
         * Returns the raw JSON value of [foreignId].
         *
         * Unlike [foreignId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("foreign_id") @ExcludeMissing fun _foreignId(): JsonField<String> = foreignId

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [revoke].
         *
         * Unlike [revoke], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("revoke") @ExcludeMissing fun _revoke(): JsonField<Revoke> = revoke

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var edit: JsonField<Edit> = JsonMissing.of()
            private var foreignId: JsonField<String> = JsonMissing.of()
            private var from: JsonField<String> = JsonMissing.of()
            private var revoke: JsonField<Revoke> = JsonMissing.of()
            private var timestamp: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                edit = body.edit
                foreignId = body.foreignId
                from = body.from
                revoke = body.revoke
                timestamp = body.timestamp
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Telnyx identifier for this webhook message. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Details for an edited WhatsApp message. */
            fun edit(edit: Edit) = edit(JsonField.of(edit))

            /**
             * Sets [Builder.edit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.edit] with a well-typed [Edit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun edit(edit: JsonField<Edit>) = apply { this.edit = edit }

            /** Meta WhatsApp message identifier for this webhook event. */
            fun foreignId(foreignId: String) = foreignId(JsonField.of(foreignId))

            /**
             * Sets [Builder.foreignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun foreignId(foreignId: JsonField<String>) = apply { this.foreignId = foreignId }

            /** WhatsApp sender in E.164 format. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /** Details for a revoked WhatsApp message. */
            fun revoke(revoke: Revoke) = revoke(JsonField.of(revoke))

            /**
             * Sets [Builder.revoke] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revoke] with a well-typed [Revoke] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun revoke(revoke: JsonField<Revoke>) = apply { this.revoke = revoke }

            /** Unix timestamp supplied by Meta. */
            fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

            /**
             * WhatsApp message body type. Edit and revoke events use `edit` and `revoke`,
             * respectively.
             */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
                    id,
                    edit,
                    foreignId,
                    from,
                    revoke,
                    timestamp,
                    type,
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

            id()
            edit().ifPresent { it.validate() }
            foreignId()
            from()
            revoke().ifPresent { it.validate() }
            timestamp()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (edit.asKnown().getOrNull()?.validity() ?: 0) +
                (if (foreignId.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (revoke.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        /** Details for an edited WhatsApp message. */
        class Edit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val message: JsonField<Message>,
            private val originalMessageId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<Message> = JsonMissing.of(),
                @JsonProperty("original_message_id")
                @ExcludeMissing
                originalMessageId: JsonField<String> = JsonMissing.of(),
            ) : this(message, originalMessageId, mutableMapOf())

            /**
             * Replacement WhatsApp message content. Its shape depends on the message type.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): Message = message.getRequired("message")

            /**
             * Telnyx message ID when a mapping exists, otherwise the original Meta WhatsApp message
             * ID. Treat this value as opaque.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun originalMessageId(): String = originalMessageId.getRequired("original_message_id")

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

            /**
             * Returns the raw JSON value of [originalMessageId].
             *
             * Unlike [originalMessageId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("original_message_id")
            @ExcludeMissing
            fun _originalMessageId(): JsonField<String> = originalMessageId

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
                 * Returns a mutable builder for constructing an instance of [Edit].
                 *
                 * The following fields are required:
                 * ```java
                 * .message()
                 * .originalMessageId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Edit]. */
            class Builder internal constructor() {

                private var message: JsonField<Message>? = null
                private var originalMessageId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(edit: Edit) = apply {
                    message = edit.message
                    originalMessageId = edit.originalMessageId
                    additionalProperties = edit.additionalProperties.toMutableMap()
                }

                /** Replacement WhatsApp message content. Its shape depends on the message type. */
                fun message(message: Message) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [Message] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<Message>) = apply { this.message = message }

                /**
                 * Telnyx message ID when a mapping exists, otherwise the original Meta WhatsApp
                 * message ID. Treat this value as opaque.
                 */
                fun originalMessageId(originalMessageId: String) =
                    originalMessageId(JsonField.of(originalMessageId))

                /**
                 * Sets [Builder.originalMessageId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originalMessageId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originalMessageId(originalMessageId: JsonField<String>) = apply {
                    this.originalMessageId = originalMessageId
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
                 * Returns an immutable instance of [Edit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .message()
                 * .originalMessageId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Edit =
                    Edit(
                        checkRequired("message", message),
                        checkRequired("originalMessageId", originalMessageId),
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
            fun validate(): Edit = apply {
                if (validated) {
                    return@apply
                }

                message().validate()
                originalMessageId()
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
                (message.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (originalMessageId.asKnown().isPresent) 1 else 0)

            /** Replacement WhatsApp message content. Its shape depends on the message type. */
            class Message
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

                    /** Returns a mutable builder for constructing an instance of [Message]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(message: Message) = apply {
                        additionalProperties = message.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Message = Message(additionalProperties.toImmutable())
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
                fun validate(): Message = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Message && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Message{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Edit &&
                    message == other.message &&
                    originalMessageId == other.originalMessageId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(message, originalMessageId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Edit{message=$message, originalMessageId=$originalMessageId, additionalProperties=$additionalProperties}"
        }

        /** Details for a revoked WhatsApp message. */
        class Revoke
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val originalMessageId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("original_message_id")
                @ExcludeMissing
                originalMessageId: JsonField<String> = JsonMissing.of()
            ) : this(originalMessageId, mutableMapOf())

            /**
             * Telnyx message ID when a mapping exists, otherwise the original Meta WhatsApp message
             * ID. Treat this value as opaque.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun originalMessageId(): String = originalMessageId.getRequired("original_message_id")

            /**
             * Returns the raw JSON value of [originalMessageId].
             *
             * Unlike [originalMessageId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("original_message_id")
            @ExcludeMissing
            fun _originalMessageId(): JsonField<String> = originalMessageId

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
                 * Returns a mutable builder for constructing an instance of [Revoke].
                 *
                 * The following fields are required:
                 * ```java
                 * .originalMessageId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Revoke]. */
            class Builder internal constructor() {

                private var originalMessageId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(revoke: Revoke) = apply {
                    originalMessageId = revoke.originalMessageId
                    additionalProperties = revoke.additionalProperties.toMutableMap()
                }

                /**
                 * Telnyx message ID when a mapping exists, otherwise the original Meta WhatsApp
                 * message ID. Treat this value as opaque.
                 */
                fun originalMessageId(originalMessageId: String) =
                    originalMessageId(JsonField.of(originalMessageId))

                /**
                 * Sets [Builder.originalMessageId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originalMessageId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originalMessageId(originalMessageId: JsonField<String>) = apply {
                    this.originalMessageId = originalMessageId
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
                 * Returns an immutable instance of [Revoke].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .originalMessageId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Revoke =
                    Revoke(
                        checkRequired("originalMessageId", originalMessageId),
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
            fun validate(): Revoke = apply {
                if (validated) {
                    return@apply
                }

                originalMessageId()
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
            internal fun validity(): Int = (if (originalMessageId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Revoke &&
                    originalMessageId == other.originalMessageId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(originalMessageId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Revoke{originalMessageId=$originalMessageId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                edit == other.edit &&
                foreignId == other.foreignId &&
                from == other.from &&
                revoke == other.revoke &&
                timestamp == other.timestamp &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, edit, foreignId, from, revoke, timestamp, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, edit=$edit, foreignId=$foreignId, from=$from, revoke=$revoke, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
    }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

                @JvmField val QUEUED = of("queued")

                @JvmField val SENDING = of("sending")

                @JvmField val SENT = of("sent")

                @JvmField val DELIVERED = of("delivered")

                @JvmField val SENDING_FAILED = of("sending_failed")

                @JvmField val DELIVERY_FAILED = of("delivery_failed")

                @JvmField val DELIVERY_UNCONFIRMED = of("delivery_unconfirmed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                QUEUED,
                SENDING,
                SENT,
                DELIVERED,
                SENDING_FAILED,
                DELIVERY_FAILED,
                DELIVERY_UNCONFIRMED,
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
                QUEUED,
                SENDING,
                SENT,
                DELIVERED,
                SENDING_FAILED,
                DELIVERY_FAILED,
                DELIVERY_UNCONFIRMED,
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
                    QUEUED -> Value.QUEUED
                    SENDING -> Value.SENDING
                    SENT -> Value.SENT
                    DELIVERED -> Value.DELIVERED
                    SENDING_FAILED -> Value.SENDING_FAILED
                    DELIVERY_FAILED -> Value.DELIVERY_FAILED
                    DELIVERY_UNCONFIRMED -> Value.DELIVERY_UNCONFIRMED
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
                    QUEUED -> Known.QUEUED
                    SENDING -> Known.SENDING
                    SENT -> Known.SENT
                    DELIVERED -> Known.DELIVERED
                    SENDING_FAILED -> Known.SENDING_FAILED
                    DELIVERY_FAILED -> Known.DELIVERY_FAILED
                    DELIVERY_UNCONFIRMED -> Known.DELIVERY_UNCONFIRMED
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
            fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<String>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The ISO 4217 currency identifier. */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
            fun currency(currency: Optional<String>) = currency(currency.getOrNull())

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

            @JvmField val INBOUND = of("inbound")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            INBOUND
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

    class From
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
         * The carrier of the sender.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrier(): Optional<String> = carrier.getOptional("carrier")

        /**
         * The line-type of the sender.
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

            /** Returns a mutable builder for constructing an instance of [From]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [From]. */
        class Builder internal constructor() {

            private var carrier: JsonField<String> = JsonMissing.of()
            private var lineType: JsonField<LineType> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(from: From) = apply {
                carrier = from.carrier
                lineType = from.lineType
                phoneNumber = from.phoneNumber
                status = from.status
                additionalProperties = from.additionalProperties.toMutableMap()
            }

            /** The carrier of the sender. */
            fun carrier(carrier: String) = carrier(JsonField.of(carrier))

            /**
             * Sets [Builder.carrier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrier] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

            /** The line-type of the sender. */
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
             * Returns an immutable instance of [From].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): From =
                From(carrier, lineType, phoneNumber, status, additionalProperties.toMutableMap())
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
        fun validate(): From = apply {
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

        /** The line-type of the sender. */
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

                @JvmField val RECEIVED = of("received")

                @JvmField val DELIVERED = of("delivered")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RECEIVED,
                DELIVERED,
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
                RECEIVED,
                DELIVERED,
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
                    RECEIVED -> Value.RECEIVED
                    DELIVERED -> Value.DELIVERED
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
                    RECEIVED -> Known.RECEIVED
                    DELIVERED -> Known.DELIVERED
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

            return other is From &&
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
            "From{carrier=$carrier, lineType=$lineType, phoneNumber=$phoneNumber, status=$status, additionalProperties=$additionalProperties}"
    }

    class Media
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contentType: JsonField<String>,
        private val hashSha256: JsonField<String>,
        private val size: JsonField<Long>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hash_sha256")
            @ExcludeMissing
            hashSha256: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(contentType, hashSha256, size, url, mutableMapOf())

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
        fun hashSha256(): Optional<String> = hashSha256.getOptional("hash_sha256")

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
         * Returns the raw JSON value of [hashSha256].
         *
         * Unlike [hashSha256], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hash_sha256")
        @ExcludeMissing
        fun _hashSha256(): JsonField<String> = hashSha256

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
            private var hashSha256: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Long> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(media: Media) = apply {
                contentType = media.contentType
                hashSha256 = media.hashSha256
                size = media.size
                url = media.url
                additionalProperties = media.additionalProperties.toMutableMap()
            }

            /** The MIME type of the requested media. */
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

            /** The SHA256 hash of the requested media. */
            fun hashSha256(hashSha256: String) = hashSha256(JsonField.of(hashSha256))

            /**
             * Sets [Builder.hashSha256] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hashSha256] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hashSha256(hashSha256: JsonField<String>) = apply { this.hashSha256 = hashSha256 }

            /** The size of the requested media. */
            fun size(size: Long) = size(JsonField.of(size))

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
                Media(contentType, hashSha256, size, url, additionalProperties.toMutableMap())
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
        fun validate(): Media = apply {
            if (validated) {
                return@apply
            }

            contentType()
            hashSha256()
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
                (if (hashSha256.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Media &&
                contentType == other.contentType &&
                hashSha256 == other.hashSha256 &&
                size == other.size &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contentType, hashSha256, size, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Media{contentType=$contentType, hashSha256=$hashSha256, size=$size, url=$url, additionalProperties=$additionalProperties}"
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
     * Receiving address. SMS and MMS webhooks use an array of recipients. WhatsApp webhooks use one
     * E.164 phone number.
     */
    @JsonDeserialize(using = To.Deserializer::class)
    @JsonSerialize(using = To.Serializer::class)
    class To
    private constructor(
        private val unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unnamedSchemaWithArrayParent0s(): Optional<List<UnnamedSchemaWithArrayParent0>> =
            Optional.ofNullable(unnamedSchemaWithArrayParent0s)

        /** WhatsApp receiving address in E.164 format. */
        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isUnnamedSchemaWithArrayParent0s(): Boolean = unnamedSchemaWithArrayParent0s != null

        fun isString(): Boolean = string != null

        fun asUnnamedSchemaWithArrayParent0s(): List<UnnamedSchemaWithArrayParent0> =
            unnamedSchemaWithArrayParent0s.getOrThrow("unnamedSchemaWithArrayParent0s")

        /** WhatsApp receiving address in E.164 format. */
        fun asString(): String = string.getOrThrow("string")

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
         *     public Optional<String> visitUnnamedSchemaWithArrayParent0s(List<UnnamedSchemaWithArrayParent0> unnamedSchemaWithArrayParent0s) {
         *         return Optional.of(unnamedSchemaWithArrayParent0s.toString());
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
                unnamedSchemaWithArrayParent0s != null ->
                    visitor.visitUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)
                string != null -> visitor.visitString(string)
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
                    override fun visitUnnamedSchemaWithArrayParent0s(
                        unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                    ) {
                        unnamedSchemaWithArrayParent0s.forEach { it.validate() }
                    }

                    override fun visitString(string: String) {}
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
                    override fun visitUnnamedSchemaWithArrayParent0s(
                        unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                    ) = unnamedSchemaWithArrayParent0s.sumOf { it.validity().toInt() }

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is To &&
                unnamedSchemaWithArrayParent0s == other.unnamedSchemaWithArrayParent0s &&
                string == other.string
        }

        override fun hashCode(): Int = Objects.hash(unnamedSchemaWithArrayParent0s, string)

        override fun toString(): String =
            when {
                unnamedSchemaWithArrayParent0s != null ->
                    "To{unnamedSchemaWithArrayParent0s=$unnamedSchemaWithArrayParent0s}"
                string != null -> "To{string=$string}"
                _json != null -> "To{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid To")
            }

        companion object {

            @JvmStatic
            fun ofUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
            ) = To(unnamedSchemaWithArrayParent0s = unnamedSchemaWithArrayParent0s.toImmutable())

            /** WhatsApp receiving address in E.164 format. */
            @JvmStatic fun ofString(string: String) = To(string = string)
        }

        /** An interface that defines how to map each variant of [To] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
            ): T

            /** WhatsApp receiving address in E.164 format. */
            fun visitString(string: String): T

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
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                To(string = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<UnnamedSchemaWithArrayParent0>>(),
                                )
                                ?.let { To(unnamedSchemaWithArrayParent0s = it, _json = json) },
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
                    value.unnamedSchemaWithArrayParent0s != null ->
                        generator.writeObject(value.unnamedSchemaWithArrayParent0s)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid To")
                }
            }
        }

        class UnnamedSchemaWithArrayParent0
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
                @JsonProperty("carrier")
                @ExcludeMissing
                carrier: JsonField<String> = JsonMissing.of(),
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun carrier(): Optional<String> = carrier.getOptional("carrier")

            /**
             * The line-type of the receiver.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lineType(): Optional<LineType> = lineType.getOptional("line_type")

            /**
             * Receiving address (+E.164 formatted phone number or short code).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("line_type")
            @ExcludeMissing
            fun _lineType(): JsonField<LineType> = lineType

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [UnnamedSchemaWithArrayParent0].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnnamedSchemaWithArrayParent0]. */
            class Builder internal constructor() {

                private var carrier: JsonField<String> = JsonMissing.of()
                private var lineType: JsonField<LineType> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unnamedSchemaWithArrayParent0: UnnamedSchemaWithArrayParent0) =
                    apply {
                        carrier = unnamedSchemaWithArrayParent0.carrier
                        lineType = unnamedSchemaWithArrayParent0.lineType
                        phoneNumber = unnamedSchemaWithArrayParent0.phoneNumber
                        status = unnamedSchemaWithArrayParent0.status
                        additionalProperties =
                            unnamedSchemaWithArrayParent0.additionalProperties.toMutableMap()
                    }

                /** The carrier of the receiver. */
                fun carrier(carrier: String) = carrier(JsonField.of(carrier))

                /**
                 * Sets [Builder.carrier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.carrier] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

                /** The line-type of the receiver. */
                fun lineType(lineType: LineType) = lineType(JsonField.of(lineType))

                /**
                 * Sets [Builder.lineType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lineType] with a well-typed [LineType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lineType(lineType: JsonField<LineType>) = apply { this.lineType = lineType }

                /** Receiving address (+E.164 formatted phone number or short code). */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
                 * Returns an immutable instance of [UnnamedSchemaWithArrayParent0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnnamedSchemaWithArrayParent0 =
                    UnnamedSchemaWithArrayParent0(
                        carrier,
                        lineType,
                        phoneNumber,
                        status,
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
            fun validate(): UnnamedSchemaWithArrayParent0 = apply {
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [LineType] was instantiated with an unknown
                     * value.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val QUEUED = of("queued")

                    @JvmField val SENDING = of("sending")

                    @JvmField val SENT = of("sent")

                    @JvmField val DELIVERED = of("delivered")

                    @JvmField val SENDING_FAILED = of("sending_failed")

                    @JvmField val DELIVERY_FAILED = of("delivery_failed")

                    @JvmField val DELIVERY_UNCONFIRMED = of("delivery_unconfirmed")

                    @JvmField val WEBHOOK_DELIVERED = of("webhook_delivered")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    QUEUED,
                    SENDING,
                    SENT,
                    DELIVERED,
                    SENDING_FAILED,
                    DELIVERY_FAILED,
                    DELIVERY_UNCONFIRMED,
                    WEBHOOK_DELIVERED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    QUEUED,
                    SENDING,
                    SENT,
                    DELIVERED,
                    SENDING_FAILED,
                    DELIVERY_FAILED,
                    DELIVERY_UNCONFIRMED,
                    WEBHOOK_DELIVERED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
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
                        QUEUED -> Value.QUEUED
                        SENDING -> Value.SENDING
                        SENT -> Value.SENT
                        DELIVERED -> Value.DELIVERED
                        SENDING_FAILED -> Value.SENDING_FAILED
                        DELIVERY_FAILED -> Value.DELIVERY_FAILED
                        DELIVERY_UNCONFIRMED -> Value.DELIVERY_UNCONFIRMED
                        WEBHOOK_DELIVERED -> Value.WEBHOOK_DELIVERED
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
                        QUEUED -> Known.QUEUED
                        SENDING -> Known.SENDING
                        SENT -> Known.SENT
                        DELIVERED -> Known.DELIVERED
                        SENDING_FAILED -> Known.SENDING_FAILED
                        DELIVERY_FAILED -> Known.DELIVERY_FAILED
                        DELIVERY_UNCONFIRMED -> Known.DELIVERY_UNCONFIRMED
                        WEBHOOK_DELIVERED -> Known.WEBHOOK_DELIVERED
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

                return other is UnnamedSchemaWithArrayParent0 &&
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
                "UnnamedSchemaWithArrayParent0{carrier=$carrier, lineType=$lineType, phoneNumber=$phoneNumber, status=$status, additionalProperties=$additionalProperties}"
        }
    }

    /** The messaging channel used for the message. */
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

            @JvmField val WHATSAPP = of("WHATSAPP")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SMS,
            MMS,
            WHATSAPP,
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
                SMS -> Value.SMS
                MMS -> Value.MMS
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
                SMS -> Known.SMS
                MMS -> Known.MMS
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

        return other is MessagingInboundMessagePayload &&
            id == other.id &&
            body == other.body &&
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
            numChars == other.numChars &&
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
            body,
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
            numChars,
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
        "MessagingInboundMessagePayload{id=$id, body=$body, cc=$cc, completedAt=$completedAt, cost=$cost, costBreakdown=$costBreakdown, direction=$direction, encoding=$encoding, errors=$errors, from=$from, media=$media, messagingProfileId=$messagingProfileId, numChars=$numChars, organizationId=$organizationId, parts=$parts, receivedAt=$receivedAt, recordType=$recordType, sentAt=$sentAt, subject=$subject, tags=$tags, tcrCampaignBillable=$tcrCampaignBillable, tcrCampaignId=$tcrCampaignId, tcrCampaignRegistered=$tcrCampaignRegistered, text=$text, to=$to, type=$type, validUntil=$validUntil, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
