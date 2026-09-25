// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.collections.sources.Source
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import com.telnyx.sdk.services.async.ai.memory.namespaces.profiles.SourceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SourceServiceAsync.list */
class SourceListPageAsync
private constructor(
    private val service: SourceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SourceListParams,
    private val response: SourceListPageResponse,
) : PageAsync<Source> {

    /**
     * Delegates to [SourceListPageResponse], but gracefully handles missing data.
     *
     * @see SourceListPageResponse.data
     */
    fun data(): List<Source> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SourceListPageResponse], but gracefully handles missing data.
     *
     * @see SourceListPageResponse.meta
     */
    fun meta(): Optional<PageMeta> = response._meta().getOptional("meta")

    override fun items(): List<Source> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): SourceListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SourceListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Source> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SourceListParams = params

    /** The response that this page was parsed from. */
    fun response(): SourceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SourceListPageAsync].
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

    /** A builder for [SourceListPageAsync]. */
    class Builder internal constructor() {

        private var service: SourceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SourceListParams? = null
        private var response: SourceListPageResponse? = null

        @JvmSynthetic
        internal fun from(sourceListPageAsync: SourceListPageAsync) = apply {
            service = sourceListPageAsync.service
            streamHandlerExecutor = sourceListPageAsync.streamHandlerExecutor
            params = sourceListPageAsync.params
            response = sourceListPageAsync.response
        }

        fun service(service: SourceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SourceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SourceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SourceListPageAsync].
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
        fun build(): SourceListPageAsync =
            SourceListPageAsync(
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

        return other is SourceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SourceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
