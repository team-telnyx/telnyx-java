// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ips

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.async.IpServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see IpServiceAsync.list */
class IpListPageAsync
private constructor(
    private val service: IpServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IpListParams,
    private val response: IpListPageResponse,
) : PageAsync<Ip> {

    /**
     * Delegates to [IpListPageResponse], but gracefully handles missing data.
     *
     * @see IpListPageResponse.data
     */
    fun data(): List<Ip> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IpListPageResponse], but gracefully handles missing data.
     *
     * @see IpListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Ip> = data()

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

    fun nextPageParams(): IpListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<IpListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Ip> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IpListParams = params

    /** The response that this page was parsed from. */
    fun response(): IpListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IpListPageAsync].
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

    /** A builder for [IpListPageAsync]. */
    class Builder internal constructor() {

        private var service: IpServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IpListParams? = null
        private var response: IpListPageResponse? = null

        @JvmSynthetic
        internal fun from(ipListPageAsync: IpListPageAsync) = apply {
            service = ipListPageAsync.service
            streamHandlerExecutor = ipListPageAsync.streamHandlerExecutor
            params = ipListPageAsync.params
            response = ipListPageAsync.response
        }

        fun service(service: IpServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IpListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IpListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IpListPageAsync].
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
        fun build(): IpListPageAsync =
            IpListPageAsync(
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

        return other is IpListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "IpListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
