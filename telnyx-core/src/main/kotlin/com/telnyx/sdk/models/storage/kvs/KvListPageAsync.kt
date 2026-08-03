// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.storage.KvServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see KvServiceAsync.list */
class KvListPageAsync
private constructor(
    private val service: KvServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: KvListParams,
    private val response: KvListPageResponse,
) : PageAsync<KvNamespace> {

    /**
     * Delegates to [KvListPageResponse], but gracefully handles missing data.
     *
     * @see KvListPageResponse.data
     */
    fun data(): List<KvNamespace> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [KvListPageResponse], but gracefully handles missing data.
     *
     * @see KvListPageResponse.meta
     */
    fun meta(): Optional<KvListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<KvNamespace> = data()

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

    fun nextPageParams(): KvListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<KvListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<KvNamespace> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): KvListParams = params

    /** The response that this page was parsed from. */
    fun response(): KvListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KvListPageAsync].
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

    /** A builder for [KvListPageAsync]. */
    class Builder internal constructor() {

        private var service: KvServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: KvListParams? = null
        private var response: KvListPageResponse? = null

        @JvmSynthetic
        internal fun from(kvListPageAsync: KvListPageAsync) = apply {
            service = kvListPageAsync.service
            streamHandlerExecutor = kvListPageAsync.streamHandlerExecutor
            params = kvListPageAsync.params
            response = kvListPageAsync.response
        }

        fun service(service: KvServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: KvListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: KvListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [KvListPageAsync].
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
        fun build(): KvListPageAsync =
            KvListPageAsync(
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

        return other is KvListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "KvListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
