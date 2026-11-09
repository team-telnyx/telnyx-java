// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import com.telnyx.sdk.services.blocking.AgentGatewayService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AgentGatewayService.list */
class AgentGatewayListPage
private constructor(
    private val service: AgentGatewayService,
    private val params: AgentGatewayListParams,
    private val response: AgentGatewayListPageResponse,
) : Page<AgentGateway> {

    /**
     * Delegates to [AgentGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see AgentGatewayListPageResponse.data
     */
    fun data(): List<AgentGateway> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AgentGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see AgentGatewayListPageResponse.meta
     */
    fun meta(): Optional<PageMeta> = response._meta().getOptional("meta")

    override fun items(): List<AgentGateway> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AgentGatewayListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AgentGatewayListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AgentGateway> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgentGatewayListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentGatewayListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentGatewayListPage].
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

    /** A builder for [AgentGatewayListPage]. */
    class Builder internal constructor() {

        private var service: AgentGatewayService? = null
        private var params: AgentGatewayListParams? = null
        private var response: AgentGatewayListPageResponse? = null

        @JvmSynthetic
        internal fun from(agentGatewayListPage: AgentGatewayListPage) = apply {
            service = agentGatewayListPage.service
            params = agentGatewayListPage.params
            response = agentGatewayListPage.response
        }

        fun service(service: AgentGatewayService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgentGatewayListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentGatewayListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentGatewayListPage].
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
        fun build(): AgentGatewayListPage =
            AgentGatewayListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AgentGatewayListPage{service=$service, params=$params, response=$response}"
}
