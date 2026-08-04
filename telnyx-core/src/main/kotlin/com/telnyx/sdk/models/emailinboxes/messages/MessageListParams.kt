// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists inbound messages newest first. All access is scoped to the authenticated account.
 * `filter[search]` performs PostgreSQL full-text search over the subject, plain-text body, and HTML
 * body. Filters compose with stable cursor pagination.
 */
class MessageListParams
private constructor(
    private val inboxId: String?,
    private val filterFrom: String?,
    private val filterLabel: String?,
    private val filterRead: Boolean?,
    private val filterReceivedAfter: OffsetDateTime?,
    private val filterReceivedBefore: OffsetDateTime?,
    private val filterSearch: String?,
    private val filterSubject: String?,
    private val filterUnread: Boolean?,
    private val pageAfter: String?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): Optional<String> = Optional.ofNullable(inboxId)

    /** Case-insensitive literal substring of the sender address. */
    fun filterFrom(): Optional<String> = Optional.ofNullable(filterFrom)

    /**
     * Returns only messages carrying this label. Matching is exact and case-sensitive. Reserved
     * `telnyx:` labels can be filtered on even though they cannot be written by customers.
     */
    fun filterLabel(): Optional<String> = Optional.ofNullable(filterLabel)

    /** Whether the message has a read timestamp. */
    fun filterRead(): Optional<Boolean> = Optional.ofNullable(filterRead)

    /** Inclusive ISO 8601 lower bound for the received timestamp. */
    fun filterReceivedAfter(): Optional<OffsetDateTime> = Optional.ofNullable(filterReceivedAfter)

    /** Inclusive ISO 8601 upper bound for the received timestamp. */
    fun filterReceivedBefore(): Optional<OffsetDateTime> = Optional.ofNullable(filterReceivedBefore)

    /** Full-text query over subject and body, up to 500 characters. */
    fun filterSearch(): Optional<String> = Optional.ofNullable(filterSearch)

    /** Case-insensitive literal substring of the subject. */
    fun filterSubject(): Optional<String> = Optional.ofNullable(filterSubject)

    /** Whether the message has no read timestamp. Set to `true` to return only unread messages. */
    fun filterUnread(): Optional<Boolean> = Optional.ofNullable(filterUnread)

    /** Opaque cursor returned by the previous page. */
    fun pageAfter(): Optional<String> = Optional.ofNullable(pageAfter)

    /** Number of results to return. Defaults to 25; maximum is 100. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MessageListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MessageListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageListParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var filterFrom: String? = null
        private var filterLabel: String? = null
        private var filterRead: Boolean? = null
        private var filterReceivedAfter: OffsetDateTime? = null
        private var filterReceivedBefore: OffsetDateTime? = null
        private var filterSearch: String? = null
        private var filterSubject: String? = null
        private var filterUnread: Boolean? = null
        private var pageAfter: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageListParams: MessageListParams) = apply {
            inboxId = messageListParams.inboxId
            filterFrom = messageListParams.filterFrom
            filterLabel = messageListParams.filterLabel
            filterRead = messageListParams.filterRead
            filterReceivedAfter = messageListParams.filterReceivedAfter
            filterReceivedBefore = messageListParams.filterReceivedBefore
            filterSearch = messageListParams.filterSearch
            filterSubject = messageListParams.filterSubject
            filterUnread = messageListParams.filterUnread
            pageAfter = messageListParams.pageAfter
            pageSize = messageListParams.pageSize
            additionalHeaders = messageListParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageListParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String?) = apply { this.inboxId = inboxId }

        /** Alias for calling [Builder.inboxId] with `inboxId.orElse(null)`. */
        fun inboxId(inboxId: Optional<String>) = inboxId(inboxId.getOrNull())

        /** Case-insensitive literal substring of the sender address. */
        fun filterFrom(filterFrom: String?) = apply { this.filterFrom = filterFrom }

        /** Alias for calling [Builder.filterFrom] with `filterFrom.orElse(null)`. */
        fun filterFrom(filterFrom: Optional<String>) = filterFrom(filterFrom.getOrNull())

        /**
         * Returns only messages carrying this label. Matching is exact and case-sensitive. Reserved
         * `telnyx:` labels can be filtered on even though they cannot be written by customers.
         */
        fun filterLabel(filterLabel: String?) = apply { this.filterLabel = filterLabel }

        /** Alias for calling [Builder.filterLabel] with `filterLabel.orElse(null)`. */
        fun filterLabel(filterLabel: Optional<String>) = filterLabel(filterLabel.getOrNull())

        /** Whether the message has a read timestamp. */
        fun filterRead(filterRead: Boolean?) = apply { this.filterRead = filterRead }

        /**
         * Alias for [Builder.filterRead].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun filterRead(filterRead: Boolean) = filterRead(filterRead as Boolean?)

        /** Alias for calling [Builder.filterRead] with `filterRead.orElse(null)`. */
        fun filterRead(filterRead: Optional<Boolean>) = filterRead(filterRead.getOrNull())

        /** Inclusive ISO 8601 lower bound for the received timestamp. */
        fun filterReceivedAfter(filterReceivedAfter: OffsetDateTime?) = apply {
            this.filterReceivedAfter = filterReceivedAfter
        }

        /**
         * Alias for calling [Builder.filterReceivedAfter] with `filterReceivedAfter.orElse(null)`.
         */
        fun filterReceivedAfter(filterReceivedAfter: Optional<OffsetDateTime>) =
            filterReceivedAfter(filterReceivedAfter.getOrNull())

        /** Inclusive ISO 8601 upper bound for the received timestamp. */
        fun filterReceivedBefore(filterReceivedBefore: OffsetDateTime?) = apply {
            this.filterReceivedBefore = filterReceivedBefore
        }

        /**
         * Alias for calling [Builder.filterReceivedBefore] with
         * `filterReceivedBefore.orElse(null)`.
         */
        fun filterReceivedBefore(filterReceivedBefore: Optional<OffsetDateTime>) =
            filterReceivedBefore(filterReceivedBefore.getOrNull())

        /** Full-text query over subject and body, up to 500 characters. */
        fun filterSearch(filterSearch: String?) = apply { this.filterSearch = filterSearch }

        /** Alias for calling [Builder.filterSearch] with `filterSearch.orElse(null)`. */
        fun filterSearch(filterSearch: Optional<String>) = filterSearch(filterSearch.getOrNull())

        /** Case-insensitive literal substring of the subject. */
        fun filterSubject(filterSubject: String?) = apply { this.filterSubject = filterSubject }

        /** Alias for calling [Builder.filterSubject] with `filterSubject.orElse(null)`. */
        fun filterSubject(filterSubject: Optional<String>) =
            filterSubject(filterSubject.getOrNull())

        /**
         * Whether the message has no read timestamp. Set to `true` to return only unread messages.
         */
        fun filterUnread(filterUnread: Boolean?) = apply { this.filterUnread = filterUnread }

        /**
         * Alias for [Builder.filterUnread].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun filterUnread(filterUnread: Boolean) = filterUnread(filterUnread as Boolean?)

        /** Alias for calling [Builder.filterUnread] with `filterUnread.orElse(null)`. */
        fun filterUnread(filterUnread: Optional<Boolean>) = filterUnread(filterUnread.getOrNull())

        /** Opaque cursor returned by the previous page. */
        fun pageAfter(pageAfter: String?) = apply { this.pageAfter = pageAfter }

        /** Alias for calling [Builder.pageAfter] with `pageAfter.orElse(null)`. */
        fun pageAfter(pageAfter: Optional<String>) = pageAfter(pageAfter.getOrNull())

        /** Number of results to return. Defaults to 25; maximum is 100. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [MessageListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageListParams =
            MessageListParams(
                inboxId,
                filterFrom,
                filterLabel,
                filterRead,
                filterReceivedAfter,
                filterReceivedBefore,
                filterSearch,
                filterSubject,
                filterUnread,
                pageAfter,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterFrom?.let { put("filter[from]", it) }
                filterLabel?.let { put("filter[label]", it) }
                filterRead?.let { put("filter[read]", it.toString()) }
                filterReceivedAfter?.let {
                    put("filter[received_after]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                filterReceivedBefore?.let {
                    put(
                        "filter[received_before]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterSearch?.let { put("filter[search]", it) }
                filterSubject?.let { put("filter[subject]", it) }
                filterUnread?.let { put("filter[unread]", it.toString()) }
                pageAfter?.let { put("page[after]", it) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageListParams &&
            inboxId == other.inboxId &&
            filterFrom == other.filterFrom &&
            filterLabel == other.filterLabel &&
            filterRead == other.filterRead &&
            filterReceivedAfter == other.filterReceivedAfter &&
            filterReceivedBefore == other.filterReceivedBefore &&
            filterSearch == other.filterSearch &&
            filterSubject == other.filterSubject &&
            filterUnread == other.filterUnread &&
            pageAfter == other.pageAfter &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            inboxId,
            filterFrom,
            filterLabel,
            filterRead,
            filterReceivedAfter,
            filterReceivedBefore,
            filterSearch,
            filterSubject,
            filterUnread,
            pageAfter,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MessageListParams{inboxId=$inboxId, filterFrom=$filterFrom, filterLabel=$filterLabel, filterRead=$filterRead, filterReceivedAfter=$filterReceivedAfter, filterReceivedBefore=$filterReceivedBefore, filterSearch=$filterSearch, filterSubject=$filterSubject, filterUnread=$filterUnread, pageAfter=$pageAfter, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
