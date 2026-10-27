// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a paginated list of evaluator scenarios in your organization, optionally filtered by test
 * agent or tags.
 */
class ScenarioListParams
private constructor(
    private val agentId: Long?,
    private val assistantId: String?,
    private val page: Long?,
    private val pageSize: Long?,
    private val tags: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter scenarios belonging to the specified test agent. */
    fun agentId(): Optional<Long> = Optional.ofNullable(agentId)

    /** Filter scenarios belonging to the specified Telnyx assistant. */
    fun assistantId(): Optional<String> = Optional.ofNullable(assistantId)

    /** Page number (1-based). */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Number of results per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Filter scenarios by a comma-separated list of tags. */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ScenarioListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ScenarioListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioListParams]. */
    class Builder internal constructor() {

        private var agentId: Long? = null
        private var assistantId: String? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var tags: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scenarioListParams: ScenarioListParams) = apply {
            agentId = scenarioListParams.agentId
            assistantId = scenarioListParams.assistantId
            page = scenarioListParams.page
            pageSize = scenarioListParams.pageSize
            tags = scenarioListParams.tags
            additionalHeaders = scenarioListParams.additionalHeaders.toBuilder()
            additionalQueryParams = scenarioListParams.additionalQueryParams.toBuilder()
        }

        /** Filter scenarios belonging to the specified test agent. */
        fun agentId(agentId: Long?) = apply { this.agentId = agentId }

        /**
         * Alias for [Builder.agentId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun agentId(agentId: Long) = agentId(agentId as Long?)

        /** Alias for calling [Builder.agentId] with `agentId.orElse(null)`. */
        fun agentId(agentId: Optional<Long>) = agentId(agentId.getOrNull())

        /** Filter scenarios belonging to the specified Telnyx assistant. */
        fun assistantId(assistantId: String?) = apply { this.assistantId = assistantId }

        /** Alias for calling [Builder.assistantId] with `assistantId.orElse(null)`. */
        fun assistantId(assistantId: Optional<String>) = assistantId(assistantId.getOrNull())

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

        /** Filter scenarios by a comma-separated list of tags. */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

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
         * Returns an immutable instance of [ScenarioListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScenarioListParams =
            ScenarioListParams(
                agentId,
                assistantId,
                page,
                pageSize,
                tags,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                agentId?.let { put("agent_id", it.toString()) }
                assistantId?.let { put("assistant_id", it) }
                page?.let { put("page", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                tags?.let { put("tags", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioListParams &&
            agentId == other.agentId &&
            assistantId == other.assistantId &&
            page == other.page &&
            pageSize == other.pageSize &&
            tags == other.tags &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            agentId,
            assistantId,
            page,
            pageSize,
            tags,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ScenarioListParams{agentId=$agentId, assistantId=$assistantId, page=$page, pageSize=$pageSize, tags=$tags, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
