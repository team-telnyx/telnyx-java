// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.auditevents

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.AuditEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AuditEventServiceAsync.list */
class AuditEventListPageAsync
private constructor(
    private val service: AuditEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AuditEventListParams,
    private val response: AuditEventListPageResponse,
) : PageAsync<AuditEventListResponse> {

    /**
     * Delegates to [AuditEventListPageResponse], but gracefully handles missing data.
     *
     * @see AuditEventListPageResponse.data
     */
    fun data(): List<AuditEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AuditEventListPageResponse], but gracefully handles missing data.
     *
     * @see AuditEventListPageResponse.meta
     */
    fun meta(): Optional<AuditEventListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<AuditEventListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AuditEventListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AuditEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AuditEventListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AuditEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): AuditEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuditEventListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: AuditEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AuditEventListParams? = null
        private var response: AuditEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(auditEventListPageAsync: AuditEventListPageAsync) = apply {
            service = auditEventListPageAsync.service
            streamHandlerExecutor = auditEventListPageAsync.streamHandlerExecutor
            params = auditEventListPageAsync.params
            response = auditEventListPageAsync.response
        }

        fun service(service: AuditEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AuditEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AuditEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AuditEventListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuditEventListPageAsync =
            AuditEventListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditEventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AuditEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
