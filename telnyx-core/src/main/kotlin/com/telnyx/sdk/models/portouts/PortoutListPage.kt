// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.Metadata
import com.telnyx.sdk.services.blocking.PortoutService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PortoutService.list */
class PortoutListPage
private constructor(
    private val service: PortoutService,
    private val params: PortoutListParams,
    private val response: PortoutListPageResponse,
) : Page<PortoutDetails> {

    /**
     * Delegates to [PortoutListPageResponse], but gracefully handles missing data.
     *
     * @see PortoutListPageResponse.data
     */
    fun data(): List<PortoutDetails> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PortoutListPageResponse], but gracefully handles missing data.
     *
     * @see PortoutListPageResponse.meta
     */
    fun meta(): Optional<Metadata> = response._meta().getOptional("meta")

    override fun items(): List<PortoutDetails> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PortoutListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): PortoutListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortoutDetails> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PortoutListParams = params

    /** The response that this page was parsed from. */
    fun response(): PortoutListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PortoutListPage].
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

    /** A builder for [PortoutListPage]. */
    class Builder internal constructor() {

        private var service: PortoutService? = null
        private var params: PortoutListParams? = null
        private var response: PortoutListPageResponse? = null

        @JvmSynthetic
        internal fun from(portoutListPage: PortoutListPage) = apply {
            service = portoutListPage.service
            params = portoutListPage.params
            response = portoutListPage.response
        }

        fun service(service: PortoutService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PortoutListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PortoutListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PortoutListPage].
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
        fun build(): PortoutListPage =
            PortoutListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortoutListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PortoutListPage{service=$service, params=$params, response=$response}"
}
