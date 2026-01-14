// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.userbundles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.bundlepricing.billingbundles.PaginationResponse
import com.telnyx.sdk.services.blocking.bundlepricing.UserBundleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UserBundleService.list */
class UserBundleListPage
private constructor(
    private val service: UserBundleService,
    private val params: UserBundleListParams,
    private val response: UserBundleListPageResponse,
) : Page<UserBundle> {

    /**
     * Delegates to [UserBundleListPageResponse], but gracefully handles missing data.
     *
     * @see UserBundleListPageResponse.data
     */
    fun data(): List<UserBundle> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserBundleListPageResponse], but gracefully handles missing data.
     *
     * @see UserBundleListPageResponse.meta
     */
    fun meta(): Optional<PaginationResponse> = response._meta().getOptional("meta")

    override fun items(): List<UserBundle> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): UserBundleListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): UserBundleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<UserBundle> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UserBundleListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserBundleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserBundleListPage].
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

    /** A builder for [UserBundleListPage]. */
    class Builder internal constructor() {

        private var service: UserBundleService? = null
        private var params: UserBundleListParams? = null
        private var response: UserBundleListPageResponse? = null

        @JvmSynthetic
        internal fun from(userBundleListPage: UserBundleListPage) = apply {
            service = userBundleListPage.service
            params = userBundleListPage.params
            response = userBundleListPage.response
        }

        fun service(service: UserBundleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UserBundleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserBundleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserBundleListPage].
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
        fun build(): UserBundleListPage =
            UserBundleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserBundleListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UserBundleListPage{service=$service, params=$params, response=$response}"
}
