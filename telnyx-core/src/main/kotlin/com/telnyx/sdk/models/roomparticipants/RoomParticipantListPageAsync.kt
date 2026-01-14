// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomparticipants

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.RoomParticipant
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.RoomParticipantServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RoomParticipantServiceAsync.list */
class RoomParticipantListPageAsync
private constructor(
    private val service: RoomParticipantServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RoomParticipantListParams,
    private val response: RoomParticipantListPageResponse,
) : PageAsync<RoomParticipant> {

    /**
     * Delegates to [RoomParticipantListPageResponse], but gracefully handles missing data.
     *
     * @see RoomParticipantListPageResponse.data
     */
    fun data(): List<RoomParticipant> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoomParticipantListPageResponse], but gracefully handles missing data.
     *
     * @see RoomParticipantListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomParticipant> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RoomParticipantListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RoomParticipantListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RoomParticipant> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RoomParticipantListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoomParticipantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoomParticipantListPageAsync].
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

    /** A builder for [RoomParticipantListPageAsync]. */
    class Builder internal constructor() {

        private var service: RoomParticipantServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RoomParticipantListParams? = null
        private var response: RoomParticipantListPageResponse? = null

        @JvmSynthetic
        internal fun from(roomParticipantListPageAsync: RoomParticipantListPageAsync) = apply {
            service = roomParticipantListPageAsync.service
            streamHandlerExecutor = roomParticipantListPageAsync.streamHandlerExecutor
            params = roomParticipantListPageAsync.params
            response = roomParticipantListPageAsync.response
        }

        fun service(service: RoomParticipantServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RoomParticipantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoomParticipantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoomParticipantListPageAsync].
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
        fun build(): RoomParticipantListPageAsync =
            RoomParticipantListPageAsync(
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

        return other is RoomParticipantListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RoomParticipantListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
