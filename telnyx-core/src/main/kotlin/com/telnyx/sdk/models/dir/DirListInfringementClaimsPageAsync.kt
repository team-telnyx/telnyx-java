// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.DirServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DirServiceAsync.listInfringementClaims */
class DirListInfringementClaimsPageAsync
private constructor(
    private val service: DirServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DirListInfringementClaimsParams,
    private val response: DirListInfringementClaimsPageResponse,
) : PageAsync<DirListInfringementClaimsResponse> {

    /**
     * Delegates to [DirListInfringementClaimsPageResponse], but gracefully handles missing data.
     *
     * @see DirListInfringementClaimsPageResponse.data
     */
    fun data(): List<DirListInfringementClaimsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DirListInfringementClaimsPageResponse], but gracefully handles missing data.
     *
     * @see DirListInfringementClaimsPageResponse.meta
     */
    fun meta(): Optional<DirListInfringementClaimsPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<DirListInfringementClaimsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): DirListInfringementClaimsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DirListInfringementClaimsPageAsync> =
        service.listInfringementClaims(nextPageParams())

    fun autoPager(): AutoPagerAsync<DirListInfringementClaimsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DirListInfringementClaimsParams = params

    /** The response that this page was parsed from. */
    fun response(): DirListInfringementClaimsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DirListInfringementClaimsPageAsync].
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

    /** A builder for [DirListInfringementClaimsPageAsync]. */
    class Builder internal constructor() {

        private var service: DirServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DirListInfringementClaimsParams? = null
        private var response: DirListInfringementClaimsPageResponse? = null

        @JvmSynthetic
        internal fun from(dirListInfringementClaimsPageAsync: DirListInfringementClaimsPageAsync) =
            apply {
                service = dirListInfringementClaimsPageAsync.service
                streamHandlerExecutor = dirListInfringementClaimsPageAsync.streamHandlerExecutor
                params = dirListInfringementClaimsPageAsync.params
                response = dirListInfringementClaimsPageAsync.response
            }

        fun service(service: DirServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DirListInfringementClaimsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DirListInfringementClaimsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DirListInfringementClaimsPageAsync].
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
        fun build(): DirListInfringementClaimsPageAsync =
            DirListInfringementClaimsPageAsync(
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

        return other is DirListInfringementClaimsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DirListInfringementClaimsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
