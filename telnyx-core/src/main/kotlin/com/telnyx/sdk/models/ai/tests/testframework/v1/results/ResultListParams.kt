// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.results

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a paginated list of test run batches in your organization, optionally filtered by test
 * agent, search text, or scenarios.
 */
class ResultListParams
private constructor(
    private val agentId: Long?,
    private val page: Long?,
    private val pageSize: Long?,
    private val scenarios: String?,
    private val search: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter results belonging to the specified test agent. */
    fun agentId(): Optional<Long> = Optional.ofNullable(agentId)

    /** Page number (1-based). */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Number of results per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Filter results by a comma-separated list of scenario IDs. */
    fun scenarios(): Optional<String> = Optional.ofNullable(scenarios)

    /** Filter results by a search string. */
    fun search(): Optional<String> = Optional.ofNullable(search)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ResultListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ResultListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResultListParams]. */
    class Builder internal constructor() {

        private var agentId: Long? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var scenarios: String? = null
        private var search: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(resultListParams: ResultListParams) = apply {
            agentId = resultListParams.agentId
            page = resultListParams.page
            pageSize = resultListParams.pageSize
            scenarios = resultListParams.scenarios
            search = resultListParams.search
            additionalHeaders = resultListParams.additionalHeaders.toBuilder()
            additionalQueryParams = resultListParams.additionalQueryParams.toBuilder()
        }

        /** Filter results belonging to the specified test agent. */
        fun agentId(agentId: Long?) = apply { this.agentId = agentId }

        /**
         * Alias for [Builder.agentId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun agentId(agentId: Long) = agentId(agentId as Long?)

        /** Alias for calling [Builder.agentId] with `agentId.orElse(null)`. */
        fun agentId(agentId: Optional<Long>) = agentId(agentId.getOrNull())

        /** Page number (1-based). */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /** Number of results per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Filter results by a comma-separated list of scenario IDs. */
        fun scenarios(scenarios: String?) = apply { this.scenarios = scenarios }

        /** Alias for calling [Builder.scenarios] with `scenarios.orElse(null)`. */
        fun scenarios(scenarios: Optional<String>) = scenarios(scenarios.getOrNull())

        /** Filter results by a search string. */
        fun search(search: String?) = apply { this.search = search }

        /** Alias for calling [Builder.search] with `search.orElse(null)`. */
        fun search(search: Optional<String>) = search(search.getOrNull())

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
         * Returns an immutable instance of [ResultListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ResultListParams =
            ResultListParams(
                agentId,
                page,
                pageSize,
                scenarios,
                search,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                agentId?.let { put("agent_id", it.toString()) }
                page?.let { put("page", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                scenarios?.let { put("scenarios", it) }
                search?.let { put("search", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResultListParams &&
            agentId == other.agentId &&
            page == other.page &&
            pageSize == other.pageSize &&
            scenarios == other.scenarios &&
            search == other.search &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            agentId,
            page,
            pageSize,
            scenarios,
            search,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ResultListParams{agentId=$agentId, page=$page, pageSize=$pageSize, scenarios=$scenarios, search=$search, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
