// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging.rcs.agents

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.rcsagents.RcsAgent
import com.telnyx.sdk.services.blocking.messaging.rcs.AgentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AgentService.list */
class AgentListPage
private constructor(
    private val service: AgentService,
    private val params: AgentListParams,
    private val response: AgentListPageResponse,
) : Page<RcsAgent> {

    /**
     * Delegates to [AgentListPageResponse], but gracefully handles missing data.
     *
     * @see AgentListPageResponse.data
     */
    fun data(): List<RcsAgent> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AgentListPageResponse], but gracefully handles missing data.
     *
     * @see AgentListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RcsAgent> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AgentListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): AgentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RcsAgent> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentListPage].
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

    /** A builder for [AgentListPage]. */
    class Builder internal constructor() {

        private var service: AgentService? = null
        private var params: AgentListParams? = null
        private var response: AgentListPageResponse? = null

        @JvmSynthetic
        internal fun from(agentListPage: AgentListPage) = apply {
            service = agentListPage.service
            params = agentListPage.params
            response = agentListPage.response
        }

        fun service(service: AgentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentListPage].
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
        fun build(): AgentListPage =
            AgentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "AgentListPage{service=$service, params=$params, response=$response}"
}
