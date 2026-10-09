// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.deleted

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.async.ai.assistants.DeletedServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DeletedServiceAsync.list */
class DeletedListPageAsync
private constructor(
    private val service: DeletedServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DeletedListParams,
    private val response: DeletedListPageResponse,
) : PageAsync<DeletedAssistant> {

    /**
     * Delegates to [DeletedListPageResponse], but gracefully handles missing data.
     *
     * @see DeletedListPageResponse.data
     */
    fun data(): List<DeletedAssistant> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DeletedListPageResponse], but gracefully handles missing data.
     *
     * @see DeletedListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<DeletedAssistant> = data()

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

    fun nextPageParams(): DeletedListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DeletedListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DeletedAssistant> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DeletedListParams = params

    /** The response that this page was parsed from. */
    fun response(): DeletedListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DeletedListPageAsync].
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

    /** A builder for [DeletedListPageAsync]. */
    class Builder internal constructor() {

        private var service: DeletedServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DeletedListParams? = null
        private var response: DeletedListPageResponse? = null

        @JvmSynthetic
        internal fun from(deletedListPageAsync: DeletedListPageAsync) = apply {
            service = deletedListPageAsync.service
            streamHandlerExecutor = deletedListPageAsync.streamHandlerExecutor
            params = deletedListPageAsync.params
            response = deletedListPageAsync.response
        }

        fun service(service: DeletedServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DeletedListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DeletedListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DeletedListPageAsync].
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
        fun build(): DeletedListPageAsync =
            DeletedListPageAsync(
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

        return other is DeletedListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DeletedListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
