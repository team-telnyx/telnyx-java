// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.ManagedAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ManagedAccountServiceAsync.list */
class ManagedAccountListPageAsync
private constructor(
    private val service: ManagedAccountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ManagedAccountListParams,
    private val response: ManagedAccountListPageResponse,
) : PageAsync<ManagedAccountListResponse> {

    /**
     * Delegates to [ManagedAccountListPageResponse], but gracefully handles missing data.
     *
     * @see ManagedAccountListPageResponse.data
     */
    fun data(): List<ManagedAccountListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ManagedAccountListPageResponse], but gracefully handles missing data.
     *
     * @see ManagedAccountListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ManagedAccountListResponse> = data()

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

    fun nextPageParams(): ManagedAccountListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ManagedAccountListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ManagedAccountListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ManagedAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): ManagedAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManagedAccountListPageAsync].
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

    /** A builder for [ManagedAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: ManagedAccountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ManagedAccountListParams? = null
        private var response: ManagedAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(managedAccountListPageAsync: ManagedAccountListPageAsync) = apply {
            service = managedAccountListPageAsync.service
            streamHandlerExecutor = managedAccountListPageAsync.streamHandlerExecutor
            params = managedAccountListPageAsync.params
            response = managedAccountListPageAsync.response
        }

        fun service(service: ManagedAccountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ManagedAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ManagedAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ManagedAccountListPageAsync].
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
        fun build(): ManagedAccountListPageAsync =
            ManagedAccountListPageAsync(
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

        return other is ManagedAccountListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ManagedAccountListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
