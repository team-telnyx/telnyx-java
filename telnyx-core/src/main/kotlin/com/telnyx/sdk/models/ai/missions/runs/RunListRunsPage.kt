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

/** @see RunService.listRuns */
class RunListRunsPage
private constructor(
    private val service: RunService,
    private val params: RunListRunsParams,
    private val response: RunListRunsPageResponse,
) : Page<MissionRunData> {

    /**
     * Delegates to [RunListRunsPageResponse], but gracefully handles missing data.
     *
     * @see RunListRunsPageResponse.data
     */
    fun data(): List<MissionRunData> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunListRunsPageResponse], but gracefully handles missing data.
     *
     * @see RunListRunsPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<MissionRunData> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RunListRunsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): RunListRunsPage = service.listRuns(nextPageParams())

    fun autoPager(): AutoPager<MissionRunData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RunListRunsParams = params

    /** The response that this page was parsed from. */
    fun response(): RunListRunsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunListRunsPage].
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

    /** A builder for [RunListRunsPage]. */
    class Builder internal constructor() {

        private var service: RunService? = null
        private var params: RunListRunsParams? = null
        private var response: RunListRunsPageResponse? = null

        @JvmSynthetic
        internal fun from(runListRunsPage: RunListRunsPage) = apply {
            service = runListRunsPage.service
            params = runListRunsPage.params
            response = runListRunsPage.response
        }

        fun service(service: RunService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RunListRunsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunListRunsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunListRunsPage].
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
        fun build(): RunListRunsPage =
            RunListRunsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunListRunsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RunListRunsPage{service=$service, params=$params, response=$response}"
}
