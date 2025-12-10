// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.async.ConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ConnectionServiceAsync.list */
class ConnectionListPageAsync
private constructor(
    private val service: ConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ConnectionListParams,
    private val response: ConnectionListPageResponse,
) : PageAsync<ConnectionListResponse> {

    /**
     * Delegates to [ConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see ConnectionListPageResponse.data
     */
    fun data(): List<ConnectionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see ConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ConnectionListResponse> = data()

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

    fun nextPageParams(): ConnectionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ConnectionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConnectionListPageAsync].
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

    /** A builder for [ConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ConnectionListParams? = null
        private var response: ConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(connectionListPageAsync: ConnectionListPageAsync) = apply {
            service = connectionListPageAsync.service
            streamHandlerExecutor = connectionListPageAsync.streamHandlerExecutor
            params = connectionListPageAsync.params
            response = connectionListPageAsync.response
        }

        fun service(service: ConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ConnectionListPageAsync].
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
        fun build(): ConnectionListPageAsync =
            ConnectionListPageAsync(
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

        return other is ConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
