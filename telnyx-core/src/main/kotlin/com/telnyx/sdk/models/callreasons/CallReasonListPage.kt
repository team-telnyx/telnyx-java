// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.CallReasonService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CallReasonService.list */
class CallReasonListPage
private constructor(
    private val service: CallReasonService,
    private val params: CallReasonListParams,
    private val response: CallReasonListPageResponse,
) : Page<CallReasonListResponse> {

    /**
     * Delegates to [CallReasonListPageResponse], but gracefully handles missing data.
     *
     * @see CallReasonListPageResponse.data
     */
    fun data(): List<CallReasonListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CallReasonListPageResponse], but gracefully handles missing data.
     *
     * @see CallReasonListPageResponse.meta
     */
    fun meta(): Optional<BrandedCallingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CallReasonListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CallReasonListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CallReasonListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CallReasonListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CallReasonListParams = params

    /** The response that this page was parsed from. */
    fun response(): CallReasonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallReasonListPage].
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

    /** A builder for [CallReasonListPage]. */
    class Builder internal constructor() {

        private var service: CallReasonService? = null
        private var params: CallReasonListParams? = null
        private var response: CallReasonListPageResponse? = null

        @JvmSynthetic
        internal fun from(callReasonListPage: CallReasonListPage) = apply {
            service = callReasonListPage.service
            params = callReasonListPage.params
            response = callReasonListPage.response
        }

        fun service(service: CallReasonService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CallReasonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CallReasonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CallReasonListPage].
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
        fun build(): CallReasonListPage =
            CallReasonListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallReasonListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CallReasonListPage{service=$service, params=$params, response=$response}"
}
