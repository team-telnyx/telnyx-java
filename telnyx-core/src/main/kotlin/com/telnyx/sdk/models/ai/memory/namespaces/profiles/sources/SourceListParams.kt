// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Everything a profile has stored and extracts memories from: each ingested session, and each
 * remembered fact, which has no session. Content is not listed; read one source for it. A source
 * whose ingest is still queued is not here yet. Re-ingesting a session moves it to the front, so a
 * listing paged while sessions are written can repeat or miss one at a page boundary. A
 * `session_id` narrows the listing to the source that session was stored as: one source or none,
 * and none -- an empty page, not a 404 -- for a session never ingested, still queued, or another
 * profile's.
 */
class SourceListParams
private constructor(
    private val namespace: String,
    private val profileId: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sessionId: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun namespace(): String = namespace

    fun profileId(): Optional<String> = Optional.ofNullable(profileId)

    /**
     * The page to return, counting from 1. Bounded in depth: (page[number] - 1) * page[size] may be
     * at most 10000.
     */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** How many results a page holds. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * An ingested session, by the `session_id` it was ingested with. Narrows the request to the
     * source that session was stored as.
     */
    fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SourceListParams].
         *
         * The following fields are required:
         * ```java
         * .namespace()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SourceListParams]. */
    class Builder internal constructor() {

        private var namespace: String? = null
        private var profileId: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sessionId: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sourceListParams: SourceListParams) = apply {
            namespace = sourceListParams.namespace
            profileId = sourceListParams.profileId
            pageNumber = sourceListParams.pageNumber
            pageSize = sourceListParams.pageSize
            sessionId = sourceListParams.sessionId
            additionalHeaders = sourceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = sourceListParams.additionalQueryParams.toBuilder()
        }

        fun namespace(namespace: String) = apply { this.namespace = namespace }

        fun profileId(profileId: String?) = apply { this.profileId = profileId }

        /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
        fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

        /**
         * The page to return, counting from 1. Bounded in depth: (page[number] - 1) * page[size]
         * may be at most 10000.
         */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** How many results a page holds. */
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
         * An ingested session, by the `session_id` it was ingested with. Narrows the request to the
         * source that session was stored as.
         */
        fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

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
         * Returns an immutable instance of [SourceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .namespace()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SourceListParams =
            SourceListParams(
                checkRequired("namespace", namespace),
                profileId,
                pageNumber,
                pageSize,
                sessionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> namespace
            1 -> profileId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sessionId?.let { put("session_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SourceListParams &&
            namespace == other.namespace &&
            profileId == other.profileId &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sessionId == other.sessionId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            namespace,
            profileId,
            pageNumber,
            pageSize,
            sessionId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SourceListParams{namespace=$namespace, profileId=$profileId, pageNumber=$pageNumber, pageSize=$pageSize, sessionId=$sessionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
