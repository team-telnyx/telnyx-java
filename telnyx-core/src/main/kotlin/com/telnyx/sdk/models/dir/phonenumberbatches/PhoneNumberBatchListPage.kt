// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumberbatches

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.callreasons.BrandedCallingPaginationMeta
import com.telnyx.sdk.services.blocking.dir.PhoneNumberBatchService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberBatchService.list */
class PhoneNumberBatchListPage
private constructor(
    private val service: PhoneNumberBatchService,
    private val params: PhoneNumberBatchListParams,
    private val response: PhoneNumberBatchListPageResponse,
) : Page<PhoneNumberBatch> {

    /**
     * Delegates to [PhoneNumberBatchListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberBatchListPageResponse.data
     */
    fun data(): List<PhoneNumberBatch> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberBatchListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberBatchListPageResponse.meta
     */
    fun meta(): Optional<BrandedCallingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberBatch> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberBatchListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): PhoneNumberBatchListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PhoneNumberBatch> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberBatchListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberBatchListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberBatchListPage].
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

    /** A builder for [PhoneNumberBatchListPage]. */
    class Builder internal constructor() {

        private var service: PhoneNumberBatchService? = null
        private var params: PhoneNumberBatchListParams? = null
        private var response: PhoneNumberBatchListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberBatchListPage: PhoneNumberBatchListPage) = apply {
            service = phoneNumberBatchListPage.service
            params = phoneNumberBatchListPage.params
            response = phoneNumberBatchListPage.response
        }

        fun service(service: PhoneNumberBatchService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberBatchListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberBatchListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberBatchListPage].
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
        fun build(): PhoneNumberBatchListPage =
            PhoneNumberBatchListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberBatchListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhoneNumberBatchListPage{service=$service, params=$params, response=$response}"
}
