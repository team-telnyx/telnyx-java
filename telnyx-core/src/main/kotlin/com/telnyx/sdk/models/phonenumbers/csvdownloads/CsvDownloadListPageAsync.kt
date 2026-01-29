// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.csvdownloads

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.phonenumbers.CsvDownloadServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CsvDownloadServiceAsync.list */
class CsvDownloadListPageAsync
private constructor(
    private val service: CsvDownloadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CsvDownloadListParams,
    private val response: CsvDownloadListPageResponse,
) : PageAsync<CsvDownload> {

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
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CsvDownloadListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CsvDownloadListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CsvDownload> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CsvDownloadListParams = params

    /** The response that this page was parsed from. */
    fun response(): CsvDownloadListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CsvDownloadListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CsvDownloadListPageAsync]. */
    class Builder internal constructor() {

        private var service: CsvDownloadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CsvDownloadListParams? = null
        private var response: CsvDownloadListPageResponse? = null

        @JvmSynthetic
        internal fun from(csvDownloadListPageAsync: CsvDownloadListPageAsync) = apply {
            service = csvDownloadListPageAsync.service
            streamHandlerExecutor = csvDownloadListPageAsync.streamHandlerExecutor
            params = csvDownloadListPageAsync.params
            response = csvDownloadListPageAsync.response
        }

        fun service(service: CsvDownloadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CsvDownloadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CsvDownloadListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CsvDownloadListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CsvDownloadListPageAsync =
            CsvDownloadListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CsvDownloadListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CsvDownloadListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
