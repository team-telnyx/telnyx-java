// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns multiple call resouces for an account. This endpoint is eventually consistent. */
class CallRetrieveCallsParams
private constructor(
    private val accountSid: String?,
    private val endTime: String?,
    private val endTimeGt: String?,
    private val endTimeLt: String?,
    private val from: String?,
    private val page: Long?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val startTime: String?,
    private val startTimeGt: String?,
    private val startTimeLt: String?,
    private val status: Status?,
    private val to: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid)

    /** Filters calls by their end date. Expected format is YYYY-MM-DD */
    fun endTime(): Optional<String> = Optional.ofNullable(endTime)

    /** Filters calls by their end date (after). Expected format is YYYY-MM-DD */
    fun endTimeGt(): Optional<String> = Optional.ofNullable(endTimeGt)

    /** Filters calls by their end date (before). Expected format is YYYY-MM-DD */
    fun endTimeLt(): Optional<String> = Optional.ofNullable(endTimeLt)

    /** Filters calls by the from number. */
    fun from(): Optional<String> = Optional.ofNullable(from)

    /**
     * The number of the page to be displayed, zero-indexed, should be used in conjuction with
     * PageToken.
     */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** The number of records to be displayed on a page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Used to request the next page of results. */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Filters calls by their start date. Expected format is YYYY-MM-DD. */
    fun startTime(): Optional<String> = Optional.ofNullable(startTime)

    /** Filters calls by their start date (after). Expected format is YYYY-MM-DD */
    fun startTimeGt(): Optional<String> = Optional.ofNullable(startTimeGt)

    /** Filters calls by their start date (before). Expected format is YYYY-MM-DD */
    fun startTimeLt(): Optional<String> = Optional.ofNullable(startTimeLt)

    /** Filters calls by status. */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Filters calls by the to number. */
    fun to(): Optional<String> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CallRetrieveCallsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CallRetrieveCallsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallRetrieveCallsParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var endTime: String? = null
        private var endTimeGt: String? = null
        private var endTimeLt: String? = null
        private var from: String? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var startTime: String? = null
        private var startTimeGt: String? = null
        private var startTimeLt: String? = null
        private var status: Status? = null
        private var to: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callRetrieveCallsParams: CallRetrieveCallsParams) = apply {
            accountSid = callRetrieveCallsParams.accountSid
            endTime = callRetrieveCallsParams.endTime
            endTimeGt = callRetrieveCallsParams.endTimeGt
            endTimeLt = callRetrieveCallsParams.endTimeLt
            from = callRetrieveCallsParams.from
            page = callRetrieveCallsParams.page
            pageSize = callRetrieveCallsParams.pageSize
            pageToken = callRetrieveCallsParams.pageToken
            startTime = callRetrieveCallsParams.startTime
            startTimeGt = callRetrieveCallsParams.startTimeGt
            startTimeLt = callRetrieveCallsParams.startTimeLt
            status = callRetrieveCallsParams.status
            to = callRetrieveCallsParams.to
            additionalHeaders = callRetrieveCallsParams.additionalHeaders.toBuilder()
            additionalQueryParams = callRetrieveCallsParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String?) = apply { this.accountSid = accountSid }

        /** Alias for calling [Builder.accountSid] with `accountSid.orElse(null)`. */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        /** Filters calls by their end date. Expected format is YYYY-MM-DD */
        fun endTime(endTime: String?) = apply { this.endTime = endTime }

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<String>) = endTime(endTime.getOrNull())

        /** Filters calls by their end date (after). Expected format is YYYY-MM-DD */
        fun endTimeGt(endTimeGt: String?) = apply { this.endTimeGt = endTimeGt }

        /** Alias for calling [Builder.endTimeGt] with `endTimeGt.orElse(null)`. */
        fun endTimeGt(endTimeGt: Optional<String>) = endTimeGt(endTimeGt.getOrNull())

        /** Filters calls by their end date (before). Expected format is YYYY-MM-DD */
        fun endTimeLt(endTimeLt: String?) = apply { this.endTimeLt = endTimeLt }

        /** Alias for calling [Builder.endTimeLt] with `endTimeLt.orElse(null)`. */
        fun endTimeLt(endTimeLt: Optional<String>) = endTimeLt(endTimeLt.getOrNull())

        /** Filters calls by the from number. */
        fun from(from: String?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<String>) = from(from.getOrNull())

        /**
         * The number of the page to be displayed, zero-indexed, should be used in conjuction with
         * PageToken.
         */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /** The number of records to be displayed on a page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Used to request the next page of results. */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /** Filters calls by their start date. Expected format is YYYY-MM-DD. */
        fun startTime(startTime: String?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<String>) = startTime(startTime.getOrNull())

        /** Filters calls by their start date (after). Expected format is YYYY-MM-DD */
        fun startTimeGt(startTimeGt: String?) = apply { this.startTimeGt = startTimeGt }

        /** Alias for calling [Builder.startTimeGt] with `startTimeGt.orElse(null)`. */
        fun startTimeGt(startTimeGt: Optional<String>) = startTimeGt(startTimeGt.getOrNull())

        /** Filters calls by their start date (before). Expected format is YYYY-MM-DD */
        fun startTimeLt(startTimeLt: String?) = apply { this.startTimeLt = startTimeLt }

        /** Alias for calling [Builder.startTimeLt] with `startTimeLt.orElse(null)`. */
        fun startTimeLt(startTimeLt: Optional<String>) = startTimeLt(startTimeLt.getOrNull())

        /** Filters calls by status. */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /** Filters calls by the to number. */
        fun to(to: String?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<String>) = to(to.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CallRetrieveCallsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallRetrieveCallsParams =
            CallRetrieveCallsParams(
                accountSid,
                endTime,
                endTimeGt,
                endTimeLt,
                from,
                page,
                pageSize,
                pageToken,
                startTime,
                startTimeGt,
                startTimeLt,
                status,
                to,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endTime?.let { put("EndTime", it) }
                endTimeGt?.let { put("EndTime_gt", it) }
                endTimeLt?.let { put("EndTime_lt", it) }
                from?.let { put("From", it) }
                page?.let { put("Page", it.toString()) }
                pageSize?.let { put("PageSize", it.toString()) }
                pageToken?.let { put("PageToken", it) }
                startTime?.let { put("StartTime", it) }
                startTimeGt?.let { put("StartTime_gt", it) }
                startTimeLt?.let { put("StartTime_lt", it) }
                status?.let { put("Status", it.toString()) }
                to?.let { put("To", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filters calls by status. */
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

            @JvmField val CANCELED = of("canceled")

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmField val BUSY = of("busy")

            @JvmField val NO_ANSWER = of("no-answer")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELED,
            COMPLETED,
            FAILED,
            BUSY,
            NO_ANSWER,
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
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

        return other is CallRetrieveCallsParams &&
            accountSid == other.accountSid &&
            endTime == other.endTime &&
            endTimeGt == other.endTimeGt &&
            endTimeLt == other.endTimeLt &&
            from == other.from &&
            page == other.page &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            startTime == other.startTime &&
            startTimeGt == other.startTimeGt &&
            startTimeLt == other.startTimeLt &&
            status == other.status &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountSid,
            endTime,
            endTimeGt,
            endTimeLt,
            from,
            page,
            pageSize,
            pageToken,
            startTime,
            startTimeGt,
            startTimeLt,
            status,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CallRetrieveCallsParams{accountSid=$accountSid, endTime=$endTime, endTimeGt=$endTimeGt, endTimeLt=$endTimeLt, from=$from, page=$page, pageSize=$pageSize, pageToken=$pageToken, startTime=$startTime, startTimeGt=$startTimeGt, startTimeLt=$startTimeLt, status=$status, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
