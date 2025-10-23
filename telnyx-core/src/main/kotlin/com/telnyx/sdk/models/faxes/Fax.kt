// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Fax
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val clientState: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val direction: JsonField<Direction>,
    private val from: JsonField<String>,
    private val fromDisplayName: JsonField<String>,
    private val mediaName: JsonField<String>,
    private val mediaUrl: JsonField<String>,
    private val previewUrl: JsonField<String>,
    private val quality: JsonField<Quality>,
    private val recordType: JsonField<RecordType>,
    private val status: JsonField<Status>,
    private val storeMedia: JsonField<Boolean>,
    private val storedMediaUrl: JsonField<String>,
    private val to: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val webhookFailoverUrl: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_state")
        @ExcludeMissing
        clientState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("from_display_name")
        @ExcludeMissing
        fromDisplayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media_name") @ExcludeMissing mediaName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("media_url") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preview_url")
        @ExcludeMissing
        previewUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quality") @ExcludeMissing quality: JsonField<Quality> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("store_media")
        @ExcludeMissing
        storeMedia: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stored_media_url")
        @ExcludeMissing
        storedMediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("webhook_failover_url")
        @ExcludeMissing
        webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        clientState,
        connectionId,
        createdAt,
        direction,
        from,
        fromDisplayName,
        mediaName,
        mediaUrl,
        previewUrl,
        quality,
        recordType,
        status,
        storeMedia,
        storedMediaUrl,
        to,
        updatedAt,
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
     * State received from a command.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = clientState.getOptional("client_state")

    /**
     * The ID of the connection used to send the fax.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

    /**
     * ISO 8601 timestamp when resource was created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The direction of the fax.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun direction(): Optional<Direction> = direction.getOptional("direction")

    /**
     * The phone number, in E.164 format, the fax will be sent from.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = from.getOptional("from")

    /**
     * The string used as the caller id name (SIP From Display Name) presented to the destination
     * (`to` number).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromDisplayName(): Optional<String> = fromDisplayName.getOptional("from_display_name")

    /**
     * The media_name used for the fax's media. Must point to a file previously uploaded to
     * api.telnyx.com/v2/media by the same user/organization. media_name and media_url/contents
     * can't be submitted together.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

    /**
     * The URL (or list of URLs) to the PDF used for the fax's media. media_url and
     * media_name/contents can't be submitted together.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = mediaUrl.getOptional("media_url")

    /**
     * If `store_preview` was set to `true`, this is a link to temporary location. Link expires
     * after 10 minutes.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previewUrl(): Optional<String> = previewUrl.getOptional("preview_url")

    /**
     * The quality of the fax. The `ultra` settings provides the highest quality available, but also
     * present longer fax processing times. `ultra_light` is best suited for images, wihle
     * `ultra_dark` is best suited for text.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quality(): Optional<Quality> = quality.getOptional("quality")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * Status of the fax
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Should fax media be stored on temporary URL. It does not support media_name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun storeMedia(): Optional<Boolean> = storeMedia.getOptional("store_media")

    /**
     * If store_media was set to true, this is a link to temporary location. Link expires after 10
     * minutes.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun storedMediaUrl(): Optional<String> = storedMediaUrl.getOptional("stored_media_url")

    /**
     * The phone number, in E.164 format, the fax will be sent to or SIP URI
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<String> = to.getOptional("to")

    /**
     * ISO 8601 timestamp when resource was updated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Optional failover URL that will receive fax webhooks if webhook_url doesn't return a 2XX
     * response
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> =
        webhookFailoverUrl.getOptional("webhook_failover_url")

    /**
     * URL that will receive fax webhooks
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
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_state")
    @ExcludeMissing
    fun _clientState(): JsonField<String> = clientState

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

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
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [fromDisplayName].
     *
     * Unlike [fromDisplayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from_display_name")
    @ExcludeMissing
    fun _fromDisplayName(): JsonField<String> = fromDisplayName

    /**
     * Returns the raw JSON value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media_name") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

    /**
     * Returns the raw JSON value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media_url") @ExcludeMissing fun _mediaUrl(): JsonField<String> = mediaUrl

    /**
     * Returns the raw JSON value of [previewUrl].
     *
     * Unlike [previewUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preview_url") @ExcludeMissing fun _previewUrl(): JsonField<String> = previewUrl

    /**
     * Returns the raw JSON value of [quality].
     *
     * Unlike [quality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quality") @ExcludeMissing fun _quality(): JsonField<Quality> = quality

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [storeMedia].
     *
     * Unlike [storeMedia], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("store_media") @ExcludeMissing fun _storeMedia(): JsonField<Boolean> = storeMedia

    /**
     * Returns the raw JSON value of [storedMediaUrl].
     *
     * Unlike [storedMediaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stored_media_url")
    @ExcludeMissing
    fun _storedMediaUrl(): JsonField<String> = storedMediaUrl

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [Fax]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Fax]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var clientState: JsonField<String> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var from: JsonField<String> = JsonMissing.of()
        private var fromDisplayName: JsonField<String> = JsonMissing.of()
        private var mediaName: JsonField<String> = JsonMissing.of()
        private var mediaUrl: JsonField<String> = JsonMissing.of()
        private var previewUrl: JsonField<String> = JsonMissing.of()
        private var quality: JsonField<Quality> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var storeMedia: JsonField<Boolean> = JsonMissing.of()
        private var storedMediaUrl: JsonField<String> = JsonMissing.of()
        private var to: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fax: Fax) = apply {
            id = fax.id
            clientState = fax.clientState
            connectionId = fax.connectionId
            createdAt = fax.createdAt
            direction = fax.direction
            from = fax.from
            fromDisplayName = fax.fromDisplayName
            mediaName = fax.mediaName
            mediaUrl = fax.mediaUrl
            previewUrl = fax.previewUrl
            quality = fax.quality
            recordType = fax.recordType
            status = fax.status
            storeMedia = fax.storeMedia
            storedMediaUrl = fax.storedMediaUrl
            to = fax.to
            updatedAt = fax.updatedAt
            webhookFailoverUrl = fax.webhookFailoverUrl
            webhookUrl = fax.webhookUrl
            additionalProperties = fax.additionalProperties.toMutableMap()
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

        /** State received from a command. */
        fun clientState(clientState: String) = clientState(JsonField.of(clientState))

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { this.clientState = clientState }

        /** The ID of the connection used to send the fax. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /** ISO 8601 timestamp when resource was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The direction of the fax. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The phone number, in E.164 format, the fax will be sent from. */
        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /**
         * The string used as the caller id name (SIP From Display Name) presented to the
         * destination (`to` number).
         */
        fun fromDisplayName(fromDisplayName: String) =
            fromDisplayName(JsonField.of(fromDisplayName))

        /**
         * Sets [Builder.fromDisplayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromDisplayName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fromDisplayName(fromDisplayName: JsonField<String>) = apply {
            this.fromDisplayName = fromDisplayName
        }

        /**
         * The media_name used for the fax's media. Must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. media_name and media_url/contents
         * can't be submitted together.
         */
        fun mediaName(mediaName: String) = mediaName(JsonField.of(mediaName))

        /**
         * Sets [Builder.mediaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaName(mediaName: JsonField<String>) = apply { this.mediaName = mediaName }

        /**
         * The URL (or list of URLs) to the PDF used for the fax's media. media_url and
         * media_name/contents can't be submitted together.
         */
        fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

        /**
         * If `store_preview` was set to `true`, this is a link to temporary location. Link expires
         * after 10 minutes.
         */
        fun previewUrl(previewUrl: String) = previewUrl(JsonField.of(previewUrl))

        /**
         * Sets [Builder.previewUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previewUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previewUrl(previewUrl: JsonField<String>) = apply { this.previewUrl = previewUrl }

        /**
         * The quality of the fax. The `ultra` settings provides the highest quality available, but
         * also present longer fax processing times. `ultra_light` is best suited for images, wihle
         * `ultra_dark` is best suited for text.
         */
        fun quality(quality: Quality) = quality(JsonField.of(quality))

        /**
         * Sets [Builder.quality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quality] with a well-typed [Quality] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quality(quality: JsonField<Quality>) = apply { this.quality = quality }

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

        /** Status of the fax */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Should fax media be stored on temporary URL. It does not support media_name. */
        fun storeMedia(storeMedia: Boolean) = storeMedia(JsonField.of(storeMedia))

        /**
         * Sets [Builder.storeMedia] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storeMedia] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun storeMedia(storeMedia: JsonField<Boolean>) = apply { this.storeMedia = storeMedia }

        /**
         * If store_media was set to true, this is a link to temporary location. Link expires after
         * 10 minutes.
         */
        fun storedMediaUrl(storedMediaUrl: String) = storedMediaUrl(JsonField.of(storedMediaUrl))

        /**
         * Sets [Builder.storedMediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storedMediaUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun storedMediaUrl(storedMediaUrl: JsonField<String>) = apply {
            this.storedMediaUrl = storedMediaUrl
        }

        /** The phone number, in E.164 format, the fax will be sent to or SIP URI */
        fun to(to: String) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** ISO 8601 timestamp when resource was updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Optional failover URL that will receive fax webhooks if webhook_url doesn't return a 2XX
         * response
         */
        fun webhookFailoverUrl(webhookFailoverUrl: String) =
            webhookFailoverUrl(JsonField.of(webhookFailoverUrl))

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

        /** URL that will receive fax webhooks */
        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

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
         * Returns an immutable instance of [Fax].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Fax =
            Fax(
                id,
                clientState,
                connectionId,
                createdAt,
                direction,
                from,
                fromDisplayName,
                mediaName,
                mediaUrl,
                previewUrl,
                quality,
                recordType,
                status,
                storeMedia,
                storedMediaUrl,
                to,
                updatedAt,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Fax = apply {
        if (validated) {
            return@apply
        }

        id()
        clientState()
        connectionId()
        createdAt()
        direction().ifPresent { it.validate() }
        from()
        fromDisplayName()
        mediaName()
        mediaUrl()
        previewUrl()
        quality().ifPresent { it.validate() }
        recordType().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        storeMedia()
        storedMediaUrl()
        to()
        updatedAt()
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
            (if (clientState.asKnown().isPresent) 1 else 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (from.asKnown().isPresent) 1 else 0) +
            (if (fromDisplayName.asKnown().isPresent) 1 else 0) +
            (if (mediaName.asKnown().isPresent) 1 else 0) +
            (if (mediaUrl.asKnown().isPresent) 1 else 0) +
            (if (previewUrl.asKnown().isPresent) 1 else 0) +
            (quality.asKnown().getOrNull()?.validity() ?: 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (storeMedia.asKnown().isPresent) 1 else 0) +
            (if (storedMediaUrl.asKnown().isPresent) 1 else 0) +
            (if (to.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    /** The direction of the fax. */
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
     * The quality of the fax. The `ultra` settings provides the highest quality available, but also
     * present longer fax processing times. `ultra_light` is best suited for images, wihle
     * `ultra_dark` is best suited for text.
     */
    class Quality @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NORMAL = of("normal")

            @JvmField val HIGH = of("high")

            @JvmField val VERY_HIGH = of("very_high")

            @JvmField val ULTRA_LIGHT = of("ultra_light")

            @JvmField val ULTRA_DARK = of("ultra_dark")

            @JvmStatic fun of(value: String) = Quality(JsonField.of(value))
        }

        /** An enum containing [Quality]'s known values. */
        enum class Known {
            NORMAL,
            HIGH,
            VERY_HIGH,
            ULTRA_LIGHT,
            ULTRA_DARK,
        }

        /**
         * An enum containing [Quality]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Quality] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NORMAL,
            HIGH,
            VERY_HIGH,
            ULTRA_LIGHT,
            ULTRA_DARK,
            /** An enum member indicating that [Quality] was instantiated with an unknown value. */
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
                NORMAL -> Value.NORMAL
                HIGH -> Value.HIGH
                VERY_HIGH -> Value.VERY_HIGH
                ULTRA_LIGHT -> Value.ULTRA_LIGHT
                ULTRA_DARK -> Value.ULTRA_DARK
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
                NORMAL -> Known.NORMAL
                HIGH -> Known.HIGH
                VERY_HIGH -> Known.VERY_HIGH
                ULTRA_LIGHT -> Known.ULTRA_LIGHT
                ULTRA_DARK -> Known.ULTRA_DARK
                else -> throw TelnyxInvalidDataException("Unknown Quality: $value")
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

        fun validate(): Quality = apply {
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

            return other is Quality && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            @JvmField val FAX = of("fax")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            FAX
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
            FAX,
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
                FAX -> Value.FAX
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
                FAX -> Known.FAX
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

    /** Status of the fax */
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

            @JvmField val MEDIA_PROCESSED = of("media.processed")

            @JvmField val ORIGINATED = of("originated")

            @JvmField val SENDING = of("sending")

            @JvmField val DELIVERED = of("delivered")

            @JvmField val FAILED = of("failed")

            @JvmField val INITIATED = of("initiated")

            @JvmField val RECEIVING = of("receiving")

            @JvmField val MEDIA_PROCESSING = of("media.processing")

            @JvmField val RECEIVED = of("received")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            MEDIA_PROCESSED,
            ORIGINATED,
            SENDING,
            DELIVERED,
            FAILED,
            INITIATED,
            RECEIVING,
            MEDIA_PROCESSING,
            RECEIVED,
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
            MEDIA_PROCESSED,
            ORIGINATED,
            SENDING,
            DELIVERED,
            FAILED,
            INITIATED,
            RECEIVING,
            MEDIA_PROCESSING,
            RECEIVED,
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
                MEDIA_PROCESSED -> Value.MEDIA_PROCESSED
                ORIGINATED -> Value.ORIGINATED
                SENDING -> Value.SENDING
                DELIVERED -> Value.DELIVERED
                FAILED -> Value.FAILED
                INITIATED -> Value.INITIATED
                RECEIVING -> Value.RECEIVING
                MEDIA_PROCESSING -> Value.MEDIA_PROCESSING
                RECEIVED -> Value.RECEIVED
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
                MEDIA_PROCESSED -> Known.MEDIA_PROCESSED
                ORIGINATED -> Known.ORIGINATED
                SENDING -> Known.SENDING
                DELIVERED -> Known.DELIVERED
                FAILED -> Known.FAILED
                INITIATED -> Known.INITIATED
                RECEIVING -> Known.RECEIVING
                MEDIA_PROCESSING -> Known.MEDIA_PROCESSING
                RECEIVED -> Known.RECEIVED
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

        return other is Fax &&
            id == other.id &&
            clientState == other.clientState &&
            connectionId == other.connectionId &&
            createdAt == other.createdAt &&
            direction == other.direction &&
            from == other.from &&
            fromDisplayName == other.fromDisplayName &&
            mediaName == other.mediaName &&
            mediaUrl == other.mediaUrl &&
            previewUrl == other.previewUrl &&
            quality == other.quality &&
            recordType == other.recordType &&
            status == other.status &&
            storeMedia == other.storeMedia &&
            storedMediaUrl == other.storedMediaUrl &&
            to == other.to &&
            updatedAt == other.updatedAt &&
            webhookFailoverUrl == other.webhookFailoverUrl &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            clientState,
            connectionId,
            createdAt,
            direction,
            from,
            fromDisplayName,
            mediaName,
            mediaUrl,
            previewUrl,
            quality,
            recordType,
            status,
            storeMedia,
            storedMediaUrl,
            to,
            updatedAt,
            webhookFailoverUrl,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Fax{id=$id, clientState=$clientState, connectionId=$connectionId, createdAt=$createdAt, direction=$direction, from=$from, fromDisplayName=$fromDisplayName, mediaName=$mediaName, mediaUrl=$mediaUrl, previewUrl=$previewUrl, quality=$quality, recordType=$recordType, status=$status, storeMedia=$storeMedia, storedMediaUrl=$storedMediaUrl, to=$to, updatedAt=$updatedAt, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
