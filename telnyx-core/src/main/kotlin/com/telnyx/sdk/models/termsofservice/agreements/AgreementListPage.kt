// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.termsofservice.AgreementService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AgreementService.list */
class AgreementListPage
private constructor(
    private val service: AgreementService,
    private val params: AgreementListParams,
    private val response: AgreementListPageResponse,
) : Page<AgreementListResponse> {

    /**
     * Delegates to [AgreementListPageResponse], but gracefully handles missing data.
     *
     * @see AgreementListPageResponse.data
     */
    fun data(): List<AgreementListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AgreementListPageResponse], but gracefully handles missing data.
     *
     * @see AgreementListPageResponse.meta
     */
    fun meta(): Optional<AgreementListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<AgreementListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AgreementListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AgreementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AgreementListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgreementListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgreementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgreementListPage].
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

    /** A builder for [AgreementListPage]. */
    class Builder internal constructor() {

        private var service: AgreementService? = null
        private var params: AgreementListParams? = null
        private var response: AgreementListPageResponse? = null

        @JvmSynthetic
        internal fun from(agreementListPage: AgreementListPage) = apply {
            service = agreementListPage.service
            params = agreementListPage.params
            response = agreementListPage.response
        }

        fun service(service: AgreementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgreementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgreementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgreementListPage].
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
        fun build(): AgreementListPage =
            AgreementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgreementListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AgreementListPage{service=$service, params=$params, response=$response}"
}
