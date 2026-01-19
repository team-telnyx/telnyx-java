// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.messagingtollfree.verification.RequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RequestServiceAsync.list */
class RequestListPageAsync
private constructor(
    private val service: RequestServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RequestListParams,
    private val response: RequestListPageResponse,
) : PageAsync<VerificationRequestStatus> {

    /**
     * Delegates to [RequestListPageResponse], but gracefully handles missing data.
     *
     * @see RequestListPageResponse.records
     */
    fun records(): List<VerificationRequestStatus> =
        response._records().getOptional("records").getOrNull() ?: emptyList()

    /**
     * Delegates to [RequestListPageResponse], but gracefully handles missing data.
     *
     * @see RequestListPageResponse.totalRecords
     */
    fun totalRecords(): Optional<Long> = response._totalRecords().getOptional("total_records")

    override fun items(): List<VerificationRequestStatus> = records()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RequestListParams {
        val pageNumber = params.page() // cc workaround for SDK-4053
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RequestListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VerificationRequestStatus> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): RequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RequestListPageAsync].
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

    /** A builder for [RequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: RequestServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RequestListParams? = null
        private var response: RequestListPageResponse? = null

        @JvmSynthetic
        internal fun from(requestListPageAsync: RequestListPageAsync) = apply {
            service = requestListPageAsync.service
            streamHandlerExecutor = requestListPageAsync.streamHandlerExecutor
            params = requestListPageAsync.params
            response = requestListPageAsync.response
        }

        fun service(service: RequestServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RequestListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RequestListPageAsync].
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
        fun build(): RequestListPageAsync =
            RequestListPageAsync(
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

        return other is RequestListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RequestListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
