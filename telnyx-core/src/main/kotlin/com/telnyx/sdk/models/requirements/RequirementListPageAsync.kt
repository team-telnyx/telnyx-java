// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirements

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.RequirementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RequirementServiceAsync.list */
class RequirementListPageAsync
private constructor(
    private val service: RequirementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RequirementListParams,
    private val response: RequirementListPageResponse,
) : PageAsync<RequirementListResponse> {

    /**
     * Delegates to [RequirementListPageResponse], but gracefully handles missing data.
     *
     * @see RequirementListPageResponse.data
     */
    fun data(): List<RequirementListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RequirementListPageResponse], but gracefully handles missing data.
     *
     * @see RequirementListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RequirementListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RequirementListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RequirementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RequirementListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RequirementListParams = params

    /** The response that this page was parsed from. */
    fun response(): RequirementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RequirementListPageAsync].
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

    /** A builder for [RequirementListPageAsync]. */
    class Builder internal constructor() {

        private var service: RequirementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RequirementListParams? = null
        private var response: RequirementListPageResponse? = null

        @JvmSynthetic
        internal fun from(requirementListPageAsync: RequirementListPageAsync) = apply {
            service = requirementListPageAsync.service
            streamHandlerExecutor = requirementListPageAsync.streamHandlerExecutor
            params = requirementListPageAsync.params
            response = requirementListPageAsync.response
        }

        fun service(service: RequirementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RequirementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RequirementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RequirementListPageAsync].
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
        fun build(): RequirementListPageAsync =
            RequirementListPageAsync(
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

        return other is RequirementListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RequirementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
