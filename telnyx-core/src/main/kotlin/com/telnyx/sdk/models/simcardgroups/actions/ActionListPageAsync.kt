// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups.actions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.simcardgroups.ActionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ActionServiceAsync.list */
class ActionListPageAsync
private constructor(
    private val service: ActionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ActionListParams,
    private val response: ActionListPageResponse,
) : PageAsync<SimCardGroupAction> {

    /**
     * Delegates to [ActionListPageResponse], but gracefully handles missing data.
     *
     * @see ActionListPageResponse.data
     */
    fun data(): List<SimCardGroupAction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ActionListPageResponse], but gracefully handles missing data.
     *
     * @see ActionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimCardGroupAction> = data()

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

    fun nextPageParams(): ActionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ActionListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimCardGroupAction> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ActionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ActionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionListPageAsync].
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

    /** A builder for [ActionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ActionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ActionListParams? = null
        private var response: ActionListPageResponse? = null

        @JvmSynthetic
        internal fun from(actionListPageAsync: ActionListPageAsync) = apply {
            service = actionListPageAsync.service
            streamHandlerExecutor = actionListPageAsync.streamHandlerExecutor
            params = actionListPageAsync.params
            response = actionListPageAsync.response
        }

        fun service(service: ActionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ActionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ActionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ActionListPageAsync].
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
        fun build(): ActionListPageAsync =
            ActionListPageAsync(
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

        return other is ActionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ActionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
