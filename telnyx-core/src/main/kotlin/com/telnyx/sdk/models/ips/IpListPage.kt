// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ips

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.blocking.IpService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see IpService.list */
class IpListPage
private constructor(
    private val service: IpService,
    private val params: IpListParams,
    private val response: IpListPageResponse,
) : Page<Ip> {

    /**
     * Delegates to [IpListPageResponse], but gracefully handles missing data.
     *
     * @see IpListPageResponse.data
     */
    fun data(): List<Ip> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IpListPageResponse], but gracefully handles missing data.
     *
     * @see IpListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Ip> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): IpListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): IpListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Ip> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IpListParams = params

    /** The response that this page was parsed from. */
    fun response(): IpListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IpListPage].
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

    /** A builder for [IpListPage]. */
    class Builder internal constructor() {

        private var service: IpService? = null
        private var params: IpListParams? = null
        private var response: IpListPageResponse? = null

        @JvmSynthetic
        internal fun from(ipListPage: IpListPage) = apply {
            service = ipListPage.service
            params = ipListPage.params
            response = ipListPage.response
        }

        fun service(service: IpService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IpListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IpListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IpListPage].
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
        fun build(): IpListPage =
            IpListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IpListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "IpListPage{service=$service, params=$params, response=$response}"
}
