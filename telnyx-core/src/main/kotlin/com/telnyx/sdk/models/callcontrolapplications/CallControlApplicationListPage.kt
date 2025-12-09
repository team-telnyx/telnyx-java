// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.CallControlApplicationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CallControlApplicationService.list */
class CallControlApplicationListPage
private constructor(
    private val service: CallControlApplicationService,
    private val params: CallControlApplicationListParams,
    private val response: CallControlApplicationListPageResponse,
) : Page<CallControlApplication> {

    /**
     * Delegates to [CallControlApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see CallControlApplicationListPageResponse.data
     */
    fun data(): List<CallControlApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CallControlApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see CallControlApplicationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CallControlApplication> = data()

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

    fun nextPageParams(): CallControlApplicationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CallControlApplicationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CallControlApplication> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CallControlApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CallControlApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CallControlApplicationListPage].
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

    /** A builder for [CallControlApplicationListPage]. */
    class Builder internal constructor() {

        private var service: CallControlApplicationService? = null
        private var params: CallControlApplicationListParams? = null
        private var response: CallControlApplicationListPageResponse? = null

        @JvmSynthetic
        internal fun from(callControlApplicationListPage: CallControlApplicationListPage) = apply {
            service = callControlApplicationListPage.service
            params = callControlApplicationListPage.params
            response = callControlApplicationListPage.response
        }

        fun service(service: CallControlApplicationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CallControlApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CallControlApplicationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CallControlApplicationListPage].
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
        fun build(): CallControlApplicationListPage =
            CallControlApplicationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallControlApplicationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CallControlApplicationListPage{service=$service, params=$params, response=$response}"
}
