// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.billinggroups

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.BillingGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BillingGroupServiceAsync.list */
class BillingGroupListPageAsync
private constructor(
    private val service: BillingGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BillingGroupListParams,
    private val response: BillingGroupListPageResponse,
) : PageAsync<BillingGroup> {

    /**
     * Delegates to [BillingGroupListPageResponse], but gracefully handles missing data.
     *
     * @see BillingGroupListPageResponse.data
     */
    fun data(): List<BillingGroup> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillingGroupListPageResponse], but gracefully handles missing data.
     *
     * @see BillingGroupListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<BillingGroup> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): BillingGroupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<BillingGroupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillingGroup> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BillingGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillingGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillingGroupListPageAsync].
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

    /** A builder for [BillingGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillingGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BillingGroupListParams? = null
        private var response: BillingGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(billingGroupListPageAsync: BillingGroupListPageAsync) = apply {
            service = billingGroupListPageAsync.service
            streamHandlerExecutor = billingGroupListPageAsync.streamHandlerExecutor
            params = billingGroupListPageAsync.params
            response = billingGroupListPageAsync.response
        }

        fun service(service: BillingGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BillingGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillingGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillingGroupListPageAsync].
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
        fun build(): BillingGroupListPageAsync =
            BillingGroupListPageAsync(
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

        return other is BillingGroupListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BillingGroupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
