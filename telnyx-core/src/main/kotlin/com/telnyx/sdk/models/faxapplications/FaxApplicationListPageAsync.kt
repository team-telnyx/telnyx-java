// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxapplications

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.FaxApplicationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FaxApplicationServiceAsync.list */
class FaxApplicationListPageAsync
private constructor(
    private val service: FaxApplicationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FaxApplicationListParams,
    private val response: FaxApplicationListPageResponse,
) : PageAsync<FaxApplication> {

    /**
     * Delegates to [FaxApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see FaxApplicationListPageResponse.data
     */
    fun data(): List<FaxApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FaxApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see FaxApplicationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<FaxApplication> = data()

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

    fun nextPageParams(): FaxApplicationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<FaxApplicationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FaxApplication> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FaxApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): FaxApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FaxApplicationListPageAsync].
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

    /** A builder for [FaxApplicationListPageAsync]. */
    class Builder internal constructor() {

        private var service: FaxApplicationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FaxApplicationListParams? = null
        private var response: FaxApplicationListPageResponse? = null

        @JvmSynthetic
        internal fun from(faxApplicationListPageAsync: FaxApplicationListPageAsync) = apply {
            service = faxApplicationListPageAsync.service
            streamHandlerExecutor = faxApplicationListPageAsync.streamHandlerExecutor
            params = faxApplicationListPageAsync.params
            response = faxApplicationListPageAsync.response
        }

        fun service(service: FaxApplicationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FaxApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FaxApplicationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FaxApplicationListPageAsync].
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
        fun build(): FaxApplicationListPageAsync =
            FaxApplicationListPageAsync(
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

        return other is FaxApplicationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FaxApplicationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
