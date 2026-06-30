// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Fetch a cluster */
class ClusterRetrieveParams
private constructor(
    private val taskId: String?,
    private val showSubclusters: Boolean?,
    private val topNNodes: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun taskId(): Optional<String> = Optional.ofNullable(taskId)

    /** Whether or not to include subclusters and their nodes in the response. */
    fun showSubclusters(): Optional<Boolean> = Optional.ofNullable(showSubclusters)

    /**
     * The number of nodes in the cluster to return in the response. Nodes will be sorted by their
     * centrality within the cluster.
     */
    fun topNNodes(): Optional<Long> = Optional.ofNullable(topNNodes)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ClusterRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ClusterRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClusterRetrieveParams]. */
    class Builder internal constructor() {

        private var taskId: String? = null
        private var showSubclusters: Boolean? = null
        private var topNNodes: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(clusterRetrieveParams: ClusterRetrieveParams) = apply {
            taskId = clusterRetrieveParams.taskId
            showSubclusters = clusterRetrieveParams.showSubclusters
            topNNodes = clusterRetrieveParams.topNNodes
            additionalHeaders = clusterRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = clusterRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun taskId(taskId: String?) = apply { this.taskId = taskId }

        /** Alias for calling [Builder.taskId] with `taskId.orElse(null)`. */
        fun taskId(taskId: Optional<String>) = taskId(taskId.getOrNull())

        /** Whether or not to include subclusters and their nodes in the response. */
        fun showSubclusters(showSubclusters: Boolean?) = apply {
            this.showSubclusters = showSubclusters
        }

        /**
         * Alias for [Builder.showSubclusters].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun showSubclusters(showSubclusters: Boolean) = showSubclusters(showSubclusters as Boolean?)

        /** Alias for calling [Builder.showSubclusters] with `showSubclusters.orElse(null)`. */
        fun showSubclusters(showSubclusters: Optional<Boolean>) =
            showSubclusters(showSubclusters.getOrNull())

        /**
         * The number of nodes in the cluster to return in the response. Nodes will be sorted by
         * their centrality within the cluster.
         */
        fun topNNodes(topNNodes: Long?) = apply { this.topNNodes = topNNodes }

        /**
         * Alias for [Builder.topNNodes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topNNodes(topNNodes: Long) = topNNodes(topNNodes as Long?)

        /** Alias for calling [Builder.topNNodes] with `topNNodes.orElse(null)`. */
        fun topNNodes(topNNodes: Optional<Long>) = topNNodes(topNNodes.getOrNull())

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
         * Returns an immutable instance of [ClusterRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClusterRetrieveParams =
            ClusterRetrieveParams(
                taskId,
                showSubclusters,
                topNNodes,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> taskId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                showSubclusters?.let { put("show_subclusters", it.toString()) }
                topNNodes?.let { put("top_n_nodes", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClusterRetrieveParams &&
            taskId == other.taskId &&
            showSubclusters == other.showSubclusters &&
            topNNodes == other.topNNodes &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(taskId, showSubclusters, topNNodes, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ClusterRetrieveParams{taskId=$taskId, showSubclusters=$showSubclusters, topNNodes=$topNNodes, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
