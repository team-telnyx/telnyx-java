// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.CallControlApplicationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CallControlApplicationServiceAsync.list */
class CallControlApplicationListPageAsync
private constructor(
    private val service: CallControlApplicationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CallControlApplicationListParams,
    private val response: CallControlApplicationListPageResponse,
) : PageAsync<CallControlApplication> {

    /**
     * Delegates to [CallControlApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see CallControlApplicationListPageResponse.data
     */
    fun data(): List<CallControlApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CallControlApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see CallControlApplicationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CallControlApplication> = data()

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

    fun nextPageParams(): CallControlApplicationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CallControlApplicationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CallControlApplication> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CallControlApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CallControlApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CallControlApplicationListPageAsync].
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

    /** A builder for [CallControlApplicationListPageAsync]. */
    class Builder internal constructor() {

        private var service: CallControlApplicationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CallControlApplicationListParams? = null
        private var response: CallControlApplicationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            callControlApplicationListPageAsync: CallControlApplicationListPageAsync
        ) = apply {
            service = callControlApplicationListPageAsync.service
            streamHandlerExecutor = callControlApplicationListPageAsync.streamHandlerExecutor
            params = callControlApplicationListPageAsync.params
            response = callControlApplicationListPageAsync.response
        }

        fun service(service: CallControlApplicationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CallControlApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CallControlApplicationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CallControlApplicationListPageAsync].
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
        fun build(): CallControlApplicationListPageAsync =
            CallControlApplicationListPageAsync(
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

        return other is CallControlApplicationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CallControlApplicationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
