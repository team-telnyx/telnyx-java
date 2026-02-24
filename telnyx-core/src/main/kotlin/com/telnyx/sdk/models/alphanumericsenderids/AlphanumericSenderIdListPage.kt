// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.blocking.AlphanumericSenderIdService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AlphanumericSenderIdService.list */
class AlphanumericSenderIdListPage
private constructor(
    private val service: AlphanumericSenderIdService,
    private val params: AlphanumericSenderIdListParams,
    private val response: AlphanumericSenderIdListPageResponse,
) : Page<AlphanumericSenderId> {

    /**
     * Delegates to [AlphanumericSenderIdListPageResponse], but gracefully handles missing data.
     *
     * @see AlphanumericSenderIdListPageResponse.data
     */
    fun data(): List<AlphanumericSenderId> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AlphanumericSenderIdListPageResponse], but gracefully handles missing data.
     *
     * @see AlphanumericSenderIdListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<AlphanumericSenderId> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AlphanumericSenderIdListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AlphanumericSenderIdListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AlphanumericSenderId> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AlphanumericSenderIdListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlphanumericSenderIdListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlphanumericSenderIdListPage].
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

    /** A builder for [AlphanumericSenderIdListPage]. */
    class Builder internal constructor() {

        private var service: AlphanumericSenderIdService? = null
        private var params: AlphanumericSenderIdListParams? = null
        private var response: AlphanumericSenderIdListPageResponse? = null

        @JvmSynthetic
        internal fun from(alphanumericSenderIdListPage: AlphanumericSenderIdListPage) = apply {
            service = alphanumericSenderIdListPage.service
            params = alphanumericSenderIdListPage.params
            response = alphanumericSenderIdListPage.response
        }

        fun service(service: AlphanumericSenderIdService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AlphanumericSenderIdListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlphanumericSenderIdListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AlphanumericSenderIdListPage].
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
        fun build(): AlphanumericSenderIdListPage =
            AlphanumericSenderIdListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlphanumericSenderIdListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AlphanumericSenderIdListPage{service=$service, params=$params, response=$response}"
}
