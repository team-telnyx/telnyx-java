// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.texml.accounts.TexmlGetCallRecordingResponseBody
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConferenceRetrieveRecordingsJsonResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val end: JsonField<Long>,
    private val firstPageUri: JsonField<String>,
    private val nextPageUri: JsonField<String>,
    private val page: JsonField<Long>,
    private val pageSize: JsonField<Long>,
    private val previousPageUri: JsonField<String>,
    private val recordings: JsonField<List<TexmlGetCallRecordingResponseBody>>,
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
        @JsonProperty("previous_page_uri")
        @ExcludeMissing
        previousPageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recordings")
        @ExcludeMissing
        recordings: JsonField<List<TexmlGetCallRecordingResponseBody>> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        end,
        firstPageUri,
        nextPageUri,
        page,
        pageSize,
        previousPageUri,
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordings(): Optional<List<TexmlGetCallRecordingResponseBody>> =
        recordings.getOptional("recordings")

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
     * Returns the raw JSON value of [previousPageUri].
     *
     * Unlike [previousPageUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_page_uri")
    @ExcludeMissing
    fun _previousPageUri(): JsonField<String> = previousPageUri

    /**
     * Returns the raw JSON value of [recordings].
     *
     * Unlike [recordings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recordings")
    @ExcludeMissing
    fun _recordings(): JsonField<List<TexmlGetCallRecordingResponseBody>> = recordings

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
         * [ConferenceRetrieveRecordingsJsonResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceRetrieveRecordingsJsonResponse]. */
    class Builder internal constructor() {

        private var end: JsonField<Long> = JsonMissing.of()
        private var firstPageUri: JsonField<String> = JsonMissing.of()
        private var nextPageUri: JsonField<String> = JsonMissing.of()
        private var page: JsonField<Long> = JsonMissing.of()
        private var pageSize: JsonField<Long> = JsonMissing.of()
        private var previousPageUri: JsonField<String> = JsonMissing.of()
        private var recordings: JsonField<MutableList<TexmlGetCallRecordingResponseBody>>? = null
        private var start: JsonField<Long> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conferenceRetrieveRecordingsJsonResponse: ConferenceRetrieveRecordingsJsonResponse
        ) = apply {
            end = conferenceRetrieveRecordingsJsonResponse.end
            firstPageUri = conferenceRetrieveRecordingsJsonResponse.firstPageUri
            nextPageUri = conferenceRetrieveRecordingsJsonResponse.nextPageUri
            page = conferenceRetrieveRecordingsJsonResponse.page
            pageSize = conferenceRetrieveRecordingsJsonResponse.pageSize
            previousPageUri = conferenceRetrieveRecordingsJsonResponse.previousPageUri
            recordings =
                conferenceRetrieveRecordingsJsonResponse.recordings.map { it.toMutableList() }
            start = conferenceRetrieveRecordingsJsonResponse.start
            uri = conferenceRetrieveRecordingsJsonResponse.uri
            additionalProperties =
                conferenceRetrieveRecordingsJsonResponse.additionalProperties.toMutableMap()
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

        fun recordings(recordings: List<TexmlGetCallRecordingResponseBody>) =
            recordings(JsonField.of(recordings))

        /**
         * Sets [Builder.recordings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordings] with a well-typed
         * `List<TexmlGetCallRecordingResponseBody>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun recordings(recordings: JsonField<List<TexmlGetCallRecordingResponseBody>>) = apply {
            this.recordings = recordings.map { it.toMutableList() }
        }

        /**
         * Adds a single [TexmlGetCallRecordingResponseBody] to [recordings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecording(recording: TexmlGetCallRecordingResponseBody) = apply {
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
         * Returns an immutable instance of [ConferenceRetrieveRecordingsJsonResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConferenceRetrieveRecordingsJsonResponse =
            ConferenceRetrieveRecordingsJsonResponse(
                end,
                firstPageUri,
                nextPageUri,
                page,
                pageSize,
                previousPageUri,
                (recordings ?: JsonMissing.of()).map { it.toImmutable() },
                start,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConferenceRetrieveRecordingsJsonResponse = apply {
        if (validated) {
            return@apply
        }

        end()
        firstPageUri()
        nextPageUri()
        page()
        pageSize()
        previousPageUri()
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
            (if (previousPageUri.asKnown().isPresent) 1 else 0) +
            (recordings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceRetrieveRecordingsJsonResponse &&
            end == other.end &&
            firstPageUri == other.firstPageUri &&
            nextPageUri == other.nextPageUri &&
            page == other.page &&
            pageSize == other.pageSize &&
            previousPageUri == other.previousPageUri &&
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
            previousPageUri,
            recordings,
            start,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConferenceRetrieveRecordingsJsonResponse{end=$end, firstPageUri=$firstPageUri, nextPageUri=$nextPageUri, page=$page, pageSize=$pageSize, previousPageUri=$previousPageUri, recordings=$recordings, start=$start, uri=$uri, additionalProperties=$additionalProperties}"
}
