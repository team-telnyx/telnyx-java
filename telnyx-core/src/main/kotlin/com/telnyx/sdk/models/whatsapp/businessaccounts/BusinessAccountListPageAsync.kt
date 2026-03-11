// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.async.whatsapp.BusinessAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BusinessAccountServiceAsync.list */
class BusinessAccountListPageAsync
private constructor(
    private val service: BusinessAccountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BusinessAccountListParams,
    private val response: BusinessAccountListPageResponse,
) : PageAsync<BusinessAccountListResponse> {

    /**
     * Delegates to [BusinessAccountListPageResponse], but gracefully handles missing data.
     *
     * @see BusinessAccountListPageResponse.data
     */
    fun data(): List<BusinessAccountListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BusinessAccountListPageResponse], but gracefully handles missing data.
     *
     * @see BusinessAccountListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<BusinessAccountListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): BusinessAccountListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<BusinessAccountListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BusinessAccountListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BusinessAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): BusinessAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BusinessAccountListPageAsync].
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

    /** A builder for [BusinessAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: BusinessAccountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BusinessAccountListParams? = null
        private var response: BusinessAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(businessAccountListPageAsync: BusinessAccountListPageAsync) = apply {
            service = businessAccountListPageAsync.service
            streamHandlerExecutor = businessAccountListPageAsync.streamHandlerExecutor
            params = businessAccountListPageAsync.params
            response = businessAccountListPageAsync.response
        }

        fun service(service: BusinessAccountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BusinessAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BusinessAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BusinessAccountListPageAsync].
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
        fun build(): BusinessAccountListPageAsync =
            BusinessAccountListPageAsync(
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

        return other is BusinessAccountListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BusinessAccountListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
