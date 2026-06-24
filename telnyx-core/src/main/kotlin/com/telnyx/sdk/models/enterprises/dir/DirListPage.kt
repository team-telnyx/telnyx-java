// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.dir

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.callreasons.BrandedCallingPaginationMeta
import com.telnyx.sdk.models.dir.Dir
import com.telnyx.sdk.models.dir.DirList
import com.telnyx.sdk.services.blocking.enterprises.DirService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DirService.list */
class DirListPage
private constructor(
    private val service: DirService,
    private val params: DirListParams,
    private val response: DirList,
) : Page<Dir> {

    /**
     * Delegates to [DirList], but gracefully handles missing data.
     *
     * @see DirList.data
     */
    fun data(): List<Dir> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DirList], but gracefully handles missing data.
     *
     * @see DirList.meta
     */
    fun meta(): Optional<BrandedCallingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Dir> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): DirListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): DirListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Dir> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DirListParams = params

    /** The response that this page was parsed from. */
    fun response(): DirList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirListPage].
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

    /** A builder for [DirListPage]. */
    class Builder internal constructor() {

        private var service: DirService? = null
        private var params: DirListParams? = null
        private var response: DirList? = null

        @JvmSynthetic
        internal fun from(dirListPage: DirListPage) = apply {
            service = dirListPage.service
            params = dirListPage.params
            response = dirListPage.response
        }

        fun service(service: DirService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DirListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DirList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DirListPage].
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
        fun build(): DirListPage =
            DirListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "DirListPage{service=$service, params=$params, response=$response}"
}
