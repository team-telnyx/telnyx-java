// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists the requests the instance served with its keys, newest first, one page at a time. The
 * window defaults to the last 24 hours and spans at most 31 days. A row appears a few seconds after
 * its request. The instance must be `ready`; otherwise the request answers `409`.
 */
class AgentGatewayRetrieveSpendLogsParams
private constructor(
    private val instanceId: String?,
    private val end: OffsetDateTime?,
    private val keyId: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val start: OffsetDateTime?,
    private val teamId: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun instanceId(): Optional<String> = Optional.ofNullable(instanceId)

    /** The window's end, an RFC 3339 timestamp with an offset. Defaults to now. */
    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    /** Only the requests made with this key. */
    fun keyId(): Optional<String> = Optional.ofNullable(keyId)

    /** The page to return, counting from 1. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Results per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * The window's start, an RFC 3339 timestamp with an offset. Defaults to 24 hours before `end`.
     */
    fun start(): Optional<OffsetDateTime> = Optional.ofNullable(start)

    /** Only the requests made with this team's keys. */
    fun teamId(): Optional<String> = Optional.ofNullable(teamId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AgentGatewayRetrieveSpendLogsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AgentGatewayRetrieveSpendLogsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayRetrieveSpendLogsParams]. */
    class Builder internal constructor() {

        private var instanceId: String? = null
        private var end: OffsetDateTime? = null
        private var keyId: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var start: OffsetDateTime? = null
        private var teamId: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            agentGatewayRetrieveSpendLogsParams: AgentGatewayRetrieveSpendLogsParams
        ) = apply {
            instanceId = agentGatewayRetrieveSpendLogsParams.instanceId
            end = agentGatewayRetrieveSpendLogsParams.end
            keyId = agentGatewayRetrieveSpendLogsParams.keyId
            pageNumber = agentGatewayRetrieveSpendLogsParams.pageNumber
            pageSize = agentGatewayRetrieveSpendLogsParams.pageSize
            start = agentGatewayRetrieveSpendLogsParams.start
            teamId = agentGatewayRetrieveSpendLogsParams.teamId
            additionalHeaders = agentGatewayRetrieveSpendLogsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                agentGatewayRetrieveSpendLogsParams.additionalQueryParams.toBuilder()
        }

        fun instanceId(instanceId: String?) = apply { this.instanceId = instanceId }

        /** Alias for calling [Builder.instanceId] with `instanceId.orElse(null)`. */
        fun instanceId(instanceId: Optional<String>) = instanceId(instanceId.getOrNull())

        /** The window's end, an RFC 3339 timestamp with an offset. Defaults to now. */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /** Alias for calling [Builder.end] with `end.orElse(null)`. */
        fun end(end: Optional<OffsetDateTime>) = end(end.getOrNull())

        /** Only the requests made with this key. */
        fun keyId(keyId: String?) = apply { this.keyId = keyId }

        /** Alias for calling [Builder.keyId] with `keyId.orElse(null)`. */
        fun keyId(keyId: Optional<String>) = keyId(keyId.getOrNull())

        /** The page to return, counting from 1. */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** Results per page. */
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
         * The window's start, an RFC 3339 timestamp with an offset. Defaults to 24 hours before
         * `end`.
         */
        fun start(start: OffsetDateTime?) = apply { this.start = start }

        /** Alias for calling [Builder.start] with `start.orElse(null)`. */
        fun start(start: Optional<OffsetDateTime>) = start(start.getOrNull())

        /** Only the requests made with this team's keys. */
        fun teamId(teamId: String?) = apply { this.teamId = teamId }

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

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
         * Returns an immutable instance of [AgentGatewayRetrieveSpendLogsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentGatewayRetrieveSpendLogsParams =
            AgentGatewayRetrieveSpendLogsParams(
                instanceId,
                end,
                keyId,
                pageNumber,
                pageSize,
                start,
                teamId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instanceId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                end?.let { put("end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                keyId?.let { put("key_id", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                start?.let { put("start", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                teamId?.let { put("team_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayRetrieveSpendLogsParams &&
            instanceId == other.instanceId &&
            end == other.end &&
            keyId == other.keyId &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            start == other.start &&
            teamId == other.teamId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            instanceId,
            end,
            keyId,
            pageNumber,
            pageSize,
            start,
            teamId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AgentGatewayRetrieveSpendLogsParams{instanceId=$instanceId, end=$end, keyId=$keyId, pageNumber=$pageNumber, pageSize=$pageSize, start=$start, teamId=$teamId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
