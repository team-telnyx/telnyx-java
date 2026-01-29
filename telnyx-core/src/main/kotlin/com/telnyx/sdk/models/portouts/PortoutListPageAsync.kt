// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.Metadata
import com.telnyx.sdk.services.async.PortoutServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PortoutServiceAsync.list */
class PortoutListPageAsync
private constructor(
    private val service: PortoutServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PortoutListParams,
    private val response: PortoutListPageResponse,
) : PageAsync<PortoutDetails> {

    /**
     * Delegates to [PortoutListPageResponse], but gracefully handles missing data.
     *
     * @see PortoutListPageResponse.data
     */
    fun data(): List<PortoutDetails> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PortoutListPageResponse], but gracefully handles missing data.
     *
     * @see PortoutListPageResponse.meta
     */
    fun meta(): Optional<Metadata> = response._meta().getOptional("meta")

    override fun items(): List<PortoutDetails> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PortoutListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PortoutListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortoutDetails> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PortoutListParams = params

    /** The response that this page was parsed from. */
    fun response(): PortoutListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PortoutListPageAsync].
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

    /** A builder for [PortoutListPageAsync]. */
    class Builder internal constructor() {

        private var service: PortoutServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PortoutListParams? = null
        private var response: PortoutListPageResponse? = null

        @JvmSynthetic
        internal fun from(portoutListPageAsync: PortoutListPageAsync) = apply {
            service = portoutListPageAsync.service
            streamHandlerExecutor = portoutListPageAsync.streamHandlerExecutor
            params = portoutListPageAsync.params
            response = portoutListPageAsync.response
        }

        fun service(service: PortoutServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PortoutListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PortoutListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PortoutListPageAsync].
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
        fun build(): PortoutListPageAsync =
            PortoutListPageAsync(
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

        return other is PortoutListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PortoutListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
