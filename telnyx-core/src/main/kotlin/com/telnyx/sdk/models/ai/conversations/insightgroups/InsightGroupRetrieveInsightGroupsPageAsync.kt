// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insightgroups

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.async.ai.conversations.InsightGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InsightGroupServiceAsync.retrieveInsightGroups */
class InsightGroupRetrieveInsightGroupsPageAsync
private constructor(
    private val service: InsightGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InsightGroupRetrieveInsightGroupsParams,
    private val response: InsightGroupRetrieveInsightGroupsPageResponse,
) : PageAsync<InsightTemplateGroup> {

    /**
     * Delegates to [InsightGroupRetrieveInsightGroupsPageResponse], but gracefully handles missing
     * data.
     *
     * @see InsightGroupRetrieveInsightGroupsPageResponse.data
     */
    fun data(): List<InsightTemplateGroup> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InsightGroupRetrieveInsightGroupsPageResponse], but gracefully handles missing
     * data.
     *
     * @see InsightGroupRetrieveInsightGroupsPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<InsightTemplateGroup> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): InsightGroupRetrieveInsightGroupsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<InsightGroupRetrieveInsightGroupsPageAsync> =
        service.retrieveInsightGroups(nextPageParams())

    fun autoPager(): AutoPagerAsync<InsightTemplateGroup> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InsightGroupRetrieveInsightGroupsParams = params

    /** The response that this page was parsed from. */
    fun response(): InsightGroupRetrieveInsightGroupsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InsightGroupRetrieveInsightGroupsPageAsync].
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

    /** A builder for [InsightGroupRetrieveInsightGroupsPageAsync]. */
    class Builder internal constructor() {

        private var service: InsightGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InsightGroupRetrieveInsightGroupsParams? = null
        private var response: InsightGroupRetrieveInsightGroupsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            insightGroupRetrieveInsightGroupsPageAsync: InsightGroupRetrieveInsightGroupsPageAsync
        ) = apply {
            service = insightGroupRetrieveInsightGroupsPageAsync.service
            streamHandlerExecutor = insightGroupRetrieveInsightGroupsPageAsync.streamHandlerExecutor
            params = insightGroupRetrieveInsightGroupsPageAsync.params
            response = insightGroupRetrieveInsightGroupsPageAsync.response
        }

        fun service(service: InsightGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InsightGroupRetrieveInsightGroupsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InsightGroupRetrieveInsightGroupsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InsightGroupRetrieveInsightGroupsPageAsync].
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
        fun build(): InsightGroupRetrieveInsightGroupsPageAsync =
            InsightGroupRetrieveInsightGroupsPageAsync(
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

        return other is InsightGroupRetrieveInsightGroupsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InsightGroupRetrieveInsightGroupsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
