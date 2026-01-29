// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.simcards.ActionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ActionService.list */
class ActionListPage
private constructor(
    private val service: ActionService,
    private val params: ActionListParams,
    private val response: ActionListPageResponse,
) : Page<SimCardAction> {

    /**
     * Delegates to [ActionListPageResponse], but gracefully handles missing data.
     *
     * @see ActionListPageResponse.data
     */
    fun data(): List<SimCardAction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ActionListPageResponse], but gracefully handles missing data.
     *
     * @see ActionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimCardAction> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ActionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): ActionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SimCardAction> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ActionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionListPage].
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

    /** A builder for [ActionListPage]. */
    class Builder internal constructor() {

        private var service: ActionService? = null
        private var params: ActionListParams? = null
        private var response: ActionListPageResponse? = null

        @JvmSynthetic
        internal fun from(actionListPage: ActionListPage) = apply {
            service = actionListPage.service
            params = actionListPage.params
            response = actionListPage.response
        }

        fun service(service: ActionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ActionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ActionListPage].
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
        fun build(): ActionListPage =
            ActionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ActionListPage{service=$service, params=$params, response=$response}"
}
