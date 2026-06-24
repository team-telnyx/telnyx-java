// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.enterprises.NumberReputationPaginationMeta
import com.telnyx.sdk.services.async.enterprises.reputation.RemediationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RemediationServiceAsync.list */
class RemediationListPageAsync
private constructor(
    private val service: RemediationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RemediationListParams,
    private val response: RemediationListPageResponse,
) : PageAsync<RemediationListResponse> {

    /**
     * Delegates to [RemediationListPageResponse], but gracefully handles missing data.
     *
     * @see RemediationListPageResponse.data
     */
    fun data(): List<RemediationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RemediationListPageResponse], but gracefully handles missing data.
     *
     * @see RemediationListPageResponse.meta
     */
    fun meta(): Optional<NumberReputationPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RemediationListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RemediationListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RemediationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RemediationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RemediationListParams = params

    /** The response that this page was parsed from. */
    fun response(): RemediationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RemediationListPageAsync].
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

    /** A builder for [RemediationListPageAsync]. */
    class Builder internal constructor() {

        private var service: RemediationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RemediationListParams? = null
        private var response: RemediationListPageResponse? = null

        @JvmSynthetic
        internal fun from(remediationListPageAsync: RemediationListPageAsync) = apply {
            service = remediationListPageAsync.service
            streamHandlerExecutor = remediationListPageAsync.streamHandlerExecutor
            params = remediationListPageAsync.params
            response = remediationListPageAsync.response
        }

        fun service(service: RemediationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RemediationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RemediationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RemediationListPageAsync].
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
        fun build(): RemediationListPageAsync =
            RemediationListPageAsync(
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

        return other is RemediationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RemediationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
