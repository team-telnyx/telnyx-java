// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordings

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.RecordingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RecordingServiceAsync.list */
class RecordingListPageAsync
private constructor(
    private val service: RecordingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RecordingListParams,
    private val response: RecordingListPageResponse,
) : PageAsync<RecordingResponseData> {

    /**
     * Delegates to [RecordingListPageResponse], but gracefully handles missing data.
     *
     * @see RecordingListPageResponse.data
     */
    fun data(): List<RecordingResponseData> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RecordingListPageResponse], but gracefully handles missing data.
     *
     * @see RecordingListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RecordingResponseData> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RecordingListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RecordingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RecordingResponseData> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RecordingListParams = params

    /** The response that this page was parsed from. */
    fun response(): RecordingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RecordingListPageAsync].
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

    /** A builder for [RecordingListPageAsync]. */
    class Builder internal constructor() {

        private var service: RecordingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RecordingListParams? = null
        private var response: RecordingListPageResponse? = null

        @JvmSynthetic
        internal fun from(recordingListPageAsync: RecordingListPageAsync) = apply {
            service = recordingListPageAsync.service
            streamHandlerExecutor = recordingListPageAsync.streamHandlerExecutor
            params = recordingListPageAsync.params
            response = recordingListPageAsync.response
        }

        fun service(service: RecordingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RecordingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RecordingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RecordingListPageAsync].
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
        fun build(): RecordingListPageAsync =
            RecordingListPageAsync(
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

        return other is RecordingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RecordingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
