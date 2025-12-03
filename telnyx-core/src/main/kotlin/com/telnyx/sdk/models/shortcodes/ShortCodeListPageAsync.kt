// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.shortcodes

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ShortCode
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.ShortCodeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ShortCodeServiceAsync.list */
class ShortCodeListPageAsync
private constructor(
    private val service: ShortCodeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ShortCodeListParams,
    private val response: ShortCodeListPageResponse,
) : PageAsync<ShortCode> {

    /**
     * Delegates to [ShortCodeListPageResponse], but gracefully handles missing data.
     *
     * @see ShortCodeListPageResponse.data
     */
    fun data(): List<ShortCode> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ShortCodeListPageResponse], but gracefully handles missing data.
     *
     * @see ShortCodeListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ShortCode> = data()

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

    fun nextPageParams(): ShortCodeListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ShortCodeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ShortCode> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ShortCodeListParams = params

    /** The response that this page was parsed from. */
    fun response(): ShortCodeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShortCodeListPageAsync].
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

    /** A builder for [ShortCodeListPageAsync]. */
    class Builder internal constructor() {

        private var service: ShortCodeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ShortCodeListParams? = null
        private var response: ShortCodeListPageResponse? = null

        @JvmSynthetic
        internal fun from(shortCodeListPageAsync: ShortCodeListPageAsync) = apply {
            service = shortCodeListPageAsync.service
            streamHandlerExecutor = shortCodeListPageAsync.streamHandlerExecutor
            params = shortCodeListPageAsync.params
            response = shortCodeListPageAsync.response
        }

        fun service(service: ShortCodeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ShortCodeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShortCodeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShortCodeListPageAsync].
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
        fun build(): ShortCodeListPageAsync =
            ShortCodeListPageAsync(
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

        return other is ShortCodeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ShortCodeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
