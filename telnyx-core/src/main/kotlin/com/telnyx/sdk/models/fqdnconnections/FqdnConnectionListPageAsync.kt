// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.async.FqdnConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FqdnConnectionServiceAsync.list */
class FqdnConnectionListPageAsync
private constructor(
    private val service: FqdnConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FqdnConnectionListParams,
    private val response: FqdnConnectionListPageResponse,
) : PageAsync<FqdnConnection> {

    /**
     * Delegates to [FqdnConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see FqdnConnectionListPageResponse.data
     */
    fun data(): List<FqdnConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FqdnConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see FqdnConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<FqdnConnection> = data()

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

    fun nextPageParams(): FqdnConnectionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<FqdnConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FqdnConnection> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FqdnConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): FqdnConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FqdnConnectionListPageAsync].
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

    /** A builder for [FqdnConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: FqdnConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FqdnConnectionListParams? = null
        private var response: FqdnConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(fqdnConnectionListPageAsync: FqdnConnectionListPageAsync) = apply {
            service = fqdnConnectionListPageAsync.service
            streamHandlerExecutor = fqdnConnectionListPageAsync.streamHandlerExecutor
            params = fqdnConnectionListPageAsync.params
            response = fqdnConnectionListPageAsync.response
        }

        fun service(service: FqdnConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FqdnConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FqdnConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FqdnConnectionListPageAsync].
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
        fun build(): FqdnConnectionListPageAsync =
            FqdnConnectionListPageAsync(
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

        return other is FqdnConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FqdnConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
