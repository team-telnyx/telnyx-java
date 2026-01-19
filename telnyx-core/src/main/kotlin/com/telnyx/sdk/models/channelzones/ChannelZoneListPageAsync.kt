// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.channelzones

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.ChannelZoneServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ChannelZoneServiceAsync.list */
class ChannelZoneListPageAsync
private constructor(
    private val service: ChannelZoneServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ChannelZoneListParams,
    private val response: ChannelZoneListPageResponse,
) : PageAsync<ChannelZoneListResponse> {

    /**
     * Delegates to [ChannelZoneListPageResponse], but gracefully handles missing data.
     *
     * @see ChannelZoneListPageResponse.data
     */
    fun data(): List<ChannelZoneListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ChannelZoneListPageResponse], but gracefully handles missing data.
     *
     * @see ChannelZoneListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ChannelZoneListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ChannelZoneListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ChannelZoneListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ChannelZoneListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ChannelZoneListParams = params

    /** The response that this page was parsed from. */
    fun response(): ChannelZoneListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelZoneListPageAsync].
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

    /** A builder for [ChannelZoneListPageAsync]. */
    class Builder internal constructor() {

        private var service: ChannelZoneServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ChannelZoneListParams? = null
        private var response: ChannelZoneListPageResponse? = null

        @JvmSynthetic
        internal fun from(channelZoneListPageAsync: ChannelZoneListPageAsync) = apply {
            service = channelZoneListPageAsync.service
            streamHandlerExecutor = channelZoneListPageAsync.streamHandlerExecutor
            params = channelZoneListPageAsync.params
            response = channelZoneListPageAsync.response
        }

        fun service(service: ChannelZoneServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ChannelZoneListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ChannelZoneListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ChannelZoneListPageAsync].
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
        fun build(): ChannelZoneListPageAsync =
            ChannelZoneListPageAsync(
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

        return other is ChannelZoneListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ChannelZoneListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
