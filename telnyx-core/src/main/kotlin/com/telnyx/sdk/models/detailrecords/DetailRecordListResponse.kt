// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.detailrecords

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

/**
 * An object following one of the schemas published in
 * https://developers.telnyx.com/docs/api/v2/detail-records
 */
@JsonDeserialize(using = DetailRecordListResponse.Deserializer::class)
@JsonSerialize(using = DetailRecordListResponse.Serializer::class)
class DetailRecordListResponse
private constructor(
    private val messageDetailRecord: MessageDetailRecord? = null,
    private val conferenceDetailRecord: ConferenceDetailRecord? = null,
    private val conferenceParticipantDetailRecord: ConferenceParticipantDetailRecord? = null,
    private val amdDetailRecord: AmdDetailRecord? = null,
    private val verifyDetailRecord: VerifyDetailRecord? = null,
    private val simCardUsageDetailRecord: SimCardUsageDetailRecord? = null,
    private val mediaStorageDetailRecord: MediaStorageDetailRecord? = null,
    private val _json: JsonValue? = null,
) {

    fun messageDetailRecord(): Optional<MessageDetailRecord> =
        Optional.ofNullable(messageDetailRecord)

    fun conferenceDetailRecord(): Optional<ConferenceDetailRecord> =
        Optional.ofNullable(conferenceDetailRecord)

    fun conferenceParticipantDetailRecord(): Optional<ConferenceParticipantDetailRecord> =
        Optional.ofNullable(conferenceParticipantDetailRecord)

    fun amdDetailRecord(): Optional<AmdDetailRecord> = Optional.ofNullable(amdDetailRecord)

    fun verifyDetailRecord(): Optional<VerifyDetailRecord> = Optional.ofNullable(verifyDetailRecord)

    fun simCardUsageDetailRecord(): Optional<SimCardUsageDetailRecord> =
        Optional.ofNullable(simCardUsageDetailRecord)

    fun mediaStorageDetailRecord(): Optional<MediaStorageDetailRecord> =
        Optional.ofNullable(mediaStorageDetailRecord)

    fun isMessageDetailRecord(): Boolean = messageDetailRecord != null

    fun isConferenceDetailRecord(): Boolean = conferenceDetailRecord != null

    fun isConferenceParticipantDetailRecord(): Boolean = conferenceParticipantDetailRecord != null

    fun isAmdDetailRecord(): Boolean = amdDetailRecord != null

    fun isVerifyDetailRecord(): Boolean = verifyDetailRecord != null

    fun isSimCardUsageDetailRecord(): Boolean = simCardUsageDetailRecord != null

    fun isMediaStorageDetailRecord(): Boolean = mediaStorageDetailRecord != null

    fun asMessageDetailRecord(): MessageDetailRecord =
        messageDetailRecord.getOrThrow("messageDetailRecord")

    fun asConferenceDetailRecord(): ConferenceDetailRecord =
        conferenceDetailRecord.getOrThrow("conferenceDetailRecord")

    fun asConferenceParticipantDetailRecord(): ConferenceParticipantDetailRecord =
        conferenceParticipantDetailRecord.getOrThrow("conferenceParticipantDetailRecord")

    fun asAmdDetailRecord(): AmdDetailRecord = amdDetailRecord.getOrThrow("amdDetailRecord")

    fun asVerifyDetailRecord(): VerifyDetailRecord =
        verifyDetailRecord.getOrThrow("verifyDetailRecord")

    fun asSimCardUsageDetailRecord(): SimCardUsageDetailRecord =
        simCardUsageDetailRecord.getOrThrow("simCardUsageDetailRecord")

    fun asMediaStorageDetailRecord(): MediaStorageDetailRecord =
        mediaStorageDetailRecord.getOrThrow("mediaStorageDetailRecord")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            messageDetailRecord != null -> visitor.visitMessageDetailRecord(messageDetailRecord)
            conferenceDetailRecord != null ->
                visitor.visitConferenceDetailRecord(conferenceDetailRecord)
            conferenceParticipantDetailRecord != null ->
                visitor.visitConferenceParticipantDetailRecord(conferenceParticipantDetailRecord)
            amdDetailRecord != null -> visitor.visitAmdDetailRecord(amdDetailRecord)
            verifyDetailRecord != null -> visitor.visitVerifyDetailRecord(verifyDetailRecord)
            simCardUsageDetailRecord != null ->
                visitor.visitSimCardUsageDetailRecord(simCardUsageDetailRecord)
            mediaStorageDetailRecord != null ->
                visitor.visitMediaStorageDetailRecord(mediaStorageDetailRecord)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): DetailRecordListResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitMessageDetailRecord(messageDetailRecord: MessageDetailRecord) {
                    messageDetailRecord.validate()
                }

                override fun visitConferenceDetailRecord(
                    conferenceDetailRecord: ConferenceDetailRecord
                ) {
                    conferenceDetailRecord.validate()
                }

                override fun visitConferenceParticipantDetailRecord(
                    conferenceParticipantDetailRecord: ConferenceParticipantDetailRecord
                ) {
                    conferenceParticipantDetailRecord.validate()
                }

                override fun visitAmdDetailRecord(amdDetailRecord: AmdDetailRecord) {
                    amdDetailRecord.validate()
                }

                override fun visitVerifyDetailRecord(verifyDetailRecord: VerifyDetailRecord) {
                    verifyDetailRecord.validate()
                }

                override fun visitSimCardUsageDetailRecord(
                    simCardUsageDetailRecord: SimCardUsageDetailRecord
                ) {
                    simCardUsageDetailRecord.validate()
                }

                override fun visitMediaStorageDetailRecord(
                    mediaStorageDetailRecord: MediaStorageDetailRecord
                ) {
                    mediaStorageDetailRecord.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitMessageDetailRecord(messageDetailRecord: MessageDetailRecord) =
                    messageDetailRecord.validity()

                override fun visitConferenceDetailRecord(
                    conferenceDetailRecord: ConferenceDetailRecord
                ) = conferenceDetailRecord.validity()

                override fun visitConferenceParticipantDetailRecord(
                    conferenceParticipantDetailRecord: ConferenceParticipantDetailRecord
                ) = conferenceParticipantDetailRecord.validity()

                override fun visitAmdDetailRecord(amdDetailRecord: AmdDetailRecord) =
                    amdDetailRecord.validity()

                override fun visitVerifyDetailRecord(verifyDetailRecord: VerifyDetailRecord) =
                    verifyDetailRecord.validity()

                override fun visitSimCardUsageDetailRecord(
                    simCardUsageDetailRecord: SimCardUsageDetailRecord
                ) = simCardUsageDetailRecord.validity()

                override fun visitMediaStorageDetailRecord(
                    mediaStorageDetailRecord: MediaStorageDetailRecord
                ) = mediaStorageDetailRecord.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetailRecordListResponse &&
            messageDetailRecord == other.messageDetailRecord &&
            conferenceDetailRecord == other.conferenceDetailRecord &&
            conferenceParticipantDetailRecord == other.conferenceParticipantDetailRecord &&
            amdDetailRecord == other.amdDetailRecord &&
            verifyDetailRecord == other.verifyDetailRecord &&
            simCardUsageDetailRecord == other.simCardUsageDetailRecord &&
            mediaStorageDetailRecord == other.mediaStorageDetailRecord
    }

    override fun hashCode(): Int =
        Objects.hash(
            messageDetailRecord,
            conferenceDetailRecord,
            conferenceParticipantDetailRecord,
            amdDetailRecord,
            verifyDetailRecord,
            simCardUsageDetailRecord,
            mediaStorageDetailRecord,
        )

    override fun toString(): String =
        when {
            messageDetailRecord != null ->
                "DetailRecordListResponse{messageDetailRecord=$messageDetailRecord}"
            conferenceDetailRecord != null ->
                "DetailRecordListResponse{conferenceDetailRecord=$conferenceDetailRecord}"
            conferenceParticipantDetailRecord != null ->
                "DetailRecordListResponse{conferenceParticipantDetailRecord=$conferenceParticipantDetailRecord}"
            amdDetailRecord != null -> "DetailRecordListResponse{amdDetailRecord=$amdDetailRecord}"
            verifyDetailRecord != null ->
                "DetailRecordListResponse{verifyDetailRecord=$verifyDetailRecord}"
            simCardUsageDetailRecord != null ->
                "DetailRecordListResponse{simCardUsageDetailRecord=$simCardUsageDetailRecord}"
            mediaStorageDetailRecord != null ->
                "DetailRecordListResponse{mediaStorageDetailRecord=$mediaStorageDetailRecord}"
            _json != null -> "DetailRecordListResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DetailRecordListResponse")
        }

    companion object {

        @JvmStatic
        fun ofMessageDetailRecord(messageDetailRecord: MessageDetailRecord) =
            DetailRecordListResponse(messageDetailRecord = messageDetailRecord)

        @JvmStatic
        fun ofConferenceDetailRecord(conferenceDetailRecord: ConferenceDetailRecord) =
            DetailRecordListResponse(conferenceDetailRecord = conferenceDetailRecord)

        @JvmStatic
        fun ofConferenceParticipantDetailRecord(
            conferenceParticipantDetailRecord: ConferenceParticipantDetailRecord
        ) =
            DetailRecordListResponse(
                conferenceParticipantDetailRecord = conferenceParticipantDetailRecord
            )

        @JvmStatic
        fun ofAmdDetailRecord(amdDetailRecord: AmdDetailRecord) =
            DetailRecordListResponse(amdDetailRecord = amdDetailRecord)

        @JvmStatic
        fun ofVerifyDetailRecord(verifyDetailRecord: VerifyDetailRecord) =
            DetailRecordListResponse(verifyDetailRecord = verifyDetailRecord)

        @JvmStatic
        fun ofSimCardUsageDetailRecord(simCardUsageDetailRecord: SimCardUsageDetailRecord) =
            DetailRecordListResponse(simCardUsageDetailRecord = simCardUsageDetailRecord)

        @JvmStatic
        fun ofMediaStorageDetailRecord(mediaStorageDetailRecord: MediaStorageDetailRecord) =
            DetailRecordListResponse(mediaStorageDetailRecord = mediaStorageDetailRecord)
    }

    /**
     * An interface that defines how to map each variant of [DetailRecordListResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitMessageDetailRecord(messageDetailRecord: MessageDetailRecord): T

        fun visitConferenceDetailRecord(conferenceDetailRecord: ConferenceDetailRecord): T

        fun visitConferenceParticipantDetailRecord(
            conferenceParticipantDetailRecord: ConferenceParticipantDetailRecord
        ): T

        fun visitAmdDetailRecord(amdDetailRecord: AmdDetailRecord): T

        fun visitVerifyDetailRecord(verifyDetailRecord: VerifyDetailRecord): T

        fun visitSimCardUsageDetailRecord(simCardUsageDetailRecord: SimCardUsageDetailRecord): T

        fun visitMediaStorageDetailRecord(mediaStorageDetailRecord: MediaStorageDetailRecord): T

        /**
         * Maps an unknown variant of [DetailRecordListResponse] to a value of type [T].
         *
         * An instance of [DetailRecordListResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown DetailRecordListResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DetailRecordListResponse>(DetailRecordListResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): DetailRecordListResponse {
            val json = JsonValue.fromJsonNode(node)
            val recordType =
                json.asObject().getOrNull()?.get("record_type")?.asString()?.getOrNull()

            when (recordType) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<MessageDetailRecord>())?.let {
                            DetailRecordListResponse(messageDetailRecord = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ConferenceDetailRecord>())?.let {
                            DetailRecordListResponse(conferenceDetailRecord = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ConferenceParticipantDetailRecord>())
                            ?.let {
                                DetailRecordListResponse(
                                    conferenceParticipantDetailRecord = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<AmdDetailRecord>())?.let {
                            DetailRecordListResponse(amdDetailRecord = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<VerifyDetailRecord>())?.let {
                            DetailRecordListResponse(verifyDetailRecord = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SimCardUsageDetailRecord>())?.let {
                            DetailRecordListResponse(simCardUsageDetailRecord = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MediaStorageDetailRecord>())?.let {
                            DetailRecordListResponse(mediaStorageDetailRecord = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> DetailRecordListResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<DetailRecordListResponse>(DetailRecordListResponse::class) {

        override fun serialize(
            value: DetailRecordListResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.messageDetailRecord != null ->
                    generator.writeObject(value.messageDetailRecord)
                value.conferenceDetailRecord != null ->
                    generator.writeObject(value.conferenceDetailRecord)
                value.conferenceParticipantDetailRecord != null ->
                    generator.writeObject(value.conferenceParticipantDetailRecord)
                value.amdDetailRecord != null -> generator.writeObject(value.amdDetailRecord)
                value.verifyDetailRecord != null -> generator.writeObject(value.verifyDetailRecord)
                value.simCardUsageDetailRecord != null ->
                    generator.writeObject(value.simCardUsageDetailRecord)
                value.mediaStorageDetailRecord != null ->
                    generator.writeObject(value.mediaStorageDetailRecord)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DetailRecordListResponse")
            }
        }
    }

    class MessageDetailRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recordType: JsonField<String>,
        private val carrier: JsonField<String>,
        private val carrierFee: JsonField<String>,
        private val cld: JsonField<String>,
        private val cli: JsonField<String>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val cost: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val deliveryStatus: JsonField<String>,
        private val deliveryStatusFailoverUrl: JsonField<String>,
        private val deliveryStatusWebhookUrl: JsonField<String>,
        private val direction: JsonField<Direction>,
        private val errors: JsonField<List<String>>,
        private val fteu: JsonField<Boolean>,
        private val mcc: JsonField<String>,
        private val messageType: JsonField<MessageType>,
        private val mnc: JsonField<String>,
        private val onNet: JsonField<Boolean>,
        private val parts: JsonField<Long>,
        private val profileId: JsonField<String>,
        private val profileName: JsonField<String>,
        private val rate: JsonField<String>,
        private val sentAt: JsonField<OffsetDateTime>,
        private val sourceCountryCode: JsonField<String>,
        private val status: JsonField<Status>,
        private val tags: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val userId: JsonField<String>,
        private val uuid: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("carrier") @ExcludeMissing carrier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("carrier_fee")
            @ExcludeMissing
            carrierFee: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cld") @ExcludeMissing cld: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cli") @ExcludeMissing cli: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completed_at")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delivery_status")
            @ExcludeMissing
            deliveryStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delivery_status_failover_url")
            @ExcludeMissing
            deliveryStatusFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delivery_status_webhook_url")
            @ExcludeMissing
            deliveryStatusWebhookUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("errors")
            @ExcludeMissing
            errors: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("fteu") @ExcludeMissing fteu: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message_type")
            @ExcludeMissing
            messageType: JsonField<MessageType> = JsonMissing.of(),
            @JsonProperty("mnc") @ExcludeMissing mnc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("on_net") @ExcludeMissing onNet: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("parts") @ExcludeMissing parts: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("profile_id")
            @ExcludeMissing
            profileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("profile_name")
            @ExcludeMissing
            profileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sent_at")
            @ExcludeMissing
            sentAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("source_country_code")
            @ExcludeMissing
            sourceCountryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
        ) : this(
            recordType,
            carrier,
            carrierFee,
            cld,
            cli,
            completedAt,
            cost,
            countryCode,
            createdAt,
            currency,
            deliveryStatus,
            deliveryStatusFailoverUrl,
            deliveryStatusWebhookUrl,
            direction,
            errors,
            fteu,
            mcc,
            messageType,
            mnc,
            onNet,
            parts,
            profileId,
            profileName,
            rate,
            sentAt,
            sourceCountryCode,
            status,
            tags,
            updatedAt,
            userId,
            uuid,
            mutableMapOf(),
        )

        /**
         * Identifies the record schema
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Country-specific carrier used to send or receive the message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrier(): Optional<String> = carrier.getOptional("carrier")

        /**
         * Fee charged by certain carriers in order to deliver certain message types. Telnyx passes
         * this fee on to the customer according to our pricing table
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrierFee(): Optional<String> = carrierFee.getOptional("carrier_fee")

        /**
         * The recipient of the message (to parameter in the Messaging API)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cld(): Optional<String> = cld.getOptional("cld")

        /**
         * The sender of the message (from parameter in the Messaging API). For Alphanumeric ID
         * messages, this is the sender ID value
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cli(): Optional<String> = cli.getOptional("cli")

        /**
         * Message completion time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

        /**
         * Amount, in the user currency, for the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<String> = cost.getOptional("cost")

        /**
         * Two-letter representation of the country of the cld property using the ISO 3166-1 alpha-2
         * format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

        /**
         * Message creation time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Telnyx account currency used to describe monetary values, including billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Final webhook delivery status
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deliveryStatus(): Optional<String> = deliveryStatus.getOptional("delivery_status")

        /**
         * Failover customer-provided URL which Telnyx posts delivery status webhooks to
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deliveryStatusFailoverUrl(): Optional<String> =
            deliveryStatusFailoverUrl.getOptional("delivery_status_failover_url")

        /**
         * Primary customer-provided URL which Telnyx posts delivery status webhooks to
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deliveryStatusWebhookUrl(): Optional<String> =
            deliveryStatusWebhookUrl.getOptional("delivery_status_webhook_url")

        /**
         * Logical direction of the message from the Telnyx customer's perspective. It's inbound
         * when the Telnyx customer receives the message, or outbound otherwise
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun direction(): Optional<Direction> = direction.getOptional("direction")

        /**
         * Telnyx API error codes returned by the Telnyx gateway
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errors(): Optional<List<String>> = errors.getOptional("errors")

        /**
         * Indicates whether this is a Free-To-End-User (FTEU) short code message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fteu(): Optional<Boolean> = fteu.getOptional("fteu")

        /**
         * Mobile country code. Only available for certain products, such as Global Outbound-Only
         * from Alphanumeric Sender ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcc(): Optional<String> = mcc.getOptional("mcc")

        /**
         * Describes the Messaging service used to send the message. Available services are: Short
         * Message Service (SMS), Multimedia Messaging Service (MMS), and Rich Communication
         * Services (RCS)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageType(): Optional<MessageType> = messageType.getOptional("message_type")

        /**
         * Mobile network code. Only available for certain products, such as Global Outbound-Only
         * from Alphanumeric Sender ID
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mnc(): Optional<String> = mnc.getOptional("mnc")

        /**
         * Indicates whether both sender and recipient numbers are Telnyx-managed
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onNet(): Optional<Boolean> = onNet.getOptional("on_net")

        /**
         * Number of message parts. The message is broken down in multiple parts when its length
         * surpasses the limit of 160 characters
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parts(): Optional<Long> = parts.getOptional("parts")

        /**
         * Unique identifier of the Messaging Profile used to send or receive the message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profileId(): Optional<String> = profileId.getOptional("profile_id")

        /**
         * Name of the Messaging Profile used to send or receive the message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profileName(): Optional<String> = profileName.getOptional("profile_name")

        /**
         * Currency amount per billing unit used to calculate the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rate(): Optional<String> = rate.getOptional("rate")

        /**
         * Time when the message was sent
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sentAt(): Optional<OffsetDateTime> = sentAt.getOptional("sent_at")

        /**
         * Two-letter representation of the country of the cli property using the ISO 3166-1 alpha-2
         * format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sourceCountryCode(): Optional<String> =
            sourceCountryCode.getOptional("source_country_code")

        /**
         * Final status of the message after the delivery attempt
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Comma-separated tags assigned to the Telnyx number associated with the message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<String> = tags.getOptional("tags")

        /**
         * Message updated time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Identifier of the Telnyx account who owns the message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Unique identifier of the message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uuid(): Optional<String> = uuid.getOptional("uuid")

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [carrier].
         *
         * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<String> = carrier

        /**
         * Returns the raw JSON value of [carrierFee].
         *
         * Unlike [carrierFee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier_fee")
        @ExcludeMissing
        fun _carrierFee(): JsonField<String> = carrierFee

        /**
         * Returns the raw JSON value of [cld].
         *
         * Unlike [cld], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cld") @ExcludeMissing fun _cld(): JsonField<String> = cld

        /**
         * Returns the raw JSON value of [cli].
         *
         * Unlike [cli], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cli") @ExcludeMissing fun _cli(): JsonField<String> = cli

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
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [deliveryStatus].
         *
         * Unlike [deliveryStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_status")
        @ExcludeMissing
        fun _deliveryStatus(): JsonField<String> = deliveryStatus

        /**
         * Returns the raw JSON value of [deliveryStatusFailoverUrl].
         *
         * Unlike [deliveryStatusFailoverUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("delivery_status_failover_url")
        @ExcludeMissing
        fun _deliveryStatusFailoverUrl(): JsonField<String> = deliveryStatusFailoverUrl

        /**
         * Returns the raw JSON value of [deliveryStatusWebhookUrl].
         *
         * Unlike [deliveryStatusWebhookUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("delivery_status_webhook_url")
        @ExcludeMissing
        fun _deliveryStatusWebhookUrl(): JsonField<String> = deliveryStatusWebhookUrl

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [errors].
         *
         * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<String>> = errors

        /**
         * Returns the raw JSON value of [fteu].
         *
         * Unlike [fteu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fteu") @ExcludeMissing fun _fteu(): JsonField<Boolean> = fteu

        /**
         * Returns the raw JSON value of [mcc].
         *
         * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /**
         * Returns the raw JSON value of [messageType].
         *
         * Unlike [messageType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message_type")
        @ExcludeMissing
        fun _messageType(): JsonField<MessageType> = messageType

        /**
         * Returns the raw JSON value of [mnc].
         *
         * Unlike [mnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mnc") @ExcludeMissing fun _mnc(): JsonField<String> = mnc

        /**
         * Returns the raw JSON value of [onNet].
         *
         * Unlike [onNet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_net") @ExcludeMissing fun _onNet(): JsonField<Boolean> = onNet

        /**
         * Returns the raw JSON value of [parts].
         *
         * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<Long> = parts

        /**
         * Returns the raw JSON value of [profileId].
         *
         * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("profile_id") @ExcludeMissing fun _profileId(): JsonField<String> = profileId

        /**
         * Returns the raw JSON value of [profileName].
         *
         * Unlike [profileName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("profile_name")
        @ExcludeMissing
        fun _profileName(): JsonField<String> = profileName

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        /**
         * Returns the raw JSON value of [sentAt].
         *
         * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sent_at") @ExcludeMissing fun _sentAt(): JsonField<OffsetDateTime> = sentAt

        /**
         * Returns the raw JSON value of [sourceCountryCode].
         *
         * Unlike [sourceCountryCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("source_country_code")
        @ExcludeMissing
        fun _sourceCountryCode(): JsonField<String> = sourceCountryCode

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<String> = tags

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [uuid].
         *
         * Unlike [uuid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uuid") @ExcludeMissing fun _uuid(): JsonField<String> = uuid

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
             * Returns a mutable builder for constructing an instance of [MessageDetailRecord].
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MessageDetailRecord]. */
        class Builder internal constructor() {

            private var recordType: JsonField<String>? = null
            private var carrier: JsonField<String> = JsonMissing.of()
            private var carrierFee: JsonField<String> = JsonMissing.of()
            private var cld: JsonField<String> = JsonMissing.of()
            private var cli: JsonField<String> = JsonMissing.of()
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cost: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var deliveryStatus: JsonField<String> = JsonMissing.of()
            private var deliveryStatusFailoverUrl: JsonField<String> = JsonMissing.of()
            private var deliveryStatusWebhookUrl: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var errors: JsonField<MutableList<String>>? = null
            private var fteu: JsonField<Boolean> = JsonMissing.of()
            private var mcc: JsonField<String> = JsonMissing.of()
            private var messageType: JsonField<MessageType> = JsonMissing.of()
            private var mnc: JsonField<String> = JsonMissing.of()
            private var onNet: JsonField<Boolean> = JsonMissing.of()
            private var parts: JsonField<Long> = JsonMissing.of()
            private var profileId: JsonField<String> = JsonMissing.of()
            private var profileName: JsonField<String> = JsonMissing.of()
            private var rate: JsonField<String> = JsonMissing.of()
            private var sentAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var sourceCountryCode: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var tags: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var uuid: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(messageDetailRecord: MessageDetailRecord) = apply {
                recordType = messageDetailRecord.recordType
                carrier = messageDetailRecord.carrier
                carrierFee = messageDetailRecord.carrierFee
                cld = messageDetailRecord.cld
                cli = messageDetailRecord.cli
                completedAt = messageDetailRecord.completedAt
                cost = messageDetailRecord.cost
                countryCode = messageDetailRecord.countryCode
                createdAt = messageDetailRecord.createdAt
                currency = messageDetailRecord.currency
                deliveryStatus = messageDetailRecord.deliveryStatus
                deliveryStatusFailoverUrl = messageDetailRecord.deliveryStatusFailoverUrl
                deliveryStatusWebhookUrl = messageDetailRecord.deliveryStatusWebhookUrl
                direction = messageDetailRecord.direction
                errors = messageDetailRecord.errors.map { it.toMutableList() }
                fteu = messageDetailRecord.fteu
                mcc = messageDetailRecord.mcc
                messageType = messageDetailRecord.messageType
                mnc = messageDetailRecord.mnc
                onNet = messageDetailRecord.onNet
                parts = messageDetailRecord.parts
                profileId = messageDetailRecord.profileId
                profileName = messageDetailRecord.profileName
                rate = messageDetailRecord.rate
                sentAt = messageDetailRecord.sentAt
                sourceCountryCode = messageDetailRecord.sourceCountryCode
                status = messageDetailRecord.status
                tags = messageDetailRecord.tags
                updatedAt = messageDetailRecord.updatedAt
                userId = messageDetailRecord.userId
                uuid = messageDetailRecord.uuid
                additionalProperties = messageDetailRecord.additionalProperties.toMutableMap()
            }

            /** Identifies the record schema */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Country-specific carrier used to send or receive the message */
            fun carrier(carrier: String) = carrier(JsonField.of(carrier))

            /**
             * Sets [Builder.carrier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrier] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrier(carrier: JsonField<String>) = apply { this.carrier = carrier }

            /**
             * Fee charged by certain carriers in order to deliver certain message types. Telnyx
             * passes this fee on to the customer according to our pricing table
             */
            fun carrierFee(carrierFee: String) = carrierFee(JsonField.of(carrierFee))

            /**
             * Sets [Builder.carrierFee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierFee] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrierFee(carrierFee: JsonField<String>) = apply { this.carrierFee = carrierFee }

            /** The recipient of the message (to parameter in the Messaging API) */
            fun cld(cld: String) = cld(JsonField.of(cld))

            /**
             * Sets [Builder.cld] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cld] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cld(cld: JsonField<String>) = apply { this.cld = cld }

            /**
             * The sender of the message (from parameter in the Messaging API). For Alphanumeric ID
             * messages, this is the sender ID value
             */
            fun cli(cli: String) = cli(JsonField.of(cli))

            /**
             * Sets [Builder.cli] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cli] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cli(cli: JsonField<String>) = apply { this.cli = cli }

            /** Message completion time */
            fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            /** Amount, in the user currency, for the Telnyx billing cost */
            fun cost(cost: String) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<String>) = apply { this.cost = cost }

            /**
             * Two-letter representation of the country of the cld property using the ISO 3166-1
             * alpha-2 format
             */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            /** Message creation time */
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

            /** Telnyx account currency used to describe monetary values, including billing cost */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Final webhook delivery status */
            fun deliveryStatus(deliveryStatus: String) =
                deliveryStatus(JsonField.of(deliveryStatus))

            /**
             * Sets [Builder.deliveryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deliveryStatus(deliveryStatus: JsonField<String>) = apply {
                this.deliveryStatus = deliveryStatus
            }

            /** Failover customer-provided URL which Telnyx posts delivery status webhooks to */
            fun deliveryStatusFailoverUrl(deliveryStatusFailoverUrl: String) =
                deliveryStatusFailoverUrl(JsonField.of(deliveryStatusFailoverUrl))

            /**
             * Sets [Builder.deliveryStatusFailoverUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryStatusFailoverUrl] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun deliveryStatusFailoverUrl(deliveryStatusFailoverUrl: JsonField<String>) = apply {
                this.deliveryStatusFailoverUrl = deliveryStatusFailoverUrl
            }

            /** Primary customer-provided URL which Telnyx posts delivery status webhooks to */
            fun deliveryStatusWebhookUrl(deliveryStatusWebhookUrl: String) =
                deliveryStatusWebhookUrl(JsonField.of(deliveryStatusWebhookUrl))

            /**
             * Sets [Builder.deliveryStatusWebhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryStatusWebhookUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deliveryStatusWebhookUrl(deliveryStatusWebhookUrl: JsonField<String>) = apply {
                this.deliveryStatusWebhookUrl = deliveryStatusWebhookUrl
            }

            /**
             * Logical direction of the message from the Telnyx customer's perspective. It's inbound
             * when the Telnyx customer receives the message, or outbound otherwise
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /** Telnyx API error codes returned by the Telnyx gateway */
            fun errors(errors: List<String>) = errors(JsonField.of(errors))

            /**
             * Sets [Builder.errors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errors] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errors(errors: JsonField<List<String>>) = apply {
                this.errors = errors.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [errors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addError(error: String) = apply {
                errors =
                    (errors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("errors", it).add(error)
                    }
            }

            /** Indicates whether this is a Free-To-End-User (FTEU) short code message */
            fun fteu(fteu: Boolean) = fteu(JsonField.of(fteu))

            /**
             * Sets [Builder.fteu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fteu] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fteu(fteu: JsonField<Boolean>) = apply { this.fteu = fteu }

            /**
             * Mobile country code. Only available for certain products, such as Global
             * Outbound-Only from Alphanumeric Sender ID
             */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Sets [Builder.mcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /**
             * Describes the Messaging service used to send the message. Available services are:
             * Short Message Service (SMS), Multimedia Messaging Service (MMS), and Rich
             * Communication Services (RCS)
             */
            fun messageType(messageType: MessageType) = messageType(JsonField.of(messageType))

            /**
             * Sets [Builder.messageType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageType] with a well-typed [MessageType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageType(messageType: JsonField<MessageType>) = apply {
                this.messageType = messageType
            }

            /**
             * Mobile network code. Only available for certain products, such as Global
             * Outbound-Only from Alphanumeric Sender ID
             */
            fun mnc(mnc: String) = mnc(JsonField.of(mnc))

            /**
             * Sets [Builder.mnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mnc(mnc: JsonField<String>) = apply { this.mnc = mnc }

            /** Indicates whether both sender and recipient numbers are Telnyx-managed */
            fun onNet(onNet: Boolean) = onNet(JsonField.of(onNet))

            /**
             * Sets [Builder.onNet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onNet] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun onNet(onNet: JsonField<Boolean>) = apply { this.onNet = onNet }

            /**
             * Number of message parts. The message is broken down in multiple parts when its length
             * surpasses the limit of 160 characters
             */
            fun parts(parts: Long) = parts(JsonField.of(parts))

            /**
             * Sets [Builder.parts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parts] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun parts(parts: JsonField<Long>) = apply { this.parts = parts }

            /** Unique identifier of the Messaging Profile used to send or receive the message */
            fun profileId(profileId: String) = profileId(JsonField.of(profileId))

            /**
             * Sets [Builder.profileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

            /** Name of the Messaging Profile used to send or receive the message */
            fun profileName(profileName: String) = profileName(JsonField.of(profileName))

            /**
             * Sets [Builder.profileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profileName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profileName(profileName: JsonField<String>) = apply {
                this.profileName = profileName
            }

            /** Currency amount per billing unit used to calculate the Telnyx billing cost */
            fun rate(rate: String) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

            /** Time when the message was sent */
            fun sentAt(sentAt: OffsetDateTime) = sentAt(JsonField.of(sentAt))

            /**
             * Sets [Builder.sentAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sentAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sentAt(sentAt: JsonField<OffsetDateTime>) = apply { this.sentAt = sentAt }

            /**
             * Two-letter representation of the country of the cli property using the ISO 3166-1
             * alpha-2 format
             */
            fun sourceCountryCode(sourceCountryCode: String) =
                sourceCountryCode(JsonField.of(sourceCountryCode))

            /**
             * Sets [Builder.sourceCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceCountryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceCountryCode(sourceCountryCode: JsonField<String>) = apply {
                this.sourceCountryCode = sourceCountryCode
            }

            /** Final status of the message after the delivery attempt */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Comma-separated tags assigned to the Telnyx number associated with the message */
            fun tags(tags: String) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: JsonField<String>) = apply { this.tags = tags }

            /** Message updated time */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** Identifier of the Telnyx account who owns the message */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** Unique identifier of the message */
            fun uuid(uuid: String) = uuid(JsonField.of(uuid))

            /**
             * Sets [Builder.uuid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uuid] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uuid(uuid: JsonField<String>) = apply { this.uuid = uuid }

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
             * Returns an immutable instance of [MessageDetailRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MessageDetailRecord =
                MessageDetailRecord(
                    checkRequired("recordType", recordType),
                    carrier,
                    carrierFee,
                    cld,
                    cli,
                    completedAt,
                    cost,
                    countryCode,
                    createdAt,
                    currency,
                    deliveryStatus,
                    deliveryStatusFailoverUrl,
                    deliveryStatusWebhookUrl,
                    direction,
                    (errors ?: JsonMissing.of()).map { it.toImmutable() },
                    fteu,
                    mcc,
                    messageType,
                    mnc,
                    onNet,
                    parts,
                    profileId,
                    profileName,
                    rate,
                    sentAt,
                    sourceCountryCode,
                    status,
                    tags,
                    updatedAt,
                    userId,
                    uuid,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MessageDetailRecord = apply {
            if (validated) {
                return@apply
            }

            recordType()
            carrier()
            carrierFee()
            cld()
            cli()
            completedAt()
            cost()
            countryCode()
            createdAt()
            currency()
            deliveryStatus()
            deliveryStatusFailoverUrl()
            deliveryStatusWebhookUrl()
            direction().ifPresent { it.validate() }
            errors()
            fteu()
            mcc()
            messageType().ifPresent { it.validate() }
            mnc()
            onNet()
            parts()
            profileId()
            profileName()
            rate()
            sentAt()
            sourceCountryCode()
            status().ifPresent { it.validate() }
            tags()
            updatedAt()
            userId()
            uuid()
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
            (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (carrier.asKnown().isPresent) 1 else 0) +
                (if (carrierFee.asKnown().isPresent) 1 else 0) +
                (if (cld.asKnown().isPresent) 1 else 0) +
                (if (cli.asKnown().isPresent) 1 else 0) +
                (if (completedAt.asKnown().isPresent) 1 else 0) +
                (if (cost.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (deliveryStatus.asKnown().isPresent) 1 else 0) +
                (if (deliveryStatusFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (deliveryStatusWebhookUrl.asKnown().isPresent) 1 else 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (errors.asKnown().getOrNull()?.size ?: 0) +
                (if (fteu.asKnown().isPresent) 1 else 0) +
                (if (mcc.asKnown().isPresent) 1 else 0) +
                (messageType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mnc.asKnown().isPresent) 1 else 0) +
                (if (onNet.asKnown().isPresent) 1 else 0) +
                (if (parts.asKnown().isPresent) 1 else 0) +
                (if (profileId.asKnown().isPresent) 1 else 0) +
                (if (profileName.asKnown().isPresent) 1 else 0) +
                (if (rate.asKnown().isPresent) 1 else 0) +
                (if (sentAt.asKnown().isPresent) 1 else 0) +
                (if (sourceCountryCode.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tags.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (if (uuid.asKnown().isPresent) 1 else 0)

        /**
         * Logical direction of the message from the Telnyx customer's perspective. It's inbound
         * when the Telnyx customer receives the message, or outbound otherwise
         */
        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INBOUND,
                OUTBOUND,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
                 * value.
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
                    INBOUND -> Value.INBOUND
                    OUTBOUND -> Value.OUTBOUND
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
                    INBOUND -> Known.INBOUND
                    OUTBOUND -> Known.OUTBOUND
                    else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
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

        /**
         * Describes the Messaging service used to send the message. Available services are: Short
         * Message Service (SMS), Multimedia Messaging Service (MMS), and Rich Communication
         * Services (RCS)
         */
        class MessageType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val SMS = of("SMS")

                @JvmField val MMS = of("MMS")

                @JvmField val RCS = of("RCS")

                @JvmStatic fun of(value: String) = MessageType(JsonField.of(value))
            }

            /** An enum containing [MessageType]'s known values. */
            enum class Known {
                SMS,
                MMS,
                RCS,
            }

            /**
             * An enum containing [MessageType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [MessageType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SMS,
                MMS,
                RCS,
                /**
                 * An enum member indicating that [MessageType] was instantiated with an unknown
                 * value.
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
                    SMS -> Value.SMS
                    MMS -> Value.MMS
                    RCS -> Value.RCS
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
                    SMS -> Known.SMS
                    MMS -> Known.MMS
                    RCS -> Known.RCS
                    else -> throw TelnyxInvalidDataException("Unknown MessageType: $value")
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

            fun validate(): MessageType = apply {
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

                return other is MessageType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Final status of the message after the delivery attempt */
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

                @JvmField val GW_TIMEOUT = of("gw_timeout")

                @JvmField val DELIVERED = of("delivered")

                @JvmField val DLR_UNCONFIRMED = of("dlr_unconfirmed")

                @JvmField val DLR_TIMEOUT = of("dlr_timeout")

                @JvmField val RECEIVED = of("received")

                @JvmField val GW_REJECT = of("gw_reject")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                GW_TIMEOUT,
                DELIVERED,
                DLR_UNCONFIRMED,
                DLR_TIMEOUT,
                RECEIVED,
                GW_REJECT,
                FAILED,
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
                GW_TIMEOUT,
                DELIVERED,
                DLR_UNCONFIRMED,
                DLR_TIMEOUT,
                RECEIVED,
                GW_REJECT,
                FAILED,
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
                    GW_TIMEOUT -> Value.GW_TIMEOUT
                    DELIVERED -> Value.DELIVERED
                    DLR_UNCONFIRMED -> Value.DLR_UNCONFIRMED
                    DLR_TIMEOUT -> Value.DLR_TIMEOUT
                    RECEIVED -> Value.RECEIVED
                    GW_REJECT -> Value.GW_REJECT
                    FAILED -> Value.FAILED
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
                    GW_TIMEOUT -> Known.GW_TIMEOUT
                    DELIVERED -> Known.DELIVERED
                    DLR_UNCONFIRMED -> Known.DLR_UNCONFIRMED
                    DLR_TIMEOUT -> Known.DLR_TIMEOUT
                    RECEIVED -> Known.RECEIVED
                    GW_REJECT -> Known.GW_REJECT
                    FAILED -> Known.FAILED
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

            return other is MessageDetailRecord &&
                recordType == other.recordType &&
                carrier == other.carrier &&
                carrierFee == other.carrierFee &&
                cld == other.cld &&
                cli == other.cli &&
                completedAt == other.completedAt &&
                cost == other.cost &&
                countryCode == other.countryCode &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                deliveryStatus == other.deliveryStatus &&
                deliveryStatusFailoverUrl == other.deliveryStatusFailoverUrl &&
                deliveryStatusWebhookUrl == other.deliveryStatusWebhookUrl &&
                direction == other.direction &&
                errors == other.errors &&
                fteu == other.fteu &&
                mcc == other.mcc &&
                messageType == other.messageType &&
                mnc == other.mnc &&
                onNet == other.onNet &&
                parts == other.parts &&
                profileId == other.profileId &&
                profileName == other.profileName &&
                rate == other.rate &&
                sentAt == other.sentAt &&
                sourceCountryCode == other.sourceCountryCode &&
                status == other.status &&
                tags == other.tags &&
                updatedAt == other.updatedAt &&
                userId == other.userId &&
                uuid == other.uuid &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                recordType,
                carrier,
                carrierFee,
                cld,
                cli,
                completedAt,
                cost,
                countryCode,
                createdAt,
                currency,
                deliveryStatus,
                deliveryStatusFailoverUrl,
                deliveryStatusWebhookUrl,
                direction,
                errors,
                fteu,
                mcc,
                messageType,
                mnc,
                onNet,
                parts,
                profileId,
                profileName,
                rate,
                sentAt,
                sourceCountryCode,
                status,
                tags,
                updatedAt,
                userId,
                uuid,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MessageDetailRecord{recordType=$recordType, carrier=$carrier, carrierFee=$carrierFee, cld=$cld, cli=$cli, completedAt=$completedAt, cost=$cost, countryCode=$countryCode, createdAt=$createdAt, currency=$currency, deliveryStatus=$deliveryStatus, deliveryStatusFailoverUrl=$deliveryStatusFailoverUrl, deliveryStatusWebhookUrl=$deliveryStatusWebhookUrl, direction=$direction, errors=$errors, fteu=$fteu, mcc=$mcc, messageType=$messageType, mnc=$mnc, onNet=$onNet, parts=$parts, profileId=$profileId, profileName=$profileName, rate=$rate, sentAt=$sentAt, sourceCountryCode=$sourceCountryCode, status=$status, tags=$tags, updatedAt=$updatedAt, userId=$userId, uuid=$uuid, additionalProperties=$additionalProperties}"
    }

    class ConferenceDetailRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recordType: JsonField<String>,
        private val id: JsonField<String>,
        private val callLegId: JsonField<String>,
        private val callSec: JsonField<Long>,
        private val callSessionId: JsonField<String>,
        private val connectionId: JsonField<String>,
        private val endedAt: JsonField<OffsetDateTime>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val isTelnyxBillable: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val participantCallSec: JsonField<Long>,
        private val participantCount: JsonField<Long>,
        private val region: JsonField<String>,
        private val startedAt: JsonField<OffsetDateTime>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_leg_id")
            @ExcludeMissing
            callLegId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_sec") @ExcludeMissing callSec: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("call_session_id")
            @ExcludeMissing
            callSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ended_at")
            @ExcludeMissing
            endedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("is_telnyx_billable")
            @ExcludeMissing
            isTelnyxBillable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("participant_call_sec")
            @ExcludeMissing
            participantCallSec: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("participant_count")
            @ExcludeMissing
            participantCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("started_at")
            @ExcludeMissing
            startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(
            recordType,
            id,
            callLegId,
            callSec,
            callSessionId,
            connectionId,
            endedAt,
            expiresAt,
            isTelnyxBillable,
            name,
            participantCallSec,
            participantCount,
            region,
            startedAt,
            userId,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Conference id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Telnyx UUID that identifies the conference call leg
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callLegId(): Optional<String> = callLegId.getOptional("call_leg_id")

        /**
         * Duration of the conference call in seconds
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSec(): Optional<Long> = callSec.getOptional("call_sec")

        /**
         * Telnyx UUID that identifies with conference call session
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSessionId(): Optional<String> = callSessionId.getOptional("call_session_id")

        /**
         * Connection id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * Conference end time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endedAt(): Optional<OffsetDateTime> = endedAt.getOptional("ended_at")

        /**
         * Conference expiry time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

        /**
         * Indicates whether Telnyx billing charges might be applicable
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTelnyxBillable(): Optional<Boolean> =
            isTelnyxBillable.getOptional("is_telnyx_billable")

        /**
         * Conference name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Sum of the conference call duration for all participants in seconds
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun participantCallSec(): Optional<Long> =
            participantCallSec.getOptional("participant_call_sec")

        /**
         * Number of participants that joined the conference call
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun participantCount(): Optional<Long> = participantCount.getOptional("participant_count")

        /**
         * Region where the conference is hosted
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * Conference start time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

        /**
         * User id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [callLegId].
         *
         * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_leg_id") @ExcludeMissing fun _callLegId(): JsonField<String> = callLegId

        /**
         * Returns the raw JSON value of [callSec].
         *
         * Unlike [callSec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_sec") @ExcludeMissing fun _callSec(): JsonField<Long> = callSec

        /**
         * Returns the raw JSON value of [callSessionId].
         *
         * Unlike [callSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_session_id")
        @ExcludeMissing
        fun _callSessionId(): JsonField<String> = callSessionId

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [endedAt].
         *
         * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ended_at")
        @ExcludeMissing
        fun _endedAt(): JsonField<OffsetDateTime> = endedAt

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [isTelnyxBillable].
         *
         * Unlike [isTelnyxBillable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_telnyx_billable")
        @ExcludeMissing
        fun _isTelnyxBillable(): JsonField<Boolean> = isTelnyxBillable

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [participantCallSec].
         *
         * Unlike [participantCallSec], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("participant_call_sec")
        @ExcludeMissing
        fun _participantCallSec(): JsonField<Long> = participantCallSec

        /**
         * Returns the raw JSON value of [participantCount].
         *
         * Unlike [participantCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("participant_count")
        @ExcludeMissing
        fun _participantCount(): JsonField<Long> = participantCount

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [startedAt].
         *
         * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("started_at")
        @ExcludeMissing
        fun _startedAt(): JsonField<OffsetDateTime> = startedAt

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
             * Returns a mutable builder for constructing an instance of [ConferenceDetailRecord].
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConferenceDetailRecord]. */
        class Builder internal constructor() {

            private var recordType: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var callLegId: JsonField<String> = JsonMissing.of()
            private var callSec: JsonField<Long> = JsonMissing.of()
            private var callSessionId: JsonField<String> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var endedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isTelnyxBillable: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var participantCallSec: JsonField<Long> = JsonMissing.of()
            private var participantCount: JsonField<Long> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conferenceDetailRecord: ConferenceDetailRecord) = apply {
                recordType = conferenceDetailRecord.recordType
                id = conferenceDetailRecord.id
                callLegId = conferenceDetailRecord.callLegId
                callSec = conferenceDetailRecord.callSec
                callSessionId = conferenceDetailRecord.callSessionId
                connectionId = conferenceDetailRecord.connectionId
                endedAt = conferenceDetailRecord.endedAt
                expiresAt = conferenceDetailRecord.expiresAt
                isTelnyxBillable = conferenceDetailRecord.isTelnyxBillable
                name = conferenceDetailRecord.name
                participantCallSec = conferenceDetailRecord.participantCallSec
                participantCount = conferenceDetailRecord.participantCount
                region = conferenceDetailRecord.region
                startedAt = conferenceDetailRecord.startedAt
                userId = conferenceDetailRecord.userId
                additionalProperties = conferenceDetailRecord.additionalProperties.toMutableMap()
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Conference id */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Telnyx UUID that identifies the conference call leg */
            fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

            /**
             * Sets [Builder.callLegId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callLegId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

            /** Duration of the conference call in seconds */
            fun callSec(callSec: Long) = callSec(JsonField.of(callSec))

            /**
             * Sets [Builder.callSec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSec] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSec(callSec: JsonField<Long>) = apply { this.callSec = callSec }

            /** Telnyx UUID that identifies with conference call session */
            fun callSessionId(callSessionId: String) = callSessionId(JsonField.of(callSessionId))

            /**
             * Sets [Builder.callSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSessionId(callSessionId: JsonField<String>) = apply {
                this.callSessionId = callSessionId
            }

            /** Connection id */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** Conference end time */
            fun endedAt(endedAt: OffsetDateTime) = endedAt(JsonField.of(endedAt))

            /**
             * Sets [Builder.endedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endedAt(endedAt: JsonField<OffsetDateTime>) = apply { this.endedAt = endedAt }

            /** Conference expiry time */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** Indicates whether Telnyx billing charges might be applicable */
            fun isTelnyxBillable(isTelnyxBillable: Boolean) =
                isTelnyxBillable(JsonField.of(isTelnyxBillable))

            /**
             * Sets [Builder.isTelnyxBillable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTelnyxBillable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isTelnyxBillable(isTelnyxBillable: JsonField<Boolean>) = apply {
                this.isTelnyxBillable = isTelnyxBillable
            }

            /** Conference name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Sum of the conference call duration for all participants in seconds */
            fun participantCallSec(participantCallSec: Long) =
                participantCallSec(JsonField.of(participantCallSec))

            /**
             * Sets [Builder.participantCallSec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participantCallSec] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun participantCallSec(participantCallSec: JsonField<Long>) = apply {
                this.participantCallSec = participantCallSec
            }

            /** Number of participants that joined the conference call */
            fun participantCount(participantCount: Long) =
                participantCount(JsonField.of(participantCount))

            /**
             * Sets [Builder.participantCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.participantCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun participantCount(participantCount: JsonField<Long>) = apply {
                this.participantCount = participantCount
            }

            /** Region where the conference is hosted */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** Conference start time */
            fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

            /**
             * Sets [Builder.startedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply {
                this.startedAt = startedAt
            }

            /** User id */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * Returns an immutable instance of [ConferenceDetailRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConferenceDetailRecord =
                ConferenceDetailRecord(
                    checkRequired("recordType", recordType),
                    id,
                    callLegId,
                    callSec,
                    callSessionId,
                    connectionId,
                    endedAt,
                    expiresAt,
                    isTelnyxBillable,
                    name,
                    participantCallSec,
                    participantCount,
                    region,
                    startedAt,
                    userId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ConferenceDetailRecord = apply {
            if (validated) {
                return@apply
            }

            recordType()
            id()
            callLegId()
            callSec()
            callSessionId()
            connectionId()
            endedAt()
            expiresAt()
            isTelnyxBillable()
            name()
            participantCallSec()
            participantCount()
            region()
            startedAt()
            userId()
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
            (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (callLegId.asKnown().isPresent) 1 else 0) +
                (if (callSec.asKnown().isPresent) 1 else 0) +
                (if (callSessionId.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (endedAt.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (isTelnyxBillable.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (participantCallSec.asKnown().isPresent) 1 else 0) +
                (if (participantCount.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (startedAt.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConferenceDetailRecord &&
                recordType == other.recordType &&
                id == other.id &&
                callLegId == other.callLegId &&
                callSec == other.callSec &&
                callSessionId == other.callSessionId &&
                connectionId == other.connectionId &&
                endedAt == other.endedAt &&
                expiresAt == other.expiresAt &&
                isTelnyxBillable == other.isTelnyxBillable &&
                name == other.name &&
                participantCallSec == other.participantCallSec &&
                participantCount == other.participantCount &&
                region == other.region &&
                startedAt == other.startedAt &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                recordType,
                id,
                callLegId,
                callSec,
                callSessionId,
                connectionId,
                endedAt,
                expiresAt,
                isTelnyxBillable,
                name,
                participantCallSec,
                participantCount,
                region,
                startedAt,
                userId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConferenceDetailRecord{recordType=$recordType, id=$id, callLegId=$callLegId, callSec=$callSec, callSessionId=$callSessionId, connectionId=$connectionId, endedAt=$endedAt, expiresAt=$expiresAt, isTelnyxBillable=$isTelnyxBillable, name=$name, participantCallSec=$participantCallSec, participantCount=$participantCount, region=$region, startedAt=$startedAt, userId=$userId, additionalProperties=$additionalProperties}"
    }

    class ConferenceParticipantDetailRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recordType: JsonField<String>,
        private val id: JsonField<String>,
        private val billedSec: JsonField<Long>,
        private val callLegId: JsonField<String>,
        private val callSec: JsonField<Long>,
        private val callSessionId: JsonField<String>,
        private val conferenceId: JsonField<String>,
        private val cost: JsonField<String>,
        private val currency: JsonField<String>,
        private val destinationNumber: JsonField<String>,
        private val isTelnyxBillable: JsonField<Boolean>,
        private val joinedAt: JsonField<OffsetDateTime>,
        private val leftAt: JsonField<OffsetDateTime>,
        private val originatingNumber: JsonField<String>,
        private val rate: JsonField<String>,
        private val rateMeasuredIn: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billed_sec")
            @ExcludeMissing
            billedSec: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("call_leg_id")
            @ExcludeMissing
            callLegId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_sec") @ExcludeMissing callSec: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("call_session_id")
            @ExcludeMissing
            callSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conference_id")
            @ExcludeMissing
            conferenceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_number")
            @ExcludeMissing
            destinationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_telnyx_billable")
            @ExcludeMissing
            isTelnyxBillable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("joined_at")
            @ExcludeMissing
            joinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("left_at")
            @ExcludeMissing
            leftAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("originating_number")
            @ExcludeMissing
            originatingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_measured_in")
            @ExcludeMissing
            rateMeasuredIn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(
            recordType,
            id,
            billedSec,
            callLegId,
            callSec,
            callSessionId,
            conferenceId,
            cost,
            currency,
            destinationNumber,
            isTelnyxBillable,
            joinedAt,
            leftAt,
            originatingNumber,
            rate,
            rateMeasuredIn,
            userId,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Participant id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Duration of the conference call for billing purposes
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billedSec(): Optional<Long> = billedSec.getOptional("billed_sec")

        /**
         * Telnyx UUID that identifies the conference call leg
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callLegId(): Optional<String> = callLegId.getOptional("call_leg_id")

        /**
         * Duration of the conference call in seconds
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSec(): Optional<Long> = callSec.getOptional("call_sec")

        /**
         * Telnyx UUID that identifies with conference call session
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSessionId(): Optional<String> = callSessionId.getOptional("call_session_id")

        /**
         * Conference id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceId(): Optional<String> = conferenceId.getOptional("conference_id")

        /**
         * Currency amount for Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<String> = cost.getOptional("cost")

        /**
         * Telnyx account currency used to describe monetary values, including billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Number called by the participant to join the conference
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun destinationNumber(): Optional<String> =
            destinationNumber.getOptional("destination_number")

        /**
         * Indicates whether Telnyx billing charges might be applicable
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTelnyxBillable(): Optional<Boolean> =
            isTelnyxBillable.getOptional("is_telnyx_billable")

        /**
         * Participant join time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun joinedAt(): Optional<OffsetDateTime> = joinedAt.getOptional("joined_at")

        /**
         * Participant leave time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun leftAt(): Optional<OffsetDateTime> = leftAt.getOptional("left_at")

        /**
         * Participant origin number used in the conference call
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun originatingNumber(): Optional<String> =
            originatingNumber.getOptional("originating_number")

        /**
         * Currency amount per billing unit used to calculate the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rate(): Optional<String> = rate.getOptional("rate")

        /**
         * Billing unit used to calculate the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rateMeasuredIn(): Optional<String> = rateMeasuredIn.getOptional("rate_measured_in")

        /**
         * User id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [billedSec].
         *
         * Unlike [billedSec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billed_sec") @ExcludeMissing fun _billedSec(): JsonField<Long> = billedSec

        /**
         * Returns the raw JSON value of [callLegId].
         *
         * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_leg_id") @ExcludeMissing fun _callLegId(): JsonField<String> = callLegId

        /**
         * Returns the raw JSON value of [callSec].
         *
         * Unlike [callSec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_sec") @ExcludeMissing fun _callSec(): JsonField<Long> = callSec

        /**
         * Returns the raw JSON value of [callSessionId].
         *
         * Unlike [callSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_session_id")
        @ExcludeMissing
        fun _callSessionId(): JsonField<String> = callSessionId

        /**
         * Returns the raw JSON value of [conferenceId].
         *
         * Unlike [conferenceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("conference_id")
        @ExcludeMissing
        fun _conferenceId(): JsonField<String> = conferenceId

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [destinationNumber].
         *
         * Unlike [destinationNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destination_number")
        @ExcludeMissing
        fun _destinationNumber(): JsonField<String> = destinationNumber

        /**
         * Returns the raw JSON value of [isTelnyxBillable].
         *
         * Unlike [isTelnyxBillable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_telnyx_billable")
        @ExcludeMissing
        fun _isTelnyxBillable(): JsonField<Boolean> = isTelnyxBillable

        /**
         * Returns the raw JSON value of [joinedAt].
         *
         * Unlike [joinedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("joined_at")
        @ExcludeMissing
        fun _joinedAt(): JsonField<OffsetDateTime> = joinedAt

        /**
         * Returns the raw JSON value of [leftAt].
         *
         * Unlike [leftAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("left_at") @ExcludeMissing fun _leftAt(): JsonField<OffsetDateTime> = leftAt

        /**
         * Returns the raw JSON value of [originatingNumber].
         *
         * Unlike [originatingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("originating_number")
        @ExcludeMissing
        fun _originatingNumber(): JsonField<String> = originatingNumber

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        /**
         * Returns the raw JSON value of [rateMeasuredIn].
         *
         * Unlike [rateMeasuredIn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rate_measured_in")
        @ExcludeMissing
        fun _rateMeasuredIn(): JsonField<String> = rateMeasuredIn

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
             * [ConferenceParticipantDetailRecord].
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConferenceParticipantDetailRecord]. */
        class Builder internal constructor() {

            private var recordType: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var billedSec: JsonField<Long> = JsonMissing.of()
            private var callLegId: JsonField<String> = JsonMissing.of()
            private var callSec: JsonField<Long> = JsonMissing.of()
            private var callSessionId: JsonField<String> = JsonMissing.of()
            private var conferenceId: JsonField<String> = JsonMissing.of()
            private var cost: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var destinationNumber: JsonField<String> = JsonMissing.of()
            private var isTelnyxBillable: JsonField<Boolean> = JsonMissing.of()
            private var joinedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var leftAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var originatingNumber: JsonField<String> = JsonMissing.of()
            private var rate: JsonField<String> = JsonMissing.of()
            private var rateMeasuredIn: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                conferenceParticipantDetailRecord: ConferenceParticipantDetailRecord
            ) = apply {
                recordType = conferenceParticipantDetailRecord.recordType
                id = conferenceParticipantDetailRecord.id
                billedSec = conferenceParticipantDetailRecord.billedSec
                callLegId = conferenceParticipantDetailRecord.callLegId
                callSec = conferenceParticipantDetailRecord.callSec
                callSessionId = conferenceParticipantDetailRecord.callSessionId
                conferenceId = conferenceParticipantDetailRecord.conferenceId
                cost = conferenceParticipantDetailRecord.cost
                currency = conferenceParticipantDetailRecord.currency
                destinationNumber = conferenceParticipantDetailRecord.destinationNumber
                isTelnyxBillable = conferenceParticipantDetailRecord.isTelnyxBillable
                joinedAt = conferenceParticipantDetailRecord.joinedAt
                leftAt = conferenceParticipantDetailRecord.leftAt
                originatingNumber = conferenceParticipantDetailRecord.originatingNumber
                rate = conferenceParticipantDetailRecord.rate
                rateMeasuredIn = conferenceParticipantDetailRecord.rateMeasuredIn
                userId = conferenceParticipantDetailRecord.userId
                additionalProperties =
                    conferenceParticipantDetailRecord.additionalProperties.toMutableMap()
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Participant id */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Duration of the conference call for billing purposes */
            fun billedSec(billedSec: Long) = billedSec(JsonField.of(billedSec))

            /**
             * Sets [Builder.billedSec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billedSec] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billedSec(billedSec: JsonField<Long>) = apply { this.billedSec = billedSec }

            /** Telnyx UUID that identifies the conference call leg */
            fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

            /**
             * Sets [Builder.callLegId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callLegId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

            /** Duration of the conference call in seconds */
            fun callSec(callSec: Long) = callSec(JsonField.of(callSec))

            /**
             * Sets [Builder.callSec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSec] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSec(callSec: JsonField<Long>) = apply { this.callSec = callSec }

            /** Telnyx UUID that identifies with conference call session */
            fun callSessionId(callSessionId: String) = callSessionId(JsonField.of(callSessionId))

            /**
             * Sets [Builder.callSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSessionId(callSessionId: JsonField<String>) = apply {
                this.callSessionId = callSessionId
            }

            /** Conference id */
            fun conferenceId(conferenceId: String) = conferenceId(JsonField.of(conferenceId))

            /**
             * Sets [Builder.conferenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conferenceId(conferenceId: JsonField<String>) = apply {
                this.conferenceId = conferenceId
            }

            /** Currency amount for Telnyx billing cost */
            fun cost(cost: String) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<String>) = apply { this.cost = cost }

            /** Telnyx account currency used to describe monetary values, including billing cost */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Number called by the participant to join the conference */
            fun destinationNumber(destinationNumber: String) =
                destinationNumber(JsonField.of(destinationNumber))

            /**
             * Sets [Builder.destinationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationNumber(destinationNumber: JsonField<String>) = apply {
                this.destinationNumber = destinationNumber
            }

            /** Indicates whether Telnyx billing charges might be applicable */
            fun isTelnyxBillable(isTelnyxBillable: Boolean) =
                isTelnyxBillable(JsonField.of(isTelnyxBillable))

            /**
             * Sets [Builder.isTelnyxBillable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTelnyxBillable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isTelnyxBillable(isTelnyxBillable: JsonField<Boolean>) = apply {
                this.isTelnyxBillable = isTelnyxBillable
            }

            /** Participant join time */
            fun joinedAt(joinedAt: OffsetDateTime) = joinedAt(JsonField.of(joinedAt))

            /**
             * Sets [Builder.joinedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.joinedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun joinedAt(joinedAt: JsonField<OffsetDateTime>) = apply { this.joinedAt = joinedAt }

            /** Participant leave time */
            fun leftAt(leftAt: OffsetDateTime) = leftAt(JsonField.of(leftAt))

            /**
             * Sets [Builder.leftAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.leftAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun leftAt(leftAt: JsonField<OffsetDateTime>) = apply { this.leftAt = leftAt }

            /** Participant origin number used in the conference call */
            fun originatingNumber(originatingNumber: String) =
                originatingNumber(JsonField.of(originatingNumber))

            /**
             * Sets [Builder.originatingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originatingNumber(originatingNumber: JsonField<String>) = apply {
                this.originatingNumber = originatingNumber
            }

            /** Currency amount per billing unit used to calculate the Telnyx billing cost */
            fun rate(rate: String) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

            /** Billing unit used to calculate the Telnyx billing cost */
            fun rateMeasuredIn(rateMeasuredIn: String) =
                rateMeasuredIn(JsonField.of(rateMeasuredIn))

            /**
             * Sets [Builder.rateMeasuredIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateMeasuredIn] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateMeasuredIn(rateMeasuredIn: JsonField<String>) = apply {
                this.rateMeasuredIn = rateMeasuredIn
            }

            /** User id */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * Returns an immutable instance of [ConferenceParticipantDetailRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConferenceParticipantDetailRecord =
                ConferenceParticipantDetailRecord(
                    checkRequired("recordType", recordType),
                    id,
                    billedSec,
                    callLegId,
                    callSec,
                    callSessionId,
                    conferenceId,
                    cost,
                    currency,
                    destinationNumber,
                    isTelnyxBillable,
                    joinedAt,
                    leftAt,
                    originatingNumber,
                    rate,
                    rateMeasuredIn,
                    userId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ConferenceParticipantDetailRecord = apply {
            if (validated) {
                return@apply
            }

            recordType()
            id()
            billedSec()
            callLegId()
            callSec()
            callSessionId()
            conferenceId()
            cost()
            currency()
            destinationNumber()
            isTelnyxBillable()
            joinedAt()
            leftAt()
            originatingNumber()
            rate()
            rateMeasuredIn()
            userId()
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
            (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (billedSec.asKnown().isPresent) 1 else 0) +
                (if (callLegId.asKnown().isPresent) 1 else 0) +
                (if (callSec.asKnown().isPresent) 1 else 0) +
                (if (callSessionId.asKnown().isPresent) 1 else 0) +
                (if (conferenceId.asKnown().isPresent) 1 else 0) +
                (if (cost.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (destinationNumber.asKnown().isPresent) 1 else 0) +
                (if (isTelnyxBillable.asKnown().isPresent) 1 else 0) +
                (if (joinedAt.asKnown().isPresent) 1 else 0) +
                (if (leftAt.asKnown().isPresent) 1 else 0) +
                (if (originatingNumber.asKnown().isPresent) 1 else 0) +
                (if (rate.asKnown().isPresent) 1 else 0) +
                (if (rateMeasuredIn.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConferenceParticipantDetailRecord &&
                recordType == other.recordType &&
                id == other.id &&
                billedSec == other.billedSec &&
                callLegId == other.callLegId &&
                callSec == other.callSec &&
                callSessionId == other.callSessionId &&
                conferenceId == other.conferenceId &&
                cost == other.cost &&
                currency == other.currency &&
                destinationNumber == other.destinationNumber &&
                isTelnyxBillable == other.isTelnyxBillable &&
                joinedAt == other.joinedAt &&
                leftAt == other.leftAt &&
                originatingNumber == other.originatingNumber &&
                rate == other.rate &&
                rateMeasuredIn == other.rateMeasuredIn &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                recordType,
                id,
                billedSec,
                callLegId,
                callSec,
                callSessionId,
                conferenceId,
                cost,
                currency,
                destinationNumber,
                isTelnyxBillable,
                joinedAt,
                leftAt,
                originatingNumber,
                rate,
                rateMeasuredIn,
                userId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConferenceParticipantDetailRecord{recordType=$recordType, id=$id, billedSec=$billedSec, callLegId=$callLegId, callSec=$callSec, callSessionId=$callSessionId, conferenceId=$conferenceId, cost=$cost, currency=$currency, destinationNumber=$destinationNumber, isTelnyxBillable=$isTelnyxBillable, joinedAt=$joinedAt, leftAt=$leftAt, originatingNumber=$originatingNumber, rate=$rate, rateMeasuredIn=$rateMeasuredIn, userId=$userId, additionalProperties=$additionalProperties}"
    }

    class AmdDetailRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recordType: JsonField<String>,
        private val id: JsonField<String>,
        private val billingGroupId: JsonField<String>,
        private val billingGroupName: JsonField<String>,
        private val callLegId: JsonField<String>,
        private val callSessionId: JsonField<String>,
        private val connectionId: JsonField<String>,
        private val connectionName: JsonField<String>,
        private val cost: JsonField<String>,
        private val currency: JsonField<String>,
        private val feature: JsonField<Feature>,
        private val invokedAt: JsonField<OffsetDateTime>,
        private val isTelnyxBillable: JsonField<Boolean>,
        private val rate: JsonField<String>,
        private val rateMeasuredIn: JsonField<String>,
        private val tags: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_group_name")
            @ExcludeMissing
            billingGroupName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_leg_id")
            @ExcludeMissing
            callLegId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_session_id")
            @ExcludeMissing
            callSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_name")
            @ExcludeMissing
            connectionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("feature") @ExcludeMissing feature: JsonField<Feature> = JsonMissing.of(),
            @JsonProperty("invoked_at")
            @ExcludeMissing
            invokedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("is_telnyx_billable")
            @ExcludeMissing
            isTelnyxBillable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_measured_in")
            @ExcludeMissing
            rateMeasuredIn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<String> = JsonMissing.of(),
        ) : this(
            recordType,
            id,
            billingGroupId,
            billingGroupName,
            callLegId,
            callSessionId,
            connectionId,
            connectionName,
            cost,
            currency,
            feature,
            invokedAt,
            isTelnyxBillable,
            rate,
            rateMeasuredIn,
            tags,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Feature invocation id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Billing Group id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

        /**
         * Name of the Billing Group specified in billing_group_id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupName(): Optional<String> =
            billingGroupName.getOptional("billing_group_name")

        /**
         * Telnyx UUID that identifies the related call leg
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callLegId(): Optional<String> = callLegId.getOptional("call_leg_id")

        /**
         * Telnyx UUID that identifies the related call session
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSessionId(): Optional<String> = callSessionId.getOptional("call_session_id")

        /**
         * Connection id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * Connection name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionName(): Optional<String> = connectionName.getOptional("connection_name")

        /**
         * Currency amount for Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<String> = cost.getOptional("cost")

        /**
         * Telnyx account currency used to describe monetary values, including billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Feature name
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun feature(): Optional<Feature> = feature.getOptional("feature")

        /**
         * Feature invocation time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invokedAt(): Optional<OffsetDateTime> = invokedAt.getOptional("invoked_at")

        /**
         * Indicates whether Telnyx billing charges might be applicable
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTelnyxBillable(): Optional<Boolean> =
            isTelnyxBillable.getOptional("is_telnyx_billable")

        /**
         * Currency amount per billing unit used to calculate the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rate(): Optional<String> = rate.getOptional("rate")

        /**
         * Billing unit used to calculate the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rateMeasuredIn(): Optional<String> = rateMeasuredIn.getOptional("rate_measured_in")

        /**
         * User-provided tags
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<String> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [billingGroupId].
         *
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

        /**
         * Returns the raw JSON value of [billingGroupName].
         *
         * Unlike [billingGroupName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_name")
        @ExcludeMissing
        fun _billingGroupName(): JsonField<String> = billingGroupName

        /**
         * Returns the raw JSON value of [callLegId].
         *
         * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_leg_id") @ExcludeMissing fun _callLegId(): JsonField<String> = callLegId

        /**
         * Returns the raw JSON value of [callSessionId].
         *
         * Unlike [callSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_session_id")
        @ExcludeMissing
        fun _callSessionId(): JsonField<String> = callSessionId

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [connectionName].
         *
         * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_name")
        @ExcludeMissing
        fun _connectionName(): JsonField<String> = connectionName

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [feature].
         *
         * Unlike [feature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feature") @ExcludeMissing fun _feature(): JsonField<Feature> = feature

        /**
         * Returns the raw JSON value of [invokedAt].
         *
         * Unlike [invokedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoked_at")
        @ExcludeMissing
        fun _invokedAt(): JsonField<OffsetDateTime> = invokedAt

        /**
         * Returns the raw JSON value of [isTelnyxBillable].
         *
         * Unlike [isTelnyxBillable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_telnyx_billable")
        @ExcludeMissing
        fun _isTelnyxBillable(): JsonField<Boolean> = isTelnyxBillable

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        /**
         * Returns the raw JSON value of [rateMeasuredIn].
         *
         * Unlike [rateMeasuredIn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rate_measured_in")
        @ExcludeMissing
        fun _rateMeasuredIn(): JsonField<String> = rateMeasuredIn

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<String> = tags

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
             * Returns a mutable builder for constructing an instance of [AmdDetailRecord].
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AmdDetailRecord]. */
        class Builder internal constructor() {

            private var recordType: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var billingGroupName: JsonField<String> = JsonMissing.of()
            private var callLegId: JsonField<String> = JsonMissing.of()
            private var callSessionId: JsonField<String> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var connectionName: JsonField<String> = JsonMissing.of()
            private var cost: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var feature: JsonField<Feature> = JsonMissing.of()
            private var invokedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isTelnyxBillable: JsonField<Boolean> = JsonMissing.of()
            private var rate: JsonField<String> = JsonMissing.of()
            private var rateMeasuredIn: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amdDetailRecord: AmdDetailRecord) = apply {
                recordType = amdDetailRecord.recordType
                id = amdDetailRecord.id
                billingGroupId = amdDetailRecord.billingGroupId
                billingGroupName = amdDetailRecord.billingGroupName
                callLegId = amdDetailRecord.callLegId
                callSessionId = amdDetailRecord.callSessionId
                connectionId = amdDetailRecord.connectionId
                connectionName = amdDetailRecord.connectionName
                cost = amdDetailRecord.cost
                currency = amdDetailRecord.currency
                feature = amdDetailRecord.feature
                invokedAt = amdDetailRecord.invokedAt
                isTelnyxBillable = amdDetailRecord.isTelnyxBillable
                rate = amdDetailRecord.rate
                rateMeasuredIn = amdDetailRecord.rateMeasuredIn
                tags = amdDetailRecord.tags
                additionalProperties = amdDetailRecord.additionalProperties.toMutableMap()
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Feature invocation id */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Billing Group id */
            fun billingGroupId(billingGroupId: String) =
                billingGroupId(JsonField.of(billingGroupId))

            /**
             * Sets [Builder.billingGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingGroupId(billingGroupId: JsonField<String>) = apply {
                this.billingGroupId = billingGroupId
            }

            /** Name of the Billing Group specified in billing_group_id */
            fun billingGroupName(billingGroupName: String) =
                billingGroupName(JsonField.of(billingGroupName))

            /**
             * Sets [Builder.billingGroupName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingGroupName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingGroupName(billingGroupName: JsonField<String>) = apply {
                this.billingGroupName = billingGroupName
            }

            /** Telnyx UUID that identifies the related call leg */
            fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

            /**
             * Sets [Builder.callLegId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callLegId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

            /** Telnyx UUID that identifies the related call session */
            fun callSessionId(callSessionId: String) = callSessionId(JsonField.of(callSessionId))

            /**
             * Sets [Builder.callSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSessionId(callSessionId: JsonField<String>) = apply {
                this.callSessionId = callSessionId
            }

            /** Connection id */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** Connection name */
            fun connectionName(connectionName: String) =
                connectionName(JsonField.of(connectionName))

            /**
             * Sets [Builder.connectionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionName(connectionName: JsonField<String>) = apply {
                this.connectionName = connectionName
            }

            /** Currency amount for Telnyx billing cost */
            fun cost(cost: String) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<String>) = apply { this.cost = cost }

            /** Telnyx account currency used to describe monetary values, including billing cost */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Feature name */
            fun feature(feature: Feature) = feature(JsonField.of(feature))

            /**
             * Sets [Builder.feature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feature] with a well-typed [Feature] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun feature(feature: JsonField<Feature>) = apply { this.feature = feature }

            /** Feature invocation time */
            fun invokedAt(invokedAt: OffsetDateTime) = invokedAt(JsonField.of(invokedAt))

            /**
             * Sets [Builder.invokedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invokedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invokedAt(invokedAt: JsonField<OffsetDateTime>) = apply {
                this.invokedAt = invokedAt
            }

            /** Indicates whether Telnyx billing charges might be applicable */
            fun isTelnyxBillable(isTelnyxBillable: Boolean) =
                isTelnyxBillable(JsonField.of(isTelnyxBillable))

            /**
             * Sets [Builder.isTelnyxBillable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTelnyxBillable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isTelnyxBillable(isTelnyxBillable: JsonField<Boolean>) = apply {
                this.isTelnyxBillable = isTelnyxBillable
            }

            /** Currency amount per billing unit used to calculate the Telnyx billing cost */
            fun rate(rate: String) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

            /** Billing unit used to calculate the Telnyx billing cost */
            fun rateMeasuredIn(rateMeasuredIn: String) =
                rateMeasuredIn(JsonField.of(rateMeasuredIn))

            /**
             * Sets [Builder.rateMeasuredIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateMeasuredIn] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateMeasuredIn(rateMeasuredIn: JsonField<String>) = apply {
                this.rateMeasuredIn = rateMeasuredIn
            }

            /** User-provided tags */
            fun tags(tags: String) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: JsonField<String>) = apply { this.tags = tags }

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
             * Returns an immutable instance of [AmdDetailRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AmdDetailRecord =
                AmdDetailRecord(
                    checkRequired("recordType", recordType),
                    id,
                    billingGroupId,
                    billingGroupName,
                    callLegId,
                    callSessionId,
                    connectionId,
                    connectionName,
                    cost,
                    currency,
                    feature,
                    invokedAt,
                    isTelnyxBillable,
                    rate,
                    rateMeasuredIn,
                    tags,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AmdDetailRecord = apply {
            if (validated) {
                return@apply
            }

            recordType()
            id()
            billingGroupId()
            billingGroupName()
            callLegId()
            callSessionId()
            connectionId()
            connectionName()
            cost()
            currency()
            feature().ifPresent { it.validate() }
            invokedAt()
            isTelnyxBillable()
            rate()
            rateMeasuredIn()
            tags()
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
            (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (billingGroupName.asKnown().isPresent) 1 else 0) +
                (if (callLegId.asKnown().isPresent) 1 else 0) +
                (if (callSessionId.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (connectionName.asKnown().isPresent) 1 else 0) +
                (if (cost.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (feature.asKnown().getOrNull()?.validity() ?: 0) +
                (if (invokedAt.asKnown().isPresent) 1 else 0) +
                (if (isTelnyxBillable.asKnown().isPresent) 1 else 0) +
                (if (rate.asKnown().isPresent) 1 else 0) +
                (if (rateMeasuredIn.asKnown().isPresent) 1 else 0) +
                (if (tags.asKnown().isPresent) 1 else 0)

        /** Feature name */
        class Feature @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val PREMIUM = of("PREMIUM")

                @JvmStatic fun of(value: String) = Feature(JsonField.of(value))
            }

            /** An enum containing [Feature]'s known values. */
            enum class Known {
                PREMIUM
            }

            /**
             * An enum containing [Feature]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Feature] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PREMIUM,
                /**
                 * An enum member indicating that [Feature] was instantiated with an unknown value.
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
                    PREMIUM -> Value.PREMIUM
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
                    PREMIUM -> Known.PREMIUM
                    else -> throw TelnyxInvalidDataException("Unknown Feature: $value")
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

            fun validate(): Feature = apply {
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

                return other is Feature && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AmdDetailRecord &&
                recordType == other.recordType &&
                id == other.id &&
                billingGroupId == other.billingGroupId &&
                billingGroupName == other.billingGroupName &&
                callLegId == other.callLegId &&
                callSessionId == other.callSessionId &&
                connectionId == other.connectionId &&
                connectionName == other.connectionName &&
                cost == other.cost &&
                currency == other.currency &&
                feature == other.feature &&
                invokedAt == other.invokedAt &&
                isTelnyxBillable == other.isTelnyxBillable &&
                rate == other.rate &&
                rateMeasuredIn == other.rateMeasuredIn &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                recordType,
                id,
                billingGroupId,
                billingGroupName,
                callLegId,
                callSessionId,
                connectionId,
                connectionName,
                cost,
                currency,
                feature,
                invokedAt,
                isTelnyxBillable,
                rate,
                rateMeasuredIn,
                tags,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AmdDetailRecord{recordType=$recordType, id=$id, billingGroupId=$billingGroupId, billingGroupName=$billingGroupName, callLegId=$callLegId, callSessionId=$callSessionId, connectionId=$connectionId, connectionName=$connectionName, cost=$cost, currency=$currency, feature=$feature, invokedAt=$invokedAt, isTelnyxBillable=$isTelnyxBillable, rate=$rate, rateMeasuredIn=$rateMeasuredIn, tags=$tags, additionalProperties=$additionalProperties}"
    }

    class VerifyDetailRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recordType: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val deliveryStatus: JsonField<String>,
        private val destinationPhoneNumber: JsonField<String>,
        private val rate: JsonField<String>,
        private val rateMeasuredIn: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val verificationStatus: JsonField<String>,
        private val verifyChannelId: JsonField<String>,
        private val verifyChannelType: JsonField<VerifyChannelType>,
        private val verifyProfileId: JsonField<String>,
        private val verifyUsageFee: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delivery_status")
            @ExcludeMissing
            deliveryStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_phone_number")
            @ExcludeMissing
            destinationPhoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_measured_in")
            @ExcludeMissing
            rateMeasuredIn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("verification_status")
            @ExcludeMissing
            verificationStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verify_channel_id")
            @ExcludeMissing
            verifyChannelId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verify_channel_type")
            @ExcludeMissing
            verifyChannelType: JsonField<VerifyChannelType> = JsonMissing.of(),
            @JsonProperty("verify_profile_id")
            @ExcludeMissing
            verifyProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verify_usage_fee")
            @ExcludeMissing
            verifyUsageFee: JsonField<String> = JsonMissing.of(),
        ) : this(
            recordType,
            id,
            createdAt,
            currency,
            deliveryStatus,
            destinationPhoneNumber,
            rate,
            rateMeasuredIn,
            updatedAt,
            verificationStatus,
            verifyChannelId,
            verifyChannelType,
            verifyProfileId,
            verifyUsageFee,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Unique ID of the verification
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Telnyx account currency used to describe monetary values, including billing costs
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deliveryStatus(): Optional<String> = deliveryStatus.getOptional("delivery_status")

        /**
         * E.164 formatted phone number
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun destinationPhoneNumber(): Optional<String> =
            destinationPhoneNumber.getOptional("destination_phone_number")

        /**
         * Currency amount per billing unit used to calculate the Telnyx billing costs
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rate(): Optional<String> = rate.getOptional("rate")

        /**
         * Billing unit used to calculate the Telnyx billing costs
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rateMeasuredIn(): Optional<String> = rateMeasuredIn.getOptional("rate_measured_in")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verificationStatus(): Optional<String> =
            verificationStatus.getOptional("verification_status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verifyChannelId(): Optional<String> = verifyChannelId.getOptional("verify_channel_id")

        /**
         * Depending on the type of verification, the `verify_channel_id` points to one of the
         * following channel ids;
         * ---
         * verify_channel_type | verify_channel_id
         *
         * ------------------- | -----------------
         * sms, psd2 | messaging_id call, flashcall | call_control_id
         * ---
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verifyChannelType(): Optional<VerifyChannelType> =
            verifyChannelType.getOptional("verify_channel_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verifyProfileId(): Optional<String> = verifyProfileId.getOptional("verify_profile_id")

        /**
         * Currency amount for Verify Usage Fee
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verifyUsageFee(): Optional<String> = verifyUsageFee.getOptional("verify_usage_fee")

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [deliveryStatus].
         *
         * Unlike [deliveryStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_status")
        @ExcludeMissing
        fun _deliveryStatus(): JsonField<String> = deliveryStatus

        /**
         * Returns the raw JSON value of [destinationPhoneNumber].
         *
         * Unlike [destinationPhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("destination_phone_number")
        @ExcludeMissing
        fun _destinationPhoneNumber(): JsonField<String> = destinationPhoneNumber

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        /**
         * Returns the raw JSON value of [rateMeasuredIn].
         *
         * Unlike [rateMeasuredIn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rate_measured_in")
        @ExcludeMissing
        fun _rateMeasuredIn(): JsonField<String> = rateMeasuredIn

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [verificationStatus].
         *
         * Unlike [verificationStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("verification_status")
        @ExcludeMissing
        fun _verificationStatus(): JsonField<String> = verificationStatus

        /**
         * Returns the raw JSON value of [verifyChannelId].
         *
         * Unlike [verifyChannelId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("verify_channel_id")
        @ExcludeMissing
        fun _verifyChannelId(): JsonField<String> = verifyChannelId

        /**
         * Returns the raw JSON value of [verifyChannelType].
         *
         * Unlike [verifyChannelType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("verify_channel_type")
        @ExcludeMissing
        fun _verifyChannelType(): JsonField<VerifyChannelType> = verifyChannelType

        /**
         * Returns the raw JSON value of [verifyProfileId].
         *
         * Unlike [verifyProfileId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("verify_profile_id")
        @ExcludeMissing
        fun _verifyProfileId(): JsonField<String> = verifyProfileId

        /**
         * Returns the raw JSON value of [verifyUsageFee].
         *
         * Unlike [verifyUsageFee], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("verify_usage_fee")
        @ExcludeMissing
        fun _verifyUsageFee(): JsonField<String> = verifyUsageFee

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
             * Returns a mutable builder for constructing an instance of [VerifyDetailRecord].
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VerifyDetailRecord]. */
        class Builder internal constructor() {

            private var recordType: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var deliveryStatus: JsonField<String> = JsonMissing.of()
            private var destinationPhoneNumber: JsonField<String> = JsonMissing.of()
            private var rate: JsonField<String> = JsonMissing.of()
            private var rateMeasuredIn: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var verificationStatus: JsonField<String> = JsonMissing.of()
            private var verifyChannelId: JsonField<String> = JsonMissing.of()
            private var verifyChannelType: JsonField<VerifyChannelType> = JsonMissing.of()
            private var verifyProfileId: JsonField<String> = JsonMissing.of()
            private var verifyUsageFee: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verifyDetailRecord: VerifyDetailRecord) = apply {
                recordType = verifyDetailRecord.recordType
                id = verifyDetailRecord.id
                createdAt = verifyDetailRecord.createdAt
                currency = verifyDetailRecord.currency
                deliveryStatus = verifyDetailRecord.deliveryStatus
                destinationPhoneNumber = verifyDetailRecord.destinationPhoneNumber
                rate = verifyDetailRecord.rate
                rateMeasuredIn = verifyDetailRecord.rateMeasuredIn
                updatedAt = verifyDetailRecord.updatedAt
                verificationStatus = verifyDetailRecord.verificationStatus
                verifyChannelId = verifyDetailRecord.verifyChannelId
                verifyChannelType = verifyDetailRecord.verifyChannelType
                verifyProfileId = verifyDetailRecord.verifyProfileId
                verifyUsageFee = verifyDetailRecord.verifyUsageFee
                additionalProperties = verifyDetailRecord.additionalProperties.toMutableMap()
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Unique ID of the verification */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Telnyx account currency used to describe monetary values, including billing costs */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun deliveryStatus(deliveryStatus: String) =
                deliveryStatus(JsonField.of(deliveryStatus))

            /**
             * Sets [Builder.deliveryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deliveryStatus(deliveryStatus: JsonField<String>) = apply {
                this.deliveryStatus = deliveryStatus
            }

            /** E.164 formatted phone number */
            fun destinationPhoneNumber(destinationPhoneNumber: String) =
                destinationPhoneNumber(JsonField.of(destinationPhoneNumber))

            /**
             * Sets [Builder.destinationPhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationPhoneNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinationPhoneNumber(destinationPhoneNumber: JsonField<String>) = apply {
                this.destinationPhoneNumber = destinationPhoneNumber
            }

            /** Currency amount per billing unit used to calculate the Telnyx billing costs */
            fun rate(rate: String) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

            /** Billing unit used to calculate the Telnyx billing costs */
            fun rateMeasuredIn(rateMeasuredIn: String) =
                rateMeasuredIn(JsonField.of(rateMeasuredIn))

            /**
             * Sets [Builder.rateMeasuredIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateMeasuredIn] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateMeasuredIn(rateMeasuredIn: JsonField<String>) = apply {
                this.rateMeasuredIn = rateMeasuredIn
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun verificationStatus(verificationStatus: String) =
                verificationStatus(JsonField.of(verificationStatus))

            /**
             * Sets [Builder.verificationStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verificationStatus(verificationStatus: JsonField<String>) = apply {
                this.verificationStatus = verificationStatus
            }

            fun verifyChannelId(verifyChannelId: String) =
                verifyChannelId(JsonField.of(verifyChannelId))

            /**
             * Sets [Builder.verifyChannelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verifyChannelId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verifyChannelId(verifyChannelId: JsonField<String>) = apply {
                this.verifyChannelId = verifyChannelId
            }

            /**
             * Depending on the type of verification, the `verify_channel_id` points to one of the
             * following channel ids;
             * ---
             * verify_channel_type | verify_channel_id
             *
             * ------------------- | -----------------
             * sms, psd2 | messaging_id call, flashcall | call_control_id
             * ---
             */
            fun verifyChannelType(verifyChannelType: VerifyChannelType) =
                verifyChannelType(JsonField.of(verifyChannelType))

            /**
             * Sets [Builder.verifyChannelType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verifyChannelType] with a well-typed
             * [VerifyChannelType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun verifyChannelType(verifyChannelType: JsonField<VerifyChannelType>) = apply {
                this.verifyChannelType = verifyChannelType
            }

            fun verifyProfileId(verifyProfileId: String) =
                verifyProfileId(JsonField.of(verifyProfileId))

            /**
             * Sets [Builder.verifyProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verifyProfileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verifyProfileId(verifyProfileId: JsonField<String>) = apply {
                this.verifyProfileId = verifyProfileId
            }

            /** Currency amount for Verify Usage Fee */
            fun verifyUsageFee(verifyUsageFee: String) =
                verifyUsageFee(JsonField.of(verifyUsageFee))

            /**
             * Sets [Builder.verifyUsageFee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verifyUsageFee] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verifyUsageFee(verifyUsageFee: JsonField<String>) = apply {
                this.verifyUsageFee = verifyUsageFee
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
             * Returns an immutable instance of [VerifyDetailRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): VerifyDetailRecord =
                VerifyDetailRecord(
                    checkRequired("recordType", recordType),
                    id,
                    createdAt,
                    currency,
                    deliveryStatus,
                    destinationPhoneNumber,
                    rate,
                    rateMeasuredIn,
                    updatedAt,
                    verificationStatus,
                    verifyChannelId,
                    verifyChannelType,
                    verifyProfileId,
                    verifyUsageFee,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VerifyDetailRecord = apply {
            if (validated) {
                return@apply
            }

            recordType()
            id()
            createdAt()
            currency()
            deliveryStatus()
            destinationPhoneNumber()
            rate()
            rateMeasuredIn()
            updatedAt()
            verificationStatus()
            verifyChannelId()
            verifyChannelType().ifPresent { it.validate() }
            verifyProfileId()
            verifyUsageFee()
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
            (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (deliveryStatus.asKnown().isPresent) 1 else 0) +
                (if (destinationPhoneNumber.asKnown().isPresent) 1 else 0) +
                (if (rate.asKnown().isPresent) 1 else 0) +
                (if (rateMeasuredIn.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (verificationStatus.asKnown().isPresent) 1 else 0) +
                (if (verifyChannelId.asKnown().isPresent) 1 else 0) +
                (verifyChannelType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (verifyProfileId.asKnown().isPresent) 1 else 0) +
                (if (verifyUsageFee.asKnown().isPresent) 1 else 0)

        /**
         * Depending on the type of verification, the `verify_channel_id` points to one of the
         * following channel ids;
         * ---
         * verify_channel_type | verify_channel_id
         *
         * ------------------- | -----------------
         * sms, psd2 | messaging_id call, flashcall | call_control_id
         * ---
         */
        class VerifyChannelType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val SMS = of("sms")

                @JvmField val PSD2 = of("psd2")

                @JvmField val CALL = of("call")

                @JvmField val FLASHCALL = of("flashcall")

                @JvmStatic fun of(value: String) = VerifyChannelType(JsonField.of(value))
            }

            /** An enum containing [VerifyChannelType]'s known values. */
            enum class Known {
                SMS,
                PSD2,
                CALL,
                FLASHCALL,
            }

            /**
             * An enum containing [VerifyChannelType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [VerifyChannelType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SMS,
                PSD2,
                CALL,
                FLASHCALL,
                /**
                 * An enum member indicating that [VerifyChannelType] was instantiated with an
                 * unknown value.
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
                    SMS -> Value.SMS
                    PSD2 -> Value.PSD2
                    CALL -> Value.CALL
                    FLASHCALL -> Value.FLASHCALL
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
                    SMS -> Known.SMS
                    PSD2 -> Known.PSD2
                    CALL -> Known.CALL
                    FLASHCALL -> Known.FLASHCALL
                    else -> throw TelnyxInvalidDataException("Unknown VerifyChannelType: $value")
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

            fun validate(): VerifyChannelType = apply {
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

                return other is VerifyChannelType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerifyDetailRecord &&
                recordType == other.recordType &&
                id == other.id &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                deliveryStatus == other.deliveryStatus &&
                destinationPhoneNumber == other.destinationPhoneNumber &&
                rate == other.rate &&
                rateMeasuredIn == other.rateMeasuredIn &&
                updatedAt == other.updatedAt &&
                verificationStatus == other.verificationStatus &&
                verifyChannelId == other.verifyChannelId &&
                verifyChannelType == other.verifyChannelType &&
                verifyProfileId == other.verifyProfileId &&
                verifyUsageFee == other.verifyUsageFee &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                recordType,
                id,
                createdAt,
                currency,
                deliveryStatus,
                destinationPhoneNumber,
                rate,
                rateMeasuredIn,
                updatedAt,
                verificationStatus,
                verifyChannelId,
                verifyChannelType,
                verifyProfileId,
                verifyUsageFee,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerifyDetailRecord{recordType=$recordType, id=$id, createdAt=$createdAt, currency=$currency, deliveryStatus=$deliveryStatus, destinationPhoneNumber=$destinationPhoneNumber, rate=$rate, rateMeasuredIn=$rateMeasuredIn, updatedAt=$updatedAt, verificationStatus=$verificationStatus, verifyChannelId=$verifyChannelId, verifyChannelType=$verifyChannelType, verifyProfileId=$verifyProfileId, verifyUsageFee=$verifyUsageFee, additionalProperties=$additionalProperties}"
    }

    class SimCardUsageDetailRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recordType: JsonField<String>,
        private val id: JsonField<String>,
        private val closedAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val dataCost: JsonField<Double>,
        private val dataRate: JsonField<String>,
        private val dataUnit: JsonField<String>,
        private val downlinkData: JsonField<Double>,
        private val imsi: JsonField<String>,
        private val ipAddress: JsonField<String>,
        private val mcc: JsonField<String>,
        private val mnc: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val simCardId: JsonField<String>,
        private val simCardTags: JsonField<String>,
        private val simGroupId: JsonField<String>,
        private val simGroupName: JsonField<String>,
        private val uplinkData: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("closed_at")
            @ExcludeMissing
            closedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data_cost")
            @ExcludeMissing
            dataCost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("data_rate")
            @ExcludeMissing
            dataRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data_unit")
            @ExcludeMissing
            dataUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("downlink_data")
            @ExcludeMissing
            downlinkData: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("imsi") @ExcludeMissing imsi: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ip_address")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mnc") @ExcludeMissing mnc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sim_card_id")
            @ExcludeMissing
            simCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sim_card_tags")
            @ExcludeMissing
            simCardTags: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sim_group_id")
            @ExcludeMissing
            simGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sim_group_name")
            @ExcludeMissing
            simGroupName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uplink_data")
            @ExcludeMissing
            uplinkData: JsonField<Double> = JsonMissing.of(),
        ) : this(
            recordType,
            id,
            closedAt,
            createdAt,
            currency,
            dataCost,
            dataRate,
            dataUnit,
            downlinkData,
            imsi,
            ipAddress,
            mcc,
            mnc,
            phoneNumber,
            simCardId,
            simCardTags,
            simGroupId,
            simGroupName,
            uplinkData,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Unique identifier for this SIM Card Usage
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Event close time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun closedAt(): Optional<OffsetDateTime> = closedAt.getOptional("closed_at")

        /**
         * Event creation time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Telnyx account currency used to describe monetary values, including billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Data cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dataCost(): Optional<Double> = dataCost.getOptional("data_cost")

        /**
         * Currency amount per billing unit used to calculate the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dataRate(): Optional<String> = dataRate.getOptional("data_rate")

        /**
         * Unit of wireless link consumption
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dataUnit(): Optional<String> = dataUnit.getOptional("data_unit")

        /**
         * Number of megabytes downloaded
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun downlinkData(): Optional<Double> = downlinkData.getOptional("downlink_data")

        /**
         * International Mobile Subscriber Identity
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imsi(): Optional<String> = imsi.getOptional("imsi")

        /**
         * Ip address that generated the event
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

        /**
         * Mobile country code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcc(): Optional<String> = mcc.getOptional("mcc")

        /**
         * Mobile network code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mnc(): Optional<String> = mnc.getOptional("mnc")

        /**
         * Telephone number associated to SIM card
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Unique identifier for SIM card
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simCardId(): Optional<String> = simCardId.getOptional("sim_card_id")

        /**
         * User-provided tags
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simCardTags(): Optional<String> = simCardTags.getOptional("sim_card_tags")

        /**
         * Unique identifier for SIM group
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simGroupId(): Optional<String> = simGroupId.getOptional("sim_group_id")

        /**
         * Sim group name for sim card
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simGroupName(): Optional<String> = simGroupName.getOptional("sim_group_name")

        /**
         * Number of megabytes uploaded
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uplinkData(): Optional<Double> = uplinkData.getOptional("uplink_data")

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [closedAt].
         *
         * Unlike [closedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("closed_at")
        @ExcludeMissing
        fun _closedAt(): JsonField<OffsetDateTime> = closedAt

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [dataCost].
         *
         * Unlike [dataCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data_cost") @ExcludeMissing fun _dataCost(): JsonField<Double> = dataCost

        /**
         * Returns the raw JSON value of [dataRate].
         *
         * Unlike [dataRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data_rate") @ExcludeMissing fun _dataRate(): JsonField<String> = dataRate

        /**
         * Returns the raw JSON value of [dataUnit].
         *
         * Unlike [dataUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data_unit") @ExcludeMissing fun _dataUnit(): JsonField<String> = dataUnit

        /**
         * Returns the raw JSON value of [downlinkData].
         *
         * Unlike [downlinkData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("downlink_data")
        @ExcludeMissing
        fun _downlinkData(): JsonField<Double> = downlinkData

        /**
         * Returns the raw JSON value of [imsi].
         *
         * Unlike [imsi], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imsi") @ExcludeMissing fun _imsi(): JsonField<String> = imsi

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_address") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

        /**
         * Returns the raw JSON value of [mcc].
         *
         * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /**
         * Returns the raw JSON value of [mnc].
         *
         * Unlike [mnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mnc") @ExcludeMissing fun _mnc(): JsonField<String> = mnc

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [simCardId].
         *
         * Unlike [simCardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sim_card_id") @ExcludeMissing fun _simCardId(): JsonField<String> = simCardId

        /**
         * Returns the raw JSON value of [simCardTags].
         *
         * Unlike [simCardTags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sim_card_tags")
        @ExcludeMissing
        fun _simCardTags(): JsonField<String> = simCardTags

        /**
         * Returns the raw JSON value of [simGroupId].
         *
         * Unlike [simGroupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sim_group_id")
        @ExcludeMissing
        fun _simGroupId(): JsonField<String> = simGroupId

        /**
         * Returns the raw JSON value of [simGroupName].
         *
         * Unlike [simGroupName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sim_group_name")
        @ExcludeMissing
        fun _simGroupName(): JsonField<String> = simGroupName

        /**
         * Returns the raw JSON value of [uplinkData].
         *
         * Unlike [uplinkData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uplink_data")
        @ExcludeMissing
        fun _uplinkData(): JsonField<Double> = uplinkData

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
             * Returns a mutable builder for constructing an instance of [SimCardUsageDetailRecord].
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimCardUsageDetailRecord]. */
        class Builder internal constructor() {

            private var recordType: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var closedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var dataCost: JsonField<Double> = JsonMissing.of()
            private var dataRate: JsonField<String> = JsonMissing.of()
            private var dataUnit: JsonField<String> = JsonMissing.of()
            private var downlinkData: JsonField<Double> = JsonMissing.of()
            private var imsi: JsonField<String> = JsonMissing.of()
            private var ipAddress: JsonField<String> = JsonMissing.of()
            private var mcc: JsonField<String> = JsonMissing.of()
            private var mnc: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var simCardId: JsonField<String> = JsonMissing.of()
            private var simCardTags: JsonField<String> = JsonMissing.of()
            private var simGroupId: JsonField<String> = JsonMissing.of()
            private var simGroupName: JsonField<String> = JsonMissing.of()
            private var uplinkData: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simCardUsageDetailRecord: SimCardUsageDetailRecord) = apply {
                recordType = simCardUsageDetailRecord.recordType
                id = simCardUsageDetailRecord.id
                closedAt = simCardUsageDetailRecord.closedAt
                createdAt = simCardUsageDetailRecord.createdAt
                currency = simCardUsageDetailRecord.currency
                dataCost = simCardUsageDetailRecord.dataCost
                dataRate = simCardUsageDetailRecord.dataRate
                dataUnit = simCardUsageDetailRecord.dataUnit
                downlinkData = simCardUsageDetailRecord.downlinkData
                imsi = simCardUsageDetailRecord.imsi
                ipAddress = simCardUsageDetailRecord.ipAddress
                mcc = simCardUsageDetailRecord.mcc
                mnc = simCardUsageDetailRecord.mnc
                phoneNumber = simCardUsageDetailRecord.phoneNumber
                simCardId = simCardUsageDetailRecord.simCardId
                simCardTags = simCardUsageDetailRecord.simCardTags
                simGroupId = simCardUsageDetailRecord.simGroupId
                simGroupName = simCardUsageDetailRecord.simGroupName
                uplinkData = simCardUsageDetailRecord.uplinkData
                additionalProperties = simCardUsageDetailRecord.additionalProperties.toMutableMap()
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Unique identifier for this SIM Card Usage */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Event close time */
            fun closedAt(closedAt: OffsetDateTime) = closedAt(JsonField.of(closedAt))

            /**
             * Sets [Builder.closedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.closedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun closedAt(closedAt: JsonField<OffsetDateTime>) = apply { this.closedAt = closedAt }

            /** Event creation time */
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

            /** Telnyx account currency used to describe monetary values, including billing cost */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Data cost */
            fun dataCost(dataCost: Double) = dataCost(JsonField.of(dataCost))

            /**
             * Sets [Builder.dataCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataCost] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataCost(dataCost: JsonField<Double>) = apply { this.dataCost = dataCost }

            /** Currency amount per billing unit used to calculate the Telnyx billing cost */
            fun dataRate(dataRate: String) = dataRate(JsonField.of(dataRate))

            /**
             * Sets [Builder.dataRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataRate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataRate(dataRate: JsonField<String>) = apply { this.dataRate = dataRate }

            /** Unit of wireless link consumption */
            fun dataUnit(dataUnit: String) = dataUnit(JsonField.of(dataUnit))

            /**
             * Sets [Builder.dataUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataUnit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataUnit(dataUnit: JsonField<String>) = apply { this.dataUnit = dataUnit }

            /** Number of megabytes downloaded */
            fun downlinkData(downlinkData: Double) = downlinkData(JsonField.of(downlinkData))

            /**
             * Sets [Builder.downlinkData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.downlinkData] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun downlinkData(downlinkData: JsonField<Double>) = apply {
                this.downlinkData = downlinkData
            }

            /** International Mobile Subscriber Identity */
            fun imsi(imsi: String) = imsi(JsonField.of(imsi))

            /**
             * Sets [Builder.imsi] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imsi] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun imsi(imsi: JsonField<String>) = apply { this.imsi = imsi }

            /** Ip address that generated the event */
            fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            /** Mobile country code */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Sets [Builder.mcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Mobile network code */
            fun mnc(mnc: String) = mnc(JsonField.of(mnc))

            /**
             * Sets [Builder.mnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mnc(mnc: JsonField<String>) = apply { this.mnc = mnc }

            /** Telephone number associated to SIM card */
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

            /** Unique identifier for SIM card */
            fun simCardId(simCardId: String) = simCardId(JsonField.of(simCardId))

            /**
             * Sets [Builder.simCardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simCardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun simCardId(simCardId: JsonField<String>) = apply { this.simCardId = simCardId }

            /** User-provided tags */
            fun simCardTags(simCardTags: String) = simCardTags(JsonField.of(simCardTags))

            /**
             * Sets [Builder.simCardTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simCardTags] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun simCardTags(simCardTags: JsonField<String>) = apply {
                this.simCardTags = simCardTags
            }

            /** Unique identifier for SIM group */
            fun simGroupId(simGroupId: String) = simGroupId(JsonField.of(simGroupId))

            /**
             * Sets [Builder.simGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun simGroupId(simGroupId: JsonField<String>) = apply { this.simGroupId = simGroupId }

            /** Sim group name for sim card */
            fun simGroupName(simGroupName: String) = simGroupName(JsonField.of(simGroupName))

            /**
             * Sets [Builder.simGroupName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simGroupName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun simGroupName(simGroupName: JsonField<String>) = apply {
                this.simGroupName = simGroupName
            }

            /** Number of megabytes uploaded */
            fun uplinkData(uplinkData: Double) = uplinkData(JsonField.of(uplinkData))

            /**
             * Sets [Builder.uplinkData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uplinkData] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uplinkData(uplinkData: JsonField<Double>) = apply { this.uplinkData = uplinkData }

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
             * Returns an immutable instance of [SimCardUsageDetailRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SimCardUsageDetailRecord =
                SimCardUsageDetailRecord(
                    checkRequired("recordType", recordType),
                    id,
                    closedAt,
                    createdAt,
                    currency,
                    dataCost,
                    dataRate,
                    dataUnit,
                    downlinkData,
                    imsi,
                    ipAddress,
                    mcc,
                    mnc,
                    phoneNumber,
                    simCardId,
                    simCardTags,
                    simGroupId,
                    simGroupName,
                    uplinkData,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SimCardUsageDetailRecord = apply {
            if (validated) {
                return@apply
            }

            recordType()
            id()
            closedAt()
            createdAt()
            currency()
            dataCost()
            dataRate()
            dataUnit()
            downlinkData()
            imsi()
            ipAddress()
            mcc()
            mnc()
            phoneNumber()
            simCardId()
            simCardTags()
            simGroupId()
            simGroupName()
            uplinkData()
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
            (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (closedAt.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (dataCost.asKnown().isPresent) 1 else 0) +
                (if (dataRate.asKnown().isPresent) 1 else 0) +
                (if (dataUnit.asKnown().isPresent) 1 else 0) +
                (if (downlinkData.asKnown().isPresent) 1 else 0) +
                (if (imsi.asKnown().isPresent) 1 else 0) +
                (if (ipAddress.asKnown().isPresent) 1 else 0) +
                (if (mcc.asKnown().isPresent) 1 else 0) +
                (if (mnc.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (simCardId.asKnown().isPresent) 1 else 0) +
                (if (simCardTags.asKnown().isPresent) 1 else 0) +
                (if (simGroupId.asKnown().isPresent) 1 else 0) +
                (if (simGroupName.asKnown().isPresent) 1 else 0) +
                (if (uplinkData.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimCardUsageDetailRecord &&
                recordType == other.recordType &&
                id == other.id &&
                closedAt == other.closedAt &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                dataCost == other.dataCost &&
                dataRate == other.dataRate &&
                dataUnit == other.dataUnit &&
                downlinkData == other.downlinkData &&
                imsi == other.imsi &&
                ipAddress == other.ipAddress &&
                mcc == other.mcc &&
                mnc == other.mnc &&
                phoneNumber == other.phoneNumber &&
                simCardId == other.simCardId &&
                simCardTags == other.simCardTags &&
                simGroupId == other.simGroupId &&
                simGroupName == other.simGroupName &&
                uplinkData == other.uplinkData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                recordType,
                id,
                closedAt,
                createdAt,
                currency,
                dataCost,
                dataRate,
                dataUnit,
                downlinkData,
                imsi,
                ipAddress,
                mcc,
                mnc,
                phoneNumber,
                simCardId,
                simCardTags,
                simGroupId,
                simGroupName,
                uplinkData,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimCardUsageDetailRecord{recordType=$recordType, id=$id, closedAt=$closedAt, createdAt=$createdAt, currency=$currency, dataCost=$dataCost, dataRate=$dataRate, dataUnit=$dataUnit, downlinkData=$downlinkData, imsi=$imsi, ipAddress=$ipAddress, mcc=$mcc, mnc=$mnc, phoneNumber=$phoneNumber, simCardId=$simCardId, simCardTags=$simCardTags, simGroupId=$simGroupId, simGroupName=$simGroupName, uplinkData=$uplinkData, additionalProperties=$additionalProperties}"
    }

    class MediaStorageDetailRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recordType: JsonField<String>,
        private val id: JsonField<String>,
        private val actionType: JsonField<String>,
        private val assetId: JsonField<String>,
        private val cost: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val linkChannelId: JsonField<String>,
        private val linkChannelType: JsonField<String>,
        private val orgId: JsonField<String>,
        private val rate: JsonField<String>,
        private val rateMeasuredIn: JsonField<String>,
        private val status: JsonField<String>,
        private val userId: JsonField<String>,
        private val webhookId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("asset_id") @ExcludeMissing assetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("link_channel_id")
            @ExcludeMissing
            linkChannelId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("link_channel_type")
            @ExcludeMissing
            linkChannelType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_measured_in")
            @ExcludeMissing
            rateMeasuredIn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_id")
            @ExcludeMissing
            webhookId: JsonField<String> = JsonMissing.of(),
        ) : this(
            recordType,
            id,
            actionType,
            assetId,
            cost,
            createdAt,
            currency,
            linkChannelId,
            linkChannelType,
            orgId,
            rate,
            rateMeasuredIn,
            status,
            userId,
            webhookId,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): String = recordType.getRequired("record_type")

        /**
         * Unique identifier for the Media Storage Event
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Type of action performed against the Media Storage API
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actionType(): Optional<String> = actionType.getOptional("action_type")

        /**
         * Asset id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assetId(): Optional<String> = assetId.getOptional("asset_id")

        /**
         * Currency amount for Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<String> = cost.getOptional("cost")

        /**
         * Event creation time
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Telnyx account currency used to describe monetary values, including billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Link channel id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkChannelId(): Optional<String> = linkChannelId.getOptional("link_channel_id")

        /**
         * Link channel type
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkChannelType(): Optional<String> = linkChannelType.getOptional("link_channel_type")

        /**
         * Organization owner id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun orgId(): Optional<String> = orgId.getOptional("org_id")

        /**
         * Currency amount per billing unit used to calculate the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rate(): Optional<String> = rate.getOptional("rate")

        /**
         * Billing unit used to calculate the Telnyx billing cost
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rateMeasuredIn(): Optional<String> = rateMeasuredIn.getOptional("rate_measured_in")

        /**
         * Request status
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * User id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Webhook id
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookId(): Optional<String> = webhookId.getOptional("webhook_id")

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [actionType].
         *
         * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun _actionType(): JsonField<String> = actionType

        /**
         * Returns the raw JSON value of [assetId].
         *
         * Unlike [assetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("asset_id") @ExcludeMissing fun _assetId(): JsonField<String> = assetId

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [linkChannelId].
         *
         * Unlike [linkChannelId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("link_channel_id")
        @ExcludeMissing
        fun _linkChannelId(): JsonField<String> = linkChannelId

        /**
         * Returns the raw JSON value of [linkChannelType].
         *
         * Unlike [linkChannelType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("link_channel_type")
        @ExcludeMissing
        fun _linkChannelType(): JsonField<String> = linkChannelType

        /**
         * Returns the raw JSON value of [orgId].
         *
         * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        /**
         * Returns the raw JSON value of [rateMeasuredIn].
         *
         * Unlike [rateMeasuredIn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rate_measured_in")
        @ExcludeMissing
        fun _rateMeasuredIn(): JsonField<String> = rateMeasuredIn

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [webhookId].
         *
         * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_id") @ExcludeMissing fun _webhookId(): JsonField<String> = webhookId

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
             * Returns a mutable builder for constructing an instance of [MediaStorageDetailRecord].
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MediaStorageDetailRecord]. */
        class Builder internal constructor() {

            private var recordType: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var actionType: JsonField<String> = JsonMissing.of()
            private var assetId: JsonField<String> = JsonMissing.of()
            private var cost: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var linkChannelId: JsonField<String> = JsonMissing.of()
            private var linkChannelType: JsonField<String> = JsonMissing.of()
            private var orgId: JsonField<String> = JsonMissing.of()
            private var rate: JsonField<String> = JsonMissing.of()
            private var rateMeasuredIn: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var webhookId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mediaStorageDetailRecord: MediaStorageDetailRecord) = apply {
                recordType = mediaStorageDetailRecord.recordType
                id = mediaStorageDetailRecord.id
                actionType = mediaStorageDetailRecord.actionType
                assetId = mediaStorageDetailRecord.assetId
                cost = mediaStorageDetailRecord.cost
                createdAt = mediaStorageDetailRecord.createdAt
                currency = mediaStorageDetailRecord.currency
                linkChannelId = mediaStorageDetailRecord.linkChannelId
                linkChannelType = mediaStorageDetailRecord.linkChannelType
                orgId = mediaStorageDetailRecord.orgId
                rate = mediaStorageDetailRecord.rate
                rateMeasuredIn = mediaStorageDetailRecord.rateMeasuredIn
                status = mediaStorageDetailRecord.status
                userId = mediaStorageDetailRecord.userId
                webhookId = mediaStorageDetailRecord.webhookId
                additionalProperties = mediaStorageDetailRecord.additionalProperties.toMutableMap()
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** Unique identifier for the Media Storage Event */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Type of action performed against the Media Storage API */
            fun actionType(actionType: String) = actionType(JsonField.of(actionType))

            /**
             * Sets [Builder.actionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionType(actionType: JsonField<String>) = apply { this.actionType = actionType }

            /** Asset id */
            fun assetId(assetId: String) = assetId(JsonField.of(assetId))

            /**
             * Sets [Builder.assetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assetId(assetId: JsonField<String>) = apply { this.assetId = assetId }

            /** Currency amount for Telnyx billing cost */
            fun cost(cost: String) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<String>) = apply { this.cost = cost }

            /** Event creation time */
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

            /** Telnyx account currency used to describe monetary values, including billing cost */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Link channel id */
            fun linkChannelId(linkChannelId: String) = linkChannelId(JsonField.of(linkChannelId))

            /**
             * Sets [Builder.linkChannelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkChannelId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkChannelId(linkChannelId: JsonField<String>) = apply {
                this.linkChannelId = linkChannelId
            }

            /** Link channel type */
            fun linkChannelType(linkChannelType: String) =
                linkChannelType(JsonField.of(linkChannelType))

            /**
             * Sets [Builder.linkChannelType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkChannelType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkChannelType(linkChannelType: JsonField<String>) = apply {
                this.linkChannelType = linkChannelType
            }

            /** Organization owner id */
            fun orgId(orgId: String) = orgId(JsonField.of(orgId))

            /**
             * Sets [Builder.orgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

            /** Currency amount per billing unit used to calculate the Telnyx billing cost */
            fun rate(rate: String) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

            /** Billing unit used to calculate the Telnyx billing cost */
            fun rateMeasuredIn(rateMeasuredIn: String) =
                rateMeasuredIn(JsonField.of(rateMeasuredIn))

            /**
             * Sets [Builder.rateMeasuredIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateMeasuredIn] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateMeasuredIn(rateMeasuredIn: JsonField<String>) = apply {
                this.rateMeasuredIn = rateMeasuredIn
            }

            /** Request status */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** User id */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** Webhook id */
            fun webhookId(webhookId: String) = webhookId(JsonField.of(webhookId))

            /**
             * Sets [Builder.webhookId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookId(webhookId: JsonField<String>) = apply { this.webhookId = webhookId }

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
             * Returns an immutable instance of [MediaStorageDetailRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MediaStorageDetailRecord =
                MediaStorageDetailRecord(
                    checkRequired("recordType", recordType),
                    id,
                    actionType,
                    assetId,
                    cost,
                    createdAt,
                    currency,
                    linkChannelId,
                    linkChannelType,
                    orgId,
                    rate,
                    rateMeasuredIn,
                    status,
                    userId,
                    webhookId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MediaStorageDetailRecord = apply {
            if (validated) {
                return@apply
            }

            recordType()
            id()
            actionType()
            assetId()
            cost()
            createdAt()
            currency()
            linkChannelId()
            linkChannelType()
            orgId()
            rate()
            rateMeasuredIn()
            status()
            userId()
            webhookId()
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
            (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (actionType.asKnown().isPresent) 1 else 0) +
                (if (assetId.asKnown().isPresent) 1 else 0) +
                (if (cost.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (linkChannelId.asKnown().isPresent) 1 else 0) +
                (if (linkChannelType.asKnown().isPresent) 1 else 0) +
                (if (orgId.asKnown().isPresent) 1 else 0) +
                (if (rate.asKnown().isPresent) 1 else 0) +
                (if (rateMeasuredIn.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (if (webhookId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MediaStorageDetailRecord &&
                recordType == other.recordType &&
                id == other.id &&
                actionType == other.actionType &&
                assetId == other.assetId &&
                cost == other.cost &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                linkChannelId == other.linkChannelId &&
                linkChannelType == other.linkChannelType &&
                orgId == other.orgId &&
                rate == other.rate &&
                rateMeasuredIn == other.rateMeasuredIn &&
                status == other.status &&
                userId == other.userId &&
                webhookId == other.webhookId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                recordType,
                id,
                actionType,
                assetId,
                cost,
                createdAt,
                currency,
                linkChannelId,
                linkChannelType,
                orgId,
                rate,
                rateMeasuredIn,
                status,
                userId,
                webhookId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MediaStorageDetailRecord{recordType=$recordType, id=$id, actionType=$actionType, assetId=$assetId, cost=$cost, createdAt=$createdAt, currency=$currency, linkChannelId=$linkChannelId, linkChannelType=$linkChannelType, orgId=$orgId, rate=$rate, rateMeasuredIn=$rateMeasuredIn, status=$status, userId=$userId, webhookId=$webhookId, additionalProperties=$additionalProperties}"
    }
}
