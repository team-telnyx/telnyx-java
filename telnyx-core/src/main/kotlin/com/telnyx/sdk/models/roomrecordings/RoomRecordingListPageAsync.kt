// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomrecordings

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.RoomRecordingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RoomRecordingServiceAsync.list */
class RoomRecordingListPageAsync
private constructor(
    private val service: RoomRecordingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RoomRecordingListParams,
    private val response: RoomRecordingListPageResponse,
) : PageAsync<RoomRecordingListResponse> {

    /**
     * Delegates to [RoomRecordingListPageResponse], but gracefully handles missing data.
     *
     * @see RoomRecordingListPageResponse.data
     */
    fun data(): List<RoomRecordingListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoomRecordingListPageResponse], but gracefully handles missing data.
     *
     * @see RoomRecordingListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomRecordingListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RoomRecordingListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RoomRecordingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RoomRecordingListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RoomRecordingListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoomRecordingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoomRecordingListPageAsync].
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

    /** A builder for [RoomRecordingListPageAsync]. */
    class Builder internal constructor() {

        private var service: RoomRecordingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RoomRecordingListParams? = null
        private var response: RoomRecordingListPageResponse? = null

        @JvmSynthetic
        internal fun from(roomRecordingListPageAsync: RoomRecordingListPageAsync) = apply {
            service = roomRecordingListPageAsync.service
            streamHandlerExecutor = roomRecordingListPageAsync.streamHandlerExecutor
            params = roomRecordingListPageAsync.params
            response = roomRecordingListPageAsync.response
        }

        fun service(service: RoomRecordingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RoomRecordingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoomRecordingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoomRecordingListPageAsync].
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
        fun build(): RoomRecordingListPageAsync =
            RoomRecordingListPageAsync(
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

        return other is RoomRecordingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RoomRecordingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
