// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilenetworkoperators

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.MobileNetworkOperatorServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MobileNetworkOperatorServiceAsync.list */
class MobileNetworkOperatorListPageAsync
private constructor(
    private val service: MobileNetworkOperatorServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MobileNetworkOperatorListParams,
    private val response: MobileNetworkOperatorListPageResponse,
) : PageAsync<MobileNetworkOperatorListResponse> {

    /**
     * Delegates to [MobileNetworkOperatorListPageResponse], but gracefully handles missing data.
     *
     * @see MobileNetworkOperatorListPageResponse.data
     */
    fun data(): List<MobileNetworkOperatorListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MobileNetworkOperatorListPageResponse], but gracefully handles missing data.
     *
     * @see MobileNetworkOperatorListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MobileNetworkOperatorListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MobileNetworkOperatorListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MobileNetworkOperatorListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MobileNetworkOperatorListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MobileNetworkOperatorListParams = params

    /** The response that this page was parsed from. */
    fun response(): MobileNetworkOperatorListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobileNetworkOperatorListPageAsync].
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

    /** A builder for [MobileNetworkOperatorListPageAsync]. */
    class Builder internal constructor() {

        private var service: MobileNetworkOperatorServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MobileNetworkOperatorListParams? = null
        private var response: MobileNetworkOperatorListPageResponse? = null

        @JvmSynthetic
        internal fun from(mobileNetworkOperatorListPageAsync: MobileNetworkOperatorListPageAsync) =
            apply {
                service = mobileNetworkOperatorListPageAsync.service
                streamHandlerExecutor = mobileNetworkOperatorListPageAsync.streamHandlerExecutor
                params = mobileNetworkOperatorListPageAsync.params
                response = mobileNetworkOperatorListPageAsync.response
            }

        fun service(service: MobileNetworkOperatorServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MobileNetworkOperatorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MobileNetworkOperatorListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MobileNetworkOperatorListPageAsync].
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
        fun build(): MobileNetworkOperatorListPageAsync =
            MobileNetworkOperatorListPageAsync(
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

        return other is MobileNetworkOperatorListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MobileNetworkOperatorListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
