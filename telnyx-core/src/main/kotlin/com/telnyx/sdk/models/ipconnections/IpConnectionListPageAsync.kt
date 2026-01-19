// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ipconnections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.async.IpConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see IpConnectionServiceAsync.list */
class IpConnectionListPageAsync
private constructor(
    private val service: IpConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IpConnectionListParams,
    private val response: IpConnectionListPageResponse,
) : PageAsync<IpConnection> {

    /**
     * Delegates to [IpConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see IpConnectionListPageResponse.data
     */
    fun data(): List<IpConnection> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IpConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see IpConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<IpConnection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): IpConnectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<IpConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IpConnection> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IpConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): IpConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IpConnectionListPageAsync].
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

    /** A builder for [IpConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: IpConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IpConnectionListParams? = null
        private var response: IpConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(ipConnectionListPageAsync: IpConnectionListPageAsync) = apply {
            service = ipConnectionListPageAsync.service
            streamHandlerExecutor = ipConnectionListPageAsync.streamHandlerExecutor
            params = ipConnectionListPageAsync.params
            response = ipConnectionListPageAsync.response
        }

        fun service(service: IpConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IpConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IpConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IpConnectionListPageAsync].
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
        fun build(): IpConnectionListPageAsync =
            IpConnectionListPageAsync(
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

        return other is IpConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "IpConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
