// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insightgroups

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.blocking.ai.conversations.InsightGroupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InsightGroupService.retrieveInsightGroups */
class InsightGroupRetrieveInsightGroupsPage
private constructor(
    private val service: InsightGroupService,
    private val params: InsightGroupRetrieveInsightGroupsParams,
    private val response: InsightGroupRetrieveInsightGroupsPageResponse,
) : Page<InsightTemplateGroup> {

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

    override fun nextPage(): InsightGroupRetrieveInsightGroupsPage =
        service.retrieveInsightGroups(nextPageParams())

    fun autoPager(): AutoPager<InsightTemplateGroup> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InsightGroupRetrieveInsightGroupsParams = params

    /** The response that this page was parsed from. */
    fun response(): InsightGroupRetrieveInsightGroupsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InsightGroupRetrieveInsightGroupsPage].
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

    /** A builder for [InsightGroupRetrieveInsightGroupsPage]. */
    class Builder internal constructor() {

        private var service: InsightGroupService? = null
        private var params: InsightGroupRetrieveInsightGroupsParams? = null
        private var response: InsightGroupRetrieveInsightGroupsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            insightGroupRetrieveInsightGroupsPage: InsightGroupRetrieveInsightGroupsPage
        ) = apply {
            service = insightGroupRetrieveInsightGroupsPage.service
            params = insightGroupRetrieveInsightGroupsPage.params
            response = insightGroupRetrieveInsightGroupsPage.response
        }

        fun service(service: InsightGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InsightGroupRetrieveInsightGroupsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InsightGroupRetrieveInsightGroupsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InsightGroupRetrieveInsightGroupsPage].
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
        fun build(): InsightGroupRetrieveInsightGroupsPage =
            InsightGroupRetrieveInsightGroupsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightGroupRetrieveInsightGroupsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InsightGroupRetrieveInsightGroupsPage{service=$service, params=$params, response=$response}"
}
