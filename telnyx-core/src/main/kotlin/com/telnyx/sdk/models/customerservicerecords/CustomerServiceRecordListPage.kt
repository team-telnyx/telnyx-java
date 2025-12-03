// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.CustomerServiceRecordService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CustomerServiceRecordService.list */
class CustomerServiceRecordListPage
private constructor(
    private val service: CustomerServiceRecordService,
    private val params: CustomerServiceRecordListParams,
    private val response: CustomerServiceRecordListPageResponse,
) : Page<CustomerServiceRecord> {

    /**
     * Delegates to [CustomerServiceRecordListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerServiceRecordListPageResponse.data
     */
    fun data(): List<CustomerServiceRecord> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerServiceRecordListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerServiceRecordListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CustomerServiceRecord> = data()

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

    fun nextPageParams(): CustomerServiceRecordListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CustomerServiceRecordListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomerServiceRecord> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerServiceRecordListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerServiceRecordListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerServiceRecordListPage].
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

    /** A builder for [CustomerServiceRecordListPage]. */
    class Builder internal constructor() {

        private var service: CustomerServiceRecordService? = null
        private var params: CustomerServiceRecordListParams? = null
        private var response: CustomerServiceRecordListPageResponse? = null

        @JvmSynthetic
        internal fun from(customerServiceRecordListPage: CustomerServiceRecordListPage) = apply {
            service = customerServiceRecordListPage.service
            params = customerServiceRecordListPage.params
            response = customerServiceRecordListPage.response
        }

        fun service(service: CustomerServiceRecordService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerServiceRecordListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerServiceRecordListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerServiceRecordListPage].
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
        fun build(): CustomerServiceRecordListPage =
            CustomerServiceRecordListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerServiceRecordListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerServiceRecordListPage{service=$service, params=$params, response=$response}"
}
