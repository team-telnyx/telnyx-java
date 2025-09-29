// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccountRetrieveTranscriptionsJsonResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val end: JsonField<Long>,
    private val firstPageUri: JsonField<String>,
    private val nextPageUri: JsonField<String>,
    private val page: JsonField<Long>,
    private val pageSize: JsonField<Long>,
    private val previousPageUri: JsonField<String>,
    private val start: JsonField<Long>,
    private val transcriptions: JsonField<List<Transcription>>,
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
        @JsonProperty("previous_page_uri")
        @ExcludeMissing
        previousPageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transcriptions")
        @ExcludeMissing
        transcriptions: JsonField<List<Transcription>> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        end,
        firstPageUri,
        nextPageUri,
        page,
        pageSize,
        previousPageUri,
        start,
        transcriptions,
        uri,
        mutableMapOf(),
    )

    /**
     * The number of the last element on the page, zero-indexed
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun end(): Optional<Long> = end.getOptional("end")

    /**
     * Relative uri to the first page of the query results
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstPageUri(): Optional<String> = firstPageUri.getOptional("first_page_uri")

    /**
     * Relative uri to the next page of the query results
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
     * Relative uri to the previous page of the query results
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousPageUri(): Optional<String> = previousPageUri.getOptional("previous_page_uri")

    /**
     * The number of the first element on the page, zero-indexed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun start(): Optional<Long> = start.getOptional("start")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptions(): Optional<List<Transcription>> =
        transcriptions.getOptional("transcriptions")

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
     * Returns the raw JSON value of [previousPageUri].
     *
     * Unlike [previousPageUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_page_uri")
    @ExcludeMissing
    fun _previousPageUri(): JsonField<String> = previousPageUri

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Long> = start

    /**
     * Returns the raw JSON value of [transcriptions].
     *
     * Unlike [transcriptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transcriptions")
    @ExcludeMissing
    fun _transcriptions(): JsonField<List<Transcription>> = transcriptions

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
         * [AccountRetrieveTranscriptionsJsonResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountRetrieveTranscriptionsJsonResponse]. */
    class Builder internal constructor() {

        private var end: JsonField<Long> = JsonMissing.of()
        private var firstPageUri: JsonField<String> = JsonMissing.of()
        private var nextPageUri: JsonField<String> = JsonMissing.of()
        private var page: JsonField<Long> = JsonMissing.of()
        private var pageSize: JsonField<Long> = JsonMissing.of()
        private var previousPageUri: JsonField<String> = JsonMissing.of()
        private var start: JsonField<Long> = JsonMissing.of()
        private var transcriptions: JsonField<MutableList<Transcription>>? = null
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            accountRetrieveTranscriptionsJsonResponse: AccountRetrieveTranscriptionsJsonResponse
        ) = apply {
            end = accountRetrieveTranscriptionsJsonResponse.end
            firstPageUri = accountRetrieveTranscriptionsJsonResponse.firstPageUri
            nextPageUri = accountRetrieveTranscriptionsJsonResponse.nextPageUri
            page = accountRetrieveTranscriptionsJsonResponse.page
            pageSize = accountRetrieveTranscriptionsJsonResponse.pageSize
            previousPageUri = accountRetrieveTranscriptionsJsonResponse.previousPageUri
            start = accountRetrieveTranscriptionsJsonResponse.start
            transcriptions =
                accountRetrieveTranscriptionsJsonResponse.transcriptions.map { it.toMutableList() }
            uri = accountRetrieveTranscriptionsJsonResponse.uri
            additionalProperties =
                accountRetrieveTranscriptionsJsonResponse.additionalProperties.toMutableMap()
        }

        /** The number of the last element on the page, zero-indexed */
        fun end(end: Long) = end(JsonField.of(end))

        /**
         * Sets [Builder.end] to an arbitrary JSON value.
         *
         * You should usually call [Builder.end] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun end(end: JsonField<Long>) = apply { this.end = end }

        /** Relative uri to the first page of the query results */
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

        /** Relative uri to the next page of the query results */
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

        /** Relative uri to the previous page of the query results */
        fun previousPageUri(previousPageUri: String) =
            previousPageUri(JsonField.of(previousPageUri))

        /**
         * Sets [Builder.previousPageUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousPageUri] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousPageUri(previousPageUri: JsonField<String>) = apply {
            this.previousPageUri = previousPageUri
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

        fun transcriptions(transcriptions: List<Transcription>) =
            transcriptions(JsonField.of(transcriptions))

        /**
         * Sets [Builder.transcriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptions] with a well-typed `List<Transcription>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transcriptions(transcriptions: JsonField<List<Transcription>>) = apply {
            this.transcriptions = transcriptions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Transcription] to [transcriptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTranscription(transcription: Transcription) = apply {
            transcriptions =
                (transcriptions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("transcriptions", it).add(transcription)
                }
        }

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
         * Returns an immutable instance of [AccountRetrieveTranscriptionsJsonResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountRetrieveTranscriptionsJsonResponse =
            AccountRetrieveTranscriptionsJsonResponse(
                end,
                firstPageUri,
                nextPageUri,
                page,
                pageSize,
                previousPageUri,
                start,
                (transcriptions ?: JsonMissing.of()).map { it.toImmutable() },
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountRetrieveTranscriptionsJsonResponse = apply {
        if (validated) {
            return@apply
        }

        end()
        firstPageUri()
        nextPageUri()
        page()
        pageSize()
        previousPageUri()
        start()
        transcriptions().ifPresent { it.forEach { it.validate() } }
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
            (if (previousPageUri.asKnown().isPresent) 1 else 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (transcriptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    class Transcription
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountSid: JsonField<String>,
        private val apiVersion: JsonField<String>,
        private val callSid: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val duration: JsonField<String>,
        private val recordingSid: JsonField<String>,
        private val sid: JsonField<String>,
        private val status: JsonField<Status>,
        private val transcriptionText: JsonField<String>,
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
            @JsonProperty("date_created")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("date_updated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recording_sid")
            @ExcludeMissing
            recordingSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("transcription_text")
            @ExcludeMissing
            transcriptionText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountSid,
            apiVersion,
            callSid,
            dateCreated,
            dateUpdated,
            duration,
            recordingSid,
            sid,
            status,
            transcriptionText,
            uri,
            mutableMapOf(),
        )

        /**
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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSid(): Optional<String> = callSid.getOptional("call_sid")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateCreated(): Optional<OffsetDateTime> = dateCreated.getOptional("date_created")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateUpdated(): Optional<OffsetDateTime> = dateUpdated.getOptional("date_updated")

        /**
         * The duration of this recording, given in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<String> = duration.getOptional("duration")

        /**
         * Identifier of a resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingSid(): Optional<String> = recordingSid.getOptional("recording_sid")

        /**
         * Identifier of a resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sid(): Optional<String> = sid.getOptional("sid")

        /**
         * The status of the recording transcriptions. The transcription text will be available only
         * when the status is completed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * The recording's transcribed text
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcriptionText(): Optional<String> =
            transcriptionText.getOptional("transcription_text")

        /**
         * The relative URI for the recording transcription resource.
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
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_created")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /**
         * Returns the raw JSON value of [dateUpdated].
         *
         * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_updated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

        /**
         * Returns the raw JSON value of [recordingSid].
         *
         * Unlike [recordingSid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recording_sid")
        @ExcludeMissing
        fun _recordingSid(): JsonField<String> = recordingSid

        /**
         * Returns the raw JSON value of [sid].
         *
         * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [transcriptionText].
         *
         * Unlike [transcriptionText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transcription_text")
        @ExcludeMissing
        fun _transcriptionText(): JsonField<String> = transcriptionText

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

            /** Returns a mutable builder for constructing an instance of [Transcription]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transcription]. */
        class Builder internal constructor() {

            private var accountSid: JsonField<String> = JsonMissing.of()
            private var apiVersion: JsonField<String> = JsonMissing.of()
            private var callSid: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var duration: JsonField<String> = JsonMissing.of()
            private var recordingSid: JsonField<String> = JsonMissing.of()
            private var sid: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var transcriptionText: JsonField<String> = JsonMissing.of()
            private var uri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transcription: Transcription) = apply {
                accountSid = transcription.accountSid
                apiVersion = transcription.apiVersion
                callSid = transcription.callSid
                dateCreated = transcription.dateCreated
                dateUpdated = transcription.dateUpdated
                duration = transcription.duration
                recordingSid = transcription.recordingSid
                sid = transcription.sid
                status = transcription.status
                transcriptionText = transcription.transcriptionText
                uri = transcription.uri
                additionalProperties = transcription.additionalProperties.toMutableMap()
            }

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

            fun callSid(callSid: String) = callSid(JsonField.of(callSid))

            /**
             * Sets [Builder.callSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSid(callSid: JsonField<String>) = apply { this.callSid = callSid }

            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /**
             * Sets [Builder.dateCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /**
             * Sets [Builder.dateUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The duration of this recording, given in seconds. */
            fun duration(duration: String?) = duration(JsonField.ofNullable(duration))

            /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
            fun duration(duration: Optional<String>) = duration(duration.getOrNull())

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<String>) = apply { this.duration = duration }

            /** Identifier of a resource. */
            fun recordingSid(recordingSid: String) = recordingSid(JsonField.of(recordingSid))

            /**
             * Sets [Builder.recordingSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingSid] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordingSid(recordingSid: JsonField<String>) = apply {
                this.recordingSid = recordingSid
            }

            /** Identifier of a resource. */
            fun sid(sid: String) = sid(JsonField.of(sid))

            /**
             * Sets [Builder.sid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sid] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sid(sid: JsonField<String>) = apply { this.sid = sid }

            /**
             * The status of the recording transcriptions. The transcription text will be available
             * only when the status is completed.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The recording's transcribed text */
            fun transcriptionText(transcriptionText: String) =
                transcriptionText(JsonField.of(transcriptionText))

            /**
             * Sets [Builder.transcriptionText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transcriptionText(transcriptionText: JsonField<String>) = apply {
                this.transcriptionText = transcriptionText
            }

            /** The relative URI for the recording transcription resource. */
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
             * Returns an immutable instance of [Transcription].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Transcription =
                Transcription(
                    accountSid,
                    apiVersion,
                    callSid,
                    dateCreated,
                    dateUpdated,
                    duration,
                    recordingSid,
                    sid,
                    status,
                    transcriptionText,
                    uri,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Transcription = apply {
            if (validated) {
                return@apply
            }

            accountSid()
            apiVersion()
            callSid()
            dateCreated()
            dateUpdated()
            duration()
            recordingSid()
            sid()
            status().ifPresent { it.validate() }
            transcriptionText()
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
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (if (recordingSid.asKnown().isPresent) 1 else 0) +
                (if (sid.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (transcriptionText.asKnown().isPresent) 1 else 0) +
                (if (uri.asKnown().isPresent) 1 else 0)

        /**
         * The status of the recording transcriptions. The transcription text will be available only
         * when the status is completed.
         */
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

                @JvmField val IN_PROGRESS = of("in-progress")

                @JvmField val COMPLETED = of("completed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                IN_PROGRESS,
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
                IN_PROGRESS,
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
                    IN_PROGRESS -> Value.IN_PROGRESS
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
                    IN_PROGRESS -> Known.IN_PROGRESS
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

            return other is Transcription &&
                accountSid == other.accountSid &&
                apiVersion == other.apiVersion &&
                callSid == other.callSid &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                duration == other.duration &&
                recordingSid == other.recordingSid &&
                sid == other.sid &&
                status == other.status &&
                transcriptionText == other.transcriptionText &&
                uri == other.uri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountSid,
                apiVersion,
                callSid,
                dateCreated,
                dateUpdated,
                duration,
                recordingSid,
                sid,
                status,
                transcriptionText,
                uri,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transcription{accountSid=$accountSid, apiVersion=$apiVersion, callSid=$callSid, dateCreated=$dateCreated, dateUpdated=$dateUpdated, duration=$duration, recordingSid=$recordingSid, sid=$sid, status=$status, transcriptionText=$transcriptionText, uri=$uri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountRetrieveTranscriptionsJsonResponse &&
            end == other.end &&
            firstPageUri == other.firstPageUri &&
            nextPageUri == other.nextPageUri &&
            page == other.page &&
            pageSize == other.pageSize &&
            previousPageUri == other.previousPageUri &&
            start == other.start &&
            transcriptions == other.transcriptions &&
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
            previousPageUri,
            start,
            transcriptions,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountRetrieveTranscriptionsJsonResponse{end=$end, firstPageUri=$firstPageUri, nextPageUri=$nextPageUri, page=$page, pageSize=$pageSize, previousPageUri=$previousPageUri, start=$start, transcriptions=$transcriptions, uri=$uri, additionalProperties=$additionalProperties}"
}
