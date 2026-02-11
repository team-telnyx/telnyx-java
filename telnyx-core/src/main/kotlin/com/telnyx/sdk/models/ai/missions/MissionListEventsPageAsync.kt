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

/** @see MissionServiceAsync.listEvents */
class MissionListEventsPageAsync
private constructor(
    private val service: MissionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MissionListEventsParams,
    private val response: MissionListEventsPageResponse,
) : PageAsync<MissionListEventsResponse> {

    /**
     * Delegates to [MissionListEventsPageResponse], but gracefully handles missing data.
     *
     * @see MissionListEventsPageResponse.data
     */
    fun data(): List<MissionListEventsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MissionListEventsPageResponse], but gracefully handles missing data.
     *
     * @see MissionListEventsPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<MissionListEventsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MissionListEventsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MissionListEventsPageAsync> =
        service.listEvents(nextPageParams())

    fun autoPager(): AutoPagerAsync<MissionListEventsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MissionListEventsParams = params

    /** The response that this page was parsed from. */
    fun response(): MissionListEventsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MissionListEventsPageAsync].
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

    /** A builder for [MissionListEventsPageAsync]. */
    class Builder internal constructor() {

        private var service: MissionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MissionListEventsParams? = null
        private var response: MissionListEventsPageResponse? = null

        @JvmSynthetic
        internal fun from(missionListEventsPageAsync: MissionListEventsPageAsync) = apply {
            service = missionListEventsPageAsync.service
            streamHandlerExecutor = missionListEventsPageAsync.streamHandlerExecutor
            params = missionListEventsPageAsync.params
            response = missionListEventsPageAsync.response
        }

        fun service(service: MissionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MissionListEventsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MissionListEventsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MissionListEventsPageAsync].
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
        fun build(): MissionListEventsPageAsync =
            MissionListEventsPageAsync(
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

        return other is MissionListEventsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MissionListEventsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
