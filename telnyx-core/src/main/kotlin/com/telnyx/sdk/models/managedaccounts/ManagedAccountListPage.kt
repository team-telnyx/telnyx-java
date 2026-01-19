// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.ManagedAccountService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ManagedAccountService.list */
class ManagedAccountListPage
private constructor(
    private val service: ManagedAccountService,
    private val params: ManagedAccountListParams,
    private val response: ManagedAccountListPageResponse,
) : Page<ManagedAccountListResponse> {

    /**
     * Delegates to [ManagedAccountListPageResponse], but gracefully handles missing data.
     *
     * @see ManagedAccountListPageResponse.data
     */
    fun data(): List<ManagedAccountListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ManagedAccountListPageResponse], but gracefully handles missing data.
     *
     * @see ManagedAccountListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ManagedAccountListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ManagedAccountListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): ManagedAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ManagedAccountListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ManagedAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): ManagedAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManagedAccountListPage].
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

    /** A builder for [ManagedAccountListPage]. */
    class Builder internal constructor() {

        private var service: ManagedAccountService? = null
        private var params: ManagedAccountListParams? = null
        private var response: ManagedAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(managedAccountListPage: ManagedAccountListPage) = apply {
            service = managedAccountListPage.service
            params = managedAccountListPage.params
            response = managedAccountListPage.response
        }

        fun service(service: ManagedAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ManagedAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ManagedAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ManagedAccountListPage].
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
        fun build(): ManagedAccountListPage =
            ManagedAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManagedAccountListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ManagedAccountListPage{service=$service, params=$params, response=$response}"
}
