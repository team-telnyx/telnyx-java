// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import com.telnyx.sdk.services.async.externalconnections.ReleaseServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ReleaseServiceAsync.list */
class ReleaseListPageAsync
private constructor(
    private val service: ReleaseServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReleaseListParams,
    private val response: ReleaseListPageResponse,
) : PageAsync<ReleaseListResponse> {

    /**
     * Delegates to [ReleaseListPageResponse], but gracefully handles missing data.
     *
     * @see ReleaseListPageResponse.data
     */
    fun data(): List<ReleaseListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReleaseListPageResponse], but gracefully handles missing data.
     *
     * @see ReleaseListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<ReleaseListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ReleaseListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ReleaseListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ReleaseListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReleaseListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReleaseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReleaseListPageAsync].
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

    /** A builder for [ReleaseListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReleaseServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReleaseListParams? = null
        private var response: ReleaseListPageResponse? = null

        @JvmSynthetic
        internal fun from(releaseListPageAsync: ReleaseListPageAsync) = apply {
            service = releaseListPageAsync.service
            streamHandlerExecutor = releaseListPageAsync.streamHandlerExecutor
            params = releaseListPageAsync.params
            response = releaseListPageAsync.response
        }

        fun service(service: ReleaseServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReleaseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReleaseListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReleaseListPageAsync].
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
        fun build(): ReleaseListPageAsync =
            ReleaseListPageAsync(
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

        return other is ReleaseListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ReleaseListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
