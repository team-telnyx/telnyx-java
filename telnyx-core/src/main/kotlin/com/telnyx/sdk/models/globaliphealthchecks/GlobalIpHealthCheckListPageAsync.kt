// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globaliphealthchecks

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.GlobalIpHealthCheckServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see GlobalIpHealthCheckServiceAsync.list */
class GlobalIpHealthCheckListPageAsync
private constructor(
    private val service: GlobalIpHealthCheckServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GlobalIpHealthCheckListParams,
    private val response: GlobalIpHealthCheckListPageResponse,
) : PageAsync<GlobalIpHealthCheckListResponse> {

    /**
     * Delegates to [GlobalIpHealthCheckListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpHealthCheckListPageResponse.data
     */
    fun data(): List<GlobalIpHealthCheckListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [GlobalIpHealthCheckListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpHealthCheckListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<GlobalIpHealthCheckListResponse> = data()

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

    fun nextPageParams(): GlobalIpHealthCheckListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<GlobalIpHealthCheckListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GlobalIpHealthCheckListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GlobalIpHealthCheckListParams = params

    /** The response that this page was parsed from. */
    fun response(): GlobalIpHealthCheckListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [GlobalIpHealthCheckListPageAsync].
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

    /** A builder for [GlobalIpHealthCheckListPageAsync]. */
    class Builder internal constructor() {

        private var service: GlobalIpHealthCheckServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GlobalIpHealthCheckListParams? = null
        private var response: GlobalIpHealthCheckListPageResponse? = null

        @JvmSynthetic
        internal fun from(globalIpHealthCheckListPageAsync: GlobalIpHealthCheckListPageAsync) =
            apply {
                service = globalIpHealthCheckListPageAsync.service
                streamHandlerExecutor = globalIpHealthCheckListPageAsync.streamHandlerExecutor
                params = globalIpHealthCheckListPageAsync.params
                response = globalIpHealthCheckListPageAsync.response
            }

        fun service(service: GlobalIpHealthCheckServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GlobalIpHealthCheckListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GlobalIpHealthCheckListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [GlobalIpHealthCheckListPageAsync].
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
        fun build(): GlobalIpHealthCheckListPageAsync =
            GlobalIpHealthCheckListPageAsync(
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

        return other is GlobalIpHealthCheckListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "GlobalIpHealthCheckListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
