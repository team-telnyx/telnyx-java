// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.ConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ConnectionServiceAsync.listActiveCalls */
class ConnectionListActiveCallsPageAsync
private constructor(
    private val service: ConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ConnectionListActiveCallsParams,
    private val response: ConnectionListActiveCallsPageResponse,
) : PageAsync<ConnectionListActiveCallsResponse> {

    /**
     * Delegates to [ConnectionListActiveCallsPageResponse], but gracefully handles missing data.
     *
     * @see ConnectionListActiveCallsPageResponse.data
     */
    fun data(): List<ConnectionListActiveCallsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConnectionListActiveCallsPageResponse], but gracefully handles missing data.
     *
     * @see ConnectionListActiveCallsPageResponse.meta
     */
    fun meta(): Optional<ConnectionListActiveCallsPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<ConnectionListActiveCallsResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ConnectionListActiveCallsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ConnectionListActiveCallsPageAsync> =
        service.listActiveCalls(nextPageParams())

    fun autoPager(): AutoPagerAsync<ConnectionListActiveCallsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ConnectionListActiveCallsParams = params

    /** The response that this page was parsed from. */
    fun response(): ConnectionListActiveCallsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConnectionListActiveCallsPageAsync].
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

    /** A builder for [ConnectionListActiveCallsPageAsync]. */
    class Builder internal constructor() {

        private var service: ConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ConnectionListActiveCallsParams? = null
        private var response: ConnectionListActiveCallsPageResponse? = null

        @JvmSynthetic
        internal fun from(connectionListActiveCallsPageAsync: ConnectionListActiveCallsPageAsync) =
            apply {
                service = connectionListActiveCallsPageAsync.service
                streamHandlerExecutor = connectionListActiveCallsPageAsync.streamHandlerExecutor
                params = connectionListActiveCallsPageAsync.params
                response = connectionListActiveCallsPageAsync.response
            }

        fun service(service: ConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ConnectionListActiveCallsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConnectionListActiveCallsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ConnectionListActiveCallsPageAsync].
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
        fun build(): ConnectionListActiveCallsPageAsync =
            ConnectionListActiveCallsPageAsync(
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

        return other is ConnectionListActiveCallsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ConnectionListActiveCallsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
