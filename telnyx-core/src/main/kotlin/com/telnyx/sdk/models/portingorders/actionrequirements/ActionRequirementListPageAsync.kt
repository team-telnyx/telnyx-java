// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.actionrequirements

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portingorders.ActionRequirementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ActionRequirementServiceAsync.list */
class ActionRequirementListPageAsync
private constructor(
    private val service: ActionRequirementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ActionRequirementListParams,
    private val response: ActionRequirementListPageResponse,
) : PageAsync<ActionRequirementListResponse> {

    /**
     * Delegates to [ActionRequirementListPageResponse], but gracefully handles missing data.
     *
     * @see ActionRequirementListPageResponse.data
     */
    fun data(): List<ActionRequirementListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ActionRequirementListPageResponse], but gracefully handles missing data.
     *
     * @see ActionRequirementListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ActionRequirementListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ActionRequirementListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ActionRequirementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ActionRequirementListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ActionRequirementListParams = params

    /** The response that this page was parsed from. */
    fun response(): ActionRequirementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActionRequirementListPageAsync].
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

    /** A builder for [ActionRequirementListPageAsync]. */
    class Builder internal constructor() {

        private var service: ActionRequirementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ActionRequirementListParams? = null
        private var response: ActionRequirementListPageResponse? = null

        @JvmSynthetic
        internal fun from(actionRequirementListPageAsync: ActionRequirementListPageAsync) = apply {
            service = actionRequirementListPageAsync.service
            streamHandlerExecutor = actionRequirementListPageAsync.streamHandlerExecutor
            params = actionRequirementListPageAsync.params
            response = actionRequirementListPageAsync.response
        }

        fun service(service: ActionRequirementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ActionRequirementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ActionRequirementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActionRequirementListPageAsync].
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
        fun build(): ActionRequirementListPageAsync =
            ActionRequirementListPageAsync(
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

        return other is ActionRequirementListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ActionRequirementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
