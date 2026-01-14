// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.activationjobs

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.portingorders.PortingOrdersActivationJob
import com.telnyx.sdk.services.async.portingorders.ActivationJobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ActivationJobServiceAsync.list */
class ActivationJobListPageAsync
private constructor(
    private val service: ActivationJobServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ActivationJobListParams,
    private val response: ActivationJobListPageResponse,
) : PageAsync<PortingOrdersActivationJob> {

    /**
     * Delegates to [ActivationJobListPageResponse], but gracefully handles missing data.
     *
     * @see ActivationJobListPageResponse.data
     */
    fun data(): List<PortingOrdersActivationJob> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ActivationJobListPageResponse], but gracefully handles missing data.
     *
     * @see ActivationJobListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingOrdersActivationJob> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ActivationJobListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ActivationJobListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortingOrdersActivationJob> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ActivationJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): ActivationJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActivationJobListPageAsync].
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

    /** A builder for [ActivationJobListPageAsync]. */
    class Builder internal constructor() {

        private var service: ActivationJobServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ActivationJobListParams? = null
        private var response: ActivationJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(activationJobListPageAsync: ActivationJobListPageAsync) = apply {
            service = activationJobListPageAsync.service
            streamHandlerExecutor = activationJobListPageAsync.streamHandlerExecutor
            params = activationJobListPageAsync.params
            response = activationJobListPageAsync.response
        }

        fun service(service: ActivationJobServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ActivationJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ActivationJobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ActivationJobListPageAsync].
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
        fun build(): ActivationJobListPageAsync =
            ActivationJobListPageAsync(
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

        return other is ActivationJobListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ActivationJobListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
