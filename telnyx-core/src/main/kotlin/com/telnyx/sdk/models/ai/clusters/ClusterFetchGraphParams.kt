// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Fetch a cluster visualization */
class ClusterFetchGraphParams
private constructor(
    private val taskId: String?,
    private val clusterId: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun taskId(): Optional<String> = Optional.ofNullable(taskId)

    fun clusterId(): Optional<Long> = Optional.ofNullable(clusterId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ClusterFetchGraphParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ClusterFetchGraphParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClusterFetchGraphParams]. */
    class Builder internal constructor() {

        private var taskId: String? = null
        private var clusterId: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(clusterFetchGraphParams: ClusterFetchGraphParams) = apply {
            taskId = clusterFetchGraphParams.taskId
            clusterId = clusterFetchGraphParams.clusterId
            additionalHeaders = clusterFetchGraphParams.additionalHeaders.toBuilder()
            additionalQueryParams = clusterFetchGraphParams.additionalQueryParams.toBuilder()
        }

        fun taskId(taskId: String?) = apply { this.taskId = taskId }

        /** Alias for calling [Builder.taskId] with `taskId.orElse(null)`. */
        fun taskId(taskId: Optional<String>) = taskId(taskId.getOrNull())

        fun clusterId(clusterId: Long?) = apply { this.clusterId = clusterId }

        /**
         * Alias for [Builder.clusterId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun clusterId(clusterId: Long) = clusterId(clusterId as Long?)

        /** Alias for calling [Builder.clusterId] with `clusterId.orElse(null)`. */
        fun clusterId(clusterId: Optional<Long>) = clusterId(clusterId.getOrNull())

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
         * Returns an immutable instance of [ClusterFetchGraphParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClusterFetchGraphParams =
            ClusterFetchGraphParams(
                taskId,
                clusterId,
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
                clusterId?.let { put("cluster_id", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClusterFetchGraphParams &&
            taskId == other.taskId &&
            clusterId == other.clusterId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(taskId, clusterId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ClusterFetchGraphParams{taskId=$taskId, clusterId=$clusterId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
