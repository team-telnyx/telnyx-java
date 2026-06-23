// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.enterprises.NumberReputationPaginationMeta
import com.telnyx.sdk.services.blocking.enterprises.reputation.RemediationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RemediationService.list */
class RemediationListPage
private constructor(
    private val service: RemediationService,
    private val params: RemediationListParams,
    private val response: RemediationListPageResponse,
) : Page<RemediationListResponse> {

    /**
     * Delegates to [RemediationListPageResponse], but gracefully handles missing data.
     *
     * @see RemediationListPageResponse.data
     */
    fun data(): List<RemediationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RemediationListPageResponse], but gracefully handles missing data.
     *
     * @see RemediationListPageResponse.meta
     */
    fun meta(): Optional<NumberReputationPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<RemediationListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RemediationListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): RemediationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RemediationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RemediationListParams = params

    /** The response that this page was parsed from. */
    fun response(): RemediationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RemediationListPage].
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

    /** A builder for [RemediationListPage]. */
    class Builder internal constructor() {

        private var service: RemediationService? = null
        private var params: RemediationListParams? = null
        private var response: RemediationListPageResponse? = null

        @JvmSynthetic
        internal fun from(remediationListPage: RemediationListPage) = apply {
            service = remediationListPage.service
            params = remediationListPage.params
            response = remediationListPage.response
        }

        fun service(service: RemediationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RemediationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RemediationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RemediationListPage].
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
        fun build(): RemediationListPage =
            RemediationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RemediationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RemediationListPage{service=$service, params=$params, response=$response}"
}
