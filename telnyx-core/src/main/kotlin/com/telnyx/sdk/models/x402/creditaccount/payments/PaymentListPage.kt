// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount.payments

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.x402.creditaccount.PaymentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PaymentService.list */
class PaymentListPage
private constructor(
    private val service: PaymentService,
    private val params: PaymentListParams,
    private val response: PaymentListPageResponse,
) : Page<X402TransactionRecord> {

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see PaymentListPageResponse.data
     */
    fun data(): List<X402TransactionRecord> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see PaymentListPageResponse.meta
     */
    fun meta(): Optional<PaymentListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<X402TransactionRecord> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PaymentListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): PaymentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<X402TransactionRecord> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentListPage].
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

    /** A builder for [PaymentListPage]. */
    class Builder internal constructor() {

        private var service: PaymentService? = null
        private var params: PaymentListParams? = null
        private var response: PaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(paymentListPage: PaymentListPage) = apply {
            service = paymentListPage.service
            params = paymentListPage.params
            response = paymentListPage.response
        }

        fun service(service: PaymentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PaymentListPage].
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
        fun build(): PaymentListPage =
            PaymentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PaymentListPage{service=$service, params=$params, response=$response}"
}
