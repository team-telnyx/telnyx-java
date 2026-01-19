// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.storage.buckets.usage.PaginationMetaSimple
import com.telnyx.sdk.services.async.WebhookDeliveryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WebhookDeliveryServiceAsync.list */
class WebhookDeliveryListPageAsync
private constructor(
    private val service: WebhookDeliveryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WebhookDeliveryListParams,
    private val response: WebhookDeliveryListPageResponse,
) : PageAsync<WebhookDeliveryListResponse> {

    /**
     * Delegates to [WebhookDeliveryListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookDeliveryListPageResponse.data
     */
    fun data(): List<WebhookDeliveryListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WebhookDeliveryListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookDeliveryListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaSimple> = response._meta().getOptional("meta")

    override fun items(): List<WebhookDeliveryListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): WebhookDeliveryListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<WebhookDeliveryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WebhookDeliveryListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WebhookDeliveryListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookDeliveryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookDeliveryListPageAsync].
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

    /** A builder for [WebhookDeliveryListPageAsync]. */
    class Builder internal constructor() {

        private var service: WebhookDeliveryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WebhookDeliveryListParams? = null
        private var response: WebhookDeliveryListPageResponse? = null

        @JvmSynthetic
        internal fun from(webhookDeliveryListPageAsync: WebhookDeliveryListPageAsync) = apply {
            service = webhookDeliveryListPageAsync.service
            streamHandlerExecutor = webhookDeliveryListPageAsync.streamHandlerExecutor
            params = webhookDeliveryListPageAsync.params
            response = webhookDeliveryListPageAsync.response
        }

        fun service(service: WebhookDeliveryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookDeliveryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookDeliveryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookDeliveryListPageAsync].
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
        fun build(): WebhookDeliveryListPageAsync =
            WebhookDeliveryListPageAsync(
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

        return other is WebhookDeliveryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WebhookDeliveryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
