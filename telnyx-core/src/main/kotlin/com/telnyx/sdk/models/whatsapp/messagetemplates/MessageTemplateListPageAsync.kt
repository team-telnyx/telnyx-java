// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.messagetemplates

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.async.whatsapp.MessageTemplateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessageTemplateServiceAsync.list */
class MessageTemplateListPageAsync
private constructor(
    private val service: MessageTemplateServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessageTemplateListParams,
    private val response: MessageTemplateListPageResponse,
) : PageAsync<MessageTemplateListResponse> {

    /**
     * Delegates to [MessageTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see MessageTemplateListPageResponse.data
     */
    fun data(): List<MessageTemplateListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessageTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see MessageTemplateListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessageTemplateListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessageTemplateListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessageTemplateListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MessageTemplateListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessageTemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessageTemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageTemplateListPageAsync].
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

    /** A builder for [MessageTemplateListPageAsync]. */
    class Builder internal constructor() {

        private var service: MessageTemplateServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessageTemplateListParams? = null
        private var response: MessageTemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(messageTemplateListPageAsync: MessageTemplateListPageAsync) = apply {
            service = messageTemplateListPageAsync.service
            streamHandlerExecutor = messageTemplateListPageAsync.streamHandlerExecutor
            params = messageTemplateListPageAsync.params
            response = messageTemplateListPageAsync.response
        }

        fun service(service: MessageTemplateServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessageTemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessageTemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MessageTemplateListPageAsync].
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
        fun build(): MessageTemplateListPageAsync =
            MessageTemplateListPageAsync(
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

        return other is MessageTemplateListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessageTemplateListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
