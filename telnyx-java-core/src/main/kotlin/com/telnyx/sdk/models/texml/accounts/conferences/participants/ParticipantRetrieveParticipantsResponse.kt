// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences.participants

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

class ParticipantRetrieveParticipantsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val end: JsonField<Long>,
    private val firstPageUri: JsonField<String>,
    private val nextPageUri: JsonField<String>,
    private val page: JsonField<Long>,
    private val pageSize: JsonField<Long>,
    private val participants: JsonField<List<Participant>>,
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
        participants: JsonField<List<Participant>> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        end,
        firstPageUri,
        nextPageUri,
        page,
        pageSize,
        participants,
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
     * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstPageUri(): Optional<String> = firstPageUri.getOptional("first_page_uri")

    /**
     * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<List<Participant>> = participants.getOptional("participants")

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
    fun _participants(): JsonField<List<Participant>> = participants

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
         * [ParticipantRetrieveParticipantsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantRetrieveParticipantsResponse]. */
    class Builder internal constructor() {

        private var end: JsonField<Long> = JsonMissing.of()
        private var firstPageUri: JsonField<String> = JsonMissing.of()
        private var nextPageUri: JsonField<String> = JsonMissing.of()
        private var page: JsonField<Long> = JsonMissing.of()
        private var pageSize: JsonField<Long> = JsonMissing.of()
        private var participants: JsonField<MutableList<Participant>>? = null
        private var start: JsonField<Long> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            participantRetrieveParticipantsResponse: ParticipantRetrieveParticipantsResponse
        ) = apply {
            end = participantRetrieveParticipantsResponse.end
            firstPageUri = participantRetrieveParticipantsResponse.firstPageUri
            nextPageUri = participantRetrieveParticipantsResponse.nextPageUri
            page = participantRetrieveParticipantsResponse.page
            pageSize = participantRetrieveParticipantsResponse.pageSize
            participants =
                participantRetrieveParticipantsResponse.participants.map { it.toMutableList() }
            start = participantRetrieveParticipantsResponse.start
            uri = participantRetrieveParticipantsResponse.uri
            additionalProperties =
                participantRetrieveParticipantsResponse.additionalProperties.toMutableMap()
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
         * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20
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
         * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ
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

        fun participants(participants: List<Participant>) = participants(JsonField.of(participants))

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed `List<Participant>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun participants(participants: JsonField<List<Participant>>) = apply {
            this.participants = participants.map { it.toMutableList() }
        }

        /**
         * Adds a single [Participant] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: Participant) = apply {
            participants =
                (participants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("participants", it).add(participant)
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
         * Returns an immutable instance of [ParticipantRetrieveParticipantsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ParticipantRetrieveParticipantsResponse =
            ParticipantRetrieveParticipantsResponse(
                end,
                firstPageUri,
                nextPageUri,
                page,
                pageSize,
                (participants ?: JsonMissing.of()).map { it.toImmutable() },
                start,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ParticipantRetrieveParticipantsResponse = apply {
        if (validated) {
            return@apply
        }

        end()
        firstPageUri()
        nextPageUri()
        page()
        pageSize()
        participants().ifPresent { it.forEach { it.validate() } }
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
            (participants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    class Participant
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountSid: JsonField<String>,
        private val apiVersion: JsonField<String>,
        private val callSid: JsonField<String>,
        private val callSidLegacy: JsonField<String>,
        private val coaching: JsonField<Boolean>,
        private val coachingCallSid: JsonField<String>,
        private val coachingCallSidLegacy: JsonField<String>,
        private val dateCreated: JsonField<String>,
        private val dateUpdated: JsonField<String>,
        private val endConferenceOnExit: JsonField<Boolean>,
        private val hold: JsonField<Boolean>,
        private val muted: JsonField<Boolean>,
        private val status: JsonField<Status>,
        private val uri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_sid")
            @ExcludeMissing
            accountSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_version")
            @ExcludeMissing
            apiVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_sid") @ExcludeMissing callSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_sid_legacy")
            @ExcludeMissing
            callSidLegacy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("coaching")
            @ExcludeMissing
            coaching: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("coaching_call_sid")
            @ExcludeMissing
            coachingCallSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("coaching_call_sid_legacy")
            @ExcludeMissing
            coachingCallSidLegacy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date_created")
            @ExcludeMissing
            dateCreated: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date_updated")
            @ExcludeMissing
            dateUpdated: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_conference_on_exit")
            @ExcludeMissing
            endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hold") @ExcludeMissing hold: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("muted") @ExcludeMissing muted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountSid,
            apiVersion,
            callSid,
            callSidLegacy,
            coaching,
            coachingCallSid,
            coachingCallSidLegacy,
            dateCreated,
            dateUpdated,
            endConferenceOnExit,
            hold,
            muted,
            status,
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
         * The version of the API that was used to make the request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiVersion(): Optional<String> = apiVersion.getOptional("api_version")

        /**
         * The identifier of this participant's call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSid(): Optional<String> = callSid.getOptional("call_sid")

        /**
         * The identifier of this participant's call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSidLegacy(): Optional<String> = callSidLegacy.getOptional("call_sid_legacy")

        /**
         * Whether the participant is coaching another call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun coaching(): Optional<Boolean> = coaching.getOptional("coaching")

        /**
         * The identifier of the coached participant's call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun coachingCallSid(): Optional<String> = coachingCallSid.getOptional("coaching_call_sid")

        /**
         * The identifier of the coached participant's call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun coachingCallSidLegacy(): Optional<String> =
            coachingCallSidLegacy.getOptional("coaching_call_sid_legacy")

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
         * Whether the conference ends when the participant leaves.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endConferenceOnExit(): Optional<Boolean> =
            endConferenceOnExit.getOptional("end_conference_on_exit")

        /**
         * Whether the participant is on hold.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hold(): Optional<Boolean> = hold.getOptional("hold")

        /**
         * Whether the participant is muted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun muted(): Optional<Boolean> = muted.getOptional("muted")

        /**
         * The status of the participant's call in the conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * The relative URI for this participant.
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
         * Returns the raw JSON value of [apiVersion].
         *
         * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_version")
        @ExcludeMissing
        fun _apiVersion(): JsonField<String> = apiVersion

        /**
         * Returns the raw JSON value of [callSid].
         *
         * Unlike [callSid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_sid") @ExcludeMissing fun _callSid(): JsonField<String> = callSid

        /**
         * Returns the raw JSON value of [callSidLegacy].
         *
         * Unlike [callSidLegacy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_sid_legacy")
        @ExcludeMissing
        fun _callSidLegacy(): JsonField<String> = callSidLegacy

        /**
         * Returns the raw JSON value of [coaching].
         *
         * Unlike [coaching], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coaching") @ExcludeMissing fun _coaching(): JsonField<Boolean> = coaching

        /**
         * Returns the raw JSON value of [coachingCallSid].
         *
         * Unlike [coachingCallSid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("coaching_call_sid")
        @ExcludeMissing
        fun _coachingCallSid(): JsonField<String> = coachingCallSid

        /**
         * Returns the raw JSON value of [coachingCallSidLegacy].
         *
         * Unlike [coachingCallSidLegacy], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("coaching_call_sid_legacy")
        @ExcludeMissing
        fun _coachingCallSidLegacy(): JsonField<String> = coachingCallSidLegacy

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
         * Returns the raw JSON value of [endConferenceOnExit].
         *
         * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("end_conference_on_exit")
        @ExcludeMissing
        fun _endConferenceOnExit(): JsonField<Boolean> = endConferenceOnExit

        /**
         * Returns the raw JSON value of [hold].
         *
         * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hold") @ExcludeMissing fun _hold(): JsonField<Boolean> = hold

        /**
         * Returns the raw JSON value of [muted].
         *
         * Unlike [muted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("muted") @ExcludeMissing fun _muted(): JsonField<Boolean> = muted

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [Participant]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Participant]. */
        class Builder internal constructor() {

            private var accountSid: JsonField<String> = JsonMissing.of()
            private var apiVersion: JsonField<String> = JsonMissing.of()
            private var callSid: JsonField<String> = JsonMissing.of()
            private var callSidLegacy: JsonField<String> = JsonMissing.of()
            private var coaching: JsonField<Boolean> = JsonMissing.of()
            private var coachingCallSid: JsonField<String> = JsonMissing.of()
            private var coachingCallSidLegacy: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<String> = JsonMissing.of()
            private var dateUpdated: JsonField<String> = JsonMissing.of()
            private var endConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var hold: JsonField<Boolean> = JsonMissing.of()
            private var muted: JsonField<Boolean> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var uri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(participant: Participant) = apply {
                accountSid = participant.accountSid
                apiVersion = participant.apiVersion
                callSid = participant.callSid
                callSidLegacy = participant.callSidLegacy
                coaching = participant.coaching
                coachingCallSid = participant.coachingCallSid
                coachingCallSidLegacy = participant.coachingCallSidLegacy
                dateCreated = participant.dateCreated
                dateUpdated = participant.dateUpdated
                endConferenceOnExit = participant.endConferenceOnExit
                hold = participant.hold
                muted = participant.muted
                status = participant.status
                uri = participant.uri
                additionalProperties = participant.additionalProperties.toMutableMap()
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

            /** The version of the API that was used to make the request. */
            fun apiVersion(apiVersion: String) = apiVersion(JsonField.of(apiVersion))

            /**
             * Sets [Builder.apiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiVersion(apiVersion: JsonField<String>) = apply { this.apiVersion = apiVersion }

            /** The identifier of this participant's call. */
            fun callSid(callSid: String) = callSid(JsonField.of(callSid))

            /**
             * Sets [Builder.callSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSid(callSid: JsonField<String>) = apply { this.callSid = callSid }

            /** The identifier of this participant's call. */
            fun callSidLegacy(callSidLegacy: String) = callSidLegacy(JsonField.of(callSidLegacy))

            /**
             * Sets [Builder.callSidLegacy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSidLegacy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSidLegacy(callSidLegacy: JsonField<String>) = apply {
                this.callSidLegacy = callSidLegacy
            }

            /** Whether the participant is coaching another call. */
            fun coaching(coaching: Boolean) = coaching(JsonField.of(coaching))

            /**
             * Sets [Builder.coaching] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coaching] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coaching(coaching: JsonField<Boolean>) = apply { this.coaching = coaching }

            /** The identifier of the coached participant's call. */
            fun coachingCallSid(coachingCallSid: String) =
                coachingCallSid(JsonField.of(coachingCallSid))

            /**
             * Sets [Builder.coachingCallSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coachingCallSid] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coachingCallSid(coachingCallSid: JsonField<String>) = apply {
                this.coachingCallSid = coachingCallSid
            }

            /** The identifier of the coached participant's call. */
            fun coachingCallSidLegacy(coachingCallSidLegacy: String) =
                coachingCallSidLegacy(JsonField.of(coachingCallSidLegacy))

            /**
             * Sets [Builder.coachingCallSidLegacy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coachingCallSidLegacy] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun coachingCallSidLegacy(coachingCallSidLegacy: JsonField<String>) = apply {
                this.coachingCallSidLegacy = coachingCallSidLegacy
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

            /** Whether the conference ends when the participant leaves. */
            fun endConferenceOnExit(endConferenceOnExit: Boolean) =
                endConferenceOnExit(JsonField.of(endConferenceOnExit))

            /**
             * Sets [Builder.endConferenceOnExit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endConferenceOnExit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endConferenceOnExit(endConferenceOnExit: JsonField<Boolean>) = apply {
                this.endConferenceOnExit = endConferenceOnExit
            }

            /** Whether the participant is on hold. */
            fun hold(hold: Boolean) = hold(JsonField.of(hold))

            /**
             * Sets [Builder.hold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hold] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hold(hold: JsonField<Boolean>) = apply { this.hold = hold }

            /** Whether the participant is muted. */
            fun muted(muted: Boolean) = muted(JsonField.of(muted))

            /**
             * Sets [Builder.muted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.muted] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun muted(muted: JsonField<Boolean>) = apply { this.muted = muted }

            /** The status of the participant's call in the conference. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The relative URI for this participant. */
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
             * Returns an immutable instance of [Participant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Participant =
                Participant(
                    accountSid,
                    apiVersion,
                    callSid,
                    callSidLegacy,
                    coaching,
                    coachingCallSid,
                    coachingCallSidLegacy,
                    dateCreated,
                    dateUpdated,
                    endConferenceOnExit,
                    hold,
                    muted,
                    status,
                    uri,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Participant = apply {
            if (validated) {
                return@apply
            }

            accountSid()
            apiVersion()
            callSid()
            callSidLegacy()
            coaching()
            coachingCallSid()
            coachingCallSidLegacy()
            dateCreated()
            dateUpdated()
            endConferenceOnExit()
            hold()
            muted()
            status().ifPresent { it.validate() }
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
                (if (apiVersion.asKnown().isPresent) 1 else 0) +
                (if (callSid.asKnown().isPresent) 1 else 0) +
                (if (callSidLegacy.asKnown().isPresent) 1 else 0) +
                (if (coaching.asKnown().isPresent) 1 else 0) +
                (if (coachingCallSid.asKnown().isPresent) 1 else 0) +
                (if (coachingCallSidLegacy.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (hold.asKnown().isPresent) 1 else 0) +
                (if (muted.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (uri.asKnown().isPresent) 1 else 0)

        /** The status of the participant's call in the conference. */
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

                @JvmField val CONNECTING = of("connecting")

                @JvmField val CONNECTED = of("connected")

                @JvmField val COMPLETED = of("completed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                CONNECTING,
                CONNECTED,
                COMPLETED,
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
                CONNECTING,
                CONNECTED,
                COMPLETED,
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
                    CONNECTING -> Value.CONNECTING
                    CONNECTED -> Value.CONNECTED
                    COMPLETED -> Value.COMPLETED
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
                    CONNECTING -> Known.CONNECTING
                    CONNECTED -> Known.CONNECTED
                    COMPLETED -> Known.COMPLETED
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

            return other is Participant &&
                accountSid == other.accountSid &&
                apiVersion == other.apiVersion &&
                callSid == other.callSid &&
                callSidLegacy == other.callSidLegacy &&
                coaching == other.coaching &&
                coachingCallSid == other.coachingCallSid &&
                coachingCallSidLegacy == other.coachingCallSidLegacy &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                endConferenceOnExit == other.endConferenceOnExit &&
                hold == other.hold &&
                muted == other.muted &&
                status == other.status &&
                uri == other.uri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountSid,
                apiVersion,
                callSid,
                callSidLegacy,
                coaching,
                coachingCallSid,
                coachingCallSidLegacy,
                dateCreated,
                dateUpdated,
                endConferenceOnExit,
                hold,
                muted,
                status,
                uri,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Participant{accountSid=$accountSid, apiVersion=$apiVersion, callSid=$callSid, callSidLegacy=$callSidLegacy, coaching=$coaching, coachingCallSid=$coachingCallSid, coachingCallSidLegacy=$coachingCallSidLegacy, dateCreated=$dateCreated, dateUpdated=$dateUpdated, endConferenceOnExit=$endConferenceOnExit, hold=$hold, muted=$muted, status=$status, uri=$uri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantRetrieveParticipantsResponse &&
            end == other.end &&
            firstPageUri == other.firstPageUri &&
            nextPageUri == other.nextPageUri &&
            page == other.page &&
            pageSize == other.pageSize &&
            participants == other.participants &&
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
            start,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ParticipantRetrieveParticipantsResponse{end=$end, firstPageUri=$firstPageUri, nextPageUri=$nextPageUri, page=$page, pageSize=$pageSize, participants=$participants, start=$start, uri=$uri, additionalProperties=$additionalProperties}"
}
