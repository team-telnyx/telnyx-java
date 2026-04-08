// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.EnterpriseServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EnterpriseServiceAsync.list */
class EnterpriseListPageAsync
private constructor(
    private val service: EnterpriseServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EnterpriseListParams,
    private val response: EnterpriseListPageResponse,
) : PageAsync<EnterpriseListResponse> {

    /**
     * Delegates to [EnterpriseListPageResponse], but gracefully handles missing data.
     *
     * @see EnterpriseListPageResponse.data
     */
    fun data(): List<EnterpriseListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EnterpriseListPageResponse], but gracefully handles missing data.
     *
     * @see EnterpriseListPageResponse.meta
     */
    fun meta(): Optional<EnterpriseListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EnterpriseListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): EnterpriseListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<EnterpriseListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EnterpriseListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EnterpriseListParams = params

    /** The response that this page was parsed from. */
    fun response(): EnterpriseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EnterpriseListPageAsync].
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

    /** A builder for [EnterpriseListPageAsync]. */
    class Builder internal constructor() {

        private var service: EnterpriseServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EnterpriseListParams? = null
        private var response: EnterpriseListPageResponse? = null

        @JvmSynthetic
        internal fun from(enterpriseListPageAsync: EnterpriseListPageAsync) = apply {
            service = enterpriseListPageAsync.service
            streamHandlerExecutor = enterpriseListPageAsync.streamHandlerExecutor
            params = enterpriseListPageAsync.params
            response = enterpriseListPageAsync.response
        }

        fun service(service: EnterpriseServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EnterpriseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EnterpriseListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EnterpriseListPageAsync].
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
        fun build(): EnterpriseListPageAsync =
            EnterpriseListPageAsync(
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

        return other is EnterpriseListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EnterpriseListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
