// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.services.async.EmailMessageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EmailMessageServiceAsync.retrieveEvents */
class EmailMessageRetrieveEventsPageAsync
private constructor(
    private val service: EmailMessageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailMessageRetrieveEventsParams,
    private val response: EmailMessageRetrieveEventsPageResponse,
) : PageAsync<MessageEvent> {

    /**
     * Delegates to [EmailMessageRetrieveEventsPageResponse], but gracefully handles missing data.
     *
     * @see EmailMessageRetrieveEventsPageResponse.data
     */
    fun data(): List<MessageEvent> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailMessageRetrieveEventsPageResponse], but gracefully handles missing data.
     *
     * @see EmailMessageRetrieveEventsPageResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessageEvent> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailMessageRetrieveEventsParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EmailMessageRetrieveEventsPageAsync> =
        service.retrieveEvents(nextPageParams())

    fun autoPager(): AutoPagerAsync<MessageEvent> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailMessageRetrieveEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailMessageRetrieveEventsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EmailMessageRetrieveEventsPageAsync].
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

    /** A builder for [EmailMessageRetrieveEventsPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailMessageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailMessageRetrieveEventsParams? = null
        private var response: EmailMessageRetrieveEventsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            emailMessageRetrieveEventsPageAsync: EmailMessageRetrieveEventsPageAsync
        ) = apply {
            service = emailMessageRetrieveEventsPageAsync.service
            streamHandlerExecutor = emailMessageRetrieveEventsPageAsync.streamHandlerExecutor
            params = emailMessageRetrieveEventsPageAsync.params
            response = emailMessageRetrieveEventsPageAsync.response
        }

        fun service(service: EmailMessageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailMessageRetrieveEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailMessageRetrieveEventsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailMessageRetrieveEventsPageAsync].
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
        fun build(): EmailMessageRetrieveEventsPageAsync =
            EmailMessageRetrieveEventsPageAsync(
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

        return other is EmailMessageRetrieveEventsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailMessageRetrieveEventsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
