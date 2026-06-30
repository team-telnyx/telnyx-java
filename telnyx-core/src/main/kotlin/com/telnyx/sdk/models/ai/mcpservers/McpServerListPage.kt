// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.ai.McpServerService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see McpServerService.list */
class McpServerListPage
private constructor(
    private val service: McpServerService,
    private val params: McpServerListParams,
    private val items: List<McpServerListResponse>,
) : Page<McpServerListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): McpServerListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): McpServerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<McpServerListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): McpServerListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<McpServerListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [McpServerListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [McpServerListPage]. */
    class Builder internal constructor() {

        private var service: McpServerService? = null
        private var params: McpServerListParams? = null
        private var items: List<McpServerListResponse>? = null

        @JvmSynthetic
        internal fun from(mcpServerListPage: McpServerListPage) = apply {
            service = mcpServerListPage.service
            params = mcpServerListPage.params
            items = mcpServerListPage.items
        }

        fun service(service: McpServerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: McpServerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<McpServerListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [McpServerListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): McpServerListPage =
            McpServerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is McpServerListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "McpServerListPage{service=$service, params=$params, items=$items}"
}
