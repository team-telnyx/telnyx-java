// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.PrivateWirelessGatewayServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PrivateWirelessGatewayServiceAsync.list */
class PrivateWirelessGatewayListPageAsync
private constructor(
    private val service: PrivateWirelessGatewayServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PrivateWirelessGatewayListParams,
    private val response: PrivateWirelessGatewayListPageResponse,
) : PageAsync<PrivateWirelessGateway> {

    /**
     * Delegates to [PrivateWirelessGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see PrivateWirelessGatewayListPageResponse.data
     */
    fun data(): List<PrivateWirelessGateway> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PrivateWirelessGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see PrivateWirelessGatewayListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PrivateWirelessGateway> = data()

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

    fun nextPageParams(): PrivateWirelessGatewayListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PrivateWirelessGatewayListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PrivateWirelessGateway> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PrivateWirelessGatewayListParams = params

    /** The response that this page was parsed from. */
    fun response(): PrivateWirelessGatewayListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PrivateWirelessGatewayListPageAsync].
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

    /** A builder for [PrivateWirelessGatewayListPageAsync]. */
    class Builder internal constructor() {

        private var service: PrivateWirelessGatewayServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PrivateWirelessGatewayListParams? = null
        private var response: PrivateWirelessGatewayListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            privateWirelessGatewayListPageAsync: PrivateWirelessGatewayListPageAsync
        ) = apply {
            service = privateWirelessGatewayListPageAsync.service
            streamHandlerExecutor = privateWirelessGatewayListPageAsync.streamHandlerExecutor
            params = privateWirelessGatewayListPageAsync.params
            response = privateWirelessGatewayListPageAsync.response
        }

        fun service(service: PrivateWirelessGatewayServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PrivateWirelessGatewayListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PrivateWirelessGatewayListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PrivateWirelessGatewayListPageAsync].
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
        fun build(): PrivateWirelessGatewayListPageAsync =
            PrivateWirelessGatewayListPageAsync(
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

        return other is PrivateWirelessGatewayListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PrivateWirelessGatewayListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
