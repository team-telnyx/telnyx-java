// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.async.AlphanumericSenderIdServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AlphanumericSenderIdServiceAsync.list */
class AlphanumericSenderIdListPageAsync
private constructor(
    private val service: AlphanumericSenderIdServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AlphanumericSenderIdListParams,
    private val response: AlphanumericSenderIdListPageResponse,
) : PageAsync<AlphanumericSenderIdListResponse> {

    /**
     * Delegates to [AlphanumericSenderIdListPageResponse], but gracefully handles missing data.
     *
     * @see AlphanumericSenderIdListPageResponse.data
     */
    fun data(): List<AlphanumericSenderIdListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AlphanumericSenderIdListPageResponse], but gracefully handles missing data.
     *
     * @see AlphanumericSenderIdListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<AlphanumericSenderIdListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AlphanumericSenderIdListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AlphanumericSenderIdListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AlphanumericSenderIdListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AlphanumericSenderIdListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlphanumericSenderIdListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AlphanumericSenderIdListPageAsync].
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

    /** A builder for [AlphanumericSenderIdListPageAsync]. */
    class Builder internal constructor() {

        private var service: AlphanumericSenderIdServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AlphanumericSenderIdListParams? = null
        private var response: AlphanumericSenderIdListPageResponse? = null

        @JvmSynthetic
        internal fun from(alphanumericSenderIdListPageAsync: AlphanumericSenderIdListPageAsync) =
            apply {
                service = alphanumericSenderIdListPageAsync.service
                streamHandlerExecutor = alphanumericSenderIdListPageAsync.streamHandlerExecutor
                params = alphanumericSenderIdListPageAsync.params
                response = alphanumericSenderIdListPageAsync.response
            }

        fun service(service: AlphanumericSenderIdServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AlphanumericSenderIdListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlphanumericSenderIdListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AlphanumericSenderIdListPageAsync].
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
        fun build(): AlphanumericSenderIdListPageAsync =
            AlphanumericSenderIdListPageAsync(
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

        return other is AlphanumericSenderIdListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AlphanumericSenderIdListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
