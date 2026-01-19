// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.useraddresses

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.UserAddressService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UserAddressService.list */
class UserAddressListPage
private constructor(
    private val service: UserAddressService,
    private val params: UserAddressListParams,
    private val response: UserAddressListPageResponse,
) : Page<UserAddress> {

    /**
     * Delegates to [UserAddressListPageResponse], but gracefully handles missing data.
     *
     * @see UserAddressListPageResponse.data
     */
    fun data(): List<UserAddress> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserAddressListPageResponse], but gracefully handles missing data.
     *
     * @see UserAddressListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<UserAddress> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): UserAddressListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): UserAddressListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<UserAddress> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UserAddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserAddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserAddressListPage].
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

    /** A builder for [UserAddressListPage]. */
    class Builder internal constructor() {

        private var service: UserAddressService? = null
        private var params: UserAddressListParams? = null
        private var response: UserAddressListPageResponse? = null

        @JvmSynthetic
        internal fun from(userAddressListPage: UserAddressListPage) = apply {
            service = userAddressListPage.service
            params = userAddressListPage.params
            response = userAddressListPage.response
        }

        fun service(service: UserAddressService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UserAddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserAddressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserAddressListPage].
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
        fun build(): UserAddressListPage =
            UserAddressListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserAddressListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UserAddressListPage{service=$service, params=$params, response=$response}"
}
