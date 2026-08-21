// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailthreads

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.models.emailinboxes.threads.InboundThread
import com.telnyx.sdk.models.emailinboxes.threads.InboundThreadListResponse
import com.telnyx.sdk.services.async.EmailThreadServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EmailThreadServiceAsync.list */
class EmailThreadListPageAsync
private constructor(
    private val service: EmailThreadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailThreadListParams,
    private val response: InboundThreadListResponse,
) : PageAsync<InboundThread> {

    /**
     * Delegates to [InboundThreadListResponse], but gracefully handles missing data.
     *
     * @see InboundThreadListResponse.data
     */
    fun data(): List<InboundThread> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundThreadListResponse], but gracefully handles missing data.
     *
     * @see InboundThreadListResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<InboundThread> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailThreadListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EmailThreadListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundThread> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailThreadListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundThreadListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailThreadListPageAsync].
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

    /** A builder for [EmailThreadListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailThreadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailThreadListParams? = null
        private var response: InboundThreadListResponse? = null

        @JvmSynthetic
        internal fun from(emailThreadListPageAsync: EmailThreadListPageAsync) = apply {
            service = emailThreadListPageAsync.service
            streamHandlerExecutor = emailThreadListPageAsync.streamHandlerExecutor
            params = emailThreadListPageAsync.params
            response = emailThreadListPageAsync.response
        }

        fun service(service: EmailThreadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailThreadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundThreadListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailThreadListPageAsync].
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
        fun build(): EmailThreadListPageAsync =
            EmailThreadListPageAsync(
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

        return other is EmailThreadListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailThreadListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
