// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists events for a single message sorted oldest first by `occurred_at asc, id asc`. The legacy
 * `/v2/emails/{id}/events` GET route is a backward-compatible alias.
 */
class EmailMessageRetrieveEventsParams
private constructor(
    private val emailId: String?,
    private val pageCursor: String?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun emailId(): Optional<String> = Optional.ofNullable(emailId)

    /** Opaque URL-safe Base64 cursor returned by a previous list response. */
    fun pageCursor(): Optional<String> = Optional.ofNullable(pageCursor)

    /**
     * Number of results to return. Defaults to 25; maximum is 100. Invalid values are clamped to
     * the valid range.
     */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailMessageRetrieveEventsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [EmailMessageRetrieveEventsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailMessageRetrieveEventsParams]. */
    class Builder internal constructor() {

        private var emailId: String? = null
        private var pageCursor: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailMessageRetrieveEventsParams: EmailMessageRetrieveEventsParams) =
            apply {
                emailId = emailMessageRetrieveEventsParams.emailId
                pageCursor = emailMessageRetrieveEventsParams.pageCursor
                pageSize = emailMessageRetrieveEventsParams.pageSize
                additionalHeaders = emailMessageRetrieveEventsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    emailMessageRetrieveEventsParams.additionalQueryParams.toBuilder()
            }

        fun emailId(emailId: String?) = apply { this.emailId = emailId }

        /** Alias for calling [Builder.emailId] with `emailId.orElse(null)`. */
        fun emailId(emailId: Optional<String>) = emailId(emailId.getOrNull())

        /** Opaque URL-safe Base64 cursor returned by a previous list response. */
        fun pageCursor(pageCursor: String?) = apply { this.pageCursor = pageCursor }

        /** Alias for calling [Builder.pageCursor] with `pageCursor.orElse(null)`. */
        fun pageCursor(pageCursor: Optional<String>) = pageCursor(pageCursor.getOrNull())

        /**
         * Number of results to return. Defaults to 25; maximum is 100. Invalid values are clamped
         * to the valid range.
         */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [EmailMessageRetrieveEventsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailMessageRetrieveEventsParams =
            EmailMessageRetrieveEventsParams(
                emailId,
                pageCursor,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> emailId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                pageCursor?.let { put("page_cursor", it) }
                pageSize?.let { put("page_size", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailMessageRetrieveEventsParams &&
            emailId == other.emailId &&
            pageCursor == other.pageCursor &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(emailId, pageCursor, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmailMessageRetrieveEventsParams{emailId=$emailId, pageCursor=$pageCursor, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
