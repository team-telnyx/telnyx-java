// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns the scheduled test jobs in your organization, optionally filtered by test agent. A
 * scheduled job runs selected scenarios on a cron expression.
 */
class CronJobRetrieveCronJobsParams
private constructor(
    private val agentId: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter jobs belonging to the specified test agent. */
    fun agentId(): Optional<Long> = Optional.ofNullable(agentId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CronJobRetrieveCronJobsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CronJobRetrieveCronJobsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CronJobRetrieveCronJobsParams]. */
    class Builder internal constructor() {

        private var agentId: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cronJobRetrieveCronJobsParams: CronJobRetrieveCronJobsParams) = apply {
            agentId = cronJobRetrieveCronJobsParams.agentId
            additionalHeaders = cronJobRetrieveCronJobsParams.additionalHeaders.toBuilder()
            additionalQueryParams = cronJobRetrieveCronJobsParams.additionalQueryParams.toBuilder()
        }

        /** Filter jobs belonging to the specified test agent. */
        fun agentId(agentId: Long?) = apply { this.agentId = agentId }

        /**
         * Alias for [Builder.agentId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun agentId(agentId: Long) = agentId(agentId as Long?)

        /** Alias for calling [Builder.agentId] with `agentId.orElse(null)`. */
        fun agentId(agentId: Optional<Long>) = agentId(agentId.getOrNull())

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
         * Returns an immutable instance of [CronJobRetrieveCronJobsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CronJobRetrieveCronJobsParams =
            CronJobRetrieveCronJobsParams(
                agentId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                agentId?.let { put("agent_id", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CronJobRetrieveCronJobsParams &&
            agentId == other.agentId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(agentId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CronJobRetrieveCronJobsParams{agentId=$agentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
