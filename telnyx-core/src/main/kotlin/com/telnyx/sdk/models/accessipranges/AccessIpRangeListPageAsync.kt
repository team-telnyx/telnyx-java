// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipranges

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.accessipaddress.PaginationMetaCloudflareIpListSync
import com.telnyx.sdk.services.async.AccessIpRangeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AccessIpRangeServiceAsync.list */
class AccessIpRangeListPageAsync
private constructor(
    private val service: AccessIpRangeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccessIpRangeListParams,
    private val response: AccessIpRangeListPageResponse,
) : PageAsync<AccessIpRange> {

    /**
     * Delegates to [AccessIpRangeListPageResponse], but gracefully handles missing data.
     *
     * @see AccessIpRangeListPageResponse.data
     */
    fun data(): List<AccessIpRange> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccessIpRangeListPageResponse], but gracefully handles missing data.
     *
     * @see AccessIpRangeListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaCloudflareIpListSync> = response._meta().getOptional("meta")

    override fun items(): List<AccessIpRange> = data()

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

    fun nextPageParams(): AccessIpRangeListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AccessIpRangeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccessIpRange> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccessIpRangeListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccessIpRangeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccessIpRangeListPageAsync].
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

    /** A builder for [AccessIpRangeListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccessIpRangeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccessIpRangeListParams? = null
        private var response: AccessIpRangeListPageResponse? = null

        @JvmSynthetic
        internal fun from(accessIpRangeListPageAsync: AccessIpRangeListPageAsync) = apply {
            service = accessIpRangeListPageAsync.service
            streamHandlerExecutor = accessIpRangeListPageAsync.streamHandlerExecutor
            params = accessIpRangeListPageAsync.params
            response = accessIpRangeListPageAsync.response
        }

        fun service(service: AccessIpRangeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccessIpRangeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccessIpRangeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccessIpRangeListPageAsync].
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
        fun build(): AccessIpRangeListPageAsync =
            AccessIpRangeListPageAsync(
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

        return other is AccessIpRangeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AccessIpRangeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
