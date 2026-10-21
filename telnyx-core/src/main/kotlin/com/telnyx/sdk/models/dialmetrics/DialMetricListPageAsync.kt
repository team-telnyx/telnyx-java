// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialmetrics

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.DialMetricServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DialMetricServiceAsync.list */
class DialMetricListPageAsync
private constructor(
    private val service: DialMetricServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DialMetricListParams,
    private val response: DialMetricListPageResponse,
) : PageAsync<DialMetricListResponse> {

    /**
     * Delegates to [DialMetricListPageResponse], but gracefully handles missing data.
     *
     * @see DialMetricListPageResponse.data
     */
    fun data(): List<DialMetricListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DialMetricListPageResponse], but gracefully handles missing data.
     *
     * @see DialMetricListPageResponse.meta
     */
    fun meta(): Optional<DialMetricListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<DialMetricListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursors().getOptional("cursors") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): DialMetricListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursors().getOptional("cursors") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DialMetricListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DialMetricListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DialMetricListParams = params

    /** The response that this page was parsed from. */
    fun response(): DialMetricListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DialMetricListPageAsync].
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

    /** A builder for [DialMetricListPageAsync]. */
    class Builder internal constructor() {

        private var service: DialMetricServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DialMetricListParams? = null
        private var response: DialMetricListPageResponse? = null

        @JvmSynthetic
        internal fun from(dialMetricListPageAsync: DialMetricListPageAsync) = apply {
            service = dialMetricListPageAsync.service
            streamHandlerExecutor = dialMetricListPageAsync.streamHandlerExecutor
            params = dialMetricListPageAsync.params
            response = dialMetricListPageAsync.response
        }

        fun service(service: DialMetricServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DialMetricListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DialMetricListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DialMetricListPageAsync].
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
        fun build(): DialMetricListPageAsync =
            DialMetricListPageAsync(
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

        return other is DialMetricListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DialMetricListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
