// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.usage

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Durable, replayable, content-free usage export for customer pipelines. Requires the dedicated
 * llm_token_gateway.usage_export.read V2 action; spend.read and usage.read do not grant it. Records
 * are inference.request (one per immutable ledger revision; a correction adds a new id with
 * supersedes, keep the highest revision per request_id) and guardrail.evaluation (one per guardrail
 * event, including blocked prompts with no inference record; correlate on request_id). Delivery is
 * at least once in commit order: deduplicate on id. Records appear after settlement and after every
 * older database transaction has finished (meta.horizon_lag_seconds); keep polling with
 * next_cursor, which is always returned and is reusable after has_more is false. After a logical
 * database restore, restart from start_time and deduplicate on id; a cursor from before it may
 * return 409 cursor_expired (no Retry-After). Retention promise 30 days. No prompts, responses,
 * provider credentials, supplier or customer rates. Gateway reference/enforcement usage, not
 * invoice truth or BYOK provider charges.
 */
class UsageRetrieveExportParams
private constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val startTime: OffsetDateTime?,
    private val types: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Opaque next_cursor from a previous page; not combinable with start_time. Bound to the
     * requested types; the account always comes from the credential.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * First page only: RFC 3339 with offset, at most 30 days ago and not in the future; default
     * now - 24h.
     */
    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    /** Comma-separated subset of inference.request,guardrail.evaluation; default both. */
    fun types(): Optional<String> = Optional.ofNullable(types)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UsageRetrieveExportParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [UsageRetrieveExportParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageRetrieveExportParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var limit: Long? = null
        private var startTime: OffsetDateTime? = null
        private var types: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageRetrieveExportParams: UsageRetrieveExportParams) = apply {
            cursor = usageRetrieveExportParams.cursor
            limit = usageRetrieveExportParams.limit
            startTime = usageRetrieveExportParams.startTime
            types = usageRetrieveExportParams.types
            additionalHeaders = usageRetrieveExportParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageRetrieveExportParams.additionalQueryParams.toBuilder()
        }

        /**
         * Opaque next_cursor from a previous page; not combinable with start_time. Bound to the
         * requested types; the account always comes from the credential.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

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
         * First page only: RFC 3339 with offset, at most 30 days ago and not in the future; default
         * now - 24h.
         */
        fun startTime(startTime: OffsetDateTime?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /** Comma-separated subset of inference.request,guardrail.evaluation; default both. */
        fun types(types: String?) = apply { this.types = types }

        /** Alias for calling [Builder.types] with `types.orElse(null)`. */
        fun types(types: Optional<String>) = types(types.getOrNull())

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
         * Returns an immutable instance of [UsageRetrieveExportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageRetrieveExportParams =
            UsageRetrieveExportParams(
                cursor,
                limit,
                startTime,
                types,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                startTime?.let {
                    put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                types?.let { put("types", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageRetrieveExportParams &&
            cursor == other.cursor &&
            limit == other.limit &&
            startTime == other.startTime &&
            types == other.types &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cursor, limit, startTime, types, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UsageRetrieveExportParams{cursor=$cursor, limit=$limit, startTime=$startTime, types=$types, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
