// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.brand

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.BrandServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BrandServiceAsync.list */
class BrandListPageAsync
private constructor(
    private val service: BrandServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BrandListParams,
    private val response: BrandListPageResponse,
) : PageAsync<BrandListResponse> {

    /**
     * Delegates to [BrandListPageResponse], but gracefully handles missing data.
     *
     * @see BrandListPageResponse.records
     */
    fun records(): List<BrandListResponse> =
        response._records().getOptional("records").getOrNull() ?: emptyList()

    /**
     * Delegates to [BrandListPageResponse], but gracefully handles missing data.
     *
     * @see BrandListPageResponse.page
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    /**
     * Delegates to [BrandListPageResponse], but gracefully handles missing data.
     *
     * @see BrandListPageResponse.totalRecords
     */
    fun totalRecords(): Optional<Long> = response._totalRecords().getOptional("totalRecords")

    override fun items(): List<BrandListResponse> = records()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber = page().getOrDefault(1)
        val pageCount = totalRecords().getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): BrandListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<BrandListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BrandListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BrandListParams = params

    /** The response that this page was parsed from. */
    fun response(): BrandListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandListPageAsync].
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

    /** A builder for [BrandListPageAsync]. */
    class Builder internal constructor() {

        private var service: BrandServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BrandListParams? = null
        private var response: BrandListPageResponse? = null

        @JvmSynthetic
        internal fun from(brandListPageAsync: BrandListPageAsync) = apply {
            service = brandListPageAsync.service
            streamHandlerExecutor = brandListPageAsync.streamHandlerExecutor
            params = brandListPageAsync.params
            response = brandListPageAsync.response
        }

        fun service(service: BrandServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BrandListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BrandListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BrandListPageAsync].
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
        fun build(): BrandListPageAsync =
            BrandListPageAsync(
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

        return other is BrandListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BrandListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
