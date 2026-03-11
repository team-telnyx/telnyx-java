// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.blocking.whatsapp.BusinessAccountService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BusinessAccountService.list */
class BusinessAccountListPage
private constructor(
    private val service: BusinessAccountService,
    private val params: BusinessAccountListParams,
    private val response: BusinessAccountListPageResponse,
) : Page<BusinessAccountListResponse> {

    /**
     * Delegates to [BusinessAccountListPageResponse], but gracefully handles missing data.
     *
     * @see BusinessAccountListPageResponse.data
     */
    fun data(): List<BusinessAccountListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BusinessAccountListPageResponse], but gracefully handles missing data.
     *
     * @see BusinessAccountListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<BusinessAccountListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): BusinessAccountListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): BusinessAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BusinessAccountListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BusinessAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): BusinessAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BusinessAccountListPage].
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

    /** A builder for [BusinessAccountListPage]. */
    class Builder internal constructor() {

        private var service: BusinessAccountService? = null
        private var params: BusinessAccountListParams? = null
        private var response: BusinessAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(businessAccountListPage: BusinessAccountListPage) = apply {
            service = businessAccountListPage.service
            params = businessAccountListPage.params
            response = businessAccountListPage.response
        }

        fun service(service: BusinessAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BusinessAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BusinessAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BusinessAccountListPage].
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
        fun build(): BusinessAccountListPage =
            BusinessAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessAccountListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BusinessAccountListPage{service=$service, params=$params, response=$response}"
}
