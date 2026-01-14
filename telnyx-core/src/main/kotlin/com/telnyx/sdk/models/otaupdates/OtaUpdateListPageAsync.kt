// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.otaupdates

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.OtaUpdateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OtaUpdateServiceAsync.list */
class OtaUpdateListPageAsync
private constructor(
    private val service: OtaUpdateServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OtaUpdateListParams,
    private val response: OtaUpdateListPageResponse,
) : PageAsync<OtaUpdateListResponse> {

    /**
     * Delegates to [OtaUpdateListPageResponse], but gracefully handles missing data.
     *
     * @see OtaUpdateListPageResponse.data
     */
    fun data(): List<OtaUpdateListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OtaUpdateListPageResponse], but gracefully handles missing data.
     *
     * @see OtaUpdateListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<OtaUpdateListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): OtaUpdateListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<OtaUpdateListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OtaUpdateListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OtaUpdateListParams = params

    /** The response that this page was parsed from. */
    fun response(): OtaUpdateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OtaUpdateListPageAsync].
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

    /** A builder for [OtaUpdateListPageAsync]. */
    class Builder internal constructor() {

        private var service: OtaUpdateServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OtaUpdateListParams? = null
        private var response: OtaUpdateListPageResponse? = null

        @JvmSynthetic
        internal fun from(otaUpdateListPageAsync: OtaUpdateListPageAsync) = apply {
            service = otaUpdateListPageAsync.service
            streamHandlerExecutor = otaUpdateListPageAsync.streamHandlerExecutor
            params = otaUpdateListPageAsync.params
            response = otaUpdateListPageAsync.response
        }

        fun service(service: OtaUpdateServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OtaUpdateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OtaUpdateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OtaUpdateListPageAsync].
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
        fun build(): OtaUpdateListPageAsync =
            OtaUpdateListPageAsync(
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

        return other is OtaUpdateListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OtaUpdateListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
