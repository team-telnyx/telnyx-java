// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.blocking.ai.assistants.TestService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TestService.list */
class TestListPage
private constructor(
    private val service: TestService,
    private val params: TestListParams,
    private val response: TestListPageResponse,
) : Page<AssistantTest> {

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
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TestListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): TestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AssistantTest> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TestListParams = params

    /** The response that this page was parsed from. */
    fun response(): TestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TestListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestListPage]. */
    class Builder internal constructor() {

        private var service: TestService? = null
        private var params: TestListParams? = null
        private var response: TestListPageResponse? = null

        @JvmSynthetic
        internal fun from(testListPage: TestListPage) = apply {
            service = testListPage.service
            params = testListPage.params
            response = testListPage.response
        }

        fun service(service: TestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TestListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TestListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestListPage =
            TestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TestListPage{service=$service, params=$params, response=$response}"
}
