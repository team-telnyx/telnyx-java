// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.rooms.RoomSession
import com.telnyx.sdk.services.async.rooms.SessionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SessionServiceAsync.list0 */
class SessionList0PageAsync
private constructor(
    private val service: SessionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SessionList0Params,
    private val response: SessionList0PageResponse,
) : PageAsync<RoomSession> {

    /**
     * Delegates to [SessionList0PageResponse], but gracefully handles missing data.
     *
     * @see SessionList0PageResponse.data
     */
    fun data(): List<RoomSession> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SessionList0PageResponse], but gracefully handles missing data.
     *
     * @see SessionList0PageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RoomSession> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): SessionList0Params {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SessionList0PageAsync> =
        service.list0(nextPageParams())

    fun autoPager(): AutoPagerAsync<RoomSession> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SessionList0Params = params

    /** The response that this page was parsed from. */
    fun response(): SessionList0PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionList0PageAsync].
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

    /** A builder for [SessionList0PageAsync]. */
    class Builder internal constructor() {

        private var service: SessionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SessionList0Params? = null
        private var response: SessionList0PageResponse? = null

        @JvmSynthetic
        internal fun from(sessionList0PageAsync: SessionList0PageAsync) = apply {
            service = sessionList0PageAsync.service
            streamHandlerExecutor = sessionList0PageAsync.streamHandlerExecutor
            params = sessionList0PageAsync.params
            response = sessionList0PageAsync.response
        }

        fun service(service: SessionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SessionList0Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SessionList0PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SessionList0PageAsync].
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
        fun build(): SessionList0PageAsync =
            SessionList0PageAsync(
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

        return other is SessionList0PageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SessionList0PageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
