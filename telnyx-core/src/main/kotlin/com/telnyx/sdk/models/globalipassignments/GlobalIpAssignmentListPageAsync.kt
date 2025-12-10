// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.GlobalIpAssignmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see GlobalIpAssignmentServiceAsync.list */
class GlobalIpAssignmentListPageAsync
private constructor(
    private val service: GlobalIpAssignmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GlobalIpAssignmentListParams,
    private val response: GlobalIpAssignmentListPageResponse,
) : PageAsync<GlobalIpAssignment> {

    /**
     * Delegates to [GlobalIpAssignmentListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpAssignmentListPageResponse.data
     */
    fun data(): List<GlobalIpAssignment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [GlobalIpAssignmentListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpAssignmentListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<GlobalIpAssignment> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount =
            meta()
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): GlobalIpAssignmentListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<GlobalIpAssignmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GlobalIpAssignment> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GlobalIpAssignmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): GlobalIpAssignmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [GlobalIpAssignmentListPageAsync].
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

    /** A builder for [GlobalIpAssignmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: GlobalIpAssignmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GlobalIpAssignmentListParams? = null
        private var response: GlobalIpAssignmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(globalIpAssignmentListPageAsync: GlobalIpAssignmentListPageAsync) =
            apply {
                service = globalIpAssignmentListPageAsync.service
                streamHandlerExecutor = globalIpAssignmentListPageAsync.streamHandlerExecutor
                params = globalIpAssignmentListPageAsync.params
                response = globalIpAssignmentListPageAsync.response
            }

        fun service(service: GlobalIpAssignmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GlobalIpAssignmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GlobalIpAssignmentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [GlobalIpAssignmentListPageAsync].
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
        fun build(): GlobalIpAssignmentListPageAsync =
            GlobalIpAssignmentListPageAsync(
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

        return other is GlobalIpAssignmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "GlobalIpAssignmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
