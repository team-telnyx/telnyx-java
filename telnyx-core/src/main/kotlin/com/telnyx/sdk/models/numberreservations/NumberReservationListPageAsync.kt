// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberreservations

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NumberReservationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberReservationServiceAsync.list */
class NumberReservationListPageAsync
private constructor(
    private val service: NumberReservationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NumberReservationListParams,
    private val response: NumberReservationListPageResponse,
) : PageAsync<NumberReservation> {

    /**
     * Delegates to [NumberReservationListPageResponse], but gracefully handles missing data.
     *
     * @see NumberReservationListPageResponse.data
     */
    fun data(): List<NumberReservation> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberReservationListPageResponse], but gracefully handles missing data.
     *
     * @see NumberReservationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NumberReservation> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NumberReservationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NumberReservationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NumberReservation> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NumberReservationListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberReservationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NumberReservationListPageAsync].
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

    /** A builder for [NumberReservationListPageAsync]. */
    class Builder internal constructor() {

        private var service: NumberReservationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NumberReservationListParams? = null
        private var response: NumberReservationListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberReservationListPageAsync: NumberReservationListPageAsync) = apply {
            service = numberReservationListPageAsync.service
            streamHandlerExecutor = numberReservationListPageAsync.streamHandlerExecutor
            params = numberReservationListPageAsync.params
            response = numberReservationListPageAsync.response
        }

        fun service(service: NumberReservationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NumberReservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberReservationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NumberReservationListPageAsync].
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
        fun build(): NumberReservationListPageAsync =
            NumberReservationListPageAsync(
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

        return other is NumberReservationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NumberReservationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
