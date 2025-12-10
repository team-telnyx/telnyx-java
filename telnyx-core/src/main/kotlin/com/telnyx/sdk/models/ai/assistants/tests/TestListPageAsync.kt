// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.async.ai.assistants.TestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TestServiceAsync.list */
class TestListPageAsync
private constructor(
    private val service: TestServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TestListParams,
    private val response: TestListPageResponse,
) : PageAsync<AssistantTest> {

    /**
     * Delegates to [TestListPageResponse], but gracefully handles missing data.
     *
     * @see TestListPageResponse.data
     */
    fun data(): List<AssistantTest> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TestListPageResponse], but gracefully handles missing data.
     *
     * @see TestListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<AssistantTest> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount =
            meta()
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): TestListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TestListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AssistantTest> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TestListParams = params

    /** The response that this page was parsed from. */
    fun response(): TestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TestListPageAsync].
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

    /** A builder for [TestListPageAsync]. */
    class Builder internal constructor() {

        private var service: TestServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TestListParams? = null
        private var response: TestListPageResponse? = null

        @JvmSynthetic
        internal fun from(testListPageAsync: TestListPageAsync) = apply {
            service = testListPageAsync.service
            streamHandlerExecutor = testListPageAsync.streamHandlerExecutor
            params = testListPageAsync.params
            response = testListPageAsync.response
        }

        fun service(service: TestServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TestListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TestListPageAsync].
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
        fun build(): TestListPageAsync =
            TestListPageAsync(
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

        return other is TestListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TestListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
