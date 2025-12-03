// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipranges

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.accessipaddress.PaginationMetaCloudflareIpListSync
import com.telnyx.sdk.services.blocking.AccessIpRangeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AccessIpRangeService.list */
class AccessIpRangeListPage
private constructor(
    private val service: AccessIpRangeService,
    private val params: AccessIpRangeListParams,
    private val response: AccessIpRangeListPageResponse,
) : Page<AccessIpRange> {

    /**
     * Delegates to [AccessIpRangeListPageResponse], but gracefully handles missing data.
     *
     * @see AccessIpRangeListPageResponse.data
     */
    fun data(): List<AccessIpRange> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccessIpRangeListPageResponse], but gracefully handles missing data.
     *
     * @see AccessIpRangeListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaCloudflareIpListSync> = response._meta().getOptional("meta")

    override fun items(): List<AccessIpRange> = data()

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

    fun nextPageParams(): AccessIpRangeListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AccessIpRangeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccessIpRange> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccessIpRangeListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccessIpRangeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccessIpRangeListPage].
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

    /** A builder for [AccessIpRangeListPage]. */
    class Builder internal constructor() {

        private var service: AccessIpRangeService? = null
        private var params: AccessIpRangeListParams? = null
        private var response: AccessIpRangeListPageResponse? = null

        @JvmSynthetic
        internal fun from(accessIpRangeListPage: AccessIpRangeListPage) = apply {
            service = accessIpRangeListPage.service
            params = accessIpRangeListPage.params
            response = accessIpRangeListPage.response
        }

        fun service(service: AccessIpRangeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccessIpRangeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccessIpRangeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccessIpRangeListPage].
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
        fun build(): AccessIpRangeListPage =
            AccessIpRangeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccessIpRangeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccessIpRangeListPage{service=$service, params=$params, response=$response}"
}
