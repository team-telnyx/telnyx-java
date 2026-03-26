// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MetaInfo
import com.telnyx.sdk.models.ReputationPhoneNumberWithReputationData
import com.telnyx.sdk.services.blocking.enterprises.reputation.NumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberService.list */
class NumberListPage
private constructor(
    private val service: NumberService,
    private val params: NumberListParams,
    private val response: NumberListPageResponse,
) : Page<ReputationPhoneNumberWithReputationData> {

    /**
     * Delegates to [NumberListPageResponse], but gracefully handles missing data.
     *
     * @see NumberListPageResponse.data
     */
    fun data(): List<ReputationPhoneNumberWithReputationData> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberListPageResponse], but gracefully handles missing data.
     *
     * @see NumberListPageResponse.meta
     */
    fun meta(): Optional<MetaInfo> = response._meta().getOptional("meta")

    override fun items(): List<ReputationPhoneNumberWithReputationData> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): NumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ReputationPhoneNumberWithReputationData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberListPage].
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

    /** A builder for [NumberListPage]. */
    class Builder internal constructor() {

        private var service: NumberService? = null
        private var params: NumberListParams? = null
        private var response: NumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberListPage: NumberListPage) = apply {
            service = numberListPage.service
            params = numberListPage.params
            response = numberListPage.response
        }

        fun service(service: NumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NumberListPage].
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
        fun build(): NumberListPage =
            NumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "NumberListPage{service=$service, params=$params, response=$response}"
}
