// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.blocking.FqdnService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FqdnService.list */
class FqdnListPage
private constructor(
    private val service: FqdnService,
    private val params: FqdnListParams,
    private val response: FqdnListPageResponse,
) : Page<Fqdn> {

    /**
     * Delegates to [FqdnListPageResponse], but gracefully handles missing data.
     *
     * @see FqdnListPageResponse.data
     */
    fun data(): List<Fqdn> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FqdnListPageResponse], but gracefully handles missing data.
     *
     * @see FqdnListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Fqdn> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): FqdnListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): FqdnListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Fqdn> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FqdnListParams = params

    /** The response that this page was parsed from. */
    fun response(): FqdnListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FqdnListPage].
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

    /** A builder for [FqdnListPage]. */
    class Builder internal constructor() {

        private var service: FqdnService? = null
        private var params: FqdnListParams? = null
        private var response: FqdnListPageResponse? = null

        @JvmSynthetic
        internal fun from(fqdnListPage: FqdnListPage) = apply {
            service = fqdnListPage.service
            params = fqdnListPage.params
            response = fqdnListPage.response
        }

        fun service(service: FqdnService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FqdnListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FqdnListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FqdnListPage].
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
        fun build(): FqdnListPage =
            FqdnListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FqdnListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "FqdnListPage{service=$service, params=$params, response=$response}"
}
