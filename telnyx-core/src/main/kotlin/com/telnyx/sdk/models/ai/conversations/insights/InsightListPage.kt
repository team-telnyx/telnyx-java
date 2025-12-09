// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.blocking.ai.conversations.InsightService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InsightService.list */
class InsightListPage
private constructor(
    private val service: InsightService,
    private val params: InsightListParams,
    private val response: InsightListPageResponse,
) : Page<InsightTemplate> {

    /**
     * Delegates to [InsightListPageResponse], but gracefully handles missing data.
     *
     * @see InsightListPageResponse.data
     */
    fun data(): List<InsightTemplate> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InsightListPageResponse], but gracefully handles missing data.
     *
     * @see InsightListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<InsightTemplate> = data()

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

    fun nextPageParams(): InsightListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): InsightListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InsightTemplate> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InsightListParams = params

    /** The response that this page was parsed from. */
    fun response(): InsightListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InsightListPage].
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

    /** A builder for [InsightListPage]. */
    class Builder internal constructor() {

        private var service: InsightService? = null
        private var params: InsightListParams? = null
        private var response: InsightListPageResponse? = null

        @JvmSynthetic
        internal fun from(insightListPage: InsightListPage) = apply {
            service = insightListPage.service
            params = insightListPage.params
            response = insightListPage.response
        }

        fun service(service: InsightService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InsightListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InsightListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InsightListPage].
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
        fun build(): InsightListPage =
            InsightListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InsightListPage{service=$service, params=$params, response=$response}"
}
