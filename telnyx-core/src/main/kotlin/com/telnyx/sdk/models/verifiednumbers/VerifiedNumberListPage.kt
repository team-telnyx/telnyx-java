// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifiednumbers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.VerifiedNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VerifiedNumberService.list */
class VerifiedNumberListPage
private constructor(
    private val service: VerifiedNumberService,
    private val params: VerifiedNumberListParams,
    private val response: VerifiedNumberListPageResponse,
) : Page<VerifiedNumber> {

    /**
     * Delegates to [VerifiedNumberListPageResponse], but gracefully handles missing data.
     *
     * @see VerifiedNumberListPageResponse.data
     */
    fun data(): List<VerifiedNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VerifiedNumberListPageResponse], but gracefully handles missing data.
     *
     * @see VerifiedNumberListPageResponse.meta
     */
    fun meta(): Optional<VerifiedNumberListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<VerifiedNumber> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VerifiedNumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): VerifiedNumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VerifiedNumber> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VerifiedNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerifiedNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerifiedNumberListPage].
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

    /** A builder for [VerifiedNumberListPage]. */
    class Builder internal constructor() {

        private var service: VerifiedNumberService? = null
        private var params: VerifiedNumberListParams? = null
        private var response: VerifiedNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(verifiedNumberListPage: VerifiedNumberListPage) = apply {
            service = verifiedNumberListPage.service
            params = verifiedNumberListPage.params
            response = verifiedNumberListPage.response
        }

        fun service(service: VerifiedNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VerifiedNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerifiedNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VerifiedNumberListPage].
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
        fun build(): VerifiedNumberListPage =
            VerifiedNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerifiedNumberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VerifiedNumberListPage{service=$service, params=$params, response=$response}"
}
