// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

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

class CallRetrieveCallsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val calls: JsonField<List<Call>>,
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
        @JsonProperty("calls") @ExcludeMissing calls: JsonField<List<Call>> = JsonMissing.of(),
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
    ) : this(calls, end, firstPageUri, nextPageUri, page, pageSize, start, uri, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun calls(): Optional<List<Call>> = calls.getOptional("calls")

    /**
     * The number of the last element on the page, zero-indexed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun end(): Optional<Long> = end.getOptional("end")

    /**
     * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=0&PageSize=1
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstPageUri(): Optional<String> = firstPageUri.getOptional("first_page_uri")

    /**
     * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ
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
     * Returns the raw JSON value of [calls].
     *
     * Unlike [calls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calls") @ExcludeMissing fun _calls(): JsonField<List<Call>> = calls

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
         * Returns a mutable builder for constructing an instance of [CallRetrieveCallsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallRetrieveCallsResponse]. */
    class Builder internal constructor() {

        private var calls: JsonField<MutableList<Call>>? = null
        private var end: JsonField<Long> = JsonMissing.of()
        private var firstPageUri: JsonField<String> = JsonMissing.of()
        private var nextPageUri: JsonField<String> = JsonMissing.of()
        private var page: JsonField<Long> = JsonMissing.of()
        private var pageSize: JsonField<Long> = JsonMissing.of()
        private var start: JsonField<Long> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callRetrieveCallsResponse: CallRetrieveCallsResponse) = apply {
            calls = callRetrieveCallsResponse.calls.map { it.toMutableList() }
            end = callRetrieveCallsResponse.end
            firstPageUri = callRetrieveCallsResponse.firstPageUri
            nextPageUri = callRetrieveCallsResponse.nextPageUri
            page = callRetrieveCallsResponse.page
            pageSize = callRetrieveCallsResponse.pageSize
            start = callRetrieveCallsResponse.start
            uri = callRetrieveCallsResponse.uri
            additionalProperties = callRetrieveCallsResponse.additionalProperties.toMutableMap()
        }

        fun calls(calls: List<Call>) = calls(JsonField.of(calls))

        /**
         * Sets [Builder.calls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calls] with a well-typed `List<Call>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calls(calls: JsonField<List<Call>>) = apply {
            this.calls = calls.map { it.toMutableList() }
        }

        /**
         * Adds a single [Call] to [calls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCall(call: Call) = apply {
            calls =
                (calls ?: JsonField.of(mutableListOf())).also { checkKnown("calls", it).add(call) }
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

        /** /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=0&PageSize=1 */
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
         * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ
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
         * Returns an immutable instance of [CallRetrieveCallsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallRetrieveCallsResponse =
            CallRetrieveCallsResponse(
                (calls ?: JsonMissing.of()).map { it.toImmutable() },
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

    fun validate(): CallRetrieveCallsResponse = apply {
        if (validated) {
            return@apply
        }

        calls().ifPresent { it.forEach { it.validate() } }
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
        (calls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (end.asKnown().isPresent) 1 else 0) +
            (if (firstPageUri.asKnown().isPresent) 1 else 0) +
            (if (nextPageUri.asKnown().isPresent) 1 else 0) +
            (if (page.asKnown().isPresent) 1 else 0) +
            (if (pageSize.asKnown().isPresent) 1 else 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    class Call
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountSid: JsonField<String>,
        private val answeredBy: JsonField<AnsweredBy>,
        private val callerName: JsonField<String>,
        private val dateCreated: JsonField<String>,
        private val dateUpdated: JsonField<String>,
        private val direction: JsonField<Direction>,
        private val duration: JsonField<String>,
        private val endTime: JsonField<String>,
        private val from: JsonField<String>,
        private val fromFormatted: JsonField<String>,
        private val price: JsonField<String>,
        private val priceUnit: JsonField<String>,
        private val sid: JsonField<String>,
        private val startTime: JsonField<String>,
        private val status: JsonField<Status>,
        private val to: JsonField<String>,
        private val toFormatted: JsonField<String>,
        private val uri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_sid")
            @ExcludeMissing
            accountSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("answered_by")
            @ExcludeMissing
            answeredBy: JsonField<AnsweredBy> = JsonMissing.of(),
            @JsonProperty("caller_name")
            @ExcludeMissing
            callerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date_created")
            @ExcludeMissing
            dateCreated: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date_updated")
            @ExcludeMissing
            dateUpdated: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_time") @ExcludeMissing endTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from_formatted")
            @ExcludeMissing
            fromFormatted: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_unit")
            @ExcludeMissing
            priceUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to_formatted")
            @ExcludeMissing
            toFormatted: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountSid,
            answeredBy,
            callerName,
            dateCreated,
            dateUpdated,
            direction,
            duration,
            endTime,
            from,
            fromFormatted,
            price,
            priceUnit,
            sid,
            startTime,
            status,
            to,
            toFormatted,
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
         * The value of the answering machine detection result, if this feature was enabled for the
         * call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun answeredBy(): Optional<AnsweredBy> = answeredBy.getOptional("answered_by")

        /**
         * Caller ID, if present.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callerName(): Optional<String> = callerName.getOptional("caller_name")

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
         * The direction of this call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun direction(): Optional<Direction> = direction.getOptional("direction")

        /**
         * The duration of this call, given in seconds.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<String> = duration.getOptional("duration")

        /**
         * The end time of this call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endTime(): Optional<String> = endTime.getOptional("end_time")

        /**
         * The phone number or SIP address that made this call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<String> = from.getOptional("from")

        /**
         * The from number formatted for display.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fromFormatted(): Optional<String> = fromFormatted.getOptional("from_formatted")

        /**
         * The price of this call, the currency is specified in the price_unit field. Only populated
         * when the call cost feature is enabled for the account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Optional<String> = price.getOptional("price")

        /**
         * The unit in which the price is given.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceUnit(): Optional<String> = priceUnit.getOptional("price_unit")

        /**
         * The identifier of this call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sid(): Optional<String> = sid.getOptional("sid")

        /**
         * The start time of this call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startTime(): Optional<String> = startTime.getOptional("start_time")

        /**
         * The status of this call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * The phone number or SIP address that received this call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<String> = to.getOptional("to")

        /**
         * The to number formatted for display.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toFormatted(): Optional<String> = toFormatted.getOptional("to_formatted")

        /**
         * The relative URI for this call.
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
         * Returns the raw JSON value of [answeredBy].
         *
         * Unlike [answeredBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("answered_by")
        @ExcludeMissing
        fun _answeredBy(): JsonField<AnsweredBy> = answeredBy

        /**
         * Returns the raw JSON value of [callerName].
         *
         * Unlike [callerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("caller_name")
        @ExcludeMissing
        fun _callerName(): JsonField<String> = callerName

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
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<String> = endTime

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [fromFormatted].
         *
         * Unlike [fromFormatted], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("from_formatted")
        @ExcludeMissing
        fun _fromFormatted(): JsonField<String> = fromFormatted

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<String> = price

        /**
         * Returns the raw JSON value of [priceUnit].
         *
         * Unlike [priceUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_unit") @ExcludeMissing fun _priceUnit(): JsonField<String> = priceUnit

        /**
         * Returns the raw JSON value of [sid].
         *
         * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

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
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [toFormatted].
         *
         * Unlike [toFormatted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to_formatted")
        @ExcludeMissing
        fun _toFormatted(): JsonField<String> = toFormatted

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

            /** Returns a mutable builder for constructing an instance of [Call]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Call]. */
        class Builder internal constructor() {

            private var accountSid: JsonField<String> = JsonMissing.of()
            private var answeredBy: JsonField<AnsweredBy> = JsonMissing.of()
            private var callerName: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<String> = JsonMissing.of()
            private var dateUpdated: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var duration: JsonField<String> = JsonMissing.of()
            private var endTime: JsonField<String> = JsonMissing.of()
            private var from: JsonField<String> = JsonMissing.of()
            private var fromFormatted: JsonField<String> = JsonMissing.of()
            private var price: JsonField<String> = JsonMissing.of()
            private var priceUnit: JsonField<String> = JsonMissing.of()
            private var sid: JsonField<String> = JsonMissing.of()
            private var startTime: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var to: JsonField<String> = JsonMissing.of()
            private var toFormatted: JsonField<String> = JsonMissing.of()
            private var uri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(call: Call) = apply {
                accountSid = call.accountSid
                answeredBy = call.answeredBy
                callerName = call.callerName
                dateCreated = call.dateCreated
                dateUpdated = call.dateUpdated
                direction = call.direction
                duration = call.duration
                endTime = call.endTime
                from = call.from
                fromFormatted = call.fromFormatted
                price = call.price
                priceUnit = call.priceUnit
                sid = call.sid
                startTime = call.startTime
                status = call.status
                to = call.to
                toFormatted = call.toFormatted
                uri = call.uri
                additionalProperties = call.additionalProperties.toMutableMap()
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

            /**
             * The value of the answering machine detection result, if this feature was enabled for
             * the call.
             */
            fun answeredBy(answeredBy: AnsweredBy) = answeredBy(JsonField.of(answeredBy))

            /**
             * Sets [Builder.answeredBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.answeredBy] with a well-typed [AnsweredBy] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun answeredBy(answeredBy: JsonField<AnsweredBy>) = apply {
                this.answeredBy = answeredBy
            }

            /** Caller ID, if present. */
            fun callerName(callerName: String) = callerName(JsonField.of(callerName))

            /**
             * Sets [Builder.callerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callerName(callerName: JsonField<String>) = apply { this.callerName = callerName }

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

            /** The direction of this call. */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /** The duration of this call, given in seconds. */
            fun duration(duration: String) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<String>) = apply { this.duration = duration }

            /** The end time of this call. */
            fun endTime(endTime: String) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<String>) = apply { this.endTime = endTime }

            /** The phone number or SIP address that made this call. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /** The from number formatted for display. */
            fun fromFormatted(fromFormatted: String) = fromFormatted(JsonField.of(fromFormatted))

            /**
             * Sets [Builder.fromFormatted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromFormatted] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromFormatted(fromFormatted: JsonField<String>) = apply {
                this.fromFormatted = fromFormatted
            }

            /**
             * The price of this call, the currency is specified in the price_unit field. Only
             * populated when the call cost feature is enabled for the account.
             */
            fun price(price: String) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun price(price: JsonField<String>) = apply { this.price = price }

            /** The unit in which the price is given. */
            fun priceUnit(priceUnit: String) = priceUnit(JsonField.of(priceUnit))

            /**
             * Sets [Builder.priceUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceUnit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceUnit(priceUnit: JsonField<String>) = apply { this.priceUnit = priceUnit }

            /** The identifier of this call. */
            fun sid(sid: String) = sid(JsonField.of(sid))

            /**
             * Sets [Builder.sid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sid] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sid(sid: JsonField<String>) = apply { this.sid = sid }

            /** The start time of this call. */
            fun startTime(startTime: String) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

            /** The status of this call. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The phone number or SIP address that received this call. */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /** The to number formatted for display. */
            fun toFormatted(toFormatted: String) = toFormatted(JsonField.of(toFormatted))

            /**
             * Sets [Builder.toFormatted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toFormatted] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toFormatted(toFormatted: JsonField<String>) = apply {
                this.toFormatted = toFormatted
            }

            /** The relative URI for this call. */
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
             * Returns an immutable instance of [Call].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Call =
                Call(
                    accountSid,
                    answeredBy,
                    callerName,
                    dateCreated,
                    dateUpdated,
                    direction,
                    duration,
                    endTime,
                    from,
                    fromFormatted,
                    price,
                    priceUnit,
                    sid,
                    startTime,
                    status,
                    to,
                    toFormatted,
                    uri,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Call = apply {
            if (validated) {
                return@apply
            }

            accountSid()
            answeredBy().ifPresent { it.validate() }
            callerName()
            dateCreated()
            dateUpdated()
            direction().ifPresent { it.validate() }
            duration()
            endTime()
            from()
            fromFormatted()
            price()
            priceUnit()
            sid()
            startTime()
            status().ifPresent { it.validate() }
            to()
            toFormatted()
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
                (answeredBy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (callerName.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (if (fromFormatted.asKnown().isPresent) 1 else 0) +
                (if (price.asKnown().isPresent) 1 else 0) +
                (if (priceUnit.asKnown().isPresent) 1 else 0) +
                (if (sid.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (if (toFormatted.asKnown().isPresent) 1 else 0) +
                (if (uri.asKnown().isPresent) 1 else 0)

        /**
         * The value of the answering machine detection result, if this feature was enabled for the
         * call.
         */
        class AnsweredBy @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val HUMAN = of("human")

                @JvmField val MACHINE = of("machine")

                @JvmField val NOT_SURE = of("not_sure")

                @JvmStatic fun of(value: String) = AnsweredBy(JsonField.of(value))
            }

            /** An enum containing [AnsweredBy]'s known values. */
            enum class Known {
                HUMAN,
                MACHINE,
                NOT_SURE,
            }

            /**
             * An enum containing [AnsweredBy]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AnsweredBy] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HUMAN,
                MACHINE,
                NOT_SURE,
                /**
                 * An enum member indicating that [AnsweredBy] was instantiated with an unknown
                 * value.
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
                    HUMAN -> Value.HUMAN
                    MACHINE -> Value.MACHINE
                    NOT_SURE -> Value.NOT_SURE
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
                    HUMAN -> Known.HUMAN
                    MACHINE -> Known.MACHINE
                    NOT_SURE -> Known.NOT_SURE
                    else -> throw TelnyxInvalidDataException("Unknown AnsweredBy: $value")
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

            fun validate(): AnsweredBy = apply {
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

                return other is AnsweredBy && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The direction of this call. */
        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INBOUND,
                OUTBOUND,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
                 * value.
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
                    INBOUND -> Value.INBOUND
                    OUTBOUND -> Value.OUTBOUND
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
                    INBOUND -> Known.INBOUND
                    OUTBOUND -> Known.OUTBOUND
                    else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
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

        /** The status of this call. */
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

                @JvmField val RINGING = of("ringing")

                @JvmField val IN_PROGRESS = of("in-progress")

                @JvmField val CANCELED = of("canceled")

                @JvmField val COMPLETED = of("completed")

                @JvmField val FAILED = of("failed")

                @JvmField val BUSY = of("busy")

                @JvmField val NO_ANSWER = of("no-answer")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RINGING,
                IN_PROGRESS,
                CANCELED,
                COMPLETED,
                FAILED,
                BUSY,
                NO_ANSWER,
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
                RINGING,
                IN_PROGRESS,
                CANCELED,
                COMPLETED,
                FAILED,
                BUSY,
                NO_ANSWER,
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
                    RINGING -> Value.RINGING
                    IN_PROGRESS -> Value.IN_PROGRESS
                    CANCELED -> Value.CANCELED
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    BUSY -> Value.BUSY
                    NO_ANSWER -> Value.NO_ANSWER
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
                    RINGING -> Known.RINGING
                    IN_PROGRESS -> Known.IN_PROGRESS
                    CANCELED -> Known.CANCELED
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    BUSY -> Known.BUSY
                    NO_ANSWER -> Known.NO_ANSWER
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

            return other is Call &&
                accountSid == other.accountSid &&
                answeredBy == other.answeredBy &&
                callerName == other.callerName &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                direction == other.direction &&
                duration == other.duration &&
                endTime == other.endTime &&
                from == other.from &&
                fromFormatted == other.fromFormatted &&
                price == other.price &&
                priceUnit == other.priceUnit &&
                sid == other.sid &&
                startTime == other.startTime &&
                status == other.status &&
                to == other.to &&
                toFormatted == other.toFormatted &&
                uri == other.uri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountSid,
                answeredBy,
                callerName,
                dateCreated,
                dateUpdated,
                direction,
                duration,
                endTime,
                from,
                fromFormatted,
                price,
                priceUnit,
                sid,
                startTime,
                status,
                to,
                toFormatted,
                uri,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Call{accountSid=$accountSid, answeredBy=$answeredBy, callerName=$callerName, dateCreated=$dateCreated, dateUpdated=$dateUpdated, direction=$direction, duration=$duration, endTime=$endTime, from=$from, fromFormatted=$fromFormatted, price=$price, priceUnit=$priceUnit, sid=$sid, startTime=$startTime, status=$status, to=$to, toFormatted=$toFormatted, uri=$uri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallRetrieveCallsResponse &&
            calls == other.calls &&
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
            calls,
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
        "CallRetrieveCallsResponse{calls=$calls, end=$end, firstPageUri=$firstPageUri, nextPageUri=$nextPageUri, page=$page, pageSize=$pageSize, start=$start, uri=$uri, additionalProperties=$additionalProperties}"
}
