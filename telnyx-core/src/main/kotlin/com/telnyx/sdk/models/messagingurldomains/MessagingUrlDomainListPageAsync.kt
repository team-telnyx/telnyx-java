// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingurldomains

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.async.MessagingUrlDomainServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingUrlDomainServiceAsync.list */
class MessagingUrlDomainListPageAsync
private constructor(
    private val service: MessagingUrlDomainServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingUrlDomainListParams,
    private val response: MessagingUrlDomainListPageResponse,
) : PageAsync<MessagingUrlDomainListResponse> {

    /**
     * Delegates to [MessagingUrlDomainListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingUrlDomainListPageResponse.data
     */
    fun data(): List<MessagingUrlDomainListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingUrlDomainListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingUrlDomainListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingUrlDomainListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessagingUrlDomainListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingUrlDomainListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MessagingUrlDomainListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingUrlDomainListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingUrlDomainListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingUrlDomainListPageAsync].
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

    /** A builder for [MessagingUrlDomainListPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingUrlDomainServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingUrlDomainListParams? = null
        private var response: MessagingUrlDomainListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingUrlDomainListPageAsync: MessagingUrlDomainListPageAsync) =
            apply {
                service = messagingUrlDomainListPageAsync.service
                streamHandlerExecutor = messagingUrlDomainListPageAsync.streamHandlerExecutor
                params = messagingUrlDomainListPageAsync.params
                response = messagingUrlDomainListPageAsync.response
            }

        fun service(service: MessagingUrlDomainServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingUrlDomainListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingUrlDomainListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingUrlDomainListPageAsync].
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
        fun build(): MessagingUrlDomainListPageAsync =
            MessagingUrlDomainListPageAsync(
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

        return other is MessagingUrlDomainListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingUrlDomainListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
