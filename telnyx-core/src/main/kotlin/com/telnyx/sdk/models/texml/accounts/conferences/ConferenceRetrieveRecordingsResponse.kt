// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConferenceRetrieveRecordingsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val end: JsonField<Long>,
    private val firstPageUri: JsonField<String>,
    private val nextPageUri: JsonField<String>,
    private val page: JsonField<Long>,
    private val pageSize: JsonField<Long>,
    private val participants: JsonField<List<JsonValue>>,
    private val recordings: JsonField<List<Recording>>,
    private val start: JsonField<Long>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end") @ExcludeMissing end: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("first_page_uri")
        @ExcludeMissing
        firstPageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_page_uri")
        @ExcludeMissing
        nextPageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("participants")
        @ExcludeMissing
        participants: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("recordings")
        @ExcludeMissing
        recordings: JsonField<List<Recording>> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        end,
        firstPageUri,
        nextPageUri,
        page,
        pageSize,
        participants,
        recordings,
        start,
        uri,
        mutableMapOf(),
    )

    /**
     * The number of the last element on the page, zero-indexed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun end(): Optional<Long> = end.getOptional("end")

    /**
     * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?page=0&pagesize=20
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstPageUri(): Optional<String> = firstPageUri.getOptional("first_page_uri")

    /**
     * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPageUri(): Optional<String> = nextPageUri.getOptional("next_page_uri")

    /**
     * Current page number, zero-indexed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun page(): Optional<Long> = page.getOptional("page")

    /**
     * The number of items on the page
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

    /**
     * List of participant resources.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<List<JsonValue>> = participants.getOptional("participants")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordings(): Optional<List<Recording>> = recordings.getOptional("recordings")

    /**
     * The number of the first element on the page, zero-indexed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun start(): Optional<Long> = start.getOptional("start")

    /**
     * The URI of the current page.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uri(): Optional<String> = uri.getOptional("uri")

    /**
     * Returns the raw JSON value of [end].
     *
     * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Long> = end

    /**
     * Returns the raw JSON value of [firstPageUri].
     *
     * Unlike [firstPageUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_page_uri")
    @ExcludeMissing
    fun _firstPageUri(): JsonField<String> = firstPageUri

    /**
     * Returns the raw JSON value of [nextPageUri].
     *
     * Unlike [nextPageUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page_uri")
    @ExcludeMissing
    fun _nextPageUri(): JsonField<String> = nextPageUri

    /**
     * Returns the raw JSON value of [page].
     *
     * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

    /**
     * Returns the raw JSON value of [participants].
     *
     * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participants")
    @ExcludeMissing
    fun _participants(): JsonField<List<JsonValue>> = participants

    /**
     * Returns the raw JSON value of [recordings].
     *
     * Unlike [recordings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recordings")
    @ExcludeMissing
    fun _recordings(): JsonField<List<Recording>> = recordings

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Long> = start

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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
         * [ConferenceRetrieveRecordingsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceRetrieveRecordingsResponse]. */
    class Builder internal constructor() {

        private var end: JsonField<Long> = JsonMissing.of()
        private var firstPageUri: JsonField<String> = JsonMissing.of()
        private var nextPageUri: JsonField<String> = JsonMissing.of()
        private var page: JsonField<Long> = JsonMissing.of()
        private var pageSize: JsonField<Long> = JsonMissing.of()
        private var participants: JsonField<MutableList<JsonValue>>? = null
        private var recordings: JsonField<MutableList<Recording>>? = null
        private var start: JsonField<Long> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conferenceRetrieveRecordingsResponse: ConferenceRetrieveRecordingsResponse
        ) = apply {
            end = conferenceRetrieveRecordingsResponse.end
            firstPageUri = conferenceRetrieveRecordingsResponse.firstPageUri
            nextPageUri = conferenceRetrieveRecordingsResponse.nextPageUri
            page = conferenceRetrieveRecordingsResponse.page
            pageSize = conferenceRetrieveRecordingsResponse.pageSize
            participants =
                conferenceRetrieveRecordingsResponse.participants.map { it.toMutableList() }
            recordings = conferenceRetrieveRecordingsResponse.recordings.map { it.toMutableList() }
            start = conferenceRetrieveRecordingsResponse.start
            uri = conferenceRetrieveRecordingsResponse.uri
            additionalProperties =
                conferenceRetrieveRecordingsResponse.additionalProperties.toMutableMap()
        }

        /** The number of the last element on the page, zero-indexed. */
        fun end(end: Long) = end(JsonField.of(end))

        /**
         * Sets [Builder.end] to an arbitrary JSON value.
         *
         * You should usually call [Builder.end] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun end(end: JsonField<Long>) = apply { this.end = end }

        /**
         * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?page=0&pagesize=20
         */
        fun firstPageUri(firstPageUri: String) = firstPageUri(JsonField.of(firstPageUri))

        /**
         * Sets [Builder.firstPageUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstPageUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstPageUri(firstPageUri: JsonField<String>) = apply {
            this.firstPageUri = firstPageUri
        }

        /**
         * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Recordings.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ
         */
        fun nextPageUri(nextPageUri: String) = nextPageUri(JsonField.of(nextPageUri))

        /**
         * Sets [Builder.nextPageUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPageUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextPageUri(nextPageUri: JsonField<String>) = apply { this.nextPageUri = nextPageUri }

        /** Current page number, zero-indexed. */
        fun page(page: Long) = page(JsonField.of(page))

        /**
         * Sets [Builder.page] to an arbitrary JSON value.
         *
         * You should usually call [Builder.page] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun page(page: JsonField<Long>) = apply { this.page = page }

        /** The number of items on the page */
        fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

        /** List of participant resources. */
        fun participants(participants: List<JsonValue>) = participants(JsonField.of(participants))

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun participants(participants: JsonField<List<JsonValue>>) = apply {
            this.participants = participants.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: JsonValue) = apply {
            participants =
                (participants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("participants", it).add(participant)
                }
        }

        fun recordings(recordings: List<Recording>) = recordings(JsonField.of(recordings))

        /**
         * Sets [Builder.recordings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordings] with a well-typed `List<Recording>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordings(recordings: JsonField<List<Recording>>) = apply {
            this.recordings = recordings.map { it.toMutableList() }
        }

        /**
         * Adds a single [Recording] to [recordings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecording(recording: Recording) = apply {
            recordings =
                (recordings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordings", it).add(recording)
                }
        }

        /** The number of the first element on the page, zero-indexed. */
        fun start(start: Long) = start(JsonField.of(start))

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun start(start: JsonField<Long>) = apply { this.start = start }

        /** The URI of the current page. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
         * Returns an immutable instance of [ConferenceRetrieveRecordingsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConferenceRetrieveRecordingsResponse =
            ConferenceRetrieveRecordingsResponse(
                end,
                firstPageUri,
                nextPageUri,
                page,
                pageSize,
                (participants ?: JsonMissing.of()).map { it.toImmutable() },
                (recordings ?: JsonMissing.of()).map { it.toImmutable() },
                start,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConferenceRetrieveRecordingsResponse = apply {
        if (validated) {
            return@apply
        }

        end()
        firstPageUri()
        nextPageUri()
        page()
        pageSize()
        participants()
        recordings().ifPresent { it.forEach { it.validate() } }
        start()
        uri()
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
        (if (end.asKnown().isPresent) 1 else 0) +
            (if (firstPageUri.asKnown().isPresent) 1 else 0) +
            (if (nextPageUri.asKnown().isPresent) 1 else 0) +
            (if (page.asKnown().isPresent) 1 else 0) +
            (if (pageSize.asKnown().isPresent) 1 else 0) +
            (participants.asKnown().getOrNull()?.size ?: 0) +
            (recordings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    class Recording
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountSid: JsonField<String>,
        private val callSid: JsonField<String>,
        private val channels: JsonField<Long>,
        private val conferenceSid: JsonField<String>,
        private val dateCreated: JsonField<String>,
        private val dateUpdated: JsonField<String>,
        private val duration: JsonField<Long>,
        private val errorCode: JsonField<String>,
        private val mediaUrl: JsonField<String>,
        private val sid: JsonField<String>,
        private val source: JsonField<Source>,
        private val startTime: JsonField<String>,
        private val status: JsonField<Status>,
        private val subresourceUris: JsonField<SubresourceUris>,
        private val uri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_sid")
            @ExcludeMissing
            accountSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_sid") @ExcludeMissing callSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channels") @ExcludeMissing channels: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("conference_sid")
            @ExcludeMissing
            conferenceSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date_created")
            @ExcludeMissing
            dateCreated: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date_updated")
            @ExcludeMissing
            dateUpdated: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("error_code")
            @ExcludeMissing
            errorCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("media_url")
            @ExcludeMissing
            mediaUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("subresource_uris")
            @ExcludeMissing
            subresourceUris: JsonField<SubresourceUris> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountSid,
            callSid,
            channels,
            conferenceSid,
            dateCreated,
            dateUpdated,
            duration,
            errorCode,
            mediaUrl,
            sid,
            source,
            startTime,
            status,
            subresourceUris,
            uri,
            mutableMapOf(),
        )

        /**
         * The id of the account the resource belongs to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountSid(): Optional<String> = accountSid.getOptional("account_sid")

        /**
         * The identifier of the related participant's call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSid(): Optional<String> = callSid.getOptional("call_sid")

        /**
         * The number of channels in the recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channels(): Optional<Long> = channels.getOptional("channels")

        /**
         * The identifier of the related conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun conferenceSid(): Optional<String> = conferenceSid.getOptional("conference_sid")

        /**
         * The timestamp of when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateCreated(): Optional<String> = dateCreated.getOptional("date_created")

        /**
         * The timestamp of when the resource was last updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateUpdated(): Optional<String> = dateUpdated.getOptional("date_updated")

        /**
         * Duratin of the recording in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = duration.getOptional("duration")

        /**
         * The recording error, if any.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

        /**
         * The URL to use to download the recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaUrl(): Optional<String> = mediaUrl.getOptional("media_url")

        /**
         * The unique identifier of the recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sid(): Optional<String> = sid.getOptional("sid")

        /**
         * How the recording was started.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun source(): Optional<Source> = source.getOptional("source")

        /**
         * The timestamp of when the recording was started.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startTime(): Optional<String> = startTime.getOptional("start_time")

        /**
         * The status of the recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * A list of related resources identified by their relative URIs.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subresourceUris(): Optional<SubresourceUris> =
            subresourceUris.getOptional("subresource_uris")

        /**
         * The relative URI for this recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uri(): Optional<String> = uri.getOptional("uri")

        /**
         * Returns the raw JSON value of [accountSid].
         *
         * Unlike [accountSid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_sid")
        @ExcludeMissing
        fun _accountSid(): JsonField<String> = accountSid

        /**
         * Returns the raw JSON value of [callSid].
         *
         * Unlike [callSid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_sid") @ExcludeMissing fun _callSid(): JsonField<String> = callSid

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<Long> = channels

        /**
         * Returns the raw JSON value of [conferenceSid].
         *
         * Unlike [conferenceSid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("conference_sid")
        @ExcludeMissing
        fun _conferenceSid(): JsonField<String> = conferenceSid

        /**
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_created")
        @ExcludeMissing
        fun _dateCreated(): JsonField<String> = dateCreated

        /**
         * Returns the raw JSON value of [dateUpdated].
         *
         * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_updated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<String> = dateUpdated

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

        /**
         * Returns the raw JSON value of [errorCode].
         *
         * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

        /**
         * Returns the raw JSON value of [mediaUrl].
         *
         * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media_url") @ExcludeMissing fun _mediaUrl(): JsonField<String> = mediaUrl

        /**
         * Returns the raw JSON value of [sid].
         *
         * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time") @ExcludeMissing fun _startTime(): JsonField<String> = startTime

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [subresourceUris].
         *
         * Unlike [subresourceUris], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subresource_uris")
        @ExcludeMissing
        fun _subresourceUris(): JsonField<SubresourceUris> = subresourceUris

        /**
         * Returns the raw JSON value of [uri].
         *
         * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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

            /** Returns a mutable builder for constructing an instance of [Recording]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Recording]. */
        class Builder internal constructor() {

            private var accountSid: JsonField<String> = JsonMissing.of()
            private var callSid: JsonField<String> = JsonMissing.of()
            private var channels: JsonField<Long> = JsonMissing.of()
            private var conferenceSid: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<String> = JsonMissing.of()
            private var dateUpdated: JsonField<String> = JsonMissing.of()
            private var duration: JsonField<Long> = JsonMissing.of()
            private var errorCode: JsonField<String> = JsonMissing.of()
            private var mediaUrl: JsonField<String> = JsonMissing.of()
            private var sid: JsonField<String> = JsonMissing.of()
            private var source: JsonField<Source> = JsonMissing.of()
            private var startTime: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var subresourceUris: JsonField<SubresourceUris> = JsonMissing.of()
            private var uri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(recording: Recording) = apply {
                accountSid = recording.accountSid
                callSid = recording.callSid
                channels = recording.channels
                conferenceSid = recording.conferenceSid
                dateCreated = recording.dateCreated
                dateUpdated = recording.dateUpdated
                duration = recording.duration
                errorCode = recording.errorCode
                mediaUrl = recording.mediaUrl
                sid = recording.sid
                source = recording.source
                startTime = recording.startTime
                status = recording.status
                subresourceUris = recording.subresourceUris
                uri = recording.uri
                additionalProperties = recording.additionalProperties.toMutableMap()
            }

            /** The id of the account the resource belongs to. */
            fun accountSid(accountSid: String) = accountSid(JsonField.of(accountSid))

            /**
             * Sets [Builder.accountSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountSid] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

            /** The identifier of the related participant's call. */
            fun callSid(callSid: String) = callSid(JsonField.of(callSid))

            /**
             * Sets [Builder.callSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSid(callSid: JsonField<String>) = apply { this.callSid = callSid }

            /** The number of channels in the recording. */
            fun channels(channels: Long) = channels(JsonField.of(channels))

            /**
             * Sets [Builder.channels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channels] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channels(channels: JsonField<Long>) = apply { this.channels = channels }

            /** The identifier of the related conference. */
            fun conferenceSid(conferenceSid: String) = conferenceSid(JsonField.of(conferenceSid))

            /**
             * Sets [Builder.conferenceSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conferenceSid] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conferenceSid(conferenceSid: JsonField<String>) = apply {
                this.conferenceSid = conferenceSid
            }

            /** The timestamp of when the resource was created. */
            fun dateCreated(dateCreated: String) = dateCreated(JsonField.of(dateCreated))

            /**
             * Sets [Builder.dateCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateCreated] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateCreated(dateCreated: JsonField<String>) = apply {
                this.dateCreated = dateCreated
            }

            /** The timestamp of when the resource was last updated. */
            fun dateUpdated(dateUpdated: String) = dateUpdated(JsonField.of(dateUpdated))

            /**
             * Sets [Builder.dateUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateUpdated] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateUpdated(dateUpdated: JsonField<String>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** Duratin of the recording in seconds. */
            fun duration(duration: Long) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            /** The recording error, if any. */
            fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

            /**
             * Sets [Builder.errorCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

            /** The URL to use to download the recording. */
            fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

            /**
             * Sets [Builder.mediaUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

            /** The unique identifier of the recording. */
            fun sid(sid: String) = sid(JsonField.of(sid))

            /**
             * Sets [Builder.sid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sid] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sid(sid: JsonField<String>) = apply { this.sid = sid }

            /** How the recording was started. */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /** The timestamp of when the recording was started. */
            fun startTime(startTime: String) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

            /** The status of the recording. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** A list of related resources identified by their relative URIs. */
            fun subresourceUris(subresourceUris: SubresourceUris) =
                subresourceUris(JsonField.of(subresourceUris))

            /**
             * Sets [Builder.subresourceUris] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subresourceUris] with a well-typed [SubresourceUris]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subresourceUris(subresourceUris: JsonField<SubresourceUris>) = apply {
                this.subresourceUris = subresourceUris
            }

            /** The relative URI for this recording. */
            fun uri(uri: String) = uri(JsonField.of(uri))

            /**
             * Sets [Builder.uri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uri] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
             * Returns an immutable instance of [Recording].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Recording =
                Recording(
                    accountSid,
                    callSid,
                    channels,
                    conferenceSid,
                    dateCreated,
                    dateUpdated,
                    duration,
                    errorCode,
                    mediaUrl,
                    sid,
                    source,
                    startTime,
                    status,
                    subresourceUris,
                    uri,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Recording = apply {
            if (validated) {
                return@apply
            }

            accountSid()
            callSid()
            channels()
            conferenceSid()
            dateCreated()
            dateUpdated()
            duration()
            errorCode()
            mediaUrl()
            sid()
            source().ifPresent { it.validate() }
            startTime()
            status().ifPresent { it.validate() }
            subresourceUris().ifPresent { it.validate() }
            uri()
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
            (if (accountSid.asKnown().isPresent) 1 else 0) +
                (if (callSid.asKnown().isPresent) 1 else 0) +
                (if (channels.asKnown().isPresent) 1 else 0) +
                (if (conferenceSid.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (if (errorCode.asKnown().isPresent) 1 else 0) +
                (if (mediaUrl.asKnown().isPresent) 1 else 0) +
                (if (sid.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (subresourceUris.asKnown().getOrNull()?.validity() ?: 0) +
                (if (uri.asKnown().isPresent) 1 else 0)

        /** How the recording was started. */
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DIAL_VERB = of("DialVerb")

                @JvmField val CONFERENCE = of("Conference")

                @JvmField val OUTBOUND_API = of("OutboundAPI")

                @JvmField val TRUNKING = of("Trunking")

                @JvmField val RECORD_VERB = of("RecordVerb")

                @JvmField val START_CALL_RECORDING_API = of("StartCallRecordingAPI")

                @JvmField val START_CONFERENCE_RECORDING_API = of("StartConferenceRecordingAPI")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                DIAL_VERB,
                CONFERENCE,
                OUTBOUND_API,
                TRUNKING,
                RECORD_VERB,
                START_CALL_RECORDING_API,
                START_CONFERENCE_RECORDING_API,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIAL_VERB,
                CONFERENCE,
                OUTBOUND_API,
                TRUNKING,
                RECORD_VERB,
                START_CALL_RECORDING_API,
                START_CONFERENCE_RECORDING_API,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
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
                    DIAL_VERB -> Value.DIAL_VERB
                    CONFERENCE -> Value.CONFERENCE
                    OUTBOUND_API -> Value.OUTBOUND_API
                    TRUNKING -> Value.TRUNKING
                    RECORD_VERB -> Value.RECORD_VERB
                    START_CALL_RECORDING_API -> Value.START_CALL_RECORDING_API
                    START_CONFERENCE_RECORDING_API -> Value.START_CONFERENCE_RECORDING_API
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
                    DIAL_VERB -> Known.DIAL_VERB
                    CONFERENCE -> Known.CONFERENCE
                    OUTBOUND_API -> Known.OUTBOUND_API
                    TRUNKING -> Known.TRUNKING
                    RECORD_VERB -> Known.RECORD_VERB
                    START_CALL_RECORDING_API -> Known.START_CALL_RECORDING_API
                    START_CONFERENCE_RECORDING_API -> Known.START_CONFERENCE_RECORDING_API
                    else -> throw TelnyxInvalidDataException("Unknown Source: $value")
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

        /** The status of the recording. */
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

                @JvmField val PROCESSING = of("processing")

                @JvmField val ABSENT = of("absent")

                @JvmField val COMPLETED = of("completed")

                @JvmField val DELETED = of("deleted")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PROCESSING,
                ABSENT,
                COMPLETED,
                DELETED,
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
                PROCESSING,
                ABSENT,
                COMPLETED,
                DELETED,
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
                    PROCESSING -> Value.PROCESSING
                    ABSENT -> Value.ABSENT
                    COMPLETED -> Value.COMPLETED
                    DELETED -> Value.DELETED
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
                    PROCESSING -> Known.PROCESSING
                    ABSENT -> Known.ABSENT
                    COMPLETED -> Known.COMPLETED
                    DELETED -> Known.DELETED
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

        /** A list of related resources identified by their relative URIs. */
        class SubresourceUris
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

                /** Returns a mutable builder for constructing an instance of [SubresourceUris]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SubresourceUris]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subresourceUris: SubresourceUris) = apply {
                    additionalProperties = subresourceUris.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [SubresourceUris].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SubresourceUris = SubresourceUris(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): SubresourceUris = apply {
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

                return other is SubresourceUris &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "SubresourceUris{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Recording &&
                accountSid == other.accountSid &&
                callSid == other.callSid &&
                channels == other.channels &&
                conferenceSid == other.conferenceSid &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                duration == other.duration &&
                errorCode == other.errorCode &&
                mediaUrl == other.mediaUrl &&
                sid == other.sid &&
                source == other.source &&
                startTime == other.startTime &&
                status == other.status &&
                subresourceUris == other.subresourceUris &&
                uri == other.uri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountSid,
                callSid,
                channels,
                conferenceSid,
                dateCreated,
                dateUpdated,
                duration,
                errorCode,
                mediaUrl,
                sid,
                source,
                startTime,
                status,
                subresourceUris,
                uri,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Recording{accountSid=$accountSid, callSid=$callSid, channels=$channels, conferenceSid=$conferenceSid, dateCreated=$dateCreated, dateUpdated=$dateUpdated, duration=$duration, errorCode=$errorCode, mediaUrl=$mediaUrl, sid=$sid, source=$source, startTime=$startTime, status=$status, subresourceUris=$subresourceUris, uri=$uri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceRetrieveRecordingsResponse &&
            end == other.end &&
            firstPageUri == other.firstPageUri &&
            nextPageUri == other.nextPageUri &&
            page == other.page &&
            pageSize == other.pageSize &&
            participants == other.participants &&
            recordings == other.recordings &&
            start == other.start &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            end,
            firstPageUri,
            nextPageUri,
            page,
            pageSize,
            participants,
            recordings,
            start,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConferenceRetrieveRecordingsResponse{end=$end, firstPageUri=$firstPageUri, nextPageUri=$nextPageUri, page=$page, pageSize=$pageSize, participants=$participants, recordings=$recordings, start=$start, uri=$uri, additionalProperties=$additionalProperties}"
}
