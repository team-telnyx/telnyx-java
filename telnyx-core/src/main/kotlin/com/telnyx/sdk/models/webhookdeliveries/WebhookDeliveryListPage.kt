// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.storage.buckets.usage.PaginationMetaSimple
import com.telnyx.sdk.services.blocking.WebhookDeliveryService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WebhookDeliveryService.list */
class WebhookDeliveryListPage
private constructor(
    private val service: WebhookDeliveryService,
    private val params: WebhookDeliveryListParams,
    private val response: WebhookDeliveryListPageResponse,
) : Page<WebhookDeliveryListResponse> {

    /**
     * Delegates to [WebhookDeliveryListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookDeliveryListPageResponse.data
     */
    fun data(): List<WebhookDeliveryListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WebhookDeliveryListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookDeliveryListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaSimple> = response._meta().getOptional("meta")

    override fun items(): List<WebhookDeliveryListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): WebhookDeliveryListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): WebhookDeliveryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WebhookDeliveryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WebhookDeliveryListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookDeliveryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookDeliveryListPage].
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

    /** A builder for [WebhookDeliveryListPage]. */
    class Builder internal constructor() {

        private var service: WebhookDeliveryService? = null
        private var params: WebhookDeliveryListParams? = null
        private var response: WebhookDeliveryListPageResponse? = null

        @JvmSynthetic
        internal fun from(webhookDeliveryListPage: WebhookDeliveryListPage) = apply {
            service = webhookDeliveryListPage.service
            params = webhookDeliveryListPage.params
            response = webhookDeliveryListPage.response
        }

        fun service(service: WebhookDeliveryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookDeliveryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookDeliveryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookDeliveryListPage].
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
        fun build(): WebhookDeliveryListPage =
            WebhookDeliveryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookDeliveryListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WebhookDeliveryListPage{service=$service, params=$params, response=$response}"
}
