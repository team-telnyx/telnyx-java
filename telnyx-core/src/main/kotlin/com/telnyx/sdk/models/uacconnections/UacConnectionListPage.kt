// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.blocking.UacConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UacConnectionService.list */
class UacConnectionListPage
private constructor(
    private val service: UacConnectionService,
    private val params: UacConnectionListParams,
    private val response: UacConnectionListPageResponse,
) : Page<UacConnection> {

    /**
     * Delegates to [UacConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see UacConnectionListPageResponse.data
     */
    fun data(): List<UacConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UacConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see UacConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<UacConnection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): UacConnectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): UacConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<UacConnection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UacConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): UacConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UacConnectionListPage].
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

    /** A builder for [UacConnectionListPage]. */
    class Builder internal constructor() {

        private var service: UacConnectionService? = null
        private var params: UacConnectionListParams? = null
        private var response: UacConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(uacConnectionListPage: UacConnectionListPage) = apply {
            service = uacConnectionListPage.service
            params = uacConnectionListPage.params
            response = uacConnectionListPage.response
        }

        fun service(service: UacConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UacConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UacConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UacConnectionListPage].
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
        fun build(): UacConnectionListPage =
            UacConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UacConnectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UacConnectionListPage{service=$service, params=$params, response=$response}"
}
