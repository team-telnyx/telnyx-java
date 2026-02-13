// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.blocking.ai.missions.RunService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RunService.list */
class RunListPage
private constructor(
    private val service: RunService,
    private val params: RunListParams,
    private val response: RunListPageResponse,
) : Page<RunListResponse> {

    /**
     * Delegates to [RunListPageResponse], but gracefully handles missing data.
     *
     * @see RunListPageResponse.data
     */
    fun data(): List<RunListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunListPageResponse], but gracefully handles missing data.
     *
     * @see RunListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<RunListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RunListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): RunListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RunListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RunListParams = params

    /** The response that this page was parsed from. */
    fun response(): RunListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunListPage].
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

    /** A builder for [RunListPage]. */
    class Builder internal constructor() {

        private var service: RunService? = null
        private var params: RunListParams? = null
        private var response: RunListPageResponse? = null

        @JvmSynthetic
        internal fun from(runListPage: RunListPage) = apply {
            service = runListPage.service
            params = runListPage.params
            response = runListPage.response
        }

        fun service(service: RunService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RunListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunListPage].
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
        fun build(): RunListPage =
            RunListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "RunListPage{service=$service, params=$params, response=$response}"
}
