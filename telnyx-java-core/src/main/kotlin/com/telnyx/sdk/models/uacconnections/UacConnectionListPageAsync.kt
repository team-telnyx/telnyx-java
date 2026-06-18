// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.async.UacConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UacConnectionServiceAsync.list */
class UacConnectionListPageAsync
private constructor(
    private val service: UacConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UacConnectionListParams,
    private val response: UacConnectionListPageResponse,
) : PageAsync<UacConnectionListResponse> {

    /**
     * Delegates to [UacConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see UacConnectionListPageResponse.data
     */
    fun data(): List<UacConnectionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UacConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see UacConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<UacConnectionListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): UacConnectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<UacConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UacConnectionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UacConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): UacConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UacConnectionListPageAsync].
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

    /** A builder for [UacConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: UacConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UacConnectionListParams? = null
        private var response: UacConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(uacConnectionListPageAsync: UacConnectionListPageAsync) = apply {
            service = uacConnectionListPageAsync.service
            streamHandlerExecutor = uacConnectionListPageAsync.streamHandlerExecutor
            params = uacConnectionListPageAsync.params
            response = uacConnectionListPageAsync.response
        }

        fun service(service: UacConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UacConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UacConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UacConnectionListPageAsync].
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
        fun build(): UacConnectionListPageAsync =
            UacConnectionListPageAsync(
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

        return other is UacConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UacConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
