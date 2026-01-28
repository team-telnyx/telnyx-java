// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.blocking.ConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ConnectionService.list */
class ConnectionListPage
private constructor(
    private val service: ConnectionService,
    private val params: ConnectionListParams,
    private val response: ConnectionListPageResponse,
) : Page<ConnectionListResponse> {

    /**
     * Delegates to [ConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see ConnectionListPageResponse.data
     */
    fun data(): List<ConnectionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see ConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ConnectionListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ConnectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): ConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ConnectionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConnectionListPage].
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

    /** A builder for [ConnectionListPage]. */
    class Builder internal constructor() {

        private var service: ConnectionService? = null
        private var params: ConnectionListParams? = null
        private var response: ConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(connectionListPage: ConnectionListPage) = apply {
            service = connectionListPage.service
            params = connectionListPage.params
            response = connectionListPage.response
        }

        fun service(service: ConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ConnectionListPage].
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
        fun build(): ConnectionListPage =
            ConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ConnectionListPage{service=$service, params=$params, response=$response}"
}
