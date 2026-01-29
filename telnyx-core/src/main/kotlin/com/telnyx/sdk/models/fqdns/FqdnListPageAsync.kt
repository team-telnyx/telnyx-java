// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.async.FqdnServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FqdnServiceAsync.list */
class FqdnListPageAsync
private constructor(
    private val service: FqdnServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FqdnListParams,
    private val response: FqdnListPageResponse,
) : PageAsync<Fqdn> {

    /**
     * Delegates to [FqdnListPageResponse], but gracefully handles missing data.
     *
     * @see FqdnListPageResponse.data
     */
    fun data(): List<Fqdn> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FqdnListPageResponse], but gracefully handles missing data.
     *
     * @see FqdnListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Fqdn> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): FqdnListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<FqdnListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Fqdn> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FqdnListParams = params

    /** The response that this page was parsed from. */
    fun response(): FqdnListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FqdnListPageAsync].
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

    /** A builder for [FqdnListPageAsync]. */
    class Builder internal constructor() {

        private var service: FqdnServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FqdnListParams? = null
        private var response: FqdnListPageResponse? = null

        @JvmSynthetic
        internal fun from(fqdnListPageAsync: FqdnListPageAsync) = apply {
            service = fqdnListPageAsync.service
            streamHandlerExecutor = fqdnListPageAsync.streamHandlerExecutor
            params = fqdnListPageAsync.params
            response = fqdnListPageAsync.response
        }

        fun service(service: FqdnServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FqdnListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FqdnListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FqdnListPageAsync].
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
        fun build(): FqdnListPageAsync =
            FqdnListPageAsync(
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

        return other is FqdnListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FqdnListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
