// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.actionrequirements

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.portingorders.ActionRequirementService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ActionRequirementService.list */
class ActionRequirementListPage
private constructor(
    private val service: ActionRequirementService,
    private val params: ActionRequirementListParams,
    private val response: ActionRequirementListPageResponse,
) : Page<ActionRequirementListResponse> {

    /**
     * Delegates to [ActionRequirementListPageResponse], but gracefully handles missing data.
     *
     * @see ActionRequirementListPageResponse.data
     */
    fun data(): List<ActionRequirementListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ActionRequirementListPageResponse], but gracefully handles missing data.
     *
     * @see ActionRequirementListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ActionRequirementListResponse> = data()

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

    fun nextPageParams(): ActionRequirementListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): ActionRequirementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ActionRequirementListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActionRequirementListParams = params

    /** The response that this page was parsed from. */
    fun response(): ActionRequirementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionRequirementListPage].
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

    /** A builder for [ActionRequirementListPage]. */
    class Builder internal constructor() {

        private var service: ActionRequirementService? = null
        private var params: ActionRequirementListParams? = null
        private var response: ActionRequirementListPageResponse? = null

        @JvmSynthetic
        internal fun from(actionRequirementListPage: ActionRequirementListPage) = apply {
            service = actionRequirementListPage.service
            params = actionRequirementListPage.params
            response = actionRequirementListPage.response
        }

        fun service(service: ActionRequirementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActionRequirementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ActionRequirementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActionRequirementListPage].
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
        fun build(): ActionRequirementListPage =
            ActionRequirementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionRequirementListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ActionRequirementListPage{service=$service, params=$params, response=$response}"
}
