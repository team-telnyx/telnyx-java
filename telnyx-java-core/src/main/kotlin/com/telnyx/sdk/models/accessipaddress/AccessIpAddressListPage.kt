// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.AccessIpAddressService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AccessIpAddressService.list */
class AccessIpAddressListPage
private constructor(
    private val service: AccessIpAddressService,
    private val params: AccessIpAddressListParams,
    private val response: AccessIpAddressListPageResponse,
) : Page<AccessIpAddressResponse> {

    /**
     * Delegates to [AccessIpAddressListPageResponse], but gracefully handles missing data.
     *
     * @see AccessIpAddressListPageResponse.data
     */
    fun data(): List<AccessIpAddressResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccessIpAddressListPageResponse], but gracefully handles missing data.
     *
     * @see AccessIpAddressListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaCloudflareIpListSync> = response._meta().getOptional("meta")

    override fun items(): List<AccessIpAddressResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AccessIpAddressListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AccessIpAddressListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccessIpAddressResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccessIpAddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccessIpAddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccessIpAddressListPage].
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

    /** A builder for [AccessIpAddressListPage]. */
    class Builder internal constructor() {

        private var service: AccessIpAddressService? = null
        private var params: AccessIpAddressListParams? = null
        private var response: AccessIpAddressListPageResponse? = null

        @JvmSynthetic
        internal fun from(accessIpAddressListPage: AccessIpAddressListPage) = apply {
            service = accessIpAddressListPage.service
            params = accessIpAddressListPage.params
            response = accessIpAddressListPage.response
        }

        fun service(service: AccessIpAddressService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccessIpAddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccessIpAddressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccessIpAddressListPage].
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
        fun build(): AccessIpAddressListPage =
            AccessIpAddressListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccessIpAddressListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccessIpAddressListPage{service=$service, params=$params, response=$response}"
}
