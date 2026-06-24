// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ConferenceRetrieveConferencesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val conferences: JsonField<List<ConferenceResource>>,
    private val end: JsonField<Long>,
    private val firstPageUri: JsonField<String>,
    private val nextPageUri: JsonField<String>,
    private val page: JsonField<Long>,
    private val pageSize: JsonField<Long>,
    private val start: JsonField<Long>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("conferences")
        @ExcludeMissing
        conferences: JsonField<List<ConferenceResource>> = JsonMissing.of(),
        @JsonProperty("end") @ExcludeMissing end: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("first_page_uri")
        @ExcludeMissing
        firstPageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_page_uri")
        @ExcludeMissing
        nextPageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        conferences,
        end,
        firstPageUri,
        nextPageUri,
        page,
        pageSize,
        start,
        uri,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferences(): Optional<List<ConferenceResource>> = conferences.getOptional("conferences")

    /**
     * The number of the last element on the page, zero-indexed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun end(): Optional<Long> = end.getOptional("end")

    /**
     * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstPageUri(): Optional<String> = firstPageUri.getOptional("first_page_uri")

    /**
     * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ
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
     * Returns the raw JSON value of [conferences].
     *
     * Unlike [conferences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conferences")
    @ExcludeMissing
    fun _conferences(): JsonField<List<ConferenceResource>> = conferences

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
         * [ConferenceRetrieveConferencesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceRetrieveConferencesResponse]. */
    class Builder internal constructor() {

        private var conferences: JsonField<MutableList<ConferenceResource>>? = null
        private var end: JsonField<Long> = JsonMissing.of()
        private var firstPageUri: JsonField<String> = JsonMissing.of()
        private var nextPageUri: JsonField<String> = JsonMissing.of()
        private var page: JsonField<Long> = JsonMissing.of()
        private var pageSize: JsonField<Long> = JsonMissing.of()
        private var start: JsonField<Long> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            conferenceRetrieveConferencesResponse: ConferenceRetrieveConferencesResponse
        ) = apply {
            conferences =
                conferenceRetrieveConferencesResponse.conferences.map { it.toMutableList() }
            end = conferenceRetrieveConferencesResponse.end
            firstPageUri = conferenceRetrieveConferencesResponse.firstPageUri
            nextPageUri = conferenceRetrieveConferencesResponse.nextPageUri
            page = conferenceRetrieveConferencesResponse.page
            pageSize = conferenceRetrieveConferencesResponse.pageSize
            start = conferenceRetrieveConferencesResponse.start
            uri = conferenceRetrieveConferencesResponse.uri
            additionalProperties =
                conferenceRetrieveConferencesResponse.additionalProperties.toMutableMap()
        }

        fun conferences(conferences: List<ConferenceResource>) =
            conferences(JsonField.of(conferences))

        /**
         * Sets [Builder.conferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferences] with a well-typed
         * `List<ConferenceResource>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun conferences(conferences: JsonField<List<ConferenceResource>>) = apply {
            this.conferences = conferences.map { it.toMutableList() }
        }

        /**
         * Adds a single [ConferenceResource] to [conferences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConference(conference: ConferenceResource) = apply {
            conferences =
                (conferences ?: JsonField.of(mutableListOf())).also {
                    checkKnown("conferences", it).add(conference)
                }
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
         * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1
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
         * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ
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
         * Returns an immutable instance of [ConferenceRetrieveConferencesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConferenceRetrieveConferencesResponse =
            ConferenceRetrieveConferencesResponse(
                (conferences ?: JsonMissing.of()).map { it.toImmutable() },
                end,
                firstPageUri,
                nextPageUri,
                page,
                pageSize,
                start,
                uri,
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
    fun validate(): ConferenceRetrieveConferencesResponse = apply {
        if (validated) {
            return@apply
        }

        conferences().ifPresent { it.forEach { it.validate() } }
        end()
        firstPageUri()
        nextPageUri()
        page()
        pageSize()
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
        (conferences.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (end.asKnown().isPresent) 1 else 0) +
            (if (firstPageUri.asKnown().isPresent) 1 else 0) +
            (if (nextPageUri.asKnown().isPresent) 1 else 0) +
            (if (page.asKnown().isPresent) 1 else 0) +
            (if (pageSize.asKnown().isPresent) 1 else 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceRetrieveConferencesResponse &&
            conferences == other.conferences &&
            end == other.end &&
            firstPageUri == other.firstPageUri &&
            nextPageUri == other.nextPageUri &&
            page == other.page &&
            pageSize == other.pageSize &&
            start == other.start &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            conferences,
            end,
            firstPageUri,
            nextPageUri,
            page,
            pageSize,
            start,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConferenceRetrieveConferencesResponse{conferences=$conferences, end=$end, firstPageUri=$firstPageUri, nextPageUri=$nextPageUri, page=$page, pageSize=$pageSize, start=$start, uri=$uri, additionalProperties=$additionalProperties}"
}
