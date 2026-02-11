// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.knowledgebases

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a specific knowledge base by ID */
class KnowledgeBaseGetKnowledgeBaseParams
private constructor(
    private val missionId: String,
    private val knowledgeBaseId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun missionId(): String = missionId

    fun knowledgeBaseId(): Optional<String> = Optional.ofNullable(knowledgeBaseId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [KnowledgeBaseGetKnowledgeBaseParams].
         *
         * The following fields are required:
         * ```java
         * .missionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [KnowledgeBaseGetKnowledgeBaseParams]. */
    class Builder internal constructor() {

        private var missionId: String? = null
        private var knowledgeBaseId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            knowledgeBaseGetKnowledgeBaseParams: KnowledgeBaseGetKnowledgeBaseParams
        ) = apply {
            missionId = knowledgeBaseGetKnowledgeBaseParams.missionId
            knowledgeBaseId = knowledgeBaseGetKnowledgeBaseParams.knowledgeBaseId
            additionalHeaders = knowledgeBaseGetKnowledgeBaseParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                knowledgeBaseGetKnowledgeBaseParams.additionalQueryParams.toBuilder()
        }

        fun missionId(missionId: String) = apply { this.missionId = missionId }

        fun knowledgeBaseId(knowledgeBaseId: String?) = apply {
            this.knowledgeBaseId = knowledgeBaseId
        }

        /** Alias for calling [Builder.knowledgeBaseId] with `knowledgeBaseId.orElse(null)`. */
        fun knowledgeBaseId(knowledgeBaseId: Optional<String>) =
            knowledgeBaseId(knowledgeBaseId.getOrNull())

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
         * Returns an immutable instance of [KnowledgeBaseGetKnowledgeBaseParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .missionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): KnowledgeBaseGetKnowledgeBaseParams =
            KnowledgeBaseGetKnowledgeBaseParams(
                checkRequired("missionId", missionId),
                knowledgeBaseId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> missionId
            1 -> knowledgeBaseId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KnowledgeBaseGetKnowledgeBaseParams &&
            missionId == other.missionId &&
            knowledgeBaseId == other.knowledgeBaseId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(missionId, knowledgeBaseId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "KnowledgeBaseGetKnowledgeBaseParams{missionId=$missionId, knowledgeBaseId=$knowledgeBaseId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
