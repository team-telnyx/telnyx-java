// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.EmailBlockServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EmailBlockServiceAsync.retrieveEvents */
class EmailBlockRetrieveEventsPageAsync
private constructor(
    private val service: EmailBlockServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmailBlockRetrieveEventsParams,
    private val response: EmailBlockRetrieveEventsPageResponse,
) : PageAsync<EmailBlockRetrieveEventsResponse> {

    /**
     * Delegates to [EmailBlockRetrieveEventsPageResponse], but gracefully handles missing data.
     *
     * @see EmailBlockRetrieveEventsPageResponse.data
     */
    fun data(): List<EmailBlockRetrieveEventsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailBlockRetrieveEventsPageResponse], but gracefully handles missing data.
     *
     * @see EmailBlockRetrieveEventsPageResponse.meta
     */
    fun meta(): Optional<OffsetMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailBlockRetrieveEventsResponse> = data()

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

    fun nextPageParams(): EmailBlockRetrieveEventsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<EmailBlockRetrieveEventsPageAsync> =
        service.retrieveEvents(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailBlockRetrieveEventsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmailBlockRetrieveEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailBlockRetrieveEventsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EmailBlockRetrieveEventsPageAsync].
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

    /** A builder for [EmailBlockRetrieveEventsPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailBlockServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmailBlockRetrieveEventsParams? = null
        private var response: EmailBlockRetrieveEventsPageResponse? = null

        @JvmSynthetic
        internal fun from(emailBlockRetrieveEventsPageAsync: EmailBlockRetrieveEventsPageAsync) =
            apply {
                service = emailBlockRetrieveEventsPageAsync.service
                streamHandlerExecutor = emailBlockRetrieveEventsPageAsync.streamHandlerExecutor
                params = emailBlockRetrieveEventsPageAsync.params
                response = emailBlockRetrieveEventsPageAsync.response
            }

        fun service(service: EmailBlockServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmailBlockRetrieveEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailBlockRetrieveEventsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailBlockRetrieveEventsPageAsync].
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
        fun build(): EmailBlockRetrieveEventsPageAsync =
            EmailBlockRetrieveEventsPageAsync(
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

        return other is EmailBlockRetrieveEventsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EmailBlockRetrieveEventsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
