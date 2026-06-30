// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomcompositions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.RoomCompositionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RoomCompositionServiceAsync.list */
class RoomCompositionListPageAsync
private constructor(
    private val service: RoomCompositionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RoomCompositionListParams,
    private val response: RoomCompositionListPageResponse,
) : PageAsync<RoomComposition> {

    /**
     * Delegates to [RoomCompositionListPageResponse], but gracefully handles missing data.
     *
     * @see RoomCompositionListPageResponse.data
     */
    fun data(): List<RoomComposition> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoomCompositionListPageResponse], but gracefully handles missing data.
     *
     * @see RoomCompositionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomComposition> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RoomCompositionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RoomCompositionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RoomComposition> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RoomCompositionListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoomCompositionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoomCompositionListPageAsync].
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

    /** A builder for [RoomCompositionListPageAsync]. */
    class Builder internal constructor() {

        private var service: RoomCompositionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RoomCompositionListParams? = null
        private var response: RoomCompositionListPageResponse? = null

        @JvmSynthetic
        internal fun from(roomCompositionListPageAsync: RoomCompositionListPageAsync) = apply {
            service = roomCompositionListPageAsync.service
            streamHandlerExecutor = roomCompositionListPageAsync.streamHandlerExecutor
            params = roomCompositionListPageAsync.params
            response = roomCompositionListPageAsync.response
        }

        fun service(service: RoomCompositionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RoomCompositionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoomCompositionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoomCompositionListPageAsync].
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
        fun build(): RoomCompositionListPageAsync =
            RoomCompositionListPageAsync(
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

        return other is RoomCompositionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RoomCompositionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
