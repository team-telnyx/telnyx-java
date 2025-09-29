// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texmlapplications

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.credentialconnections.AnchorsiteOverride
import com.telnyx.api.models.credentialconnections.DtmfType
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TexmlApplication
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val anchorsiteOverride: JsonField<AnchorsiteOverride>,
    private val createdAt: JsonField<String>,
    private val dtmfType: JsonField<DtmfType>,
    private val firstCommandTimeout: JsonField<Boolean>,
    private val firstCommandTimeoutSecs: JsonField<Long>,
    private val friendlyName: JsonField<String>,
    private val inbound: JsonField<Inbound>,
    private val outbound: JsonField<Outbound>,
    private val recordType: JsonField<String>,
    private val statusCallback: JsonField<String>,
    private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
    private val tags: JsonField<List<String>>,
    private val updatedAt: JsonField<String>,
    private val voiceFallbackUrl: JsonField<String>,
    private val voiceMethod: JsonField<VoiceMethod>,
    private val voiceUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("anchorsite_override")
        @ExcludeMissing
        anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtmf_type") @ExcludeMissing dtmfType: JsonField<DtmfType> = JsonMissing.of(),
        @JsonProperty("first_command_timeout")
        @ExcludeMissing
        firstCommandTimeout: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("first_command_timeout_secs")
        @ExcludeMissing
        firstCommandTimeoutSecs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("friendly_name")
        @ExcludeMissing
        friendlyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Inbound> = JsonMissing.of(),
        @JsonProperty("outbound") @ExcludeMissing outbound: JsonField<Outbound> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status_callback")
        @ExcludeMissing
        statusCallback: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status_callback_method")
        @ExcludeMissing
        statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voice_fallback_url")
        @ExcludeMissing
        voiceFallbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voice_method")
        @ExcludeMissing
        voiceMethod: JsonField<VoiceMethod> = JsonMissing.of(),
        @JsonProperty("voice_url") @ExcludeMissing voiceUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        active,
        anchorsiteOverride,
        createdAt,
        dtmfType,
        firstCommandTimeout,
        firstCommandTimeoutSecs,
        friendlyName,
        inbound,
        outbound,
        recordType,
        statusCallback,
        statusCallbackMethod,
        tags,
        updatedAt,
        voiceFallbackUrl,
        voiceMethod,
        voiceUrl,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Specifies whether the connection can be used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Optional<Boolean> = active.getOptional("active")

    /**
     * `Latency` directs Telnyx to route media through the site with the lowest round-trip time to
     * the user's connection. Telnyx calculates this time using ICMP ping messages. This can be
     * disabled by specifying a site to handle all media.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun anchorsiteOverride(): Optional<AnchorsiteOverride> =
        anchorsiteOverride.getOptional("anchorsite_override")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent
     * to Telnyx will be accepted in all formats.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtmfType(): Optional<DtmfType> = dtmfType.getOptional("dtmf_type")

    /**
     * Specifies whether calls to phone numbers associated with this connection should hangup after
     * timing out.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstCommandTimeout(): Optional<Boolean> =
        firstCommandTimeout.getOptional("first_command_timeout")

    /**
     * Specifies how many seconds to wait before timing out a dial command.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstCommandTimeoutSecs(): Optional<Long> =
        firstCommandTimeoutSecs.getOptional("first_command_timeout_secs")

    /**
     * A user-assigned name to help manage the application.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun friendlyName(): Optional<String> = friendlyName.getOptional("friendly_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<Inbound> = inbound.getOptional("inbound")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outbound(): Optional<Outbound> = outbound.getOptional("outbound")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * URL for Telnyx to send requests to containing information about call progress events.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallback(): Optional<String> = statusCallback.getOptional("status_callback")

    /**
     * HTTP request method Telnyx should use when requesting the status_callback URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
        statusCallbackMethod.getOptional("status_callback_method")

    /**
     * Tags associated with the Texml Application.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * URL to which Telnyx will deliver your XML Translator webhooks if we get an error response
     * from your voice_url.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceFallbackUrl(): Optional<String> = voiceFallbackUrl.getOptional("voice_fallback_url")

    /**
     * HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either
     * 'get' or 'post'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceMethod(): Optional<VoiceMethod> = voiceMethod.getOptional("voice_method")

    /**
     * URL to which Telnyx will deliver your XML Translator webhooks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceUrl(): Optional<String> = voiceUrl.getOptional("voice_url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [anchorsiteOverride].
     *
     * Unlike [anchorsiteOverride], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("anchorsite_override")
    @ExcludeMissing
    fun _anchorsiteOverride(): JsonField<AnchorsiteOverride> = anchorsiteOverride

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [dtmfType].
     *
     * Unlike [dtmfType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtmf_type") @ExcludeMissing fun _dtmfType(): JsonField<DtmfType> = dtmfType

    /**
     * Returns the raw JSON value of [firstCommandTimeout].
     *
     * Unlike [firstCommandTimeout], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("first_command_timeout")
    @ExcludeMissing
    fun _firstCommandTimeout(): JsonField<Boolean> = firstCommandTimeout

    /**
     * Returns the raw JSON value of [firstCommandTimeoutSecs].
     *
     * Unlike [firstCommandTimeoutSecs], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("first_command_timeout_secs")
    @ExcludeMissing
    fun _firstCommandTimeoutSecs(): JsonField<Long> = firstCommandTimeoutSecs

    /**
     * Returns the raw JSON value of [friendlyName].
     *
     * Unlike [friendlyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendly_name")
    @ExcludeMissing
    fun _friendlyName(): JsonField<String> = friendlyName

    /**
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<Inbound> = inbound

    /**
     * Returns the raw JSON value of [outbound].
     *
     * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outbound") @ExcludeMissing fun _outbound(): JsonField<Outbound> = outbound

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [statusCallback].
     *
     * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_callback")
    @ExcludeMissing
    fun _statusCallback(): JsonField<String> = statusCallback

    /**
     * Returns the raw JSON value of [statusCallbackMethod].
     *
     * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("status_callback_method")
    @ExcludeMissing
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [voiceFallbackUrl].
     *
     * Unlike [voiceFallbackUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("voice_fallback_url")
    @ExcludeMissing
    fun _voiceFallbackUrl(): JsonField<String> = voiceFallbackUrl

    /**
     * Returns the raw JSON value of [voiceMethod].
     *
     * Unlike [voiceMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice_method")
    @ExcludeMissing
    fun _voiceMethod(): JsonField<VoiceMethod> = voiceMethod

    /**
     * Returns the raw JSON value of [voiceUrl].
     *
     * Unlike [voiceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice_url") @ExcludeMissing fun _voiceUrl(): JsonField<String> = voiceUrl

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

        /** Returns a mutable builder for constructing an instance of [TexmlApplication]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TexmlApplication]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var dtmfType: JsonField<DtmfType> = JsonMissing.of()
        private var firstCommandTimeout: JsonField<Boolean> = JsonMissing.of()
        private var firstCommandTimeoutSecs: JsonField<Long> = JsonMissing.of()
        private var friendlyName: JsonField<String> = JsonMissing.of()
        private var inbound: JsonField<Inbound> = JsonMissing.of()
        private var outbound: JsonField<Outbound> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var statusCallback: JsonField<String> = JsonMissing.of()
        private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var voiceFallbackUrl: JsonField<String> = JsonMissing.of()
        private var voiceMethod: JsonField<VoiceMethod> = JsonMissing.of()
        private var voiceUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(texmlApplication: TexmlApplication) = apply {
            id = texmlApplication.id
            active = texmlApplication.active
            anchorsiteOverride = texmlApplication.anchorsiteOverride
            createdAt = texmlApplication.createdAt
            dtmfType = texmlApplication.dtmfType
            firstCommandTimeout = texmlApplication.firstCommandTimeout
            firstCommandTimeoutSecs = texmlApplication.firstCommandTimeoutSecs
            friendlyName = texmlApplication.friendlyName
            inbound = texmlApplication.inbound
            outbound = texmlApplication.outbound
            recordType = texmlApplication.recordType
            statusCallback = texmlApplication.statusCallback
            statusCallbackMethod = texmlApplication.statusCallbackMethod
            tags = texmlApplication.tags.map { it.toMutableList() }
            updatedAt = texmlApplication.updatedAt
            voiceFallbackUrl = texmlApplication.voiceFallbackUrl
            voiceMethod = texmlApplication.voiceMethod
            voiceUrl = texmlApplication.voiceUrl
            additionalProperties = texmlApplication.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Specifies whether the connection can be used. */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /**
         * `Latency` directs Telnyx to route media through the site with the lowest round-trip time
         * to the user's connection. Telnyx calculates this time using ICMP ping messages. This can
         * be disabled by specifying a site to handle all media.
         */
        fun anchorsiteOverride(anchorsiteOverride: AnchorsiteOverride) =
            anchorsiteOverride(JsonField.of(anchorsiteOverride))

        /**
         * Sets [Builder.anchorsiteOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.anchorsiteOverride] with a well-typed
         * [AnchorsiteOverride] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun anchorsiteOverride(anchorsiteOverride: JsonField<AnchorsiteOverride>) = apply {
            this.anchorsiteOverride = anchorsiteOverride
        }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /**
         * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits
         * sent to Telnyx will be accepted in all formats.
         */
        fun dtmfType(dtmfType: DtmfType) = dtmfType(JsonField.of(dtmfType))

        /**
         * Sets [Builder.dtmfType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtmfType] with a well-typed [DtmfType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dtmfType(dtmfType: JsonField<DtmfType>) = apply { this.dtmfType = dtmfType }

        /**
         * Specifies whether calls to phone numbers associated with this connection should hangup
         * after timing out.
         */
        fun firstCommandTimeout(firstCommandTimeout: Boolean) =
            firstCommandTimeout(JsonField.of(firstCommandTimeout))

        /**
         * Sets [Builder.firstCommandTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstCommandTimeout] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstCommandTimeout(firstCommandTimeout: JsonField<Boolean>) = apply {
            this.firstCommandTimeout = firstCommandTimeout
        }

        /** Specifies how many seconds to wait before timing out a dial command. */
        fun firstCommandTimeoutSecs(firstCommandTimeoutSecs: Long) =
            firstCommandTimeoutSecs(JsonField.of(firstCommandTimeoutSecs))

        /**
         * Sets [Builder.firstCommandTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstCommandTimeoutSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstCommandTimeoutSecs(firstCommandTimeoutSecs: JsonField<Long>) = apply {
            this.firstCommandTimeoutSecs = firstCommandTimeoutSecs
        }

        /** A user-assigned name to help manage the application. */
        fun friendlyName(friendlyName: String) = friendlyName(JsonField.of(friendlyName))

        /**
         * Sets [Builder.friendlyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun friendlyName(friendlyName: JsonField<String>) = apply {
            this.friendlyName = friendlyName
        }

        fun inbound(inbound: Inbound) = inbound(JsonField.of(inbound))

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [Inbound] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inbound(inbound: JsonField<Inbound>) = apply { this.inbound = inbound }

        fun outbound(outbound: Outbound) = outbound(JsonField.of(outbound))

        /**
         * Sets [Builder.outbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outbound] with a well-typed [Outbound] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outbound(outbound: JsonField<Outbound>) = apply { this.outbound = outbound }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** URL for Telnyx to send requests to containing information about call progress events. */
        fun statusCallback(statusCallback: String) = statusCallback(JsonField.of(statusCallback))

        /**
         * Sets [Builder.statusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCallback(statusCallback: JsonField<String>) = apply {
            this.statusCallback = statusCallback
        }

        /** HTTP request method Telnyx should use when requesting the status_callback URL. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
            statusCallbackMethod(JsonField.of(statusCallbackMethod))

        /**
         * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackMethod] with a well-typed
         * [StatusCallbackMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) = apply {
            this.statusCallbackMethod = statusCallbackMethod
        }

        /** Tags associated with the Texml Application. */
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

        /** ISO 8601 formatted date indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /**
         * URL to which Telnyx will deliver your XML Translator webhooks if we get an error response
         * from your voice_url.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: String) =
            voiceFallbackUrl(JsonField.of(voiceFallbackUrl))

        /**
         * Sets [Builder.voiceFallbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceFallbackUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceFallbackUrl(voiceFallbackUrl: JsonField<String>) = apply {
            this.voiceFallbackUrl = voiceFallbackUrl
        }

        /**
         * HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either
         * 'get' or 'post'.
         */
        fun voiceMethod(voiceMethod: VoiceMethod) = voiceMethod(JsonField.of(voiceMethod))

        /**
         * Sets [Builder.voiceMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceMethod] with a well-typed [VoiceMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceMethod(voiceMethod: JsonField<VoiceMethod>) = apply {
            this.voiceMethod = voiceMethod
        }

        /** URL to which Telnyx will deliver your XML Translator webhooks. */
        fun voiceUrl(voiceUrl: String) = voiceUrl(JsonField.of(voiceUrl))

        /**
         * Sets [Builder.voiceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voiceUrl(voiceUrl: JsonField<String>) = apply { this.voiceUrl = voiceUrl }

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
         * Returns an immutable instance of [TexmlApplication].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TexmlApplication =
            TexmlApplication(
                id,
                active,
                anchorsiteOverride,
                createdAt,
                dtmfType,
                firstCommandTimeout,
                firstCommandTimeoutSecs,
                friendlyName,
                inbound,
                outbound,
                recordType,
                statusCallback,
                statusCallbackMethod,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                voiceFallbackUrl,
                voiceMethod,
                voiceUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TexmlApplication = apply {
        if (validated) {
            return@apply
        }

        id()
        active()
        anchorsiteOverride().ifPresent { it.validate() }
        createdAt()
        dtmfType().ifPresent { it.validate() }
        firstCommandTimeout()
        firstCommandTimeoutSecs()
        friendlyName()
        inbound().ifPresent { it.validate() }
        outbound().ifPresent { it.validate() }
        recordType()
        statusCallback()
        statusCallbackMethod().ifPresent { it.validate() }
        tags()
        updatedAt()
        voiceFallbackUrl()
        voiceMethod().ifPresent { it.validate() }
        voiceUrl()
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
            (if (active.asKnown().isPresent) 1 else 0) +
            (anchorsiteOverride.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dtmfType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (firstCommandTimeout.asKnown().isPresent) 1 else 0) +
            (if (firstCommandTimeoutSecs.asKnown().isPresent) 1 else 0) +
            (if (friendlyName.asKnown().isPresent) 1 else 0) +
            (inbound.asKnown().getOrNull()?.validity() ?: 0) +
            (outbound.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (statusCallback.asKnown().isPresent) 1 else 0) +
            (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (voiceFallbackUrl.asKnown().isPresent) 1 else 0) +
            (voiceMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (voiceUrl.asKnown().isPresent) 1 else 0)

    class Inbound
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channelLimit: JsonField<Long>,
        private val shakenStirEnabled: JsonField<Boolean>,
        private val sipSubdomain: JsonField<String>,
        private val sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channel_limit")
            @ExcludeMissing
            channelLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("shaken_stir_enabled")
            @ExcludeMissing
            shakenStirEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sip_subdomain")
            @ExcludeMissing
            sipSubdomain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sip_subdomain_receive_settings")
            @ExcludeMissing
            sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings> = JsonMissing.of(),
        ) : this(
            channelLimit,
            shakenStirEnabled,
            sipSubdomain,
            sipSubdomainReceiveSettings,
            mutableMapOf(),
        )

        /**
         * When set, this will limit the total number of inbound calls to phone numbers associated
         * with this connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

        /**
         * When enabled Telnyx will include Shaken/Stir data in the Webhook for new inbound calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shakenStirEnabled(): Optional<Boolean> =
            shakenStirEnabled.getOptional("shaken_stir_enabled")

        /**
         * Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the
         * same way a phone number is used, from a SIP endpoint. Example: the subdomain
         * "example.sip.telnyx.com" can be called from any SIP endpoint by using the SIP URI
         * "sip:@example.sip.telnyx.com" where the user part can be any alphanumeric value. Please
         * note TLS encrypted calls are not allowed for subdomain calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipSubdomain(): Optional<String> = sipSubdomain.getOptional("sip_subdomain")

        /**
         * This option can be enabled to receive calls from: "Anyone" (any SIP endpoint in the
         * public Internet) or "Only my connections" (any connection assigned to the same Telnyx
         * user).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipSubdomainReceiveSettings(): Optional<SipSubdomainReceiveSettings> =
            sipSubdomainReceiveSettings.getOptional("sip_subdomain_receive_settings")

        /**
         * Returns the raw JSON value of [channelLimit].
         *
         * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("channel_limit")
        @ExcludeMissing
        fun _channelLimit(): JsonField<Long> = channelLimit

        /**
         * Returns the raw JSON value of [shakenStirEnabled].
         *
         * Unlike [shakenStirEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shaken_stir_enabled")
        @ExcludeMissing
        fun _shakenStirEnabled(): JsonField<Boolean> = shakenStirEnabled

        /**
         * Returns the raw JSON value of [sipSubdomain].
         *
         * Unlike [sipSubdomain], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sip_subdomain")
        @ExcludeMissing
        fun _sipSubdomain(): JsonField<String> = sipSubdomain

        /**
         * Returns the raw JSON value of [sipSubdomainReceiveSettings].
         *
         * Unlike [sipSubdomainReceiveSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sip_subdomain_receive_settings")
        @ExcludeMissing
        fun _sipSubdomainReceiveSettings(): JsonField<SipSubdomainReceiveSettings> =
            sipSubdomainReceiveSettings

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

            /** Returns a mutable builder for constructing an instance of [Inbound]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inbound]. */
        class Builder internal constructor() {

            private var channelLimit: JsonField<Long> = JsonMissing.of()
            private var shakenStirEnabled: JsonField<Boolean> = JsonMissing.of()
            private var sipSubdomain: JsonField<String> = JsonMissing.of()
            private var sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inbound: Inbound) = apply {
                channelLimit = inbound.channelLimit
                shakenStirEnabled = inbound.shakenStirEnabled
                sipSubdomain = inbound.sipSubdomain
                sipSubdomainReceiveSettings = inbound.sipSubdomainReceiveSettings
                additionalProperties = inbound.additionalProperties.toMutableMap()
            }

            /**
             * When set, this will limit the total number of inbound calls to phone numbers
             * associated with this connection.
             */
            fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

            /**
             * Sets [Builder.channelLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channelLimit(channelLimit: JsonField<Long>) = apply {
                this.channelLimit = channelLimit
            }

            /**
             * When enabled Telnyx will include Shaken/Stir data in the Webhook for new inbound
             * calls.
             */
            fun shakenStirEnabled(shakenStirEnabled: Boolean) =
                shakenStirEnabled(JsonField.of(shakenStirEnabled))

            /**
             * Sets [Builder.shakenStirEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shakenStirEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shakenStirEnabled(shakenStirEnabled: JsonField<Boolean>) = apply {
                this.shakenStirEnabled = shakenStirEnabled
            }

            /**
             * Specifies a subdomain that can be used to receive Inbound calls to a Connection, in
             * the same way a phone number is used, from a SIP endpoint. Example: the subdomain
             * "example.sip.telnyx.com" can be called from any SIP endpoint by using the SIP URI
             * "sip:@example.sip.telnyx.com" where the user part can be any alphanumeric value.
             * Please note TLS encrypted calls are not allowed for subdomain calls.
             */
            fun sipSubdomain(sipSubdomain: String) = sipSubdomain(JsonField.of(sipSubdomain))

            /**
             * Sets [Builder.sipSubdomain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipSubdomain] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipSubdomain(sipSubdomain: JsonField<String>) = apply {
                this.sipSubdomain = sipSubdomain
            }

            /**
             * This option can be enabled to receive calls from: "Anyone" (any SIP endpoint in the
             * public Internet) or "Only my connections" (any connection assigned to the same Telnyx
             * user).
             */
            fun sipSubdomainReceiveSettings(
                sipSubdomainReceiveSettings: SipSubdomainReceiveSettings
            ) = sipSubdomainReceiveSettings(JsonField.of(sipSubdomainReceiveSettings))

            /**
             * Sets [Builder.sipSubdomainReceiveSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipSubdomainReceiveSettings] with a well-typed
             * [SipSubdomainReceiveSettings] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun sipSubdomainReceiveSettings(
                sipSubdomainReceiveSettings: JsonField<SipSubdomainReceiveSettings>
            ) = apply { this.sipSubdomainReceiveSettings = sipSubdomainReceiveSettings }

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
             * Returns an immutable instance of [Inbound].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Inbound =
                Inbound(
                    channelLimit,
                    shakenStirEnabled,
                    sipSubdomain,
                    sipSubdomainReceiveSettings,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Inbound = apply {
            if (validated) {
                return@apply
            }

            channelLimit()
            shakenStirEnabled()
            sipSubdomain()
            sipSubdomainReceiveSettings().ifPresent { it.validate() }
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
            (if (channelLimit.asKnown().isPresent) 1 else 0) +
                (if (shakenStirEnabled.asKnown().isPresent) 1 else 0) +
                (if (sipSubdomain.asKnown().isPresent) 1 else 0) +
                (sipSubdomainReceiveSettings.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * This option can be enabled to receive calls from: "Anyone" (any SIP endpoint in the
         * public Internet) or "Only my connections" (any connection assigned to the same Telnyx
         * user).
         */
        class SipSubdomainReceiveSettings
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

                @JvmField val ONLY_MY_CONNECTIONS = of("only_my_connections")

                @JvmField val FROM_ANYONE = of("from_anyone")

                @JvmStatic fun of(value: String) = SipSubdomainReceiveSettings(JsonField.of(value))
            }

            /** An enum containing [SipSubdomainReceiveSettings]'s known values. */
            enum class Known {
                ONLY_MY_CONNECTIONS,
                FROM_ANYONE,
            }

            /**
             * An enum containing [SipSubdomainReceiveSettings]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [SipSubdomainReceiveSettings] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ONLY_MY_CONNECTIONS,
                FROM_ANYONE,
                /**
                 * An enum member indicating that [SipSubdomainReceiveSettings] was instantiated
                 * with an unknown value.
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
                    ONLY_MY_CONNECTIONS -> Value.ONLY_MY_CONNECTIONS
                    FROM_ANYONE -> Value.FROM_ANYONE
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
                    ONLY_MY_CONNECTIONS -> Known.ONLY_MY_CONNECTIONS
                    FROM_ANYONE -> Known.FROM_ANYONE
                    else ->
                        throw TelnyxInvalidDataException(
                            "Unknown SipSubdomainReceiveSettings: $value"
                        )
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

            fun validate(): SipSubdomainReceiveSettings = apply {
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

                return other is SipSubdomainReceiveSettings && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Inbound &&
                channelLimit == other.channelLimit &&
                shakenStirEnabled == other.shakenStirEnabled &&
                sipSubdomain == other.sipSubdomain &&
                sipSubdomainReceiveSettings == other.sipSubdomainReceiveSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                channelLimit,
                shakenStirEnabled,
                sipSubdomain,
                sipSubdomainReceiveSettings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inbound{channelLimit=$channelLimit, shakenStirEnabled=$shakenStirEnabled, sipSubdomain=$sipSubdomain, sipSubdomainReceiveSettings=$sipSubdomainReceiveSettings, additionalProperties=$additionalProperties}"
    }

    class Outbound
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channelLimit: JsonField<Long>,
        private val outboundVoiceProfileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channel_limit")
            @ExcludeMissing
            channelLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("outbound_voice_profile_id")
            @ExcludeMissing
            outboundVoiceProfileId: JsonField<String> = JsonMissing.of(),
        ) : this(channelLimit, outboundVoiceProfileId, mutableMapOf())

        /**
         * When set, this will limit the total number of outbound calls to phone numbers associated
         * with this connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

        /**
         * Identifies the associated outbound voice profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outboundVoiceProfileId(): Optional<String> =
            outboundVoiceProfileId.getOptional("outbound_voice_profile_id")

        /**
         * Returns the raw JSON value of [channelLimit].
         *
         * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("channel_limit")
        @ExcludeMissing
        fun _channelLimit(): JsonField<Long> = channelLimit

        /**
         * Returns the raw JSON value of [outboundVoiceProfileId].
         *
         * Unlike [outboundVoiceProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("outbound_voice_profile_id")
        @ExcludeMissing
        fun _outboundVoiceProfileId(): JsonField<String> = outboundVoiceProfileId

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

            /** Returns a mutable builder for constructing an instance of [Outbound]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Outbound]. */
        class Builder internal constructor() {

            private var channelLimit: JsonField<Long> = JsonMissing.of()
            private var outboundVoiceProfileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outbound: Outbound) = apply {
                channelLimit = outbound.channelLimit
                outboundVoiceProfileId = outbound.outboundVoiceProfileId
                additionalProperties = outbound.additionalProperties.toMutableMap()
            }

            /**
             * When set, this will limit the total number of outbound calls to phone numbers
             * associated with this connection.
             */
            fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

            /**
             * Sets [Builder.channelLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channelLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channelLimit(channelLimit: JsonField<Long>) = apply {
                this.channelLimit = channelLimit
            }

            /** Identifies the associated outbound voice profile. */
            fun outboundVoiceProfileId(outboundVoiceProfileId: String) =
                outboundVoiceProfileId(JsonField.of(outboundVoiceProfileId))

            /**
             * Sets [Builder.outboundVoiceProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outboundVoiceProfileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outboundVoiceProfileId(outboundVoiceProfileId: JsonField<String>) = apply {
                this.outboundVoiceProfileId = outboundVoiceProfileId
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
             * Returns an immutable instance of [Outbound].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Outbound =
                Outbound(channelLimit, outboundVoiceProfileId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Outbound = apply {
            if (validated) {
                return@apply
            }

            channelLimit()
            outboundVoiceProfileId()
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
            (if (channelLimit.asKnown().isPresent) 1 else 0) +
                (if (outboundVoiceProfileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Outbound &&
                channelLimit == other.channelLimit &&
                outboundVoiceProfileId == other.outboundVoiceProfileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channelLimit, outboundVoiceProfileId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Outbound{channelLimit=$channelLimit, outboundVoiceProfileId=$outboundVoiceProfileId, additionalProperties=$additionalProperties}"
    }

    /** HTTP request method Telnyx should use when requesting the status_callback URL. */
    class StatusCallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GET = of("get")

            @JvmField val POST = of("post")

            @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [StatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [StatusCallbackMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [StatusCallbackMethod] was instantiated with an
             * unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
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

        fun validate(): StatusCallbackMethod = apply {
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

            return other is StatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either
     * 'get' or 'post'.
     */
    class VoiceMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val GET = of("get")

            @JvmField val POST = of("post")

            @JvmStatic fun of(value: String) = VoiceMethod(JsonField.of(value))
        }

        /** An enum containing [VoiceMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [VoiceMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VoiceMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [VoiceMethod] was instantiated with an unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TelnyxInvalidDataException("Unknown VoiceMethod: $value")
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

        fun validate(): VoiceMethod = apply {
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

            return other is VoiceMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TexmlApplication &&
            id == other.id &&
            active == other.active &&
            anchorsiteOverride == other.anchorsiteOverride &&
            createdAt == other.createdAt &&
            dtmfType == other.dtmfType &&
            firstCommandTimeout == other.firstCommandTimeout &&
            firstCommandTimeoutSecs == other.firstCommandTimeoutSecs &&
            friendlyName == other.friendlyName &&
            inbound == other.inbound &&
            outbound == other.outbound &&
            recordType == other.recordType &&
            statusCallback == other.statusCallback &&
            statusCallbackMethod == other.statusCallbackMethod &&
            tags == other.tags &&
            updatedAt == other.updatedAt &&
            voiceFallbackUrl == other.voiceFallbackUrl &&
            voiceMethod == other.voiceMethod &&
            voiceUrl == other.voiceUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            active,
            anchorsiteOverride,
            createdAt,
            dtmfType,
            firstCommandTimeout,
            firstCommandTimeoutSecs,
            friendlyName,
            inbound,
            outbound,
            recordType,
            statusCallback,
            statusCallbackMethod,
            tags,
            updatedAt,
            voiceFallbackUrl,
            voiceMethod,
            voiceUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TexmlApplication{id=$id, active=$active, anchorsiteOverride=$anchorsiteOverride, createdAt=$createdAt, dtmfType=$dtmfType, firstCommandTimeout=$firstCommandTimeout, firstCommandTimeoutSecs=$firstCommandTimeoutSecs, friendlyName=$friendlyName, inbound=$inbound, outbound=$outbound, recordType=$recordType, statusCallback=$statusCallback, statusCallbackMethod=$statusCallbackMethod, tags=$tags, updatedAt=$updatedAt, voiceFallbackUrl=$voiceFallbackUrl, voiceMethod=$voiceMethod, voiceUrl=$voiceUrl, additionalProperties=$additionalProperties}"
}
