// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.activationjobs

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.portingorders.PortingOrdersActivationJob
import com.telnyx.sdk.services.blocking.portingorders.ActivationJobService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ActivationJobService.list */
class ActivationJobListPage
private constructor(
    private val service: ActivationJobService,
    private val params: ActivationJobListParams,
    private val response: ActivationJobListPageResponse,
) : Page<PortingOrdersActivationJob> {

    /**
     * Delegates to [ActivationJobListPageResponse], but gracefully handles missing data.
     *
     * @see ActivationJobListPageResponse.data
     */
    fun data(): List<PortingOrdersActivationJob> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ActivationJobListPageResponse], but gracefully handles missing data.
     *
     * @see ActivationJobListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingOrdersActivationJob> = data()

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

    fun nextPageParams(): ActivationJobListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): ActivationJobListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortingOrdersActivationJob> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActivationJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): ActivationJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActivationJobListPage].
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

    /** A builder for [ActivationJobListPage]. */
    class Builder internal constructor() {

        private var service: ActivationJobService? = null
        private var params: ActivationJobListParams? = null
        private var response: ActivationJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(activationJobListPage: ActivationJobListPage) = apply {
            service = activationJobListPage.service
            params = activationJobListPage.params
            response = activationJobListPage.response
        }

        fun service(service: ActivationJobService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActivationJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ActivationJobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ActivationJobListPage].
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
        fun build(): ActivationJobListPage =
            ActivationJobListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActivationJobListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ActivationJobListPage{service=$service, params=$params, response=$response}"
}
