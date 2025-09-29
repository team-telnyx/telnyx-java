// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.versions

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves a specific version of an assistant by assistant_id and version_id */
class VersionRetrieveParams
private constructor(
    private val assistantId: String,
    private val versionId: String?,
    private val includeMcpServers: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): String = assistantId

    fun versionId(): Optional<String> = Optional.ofNullable(versionId)

    fun includeMcpServers(): Optional<Boolean> = Optional.ofNullable(includeMcpServers)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VersionRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VersionRetrieveParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var versionId: String? = null
        private var includeMcpServers: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(versionRetrieveParams: VersionRetrieveParams) = apply {
            assistantId = versionRetrieveParams.assistantId
            versionId = versionRetrieveParams.versionId
            includeMcpServers = versionRetrieveParams.includeMcpServers
            additionalHeaders = versionRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = versionRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String) = apply { this.assistantId = assistantId }

        fun versionId(versionId: String?) = apply { this.versionId = versionId }

        /** Alias for calling [Builder.versionId] with `versionId.orElse(null)`. */
        fun versionId(versionId: Optional<String>) = versionId(versionId.getOrNull())

        fun includeMcpServers(includeMcpServers: Boolean?) = apply {
            this.includeMcpServers = includeMcpServers
        }

        /**
         * Alias for [Builder.includeMcpServers].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeMcpServers(includeMcpServers: Boolean) =
            includeMcpServers(includeMcpServers as Boolean?)

        /** Alias for calling [Builder.includeMcpServers] with `includeMcpServers.orElse(null)`. */
        fun includeMcpServers(includeMcpServers: Optional<Boolean>) =
            includeMcpServers(includeMcpServers.getOrNull())

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
         * Returns an immutable instance of [VersionRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VersionRetrieveParams =
            VersionRetrieveParams(
                checkRequired("assistantId", assistantId),
                versionId,
                includeMcpServers,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId
            1 -> versionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeMcpServers?.let { put("include_mcp_servers", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionRetrieveParams &&
            assistantId == other.assistantId &&
            versionId == other.versionId &&
            includeMcpServers == other.includeMcpServers &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            assistantId,
            versionId,
            includeMcpServers,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "VersionRetrieveParams{assistantId=$assistantId, versionId=$versionId, includeMcpServers=$includeMcpServers, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
