// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.EmailInboxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EmailInboxServiceAsync.list */
class EmailInboxListPageAsync
private constructor(
    private val service: EmailInboxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailInboxListParams,
    private val response: EmailInboxListPageResponse,
) : PageAsync<EmailInbox> {

    /**
     * Delegates to [EmailInboxListPageResponse], but gracefully handles missing data.
     *
     * @see EmailInboxListPageResponse.data
     */
    fun data(): List<EmailInbox> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailInboxListPageResponse], but gracefully handles missing data.
     *
     * @see EmailInboxListPageResponse.meta
     */
    fun meta(): Optional<EmailInboxListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EmailInbox> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailInboxListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EmailInboxListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailInbox> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailInboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailInboxListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailInboxListPageAsync].
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

    /** A builder for [EmailInboxListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailInboxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailInboxListParams? = null
        private var response: EmailInboxListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailInboxListPageAsync: EmailInboxListPageAsync) = apply {
            service = emailInboxListPageAsync.service
            streamHandlerExecutor = emailInboxListPageAsync.streamHandlerExecutor
            params = emailInboxListPageAsync.params
            response = emailInboxListPageAsync.response
        }

        fun service(service: EmailInboxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailInboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailInboxListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailInboxListPageAsync].
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
        fun build(): EmailInboxListPageAsync =
            EmailInboxListPageAsync(
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

        return other is EmailInboxListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailInboxListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
