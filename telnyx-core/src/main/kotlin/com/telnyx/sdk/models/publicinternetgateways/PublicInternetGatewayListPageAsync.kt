// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.PublicInternetGatewayServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PublicInternetGatewayServiceAsync.list */
class PublicInternetGatewayListPageAsync
private constructor(
    private val service: PublicInternetGatewayServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PublicInternetGatewayListParams,
    private val response: PublicInternetGatewayListPageResponse,
) : PageAsync<PublicInternetGatewayListResponse> {

    /**
     * Delegates to [PublicInternetGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see PublicInternetGatewayListPageResponse.data
     */
    fun data(): List<PublicInternetGatewayListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PublicInternetGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see PublicInternetGatewayListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PublicInternetGatewayListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PublicInternetGatewayListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PublicInternetGatewayListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicInternetGatewayListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PublicInternetGatewayListParams = params

    /** The response that this page was parsed from. */
    fun response(): PublicInternetGatewayListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PublicInternetGatewayListPageAsync].
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

    /** A builder for [PublicInternetGatewayListPageAsync]. */
    class Builder internal constructor() {

        private var service: PublicInternetGatewayServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PublicInternetGatewayListParams? = null
        private var response: PublicInternetGatewayListPageResponse? = null

        @JvmSynthetic
        internal fun from(publicInternetGatewayListPageAsync: PublicInternetGatewayListPageAsync) =
            apply {
                service = publicInternetGatewayListPageAsync.service
                streamHandlerExecutor = publicInternetGatewayListPageAsync.streamHandlerExecutor
                params = publicInternetGatewayListPageAsync.params
                response = publicInternetGatewayListPageAsync.response
            }

        fun service(service: PublicInternetGatewayServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PublicInternetGatewayListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PublicInternetGatewayListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PublicInternetGatewayListPageAsync].
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
        fun build(): PublicInternetGatewayListPageAsync =
            PublicInternetGatewayListPageAsync(
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

        return other is PublicInternetGatewayListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PublicInternetGatewayListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
