// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.csvdownloads

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.phonenumbers.CsvDownloadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CsvDownloadService.list */
class CsvDownloadListPage
private constructor(
    private val service: CsvDownloadService,
    private val params: CsvDownloadListParams,
    private val response: CsvDownloadListPageResponse,
) : Page<CsvDownload> {

    /**
     * Delegates to [CsvDownloadListPageResponse], but gracefully handles missing data.
     *
     * @see CsvDownloadListPageResponse.data
     */
    fun data(): List<CsvDownload> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CsvDownloadListPageResponse], but gracefully handles missing data.
     *
     * @see CsvDownloadListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CsvDownload> = data()

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

    fun nextPageParams(): CsvDownloadListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CsvDownloadListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CsvDownload> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CsvDownloadListParams = params

    /** The response that this page was parsed from. */
    fun response(): CsvDownloadListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CsvDownloadListPage].
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

    /** A builder for [CsvDownloadListPage]. */
    class Builder internal constructor() {

        private var service: CsvDownloadService? = null
        private var params: CsvDownloadListParams? = null
        private var response: CsvDownloadListPageResponse? = null

        @JvmSynthetic
        internal fun from(csvDownloadListPage: CsvDownloadListPage) = apply {
            service = csvDownloadListPage.service
            params = csvDownloadListPage.params
            response = csvDownloadListPage.response
        }

        fun service(service: CsvDownloadService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CsvDownloadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CsvDownloadListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CsvDownloadListPage].
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
        fun build(): CsvDownloadListPage =
            CsvDownloadListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CsvDownloadListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CsvDownloadListPage{service=$service, params=$params, response=$response}"
}
