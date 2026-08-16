// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns transcript segments ordered by ascending `seq`. Default `limit` is 100 and maximum is
 * 1,000. Continue with `after=meta.next_after`. A long-poll timeout returns 200 with empty `data`
 * and `meta.next_after: null`; retain the cursor supplied to that request because null is not a
 * replacement cursor.
 */
class MeetingSessionRetrieveTranscriptParams
private constructor(
    private val id: String?,
    private val after: Long?,
    private val limit: Long?,
    private val waitSeconds: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Return results with a cursor position after this value. */
    fun after(): Optional<Long> = Optional.ofNullable(after)

    /** Maximum number of results to return per page. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * Long-poll duration in seconds. The server holds the connection open for up to this many
     * seconds, waiting for new or updated results before returning an empty response. Set to 0 for
     * an immediate response.
     */
    fun waitSeconds(): Optional<Long> = Optional.ofNullable(waitSeconds)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MeetingSessionRetrieveTranscriptParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [MeetingSessionRetrieveTranscriptParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingSessionRetrieveTranscriptParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var after: Long? = null
        private var limit: Long? = null
        private var waitSeconds: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            meetingSessionRetrieveTranscriptParams: MeetingSessionRetrieveTranscriptParams
        ) = apply {
            id = meetingSessionRetrieveTranscriptParams.id
            after = meetingSessionRetrieveTranscriptParams.after
            limit = meetingSessionRetrieveTranscriptParams.limit
            waitSeconds = meetingSessionRetrieveTranscriptParams.waitSeconds
            additionalHeaders = meetingSessionRetrieveTranscriptParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                meetingSessionRetrieveTranscriptParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Return results with a cursor position after this value. */
        fun after(after: Long?) = apply { this.after = after }

        /**
         * Alias for [Builder.after].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun after(after: Long) = after(after as Long?)

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<Long>) = after(after.getOrNull())

        /** Maximum number of results to return per page. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /**
         * Long-poll duration in seconds. The server holds the connection open for up to this many
         * seconds, waiting for new or updated results before returning an empty response. Set to 0
         * for an immediate response.
         */
        fun waitSeconds(waitSeconds: Long?) = apply { this.waitSeconds = waitSeconds }

        /**
         * Alias for [Builder.waitSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun waitSeconds(waitSeconds: Long) = waitSeconds(waitSeconds as Long?)

        /** Alias for calling [Builder.waitSeconds] with `waitSeconds.orElse(null)`. */
        fun waitSeconds(waitSeconds: Optional<Long>) = waitSeconds(waitSeconds.getOrNull())

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
         * Returns an immutable instance of [MeetingSessionRetrieveTranscriptParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MeetingSessionRetrieveTranscriptParams =
            MeetingSessionRetrieveTranscriptParams(
                id,
                after,
                limit,
                waitSeconds,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                waitSeconds?.let { put("wait_seconds", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingSessionRetrieveTranscriptParams &&
            id == other.id &&
            after == other.after &&
            limit == other.limit &&
            waitSeconds == other.waitSeconds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, after, limit, waitSeconds, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MeetingSessionRetrieveTranscriptParams{id=$id, after=$after, limit=$limit, waitSeconds=$waitSeconds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
