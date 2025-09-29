// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.callcontrolapplications

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallControlApplication
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val anchorsiteOverride: JsonField<AnchorsiteOverride>,
    private val applicationName: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val dtmfType: JsonField<DtmfType>,
    private val firstCommandTimeout: JsonField<Boolean>,
    private val firstCommandTimeoutSecs: JsonField<Long>,
    private val inbound: JsonField<CallControlApplicationInbound>,
    private val outbound: JsonField<CallControlApplicationOutbound>,
    private val recordType: JsonField<RecordType>,
    private val redactDtmfDebugLogging: JsonField<Boolean>,
    private val tags: JsonField<List<String>>,
    private val updatedAt: JsonField<String>,
    private val webhookApiVersion: JsonField<WebhookApiVersion>,
    private val webhookEventFailoverUrl: JsonField<String>,
    private val webhookEventUrl: JsonField<String>,
    private val webhookTimeoutSecs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("anchorsite_override")
        @ExcludeMissing
        anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of(),
        @JsonProperty("application_name")
        @ExcludeMissing
        applicationName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtmf_type") @ExcludeMissing dtmfType: JsonField<DtmfType> = JsonMissing.of(),
        @JsonProperty("first_command_timeout")
        @ExcludeMissing
        firstCommandTimeout: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("first_command_timeout_secs")
        @ExcludeMissing
        firstCommandTimeoutSecs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("inbound")
        @ExcludeMissing
        inbound: JsonField<CallControlApplicationInbound> = JsonMissing.of(),
        @JsonProperty("outbound")
        @ExcludeMissing
        outbound: JsonField<CallControlApplicationOutbound> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("redact_dtmf_debug_logging")
        @ExcludeMissing
        redactDtmfDebugLogging: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_api_version")
        @ExcludeMissing
        webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of(),
        @JsonProperty("webhook_event_failover_url")
        @ExcludeMissing
        webhookEventFailoverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_event_url")
        @ExcludeMissing
        webhookEventUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_timeout_secs")
        @ExcludeMissing
        webhookTimeoutSecs: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        active,
        anchorsiteOverride,
        applicationName,
        createdAt,
        dtmfType,
        firstCommandTimeout,
        firstCommandTimeoutSecs,
        inbound,
        outbound,
        recordType,
        redactDtmfDebugLogging,
        tags,
        updatedAt,
        webhookApiVersion,
        webhookEventFailoverUrl,
        webhookEventUrl,
        webhookTimeoutSecs,
        mutableMapOf(),
    )

    /**
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
     * A user-assigned name to help manage the application.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicationName(): Optional<String> = applicationName.getOptional("application_name")

    /**
     * ISO 8601 formatted date of when the resource was created
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inbound(): Optional<CallControlApplicationInbound> = inbound.getOptional("inbound")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outbound(): Optional<CallControlApplicationOutbound> = outbound.getOptional("outbound")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * When enabled, DTMF digits entered by users will be redacted in debug logs to protect PII data
     * entered through IVR interactions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redactDtmfDebugLogging(): Optional<Boolean> =
        redactDtmfDebugLogging.getOptional("redact_dtmf_debug_logging")

    /**
     * Tags assigned to the Call Control Application.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * ISO 8601 formatted date of when the resource was last updated
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Determines which webhook format will be used, Telnyx API v1 or v2.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookApiVersion(): Optional<WebhookApiVersion> =
        webhookApiVersion.getOptional("webhook_api_version")

    /**
     * The failover URL where webhooks related to this connection will be sent if sending to the
     * primary URL fails. Must include a scheme, such as `https`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventFailoverUrl(): Optional<String> =
        webhookEventFailoverUrl.getOptional("webhook_event_failover_url")

    /**
     * The URL where webhooks related to this connection will be sent. Must include a scheme, such
     * as `https`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEventUrl(): Optional<String> = webhookEventUrl.getOptional("webhook_event_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookTimeoutSecs(): Optional<Long> =
        webhookTimeoutSecs.getOptional("webhook_timeout_secs")

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
     * Returns the raw JSON value of [applicationName].
     *
     * Unlike [applicationName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("application_name")
    @ExcludeMissing
    fun _applicationName(): JsonField<String> = applicationName

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
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbound")
    @ExcludeMissing
    fun _inbound(): JsonField<CallControlApplicationInbound> = inbound

    /**
     * Returns the raw JSON value of [outbound].
     *
     * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outbound")
    @ExcludeMissing
    fun _outbound(): JsonField<CallControlApplicationOutbound> = outbound

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [redactDtmfDebugLogging].
     *
     * Unlike [redactDtmfDebugLogging], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("redact_dtmf_debug_logging")
    @ExcludeMissing
    fun _redactDtmfDebugLogging(): JsonField<Boolean> = redactDtmfDebugLogging

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
     * Returns the raw JSON value of [webhookApiVersion].
     *
     * Unlike [webhookApiVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_api_version")
    @ExcludeMissing
    fun _webhookApiVersion(): JsonField<WebhookApiVersion> = webhookApiVersion

    /**
     * Returns the raw JSON value of [webhookEventFailoverUrl].
     *
     * Unlike [webhookEventFailoverUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("webhook_event_failover_url")
    @ExcludeMissing
    fun _webhookEventFailoverUrl(): JsonField<String> = webhookEventFailoverUrl

    /**
     * Returns the raw JSON value of [webhookEventUrl].
     *
     * Unlike [webhookEventUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_event_url")
    @ExcludeMissing
    fun _webhookEventUrl(): JsonField<String> = webhookEventUrl

    /**
     * Returns the raw JSON value of [webhookTimeoutSecs].
     *
     * Unlike [webhookTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_timeout_secs")
    @ExcludeMissing
    fun _webhookTimeoutSecs(): JsonField<Long> = webhookTimeoutSecs

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

        /** Returns a mutable builder for constructing an instance of [CallControlApplication]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallControlApplication]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var anchorsiteOverride: JsonField<AnchorsiteOverride> = JsonMissing.of()
        private var applicationName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var dtmfType: JsonField<DtmfType> = JsonMissing.of()
        private var firstCommandTimeout: JsonField<Boolean> = JsonMissing.of()
        private var firstCommandTimeoutSecs: JsonField<Long> = JsonMissing.of()
        private var inbound: JsonField<CallControlApplicationInbound> = JsonMissing.of()
        private var outbound: JsonField<CallControlApplicationOutbound> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var redactDtmfDebugLogging: JsonField<Boolean> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
        private var webhookEventFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookEventUrl: JsonField<String> = JsonMissing.of()
        private var webhookTimeoutSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callControlApplication: CallControlApplication) = apply {
            id = callControlApplication.id
            active = callControlApplication.active
            anchorsiteOverride = callControlApplication.anchorsiteOverride
            applicationName = callControlApplication.applicationName
            createdAt = callControlApplication.createdAt
            dtmfType = callControlApplication.dtmfType
            firstCommandTimeout = callControlApplication.firstCommandTimeout
            firstCommandTimeoutSecs = callControlApplication.firstCommandTimeoutSecs
            inbound = callControlApplication.inbound
            outbound = callControlApplication.outbound
            recordType = callControlApplication.recordType
            redactDtmfDebugLogging = callControlApplication.redactDtmfDebugLogging
            tags = callControlApplication.tags.map { it.toMutableList() }
            updatedAt = callControlApplication.updatedAt
            webhookApiVersion = callControlApplication.webhookApiVersion
            webhookEventFailoverUrl = callControlApplication.webhookEventFailoverUrl
            webhookEventUrl = callControlApplication.webhookEventUrl
            webhookTimeoutSecs = callControlApplication.webhookTimeoutSecs
            additionalProperties = callControlApplication.additionalProperties.toMutableMap()
        }

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

        /** A user-assigned name to help manage the application. */
        fun applicationName(applicationName: String) =
            applicationName(JsonField.of(applicationName))

        /**
         * Sets [Builder.applicationName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applicationName(applicationName: JsonField<String>) = apply {
            this.applicationName = applicationName
        }

        /** ISO 8601 formatted date of when the resource was created */
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

        fun inbound(inbound: CallControlApplicationInbound) = inbound(JsonField.of(inbound))

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed
         * [CallControlApplicationInbound] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun inbound(inbound: JsonField<CallControlApplicationInbound>) = apply {
            this.inbound = inbound
        }

        fun outbound(outbound: CallControlApplicationOutbound) = outbound(JsonField.of(outbound))

        /**
         * Sets [Builder.outbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outbound] with a well-typed
         * [CallControlApplicationOutbound] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun outbound(outbound: JsonField<CallControlApplicationOutbound>) = apply {
            this.outbound = outbound
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

        /**
         * When enabled, DTMF digits entered by users will be redacted in debug logs to protect PII
         * data entered through IVR interactions.
         */
        fun redactDtmfDebugLogging(redactDtmfDebugLogging: Boolean) =
            redactDtmfDebugLogging(JsonField.of(redactDtmfDebugLogging))

        /**
         * Sets [Builder.redactDtmfDebugLogging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redactDtmfDebugLogging] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun redactDtmfDebugLogging(redactDtmfDebugLogging: JsonField<Boolean>) = apply {
            this.redactDtmfDebugLogging = redactDtmfDebugLogging
        }

        /** Tags assigned to the Call Control Application. */
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

        /** ISO 8601 formatted date of when the resource was last updated */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** Determines which webhook format will be used, Telnyx API v1 or v2. */
        fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) =
            webhookApiVersion(JsonField.of(webhookApiVersion))

        /**
         * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookApiVersion] with a well-typed [WebhookApiVersion]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
            this.webhookApiVersion = webhookApiVersion
        }

        /**
         * The failover URL where webhooks related to this connection will be sent if sending to the
         * primary URL fails. Must include a scheme, such as `https`.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: String?) =
            webhookEventFailoverUrl(JsonField.ofNullable(webhookEventFailoverUrl))

        /**
         * Alias for calling [Builder.webhookEventFailoverUrl] with
         * `webhookEventFailoverUrl.orElse(null)`.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: Optional<String>) =
            webhookEventFailoverUrl(webhookEventFailoverUrl.getOrNull())

        /**
         * Sets [Builder.webhookEventFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventFailoverUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookEventFailoverUrl(webhookEventFailoverUrl: JsonField<String>) = apply {
            this.webhookEventFailoverUrl = webhookEventFailoverUrl
        }

        /**
         * The URL where webhooks related to this connection will be sent. Must include a scheme,
         * such as `https`.
         */
        fun webhookEventUrl(webhookEventUrl: String) =
            webhookEventUrl(JsonField.of(webhookEventUrl))

        /**
         * Sets [Builder.webhookEventUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEventUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookEventUrl(webhookEventUrl: JsonField<String>) = apply {
            this.webhookEventUrl = webhookEventUrl
        }

        fun webhookTimeoutSecs(webhookTimeoutSecs: Long?) =
            webhookTimeoutSecs(JsonField.ofNullable(webhookTimeoutSecs))

        /**
         * Alias for [Builder.webhookTimeoutSecs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Long) =
            webhookTimeoutSecs(webhookTimeoutSecs as Long?)

        /**
         * Alias for calling [Builder.webhookTimeoutSecs] with `webhookTimeoutSecs.orElse(null)`.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: Optional<Long>) =
            webhookTimeoutSecs(webhookTimeoutSecs.getOrNull())

        /**
         * Sets [Builder.webhookTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookTimeoutSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookTimeoutSecs(webhookTimeoutSecs: JsonField<Long>) = apply {
            this.webhookTimeoutSecs = webhookTimeoutSecs
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
         * Returns an immutable instance of [CallControlApplication].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallControlApplication =
            CallControlApplication(
                id,
                active,
                anchorsiteOverride,
                applicationName,
                createdAt,
                dtmfType,
                firstCommandTimeout,
                firstCommandTimeoutSecs,
                inbound,
                outbound,
                recordType,
                redactDtmfDebugLogging,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                webhookApiVersion,
                webhookEventFailoverUrl,
                webhookEventUrl,
                webhookTimeoutSecs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CallControlApplication = apply {
        if (validated) {
            return@apply
        }

        id()
        active()
        anchorsiteOverride().ifPresent { it.validate() }
        applicationName()
        createdAt()
        dtmfType().ifPresent { it.validate() }
        firstCommandTimeout()
        firstCommandTimeoutSecs()
        inbound().ifPresent { it.validate() }
        outbound().ifPresent { it.validate() }
        recordType().ifPresent { it.validate() }
        redactDtmfDebugLogging()
        tags()
        updatedAt()
        webhookApiVersion().ifPresent { it.validate() }
        webhookEventFailoverUrl()
        webhookEventUrl()
        webhookTimeoutSecs()
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
            (if (applicationName.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dtmfType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (firstCommandTimeout.asKnown().isPresent) 1 else 0) +
            (if (firstCommandTimeoutSecs.asKnown().isPresent) 1 else 0) +
            (inbound.asKnown().getOrNull()?.validity() ?: 0) +
            (outbound.asKnown().getOrNull()?.validity() ?: 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (redactDtmfDebugLogging.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (webhookApiVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webhookEventFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookEventUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookTimeoutSecs.asKnown().isPresent) 1 else 0)

    /**
     * `Latency` directs Telnyx to route media through the site with the lowest round-trip time to
     * the user's connection. Telnyx calculates this time using ICMP ping messages. This can be
     * disabled by specifying a site to handle all media.
     */
    class AnchorsiteOverride
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

            @JvmField val LATENCY = of("\"Latency\"")

            @JvmField val CHICAGO_IL = of("\"Chicago, IL\"")

            @JvmField val ASHBURN_VA = of("\"Ashburn, VA\"")

            @JvmField val SAN_JOSE_CA = of("\"San Jose, CA\"")

            @JvmStatic fun of(value: String) = AnchorsiteOverride(JsonField.of(value))
        }

        /** An enum containing [AnchorsiteOverride]'s known values. */
        enum class Known {
            LATENCY,
            CHICAGO_IL,
            ASHBURN_VA,
            SAN_JOSE_CA,
        }

        /**
         * An enum containing [AnchorsiteOverride]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AnchorsiteOverride] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LATENCY,
            CHICAGO_IL,
            ASHBURN_VA,
            SAN_JOSE_CA,
            /**
             * An enum member indicating that [AnchorsiteOverride] was instantiated with an unknown
             * value.
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
                LATENCY -> Value.LATENCY
                CHICAGO_IL -> Value.CHICAGO_IL
                ASHBURN_VA -> Value.ASHBURN_VA
                SAN_JOSE_CA -> Value.SAN_JOSE_CA
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
                LATENCY -> Known.LATENCY
                CHICAGO_IL -> Known.CHICAGO_IL
                ASHBURN_VA -> Known.ASHBURN_VA
                SAN_JOSE_CA -> Known.SAN_JOSE_CA
                else -> throw TelnyxInvalidDataException("Unknown AnchorsiteOverride: $value")
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

        fun validate(): AnchorsiteOverride = apply {
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

            return other is AnchorsiteOverride && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent
     * to Telnyx will be accepted in all formats.
     */
    class DtmfType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RFC_2833 = of("RFC 2833")

            @JvmField val INBAND = of("Inband")

            @JvmField val SIP_INFO = of("SIP INFO")

            @JvmStatic fun of(value: String) = DtmfType(JsonField.of(value))
        }

        /** An enum containing [DtmfType]'s known values. */
        enum class Known {
            RFC_2833,
            INBAND,
            SIP_INFO,
        }

        /**
         * An enum containing [DtmfType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DtmfType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RFC_2833,
            INBAND,
            SIP_INFO,
            /** An enum member indicating that [DtmfType] was instantiated with an unknown value. */
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
                RFC_2833 -> Value.RFC_2833
                INBAND -> Value.INBAND
                SIP_INFO -> Value.SIP_INFO
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
                RFC_2833 -> Known.RFC_2833
                INBAND -> Known.INBAND
                SIP_INFO -> Known.SIP_INFO
                else -> throw TelnyxInvalidDataException("Unknown DtmfType: $value")
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

        fun validate(): DtmfType = apply {
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

            return other is DtmfType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            @JvmField val CALL_CONTROL_APPLICATION = of("call_control_application")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            CALL_CONTROL_APPLICATION
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
            CALL_CONTROL_APPLICATION,
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
                CALL_CONTROL_APPLICATION -> Value.CALL_CONTROL_APPLICATION
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
                CALL_CONTROL_APPLICATION -> Known.CALL_CONTROL_APPLICATION
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

    /** Determines which webhook format will be used, Telnyx API v1 or v2. */
    class WebhookApiVersion @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val _1 = of("1")

            @JvmField val _2 = of("2")

            @JvmStatic fun of(value: String) = WebhookApiVersion(JsonField.of(value))
        }

        /** An enum containing [WebhookApiVersion]'s known values. */
        enum class Known {
            _1,
            _2,
        }

        /**
         * An enum containing [WebhookApiVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookApiVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1,
            _2,
            /**
             * An enum member indicating that [WebhookApiVersion] was instantiated with an unknown
             * value.
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
                _1 -> Value._1
                _2 -> Value._2
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
                _1 -> Known._1
                _2 -> Known._2
                else -> throw TelnyxInvalidDataException("Unknown WebhookApiVersion: $value")
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

        fun validate(): WebhookApiVersion = apply {
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

            return other is WebhookApiVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallControlApplication &&
            id == other.id &&
            active == other.active &&
            anchorsiteOverride == other.anchorsiteOverride &&
            applicationName == other.applicationName &&
            createdAt == other.createdAt &&
            dtmfType == other.dtmfType &&
            firstCommandTimeout == other.firstCommandTimeout &&
            firstCommandTimeoutSecs == other.firstCommandTimeoutSecs &&
            inbound == other.inbound &&
            outbound == other.outbound &&
            recordType == other.recordType &&
            redactDtmfDebugLogging == other.redactDtmfDebugLogging &&
            tags == other.tags &&
            updatedAt == other.updatedAt &&
            webhookApiVersion == other.webhookApiVersion &&
            webhookEventFailoverUrl == other.webhookEventFailoverUrl &&
            webhookEventUrl == other.webhookEventUrl &&
            webhookTimeoutSecs == other.webhookTimeoutSecs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            active,
            anchorsiteOverride,
            applicationName,
            createdAt,
            dtmfType,
            firstCommandTimeout,
            firstCommandTimeoutSecs,
            inbound,
            outbound,
            recordType,
            redactDtmfDebugLogging,
            tags,
            updatedAt,
            webhookApiVersion,
            webhookEventFailoverUrl,
            webhookEventUrl,
            webhookTimeoutSecs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallControlApplication{id=$id, active=$active, anchorsiteOverride=$anchorsiteOverride, applicationName=$applicationName, createdAt=$createdAt, dtmfType=$dtmfType, firstCommandTimeout=$firstCommandTimeout, firstCommandTimeoutSecs=$firstCommandTimeoutSecs, inbound=$inbound, outbound=$outbound, recordType=$recordType, redactDtmfDebugLogging=$redactDtmfDebugLogging, tags=$tags, updatedAt=$updatedAt, webhookApiVersion=$webhookApiVersion, webhookEventFailoverUrl=$webhookEventFailoverUrl, webhookEventUrl=$webhookEventUrl, webhookTimeoutSecs=$webhookTimeoutSecs, additionalProperties=$additionalProperties}"
}
