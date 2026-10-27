// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.PayConnectorService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PayConnectorService.list */
class PayConnectorListPage
private constructor(
    private val service: PayConnectorService,
    private val params: PayConnectorListParams,
    private val response: PayConnectorListPageResponse,
) : Page<PayConnector> {

    /**
     * Delegates to [PayConnectorListPageResponse], but gracefully handles missing data.
     *
     * @see PayConnectorListPageResponse.data
     */
    fun data(): List<PayConnector> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PayConnectorListPageResponse], but gracefully handles missing data.
     *
     * @see PayConnectorListPageResponse.meta
     */
    fun meta(): Optional<PayConnectorListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<PayConnector> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PayConnectorListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): PayConnectorListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PayConnector> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PayConnectorListParams = params

    /** The response that this page was parsed from. */
    fun response(): PayConnectorListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayConnectorListPage].
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

    /** A builder for [PayConnectorListPage]. */
    class Builder internal constructor() {

        private var service: PayConnectorService? = null
        private var params: PayConnectorListParams? = null
        private var response: PayConnectorListPageResponse? = null

        @JvmSynthetic
        internal fun from(payConnectorListPage: PayConnectorListPage) = apply {
            service = payConnectorListPage.service
            params = payConnectorListPage.params
            response = payConnectorListPage.response
        }

        fun service(service: PayConnectorService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PayConnectorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PayConnectorListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PayConnectorListPage].
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
        fun build(): PayConnectorListPage =
            PayConnectorListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PayConnectorListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PayConnectorListPage{service=$service, params=$params, response=$response}"
}
