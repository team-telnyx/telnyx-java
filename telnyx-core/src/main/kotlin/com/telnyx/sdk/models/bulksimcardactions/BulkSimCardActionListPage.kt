// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bulksimcardactions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.BulkSimCardActionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BulkSimCardActionService.list */
class BulkSimCardActionListPage
private constructor(
    private val service: BulkSimCardActionService,
    private val params: BulkSimCardActionListParams,
    private val response: BulkSimCardActionListPageResponse,
) : Page<BulkSimCardActionListResponse> {

    /**
     * Delegates to [BulkSimCardActionListPageResponse], but gracefully handles missing data.
     *
     * @see BulkSimCardActionListPageResponse.data
     */
    fun data(): List<BulkSimCardActionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BulkSimCardActionListPageResponse], but gracefully handles missing data.
     *
     * @see BulkSimCardActionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<BulkSimCardActionListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): BulkSimCardActionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): BulkSimCardActionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BulkSimCardActionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BulkSimCardActionListParams = params

    /** The response that this page was parsed from. */
    fun response(): BulkSimCardActionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkSimCardActionListPage].
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

    /** A builder for [BulkSimCardActionListPage]. */
    class Builder internal constructor() {

        private var service: BulkSimCardActionService? = null
        private var params: BulkSimCardActionListParams? = null
        private var response: BulkSimCardActionListPageResponse? = null

        @JvmSynthetic
        internal fun from(bulkSimCardActionListPage: BulkSimCardActionListPage) = apply {
            service = bulkSimCardActionListPage.service
            params = bulkSimCardActionListPage.params
            response = bulkSimCardActionListPage.response
        }

        fun service(service: BulkSimCardActionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BulkSimCardActionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BulkSimCardActionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BulkSimCardActionListPage].
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
        fun build(): BulkSimCardActionListPage =
            BulkSimCardActionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkSimCardActionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BulkSimCardActionListPage{service=$service, params=$params, response=$response}"
}
