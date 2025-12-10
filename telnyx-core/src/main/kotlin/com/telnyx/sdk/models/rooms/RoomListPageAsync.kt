// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.RoomServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RoomServiceAsync.list */
class RoomListPageAsync
private constructor(
    private val service: RoomServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RoomListParams,
    private val response: RoomListPageResponse,
) : PageAsync<Room> {

    /**
     * Delegates to [RoomListPageResponse], but gracefully handles missing data.
     *
     * @see RoomListPageResponse.data
     */
    fun data(): List<Room> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoomListPageResponse], but gracefully handles missing data.
     *
     * @see RoomListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Room> = data()

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

    fun nextPageParams(): RoomListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RoomListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Room> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RoomListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoomListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoomListPageAsync].
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

    /** A builder for [RoomListPageAsync]. */
    class Builder internal constructor() {

        private var service: RoomServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RoomListParams? = null
        private var response: RoomListPageResponse? = null

        @JvmSynthetic
        internal fun from(roomListPageAsync: RoomListPageAsync) = apply {
            service = roomListPageAsync.service
            streamHandlerExecutor = roomListPageAsync.streamHandlerExecutor
            params = roomListPageAsync.params
            response = roomListPageAsync.response
        }

        fun service(service: RoomServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RoomListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoomListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoomListPageAsync].
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
        fun build(): RoomListPageAsync =
            RoomListPageAsync(
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

        return other is RoomListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RoomListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
