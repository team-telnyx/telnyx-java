// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * One memory by its id, as `recall` and the listing return it, together with what it came from. A
 * fact names its `source_id`: read it with `GET .../sources/{source_id}` to see what was stored. A
 * memory derived from other memories names them in `derived_from` instead; read each of those to
 * reach its source.
 */
class MemoryRetrieveParams
private constructor(
    private val namespace: String,
    private val profileId: String,
    private val memoryId: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The namespace. `default` exists for every organization. */
    fun namespace(): String = namespace

    /** The profile: your identifier for the user, caller or agent this memory is about. */
    fun profileId(): String = profileId

    /** A memory's id, as `recall` and the listing return it. */
    fun memoryId(): Optional<String> = Optional.ofNullable(memoryId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MemoryRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .namespace()
         * .profileId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemoryRetrieveParams]. */
    class Builder internal constructor() {

        private var namespace: String? = null
        private var profileId: String? = null
        private var memoryId: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(memoryRetrieveParams: MemoryRetrieveParams) = apply {
            namespace = memoryRetrieveParams.namespace
            profileId = memoryRetrieveParams.profileId
            memoryId = memoryRetrieveParams.memoryId
            additionalHeaders = memoryRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = memoryRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** The namespace. `default` exists for every organization. */
        fun namespace(namespace: String) = apply { this.namespace = namespace }

        /** The profile: your identifier for the user, caller or agent this memory is about. */
        fun profileId(profileId: String) = apply { this.profileId = profileId }

        /** A memory's id, as `recall` and the listing return it. */
        fun memoryId(memoryId: String?) = apply { this.memoryId = memoryId }

        /** Alias for calling [Builder.memoryId] with `memoryId.orElse(null)`. */
        fun memoryId(memoryId: Optional<String>) = memoryId(memoryId.getOrNull())

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
         * Returns an immutable instance of [MemoryRetrieveParams].
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
        fun build(): MemoryRetrieveParams =
            MemoryRetrieveParams(
                checkRequired("namespace", namespace),
                checkRequired("profileId", profileId),
                memoryId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> namespace
            1 -> profileId
            2 -> memoryId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemoryRetrieveParams &&
            namespace == other.namespace &&
            profileId == other.profileId &&
            memoryId == other.memoryId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(namespace, profileId, memoryId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MemoryRetrieveParams{namespace=$namespace, profileId=$profileId, memoryId=$memoryId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
