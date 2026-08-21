// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.EmailEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EmailEventServiceAsync.list */
class EmailEventListPageAsync
private constructor(
    private val service: EmailEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailEventListParams,
    private val response: EmailEventListPageResponse,
) : PageAsync<EmailEventListResponse> {

    /**
     * Delegates to [EmailEventListPageResponse], but gracefully handles missing data.
     *
     * @see EmailEventListPageResponse.data
     */
    fun data(): List<EmailEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailEventListPageResponse], but gracefully handles missing data.
     *
     * @see EmailEventListPageResponse.meta
     */
    fun meta(): Optional<EmailEventListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EmailEventListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailEventListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EmailEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailEventListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailEventListPageAsync].
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

    /** A builder for [EmailEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailEventListParams? = null
        private var response: EmailEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailEventListPageAsync: EmailEventListPageAsync) = apply {
            service = emailEventListPageAsync.service
            streamHandlerExecutor = emailEventListPageAsync.streamHandlerExecutor
            params = emailEventListPageAsync.params
            response = emailEventListPageAsync.response
        }

        fun service(service: EmailEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailEventListPageAsync].
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
        fun build(): EmailEventListPageAsync =
            EmailEventListPageAsync(
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

        return other is EmailEventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
