// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingoptouts

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.blocking.MessagingOptoutService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingOptoutService.list */
class MessagingOptoutListPage
private constructor(
    private val service: MessagingOptoutService,
    private val params: MessagingOptoutListParams,
    private val response: MessagingOptoutListPageResponse,
) : Page<MessagingOptoutListResponse> {

    /**
     * Delegates to [MessagingOptoutListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingOptoutListPageResponse.data
     */
    fun data(): List<MessagingOptoutListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingOptoutListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingOptoutListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingOptoutListResponse> = data()

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

    fun nextPageParams(): MessagingOptoutListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): MessagingOptoutListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MessagingOptoutListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessagingOptoutListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingOptoutListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessagingOptoutListPage].
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

    /** A builder for [MessagingOptoutListPage]. */
    class Builder internal constructor() {

        private var service: MessagingOptoutService? = null
        private var params: MessagingOptoutListParams? = null
        private var response: MessagingOptoutListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingOptoutListPage: MessagingOptoutListPage) = apply {
            service = messagingOptoutListPage.service
            params = messagingOptoutListPage.params
            response = messagingOptoutListPage.response
        }

        fun service(service: MessagingOptoutService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingOptoutListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingOptoutListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MessagingOptoutListPage].
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
        fun build(): MessagingOptoutListPage =
            MessagingOptoutListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingOptoutListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessagingOptoutListPage{service=$service, params=$params, response=$response}"
}
