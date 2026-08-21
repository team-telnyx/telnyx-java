// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.models.webhooks.InboundMessage
import com.telnyx.sdk.services.async.emailinboxes.MessageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MessageServiceAsync.list */
class MessageListPageAsync
private constructor(
    private val service: MessageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessageListParams,
    private val response: MessageListPageResponse,
) : PageAsync<InboundMessage> {

    /**
     * Delegates to [MessageListPageResponse], but gracefully handles missing data.
     *
     * @see MessageListPageResponse.data
     */
    fun data(): List<InboundMessage> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessageListPageResponse], but gracefully handles missing data.
     *
     * @see MessageListPageResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<InboundMessage> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): MessageListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MessageListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundMessage> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessageListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageListPageAsync].
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

    /** A builder for [MessageListPageAsync]. */
    class Builder internal constructor() {

        private var service: MessageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessageListParams? = null
        private var response: MessageListPageResponse? = null

        @JvmSynthetic
        internal fun from(messageListPageAsync: MessageListPageAsync) = apply {
            service = messageListPageAsync.service
            streamHandlerExecutor = messageListPageAsync.streamHandlerExecutor
            params = messageListPageAsync.params
            response = messageListPageAsync.response
        }

        fun service(service: MessageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MessageListPageAsync].
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
        fun build(): MessageListPageAsync =
            MessageListPageAsync(
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

        return other is MessageListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
