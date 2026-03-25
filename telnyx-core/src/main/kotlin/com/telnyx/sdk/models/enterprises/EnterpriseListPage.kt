// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.EnterpriseService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EnterpriseService.list */
class EnterpriseListPage
private constructor(
    private val service: EnterpriseService,
    private val params: EnterpriseListParams,
    private val response: EnterpriseListPageResponse,
) : Page<EnterpriseListResponse> {

    /**
     * Delegates to [EnterpriseListPageResponse], but gracefully handles missing data.
     *
     * @see EnterpriseListPageResponse.data
     */
    fun data(): List<EnterpriseListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EnterpriseListPageResponse], but gracefully handles missing data.
     *
     * @see EnterpriseListPageResponse.meta
     */
    fun meta(): Optional<EnterpriseListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EnterpriseListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): EnterpriseListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): EnterpriseListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EnterpriseListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EnterpriseListParams = params

    /** The response that this page was parsed from. */
    fun response(): EnterpriseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EnterpriseListPage].
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

    /** A builder for [EnterpriseListPage]. */
    class Builder internal constructor() {

        private var service: EnterpriseService? = null
        private var params: EnterpriseListParams? = null
        private var response: EnterpriseListPageResponse? = null

        @JvmSynthetic
        internal fun from(enterpriseListPage: EnterpriseListPage) = apply {
            service = enterpriseListPage.service
            params = enterpriseListPage.params
            response = enterpriseListPage.response
        }

        fun service(service: EnterpriseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EnterpriseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EnterpriseListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EnterpriseListPage].
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
        fun build(): EnterpriseListPage =
            EnterpriseListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnterpriseListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EnterpriseListPage{service=$service, params=$params, response=$response}"
}
