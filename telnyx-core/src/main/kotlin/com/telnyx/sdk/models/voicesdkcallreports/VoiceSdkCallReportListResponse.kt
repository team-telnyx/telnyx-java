// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicesdkcallreports

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
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A raw call report stats JSON payload. The schema is intentionally permissive because Voice SDK
 * clients can add fields over time.
 */
class VoiceSdkCallReportListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callId: JsonField<String>,
    private val callReportId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val flushReason: JsonField<FlushReason>,
    private val logs: JsonField<Logs>,
    private val organizationId: JsonField<String>,
    private val segment: JsonField<Long>,
    private val stats: JsonField<Stats>,
    private val storedAt: JsonField<OffsetDateTime>,
    private val summary: JsonField<Summary>,
    private val telnyxLegId: JsonField<String>,
    private val telnyxSessionId: JsonField<String>,
    private val userAgent: JsonField<String>,
    private val userId: JsonField<String>,
    private val version: JsonField<String>,
    private val voiceSdkId: JsonField<String>,
    private val voiceSdkIdDecoded: JsonField<VoiceSdkIdDecoded>,
    private val voiceSdkSessionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("call_id") @ExcludeMissing callId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_report_id")
        @ExcludeMissing
        callReportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("flushReason")
        @ExcludeMissing
        flushReason: JsonField<FlushReason> = JsonMissing.of(),
        @JsonProperty("logs") @ExcludeMissing logs: JsonField<Logs> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segment") @ExcludeMissing segment: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stats") @ExcludeMissing stats: JsonField<Stats> = JsonMissing.of(),
        @JsonProperty("stored_at")
        @ExcludeMissing
        storedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
        @JsonProperty("telnyx_leg_id")
        @ExcludeMissing
        telnyxLegId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("telnyx_session_id")
        @ExcludeMissing
        telnyxSessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_agent") @ExcludeMissing userAgent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voice_sdk_id")
        @ExcludeMissing
        voiceSdkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voice_sdk_id_decoded")
        @ExcludeMissing
        voiceSdkIdDecoded: JsonField<VoiceSdkIdDecoded> = JsonMissing.of(),
        @JsonProperty("voice_sdk_session_id")
        @ExcludeMissing
        voiceSdkSessionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        callId,
        callReportId,
        createdAt,
        flushReason,
        logs,
        organizationId,
        segment,
        stats,
        storedAt,
        summary,
        telnyxLegId,
        telnyxSessionId,
        userAgent,
        userId,
        version,
        voiceSdkId,
        voiceSdkIdDecoded,
        voiceSdkSessionId,
        mutableMapOf(),
    )

    /**
     * Unique call identifier.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callId(): Optional<String> = callId.getOptional("call_id")

    /**
     * User-scoped storage grouping identifier derived from the authenticated user. This is not a
     * unique per-call report identifier and may be shared by multiple calls for the same user.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callReportId(): Optional<String> = callReportId.getOptional("call_report_id")

    /**
     * Creation timestamp when present.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Reason the SDK flushed this stats report segment, for example an intermediate socket-close
     * flush.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun flushReason(): Optional<FlushReason> = flushReason.getOptional("flushReason")

    /**
     * Raw logs payload emitted by the Voice SDK and stored without normalization. Live responses
     * commonly return an array of log entries, but object-shaped log payloads are also allowed for
     * compatibility.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logs(): Optional<Logs> = logs.getOptional("logs")

    /**
     * Organization associated with the stored call report when provided by the Voice SDK reporting
     * path.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * Zero-based stats segment index when the SDK sends segmented or intermediate reports.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segment(): Optional<Long> = segment.getOptional("segment")

    /**
     * Raw stats payload emitted by the Voice SDK and stored without normalization. The exact shape
     * can vary by SDK platform and version. Live responses commonly return an array of interval
     * snapshots, but object-shaped stats payloads are also allowed for compatibility.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stats(): Optional<Stats> = stats.getOptional("stats")

    /**
     * Time when the call report was stored.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun storedAt(): Optional<OffsetDateTime> = storedAt.getOptional("stored_at")

    /**
     * High-level call metadata.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summary(): Optional<Summary> = summary.getOptional("summary")

    /**
     * Telnyx call leg identifier for correlating the report with call-control, SIP, and media
     * troubleshooting data.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telnyxLegId(): Optional<String> = telnyxLegId.getOptional("telnyx_leg_id")

    /**
     * Telnyx RTC session identifier for correlating the report with Voice SDK signaling and
     * media-session logs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telnyxSessionId(): Optional<String> = telnyxSessionId.getOptional("telnyx_session_id")

    /**
     * Voice SDK user agent string reported by the client. This is the preferred
     * SDK/platform/version dimension when present.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userAgent(): Optional<String> = userAgent.getOptional("user_agent")

    /**
     * Authenticated user that owns the call report.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Legacy SDK version value when the client reports one separately from the user agent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<String> = version.getOptional("version")

    /**
     * Voice SDK instance identifier.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSdkId(): Optional<String> = voiceSdkId.getOptional("voice_sdk_id")

    /**
     * Decoded Voice SDK identifier metadata emitted by voice-sdk-proxy when available.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSdkIdDecoded(): Optional<VoiceSdkIdDecoded> =
        voiceSdkIdDecoded.getOptional("voice_sdk_id_decoded")

    /**
     * Voice SDK session correlation identifier used to group stats segments for the same SDK
     * session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSdkSessionId(): Optional<String> =
        voiceSdkSessionId.getOptional("voice_sdk_session_id")

    /**
     * Returns the raw JSON value of [callId].
     *
     * Unlike [callId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

    /**
     * Returns the raw JSON value of [callReportId].
     *
     * Unlike [callReportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_report_id")
    @ExcludeMissing
    fun _callReportId(): JsonField<String> = callReportId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [flushReason].
     *
     * Unlike [flushReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flushReason")
    @ExcludeMissing
    fun _flushReason(): JsonField<FlushReason> = flushReason

    /**
     * Returns the raw JSON value of [logs].
     *
     * Unlike [logs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonField<Logs> = logs

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [segment].
     *
     * Unlike [segment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Long> = segment

    /**
     * Returns the raw JSON value of [stats].
     *
     * Unlike [stats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stats") @ExcludeMissing fun _stats(): JsonField<Stats> = stats

    /**
     * Returns the raw JSON value of [storedAt].
     *
     * Unlike [storedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stored_at") @ExcludeMissing fun _storedAt(): JsonField<OffsetDateTime> = storedAt

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

    /**
     * Returns the raw JSON value of [telnyxLegId].
     *
     * Unlike [telnyxLegId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("telnyx_leg_id")
    @ExcludeMissing
    fun _telnyxLegId(): JsonField<String> = telnyxLegId

    /**
     * Returns the raw JSON value of [telnyxSessionId].
     *
     * Unlike [telnyxSessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("telnyx_session_id")
    @ExcludeMissing
    fun _telnyxSessionId(): JsonField<String> = telnyxSessionId

    /**
     * Returns the raw JSON value of [userAgent].
     *
     * Unlike [userAgent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_agent") @ExcludeMissing fun _userAgent(): JsonField<String> = userAgent

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

    /**
     * Returns the raw JSON value of [voiceSdkId].
     *
     * Unlike [voiceSdkId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice_sdk_id") @ExcludeMissing fun _voiceSdkId(): JsonField<String> = voiceSdkId

    /**
     * Returns the raw JSON value of [voiceSdkIdDecoded].
     *
     * Unlike [voiceSdkIdDecoded], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("voice_sdk_id_decoded")
    @ExcludeMissing
    fun _voiceSdkIdDecoded(): JsonField<VoiceSdkIdDecoded> = voiceSdkIdDecoded

    /**
     * Returns the raw JSON value of [voiceSdkSessionId].
     *
     * Unlike [voiceSdkSessionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("voice_sdk_session_id")
    @ExcludeMissing
    fun _voiceSdkSessionId(): JsonField<String> = voiceSdkSessionId

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
         * [VoiceSdkCallReportListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceSdkCallReportListResponse]. */
    class Builder internal constructor() {

        private var callId: JsonField<String> = JsonMissing.of()
        private var callReportId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var flushReason: JsonField<FlushReason> = JsonMissing.of()
        private var logs: JsonField<Logs> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var segment: JsonField<Long> = JsonMissing.of()
        private var stats: JsonField<Stats> = JsonMissing.of()
        private var storedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var summary: JsonField<Summary> = JsonMissing.of()
        private var telnyxLegId: JsonField<String> = JsonMissing.of()
        private var telnyxSessionId: JsonField<String> = JsonMissing.of()
        private var userAgent: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var version: JsonField<String> = JsonMissing.of()
        private var voiceSdkId: JsonField<String> = JsonMissing.of()
        private var voiceSdkIdDecoded: JsonField<VoiceSdkIdDecoded> = JsonMissing.of()
        private var voiceSdkSessionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voiceSdkCallReportListResponse: VoiceSdkCallReportListResponse) = apply {
            callId = voiceSdkCallReportListResponse.callId
            callReportId = voiceSdkCallReportListResponse.callReportId
            createdAt = voiceSdkCallReportListResponse.createdAt
            flushReason = voiceSdkCallReportListResponse.flushReason
            logs = voiceSdkCallReportListResponse.logs
            organizationId = voiceSdkCallReportListResponse.organizationId
            segment = voiceSdkCallReportListResponse.segment
            stats = voiceSdkCallReportListResponse.stats
            storedAt = voiceSdkCallReportListResponse.storedAt
            summary = voiceSdkCallReportListResponse.summary
            telnyxLegId = voiceSdkCallReportListResponse.telnyxLegId
            telnyxSessionId = voiceSdkCallReportListResponse.telnyxSessionId
            userAgent = voiceSdkCallReportListResponse.userAgent
            userId = voiceSdkCallReportListResponse.userId
            version = voiceSdkCallReportListResponse.version
            voiceSdkId = voiceSdkCallReportListResponse.voiceSdkId
            voiceSdkIdDecoded = voiceSdkCallReportListResponse.voiceSdkIdDecoded
            voiceSdkSessionId = voiceSdkCallReportListResponse.voiceSdkSessionId
            additionalProperties =
                voiceSdkCallReportListResponse.additionalProperties.toMutableMap()
        }

        /** Unique call identifier. */
        fun callId(callId: String) = callId(JsonField.of(callId))

        /**
         * Sets [Builder.callId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callId(callId: JsonField<String>) = apply { this.callId = callId }

        /**
         * User-scoped storage grouping identifier derived from the authenticated user. This is not
         * a unique per-call report identifier and may be shared by multiple calls for the same
         * user.
         */
        fun callReportId(callReportId: String) = callReportId(JsonField.of(callReportId))

        /**
         * Sets [Builder.callReportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callReportId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callReportId(callReportId: JsonField<String>) = apply {
            this.callReportId = callReportId
        }

        /** Creation timestamp when present. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Reason the SDK flushed this stats report segment, for example an intermediate
         * socket-close flush.
         */
        fun flushReason(flushReason: FlushReason) = flushReason(JsonField.of(flushReason))

        /**
         * Sets [Builder.flushReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flushReason] with a well-typed [FlushReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun flushReason(flushReason: JsonField<FlushReason>) = apply {
            this.flushReason = flushReason
        }

        /**
         * Raw logs payload emitted by the Voice SDK and stored without normalization. Live
         * responses commonly return an array of log entries, but object-shaped log payloads are
         * also allowed for compatibility.
         */
        fun logs(logs: Logs) = logs(JsonField.of(logs))

        /**
         * Sets [Builder.logs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logs] with a well-typed [Logs] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logs(logs: JsonField<Logs>) = apply { this.logs = logs }

        /**
         * Alias for calling [logs] with
         * `Logs.ofVoiceSdkCallReportLogEntries(voiceSdkCallReportLogEntries)`.
         */
        fun logsOfVoiceSdkCallReportLogEntries(
            voiceSdkCallReportLogEntries: List<Logs.VoiceSdkCallReportLogEntry>
        ) = logs(Logs.ofVoiceSdkCallReportLogEntries(voiceSdkCallReportLogEntries))

        /** Alias for calling [logs] with `Logs.ofEntries(entries)`. */
        fun logs(entries: Logs.Entries) = logs(Logs.ofEntries(entries))

        /**
         * Organization associated with the stored call report when provided by the Voice SDK
         * reporting path.
         */
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

        /** Zero-based stats segment index when the SDK sends segmented or intermediate reports. */
        fun segment(segment: Long) = segment(JsonField.of(segment))

        /**
         * Sets [Builder.segment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segment] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun segment(segment: JsonField<Long>) = apply { this.segment = segment }

        /**
         * Raw stats payload emitted by the Voice SDK and stored without normalization. The exact
         * shape can vary by SDK platform and version. Live responses commonly return an array of
         * interval snapshots, but object-shaped stats payloads are also allowed for compatibility.
         */
        fun stats(stats: Stats) = stats(JsonField.of(stats))

        /**
         * Sets [Builder.stats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stats] with a well-typed [Stats] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stats(stats: JsonField<Stats>) = apply { this.stats = stats }

        /**
         * Alias for calling [stats] with
         * `Stats.ofUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s)`.
         */
        fun statsOfUnnamedSchemaWithArrayParent4s(
            unnamedSchemaWithArrayParent4s: List<Stats.UnnamedSchemaWithArrayParent4>
        ) = stats(Stats.ofUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s))

        /** Alias for calling [stats] with `Stats.ofUnionMember1(unionMember1)`. */
        fun stats(unionMember1: Stats.UnionMember1) = stats(Stats.ofUnionMember1(unionMember1))

        /** Time when the call report was stored. */
        fun storedAt(storedAt: OffsetDateTime) = storedAt(JsonField.of(storedAt))

        /**
         * Sets [Builder.storedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun storedAt(storedAt: JsonField<OffsetDateTime>) = apply { this.storedAt = storedAt }

        /** High-level call metadata. */
        fun summary(summary: Summary) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [Summary] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

        /**
         * Telnyx call leg identifier for correlating the report with call-control, SIP, and media
         * troubleshooting data.
         */
        fun telnyxLegId(telnyxLegId: String) = telnyxLegId(JsonField.of(telnyxLegId))

        /**
         * Sets [Builder.telnyxLegId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxLegId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun telnyxLegId(telnyxLegId: JsonField<String>) = apply { this.telnyxLegId = telnyxLegId }

        /**
         * Telnyx RTC session identifier for correlating the report with Voice SDK signaling and
         * media-session logs.
         */
        fun telnyxSessionId(telnyxSessionId: String) =
            telnyxSessionId(JsonField.of(telnyxSessionId))

        /**
         * Sets [Builder.telnyxSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telnyxSessionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telnyxSessionId(telnyxSessionId: JsonField<String>) = apply {
            this.telnyxSessionId = telnyxSessionId
        }

        /**
         * Voice SDK user agent string reported by the client. This is the preferred
         * SDK/platform/version dimension when present.
         */
        fun userAgent(userAgent: String) = userAgent(JsonField.of(userAgent))

        /**
         * Sets [Builder.userAgent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userAgent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

        /** Authenticated user that owns the call report. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Legacy SDK version value when the client reports one separately from the user agent. */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

        /** Voice SDK instance identifier. */
        fun voiceSdkId(voiceSdkId: String) = voiceSdkId(JsonField.of(voiceSdkId))

        /**
         * Sets [Builder.voiceSdkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSdkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voiceSdkId(voiceSdkId: JsonField<String>) = apply { this.voiceSdkId = voiceSdkId }

        /** Decoded Voice SDK identifier metadata emitted by voice-sdk-proxy when available. */
        fun voiceSdkIdDecoded(voiceSdkIdDecoded: VoiceSdkIdDecoded) =
            voiceSdkIdDecoded(JsonField.of(voiceSdkIdDecoded))

        /**
         * Sets [Builder.voiceSdkIdDecoded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSdkIdDecoded] with a well-typed [VoiceSdkIdDecoded]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun voiceSdkIdDecoded(voiceSdkIdDecoded: JsonField<VoiceSdkIdDecoded>) = apply {
            this.voiceSdkIdDecoded = voiceSdkIdDecoded
        }

        /**
         * Voice SDK session correlation identifier used to group stats segments for the same SDK
         * session.
         */
        fun voiceSdkSessionId(voiceSdkSessionId: String) =
            voiceSdkSessionId(JsonField.of(voiceSdkSessionId))

        /**
         * Sets [Builder.voiceSdkSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSdkSessionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceSdkSessionId(voiceSdkSessionId: JsonField<String>) = apply {
            this.voiceSdkSessionId = voiceSdkSessionId
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
         * Returns an immutable instance of [VoiceSdkCallReportListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VoiceSdkCallReportListResponse =
            VoiceSdkCallReportListResponse(
                callId,
                callReportId,
                createdAt,
                flushReason,
                logs,
                organizationId,
                segment,
                stats,
                storedAt,
                summary,
                telnyxLegId,
                telnyxSessionId,
                userAgent,
                userId,
                version,
                voiceSdkId,
                voiceSdkIdDecoded,
                voiceSdkSessionId,
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
    fun validate(): VoiceSdkCallReportListResponse = apply {
        if (validated) {
            return@apply
        }

        callId()
        callReportId()
        createdAt()
        flushReason().ifPresent { it.validate() }
        logs().ifPresent { it.validate() }
        organizationId()
        segment()
        stats().ifPresent { it.validate() }
        storedAt()
        summary().ifPresent { it.validate() }
        telnyxLegId()
        telnyxSessionId()
        userAgent()
        userId()
        version()
        voiceSdkId()
        voiceSdkIdDecoded().ifPresent { it.validate() }
        voiceSdkSessionId()
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
        (if (callId.asKnown().isPresent) 1 else 0) +
            (if (callReportId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (flushReason.asKnown().getOrNull()?.validity() ?: 0) +
            (logs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (segment.asKnown().isPresent) 1 else 0) +
            (stats.asKnown().getOrNull()?.validity() ?: 0) +
            (if (storedAt.asKnown().isPresent) 1 else 0) +
            (summary.asKnown().getOrNull()?.validity() ?: 0) +
            (if (telnyxLegId.asKnown().isPresent) 1 else 0) +
            (if (telnyxSessionId.asKnown().isPresent) 1 else 0) +
            (if (userAgent.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (voiceSdkId.asKnown().isPresent) 1 else 0) +
            (voiceSdkIdDecoded.asKnown().getOrNull()?.validity() ?: 0) +
            (if (voiceSdkSessionId.asKnown().isPresent) 1 else 0)

    /**
     * Reason the SDK flushed this stats report segment, for example an intermediate socket-close
     * flush.
     */
    class FlushReason
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

            /** Returns a mutable builder for constructing an instance of [FlushReason]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FlushReason]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(flushReason: FlushReason) = apply {
                additionalProperties = flushReason.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FlushReason].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FlushReason = FlushReason(additionalProperties.toImmutable())
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
        fun validate(): FlushReason = apply {
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

            return other is FlushReason && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FlushReason{additionalProperties=$additionalProperties}"
    }

    /**
     * Raw logs payload emitted by the Voice SDK and stored without normalization. Live responses
     * commonly return an array of log entries, but object-shaped log payloads are also allowed for
     * compatibility.
     */
    @JsonDeserialize(using = Logs.Deserializer::class)
    @JsonSerialize(using = Logs.Serializer::class)
    class Logs
    private constructor(
        private val voiceSdkCallReportLogEntries: List<VoiceSdkCallReportLogEntry>? = null,
        private val entries: Entries? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Raw log entries emitted by the Voice SDK. */
        fun voiceSdkCallReportLogEntries(): Optional<List<VoiceSdkCallReportLogEntry>> =
            Optional.ofNullable(voiceSdkCallReportLogEntries)

        /**
         * Raw logs object emitted by the Voice SDK when logs are grouped under an entries field.
         */
        fun entries(): Optional<Entries> = Optional.ofNullable(entries)

        fun isVoiceSdkCallReportLogEntries(): Boolean = voiceSdkCallReportLogEntries != null

        fun isEntries(): Boolean = entries != null

        /** Raw log entries emitted by the Voice SDK. */
        fun asVoiceSdkCallReportLogEntries(): List<VoiceSdkCallReportLogEntry> =
            voiceSdkCallReportLogEntries.getOrThrow("voiceSdkCallReportLogEntries")

        /**
         * Raw logs object emitted by the Voice SDK when logs are grouped under an entries field.
         */
        fun asEntries(): Entries = entries.getOrThrow("entries")

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
         * Optional<String> result = logs.accept(new Logs.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitVoiceSdkCallReportLogEntries(List<VoiceSdkCallReportLogEntry> voiceSdkCallReportLogEntries) {
         *         return Optional.of(voiceSdkCallReportLogEntries.toString());
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
                voiceSdkCallReportLogEntries != null ->
                    visitor.visitVoiceSdkCallReportLogEntries(voiceSdkCallReportLogEntries)
                entries != null -> visitor.visitEntries(entries)
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
        fun validate(): Logs = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitVoiceSdkCallReportLogEntries(
                        voiceSdkCallReportLogEntries: List<VoiceSdkCallReportLogEntry>
                    ) {
                        voiceSdkCallReportLogEntries.forEach { it.validate() }
                    }

                    override fun visitEntries(entries: Entries) {
                        entries.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitVoiceSdkCallReportLogEntries(
                        voiceSdkCallReportLogEntries: List<VoiceSdkCallReportLogEntry>
                    ) = voiceSdkCallReportLogEntries.sumOf { it.validity().toInt() }

                    override fun visitEntries(entries: Entries) = entries.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Logs &&
                voiceSdkCallReportLogEntries == other.voiceSdkCallReportLogEntries &&
                entries == other.entries
        }

        override fun hashCode(): Int = Objects.hash(voiceSdkCallReportLogEntries, entries)

        override fun toString(): String =
            when {
                voiceSdkCallReportLogEntries != null ->
                    "Logs{voiceSdkCallReportLogEntries=$voiceSdkCallReportLogEntries}"
                entries != null -> "Logs{entries=$entries}"
                _json != null -> "Logs{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Logs")
            }

        companion object {

            /** Raw log entries emitted by the Voice SDK. */
            @JvmStatic
            fun ofVoiceSdkCallReportLogEntries(
                voiceSdkCallReportLogEntries: List<VoiceSdkCallReportLogEntry>
            ) = Logs(voiceSdkCallReportLogEntries = voiceSdkCallReportLogEntries.toImmutable())

            /**
             * Raw logs object emitted by the Voice SDK when logs are grouped under an entries
             * field.
             */
            @JvmStatic fun ofEntries(entries: Entries) = Logs(entries = entries)
        }

        /** An interface that defines how to map each variant of [Logs] to a value of type [T]. */
        interface Visitor<out T> {

            /** Raw log entries emitted by the Voice SDK. */
            fun visitVoiceSdkCallReportLogEntries(
                voiceSdkCallReportLogEntries: List<VoiceSdkCallReportLogEntry>
            ): T

            /**
             * Raw logs object emitted by the Voice SDK when logs are grouped under an entries
             * field.
             */
            fun visitEntries(entries: Entries): T

            /**
             * Maps an unknown variant of [Logs] to a value of type [T].
             *
             * An instance of [Logs] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Logs: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Logs>(Logs::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Logs {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Entries>())?.let {
                                Logs(entries = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<VoiceSdkCallReportLogEntry>>())
                                ?.let { Logs(voiceSdkCallReportLogEntries = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Logs(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Logs>(Logs::class) {

            override fun serialize(
                value: Logs,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.voiceSdkCallReportLogEntries != null ->
                        generator.writeObject(value.voiceSdkCallReportLogEntries)
                    value.entries != null -> generator.writeObject(value.entries)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Logs")
                }
            }
        }

        /** A raw Voice SDK log entry. Additional SDK-specific fields may be present. */
        class VoiceSdkCallReportLogEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val context: JsonField<Context>,
            private val level: JsonField<Level>,
            private val message: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("context")
                @ExcludeMissing
                context: JsonField<Context> = JsonMissing.of(),
                @JsonProperty("level") @ExcludeMissing level: JsonField<Level> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(context, level, message, timestamp, mutableMapOf())

            /**
             * Raw structured context attached to the log entry.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun context(): Optional<Context> = context.getOptional("context")

            /**
             * Log level emitted by the SDK.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun level(): Optional<Level> = level.getOptional("level")

            /**
             * Log message.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun message(): Optional<String> = message.getOptional("message")

            /**
             * Time when the log entry was emitted.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

            /**
             * Returns the raw JSON value of [context].
             *
             * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<Context> = context

            /**
             * Returns the raw JSON value of [level].
             *
             * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Level> = level

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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
                 * [VoiceSdkCallReportLogEntry].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VoiceSdkCallReportLogEntry]. */
            class Builder internal constructor() {

                private var context: JsonField<Context> = JsonMissing.of()
                private var level: JsonField<Level> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(voiceSdkCallReportLogEntry: VoiceSdkCallReportLogEntry) = apply {
                    context = voiceSdkCallReportLogEntry.context
                    level = voiceSdkCallReportLogEntry.level
                    message = voiceSdkCallReportLogEntry.message
                    timestamp = voiceSdkCallReportLogEntry.timestamp
                    additionalProperties =
                        voiceSdkCallReportLogEntry.additionalProperties.toMutableMap()
                }

                /** Raw structured context attached to the log entry. */
                fun context(context: Context) = context(JsonField.of(context))

                /**
                 * Sets [Builder.context] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.context] with a well-typed [Context] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun context(context: JsonField<Context>) = apply { this.context = context }

                /** Log level emitted by the SDK. */
                fun level(level: Level) = level(JsonField.of(level))

                /**
                 * Sets [Builder.level] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.level] with a well-typed [Level] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun level(level: JsonField<Level>) = apply { this.level = level }

                /** Log message. */
                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                /** Time when the log entry was emitted. */
                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
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
                 * Returns an immutable instance of [VoiceSdkCallReportLogEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VoiceSdkCallReportLogEntry =
                    VoiceSdkCallReportLogEntry(
                        context,
                        level,
                        message,
                        timestamp,
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
            fun validate(): VoiceSdkCallReportLogEntry = apply {
                if (validated) {
                    return@apply
                }

                context().ifPresent { it.validate() }
                level().ifPresent { it.validate() }
                message()
                timestamp()
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
                (context.asKnown().getOrNull()?.validity() ?: 0) +
                    (level.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0)

            /** Raw structured context attached to the log entry. */
            class Context
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

                    /** Returns a mutable builder for constructing an instance of [Context]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Context]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(context: Context) = apply {
                        additionalProperties = context.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Context].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Context = Context(additionalProperties.toImmutable())
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
                fun validate(): Context = apply {
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

                    return other is Context && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Context{additionalProperties=$additionalProperties}"
            }

            /** Log level emitted by the SDK. */
            class Level @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val DEBUG = of("debug")

                    @JvmField val INFO = of("info")

                    @JvmField val WARN = of("warn")

                    @JvmField val ERROR = of("error")

                    @JvmStatic fun of(value: String) = Level(JsonField.of(value))
                }

                /** An enum containing [Level]'s known values. */
                enum class Known {
                    DEBUG,
                    INFO,
                    WARN,
                    ERROR,
                }

                /**
                 * An enum containing [Level]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Level] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DEBUG,
                    INFO,
                    WARN,
                    ERROR,
                    /**
                     * An enum member indicating that [Level] was instantiated with an unknown
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
                        DEBUG -> Value.DEBUG
                        INFO -> Value.INFO
                        WARN -> Value.WARN
                        ERROR -> Value.ERROR
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
                        DEBUG -> Known.DEBUG
                        INFO -> Known.INFO
                        WARN -> Known.WARN
                        ERROR -> Known.ERROR
                        else -> throw TelnyxInvalidDataException("Unknown Level: $value")
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
                fun validate(): Level = apply {
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

                    return other is Level && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VoiceSdkCallReportLogEntry &&
                    context == other.context &&
                    level == other.level &&
                    message == other.message &&
                    timestamp == other.timestamp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(context, level, message, timestamp, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VoiceSdkCallReportLogEntry{context=$context, level=$level, message=$message, timestamp=$timestamp, additionalProperties=$additionalProperties}"
        }

        /**
         * Raw logs object emitted by the Voice SDK when logs are grouped under an entries field.
         */
        class Entries
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val entries: JsonField<List<Entry>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("entries")
                @ExcludeMissing
                entries: JsonField<List<Entry>> = JsonMissing.of()
            ) : this(entries, mutableMapOf())

            /**
             * Raw log entries when the SDK groups logs under an entries field.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun entries(): Optional<List<Entry>> = entries.getOptional("entries")

            /**
             * Returns the raw JSON value of [entries].
             *
             * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("entries")
            @ExcludeMissing
            fun _entries(): JsonField<List<Entry>> = entries

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

                /** Returns a mutable builder for constructing an instance of [Entries]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entries]. */
            class Builder internal constructor() {

                private var entries: JsonField<MutableList<Entry>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entries: Entries) = apply {
                    this.entries = entries.entries.map { it.toMutableList() }
                    additionalProperties = entries.additionalProperties.toMutableMap()
                }

                /** Raw log entries when the SDK groups logs under an entries field. */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /**
                 * Sets [Builder.entries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entries] with a well-typed `List<Entry>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entries(entries: JsonField<List<Entry>>) = apply {
                    this.entries = entries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Entry] to [entries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEntry(entry: Entry) = apply {
                    entries =
                        (entries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("entries", it).add(entry)
                        }
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
                 * Returns an immutable instance of [Entries].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Entries =
                    Entries(
                        (entries ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): Entries = apply {
                if (validated) {
                    return@apply
                }

                entries().ifPresent { it.forEach { it.validate() } }
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
                (entries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** A raw Voice SDK log entry. Additional SDK-specific fields may be present. */
            class Entry
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val context: JsonField<Context>,
                private val level: JsonField<Level>,
                private val message: JsonField<String>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("context")
                    @ExcludeMissing
                    context: JsonField<Context> = JsonMissing.of(),
                    @JsonProperty("level")
                    @ExcludeMissing
                    level: JsonField<Level> = JsonMissing.of(),
                    @JsonProperty("message")
                    @ExcludeMissing
                    message: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(context, level, message, timestamp, mutableMapOf())

                /**
                 * Raw structured context attached to the log entry.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun context(): Optional<Context> = context.getOptional("context")

                /**
                 * Log level emitted by the SDK.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun level(): Optional<Level> = level.getOptional("level")

                /**
                 * Log message.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun message(): Optional<String> = message.getOptional("message")

                /**
                 * Time when the log entry was emitted.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

                /**
                 * Returns the raw JSON value of [context].
                 *
                 * Unlike [context], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("context")
                @ExcludeMissing
                fun _context(): JsonField<Context> = context

                /**
                 * Returns the raw JSON value of [level].
                 *
                 * Unlike [level], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Level> = level

                /**
                 * Returns the raw JSON value of [message].
                 *
                 * Unlike [message], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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

                    /** Returns a mutable builder for constructing an instance of [Entry]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Entry]. */
                class Builder internal constructor() {

                    private var context: JsonField<Context> = JsonMissing.of()
                    private var level: JsonField<Level> = JsonMissing.of()
                    private var message: JsonField<String> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(entry: Entry) = apply {
                        context = entry.context
                        level = entry.level
                        message = entry.message
                        timestamp = entry.timestamp
                        additionalProperties = entry.additionalProperties.toMutableMap()
                    }

                    /** Raw structured context attached to the log entry. */
                    fun context(context: Context) = context(JsonField.of(context))

                    /**
                     * Sets [Builder.context] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.context] with a well-typed [Context] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun context(context: JsonField<Context>) = apply { this.context = context }

                    /** Log level emitted by the SDK. */
                    fun level(level: Level) = level(JsonField.of(level))

                    /**
                     * Sets [Builder.level] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.level] with a well-typed [Level] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun level(level: JsonField<Level>) = apply { this.level = level }

                    /** Log message. */
                    fun message(message: String) = message(JsonField.of(message))

                    /**
                     * Sets [Builder.message] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.message] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun message(message: JsonField<String>) = apply { this.message = message }

                    /** Time when the log entry was emitted. */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
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
                     * Returns an immutable instance of [Entry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Entry =
                        Entry(
                            context,
                            level,
                            message,
                            timestamp,
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Entry = apply {
                    if (validated) {
                        return@apply
                    }

                    context().ifPresent { it.validate() }
                    level().ifPresent { it.validate() }
                    message()
                    timestamp()
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
                    (context.asKnown().getOrNull()?.validity() ?: 0) +
                        (level.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (message.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0)

                /** Raw structured context attached to the log entry. */
                class Context
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

                        /** Returns a mutable builder for constructing an instance of [Context]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Context]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(context: Context) = apply {
                            additionalProperties = context.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Context].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Context = Context(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Context = apply {
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

                        return other is Context &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Context{additionalProperties=$additionalProperties}"
                }

                /** Log level emitted by the SDK. */
                class Level @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DEBUG = of("debug")

                        @JvmField val INFO = of("info")

                        @JvmField val WARN = of("warn")

                        @JvmField val ERROR = of("error")

                        @JvmStatic fun of(value: String) = Level(JsonField.of(value))
                    }

                    /** An enum containing [Level]'s known values. */
                    enum class Known {
                        DEBUG,
                        INFO,
                        WARN,
                        ERROR,
                    }

                    /**
                     * An enum containing [Level]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Level] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DEBUG,
                        INFO,
                        WARN,
                        ERROR,
                        /**
                         * An enum member indicating that [Level] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DEBUG -> Value.DEBUG
                            INFO -> Value.INFO
                            WARN -> Value.WARN
                            ERROR -> Value.ERROR
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DEBUG -> Known.DEBUG
                            INFO -> Known.INFO
                            WARN -> Known.WARN
                            ERROR -> Known.ERROR
                            else -> throw TelnyxInvalidDataException("Unknown Level: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws TelnyxInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Level = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Level && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Entry &&
                        context == other.context &&
                        level == other.level &&
                        message == other.message &&
                        timestamp == other.timestamp &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(context, level, message, timestamp, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Entry{context=$context, level=$level, message=$message, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entries &&
                    entries == other.entries &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(entries, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entries{entries=$entries, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Raw stats payload emitted by the Voice SDK and stored without normalization. The exact shape
     * can vary by SDK platform and version. Live responses commonly return an array of interval
     * snapshots, but object-shaped stats payloads are also allowed for compatibility.
     */
    @JsonDeserialize(using = Stats.Deserializer::class)
    @JsonSerialize(using = Stats.Serializer::class)
    class Stats
    private constructor(
        private val unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Raw interval stats snapshots emitted by the Voice SDK. */
        fun unnamedSchemaWithArrayParent4s(): Optional<List<UnnamedSchemaWithArrayParent4>> =
            Optional.ofNullable(unnamedSchemaWithArrayParent4s)

        /** Raw stats object emitted by the Voice SDK. */
        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isUnnamedSchemaWithArrayParent4s(): Boolean = unnamedSchemaWithArrayParent4s != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        /** Raw interval stats snapshots emitted by the Voice SDK. */
        fun asUnnamedSchemaWithArrayParent4s(): List<UnnamedSchemaWithArrayParent4> =
            unnamedSchemaWithArrayParent4s.getOrThrow("unnamedSchemaWithArrayParent4s")

        /** Raw stats object emitted by the Voice SDK. */
        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

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
         * Optional<String> result = stats.accept(new Stats.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitUnnamedSchemaWithArrayParent4s(List<UnnamedSchemaWithArrayParent4> unnamedSchemaWithArrayParent4s) {
         *         return Optional.of(unnamedSchemaWithArrayParent4s.toString());
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
                unnamedSchemaWithArrayParent4s != null ->
                    visitor.visitUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
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
        fun validate(): Stats = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnnamedSchemaWithArrayParent4s(
                        unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                    ) {
                        unnamedSchemaWithArrayParent4s.forEach { it.validate() }
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitUnnamedSchemaWithArrayParent4s(
                        unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                    ) = unnamedSchemaWithArrayParent4s.sumOf { it.validity().toInt() }

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stats &&
                unnamedSchemaWithArrayParent4s == other.unnamedSchemaWithArrayParent4s &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(unnamedSchemaWithArrayParent4s, unionMember1)

        override fun toString(): String =
            when {
                unnamedSchemaWithArrayParent4s != null ->
                    "Stats{unnamedSchemaWithArrayParent4s=$unnamedSchemaWithArrayParent4s}"
                unionMember1 != null -> "Stats{unionMember1=$unionMember1}"
                _json != null -> "Stats{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Stats")
            }

        companion object {

            /** Raw interval stats snapshots emitted by the Voice SDK. */
            @JvmStatic
            fun ofUnnamedSchemaWithArrayParent4s(
                unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
            ) = Stats(unnamedSchemaWithArrayParent4s = unnamedSchemaWithArrayParent4s.toImmutable())

            /** Raw stats object emitted by the Voice SDK. */
            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Stats(unionMember1 = unionMember1)
        }

        /** An interface that defines how to map each variant of [Stats] to a value of type [T]. */
        interface Visitor<out T> {

            /** Raw interval stats snapshots emitted by the Voice SDK. */
            fun visitUnnamedSchemaWithArrayParent4s(
                unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
            ): T

            /** Raw stats object emitted by the Voice SDK. */
            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [Stats] to a value of type [T].
             *
             * An instance of [Stats] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Stats: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Stats>(Stats::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Stats {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Stats(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<UnnamedSchemaWithArrayParent4>>(),
                                )
                                ?.let { Stats(unnamedSchemaWithArrayParent4s = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Stats(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Stats>(Stats::class) {

            override fun serialize(
                value: Stats,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unnamedSchemaWithArrayParent4s != null ->
                        generator.writeObject(value.unnamedSchemaWithArrayParent4s)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Stats")
                }
            }
        }

        /**
         * Raw stats snapshot. It may include WebRTC RTCStatsReport-style entries and audio,
         * connection, ICE, or transport metrics.
         */
        class UnnamedSchemaWithArrayParent4
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [UnnamedSchemaWithArrayParent4].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnnamedSchemaWithArrayParent4]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unnamedSchemaWithArrayParent4: UnnamedSchemaWithArrayParent4) =
                    apply {
                        additionalProperties =
                            unnamedSchemaWithArrayParent4.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnnamedSchemaWithArrayParent4].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnnamedSchemaWithArrayParent4 =
                    UnnamedSchemaWithArrayParent4(additionalProperties.toImmutable())
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
            fun validate(): UnnamedSchemaWithArrayParent4 = apply {
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

                return other is UnnamedSchemaWithArrayParent4 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnnamedSchemaWithArrayParent4{additionalProperties=$additionalProperties}"
        }

        /** Raw stats object emitted by the Voice SDK. */
        class UnionMember1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val audio: JsonField<Audio>,
            private val connection: JsonField<Connection>,
            private val ice: JsonField<Ice>,
            private val transport: JsonField<Transport>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("audio") @ExcludeMissing audio: JsonField<Audio> = JsonMissing.of(),
                @JsonProperty("connection")
                @ExcludeMissing
                connection: JsonField<Connection> = JsonMissing.of(),
                @JsonProperty("ice") @ExcludeMissing ice: JsonField<Ice> = JsonMissing.of(),
                @JsonProperty("transport")
                @ExcludeMissing
                transport: JsonField<Transport> = JsonMissing.of(),
            ) : this(audio, connection, ice, transport, mutableMapOf())

            /**
             * Raw audio stats such as inbound/outbound packet, byte, jitter, packet-loss, bitrate,
             * and audio-level metrics.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun audio(): Optional<Audio> = audio.getOptional("audio")

            /**
             * Raw connection stats such as round-trip time, packets, and bytes sent or received.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun connection(): Optional<Connection> = connection.getOptional("connection")

            /**
             * Raw ICE candidate-pair information, including selected pair, local/remote candidates,
             * state, and nomination data when provided by the SDK.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ice(): Optional<Ice> = ice.getOptional("ice")

            /**
             * Raw transport stats such as ICE state, DTLS state, SRTP cipher, TLS version, and
             * selected-candidate-pair changes.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transport(): Optional<Transport> = transport.getOptional("transport")

            /**
             * Returns the raw JSON value of [audio].
             *
             * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<Audio> = audio

            /**
             * Returns the raw JSON value of [connection].
             *
             * Unlike [connection], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("connection")
            @ExcludeMissing
            fun _connection(): JsonField<Connection> = connection

            /**
             * Returns the raw JSON value of [ice].
             *
             * Unlike [ice], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ice") @ExcludeMissing fun _ice(): JsonField<Ice> = ice

            /**
             * Returns the raw JSON value of [transport].
             *
             * Unlike [transport], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transport")
            @ExcludeMissing
            fun _transport(): JsonField<Transport> = transport

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

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var audio: JsonField<Audio> = JsonMissing.of()
                private var connection: JsonField<Connection> = JsonMissing.of()
                private var ice: JsonField<Ice> = JsonMissing.of()
                private var transport: JsonField<Transport> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    audio = unionMember1.audio
                    connection = unionMember1.connection
                    ice = unionMember1.ice
                    transport = unionMember1.transport
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                /**
                 * Raw audio stats such as inbound/outbound packet, byte, jitter, packet-loss,
                 * bitrate, and audio-level metrics.
                 */
                fun audio(audio: Audio) = audio(JsonField.of(audio))

                /**
                 * Sets [Builder.audio] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.audio] with a well-typed [Audio] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun audio(audio: JsonField<Audio>) = apply { this.audio = audio }

                /**
                 * Raw connection stats such as round-trip time, packets, and bytes sent or
                 * received.
                 */
                fun connection(connection: Connection) = connection(JsonField.of(connection))

                /**
                 * Sets [Builder.connection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connection] with a well-typed [Connection] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun connection(connection: JsonField<Connection>) = apply {
                    this.connection = connection
                }

                /**
                 * Raw ICE candidate-pair information, including selected pair, local/remote
                 * candidates, state, and nomination data when provided by the SDK.
                 */
                fun ice(ice: Ice) = ice(JsonField.of(ice))

                /**
                 * Sets [Builder.ice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ice] with a well-typed [Ice] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun ice(ice: JsonField<Ice>) = apply { this.ice = ice }

                /**
                 * Raw transport stats such as ICE state, DTLS state, SRTP cipher, TLS version, and
                 * selected-candidate-pair changes.
                 */
                fun transport(transport: Transport) = transport(JsonField.of(transport))

                /**
                 * Sets [Builder.transport] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transport] with a well-typed [Transport] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transport(transport: JsonField<Transport>) = apply {
                    this.transport = transport
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
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 =
                    UnionMember1(
                        audio,
                        connection,
                        ice,
                        transport,
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
            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                audio().ifPresent { it.validate() }
                connection().ifPresent { it.validate() }
                ice().ifPresent { it.validate() }
                transport().ifPresent { it.validate() }
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
                (audio.asKnown().getOrNull()?.validity() ?: 0) +
                    (connection.asKnown().getOrNull()?.validity() ?: 0) +
                    (ice.asKnown().getOrNull()?.validity() ?: 0) +
                    (transport.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Raw audio stats such as inbound/outbound packet, byte, jitter, packet-loss, bitrate,
             * and audio-level metrics.
             */
            class Audio
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

                    /** Returns a mutable builder for constructing an instance of [Audio]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Audio]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(audio: Audio) = apply {
                        additionalProperties = audio.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Audio].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Audio = Audio(additionalProperties.toImmutable())
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
                fun validate(): Audio = apply {
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

                    return other is Audio && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Audio{additionalProperties=$additionalProperties}"
            }

            /**
             * Raw connection stats such as round-trip time, packets, and bytes sent or received.
             */
            class Connection
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

                    /** Returns a mutable builder for constructing an instance of [Connection]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Connection]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(connection: Connection) = apply {
                        additionalProperties = connection.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Connection].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Connection = Connection(additionalProperties.toImmutable())
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
                fun validate(): Connection = apply {
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

                    return other is Connection && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Connection{additionalProperties=$additionalProperties}"
            }

            /**
             * Raw ICE candidate-pair information, including selected pair, local/remote candidates,
             * state, and nomination data when provided by the SDK.
             */
            class Ice
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

                    /** Returns a mutable builder for constructing an instance of [Ice]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Ice]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(ice: Ice) = apply {
                        additionalProperties = ice.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Ice].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Ice = Ice(additionalProperties.toImmutable())
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
                fun validate(): Ice = apply {
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

                    return other is Ice && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Ice{additionalProperties=$additionalProperties}"
            }

            /**
             * Raw transport stats such as ICE state, DTLS state, SRTP cipher, TLS version, and
             * selected-candidate-pair changes.
             */
            class Transport
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

                    /** Returns a mutable builder for constructing an instance of [Transport]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Transport]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(transport: Transport) = apply {
                        additionalProperties = transport.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Transport].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Transport = Transport(additionalProperties.toImmutable())
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
                fun validate(): Transport = apply {
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

                    return other is Transport && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Transport{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    audio == other.audio &&
                    connection == other.connection &&
                    ice == other.ice &&
                    transport == other.transport &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(audio, connection, ice, transport, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{audio=$audio, connection=$connection, ice=$ice, transport=$transport, additionalProperties=$additionalProperties}"
        }
    }

    /** High-level call metadata. */
    class Summary
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

            /** Returns a mutable builder for constructing an instance of [Summary]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Summary]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(summary: Summary) = apply {
                additionalProperties = summary.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Summary].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Summary = Summary(additionalProperties.toImmutable())
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
        fun validate(): Summary = apply {
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

            return other is Summary && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Summary{additionalProperties=$additionalProperties}"
    }

    /** Decoded Voice SDK identifier metadata emitted by voice-sdk-proxy when available. */
    class VoiceSdkIdDecoded
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

            /** Returns a mutable builder for constructing an instance of [VoiceSdkIdDecoded]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VoiceSdkIdDecoded]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voiceSdkIdDecoded: VoiceSdkIdDecoded) = apply {
                additionalProperties = voiceSdkIdDecoded.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [VoiceSdkIdDecoded].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VoiceSdkIdDecoded = VoiceSdkIdDecoded(additionalProperties.toImmutable())
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
        fun validate(): VoiceSdkIdDecoded = apply {
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

            return other is VoiceSdkIdDecoded && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "VoiceSdkIdDecoded{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceSdkCallReportListResponse &&
            callId == other.callId &&
            callReportId == other.callReportId &&
            createdAt == other.createdAt &&
            flushReason == other.flushReason &&
            logs == other.logs &&
            organizationId == other.organizationId &&
            segment == other.segment &&
            stats == other.stats &&
            storedAt == other.storedAt &&
            summary == other.summary &&
            telnyxLegId == other.telnyxLegId &&
            telnyxSessionId == other.telnyxSessionId &&
            userAgent == other.userAgent &&
            userId == other.userId &&
            version == other.version &&
            voiceSdkId == other.voiceSdkId &&
            voiceSdkIdDecoded == other.voiceSdkIdDecoded &&
            voiceSdkSessionId == other.voiceSdkSessionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callId,
            callReportId,
            createdAt,
            flushReason,
            logs,
            organizationId,
            segment,
            stats,
            storedAt,
            summary,
            telnyxLegId,
            telnyxSessionId,
            userAgent,
            userId,
            version,
            voiceSdkId,
            voiceSdkIdDecoded,
            voiceSdkSessionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoiceSdkCallReportListResponse{callId=$callId, callReportId=$callReportId, createdAt=$createdAt, flushReason=$flushReason, logs=$logs, organizationId=$organizationId, segment=$segment, stats=$stats, storedAt=$storedAt, summary=$summary, telnyxLegId=$telnyxLegId, telnyxSessionId=$telnyxSessionId, userAgent=$userAgent, userId=$userId, version=$version, voiceSdkId=$voiceSdkId, voiceSdkIdDecoded=$voiceSdkIdDecoded, voiceSdkSessionId=$voiceSdkSessionId, additionalProperties=$additionalProperties}"
}
