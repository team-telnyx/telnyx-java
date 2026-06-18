// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.loaconfigurations

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.porting.LoaConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see LoaConfigurationServiceAsync.list */
class LoaConfigurationListPageAsync
private constructor(
    private val service: LoaConfigurationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LoaConfigurationListParams,
    private val response: LoaConfigurationListPageResponse,
) : PageAsync<PortingLoaConfiguration> {

    /**
     * Delegates to [LoaConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see LoaConfigurationListPageResponse.data
     */
    fun data(): List<PortingLoaConfiguration> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LoaConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see LoaConfigurationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingLoaConfiguration> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): LoaConfigurationListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<LoaConfigurationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortingLoaConfiguration> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LoaConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): LoaConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LoaConfigurationListPageAsync].
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

    /** A builder for [LoaConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: LoaConfigurationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LoaConfigurationListParams? = null
        private var response: LoaConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(loaConfigurationListPageAsync: LoaConfigurationListPageAsync) = apply {
            service = loaConfigurationListPageAsync.service
            streamHandlerExecutor = loaConfigurationListPageAsync.streamHandlerExecutor
            params = loaConfigurationListPageAsync.params
            response = loaConfigurationListPageAsync.response
        }

        fun service(service: LoaConfigurationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LoaConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LoaConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LoaConfigurationListPageAsync].
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
        fun build(): LoaConfigurationListPageAsync =
            LoaConfigurationListPageAsync(
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

        return other is LoaConfigurationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LoaConfigurationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
