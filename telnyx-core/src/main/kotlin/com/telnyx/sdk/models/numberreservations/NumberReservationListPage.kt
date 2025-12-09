// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberreservations

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NumberReservationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberReservationService.list */
class NumberReservationListPage
private constructor(
    private val service: NumberReservationService,
    private val params: NumberReservationListParams,
    private val response: NumberReservationListPageResponse,
) : Page<NumberReservation> {

    /**
     * Delegates to [NumberReservationListPageResponse], but gracefully handles missing data.
     *
     * @see NumberReservationListPageResponse.data
     */
    fun data(): List<NumberReservation> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberReservationListPageResponse], but gracefully handles missing data.
     *
     * @see NumberReservationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NumberReservation> = data()

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

    fun nextPageParams(): NumberReservationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): NumberReservationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NumberReservation> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NumberReservationListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberReservationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberReservationListPage].
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

    /** A builder for [NumberReservationListPage]. */
    class Builder internal constructor() {

        private var service: NumberReservationService? = null
        private var params: NumberReservationListParams? = null
        private var response: NumberReservationListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberReservationListPage: NumberReservationListPage) = apply {
            service = numberReservationListPage.service
            params = numberReservationListPage.params
            response = numberReservationListPage.response
        }

        fun service(service: NumberReservationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NumberReservationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberReservationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NumberReservationListPage].
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
        fun build(): NumberReservationListPage =
            NumberReservationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberReservationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NumberReservationListPage{service=$service, params=$params, response=$response}"
}
