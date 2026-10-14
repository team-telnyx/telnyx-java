// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List gateway token keys within the authenticated Telnyx account. Foreign and unknown resource IDs
 * return the same 404 response.
 */
class TokenKeyListParams
private constructor(
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val pageSnapshot: String?,
    private val tokenGroupId: String?,
    private val tokenUserId: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Required after page 1; account/filter-bound 15-minute stable snapshot; expired/mismatch 409.
     */
    fun pageSnapshot(): Optional<String> = Optional.ofNullable(pageSnapshot)

    fun tokenGroupId(): Optional<String> = Optional.ofNullable(tokenGroupId)

    fun tokenUserId(): Optional<String> = Optional.ofNullable(tokenUserId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TokenKeyListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TokenKeyListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenKeyListParams]. */
    class Builder internal constructor() {

        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var pageSnapshot: String? = null
        private var tokenGroupId: String? = null
        private var tokenUserId: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenKeyListParams: TokenKeyListParams) = apply {
            pageNumber = tokenKeyListParams.pageNumber
            pageSize = tokenKeyListParams.pageSize
            pageSnapshot = tokenKeyListParams.pageSnapshot
            tokenGroupId = tokenKeyListParams.tokenGroupId
            tokenUserId = tokenKeyListParams.tokenUserId
            additionalHeaders = tokenKeyListParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenKeyListParams.additionalQueryParams.toBuilder()
        }

        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

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
         * Required after page 1; account/filter-bound 15-minute stable snapshot;
         * expired/mismatch 409.
         */
        fun pageSnapshot(pageSnapshot: String?) = apply { this.pageSnapshot = pageSnapshot }

        /** Alias for calling [Builder.pageSnapshot] with `pageSnapshot.orElse(null)`. */
        fun pageSnapshot(pageSnapshot: Optional<String>) = pageSnapshot(pageSnapshot.getOrNull())

        fun tokenGroupId(tokenGroupId: String?) = apply { this.tokenGroupId = tokenGroupId }

        /** Alias for calling [Builder.tokenGroupId] with `tokenGroupId.orElse(null)`. */
        fun tokenGroupId(tokenGroupId: Optional<String>) = tokenGroupId(tokenGroupId.getOrNull())

        fun tokenUserId(tokenUserId: String?) = apply { this.tokenUserId = tokenUserId }

        /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
        fun tokenUserId(tokenUserId: Optional<String>) = tokenUserId(tokenUserId.getOrNull())

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
         * Returns an immutable instance of [TokenKeyListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TokenKeyListParams =
            TokenKeyListParams(
                pageNumber,
                pageSize,
                pageSnapshot,
                tokenGroupId,
                tokenUserId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                pageSnapshot?.let { put("page[snapshot]", it) }
                tokenGroupId?.let { put("token_group_id", it) }
                tokenUserId?.let { put("token_user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenKeyListParams &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            pageSnapshot == other.pageSnapshot &&
            tokenGroupId == other.tokenGroupId &&
            tokenUserId == other.tokenUserId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            pageNumber,
            pageSize,
            pageSnapshot,
            tokenGroupId,
            tokenUserId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TokenKeyListParams{pageNumber=$pageNumber, pageSize=$pageSize, pageSnapshot=$pageSnapshot, tokenGroupId=$tokenGroupId, tokenUserId=$tokenUserId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
