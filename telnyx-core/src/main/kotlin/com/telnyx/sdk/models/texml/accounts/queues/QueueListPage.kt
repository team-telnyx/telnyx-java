// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.texml.accounts.QueueService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see QueueService.list */
class QueueListPage
private constructor(
    private val service: QueueService,
    private val params: QueueListParams,
    private val response: QueueListPageResponse,
) : Page<QueueListResponse> {

    /**
     * Delegates to [QueueListPageResponse], but gracefully handles missing data.
     *
     * @see QueueListPageResponse.queues
     */
    fun queues(): List<QueueListResponse> =
        response._queues().getOptional("queues").getOrNull() ?: emptyList()

    override fun items(): List<QueueListResponse> = queues()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): QueueListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): QueueListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<QueueListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): QueueListParams = params

    /** The response that this page was parsed from. */
    fun response(): QueueListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QueueListPage].
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

    /** A builder for [QueueListPage]. */
    class Builder internal constructor() {

        private var service: QueueService? = null
        private var params: QueueListParams? = null
        private var response: QueueListPageResponse? = null

        @JvmSynthetic
        internal fun from(queueListPage: QueueListPage) = apply {
            service = queueListPage.service
            params = queueListPage.params
            response = queueListPage.response
        }

        fun service(service: QueueService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: QueueListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: QueueListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [QueueListPage].
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
        fun build(): QueueListPage =
            QueueListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QueueListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "QueueListPage{service=$service, params=$params, response=$response}"
}
