// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordings

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RecordingResponseData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val callControlId: JsonField<String>,
    private val callLegId: JsonField<String>,
    private val callSessionId: JsonField<String>,
    private val channels: JsonField<Channels>,
    private val conferenceId: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val downloadUrls: JsonField<DownloadUrls>,
    private val durationMillis: JsonField<Int>,
    private val recordType: JsonField<RecordType>,
    private val recordingEndedAt: JsonField<String>,
    private val recordingStartedAt: JsonField<String>,
    private val source: JsonField<Source>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_control_id")
        @ExcludeMissing
        callControlId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_leg_id")
        @ExcludeMissing
        callLegId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_session_id")
        @ExcludeMissing
        callSessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channels") @ExcludeMissing channels: JsonField<Channels> = JsonMissing.of(),
        @JsonProperty("conference_id")
        @ExcludeMissing
        conferenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("download_urls")
        @ExcludeMissing
        downloadUrls: JsonField<DownloadUrls> = JsonMissing.of(),
        @JsonProperty("duration_millis")
        @ExcludeMissing
        durationMillis: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("recording_ended_at")
        @ExcludeMissing
        recordingEndedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recording_started_at")
        @ExcludeMissing
        recordingStartedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        callControlId,
        callLegId,
        callSessionId,
        channels,
        conferenceId,
        createdAt,
        downloadUrls,
        durationMillis,
        recordType,
        recordingEndedAt,
        recordingStartedAt,
        source,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies the recording.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Unique identifier and token for controlling the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callControlId(): Optional<String> = callControlId.getOptional("call_control_id")

    /**
     * ID unique to the call leg (used to correlate webhook events).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callLegId(): Optional<String> = callLegId.getOptional("call_leg_id")

    /**
     * ID that is unique to the call session and can be used to correlate webhook events. Call
     * session is a group of related call legs that logically belong to the same phone call, e.g. an
     * inbound and outbound leg of a transferred call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callSessionId(): Optional<String> = callSessionId.getOptional("call_session_id")

    /**
     * When `dual`, the final audio file has the first leg on channel A, and the rest on channel B.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<Channels> = channels.getOptional("channels")

    /**
     * Uniquely identifies the conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceId(): Optional<String> = conferenceId.getOptional("conference_id")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * Links to download the recording files.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrls(): Optional<DownloadUrls> = downloadUrls.getOptional("download_urls")

    /**
     * The duration of the recording in milliseconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMillis(): Optional<Int> = durationMillis.getOptional("duration_millis")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * ISO 8601 formatted date of when the recording ended.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingEndedAt(): Optional<String> = recordingEndedAt.getOptional("recording_ended_at")

    /**
     * ISO 8601 formatted date of when the recording started.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStartedAt(): Optional<String> =
        recordingStartedAt.getOptional("recording_started_at")

    /**
     * The kind of event that led to this recording being created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<Source> = source.getOptional("source")

    /**
     * The status of the recording. Only `completed` recordings are currently supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [callControlId].
     *
     * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_control_id")
    @ExcludeMissing
    fun _callControlId(): JsonField<String> = callControlId

    /**
     * Returns the raw JSON value of [callLegId].
     *
     * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_leg_id") @ExcludeMissing fun _callLegId(): JsonField<String> = callLegId

    /**
     * Returns the raw JSON value of [callSessionId].
     *
     * Unlike [callSessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_session_id")
    @ExcludeMissing
    fun _callSessionId(): JsonField<String> = callSessionId

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<Channels> = channels

    /**
     * Returns the raw JSON value of [conferenceId].
     *
     * Unlike [conferenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conference_id")
    @ExcludeMissing
    fun _conferenceId(): JsonField<String> = conferenceId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [downloadUrls].
     *
     * Unlike [downloadUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_urls")
    @ExcludeMissing
    fun _downloadUrls(): JsonField<DownloadUrls> = downloadUrls

    /**
     * Returns the raw JSON value of [durationMillis].
     *
     * Unlike [durationMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_millis")
    @ExcludeMissing
    fun _durationMillis(): JsonField<Int> = durationMillis

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [recordingEndedAt].
     *
     * Unlike [recordingEndedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recording_ended_at")
    @ExcludeMissing
    fun _recordingEndedAt(): JsonField<String> = recordingEndedAt

    /**
     * Returns the raw JSON value of [recordingStartedAt].
     *
     * Unlike [recordingStartedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recording_started_at")
    @ExcludeMissing
    fun _recordingStartedAt(): JsonField<String> = recordingStartedAt

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [RecordingResponseData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordingResponseData]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var callControlId: JsonField<String> = JsonMissing.of()
        private var callLegId: JsonField<String> = JsonMissing.of()
        private var callSessionId: JsonField<String> = JsonMissing.of()
        private var channels: JsonField<Channels> = JsonMissing.of()
        private var conferenceId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var downloadUrls: JsonField<DownloadUrls> = JsonMissing.of()
        private var durationMillis: JsonField<Int> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var recordingEndedAt: JsonField<String> = JsonMissing.of()
        private var recordingStartedAt: JsonField<String> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recordingResponseData: RecordingResponseData) = apply {
            id = recordingResponseData.id
            callControlId = recordingResponseData.callControlId
            callLegId = recordingResponseData.callLegId
            callSessionId = recordingResponseData.callSessionId
            channels = recordingResponseData.channels
            conferenceId = recordingResponseData.conferenceId
            createdAt = recordingResponseData.createdAt
            downloadUrls = recordingResponseData.downloadUrls
            durationMillis = recordingResponseData.durationMillis
            recordType = recordingResponseData.recordType
            recordingEndedAt = recordingResponseData.recordingEndedAt
            recordingStartedAt = recordingResponseData.recordingStartedAt
            source = recordingResponseData.source
            status = recordingResponseData.status
            updatedAt = recordingResponseData.updatedAt
            additionalProperties = recordingResponseData.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies the recording. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique identifier and token for controlling the call. */
        fun callControlId(callControlId: String) = callControlId(JsonField.of(callControlId))

        /**
         * Sets [Builder.callControlId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callControlId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callControlId(callControlId: JsonField<String>) = apply {
            this.callControlId = callControlId
        }

        /** ID unique to the call leg (used to correlate webhook events). */
        fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

        /**
         * Sets [Builder.callLegId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callLegId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

        /**
         * ID that is unique to the call session and can be used to correlate webhook events. Call
         * session is a group of related call legs that logically belong to the same phone call,
         * e.g. an inbound and outbound leg of a transferred call.
         */
        fun callSessionId(callSessionId: String) = callSessionId(JsonField.of(callSessionId))

        /**
         * Sets [Builder.callSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callSessionId(callSessionId: JsonField<String>) = apply {
            this.callSessionId = callSessionId
        }

        /**
         * When `dual`, the final audio file has the first leg on channel A, and the rest on channel
         * B.
         */
        fun channels(channels: Channels) = channels(JsonField.of(channels))

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed [Channels] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channels(channels: JsonField<Channels>) = apply { this.channels = channels }

        /** Uniquely identifies the conference. */
        fun conferenceId(conferenceId: String) = conferenceId(JsonField.of(conferenceId))

        /**
         * Sets [Builder.conferenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun conferenceId(conferenceId: JsonField<String>) = apply {
            this.conferenceId = conferenceId
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

        /** Links to download the recording files. */
        fun downloadUrls(downloadUrls: DownloadUrls) = downloadUrls(JsonField.of(downloadUrls))

        /**
         * Sets [Builder.downloadUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrls] with a well-typed [DownloadUrls] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun downloadUrls(downloadUrls: JsonField<DownloadUrls>) = apply {
            this.downloadUrls = downloadUrls
        }

        /** The duration of the recording in milliseconds. */
        fun durationMillis(durationMillis: Int) = durationMillis(JsonField.of(durationMillis))

        /**
         * Sets [Builder.durationMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMillis] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun durationMillis(durationMillis: JsonField<Int>) = apply {
            this.durationMillis = durationMillis
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

        /** ISO 8601 formatted date of when the recording ended. */
        fun recordingEndedAt(recordingEndedAt: String) =
            recordingEndedAt(JsonField.of(recordingEndedAt))

        /**
         * Sets [Builder.recordingEndedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingEndedAt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordingEndedAt(recordingEndedAt: JsonField<String>) = apply {
            this.recordingEndedAt = recordingEndedAt
        }

        /** ISO 8601 formatted date of when the recording started. */
        fun recordingStartedAt(recordingStartedAt: String) =
            recordingStartedAt(JsonField.of(recordingStartedAt))

        /**
         * Sets [Builder.recordingStartedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStartedAt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordingStartedAt(recordingStartedAt: JsonField<String>) = apply {
            this.recordingStartedAt = recordingStartedAt
        }

        /** The kind of event that led to this recording being created. */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** The status of the recording. Only `completed` recordings are currently supported. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [RecordingResponseData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RecordingResponseData =
            RecordingResponseData(
                id,
                callControlId,
                callLegId,
                callSessionId,
                channels,
                conferenceId,
                createdAt,
                downloadUrls,
                durationMillis,
                recordType,
                recordingEndedAt,
                recordingStartedAt,
                source,
                status,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecordingResponseData = apply {
        if (validated) {
            return@apply
        }

        id()
        callControlId()
        callLegId()
        callSessionId()
        channels().ifPresent { it.validate() }
        conferenceId()
        createdAt()
        downloadUrls().ifPresent { it.validate() }
        durationMillis()
        recordType().ifPresent { it.validate() }
        recordingEndedAt()
        recordingStartedAt()
        source().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        updatedAt()
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
            (if (callControlId.asKnown().isPresent) 1 else 0) +
            (if (callLegId.asKnown().isPresent) 1 else 0) +
            (if (callSessionId.asKnown().isPresent) 1 else 0) +
            (channels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conferenceId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (downloadUrls.asKnown().getOrNull()?.validity() ?: 0) +
            (if (durationMillis.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordingEndedAt.asKnown().isPresent) 1 else 0) +
            (if (recordingStartedAt.asKnown().isPresent) 1 else 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * When `dual`, the final audio file has the first leg on channel A, and the rest on channel B.
     */
    class Channels @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SINGLE = of("single")

            @JvmField val DUAL = of("dual")

            @JvmStatic fun of(value: String) = Channels(JsonField.of(value))
        }

        /** An enum containing [Channels]'s known values. */
        enum class Known {
            SINGLE,
            DUAL,
        }

        /**
         * An enum containing [Channels]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            DUAL,
            /** An enum member indicating that [Channels] was instantiated with an unknown value. */
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
                SINGLE -> Value.SINGLE
                DUAL -> Value.DUAL
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
                SINGLE -> Known.SINGLE
                DUAL -> Known.DUAL
                else -> throw TelnyxInvalidDataException("Unknown Channels: $value")
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

        fun validate(): Channels = apply {
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

            return other is Channels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Links to download the recording files. */
    class DownloadUrls
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mp3: JsonField<String>,
        private val wav: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mp3") @ExcludeMissing mp3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wav") @ExcludeMissing wav: JsonField<String> = JsonMissing.of(),
        ) : this(mp3, wav, mutableMapOf())

        /**
         * Link to download the recording in mp3 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mp3(): Optional<String> = mp3.getOptional("mp3")

        /**
         * Link to download the recording in wav format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun wav(): Optional<String> = wav.getOptional("wav")

        /**
         * Returns the raw JSON value of [mp3].
         *
         * Unlike [mp3], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mp3") @ExcludeMissing fun _mp3(): JsonField<String> = mp3

        /**
         * Returns the raw JSON value of [wav].
         *
         * Unlike [wav], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wav") @ExcludeMissing fun _wav(): JsonField<String> = wav

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

            /** Returns a mutable builder for constructing an instance of [DownloadUrls]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DownloadUrls]. */
        class Builder internal constructor() {

            private var mp3: JsonField<String> = JsonMissing.of()
            private var wav: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(downloadUrls: DownloadUrls) = apply {
                mp3 = downloadUrls.mp3
                wav = downloadUrls.wav
                additionalProperties = downloadUrls.additionalProperties.toMutableMap()
            }

            /** Link to download the recording in mp3 format. */
            fun mp3(mp3: String) = mp3(JsonField.of(mp3))

            /**
             * Sets [Builder.mp3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mp3] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mp3(mp3: JsonField<String>) = apply { this.mp3 = mp3 }

            /** Link to download the recording in wav format. */
            fun wav(wav: String) = wav(JsonField.of(wav))

            /**
             * Sets [Builder.wav] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wav] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun wav(wav: JsonField<String>) = apply { this.wav = wav }

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
             * Returns an immutable instance of [DownloadUrls].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DownloadUrls = DownloadUrls(mp3, wav, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DownloadUrls = apply {
            if (validated) {
                return@apply
            }

            mp3()
            wav()
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
            (if (mp3.asKnown().isPresent) 1 else 0) + (if (wav.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DownloadUrls &&
                mp3 == other.mp3 &&
                wav == other.wav &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(mp3, wav, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DownloadUrls{mp3=$mp3, wav=$wav, additionalProperties=$additionalProperties}"
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

            @JvmField val RECORDING = of("recording")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            RECORDING
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
            RECORDING,
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
                RECORDING -> Value.RECORDING
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
                RECORDING -> Known.RECORDING
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

    /** The kind of event that led to this recording being created. */
    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CONFERENCE = of("conference")

            @JvmField val CALL = of("call")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            CONFERENCE,
            CALL,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONFERENCE,
            CALL,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                CONFERENCE -> Value.CONFERENCE
                CALL -> Value.CALL
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
                CONFERENCE -> Known.CONFERENCE
                CALL -> Known.CALL
                else -> throw TelnyxInvalidDataException("Unknown Source: $value")
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

        fun validate(): Source = apply {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the recording. Only `completed` recordings are currently supported. */
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

            @JvmField val COMPLETED = of("completed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED
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
            COMPLETED,
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
                COMPLETED -> Value.COMPLETED
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
                COMPLETED -> Known.COMPLETED
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

        return other is RecordingResponseData &&
            id == other.id &&
            callControlId == other.callControlId &&
            callLegId == other.callLegId &&
            callSessionId == other.callSessionId &&
            channels == other.channels &&
            conferenceId == other.conferenceId &&
            createdAt == other.createdAt &&
            downloadUrls == other.downloadUrls &&
            durationMillis == other.durationMillis &&
            recordType == other.recordType &&
            recordingEndedAt == other.recordingEndedAt &&
            recordingStartedAt == other.recordingStartedAt &&
            source == other.source &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            callControlId,
            callLegId,
            callSessionId,
            channels,
            conferenceId,
            createdAt,
            downloadUrls,
            durationMillis,
            recordType,
            recordingEndedAt,
            recordingStartedAt,
            source,
            status,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecordingResponseData{id=$id, callControlId=$callControlId, callLegId=$callLegId, callSessionId=$callSessionId, channels=$channels, conferenceId=$conferenceId, createdAt=$createdAt, downloadUrls=$downloadUrls, durationMillis=$durationMillis, recordType=$recordType, recordingEndedAt=$recordingEndedAt, recordingStartedAt=$recordingStartedAt, source=$source, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
