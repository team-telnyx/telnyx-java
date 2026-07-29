// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Lists account-level email events sorted oldest first by `occurred_at asc, id asc`. */
class EmailEventListParams
private constructor(
    private val emailId: String?,
    private val eventType: EventType?,
    private val from: OffsetDateTime?,
    private val pageCursor: String?,
    private val pageSize: Long?,
    private val to: OffsetDateTime?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filter events for a specific email message UUID. Invalid UUID values are silently ignored (no
     * filter applied).
     */
    fun emailId(): Optional<String> = Optional.ofNullable(emailId)

    /**
     * Comma-separated list of event types to include. Also accepts repeated query parameters (e.g.
     * event_type=delivered&event_type=bounced). Unknown values return no matches.
     */
    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType)

    /** Inclusive ISO 8601 start timestamp. Defaults to 30 days ago when omitted. */
    fun from(): Optional<OffsetDateTime> = Optional.ofNullable(from)

    /** Opaque URL-safe Base64 cursor returned by a previous list response. */
    fun pageCursor(): Optional<String> = Optional.ofNullable(pageCursor)

    /**
     * Number of results to return. Defaults to 25; maximum is 100. Invalid values are clamped to
     * the valid range.
     */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Inclusive ISO 8601 end timestamp. When `from` is provided without `to`, defaults to `from +
     * 30 days`.
     */
    fun to(): Optional<OffsetDateTime> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailEventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailEventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailEventListParams]. */
    class Builder internal constructor() {

        private var emailId: String? = null
        private var eventType: EventType? = null
        private var from: OffsetDateTime? = null
        private var pageCursor: String? = null
        private var pageSize: Long? = null
        private var to: OffsetDateTime? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailEventListParams: EmailEventListParams) = apply {
            emailId = emailEventListParams.emailId
            eventType = emailEventListParams.eventType
            from = emailEventListParams.from
            pageCursor = emailEventListParams.pageCursor
            pageSize = emailEventListParams.pageSize
            to = emailEventListParams.to
            additionalHeaders = emailEventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailEventListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Filter events for a specific email message UUID. Invalid UUID values are silently ignored
         * (no filter applied).
         */
        fun emailId(emailId: String?) = apply { this.emailId = emailId }

        /** Alias for calling [Builder.emailId] with `emailId.orElse(null)`. */
        fun emailId(emailId: Optional<String>) = emailId(emailId.getOrNull())

        /**
         * Comma-separated list of event types to include. Also accepts repeated query parameters
         * (e.g. event_type=delivered&event_type=bounced). Unknown values return no matches.
         */
        fun eventType(eventType: EventType?) = apply { this.eventType = eventType }

        /** Alias for calling [Builder.eventType] with `eventType.orElse(null)`. */
        fun eventType(eventType: Optional<EventType>) = eventType(eventType.getOrNull())

        /** Alias for calling [eventType] with `EventType.ofString(string)`. */
        fun eventType(string: String) = eventType(EventType.ofString(string))

        /** Alias for calling [eventType] with `EventType.ofStrings(strings)`. */
        fun eventTypeOfStrings(strings: List<String>) = eventType(EventType.ofStrings(strings))

        /** Inclusive ISO 8601 start timestamp. Defaults to 30 days ago when omitted. */
        fun from(from: OffsetDateTime?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<OffsetDateTime>) = from(from.getOrNull())

        /** Opaque URL-safe Base64 cursor returned by a previous list response. */
        fun pageCursor(pageCursor: String?) = apply { this.pageCursor = pageCursor }

        /** Alias for calling [Builder.pageCursor] with `pageCursor.orElse(null)`. */
        fun pageCursor(pageCursor: Optional<String>) = pageCursor(pageCursor.getOrNull())

        /**
         * Number of results to return. Defaults to 25; maximum is 100. Invalid values are clamped
         * to the valid range.
         */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Inclusive ISO 8601 end timestamp. When `from` is provided without `to`, defaults to
         * `from + 30 days`.
         */
        fun to(to: OffsetDateTime?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<OffsetDateTime>) = to(to.getOrNull())

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [EmailEventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailEventListParams =
            EmailEventListParams(
                emailId,
                eventType,
                from,
                pageCursor,
                pageSize,
                to,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                emailId?.let { put("email_id", it) }
                eventType?.accept(
                    object : EventType.Visitor<Unit> {
                        override fun visitString(string: String) {
                            put("event_type", string)
                        }

                        override fun visitStrings(strings: List<String>) {
                            put("event_type", strings.joinToString(","))
                        }
                    }
                )
                from?.let { put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                pageCursor?.let { put("page_cursor", it) }
                pageSize?.let { put("page_size", it.toString()) }
                to?.let { put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Comma-separated list of event types to include. Also accepts repeated query parameters (e.g.
     * event_type=delivered&event_type=bounced). Unknown values return no matches.
     */
    class EventType
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> throw IllegalStateException("Invalid EventType")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "EventType{string=$string}"
                strings != null -> "EventType{strings=$strings}"
                else -> throw IllegalStateException("Invalid EventType")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = EventType(string = string)

            @JvmStatic
            fun ofStrings(strings: List<String>) = EventType(strings = strings.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [EventType] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailEventListParams &&
            emailId == other.emailId &&
            eventType == other.eventType &&
            from == other.from &&
            pageCursor == other.pageCursor &&
            pageSize == other.pageSize &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            emailId,
            eventType,
            from,
            pageCursor,
            pageSize,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailEventListParams{emailId=$emailId, eventType=$eventType, from=$from, pageCursor=$pageCursor, pageSize=$pageSize, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
