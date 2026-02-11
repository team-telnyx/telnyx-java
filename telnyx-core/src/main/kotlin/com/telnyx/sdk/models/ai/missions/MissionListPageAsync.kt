// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.async.ai.MissionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MissionServiceAsync.list */
class MissionListPageAsync
private constructor(
    private val service: MissionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MissionListParams,
    private val response: MissionListPageResponse,
) : PageAsync<MissionListResponse> {

    /**
     * Delegates to [MissionListPageResponse], but gracefully handles missing data.
     *
     * @see MissionListPageResponse.data
     */
    fun data(): List<MissionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MissionListPageResponse], but gracefully handles missing data.
     *
     * @see MissionListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<MissionListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MissionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MissionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MissionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MissionListParams = params

    /** The response that this page was parsed from. */
    fun response(): MissionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MissionListPageAsync].
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

    /** A builder for [MissionListPageAsync]. */
    class Builder internal constructor() {

        private var service: MissionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MissionListParams? = null
        private var response: MissionListPageResponse? = null

        @JvmSynthetic
        internal fun from(missionListPageAsync: MissionListPageAsync) = apply {
            service = missionListPageAsync.service
            streamHandlerExecutor = missionListPageAsync.streamHandlerExecutor
            params = missionListPageAsync.params
            response = missionListPageAsync.response
        }

        fun service(service: MissionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MissionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MissionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MissionListPageAsync].
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
        fun build(): MissionListPageAsync =
            MissionListPageAsync(
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

        return other is MissionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MissionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
