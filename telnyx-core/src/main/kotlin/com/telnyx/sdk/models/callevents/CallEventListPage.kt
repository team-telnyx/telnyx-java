// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callevents

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.CallEventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CallEventService.list */
class CallEventListPage
private constructor(
    private val service: CallEventService,
    private val params: CallEventListParams,
    private val response: CallEventListPageResponse,
) : Page<CallEventListResponse> {

    /**
     * Delegates to [CallEventListPageResponse], but gracefully handles missing data.
     *
     * @see CallEventListPageResponse.data
     */
    fun data(): List<CallEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CallEventListPageResponse], but gracefully handles missing data.
     *
     * @see CallEventListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CallEventListResponse> = data()

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

    fun nextPageParams(): CallEventListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CallEventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CallEventListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CallEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): CallEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallEventListPage].
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

    /** A builder for [CallEventListPage]. */
    class Builder internal constructor() {

        private var service: CallEventService? = null
        private var params: CallEventListParams? = null
        private var response: CallEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(callEventListPage: CallEventListPage) = apply {
            service = callEventListPage.service
            params = callEventListPage.params
            response = callEventListPage.response
        }

        fun service(service: CallEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CallEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CallEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CallEventListPage].
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
        fun build(): CallEventListPage =
            CallEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallEventListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CallEventListPage{service=$service, params=$params, response=$response}"
}
