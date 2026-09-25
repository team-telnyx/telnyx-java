// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * One source and its content, as it was stored: an ingested session's payload or a remembered fact.
 * A source whose ingest is still queued answers 404 until it has been stored.
 */
class SourceRetrieveParams
private constructor(
    private val namespace: String,
    private val profileId: String,
    private val sourceId: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The namespace. `default` exists for every organization. */
    fun namespace(): String = namespace

    /** The profile: your identifier for the user, caller or agent this memory is about. */
    fun profileId(): String = profileId

    /**
     * Identifies one source within its profile: an ingested session, or one remembered fact.
     * Returned by `ingest` and `remember` when the write is accepted. Re-ingesting a session keeps
     * its source id.
     */
    fun sourceId(): Optional<String> = Optional.ofNullable(sourceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SourceRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .namespace()
         * .profileId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SourceRetrieveParams]. */
    class Builder internal constructor() {

        private var namespace: String? = null
        private var profileId: String? = null
        private var sourceId: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sourceRetrieveParams: SourceRetrieveParams) = apply {
            namespace = sourceRetrieveParams.namespace
            profileId = sourceRetrieveParams.profileId
            sourceId = sourceRetrieveParams.sourceId
            additionalHeaders = sourceRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = sourceRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** The namespace. `default` exists for every organization. */
        fun namespace(namespace: String) = apply { this.namespace = namespace }

        /** The profile: your identifier for the user, caller or agent this memory is about. */
        fun profileId(profileId: String) = apply { this.profileId = profileId }

        /**
         * Identifies one source within its profile: an ingested session, or one remembered fact.
         * Returned by `ingest` and `remember` when the write is accepted. Re-ingesting a session
         * keeps its source id.
         */
        fun sourceId(sourceId: String?) = apply { this.sourceId = sourceId }

        /** Alias for calling [Builder.sourceId] with `sourceId.orElse(null)`. */
        fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.getOrNull())

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
         * Returns an immutable instance of [SourceRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .namespace()
         * .profileId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SourceRetrieveParams =
            SourceRetrieveParams(
                checkRequired("namespace", namespace),
                checkRequired("profileId", profileId),
                sourceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> namespace
            1 -> profileId
            2 -> sourceId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SourceRetrieveParams &&
            namespace == other.namespace &&
            profileId == other.profileId &&
            sourceId == other.sourceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(namespace, profileId, sourceId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SourceRetrieveParams{namespace=$namespace, profileId=$profileId, sourceId=$sourceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
