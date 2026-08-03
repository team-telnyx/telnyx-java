// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailthreads

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists thread summaries for the whole account, newest first, using stable cursor pagination. An
 * agent operating many inboxes gets every conversation in one call instead of one call per inbox.
 * Each thread carries its own `inbox_id` so a reply can be routed back to the right inbox. Use
 * `filter[inbox_id]` (repeatable) to narrow the result to specific inboxes. Because a thread ID can
 * be delivered to multiple inboxes, each result is identified by its `(inbox_id, id)` pair.
 */
class EmailThreadListParams
private constructor(
    private val filterInboxId: List<String>?,
    private val filterLabel: String?,
    private val pageAfter: String?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Restrict results to one or more inboxes. Repeat the parameter
     * (`filter[inbox_id][]=...&filter[inbox_id][]=...`) or pass a comma-separated list. Omit to
     * list every inbox in the account. Inboxes outside the account are silently excluded. If the
     * filter is present, it must contain at least one non-empty UUID.
     */
    fun filterInboxId(): Optional<List<String>> = Optional.ofNullable(filterInboxId)

    /**
     * Returns only threads carrying this label. Matching is exact and case-sensitive. Thread labels
     * are independent of the labels on the thread's messages.
     */
    fun filterLabel(): Optional<String> = Optional.ofNullable(filterLabel)

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

        @JvmStatic fun none(): EmailThreadListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailThreadListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailThreadListParams]. */
    class Builder internal constructor() {

        private var filterInboxId: MutableList<String>? = null
        private var filterLabel: String? = null
        private var pageAfter: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailThreadListParams: EmailThreadListParams) = apply {
            filterInboxId = emailThreadListParams.filterInboxId?.toMutableList()
            filterLabel = emailThreadListParams.filterLabel
            pageAfter = emailThreadListParams.pageAfter
            pageSize = emailThreadListParams.pageSize
            additionalHeaders = emailThreadListParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailThreadListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Restrict results to one or more inboxes. Repeat the parameter
         * (`filter[inbox_id][]=...&filter[inbox_id][]=...`) or pass a comma-separated list. Omit to
         * list every inbox in the account. Inboxes outside the account are silently excluded. If
         * the filter is present, it must contain at least one non-empty UUID.
         */
        fun filterInboxId(filterInboxId: List<String>?) = apply {
            this.filterInboxId = filterInboxId?.toMutableList()
        }

        /** Alias for calling [Builder.filterInboxId] with `filterInboxId.orElse(null)`. */
        fun filterInboxId(filterInboxId: Optional<List<String>>) =
            filterInboxId(filterInboxId.getOrNull())

        /**
         * Adds a single [String] to [Builder.filterInboxId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilterInboxId(filterInboxId: String) = apply {
            this.filterInboxId =
                (this.filterInboxId ?: mutableListOf()).apply { add(filterInboxId) }
        }

        /**
         * Returns only threads carrying this label. Matching is exact and case-sensitive. Thread
         * labels are independent of the labels on the thread's messages.
         */
        fun filterLabel(filterLabel: String?) = apply { this.filterLabel = filterLabel }

        /** Alias for calling [Builder.filterLabel] with `filterLabel.orElse(null)`. */
        fun filterLabel(filterLabel: Optional<String>) = filterLabel(filterLabel.getOrNull())

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
         * Returns an immutable instance of [EmailThreadListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailThreadListParams =
            EmailThreadListParams(
                filterInboxId?.toImmutable(),
                filterLabel,
                pageAfter,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterInboxId?.let { put("filter[inbox_id]", it.joinToString(",")) }
                filterLabel?.let { put("filter[label]", it) }
                pageAfter?.let { put("page[after]", it) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailThreadListParams &&
            filterInboxId == other.filterInboxId &&
            filterLabel == other.filterLabel &&
            pageAfter == other.pageAfter &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterInboxId,
            filterLabel,
            pageAfter,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailThreadListParams{filterInboxId=$filterInboxId, filterLabel=$filterLabel, pageAfter=$pageAfter, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
