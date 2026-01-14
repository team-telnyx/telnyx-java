// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.detailrecords

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.DetailRecordService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DetailRecordService.list */
class DetailRecordListPage
private constructor(
    private val service: DetailRecordService,
    private val params: DetailRecordListParams,
    private val response: DetailRecordListPageResponse,
) : Page<DetailRecordListResponse> {

    /**
     * Delegates to [DetailRecordListPageResponse], but gracefully handles missing data.
     *
     * @see DetailRecordListPageResponse.data
     */
    fun data(): List<DetailRecordListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DetailRecordListPageResponse], but gracefully handles missing data.
     *
     * @see DetailRecordListPageResponse.meta
     */
    fun meta(): Optional<DetailRecordListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<DetailRecordListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): DetailRecordListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): DetailRecordListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DetailRecordListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DetailRecordListParams = params

    /** The response that this page was parsed from. */
    fun response(): DetailRecordListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DetailRecordListPage].
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

    /** A builder for [DetailRecordListPage]. */
    class Builder internal constructor() {

        private var service: DetailRecordService? = null
        private var params: DetailRecordListParams? = null
        private var response: DetailRecordListPageResponse? = null

        @JvmSynthetic
        internal fun from(detailRecordListPage: DetailRecordListPage) = apply {
            service = detailRecordListPage.service
            params = detailRecordListPage.params
            response = detailRecordListPage.response
        }

        fun service(service: DetailRecordService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DetailRecordListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DetailRecordListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DetailRecordListPage].
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
        fun build(): DetailRecordListPage =
            DetailRecordListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetailRecordListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DetailRecordListPage{service=$service, params=$params, response=$response}"
}
