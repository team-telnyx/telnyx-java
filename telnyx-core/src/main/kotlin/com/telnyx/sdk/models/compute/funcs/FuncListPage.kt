// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.storage.kvs.EdgeComputePaginationMeta
import com.telnyx.sdk.services.blocking.compute.FuncService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FuncService.list */
class FuncListPage
private constructor(
    private val service: FuncService,
    private val params: FuncListParams,
    private val response: FuncListPageResponse,
) : Page<FuncListResponse> {

    /**
     * Delegates to [FuncListPageResponse], but gracefully handles missing data.
     *
     * @see FuncListPageResponse.data
     */
    fun data(): List<FuncListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FuncListPageResponse], but gracefully handles missing data.
     *
     * @see FuncListPageResponse.meta
     */
    fun meta(): Optional<EdgeComputePaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<FuncListResponse> = data()

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

    fun nextPageParams(): FuncListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): FuncListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FuncListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FuncListParams = params

    /** The response that this page was parsed from. */
    fun response(): FuncListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FuncListPage].
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

    /** A builder for [FuncListPage]. */
    class Builder internal constructor() {

        private var service: FuncService? = null
        private var params: FuncListParams? = null
        private var response: FuncListPageResponse? = null

        @JvmSynthetic
        internal fun from(funcListPage: FuncListPage) = apply {
            service = funcListPage.service
            params = funcListPage.params
            response = funcListPage.response
        }

        fun service(service: FuncService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FuncListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FuncListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FuncListPage].
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
        fun build(): FuncListPage =
            FuncListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FuncListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "FuncListPage{service=$service, params=$params, response=$response}"
}
