// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NetworkServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NetworkServiceAsync.listInterfaces */
class NetworkListInterfacesPageAsync
private constructor(
    private val service: NetworkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NetworkListInterfacesParams,
    private val response: NetworkListInterfacesPageResponse,
) : PageAsync<NetworkListInterfacesResponse> {

    /**
     * Delegates to [NetworkListInterfacesPageResponse], but gracefully handles missing data.
     *
     * @see NetworkListInterfacesPageResponse.data
     */
    fun data(): List<NetworkListInterfacesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NetworkListInterfacesPageResponse], but gracefully handles missing data.
     *
     * @see NetworkListInterfacesPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NetworkListInterfacesResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NetworkListInterfacesParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NetworkListInterfacesPageAsync> =
        service.listInterfaces(nextPageParams())

    fun autoPager(): AutoPagerAsync<NetworkListInterfacesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NetworkListInterfacesParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkListInterfacesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NetworkListInterfacesPageAsync].
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

    /** A builder for [NetworkListInterfacesPageAsync]. */
    class Builder internal constructor() {

        private var service: NetworkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NetworkListInterfacesParams? = null
        private var response: NetworkListInterfacesPageResponse? = null

        @JvmSynthetic
        internal fun from(networkListInterfacesPageAsync: NetworkListInterfacesPageAsync) = apply {
            service = networkListInterfacesPageAsync.service
            streamHandlerExecutor = networkListInterfacesPageAsync.streamHandlerExecutor
            params = networkListInterfacesPageAsync.params
            response = networkListInterfacesPageAsync.response
        }

        fun service(service: NetworkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkListInterfacesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkListInterfacesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NetworkListInterfacesPageAsync].
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
        fun build(): NetworkListInterfacesPageAsync =
            NetworkListInterfacesPageAsync(
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

        return other is NetworkListInterfacesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NetworkListInterfacesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
